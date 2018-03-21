package edu.kit.ipd.are.dsexplore.featurecompletions.design.custom.java;

import java.util.Iterator;

import featureObjective.ChildRelation;
import featureObjective.Feature;
import featureObjective.Simple;

/*
 * This class provides some helper methods which are used in multiple classes.
 * */
public class Utilities {

	/*
	 * Determines the relationship type with the children. Returns an int with
	 * the following values: 0 - no children container 1 - simple children
	 * container 2 - feature group container
	 */
	protected static int getChildRelationshipType(Feature feature) {

		ChildRelation cr = feature.getChildrelation();

		if (cr == null) {
			return 0;
		}

		if (cr instanceof Simple) {
			return 1;
		} else {
			return 2;
		}
	}

	/*
	 * Determines whether the feature is an optional child (as opposed to a
	 * mandatory). Can only be used if feature is in a simple relationship.
	 */
	protected static boolean isOptionalChild(Feature feature) {
		Simple simple = (Simple) feature.eContainer();
		Iterator list = simple.getOptionalChildren().iterator();

		while (list.hasNext()) {
			Feature currentFeature = (Feature) list.next();

			if (currentFeature == feature) {
				return true;
			}
		}

		return false;
	}

}
