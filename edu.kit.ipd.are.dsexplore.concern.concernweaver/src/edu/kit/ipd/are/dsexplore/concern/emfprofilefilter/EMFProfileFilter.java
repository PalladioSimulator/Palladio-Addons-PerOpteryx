package edu.kit.ipd.are.dsexplore.concern.emfprofilefilter;

import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import org.eclipse.emf.ecore.EObject;
import org.modelversioning.emfprofileapplication.StereotypeApplication;
import org.palladiosimulator.mdsdprofiles.api.StereotypeAPI;

public class EMFProfileFilter {
	
	public static boolean isAnnotatedWith(Predicate<EObject> condition, EObject object) {
		
		return !isAnnotated(object) ? false : getFirstAnnotationFrom(object, condition).isPresent();
		
	}
	
	public static boolean isAnnotated(EObject object) {
		
		return StereotypeAPI.hasStereotypeApplications(object);
		
	}
	
	private static List<EObject> getAnnotationsFrom(List<StereotypeApplication> stereotypeApplications, Predicate<EObject> condition) {

		return stereotypeApplications.stream().flatMap(eachApplication -> eachApplication.eCrossReferences().stream())
											  .filter(eachReferencedObject -> condition.test(eachReferencedObject))
											  .collect(Collectors.toList());
											  		
	}
	
	public static List<StereotypeApplication> getStereotypeApplicationsFrom(EObject object) {
		
		return StereotypeAPI.getStereotypeApplications(object);
	
	}
	
	public static Optional<EObject> getFirstAnnotationFrom(EObject object, Predicate<EObject> condition) {
		
		List<EObject> foundAnnotations = getAllAnnotationsFrom(object, condition);
		return foundAnnotations.isEmpty() ? Optional.empty() : Optional.of(foundAnnotations.get(0));
		
	}
	
	public static List<EObject> getAllAnnotationsFrom(EObject object, Predicate<EObject> condition) {
		
		return getAnnotationsFrom(getStereotypeApplicationsFrom(object), condition);
		
	}

}
