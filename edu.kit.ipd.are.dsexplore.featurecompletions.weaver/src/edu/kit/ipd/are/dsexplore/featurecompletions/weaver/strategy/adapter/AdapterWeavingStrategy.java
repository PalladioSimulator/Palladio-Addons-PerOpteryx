package edu.kit.ipd.are.dsexplore.featurecompletions.weaver.strategy.adapter;

import java.util.ArrayList;
import java.util.List;

import org.palladiosimulator.pcm.core.composition.AssemblyContext;
import org.palladiosimulator.pcm.core.entity.Entity;
import org.palladiosimulator.pcm.repository.Interface;
import org.palladiosimulator.pcm.repository.OperationInterface;
import org.palladiosimulator.pcm.repository.OperationSignature;
import org.palladiosimulator.pcm.repository.Repository;
import org.palladiosimulator.pcm.repository.RepositoryComponent;
import org.palladiosimulator.pcm.system.System;
import org.palladiosimulator.solver.models.PCMInstance;

import FeatureCompletionModel.ComplementumVisnetis;
import FeatureCompletionModel.FeatureCompletion;
import de.uka.ipd.sdq.dsexplore.tools.primitives.Pair;
import de.uka.ipd.sdq.dsexplore.tools.repository.MergedRepository;
import de.uka.ipd.sdq.dsexplore.tools.stereotypeapi.StereotypeAPIHelper;
import edu.kit.ipd.are.dsexplore.featurecompletions.weaver.port.FCCWeaverException;
import edu.kit.ipd.are.dsexplore.featurecompletions.weaver.strategy.IWeavingStrategy;
import edu.kit.ipd.are.dsexplore.featurecompletions.weaver.strategy.WeavingInstruction;
import edu.kit.ipd.are.dsexplore.featurecompletions.weaver.strategy.WeavingLocation;
import edu.kit.ipd.are.dsexplore.featurecompletions.weaver.strategy.handler.FCCFeatureHandler;
import edu.kit.ipd.are.dsexplore.featurecompletions.weaver.strategy.manager.MergedRepoManager;
import edu.kit.ipd.are.dsexplore.featurecompletions.weaver.strategy.manager.PcmAllocationManager;
import edu.kit.ipd.are.dsexplore.featurecompletions.weaver.strategy.manager.PcmServiceEffectSpecificationManager;
import edu.kit.ipd.are.dsexplore.featurecompletions.weaver.strategy.manager.PcmSystemManager;
import edu.kit.ipd.are.dsexplore.featurecompletions.weaver.strategy.manager.PcmUsageModelManager;
import edu.kit.ipd.are.dsexplore.featurecompletions.weaver.util.InstructionGenerator;
import featureSolution.InclusionMechanism;

public class AdapterWeavingStrategy implements IWeavingStrategy, IAdapterWeaving {

	private final PCMInstance pcmToAdapt;
	private final MergedRepository mergedRepo;
	private final FeatureCompletion fc;
	private final InclusionMechanism im;

	private RepositoryComponent currentAdapter;
	private AssemblyContext currentAC;

	public AdapterWeavingStrategy(PCMInstance pcmToAdapt, MergedRepository mergedRepo, FeatureCompletion fc, InclusionMechanism im) {
		this.pcmToAdapt = pcmToAdapt;
		this.mergedRepo = mergedRepo;
		this.fc = fc;
		this.im = im;
		this.initManagers();
	}

	@Override
	public void weaveRepository(WeavingInstruction weavingInstruction) throws FCCWeaverException {
		// TODO Auto-generated method stub

	}

	@Override
	public void weaveAssembly(WeavingInstruction weavingInstruction) throws FCCWeaverException {
		// TODO Auto-generated method stub

	}

	@Override
	public void weaveAllocation(WeavingInstruction weavingInstruction) throws FCCWeaverException {
		// TODO Auto-generated method stub

	}

	@Override
	public void weaveServiceEffectSpecification(WeavingInstruction weavingInstruction) throws FCCWeaverException {
		// TODO Auto-generated method stub

	}

	@Override
	public void weaveUsageModel(WeavingInstruction weavingInstruction) throws FCCWeaverException {
		// TODO Auto-generated method stub

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

	@Override
	public void initialize(List<Pair<ComplementumVisnetis, WeavingLocation>> locations) {
		List<WeavingInstruction> instructions = this.determineInstructions(locations);

	}

	private List<WeavingInstruction> determineInstructions(List<Pair<ComplementumVisnetis, WeavingLocation>> locations) {
		FCCFeatureHandler fccfh = new FCCFeatureHandler(this.mrm);
		System pcmSystem = this.pcmToAdapt.getSystem();
		List<Pair<Entity, ComplementumVisnetis>> providedCVs = this.extractProvidedCVs();
		InstructionGenerator ig = new InstructionGenerator(this.fc, this.im, fccfh, this.pcmToAdapt);
		List<WeavingInstruction> instructions = new ArrayList<>();
		for (Pair<ComplementumVisnetis, WeavingLocation> targetLoc : locations) {
			instructions.add(ig.generate(targetLoc));
		}

		// this.applyOptionalAsDegree(optChoice, instructions);
		return instructions;

	}

	private List<Pair<Entity, ComplementumVisnetis>> extractProvidedCVs() {
		List<Pair<Entity, ComplementumVisnetis>> result = new ArrayList<>();

		for (Repository pcmRepo : this.mergedRepo) {
			for (RepositoryComponent rc : pcmRepo.getComponents__Repository()) {
				List<ComplementumVisnetis> cvsRc = StereotypeAPIHelper.getViaStereoTypeFrom(rc, ComplementumVisnetis.class, "fulfillsComplementumVisnetis");
				for (ComplementumVisnetis cv : cvsRc) {
					result.add(Pair.of(rc, cv));
				}
			}
			for (Interface iface : pcmRepo.getInterfaces__Repository()) {
				if (!(iface instanceof OperationInterface)) {
					continue;
				}
				OperationInterface opIface = (OperationInterface) iface;
				List<ComplementumVisnetis> cvsIface = StereotypeAPIHelper.getViaStereoTypeFrom(opIface, ComplementumVisnetis.class, "fulfillsComplementumVisnetis");
				for (ComplementumVisnetis cv : cvsIface) {
					result.add(Pair.of(opIface, cv));
				}

				for (OperationSignature opSig : opIface.getSignatures__OperationInterface()) {
					List<ComplementumVisnetis> cvsSig = StereotypeAPIHelper.getViaStereoTypeFrom(opSig, ComplementumVisnetis.class, "fulfillsComplementumVisnetis");
					for (ComplementumVisnetis cv : cvsSig) {
						result.add(Pair.of(opSig, cv));
					}
				}
			}
		}

		return result;
	}

}
