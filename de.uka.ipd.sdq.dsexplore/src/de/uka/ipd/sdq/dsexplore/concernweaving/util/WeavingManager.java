package de.uka.ipd.sdq.dsexplore.concernweaving.util;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.util.EcoreUtil;
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
import SolutionModel.Solution;
import de.uka.ipd.sdq.dsexplore.helper.EMFHelper;
import de.uka.ipd.sdq.dsexplore.launch.MoveInitialPCMModelPartitionJob;
import de.uka.ipd.sdq.pcm.cost.ComponentCost;
import de.uka.ipd.sdq.pcm.cost.Cost;
import de.uka.ipd.sdq.pcm.cost.CostRepository;
import de.uka.ipd.sdq.pcm.cost.costPackage;
import de.uka.ipd.sdq.workflow.mdsd.blackboard.MDSDBlackboard;
import edu.kit.ipd.are.dsexplore.concern.exception.ConcernWeavingException;
import edu.kit.ipd.are.dsexplore.concern.handler.RoleHandler;
import edu.kit.ipd.are.dsexplore.concern.handler.RoleHandlerFactory;

public class WeavingManager {

	private class PCMCostManager {
		
		private final String costModelFileName;
		private final List<Cost> cachedCosts;
		private final HashMap<String, List<ComponentCost>> concernSolutionToComponentsCostsMap;
		
		public PCMCostManager(String costModelFileName, List<Cost> cachedCosts, List<Solution> concernSolutions) {
			
			this.costModelFileName = costModelFileName;
			this.cachedCosts = new ArrayList<Cost>();
			this.concernSolutionToComponentsCostsMap = new HashMap<String, List<ComponentCost>>();
			
			initialize(concernSolutions, cachedCosts);
			
		}

		private void initialize(List<Solution> concernSolutions, List<Cost> cachedCosts) {
			
			concernSolutions.forEach(eachSolution -> this.concernSolutionToComponentsCostsMap.put(eachSolution.getRepository().getId(), 
																								  filterOnlyComponentsCostsFrom((CostRepository) eachSolution.getCostRepository())));
			
			cachedCosts.forEach(eachCost -> this.cachedCosts.add(EcoreUtil.copy(eachCost)));
			
		}
		
		private List<ComponentCost> filterOnlyComponentsCostsFrom(CostRepository costRepo) {
			
			return costRepo.getCost().stream().filter(eachCost -> eachCost instanceof ComponentCost)
											  .map(eachCost -> (ComponentCost) eachCost)
											  .collect(Collectors.toList());
			
		}
		
		public void updateCostModelBy(String id) {
			
			if (cachedCosts.isEmpty()) {
				
				return;
				
			}
			
			Optional<CostRepository> original = getCostModel();
			if (!original.isPresent()) {
				
				return;
				
			}
			
			original.get().getCost().clear();
			original.get().getCost().addAll(cachedCosts);
			original.get().getCost().addAll(concernSolutionToComponentsCostsMap.get(id));
			
			try {
				
				//EcoreUtil.resolveAll(original.get().eResource());
				original.get().eResource().save(Collections.EMPTY_MAP);
				
			} catch (IOException e) {
				
				//TODO introduce exception handling
				
			}
			
		}
		
		private Optional<CostRepository> getCostModel() { 
			
			CostRepository cr =  (CostRepository)EMFHelper.loadFromXMIFile(costModelFileName, costPackage.eINSTANCE);
			return cr == null ? Optional.empty() : Optional.of(cr);
			
		}
		
	}
	
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
	private Optional<PCMCostManager> pcmCostManager;
	
	private WeavingManager() {
		
	}
	
	public static void initialize(MDSDBlackboard blackboard, PCMResourceSetPartition unweavedPCMPartition) {

		if (instance == null) {

			instance = new WeavingManager();
		
		}
		
		instance.setPCMPartitionManager(blackboard, unweavedPCMPartition);
		instance.pcmCostManager = Optional.empty();
		
	}
	
	public static void initialize(MDSDBlackboard blackboard, 
								  PCMResourceSetPartition unweavedPCMPartition,
								  String costModelFileName,
								  List<Cost> costsToCache,
								  List<Solution> concernSolutions) {
		
		if (instance == null) {
			
			instance = new WeavingManager();
			
		}
		
		instance.setPCMPartitionManager(blackboard, unweavedPCMPartition);
		instance.setPCMCostManager(costModelFileName, costsToCache, concernSolutions);
		
	}
	
	public static Optional<WeavingManager> getInstance() {
		
		return instance == null ? Optional.empty() : Optional.of(instance);
		
	}

	private void setPCMPartitionManager(MDSDBlackboard blackboard, PCMResourceSetPartition unweavedPCMPartition) {
		
		this.pcmPartitionManager = new PCMPartitionManager(blackboard, unweavedPCMPartition);
		
	}
	
	private void setPCMCostManager(String costModelFileName, List<Cost> costsToCache, List<Solution> concernSolutions) {
		
		this.pcmCostManager = Optional.of(new PCMCostManager(costModelFileName, costsToCache, concernSolutions));
		
	}

	public PCMInstance getWeavedPCMInstanceOf(Concern concern, 
											  Repository concernSolution, 
											  HashMap<ElementaryConcernComponent, ResourceContainer> eccAllocationMap) throws ConcernWeavingException {
		
		PCMResourceSetPartition pcmPartition = this.pcmPartitionManager.getCopyOfUnweavedPCMPartition();
		PCMInstance pcm = new PCMInstance(pcmPartition);
		//TODO is there a simpler way?
		//updateProvidedFeatures(concern, concernSolution);
		new WeavingJob(concern, getConcernSolution(pcm, concernSolution.getId()), pcm, eccAllocationMap).execute();
		
		this.pcmPartitionManager.updatePCMResourcePartitionWith(pcmPartition);
		
		if (this.pcmCostManager.isPresent()) {
			
			this.pcmCostManager.get().updateCostModelBy(concernSolution.getId());
			
		}
		
		return pcm;
		
	}

//	private void updateProvidedFeatures(Concern concern, Repository concernSolution) {
//
//		concern.getComponents().forEach(ecc -> {
//			
//			ECCStructureHandler eccHandler = new ECCStructureHandler(ecc, ConcernRepositoryManager.getBy(concernSolution));
//			List<RepositoryComponent> eccInternalStructure = eccHandler.getStructureWithInECCAccordingTo(component -> Arrays.asList(component));
//			ecc.getPerimeterInterface().clear();
//			ecc.getPerimeterInterface().addAll(getProvidedFeaturesFrom(eccInternalStructure));
//			
//		});
//		
//	}

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
