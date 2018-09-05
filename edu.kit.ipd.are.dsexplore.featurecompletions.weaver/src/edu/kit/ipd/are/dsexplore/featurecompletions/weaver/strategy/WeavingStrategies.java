package edu.kit.ipd.are.dsexplore.featurecompletions.weaver.strategy;

import org.palladiosimulator.pcm.repository.Repository;
import org.palladiosimulator.solver.models.PCMInstance;

import FeatureCompletionModel.FeatureCompletion;
import edu.kit.ipd.are.dsexplore.featurecompletions.weaver.strategy.adapter.AdapterStrategyExtension;
import edu.kit.ipd.are.dsexplore.featurecompletions.weaver.strategy.adapter.AdapterWeavingStrategy;
import edu.kit.ipd.are.dsexplore.featurecompletions.weaver.strategy.extension.BehaviourStrategyExtension;
import edu.kit.ipd.are.dsexplore.featurecompletions.weaver.strategy.extension.BehaviourWeavingStrategy;
import featureSolution.InclusionMechanism;
import featureSolution.impl.AdapterInclusionImpl;
import featureSolution.impl.BehaviourInclusionImpl;

/**
 * Create mapping between {@link InclusionMechanism} and
 * {@link IWeavingStrategy}.
 *
 * @author Dominik Fuchss
 *
 */
public enum WeavingStrategies {
	ADAPTER(AdapterInclusionImpl.class, AdapterWeavingStrategy::new, new AdapterStrategyExtension()), //
	BEHAVIOUR(BehaviourInclusionImpl.class, BehaviourWeavingStrategy::new, new BehaviourStrategyExtension());

	private final Class<? extends InclusionMechanism> mechanism;
	private final Constructor strategy;
	private final IStrategyExtension extension;

	private WeavingStrategies(Class<? extends InclusionMechanism> mechanism, Constructor strategy, IStrategyExtension extension) {
		this.mechanism = mechanism;
		this.strategy = strategy;
		this.extension = extension;
	}

	public IStrategyExtension getExtension() {
		return this.extension;
	}

	public Constructor getConstructor() {
		return this.strategy;
	}

	public static WeavingStrategies getStrategy(InclusionMechanism mechanism) {
		if (mechanism == null) {
			return null;
		}
		for (WeavingStrategies strategy : WeavingStrategies.values()) {
			if (strategy.mechanism.isAssignableFrom(mechanism.getClass())) {
				return strategy;
			}
		}
		return null;
	}

	@FunctionalInterface
	public interface Constructor {
		IWeavingStrategy create(PCMInstance pcmToAdapt, Repository solution, FeatureCompletion fc, InclusionMechanism im);
	}

}
