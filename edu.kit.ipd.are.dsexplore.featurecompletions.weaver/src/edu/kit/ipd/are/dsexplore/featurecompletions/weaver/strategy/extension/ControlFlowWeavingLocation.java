/**
 * 
 */
package edu.kit.ipd.are.dsexplore.featurecompletions.weaver.strategy.extension;

import org.palladiosimulator.pcm.core.composition.AssemblyContext;
import org.palladiosimulator.pcm.repository.RepositoryComponent;

/**
 * @author Maximilian Eckert (maximilian.eckert@student.kit.edu, maxieckert@web.de)
 * 
 *
 */
public class ControlFlowWeavingLocation implements IWeavingLocation {

	private final RepositoryComponent affectedComponent; //TODO Componenten oder COntext??
	
	private final AssemblyContext affectedContext; //TODO Componenten oder COntext??

	/**
	 * @param affectedComponent
	 * @param affectedContext
	 */
	public ControlFlowWeavingLocation(RepositoryComponent affectedComponent, AssemblyContext affectedContext) {
		this.affectedComponent = affectedComponent;
		this.affectedContext = affectedContext;
	}

	/**
	 * @return the affectedComponent
	 */
	public RepositoryComponent getAffectedComponent() {
		return affectedComponent;
	}

	/**
	 * @return the affectedContext
	 */
	public AssemblyContext getAffectedContext() {
		return affectedContext;
	}
}
