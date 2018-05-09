package edu.kit.ipd.are.dsexplore.featurecompletions.weaver.strategy;

import org.palladiosimulator.solver.models.PCMInstance;

import edu.kit.ipd.are.dsexplore.featurecompletions.weaver.port.FCCWeaverException;

/**
 * The weaving strategy interface contains all methods that need to be
 * implemented in order to integrate a concern solution into a given PCM model
 * according to the strategy of a class implementing this interface.
 *
 * @author scheerer
 * @author Dominik Fuchss
 *
 */
public interface IWeavingStrategy {

	/**
	 * Weaves an adapter into the PCM repository.
	 *
	 * @param weavingInstruction
	 *            - The weaving instructions contains all informations necessary
	 *            to perform a proper weaving process.
	 * @throws FCCWeaverException
	 *             - Will be thrown if there occurs any error during the weaving
	 *             process.
	 */
	void weaveRepository(WeavingInstruction weavingInstruction) throws FCCWeaverException;

	/**
	 * Weaves an adapter into the PCM system.
	 *
	 * @param weavingInstruction
	 *            - The weaving instructions contains all informations necessary
	 *            to perform a proper weaving process.
	 * @throws FCCWeaverException
	 *             - Will be thrown if there occurs any error during the weaving
	 *             process.
	 */
	void weaveAssembly(WeavingInstruction weavingInstruction) throws FCCWeaverException;

	/**
	 * Weaves an adapter into the PCM allocation.
	 *
	 * @param weavingInstruction
	 *            - The weaving instructions contains all informations necessary
	 *            to perform a proper weaving process.
	 * @throws FCCWeaverException
	 *             - Will be thrown if there occurs any error during the weaving
	 *             process.
	 */
	void weaveAllocation(WeavingInstruction weavingInstruction) throws FCCWeaverException;

	/**
	 * Weaves adapters SEFF.
	 *
	 * @param weavingInstruction
	 *            - The weaving instructions contains all informations necessary
	 *            to perform a proper weaving process.
	 * @throws FCCWeaverException
	 *             - Will be thrown if there occurs any error during the weaving
	 *             process.
	 */
	void weaveServiceEffectSpecification(WeavingInstruction weavingInstruction) throws FCCWeaverException;

	/**
	 * Weaves an adapter into the PCM usage model.
	 *
	 * @param weavingInstruction
	 *            - The weaving instructions contains all informations necessary
	 *            to perform a proper weaving process.
	 * @throws FCCWeaverException
	 *             - Will be thrown if there occurs any error during the weaving
	 *             process.
	 */
	void weaveUsageModel(WeavingInstruction weavingInstruction) throws FCCWeaverException;

	void setPCMToAdapt(PCMInstance pcmToAdapt);

}
