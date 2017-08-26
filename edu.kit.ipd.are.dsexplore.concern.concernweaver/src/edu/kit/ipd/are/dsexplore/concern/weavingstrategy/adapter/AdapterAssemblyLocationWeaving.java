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
 * This class is responsible to weave the adapter in the system if the
 * connection of the components the adapter is inserted in between is an
 * assembly connection.
 *
 * @author scheerer
 *
 */
public class AdapterAssemblyLocationWeaving extends AdapterAssemblyWeaving {

	/**
	 * @see AdapterAssemblyWeaving#weaveAdapterIntoSystem(WeavingLocation)
	 */
	@Override
	public void weaveAdapterIntoSystem(WeavingLocation weavingLocation) throws ConcernWeavingException {
		this.replace((AssemblyConnector) weavingLocation.getLocation());
	}

	private void replace(AssemblyConnector assemblyConnectorToReplace) throws ConcernWeavingException {
		AdapterWeaving.pcmSystemManager.remove(assemblyConnectorToReplace);
		this.replaceWithAssemblyConnectorsToAdapter(assemblyConnectorToReplace);
	}

	private void replaceWithAssemblyConnectorsToAdapter(AssemblyConnector assemblyConnectorToReplace) throws ConcernWeavingException {
		this.createAssemblyConnectorFromAdapterToProvidedEndOf(assemblyConnectorToReplace);
		this.createAssemblyConnectorFromRequiredEndToAdapter(assemblyConnectorToReplace);
	}

	private void createAssemblyConnectorFromAdapterToProvidedEndOf(AssemblyConnector assemblyConnectorToReplace) throws ConcernWeavingException {

		ProvidedRole providedRole = assemblyConnectorToReplace.getProvidedRole_AssemblyConnector();
		RequiredRole requiredRole = (RequiredRole) this.getComplimentaryRoleOf(providedRole, this.getRequiredRolesOfAdapter());
		AssemblyContext providedAssemblyContext = assemblyConnectorToReplace.getProvidingAssemblyContext_AssemblyConnector();

		ConnectionInfo connectionInfo = new ConnectionInfo(requiredRole, providedRole, AdapterWeaving.adapterAssemblyContext, providedAssemblyContext);
		this.addConnector(new AssemblyConnectorGenerator(AdapterWeaving.pcmSystemManager).createConnectorBy(connectionInfo));
	}

	private void createAssemblyConnectorFromRequiredEndToAdapter(AssemblyConnector assemblyConnectorToReplace) throws ConcernWeavingException {
		RequiredRole requiredRole = assemblyConnectorToReplace.getRequiredRole_AssemblyConnector();
		ProvidedRole providedRole = (ProvidedRole) this.getComplimentaryRoleOf(requiredRole, this.getProvidedRolesOfAdapter());
		AssemblyContext requiredAssemblyContext = assemblyConnectorToReplace.getRequiringAssemblyContext_AssemblyConnector();

		ConnectionInfo connectionInfo = new ConnectionInfo(requiredRole, providedRole, requiredAssemblyContext, AdapterWeaving.adapterAssemblyContext);
		this.addConnector(new AssemblyConnectorGenerator(AdapterWeaving.pcmSystemManager).createConnectorBy(connectionInfo));
	}

	private List<ProvidedRole> getProvidedRolesOfAdapter() {
		return AdapterWeaving.adapter.getProvidedRoles_InterfaceProvidingEntity();
	}

}
