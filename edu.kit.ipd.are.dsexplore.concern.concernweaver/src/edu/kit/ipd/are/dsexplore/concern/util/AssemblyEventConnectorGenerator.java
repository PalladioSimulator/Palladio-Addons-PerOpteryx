package edu.kit.ipd.are.dsexplore.concern.util;

import java.util.function.Predicate;

import org.palladiosimulator.pcm.core.composition.Connector;
import org.palladiosimulator.pcm.repository.SinkRole;
import org.palladiosimulator.pcm.repository.SourceRole;

import edu.kit.ipd.are.dsexplore.concern.manager.PcmSystemManager;

public class AssemblyEventConnectorGenerator extends ConnectorGenerator implements IConnectorGeneratorExploration {

	public AssemblyEventConnectorGenerator(PcmSystemManager pcmSystemManager) {
		super(pcmSystemManager);
	}

	@Override
	public Predicate<ConnectionInfo> canBeApplied() {
		return this.isSourceRole().and(this.isSinkRole());

	}

	private Predicate<ConnectionInfo> isSourceRole() {
		return connectionInfo -> connectionInfo.requiringRole instanceof SourceRole;
	}

	private Predicate<ConnectionInfo> isSinkRole() {
		return connectionInfo -> connectionInfo.providingRole instanceof SinkRole;
	}

	@Override
	public Connector createConnectorBy(ConnectionInfo connectionInfo) {
		return this.pcmSystemManager.createAssemblyEventConnectorBy(Pair.of((SourceRole) connectionInfo.requiringRole, connectionInfo.requiringAssemblyContext),
				Pair.of((SinkRole) connectionInfo.providingRole, connectionInfo.providingAssemblyContext));

	}

}
