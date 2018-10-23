package edu.kit.ipd.are.dsexplore.featurecompletions.weaver.strategy.adapter;

import org.palladiosimulator.pcm.core.composition.ProvidedDelegationConnector;
import org.palladiosimulator.pcm.repository.OperationProvidedRole;
import org.palladiosimulator.pcm.repository.RepositoryComponent;

import edu.kit.ipd.are.dsexplore.featurecompletions.weaver.strategy.WeavingLocation;

/**
 * This class is responsible to weave the adapter in the repository depending on
 * the connection of the components the adapter is inserted in between.
 *
 * @author scheerer
 *
 */
public class DelegationLocationRepositoryWeaving extends RepositoryWeaving {

	public DelegationLocationRepositoryWeaving(IAdapterWeaving parent) {
		super(parent);
	}

	/**
	 * @see AdapterRepositoryWeaving#weaveAdapterIntoRepository(WeavingLocation)
	 */
	@Override
	protected void weaveAdapterIntoRepository(WeavingLocation weavingLocation) {
		// TODO DTHF1: Check: creation only if needed

		ProvidedDelegationConnector location = (ProvidedDelegationConnector) weavingLocation.getLocation();

		OperationProvidedRole delegatedConnectionEnd = location.getOuterProvidedRole_ProvidedDelegationConnector();
		OperationProvidedRole providedConnectionEnd = location.getInnerProvidedRole_ProvidedDelegationConnector();

		RepositoryComponent adapter = this.parent.getAdapterComponent();

		adapter.getProvidedRoles_InterfaceProvidingEntity().add(this.parent.getSolutionManager().createProvidedRoleBy(delegatedConnectionEnd, adapter.getEntityName()));
		adapter.getRequiredRoles_InterfaceRequiringEntity().add(this.parent.getSolutionManager().createRequiredRoleBy(providedConnectionEnd));

	}

}
