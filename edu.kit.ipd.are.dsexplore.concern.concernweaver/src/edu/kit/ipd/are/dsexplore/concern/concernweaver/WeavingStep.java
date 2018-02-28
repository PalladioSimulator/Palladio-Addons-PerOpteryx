package edu.kit.ipd.are.dsexplore.concern.concernweaver;

import org.palladiosimulator.pcm.repository.Repository;
import org.palladiosimulator.solver.models.PCMInstance;

import edu.kit.ipd.are.dsexplore.concern.exception.ConcernWeavingException;
import edu.kit.ipd.are.dsexplore.concern.weavingstrategy.IWeavingStrategy;
import edu.kit.ipd.are.dsexplore.concern.weavingstrategy.WeavingStrategyFactory;
import featureSolution.InclusionMechanism;

/**
 * This abstract class needs to be extended by each class which implements the
 * weaving process of a specific Palladio view-type.
 *
 * @author scheerer
 *
 */
public abstract class WeavingStep {

	private static PCMInstance pcmToAdapt;
	private static Repository mergedRepo;
	private static IWeavingStrategy weavingStrategy;

	/**
	 * Sets the member variables which are used by each implemented weaving
	 * step.
	 *
	 * @param newPcmToAdapt
	 *            - The PCM model that is going to be woven.
	 * @param newConcernSolution
	 *            - The repository containing the concern solution.
	 */
	public static void setGlobalSettings(PCMInstance newPcmToAdapt, Repository mergedRepo) {
		WeavingStep.pcmToAdapt = newPcmToAdapt;
		WeavingStep.mergedRepo = mergedRepo;
	}

	/**
	 * The getter-method for the concern solution.
	 *
	 * @return the concern solution.
	 */
	public static Repository getFCCSolutionMergedRepository() {
		return WeavingStep.mergedRepo;
	}

	/**
	 * Sets the weaving strategy which can be derived by a transformation
	 * strategy.
	 *
	 * @param transformationStrategy
	 *            - The transformation strategy which represents the integration
	 *            mechanism.
	 */
	public static void setWeavingStrategy(InclusionMechanism inclusionMechanism) {
		WeavingStep.weavingStrategy = WeavingStrategyFactory.createBy(inclusionMechanism, WeavingStep.pcmToAdapt,
				WeavingStep.mergedRepo);
	}

	/**
	 * The getter-method for the weaving strategy.
	 *
	 * @return the weaving strategy.
	 */
	protected IWeavingStrategy getWeavingStrategy() {
		return WeavingStep.weavingStrategy;
	}

	/**
	 * A class which implements this method performs one weaving step which
	 * changes a specific view-type of the PCM model.
	 *
	 * @param weavingInstruction
	 *            - Contains instructions which are required by the
	 *            weaving-process.
	 * @throws ConcernWeavingException
	 *             - Will be thrown if there occur any error during the weaving
	 *             process.
	 */
	public abstract void weave(WeavingInstruction weavingInstruction) throws ConcernWeavingException;

}
