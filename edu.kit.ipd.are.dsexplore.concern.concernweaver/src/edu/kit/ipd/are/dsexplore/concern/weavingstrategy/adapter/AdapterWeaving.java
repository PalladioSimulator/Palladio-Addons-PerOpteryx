package edu.kit.ipd.are.dsexplore.concern.weavingstrategy.adapter;

import java.util.List;
import java.util.stream.Collectors;

import org.palladiosimulator.pcm.core.composition.ProvidedDelegationConnector;
import org.palladiosimulator.pcm.repository.Repository;
import org.palladiosimulator.pcm.repository.RepositoryComponent;
import org.palladiosimulator.pcm.repository.Role;
import org.palladiosimulator.solver.models.PCMInstance;

import ConcernModel.ElementaryConcernComponent;
import edu.kit.ipd.are.dsexplore.concern.concernweaver.WeavingInstruction;
import edu.kit.ipd.are.dsexplore.concern.concernweaver.WeavingLocation;
import edu.kit.ipd.are.dsexplore.concern.manager.ConcernRepositoryManager;
import edu.kit.ipd.are.dsexplore.concern.manager.PcmAllocationManager;
import edu.kit.ipd.are.dsexplore.concern.manager.PcmRepositoriesManager;
import edu.kit.ipd.are.dsexplore.concern.manager.PcmSystemManager;
import edu.kit.ipd.are.dsexplore.concern.manager.PcmUsageModelManager;
import edu.kit.ipd.are.dsexplore.concern.util.ConcernWeaverConstant;

public abstract class AdapterWeaving {

	protected static ConcernRepositoryManager concernRepositoryManager;
	protected static PcmAllocationManager pcmAllocationManager;
	protected static PcmRepositoriesManager pcmRepositoriesManager;
	protected static PcmSystemManager pcmSystemManager;
	protected static PcmUsageModelManager pcmUsageModelManager;

	public static void setManagersWith(PCMInstance pcmToAdapt, Repository pcmConcernRepository) {
		
		concernRepositoryManager = ConcernRepositoryManager.getBy(pcmConcernRepository);
		
		pcmAllocationManager = PcmAllocationManager.getBy(pcmToAdapt.getAllocation());
		pcmRepositoriesManager = PcmRepositoriesManager.getBy(pcmToAdapt.getRepositories());
		pcmSystemManager = PcmSystemManager.getBy(pcmToAdapt.getSystem());
		pcmUsageModelManager = PcmUsageModelManager.getBy(pcmToAdapt.getUsageModel());
		
	}
	
	public abstract void weave(WeavingInstruction weavingInstruction);
	
	protected RepositoryComponent getComponentOf(ElementaryConcernComponent ecc) {

		try {
			return concernRepositoryManager.getElementaryConcernComponentOf(ecc.getPerimeterInterface()).orElseThrow(() -> new Exception());
		} catch (Exception e) {
			
			//TODO introduce exception
			return null;
			
		}
		
	}
	
	protected String getUniqueAdapterName(WeavingInstruction weavingInstruction) {
		
		String adapterName = weavingInstruction.getTransformationStrategy().getName();
		String eccName = weavingInstruction.getECCWithConsumedFeatures().getFirst().getName();
		
		return ConcernWeaverConstant.getUnifiedNameOf(adapterName, eccName);
		
	}
	
	protected boolean isDelegationConnectorLocation(WeavingLocation weavingLocation) {
		
		return weavingLocation.getLocation() instanceof ProvidedDelegationConnector;
		
	}
	
	protected List<Role> asRoles(List<? extends Role> roles) {
		
		return roles.stream().map(each -> (Role) each).collect(Collectors.toList());
		
	}

	
}
