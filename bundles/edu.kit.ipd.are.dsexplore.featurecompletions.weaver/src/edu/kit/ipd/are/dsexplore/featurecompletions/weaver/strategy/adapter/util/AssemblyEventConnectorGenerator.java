package edu.kit.ipd.are.dsexplore.featurecompletions.weaver.strategy.adapter.util;

import org.palladiosimulator.pcm.core.composition.Connector;
import org.palladiosimulator.pcm.repository.SinkRole;
import org.palladiosimulator.pcm.repository.SourceRole;

import de.uka.ipd.sdq.dsexplore.tools.primitives.Pair;
import edu.kit.ipd.are.dsexplore.featurecompletions.weaver.strategy.manager.PcmSystemManager;

public class AssemblyEventConnectorGenerator extends ConnectorGenerator implements IConnectorGeneratorExploration {

	public AssemblyEventConnectorGenerator(PcmSystemManager pcmSystemManager) {
		super(pcmSystemManager);
	}

	@Override
	public boolean canBeApplied(ConnectionInfo ci) {
		return ci.requiringRole instanceof SourceRole && ci.providingRole instanceof SinkRole;

	}

	@Override
	public Connector createConnectorBy(ConnectionInfo connectionInfo) {
		return this.pcmSystemManager.createAssemblyEventConnectorBy(Pair.of((SourceRole) connectionInfo.requiringRole, connectionInfo.requiringAssemblyContext),
				Pair.of((SinkRole) connectionInfo.providingRole, connectionInfo.providingAssemblyContext));

	}

}
