package edu.kit.ipd.are.dsexplore.featurecompletions.design;


import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.sirius.diagram.DEdge;
import org.modelversioning.emfprofile.Stereotype;
import org.palladiosimulator.mdsdprofiles.api.ProfileAPI;
import org.palladiosimulator.mdsdprofiles.api.StereotypeAPI;

import edu.kit.ipd.are.dsexplore.featurecompletions.design.custom.java.Utilities;
import featureObjective.Attribute;
import featureObjective.ChildRelation;
import featureObjective.DoubleAttribute;
import featureObjective.Feature;
import featureObjective.FeatureGroup;
import featureObjective.FeatureObjectiveFactory;
import featureObjective.FeatureObjectivePackage;
import featureObjective.IntegerAttribute;
import featureObjective.IntegerIntervalRange;
import featureObjective.Simple;
import featureObjective.impl.FeatureObjectiveFactoryImpl;
import featureObjective.impl.FeatureObjectivePackageImpl;

/**
 * The services class used by VSM.
 */
public class Services {
//	private static Logger logger = Logger.getLogger(Services.class.getName());
	
	public void changeMandatoryOptional(EObject selectedEObject) {
		FeatureObjectivePackage stratModPack = FeatureObjectivePackageImpl.init();
		FeatureObjectiveFactory stratFactory = FeatureObjectiveFactoryImpl.init();

		// Assume the selected Object is an edge between two features in a
		// simple relationship
		// target variable is the target of the edge, so the item in the lower
		// hierarchy
		DEdge edge = (DEdge) selectedEObject;
		Feature target = (Feature) edge.getTarget();

		Simple simple = (Simple) target.eContainer();

		if (Utilities.isOptionalChild(target)) {
			simple.getOptionalChildren().remove(target);
			simple.getMandatoryChildren().add(target);
		} else {
			simple.getMandatoryChildren().remove(target);
			simple.getOptionalChildren().add(target);
		}
	}
    
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
		removeStereotypeWithName(eObject, "fulfillsComplementumVisnetis");
	}
	
	public void removeStereotypeRequiresComplementum(EObject eObject) {
		removeStereotypeWithName(eObject, "requiresComplementum");
	}
	
	public void removeStereotypeIsSolutionFor(EObject eObject) {
		removeStereotypeWithName(eObject, "isSolutionFor");
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
	public static void removeStereotypeWithName(EObject eObject, String name) {
		StereotypeAPI.unapplyStereotype(eObject, name);
	}
	
	/*
	 * This function gets the children of the feature skipping the child
	 * relation object.
	 */
	public EList<Feature> getChildren(EObject o) {
		Feature f = (Feature) o;

		ChildRelation cr = f.getChildrelation();

		if (cr == null) {
			return null;
		}
		if (cr instanceof Simple) {
			EList<Feature> list = ((Simple) cr).getMandatoryChildren();
			EList<Feature> list2 = ((Simple) cr).getOptionalChildren();

			EList<Feature> combined = new BasicEList<Feature>(list);
			combined.addAll(list2);

			return combined;
		}
		if (cr instanceof FeatureGroup) {
			return ((FeatureGroup) cr).getChildren();
		}
		return null;
	}


	/*
	 * Get the name of the edge removing the first part which is like
	 * "org.eclipse.sirius...").
	 */
	public String getEdgeTypeName(DEdge edge) {
		String[] parts = edge.getActualMapping().toString().split(" ");
		return parts[1];
	}

	/*
	 * This functions returns a string representation of the interval range of
	 * the attribute that is supplied by the argument.
	 */
	public String getInterval(EObject o) {
		Attribute a = (Attribute) o;
		if (!(o instanceof IntegerAttribute) && !(o instanceof DoubleAttribute)) {
			return "";
		}
		
		String returnValue = "";
		if (a.getRange() instanceof IntegerIntervalRange) {
			IntegerIntervalRange range = (IntegerIntervalRange) a.getRange();

			if (range.isLowerBoundIncluded()) {
				returnValue += "[";
			} else {
				returnValue += "(";
			}

			returnValue += range.getFrom();
			returnValue += ",";
			returnValue += range.getTo();

			if (range.isUpperBoundIncluded()) {
				returnValue += "]";
			} else {
				returnValue += ")";
			}
		}
		return returnValue;
	}

	/*
	 * This method returns the root element of the model.
	 */
	public EObject getRoot(EObject o) {
		EObject s = null;

		EObject r = o.eContainer();
		while (r != null) {
			s = r;
			r = r.eContainer();
		}

		return s;
	}

}
