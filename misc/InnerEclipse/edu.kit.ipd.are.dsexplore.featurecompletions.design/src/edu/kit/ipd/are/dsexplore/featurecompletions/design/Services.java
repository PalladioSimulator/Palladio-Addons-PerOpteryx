package edu.kit.ipd.are.dsexplore.featurecompletions.design;

import java.util.logging.Logger;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.modelversioning.emfprofile.Stereotype;
import org.palladiosimulator.mdsdprofiles.api.ProfileAPI;
import org.palladiosimulator.mdsdprofiles.api.StereotypeAPI;

/**
 * The services class used by VSM.
 */
public class Services {
	private static Logger logger = Logger.getLogger(Services.class.getName());
    
	public void applyFeatureCompletionStereotype(Resource resource) {
		ProfileAPI.applyProfile(resource, "FeatureCompletionProfile");
	}
	
	public void addStereotypeFulfillsComplementumVisnetis(EObject eObject) {
		this.addStereotypeWithName(eObject, "fulfillsComplementumVisnetis");
	}
	
	public void addStereotypeRequiresComplementum(EObject eObject) {
		this.addStereotypeWithName(eObject, "requiresComplementum");
	}
	
	public void addStereotypeIsSolutionFor(EObject eObject) {
		this.addStereotypeWithName(eObject, "isSolutionFor");
	}
	
	public void removeStereotypeFulfillsComplementumVisnetis(EObject eObject) {
		this.removeStereotypeWithName(eObject, "fulfillsComplementumVisnetis");
	}
	
	public void removeStereotypeRequiresComplementum(EObject eObject) {
		this.removeStereotypeWithName(eObject, "requiresComplementum");
	}
	
	public void removeStereotypeIsSolutionFor(EObject eObject) {
		this.removeStereotypeWithName(eObject, "isSolutionFor");
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
	private void addStereotypeWithName(EObject eObject, String name) {
		StereotypeAPI.getApplicableStereotypes(eObject).stream().filter(stereotype -> stereotype.getName().equals(name))
				.forEach(stereotype -> StereotypeAPI.applyStereotype(eObject, stereotype));
	}
	
	/**
	 * @see StereotypeAPI#unapplyStereotype(EObject, Stereotype)
	 */
	private void removeStereotypeWithName(EObject eObject, String name) {
		StereotypeAPI.unapplyStereotype(eObject, name);
	}
}
