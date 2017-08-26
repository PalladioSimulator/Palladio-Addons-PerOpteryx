package edu.kit.ipd.are.dsexplore.concern.emfprofilefilter;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;

import org.eclipse.emf.ecore.EObject;
import org.modelversioning.emfprofileapplication.StereotypeApplication;
import org.palladiosimulator.mdsdprofiles.api.StereotypeAPI;

public class EMFProfileFilter {

	public static boolean isAnnotatedWith(Predicate<EObject> condition, EObject object) {
		return !EMFProfileFilter.isAnnotated(object) ? false : EMFProfileFilter.getFirstAnnotationFrom(object, condition).isPresent();
	}

	public static boolean isAnnotated(EObject object) {
		return StereotypeAPI.hasStereotypeApplications(object);
	}

	private static List<EObject> getAnnotationsFrom(List<StereotypeApplication> stereotypeApplications, Predicate<EObject> condition) {
		List<EObject> annotations = new ArrayList<>();
		for (StereotypeApplication app : stereotypeApplications) {
			for (EObject refs : app.eCrossReferences()) {
				if (condition.test(refs)) {
					annotations.add(refs);
				}
			}
		}
		return annotations;
		// return stereotypeApplications.stream().flatMap(eachApplication ->
		// eachApplication.eCrossReferences().stream()).filter(condition).collect(Collectors.toList());
	}

	public static List<StereotypeApplication> getStereotypeApplicationsFrom(EObject object) {
		return StereotypeAPI.getStereotypeApplications(object);
	}

	public static Optional<EObject> getFirstAnnotationFrom(EObject object, Predicate<EObject> condition) {
		List<EObject> foundAnnotations = EMFProfileFilter.getAllAnnotationsFrom(object, condition);
		return foundAnnotations.isEmpty() ? Optional.empty() : Optional.of(foundAnnotations.get(0));
	}

	public static List<EObject> getAllAnnotationsFrom(EObject object, Predicate<EObject> condition) {
		return EMFProfileFilter.getAnnotationsFrom(EMFProfileFilter.getStereotypeApplicationsFrom(object), condition);
	}
}
