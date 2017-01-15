package edu.kit.ipd.are.dsexplore.concern.weavingstrategy.adapter;

import org.palladiosimulator.pcm.repository.Repository;
import org.palladiosimulator.solver.models.PCMInstance;

import edu.kit.ipd.are.dsexplore.concern.concernweaver.WeavingInstruction;
import edu.kit.ipd.are.dsexplore.concern.weavingstrategy.WeavingStrategy;

public class AdapterWeavingStrategy extends WeavingStrategy {
	
	public AdapterWeavingStrategy(PCMInstance pcmToAdapt, Repository pcmConcernRepository) {
		
		AdapterWeaving.setManagersWith(pcmToAdapt, pcmConcernRepository);
		
	}
	
	@Override
	public void weaveRepository(WeavingInstruction weavingInstruction) {
		
		AdapterWeavingFactory.getAdapterRepositoryWeaverBy(weavingInstruction.getWeavingLocation()).weave(weavingInstruction);
		
	}

	@Override
	public void weaveAssembly(WeavingInstruction weavingInstruction) {
		
		AdapterWeavingFactory.getAdapterAssemblyWeaverBy(weavingInstruction.getWeavingLocation()).weave(weavingInstruction);
		
	}

	@Override
	public void weaveAllocation(WeavingInstruction weavingInstruction) {
		
		new AdapterAllocationWeaving().weave(weavingInstruction);
		
	}

	@Override
	public void weaveServiceEffectSpecification(WeavingInstruction weavingInstruction) {
		
		AdapterWeavingFactory.getAdapterSeffWeaverBy(weavingInstruction.getWeavingLocation()).weave(weavingInstruction);
		
	}

	@Override
	public void weaveUsageModel(WeavingInstruction weavingInstruction) {
		
		new AdapterUsageModelWeaving().weave(weavingInstruction);
		
	}
	
}
