package edu.kit.ipd.are.dsexplore.featurecompletions.weaver.strategy.handler;

import org.palladiosimulator.pcm.repository.ProvidedRole;
import org.palladiosimulator.pcm.repository.RequiredRole;
import org.palladiosimulator.pcm.repository.Role;
import org.palladiosimulator.pcm.repository.SinkRole;
import org.palladiosimulator.pcm.repository.SourceRole;

import edu.kit.ipd.are.dsexplore.featurecompletions.weaver.strategy.manager.MergedRepoManager;

public class SinkSourceRoleHandler extends RoleHandler {

	public SinkSourceRoleHandler(MergedRepoManager mergedRepoManager) {
		super(mergedRepoManager);
	}

	@Override
	protected boolean areConnected(Role firstRole, Role secondRole) {
		if (firstRole instanceof SourceRole) {
			return secondRole instanceof SinkRole ? this.hasSameEventGroup((SourceRole) firstRole, (SinkRole) secondRole) : false;
		}
		if (firstRole instanceof SinkRole) {
			return secondRole instanceof SourceRole ? this.hasSameEventGroup((SourceRole) secondRole, (SinkRole) firstRole) : false;
		}
		return false;
	}

	private boolean hasSameEventGroup(SourceRole sourceRole, SinkRole sinkRole) {
		String sinkEventGroupId = sinkRole.getEventGroup__SinkRole().getId();
		String sourceEventGroupId = sourceRole.getEventGroup__SourceRole().getId();
		return sinkEventGroupId.equals(sourceEventGroupId);
	}

	@Override
	public RequiredRole createRequiredRoleOf(ProvidedRole providedRole) {
		return this.mergedRepoManager.createRequiredRoleBy((SinkRole) providedRole);
	}

	@Override
	public ProvidedRole createRequiredRoleOf(RequiredRole providedRole) {
		return this.mergedRepoManager.createProvidedRoleBy((SourceRole) providedRole);
	}
}
