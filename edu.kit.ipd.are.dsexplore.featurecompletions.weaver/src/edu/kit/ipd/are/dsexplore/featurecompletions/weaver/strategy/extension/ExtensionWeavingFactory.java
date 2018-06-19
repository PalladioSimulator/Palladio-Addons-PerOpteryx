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



/**
 * 
 * @author Maximilian Eckert (maxieckert@web.de)
 *
 */
public class ExtensionWeavingFactory {
	
	private static final HashMap<Class<? extends PlacementStrategy>, Function<IExtensionWeaving, AssemblyWeaving>> assemblyWeaverMap = new HashMap<>();
	static {
		ExtensionWeavingFactory.assemblyWeaverMap.put(ExternalCallPlacementStrategy.class, ExternalCallAssemblyWeaving::new);
		ExtensionWeavingFactory.assemblyWeaverMap.put(InternalActionPlacementStrategy.class, InternalActionAssemblyWeaving::new);
		ExtensionWeavingFactory.assemblyWeaverMap.put(ControlFlowPlacementStrategy.class, ControlFlowAssemblyWeaving::new);
	}

	private static final HashMap<Class<? extends PlacementStrategy>, Function<IExtensionWeaving, RepositoryWeaving>> repositoryWeaverMap = new HashMap<>();
	static {
		ExtensionWeavingFactory.repositoryWeaverMap.put(ExternalCallPlacementStrategy.class, ExternalCallRepositoryWeaving::new);
		ExtensionWeavingFactory.repositoryWeaverMap.put(InternalActionPlacementStrategy.class, InternalActionRepositoryWeaving::new);
		ExtensionWeavingFactory.repositoryWeaverMap.put(ControlFlowPlacementStrategy.class, ControlFlowRepositoryWeaving::new);
	}

	private static final HashMap<Class<? extends PlacementStrategy>, Function<IExtensionWeaving, ServiceEffectSpecificationWeaving>> seffWeaverMap = new HashMap<>();
	static {
		ExtensionWeavingFactory.seffWeaverMap.put(ExternalCallPlacementStrategy.class, ExternalCallServiceEffectSpecificationWeaving::new);
		ExtensionWeavingFactory.seffWeaverMap.put(InternalActionPlacementStrategy.class, InternalActionServiceEffectSpecificationWeaving::new);
		ExtensionWeavingFactory.seffWeaverMap.put(ControlFlowPlacementStrategy.class, ControlFlowServiceEffectSpecificationWeaving::new);
	}
	
	private static final HashMap<Class<? extends PlacementStrategy>, Function<IExtensionWeaving, UsageModelWeaving>> usageModelWeaverMap = new HashMap<>();
	static {
		ExtensionWeavingFactory.usageModelWeaverMap.put(ExternalCallPlacementStrategy.class, ExternalCallUsageModelWeaving::new);
		ExtensionWeavingFactory.usageModelWeaverMap.put(InternalActionPlacementStrategy.class, InternalActionUsageModelWeaving::new);
		ExtensionWeavingFactory.usageModelWeaverMap.put(ControlFlowPlacementStrategy.class, ControlFlowUsageModelWeaving::new);
	}

	/**
	 * Returns the proper subassemblyweaving-class based on the weaving
	 * location.
	 *
	 * @param placementStrategy
	 *            - Contains the informations that are necessary to get the
	 *            proper subweaving-class.
	 * @return the proper subweaving-class.
	 */
	public static Function<IExtensionWeaving, AssemblyWeaving> getExtensionAssemblyWeaverBy(PlacementStrategy placementStrategy) {
		return ExtensionWeavingFactory.assemblyWeaverMap.get(placementStrategy.getClass());
	}

	/**
	 * Returns the proper subrepositoryweaving-class based on the weaving
	 * location.
	 *
	 * @param placementStrategy
	 *            - Contains the informations that are necessary to get the
	 *            proper subweaving-class.
	 * @return the proper subweaving-class.
	 */
	public static Function<IExtensionWeaving, RepositoryWeaving> getExtensionRepositoryWeaverBy(PlacementStrategy placementStrategy) {
		return ExtensionWeavingFactory.repositoryWeaverMap.get(placementStrategy.getClass());
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
	
	public static Function<IExtensionWeaving, UsageModelWeaving> getExtensionUsageModelWeaverBy(PlacementStrategy placementStrategy) {
		return ExtensionWeavingFactory.usageModelWeaverMap.get(placementStrategy.getClass());
	}
}
