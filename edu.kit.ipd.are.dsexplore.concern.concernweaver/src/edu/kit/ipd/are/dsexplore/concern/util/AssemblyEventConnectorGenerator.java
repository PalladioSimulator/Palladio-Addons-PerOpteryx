package edu.kit.ipd.are.dsexplore.concern.util;

import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;

import org.palladiosimulator.pcm.core.composition.AssemblyContext;
import org.palladiosimulator.pcm.core.composition.Connector;
import org.palladiosimulator.pcm.repository.RepositoryComponent;
import org.palladiosimulator.pcm.repository.Role;
import org.palladiosimulator.pcm.repository.SinkRole;
import org.palladiosimulator.pcm.repository.SourceRole;

import edu.kit.ipd.are.dsexplore.concern.manager.PcmSystemManager;

public class AssemblyEventConnectorGenerator extends ConnectorGenerator implements IConnectorGeneratorExploration {

	public AssemblyEventConnectorGenerator(List<Role> rolesToExplore, PcmSystemManager pcmSystemManager) {
		
		super(rolesToExplore, pcmSystemManager);
		
	}

	@Override
	public Predicate<Role> canBeApplied() {
		
		return role -> isSourceRole(role) && hasConnectedSinkRole((SourceRole) role);
		
	}

	private boolean isSourceRole(Role role) {
		
		return role instanceof SourceRole;
		
	}

	private boolean hasConnectedSinkRole(SourceRole requiredRole) {
		
		return getConnectedOpponentOf(requiredRole).isPresent();
		
	}

	@Override
	public Optional<Connector> getConnectorOf(ConnectionInfo knownConnectionEnd) {
		
		SinkRole providedRole = (SinkRole) getConnectedOpponentOf((SourceRole) knownConnectionEnd.role).get();
		return Optional.of(createConnectorWithKnownRequiredConnectionEnd(providedRole, knownConnectionEnd));
		
	}
	
	public Connector getConnectorOf(ConnectionInfo requiredConnectionEnd, ConnectionInfo providedConnectionEnd) {
		
		return pcmSystemManager.createAssemblyEventConnectorBy(Pair.of((SourceRole) requiredConnectionEnd.role, requiredConnectionEnd.assemblyContext), 
														  	   Pair.of((SinkRole) providedConnectionEnd.role, providedConnectionEnd.assemblyContext));
		
	}

	private Connector createConnectorWithKnownRequiredConnectionEnd(SinkRole providedRole, ConnectionInfo requiredConnectionEnd) {
		
		AssemblyContext providedAssemblyContext = getAssemblyContextOf((RepositoryComponent) providedRole.eContainer(), requiredConnectionEnd);
		return pcmSystemManager.createAssemblyEventConnectorBy(Pair.of((SourceRole) requiredConnectionEnd.role, requiredConnectionEnd.assemblyContext), 
														  	   Pair.of(providedRole, providedAssemblyContext));
		
	}

}
