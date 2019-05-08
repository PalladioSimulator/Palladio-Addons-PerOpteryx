package edu.kit.ipd.are.dsexplore.featurecompletions.weaver.strategy.adapter;

import java.util.List;
import java.util.stream.Collectors;

import org.palladiosimulator.pcm.core.composition.AssemblyContext;
import org.palladiosimulator.pcm.core.composition.Connector;
import org.palladiosimulator.pcm.core.composition.ProvidedDelegationConnector;
import org.palladiosimulator.pcm.repository.Interface;
import org.palladiosimulator.pcm.repository.OperationProvidedRole;
import org.palladiosimulator.pcm.repository.ProvidedRole;
import org.palladiosimulator.pcm.repository.RequiredRole;

import edu.kit.ipd.are.dsexplore.featurecompletions.weaver.ErrorMessage;
import edu.kit.ipd.are.dsexplore.featurecompletions.weaver.FCCUtil;
import edu.kit.ipd.are.dsexplore.featurecompletions.weaver.port.FCCWeaverException;
import edu.kit.ipd.are.dsexplore.featurecompletions.weaver.strategy.WeavingLocation;
import edu.kit.ipd.are.dsexplore.featurecompletions.weaver.strategy.adapter.util.AssemblyConnectorGenerator;
import edu.kit.ipd.are.dsexplore.featurecompletions.weaver.strategy.adapter.util.ConnectionInfo;
import edu.kit.ipd.are.dsexplore.featurecompletions.weaver.strategy.adapter.util.DelegationConnectorGenerator;

/**
 * This class is responsible to weave the adapter in the system if the
 * connection of the components the adapter is inserted in between is an
 * provided delegation connection.
 *
 * @author scheerer
 *
 */
public class DelegationLocationWeaving extends AssemblyWeaving {

	public DelegationLocationWeaving(IAdapterWeaving parent) {
		super(parent);
	}

	/**
	 * @see AdapterAssemblyWeaving#weaveAdapterIntoSystem(WeavingLocation)
	 */
	@Override
	public void weaveAdapterIntoSystem(Connector weavingLocation) throws FCCWeaverException {
		this.replace((ProvidedDelegationConnector) weavingLocation);
	}

	private void replace(ProvidedDelegationConnector assemblyConnectorToReplace) throws FCCWeaverException {
		this.parent.getPCMSystemManager().remove(assemblyConnectorToReplace);
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

		ConnectionInfo connectionInfo = new ConnectionInfo(requiredRole, providedRole, this.parent.getAdapterAssemblyContext(), providedAssemblyContext);
		this.addConnector(new AssemblyConnectorGenerator(this.parent.getPCMSystemManager()).createConnectorBy(connectionInfo));
	}

	private void createDelegationConnectorFromOuterProvidedRoleToAdapter(ProvidedDelegationConnector delegationConnectorToReplace) throws FCCWeaverException {
		ProvidedRole outerProvidedRole = delegationConnectorToReplace.getOuterProvidedRole_ProvidedDelegationConnector();
		ProvidedRole innerProvidedRole = this.getDelegatedProvidedRoleOfAdapter(outerProvidedRole);

		ConnectionInfo connectionInfo = new ConnectionInfo(outerProvidedRole, innerProvidedRole, null, this.parent.getAdapterAssemblyContext());
		this.addConnector(new DelegationConnectorGenerator(this.parent.getPCMSystemManager()).createConnectorBy(connectionInfo));
	}

	private ProvidedRole getDelegatedProvidedRoleOfAdapter(ProvidedRole outerProvidedRole) throws FCCWeaverException {
		Interface interface1 = ((OperationProvidedRole) outerProvidedRole).getProvidedInterface__OperationProvidedRole();
		for (OperationProvidedRole eachProvidedRole : this.getOperationProvidedRolesOfAdapter()) {
			Interface interface2 = eachProvidedRole.getProvidedInterface__OperationProvidedRole();
			if (FCCUtil.areEqual(interface1, interface2)) {
				return eachProvidedRole;
			}
		}
		throw new FCCWeaverException(ErrorMessage.missingDelegatedRole(outerProvidedRole, this.parent.getAdapterComponent()));
	}

	private List<OperationProvidedRole> getOperationProvidedRolesOfAdapter() {
		return this.parent.getAdapterComponent().getProvidedRoles_InterfaceProvidingEntity().stream().filter(each -> each instanceof OperationProvidedRole).map(each -> (OperationProvidedRole) each)
				.collect(Collectors.toList());
	}

}
