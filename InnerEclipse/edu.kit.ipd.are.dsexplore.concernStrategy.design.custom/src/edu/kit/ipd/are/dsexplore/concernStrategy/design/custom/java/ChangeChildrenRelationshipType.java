package edu.kit.ipd.are.dsexplore.concernStrategy.design.custom.java;

import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

import concernStrategy.Feature;
import concernStrategy.FeatureGroup;
import concernStrategy.Simple;
import concernStrategy.StrategymodelFactory;
import concernStrategy.StrategymodelPackage;
import concernStrategy.impl.StrategymodelFactoryImpl;
import concernStrategy.impl.StrategymodelPackageImpl;

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
		StrategymodelPackage stratModPack = StrategymodelPackageImpl.init();
		StrategymodelFactory stratFactory = StrategymodelFactoryImpl.init();

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
