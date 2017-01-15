package edu.kit.ipd.are.dsexplore.concern.weavingstrategy;

import edu.kit.ipd.are.dsexplore.concern.concernweaver.WeavingInstruction;

public abstract class WeavingStrategy {
	
	public abstract void weaveRepository(WeavingInstruction weavingInstruction);
	
	public abstract void weaveAssembly(WeavingInstruction weavingInstruction);
	
	public abstract void weaveAllocation(WeavingInstruction weavingInstruction);
	
	public abstract void weaveServiceEffectSpecification(WeavingInstruction weavingInstruction);
	
	public abstract void weaveUsageModel(WeavingInstruction weavingInstruction);
	
}
