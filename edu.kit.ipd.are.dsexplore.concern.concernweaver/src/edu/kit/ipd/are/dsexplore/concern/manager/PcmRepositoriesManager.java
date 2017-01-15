package edu.kit.ipd.are.dsexplore.concern.manager;

import java.util.List;
import java.util.Optional;

import org.palladiosimulator.pcm.repository.BasicComponent;
import org.palladiosimulator.pcm.repository.OperationProvidedRole;
import org.palladiosimulator.pcm.repository.OperationRequiredRole;
import org.palladiosimulator.pcm.repository.Repository;

public class PcmRepositoriesManager {

	private static PcmRepositoriesManager eInstance = null;
	
	private List<Repository> repositories;
	
	private PcmRepositoriesManager() {
		
	}
	
	public static PcmRepositoriesManager getBy(List<Repository> repositories) {
		
		if (eInstance == null) {
			
			eInstance = new PcmRepositoriesManager();
			
		}
		
		eInstance.repositories = repositories;
		
		return eInstance;
		
	}
	
	public Optional<BasicComponent> getComponentWith(OperationRequiredRole requiredRole) {
		
		return this.repositories.stream().flatMap(eachRepository -> eachRepository.getComponents__Repository().stream())
										 .filter(eachComponent -> eachComponent instanceof BasicComponent)
										 .map(eachComponent -> (BasicComponent) eachComponent)
										 .filter(eachBasicComponent -> eachBasicComponent.getRequiredRoles_InterfaceRequiringEntity().contains(requiredRole))
										 .findFirst();
		
	}
	
	public Optional<BasicComponent> getComponentWith(OperationProvidedRole providedRole) {
		
		return this.repositories.stream().flatMap(eachRepository -> eachRepository.getComponents__Repository().stream())
										 .filter(eachComponent -> eachComponent instanceof BasicComponent)
										 .map(eachComponent -> (BasicComponent) eachComponent)
										 .filter(eachBasicComponent -> eachBasicComponent.getProvidedRoles_InterfaceProvidingEntity().contains(providedRole))
										 .findFirst();
		
	}
	
}
