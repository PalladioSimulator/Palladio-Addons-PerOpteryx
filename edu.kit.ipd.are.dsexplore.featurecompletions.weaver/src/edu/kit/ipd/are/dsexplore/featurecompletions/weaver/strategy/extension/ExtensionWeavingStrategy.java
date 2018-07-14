package edu.kit.ipd.are.dsexplore.featurecompletions.weaver.strategy.extension;

import java.util.ArrayList;
import java.util.List;

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
import de.uka.ipd.sdq.dsexplore.tools.primitives.Pair;
import de.uka.ipd.sdq.pcm.designdecision.Choice;
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
import featureSolution.InclusionMechanism;
import featureSolution.PlacementStrategy;
import featureSolution.PointCut;
import featureSolution.impl.ControlFlowPlacementStrategyImpl;
import featureSolution.impl.ExtensionInclusionImpl;
import featureSolution.impl.ExternalCallPlacementStrategyImpl;
import featureSolution.impl.InternalActionPlacementStrategyImpl;

/**
 * Taken from AdapterWeavingStrategy //TODO adopt for Extension Mechanism
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

	private Choice fccChoice;
	//private Choice fcSolutionChoice;

	@Override
	public void initialize(List<Pair<ComplementumVisnetis, WeavingLocation>> locations, Choice fccChoice, List<Choice> featureChoices, List<Choice> allocationChoices) {
		System.out.println("--------------- ExtensionWeavingStrategy.initialize --------------");

		this.fccChoice = fccChoice;

		List<IWeavingInstruction> instructions = this.determineInstructions();
		this.instructions = instructions;
	}

	/**
	 * @return
	 */
	private List<IWeavingInstruction> determineInstructions() {
		List<IWeavingInstruction> instructions = new ArrayList<>();

		ExtensionInclusionImpl extensionIncl = (ExtensionInclusionImpl) this.im;

		for (Advice advice : extensionIncl.getAdvice()) {
			PointCut pointCut = advice.getPointCut();
			PlacementStrategy placementStrategy = pointCut.getPlacementStrategy();
			List<IWeavingLocation> locations = new ArrayList<>();
			if (placementStrategy instanceof ExternalCallPlacementStrategyImpl) {
				Signature sig = ((ExternalCallPlacementStrategyImpl) placementStrategy).getMatchingSignature();
				// TODO find all occurences of signature sig in pcm

				List<Connector> connectors = this.psm.getConnectorsBy(connector -> connector instanceof AssemblyConnector ? true
						/*
						 * ((AssemblyConnector)
						 * connector).getProvidedRole_AssemblyConnector().
						 * getProvidedInterface__OperationProvidedRole().
						 * getSignatures__OperationInterface().contains(sig)
						 */ : false);

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
				// TODO find all internal actions in component
				RepositoryComponent component = ((InternalActionPlacementStrategyImpl) placementStrategy).getForAllInternalActionsIn();

				List<AssemblyContext> contexts = this.psm.getAssemblyContextsInstantiating(component);

				for (AssemblyContext assemblyContext : contexts) {
					locations.add(new InternalActionWeavingLocation(component, assemblyContext));
				}
			} else if (placementStrategy instanceof ControlFlowPlacementStrategyImpl) {
				// TODO find all control flows in component
				RepositoryComponent component = ((ControlFlowPlacementStrategyImpl) placementStrategy).getForAllControlFlowsIn();

				List<AssemblyContext> contexts = this.psm.getAssemblyContextsInstantiating(component);

				for (AssemblyContext assemblyContext : contexts) {
					locations.add(new ControlFlowWeavingLocation(component, assemblyContext));
				}
			}
			InstructionGenerator ig = new InstructionGenerator(this.fc, this.im, new FCCFeatureHandler(this.mrm), this.pcmToAdapt);

			// TODO anhand welchen CVs CompeltionComponents bestimmen??
			ComplementumVisnetis cv = advice.getCompletion().getFeatures().get(0);

			// Pair<CompletionComponent, List<ProvidedRole>> pair = new
			// Pair<CompletionComponent, List<ProvidedRole>>(new
			// FCCFeatureHandler(this.mrm).getPerimeterProvidingFCCFor(cv, fc),
			// new FCCFeatureHandler(this.mrm).getPerimeterProvidedRolesFor(cv,
			// fc));
			// TODO create for current solution choice
			Pair<CompletionComponent, List<ProvidedRole>> pair = new Pair<>(new FCCFeatureHandler(this.mrm).getPerimeterProvidingFCCFor(cv, this.fc),
					new FCCFeatureHandler(this.mrm).getPerimeterProvidedRolesFor(cv, this.fc, (Repository) this.fccChoice.getValue()));
			instructions.add(new ExtensionWeavingInstruction(pair, advice, locations,
					null/* TODO */, extensionIncl));
		}

		System.out.println("--------------- ExtensionWeavingStrategy.determineInstructions --------------");
		return instructions;
	}

	@Override
	public void weave() throws FCCWeaverException {
		System.out.println("--------------- ExtensionWeavingStrategy.weave --------------");

		AllocationWeaving allocationWeaving = new AllocationWeaving(this);

		for (IWeavingInstruction instruction : this.instructions) {
			RepositoryWeaving reporitoryWeaving = ExtensionWeavingFactory.getExtensionRepositoryWeaverBy(instruction.getAdvice().getPointCut().getPlacementStrategy()).apply(this);
			AssemblyWeaving assemblyWeaving = ExtensionWeavingFactory.getExtensionAssemblyWeaverBy(instruction.getAdvice().getPointCut().getPlacementStrategy()).apply(this);
			ServiceEffectSpecificationWeaving seffWeaving = ExtensionWeavingFactory.getExtensionSeffWeaverBy(instruction.getAdvice().getPointCut().getPlacementStrategy()).apply(this);
			// UsageModelWeaving umw =
			// ExtensionWeavingFactory.getExtensionUsageModelWeaverBy(instruction.getAdvice().getPointCut().getPlacementStrategy()).apply(this);

			// Weave it ..
			reporitoryWeaving.weave(instruction);
			seffWeaving.weave(instruction);
			
			assemblyWeaving.weave(instruction);
			allocationWeaving.weave(instruction);

		}

		System.out.println("--------------- ExtensionWeavingStrategy.weave finished --------------");
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

	// For debug purpose
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
