package edu.kit.ipd.are.dsexplore.concern.handler;

import java.util.List;
import java.util.Optional;

import org.palladiosimulator.pcm.repository.ProvidedRole;
import org.palladiosimulator.pcm.repository.RequiredRole;
import org.palladiosimulator.pcm.repository.Role;

import edu.kit.ipd.are.dsexplore.concern.manager.ConcernSolutionManager;

public abstract class RoleHandler {
	
	protected ConcernSolutionManager concernRepositoryManager;
	
	public RoleHandler(ConcernSolutionManager concernRepositoryManager) {
		
		this.concernRepositoryManager = concernRepositoryManager;
		
	}
	
	@SuppressWarnings("unchecked")
	public Optional<Role> getComplimentaryRoleOf(Role role, List<? extends Role> rolesToExplore) {
		
		return (Optional<Role>) rolesToExplore.stream().filter(eachRole -> areConnected(eachRole, role)).findFirst();
		
	}
	
	protected abstract boolean areConnected(Role firstRole, Role secondRole);

	public abstract RequiredRole createRequiredRoleOf(ProvidedRole providedRole);
	
	public abstract ProvidedRole createRequiredRoleOf(RequiredRole providedRole);
	
}
