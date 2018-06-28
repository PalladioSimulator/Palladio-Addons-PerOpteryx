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
public interface IWeavingLocation {

	public RepositoryComponent getAffectedComponent();
	
	public AssemblyContext getAffectedContext();
	
	public void setAddedFCCAssemblyContext(AssemblyContext assemblyContext);
	public AssemblyContext getAddedFCCAssemblyContext();
}
