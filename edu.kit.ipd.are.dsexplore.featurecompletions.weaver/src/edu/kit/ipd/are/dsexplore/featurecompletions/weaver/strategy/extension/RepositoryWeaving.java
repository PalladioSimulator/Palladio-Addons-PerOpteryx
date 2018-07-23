/**
 * 
 */
package edu.kit.ipd.are.dsexplore.featurecompletions.weaver.strategy.extension;

import org.eclipse.emf.common.util.EList;
import org.palladiosimulator.pcm.repository.OperationProvidedRole;
import org.palladiosimulator.pcm.repository.OperationRequiredRole;
import org.palladiosimulator.pcm.repository.RequiredRole;

/**
 * @author Maximilian Eckert (maximilian.eckert@student.kit.edu, maxieckert@web.de)
 * 
 *
 */
public class RepositoryWeaving {

	protected final IExtensionWeaving parent;

	public RepositoryWeaving(IExtensionWeaving parent) {
		this.parent = parent;
	}

	/**
	 * @param instruction
	 */
	public void weave(IWeavingInstruction instruction) {
		//add required role only if not yet existing
		OperationProvidedRole providedRole = (OperationProvidedRole) instruction.getFccWithProvidedRoles().getSecond().get(0); //use Solution 0 -> TODO decide which solution
		RequiredRole requiredRole = this.parent.getMergedRepoManager().createRequiredRoleBy(providedRole);
		for (IWeavingLocation location : instruction.getWeavingLocations()) {
			EList<RequiredRole> allRequiredRoles = location.getAffectedContext().getEncapsulatedComponent__AssemblyContext().getRequiredRoles_InterfaceRequiringEntity();
			if (allRequiredRoles.stream().noneMatch(role -> ((OperationRequiredRole) role).getRequiredInterface__OperationRequiredRole().getId().equals(((OperationRequiredRole) requiredRole).getRequiredInterface__OperationRequiredRole().getId()))) {
				allRequiredRoles.add(requiredRole);
			}
		}	
	}
}
