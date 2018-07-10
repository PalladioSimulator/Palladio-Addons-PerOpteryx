package edu.kit.ipd.are.dsexplore.concernStrategy.design.custom.java;

import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.sirius.diagram.DSemanticDiagram;

import concernStrategy.Feature;
import strategyConfig.ConcernconfigFactory;
import strategyConfig.ConcernconfigPackage;
import strategyConfig.ConfigNode;
import strategyConfig.ConfigState;
import strategyConfig.Configuration;
import strategyConfig.impl.ConcernconfigFactoryImpl;
import strategyConfig.impl.ConcernconfigPackageImpl;

public class CreateConfigNode implements org.eclipse.sirius.tools.api.ui.IExternalJavaAction {

	@Override
	public boolean canExecute(Collection<? extends EObject> arg0) {
		return true;
	}

	/*
	 * Adds a config node to a feature.
	 */
	@Override
	public void execute(Collection<? extends EObject> arg0, Map<String, Object> arg1) {

		Feature feature = (Feature) arg1.get("feature");

		DSemanticDiagram diagram = (DSemanticDiagram) arg1.get("diagram");

		Configuration configuration = (Configuration) diagram.getTarget();

		EList<ConfigNode> nodes = configuration.getDefaultConfig().getConfignode();

		for (ConfigNode node : nodes) {
			if (node.getOrigin() == feature) {
				// Config node already exists
				return;
			}
		}

		ConcernconfigPackage ccPackage = ConcernconfigPackageImpl.init();
		ConcernconfigFactory ccFactory = ConcernconfigFactoryImpl.init();

		ConfigNode newConfigNode = ccFactory.createConfigNode();
		newConfigNode.setConfigState(ConfigState.DEFAULT_LITERAL);
		newConfigNode.setOrigin(feature);

		nodes.add(newConfigNode);
	}
}
