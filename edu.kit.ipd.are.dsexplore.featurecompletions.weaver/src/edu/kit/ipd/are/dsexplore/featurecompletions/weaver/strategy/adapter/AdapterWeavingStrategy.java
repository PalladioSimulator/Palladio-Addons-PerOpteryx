package edu.kit.ipd.are.dsexplore.featurecompletions.weaver.strategy.adapter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.palladiosimulator.pcm.allocation.AllocationContext;
import org.palladiosimulator.pcm.core.composition.AssemblyContext;
import org.palladiosimulator.pcm.core.composition.Connector;
import org.palladiosimulator.pcm.repository.Repository;
import org.palladiosimulator.pcm.repository.RepositoryComponent;
import org.palladiosimulator.solver.models.PCMInstance;

import FeatureCompletionModel.ComplementumVisnetis;
import FeatureCompletionModel.CompletionComponent;
import FeatureCompletionModel.FeatureCompletion;
import de.uka.ipd.sdq.dsexplore.tools.primitives.Pair;
import de.uka.ipd.sdq.pcm.designdecision.BoolChoice;
import de.uka.ipd.sdq.pcm.designdecision.Choice;
import de.uka.ipd.sdq.pcm.designdecision.ClassChoice;
import de.uka.ipd.sdq.pcm.designdecision.impl.designdecisionFactoryImpl;
import de.uka.ipd.sdq.pcm.designdecision.specific.AllocationDegree;
import de.uka.ipd.sdq.pcm.designdecision.specific.FeatureDegree;
import de.uka.ipd.sdq.pcm.designdecision.specific.impl.specificFactoryImpl;
import edu.kit.ipd.are.dsexplore.featurecompletions.weaver.port.FCCModule;
import edu.kit.ipd.are.dsexplore.featurecompletions.weaver.port.FCCWeaverException;
import edu.kit.ipd.are.dsexplore.featurecompletions.weaver.strategy.IWeavingStrategy;
import edu.kit.ipd.are.dsexplore.featurecompletions.weaver.strategy.WeavingInstruction;
import edu.kit.ipd.are.dsexplore.featurecompletions.weaver.strategy.WeavingLocation;
import edu.kit.ipd.are.dsexplore.featurecompletions.weaver.strategy.WeavingStrategies;
import edu.kit.ipd.are.dsexplore.featurecompletions.weaver.strategy.handler.FCCFeatureHandler;
import edu.kit.ipd.are.dsexplore.featurecompletions.weaver.strategy.handler.FCCStructureHandler;
import edu.kit.ipd.are.dsexplore.featurecompletions.weaver.strategy.manager.PcmAllocationManager;
import edu.kit.ipd.are.dsexplore.featurecompletions.weaver.strategy.manager.PcmServiceEffectSpecificationManager;
import edu.kit.ipd.are.dsexplore.featurecompletions.weaver.strategy.manager.PcmSystemManager;
import edu.kit.ipd.are.dsexplore.featurecompletions.weaver.strategy.manager.PcmUsageModelManager;
import edu.kit.ipd.are.dsexplore.featurecompletions.weaver.strategy.manager.SolutionManager;
import edu.kit.ipd.are.dsexplore.featurecompletions.weaver.util.InstructionGenerator;
import featureSolution.InclusionMechanism;

public class AdapterWeavingStrategy implements IWeavingStrategy, IAdapterWeaving {

	private final PCMInstance pcmToAdapt;
	private final Repository solution;
	private final FeatureCompletion fc;
	private final InclusionMechanism im;

	private RepositoryComponent currentAdapter;
	private AssemblyContext currentAC;

	public AdapterWeavingStrategy(PCMInstance pcmToAdapt, Repository solution, FeatureCompletion fc, InclusionMechanism im) {
		this.pcmToAdapt = pcmToAdapt;
		this.solution = solution;
		this.fc = fc;
		this.im = im;
		this.initManagers();
	}

	@Override
	public void weave() throws FCCWeaverException {
		/*
		 * this.weavingChain.add(new RepositoryWeaver());
		 * this.weavingChain.add(new AssemblyWeaver());
		 * this.weavingChain.add(new AllocationWeaver());
		 * this.weavingChain.add(new ServiceEffectSpecificationWeaver());
		 * this.weavingChain.add(new UsageModelWeaver());
		 */
		AllocationWeaving alw = new AllocationWeaving(this);
		UsageModelWeaving umw = new UsageModelWeaving(this);
		for (WeavingInstruction instruction : this.instructions) {
			RepositoryWeaving rw = AdapterWeavingFactory.getAdapterRepositoryWeaverBy(instruction.getWeavingLocation()).apply(this);
			AssemblyWeaving asw = AdapterWeavingFactory.getAdapterAssemblyWeaverBy(instruction.getWeavingLocation()).apply(this);
			ServiceEffectSpecificationWeaving sew = AdapterWeavingFactory.getAdapterSeffWeaverBy(instruction.getWeavingLocation()).apply(this);

			// Weave it ..
			rw.weave(instruction);
			asw.weave(instruction);
			alw.weave(instruction);
			sew.weave(instruction);
			umw.weave(instruction);
		}

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
	public RepositoryComponent getAdapterComponent() {
		return this.currentAdapter;
	}

	@Override
	public AssemblyContext getAdapterAssemblyContext() {
		return this.currentAC;
	}

	@Override
	public PCMInstance getPCMToAdapt() {
		return this.pcmToAdapt;
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
	public SolutionManager getSolutionManager() {
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
	private List<WeavingInstruction> instructions;
	private List<Choice> allocationChoices;

	@Override
	public void initialize(List<Pair<ComplementumVisnetis, WeavingLocation>> locations, Choice fccChoice, List<Choice> allocationChoices) {
		AdapterStrategyExtension ase = (AdapterStrategyExtension) WeavingStrategies.ADAPTER.getExtension();

		List<WeavingInstruction> instructions = this.determineInstructions(locations, ase.optionalFeatures);
		this.instructions = instructions;
		this.allocationChoices = allocationChoices;
	}

	private List<WeavingInstruction> determineInstructions(List<Pair<ComplementumVisnetis, WeavingLocation>> locations, List<BoolChoice> optionalFeatures) {
		FCCFeatureHandler fccfh = new FCCFeatureHandler(this.mrm);
		InstructionGenerator ig = new InstructionGenerator(this.fc, this.im, fccfh, this.pcmToAdapt);
		List<WeavingInstruction> instructions = new ArrayList<>();

		List<Connector> notShallConnectors = new ArrayList<>();
		this.getNotShallConnectorsFeatures(optionalFeatures, notShallConnectors);

		for (Pair<ComplementumVisnetis, WeavingLocation> targetLoc : locations) {
			instructions.add(ig.generate(targetLoc));
		}

		instructions.removeIf(i -> notShallConnectors.contains(i.getWeavingLocation().getLocation()));
		return instructions;

	}

	private void getNotShallConnectorsFeatures(List<BoolChoice> optionalFeatures, List<Connector> notShall) {
		for (BoolChoice ch : optionalFeatures) {
			FeatureDegree fd = (FeatureDegree) ch.getDegreeOfFreedomInstance();
			@SuppressWarnings("unchecked")
			Pair<Connector, ComplementumVisnetis> f = (Pair<Connector, ComplementumVisnetis>) fd.getPrimaryChanged();
			if (!ch.isChosenValue()) {
				notShall.add(f.first);
			}
		}
	}

	@Override
	public List<Choice> getConvertedFCCClassChoices() {
		List<Choice> allocChoices = new ArrayList<>();
		for (Choice fccClassChoice : this.allocationChoices) {
			CompletionComponent fcc = (CompletionComponent) fccClassChoice.getDegreeOfFreedomInstance().getPrimaryChanged();
			FCCStructureHandler fccHandler = new FCCStructureHandler(fcc, this.mrm);
			for (RepositoryComponent comp : fccHandler.getStructureOfFCCAccordingTo(component -> Arrays.asList(component))) {
				try {
					AllocationContext alloc = this.getPCMAllocationManager().getAllocationContextContaining(comp);
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

}
