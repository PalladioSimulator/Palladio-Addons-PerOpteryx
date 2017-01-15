package edu.kit.ipd.are.dsexplore.concern.usagemodel;

import edu.kit.ipd.are.dsexplore.concern.concernweaver.WeavingInstruction;
import edu.kit.ipd.are.dsexplore.concern.concernweaver.WeavingStep;

public class UsageModelWeaving extends WeavingStep {

	@Override
	public void weave(WeavingInstruction weavingInstruction) {
		
		getWeavingStrategy().weaveUsageModel(weavingInstruction);
		
	}

}
