package edu.kit.ipd.are.dsexplore.featurecompletions.weaver.strategy.adapter;

import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;

import org.palladiosimulator.pcm.repository.ProvidedRole;
import org.palladiosimulator.pcm.repository.Repository;
import org.palladiosimulator.pcm.repository.RepositoryComponent;
import org.palladiosimulator.pcm.repository.RequiredRole;

import de.uka.ipd.sdq.dsexplore.tools.stereotypeapi.EMFProfileFilter;
import edu.kit.ipd.are.dsexplore.featurecompletions.weaver.ErrorMessage;
import edu.kit.ipd.are.dsexplore.featurecompletions.weaver.FCCUtil;
import edu.kit.ipd.are.dsexplore.featurecompletions.weaver.port.FCCWeaverException;
import edu.kit.ipd.are.dsexplore.featurecompletions.weaver.strategy.WeavingInstruction;
import edu.kit.ipd.are.dsexplore.featurecompletions.weaver.strategy.WeavingLocation;
import edu.kit.ipd.are.dsexplore.featurecompletions.weaver.strategy.handler.RoleHandler;
import edu.kit.ipd.are.dsexplore.featurecompletions.weaver.strategy.handler.RoleHandlerFactory;

/**
 * This class is responsible for weaving the repository view-type in the context
 * of the adapter transformation strategy.
 *
 * @author scheerer
 *
 */
public abstract class RepositoryWeaving {
	protected final IAdapterWeaving parent;

	public RepositoryWeaving(IAdapterWeaving parent) {
		this.parent = parent;
	}

	public void weave(WeavingInstruction weavingInstruction) throws FCCWeaverException {
		this.setAdapterComponentRegarding(weavingInstruction);
		this.connectAdapterTo(weavingInstruction.getFCCWithConsumedFeatures().getSecond());
		this.weaveAdapterIntoRepository(weavingInstruction.getWeavingLocation());
	}

	private void setAdapterComponentRegarding(WeavingInstruction weavingInstruction) {
		ProvidedRole prOfSolution = weavingInstruction.getFCCWithConsumedFeatures().getSecond().get(0);
		Repository targetRepository = (Repository) prOfSolution.eContainer().eContainer();
		String uniqueAdapterName = FCCUtil.createUniqueAdapterNameBy(weavingInstruction.getWeavingLocation().getLocation());
		if (weavingInstruction.getInclusionMechanism().isMultiple()) {
			this.parent.setAdapter(this.parent.getMergedRepoManager().createAndAddAdapter(uniqueAdapterName, targetRepository));
		} else {
			this.parent.setAdapter(this.getOrCreateAdapterComponent(uniqueAdapterName, targetRepository));
		}
	}

	private RepositoryComponent getOrCreateAdapterComponent(String name, Repository targetRepository) {
		return this.getExistingAdapter().orElseGet(() -> this.parent.getMergedRepoManager().createAndAddAdapter(name, targetRepository));
	}

	// Assumption: When multiple == false then for each concern solution there
	// may exist only a single adapter component tops.
	private Optional<RepositoryComponent> getExistingAdapter() {
		return this.parent.getMergedRepoManager().getComponentBy(this.getAdapterComponentSearchCriteria());
	}

	// An adapter component is not annotated
	private Predicate<RepositoryComponent> getAdapterComponentSearchCriteria() {
		return component -> !EMFProfileFilter.isAnnotated(component);
	}

	private void connectAdapterTo(List<ProvidedRole> providedECCFeatures) throws FCCWeaverException {
		for (ProvidedRole eachProvidedFeature : providedECCFeatures) {
			RequiredRole complimentaryRequiredRole = this.createComplimentaryRequiredRoleOf(eachProvidedFeature);
			if (this.isNotAlreadyContainedInAdapter(complimentaryRequiredRole)) {
				this.parent.getAdapterComponent().getRequiredRoles_InterfaceRequiringEntity().add(complimentaryRequiredRole);
			}
		}
	}

	private RequiredRole createComplimentaryRequiredRoleOf(ProvidedRole providedRole) throws FCCWeaverException {
		RoleHandler roleHandler = RoleHandlerFactory.getBy(providedRole, this.parent.getMergedRepoManager()).orElseThrow(() -> new FCCWeaverException(ErrorMessage.unsupportedRole()));
		return roleHandler.createRequiredRoleOf(providedRole);
	}

	private boolean isNotAlreadyContainedInAdapter(RequiredRole requiredRole) {
		return !this.parent.getAdapterComponent().getRequiredRoles_InterfaceRequiringEntity().stream().anyMatch(eachRequRole -> FCCUtil.referencesSameInterface(eachRequRole, requiredRole));
	}

	/**
	 * The implementer of this method realizes the integration of the adapter in
	 * the repository where each implementation considers different weaving
	 * locations regarding the connection of the components that are going to be
	 * modified.
	 *
	 * @param weavingLocation
	 *            - Contains the weaving location informations.
	 */
	protected abstract void weaveAdapterIntoRepository(WeavingLocation weavingLocation);
}
