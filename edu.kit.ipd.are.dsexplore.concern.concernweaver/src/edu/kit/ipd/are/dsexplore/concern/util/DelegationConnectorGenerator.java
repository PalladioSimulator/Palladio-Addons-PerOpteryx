package edu.kit.ipd.are.dsexplore.concern.util;

import java.util.List;
import java.util.Optional;

import org.palladiosimulator.pcm.core.composition.Connector;
import org.palladiosimulator.pcm.core.composition.ProvidedDelegationConnector;
import org.palladiosimulator.pcm.core.composition.RequiredDelegationConnector;
import org.palladiosimulator.pcm.repository.OperationInterface;
import org.palladiosimulator.pcm.repository.OperationProvidedRole;
import org.palladiosimulator.pcm.repository.OperationRequiredRole;
import org.palladiosimulator.pcm.repository.Role;

import edu.kit.ipd.are.dsexplore.concern.manager.PcmSystemManager;

public class DelegationConnectorGenerator extends ConnectorGenerator {

	public DelegationConnectorGenerator(List<Role> rolesToExplore, PcmSystemManager pcmSystemManager) {
		
		super(rolesToExplore, pcmSystemManager);
		
	}

	private boolean isOperationProvidedRole(Role role) {
		
		return role instanceof OperationProvidedRole;
		
	}
	
	@Override
	public Optional<Connector> getConnectorOf(ConnectionInfo knownConnectionEnd) {
		
		if (isOperationProvidedRole(knownConnectionEnd.role)) {
			
			OperationProvidedRole innerProvidedRole = getConnectedOpponentOf((OperationProvidedRole) knownConnectionEnd.role).get();
			return Optional.of(createConnectorWithKnownProvidedConnectionEnd(innerProvidedRole, knownConnectionEnd));
			
		}
		
		OperationRequiredRole innerRequiredRole = getConnectedOpponentOf((OperationRequiredRole) knownConnectionEnd.role).get();
		return Optional.of(createConnectorWithKnownRequiredConnectionEnd(innerRequiredRole, knownConnectionEnd));
		
	}

	private RequiredDelegationConnector createConnectorWithKnownRequiredConnectionEnd(OperationRequiredRole innerRequiredRole, ConnectionInfo knownConnectionEnd) {
		
		return pcmSystemManager.createRequiredDelegationConnectorBy((OperationRequiredRole) knownConnectionEnd.role, 
																	Pair.of(innerRequiredRole, knownConnectionEnd.assemblyContext));
		
	}

	private ProvidedDelegationConnector createConnectorWithKnownProvidedConnectionEnd(OperationProvidedRole innerProvidedRole, ConnectionInfo knownConnectionEnd) {
		
		return pcmSystemManager.createProvidedDelegationConnectorBy((OperationProvidedRole) knownConnectionEnd.role, 
																	Pair.of(innerProvidedRole, knownConnectionEnd.assemblyContext));
		
	}

	//TODO refactor -> RoleHandler
	private Optional<OperationProvidedRole> getConnectedOpponentOf(OperationProvidedRole providedRole) {
		
		return rolesToExplore.stream().filter(eachRole -> eachRole instanceof OperationProvidedRole)
								   .map(eachOperationProvidedRole -> (OperationProvidedRole) eachOperationProvidedRole)
						  		   .filter(eachOperationProvidedRole -> areConnected(eachOperationProvidedRole.getProvidedInterface__OperationProvidedRole(),
								  	   											     providedRole.getProvidedInterface__OperationProvidedRole()))
						  		   .findFirst();
		
	}
	
	//TODO refactor -> RoleHandler
	private Optional<OperationRequiredRole> getConnectedOpponentOf(OperationRequiredRole requiredRole) {
		
		return rolesToExplore.stream().filter(eachRole -> eachRole instanceof OperationRequiredRole)
							       .map(eachOperationRequiredRole -> (OperationRequiredRole) eachOperationRequiredRole)
							       .filter(eachOperationRequiredRole -> areConnected(eachOperationRequiredRole.getRequiredInterface__OperationRequiredRole(),
							    		   											 requiredRole.getRequiredInterface__OperationRequiredRole()))
							       .findFirst();
		
	}

	private boolean areConnected(OperationInterface firstInterface, OperationInterface secondInterface) {
		
		return firstInterface.equals(secondInterface);
		
	}

}