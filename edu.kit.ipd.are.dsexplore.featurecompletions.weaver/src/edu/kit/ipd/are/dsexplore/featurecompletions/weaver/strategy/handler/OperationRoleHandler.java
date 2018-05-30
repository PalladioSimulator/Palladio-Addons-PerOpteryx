package edu.kit.ipd.are.dsexplore.featurecompletions.weaver.strategy.handler;

import org.palladiosimulator.pcm.repository.OperationProvidedRole;
import org.palladiosimulator.pcm.repository.OperationRequiredRole;
import org.palladiosimulator.pcm.repository.ProvidedRole;
import org.palladiosimulator.pcm.repository.RequiredRole;
import org.palladiosimulator.pcm.repository.Role;

import edu.kit.ipd.are.dsexplore.featurecompletions.weaver.FCCUtil;
import edu.kit.ipd.are.dsexplore.featurecompletions.weaver.strategy.manager.MergedRepoManager;

public class OperationRoleHandler extends RoleHandler {

	public OperationRoleHandler(MergedRepoManager mergedRepoManager) {
		super(mergedRepoManager);
	}

	@Override
	protected boolean areConnected(Role firstRole, Role secondRole) {
		if (firstRole instanceof OperationRequiredRole) {
			return secondRole instanceof OperationProvidedRole ? this.hasSameInterface((OperationRequiredRole) firstRole, (OperationProvidedRole) secondRole) : false;
		}
		if (firstRole instanceof OperationProvidedRole) {
			return secondRole instanceof OperationRequiredRole ? this.hasSameInterface((OperationRequiredRole) secondRole, (OperationProvidedRole) firstRole) : false;
		}
		return false;
	}

	private boolean hasSameInterface(OperationRequiredRole requiredRole, OperationProvidedRole providedRole) {
		return FCCUtil.areEqual(providedRole.getProvidedInterface__OperationProvidedRole(), requiredRole.getRequiredInterface__OperationRequiredRole());
	}

	@Override
	public RequiredRole createRequiredRoleOf(ProvidedRole providedRole) {
		return this.mergedRepoManager.createRequiredRoleBy((OperationProvidedRole) providedRole);
	}

	@Override
	public ProvidedRole createRequiredRoleOf(RequiredRole requiredRole) {
		return this.mergedRepoManager.createProvidedRoleBy((OperationRequiredRole) requiredRole);
	}
}
