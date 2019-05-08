package edu.kit.ipd.are.dsexplore.featurecompletions.weaver.strategy.adapter.util;

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
	public boolean canBeApplied(ConnectionInfo ci) {
		return ci.requiringRole instanceof OperationRequiredRole && ci.providingRole instanceof OperationProvidedRole;
	}

	@Override
	public Connector createConnectorBy(ConnectionInfo connectionInfo) {
		return this.pcmSystemManager.createAssemblyConnectorBy(Pair.of((OperationRequiredRole) connectionInfo.requiringRole, connectionInfo.requiringAssemblyContext),
				Pair.of((OperationProvidedRole) connectionInfo.providingRole, connectionInfo.providingAssemblyContext));
	}

}
