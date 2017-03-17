package edu.kit.ipd.are.dsexplore.concern.weavingstrategy.adapter;

import java.util.List;
import java.util.stream.Collectors;

import org.palladiosimulator.pcm.core.composition.ProvidedDelegationConnector;
import org.palladiosimulator.pcm.repository.ProvidedRole;
import org.palladiosimulator.pcm.repository.Repository;
import org.palladiosimulator.pcm.repository.RepositoryComponent;
import org.palladiosimulator.pcm.repository.Role;
import org.palladiosimulator.solver.models.PCMInstance;

import ConcernModel.ElementaryConcernComponent;
import edu.kit.ipd.are.dsexplore.concern.concernweaver.WeavingInstruction;
import edu.kit.ipd.are.dsexplore.concern.concernweaver.WeavingLocation;
import edu.kit.ipd.are.dsexplore.concern.exception.ConcernWeavingException;
import edu.kit.ipd.are.dsexplore.concern.exception.ErrorMessage;
import edu.kit.ipd.are.dsexplore.concern.handler.ECCFeatureHandler;
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
	
	public abstract void weave(WeavingInstruction weavingInstruction) throws ConcernWeavingException;
	
	protected RepositoryComponent getComponentOf(ElementaryConcernComponent ecc) throws ConcernWeavingException {

		List<ProvidedRole> providedFeatures = new ECCFeatureHandler(concernRepositoryManager).getProvidedFeaturesOf(ecc);
		return concernRepositoryManager.getElementaryConcernComponentOf(providedFeatures).orElseThrow(() -> new ConcernWeavingException(ErrorMessage.missingECC(ecc, providedFeatures)));
		
	}
	
	protected String getUniqueAdapterName(WeavingInstruction weavingInstruction) {
		
		String adapterName = weavingInstruction.getTransformationStrategy().getName();
		String eccName = weavingInstruction.getECCWithConsumedFeatures().getFirst().getName();
		
		return ConcernWeaverConstant.getUnifiedNameOf(adapterName, eccName);
		
	}
	
	protected boolean isDelegationConnectorLocation(WeavingLocation weavingLocation) {
		
		return weavingLocation.getLocation() instanceof ProvidedDelegationConnector;
		
	}
	
	protected List<Role> toRoles(List<? extends Role> roles) {
		
		return roles.stream().map(each -> (Role) each).collect(Collectors.toList());
		
	}

	
}
