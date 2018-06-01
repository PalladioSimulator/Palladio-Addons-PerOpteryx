package edu.kit.ipd.are.dsexplore.featurecompletions.weaver.strategy;

import org.palladiosimulator.solver.models.PCMInstance;

import FeatureCompletionModel.FeatureCompletion;
import de.uka.ipd.sdq.dsexplore.tools.repository.MergedRepository;
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

	ADAPTER(AdapterInclusion.class, AdapterWeavingStrategy::new);

	private final Class<? extends InclusionMechanism> mechanism;
	private final Constructor strategy;

	private WeavingStrategies(Class<? extends InclusionMechanism> mechanism, Constructor strategy) {
		this.mechanism = mechanism;
		this.strategy = strategy;
	}

	public static Constructor getStrategy(InclusionMechanism mechanism) {
		if (mechanism == null) {
			return null;
		}
		for (WeavingStrategies strategy : WeavingStrategies.values()) {
			if (strategy.mechanism == mechanism.getClass()) {
				return strategy.strategy;
			}
		}
		return null;
	}

	@FunctionalInterface
	public interface Constructor {
		IWeavingStrategy create(PCMInstance pcmToAdapt, MergedRepository mergedRepo, FeatureCompletion fc, InclusionMechanism im);
	}
}
