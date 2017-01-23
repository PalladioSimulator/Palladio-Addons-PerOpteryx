package edu.kit.ipd.are.dsexplore.concern.util;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import org.palladiosimulator.pcm.repository.Role;

import edu.kit.ipd.are.dsexplore.concern.manager.PcmSystemManager;

public class ConnectorGeneratorExplorationFactory {

	private Set<IConnectorGeneratorExploration> explorableGenerators;
	
	private static ConnectorGeneratorExplorationFactory eInstance = null;
	
	private ConnectorGeneratorExplorationFactory() {
		
	}
	
	public static ConnectorGeneratorExplorationFactory getBy(List<Role> rolesToExplore, PcmSystemManager pcmSystemManager) {
		
		if (eInstance == null) {
			
			eInstance = new ConnectorGeneratorExplorationFactory();
			
		}
		
		eInstance.initialize(rolesToExplore, pcmSystemManager);
		
		return eInstance;
		
	}
	
	private void initialize(List<Role> rolesToExplore, PcmSystemManager pcmSystemManager) {
		
		this.explorableGenerators = new HashSet<IConnectorGeneratorExploration>();
		explorableGenerators.add(new AssemblyConnectorGenerator(rolesToExplore, pcmSystemManager));
		explorableGenerators.add(new AssemblyEventConnectorGenerator(rolesToExplore, pcmSystemManager));
		
	}

	public ConnectorGenerator getApplicableConnectorGeneratorBy(Role role) {
		
		List<IConnectorGeneratorExploration> generators = getMatches(role);
		
		if (!isValideResult(generators)) {
			
			//TODO introduce exceptions
			return null;
			
		}
		
		return (ConnectorGenerator) generators.get(0);
		
	}

	private List<IConnectorGeneratorExploration> getMatches(Role role) {
	
		return this.explorableGenerators.stream().filter(eachGenerator -> eachGenerator.canBeApplied().test(role))
				  								 .collect(Collectors.toList());
		
	}
	
	private boolean isValideResult(List<IConnectorGeneratorExploration> generators) {
		
		return !generators.isEmpty() && generators.size() == 1;
		
	}
	
}
