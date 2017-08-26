package edu.kit.ipd.are.dsexplore.concern.manager;

import java.util.List;

import org.palladiosimulator.pcm.usagemodel.EntryLevelSystemCall;
import org.palladiosimulator.pcm.usagemodel.UsageModel;

import edu.kit.ipd.are.dsexplore.concern.util.EcoreReferenceResolver;

/**
 * This class provides all operations performed on a PCM usage model.
 *
 * @author scheerer
 *
 */
public class PcmUsageModelManager {
	private static PcmUsageModelManager eInstance = null;
	private UsageModel usageModel;

	private PcmUsageModelManager() {
	}

	/**
	 * Creates or returns a PcmUsageModelManager-instance.
	 *
	 * @param usageModel
	 *            - A given PCM usage model.
	 * @return a PcmUsageModelManager-instance.
	 */
	public static PcmUsageModelManager getInstanceBy(UsageModel usageModel) {
		if (PcmUsageModelManager.eInstance == null) {
			PcmUsageModelManager.eInstance = new PcmUsageModelManager();
		}
		PcmUsageModelManager.eInstance.usageModel = usageModel;
		return PcmUsageModelManager.eInstance;
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
