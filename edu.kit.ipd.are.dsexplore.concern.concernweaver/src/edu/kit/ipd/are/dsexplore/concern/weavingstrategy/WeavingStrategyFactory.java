package edu.kit.ipd.are.dsexplore.concern.weavingstrategy;

import java.util.HashMap;
import java.util.function.BiFunction;

import org.palladiosimulator.pcm.repository.Repository;
import org.palladiosimulator.solver.models.PCMInstance;

import TransformationModel.Transformation;
import TransformationModel.impl.AdapterTransformationImpl;
import edu.kit.ipd.are.dsexplore.concern.weavingstrategy.adapter.AdapterWeavingStrategy;

/**
 * Factory to create the corresponding weaving strategy which will be used to
 * weave a concern solution into a PCM model.
 *
 * @author scheerer
 *
 */
public class WeavingStrategyFactory {

	private static HashMap<Class<? extends Transformation>, BiFunction<PCMInstance, Repository, IWeavingStrategy>> transformationToStrategyMap = new HashMap<>();
	static {
		WeavingStrategyFactory.transformationToStrategyMap.put(AdapterTransformationImpl.class, (pcmToAdapt, pcmConcernRepository) -> new AdapterWeavingStrategy(pcmToAdapt, pcmConcernRepository));
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
	public static IWeavingStrategy createBy(Transformation transformationStrategy, PCMInstance pcmToAdapt, Repository concernSolution) {
		return WeavingStrategyFactory.transformationToStrategyMap.get(transformationStrategy.getClass()).apply(pcmToAdapt, concernSolution);
	}

}
