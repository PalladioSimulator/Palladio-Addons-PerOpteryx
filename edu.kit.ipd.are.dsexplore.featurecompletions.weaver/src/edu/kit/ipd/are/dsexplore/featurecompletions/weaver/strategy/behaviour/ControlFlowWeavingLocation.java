/**
 * 
 */
package edu.kit.ipd.are.dsexplore.featurecompletions.weaver.strategy.behaviour;

import org.palladiosimulator.pcm.core.composition.AssemblyContext;
import org.palladiosimulator.pcm.repository.RepositoryComponent;

/**
 * Models an control flow weaving location; that is a component in which a fc will be added to all control flows. 
 * 
 * @author Maximilian Eckert (maximilian.eckert@student.kit.edu, maxieckert@web.de)
 * 
 */
public class ControlFlowWeavingLocation implements IWeavingLocation {

	private final RepositoryComponent affectedComponent; //TODO Componenten oder COntext??
	
	private final AssemblyContext affectedContext; //TODO Componenten oder COntext??
	
	private AssemblyContext addedFCCAssemblyContext;

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

	/* (non-Javadoc)
	 * @see edu.kit.ipd.are.dsexplore.featurecompletions.weaver.strategy.extension.IWeavingLocation#getAddedFCCAssemblyContext()
	 */
	@Override
	public AssemblyContext getAddedFCCAssemblyContext() {
		return addedFCCAssemblyContext;
	}

	/* (non-Javadoc)
	 * @see edu.kit.ipd.are.dsexplore.featurecompletions.weaver.strategy.extension.IWeavingLocation#setAddedFCCAssemblyContext(org.palladiosimulator.pcm.core.composition.AssemblyContext)
	 */
	@Override
	public void setAddedFCCAssemblyContext(AssemblyContext assemblyContext) {
		this.addedFCCAssemblyContext = assemblyContext;
	}
}
