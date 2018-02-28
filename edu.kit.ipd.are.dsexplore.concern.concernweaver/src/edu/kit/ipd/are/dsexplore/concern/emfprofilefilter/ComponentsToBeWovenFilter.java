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

import FeatureCompletionModel.CompletionComponent;

public class ComponentsToBeWovenFilter {

//	private final List<Repository> pcmRepositories;

//	public ComponentsToBeWovenFilter(List<Repository> pcmRepositories) {
//
//		this.pcmRepositories = pcmRepositories;
//
//	}
//
//	public List<EObject> getTargetAnnotatedElements() {
//		List<EObject> result = this
//				.getAnnotatedElementsSatisfying(each -> ComponentsToBeWovenFilter.isTargetAnnotated(each));
//		return result;
//	}
//
//	private List<EObject> getAnnotatedElementsSatisfying(Predicate<EObject> criteria) {
//		List<EObject> elements = new ArrayList<>();
//		for (Repository repo : this.pcmRepositories) {
//			for (EObject annotated : this.getAnnotatedElementsIn(repo)) {
//				if (criteria.test(annotated)) {
//					elements.add(annotated);
//				}
//			}
//		}
//		return elements;
//		// return this.pcmRepositories.stream().flatMap(each ->
//		// this.getAnnotatedElementsIn(each)).filter(criteria).collect(Collectors.toList());
//
//	}

//	public static Optional<Feature> getTargetAnnotationFrom(EObject annotatedElement) {
//		if (!ComponentsToBeWovenFilter.isTargetAnnotated(annotatedElement)) {
//			return Optional.empty();
//		}
//		Optional<EObject> annotation = EMFProfileFilter.getFirstAnnotationFrom(annotatedElement,
//				object -> object instanceof AnnotationTarget);
//		return annotation.isPresent() ? Optional.of((AnnotationTarget) annotation.get()) : Optional.empty();
//	}
//
//	public List<RepositoryComponent> getAffectedComponentsByFCCList(List<CompletionComponent> fccs) {
//		return this.getAnnotatedElementsSatisfying(this.getCriteriaFor(fccs)).stream()
//				.map(each -> (RepositoryComponent) each).collect(Collectors.toList());
//	}
//
//	private Predicate<EObject> getCriteriaFor(List<CompletionComponent> fccs) {
//		return obj -> (obj instanceof RepositoryComponent) && this.isSolutionFor(fccs, obj);
//	}
//
//	private boolean isSolutionFor(List<CompletionComponent> fccs, EObject element) {
//		return fccs.stream().anyMatch(each -> EMFProfileFilter.isAnnotatedWith(this.satisfiesCriteria(each), element));
//	}
//
//	private Predicate<EObject> satisfiesCriteria(CompletionComponent fcc) {
//		return object -> (object instanceof CompletionComponent)
//				&& (((CompletionComponent) object).getName().equals(fcc.getName()));
//	}
//
//	private static boolean isTargetAnnotated(EObject object) {
//		return StereotypeAPI.hasStereotypeApplications(object) && ComponentsToBeWovenFilter.hasTargetAnnotation(object);
//	}
//
//	private static boolean hasTargetAnnotation(EObject object) {
//		return EMFProfileFilter.getFirstAnnotationFrom(object, obj -> obj instanceof AnnotationTarget).isPresent();
//	}

}
