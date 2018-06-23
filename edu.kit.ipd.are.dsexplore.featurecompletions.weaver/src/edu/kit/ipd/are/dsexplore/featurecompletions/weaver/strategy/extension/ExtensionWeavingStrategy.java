package edu.kit.ipd.are.dsexplore.featurecompletions.weaver.strategy.extension;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import org.palladiosimulator.pcm.core.composition.AssemblyConnector;
import org.palladiosimulator.pcm.core.composition.AssemblyContext;
import org.palladiosimulator.pcm.core.composition.Connector;
import org.palladiosimulator.pcm.repository.BasicComponent;
import org.palladiosimulator.pcm.repository.OperationInterface;
import org.palladiosimulator.pcm.repository.OperationProvidedRole;
import org.palladiosimulator.pcm.repository.ProvidedRole;
import org.palladiosimulator.pcm.repository.RepositoryComponent;
import org.palladiosimulator.pcm.repository.Signature;
import org.palladiosimulator.pcm.seff.InternalAction;
import org.palladiosimulator.pcm.seff.ServiceEffectSpecification;
import org.palladiosimulator.solver.models.PCMInstance;

import FeatureCompletionModel.ComplementumVisnetis;
import FeatureCompletionModel.CompletionComponent;
import FeatureCompletionModel.FeatureCompletion;
import de.uka.ipd.sdq.dsexplore.tools.primitives.Pair;
import de.uka.ipd.sdq.dsexplore.tools.repository.MergedRepository;
import de.uka.ipd.sdq.pcm.designdecision.Choice;
import edu.kit.ipd.are.dsexplore.featurecompletions.weaver.port.FCCWeaverException;
import edu.kit.ipd.are.dsexplore.featurecompletions.weaver.strategy.IWeavingStrategy;
import edu.kit.ipd.are.dsexplore.featurecompletions.weaver.strategy.WeavingLocation;
import edu.kit.ipd.are.dsexplore.featurecompletions.weaver.strategy.handler.FCCFeatureHandler;
import edu.kit.ipd.are.dsexplore.featurecompletions.weaver.strategy.manager.MergedRepoManager;
import edu.kit.ipd.are.dsexplore.featurecompletions.weaver.strategy.manager.PcmAllocationManager;
import edu.kit.ipd.are.dsexplore.featurecompletions.weaver.strategy.manager.PcmServiceEffectSpecificationManager;
import edu.kit.ipd.are.dsexplore.featurecompletions.weaver.strategy.manager.PcmSystemManager;
import edu.kit.ipd.are.dsexplore.featurecompletions.weaver.strategy.manager.PcmUsageModelManager;
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
 * @author Maximilian Eckert (maxieckert@web.de)
 *
 */
public class ExtensionWeavingStrategy implements IWeavingStrategy, IExtensionWeaving {

	private final PCMInstance pcmToAdapt;
	private final MergedRepository mergedRepo;
	private final FeatureCompletion fc;
	private final InclusionMechanism im;

	private RepositoryComponent currentAdapter;
	private AssemblyContext currentAC;
	
	private RepositoryComponent fcComponent;

	public ExtensionWeavingStrategy(PCMInstance pcmToAdapt, MergedRepository mergedRepo, FeatureCompletion fc, InclusionMechanism im) {
		this.pcmToAdapt = pcmToAdapt;
		this.mergedRepo = mergedRepo;
		this.fc = fc;
		this.im = im;
		this.initManagers();
	}
	
	// Managers
	private MergedRepoManager mrm;
	private PcmAllocationManager pam;
	private PcmServiceEffectSpecificationManager pseffm;
	private PcmSystemManager psm;
	private PcmUsageModelManager pumm;

	private void initManagers() {
		this.mrm = new MergedRepoManager(this.mergedRepo);
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
	public MergedRepoManager getMergedRepoManager() {
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

	@Override
	public void initialize(List<Pair<ComplementumVisnetis, WeavingLocation>> locations, List<Choice> featureChoices) {
		System.out.println("--------------- ExtensionWeavingStrategy.initialize --------------");
		
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
				//TODO find all occurences of signature sig in pcm 
				
				List<Connector> connectors = this.psm.getConnectorsBy(connector -> connector instanceof AssemblyConnector ? true /*((AssemblyConnector) connector).getProvidedRole_AssemblyConnector().getProvidedInterface__OperationProvidedRole().getSignatures__OperationInterface().contains(sig)*/ : false);

				for (Connector connector : connectors) {
					boolean match = ((AssemblyConnector) connector).getProvidedRole_AssemblyConnector().getProvidedInterface__OperationProvidedRole().getSignatures__OperationInterface().stream().anyMatch(signature -> signature.getId().equals(sig.getId()));
					if (match) {
						locations.add(new ExternalCallWeavingLocation(sig, (AssemblyConnector) connector));
					}
				}
			} else if (placementStrategy instanceof InternalActionPlacementStrategyImpl) {
				//TODO find all internal actions in component 
				RepositoryComponent component = ((InternalActionPlacementStrategyImpl) placementStrategy).getForAllInternalActionsIn();
				
				List<AssemblyContext> contexts = this.psm.getAssemblyContextsInstantiating(component);

				for (AssemblyContext assemblyContext : contexts) {
					locations.add(new InternalActionWeavingLocation(component, assemblyContext));
				}
			} else if (placementStrategy instanceof ControlFlowPlacementStrategyImpl) {
				//TODO find all control flows in component 
				RepositoryComponent component = ((ControlFlowPlacementStrategyImpl) placementStrategy).getForAllControlFlowsIn();
				
				List<AssemblyContext> contexts = this.psm.getAssemblyContextsInstantiating(component);

				for (AssemblyContext assemblyContext : contexts) {
					locations.add(new ControlFlowWeavingLocation(component, assemblyContext));
				}
			}
			InstructionGenerator ig = new InstructionGenerator(this.fc, this.im, new FCCFeatureHandler(this.mrm), this.pcmToAdapt);
			//Pair<CompletionComponent, List<OperationInterface>> pair = new Pair<CompletionComponent, List<OperationInterface>>(ig.getFCCByVisnetis(advice.getCompletion()), new FCCFeatureHandler(this.mrm).getFullfillingInterfacesFor(advice.getCompletion()));
			Pair<CompletionComponent, List<ProvidedRole>> pair = new Pair<CompletionComponent, List<ProvidedRole>>(ig.getFCCByVisnetis(advice.getCompletion()), new FCCFeatureHandler(this.mrm).getProvidedRolesOf(ig.getFCCByVisnetis(advice.getCompletion()), (advice.getCompletion())));
			instructions.add(new ExtensionWeavingInstruction(pair, advice, locations, null/* TODO */));
		}

		System.out.println("--------------- ExtensionWeavingStrategy.determineInstructions --------------");
		return instructions;
	}


	@Override
	public void weave() throws FCCWeaverException {
		System.out.println("--------------- ExtensionWeavingStrategy.weave --------------");
		
		AllocationWeaving alw = new AllocationWeaving(this);
		
		
		for (IWeavingInstruction instruction : this.instructions) {
			RepositoryWeaving rw = ExtensionWeavingFactory.getExtensionRepositoryWeaverBy(instruction.getAdvice().getPointCut().getPlacementStrategy()).apply(this);
			AssemblyWeaving asw = ExtensionWeavingFactory.getExtensionAssemblyWeaverBy(instruction.getAdvice().getPointCut().getPlacementStrategy()).apply(this);
			ServiceEffectSpecificationWeaving sew = ExtensionWeavingFactory.getExtensionSeffWeaverBy(instruction.getAdvice().getPointCut().getPlacementStrategy()).apply(this);
			UsageModelWeaving umw = ExtensionWeavingFactory.getExtensionUsageModelWeaverBy(instruction.getAdvice().getPointCut().getPlacementStrategy()).apply(this);
			
			// Weave it ..
			//rw.weave(instruction);
			
			//alw.weave(instruction);
			sew.weave(instruction);
			asw.weave(instruction);
			//umw.weave(instruction);
		}
		
	}

	/* (non-Javadoc)
	 * @see edu.kit.ipd.are.dsexplore.featurecompletions.weaver.strategy.extension.IExtensionWeaving#setFcComponent(org.palladiosimulator.pcm.repository.RepositoryComponent)
	 */
	@Override
	public void setFcComponent(RepositoryComponent component) {
		this.fcComponent = component;
	}

	/* (non-Javadoc)
	 * @see edu.kit.ipd.are.dsexplore.featurecompletions.weaver.strategy.extension.IExtensionWeaving#getFcComponent()
	 */
	@Override
	public RepositoryComponent getFcComponent() {
		return fcComponent;
	}
	
	
}
