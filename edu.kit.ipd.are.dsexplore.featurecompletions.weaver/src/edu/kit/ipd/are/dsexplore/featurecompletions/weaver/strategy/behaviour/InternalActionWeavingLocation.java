/**
 * 
 */
package edu.kit.ipd.are.dsexplore.featurecompletions.weaver.strategy.behaviour;

import org.palladiosimulator.pcm.core.composition.AssemblyContext;

/**
 * Models an internal action weaving location; that is a component in which a fc will be added to all internal actions. 
 * 
 * @author Maximilian Eckert (maximilian.eckert@student.kit.edu, maxieckert@web.de)
 * 
 */
public class InternalActionWeavingLocation implements IWeavingLocation {

	private final AssemblyContext affectedContext; 

	/**
	 * @param affectedComponent
	 * @param affectedContext
	 */
	public InternalActionWeavingLocation(AssemblyContext affectedContext) {
		this.affectedContext = affectedContext;
	}

	/**
	 * @return the affectedContext
	 */
	public AssemblyContext getAffectedContext() {
		return affectedContext;
	}
}
