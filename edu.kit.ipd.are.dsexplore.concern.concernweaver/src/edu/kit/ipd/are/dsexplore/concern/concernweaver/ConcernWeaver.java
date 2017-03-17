package edu.kit.ipd.are.dsexplore.concern.concernweaver;

import java.util.LinkedHashSet;
import java.util.List;
import java.util.stream.Collectors;

import org.eclipse.emf.ecore.EObject;
import org.modelversioning.emfprofile.Stereotype;
import org.palladiosimulator.mdsdprofiles.api.StereotypeAPI;
import org.palladiosimulator.pcm.repository.Repository;
import org.palladiosimulator.pcm.repository.RepositoryComponent;
import org.palladiosimulator.solver.models.PCMInstance;
import org.palladiosimulator.solver.transformations.EMFHelper;

import edu.kit.ipd.are.dsexplore.concern.allocation.AllocationWeaver;
import edu.kit.ipd.are.dsexplore.concern.assembly.AssemblyWeaving;
import edu.kit.ipd.are.dsexplore.concern.emfprofilefilter.AnnotationFilter;
import edu.kit.ipd.are.dsexplore.concern.exception.ConcernWeavingException;
import edu.kit.ipd.are.dsexplore.concern.repository.RepositoryWeaving;
import edu.kit.ipd.are.dsexplore.concern.seff.ServiceEffectSpecificationWeaving;
import edu.kit.ipd.are.dsexplore.concern.usagemodel.UsageModelWeaving;
import edu.kit.ipd.are.dsexplore.concern.util.ConcernWeaverUtil;

//TODO Logging 
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
	 * @param pcmToAdapt - The PCM model a concern has to be woven to.
	 * @param weavingInstructions - Includes all weaving instructions that will be needed by the weaving-process.
	 * @return The PCM model enriched by the concerns functionality.
	 * @throws ConcernWeavingException 
	 */
	public PCMInstance start(List<WeavingInstruction> weavingInstructions) throws ConcernWeavingException {
		
		weave(weavingInstructions);
		
		return pcmToAdapt;
		
	}
	
	public void weave(List<WeavingInstruction> weavingInstructions) throws ConcernWeavingException {
		
		for (WeavingInstruction eachWeavingInstruction : weavingInstructions) {
			
			WeavingStep.setWeavingStrategy(eachWeavingInstruction.getTransformationStrategy());
			for(WeavingStep eachWeavingStep : this.weavingChain) {
				
				eachWeavingStep.weave(eachWeavingInstruction);
				
			}
			
		}
		
	}
	
}