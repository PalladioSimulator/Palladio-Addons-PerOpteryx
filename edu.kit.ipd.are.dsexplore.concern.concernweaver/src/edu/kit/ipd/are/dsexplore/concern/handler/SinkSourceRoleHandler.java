package edu.kit.ipd.are.dsexplore.concern.handler;

import org.palladiosimulator.pcm.repository.ProvidedRole;
import org.palladiosimulator.pcm.repository.RequiredRole;
import org.palladiosimulator.pcm.repository.Role;
import org.palladiosimulator.pcm.repository.SinkRole;
import org.palladiosimulator.pcm.repository.SourceRole;

import edu.kit.ipd.are.dsexplore.concern.manager.ConcernRepositoryManager;

public class SinkSourceRoleHandler extends RoleHandler {

	public SinkSourceRoleHandler(ConcernRepositoryManager concernRepositoryManager) {
		
		super(concernRepositoryManager);
		
	}

	@Override
	protected boolean areConnected(Role firstRole, Role secondRole) {
		
		if (firstRole instanceof SourceRole) {
			
			return secondRole instanceof SinkRole ? hasSameEventGroup((SourceRole) firstRole, (SinkRole) secondRole) : false;
			
		}
		
		if (firstRole instanceof SinkRole) {
			
			return secondRole instanceof SourceRole ? hasSameEventGroup((SourceRole) secondRole, (SinkRole) firstRole) : false;
			
		}
		
		return false;
				
	}
	
	private boolean hasSameEventGroup(SourceRole sourceRole, SinkRole sinkRole) {
		
		String sinkEventGroupId = sinkRole.getEventGroup__SinkRole().getId();
		String sourceEventGroupId = sourceRole.getEventGroup__SourceRole().getId();
		
		return sinkEventGroupId.equals(sourceEventGroupId);
		
	}
	
//	@Override
//	public Optional<RequiredRole> getRequiredOpponentOf(ProvidedRole providedRoleToHandle, List<RequiredRole> requiredRolesToExplore) {
//		
//		return filterRolesInstanceOf(SourceRole.class, requiredRolesToExplore).filter(eachSourceRole -> areConnected((SourceRole) eachSourceRole, (SinkRole) providedRoleToHandle))
//				  							  								  .findFirst();
//		
//	}
//
//	@Override
//	public Optional<ProvidedRole> getProvidedOpponentOf(RequiredRole requiredRoleToHandle, List<ProvidedRole> providedRolesToExplore) {
//		
//		return filterRolesInstanceOf(SinkRole.class, providedRolesToExplore).filter(eachSinkRole -> areConnected((SourceRole) requiredRoleToHandle, (SinkRole) eachSinkRole))
//				  							  								.findFirst();
//		
//	}

	@Override
	public RequiredRole createRequiredRoleOf(ProvidedRole providedRole) {
		
		return this.concernRepositoryManager.createRequiredRoleBy((SinkRole) providedRole);
		
	}

	@Override
	public ProvidedRole createRequiredRoleOf(RequiredRole providedRole) {
		
		return this.concernRepositoryManager.createProvidedRoleBy((SourceRole) providedRole);
		
	}

}
