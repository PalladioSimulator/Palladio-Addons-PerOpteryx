package edu.kit.ipd.are.dsexplore.concern.util;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.modelversioning.emfprofileapplication.StereotypeApplication;

import edu.kit.ipd.are.dsexplore.concern.emfprofilefilter.EMFProfileFilter;
import edu.kit.ipd.are.dsexplore.concern.util.EcoreReferenceResolver;

public class StereotypeApiHelper {
	/**
	 * Find all referenced Elements by type and base
	 *
	 * @param base
	 *            the base (search location)
	 * @param target
	 *            the target type
	 * @return a list of Elements found
	 * @author Dominik Fuchss
	 */
	public static <ElementType, Base extends EObject> List<ElementType> getViaStereoTypeFrom(Base base,
			Class<ElementType> target) {
		List<ElementType> res = new ArrayList<>();
		List<StereotypeApplication> appls = EMFProfileFilter.getStereotypeApplicationsFrom(base);
		for (StereotypeApplication appl : appls) {
			List<ElementType> provided = new EcoreReferenceResolver(appl).getCrossReferencedElementsOfType(target);
			res.addAll(provided);
		}
		return res;
	}
	
	public static <ElementType, Base extends EObject> List<ElementType> getViaStereoTypeFrom(Base base,
			Class<ElementType> target, String stereotype) {
		List<ElementType> res = new ArrayList<>();
		List<StereotypeApplication> appls = EMFProfileFilter.getStereotypeApplicationsFrom(base);
		for (StereotypeApplication appl : appls) {
			if (!appl.getStereotype().getName().equalsIgnoreCase(stereotype))
				continue;
			List<ElementType> provided = new EcoreReferenceResolver(appl).getCrossReferencedElementsOfType(target);
			res.addAll(provided);
		}
		return res;
	}
}
