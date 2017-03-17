package edu.kit.ipd.are.dsexplore.concern.weavingstrategy.adapter;

import java.util.List;

import org.palladiosimulator.pcm.core.composition.ProvidedDelegationConnector;
import org.palladiosimulator.pcm.repository.Role;

import edu.kit.ipd.are.dsexplore.concern.concernweaver.WeavingLocation;
import edu.kit.ipd.are.dsexplore.concern.util.AssemblyConnectorGenerator;
import edu.kit.ipd.are.dsexplore.concern.util.ConnectionInfo;
import edu.kit.ipd.are.dsexplore.concern.util.DelegationConnectorGenerator;

public class AdapterDelegationLocationWeaving extends AdapterAssemblyWeaving {
	
	@Override
	public void weaveAdapterIntoSystem(WeavingLocation weavingLocation) {
		
		replace((ProvidedDelegationConnector) weavingLocation.getLocation());
		
	}

	private void replace(ProvidedDelegationConnector assemblyConnectorToReplace) {
		
		pcmSystemManager.remove(assemblyConnectorToReplace);
			
		replaceOldConnectorWithAssemblyConnectorsToAdapter(assemblyConnectorToReplace);
			
	}
	
	private void replaceOldConnectorWithAssemblyConnectorsToAdapter(ProvidedDelegationConnector delegationConnectorToReplace) {
	
		createAssemblyConnectorFromAdapterToInnerProvidedEndOf(delegationConnectorToReplace);
		createDelegationConnectorFromOuterProvidedRoleToAdapter(delegationConnectorToReplace);	
	
	}

	private void createAssemblyConnectorFromAdapterToInnerProvidedEndOf(ProvidedDelegationConnector delegationConnectorToReplace) {
		
		ConnectionInfo requiredConnectionEnd = getRequiredConnectionEndOfAdapterBy(delegationConnectorToReplace);
		ConnectionInfo providedConnectionEnd = getProvidedConnectionEndForAdapterBy(delegationConnectorToReplace);
		
		addConnector(new AssemblyConnectorGenerator(null, pcmSystemManager).getConnectorOf(requiredConnectionEnd, providedConnectionEnd));
		
	}
	
	private void createDelegationConnectorFromOuterProvidedRoleToAdapter(ProvidedDelegationConnector delegationConnectorToReplace) {
		
		ConnectionInfo knownConnectionEnd = getProvidedConnectionEndOf(delegationConnectorToReplace);
		addConnector(new DelegationConnectorGenerator(getProvidedRolesOfAdapter(), pcmSystemManager).getConnectorOf(knownConnectionEnd));
		
	}

	private ConnectionInfo getRequiredConnectionEndOfAdapterBy(ProvidedDelegationConnector delegationConnectorToReplace) {
		
		Role role = this.roleHandler.getOpponentOf(delegationConnectorToReplace.getInnerProvidedRole_ProvidedDelegationConnector(), 
				   								   getRequiredRolesOfAdapter()).get();
		return new ConnectionInfo(role, this.adapterAssemblyContext);
		
	}
	
	private ConnectionInfo getProvidedConnectionEndForAdapterBy(ProvidedDelegationConnector delegationConnectorToReplace) {

		return new ConnectionInfo(delegationConnectorToReplace.getInnerProvidedRole_ProvidedDelegationConnector(), 
								  delegationConnectorToReplace.getAssemblyContext_ProvidedDelegationConnector());
		
	}
	
	private ConnectionInfo getProvidedConnectionEndOf(ProvidedDelegationConnector delegationConnectorToReplace) {
		
		return new ConnectionInfo(delegationConnectorToReplace.getOuterProvidedRole_ProvidedDelegationConnector(), 
				  				  this.adapterAssemblyContext);
		
	}

	private List<Role> getProvidedRolesOfAdapter() {
		
		return toRoles(getComponentOf(this.adapterAssemblyContext).getProvidedRoles_InterfaceProvidingEntity());
		
	}
	
}
