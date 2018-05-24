package edu.kit.ipd.are.dsexplore.featurecompletions.weaver.strategy.adapter;

import org.palladiosimulator.pcm.core.composition.ProvidedDelegationConnector;
import org.palladiosimulator.pcm.repository.OperationProvidedRole;

import edu.kit.ipd.are.dsexplore.featurecompletions.weaver.strategy.WeavingLocation;

/**
 * This class is responsible to weave the adapter in the repository depending on
 * the connection of the components the adapter is inserted in between.
 *
 * @author scheerer
 *
 */
public class DelegationLocationRepositoryWeaving extends RepositoryWeaving {

	/**
	 * @see AdapterRepositoryWeaving#weaveAdapterIntoRepository(WeavingLocation)
	 */
	@Override
	protected void weaveAdapterIntoRepository(WeavingLocation weavingLocation) {
		ProvidedDelegationConnector location = (ProvidedDelegationConnector) weavingLocation.getLocation();

		OperationProvidedRole delegatedConnectionEnd = location.getOuterProvidedRole_ProvidedDelegationConnector();
		OperationProvidedRole providedConnectionEnd = location.getInnerProvidedRole_ProvidedDelegationConnector();

		AdapterWeaving.adapter.getProvidedRoles_InterfaceProvidingEntity()
				.add(AdapterWeaving.concernRepositoryManager.createProvidedRoleBy(delegatedConnectionEnd, AdapterWeaving.adapter.getEntityName()));
		AdapterWeaving.adapter.getRequiredRoles_InterfaceRequiringEntity().add(AdapterWeaving.concernRepositoryManager.createRequiredRoleBy(providedConnectionEnd));

	}

}
