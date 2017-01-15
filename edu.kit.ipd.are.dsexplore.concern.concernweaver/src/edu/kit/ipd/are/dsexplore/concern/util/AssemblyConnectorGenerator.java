package edu.kit.ipd.are.dsexplore.concern.util;

import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;

import org.palladiosimulator.pcm.core.composition.AssemblyContext;
import org.palladiosimulator.pcm.core.composition.Connector;
import org.palladiosimulator.pcm.repository.OperationProvidedRole;
import org.palladiosimulator.pcm.repository.OperationRequiredRole;
import org.palladiosimulator.pcm.repository.RepositoryComponent;
import org.palladiosimulator.pcm.repository.Role;

import edu.kit.ipd.are.dsexplore.concern.manager.PcmSystemManager;

public class AssemblyConnectorGenerator extends ConnectorGenerator implements IConnectorGeneratorExploration {

	public AssemblyConnectorGenerator(List<Role> rolesToExplore, PcmSystemManager pcmSystemManager) {
		
		super(rolesToExplore, pcmSystemManager);

	}
	
	@Override
	public Predicate<Role> canBeApplied() {
		
		return role -> isOperationRequiredRole(role) && hasConnectedProvidedRole((OperationRequiredRole) role);
		
	}

	private boolean isOperationRequiredRole(Role role) {
		
		return role instanceof OperationRequiredRole;
		
	}

	private boolean hasConnectedProvidedRole(OperationRequiredRole requiredRole) {
		
		return getConnectedOpponentOf(requiredRole).isPresent();
		
	}

	@Override
	public Optional<Connector> getConnectorOf(ConnectionInfo knownConnectionEnd) {
		
		OperationProvidedRole providedRole = (OperationProvidedRole) getConnectedOpponentOf((OperationRequiredRole) knownConnectionEnd.role).get();
		return Optional.of(createConnectorWithKnownRequiredConnectionEnd(providedRole, knownConnectionEnd));
		
	}
	
	public Connector getConnectorOf(ConnectionInfo requiredConnectionEnd, ConnectionInfo providedConnectionEnd) {
		
		return pcmSystemManager.createAssemblyConnectorBy(Pair.of((OperationRequiredRole) requiredConnectionEnd.role, requiredConnectionEnd.assemblyContext), 
														  Pair.of((OperationProvidedRole) providedConnectionEnd.role, providedConnectionEnd.assemblyContext));
		
	}

	private Connector createConnectorWithKnownRequiredConnectionEnd(OperationProvidedRole providedRole, ConnectionInfo requiredConnectionEnd) {
		
		AssemblyContext providedAssemblyContext = getAssemblyContextOf((RepositoryComponent) providedRole.eContainer(), requiredConnectionEnd);
		return pcmSystemManager.createAssemblyConnectorBy(Pair.of((OperationRequiredRole) requiredConnectionEnd.role, requiredConnectionEnd.assemblyContext), 
														  Pair.of(providedRole, providedAssemblyContext));
		
	}

}
