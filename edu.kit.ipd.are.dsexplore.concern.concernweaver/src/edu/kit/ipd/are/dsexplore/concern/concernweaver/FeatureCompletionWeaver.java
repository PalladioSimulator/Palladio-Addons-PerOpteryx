package edu.kit.ipd.are.dsexplore.concern.concernweaver;

import java.util.LinkedHashSet;
import java.util.List;

import org.palladiosimulator.solver.models.PCMInstance;

import de.uka.ipd.sdq.dsexplore.tools.repository.MergedRepository;
import edu.kit.ipd.are.dsexplore.concern.allocation.AllocationWeaver;
import edu.kit.ipd.are.dsexplore.concern.assembly.AssemblyWeaver;
import edu.kit.ipd.are.dsexplore.concern.exception.ConcernWeavingException;
import edu.kit.ipd.are.dsexplore.concern.repository.RepositoryWeaver;
import edu.kit.ipd.are.dsexplore.concern.seff.ServiceEffectSpecificationWeaver;
import edu.kit.ipd.are.dsexplore.concern.usagemodel.UsageModelWeaver;

/**
 * This class is the entry point which triggers the weaving process.
 *
 * @author scheerer
 *
 */
public class FeatureCompletionWeaver {

	private LinkedHashSet<WeavingStep> weavingChain;
	private PCMInstance pcmToAdapt;

	private static FeatureCompletionWeaver eInstance = null;

	/**
	 * The constructor.
	 */
	private FeatureCompletionWeaver() {
	}

	/**
	 * Creates or returns an already existing ConcernWeaver-instance.
	 *
	 * @param pcmToAdapt
	 *            - The PCM model that is going to be woven.
	 * @param featureCompletionSolution
	 *            - The concrete realization of a specific concern.
	 * @return The created or re-configured ConcernWeaver-instance.
	 */
	public static FeatureCompletionWeaver getBy(PCMInstance pcmToAdapt, MergedRepository mergedRepo) {
		if (FeatureCompletionWeaver.eInstance == null) {
			FeatureCompletionWeaver.eInstance = new FeatureCompletionWeaver();
		}
		FeatureCompletionWeaver.eInstance.initialize(pcmToAdapt, mergedRepo);
		return FeatureCompletionWeaver.eInstance;
	}

	private void initialize(PCMInstance pcmToAdapt, MergedRepository mergedRepo) {
		this.initializePcmToAdapt(pcmToAdapt);
		this.initializeWeavingChain(mergedRepo);
	}

	private void initializePcmToAdapt(PCMInstance pcmToAdapt) {
		this.pcmToAdapt = pcmToAdapt;
	}

	private void initializeWeavingChain(MergedRepository mergedRepo) {
		WeavingStep.setGlobalSettings(this.pcmToAdapt, mergedRepo);
		this.weavingChain = new LinkedHashSet<>();
		this.weavingChain.add(new RepositoryWeaver());
		this.weavingChain.add(new AssemblyWeaver());
		this.weavingChain.add(new AllocationWeaver());
		this.weavingChain.add(new ServiceEffectSpecificationWeaver());
		this.weavingChain.add(new UsageModelWeaver());

	}

	/**
	 * Triggers the weaving process.
	 *
	 * @param weavingInstructions
	 *            - Includes all weaving instructions that are needed by the
	 *            weaving-process.
	 * @return The woven PCM model.
	 * @throws ConcernWeavingException
	 *             - Will be thrown if there occurr any error during the weaving
	 *             process.
	 */
	public PCMInstance start(List<WeavingInstruction> weavingInstructions) throws ConcernWeavingException {
		this.weave(weavingInstructions);
		return this.pcmToAdapt;
	}

	private void weave(List<WeavingInstruction> weavingInstructions) throws ConcernWeavingException {
		for (WeavingInstruction eachWeavingInstruction : weavingInstructions) {
			WeavingStep.setWeavingStrategy(eachWeavingInstruction.getInclusionMechanism());
			for (WeavingStep eachWeavingStep : this.weavingChain) {
				eachWeavingStep.weave(eachWeavingInstruction);
			}
		}
	}
}