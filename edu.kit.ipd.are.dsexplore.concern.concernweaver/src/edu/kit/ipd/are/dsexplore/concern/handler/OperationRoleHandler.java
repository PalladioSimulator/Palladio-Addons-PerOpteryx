package edu.kit.ipd.are.dsexplore.concern.handler;

import org.palladiosimulator.pcm.repository.OperationProvidedRole;
import org.palladiosimulator.pcm.repository.OperationRequiredRole;
import org.palladiosimulator.pcm.repository.ProvidedRole;
import org.palladiosimulator.pcm.repository.RequiredRole;
import org.palladiosimulator.pcm.repository.Role;

import edu.kit.ipd.are.dsexplore.concern.manager.ConcernRepositoryManager;

public class OperationRoleHandler extends RoleHandler {

	public OperationRoleHandler(ConcernRepositoryManager concernRepositoryManager) {
		
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
		
		String providedInterfaceId = providedRole.getProvidedInterface__OperationProvidedRole().getId();
		String requiredInterfaceId = requiredRole.getRequiredInterface__OperationRequiredRole().getId();
		
		return providedInterfaceId.equals(requiredInterfaceId);
		
	}

//	@Override
//	public Optional<RequiredRole> getRequiredOpponentOf(ProvidedRole providedRoleToHandle, List<RequiredRole> requiredRolesToExplore) {
//		
//		return filterRolesInstanceOf(OperationRequiredRole.class, requiredRolesToExplore).filter(eachOperationRequiredRole -> areConnected((OperationRequiredRole) eachOperationRequiredRole, 
//																																		   (OperationProvidedRole) providedRoleToHandle))
//				  							  											 .findFirst();
//		
//	}
//
//	@Override
//	public Optional<ProvidedRole> getProvidedOpponentOf(RequiredRole requiredRoleToHandle, List<ProvidedRole> providedRolesToExplore) {
//		
//		return filterRolesInstanceOf(OperationProvidedRole.class, providedRolesToExplore).filter(eachOperationProvidedRole -> areConnected((OperationRequiredRole) requiredRoleToHandle, 
//																																		   (OperationProvidedRole) eachOperationProvidedRole))
//				  							  											 .findFirst();
//		
//	}
	
	@Override
	public RequiredRole createRequiredRoleOf(ProvidedRole providedRole) {
		
		return this.concernRepositoryManager.createRequiredRoleBy((OperationProvidedRole) providedRole);
		
	}

	@Override
	public ProvidedRole createRequiredRoleOf(RequiredRole requiredRole) {
		
		return this.concernRepositoryManager.createProvidedRoleBy((OperationRequiredRole) requiredRole);
		
	}

}
