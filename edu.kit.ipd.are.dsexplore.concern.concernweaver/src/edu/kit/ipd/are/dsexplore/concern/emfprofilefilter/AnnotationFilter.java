package edu.kit.ipd.are.dsexplore.concern.emfprofilefilter;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.stream.Collectors;

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
		List<EObject> result = this.getAnnotatedElementsSatisfying(each -> AnnotationFilter.isTargetAnnotated(each));
		return result;
	}

	private List<EObject> getAnnotatedElementsSatisfying(Predicate<EObject> criteria) {
		List<EObject> elements = new ArrayList<>();
		for (Repository repo : this.pcmRepositories) {
			for (EObject annotated : this.getAnnotatedElementsIn(repo)) {
				if (criteria.test(annotated)) {
					elements.add(annotated);
				}
			}
		}
		return elements;
		// return this.pcmRepositories.stream().flatMap(each ->
		// this.getAnnotatedElementsIn(each)).filter(criteria).collect(Collectors.toList());

	}

	private List<EObject> getAnnotatedElementsIn(Repository repository) {
		List<EObject> annotatedElements = new ArrayList<>();
		TreeIterator<EObject> repoIterator = repository.eAllContents();
		while (repoIterator.hasNext()) {
			EObject current = repoIterator.next();
			if (EMFProfileFilter.isAnnotated(current)) {
				annotatedElements.add(current);
			}
		}
		return annotatedElements;
	}

	public static Optional<AnnotationTarget> getTargetAnnotationFrom(EObject annotatedElement) {
		if (!AnnotationFilter.isTargetAnnotated(annotatedElement)) {
			return Optional.empty();
		}
		Optional<EObject> annotation = EMFProfileFilter.getFirstAnnotationFrom(annotatedElement, object -> object instanceof AnnotationTarget);
		return annotation.isPresent() ? Optional.of((AnnotationTarget) annotation.get()) : Optional.empty();
	}

	public List<RepositoryComponent> getComponentsAnnotatedWith(List<Annotation> annotations) {
		return this.getAnnotatedElementsSatisfying(this.getCriteriaFor(annotations)).stream().map(each -> (RepositoryComponent) each).collect(Collectors.toList());
	}

	private Predicate<EObject> getCriteriaFor(List<Annotation> annotations) {
		return obj -> (obj instanceof RepositoryComponent) && this.isAnnotatedBy(annotations, obj);
	}

	private boolean isAnnotatedBy(List<Annotation> annotations, EObject element) {
		return annotations.stream().anyMatch(each -> EMFProfileFilter.isAnnotatedWith(this.satisfiesCriteria(each), element));
	}

	private Predicate<EObject> satisfiesCriteria(Annotation annotation) {
		return object -> (object instanceof Annotation) && (((Annotation) object).getName().equals(annotation.getName()));
	}

	private static boolean isTargetAnnotated(EObject object) {
		return StereotypeAPI.hasStereotypeApplications(object) && AnnotationFilter.hasTargetAnnotation(object);
	}

	private static boolean hasTargetAnnotation(EObject object) {
		return EMFProfileFilter.getFirstAnnotationFrom(object, obj -> obj instanceof AnnotationTarget).isPresent();
	}

}
