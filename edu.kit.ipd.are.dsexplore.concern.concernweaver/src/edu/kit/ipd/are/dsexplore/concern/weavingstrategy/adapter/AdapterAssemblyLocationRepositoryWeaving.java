package edu.kit.ipd.are.dsexplore.concern.weavingstrategy.adapter;

import org.palladiosimulator.pcm.core.composition.AssemblyConnector;
import org.palladiosimulator.pcm.repository.OperationProvidedRole;
import org.palladiosimulator.pcm.repository.OperationRequiredRole;

import edu.kit.ipd.are.dsexplore.concern.concernweaver.WeavingLocation;

public class AdapterAssemblyLocationRepositoryWeaving extends AdapterRepositoryWeaving {

	@Override
	protected void weaveAdapterIntoRepository(WeavingLocation weavingLocation) {
		
		AssemblyConnector location = (AssemblyConnector) weavingLocation.getLocation();
		
		OperationRequiredRole requiredConnectionEnd = location.getRequiredRole_AssemblyConnector();
		OperationProvidedRole providedConnectionEnd = location.getProvidedRole_AssemblyConnector();
		
		adapter.getProvidedRoles_InterfaceProvidingEntity().add(concernRepositoryManager.createProvidedRoleBy(requiredConnectionEnd));
		adapter.getRequiredRoles_InterfaceRequiringEntity().add(concernRepositoryManager.createRequiredRoleBy(providedConnectionEnd));
		
	}
	
}
