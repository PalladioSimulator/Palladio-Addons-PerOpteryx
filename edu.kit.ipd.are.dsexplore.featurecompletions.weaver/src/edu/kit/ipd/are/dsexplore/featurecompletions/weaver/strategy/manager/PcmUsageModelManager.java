package edu.kit.ipd.are.dsexplore.featurecompletions.weaver.strategy.manager;

import java.util.List;

import org.palladiosimulator.pcm.usagemodel.EntryLevelSystemCall;
import org.palladiosimulator.pcm.usagemodel.UsageModel;

import de.uka.ipd.sdq.dsexplore.tools.stereotypeapi.EcoreReferenceResolver;

/**
 * This class provides all operations performed on a PCM usage model.
 *
 * @author scheerer
 *
 */
public class PcmUsageModelManager {
	private UsageModel usageModel;

	public PcmUsageModelManager(UsageModel usageModel) {
		this.usageModel = usageModel;
	}

	/**
	 * Filters all entry level system calls of the PCm usage model.
	 *
	 * @return the set of all filtered entry level system calls.
	 */
	public List<EntryLevelSystemCall> getEntryLevelSystemCalls() {
		return new EcoreReferenceResolver(this.usageModel).getAllContainedElementsOfType(EntryLevelSystemCall.class);
	}

}
