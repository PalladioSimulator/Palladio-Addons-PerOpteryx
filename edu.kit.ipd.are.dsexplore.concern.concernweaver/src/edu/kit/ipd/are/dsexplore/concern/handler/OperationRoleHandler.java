package edu.kit.ipd.are.dsexplore.concern.handler;

import org.palladiosimulator.pcm.repository.OperationProvidedRole;
import org.palladiosimulator.pcm.repository.OperationRequiredRole;
import org.palladiosimulator.pcm.repository.ProvidedRole;
import org.palladiosimulator.pcm.repository.RequiredRole;
import org.palladiosimulator.pcm.repository.Role;

import edu.kit.ipd.are.dsexplore.concern.manager.ConcernSolutionManager;
import edu.kit.ipd.are.dsexplore.concern.util.ConcernWeaverUtil;

public class OperationRoleHandler extends RoleHandler {

	public OperationRoleHandler(ConcernSolutionManager concernRepositoryManager) {
		
		super(concernRepositoryManager);
		
	}

	@Override
	protected boolean areConnected(Role firstRole, Role secondRole) {
		
		if (firstRole instanceof OperationRequiredRole) {
			
			return secondRole instanceof OperationProvidedRole ? hasSameInterface((OperationRequiredRole) firstRole, (OperationProvidedRole) secondRole) : false;
			
		}
		
		if (firstRole instanceof OperationProvidedRole) {
			
			return secondRole instanceof OperationRequiredRole ? hasSameInterface((OperationRequiredRole) secondRole, (OperationProvidedRole) firstRole) : false;
			
		}
		
		return false;
				
	}

	private boolean hasSameInterface(OperationRequiredRole requiredRole, OperationProvidedRole providedRole) {

		return ConcernWeaverUtil.areEqual(providedRole.getProvidedInterface__OperationProvidedRole(), 
										  requiredRole.getRequiredInterface__OperationRequiredRole());
		
	}
	
	@Override
	public RequiredRole createRequiredRoleOf(ProvidedRole providedRole) {
		
		return this.concernRepositoryManager.createRequiredRoleBy((OperationProvidedRole) providedRole);
		
	}

	@Override
	public ProvidedRole createRequiredRoleOf(RequiredRole requiredRole) {
		
		return this.concernRepositoryManager.createProvidedRoleBy((OperationRequiredRole) requiredRole);
		
	}

}
