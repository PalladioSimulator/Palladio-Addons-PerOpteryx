package edu.kit.ipd.are.dsexplore.concern.util;

import org.palladiosimulator.pcm.core.composition.Connector;

import edu.kit.ipd.are.dsexplore.concern.manager.PcmSystemManager;

public abstract class ConnectorGenerator {
	
	protected PcmSystemManager pcmSystemManager;
	
	public ConnectorGenerator(PcmSystemManager pcmSystemManager) {
		
		this.pcmSystemManager = pcmSystemManager;
		
	}
	
	public abstract Connector createConnectorBy(ConnectionInfo connectionInfo);
	
}
