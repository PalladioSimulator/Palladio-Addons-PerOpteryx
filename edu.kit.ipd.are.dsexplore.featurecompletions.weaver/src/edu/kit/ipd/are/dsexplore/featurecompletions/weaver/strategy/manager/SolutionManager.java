package edu.kit.ipd.are.dsexplore.featurecompletions.weaver.strategy.manager;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

import org.osgi.framework.hooks.weaving.WeavingException;

import org.palladiosimulator.pcm.repository.BasicComponent;
import org.palladiosimulator.pcm.repository.ComponentType;
import org.palladiosimulator.pcm.repository.EventGroup;
import org.palladiosimulator.pcm.repository.OperationInterface;
import org.palladiosimulator.pcm.repository.OperationProvidedRole;
import org.palladiosimulator.pcm.repository.OperationRequiredRole;
import org.palladiosimulator.pcm.repository.OperationSignature;
import org.palladiosimulator.pcm.repository.ProvidedRole;
import org.palladiosimulator.pcm.repository.Repository;
import org.palladiosimulator.pcm.repository.RepositoryComponent;
import org.palladiosimulator.pcm.repository.RepositoryFactory;
import org.palladiosimulator.pcm.repository.RequiredRole;
import org.palladiosimulator.pcm.repository.SinkRole;
import org.palladiosimulator.pcm.repository.SourceRole;

import FeatureCompletionModel.Complementum;
import FeatureCompletionModel.ComplementumVisnetis;
import FeatureCompletionModel.CompletionComponent;
import FeatureCompletionModel.impl.ComplementumImpl;

import de.uka.ipd.sdq.dsexplore.tools.repository.MergedRepository;
import de.uka.ipd.sdq.dsexplore.tools.stereotypeapi.StereotypeAPIHelper;

/**
 * This class provides all operations performed on a {@link MergedRepository}
 * (former concern solution).
 *
 * @author scheerer, Maximilian Eckert (maximilian.eckert@student.kit.edu, maxieckert@web.de)
 *
 */
public final class SolutionManager {

	private Repository solution = null;

	public SolutionManager(Repository solution) {
		this.solution = solution;
	}

	public Optional<RepositoryComponent> getComponentByName(String name) {
		for (RepositoryComponent c : this.solution.getComponents__Repository()) {
			if (c.getEntityName().equals(name)) {
				return Optional.of(c);
			}
		}
		return Optional.empty();
	}

	/**
	 * Retrieves all components annotated by a set of annotations.
	 *
	 * @param annotations
	 *            - The set of annotations.
	 * @return all components annotated by a set of annotations.
	 */
	public List<RepositoryComponent> getAffectedComponentsByFCCList(List<CompletionComponent> fccs) {
		Set<RepositoryComponent> affectedComponents = new HashSet<>();
		for (RepositoryComponent rcs : this.solution.getComponents__Repository()) {
			List<CompletionComponent> realizedCCs = StereotypeAPIHelper.getViaStereoTypeFrom(rcs, CompletionComponent.class);
			if (this.anyContainedInList(realizedCCs, fccs)) {
				affectedComponents.add(rcs);
			}

		}
		return new ArrayList<>(affectedComponents);
	}

	/**
	 * Determines the set of solution components that realize the given FCCs and provide the given CVs.
	 * 
	 * @param fccs the given FCCs corresponding to the fc meta architecture.
	 * @param providedRole the perimeter provided role.
	 * @param cvs the given CVs.
	 * @return the set of solution components that realize the given FCCs and provide the given CVs.
	 */
	public List<RepositoryComponent> getRealizingComponentsByFCCList(List<CompletionComponent> fccs, ProvidedRole providedRole, List<ComplementumVisnetis> cvs) {
		List<RepositoryComponent> affectedComponents = new ArrayList<>();
		for (CompletionComponent completionComponent : fccs) {
			List<RepositoryComponent> realizingComponents = new ArrayList<>();
			for (RepositoryComponent rcs : this.solution.getComponents__Repository()) {
				List<CompletionComponent> realizedCCs = StereotypeAPIHelper.getViaStereoTypeFrom(rcs, CompletionComponent.class);
				if (this.anyContainedInList(realizedCCs, Arrays.asList(completionComponent))) {
					realizingComponents.add(rcs);
				}
			}
			RepositoryComponent component = this.getComponentFullfillingCV(realizingComponents, cvs);
			affectedComponents.add(component);
		}
		if (affectedComponents.stream().anyMatch(component -> component.getProvidedRoles_InterfaceProvidingEntity().stream().anyMatch(role -> role.getId().equals(providedRole.getId())))) {
			return affectedComponents;
		}
		return null;
	}

	/**
	 * Determines a solution component in the set of realizing components that fulfills/provides a CV.
	 * 
	 * @param realizingComponents the set of realizing components.
	 * @param cvs the CVs.
	 * @return a solution component in the set of realizing components that fulfills/provides a CV.
	 */
	public RepositoryComponent getComponentFullfillingCV(List<RepositoryComponent> realizingComponents, List<ComplementumVisnetis> cvs) {
		for (RepositoryComponent repositoryComponent : realizingComponents) {
			// Visnetum at component
			List<ComplementumVisnetis> fullfilledByComponentCVs = StereotypeAPIHelper.getViaStereoTypeFrom(repositoryComponent, ComplementumVisnetis.class);
			// Visnetum at interface
			List<ComplementumVisnetis> fullfilledByInterfaceCVs = repositoryComponent.getProvidedRoles_InterfaceProvidingEntity().stream()
					.flatMap(role -> StereotypeAPIHelper.getViaStereoTypeFrom(((OperationProvidedRole) role).getProvidedInterface__OperationProvidedRole(), ComplementumVisnetis.class).stream())
					.collect(Collectors.toList());
			// Visnetum at signature
			List<ComplementumVisnetis> fullfilledBySignatureCVs = repositoryComponent.getProvidedRoles_InterfaceProvidingEntity().stream()
					.flatMap(role -> ((OperationProvidedRole) role).getProvidedInterface__OperationProvidedRole().getSignatures__OperationInterface().stream())
					.flatMap(signature -> StereotypeAPIHelper.getViaStereoTypeFrom(signature, ComplementumVisnetis.class).stream()).collect(Collectors.toList());

			if (SolutionManager.anyCVcontainedInList(fullfilledByComponentCVs, cvs) 
					|| SolutionManager.anyCVcontainedInList(fullfilledByInterfaceCVs, cvs)
					|| SolutionManager.anyCVcontainedInList(fullfilledBySignatureCVs, cvs)) {
				return repositoryComponent;
			}
		}
		throw new WeavingException("no realizing component for a cv in " + cvs.stream().map(cv -> cv.getName()).reduce((s1,s2) -> s1 + "," + s2).get() + " found or ambigous components found in solution repo " + this.solution.getEntityName());
	}

	public static boolean anyCVcontainedInList(List<ComplementumVisnetis> fullfilledCVs, List<ComplementumVisnetis> cvs) {
		for (ComplementumVisnetis complementumVisnetis : fullfilledCVs) {
			if (cvs.stream().anyMatch(cv -> cv.getId().equals(complementumVisnetis.getId()))) {
				return true;
			}
		}
		return false;
	}

	private boolean anyContainedInList(List<CompletionComponent> realizedCCs, List<CompletionComponent> listToContainedIn) {
		for (CompletionComponent completionComponent : realizedCCs) {
			if (listToContainedIn.contains(completionComponent)) {
				return true;
			}
		}
		return false;
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
		this.solution.getComponents__Repository().add(adapter);
		return adapter;
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
		List<ProvidedRole> prs = new ArrayList<>();
		for (RepositoryComponent c : this.solution.getComponents__Repository()) {
			List<ProvidedRole> role = c.getProvidedRoles_InterfaceProvidingEntity();
			prs.addAll(role);
		}
		return prs;
	}

	public Repository getRepository() {
		return this.solution;
	}

	/**
	 * Determines a solution component that fulfills the given complementum.
	 * 
	 * @param complementum the given complementum.
	 * @return a solution component that fulfills the given complementum.
	 */
	public RepositoryComponent getFulfillingComponentForComplementum(ComplementumImpl complementum) {
		for (RepositoryComponent c : this.solution.getComponents__Repository()) { //Assumption: Complementum has to be in solution repo?
			for (ProvidedRole role : c.getProvidedRoles_InterfaceProvidingEntity()) {
				List<Complementum> complementa = StereotypeAPIHelper.getViaStereoTypeFrom(((OperationProvidedRole) role).getProvidedInterface__OperationProvidedRole(), Complementum.class);
				if (!complementa.isEmpty() && complementa.get(0).getId().equals(complementum.getId())) {
					return c;
				}
			}
		}
		return null;
	}

	/**
	 * Determines the signature that has to be called to fulfill the CV.
	 * 
	 * @param operationInterface the interface containing all possible signatures.
	 * @return the signature that has to be called to fulfill the CV.
	 */
	public OperationSignature getFulfillingSignatureFrom(OperationInterface operationInterface) {
		return operationInterface.getSignatures__OperationInterface().get(0);	//TODO welche Signatur nehmen???
	}

}
