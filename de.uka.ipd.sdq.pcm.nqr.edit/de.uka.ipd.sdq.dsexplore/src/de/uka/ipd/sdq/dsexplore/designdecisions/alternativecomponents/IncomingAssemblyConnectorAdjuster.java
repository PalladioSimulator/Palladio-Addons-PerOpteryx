package de.uka.ipd.sdq.dsexplore.designdecisions.alternativecomponents;

import org.palladiosimulator.pcm.core.composition.AssemblyConnector;
import org.palladiosimulator.pcm.repository.OperationProvidedRole;

public class IncomingAssemblyConnectorAdjuster implements ConnectorAdjuster {
	
	public IncomingAssemblyConnectorAdjuster(AssemblyConnector connector,
			OperationProvidedRole role) {
		super();
		this.connector = connector;
		this.role = role;
	}

	private AssemblyConnector connector;
	private OperationProvidedRole role;

	@Override
	public void build() {
		this.connector.setProvidedRole_AssemblyConnector(role);
	}


}
