package edu.kit.ipd.are.dsexplore.featurecompletions.weaver.strategy;

import org.palladiosimulator.solver.models.PCMInstance;

import FeatureCompletionModel.FeatureCompletion;
import de.uka.ipd.sdq.dsexplore.tools.repository.MergedRepository;
import edu.kit.ipd.are.dsexplore.featurecompletions.weaver.strategy.adapter.AdapterWeavingStrategy;
import edu.kit.ipd.are.dsexplore.featurecompletions.weaver.strategy.extension.ExtensionWeavingStrategy;
import featureSolution.AdapterInclusion;
import featureSolution.ExtensionInclusion;
import featureSolution.InclusionMechanism;
import featureSolution.impl.AdapterInclusionImpl;
import featureSolution.impl.ExtensionInclusionImpl;

/**
 * Create mapping between {@link InclusionMechanism} and
 * {@link IWeavingStrategy}.
 *
 * @author Dominik Fuchss
 *
 */
public enum WeavingStrategies {
	//TODO: uses wrong class?
	ADAPTER(AdapterInclusionImpl.class, AdapterWeavingStrategy::new),
	EXTENSION(ExtensionInclusionImpl.class, ExtensionWeavingStrategy::new);

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
			if (strategy.mechanism.isAssignableFrom(mechanism.getClass())) {
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
