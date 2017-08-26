package edu.kit.ipd.are.dsexplore.concern.concernweaver;

import java.util.LinkedHashSet;
import java.util.List;

import org.palladiosimulator.pcm.repository.Repository;
import org.palladiosimulator.solver.models.PCMInstance;

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
public class ConcernWeaver {

	private LinkedHashSet<WeavingStep> weavingChain;
	private PCMInstance pcmToAdapt;

	private static ConcernWeaver eInstance = null;

	/**
	 * The constructor.
	 */
	private ConcernWeaver() {
	}

	/**
	 * Creates or returns an already existing ConcernWeaver-instance.
	 *
	 * @param pcmToAdapt
	 *            - The PCM model that is going to be woven.
	 * @param concernSolution
	 *            - The concrete realization of a specific concern.
	 * @return The created or re-configured ConcernWeaver-instance.
	 */
	public static ConcernWeaver getBy(PCMInstance pcmToAdapt, Repository concernSolution) {
		if (ConcernWeaver.eInstance == null) {
			ConcernWeaver.eInstance = new ConcernWeaver();
		}
		ConcernWeaver.eInstance.initialize(pcmToAdapt, concernSolution);
		return ConcernWeaver.eInstance;
	}

	private void initialize(PCMInstance pcmToAdapt, Repository concernSolution) {
		this.initializePcmToAdapt(pcmToAdapt);
		this.initializeWeavingChain(concernSolution);
	}

	private void initializePcmToAdapt(PCMInstance pcmToAdapt) {
		this.pcmToAdapt = pcmToAdapt;
	}

	private void initializeWeavingChain(Repository concernSolution) {
		WeavingStep.setGlobalSettings(this.pcmToAdapt, concernSolution);
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
			WeavingStep.setWeavingStrategy(eachWeavingInstruction.getTransformationStrategy());
			for (WeavingStep eachWeavingStep : this.weavingChain) {
				eachWeavingStep.weave(eachWeavingInstruction);
			}
		}
	}
}