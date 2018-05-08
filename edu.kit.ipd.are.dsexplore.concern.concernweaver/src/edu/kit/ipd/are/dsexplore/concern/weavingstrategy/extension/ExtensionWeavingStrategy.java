package edu.kit.ipd.are.dsexplore.concern.weavingstrategy.extension;

import org.palladiosimulator.solver.models.PCMInstance;

import de.uka.ipd.sdq.dsexplore.tools.repository.MergedRepository;
import edu.kit.ipd.are.dsexplore.concern.concernweaver.WeavingInstruction;
import edu.kit.ipd.are.dsexplore.concern.exception.ConcernWeavingException;
import edu.kit.ipd.are.dsexplore.concern.weavingstrategy.IWeavingStrategy;
import edu.kit.ipd.are.dsexplore.concern.weavingstrategy.adapter.AdapterWeaving;

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
		
		//AdapterWeaving.setManagersWith(pcmToAdapt, mergedRepo);
	}

	@Override
	public void weaveRepository(WeavingInstruction weavingInstruction) throws ConcernWeavingException {
		// TODO Auto-generated method stub

	}

	@Override
	public void weaveAssembly(WeavingInstruction weavingInstruction) throws ConcernWeavingException {
		// TODO Auto-generated method stub

	}

	@Override
	public void weaveAllocation(WeavingInstruction weavingInstruction) throws ConcernWeavingException {
		// TODO Auto-generated method stub

	}

	@Override
	public void weaveServiceEffectSpecification(WeavingInstruction weavingInstruction) throws ConcernWeavingException {
		// TODO Auto-generated method stub

	}

	@Override
	public void weaveUsageModel(WeavingInstruction weavingInstruction) throws ConcernWeavingException {
		// TODO Auto-generated method stub

	}

}
