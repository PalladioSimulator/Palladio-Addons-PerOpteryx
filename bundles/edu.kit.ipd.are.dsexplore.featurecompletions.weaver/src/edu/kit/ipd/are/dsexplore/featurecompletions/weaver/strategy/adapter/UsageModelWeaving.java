package edu.kit.ipd.are.dsexplore.featurecompletions.weaver.strategy.adapter;

import java.util.Optional;
import java.util.function.Predicate;
import java.util.stream.Stream;

import org.palladiosimulator.pcm.core.composition.Connector;
import org.palladiosimulator.pcm.core.composition.ProvidedDelegationConnector;
import org.palladiosimulator.pcm.repository.OperationInterface;
import org.palladiosimulator.pcm.repository.OperationProvidedRole;
import org.palladiosimulator.pcm.repository.ProvidedRole;
import org.palladiosimulator.pcm.system.System;
import org.palladiosimulator.pcm.usagemodel.EntryLevelSystemCall;

import edu.kit.ipd.are.dsexplore.featurecompletions.weaver.FCCUtil;
import edu.kit.ipd.are.dsexplore.featurecompletions.weaver.strategy.WeavingInstruction;

/**
 * This class is responsible for weaving the usage model view-type in the
 * context of the adapter transformation strategy.
 *
 * @author scheerer
 *
 */
public class UsageModelWeaving {
	protected final IAdapterWeaving parent;

	public UsageModelWeaving(IAdapterWeaving parent) {
		this.parent = parent;
	}

	public void weave(WeavingInstruction weavingInstruction) {
		if (this.isUsageModelAffected(weavingInstruction.getWeavingLocation())) {
			this.editEntryLevelSystemCalls();
		}
	}

	private boolean isUsageModelAffected(Connector weavingLocation) {
		return this.isDelegationConnectorLocation(weavingLocation) && this.isOuterProvidedRoleExposedByTheSystem(weavingLocation);
	}

	private boolean isDelegationConnectorLocation(Connector weavingLocation) {
		return weavingLocation instanceof ProvidedDelegationConnector;
	}

	private boolean isOuterProvidedRoleExposedByTheSystem(Connector weavingLocation) {
		ProvidedRole outerProvidedRole = ((ProvidedDelegationConnector) weavingLocation).getOuterProvidedRole_ProvidedDelegationConnector();
		return outerProvidedRole.eContainer() instanceof System;
	}

	private void editEntryLevelSystemCalls() {
		this.parent.getPCMUsageModelManager().getEntryLevelSystemCalls().forEach(entryLevelSystemCall -> this.replaceProvidedRoleOf(entryLevelSystemCall));
	}

	private void replaceProvidedRoleOf(EntryLevelSystemCall entryLevelSystemCallToEdit) {
		OperationInterface calledInterface = entryLevelSystemCallToEdit.getOperationSignature__EntryLevelSystemCall().getInterface__OperationSignature();
		Optional<ProvidedRole> match = this.getProvidedRoleFromAdapterReferencing(calledInterface);
		if (match.isPresent()) {
			entryLevelSystemCallToEdit.setProvidedRole_EntryLevelSystemCall((OperationProvidedRole) match.get());
		}
	}

	private Optional<ProvidedRole> getProvidedRoleFromAdapterReferencing(OperationInterface calledInterface) {
		return this.getAllProvidedRolesOfAdapter().filter(this.ifProvidedRoleIsReferencing(calledInterface)).findFirst();
	}

	private Stream<ProvidedRole> getAllProvidedRolesOfAdapter() {
		return this.parent.getAdapterComponent().getProvidedRoles_InterfaceProvidingEntity().stream();
	}

	private Predicate<ProvidedRole> ifProvidedRoleIsReferencing(OperationInterface givenInterface) {
		return this.isOperationProvidedRole().and(this.isReferencing(givenInterface));
	}

	private Predicate<ProvidedRole> isOperationProvidedRole() {
		return providedRole -> providedRole instanceof OperationProvidedRole;
	}

	private Predicate<ProvidedRole> isReferencing(OperationInterface givenInterface) {
		return providedRole -> FCCUtil.areEqual(((OperationProvidedRole) providedRole).getProvidedInterface__OperationProvidedRole(), givenInterface);
	}

}
