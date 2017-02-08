package edu.kit.ipd.are.dsexplore.concern.concernweaver;

import java.util.LinkedHashSet;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.eclipse.emf.ecore.EObject;
import org.modelversioning.emfprofile.Stereotype;
import org.palladiosimulator.mdsdprofiles.api.StereotypeAPI;
import org.palladiosimulator.pcm.repository.Repository;
import org.palladiosimulator.pcm.repository.RepositoryComponent;
import org.palladiosimulator.pcm.repository.RepositoryFactory;
import org.palladiosimulator.solver.models.PCMInstance;
import org.palladiosimulator.solver.transformations.EMFHelper;

import edu.kit.ipd.are.dsexplore.concern.allocation.AllocationWeaver;
import edu.kit.ipd.are.dsexplore.concern.assembly.AssemblyWeaving;
import edu.kit.ipd.are.dsexplore.concern.emfprofilefilter.AnnotationFilter;
import edu.kit.ipd.are.dsexplore.concern.repository.RepositoryWeaving;
import edu.kit.ipd.are.dsexplore.concern.seff.ServiceEffectSpecificationWeaving;
import edu.kit.ipd.are.dsexplore.concern.usagemodel.UsageModelWeaving;
import edu.kit.ipd.are.dsexplore.concern.util.ConcernWeaverConstant;
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
		
		//Repository pcmConcernRepository = initializePcmConcernRepositoryBy(concernSolution);
		//Workaround
		Repository pcmConcernRepository = concernSolution;
		initializeWeavingChain(pcmConcernRepository);

	}

	private Repository initializePcmConcernRepositoryBy(Repository concernSolution) {
		
		Repository pcmConcernRepository = getPcmConcernRepository();
		copy(concernSolution, pcmConcernRepository);
		savePcmConcernRepository(pcmConcernRepository);
		
		return pcmConcernRepository;
		
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
	
	private Repository getPcmConcernRepository() {
		
		Optional<Repository> concernRepository = pcmToAdapt.getRepositories().stream().filter(repository -> repository.getEntityName().equals(ConcernWeaverConstant.CONCERN_REPOSITORY_NAME))
				   																	  .findFirst();

		if (concernRepository.isPresent()) {

			return concernRepository.get();
		
		} 
		
		return createRepository();
		
	}
	
	//TODO extract method to repomanager
	private Repository createRepository() {
		
		Repository concernRepository = RepositoryFactory.eINSTANCE.createRepository();
		concernRepository.setEntityName(ConcernWeaverConstant.CONCERN_REPOSITORY_NAME);
		concernRepository.setRepositoryDescription(ConcernWeaverConstant.CONCERN_REPSITORY_DESCRIPTION);
		
		return concernRepository;
		
	}
	
	//This have to be done because multiple included concerns are stored in the same concern repository.
	private void copy(Repository source, Repository destination) {
		
		destination.getComponents__Repository().addAll(source.getComponents__Repository());
		destination.getInterfaces__Repository().addAll(source.getInterfaces__Repository());
		
	}

	/**
	 * Triggers the weaving process.
	 * @param pcmToAdapt - The PCM model a concern has to be woven to.
	 * @param weavingInstructions - Includes all weaving instructions that will be needed by the weaving-process.
	 * @return The PCM model enriched by the concerns functionality.
	 */
	public PCMInstance start(List<WeavingInstruction> weavingInstructions) {
		
		weave(weavingInstructions);
		postProcessing();
		
		return pcmToAdapt;
		
	}
	
	public void weave(List<WeavingInstruction> weavingInstructions) {
		
		weavingInstructions.forEach(eachWeavingInstruction -> {
			
			WeavingStep.setWeavingStrategy(eachWeavingInstruction.getTransformationStrategy());
			this.weavingChain.forEach(eachWeavingStep -> eachWeavingStep.weave(eachWeavingInstruction));
			
		});
		
	}
	
	private void postProcessing() {
		
//		unapplyTargetAnnotations();
//		savePcmConcernRepository(WeavingStep.getPCMConcernRepository());
//		savePcm();
		
	}
	
	private void unapplyTargetAnnotations() {
		
		AnnotationFilter filter = new AnnotationFilter(this.pcmToAdapt.getRepositories());
		filter.getTargetAnnotatedComponents().forEach(annotatedComponent -> {
			
			unapplyTargetAnnotationsFrom(annotatedComponent, StereotypeAPI.getAppliedStereotypes(annotatedComponent));
			
		});
		
	}

	private void unapplyTargetAnnotationsFrom(RepositoryComponent annotatedComponent, List<Stereotype> appliedStereotypes) {
		
		appliedStereotypes.forEach(appliedStereotype -> {
			
			StereotypeAPI.unapplyStereotype(annotatedComponent, appliedStereotype);
			
		});
		
	}

	private void savePcm() {
		
		save(asObjectList(this.pcmToAdapt.getRepositories()));
		save(this.pcmToAdapt.getSystem());
		save(this.pcmToAdapt.getAllocation());
		save(this.pcmToAdapt.getUsageModel());
		
	}

	private void save(List<EObject> modelsToSave) {
		
		modelsToSave.forEach(eachModelToSave -> save(eachModelToSave));
		
	}
	
	private void save(EObject modelToSave) {
		
		String location = ConcernWeaverUtil.getAbsolutePathOf(modelToSave);
		EMFHelper.saveToXMIFile(modelToSave, location);
		
	}

	private void savePcmConcernRepository(Repository pcmConcernRepository) {
		
		String location = ConcernWeaverUtil.getAbsolutePathOf(pcmConcernRepository, this.pcmToAdapt.getRepositories().get(0));
		EMFHelper.saveToXMIFile(pcmConcernRepository, location);
		
	}
	
	private List<EObject> asObjectList(List<Repository> repositories) {
		
		return repositories.stream().map(eachRepository -> (EObject) eachRepository)
									.collect(Collectors.toList());
		
	}
	
}