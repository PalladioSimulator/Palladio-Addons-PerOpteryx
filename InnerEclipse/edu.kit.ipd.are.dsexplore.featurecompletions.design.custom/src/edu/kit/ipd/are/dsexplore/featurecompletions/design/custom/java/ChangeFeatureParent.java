package edu.kit.ipd.are.dsexplore.featurecompletions.design.custom.java;

import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;

import featureObjective.Feature;
import featureObjective.FeatureGroup;
import featureObjective.Simple;
import featureObjective.FeatureObjectiveFactory;
import featureObjective.FeatureObjectivePackage;
import featureObjective.impl.FeatureObjectiveFactoryImpl;
import featureObjective.impl.FeatureObjectivePackageImpl;

public class ChangeFeatureParent implements org.eclipse.sirius.tools.api.ui.IExternalJavaAction {

	@Override
	public boolean canExecute(Collection<? extends EObject> arg0) {
		return true;
	}

	/*
	 * This function changes the parent of the feature given as the "element"
	 * argument from the "source" to the "target".
	 */
	@Override
	public void execute(Collection<? extends EObject> arg0, Map<String, Object> arg1) {

		EObject s = (EObject) arg1.get("source");
		EObject t = (EObject) arg1.get("target");
		EObject e = (EObject) arg1.get("element");

		// System.out.println("source: " + s.eClass().getName());
		// System.out.println("target: " + t.eClass().getName());
		// System.out.println("target: " + e.eClass().getName());

		// the new parent
		Feature target = (Feature) arg1.get("target");

		// the feature to move
		Feature element = (Feature) arg1.get("element");

		// there needs to be a distinction between edges from simple and feature
		// group sources
		// the feature group sources are of type Feature group while the sources
		// from simple are
		// of type feature

		Feature source = null;
		if (s instanceof Feature) {
			source = (Feature) s;
		} else {
			source = (Feature) s.eContainer();
		}

		// Check whether the target is a child of the element
		// in that case a parent chase is not possible
		TreeIterator<EObject> iterator = element.eAllContents();

		while (iterator.hasNext()) {
			EObject current = iterator.next();

			if (current == target) {
				return;
			}
		}

		int relationTypeTarget = Utilities.getChildRelationshipType(target);

		if (relationTypeTarget == 0) {
			// in case there the target has no children create a simple as a
			// default case
			FeatureObjectivePackage stratModPack = FeatureObjectivePackageImpl.init();
			FeatureObjectiveFactory stratFactory = FeatureObjectiveFactoryImpl.init();

			Simple simple = (Simple) stratFactory.create(stratModPack.getSimple());

			target.setChildrelation(simple);
			relationTypeTarget = 1;
		}

		if (relationTypeTarget == 1) {
			// Add element to new parent
			Simple targetSimple = (Simple) target.getChildrelation();

			int relationTypeSource = Utilities.getChildRelationshipType(source);

			if (relationTypeSource == 1) {
				if (Utilities.isOptionalChild(element)) {
					targetSimple.getOptionalChildren().add(element);
				} else {
					targetSimple.getMandatoryChildren().add(element);
				}
			} else {
				// simple as default case
				targetSimple.getOptionalChildren().add(element);
			}

		} else {
			((FeatureGroup) target.getChildrelation()).getChildren().add(element);
		}
	}
}
