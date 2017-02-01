package de.uka.ipd.sdq.dsexplore.concernweaving.util;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.util.EcoreUtil.Copier;
import org.palladiosimulator.analyzer.workflow.blackboard.PCMResourceSetPartition;
import org.palladiosimulator.pcm.repository.ProvidedRole;
import org.palladiosimulator.pcm.repository.Repository;
import org.palladiosimulator.pcm.repository.RepositoryComponent;
import org.palladiosimulator.pcm.repository.Role;
import org.palladiosimulator.pcm.resourceenvironment.ResourceContainer;
import org.palladiosimulator.solver.models.PCMInstance;

import ConcernModel.Concern;
import ConcernModel.ElementaryConcernComponent;
import de.uka.ipd.sdq.dsexplore.launch.MoveInitialPCMModelPartitionJob;
import de.uka.ipd.sdq.workflow.mdsd.blackboard.MDSDBlackboard;
import edu.kit.ipd.are.dsexplore.concern.handler.ECCStructureHandler;
import edu.kit.ipd.are.dsexplore.concern.handler.RoleHandler;
import edu.kit.ipd.are.dsexplore.concern.handler.RoleHandlerFactory;
import edu.kit.ipd.are.dsexplore.concern.manager.ConcernRepositoryManager;

public class WeavingManager {

	private class PCMPartitionManager {
		
		private final MDSDBlackboard blackboard;
		private final PCMResourceSetPartition unweavedPCMPartition; 
		
		public PCMPartitionManager(MDSDBlackboard blackboard, PCMResourceSetPartition unweavedPCMPartition) {
			
			this.blackboard = blackboard;
			this.unweavedPCMPartition = unweavedPCMPartition;
			
		}
		
		public void updatePCMResourcePartitionWith(PCMResourceSetPartition pcmPartition) {
			
			this.blackboard.addPartition(MoveInitialPCMModelPartitionJob.INITIAL_PCM_MODEL_PARTITION_ID, pcmPartition);
			
		}
		
		//Copied from LoadPCMModelsJob & PreparePCMBlackboardPartitionJob
		public PCMResourceSetPartition getCopyOfUnweavedPCMPartition() {
			
			PCMResourceSetPartition copy = new PCMResourceSetPartition();
			ResourceSet copyResourceSet = copy.getResourceSet();
			
			List<Resource> resourceList = this.unweavedPCMPartition.getResourceSet().getResources();
			
			Copier copier = new Copier();
			for (Resource resource : resourceList) {
				if (resource.getURI().toString().contains("pathmap")){
					
					copy.loadModel(resource.getURI());
					
				} else {
					
					Collection<EObject> copiedContent = copier.copyAll(resource.getContents());
					Resource newResource = copyResourceSet.createResource(URI.createURI(resource.getURI().toString()));
					newResource.getContents().addAll(copiedContent);
					
				}
			}
		    copier.copyReferences();
		    
		    return copy;
			
		}
		
	}
	
	private static WeavingManager instance = null;
	
	private PCMPartitionManager pcmPartitionManager;
	
	private WeavingManager() {
		
	}
	
	public static void initialize(MDSDBlackboard blackboard, PCMResourceSetPartition unweavedPCMPartition) {
		
		if (instance == null) {
			
			instance = new WeavingManager();
			
		}
		
		instance.setPCMPartitionManager(blackboard, unweavedPCMPartition);
		
	}
	
	public static Optional<WeavingManager> getInstance() {
		
		return instance == null ? Optional.empty() : Optional.of(instance);
		
	}

	private void setPCMPartitionManager(MDSDBlackboard blackboard, PCMResourceSetPartition unweavedPCMPartition) {
		
		this.pcmPartitionManager = new PCMPartitionManager(blackboard, unweavedPCMPartition);
		
	}

	public PCMInstance getWeavedPCMInstanceOf(Concern concern, 
											  Repository concernSolution, 
											  HashMap<ElementaryConcernComponent, ResourceContainer> eccAllocationMap) {
		
		PCMResourceSetPartition pcmPartition = this.pcmPartitionManager.getCopyOfUnweavedPCMPartition();
		PCMInstance pcm = new PCMInstance(pcmPartition);
		//TODO is there a simpler way?
		updateProvidedFeatures(concern, concernSolution);
		new WeavingJob(concern, getConcernSolution(pcm, concernSolution.getId()), pcm, eccAllocationMap).execute();
		
		this.pcmPartitionManager.updatePCMResourcePartitionWith(pcmPartition);
		
		return pcm;
		
	}

	private void updateProvidedFeatures(Concern concern, Repository concernSolution) {

		concern.getComponents().forEach(ecc -> {
			
			ECCStructureHandler eccHandler = new ECCStructureHandler(ecc, ConcernRepositoryManager.getBy(concernSolution));
			List<RepositoryComponent> eccInternalStructure = eccHandler.getStructureWithInECCAccordingTo(component -> Arrays.asList(component));
			ecc.getPerimeterInterface().clear();
			ecc.getPerimeterInterface().addAll(getProvidedFeaturesFrom(eccInternalStructure));
			
		});
		
	}

	private List<ProvidedRole> getProvidedFeaturesFrom(List<RepositoryComponent> eccInternalStructure) {
		
		return eccInternalStructure.stream().flatMap(eachComponent -> eachComponent.getProvidedRoles_InterfaceProvidingEntity().stream())
											.filter(eachProvidedRole -> isNotRequiredByAnyOf(eccInternalStructure, eachProvidedRole))
											.collect(Collectors.toList());
		
	}

	private boolean isNotRequiredByAnyOf(List<RepositoryComponent> eccInternalStructure, ProvidedRole providedRole) {
		
		RoleHandler roleHandler = RoleHandlerFactory.getBy(providedRole, null);
		return !roleHandler.getOpponentOf(providedRole, getAllRequiredRolesFrom(eccInternalStructure)).isPresent();
		
	}

	private List<? extends Role> getAllRequiredRolesFrom(List<RepositoryComponent> eccInternalStructure) {
		
		return eccInternalStructure.stream().flatMap(eachComp -> eachComp.getRequiredRoles_InterfaceRequiringEntity().stream())
											.collect(Collectors.toList());
		
	}

	private Repository getConcernSolution(PCMInstance pcm, String concernSolutionId) {
		
		return pcm.getRepositories().stream().filter(eachRepo -> eachRepo.getId().equals(concernSolutionId))
											 .findFirst().get();
		
	}
	
}
