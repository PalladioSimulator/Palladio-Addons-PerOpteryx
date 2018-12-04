/**
 * 
 */
package edu.kit.ipd.are.dsexplore.featurecompletions.weaver.strategy.behaviour;

import java.util.List;

import org.eclipse.emf.common.util.EList;

import org.palladiosimulator.pcm.repository.OperationProvidedRole;
import org.palladiosimulator.pcm.repository.OperationRequiredRole;
import org.palladiosimulator.pcm.repository.OperationSignature;
import org.palladiosimulator.pcm.repository.ProvidedRole;
import org.palladiosimulator.pcm.repository.RequiredRole;

import edu.kit.ipd.are.dsexplore.featurecompletions.weaver.port.FCCModule;

/**
 * This class handles weaving of the PCM repository model. 
 * 
 * @author Maximilian Eckert (maximilian.eckert@student.kit.edu, maxieckert@web.de)
 * 
 */
public class RepositoryWeaving {

	protected final IBehaviourWeaving parent;

	public RepositoryWeaving(IBehaviourWeaving parent) {
		this.parent = parent;
	}

	/**
	 * Applies the weaving operation on the repository model. Required roles for fc calls are added as needed.
	 * 
	 * @param instruction the weaving instruction to apply.
	 */
	public void weave(IWeavingInstruction instruction) {
		FCCModule.logger.debug("Repository Behaviour Weaving");
		//add required role only if not yet existing
		List<OperationSignature> sigs = instruction.getFccWithProvidedRole().getSecond(); 
		for (OperationSignature sig : sigs) {
			RequiredRole requiredRole = this.parent.getMergedRepoManager().createRequiredRoleBy(sig);
			for (IWeavingLocation location : instruction.getWeavingLocations()) {
				EList<RequiredRole> allRequiredRoles = location.getAffectedContext().getEncapsulatedComponent__AssemblyContext().getRequiredRoles_InterfaceRequiringEntity();
				if (allRequiredRoles.stream().noneMatch(role -> ((OperationRequiredRole) role).getRequiredInterface__OperationRequiredRole().getId().equals(((OperationRequiredRole) requiredRole).getRequiredInterface__OperationRequiredRole().getId()))) {
					allRequiredRoles.add(requiredRole);
				}
			}	
		}
	}
}
