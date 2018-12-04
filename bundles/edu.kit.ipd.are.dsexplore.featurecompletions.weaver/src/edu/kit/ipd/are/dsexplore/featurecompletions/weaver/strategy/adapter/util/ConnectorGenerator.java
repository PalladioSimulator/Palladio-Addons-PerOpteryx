package edu.kit.ipd.are.dsexplore.featurecompletions.weaver.strategy.adapter.util;

import org.palladiosimulator.pcm.core.composition.Connector;

import edu.kit.ipd.are.dsexplore.featurecompletions.weaver.strategy.manager.PcmSystemManager;

public abstract class ConnectorGenerator {

	protected final PcmSystemManager pcmSystemManager;

	public ConnectorGenerator(PcmSystemManager pcmSystemManager) {
		this.pcmSystemManager = pcmSystemManager;
	}

	public abstract Connector createConnectorBy(ConnectionInfo connectionInfo);

}
