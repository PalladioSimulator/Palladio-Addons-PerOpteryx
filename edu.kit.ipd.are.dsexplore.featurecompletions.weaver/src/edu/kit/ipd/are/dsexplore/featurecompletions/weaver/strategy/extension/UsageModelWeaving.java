/**
 * 
 */
package edu.kit.ipd.are.dsexplore.featurecompletions.weaver.strategy.extension;

/**
 * @author Maximilian Eckert (maximilian.eckert@student.kit.edu, maxieckert@web.de)
 * 
 *
 */
public abstract class UsageModelWeaving {

	protected final IExtensionWeaving parent;

	public UsageModelWeaving(IExtensionWeaving parent) {
		this.parent = parent;
	}

	public abstract void weave(IWeavingInstruction instruction);
}
