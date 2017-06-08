package edu.kit.ipd.are.dsexplore.concern.allocation;

import edu.kit.ipd.are.dsexplore.concern.concernweaver.WeavingInstruction;
import edu.kit.ipd.are.dsexplore.concern.concernweaver.WeavingStep;
import edu.kit.ipd.are.dsexplore.concern.exception.ConcernWeavingException;

/**
 * This class is responsible to weave the allocation view-type or more precisely 
 * to call the proper weaving strategy which performs the actual weaving.
 * @author scheerer
 *
 */
public class AllocationWeaver extends WeavingStep {
	
	/**
	 * @see WeavingStep#weave(WeavingInstruction)
	 */
	@Override
	public void weave(WeavingInstruction weavingInstruction) throws ConcernWeavingException {
	
		getWeavingStrategy().weaveAllocation(weavingInstruction);
		
	}

}
