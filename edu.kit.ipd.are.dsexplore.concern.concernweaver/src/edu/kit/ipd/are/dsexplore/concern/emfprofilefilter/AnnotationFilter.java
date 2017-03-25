package edu.kit.ipd.are.dsexplore.concern.emfprofilefilter;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.eclipse.emf.common.util.TreeIterator;
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
	
	public List<EObject> getTargetAnnotatedElements() {
		
		return getAnnotatedElementsSatisfying(each -> isTargetAnnotated(each));
		
	}
	
	private List<EObject> getAnnotatedElementsSatisfying(Predicate<EObject> criteria) {
		
		return pcmRepositories.stream().flatMap(each -> getAnnotatedElementsIn(each))
									   .filter(criteria)
									   .collect(Collectors.toList());
		
	}
	
	private Stream<EObject> getAnnotatedElementsIn(Repository repository) {
		
		List<EObject> annotatedElements = new ArrayList<EObject>();
		
		TreeIterator<EObject> repoIterator = repository.eAllContents();
		while(repoIterator.hasNext()) {
			
			EObject current = repoIterator.next();
			if (EMFProfileFilter.isAnnotated(current)) {
				
				annotatedElements.add(current);
				
			}
			
		}
		
		return annotatedElements.stream();
		
	}
	
	public static Optional<AnnotationTarget> getTargetAnnotationFrom(EObject annotatedElement) {
		
		if (!isTargetAnnotated(annotatedElement)) {
			
			return Optional.empty();
			
		}
		
		Optional<EObject> annotation = EMFProfileFilter.getFirstAnnotationFrom(annotatedElement, object -> object instanceof AnnotationTarget);
		return annotation.isPresent() ? Optional.of((AnnotationTarget) annotation.get()) : Optional.empty();
		
	}
	
	public List<RepositoryComponent> getComponentsAnnotatedWith(List<Annotation> annotations) {
		
		return getAnnotatedElementsSatisfying(getCriteriaFor(annotations)).stream().map(each -> (RepositoryComponent) each)
																				   .collect(Collectors.toList());
		
	}
	
	private Predicate<EObject> getCriteriaFor(List<Annotation> annotations) {
		
		return obj -> (obj instanceof RepositoryComponent) && isAnnotatedBy(annotations, obj);
		
	}
	
	private boolean isAnnotatedBy(List<Annotation> annotations, EObject element) {
		
		return annotations.stream().anyMatch(each -> EMFProfileFilter.isAnnotatedWith(satisfiesCriteria(each), element));
		
	}

	private Predicate<EObject> satisfiesCriteria(Annotation annotation) {
		
		return object -> (object instanceof Annotation) && (((Annotation) object).getName().equals(annotation.getName()));
		
	}
	
	private static boolean isTargetAnnotated(EObject object) {
		
		return StereotypeAPI.hasStereotypeApplications(object) && hasTargetAnnotation(object);
	
	}
	
	private static boolean hasTargetAnnotation(EObject object) {
				
		return EMFProfileFilter.getFirstAnnotationFrom(object, obj -> obj instanceof AnnotationTarget).isPresent();
		
	}

}
