package edu.kit.ipd.are.dsexplore.featurecompletions.weaver.strategy.extension;

import java.util.List;

import org.palladiosimulator.pcm.core.composition.AssemblyContext;
import org.palladiosimulator.pcm.repository.RepositoryComponent;
import org.palladiosimulator.solver.models.PCMInstance;

import FeatureCompletionModel.ComplementumVisnetis;
import FeatureCompletionModel.FeatureCompletion;
import de.uka.ipd.sdq.dsexplore.tools.primitives.Pair;
import de.uka.ipd.sdq.dsexplore.tools.repository.MergedRepository;
import de.uka.ipd.sdq.pcm.designdecision.Choice;
import edu.kit.ipd.are.dsexplore.featurecompletions.weaver.port.FCCWeaverException;
import edu.kit.ipd.are.dsexplore.featurecompletions.weaver.strategy.IWeavingStrategy;
import edu.kit.ipd.are.dsexplore.featurecompletions.weaver.strategy.WeavingLocation;
import edu.kit.ipd.are.dsexplore.featurecompletions.weaver.strategy.manager.MergedRepoManager;
import edu.kit.ipd.are.dsexplore.featurecompletions.weaver.strategy.manager.PcmAllocationManager;
import edu.kit.ipd.are.dsexplore.featurecompletions.weaver.strategy.manager.PcmServiceEffectSpecificationManager;
import edu.kit.ipd.are.dsexplore.featurecompletions.weaver.strategy.manager.PcmSystemManager;
import edu.kit.ipd.are.dsexplore.featurecompletions.weaver.strategy.manager.PcmUsageModelManager;
import featureSolution.InclusionMechanism;


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
	
	/* (non-Javadoc)
	 * @see edu.kit.ipd.are.dsexplore.featurecompletions.weaver.strategy.extension.IExtensionWeaving#setAdapter(org.palladiosimulator.pcm.repository.RepositoryComponent)
	 */
	@Override
	public void setAdapter(RepositoryComponent component) {
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see edu.kit.ipd.are.dsexplore.featurecompletions.weaver.strategy.extension.IExtensionWeaving#setAdapter(org.palladiosimulator.pcm.core.composition.AssemblyContext)
	 */
	@Override
	public void setAdapter(AssemblyContext assembly) {
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see edu.kit.ipd.are.dsexplore.featurecompletions.weaver.strategy.extension.IExtensionWeaving#getPCMToAdapt()
	 */
	@Override
	public PCMInstance getPCMToAdapt() {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see edu.kit.ipd.are.dsexplore.featurecompletions.weaver.strategy.extension.IExtensionWeaving#getAdapterComponent()
	 */
	@Override
	public RepositoryComponent getAdapterComponent() {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see edu.kit.ipd.are.dsexplore.featurecompletions.weaver.strategy.extension.IExtensionWeaving#getAdapterAssemblyContext()
	 */
	@Override
	public AssemblyContext getAdapterAssemblyContext() {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see edu.kit.ipd.are.dsexplore.featurecompletions.weaver.strategy.extension.IExtensionWeaving#getMergedRepoManager()
	 */
	@Override
	public MergedRepoManager getMergedRepoManager() {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see edu.kit.ipd.are.dsexplore.featurecompletions.weaver.strategy.extension.IExtensionWeaving#getPCMAllocationManager()
	 */
	@Override
	public PcmAllocationManager getPCMAllocationManager() {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see edu.kit.ipd.are.dsexplore.featurecompletions.weaver.strategy.extension.IExtensionWeaving#getPCMSEFFManager()
	 */
	@Override
	public PcmServiceEffectSpecificationManager getPCMSEFFManager() {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see edu.kit.ipd.are.dsexplore.featurecompletions.weaver.strategy.extension.IExtensionWeaving#getPCMSystemManager()
	 */
	@Override
	public PcmSystemManager getPCMSystemManager() {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see edu.kit.ipd.are.dsexplore.featurecompletions.weaver.strategy.extension.IExtensionWeaving#getPCMUsageModelManager()
	 */
	@Override
	public PcmUsageModelManager getPCMUsageModelManager() {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see edu.kit.ipd.are.dsexplore.featurecompletions.weaver.strategy.IWeavingStrategy#initialize(java.util.List, java.util.List)
	 */
	@Override
	public void initialize(List<Pair<ComplementumVisnetis, WeavingLocation>> locations, List<Choice> featureChoices) {
		// TODO Auto-generated method stub
		System.out.println("--------------- ExtensionWeavingStrategy.initialize --------------");
	}

	/* (non-Javadoc)
	 * @see edu.kit.ipd.are.dsexplore.featurecompletions.weaver.strategy.IWeavingStrategy#weave()
	 */
	@Override
	public void weave() throws FCCWeaverException {
		// TODO Auto-generated method stub
		System.out.println("--------------- ExtensionWeavingStrategy.weave --------------");
	}
	
	
}
