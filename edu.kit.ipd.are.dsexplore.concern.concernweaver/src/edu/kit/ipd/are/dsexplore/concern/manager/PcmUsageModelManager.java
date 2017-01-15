package edu.kit.ipd.are.dsexplore.concern.manager;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.palladiosimulator.pcm.usagemodel.EntryLevelSystemCall;
import org.palladiosimulator.pcm.usagemodel.UsageModel;

public class PcmUsageModelManager {

private static PcmUsageModelManager eInstance = null;
	
	private UsageModel usageModel;
	
	private PcmUsageModelManager() {
		
	}
	
	public static PcmUsageModelManager getBy(UsageModel usageModel) {
		
		if (eInstance == null) {
			
			eInstance = new PcmUsageModelManager();
			
		}
		
		eInstance.usageModel = usageModel;
		
		return eInstance;
		
	}
	
	public Optional<List<EntryLevelSystemCall>> getEntryLevelSystemCalls() {
		
		List<EntryLevelSystemCall> foundEntryLevelSystemCalls = new ArrayList<EntryLevelSystemCall>();
		TreeIterator<EObject> usageModelIterator = this.usageModel.eAllContents();
		
		while (usageModelIterator.hasNext()) {
			
			EObject current = usageModelIterator.next();
			
			if (current instanceof EntryLevelSystemCall) {
				
				foundEntryLevelSystemCalls.add((EntryLevelSystemCall) current);
				
			}
			
		}
		
		return (foundEntryLevelSystemCalls.size() == 0) ? Optional.empty() : Optional.of(foundEntryLevelSystemCalls);
		
	}
	
}
