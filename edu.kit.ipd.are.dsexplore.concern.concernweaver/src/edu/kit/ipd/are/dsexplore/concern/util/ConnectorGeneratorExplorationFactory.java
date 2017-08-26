package edu.kit.ipd.are.dsexplore.concern.util;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import edu.kit.ipd.are.dsexplore.concern.exception.ConcernWeavingException;
import edu.kit.ipd.are.dsexplore.concern.exception.ErrorMessage;
import edu.kit.ipd.are.dsexplore.concern.manager.PcmSystemManager;

public class ConnectorGeneratorExplorationFactory {

	private Set<IConnectorGeneratorExploration> explorableGenerators;

	private static ConnectorGeneratorExplorationFactory eInstance = null;

	private ConnectorGeneratorExplorationFactory() {
	}

	public static ConnectorGeneratorExplorationFactory getBy(PcmSystemManager pcmSystemManager) {
		if (ConnectorGeneratorExplorationFactory.eInstance == null) {
			ConnectorGeneratorExplorationFactory.eInstance = new ConnectorGeneratorExplorationFactory();
		}
		ConnectorGeneratorExplorationFactory.eInstance.initialize(pcmSystemManager);
		return ConnectorGeneratorExplorationFactory.eInstance;
	}

	private void initialize(PcmSystemManager pcmSystemManager) {
		this.explorableGenerators = new HashSet<>();
		this.explorableGenerators.add(new AssemblyConnectorGenerator(pcmSystemManager));
		this.explorableGenerators.add(new AssemblyEventConnectorGenerator(pcmSystemManager));
	}

	public ConnectorGenerator getApplicableConnectorGeneratorBy(ConnectionInfo connectionInfo) throws ConcernWeavingException {
		List<IConnectorGeneratorExploration> generators = this.getMatches(connectionInfo);
		if (this.isValidResult(generators)) {
			return (ConnectorGenerator) generators.get(0);
		}
		throw new ConcernWeavingException(ErrorMessage.unsupportedConnector());
	}

	private List<IConnectorGeneratorExploration> getMatches(ConnectionInfo connectionInfo) {
		return this.explorableGenerators.stream().filter(eachGenerator -> eachGenerator.canBeApplied().test(connectionInfo)).collect(Collectors.toList());
	}

	private boolean isValidResult(List<IConnectorGeneratorExploration> generators) {
		return generators.size() == 1;
	}

}
