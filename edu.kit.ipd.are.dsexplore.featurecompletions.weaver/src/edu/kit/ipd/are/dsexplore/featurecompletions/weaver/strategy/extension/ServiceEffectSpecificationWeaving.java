/**
 * 
 */
package edu.kit.ipd.are.dsexplore.featurecompletions.weaver.strategy.extension;

/**
 * @author Maximilian Eckert (maximilian.eckert@student.kit.edu, maxieckert@web.de)
 * 
 *
 */
public abstract class ServiceEffectSpecificationWeaving {

	protected final IExtensionWeaving parent;

	public ServiceEffectSpecificationWeaving(IExtensionWeaving parent) {
		this.parent = parent;
	}

	/**
	 * @param instruction
	 */
	public abstract void weave(IWeavingInstruction instruction);
}
