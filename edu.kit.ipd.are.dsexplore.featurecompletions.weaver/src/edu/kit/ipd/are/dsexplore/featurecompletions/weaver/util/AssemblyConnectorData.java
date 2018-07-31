package edu.kit.ipd.are.dsexplore.featurecompletions.weaver.util;

import org.palladiosimulator.pcm.core.composition.AssemblyConnector;

public final class AssemblyConnectorData {
	public final String name;
	public final String operationProvidedRoleInterfaceId;
	public final String operationRequiredRoleInterfaceId;

	public final String operationProvidedRoleId;
	public final String operationRequiredRoleId;

	public final String providedAssemblyContextId;
	public final String requiredAssemblyContextId;

	public AssemblyConnectorData(AssemblyConnector ac) {
		this.name = ac.getEntityName();
		this.operationProvidedRoleInterfaceId = ac.getProvidedRole_AssemblyConnector().getProvidedInterface__OperationProvidedRole().getId();
		this.operationRequiredRoleInterfaceId = ac.getRequiredRole_AssemblyConnector().getRequiredInterface__OperationRequiredRole().getId();
		this.operationProvidedRoleId = ac.getProvidedRole_AssemblyConnector().getId();
		this.operationRequiredRoleId = ac.getRequiredRole_AssemblyConnector().getId();
		this.providedAssemblyContextId = ac.getProvidingAssemblyContext_AssemblyConnector().getId();
		this.requiredAssemblyContextId = ac.getRequiringAssemblyContext_AssemblyConnector().getId();
	}

}
