package edu.kit.ipd.are.dsexplore.concern.weavingstrategy.adapter;

import java.util.List;

import org.palladiosimulator.pcm.core.composition.AssemblyConnector;
import org.palladiosimulator.pcm.repository.Role;

import edu.kit.ipd.are.dsexplore.concern.concernweaver.WeavingLocation;
import edu.kit.ipd.are.dsexplore.concern.util.AssemblyConnectorGenerator;
import edu.kit.ipd.are.dsexplore.concern.util.ConnectionInfo;

public class AdapterAssemblyLocationWeaving extends AdapterAssemblyWeaving {
	
	@Override
	public void weaveAdapterIntoSystem(WeavingLocation weavingLocation) {
		
		replace((AssemblyConnector) weavingLocation.getLocation());
		
	}

	private void replace(AssemblyConnector assemblyConnectorToReplace) {
		
		pcmSystemManager.remove(assemblyConnectorToReplace);
			
		replaceWithAssemblyConnectorsToAdapter(assemblyConnectorToReplace);
			
	}
	
	private void replaceWithAssemblyConnectorsToAdapter(AssemblyConnector assemblyConnectorToReplace) {
	
		createAssemblyConnectorFromAdapterToProvidedEndOf(assemblyConnectorToReplace);
		createAssemblyConnectorFromRequiredEndToAdapter(assemblyConnectorToReplace);
	
	}

	private void createAssemblyConnectorFromAdapterToProvidedEndOf(AssemblyConnector assemblyConnectorToReplace) {
		
		ConnectionInfo requiredConnectionEndInfo = getAdapterRequiredConnectionEndOf(assemblyConnectorToReplace);
		ConnectionInfo providedConnectionEndInfo = getProvidedConnectionEndOf(assemblyConnectorToReplace);
		
		addConnector(new AssemblyConnectorGenerator(null, pcmSystemManager).getConnectorOf(requiredConnectionEndInfo, providedConnectionEndInfo));
		
	}
	
	private void createAssemblyConnectorFromRequiredEndToAdapter(AssemblyConnector assemblyConnectorToReplace) {
		
		ConnectionInfo knownConnectionEnd = getRequiredConnectionEndOf(assemblyConnectorToReplace);
		addConnector(new AssemblyConnectorGenerator(getProvidedRolesOfAdapter(), pcmSystemManager).getConnectorOf(knownConnectionEnd));
		
	}

	private List<Role> getProvidedRolesOfAdapter() {
		
		return toRoles(getComponentOf(this.adapterAssemblyContext).getProvidedRoles_InterfaceProvidingEntity());
		
	}

	private ConnectionInfo getRequiredConnectionEndOf(AssemblyConnector assemblyConnectorToReplace) {
		
		return new ConnectionInfo(assemblyConnectorToReplace.getRequiredRole_AssemblyConnector(), 
								  assemblyConnectorToReplace.getRequiringAssemblyContext_AssemblyConnector());
		
	}
	
	private ConnectionInfo getProvidedConnectionEndOf(AssemblyConnector assemblyConnectorToReplace) {
		
		return new ConnectionInfo(assemblyConnectorToReplace.getProvidedRole_AssemblyConnector(), 
								  assemblyConnectorToReplace.getProvidingAssemblyContext_AssemblyConnector());
		
	}
	
	private ConnectionInfo getAdapterRequiredConnectionEndOf(AssemblyConnector assemblyConnectorToReplace) {

		Role role = this.roleHandler.getOpponentOf(assemblyConnectorToReplace.getProvidedRole_AssemblyConnector(), 
												   getRequiredRolesOfAdapter()).get();
		return new ConnectionInfo(role, this.adapterAssemblyContext);
		
	}
	
}
