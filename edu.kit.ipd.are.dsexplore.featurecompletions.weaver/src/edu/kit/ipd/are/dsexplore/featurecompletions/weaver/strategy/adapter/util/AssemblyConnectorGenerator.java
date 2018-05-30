package edu.kit.ipd.are.dsexplore.featurecompletions.weaver.strategy.adapter.util;

import java.util.function.Predicate;

import org.palladiosimulator.pcm.core.composition.Connector;
import org.palladiosimulator.pcm.repository.OperationProvidedRole;
import org.palladiosimulator.pcm.repository.OperationRequiredRole;

import de.uka.ipd.sdq.dsexplore.tools.primitives.Pair;
import edu.kit.ipd.are.dsexplore.featurecompletions.weaver.strategy.manager.PcmSystemManager;

public class AssemblyConnectorGenerator extends ConnectorGenerator implements IConnectorGeneratorExploration {

	public AssemblyConnectorGenerator(PcmSystemManager pcmSystemManager) {
		super(pcmSystemManager);
	}

	@Override
	public Predicate<ConnectionInfo> canBeApplied() {
		return this.isOperationRequiredRole().and(this.isOperationProvidedRole());
	}

	private Predicate<ConnectionInfo> isOperationRequiredRole() {
		return connectionInfo -> connectionInfo.requiringRole instanceof OperationRequiredRole;
	}

	private Predicate<ConnectionInfo> isOperationProvidedRole() {
		return connectionInfo -> connectionInfo.providingRole instanceof OperationProvidedRole;
	}

	@Override
	public Connector createConnectorBy(ConnectionInfo connectionInfo) {
		return this.pcmSystemManager.createAssemblyConnectorBy(Pair.of((OperationRequiredRole) connectionInfo.requiringRole, connectionInfo.requiringAssemblyContext),
				Pair.of((OperationProvidedRole) connectionInfo.providingRole, connectionInfo.providingAssemblyContext));
	}

}
