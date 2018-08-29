package de.uka.ipd.sdq.dsexplore.tools.stereotypeapi;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.modelversioning.emfprofileapplication.StereotypeApplication;

/**
 * Some utility functions for {@link StereotypeApplication}.
 *
 * @author Dominik Fuchss
 *
 */
public final class StereotypeAPIHelper {
	private StereotypeAPIHelper() {
		throw new UnsupportedOperationException("Utility Class");
	}

	/**
	 * Find all referenced Elements by type and base
	 *
	 * @param base
	 *            the base (search location)
	 * @param target
	 *            the target type
	 * @return a list of Elements found
	 *
	 */
	public static <ElementType, Base extends EObject> List<ElementType> getViaStereoTypeFrom(Base base, Class<ElementType> target) {
		List<ElementType> res = new ArrayList<>();
		List<StereotypeApplication> appls = EMFProfileFilter.getStereotypeApplicationsFrom(base);
		for (StereotypeApplication appl : appls) {
			List<ElementType> provided = new EcoreReferenceResolver(appl).getCrossReferencedElementsOfType(target);
			res.addAll(provided);
		}
		return res;
	}

	/**
	 * Find all referenced Elements by type and base
	 *
	 * @param base
	 *            the base (search location)
	 * @param target
	 *            the target type
	 * @param stereotype
	 *            the name of the stereotype
	 * @return a list of Elements found
	 *
	 */
	public static <ElementType, Base extends EObject> List<ElementType> getViaStereoTypeFrom(Base base, Class<ElementType> target, String stereotype) {
		List<ElementType> res = new ArrayList<>();
		List<StereotypeApplication> appls = EMFProfileFilter.getStereotypeApplicationsFrom(base);
		for (StereotypeApplication appl : appls) {
			if (!appl.getStereotype().getName().equalsIgnoreCase(stereotype)) {
				continue;
			}
			List<ElementType> provided = new EcoreReferenceResolver(appl).getCrossReferencedElementsOfType(target);
			res.addAll(provided);
		}
		return res;
	}

	public static StereotypeApplication getStereotype(EObject base, String stereotype) {
		List<StereotypeApplication> appls = EMFProfileFilter.getStereotypeApplicationsFrom(base);
		for (StereotypeApplication appl : appls) {
			if (!appl.getStereotype().getName().equalsIgnoreCase(stereotype)) {
				continue;
			}
			return appl;
		}
		return null;
	}
}
