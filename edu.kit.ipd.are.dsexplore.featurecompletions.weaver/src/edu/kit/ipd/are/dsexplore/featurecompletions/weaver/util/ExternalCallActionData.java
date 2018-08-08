/**
 * 
 */
package edu.kit.ipd.are.dsexplore.featurecompletions.weaver.util;

import org.palladiosimulator.pcm.repository.OperationRequiredRole;
import org.palladiosimulator.pcm.repository.RepositoryComponent;

/**
 * @author Maximilian Eckert (maximilian.eckert@student.kit.edu, maxieckert@web.de)
 * 
 *
 */
public class ExternalCallActionData {

	
	private String containingComponentId;
	private String operationRequiredRoleId;

	/**
	 * @param containingComponentId
	 */
	public ExternalCallActionData(RepositoryComponent comp, OperationRequiredRole role) {
		this.containingComponentId = comp.getId();
		this.operationRequiredRoleId = role.getId();
	}

	/**
	 * @return the containingComponentId
	 */
	public String getContainingComponentId() {
		return containingComponentId;
	}

	/**
	 * @return the operationRequiredRoleId
	 */
	public String getOperationRequiredRoleId() {
		return operationRequiredRoleId;
	}
}
