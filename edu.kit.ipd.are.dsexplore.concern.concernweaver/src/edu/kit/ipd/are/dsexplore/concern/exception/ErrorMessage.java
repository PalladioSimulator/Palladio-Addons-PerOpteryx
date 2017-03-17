package edu.kit.ipd.are.dsexplore.concern.exception;

import org.palladiosimulator.pcm.repository.RepositoryComponent;
import org.palladiosimulator.pcm.repository.RequiredRole;
import org.palladiosimulator.pcm.repository.Signature;

public class ErrorMessage {

	public static String ambiguousComponentName(String componentName) {
		
		return String.format("The component name:%s is not unambiguous.", componentName);
		
	}
	
	public static String missingProvidedRole(RepositoryComponent component, RequiredRole requiredRole) {
		
		return String.format("There exist no complimentary provided role for component %1s with required role %2s in the provided role space of the concern solution.",
							 component.getEntityName(),
							 requiredRole.getEntityName());
		
	}
	
	public static String missingExternalCall(RepositoryComponent component, Signature calledService) {
		
		return String.format("Component %1s contains no external call to service %2s.",
							 component.getEntityName(),
							 calledService.getEntityName());
		
	}
	
}
