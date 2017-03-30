package edu.kit.ipd.are.dsexplore.concern.weavingstrategy.adapter;

import java.util.List;
import java.util.stream.Collectors;

import org.palladiosimulator.pcm.core.composition.AssemblyContext;
import org.palladiosimulator.pcm.core.composition.ProvidedDelegationConnector;
import org.palladiosimulator.pcm.repository.Interface;
import org.palladiosimulator.pcm.repository.OperationProvidedRole;
import org.palladiosimulator.pcm.repository.ProvidedRole;
import org.palladiosimulator.pcm.repository.RequiredRole;

import edu.kit.ipd.are.dsexplore.concern.concernweaver.WeavingLocation;
import edu.kit.ipd.are.dsexplore.concern.exception.ConcernWeavingException;
import edu.kit.ipd.are.dsexplore.concern.exception.ErrorMessage;
import edu.kit.ipd.are.dsexplore.concern.util.AssemblyConnectorGenerator;
import edu.kit.ipd.are.dsexplore.concern.util.ConcernWeaverUtil;
import edu.kit.ipd.are.dsexplore.concern.util.ConnectionInfo;
import edu.kit.ipd.are.dsexplore.concern.util.DelegationConnectorGenerator;

/**
 * This class is responsible to weave the adapter in the system if the connection of the components
 * the adapter is inserted in between is an provided delegation connection.
 * @author scheerer
 *
 */
public class AdapterDelegationLocationWeaving extends AdapterAssemblyWeaving {
	
	/**
	 * @see AdapterAssemblyWeaving#weaveAdapterIntoSystem(WeavingLocation)
	 */
	@Override
	public void weaveAdapterIntoSystem(WeavingLocation weavingLocation) throws ConcernWeavingException {
		
		replace((ProvidedDelegationConnector) weavingLocation.getLocation());
		
	}

	private void replace(ProvidedDelegationConnector assemblyConnectorToReplace) throws ConcernWeavingException {
		
		pcmSystemManager.remove(assemblyConnectorToReplace);
			
		replaceOldConnectorWithAssemblyConnectorsToAdapter(assemblyConnectorToReplace);
			
	}
	
	private void replaceOldConnectorWithAssemblyConnectorsToAdapter(ProvidedDelegationConnector delegationConnectorToReplace) throws ConcernWeavingException {
	
		createAssemblyConnectorFromAdapterToInnerProvidedEndOf(delegationConnectorToReplace);
		createDelegationConnectorFromOuterProvidedRoleToAdapter(delegationConnectorToReplace);	
	
	}

	private void createAssemblyConnectorFromAdapterToInnerProvidedEndOf(ProvidedDelegationConnector delegationConnectorToReplace) throws ConcernWeavingException {
		
		ProvidedRole providedRole = delegationConnectorToReplace.getInnerProvidedRole_ProvidedDelegationConnector();
		RequiredRole requiredRole = (RequiredRole) getComplimentaryRoleOf(providedRole, getRequiredRolesOfAdapter());
		AssemblyContext providedAssemblyContext = delegationConnectorToReplace.getAssemblyContext_ProvidedDelegationConnector();
		
		ConnectionInfo connectionInfo = new ConnectionInfo(requiredRole, providedRole, adapterAssemblyContext, providedAssemblyContext);
		addConnector(new AssemblyConnectorGenerator(pcmSystemManager).createConnectorBy(connectionInfo));
		
	}
	
	private void createDelegationConnectorFromOuterProvidedRoleToAdapter(ProvidedDelegationConnector delegationConnectorToReplace) throws ConcernWeavingException {
		
		ProvidedRole outerProvidedRole = delegationConnectorToReplace.getOuterProvidedRole_ProvidedDelegationConnector();
		ProvidedRole innerProvidedRole = getDelegatedProvidedRoleOfAdapter(outerProvidedRole); 
		
		ConnectionInfo connectionInfo = new ConnectionInfo(outerProvidedRole, innerProvidedRole, null, adapterAssemblyContext);
		addConnector(new DelegationConnectorGenerator(pcmSystemManager).createConnectorBy(connectionInfo));
		
	}

	private ProvidedRole getDelegatedProvidedRoleOfAdapter(ProvidedRole outerProvidedRole) throws ConcernWeavingException {
		
		Interface interface1 = ((OperationProvidedRole) outerProvidedRole).getProvidedInterface__OperationProvidedRole();
		for (OperationProvidedRole eachProvidedRole : getOperationProvidedRolesOfAdapter()) {
			
			Interface interface2 = eachProvidedRole.getProvidedInterface__OperationProvidedRole();
			
			if (ConcernWeaverUtil.areEqual(interface1, interface2)) {
				
				return eachProvidedRole;
				
			}
			
		}
		
		throw new ConcernWeavingException(ErrorMessage.missingDelegatedRole(outerProvidedRole, adapter));
		
	}

	private List<OperationProvidedRole> getOperationProvidedRolesOfAdapter() {
		
		return adapter.getProvidedRoles_InterfaceProvidingEntity().stream().filter(each -> each instanceof OperationProvidedRole)
																		   .map(each -> (OperationProvidedRole) each)
																		   .collect(Collectors.toList());
		
	}
	
}
