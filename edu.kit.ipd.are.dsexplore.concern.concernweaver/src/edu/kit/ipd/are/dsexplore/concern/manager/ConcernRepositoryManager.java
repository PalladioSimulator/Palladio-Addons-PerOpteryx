package edu.kit.ipd.are.dsexplore.concern.manager;

import java.util.Arrays;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.eclipse.emf.common.util.EList;
import org.palladiosimulator.pcm.repository.BasicComponent;
import org.palladiosimulator.pcm.repository.ComponentType;
import org.palladiosimulator.pcm.repository.EventGroup;
import org.palladiosimulator.pcm.repository.ImplementationComponentType;
import org.palladiosimulator.pcm.repository.OperationInterface;
import org.palladiosimulator.pcm.repository.OperationProvidedRole;
import org.palladiosimulator.pcm.repository.OperationRequiredRole;
import org.palladiosimulator.pcm.repository.ProvidedRole;
import org.palladiosimulator.pcm.repository.Repository;
import org.palladiosimulator.pcm.repository.RepositoryComponent;
import org.palladiosimulator.pcm.repository.RepositoryFactory;
import org.palladiosimulator.pcm.repository.RequiredRole;
import org.palladiosimulator.pcm.repository.SinkRole;
import org.palladiosimulator.pcm.repository.SourceRole;

import ConcernModel.Annotation;
import edu.kit.ipd.are.dsexplore.concern.util.AnnotationFilter;
import edu.kit.ipd.are.dsexplore.concern.util.Pair;

public class ConcernRepositoryManager {
	
	private static ConcernRepositoryManager eInstance = null;
	
	private Repository pcmConcernRepository = null;
	
	private ConcernRepositoryManager() {
		
	}
	
	public static ConcernRepositoryManager getBy(Repository pcmConcernRepository) {
		
		if (eInstance == null) {
			
			eInstance = new ConcernRepositoryManager();
			
		}
		
		eInstance.pcmConcernRepository = pcmConcernRepository;
		
		return eInstance;
	}
	
	public List<RepositoryComponent> getComponentsAnnotatedWith(List<Annotation> annotations) {
		
		return new AnnotationFilter(Arrays.asList(pcmConcernRepository)).getComponentsAnnotatedWith(annotations);
		
	}
	
	public Optional<RepositoryComponent> getElementaryConcernComponentOf(List<ProvidedRole> providedRoles) {
		
		return this.pcmConcernRepository.getComponents__Repository().stream().filter(ecc -> areEqual(ecc.getProvidedRoles_InterfaceProvidingEntity(), providedRoles))
																			 .findFirst();
		
	}

	private boolean areEqual(EList<ProvidedRole> givenProvidedRoles, List<ProvidedRole> searchedProvidedRoles) {

		return hasSameCount(givenProvidedRoles.size(), searchedProvidedRoles.size()) &&
			   hasEqualProvidedRoles(givenProvidedRoles, searchedProvidedRoles);	
		
	}

	private boolean hasSameCount(int givenSize, int searchedSize) {
		
		return (givenSize == searchedSize);
		
	}
	
	private boolean hasEqualProvidedRoles(List<ProvidedRole> givenProvidedRoles, List<ProvidedRole> searchedProvidedRoles) {
		
		for (ProvidedRole eachGivenProvidedRole : givenProvidedRoles) {
			
			for (ProvidedRole eachSearchedProvidedRole : searchedProvidedRoles) {
				
				if (!(hasSameId(eachGivenProvidedRole, eachSearchedProvidedRole))) {
					
					return false;
					
				}
				
			}
			
		}
		
		return true;
		
	}

	private boolean hasSameId(ProvidedRole givenProvidedRole, ProvidedRole searchedProvidedRole) {
		
		return givenProvidedRole.getId().equals(searchedProvidedRole.getId());
		
	}

	public Optional<RepositoryComponent> getComponentByUnique(String name) {
		
		return this.pcmConcernRepository.getComponents__Repository().stream().filter(component -> component.getEntityName().equals(name))
		 		 															 .map(component -> (RepositoryComponent) component)
		 		 															 .findFirst();
		
	}
	
	public RepositoryComponent createAndAddAdapter(String name) {
		
		BasicComponent adapter = createAdapter(name);
		
		addAdapter(adapter);
		
		return (ImplementationComponentType) adapter;
		
	}
	
	private void addAdapter(BasicComponent adapter) {
		
		this.pcmConcernRepository.getComponents__Repository().add(adapter);
		
	}

	private BasicComponent createAdapter(String name) {
		
		BasicComponent adapter = RepositoryFactory.eINSTANCE.createBasicComponent();
		adapter.setComponentType(ComponentType.BUSINESS_COMPONENT);
		adapter.setEntityName(name);
		
		return adapter;
		
	}
	
	public RequiredRole createRequiredRoleBy(OperationProvidedRole providedRole) {
		
		OperationInterface referencedInterface = providedRole.getProvidedInterface__OperationProvidedRole();
		
		OperationRequiredRole requiredRole = RepositoryFactory.eINSTANCE.createOperationRequiredRole();
		requiredRole.setEntityName(String.format("requires%2s", referencedInterface.getEntityName()));
		requiredRole.setRequiredInterface__OperationRequiredRole(referencedInterface);
		
		return requiredRole;
	}
	
	public RequiredRole createRequiredRoleBy(SinkRole sinkRole) {
		
		EventGroup referencedEventGroup = sinkRole.getEventGroup__SinkRole();
		
		SourceRole sourceRole = RepositoryFactory.eINSTANCE.createSourceRole();
		sourceRole.setEntityName(String.format("sourceOf%2s", referencedEventGroup.getEntityName()));
		sourceRole.setEventGroup__SourceRole(referencedEventGroup);
		
		return sourceRole;
	}
	
	public ProvidedRole createProvidedRoleBy(OperationRequiredRole requiredRole) {
		
		OperationInterface referencedInterface = requiredRole.getRequiredInterface__OperationRequiredRole();
		
		OperationProvidedRole providedRole = RepositoryFactory.eINSTANCE.createOperationProvidedRole();
		providedRole.setEntityName(String.format("provides%2s", referencedInterface.getEntityName()));
		providedRole.setProvidedInterface__OperationProvidedRole(referencedInterface);
		
		return providedRole;
	}
	
	public ProvidedRole createProvidedRoleBy(SourceRole sourceRole) {
		
		EventGroup referencedInterface = sourceRole.getEventGroup__SourceRole();
		
		SinkRole sinkRole = RepositoryFactory.eINSTANCE.createSinkRole();
		sinkRole.setEntityName(String.format("provides%2s", referencedInterface.getEntityName()));
		sinkRole.setEventGroup__SinkRole(referencedInterface);
		
		return sinkRole;
	}
	
	public ProvidedRole createProvidedRoleBy(OperationProvidedRole providedRole, String name) {
		
		OperationInterface referencedInterface = providedRole.getProvidedInterface__OperationProvidedRole();
		
		OperationProvidedRole newProvidedRole = RepositoryFactory.eINSTANCE.createOperationProvidedRole();
		newProvidedRole.setEntityName(String.format("%1s_%2s", providedRole.getEntityName(), name));
		newProvidedRole.setProvidedInterface__OperationProvidedRole(referencedInterface);
		
		return newProvidedRole;
		
	}
	
	//TODO this might not be needed anymore
	public List<ProvidedRole> getEquivalentConsumedFeaturesFromRepository(List<ProvidedRole> consumedFeatures) {
		
		try {
			
			return consumedFeatures.stream().map(eachConsumedFeature -> getEquivalent(eachConsumedFeature).get())
											.collect(Collectors.toList());
			
		} catch (NoSuchElementException ex) {
			
			//TODO introduce exceptions
			return null;
			
		}
		
	}

	private Optional<ProvidedRole> getEquivalent(ProvidedRole searchedConsumedFeature) {
		
		return this.pcmConcernRepository.getComponents__Repository().stream().flatMap(eachComponent -> eachComponent.getProvidedRoles_InterfaceProvidingEntity().stream())
																			 .filter(eachProvidedRole -> areEqual(eachProvidedRole, searchedConsumedFeature))
																			 .findFirst();
																			 
		
	}

	private boolean areEqual(ProvidedRole givenProvidedRole, ProvidedRole searchedConsumedFeature) {
		
		String givenProvidedRoleId = givenProvidedRole.getId();
		String searchedConsumedFeatureId = searchedConsumedFeature.getId();
		
		return givenProvidedRoleId.equals(searchedConsumedFeatureId);
		
	}
	
	public Optional<Pair<OperationProvidedRole, OperationRequiredRole>> getConnectedRolesOf(RepositoryComponent providedComponent, RepositoryComponent requiredComponent) {
		
		for (OperationProvidedRole eachProvidedRole : getOperationProvidedRolesOf(providedComponent)) {
			
			for (OperationRequiredRole eachRequiredRole : getOperationRequiredRolesOf(requiredComponent)) {
				
				if (areConnectedRoles(eachProvidedRole, eachRequiredRole)) {
					
					return Optional.of(Pair.of(eachProvidedRole, eachRequiredRole));
					
				}
				
			}
			
		}
		
		return Optional.empty();
		
	}
	
	private List<OperationRequiredRole> getOperationRequiredRolesOf(RepositoryComponent requiredComponent) {
		
		return requiredComponent.getRequiredRoles_InterfaceRequiringEntity().stream().filter(each -> each instanceof OperationRequiredRole)
				 																	 .map(each -> (OperationRequiredRole) each)
				 																	 .collect(Collectors.toList());
		
	}

	private List<OperationProvidedRole> getOperationProvidedRolesOf(RepositoryComponent providedComponent) {
		
		return providedComponent.getProvidedRoles_InterfaceProvidingEntity().stream().filter(each -> each instanceof OperationProvidedRole)
																					 .map(each -> (OperationProvidedRole) each)
																					 .collect(Collectors.toList());
		
	}

	private boolean areConnectedRoles(OperationProvidedRole providedRoles, OperationRequiredRole requiredRole) {
		
		String providedInterfaceId = providedRoles.getProvidedInterface__OperationProvidedRole().getId();
		String requiredInterfaceId = requiredRole.getRequiredInterface__OperationRequiredRole().getId();
		
		return providedInterfaceId.equals(requiredInterfaceId);
		
	}
	
	public List<ProvidedRole> getAllProvidedRoles() {
		
		return this.pcmConcernRepository.getComponents__Repository().stream().flatMap(eachComponent -> getAllProvidedRolesOf(eachComponent))
																			 .collect(Collectors.toList());
		
	}

	private Stream<ProvidedRole> getAllProvidedRolesOf(RepositoryComponent component) {
	
		return component.getProvidedRoles_InterfaceProvidingEntity().stream().map(each -> (ProvidedRole) each);
		
	}

}
