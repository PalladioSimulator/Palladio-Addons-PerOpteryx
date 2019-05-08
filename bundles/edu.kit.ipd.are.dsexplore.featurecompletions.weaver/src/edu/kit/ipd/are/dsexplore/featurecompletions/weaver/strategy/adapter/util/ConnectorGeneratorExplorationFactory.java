package edu.kit.ipd.are.dsexplore.featurecompletions.weaver.strategy.adapter.util;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import edu.kit.ipd.are.dsexplore.featurecompletions.weaver.ErrorMessage;
import edu.kit.ipd.are.dsexplore.featurecompletions.weaver.port.FCCWeaverException;
import edu.kit.ipd.are.dsexplore.featurecompletions.weaver.strategy.manager.PcmSystemManager;

public class ConnectorGeneratorExplorationFactory {

	private Set<IConnectorGeneratorExploration> explorableGenerators;

	public ConnectorGeneratorExplorationFactory(PcmSystemManager pcmSystemManager) {
		this.initialize(pcmSystemManager);
	}

	private void initialize(PcmSystemManager pcmSystemManager) {
		this.explorableGenerators = new HashSet<>();
		this.explorableGenerators.add(new AssemblyConnectorGenerator(pcmSystemManager));
		this.explorableGenerators.add(new AssemblyEventConnectorGenerator(pcmSystemManager));
	}

	public ConnectorGenerator getApplicableConnectorGeneratorBy(ConnectionInfo connectionInfo) throws FCCWeaverException {
		List<IConnectorGeneratorExploration> generators = this.getMatches(connectionInfo);
		if (this.isValidResult(generators)) {
			return (ConnectorGenerator) generators.get(0);
		}
		throw new FCCWeaverException(ErrorMessage.unsupportedConnector());
	}

	private List<IConnectorGeneratorExploration> getMatches(ConnectionInfo connectionInfo) {
		List<IConnectorGeneratorExploration> result = new ArrayList<>();
		for (IConnectorGeneratorExploration explore : this.explorableGenerators) {
			if (explore.canBeApplied(connectionInfo)) {
				result.add(explore);
			}
		}
		return result;
	}

	private boolean isValidResult(List<IConnectorGeneratorExploration> generators) {
		return generators.size() == 1;
	}

}
