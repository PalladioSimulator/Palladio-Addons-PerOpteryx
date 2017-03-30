package edu.kit.ipd.are.dsexplore.concern.weavingstrategy.adapter;

import java.util.List;

import org.palladiosimulator.pcm.core.composition.AssemblyConnector;
import org.palladiosimulator.pcm.core.composition.AssemblyContext;
import org.palladiosimulator.pcm.repository.ProvidedRole;
import org.palladiosimulator.pcm.repository.RequiredRole;

import edu.kit.ipd.are.dsexplore.concern.concernweaver.WeavingLocation;
import edu.kit.ipd.are.dsexplore.concern.exception.ConcernWeavingException;
import edu.kit.ipd.are.dsexplore.concern.util.AssemblyConnectorGenerator;
import edu.kit.ipd.are.dsexplore.concern.util.ConnectionInfo;

/**
 * This class is responsible to weave the adapter in the system if the connection of the components
 * the adapter is inserted in between is an assembly connection.
 * @author scheerer
 *
 */
public class AdapterAssemblyLocationWeaving extends AdapterAssemblyWeaving {
	
	/**
	 * @see AdapterAssemblyWeaving#weaveAdapterIntoSystem(WeavingLocation)
	 */
	@Override
	public void weaveAdapterIntoSystem(WeavingLocation weavingLocation) throws ConcernWeavingException {
		
		replace((AssemblyConnector) weavingLocation.getLocation());
		
	}

	private void replace(AssemblyConnector assemblyConnectorToReplace) throws ConcernWeavingException {
		
		pcmSystemManager.remove(assemblyConnectorToReplace);
		replaceWithAssemblyConnectorsToAdapter(assemblyConnectorToReplace);
			
	}
	
	private void replaceWithAssemblyConnectorsToAdapter(AssemblyConnector assemblyConnectorToReplace) throws ConcernWeavingException {
	
		createAssemblyConnectorFromAdapterToProvidedEndOf(assemblyConnectorToReplace);
		createAssemblyConnectorFromRequiredEndToAdapter(assemblyConnectorToReplace);
	
	}

	private void createAssemblyConnectorFromAdapterToProvidedEndOf(AssemblyConnector assemblyConnectorToReplace) throws ConcernWeavingException {
		
		ProvidedRole providedRole = assemblyConnectorToReplace.getProvidedRole_AssemblyConnector();
		RequiredRole requiredRole = (RequiredRole) getComplimentaryRoleOf(providedRole, getRequiredRolesOfAdapter());
		AssemblyContext providedAssemblyContext = assemblyConnectorToReplace.getProvidingAssemblyContext_AssemblyConnector();
		
		ConnectionInfo connectionInfo = new ConnectionInfo(requiredRole, providedRole, adapterAssemblyContext, providedAssemblyContext);
		addConnector(new AssemblyConnectorGenerator(pcmSystemManager).createConnectorBy(connectionInfo));
		
	}
	
	private void createAssemblyConnectorFromRequiredEndToAdapter(AssemblyConnector assemblyConnectorToReplace) throws ConcernWeavingException {
		
		RequiredRole requiredRole = assemblyConnectorToReplace.getRequiredRole_AssemblyConnector();
		ProvidedRole providedRole = (ProvidedRole) getComplimentaryRoleOf(requiredRole, getProvidedRolesOfAdapter());
		AssemblyContext requiredAssemblyContext = assemblyConnectorToReplace.getRequiringAssemblyContext_AssemblyConnector();
		
		ConnectionInfo connectionInfo = new ConnectionInfo(requiredRole, providedRole, requiredAssemblyContext, adapterAssemblyContext);
		addConnector(new AssemblyConnectorGenerator(pcmSystemManager).createConnectorBy(connectionInfo));
		
	}

	private List<ProvidedRole> getProvidedRolesOfAdapter() {
		
		return adapter.getProvidedRoles_InterfaceProvidingEntity();
		
	}
	
}
