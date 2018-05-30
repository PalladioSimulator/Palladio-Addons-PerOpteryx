package edu.kit.ipd.are.dsexplore.featurecompletions.weaver.strategy.manager;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;

import org.palladiosimulator.pcm.core.composition.AssemblyConnector;
import org.palladiosimulator.pcm.core.composition.AssemblyContext;
import org.palladiosimulator.pcm.core.composition.AssemblyEventConnector;
import org.palladiosimulator.pcm.core.composition.CompositionFactory;
import org.palladiosimulator.pcm.core.composition.Connector;
import org.palladiosimulator.pcm.core.composition.ProvidedDelegationConnector;
import org.palladiosimulator.pcm.core.composition.RequiredDelegationConnector;
import org.palladiosimulator.pcm.repository.OperationProvidedRole;
import org.palladiosimulator.pcm.repository.OperationRequiredRole;
import org.palladiosimulator.pcm.repository.RepositoryComponent;
import org.palladiosimulator.pcm.repository.Role;
import org.palladiosimulator.pcm.repository.SinkRole;
import org.palladiosimulator.pcm.repository.SourceRole;
import org.palladiosimulator.pcm.system.System;

import de.uka.ipd.sdq.dsexplore.tools.primitives.Pair;
import de.uka.ipd.sdq.dsexplore.tools.stereotypeapi.EcoreReferenceResolver;
import edu.kit.ipd.are.dsexplore.featurecompletions.weaver.FCCUtil;

/**
 * This class provides all operations performed on a PCM system.
 *
 * @author scheerer
 *
 */
public class PcmSystemManager {

	private System system;

	public PcmSystemManager(System system) {
		this.system = system;
	}

	/**
	 * Filters the connectors which satisfies the given predicate.
	 *
	 * @param searchCriteria
	 *            - The search criteria for filtering the connectors.
	 * @return the filtered connectors.
	 */
	public List<Connector> getConnectorsBy(Predicate<Connector> searchCriteria) {
		List<Connector> result = new ArrayList<>();
		for (Connector c : this.getAllConnectors()) {
			if (searchCriteria.test(c)) {
				result.add(c);
			}
		}
		return result;
	}

	/**
	 * Checks if a given connector already exists.
	 *
	 * @param searchedConnector
	 *            - The connector that is checked for existence.
	 * @return
	 */
	public boolean existConnector(Connector searchedConnector) {
		for (Connector c : this.getAllConnectors()) {
			if (this.areEqual(c, searchedConnector)) {
				return true;
			}
		}
		return false;
		// return this.getAllConnectors().anyMatch(eachConnector ->
		// this.areEqual(eachConnector, searchedConnector));
	}

	private boolean areEqual(Connector givenConnector, Connector searchedConnector) {
		if (!givenConnector.getClass().equals(searchedConnector.getClass())) {
			return false;
		}
		return this.hasEqualRoles(this.getRolesOf(searchedConnector), this.getRolesOf(givenConnector));
	}

	private boolean hasEqualRoles(List<Role> searchedConnectorRoles, List<Role> givenConnectorRoles) {
		if (searchedConnectorRoles.size() != givenConnectorRoles.size()) {
			return false;
		}
		for (int i = 0; i < searchedConnectorRoles.size(); i++) {
			if (!searchedConnectorRoles.get(i).equals(givenConnectorRoles.get(i))) {
				return false;
			}
		}
		return true;
	}

	private List<Role> getRolesOf(Connector connector) {
		return new EcoreReferenceResolver(connector).getCrossReferencedElementsOfType(Role.class);
	}

	/**
	 * Removes a given connector from the PCm system.
	 *
	 * @param connectorToRemove
	 *            - The connector that is suppose to be removed.
	 */
	public void remove(Connector connectorToRemove) {
		this.system.getConnectors__ComposedStructure().remove(connectorToRemove);
	}

	private List<Connector> getAllConnectors() {
		return this.system.getConnectors__ComposedStructure();
	}

	/**
	 * Filters the assembly contexts which satisfies the given predicate.
	 *
	 * @param searchCriteria
	 *            - The search criteria for filtering the assembly contexts.
	 * @return the first filtered assembly context.
	 */
	public Optional<AssemblyContext> getAssemblyContextBy(Predicate<AssemblyContext> searchCriteria) {
		for (AssemblyContext ac : this.getAllAssemblyContexts()) {
			if (searchCriteria.test(ac)) {
				return Optional.of(ac);
			}
		}
		return Optional.empty();
		// return
		// this.getAllAssemblyContexts().filter(searchCriteria).findFirst();
	}

	/**
	 * Retrieves all assembly contexts which instantiates a given component.
	 *
	 * @param component
	 *            - The component which might be instantiated by an assembly
	 *            context.
	 * @return the set of assembly contexts instantiating the given component.
	 */
	public List<AssemblyContext> getAssemblyContextsInstantiating(RepositoryComponent component) {
		List<AssemblyContext> result = new ArrayList<>();
		for (AssemblyContext ac : this.getAllAssemblyContexts()) {
			RepositoryComponent ec = ac.getEncapsulatedComponent__AssemblyContext();
			if (FCCUtil.areEqual(ec, component)) {
				result.add(ac);
			}
		}
		return result;
	}

	private List<AssemblyContext> getAllAssemblyContexts() {
		return this.system.getAssemblyContexts__ComposedStructure();
	}

	/**
	 * Adds an assembly context to the PCM system.
	 *
	 * @param assemblyContextToAdd
	 *            - The assembly context to add.
	 */
	public void addAssemblyContext(AssemblyContext assemblyContextToAdd) {
		this.system.getAssemblyContexts__ComposedStructure().add(assemblyContextToAdd);
	}

	/**
	 * Adds a set of assembly contexts to the PCM system.
	 *
	 * @param assemblyContextsToAdd
	 *            - The set of assembly contexts to add.
	 */
	public void addAssemblyContexts(List<AssemblyContext> assemblyContextsToAdd) {
		this.system.getAssemblyContexts__ComposedStructure().addAll(assemblyContextsToAdd);
	}

	/**
	 * Adds a set of connectors to the PCM system.
	 *
	 * @param connectorsToAdd
	 *            - The connectors to add.
	 */
	public void addConnectors(Connector... connectorsToAdd) {
		this.addConnectors(Arrays.asList(connectorsToAdd));
	}

	/**
	 * Adds a set of connectors to the PCM system.
	 *
	 * @param connectorsToAdd
	 *            - The connectors to add.
	 */
	public void addConnectors(List<Connector> connectorsToAdd) {
		this.system.getConnectors__ComposedStructure().addAll(connectorsToAdd);
	}

	/**
	 * Creates a provided delegation connector by the outer provided role and
	 * the provided pair the actual calls are delegated to.
	 *
	 * @param outerProvidedRole
	 *            - The outer provided role.
	 * @param providedPair
	 *            - The provided pair.
	 * @return a newly created provided delegation connector.
	 */
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

	/**
	 * Creates a provided delegation connector by the outer required role and
	 * the required pair which actually requires a couple of services.
	 *
	 * @param outerRequiredRole
	 *            - The outer required role.
	 * @param requiredPair
	 *            - The required pair.
	 * @return a newly created required delegation connector.
	 */
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

	/**
	 * Creates an assembly connector given by a required pair including the
	 * corresponding assembly context and required role and a given provided
	 * pair including the corresponding assembly context and provided role.
	 *
	 * @param requiredPair
	 *            - The required pair.
	 * @param providedPair
	 *            - The provided pair.
	 * @return the newly created assembly connector.
	 */
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

	/**
	 * Creates an assembly event connector given by a required pair including
	 * the corresponding assembly context and required role and a given provided
	 * pair including the corresponding assembly context and provided role.
	 *
	 * @param requiredPair
	 *            - The required pair.
	 * @param providedPair
	 *            - The provided pair.
	 * @return the newly created assembly event connector.
	 */
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

	/**
	 * Creates the corresponding assembly contexts for a set of components.
	 *
	 * @param components
	 *            - The set of components that is going to be instantiated.
	 * @return the list of assembly contexts.
	 */
	public List<AssemblyContext> createAssemblyContextsOf(List<RepositoryComponent> components) {
		List<AssemblyContext> result = new ArrayList<>();
		for (RepositoryComponent c : components) {
			AssemblyContext ac = this.createAssemblyContextOf(c);
			result.add(ac);
		}
		return result;
	}

	/**
	 * Creates an assembly context for a component.
	 *
	 * @param component
	 *            - The component that is going to be instantiated.
	 * @return the created assembly context.
	 */
	public AssemblyContext createAssemblyContextOf(RepositoryComponent component) {
		AssemblyContext componentAssemblyContext = CompositionFactory.eINSTANCE.createAssemblyContext();
		componentAssemblyContext.setEncapsulatedComponent__AssemblyContext(component);
		componentAssemblyContext.setEntityName(String.format("%1sInstance", component.getEntityName()));

		return componentAssemblyContext;
	}

	/**
	 * Creates an assembly context with a specified name for a component.
	 *
	 * @param component
	 *            - The component that is going to be instantiated.
	 * @param name
	 *            - The name of assembly context.
	 * @return the created assembly context with a specific name.
	 */
	public AssemblyContext createAssemblyContextOf(RepositoryComponent component, String name) {
		AssemblyContext componentAssemblyContext = CompositionFactory.eINSTANCE.createAssemblyContext();
		componentAssemblyContext.setEncapsulatedComponent__AssemblyContext(component);
		componentAssemblyContext.setEntityName(name);

		return componentAssemblyContext;
	}

	/**
	 * Creates and adds an assembly context for a given component to the PCm
	 * system.
	 *
	 * @param component
	 *            - The component that is going to be instantiated and added to
	 *            the PCM system.
	 * @return the created assembly context.
	 */
	public AssemblyContext createAndAddAssemblyContextOf(RepositoryComponent component) {
		AssemblyContext assemblyContext = this.createAssemblyContextOf(component);
		this.addAssemblyContext(assemblyContext);
		return assemblyContext;
	}
}