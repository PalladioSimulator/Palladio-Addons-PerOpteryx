package edu.kit.ipd.are.dsexplore.concern.weavingstrategy.extension;

import org.palladiosimulator.solver.models.PCMInstance;

import de.uka.ipd.sdq.dsexplore.tools.repository.MergedRepository;
import edu.kit.ipd.are.dsexplore.concern.concernweaver.WeavingInstruction;
import edu.kit.ipd.are.dsexplore.concern.exception.ConcernWeavingException;
import edu.kit.ipd.are.dsexplore.concern.weavingstrategy.IWeavingStrategy;
import edu.kit.ipd.are.dsexplore.concern.weavingstrategy.adapter.AdapterAllocationWeaving;
import edu.kit.ipd.are.dsexplore.concern.weavingstrategy.adapter.AdapterUsageModelWeaving;
import edu.kit.ipd.are.dsexplore.concern.weavingstrategy.adapter.AdapterWeaving;
import edu.kit.ipd.are.dsexplore.concern.weavingstrategy.adapter.AdapterWeavingFactory;

/**
 * Taken from AdapterWeavingStrategy //TODO adopt for Extension Mechanism
 * @author Maximilian Eckert (maxieckert@web.de)
 *
 */
public class ExtensionWeavingStrategy implements IWeavingStrategy {
	
	/**
	 * The constructor.
	 *
	 * @param pcmToAdapt
	 *            - Represents the PCm model that is going to be woven.
	 * @param concernSolution
	 *            - Represents the concern solution which is going to extend a
	 *            given PCM model.
	 */
	public ExtensionWeavingStrategy(PCMInstance pcmToAdapt, MergedRepository mergedRepo) {
		System.out.println("-------------- ExtensionWeavingStrategy called ------------------");
		
		ExtensionWeaving.setManagersWith(pcmToAdapt, mergedRepo);
	}

	@Override
	public void weaveRepository(WeavingInstruction weavingInstruction) throws ConcernWeavingException {
		ExtensionWeavingFactory.getExtensionRepositoryWeaverBy(weavingInstruction.getWeavingLocation()).weave(weavingInstruction);

	}

	@Override
	public void weaveAssembly(WeavingInstruction weavingInstruction) throws ConcernWeavingException {
		ExtensionWeavingFactory.getExtensionAssemblyWeaverBy(weavingInstruction.getWeavingLocation()).weave(weavingInstruction);

	}

	@Override
	public void weaveAllocation(WeavingInstruction weavingInstruction) throws ConcernWeavingException {
		new ExtensionAllocationWeaving().weave(weavingInstruction);

	}

	@Override
	public void weaveServiceEffectSpecification(WeavingInstruction weavingInstruction) throws ConcernWeavingException {
		ExtensionWeavingFactory.getExtensionSeffWeaverBy(weavingInstruction.getWeavingLocation()).weave(weavingInstruction);

	}

	@Override
	public void weaveUsageModel(WeavingInstruction weavingInstruction) throws ConcernWeavingException {
		new ExtensionUsageModelWeaving().weave(weavingInstruction);

	}

}
