package edu.kit.ipd.are.dsexplore.concern.seff;

import edu.kit.ipd.are.dsexplore.concern.concernweaver.WeavingInstruction;
import edu.kit.ipd.are.dsexplore.concern.concernweaver.WeavingStep;

public class ServiceEffectSpecificationWeaving extends WeavingStep {
	
	@Override
	public void weave(WeavingInstruction weavingInstruction) {
	
		getWeavingStrategy().weaveServiceEffectSpecification(weavingInstruction);
		
	}
	
}
