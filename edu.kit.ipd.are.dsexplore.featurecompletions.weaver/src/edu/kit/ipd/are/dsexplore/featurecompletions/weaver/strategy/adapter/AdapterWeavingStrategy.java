package edu.kit.ipd.are.dsexplore.featurecompletions.weaver.strategy.adapter;

import org.palladiosimulator.pcm.core.composition.AssemblyContext;
import org.palladiosimulator.pcm.repository.RepositoryComponent;
import org.palladiosimulator.solver.models.PCMInstance;

import de.uka.ipd.sdq.dsexplore.tools.repository.MergedRepository;
import edu.kit.ipd.are.dsexplore.featurecompletions.weaver.port.FCCWeaverException;
import edu.kit.ipd.are.dsexplore.featurecompletions.weaver.strategy.IWeavingStrategy;
import edu.kit.ipd.are.dsexplore.featurecompletions.weaver.strategy.WeavingInstruction;
import edu.kit.ipd.are.dsexplore.featurecompletions.weaver.strategy.manager.MergedRepoManager;
import edu.kit.ipd.are.dsexplore.featurecompletions.weaver.strategy.manager.PcmAllocationManager;
import edu.kit.ipd.are.dsexplore.featurecompletions.weaver.strategy.manager.PcmServiceEffectSpecificationManager;
import edu.kit.ipd.are.dsexplore.featurecompletions.weaver.strategy.manager.PcmSystemManager;
import edu.kit.ipd.are.dsexplore.featurecompletions.weaver.strategy.manager.PcmUsageModelManager;

public class AdapterWeavingStrategy implements IWeavingStrategy, IAdapterWeaving {

	private PCMInstance pcmToAdapt;

	private RepositoryComponent currentAdapter;
	private AssemblyContext currentAC;

	private MergedRepository mergedRepo;

	public AdapterWeavingStrategy(PCMInstance pcmToAdapt, MergedRepository mergedRepo) {
		this.pcmToAdapt = pcmToAdapt;
		this.mergedRepo = mergedRepo;
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
		// pam
		this.pseffm = new PcmServiceEffectSpecificationManager();
		// psm
		this.psm = new PcmSystemManager(this.pcmToAdapt.getSystem());
		// this.pumm = new PcmUsageModelManager(usageModel)

	}

	@Override
	public MergedRepoManager getMergedRepoManager() {
		return this.mrm;
	}

	@Override
	public PcmAllocationManager getPCMAllocationManager() {
		// TODO Auto-generated method stub
		return null;
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
		// TODO Auto-generated method stub
		return null;
	}

}
