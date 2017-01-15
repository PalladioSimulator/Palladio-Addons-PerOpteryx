package edu.kit.ipd.are.dsexplore.concern.util;

import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.eclipse.emf.ecore.EObject;
import org.modelversioning.emfprofileapplication.StereotypeApplication;
import org.palladiosimulator.mdsdprofiles.api.StereotypeAPI;
import org.palladiosimulator.pcm.repository.Repository;
import org.palladiosimulator.pcm.repository.RepositoryComponent;

import ConcernModel.Annotation;
import ConcernModel.AnnotationTarget;

public class AnnotationFilter {
	
	private final List<Repository> pcmRepositories;
	
	public AnnotationFilter(List<Repository> pcmRepositories) {
		
		this.pcmRepositories = pcmRepositories;
		
	}
	
	public List<RepositoryComponent> getComponentsAnnotatedWith(List<Annotation> annotations) {
		
		List<RepositoryComponent> annotatedComponents = null;
		for (Annotation eachAnnotation : annotations) {
			
			if (annotatedComponents == null) {
				
				annotatedComponents = getComponentsAnnotatedWith(eachAnnotation);
				continue;
				
			}
			
			annotatedComponents = concat(annotatedComponents, getComponentsAnnotatedWith(eachAnnotation));
			
		}
		
		return annotatedComponents;
		
	}
	
	private List<RepositoryComponent> concat(List<RepositoryComponent> list1,	List<RepositoryComponent> list2) {
		
		return Stream.concat(list1.stream(), list2.stream()).collect(Collectors.toList());
		
	}

	private List<RepositoryComponent> getComponentsAnnotatedWith(Annotation annotation) {
		
		return getAllComponents().filter(eachComponent -> isAnnotatedWith(annotation, eachComponent)).collect(Collectors.toList());
		
	}

	private boolean isAnnotatedWith(Annotation annotation, RepositoryComponent component) {
		
		return !isAnnotated(component) ? false : isAnnotatedWith(annotation.getName(), component); 
		
	}
	
	private boolean isAnnotatedWith(String annotationName, RepositoryComponent component) {
		
		return getAnnotationFrom(getStereotypeApplicationFrom(component), checkIfAnnotatedWith(annotationName)).isPresent();
		
	}

	private Predicate<EObject> checkIfAnnotatedWith(String annotationName) {
		
		return eObject -> (eObject instanceof Annotation) && ((Annotation) eObject).getName().equals(annotationName);
		
	}

	public Optional<AnnotationTarget> getTargetAnnotationFrom(RepositoryComponent component) {
		
		if (!isTargetAnnotated(component)) {
			
			return Optional.empty();
			
		}
		
		return getTargetAnnotationFrom(getStereotypeApplicationFrom(component));
		
	}
	
	public List<RepositoryComponent> getTargetAnnotatedComponents() {
		
		return getAllComponents().filter(component -> isTargetAnnotated(component))
				 				 .collect(Collectors.toList());
		
	}
	
	public List<RepositoryComponent> getTargetAnnotatedComponentsWith(String targetName) {
		
		return getAllComponents().filter(component -> isTargetAnnotated(component, targetName))
								 .collect(Collectors.toList());

	}
	
	private boolean isTargetAnnotated(RepositoryComponent component) {
		
		return StereotypeAPI.hasStereotypeApplications(component) && hasTargetAnnotation(component);
	
	}
	
	private boolean isAnnotated(RepositoryComponent component) {
		
		return StereotypeAPI.hasStereotypeApplications(component);
		
	}
	
	private boolean hasTargetAnnotation(RepositoryComponent component) {
				
		return getTargetAnnotationFrom(getStereotypeApplicationFrom(component)).isPresent();
		
	}

	private boolean isTargetAnnotated(RepositoryComponent component, String targetName) {
		
		if (isTargetAnnotated(component)) {
		
			return isTargetAnnotatedWith(targetName, getStereotypeApplicationFrom(component)); 
			
		}
		
		return false;
	
	}

	private StereotypeApplication getStereotypeApplicationFrom(RepositoryComponent component) {
		
		return StereotypeAPI.getStereotypeApplications(component).get(0);
	
	}
	
	private boolean isTargetAnnotatedWith(String targetName, StereotypeApplication stereoTypeApplication) {
		
		return stereoTypeApplication.eCrossReferences().stream().anyMatch(eachReferencedObject -> isTargetAnnotatedWith(targetName, eachReferencedObject));
	
	}
	
	private Optional<AnnotationTarget> getTargetAnnotationFrom(StereotypeApplication stereotypeApplication) {
		
		Optional<Annotation> annotation = getAnnotationFrom(stereotypeApplication, each -> each instanceof AnnotationTarget);
		if (annotation.isPresent()) {
			
			return Optional.of((AnnotationTarget) annotation.get());
			
		}
		
		return Optional.empty();
		
	}
	
	private Optional<Annotation> getAnnotationFrom(StereotypeApplication stereotypeApplication, Predicate<EObject> fulfilConstraint) {
		
		return stereotypeApplication.eCrossReferences().stream().filter(eachReferencedObject -> fulfilConstraint.test(eachReferencedObject))
																.map(foundObject -> (Annotation) foundObject)
																.findFirst();
		
	}
	
	private boolean isTargetAnnotatedWith(String targetName, EObject referencedObject) {
		
		return (referencedObject instanceof AnnotationTarget) && ((AnnotationTarget) referencedObject).getName().equals(targetName);
		
	}
	
	private Stream<RepositoryComponent> getAllComponents() {
		
		return this.pcmRepositories.stream().flatMap(repository -> repository.getComponents__Repository().stream());
		
	}

}
