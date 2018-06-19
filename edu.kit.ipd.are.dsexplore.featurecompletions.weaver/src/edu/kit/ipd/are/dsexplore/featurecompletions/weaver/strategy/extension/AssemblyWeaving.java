/**
 * 
 */
package edu.kit.ipd.are.dsexplore.featurecompletions.weaver.strategy.extension;

import edu.kit.ipd.are.dsexplore.featurecompletions.weaver.strategy.adapter.IAdapterWeaving;

/**
 * @author Maximilian Eckert (maximilian.eckert@student.kit.edu, maxieckert@web.de)
 * 
 *
 */
public class AssemblyWeaving {
	protected final IExtensionWeaving parent;

	public AssemblyWeaving(IExtensionWeaving parent) {
		this.parent = parent;
	}

	/**
	 * @param instruction
	 */
	public void weave(IWeavingInstruction instruction) {
		// TODO Auto-generated method stub
		
	}
}
