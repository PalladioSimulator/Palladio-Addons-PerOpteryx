package edu.kit.ipd.are.dsexplore.concern.manager;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import org.eclipse.emf.ecore.EObject;
import org.palladiosimulator.pcm.core.composition.AssemblyConnector;
import org.palladiosimulator.pcm.core.composition.AssemblyContext;
import org.palladiosimulator.pcm.core.composition.AssemblyEventConnector;
import org.palladiosimulator.pcm.core.composition.CompositionFactory;
import org.palladiosimulator.pcm.core.composition.Connector;
import org.palladiosimulator.pcm.core.composition.ProvidedDelegationConnector;
import org.palladiosimulator.pcm.core.composition.RequiredDelegationConnector;
import org.palladiosimulator.pcm.repository.ImplementationComponentType;
import org.palladiosimulator.pcm.repository.OperationProvidedRole;
import org.palladiosimulator.pcm.repository.OperationRequiredRole;
import org.palladiosimulator.pcm.repository.RepositoryComponent;
import org.palladiosimulator.pcm.repository.Role;
import org.palladiosimulator.pcm.repository.SinkRole;
import org.palladiosimulator.pcm.repository.SourceRole;
import org.palladiosimulator.pcm.system.System;

import edu.kit.ipd.are.dsexplore.concern.util.Pair;

public class PcmSystemManager {

	private static PcmSystemManager eInstance = null;
	
	private System system;
	
	private PcmSystemManager() {
		
	}
	
	public static PcmSystemManager getBy(System system) {
		
		if (eInstance == null) {
			
			eInstance = new PcmSystemManager();
			
		}
		
		eInstance.system = system;
		
		return eInstance;
		
	}
	
	public List<Connector> getConnectorsBy(Predicate<Connector> connectorsMatchingSearchCriteria) {
		
		return this.system.getConnectors__ComposedStructure().stream().filter(connectorsMatchingSearchCriteria)
																	  .collect(Collectors.toList());
		
	}
	
	public boolean existConnector(Connector searchedConnector) {
		
		return this.system.getConnectors__ComposedStructure().stream().anyMatch(eachConnector -> areEqual(eachConnector, searchedConnector));
		
	}
	
	private boolean areEqual(Connector givenConnector, Connector searchedConnector) {
		
		if (!givenConnector.getClass().equals(searchedConnector.getClass())) {
			
			return false;
			
		}
		
		return hasEqualRoles(getRolesOf(searchedConnector), getRolesOf(givenConnector));
		
	}
	
	private boolean hasEqualRoles(List<Role> searchedConnectorRoles, List<Role> givenConnectorRoles) {
		
		for (int i = 0; i < searchedConnectorRoles.size(); i++) {
			
			if (!searchedConnectorRoles.get(i).equals(givenConnectorRoles.get(i))) {
				
				return false;
				
			}
			
		}
		
		return true;
		
	}

	private List<Role> getRolesOf(Connector connector) {
		
		List<EObject> referencedElements = connector.eCrossReferences();
		List<Role> roles = new ArrayList<Role>();
		
		referencedElements.forEach(eachReferencedElement -> { 

			if (eachReferencedElement instanceof Role) {
				
				roles.add((Role) eachReferencedElement);
				
			}
			
		});
		
		return roles;
		
	}

	public void remove(Connector connectorToRemove) {
		
		this.system.getConnectors__ComposedStructure().remove(connectorToRemove);
		
	}

	//This method is only unambiguous if the name of the searched assembly context is unique.
	public Optional<AssemblyContext> getAssemblyContextByUniqueName(String name) {
		
		return this.system.getAssemblyContexts__ComposedStructure().stream().filter(eachAssemblyContext -> areEqual(eachAssemblyContext.getEntityName(), name))
																			.findFirst();
		
	}
	
	public List<AssemblyContext> getAssemblyContextsInstantiating(RepositoryComponent instantiatedComponent) {
		
		return this.system.getAssemblyContexts__ComposedStructure().stream().filter(eachAssemblyContext -> encapsulates(instantiatedComponent, eachAssemblyContext))
																	 		.collect(Collectors.toList());
		
	}
	
	private boolean encapsulates(RepositoryComponent encapsulatedCompoent, AssemblyContext givenAssemblyContext) {
		
		return areEqual(encapsulatedCompoent.getId(), givenAssemblyContext.getEncapsulatedComponent__AssemblyContext().getId());
		
	}

	private boolean areEqual(String givenId, String searchedId) {

		return givenId.equals(searchedId);
		
	}

	public void addAssemblyContext(AssemblyContext assemblyContextToAdd) {
		
		this.system.getAssemblyContexts__ComposedStructure().add(assemblyContextToAdd);
		
	}
	
	public void addAssemblyContexts(List<AssemblyContext> assemblyContextsToAdd) {
		
		this.system.getAssemblyContexts__ComposedStructure().addAll(assemblyContextsToAdd);
		
	}
	
	public void addConnectors(Connector... connectorsToAdd) {
		
		addConnectors(Arrays.asList(connectorsToAdd));
		
	}
	
	public void addConnectors(List<Connector> connectorsToAdd) {
		
		this.system.getConnectors__ComposedStructure().addAll(connectorsToAdd);
		
	}
	
	public ProvidedDelegationConnector createProvidedDelegationConnectorBy(OperationProvidedRole outerProvidedRole, Pair<OperationProvidedRole, AssemblyContext> providedPair) {
		
		AssemblyContext assemblyContext = providedPair.getSecond(); 
		String delegationConnectorName = assemblyContext.getEncapsulatedComponent__AssemblyContext().getEntityName();
		
		ProvidedDelegationConnector delegationConnector = CompositionFactory.eINSTANCE.createProvidedDelegationConnector();
		delegationConnector.setEntityName(String.format("%1sProvidedDelegationConnector", delegationConnectorName));
		delegationConnector.setInnerProvidedRole_ProvidedDelegationConnector(providedPair.getFirst());
		delegationConnector.setOuterProvidedRole_ProvidedDelegationConnector(outerProvidedRole);
		delegationConnector.setAssemblyContext_ProvidedDelegationConnector(assemblyContext);
		
		return delegationConnector;
		
	}
	
	public RequiredDelegationConnector createRequiredDelegationConnectorBy(OperationRequiredRole outerRequiredRole, Pair<OperationRequiredRole, AssemblyContext> requiredPair) {
		
		AssemblyContext assemblyContext = requiredPair.getSecond(); 
		String delegationConnectorName = assemblyContext.getEncapsulatedComponent__AssemblyContext().getEntityName();
		
		RequiredDelegationConnector delegationConnector = CompositionFactory.eINSTANCE.createRequiredDelegationConnector();
		delegationConnector.setEntityName(String.format("%1sRequiredDelegationConnector", delegationConnectorName));
		delegationConnector.setInnerRequiredRole_RequiredDelegationConnector(requiredPair.getFirst());
		delegationConnector.setOuterRequiredRole_RequiredDelegationConnector(outerRequiredRole);
		delegationConnector.setAssemblyContext_RequiredDelegationConnector(assemblyContext);
		
		return delegationConnector;
		
	}
	
	public AssemblyConnector createAssemblyConnectorBy(Pair<OperationRequiredRole, AssemblyContext> requiredPair, Pair<OperationProvidedRole, AssemblyContext> providedPair) {
		
		String requiredComponentName = requiredPair.getSecond().getEncapsulatedComponent__AssemblyContext().getEntityName();
		String providedComponentName = providedPair.getSecond().getEncapsulatedComponent__AssemblyContext().getEntityName();
		
		AssemblyConnector assemblyConnector = CompositionFactory.eINSTANCE.createAssemblyConnector();
		assemblyConnector.setEntityName(String.format("%1sTo%2sConnector", requiredComponentName, providedComponentName));
		assemblyConnector.setRequiredRole_AssemblyConnector(requiredPair.getFirst());
		assemblyConnector.setRequiringAssemblyContext_AssemblyConnector(requiredPair.getSecond());
		assemblyConnector.setProvidedRole_AssemblyConnector(providedPair.getFirst());
		assemblyConnector.setProvidingAssemblyContext_AssemblyConnector(providedPair.getSecond());
		
		return assemblyConnector;
		
	}
	
	public AssemblyEventConnector createAssemblyEventConnectorBy(Pair<SourceRole, AssemblyContext> requiredPair, Pair<SinkRole, AssemblyContext> providedPair) {
		
		String requiredComponentName = requiredPair.getSecond().getEncapsulatedComponent__AssemblyContext().getEntityName();
		String providedComponentName = providedPair.getSecond().getEncapsulatedComponent__AssemblyContext().getEntityName();
		
		AssemblyEventConnector assemblyEventConnector = CompositionFactory.eINSTANCE.createAssemblyEventConnector();
		assemblyEventConnector.setEntityName(String.format("%1sTo%2sConnector", requiredComponentName, providedComponentName));
		assemblyEventConnector.setSourceRole__AssemblyEventConnector(requiredPair.getFirst());
		assemblyEventConnector.setSourceAssemblyContext__AssemblyEventConnector(requiredPair.getSecond());
		assemblyEventConnector.setSinkRole__AssemblyEventConnector(providedPair.getFirst());
		assemblyEventConnector.setSinkAssemblyContext__AssemblyEventConnector(providedPair.getSecond());
		
		return assemblyEventConnector;
		
	}

	public List<AssemblyContext> createAssemblyContextsOf(List<ImplementationComponentType> components) {
		
		return components.stream().map(eachComponent -> createAssemblyContextOf(eachComponent))
								  .collect(Collectors.toList());
		
	}
	
	public AssemblyContext createAssemblyContextOf(RepositoryComponent component) {
		
		AssemblyContext componentAssemblyContext = CompositionFactory.eINSTANCE.createAssemblyContext();
		componentAssemblyContext.setEncapsulatedComponent__AssemblyContext(component);
		componentAssemblyContext.setEntityName(String.format("%1sInstance", component.getEntityName()));
		
		return componentAssemblyContext;
		
	}
	
	public AssemblyContext createAssemblyContextOf(RepositoryComponent component, String name) {
		
		AssemblyContext componentAssemblyContext = CompositionFactory.eINSTANCE.createAssemblyContext();
		componentAssemblyContext.setEncapsulatedComponent__AssemblyContext(component);
		componentAssemblyContext.setEntityName(name);
		
		return componentAssemblyContext;
		
	}
	
}
