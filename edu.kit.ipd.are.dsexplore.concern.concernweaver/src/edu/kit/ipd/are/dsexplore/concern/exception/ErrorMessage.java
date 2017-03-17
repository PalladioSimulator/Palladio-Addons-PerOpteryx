package edu.kit.ipd.are.dsexplore.concern.exception;

import java.util.List;

import org.palladiosimulator.pcm.core.entity.NamedElement;
import org.palladiosimulator.pcm.repository.Interface;
import org.palladiosimulator.pcm.repository.ProvidedRole;
import org.palladiosimulator.pcm.repository.RepositoryComponent;
import org.palladiosimulator.pcm.repository.Role;
import org.palladiosimulator.pcm.repository.Signature;

import ConcernModel.ElementaryConcernComponent;

public class ErrorMessage {
	
	public static String ambiguousComponentName(String componentName) {
		
		return String.format("The component name:%s is not unambiguous.", componentName);
		
	}
	
	public static String missingComplimentaryRole(RepositoryComponent component, Role role) {
		
		return String.format("For the role %1s contained in component %2s there exist no complimentary role.", role.getEntityName(), component.getEntityName());
		
	}
	
	public static String missingExternalCall(RepositoryComponent component, Signature calledService) {
		
		return String.format("Component %1s contains no external call to service %2s.",
							 component.getEntityName(),
							 calledService.getEntityName());
		
	}
	
	public static String instantiationError(RepositoryComponent component, int instantiations) {
		
		return String.format("The component %s has been instantiated %d times instead of one time.", component.getEntityName(), instantiations);
		
	}
	
	public static String missingConnectorWith(ProvidedRole providedRole) {
		
		return String.format("There exist no assembly connector containing the provided role: %s.", providedRole.getEntityName());
		
	}
	
	public static String missingEntryLevelSystemCall(Signature calledService) {
		
		return String.format("There exist no entry level system call of service: %s", calledService.getEntityName());
		
	}
	
	public static String missingRole(RepositoryComponent component, Interface referencedInterface) {
		
		return String.format("Component %1s does not contain any role %2s which is referencing the interface %2s", component.getEntityName(), referencedInterface.getEntityName());
		
	}
	
	public static String missingECC(ElementaryConcernComponent ecc, List<ProvidedRole> providedFeatures) {
		
		return String.format("For ecc %1s does not contain the provided features:%2s", ecc.getName(), toString(providedFeatures));
		
	}

	private static <T extends NamedElement> String toString(List<T> namedElements) {
		
		return namedElements.stream().map(eachElement -> eachElement.getEntityName())
									 .reduce("", (s1,s2) -> String.format("%1s, %2s", s1, s2));
		
	}
	
}
