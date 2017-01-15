package edu.kit.ipd.are.dsexplore.concern.weavingstrategy.adapter;

import org.palladiosimulator.pcm.repository.OperationInterface;
import org.palladiosimulator.pcm.repository.OperationProvidedRole;
import org.palladiosimulator.pcm.repository.RepositoryComponent;
import org.palladiosimulator.pcm.usagemodel.EntryLevelSystemCall;

import edu.kit.ipd.are.dsexplore.concern.concernweaver.WeavingInstruction;

public class AdapterUsageModelWeaving extends AdapterWeaving {

	private RepositoryComponent adapter;
	
	private void setAdapter(String uniqueName) {
		
		this.adapter = concernRepositoryManager.getComponentByUnique(uniqueName).get();
		
	}
	
	@Override
	public void weave(WeavingInstruction weavingInstruction) {
		
		if (!isDelegationConnectorLocation(weavingInstruction.getWeavingLocation())) {
			
			return;
			
		}
		
		setAdapter(getUniqueAdapterName(weavingInstruction));
		
		editEntryLevelSystemCalls();
		
	}

	private void editEntryLevelSystemCalls() {
		
		pcmUsageModelManager.getEntryLevelSystemCalls().ifPresent(entryLevelSystemCalls -> 
		
			entryLevelSystemCalls.forEach(eachEntryLevelSystemCall -> replaceProvidedRoleOf(eachEntryLevelSystemCall))
		
		);
		
	}

	private void replaceProvidedRoleOf(EntryLevelSystemCall entryLevelSystemCallToEdit) {
		
		OperationInterface calledInterface = entryLevelSystemCallToEdit.getOperationSignature__EntryLevelSystemCall().getInterface__OperationSignature();
		OperationProvidedRole newProvidedRole = getNewPorvidedRoleFromAdapterReferencing(calledInterface);
		
		entryLevelSystemCallToEdit.setProvidedRole_EntryLevelSystemCall(newProvidedRole);
		
	}

	//TODO refactoring: for each Optional.get() introduce exceptions (in each source-file)
	private OperationProvidedRole getNewPorvidedRoleFromAdapterReferencing(OperationInterface calledInterface) {
		
		return this.adapter.getProvidedRoles_InterfaceProvidingEntity().stream().filter(eachProvidedRole -> eachProvidedRole instanceof OperationProvidedRole)
																				.map(eachProvidedRole -> (OperationProvidedRole) eachProvidedRole)
																				.filter(eachOperationProvidedRole -> references(calledInterface, eachOperationProvidedRole))
																				.findFirst().get();
		
	}

	private boolean references(OperationInterface calledInterface, OperationProvidedRole givenProvidedRole) {
		
		return calledInterface.equals(givenProvidedRole.getProvidedInterface__OperationProvidedRole());
		
	}

}
