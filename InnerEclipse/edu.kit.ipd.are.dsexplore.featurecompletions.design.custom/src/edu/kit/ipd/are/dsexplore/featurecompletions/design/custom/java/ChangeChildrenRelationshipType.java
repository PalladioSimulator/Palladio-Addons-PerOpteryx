package edu.kit.ipd.are.dsexplore.featurecompletions.design.custom.java;

import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

import featureObjective.Feature;
import featureObjective.FeatureGroup;
import featureObjective.Simple;
import featureObjective.FeatureObjectiveFactory;
import featureObjective.FeatureObjectivePackage;
import featureObjective.impl.FeatureObjectiveFactoryImpl;
import featureObjective.impl.FeatureObjectivePackageImpl;

public class ChangeChildrenRelationshipType implements org.eclipse.sirius.tools.api.ui.IExternalJavaAction {

	@Override
	public boolean canExecute(Collection<? extends EObject> arg0) {
		return true;
	}

	/*
	 * Changes the child relationship type; simple to feature group and vice
	 * versa.
	 */
	@Override
	public void execute(Collection<? extends EObject> arg0, Map<String, Object> arg1) {
		FeatureObjectivePackage stratModPack = FeatureObjectivePackageImpl.init();
		FeatureObjectiveFactory stratFactory = FeatureObjectiveFactoryImpl.init();

		EObject selectedEObject = arg0.iterator().next();
		Feature selectedFeature = (Feature) selectedEObject;

		int childrenContainerType = Utilities.getChildRelationshipType(selectedFeature);

		switch (childrenContainerType) {
		case 0:
			// No children so nothing to change
			return;
		case 1:
			// simple type so change to feature group
			EList<EObject> childrenSimple = selectedFeature.getChildrelation().eContents();

			FeatureGroup featureGroup = (FeatureGroup) stratFactory.create(stratModPack.getFeatureGroup());
			featureGroup.getChildren().addAll(childrenSimple);
			selectedFeature.setChildrelation(featureGroup);

			return;
		case 2:
			EList<EObject> childrenFeatureGroup = selectedFeature.getChildrelation().eContents();

			Simple simple = (Simple) stratFactory.create(stratModPack.getSimple());
			// add as optional children as a default case
			simple.getOptionalChildren().addAll(childrenFeatureGroup);
			selectedFeature.setChildrelation(simple);
		}
	}
}
