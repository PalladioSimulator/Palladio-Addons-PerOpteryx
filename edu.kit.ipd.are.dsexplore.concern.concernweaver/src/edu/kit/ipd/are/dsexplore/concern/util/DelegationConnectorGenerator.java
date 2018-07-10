package edu.kit.ipd.are.dsexplore.concern.util;

import org.palladiosimulator.pcm.core.composition.AssemblyContext;
import org.palladiosimulator.pcm.core.composition.Connector;
import org.palladiosimulator.pcm.core.composition.ProvidedDelegationConnector;
import org.palladiosimulator.pcm.core.composition.RequiredDelegationConnector;
import org.palladiosimulator.pcm.repository.OperationProvidedRole;
import org.palladiosimulator.pcm.repository.OperationRequiredRole;
import org.palladiosimulator.pcm.repository.Role;

import edu.kit.ipd.are.dsexplore.concern.manager.PcmSystemManager;

public class DelegationConnectorGenerator extends ConnectorGenerator {

	public DelegationConnectorGenerator(PcmSystemManager pcmSystemManager) {
		super(pcmSystemManager);
	}

	private boolean containsOnlyProvidedRoles(ConnectionInfo connectionInfo) {
		return this.isOperationProvidedRole(connectionInfo.requiringRole) && this.isOperationProvidedRole(connectionInfo.providingRole);
	}

	private boolean isOperationProvidedRole(Role role) {
		return role instanceof OperationProvidedRole;
	}

	@Override
	public Connector createConnectorBy(ConnectionInfo connectionInfo) {
		if (this.containsOnlyProvidedRoles(connectionInfo)) {
			return this.createProvidedDelegationConnectorBy(connectionInfo);
		}
		return this.createRequiredDelegationConnectorBy(connectionInfo);
	}

	private RequiredDelegationConnector createRequiredDelegationConnectorBy(ConnectionInfo connectionInfo) {
		Pair<OperationRequiredRole, AssemblyContext> delegationPair = Pair.of((OperationRequiredRole) connectionInfo.providingRole, connectionInfo.providingAssemblyContext);
		return this.pcmSystemManager.createRequiredDelegationConnectorBy((OperationRequiredRole) connectionInfo.requiringRole, delegationPair);
	}

	private ProvidedDelegationConnector createProvidedDelegationConnectorBy(ConnectionInfo connectionInfo) {
		Pair<OperationProvidedRole, AssemblyContext> delegationPair = Pair.of((OperationProvidedRole) connectionInfo.providingRole, connectionInfo.providingAssemblyContext);
		return this.pcmSystemManager.createProvidedDelegationConnectorBy((OperationProvidedRole) connectionInfo.requiringRole, delegationPair);
	}

}