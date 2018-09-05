/**
 * 
 */
package edu.kit.ipd.are.dsexplore.featurecompletions.weaver.strategy.extension;

/**
 * This class handles weaving of the PCM usage model. 
 * 
 * @author Maximilian Eckert (maximilian.eckert@student.kit.edu, maxieckert@web.de)
 * 
 */
public class UsageModelWeaving {

	protected final IBehaviourWeaving parent;

	public UsageModelWeaving(IBehaviourWeaving parent) {
		this.parent = parent;
	}

	/**
	 * As the Behaviour mechanism operates on intra component behaviour, there is nothing to do here.
	 * 
	 * @param instruction
	 */
	public void weave(IWeavingInstruction instruction) {
		//nothing to do here in this strategy
		//but good to have it in case of future modifications
	}
}
