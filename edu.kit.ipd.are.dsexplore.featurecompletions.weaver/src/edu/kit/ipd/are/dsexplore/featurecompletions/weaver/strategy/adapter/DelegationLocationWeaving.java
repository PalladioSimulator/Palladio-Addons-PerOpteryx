package edu.kit.ipd.are.dsexplore.featurecompletions.weaver.strategy.adapter;

import java.util.List;
import java.util.stream.Collectors;

import org.palladiosimulator.pcm.core.composition.AssemblyContext;
import org.palladiosimulator.pcm.core.composition.ProvidedDelegationConnector;
import org.palladiosimulator.pcm.repository.Interface;
import org.palladiosimulator.pcm.repository.OperationProvidedRole;
import org.palladiosimulator.pcm.repository.ProvidedRole;
import org.palladiosimulator.pcm.repository.RequiredRole;

import edu.kit.ipd.are.dsexplore.concern.exception.ErrorMessage;
import edu.kit.ipd.are.dsexplore.concern.util.AssemblyConnectorGenerator;
import edu.kit.ipd.are.dsexplore.concern.util.DelegationConnectorGenerator;
import edu.kit.ipd.are.dsexplore.featurecompletions.weaver.port.FCCWeaverException;
import edu.kit.ipd.are.dsexplore.featurecompletions.weaver.strategy.WeavingLocation;
import edu.kit.ipd.are.dsexplore.featurecompletions.weaver.util.ConnectionInfo;
import edu.kit.ipd.are.dsexplore.featurecompletions.weaver.util.FCCWeaverUtil;

/**
 * This class is responsible to weave the adapter in the system if the
 * connection of the components the adapter is inserted in between is an
 * provided delegation connection.
 *
 * @author scheerer
 *
 */
public class DelegationLocationWeaving extends AssemblyWeaving {

	/**
	 * @see AdapterAssemblyWeaving#weaveAdapterIntoSystem(WeavingLocation)
	 */
	@Override
	public void weaveAdapterIntoSystem(WeavingLocation weavingLocation) throws FCCWeaverException {
		this.replace((ProvidedDelegationConnector) weavingLocation.getLocation());
	}

	private void replace(ProvidedDelegationConnector assemblyConnectorToReplace) throws FCCWeaverException {
		AdapterWeaving.pcmSystemManager.remove(assemblyConnectorToReplace);
		this.replaceOldConnectorWithAssemblyConnectorsToAdapter(assemblyConnectorToReplace);
	}

	private void replaceOldConnectorWithAssemblyConnectorsToAdapter(ProvidedDelegationConnector delegationConnectorToReplace) throws FCCWeaverException {
		this.createAssemblyConnectorFromAdapterToInnerProvidedEndOf(delegationConnectorToReplace);
		this.createDelegationConnectorFromOuterProvidedRoleToAdapter(delegationConnectorToReplace);
	}

	private void createAssemblyConnectorFromAdapterToInnerProvidedEndOf(ProvidedDelegationConnector delegationConnectorToReplace) throws FCCWeaverException {
		ProvidedRole providedRole = delegationConnectorToReplace.getInnerProvidedRole_ProvidedDelegationConnector();
		RequiredRole requiredRole = (RequiredRole) this.getComplimentaryRoleOf(providedRole, this.getRequiredRolesOfAdapter());
		AssemblyContext providedAssemblyContext = delegationConnectorToReplace.getAssemblyContext_ProvidedDelegationConnector();

		ConnectionInfo connectionInfo = new ConnectionInfo(requiredRole, providedRole, AdapterWeaving.adapterAssemblyContext, providedAssemblyContext);
		this.addConnector(new AssemblyConnectorGenerator(AdapterWeaving.pcmSystemManager).createConnectorBy(connectionInfo));
	}

	private void createDelegationConnectorFromOuterProvidedRoleToAdapter(ProvidedDelegationConnector delegationConnectorToReplace) throws FCCWeaverException {
		ProvidedRole outerProvidedRole = delegationConnectorToReplace.getOuterProvidedRole_ProvidedDelegationConnector();
		ProvidedRole innerProvidedRole = this.getDelegatedProvidedRoleOfAdapter(outerProvidedRole);

		ConnectionInfo connectionInfo = new ConnectionInfo(outerProvidedRole, innerProvidedRole, null, AdapterWeaving.adapterAssemblyContext);
		this.addConnector(new DelegationConnectorGenerator(AdapterWeaving.pcmSystemManager).createConnectorBy(connectionInfo));
	}

	private ProvidedRole getDelegatedProvidedRoleOfAdapter(ProvidedRole outerProvidedRole) throws FCCWeaverException {
		Interface interface1 = ((OperationProvidedRole) outerProvidedRole).getProvidedInterface__OperationProvidedRole();
		for (OperationProvidedRole eachProvidedRole : this.getOperationProvidedRolesOfAdapter()) {
			Interface interface2 = eachProvidedRole.getProvidedInterface__OperationProvidedRole();
			if (FCCWeaverUtil.areEqual(interface1, interface2)) {
				return eachProvidedRole;
			}
		}
		throw new FCCWeaverException(ErrorMessage.missingDelegatedRole(outerProvidedRole, AdapterWeaving.adapter));
	}

	private List<OperationProvidedRole> getOperationProvidedRolesOfAdapter() {
		return AdapterWeaving.adapter.getProvidedRoles_InterfaceProvidingEntity().stream().filter(each -> each instanceof OperationProvidedRole).map(each -> (OperationProvidedRole) each)
				.collect(Collectors.toList());
	}

}
