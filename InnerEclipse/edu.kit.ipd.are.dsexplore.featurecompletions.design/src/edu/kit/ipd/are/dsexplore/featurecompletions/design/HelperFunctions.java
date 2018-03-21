package edu.kit.ipd.are.dsexplore.featurecompletions.design;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.sirius.diagram.DEdge;

import concernStrategy.Attribute;
import concernStrategy.ChildRelation;
import concernStrategy.ContinousIntervalRange;
import concernStrategy.DoubleAttribute;
import concernStrategy.Feature;
import concernStrategy.FeatureGroup;
import concernStrategy.IntegerAttribute;
import concernStrategy.IntegerIntervalRange;
import concernStrategy.Simple;

/*
 * These functions are accessible in AQL expressions for the viewpoint specification.
 * */
public class HelperFunctions {

	public boolean test(EObject o) {

		System.out.println(o.toString());

		return true;
	}

	public HelperFunctions() {
		super();
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

		String returnValue = "";

		// This is looking ugly, but the model doesn't support getFrom/getTo
		// methods for IntervalRange-class.
		if (a instanceof IntegerAttribute) {
			IntegerAttribute attribute = (IntegerAttribute) a;
			IntegerIntervalRange range = (IntegerIntervalRange) attribute.getRange();

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
		if (a instanceof DoubleAttribute) {
			DoubleAttribute attribute = (DoubleAttribute) a;

			ContinousIntervalRange range = (ContinousIntervalRange) attribute.getRange();

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
