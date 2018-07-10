package org.palladiosimulator.editors.sirius.repository.enriched.services;

import java.util.logging.Logger;

import org.eclipse.emf.ecore.EObject;
import org.modelversioning.emfprofile.Stereotype;
import org.palladiosimulator.mdsdprofiles.api.StereotypeAPI;

/**
 * Services to handle Stereotypes, mainly to apply certain stereotypes to an
 * object.
 *
 * @author Jan Keim
 *
 */
public class StereotypeServices {

	private static Logger logger = Logger.getLogger(StereotypeServices.class.getName());

	/**
	 * Applies the Annotation Stereotype to a given EObject
	 *
	 * @see StereotypeAPI#applyStereotype(EObject, Stereotype)
	 */
	public void addAnnotationStereotype(EObject eObject) {
		addStereotypeWithName(eObject, "Annotation");
	}

	/**
	 * Removes the Annotation Stereotype from a given EObject
	 *
	 * @see StereotypeAPI#unapplyStereotype(EObject, Stereotype)
	 */
	public void removeAnnotationStereotype(EObject eObject) {
		removeStereotypeWithName(eObject, "Annotation");
	}

	/**
	 * Applies the Solutions Stereotype to a given EObject
	 *
	 * @see StereotypeAPI#applyStereotype(EObject, Stereotype)
	 */
	public void addSolutionStereotype(EObject eObject) {
		addStereotypeWithName(eObject, "Solutions");
	}

	/**
	 * Removes the Solutions Stereotype from a given EObject
	 *
	 * @see StereotypeAPI#unapplyStereotype(EObject, Stereotype)
	 */
	public void removeSolutionStereotype(EObject eObject) {
		removeStereotypeWithName(eObject, "Solutions");
	}

	/**
	 * @see StereotypeAPI#unapplyStereotype(EObject, Stereotype)
	 */
	public void removeStereotypeWithName(EObject eObject, String name) {
		StereotypeAPI.unapplyStereotype(eObject, name);
	}

	/**
	 * Applies a Stereotype to a given eObject. The Stereotype is given with its
	 * name as a String.
	 *
	 * @see StereotypeAPI#applyStereotype(EObject, Stereotype)
	 *
	 * @param eObject
	 *            Object the Stereotype should be applied to.
	 * @param name
	 *            Name of the Stereotype to apply
	 */
	public void addStereotypeWithName(EObject eObject, String name) {
		StereotypeAPI.getApplicableStereotypes(eObject).stream().filter(stereotype -> stereotype.getName().equals(name))
				.forEach(stereotype -> StereotypeAPI.applyStereotype(eObject, stereotype));
	}

	/**
	 * Checks whether a given object is the Stereotype Solution
	 *
	 * @param eObject
	 *            Object that should be checked
	 * @return true if it is the Solution Stereotype, else false
	 */
	public boolean isSolutionStereotype(EObject eObject) {
		return eObject.toString().contains("Solutions"); // TODO better?
	}

}
