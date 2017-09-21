package edu.kit.ipd.are.dsexplore.concern.manager;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;

import org.palladiosimulator.pcm.repository.BasicComponent;
import org.palladiosimulator.pcm.repository.ComponentType;
import org.palladiosimulator.pcm.repository.EventGroup;
import org.palladiosimulator.pcm.repository.OperationInterface;
import org.palladiosimulator.pcm.repository.OperationProvidedRole;
import org.palladiosimulator.pcm.repository.OperationRequiredRole;
import org.palladiosimulator.pcm.repository.ProvidedRole;
import org.palladiosimulator.pcm.repository.RepositoryComponent;
import org.palladiosimulator.pcm.repository.RepositoryFactory;
import org.palladiosimulator.pcm.repository.RequiredRole;
import org.palladiosimulator.pcm.repository.SinkRole;
import org.palladiosimulator.pcm.repository.SourceRole;

import ConcernModel.Annotation;
import SolutionModel.Solution;
import edu.kit.ipd.are.dsexplore.concern.emfprofilefilter.AnnotationFilter;

/**
 * This class provides all operations performed on a concern solution.
 *
 * @author scheerer
 *
 */
public class ConcernSolutionManager {

	private static ConcernSolutionManager eInstance = null;
	private Solution concernSolution = null;

	private ConcernSolutionManager() {
	}

	/**
	 * Creates or returns a ConcernSolutionManager-instance.
	 *
	 * @param concernSolution
	 *            - A given concern solution.
	 * @return a ConcernSolutionManager-instance.
	 */
	public static ConcernSolutionManager getInstanceBy(Solution concernSolution) {
		if (ConcernSolutionManager.eInstance == null) {
			ConcernSolutionManager.eInstance = new ConcernSolutionManager();
		}
		ConcernSolutionManager.eInstance.concernSolution = concernSolution;
		return ConcernSolutionManager.eInstance;
	}

	/**
	 * Filters the component which satisfies the given predicate.
	 *
	 * @param searchCriteria
	 *            - The search criteria for filtering the components.
	 * @return the first filtered component.
	 */
	public Optional<RepositoryComponent> getComponentBy(Predicate<RepositoryComponent> searchCriteria) {
		for (RepositoryComponent c : this.getAllComponents()) {
			if (searchCriteria.test(c)) {
				return Optional.of(c);
			}
		}
		return Optional.empty();
		// return this.getAllComponents().filter(searchCriteria).findFirst();
	}

	/**
	 * Retrieves all components annotated by a set of annotations.
	 *
	 * @param annotations
	 *            - The set of annotations.
	 * @return all components annotated by a set of annotations.
	 */
	public List<RepositoryComponent> getComponentsAnnotatedWith(List<Annotation> annotations) {
		return new AnnotationFilter(Arrays.asList(this.concernSolution.getRepository())).getComponentsAnnotatedWith(annotations);
	}

	private List<RepositoryComponent> getAllComponents() {
		return this.concernSolution.getRepository().getComponents__Repository();
	}

	/**
	 * Creates and add a adapter component to the concern solution repository.
	 *
	 * @param name
	 *            - The name of the adapter component.
	 * @return the created adapter component.
	 */
	public RepositoryComponent createAndAddAdapter(String name) {
		BasicComponent adapter = this.createAdapter(name);
		this.addAdapter(adapter);
		return adapter;
	}

	private void addAdapter(BasicComponent adapter) {
		this.concernSolution.getRepository().getComponents__Repository().add(adapter);
	}

	private BasicComponent createAdapter(String name) {
		BasicComponent adapter = RepositoryFactory.eINSTANCE.createBasicComponent();
		adapter.setComponentType(ComponentType.BUSINESS_COMPONENT);
		adapter.setEntityName(name);
		return adapter;
	}

	/**
	 * Creates a required role based on the complimentary operation provided
	 * role.
	 *
	 * @param providedRole
	 *            - The complimentary operation provided role.
	 * @return the created required role.
	 */
	public RequiredRole createRequiredRoleBy(OperationProvidedRole providedRole) {
		OperationInterface referencedInterface = providedRole.getProvidedInterface__OperationProvidedRole();
		OperationRequiredRole requiredRole = RepositoryFactory.eINSTANCE.createOperationRequiredRole();
		requiredRole.setEntityName(String.format("requires%2s", referencedInterface.getEntityName()));
		requiredRole.setRequiredInterface__OperationRequiredRole(referencedInterface);
		return requiredRole;
	}

	/**
	 * Creates a required role based on the complimentary provided sink role.
	 *
	 * @param sinkRole
	 *            - The complimentary provided sink role.
	 * @return the created required role.
	 */
	public RequiredRole createRequiredRoleBy(SinkRole sinkRole) {
		EventGroup referencedEventGroup = sinkRole.getEventGroup__SinkRole();
		SourceRole sourceRole = RepositoryFactory.eINSTANCE.createSourceRole();
		sourceRole.setEntityName(String.format("sourceOf%2s", referencedEventGroup.getEntityName()));
		sourceRole.setEventGroup__SourceRole(referencedEventGroup);
		return sourceRole;
	}

	/**
	 * Creates a provided role based on the complimentary operation required
	 * role.
	 *
	 * @param requiredRole
	 *            - The complimentary operation required role.
	 * @return the created provided role.
	 */
	public ProvidedRole createProvidedRoleBy(OperationRequiredRole requiredRole) {
		OperationInterface referencedInterface = requiredRole.getRequiredInterface__OperationRequiredRole();
		OperationProvidedRole providedRole = RepositoryFactory.eINSTANCE.createOperationProvidedRole();
		providedRole.setEntityName(String.format("provides%2s", referencedInterface.getEntityName()));
		providedRole.setProvidedInterface__OperationProvidedRole(referencedInterface);
		return providedRole;
	}

	/**
	 * Creates a provided role based on the complimentary required source role.
	 *
	 * @param sourceRole
	 *            - The complimentary required source role.
	 * @return the created provided role.
	 */
	public ProvidedRole createProvidedRoleBy(SourceRole sourceRole) {
		EventGroup referencedInterface = sourceRole.getEventGroup__SourceRole();
		SinkRole sinkRole = RepositoryFactory.eINSTANCE.createSinkRole();
		sinkRole.setEntityName(String.format("provides%2s", referencedInterface.getEntityName()));
		sinkRole.setEventGroup__SinkRole(referencedInterface);
		return sinkRole;
	}

	/**
	 * Creates a provided role based on a provided interface of another
	 * operation provided role.
	 *
	 * @param sourceRole
	 *            - The operation provided role referencing the provided
	 *            interface.
	 * @return the created provided role.
	 */
	public ProvidedRole createProvidedRoleBy(OperationProvidedRole providedRole, String name) {
		OperationInterface referencedInterface = providedRole.getProvidedInterface__OperationProvidedRole();

		OperationProvidedRole newProvidedRole = RepositoryFactory.eINSTANCE.createOperationProvidedRole();
		newProvidedRole.setEntityName(String.format("%1s_%2s", providedRole.getEntityName(), name));
		newProvidedRole.setProvidedInterface__OperationProvidedRole(referencedInterface);

		return newProvidedRole;
	}

	/**
	 * Creates the provided role space which contains all provided roles that
	 * occur in the concern solution repository.
	 *
	 * @return the provided role space.
	 */
	public List<ProvidedRole> getAllProvidedRoles() {
		List<ProvidedRole> roles = new ArrayList<>();
		for (RepositoryComponent c : this.concernSolution.getRepository().getComponents__Repository()) {
			List<ProvidedRole> role = this.getAllProvidedRolesOf(c);
			roles.addAll(role);
		}
		return roles;
		// return
		// this.concernSolution.getComponents__Repository().stream().flatMap(eachComponent
		// ->
		// this.getAllProvidedRolesOf(eachComponent)).collect(Collectors.toList());
	}

	private List<ProvidedRole> getAllProvidedRolesOf(RepositoryComponent component) {
		return component.getProvidedRoles_InterfaceProvidingEntity();
		// .stream().map(each -> each);
	}
}
