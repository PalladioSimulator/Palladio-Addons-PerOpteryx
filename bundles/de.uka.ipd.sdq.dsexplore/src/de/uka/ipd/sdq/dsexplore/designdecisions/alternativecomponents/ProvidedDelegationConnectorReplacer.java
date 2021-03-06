package de.uka.ipd.sdq.dsexplore.designdecisions.alternativecomponents;

import org.palladiosimulator.pcm.core.composition.ProvidedDelegationConnector;
import org.palladiosimulator.pcm.repository.OperationProvidedRole;

public class ProvidedDelegationConnectorReplacer implements ConnectorAdjuster {
	
	public ProvidedDelegationConnectorReplacer(
			ProvidedDelegationConnector connector, OperationProvidedRole role) {
		super();
		this.connector = connector;
		this.role = role;
	}


	private ProvidedDelegationConnector connector;
	private OperationProvidedRole role;


	@Override
	public void build() {
		connector.setInnerProvidedRole_ProvidedDelegationConnector(role);
	}

}
