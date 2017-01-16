package de.uka.ipd.sdq.dsexplore.concernweaving.util;

import java.util.HashMap;
import java.util.List;
import java.util.Optional;

import org.palladiosimulator.analyzer.workflow.blackboard.PCMResourceSetPartition;
import org.palladiosimulator.analyzer.workflow.configurations.AbstractPCMWorkflowRunConfiguration;
import org.palladiosimulator.analyzer.workflow.jobs.PreparePCMBlackboardPartitionJob;
import org.palladiosimulator.pcm.repository.Repository;
import org.palladiosimulator.solver.models.PCMInstance;

import ConcernModel.Concern;
import de.uka.ipd.sdq.dsexplore.launch.DSEWorkflowConfiguration;
import de.uka.ipd.sdq.dsexplore.launch.MoveInitialPCMModelPartitionJob;
import de.uka.ipd.sdq.workflow.mdsd.blackboard.MDSDBlackboard;

public class WeavingManager {

	private class PCMPartitionManager {
		
		private final MDSDBlackboard blackboard;
		private final DSEWorkflowConfiguration dseConfig; 
		
		public PCMPartitionManager(MDSDBlackboard blackboard, DSEWorkflowConfiguration dseConfig) {
			
			this.blackboard = blackboard;
			this.dseConfig = dseConfig;
			
		}
		
		public void replaceInitialPCMResourcePartitionWith(PCMResourceSetPartition pcmPartition) {
			
			this.blackboard.removePartition(MoveInitialPCMModelPartitionJob.INITIAL_PCM_MODEL_PARTITION_ID);
			this.blackboard.addPartition(MoveInitialPCMModelPartitionJob.INITIAL_PCM_MODEL_PARTITION_ID, pcmPartition);
			
		}
		
		//Copied from LoadPCMModelsJob & PreparePCMBlackboardPartitionJob
		public PCMResourceSetPartition getCopyOfUnweavedPCMPartition() {
			
			PCMResourceSetPartition copy = new PCMResourceSetPartition();
			
			copy.initialiseResourceSetEPackages(AbstractPCMWorkflowRunConfiguration.PCM_EPACKAGES);

			copy.loadModel(PreparePCMBlackboardPartitionJob.PCM_PALLADIO_PRIMITIVE_TYPE_REPOSITORY_URI);
			copy.loadModel(PreparePCMBlackboardPartitionJob.PCM_PALLADIO_RESOURCE_TYPE_URI);
			for (final String modelFile : this.dseConfig.getPCMModelFiles()) {
				copy.loadModel(modelFile);
	        }
			copy.loadModel(this.dseConfig.getRMIMiddlewareFile());
			copy.loadModel(this.dseConfig.getEventMiddlewareFile());
			copy.resolveAllProxies();
			
			return copy;
			
		}
		
	}
	
	private static WeavingManager instance = null;
	
	private PCMPartitionManager pcmPartitionManager;
	private HashMap<String, PCMResourceSetPartition> weavedPcmPartitions = new HashMap<String, PCMResourceSetPartition>(); 
	
	private WeavingManager() {
		
	}
	
	public static void initialize(MDSDBlackboard blackboard, DSEWorkflowConfiguration dseConfig, HashMap<Concern, List<Repository>> concernToConcernSolutionsMap) {
		
		if (instance == null) {
			
			instance = new WeavingManager();
			
		}
		
		instance.setPCMPartitionManager(blackboard, dseConfig);
		instance.initWeavedPCMPartitions(concernToConcernSolutionsMap);
		
	}
	
	public static Optional<WeavingManager> getInstance() {
		
		return instance == null ? Optional.empty() : Optional.of(instance);
		
	}

	private void setPCMPartitionManager(MDSDBlackboard blackboard, DSEWorkflowConfiguration dseConfig) {
		
		this.pcmPartitionManager = new PCMPartitionManager(blackboard, dseConfig);
		
	}
	
	private void initWeavedPCMPartitions(HashMap<Concern, List<Repository>> concernToConcernSolutionsMap) {
		
		concernToConcernSolutionsMap.forEach((concern, concernSolutions) -> weaveAll(concern, concernSolutions));
		
	}

	private void weaveAll(Concern concern, List<Repository> concernSolutions) {
		
		concernSolutions.forEach(concernSolution -> addWeavedPartition(concernSolution.getId(), getWeavedPCMPartition(concern, concernSolution)));
		
	}

	private PCMResourceSetPartition getWeavedPCMPartition(Concern concern, Repository concernSolution) {
		
		PCMResourceSetPartition pcmPartition = this.pcmPartitionManager.getCopyOfUnweavedPCMPartition();
		PCMInstance pcm = new PCMInstance(pcmPartition);
		new WeavingJob(concern, getConcernSolution(pcm, concernSolution.getId()), pcm).execute();
		
		return pcmPartition;
		
	}

	private Repository getConcernSolution(PCMInstance pcm, String concernSolutionId) {
		
		return pcm.getRepositories().stream().filter(eachRepo -> eachRepo.getId().equals(concernSolutionId))
											 .findFirst().get();
		
	}

	public PCMInstance getWeavedPCMInstanceBy(Repository concernSolution) {
	
		PCMResourceSetPartition pcmPartition = this.weavedPcmPartitions.get(concernSolution.getId());
		this.pcmPartitionManager.replaceInitialPCMResourcePartitionWith(pcmPartition);
		
		return new PCMInstance(pcmPartition);
		
	}
	
	private void addWeavedPartition(String id, PCMResourceSetPartition weavedPartition) {
		
		this.weavedPcmPartitions.put(id, weavedPartition);
		
	}
	
}
