package edu.kit.ipd.are.dsexplore.featurecompletions.weaver.strategy.behaviour;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.eclipse.emf.ecore.EObject;

import org.palladiosimulator.pcm.allocation.AllocationContext;
import org.palladiosimulator.pcm.core.composition.AssemblyContext;
import org.palladiosimulator.pcm.repository.OperationSignature;
import org.palladiosimulator.pcm.repository.ProvidedRole;
import org.palladiosimulator.pcm.repository.Repository;
import org.palladiosimulator.pcm.resourceenvironment.ResourceContainer;
import org.palladiosimulator.solver.models.PCMInstance;
import org.palladiosimulator.solver.transformations.EMFHelper;

import FeatureCompletionModel.ComplementumVisnetis;
import FeatureCompletionModel.CompletionComponent;
import FeatureCompletionModel.FeatureCompletion;
import FeatureCompletionModel.PlacementPolicy;

import de.uka.ipd.sdq.dsexplore.tools.primitives.Pair;
import de.uka.ipd.sdq.dsexplore.tools.stereotypeapi.StereotypeAPIHelper;
import de.uka.ipd.sdq.pcm.designdecision.BoolChoice;
import de.uka.ipd.sdq.pcm.designdecision.Choice;
import de.uka.ipd.sdq.pcm.designdecision.ClassChoice;
import de.uka.ipd.sdq.pcm.designdecision.impl.designdecisionFactoryImpl;
import de.uka.ipd.sdq.pcm.designdecision.specific.AllocationDegree;
import de.uka.ipd.sdq.pcm.designdecision.specific.impl.specificFactoryImpl;

import edu.kit.ipd.are.dsexplore.featurecompletions.weaver.port.FCCModule;
import edu.kit.ipd.are.dsexplore.featurecompletions.weaver.port.FCCWeaverException;
import edu.kit.ipd.are.dsexplore.featurecompletions.weaver.strategy.IWeavingStrategy;
import edu.kit.ipd.are.dsexplore.featurecompletions.weaver.strategy.WeavingLocation;
import edu.kit.ipd.are.dsexplore.featurecompletions.weaver.strategy.WeavingStrategies;
import edu.kit.ipd.are.dsexplore.featurecompletions.weaver.strategy.behaviour.util.BehaviourInclusionInstructionGenerator;
import edu.kit.ipd.are.dsexplore.featurecompletions.weaver.strategy.handler.FCCFeatureHandler;
import edu.kit.ipd.are.dsexplore.featurecompletions.weaver.strategy.manager.PcmAllocationManager;
import edu.kit.ipd.are.dsexplore.featurecompletions.weaver.strategy.manager.PcmServiceEffectSpecificationManager;
import edu.kit.ipd.are.dsexplore.featurecompletions.weaver.strategy.manager.PcmSystemManager;
import edu.kit.ipd.are.dsexplore.featurecompletions.weaver.strategy.manager.PcmUsageModelManager;
import edu.kit.ipd.are.dsexplore.featurecompletions.weaver.strategy.manager.SolutionManager;

import placementDescription.Advice;
import placementDescription.SelectedCV;
import featureSolution.BehaviourInclusion;
import featureSolution.InclusionMechanism;
import placementDescription.PlacementStrategy;
import placementDescription.PointCut;
import placementDescription.impl.ControlFlowPlacementStrategyImpl;
import featureSolution.impl.BehaviourInclusionImpl;
import placementDescription.impl.ExternalCallPlacementStrategyImpl;
import placementDescription.impl.InternalActionPlacementStrategyImpl;

/**
 * This is the central class handling the Behaviour weaving mechanism. It is
 * initialized with the present degrees of freedom and triggers the weaving
 * operations for the PCM submodels (repository/seff, system, usage,
 * allocation).
 *
 * (It is based on the AdapterWeavingStrategy)
 *
 * @author Maximilian Eckert (maximilian.eckert@student.kit.edu, maxieckert@web.de)
 *
 */
public class BehaviourWeavingStrategy implements IWeavingStrategy, IBehaviourWeaving {

	private final PCMInstance pcmToAdapt;
	private final Repository solution;
	private final FeatureCompletion fc;
	private final InclusionMechanism im;

	public BehaviourWeavingStrategy(PCMInstance pcmToAdapt, Repository solution, FeatureCompletion fc, InclusionMechanism im) {
		this.pcmToAdapt = pcmToAdapt;
		this.solution = solution;
		this.fc = fc;
		this.im = im;
		this.initManagers();
	}

	// Managers
	private SolutionManager mrm;
	private PcmAllocationManager pam;
	private PcmServiceEffectSpecificationManager pseffm;
	private PcmSystemManager psm;
	private PcmUsageModelManager pumm;

	private void initManagers() {
		this.mrm = new SolutionManager(this.solution);
		this.pam = new PcmAllocationManager(this.pcmToAdapt.getAllocation());
		this.pseffm = new PcmServiceEffectSpecificationManager();
		this.psm = new PcmSystemManager(this.pcmToAdapt.getSystem());
		this.pumm = new PcmUsageModelManager(this.pcmToAdapt.getUsageModel());

	}

	@Override
	public PCMInstance getPCMToAdapt() {
		return this.pcmToAdapt;
	}

	@Override
	public SolutionManager getMergedRepoManager() {
		return this.mrm;
	}

	@Override
	public PcmAllocationManager getPCMAllocationManager() {
		return this.pam;
	}

	@Override
	public PcmServiceEffectSpecificationManager getPCMSEFFManager() {
		return this.pseffm;
	}

	@Override
	public PcmSystemManager getPCMSystemManager() {
		return this.psm;
	}

	@Override
	public PcmUsageModelManager getPCMUsageModelManager() {
		return this.pumm;
	}

	///////////////////// INITIALIZE //////////////////////////
	private List<IWeavingInstruction> instructions;

	// choices for fc solution
	private Choice solutionChoice;
	// choices for allocation
	private List<Choice> allocationChoices;
	// choices for multiple-flag
	private Choice multipleInclusionChoice;
	// choices for advice placements
	private List<Choice> advicePlacementChoices;
	// choices for cv selection
	private List<Choice> cvChoices;

	private List<ComplementumVisnetis> selectedCVs;

	/**
	 * Initializes the Behaviour weaving mechanism.
	 *
	 * @param locations
	 *            not used in Behaviour mechanism, as locations are determined
	 *            by dsl.
	 * @param solutionChoice
	 *            solution choice.
	 * @param featureChoices
	 *            feature choices.
	 * @param allocationChoices
	 *            allocation choices for fcc components.
	 * @param multipleInclusionChoice
	 *            multiple-flag choice.
	 * @param advicePlacementChoices
	 *            advice placement (mandatory/optional) choices.
	 */
	@Override
	public void initialize(List<Pair<ComplementumVisnetis, WeavingLocation>> locations, Choice solutionChoice, List<Choice> allocationChoices) {
		FCCModule.logger.debug("Initializing Behaviour Weaving Strategy");

		BehaviourStrategyExtension ese = (BehaviourStrategyExtension) WeavingStrategies.BEHAVIOUR.getExtension();
		
		//set choices
		this.solutionChoice = solutionChoice;
		//allocation choices will be filled while weaving when actually needed allocations are knwon
		this.allocationChoices = new ArrayList<Choice>();
		this.multipleInclusionChoice = ese.multipleInclusionChoice;
		this.advicePlacementChoices = ese.advicePlacementChoices;
		this.cvChoices = ese.cvChoices;
		
		//set chosen multiple flag
		if (this.multipleInclusionChoice != null) {
			this.im.setMultiple(((BoolChoice) this.multipleInclusionChoice).isChosenValue());
		} else {
			this.im.setMultiple(false);
		}
		
		//set selected cv choices
		this.setSelectedCVs();

		List<IWeavingInstruction> instructions = this.determineInstructions();
		this.instructions = instructions;

		FCCModule.logger.debug("Initialized " + instructions.size() + " instructions with " + instructions.stream().flatMap(instr -> instr.getWeavingLocations().stream()).count() + " weaving locations");
	}

	private void setSelectedCVs() {
		this.selectedCVs = this.cvChoices.stream().map(choice -> ((SelectedCV) choice.getValue()).getComplementumVisnetis()).collect(Collectors.toList());
	}

	/**
	 * Determines all advices that will be weaved into the system.
	 *
	 * @return selected advices that will be weaved.
	 */
	private List<Advice> getSelectedAdvices() {
		List<Advice> selectedAdvices = this.advicePlacementChoices.stream().filter(choice -> ((BoolChoice) choice).isChosenValue())
				.map(choice -> (Advice) choice.getDegreeOfFreedomInstance().getPrimaryChanged()).collect(Collectors.toList());
		// add mandatory advices
		selectedAdvices.addAll(((BehaviourInclusion) this.im).getAdvice().stream().filter(advice -> advice.getPlacementPolicy() == PlacementPolicy.MANDATORY).collect(Collectors.toList()));

		return selectedAdvices;
	}

	/**
	 * Calculates all weaving instructions. Each advice will be mapped to a
	 * corresponding weaving instruction.
	 *
	 * @return all weaving instructions.
	 */
	private List<IWeavingInstruction> determineInstructions() {
		FCCModule.logger.debug("Behaviour Weaving Strategy: Determine Weaving Locations");
		
		List<IWeavingInstruction> instructions = new ArrayList<>();

		BehaviourInclusionImpl behaviourIncl = (BehaviourInclusionImpl) this.im;
		
		//ig takes care of generating the corresponding weaving instructions
		BehaviourInclusionInstructionGenerator ig = new BehaviourInclusionInstructionGenerator(this.psm, new FCCFeatureHandler(this.mrm));

		for (Advice advice : this.getSelectedAdvices()) {
			PointCut pointCut = advice.getPointCut();
			PlacementStrategy placementStrategy = pointCut.getPlacementStrategy();
			List<IWeavingLocation> locations = new ArrayList<>();
			if (placementStrategy instanceof ExternalCallPlacementStrategyImpl) {
				locations.addAll(ig.generateExternalCallWeavingLocations((ExternalCallPlacementStrategyImpl) placementStrategy));
			} else if (placementStrategy instanceof InternalActionPlacementStrategyImpl) {
				locations.addAll(ig.generateInternalActionWeavingLocations((InternalActionPlacementStrategyImpl) placementStrategy));
			} else if (placementStrategy instanceof ControlFlowPlacementStrategyImpl) {
				locations.addAll(ig.generateControlFlowWeavingLocations((ControlFlowPlacementStrategyImpl) placementStrategy));
			}

			// create for current solution choice
			CompletionComponent completionComponent = new FCCFeatureHandler(this.mrm).getPerimeterProvidingFCCFor(this.selectedCVs, this.fc);
			List<OperationSignature> providedRoles = new FCCFeatureHandler(this.mrm).getPerimeterProvidedRolesFor(completionComponent, this.selectedCVs, this.fc);
			Pair<CompletionComponent, List<OperationSignature>> pair = new Pair<>(completionComponent, providedRoles);

			instructions.add(new BehaviourWeavingInstruction(pair, advice, locations, behaviourIncl));
		}
		return instructions;
	}

	/**
	 * Applies weaving operations to the PCM submodels.
	 */
	@Override
	public void weave() throws FCCWeaverException {
		FCCModule.logger.debug("Behaviour Weaving Strategy: Start Weaving");

		AllocationWeaving allocationWeaving = new AllocationWeaving(this);
		AssemblyWeaving assemblyWeaving = new AssemblyWeaving(this);
		RepositoryWeaving repositoryWeaving = new RepositoryWeaving(this);
		//UsageModelWeaving usageModelWeaving = new UsageModelWeaving(this);

		for (IWeavingInstruction instruction : this.instructions) {
			ServiceEffectSpecificationWeaving seffWeaving = BehaviourWeavingFactory.getBehaviourSeffWeaverBy(instruction.getAdvice().getPointCut().getPlacementStrategy()).apply(this);

			// Weave all submodels
			repositoryWeaving.weave(instruction);
			seffWeaving.weave(instruction);
			assemblyWeaving.weave(instruction);
			allocationWeaving.weave(instruction);
			//usageModelWeaving.weave(instruction);
		}

		FCCModule.logger.debug("Behaviour Weaving Strategy: Weaving Finished");
		//DEBUG print pcm
//		 savePcmInstanceToFile(pcmToAdapt, "C:/Users/Maxi/git/PerOpteryxPlus/InnerEclipse/SimplePerOpteryx/pcm_debug/pcm_debug");
		//DEBUG print pcm
	}

	/**
	 * Saves a PCM-instance to file. (Debug purpose only, as PCM-instance is not
	 * usable any longer after save operation!)
	 *
	 * @param pcmInstance
	 *            the PCM-instance to save.
	 * @param filePath
	 *            the file path.
	 */
	public static void savePcmInstanceToFile(PCMInstance pcmInstance, String filePath) {
		BehaviourWeavingStrategy.saveToXMIFile(BehaviourWeavingStrategy.copyOf(pcmInstance.getAllocation()), filePath + ".allocation");
		List<Repository> repositories = pcmInstance.getRepositories();
		for (Repository repository : repositories) {
			BehaviourWeavingStrategy.saveToXMIFile(BehaviourWeavingStrategy.copyOf(repository), filePath + "_" + repository.getEntityName() + ".repository");
		}
		BehaviourWeavingStrategy.saveToXMIFile(BehaviourWeavingStrategy.copyOf(pcmInstance.getSystem()), filePath + ".system");
		BehaviourWeavingStrategy.saveToXMIFile(BehaviourWeavingStrategy.copyOf(pcmInstance.getUsageModel()), filePath + ".usagemodel");
	}

	public static void saveToXMIFile(EObject modelToSave, String fileName) {
		EMFHelper.saveToXMIFile(modelToSave, fileName);
	}

	private static EObject copyOf(EObject obj) {
		// Copier copier = new Copier();
		// EObject newObj = copier.copy(obj);
		// copier.copyReferences();
		// return newObj;
		return obj;
	}

	/**
	 * Determine the actual allocations of all inserted components and creates corresponding allocation choices.
	 * 
	 * @return corresponding allocation choices.
	 */
	@Override
	public List<Choice> getConvertedFCCClassChoices() {
		return this.allocationChoices;
	}
	
	/**
	 * Adds an allocation choice for a given assembly context.
	 * 
	 */
	public void addAllocationChoice(AssemblyContext assemblyContext, ResourceContainer container) {
		AllocationContext alloc = this.getPCMAllocationManager().getAllocationContextBy(ac -> ac.getAssemblyContext_AllocationContext().getId().equals(assemblyContext.getId())).get();
		AllocationDegree ad = specificFactoryImpl.init().createAllocationDegree();
		ad.setPrimaryChanged(alloc);
		ClassChoice choice = designdecisionFactoryImpl.init().createClassChoice();
		choice.setDegreeOfFreedomInstance(ad);
		choice.setChosenValue(container);
		allocationChoices.add(choice);
	}

	@Override
	public List<ComplementumVisnetis> getSelectedCVs() {
		return this.selectedCVs;
	}
}
