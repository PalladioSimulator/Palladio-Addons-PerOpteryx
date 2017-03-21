package edu.kit.ipd.are.dsexplore.concern.weavingstrategy.adapter;

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
import edu.kit.ipd.are.dsexplore.concern.exception.ConcernWeavingException;
import edu.kit.ipd.are.dsexplore.concern.exception.ErrorMessage;
import edu.kit.ipd.are.dsexplore.concern.util.ConcernWeaverUtil;

public class AdapterUsageModelWeaving extends AdapterWeaving {
	
	@Override
	public void weave(WeavingInstruction weavingInstruction) throws ConcernWeavingException {
		
		if (isUsageModelAffected(weavingInstruction.getWeavingLocation())) {
			
			editEntryLevelSystemCalls();
			
		}
		
	}
	
	private boolean isUsageModelAffected(WeavingLocation weavingLocation) {
		
		return isDelegationConnectorLocation(weavingLocation) && isOuterProvidedRoleExposedByTheSystem(weavingLocation);
		
	}

	private boolean isDelegationConnectorLocation(WeavingLocation weavingLocation) {
		
		return weavingLocation.getLocation() instanceof ProvidedDelegationConnector;
		
	}
	
	private boolean isOuterProvidedRoleExposedByTheSystem(WeavingLocation weavingLocation) {
		
		ProvidedRole outerProvidedRole = ((ProvidedDelegationConnector) weavingLocation.getLocation()).getOuterProvidedRole_ProvidedDelegationConnector();
		return outerProvidedRole.eContainer() instanceof System;
		
	}

	private void editEntryLevelSystemCalls() throws ConcernWeavingException {
		
		try {
		
			pcmUsageModelManager.getEntryLevelSystemCalls().forEach(entryLevelSystemCall -> replaceProvidedRoleOf(entryLevelSystemCall));
		
		} catch (Exception ex) {
			
			throw new ConcernWeavingException(ex.getMessage());
			
		}
		
	}

	private void replaceProvidedRoleOf(EntryLevelSystemCall entryLevelSystemCallToEdit) {
		
		try { 
		
			OperationInterface calledInterface = entryLevelSystemCallToEdit.getOperationSignature__EntryLevelSystemCall().getInterface__OperationSignature();
			OperationProvidedRole newProvidedRole = (OperationProvidedRole) getProvidedRoleFromAdapterReferencing(calledInterface);
			entryLevelSystemCallToEdit.setProvidedRole_EntryLevelSystemCall(newProvidedRole);
			
		} catch(ConcernWeavingException ex) {
			
			throw new RuntimeException(ex);
			
		}
		
	}

	private ProvidedRole getProvidedRoleFromAdapterReferencing(OperationInterface calledInterface) throws ConcernWeavingException {
		
		return getAllProvidedRolesOfAdapter().filter(ifProvidedRoleIsReferencing(calledInterface))
											 .findFirst().orElseThrow(() -> new ConcernWeavingException(ErrorMessage.missingRole(adapter, calledInterface)));
		
	}
	
	private Stream<ProvidedRole> getAllProvidedRolesOfAdapter() {
		
		return adapter.getProvidedRoles_InterfaceProvidingEntity().stream();
		
	}
	
	private Predicate<ProvidedRole> ifProvidedRoleIsReferencing(OperationInterface givenInterface) {
		
		return isOperationProvidedRole().and(isReferencing(givenInterface));
		
	}
	
	private Predicate<ProvidedRole> isOperationProvidedRole() {
		
		return providedRole -> providedRole instanceof OperationProvidedRole;
		
	}
	
	private Predicate<ProvidedRole> isReferencing(OperationInterface givenInterface) {
		
		return providedRole -> ConcernWeaverUtil.areEqual(((OperationProvidedRole) providedRole).getProvidedInterface__OperationProvidedRole(), givenInterface);
		
	}

}
