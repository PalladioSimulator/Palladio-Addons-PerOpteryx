package edu.kit.ipd.are.dsexplore.concern.allocation;

import edu.kit.ipd.are.dsexplore.concern.concernweaver.WeavingInstruction;
import edu.kit.ipd.are.dsexplore.concern.concernweaver.WeavingStep;

public class AllocationWeaver extends WeavingStep {
	
	@Override
	public void weave(WeavingInstruction weavingInstruction) {
	
		getWeavingStrategy().weaveAllocation(weavingInstruction);
		
	}

}
