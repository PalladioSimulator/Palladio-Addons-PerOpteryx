package edu.kit.ipd.are.dsexplore.concern.emfprofilefilter;

import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.eclipse.emf.ecore.EObject;
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
	
	private List<RepositoryComponent> concat(List<RepositoryComponent> list1, List<RepositoryComponent> list2) {
		
		return Stream.concat(list1.stream(), list2.stream()).collect(Collectors.toList());
		
	}

	private List<RepositoryComponent> getComponentsAnnotatedWith(Annotation annotation) {
		
		return getAllComponents().filter(eachComponent -> EMFProfileFilter.isAnnotatedWith(getSearchCriteriaFor(annotation), eachComponent))
								 .collect(Collectors.toList());
		
	}

	private Predicate<EObject> getSearchCriteriaFor(Annotation annotation) {
		
		return object -> (object instanceof Annotation) && (((Annotation) object).getName().equals(annotation.getName()));
		
	}
	
	public Optional<AnnotationTarget> getTargetAnnotationFrom(RepositoryComponent component) {
		
		if (!isTargetAnnotated(component)) {
			
			return Optional.empty();
			
		}
		
		Optional<EObject> annotation = EMFProfileFilter.getFirstAnnotationFrom(component, object -> object instanceof AnnotationTarget);
		return annotation.isPresent() ? Optional.of((AnnotationTarget) annotation.get()) : Optional.empty();
		
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
	
	private boolean hasTargetAnnotation(RepositoryComponent component) {
				
		return EMFProfileFilter.getFirstAnnotationFrom(component, object -> object instanceof AnnotationTarget).isPresent();
		
	}

	private boolean isTargetAnnotated(RepositoryComponent component, String targetName) {
		
		if (isTargetAnnotated(component)) {
		
			return isTargetAnnotatedWith(targetName, component); 
			
		}
		
		return false;
	
	}
	
	private boolean isTargetAnnotatedWith(String targetName, EObject referencedObject) {
		
		return EMFProfileFilter.getFirstAnnotationFrom(referencedObject, object -> (object instanceof AnnotationTarget) && ((AnnotationTarget) object).getName().equals(targetName)).isPresent();
		
	}
	
	private Stream<RepositoryComponent> getAllComponents() {
		
		return this.pcmRepositories.stream().flatMap(repository -> repository.getComponents__Repository().stream());
		
	}

}
