package edu.kit.ipd.are.dsexplore.concern.weavingstrategy.adapter;

import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;

import org.palladiosimulator.pcm.repository.ProvidedRole;
import org.palladiosimulator.pcm.repository.RepositoryComponent;
import org.palladiosimulator.pcm.repository.RequiredRole;

import edu.kit.ipd.are.dsexplore.concern.concernweaver.WeavingInstruction;
import edu.kit.ipd.are.dsexplore.concern.concernweaver.WeavingLocation;
import edu.kit.ipd.are.dsexplore.concern.emfprofilefilter.EMFProfileFilter;
import edu.kit.ipd.are.dsexplore.concern.exception.ConcernWeavingException;
import edu.kit.ipd.are.dsexplore.concern.exception.ErrorMessage;
import edu.kit.ipd.are.dsexplore.concern.handler.RoleHandler;
import edu.kit.ipd.are.dsexplore.concern.handler.RoleHandlerFactory;
import edu.kit.ipd.are.dsexplore.concern.util.ConcernWeaverUtil;

/**
 * This class is responsible for weaving the repository view-type in the context
 * of the adapter transformation strategy.
 *
 * @author scheerer
 *
 */
public abstract class AdapterRepositoryWeaving extends AdapterWeaving {

	/**
	 * @see AdapterWeaving#weave(WeavingInstruction)
	 */
	@Override
	public void weave(WeavingInstruction weavingInstruction) throws ConcernWeavingException {
		this.setAdapterComponentRegarding(weavingInstruction);
		this.connectAdapterTo(weavingInstruction.getECCWithConsumedFeatures().getSecond());
		this.weaveAdapterIntoRepository(weavingInstruction.getWeavingLocation());
	}

	private void setAdapterComponentRegarding(WeavingInstruction weavingInstruction) {
		String uniqueAdapterName = ConcernWeaverUtil.createUniqueAdapterNameBy(weavingInstruction.getWeavingLocation().getLocation());
		if (weavingInstruction.getTransformationStrategy().isMultiple()) {
			AdapterWeaving.setAdapterComponent(AdapterWeaving.concernRepositoryManager.createAndAddAdapter(uniqueAdapterName));
		} else {
			AdapterWeaving.setAdapterComponent(this.getOrCreateAdapterComponent(uniqueAdapterName));
		}
	}

	private RepositoryComponent getOrCreateAdapterComponent(String name) {
		return this.getExistingAdapter().orElseGet(() -> AdapterWeaving.concernRepositoryManager.createAndAddAdapter(name));
	}

	// Assumption: When multiple == false then for each concern solution there
	// may exist only a single adapter component tops.
	private Optional<RepositoryComponent> getExistingAdapter() {
		return AdapterWeaving.concernRepositoryManager.getComponentBy(this.getAdapterComponentSearchCriteria());
	}

	// An adapter component is not annotated
	private Predicate<RepositoryComponent> getAdapterComponentSearchCriteria() {
		return component -> !EMFProfileFilter.isAnnotated(component);
	}

	private void connectAdapterTo(List<ProvidedRole> providedECCFeatures) throws ConcernWeavingException {
		for (ProvidedRole eachProvidedFeature : providedECCFeatures) {
			RequiredRole complimentaryRequiredRole = this.createComplimentaryRequiredRoleOf(eachProvidedFeature);
			if (this.isNotAlreadyContainedInAdapter(complimentaryRequiredRole)) {
				AdapterWeaving.adapter.getRequiredRoles_InterfaceRequiringEntity().add(complimentaryRequiredRole);
			}
		}
	}

	private RequiredRole createComplimentaryRequiredRoleOf(ProvidedRole providedRole) throws ConcernWeavingException {
		RoleHandler roleHandler = RoleHandlerFactory.getBy(providedRole, AdapterWeaving.concernRepositoryManager).orElseThrow(() -> new ConcernWeavingException(ErrorMessage.unsupportedRole()));
		return roleHandler.createRequiredRoleOf(providedRole);
	}

	private boolean isNotAlreadyContainedInAdapter(RequiredRole requiredRole) {
		return !AdapterWeaving.adapter.getRequiredRoles_InterfaceRequiringEntity().stream().anyMatch(eachRequRole -> ConcernWeaverUtil.referencesSameInterface(eachRequRole, requiredRole));
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