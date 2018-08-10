/**
 * 
 */
package edu.kit.ipd.are.dsexplore.featurecompletions.weaver.strategy.extension;

import org.eclipse.emf.common.util.EList;
import org.palladiosimulator.pcm.repository.OperationProvidedRole;
import org.palladiosimulator.pcm.repository.OperationRequiredRole;
import org.palladiosimulator.pcm.repository.RequiredRole;

import edu.kit.ipd.are.dsexplore.featurecompletions.weaver.port.FCCModule;

/**
 * This class handles weaving of the PCM repository model. 
 * 
 * @author Maximilian Eckert (maximilian.eckert@student.kit.edu, maxieckert@web.de)
 * 
 */
public class RepositoryWeaving {

	protected final IExtensionWeaving parent;

	public RepositoryWeaving(IExtensionWeaving parent) {
		this.parent = parent;
	}

	/**
	 * Applies the weaving operation on the repository model. Required roles for fc calls are added as needed.
	 * 
	 * @param instruction the weaving instruction to apply.
	 */
	public void weave(IWeavingInstruction instruction) {
		FCCModule.logger.debug("Repository Extension Weaving");
		//add required role only if not yet existing
		OperationProvidedRole providedRole = (OperationProvidedRole) instruction.getFccWithProvidedRole().getSecond(); 
		RequiredRole requiredRole = this.parent.getMergedRepoManager().createRequiredRoleBy(providedRole);
		for (IWeavingLocation location : instruction.getWeavingLocations()) {
			EList<RequiredRole> allRequiredRoles = location.getAffectedContext().getEncapsulatedComponent__AssemblyContext().getRequiredRoles_InterfaceRequiringEntity();
			if (allRequiredRoles.stream().noneMatch(role -> ((OperationRequiredRole) role).getRequiredInterface__OperationRequiredRole().getId().equals(((OperationRequiredRole) requiredRole).getRequiredInterface__OperationRequiredRole().getId()))) {
				allRequiredRoles.add(requiredRole);
			}
		}	
	}
}
