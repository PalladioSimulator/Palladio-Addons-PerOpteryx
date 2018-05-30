package edu.kit.ipd.are.dsexplore.concern.weavingstrategy.adapter;

import org.palladiosimulator.solver.models.PCMInstance;

import de.uka.ipd.sdq.dsexplore.tools.repository.MergedRepository;
import edu.kit.ipd.are.dsexplore.concern.concernweaver.WeavingInstruction;
import edu.kit.ipd.are.dsexplore.concern.exception.ConcernWeavingException;
import edu.kit.ipd.are.dsexplore.concern.weavingstrategy.IWeavingStrategy;

/**
 * Thsi class implements the adapter weaving strategy.
 *
 * @author scheerer
 *
 */
public class AdapterWeavingStrategy implements IWeavingStrategy {

	/**
	 * The constructor.
	 *
	 * @param pcmToAdapt
	 *            - Represents the PCm model that is going to be woven.
	 * @param concernSolution
	 *            - Represents the concern solution which is going to extend a
	 *            given PCM model.
	 */
	public AdapterWeavingStrategy(PCMInstance pcmToAdapt, MergedRepository mergedRepo) {
		AdapterWeaving.setManagersWith(pcmToAdapt, mergedRepo);
	}

	/**
	 * @see IWeavingStrategy#weaveRepository(WeavingInstruction)
	 */
	@Override
	public void weaveRepository(WeavingInstruction weavingInstruction) throws ConcernWeavingException {
		AdapterWeavingFactory.getAdapterRepositoryWeaverBy(weavingInstruction.getWeavingLocation()).weave(weavingInstruction);
	}

	/**
	 * @see IWeavingStrategy#weaveAssembly(WeavingInstruction)
	 */
	@Override
	public void weaveAssembly(WeavingInstruction weavingInstruction) throws ConcernWeavingException {
		AdapterWeavingFactory.getAdapterAssemblyWeaverBy(weavingInstruction.getWeavingLocation()).weave(weavingInstruction);
	}

	/**
	 * @see IWeavingStrategy#weaveAllocation(WeavingInstruction)
	 */
	@Override
	public void weaveAllocation(WeavingInstruction weavingInstruction) throws ConcernWeavingException {
		new AdapterAllocationWeaving().weave(weavingInstruction);
	}

	/**
	 * @see IWeavingStrategy#weaveServiceEffectSpecification(WeavingInstruction)
	 */
	@Override
	public void weaveServiceEffectSpecification(WeavingInstruction weavingInstruction) throws ConcernWeavingException {
		AdapterWeavingFactory.getAdapterSeffWeaverBy(weavingInstruction.getWeavingLocation()).weave(weavingInstruction);
	}

	/**
	 * @see IWeavingStrategy#weaveUsageModel(WeavingInstruction)
	 */
	@Override
	public void weaveUsageModel(WeavingInstruction weavingInstruction) throws ConcernWeavingException {
		new AdapterUsageModelWeaving().weave(weavingInstruction);
	}

}
