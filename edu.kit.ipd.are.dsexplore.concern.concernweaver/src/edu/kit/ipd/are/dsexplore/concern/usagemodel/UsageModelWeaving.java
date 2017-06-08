package edu.kit.ipd.are.dsexplore.concern.usagemodel;

import edu.kit.ipd.are.dsexplore.concern.concernweaver.WeavingInstruction;
import edu.kit.ipd.are.dsexplore.concern.concernweaver.WeavingStep;
import edu.kit.ipd.are.dsexplore.concern.exception.ConcernWeavingException;

/**
 * This class is responsible to weave the usage model view-type or more precisely 
 * to call the proper weaving strategy which performs the actual weaving.
 * @author scheerer
 *
 */
public class UsageModelWeaving extends WeavingStep {

	/**
	 * @see WeavingStep#weave(WeavingInstruction)
	 */
	@Override
	public void weave(WeavingInstruction weavingInstruction) throws ConcernWeavingException {
		
		getWeavingStrategy().weaveUsageModel(weavingInstruction);
		
	}

}
