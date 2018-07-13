package edu.kit.ipd.are.dsexplore.concern.weavingstrategy.extension;

import edu.kit.ipd.are.dsexplore.concern.concernweaver.WeavingInstruction;
import edu.kit.ipd.are.dsexplore.concern.exception.ConcernWeavingException;
import edu.kit.ipd.are.dsexplore.concern.weavingstrategy.adapter.AdapterWeaving;

/**
 * Taken from AdapterWeavingStrategy //TODO adopt for Extension Mechanism
 * @author Maximilian Eckert (maxieckert@web.de)
 *
 */
public abstract class ExtensionAssemblyWeaving extends ExtensionWeaving {

	/**
	 * @see ExtensionWeaving#weave(WeavingInstruction)
	 */
	@Override
	public void weave(WeavingInstruction weavingInstruction) throws ConcernWeavingException {
		//TODO
	}
}
