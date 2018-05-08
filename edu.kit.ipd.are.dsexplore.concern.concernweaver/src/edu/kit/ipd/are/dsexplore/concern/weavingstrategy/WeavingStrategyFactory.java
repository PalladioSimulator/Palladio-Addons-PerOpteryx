package edu.kit.ipd.are.dsexplore.concern.weavingstrategy;

import java.util.HashMap;
import java.util.function.BiFunction;

import org.palladiosimulator.solver.models.PCMInstance;

import de.uka.ipd.sdq.dsexplore.tools.repository.MergedRepository;
import edu.kit.ipd.are.dsexplore.concern.weavingstrategy.adapter.AdapterWeavingStrategy;
import edu.kit.ipd.are.dsexplore.concern.weavingstrategy.extension.ExtensionWeavingStrategy;
import featureSolution.AdapterInclusion;
import featureSolution.ExtensionInclusion;
import featureSolution.InclusionMechanism;

/**
 * Factory to create the corresponding weaving strategy which will be used to
 * weave a concern solution into a PCM model.
 *
 * @author scheerer
 *
 */
public class WeavingStrategyFactory {

	private static HashMap<Class<? extends InclusionMechanism>, BiFunction<PCMInstance, MergedRepository, IWeavingStrategy>> transformationToStrategyMap = new HashMap<>();
	static {
		WeavingStrategyFactory.transformationToStrategyMap.put(AdapterInclusion.class, (pcmToAdapt, pcmConcernRepository) -> new AdapterWeavingStrategy(pcmToAdapt, pcmConcernRepository));
		WeavingStrategyFactory.transformationToStrategyMap.put(ExtensionInclusion.class, (pcmToAdapt, pcmConcernRepository) -> new ExtensionWeavingStrategy(pcmToAdapt, pcmConcernRepository));
	}

	/**
	 * Creates the corresponding weaving strategy according to the given
	 * transformation strategy.
	 *
	 * @param transformationStrategy
	 *            - Contains the informations about the used transformation
	 *            strategy.
	 * @param pcmToAdapt
	 *            - The PCM model that is going to be woven.
	 * @param concernSolution
	 *            - The concern solution which is going to extend the PCM model.
	 * @return
	 */
	public static IWeavingStrategy createBy(InclusionMechanism inclusionMechanism, PCMInstance pcmToAdapt, MergedRepository mergedRepo) {
		return WeavingStrategyFactory.transformationToStrategyMap.get(inclusionMechanism.getClass()).apply(pcmToAdapt, mergedRepo);
	}

}
