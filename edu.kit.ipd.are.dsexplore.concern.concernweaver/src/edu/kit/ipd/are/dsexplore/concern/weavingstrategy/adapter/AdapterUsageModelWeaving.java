package edu.kit.ipd.are.dsexplore.concern.weavingstrategy.adapter;

import java.util.Optional;
import java.util.function.Predicate;
import java.util.stream.Stream;

import org.palladiosimulator.pcm.core.composition.ProvidedDelegationConnector;
import org.palladiosimulator.pcm.repository.OperationInterface;
import org.palladiosimulator.pcm.repository.OperationProvidedRole;
import org.palladiosimulator.pcm.repository.ProvidedRole;
import org.palladiosimulator.pcm.system.System;
import org.palladiosimulator.pcm.usagemodel.EntryLevelSystemCall;

import edu.kit.ipd.are.dsexplore.concern.concernweaver.WeavingInstruction;
import edu.kit.ipd.are.dsexplore.concern.concernweaver.WeavingLocation;
import edu.kit.ipd.are.dsexplore.concern.util.ConcernWeaverUtil;

/**
 * This class is responsible for weaving the usage model view-type in the
 * context of the adapter transformation strategy.
 *
 * @author scheerer
 *
 */
public class AdapterUsageModelWeaving extends AdapterWeaving {

	/**
	 * @see AdapterWeaving#weave(WeavingInstruction)
	 */
	@Override
	public void weave(WeavingInstruction weavingInstruction) {
		if (this.isUsageModelAffected(weavingInstruction.getWeavingLocation())) {
			this.editEntryLevelSystemCalls();
		}
	}

	private boolean isUsageModelAffected(WeavingLocation weavingLocation) {
		return this.isDelegationConnectorLocation(weavingLocation) && this.isOuterProvidedRoleExposedByTheSystem(weavingLocation);
	}

	private boolean isDelegationConnectorLocation(WeavingLocation weavingLocation) {
		return weavingLocation.getLocation() instanceof ProvidedDelegationConnector;
	}

	private boolean isOuterProvidedRoleExposedByTheSystem(WeavingLocation weavingLocation) {
		ProvidedRole outerProvidedRole = ((ProvidedDelegationConnector) weavingLocation.getLocation()).getOuterProvidedRole_ProvidedDelegationConnector();
		return outerProvidedRole.eContainer() instanceof System;
	}

	private void editEntryLevelSystemCalls() {
		AdapterWeaving.pcmUsageModelManager.getEntryLevelSystemCalls().forEach(entryLevelSystemCall -> this.replaceProvidedRoleOf(entryLevelSystemCall));
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
		return AdapterWeaving.adapter.getProvidedRoles_InterfaceProvidingEntity().stream();
	}

	private Predicate<ProvidedRole> ifProvidedRoleIsReferencing(OperationInterface givenInterface) {
		return this.isOperationProvidedRole().and(this.isReferencing(givenInterface));
	}

	private Predicate<ProvidedRole> isOperationProvidedRole() {
		return providedRole -> providedRole instanceof OperationProvidedRole;
	}

	private Predicate<ProvidedRole> isReferencing(OperationInterface givenInterface) {
		return providedRole -> ConcernWeaverUtil.areEqual(((OperationProvidedRole) providedRole).getProvidedInterface__OperationProvidedRole(), givenInterface);
	}

}
