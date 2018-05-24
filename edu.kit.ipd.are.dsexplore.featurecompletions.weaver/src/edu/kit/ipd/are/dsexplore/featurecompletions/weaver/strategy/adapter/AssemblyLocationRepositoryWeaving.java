package edu.kit.ipd.are.dsexplore.featurecompletions.weaver.strategy.adapter;

import org.palladiosimulator.pcm.core.composition.AssemblyConnector;
import org.palladiosimulator.pcm.repository.OperationProvidedRole;
import org.palladiosimulator.pcm.repository.OperationRequiredRole;

import edu.kit.ipd.are.dsexplore.featurecompletions.weaver.strategy.WeavingLocation;

/**
 * This class weaves an adapter into a repository where the connection of the
 * components the adapter is inserted in between is an assembly connection.
 *
 * @author scheerer
 *
 */
public class AssemblyLocationRepositoryWeaving extends RepositoryWeaving {

	@Override
	protected void weaveAdapterIntoRepository(WeavingLocation weavingLocation) {
		AssemblyConnector location = (AssemblyConnector) weavingLocation.getLocation();

		OperationRequiredRole requiredConnectionEnd = location.getRequiredRole_AssemblyConnector();
		OperationProvidedRole providedConnectionEnd = location.getProvidedRole_AssemblyConnector();

		AdapterWeaving.adapter.getProvidedRoles_InterfaceProvidingEntity().add(AdapterWeaving.concernRepositoryManager.createProvidedRoleBy(requiredConnectionEnd));
		AdapterWeaving.adapter.getRequiredRoles_InterfaceRequiringEntity().add(AdapterWeaving.concernRepositoryManager.createRequiredRoleBy(providedConnectionEnd));
	}

}
