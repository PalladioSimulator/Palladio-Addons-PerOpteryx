package edu.kit.ipd.are.dsexplore.featurecompletions.weaver.strategy.adapter;

import java.util.List;
import java.util.Optional;

import org.palladiosimulator.pcm.repository.ProvidedRole;
import org.palladiosimulator.pcm.repository.RepositoryComponent;
import org.palladiosimulator.pcm.repository.RequiredRole;

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
		String uniqueAdapterName = FCCUtil.createUniqueAdapterNameBy(weavingInstruction.getWeavingLocation().getLocation());
		if (weavingInstruction.getInclusionMechanism().isMultiple()) {
			this.parent.setAdapter(this.parent.getSolutionManager().createAndAddAdapter(uniqueAdapterName));
		} else {
			this.parent.setAdapter(this.getOrCreateAdapterComponent(uniqueAdapterName));
		}
	}

	private RepositoryComponent getOrCreateAdapterComponent(String name) {
		return this.getExistingAdapter(name).orElseGet(() -> this.parent.getSolutionManager().createAndAddAdapter(name));
	}

	// Assumption: When multiple == false then for each concern solution there
	// may exist only a single adapter component tops.
	private Optional<RepositoryComponent> getExistingAdapter(String name) {
		return this.parent.getSolutionManager().getComponentByName(name);
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
		RoleHandler roleHandler = RoleHandlerFactory.getBy(providedRole, this.parent.getSolutionManager()).orElseThrow(() -> new FCCWeaverException(ErrorMessage.unsupportedRole()));
		return roleHandler.createRequiredRoleOf(providedRole);
	}

	protected boolean isNotAlreadyContainedInAdapter(RequiredRole requiredRole) {
		RepositoryComponent rc = this.parent.getAdapterComponent();
		for (RequiredRole role : rc.getRequiredRoles_InterfaceRequiringEntity()) {
			if (role.getEntityName().equals(requiredRole.getEntityName())) {
				return false;
			}
		}
		return true;
		// return
		// !this.parent.getAdapterComponent().getRequiredRoles_InterfaceRequiringEntity().stream().anyMatch(eachRequRole
		// -> FCCUtil.referencesSameInterface(eachRequRole, requiredRole));
	}

	protected boolean isNotAlreadyContainedInAdapter(ProvidedRole providedRole) {
		RepositoryComponent rc = this.parent.getAdapterComponent();
		for (ProvidedRole role : rc.getProvidedRoles_InterfaceProvidingEntity()) {
			if (role.getEntityName().equals(providedRole.getEntityName())) {
				return false;
			}
		}
		return true;
		// return
		// !this.parent.getAdapterComponent().getRequiredRoles_InterfaceRequiringEntity().stream().anyMatch(eachRequRole
		// -> FCCUtil.referencesSameInterface(eachRequRole, requiredRole));
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
