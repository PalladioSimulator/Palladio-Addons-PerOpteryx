package de.uka.ipd.sdq.dsexplore.tools.repository;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.palladiosimulator.pcm.repository.BasicComponent;
import org.palladiosimulator.pcm.repository.ComponentType;
import org.palladiosimulator.pcm.repository.ProvidedRole;
import org.palladiosimulator.pcm.repository.Repository;
import org.palladiosimulator.pcm.repository.RepositoryComponent;
import org.palladiosimulator.pcm.repository.RepositoryFactory;

import FeatureCompletionModel.CompletionComponent;
import de.uka.ipd.sdq.dsexplore.tools.stereotypeapi.StereotypeAPIHelper;
import de.uka.ipd.sdq.pcm.cost.CostRepository;

/**
 * This class realizes a {@link Repository} which consists of many
 * {@link Repository Repositories}.
 *
 * @author Dominik Fuchss
 *
 */
public final class MergedRepository extends EObjectImpl implements Iterable<Repository> {
	private final Set<Repository> repositories;
	private Repository repoWithoutAnnotations;

	public MergedRepository(Repository... repositories) {
		this.repositories = new HashSet<>();
		this.repositories.addAll(Arrays.asList(repositories));
		this.createRepo();
	}

	public MergedRepository(List<Repository> repositories) {
		this.repositories = new HashSet<>();
		this.repositories.addAll(repositories);
		this.createRepo();
	}

	public MergedRepository(Set<Repository> repositories) {
		this.repositories = new HashSet<>();
		this.repositories.addAll(repositories);
		this.createRepo();
	}

	private void createRepo() {
		Repository repo = RepositoryFactory.eINSTANCE.createRepository();
		for (Repository r : this.repositories) {
			repo.getComponents__Repository().addAll(r.getComponents__Repository());
		}
		this.repoWithoutAnnotations = repo;

	}

	public List<CostRepository> getCostRepos() {
		Set<CostRepository> repos = new HashSet<>();
		for (Repository repo : this.repositories) {
			repos.addAll(StereotypeAPIHelper.getViaStereoTypeFrom(repo, CostRepository.class));
		}
		return new ArrayList<>(repos);
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
		for (Repository repo : this.repositories) {
			for (RepositoryComponent rcs : repo.getComponents__Repository()) {
				List<CompletionComponent> realizedCCs = StereotypeAPIHelper.getViaStereoTypeFrom(rcs, CompletionComponent.class);
				if (this.anyContainedInList(realizedCCs, fccs)) {
					affectedComponents.add(rcs);
				}
			}
		}
		return new ArrayList<>(affectedComponents);
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
		this.addAdapter(adapter);
		return adapter;
	}

	private BasicComponent createAdapter(String name) {
		BasicComponent adapter = RepositoryFactory.eINSTANCE.createBasicComponent();
		adapter.setComponentType(ComponentType.BUSINESS_COMPONENT);
		adapter.setEntityName(name);
		return adapter;
	}

	private void addAdapter(BasicComponent adapter) {
		this.repoWithoutAnnotations.getComponents__Repository().add(adapter);
	}

	public Repository getAsRepoWithoutStereotypes() {
		return this.repoWithoutAnnotations;
	}

	public List<ProvidedRole> getAllProvidedRoles() {
		List<ProvidedRole> prs = new ArrayList<>();

		for (Repository repo : this.repositories) {
			for (RepositoryComponent c : repo.getComponents__Repository()) {
				List<ProvidedRole> role = c.getProvidedRoles_InterfaceProvidingEntity();
				prs.addAll(role);
			}
		}
		return prs;
	}

	@Override
	public Iterator<Repository> iterator() {
		return this.repositories.iterator();
	}

}
