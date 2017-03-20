package edu.kit.ipd.are.dsexplore.concern.weavingstrategy.adapter;

import org.palladiosimulator.pcm.core.composition.AssemblyContext;
import org.palladiosimulator.pcm.repository.Repository;
import org.palladiosimulator.pcm.repository.RepositoryComponent;
import org.palladiosimulator.solver.models.PCMInstance;

import edu.kit.ipd.are.dsexplore.concern.concernweaver.WeavingInstruction;
import edu.kit.ipd.are.dsexplore.concern.exception.ConcernWeavingException;
import edu.kit.ipd.are.dsexplore.concern.manager.ConcernRepositoryManager;
import edu.kit.ipd.are.dsexplore.concern.manager.PcmAllocationManager;
import edu.kit.ipd.are.dsexplore.concern.manager.PcmRepositoriesManager;
import edu.kit.ipd.are.dsexplore.concern.manager.PcmSystemManager;
import edu.kit.ipd.are.dsexplore.concern.manager.PcmUsageModelManager;

public abstract class AdapterWeaving {
	
	protected static ConcernRepositoryManager concernRepositoryManager;
	protected static PcmAllocationManager pcmAllocationManager;
	protected static PcmRepositoriesManager pcmRepositoriesManager;
	protected static PcmSystemManager pcmSystemManager;
	protected static PcmUsageModelManager pcmUsageModelManager;

	protected static RepositoryComponent adapter;
	protected static AssemblyContext adapterAssemblyContext;
	
	public static void setManagersWith(PCMInstance pcmToAdapt, Repository pcmConcernRepository) {
		
		concernRepositoryManager = ConcernRepositoryManager.getBy(pcmConcernRepository);
		
		pcmAllocationManager = PcmAllocationManager.getBy(pcmToAdapt.getAllocation());
		pcmRepositoriesManager = PcmRepositoriesManager.getBy(pcmToAdapt.getRepositories());
		pcmSystemManager = PcmSystemManager.getBy(pcmToAdapt.getSystem());
		pcmUsageModelManager = PcmUsageModelManager.getBy(pcmToAdapt.getUsageModel());
		
	}
	
	protected static void setAdapterComponent(RepositoryComponent adapterComp) {
		
		adapter = adapterComp;
		
	}
	
	protected static void setAdapterAssemblyContext(AssemblyContext adapterAssCont) {
		
		adapterAssemblyContext = adapterAssCont;
		
	}
	
	public abstract void weave(WeavingInstruction weavingInstruction) throws ConcernWeavingException;
	
}
