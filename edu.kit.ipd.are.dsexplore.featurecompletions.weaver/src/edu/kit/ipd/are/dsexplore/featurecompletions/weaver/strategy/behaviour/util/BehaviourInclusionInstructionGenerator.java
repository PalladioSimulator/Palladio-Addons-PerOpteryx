/**
 * 
 */
package edu.kit.ipd.are.dsexplore.featurecompletions.weaver.strategy.behaviour.util;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.palladiosimulator.pcm.core.composition.AssemblyConnector;
import org.palladiosimulator.pcm.core.composition.AssemblyContext;
import org.palladiosimulator.pcm.core.composition.Connector;
import org.palladiosimulator.pcm.repository.BasicComponent;
import org.palladiosimulator.pcm.repository.RepositoryComponent;
import org.palladiosimulator.pcm.repository.Signature;
import org.palladiosimulator.pcm.seff.ExternalCallAction;
import org.palladiosimulator.pcm.seff.ResourceDemandingBehaviour;

import edu.kit.ipd.are.dsexplore.featurecompletions.weaver.strategy.behaviour.ControlFlowWeavingLocation;
import edu.kit.ipd.are.dsexplore.featurecompletions.weaver.strategy.behaviour.ExternalCallWeavingLocation;
import edu.kit.ipd.are.dsexplore.featurecompletions.weaver.strategy.behaviour.InternalActionWeavingLocation;
import edu.kit.ipd.are.dsexplore.featurecompletions.weaver.strategy.handler.FCCFeatureHandler;
import edu.kit.ipd.are.dsexplore.featurecompletions.weaver.strategy.manager.PcmSystemManager;

import featureSolution.impl.ControlFlowPlacementStrategyImpl;
import featureSolution.impl.ExternalCallPlacementStrategyImpl;
import featureSolution.impl.InternalActionPlacementStrategyImpl;

/**
 * Utility class for determining the join points and generating the corresponding weaving instructions for the behaviour inclusion mechanism.
 *
 * @author Maximilian Eckert (maximilian.eckert@student.kit.edu, maxieckert@web.de)
 * 
 */
public class BehaviourInclusionInstructionGenerator {

	private PcmSystemManager psm;
	private FCCFeatureHandler fccFeatureHandler;

	/**
	 * @param psm
	 * @param fccFeatureHandler
	 */
	public BehaviourInclusionInstructionGenerator(PcmSystemManager psm, FCCFeatureHandler fccFeatureHandler) {
		this.psm = psm;
		this.fccFeatureHandler = fccFeatureHandler;
	}
	
	/**
	 * Generates all control flow weaving locations of the given PlacementStrategy.
	 * 
	 * @param the given PlacementStrategy
	 * @return all internal action weaving locations
	 */
	public List<ControlFlowWeavingLocation> generateControlFlowWeavingLocations(ControlFlowPlacementStrategyImpl placementStrategy) {
		List<ControlFlowWeavingLocation> locations = new ArrayList<>();
		// find all control flows in component
		RepositoryComponent component = placementStrategy.getForAllControlFlowsIn();

		List<AssemblyContext> contexts = this.psm.getAssemblyContextsInstantiating(component);

		for (AssemblyContext assemblyContext : contexts) {
			locations.add(new ControlFlowWeavingLocation(assemblyContext));
		}
		return locations;
	}
	
	/**
	 * Generates all internal action weaving locations of the given PlacementStrategy.
	 * 
	 * @param placementStrategy the given PlacementStrategy
	 * @return all internal action weaving locations
	 */
	public List<InternalActionWeavingLocation> generateInternalActionWeavingLocations(InternalActionPlacementStrategyImpl placementStrategy) {
		List<InternalActionWeavingLocation> locations = new ArrayList<>();
		// find all internal actions in component
		RepositoryComponent component = placementStrategy.getForAllInternalActionsIn();

		List<AssemblyContext> contexts = this.psm.getAssemblyContextsInstantiating(component);

		for (AssemblyContext assemblyContext : contexts) {
			locations.add(new InternalActionWeavingLocation(assemblyContext));
		}
		return locations;
	}

	/**
	 * Generates all external call weaving locations of the given PlacementStrategy.
	 * 
	 * @param placementStrategy the given PlacementStrategy
	 * @return all external call weaving locations.
	 */
	public List<ExternalCallWeavingLocation> generateExternalCallWeavingLocations(ExternalCallPlacementStrategyImpl placementStrategy) {
		List<ExternalCallWeavingLocation> locations = new ArrayList<>();
		Signature sig = placementStrategy.getMatchingSignature();
		// find all occurences of signature sig in pcm
		List<Connector> connectors = this.psm.getConnectorsBy(connector -> connector instanceof AssemblyConnector ? true : false);

		for (Connector connector : connectors) {
			// TODO alle Komp-SEFFs nach ExternalCalls mit entsprechender Sig durchsuchen -> dann fällt aber Suche in ExternalCall SeffWeaving weg!!
			RepositoryComponent comp = ((AssemblyConnector) connector).getRequiringAssemblyContext_AssemblyConnector().getEncapsulatedComponent__AssemblyContext();
			boolean match = ((BasicComponent) comp).getServiceEffectSpecifications__BasicComponent().stream().anyMatch(seff -> ((ResourceDemandingBehaviour) seff).getSteps_Behaviour().stream()
					.anyMatch(action -> action instanceof ExternalCallAction && ((ExternalCallAction) action).getCalledService_ExternalService().getId().equals(sig.getId())));

			if (match) {
				AssemblyContext affectedContext = ((AssemblyConnector) connector).getRequiringAssemblyContext_AssemblyConnector();
				locations.add(new ExternalCallWeavingLocation(sig, affectedContext));
			}
		}
		locations = locations.stream().distinct().collect(Collectors.toList());
		return locations;
	}

}
