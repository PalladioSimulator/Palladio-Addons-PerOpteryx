package edu.kit.ipd.are.dsexplore.featurecompletions.weaver.strategy.manager;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import org.osgi.framework.hooks.weaving.WeavingException;
import org.palladiosimulator.pcm.repository.EventGroup;
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

import FeatureCompletionModel.ComplementumVisnetis;
import FeatureCompletionModel.CompletionComponent;
import de.uka.ipd.sdq.dsexplore.tools.repository.MergedRepository;
import de.uka.ipd.sdq.dsexplore.tools.stereotypeapi.StereotypeAPIHelper;

/**
 * This class provides all operations performed on a {@link MergedRepository}
 * (former concern solution).
 *
 * @author scheerer
 *
 */
public final class MergedRepoManager implements Iterable<Repository> {

	private MergedRepository mergedRepo = null;

	public MergedRepoManager(MergedRepository mergedRepo) {
		this.mergedRepo = mergedRepo;
	}

	/**
	 * Filters the component which satisfies the given predicate.
	 *
	 * @param searchCriteria
	 *            - The search criteria for filtering the components.
	 * @return the first filtered component.
	 */
	public Optional<RepositoryComponent> getComponentBy(Predicate<RepositoryComponent> searchCriteria) {
		for (Repository repo : this.mergedRepo) {
			for (RepositoryComponent c : repo.getComponents__Repository()) {
				if (searchCriteria.test(c)) {
					return Optional.of(c);
				}
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
		return new ArrayList<>(this.mergedRepo.getAffectedComponentsByFCCList(fccs));
	}

	// TODO new for extension
	public List<RepositoryComponent> getAffectedComponentsByFCCList(List<CompletionComponent> fccs, Repository repo) {
		Set<RepositoryComponent> affectedComponents = new HashSet<>();
		// TODO wenn das MergedRepo dann eh nur noch eine Solution enthält, kann
		// der repo-Parameter wegfallen
		for (RepositoryComponent rcs : repo.getComponents__Repository()) {
			List<CompletionComponent> realizedCCs = StereotypeAPIHelper.getViaStereoTypeFrom(rcs, CompletionComponent.class);
			if (this.anyContainedInList(realizedCCs, fccs)) {
				affectedComponents.add(rcs);
			}
		}

		return new ArrayList<>(affectedComponents);
	}

	// TODO new for extension
	public List<RepositoryComponent> getRealizingComponentsByFCCList(List<CompletionComponent> fccs, ProvidedRole providedRole, List<ComplementumVisnetis> cvs) {
		for (Repository repo : this.mergedRepo) {
			List<RepositoryComponent> affectedComponents = new ArrayList<>();
			for (CompletionComponent completionComponent : fccs) {
				List<RepositoryComponent> realizingComponents = new ArrayList<>();
				for (RepositoryComponent rcs : repo.getComponents__Repository()) {
					List<CompletionComponent> realizedCCs = StereotypeAPIHelper.getViaStereoTypeFrom(rcs, CompletionComponent.class);
					if (this.anyContainedInList(realizedCCs, Arrays.asList(
							completionComponent)) /*
													 * && anyCVcontainedInList
													 * (rcs, cvs)
													 */) {
						realizingComponents.add(rcs);
					}
				}
				if (realizingComponents.size() != 1) {
					RepositoryComponent component = MergedRepoManager.getComponentFullfillingCV(realizingComponents, cvs);
					affectedComponents.add(component);
				} else {
					affectedComponents.addAll(realizingComponents);
				}
			}
			if (affectedComponents.stream().anyMatch(component -> component.getProvidedRoles_InterfaceProvidingEntity().stream().anyMatch(role -> role.getId().equals(providedRole.getId())))) {
				return affectedComponents;
			}
		}
		return null;
	}

	// TODO new for extension
	public static RepositoryComponent getComponentFullfillingCV(List<RepositoryComponent> realizingComponents, List<ComplementumVisnetis> cvs) {
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
			// TODO verschiedene targets betrachten -> component, interface,
			// signature
			if (MergedRepoManager.anyCVcontainedInList(fullfilledByComponentCVs, cvs) || MergedRepoManager.anyCVcontainedInList(fullfilledByInterfaceCVs, cvs)
					|| MergedRepoManager.anyCVcontainedInList(fullfilledBySignatureCVs, cvs)) {
				return repositoryComponent;
			}
		}
		throw new WeavingException("no realizing component for completion components found or ambigous components found");
	}

	private static boolean anyCVcontainedInList(List<ComplementumVisnetis> fullfilledCVs, List<ComplementumVisnetis> cvs) {
		for (ComplementumVisnetis complementumVisnetis : fullfilledCVs) {
			if (cvs.stream().anyMatch(cv -> cv.getId().equals(complementumVisnetis.getId()))) {
				return true;
			}
		}
		return false;
	}

	// TODO added for extension
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
	public RepositoryComponent createAndAddAdapter(String name, Repository solutionRepo) {
		return this.mergedRepo.createAndAddAdapter(name, solutionRepo);
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
		return this.mergedRepo.getAllProvidedRoles();
	}

	@Override
	public Iterator<Repository> iterator() {
		return this.mergedRepo.iterator();
	}
}
