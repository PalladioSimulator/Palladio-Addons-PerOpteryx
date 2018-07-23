package edu.kit.ipd.are.dsexplore.featurecompletions.weaver.strategy.extension;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.eclipse.emf.ecore.EObject;
import org.palladiosimulator.pcm.core.composition.AssemblyConnector;
import org.palladiosimulator.pcm.core.composition.AssemblyContext;
import org.palladiosimulator.pcm.core.composition.Connector;
import org.palladiosimulator.pcm.repository.ProvidedRole;
import org.palladiosimulator.pcm.repository.Repository;
import org.palladiosimulator.pcm.repository.RepositoryComponent;
import org.palladiosimulator.pcm.repository.Signature;
import org.palladiosimulator.solver.models.PCMInstance;
import org.palladiosimulator.solver.transformations.EMFHelper;

import FeatureCompletionModel.ComplementumVisnetis;
import FeatureCompletionModel.CompletionComponent;
import FeatureCompletionModel.FeatureCompletion;
import FeatureCompletionModel.PlacementPolicy;

import de.uka.ipd.sdq.dsexplore.tools.primitives.Pair;
import de.uka.ipd.sdq.pcm.designdecision.Choice;
import de.uka.ipd.sdq.pcm.designdecision.FeatureChoice;

import edu.kit.ipd.are.dsexplore.featurecompletions.weaver.port.FCCWeaverException;
import edu.kit.ipd.are.dsexplore.featurecompletions.weaver.strategy.IWeavingStrategy;
import edu.kit.ipd.are.dsexplore.featurecompletions.weaver.strategy.WeavingLocation;
import edu.kit.ipd.are.dsexplore.featurecompletions.weaver.strategy.handler.FCCFeatureHandler;
import edu.kit.ipd.are.dsexplore.featurecompletions.weaver.strategy.manager.PcmAllocationManager;
import edu.kit.ipd.are.dsexplore.featurecompletions.weaver.strategy.manager.PcmServiceEffectSpecificationManager;
import edu.kit.ipd.are.dsexplore.featurecompletions.weaver.strategy.manager.PcmSystemManager;
import edu.kit.ipd.are.dsexplore.featurecompletions.weaver.strategy.manager.PcmUsageModelManager;
import edu.kit.ipd.are.dsexplore.featurecompletions.weaver.strategy.manager.SolutionManager;
import edu.kit.ipd.are.dsexplore.featurecompletions.weaver.util.InstructionGenerator;

import featureSolution.Advice;
import featureSolution.ExtensionInclusion;
import featureSolution.InclusionMechanism;
import featureSolution.PlacementStrategy;
import featureSolution.PointCut;
import featureSolution.impl.ControlFlowPlacementStrategyImpl;
import featureSolution.impl.ExtensionInclusionImpl;
import featureSolution.impl.ExternalCallPlacementStrategyImpl;
import featureSolution.impl.InternalActionPlacementStrategyImpl;

/**
 * This is the central class handling the extension weaving mechanism. 
 * It is initialized with the present degrees of freedom and triggers the weaving operations for the PCM submodels (repository/seff, system, usage, allocation).
 * 
 * (It is based on the AdapterWeavingStrategy)
 *
 * @author Maximilian Eckert (maxieckert@web.de)
 *
 */
public class ExtensionWeavingStrategy implements IWeavingStrategy, IExtensionWeaving {

	private final PCMInstance pcmToAdapt;
	private final Repository solution;
	private final FeatureCompletion fc;
	private final InclusionMechanism im;

	private RepositoryComponent currentAdapter;
	private AssemblyContext currentAC;

	private RepositoryComponent fcComponent;

	public ExtensionWeavingStrategy(PCMInstance pcmToAdapt, Repository solution, FeatureCompletion fc, InclusionMechanism im) {
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
	public void setAdapter(RepositoryComponent component) {
		this.currentAdapter = component;
	}

	@Override
	public void setAdapter(AssemblyContext assembly) {
		this.currentAC = assembly;
	}

	@Override
	public PCMInstance getPCMToAdapt() {
		return this.pcmToAdapt;
	}

	@Override
	public RepositoryComponent getAdapterComponent() {
		return this.currentAdapter;
	}

	@Override
	public AssemblyContext getAdapterAssemblyContext() {
		return this.currentAC;
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

	//choices for fc solution
	private Choice fccChoice;
	//choices for multiple-flag
	private Choice multipleInclusionChoice;
	//choices for advice placements
	private List<Choice> advicePlacementChoices;

	/**
	 * Initializes the extension weaving mechanism.
	 * 
	 * @param locations not used in extension mechanism, as locations are determined by dsl.
	 * @param fccChoice solution choice.
	 * @param featureChoices feature choices.
	 * @param allocationChoices allocation choices for fcc components.
	 * @param multipleInclusionChoice multiple-flag choice.
	 * @param advicePlacementChoices advice placement (mandatory/optional) choices.
	 */
	@Override
	public void initialize(List<Pair<ComplementumVisnetis, WeavingLocation>> locations, Choice fccChoice, List<Choice> featureChoices, List<Choice> allocationChoices, Choice multipleInclusionChoice, List<Choice> advicePlacementChoices) {
		System.out.println("--------------- ExtensionWeavingStrategy.initialize --------------");

		this.fccChoice = fccChoice;
		
		this.multipleInclusionChoice = multipleInclusionChoice;
		//TODO present or active?
		this.im.setMultiple(((FeatureChoice) this.multipleInclusionChoice).isSelected());
		((FeatureChoice) this.multipleInclusionChoice).setPresent(((FeatureChoice) this.multipleInclusionChoice).isSelected());
		
		this.advicePlacementChoices = advicePlacementChoices;

		List<IWeavingInstruction> instructions = this.determineInstructions();
		this.instructions = instructions;
	}

	/**
	 * Determines all advices that will be weaved into the system.
	 * 
	 * @return selected advices that will be weaved.
	 */
	private List<Advice> getSelectedAdvices() {
		List<Advice> selectedAdvices = advicePlacementChoices.stream().filter(choice -> ((FeatureChoice) choice).isSelected()).map(choice -> (Advice) choice.getDegreeOfFreedomInstance().getPrimaryChanged()).collect(Collectors.toList());
		//add mandatory advices
		selectedAdvices.addAll(((ExtensionInclusion) this.im).getAdvice().stream().filter(advice -> advice.getPlacementPolicy() == PlacementPolicy.MANDATORY).collect(Collectors.toList()));
		
		//TODO wo/wie setzen, present oder active?
		advicePlacementChoices.stream().forEach(choice -> ((FeatureChoice) choice).setPresent(((FeatureChoice) choice).isSelected()));
		return selectedAdvices;
	}

	/**
	 * Calculates all weaving instructions. Each advice will be mapped to a corresponding weaving instruction.
	 * 
	 * @return all weaving instructions.
	 */
	private List<IWeavingInstruction> determineInstructions() {
		List<IWeavingInstruction> instructions = new ArrayList<>();

		ExtensionInclusionImpl extensionIncl = (ExtensionInclusionImpl) this.im;

		//for (Advice advice : extensionIncl.getAdvice()) {
		for (Advice advice : this.getSelectedAdvices()) {
			PointCut pointCut = advice.getPointCut();
			PlacementStrategy placementStrategy = pointCut.getPlacementStrategy();
			List<IWeavingLocation> locations = new ArrayList<>();
			if (placementStrategy instanceof ExternalCallPlacementStrategyImpl) {
				Signature sig = ((ExternalCallPlacementStrategyImpl) placementStrategy).getMatchingSignature();
				//find all occurences of signature sig in pcm

				List<Connector> connectors = this.psm.getConnectorsBy(connector -> connector instanceof AssemblyConnector ? true : false);

				for (Connector connector : connectors) {
					boolean match = ((AssemblyConnector) connector).getProvidedRole_AssemblyConnector().getProvidedInterface__OperationProvidedRole().getSignatures__OperationInterface().stream()
							.anyMatch(signature -> signature.getId().equals(sig.getId()));
					if (match) {
						AssemblyContext affectedContext = ((AssemblyConnector) connector).getRequiringAssemblyContext_AssemblyConnector();
						RepositoryComponent affectedComponent = affectedContext.getEncapsulatedComponent__AssemblyContext();
						locations.add(new ExternalCallWeavingLocation(sig, connector, affectedComponent, affectedContext));
					}
				}
			} else if (placementStrategy instanceof InternalActionPlacementStrategyImpl) {
				//find all internal actions in component
				RepositoryComponent component = ((InternalActionPlacementStrategyImpl) placementStrategy).getForAllInternalActionsIn();

				List<AssemblyContext> contexts = this.psm.getAssemblyContextsInstantiating(component);

				for (AssemblyContext assemblyContext : contexts) {
					locations.add(new InternalActionWeavingLocation(component, assemblyContext));
				}
			} else if (placementStrategy instanceof ControlFlowPlacementStrategyImpl) {
				//find all control flows in component
				RepositoryComponent component = ((ControlFlowPlacementStrategyImpl) placementStrategy).getForAllControlFlowsIn();

				List<AssemblyContext> contexts = this.psm.getAssemblyContextsInstantiating(component);

				for (AssemblyContext assemblyContext : contexts) {
					locations.add(new ControlFlowWeavingLocation(component, assemblyContext));
				}
			}
			InstructionGenerator ig = new InstructionGenerator(this.fc, this.im, new FCCFeatureHandler(this.mrm), this.pcmToAdapt);

			// TODO anhand welchen CVs CompeltionComponents bestimmen??
			ComplementumVisnetis cv = advice.getCompletion().getFeatures().get(0);

			//create for current solution choice
			Pair<CompletionComponent, List<ProvidedRole>> pair = new Pair<>(new FCCFeatureHandler(this.mrm).getPerimeterProvidingFCCFor(cv, this.fc),
					new FCCFeatureHandler(this.mrm).getPerimeterProvidedRolesFor(cv, this.fc, (Repository) this.fccChoice.getValue()));
			instructions.add(new ExtensionWeavingInstruction(pair, advice, locations,
					null/* TODO */, extensionIncl));
		}

		System.out.println("--------------- ExtensionWeavingStrategy.determineInstructions --------------");
		return instructions;
	}

	/**
	 * Applies weaving operations to the PCM submodels.
	 */
	@Override
	public void weave() throws FCCWeaverException {
		System.out.println("--------------- ExtensionWeavingStrategy.weave --------------");

		AllocationWeaving allocationWeaving = new AllocationWeaving(this);
		AssemblyWeaving assemblyWeaving = new AssemblyWeaving(this);
		RepositoryWeaving repositoryWeaving = new RepositoryWeaving(this);
		UsageModelWeaving usageModelWeaving = new UsageModelWeaving(this);

		for (IWeavingInstruction instruction : this.instructions) {
			ServiceEffectSpecificationWeaving seffWeaving = ExtensionWeavingFactory.getExtensionSeffWeaverBy(instruction.getAdvice().getPointCut().getPlacementStrategy()).apply(this);
			
			// Weave it ..
			repositoryWeaving.weave(instruction);
			seffWeaving.weave(instruction);
			
			assemblyWeaving.weave(instruction);
			allocationWeaving.weave(instruction);

		}

		System.out.println("--------------- ExtensionWeavingStrategy.weave finished --------------");
		// TODO print pcm
		//savePcmInstanceToFile(pcmToAdapt, "C:/Users/Maxi/git/PerOpteryxPlus/InnerEclipse/SimplePerOpteryx/pcm_debug/pcm_debug");
		// TODO print pcm
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see
	 * edu.kit.ipd.are.dsexplore.featurecompletions.weaver.strategy.extension.
	 * IExtensionWeaving#setFcComponent(org.palladiosimulator.pcm.repository.
	 * RepositoryComponent)
	 */
	@Override
	public void setFcComponent(RepositoryComponent component) {
		this.fcComponent = component;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see
	 * edu.kit.ipd.are.dsexplore.featurecompletions.weaver.strategy.extension.
	 * IExtensionWeaving#getFcComponent()
	 */
	@Override
	public RepositoryComponent getFcComponent() {
		return this.fcComponent;
	}

	/**
	 * Saves a PCM-instance to file. (Debug purpose only, as PCM-instance is not usable any longer after save operation!)
	 * 
	 * @param pcmInstance the PCM-instance to save.
	 * @param filePath the file path.
	 */
	public static void savePcmInstanceToFile(PCMInstance pcmInstance, String filePath) {
		ExtensionWeavingStrategy.saveToXMIFile(ExtensionWeavingStrategy.copyOf(pcmInstance.getAllocation()), filePath + ".allocation");
		List<Repository> repositories = pcmInstance.getRepositories();
		for (Repository repository : repositories) {
			ExtensionWeavingStrategy.saveToXMIFile(ExtensionWeavingStrategy.copyOf(repository), filePath + "_" + repository.getEntityName() + ".repository");
		}
		// saveToXMIFile(pcmInstance.getResourceEnvironment(), filePath +
		// ".resourceenvironment");
		// saveToXMIFile(pcmInstance.getResourceRepository(), filePath +
		// ".resourcetype");
		ExtensionWeavingStrategy.saveToXMIFile(ExtensionWeavingStrategy.copyOf(pcmInstance.getSystem()), filePath + ".system");
		ExtensionWeavingStrategy.saveToXMIFile(ExtensionWeavingStrategy.copyOf(pcmInstance.getUsageModel()), filePath + ".usagemodel");
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

	/*
	 * (non-Javadoc)
	 *
	 * @see edu.kit.ipd.are.dsexplore.featurecompletions.weaver.strategy.
	 * IWeavingStrategy#getConvertedFCCClassChoices()
	 */
	@Override
	public List<Choice> getConvertedFCCClassChoices() {
		// TODO implement
		return new ArrayList<>();
	}

}
