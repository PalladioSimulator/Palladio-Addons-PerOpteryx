package edu.kit.ipd.are.dsexplore.concern.concernweaver;

import org.palladiosimulator.pcm.repository.Repository;
import org.palladiosimulator.solver.models.PCMInstance;

import TransformationModel.Transformation;
import edu.kit.ipd.are.dsexplore.concern.weavingstrategy.WeavingStrategy;
import edu.kit.ipd.are.dsexplore.concern.weavingstrategy.WeavingStrategyFactory;

public abstract class WeavingStep {

	private static PCMInstance pcmToAdapt;
	private static Repository pcmConcernRepository;
	private static WeavingStrategy weavingStrategy;
	
	public static void setGlobalSettings(PCMInstance newPcmToAdapt, Repository newPcmConcernRepository) {
		
		pcmToAdapt = newPcmToAdapt;
		pcmConcernRepository = newPcmConcernRepository;
		
	}
	
	public static Repository getPCMConcernRepository() {
		
		return pcmConcernRepository;
		
	}
	
	public static void setWeavingStrategy(Transformation transformationStrategy) {
		
		weavingStrategy = WeavingStrategyFactory.createBy(transformationStrategy, pcmToAdapt, pcmConcernRepository);
		
	}
	
	protected WeavingStrategy getWeavingStrategy() {
		
		return weavingStrategy;
		
	}
	
	/**
	 * An implementer of this method performs one weaving-step which changes a specific view of the PCM model.
	 * @param pcmToAdapt - The PCM model a concern has to be woven to.
	 * @param weavingInstruction - Contains instructions which are required by the weaving-process.
	 */
	public abstract void weave(WeavingInstruction weavingInstruction);
	
}
