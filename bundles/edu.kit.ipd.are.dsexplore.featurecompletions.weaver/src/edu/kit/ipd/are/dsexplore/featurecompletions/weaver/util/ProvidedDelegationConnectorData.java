package edu.kit.ipd.are.dsexplore.featurecompletions.weaver.util;

import org.palladiosimulator.pcm.core.composition.ProvidedDelegationConnector;

public final class ProvidedDelegationConnectorData {
	final String operationInnerProvidedRoleId;
	final String operationOuterRequiredRoleId;
	final String providedAssemblyContextId;

	public ProvidedDelegationConnectorData(ProvidedDelegationConnector pdc) {
		this.operationInnerProvidedRoleId = pdc.getInnerProvidedRole_ProvidedDelegationConnector().getId();
		this.operationOuterRequiredRoleId = pdc.getOuterProvidedRole_ProvidedDelegationConnector().getId();
		this.providedAssemblyContextId = pdc.getAssemblyContext_ProvidedDelegationConnector().getId();
	}
}
