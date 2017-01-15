package edu.kit.ipd.are.dsexplore.concern.assembly;

import edu.kit.ipd.are.dsexplore.concern.concernweaver.WeavingInstruction;
import edu.kit.ipd.are.dsexplore.concern.concernweaver.WeavingStep;

public class AssemblyWeaving extends WeavingStep {
	
	@Override
	public void weave(WeavingInstruction weavingInstruction) {

		getWeavingStrategy().weaveAssembly(weavingInstruction);
		
	}

}
