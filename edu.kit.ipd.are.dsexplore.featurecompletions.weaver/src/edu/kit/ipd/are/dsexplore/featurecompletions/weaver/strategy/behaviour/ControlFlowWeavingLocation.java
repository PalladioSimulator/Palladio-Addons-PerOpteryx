/**
 * 
 */
package edu.kit.ipd.are.dsexplore.featurecompletions.weaver.strategy.behaviour;

import org.palladiosimulator.pcm.core.composition.AssemblyContext;

/**
 * Models an control flow weaving location; that is a component in which a FC will be added to all control flows. 
 * 
 * @author Maximilian Eckert (maximilian.eckert@student.kit.edu, maxieckert@web.de)
 * 
 */
public class ControlFlowWeavingLocation implements IWeavingLocation {
	
	private final AssemblyContext affectedContext;

	/**
	 * @param affectedComponent
	 * @param affectedContext
	 */
	public ControlFlowWeavingLocation(AssemblyContext affectedContext) {
		this.affectedContext = affectedContext;
	}

	/**
	 * @return the affectedContext
	 */
	public AssemblyContext getAffectedContext() {
		return affectedContext;
	}
}
