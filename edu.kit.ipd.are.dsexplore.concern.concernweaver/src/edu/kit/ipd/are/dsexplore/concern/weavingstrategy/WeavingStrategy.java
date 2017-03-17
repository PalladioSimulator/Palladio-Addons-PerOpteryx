package edu.kit.ipd.are.dsexplore.concern.weavingstrategy;

import edu.kit.ipd.are.dsexplore.concern.concernweaver.WeavingInstruction;
import edu.kit.ipd.are.dsexplore.concern.exception.ConcernWeavingException;

public abstract class WeavingStrategy {
	
	public abstract void weaveRepository(WeavingInstruction weavingInstruction) throws ConcernWeavingException;
	
	public abstract void weaveAssembly(WeavingInstruction weavingInstruction) throws ConcernWeavingException;
	
	public abstract void weaveAllocation(WeavingInstruction weavingInstruction) throws ConcernWeavingException;
	
	public abstract void weaveServiceEffectSpecification(WeavingInstruction weavingInstruction) throws ConcernWeavingException;
	
	public abstract void weaveUsageModel(WeavingInstruction weavingInstruction) throws ConcernWeavingException;
	
}
