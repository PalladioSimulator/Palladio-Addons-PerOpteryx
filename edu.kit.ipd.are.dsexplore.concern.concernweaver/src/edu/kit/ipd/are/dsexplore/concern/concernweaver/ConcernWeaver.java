package edu.kit.ipd.are.dsexplore.concern.concernweaver;

import java.util.LinkedHashSet;
import java.util.List;

import org.palladiosimulator.pcm.repository.Repository;
import org.palladiosimulator.solver.models.PCMInstance;

import edu.kit.ipd.are.dsexplore.concern.allocation.AllocationWeaver;
import edu.kit.ipd.are.dsexplore.concern.assembly.AssemblyWeaving;
import edu.kit.ipd.are.dsexplore.concern.exception.ConcernWeavingException;
import edu.kit.ipd.are.dsexplore.concern.repository.RepositoryWeaving;
import edu.kit.ipd.are.dsexplore.concern.seff.ServiceEffectSpecificationWeaving;
import edu.kit.ipd.are.dsexplore.concern.usagemodel.UsageModelWeaving;

/**
 * This class is the entry point which triggers the weaving process. 
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
	 * @param pcmToAdapt - The PCM model that is going to be woven.
	 * @param concernSolution - The concrete realization of a specific concern.
	 * @return The created or re-configured ConcernWeaver-instance.
	 */
	public static ConcernWeaver getBy(PCMInstance pcmToAdapt, Repository concernSolution) {
		
		if (eInstance == null) {
			
			eInstance = new ConcernWeaver();
			
		}
		
		eInstance.initialize(pcmToAdapt, concernSolution);
		
		return eInstance;
		
	}
	
	private void initialize(PCMInstance pcmToAdapt, Repository concernSolution) {
		
		initializePcmToAdapt(pcmToAdapt);
		initializeWeavingChain(concernSolution);

	}

	private void initializePcmToAdapt(PCMInstance pcmToAdapt) {
		
		this.pcmToAdapt = pcmToAdapt;
		
	}

	private void initializeWeavingChain(Repository concernSolution) {
		
		WeavingStep.setGlobalSettings(this.pcmToAdapt, concernSolution);
		
		weavingChain = new LinkedHashSet<WeavingStep>();
		weavingChain.add(new RepositoryWeaving());
		weavingChain.add(new AssemblyWeaving());
		weavingChain.add(new AllocationWeaver());
		weavingChain.add(new ServiceEffectSpecificationWeaving());
		weavingChain.add(new UsageModelWeaving());
		
	}

	/**
	 * Triggers the weaving process.
	 * @param weavingInstructions - Includes all weaving instructions that are needed by the weaving-process.
	 * @return The woven PCM model.
	 * @throws ConcernWeavingException - Will be thrown if there occurr any error during the weaving process. 
	 */
	public PCMInstance start(List<WeavingInstruction> weavingInstructions) throws ConcernWeavingException {
		
		weave(weavingInstructions);
		
		return pcmToAdapt;
		
	}
	
	private void weave(List<WeavingInstruction> weavingInstructions) throws ConcernWeavingException {
		
		for (WeavingInstruction eachWeavingInstruction : weavingInstructions) {
			
			WeavingStep.setWeavingStrategy(eachWeavingInstruction.getTransformationStrategy());
			for(WeavingStep eachWeavingStep : this.weavingChain) {
				
				eachWeavingStep.weave(eachWeavingInstruction);
				
			}
			
		}
		
	}
	
}