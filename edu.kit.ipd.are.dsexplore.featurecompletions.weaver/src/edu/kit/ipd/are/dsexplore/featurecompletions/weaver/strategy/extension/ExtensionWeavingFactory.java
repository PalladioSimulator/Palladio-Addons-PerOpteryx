package edu.kit.ipd.are.dsexplore.featurecompletions.weaver.strategy.extension;

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
 * 
 * @author Maximilian Eckert (maxieckert@web.de)
 *
 */
public class ExtensionWeavingFactory {

	private static final HashMap<Class<? extends PlacementStrategy>, Function<IExtensionWeaving, ServiceEffectSpecificationWeaving>> seffWeaverMap = new HashMap<>();
	static {
		ExtensionWeavingFactory.seffWeaverMap.put(ExternalCallPlacementStrategyImpl.class, ExternalCallServiceEffectSpecificationWeaving::new);
		ExtensionWeavingFactory.seffWeaverMap.put(InternalActionPlacementStrategyImpl.class, InternalActionServiceEffectSpecificationWeaving::new);
		ExtensionWeavingFactory.seffWeaverMap.put(ControlFlowPlacementStrategyImpl.class, ControlFlowServiceEffectSpecificationWeaving::new);
	}

	/**
	 * Returns the proper subSEFFweaving-class based on the weaving location.
	 *
	 * @param placementStrategy
	 *            - Contains the informations that are necessary to get the
	 *            proper subweaving-class.
	 * @return the proper subweaving-class.
	 */
	public static Function<IExtensionWeaving, ServiceEffectSpecificationWeaving> getExtensionSeffWeaverBy(PlacementStrategy placementStrategy) {
		return ExtensionWeavingFactory.seffWeaverMap.get(placementStrategy.getClass());
	}
	
}
