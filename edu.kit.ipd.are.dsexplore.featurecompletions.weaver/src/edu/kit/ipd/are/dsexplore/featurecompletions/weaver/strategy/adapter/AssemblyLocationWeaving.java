package edu.kit.ipd.are.dsexplore.featurecompletions.weaver.strategy.adapter;

import java.util.List;

import org.palladiosimulator.pcm.core.composition.AssemblyConnector;
import org.palladiosimulator.pcm.core.composition.AssemblyContext;
import org.palladiosimulator.pcm.core.composition.Connector;
import org.palladiosimulator.pcm.repository.ProvidedRole;
import org.palladiosimulator.pcm.repository.RequiredRole;

import edu.kit.ipd.are.dsexplore.featurecompletions.weaver.port.FCCWeaverException;
import edu.kit.ipd.are.dsexplore.featurecompletions.weaver.strategy.WeavingLocation;
import edu.kit.ipd.are.dsexplore.featurecompletions.weaver.strategy.adapter.util.AssemblyConnectorGenerator;
import edu.kit.ipd.are.dsexplore.featurecompletions.weaver.strategy.adapter.util.ConnectionInfo;

/**
 * This class is responsible to weave the adapter in the system if the
 * connection of the components the adapter is inserted in between is an
 * assembly connection.
 *
 * @author scheerer
 *
 */
public class AssemblyLocationWeaving extends AssemblyWeaving {

	public AssemblyLocationWeaving(IAdapterWeaving parent) {
		super(parent);
	}

	/**
	 * @see AdapterAssemblyWeaving#weaveAdapterIntoSystem(WeavingLocation)
	 */
	@Override
	public void weaveAdapterIntoSystem(WeavingLocation weavingLocation) throws FCCWeaverException {
		this.replace((AssemblyConnector) weavingLocation.getLocation());
	}

	private void replace(AssemblyConnector assemblyConnectorToReplace) throws FCCWeaverException {
		this.parent.getPCMSystemManager().remove(assemblyConnectorToReplace);
		this.replaceWithAssemblyConnectorsToAdapter(assemblyConnectorToReplace);
	}

	private void replaceWithAssemblyConnectorsToAdapter(AssemblyConnector assemblyConnectorToReplace) throws FCCWeaverException {
		this.createAssemblyConnectorFromAdapterToProvidedEndOf(assemblyConnectorToReplace);
		this.createAssemblyConnectorFromRequiredEndToAdapter(assemblyConnectorToReplace);
	}

	private void createAssemblyConnectorFromAdapterToProvidedEndOf(AssemblyConnector assemblyConnectorToReplace) throws FCCWeaverException {

		ProvidedRole providedRole = assemblyConnectorToReplace.getProvidedRole_AssemblyConnector();
		RequiredRole requiredRole = (RequiredRole) this.getComplimentaryRoleOf(providedRole, this.getRequiredRolesOfAdapter());
		AssemblyContext providedAssemblyContext = assemblyConnectorToReplace.getProvidingAssemblyContext_AssemblyConnector();

		ConnectionInfo connectionInfo = new ConnectionInfo(requiredRole, providedRole, this.parent.getAdapterAssemblyContext(), providedAssemblyContext);
		Connector newConnector = new AssemblyConnectorGenerator(this.parent.getPCMSystemManager()).createConnectorBy(connectionInfo);
		newConnector.setId(assemblyConnectorToReplace.getId());
		this.addConnector(newConnector);
	}

	private void createAssemblyConnectorFromRequiredEndToAdapter(AssemblyConnector assemblyConnectorToReplace) throws FCCWeaverException {
		RequiredRole requiredRole = assemblyConnectorToReplace.getRequiredRole_AssemblyConnector();
		ProvidedRole providedRole = (ProvidedRole) this.getComplimentaryRoleOf(requiredRole, this.getProvidedRolesOfAdapter());
		AssemblyContext requiredAssemblyContext = assemblyConnectorToReplace.getRequiringAssemblyContext_AssemblyConnector();

		ConnectionInfo connectionInfo = new ConnectionInfo(requiredRole, providedRole, requiredAssemblyContext, this.parent.getAdapterAssemblyContext());
		Connector newConnector = new AssemblyConnectorGenerator(this.parent.getPCMSystemManager()).createConnectorBy(connectionInfo);
		// DO THIS ONLY AT ONE CONNECTOR TO PREVENT ERRORS
		newConnector.setId(assemblyConnectorToReplace.getId() + "-requiredEnd");
		this.addConnector(newConnector);
	}

	private List<ProvidedRole> getProvidedRolesOfAdapter() {
		return this.parent.getAdapterComponent().getProvidedRoles_InterfaceProvidingEntity();
	}

}
