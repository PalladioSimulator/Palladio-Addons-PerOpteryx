package edu.kit.ipd.are.dsexplore.featurecompletions.weaver.strategy.extension;

import java.util.Optional;
import java.util.function.Predicate;
import java.util.stream.Stream;

import org.palladiosimulator.pcm.core.composition.ProvidedDelegationConnector;
import org.palladiosimulator.pcm.repository.OperationInterface;
import org.palladiosimulator.pcm.repository.OperationProvidedRole;
import org.palladiosimulator.pcm.repository.ProvidedRole;
import org.palladiosimulator.pcm.system.System;
import org.palladiosimulator.pcm.usagemodel.EntryLevelSystemCall;

import edu.kit.ipd.are.dsexplore.featurecompletions.weaver.FCCUtil;
import edu.kit.ipd.are.dsexplore.featurecompletions.weaver.strategy.WeavingInstruction;
import edu.kit.ipd.are.dsexplore.featurecompletions.weaver.strategy.WeavingLocation;
import featureSolution.ExternalCallPlacementStrategy;

/**
 * This class is responsible for weaving the usage model view-type in the
 * context of the adapter transformation strategy.
 *
 * @author scheerer
 *
 */
public class ExternalCallUsageModelWeaving extends UsageModelWeaving {

	public ExternalCallUsageModelWeaving(IExtensionWeaving parent) {
		super(parent);
	}

	@Override 
	public void weave(IWeavingInstruction instruction) {
		//if (this.isUsageModelAffected(instruction.getWeavingLocation())) {
		//TODO usage model can only be affected if weaving location is of type ExternalCallWeavingLocation 
		if (instruction.getWeavingLocations().stream().anyMatch(location -> isUsageModelAffected((ExternalCallWeavingLocation) location))) {
			this.editEntryLevelSystemCalls();
		}
	}

	private boolean isUsageModelAffected(ExternalCallWeavingLocation weavingLocation) {
		return this.isDelegationConnectorLocation(weavingLocation) && this.isOuterProvidedRoleExposedByTheSystem(weavingLocation);
	}

	private boolean isDelegationConnectorLocation(ExternalCallWeavingLocation weavingLocation) {
		return weavingLocation.getAffectedConnector() instanceof ProvidedDelegationConnector;
	}

	private boolean isOuterProvidedRoleExposedByTheSystem(ExternalCallWeavingLocation weavingLocation) {
		ProvidedRole outerProvidedRole = ((ProvidedDelegationConnector) weavingLocation.getAffectedConnector()).getOuterProvidedRole_ProvidedDelegationConnector();
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
