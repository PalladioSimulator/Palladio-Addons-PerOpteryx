package edu.kit.ipd.are.dsexplore.concern.weavingstrategy;

import java.util.HashMap;
import java.util.function.BiFunction;

import org.palladiosimulator.pcm.repository.Repository;
import org.palladiosimulator.solver.models.PCMInstance;

import TransformationModel.Transformation;
import TransformationModel.impl.AdapterTransformationImpl;
import edu.kit.ipd.are.dsexplore.concern.weavingstrategy.adapter.AdapterWeavingStrategy;

/**
 * Factory to create the corresponding weaving strategy which will be used to connect
 * an ElementaryConcernComponent with a PCM-component.
 * @author scheerer
 *
 */
public class WeavingStrategyFactory {

	private static HashMap<Class<? extends Transformation>, BiFunction<PCMInstance, Repository, WeavingStrategy>> transformationToStrategyMap = new HashMap<Class<? extends Transformation>, BiFunction<PCMInstance,Repository,WeavingStrategy>>();	
	static {
		
		transformationToStrategyMap.put(AdapterTransformationImpl.class, (pcmToAdapt, pcmConcernRepository) -> new AdapterWeavingStrategy(pcmToAdapt, pcmConcernRepository));
		
	}
	
	/**
	 * Creates the corresponding weaving strategy according to the given transformation.
	 * @param weavingInstruction - Includes all weaving instructions that have to be woven.
	 * @return The weaving-strategy.
	 */
	public static WeavingStrategy createBy(Transformation transformationStrategy, PCMInstance pcmToAdapt, Repository pcmConcernRepository) {
		
		return transformationToStrategyMap.get(transformationStrategy.getClass()).apply(pcmToAdapt, pcmConcernRepository);
		
	}
	
}
