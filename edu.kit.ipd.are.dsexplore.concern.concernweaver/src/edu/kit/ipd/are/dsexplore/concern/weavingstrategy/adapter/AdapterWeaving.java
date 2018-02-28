package edu.kit.ipd.are.dsexplore.concern.weavingstrategy.adapter;

import org.palladiosimulator.pcm.core.composition.AssemblyContext;
import org.palladiosimulator.pcm.repository.Repository;
import org.palladiosimulator.pcm.repository.RepositoryComponent;
import org.palladiosimulator.solver.models.PCMInstance;

import edu.kit.ipd.are.dsexplore.concern.concernweaver.WeavingInstruction;
import edu.kit.ipd.are.dsexplore.concern.exception.ConcernWeavingException;
import edu.kit.ipd.are.dsexplore.concern.manager.ConcernSolutionManager;
import edu.kit.ipd.are.dsexplore.concern.manager.PcmAllocationManager;
import edu.kit.ipd.are.dsexplore.concern.manager.PcmSystemManager;
import edu.kit.ipd.are.dsexplore.concern.manager.PcmUsageModelManager;

/**
 * This class represents the actual implementation of a weaving step in the
 * context of the adapter transformation strategy.
 *
 * @author scheerer
 *
 */
public abstract class AdapterWeaving {

	protected static ConcernSolutionManager concernRepositoryManager;
	protected static PcmAllocationManager pcmAllocationManager;
	protected static PcmSystemManager pcmSystemManager;
	protected static PcmUsageModelManager pcmUsageModelManager;

	protected static RepositoryComponent adapter;
	protected static AssemblyContext adapterAssemblyContext;

	/**
	 * Initializes all managers which are needed during the weaving process.
	 *
	 * @param pcmToAdapt
	 *            - The PCM model which is going to be woven.
	 * @param concernSolution
	 *            - The concern solution which will extend the PCM model.
	 */
	public static void setManagersWith(PCMInstance pcmToAdapt, Repository mergedRepo) {
		AdapterWeaving.concernRepositoryManager = ConcernSolutionManager.getInstanceBy(mergedRepo);
		AdapterWeaving.pcmAllocationManager = PcmAllocationManager.getInstanceBy(pcmToAdapt.getAllocation());
		AdapterWeaving.pcmSystemManager = PcmSystemManager.getInstanceBy(pcmToAdapt.getSystem());
		AdapterWeaving.pcmUsageModelManager = PcmUsageModelManager.getInstanceBy(pcmToAdapt.getUsageModel());
	}

	protected static void setAdapterComponent(RepositoryComponent adapterComp) {
		AdapterWeaving.adapter = adapterComp;
	}

	protected static void setAdapterAssemblyContext(AssemblyContext adapterAssCont) {
		AdapterWeaving.adapterAssemblyContext = adapterAssCont;
	}

	/**
	 * This method needs to be implemented by a class which realizes the weaving
	 * process of a specific view-type in the context of the adapter
	 * transformation strategy.
	 *
	 * @param weavingInstruction
	 *            - Contains all informations which are important for the
	 *            weaving process.
	 * @throws ConcernWeavingException
	 *             - Will be thrown if there occurs any weaving error.
	 */
	public abstract void weave(WeavingInstruction weavingInstruction) throws ConcernWeavingException;

}
