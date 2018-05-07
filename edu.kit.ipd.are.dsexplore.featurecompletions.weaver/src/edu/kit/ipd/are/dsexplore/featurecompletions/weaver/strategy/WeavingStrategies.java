package edu.kit.ipd.are.dsexplore.featurecompletions.weaver.strategy;

import edu.kit.ipd.are.dsexplore.featurecompletions.weaver.strategy.adapter.AdapterWeavingStrategy;
import featureSolution.AdapterInclusion;
import featureSolution.InclusionMechanism;

/**
 * Create mapping between {@link InclusionMechanism} and
 * {@link IWeavingStrategy}.
 * 
 * @author Dominik Fuchss
 *
 */
public enum WeavingStrategies {

	ADAPTER(AdapterInclusion.class, new AdapterWeavingStrategy());

	private final Class<? extends InclusionMechanism> mechanism;
	private final IWeavingStrategy strategy;

	private WeavingStrategies(Class<? extends InclusionMechanism> mechanism, IWeavingStrategy strategy) {
		this.mechanism = mechanism;
		this.strategy = strategy;
	}

	public static IWeavingStrategy getStrategy(Class<? extends InclusionMechanism> mechanism) {
		for (WeavingStrategies strategy : WeavingStrategies.values()) {
			if (strategy.mechanism == mechanism) {
				return strategy.strategy;
			}
		}
		return null;
	}
}
