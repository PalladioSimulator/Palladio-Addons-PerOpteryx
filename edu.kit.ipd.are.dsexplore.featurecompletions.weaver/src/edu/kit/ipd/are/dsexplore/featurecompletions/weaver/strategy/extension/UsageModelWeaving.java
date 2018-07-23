/**
 * 
 */
package edu.kit.ipd.are.dsexplore.featurecompletions.weaver.strategy.extension;

/**
 * @author Maximilian Eckert (maximilian.eckert@student.kit.edu, maxieckert@web.de)
 * 
 *
 */
public class UsageModelWeaving {

	protected final IExtensionWeaving parent;

	public UsageModelWeaving(IExtensionWeaving parent) {
		this.parent = parent;
	}

	public void weave(IWeavingInstruction instruction) {
		//nothing to do here in this strategy
		//but good to have it in case of future modifications
	}
}
