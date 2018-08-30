package edu.kit.ipd.are.dsexplore.featurecompletions.weaver.strategy.extension;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.eclipse.emf.ecore.EObject;
import org.palladiosimulator.pcm.allocation.AllocationContext;
import org.palladiosimulator.pcm.core.composition.AssemblyConnector;
import org.palladiosimulator.pcm.core.composition.AssemblyContext;
import org.palladiosimulator.pcm.core.composition.Connector;
import org.palladiosimulator.pcm.repository.BasicComponent;
import org.palladiosimulator.pcm.repository.ProvidedRole;
import org.palladiosimulator.pcm.repository.Repository;
import org.palladiosimulator.pcm.repository.RepositoryComponent;
import org.palladiosimulator.pcm.repository.Signature;
import org.palladiosimulator.pcm.seff.ExternalCallAction;
import org.palladiosimulator.pcm.seff.ResourceDemandingBehaviour;
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
import de.uka.ipd.sdq.pcm.designdecision.FeatureChoice;
import de.uka.ipd.sdq.pcm.designdecision.impl.designdecisionFactoryImpl;
import de.uka.ipd.sdq.pcm.designdecision.specific.AllocationDegree;
import de.uka.ipd.sdq.pcm.designdecision.specific.impl.specificFactoryImpl;
import edu.kit.ipd.are.dsexplore.featurecompletions.weaver.port.FCCModule;
import edu.kit.ipd.are.dsexplore.featurecompletions.weaver.port.FCCWeaverException;
import edu.kit.ipd.are.dsexplore.featurecompletions.weaver.strategy.IWeavingStrategy;
import edu.kit.ipd.are.dsexplore.featurecompletions.weaver.strategy.WeavingLocation;
import edu.kit.ipd.are.dsexplore.featurecompletions.weaver.strategy.WeavingStrategies;
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
 * This is the central class handling the extension weaving mechanism. It is
 * initialized with the present degrees of freedom and triggers the weaving
 * operations for the PCM submodels (repository/seff, system, usage,
 * allocation).
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

	// choices for fc solution
	private Choice fccChoice;
	// choices for allocation
	private List<Choice> allocationChoices;
	// choices for multiple-flag
	private Choice multipleInclusionChoice;
	// choices for advice placements
	private List<Choice> advicePlacementChoices;
	// TODO choices for cv selection
	private List<Choice> cvChoices;

	private List<ComplementumVisnetis> selectedCVs;
	private List<Choice> optionalFeatureChoices;

	/**
	 * Initializes the extension weaving mechanism.
	 *
	 * @param locations
	 *            not used in extension mechanism, as locations are determined
	 *            by dsl.
	 * @param fccChoice
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
	public void initialize(List<Pair<ComplementumVisnetis, WeavingLocation>> locations, Choice fccChoice, List<Choice> allocationChoices) {
		FCCModule.logger.debug("Initializing Extension Weaving Strategy");

		this.fccChoice = fccChoice;
		this.allocationChoices = allocationChoices;

		ExtensionStrategyExtension ese = (ExtensionStrategyExtension) WeavingStrategies.EXTENSION.getExtension();

		this.multipleInclusionChoice = ese.multipleInclusionChoice;
		this.im.setMultiple(((BoolChoice) this.multipleInclusionChoice).isChosenValue());

		this.advicePlacementChoices = ese.advicePlacementChoices;

		this.cvChoices = ese.cvChoices;
		this.optionalFeatureChoices = ese.featureChoices;
		// TODO set selected cv choices
		this.setSelectedCVs();

		List<IWeavingInstruction> instructions = this.determineInstructions();
		this.instructions = instructions;

		FCCModule.logger
				.debug("Initialized " + instructions.size() + " instructions with " + instructions.stream().flatMap(instr -> instr.getWeavingLocations().stream()).count() + " weaving locations");
	}

	/**
	 *
	 */
	private void setSelectedCVs() {
		this.selectedCVs = this.cvChoices.stream().map(choice -> (ComplementumVisnetis) choice.getValue()).collect(Collectors.toList());
		for (Choice choice : this.optionalFeatureChoices) {
			if (((FeatureChoice) choice).isSelected()) {
				this.selectedCVs.add((ComplementumVisnetis) ((FeatureChoice) choice).getDegreeOfFreedomInstance().getPrimaryChanged());
				((FeatureChoice) choice).setPresent(true);
			}
		}
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
		selectedAdvices.addAll(((ExtensionInclusion) this.im).getAdvice().stream().filter(advice -> advice.getPlacementPolicy() == PlacementPolicy.MANDATORY).collect(Collectors.toList()));

		return selectedAdvices;
	}

	/**
	 * Calculates all weaving instructions. Each advice will be mapped to a
	 * corresponding weaving instruction.
	 *
	 * @return all weaving instructions.
	 */
	private List<IWeavingInstruction> determineInstructions() {
		List<IWeavingInstruction> instructions = new ArrayList<>();

		ExtensionInclusionImpl extensionIncl = (ExtensionInclusionImpl) this.im;

		// for (Advice advice : extensionIncl.getAdvice()) {
		for (Advice advice : this.getSelectedAdvices()) {
			PointCut pointCut = advice.getPointCut();
			PlacementStrategy placementStrategy = pointCut.getPlacementStrategy();
			List<IWeavingLocation> locations = new ArrayList<>();
			if (placementStrategy instanceof ExternalCallPlacementStrategyImpl) {
				Signature sig = ((ExternalCallPlacementStrategyImpl) placementStrategy).getMatchingSignature();
				// find all occurences of signature sig in pcm

				List<Connector> connectors = this.psm.getConnectorsBy(connector -> connector instanceof AssemblyConnector ? true : false);

				for (Connector connector : connectors) {

					// TODO alle Komp-SEFFs nach ExternalCalls mit
					// entsprechender Sig durchsuchen!!
					RepositoryComponent comp = ((AssemblyConnector) connector).getRequiringAssemblyContext_AssemblyConnector().getEncapsulatedComponent__AssemblyContext();
					boolean match = ((BasicComponent) comp).getServiceEffectSpecifications__BasicComponent().stream().anyMatch(seff -> ((ResourceDemandingBehaviour) seff).getSteps_Behaviour().stream()
							.anyMatch(action -> action instanceof ExternalCallAction && ((ExternalCallAction) action).getCalledService_ExternalService().getId().equals(sig.getId())));
					//
					if (match) {
						AssemblyContext affectedContext = ((AssemblyConnector) connector).getRequiringAssemblyContext_AssemblyConnector();
						RepositoryComponent affectedComponent = affectedContext.getEncapsulatedComponent__AssemblyContext();
						locations.add(new ExternalCallWeavingLocation(sig, connector, affectedComponent, affectedContext));
					}
				}
			} else if (placementStrategy instanceof InternalActionPlacementStrategyImpl) {
				// find all internal actions in component
				RepositoryComponent component = ((InternalActionPlacementStrategyImpl) placementStrategy).getForAllInternalActionsIn();

				List<AssemblyContext> contexts = this.psm.getAssemblyContextsInstantiating(component);

				for (AssemblyContext assemblyContext : contexts) {
					locations.add(new InternalActionWeavingLocation(component, assemblyContext));
				}
			} else if (placementStrategy instanceof ControlFlowPlacementStrategyImpl) {
				// find all control flows in component
				RepositoryComponent component = ((ControlFlowPlacementStrategyImpl) placementStrategy).getForAllControlFlowsIn();

				List<AssemblyContext> contexts = this.psm.getAssemblyContextsInstantiating(component);

				for (AssemblyContext assemblyContext : contexts) {
					locations.add(new ControlFlowWeavingLocation(component, assemblyContext));
				}
			}
			InstructionGenerator ig = new InstructionGenerator(this.fc, this.im, new FCCFeatureHandler(this.mrm), this.pcmToAdapt);

			// TODO anhand welchen CVs CompeltionComponents bestimmen??
			// ComplementumVisnetis cv =
			// advice.getCompletion().getFeatures().get(0);
			ComplementumVisnetis cv = this.selectedCVs.get(0);

			// create for current solution choice
			Pair<CompletionComponent, ProvidedRole> pair = new Pair<>(new FCCFeatureHandler(this.mrm).getPerimeterProvidingFCCFor(cv, this.fc),
					new FCCFeatureHandler(this.mrm).getPerimeterProvidedRoleFor(cv, this.fc, (Repository) this.fccChoice.getValue()));
			instructions.add(new ExtensionWeavingInstruction(pair, advice, locations,
					null/* TODO */, extensionIncl));
		}

		FCCModule.logger.debug("Extension Weaving Strategy: Determine Weaving Locations");
		return instructions;
	}

	/**
	 * Applies weaving operations to the PCM submodels.
	 */
	@Override
	public void weave() throws FCCWeaverException {
		FCCModule.logger.debug("Extension Weaving Strategy: Start Weaving");

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

		FCCModule.logger.debug("Extension Weaving Strategy: Weaving Finished");
		// TODO print pcm
		// savePcmInstanceToFile(pcmToAdapt,
		// "C:/Users/Maxi/git/PerOpteryxPlus/InnerEclipse/SimplePerOpteryx/pcm_debug/pcm_debug");
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
	 * Saves a PCM-instance to file. (Debug purpose only, as PCM-instance is not
	 * usable any longer after save operation!)
	 *
	 * @param pcmInstance
	 *            the PCM-instance to save.
	 * @param filePath
	 *            the file path.
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

	@Override
	public List<Choice> getConvertedFCCClassChoices() {
		List<Choice> allocChoices = new ArrayList<>();
		for (Choice fccClassChoice : this.allocationChoices) {
			CompletionComponent fcc = (CompletionComponent) fccClassChoice.getDegreeOfFreedomInstance().getPrimaryChanged();
			List<AssemblyContext> assemblyContexts = this.getComponentsIntantiatingFCC(fcc);
			for (AssemblyContext assemblyContext : assemblyContexts) {
				try {
					AllocationContext alloc = this.getPCMAllocationManager().getAllocationContextBy(ac -> ac.getAssemblyContext_AllocationContext().getId().equals(assemblyContext.getId())).get();
					AllocationDegree ad = specificFactoryImpl.init().createAllocationDegree();
					ad.setPrimaryChanged(alloc);
					ClassChoice choice = designdecisionFactoryImpl.init().createClassChoice();
					choice.setDegreeOfFreedomInstance(ad);
					choice.setChosenValue(((ClassChoice) fccClassChoice).getChosenValue());
					allocChoices.add(choice);
				} catch (Exception e) {
					FCCModule.logger.warn(e.getMessage());
				}
			}
		}
		return allocChoices;
	}

	/**
	 * @param fcc
	 * @return
	 */
	private List<AssemblyContext> getComponentsIntantiatingFCC(CompletionComponent fcc) {
		List<AssemblyContext> result = new ArrayList<>();
		// search for component instantiating fcc
		for (AssemblyContext ac : this.psm.getAssemblyContextsBy(ac -> true)) {
			List<CompletionComponent> fccs = StereotypeAPIHelper.getViaStereoTypeFrom(ac.getEncapsulatedComponent__AssemblyContext(), CompletionComponent.class);
			if (fccs.size() == 1 && fccs.get(0).getId().equals(fcc.getId())) { // 1
																				// component
																				// should
																				// only
																				// realize
																				// 1
																				// fcc
				result.add(ac);
			}
		}
		return result;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see
	 * edu.kit.ipd.are.dsexplore.featurecompletions.weaver.strategy.extension.
	 * IExtensionWeaving#getSelectedCVs()
	 */
	@Override
	public List<ComplementumVisnetis> getSelectedCVs() {
		return this.selectedCVs;
	}

	// TODO Annahme: es kann nur 1 optionales Feature existieren!
	@Override
	public ComplementumVisnetis getSelectedOptionalCV() {
		for (ComplementumVisnetis cv : this.selectedCVs) {
			// TODO Maxi repair it
			// if (cv.getComplementaryFeature().getSimpleOptional() != null) {
			// return cv;
			// }
		}
		return null;
	}

}
