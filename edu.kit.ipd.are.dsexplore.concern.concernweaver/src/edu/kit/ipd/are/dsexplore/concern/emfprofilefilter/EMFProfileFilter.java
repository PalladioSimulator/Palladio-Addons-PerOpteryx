package edu.kit.ipd.are.dsexplore.concern.emfprofilefilter;

import java.util.Optional;
import java.util.function.Predicate;

import org.eclipse.emf.ecore.EObject;
import org.modelversioning.emfprofileapplication.StereotypeApplication;
import org.palladiosimulator.mdsdprofiles.api.StereotypeAPI;

public class EMFProfileFilter {
	
	public static boolean isAnnotatedWith(Predicate<EObject> condition, EObject object) {
		
		return !isAnnotated(object) ? false : getAnnotationFrom(getStereotypeApplicationFrom(object), condition).isPresent();
		
	}
	
	private static boolean isAnnotated(EObject object) {
		
		return StereotypeAPI.hasStereotypeApplications(object);
		
	}
	
	private static Optional<EObject> getAnnotationFrom(StereotypeApplication stereotypeApplication, Predicate<EObject> condition) {
		
		return stereotypeApplication.eCrossReferences().stream().filter(eachReferencedObject -> condition.test(eachReferencedObject))
																.findFirst();
		
	}
	
	public static StereotypeApplication getStereotypeApplicationFrom(EObject object) {
		
		return StereotypeAPI.getStereotypeApplications(object).get(0);
	
	}
	
	public static Optional<EObject> getAnnotationFrom(EObject object, Predicate<EObject> condition) {
		
		return getAnnotationFrom(getStereotypeApplicationFrom(object), condition);
		
	}

}
