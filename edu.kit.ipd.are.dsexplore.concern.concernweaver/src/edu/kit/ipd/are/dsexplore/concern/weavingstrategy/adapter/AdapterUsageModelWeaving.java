package edu.kit.ipd.are.dsexplore.concern.weavingstrategy.adapter;

import org.palladiosimulator.pcm.core.composition.ProvidedDelegationConnector;
import org.palladiosimulator.pcm.repository.OperationInterface;
import org.palladiosimulator.pcm.repository.OperationProvidedRole;
import org.palladiosimulator.pcm.usagemodel.EntryLevelSystemCall;

import edu.kit.ipd.are.dsexplore.concern.concernweaver.WeavingInstruction;
import edu.kit.ipd.are.dsexplore.concern.concernweaver.WeavingLocation;
import edu.kit.ipd.are.dsexplore.concern.exception.ConcernWeavingException;
import edu.kit.ipd.are.dsexplore.concern.exception.ErrorMessage;

public class AdapterUsageModelWeaving extends AdapterWeaving {
	
	@Override
	public void weave(WeavingInstruction weavingInstruction) throws ConcernWeavingException {
		
		if (!isDelegationConnectorLocation(weavingInstruction.getWeavingLocation())) {
			
			return;
			
		}
		
		editEntryLevelSystemCalls();
		
	}
	
	private boolean isDelegationConnectorLocation(WeavingLocation weavingLocation) {
		
		return weavingLocation.getLocation() instanceof ProvidedDelegationConnector;
		
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
			OperationProvidedRole newProvidedRole = getNewPorvidedRoleFromAdapterReferencing(calledInterface);
			
			entryLevelSystemCallToEdit.setProvidedRole_EntryLevelSystemCall(newProvidedRole);
			
		} catch(ConcernWeavingException ex) {
			
			throw new RuntimeException(ex);
			
		}
		
	}

	private OperationProvidedRole getNewPorvidedRoleFromAdapterReferencing(OperationInterface calledInterface) throws ConcernWeavingException {
		
		return adapter.getProvidedRoles_InterfaceProvidingEntity().stream().filter(eachProvidedRole -> eachProvidedRole instanceof OperationProvidedRole)
																		   .map(eachProvidedRole -> (OperationProvidedRole) eachProvidedRole)
																		   .filter(eachOperationProvidedRole -> references(calledInterface, eachOperationProvidedRole))
																		   .findFirst().orElseThrow(() -> new ConcernWeavingException(ErrorMessage.missingRole(adapter, calledInterface)));
		
	}

	private boolean references(OperationInterface calledInterface, OperationProvidedRole givenProvidedRole) {
		
		return calledInterface.equals(givenProvidedRole.getProvidedInterface__OperationProvidedRole());
		
	}

}
