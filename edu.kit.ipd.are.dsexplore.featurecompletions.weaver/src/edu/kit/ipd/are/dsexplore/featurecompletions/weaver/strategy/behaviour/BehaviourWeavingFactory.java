package edu.kit.ipd.are.dsexplore.featurecompletions.weaver.strategy.behaviour;

import java.util.HashMap;
import java.util.function.Function;

import org.palladiosimulator.pcm.core.composition.Connector;
import org.palladiosimulator.pcm.core.composition.impl.AssemblyConnectorImpl;
import org.palladiosimulator.pcm.core.composition.impl.ProvidedDelegationConnectorImpl;

import edu.kit.ipd.are.dsexplore.featurecompletions.weaver.strategy.WeavingLocation;
import featureSolution.ControlFlowPlacementStrategy;
import featureSolution.ExternalCallPlacementStrategy;
import featureSolution.InternalActionPlacementStrategy;
import featureSolution.PlacementStrategy;
import featureSolution.impl.ControlFlowPlacementStrategyImpl;
import featureSolution.impl.ExternalCallPlacementStrategyImpl;
import featureSolution.impl.InternalActionPlacementStrategyImpl;



/**
 * Factory class for providing the proper (SEFF) weaving implementation depending on the placement strategy.
 * 
 * @author Maximilian Eckert (maxieckert@web.de)
 *
 */
public class BehaviourWeavingFactory {

	private static final HashMap<Class<? extends PlacementStrategy>, Function<IBehaviourWeaving, ServiceEffectSpecificationWeaving>> seffWeaverMap = new HashMap<>();
	static {
		BehaviourWeavingFactory.seffWeaverMap.put(ExternalCallPlacementStrategyImpl.class, ExternalCallServiceEffectSpecificationWeaving::new);
		BehaviourWeavingFactory.seffWeaverMap.put(InternalActionPlacementStrategyImpl.class, InternalActionServiceEffectSpecificationWeaving::new);
		BehaviourWeavingFactory.seffWeaverMap.put(ControlFlowPlacementStrategyImpl.class, ControlFlowServiceEffectSpecificationWeaving::new);
	}

	/**
	 * Returns the proper SEFFweaving-class based on the weaving location.
	 *
	 * @param placementStrategy
	 *            - Contains the informations that are necessary to get the
	 *            proper subweaving-class.
	 * @return the proper subweaving-class.
	 */
	public static Function<IBehaviourWeaving, ServiceEffectSpecificationWeaving> getBehaviourSeffWeaverBy(PlacementStrategy placementStrategy) {
		return BehaviourWeavingFactory.seffWeaverMap.get(placementStrategy.getClass());
	}
	
}
