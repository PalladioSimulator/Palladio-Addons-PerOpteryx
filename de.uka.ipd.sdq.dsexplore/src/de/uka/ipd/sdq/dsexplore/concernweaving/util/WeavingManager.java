package de.uka.ipd.sdq.dsexplore.concernweaving.util;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Optional;

import org.palladiosimulator.analyzer.workflow.blackboard.PCMResourceSetPartition;
import org.palladiosimulator.pcm.repository.Repository;
import org.palladiosimulator.solver.models.PCMInstance;

import ConcernModel.Concern;
import de.uka.ipd.sdq.dsexplore.launch.MoveInitialPCMModelPartitionJob;
import de.uka.ipd.sdq.pcm.designdecision.ClassChoice;
import de.uka.ipd.sdq.workflow.mdsd.blackboard.MDSDBlackboard;

public class WeavingManager {

	private class PCMPartitionManager {
		
		private final MDSDBlackboard blackboard;
		
		public PCMPartitionManager(MDSDBlackboard blackboard) {
			
			this.blackboard = blackboard;
			
		}
		
		public void replaceInitialPCMResourcePartitionWith(PCMResourceSetPartition pcmPartition) {
			
			this.blackboard.removePartition(MoveInitialPCMModelPartitionJob.INITIAL_PCM_MODEL_PARTITION_ID);
			this.blackboard.addPartition(MoveInitialPCMModelPartitionJob.INITIAL_PCM_MODEL_PARTITION_ID, pcmPartition);
			
		}
		
		public PCMResourceSetPartition getCopyOfUnweavedPCMPartition() {
			
			PCMResourceSetPartition copy = new PCMResourceSetPartition();
			for (final String modelFile : getModelFiles()) {
				copy.loadModel(modelFile);
	        }
			copy.resolveAllProxies();
			
			return copy;
			
		}

		private List<String> getModelFiles() {
			
			PCMResourceSetPartition initialPcmPartition = (PCMResourceSetPartition) this.blackboard.getPartition(MoveInitialPCMModelPartitionJob.INITIAL_PCM_MODEL_PARTITION_ID);
			return Arrays.asList(initialPcmPartition.getAllocation().eResource().getURI().toFileString(),
								 initialPcmPartition.getUsageModel().eResource().getURI().toFileString());
								
			
		}
		
	}
	
	private static WeavingManager instance = null;
	
	private PCMPartitionManager pcmPartitionManager;
	private HashMap<String, PCMResourceSetPartition> weavedPcmPartitions = new HashMap<String, PCMResourceSetPartition>(); 
	
	private WeavingManager() {
		
	}
	
	public static void initialize(MDSDBlackboard blackboard, HashMap<Concern, List<Repository>> concernToConcernSolutionsMap) {
		
		if (instance == null) {
			
			instance = new WeavingManager();
			
		}
		
		instance.setPCMPartitionManager(blackboard);
		instance.initWeavedPCMPartitions(concernToConcernSolutionsMap);
		
	}
	
	public static Optional<WeavingManager> getInstance() {
		
		return instance == null ? Optional.empty() : Optional.of(instance);
		
	}

	private void initWeavedPCMPartitions(HashMap<Concern, List<Repository>> concernToConcernSolutionsMap) {
		
		concernToConcernSolutionsMap.forEach((concern, concernSolutions) -> weaveAll(concern, concernSolutions));
		
	}
	
	private void setPCMPartitionManager(MDSDBlackboard blackboard) {
		
		this.pcmPartitionManager = new PCMPartitionManager(blackboard);
		
	}

	private void weaveAll(Concern concern, List<Repository> concernSolutions) {
		
		concernSolutions.forEach(concernSolution -> addWeavedPartition(concernSolution.getId(), getWeavedPCMPartition(concern, concernSolution)));
		
	}

	private PCMResourceSetPartition getWeavedPCMPartition(Concern concern, Repository concernSolution) {
		
		PCMResourceSetPartition pcmPartition = this.pcmPartitionManager.getCopyOfUnweavedPCMPartition();
		new WeavingJob(concern, concernSolution, new PCMInstance(pcmPartition)).execute();
		
		return pcmPartition;
		
	}

	public PCMInstance getWeavedPCMInstanceBy(ClassChoice choice) {
	
		String concernSolutionId = getConcernSolutionIdFrom(choice);
		PCMResourceSetPartition pcmPartition = this.weavedPcmPartitions.get(concernSolutionId);
		
		this.pcmPartitionManager.replaceInitialPCMResourcePartitionWith(pcmPartition);
		
		return new PCMInstance(pcmPartition);
		
	}

	private String getConcernSolutionIdFrom(ClassChoice choice) {
		
		return ((Repository) choice.getChosenValue()).getId();
		
	}
	
	private void addWeavedPartition(String id, PCMResourceSetPartition weavedPartition) {
		
		this.weavedPcmPartitions.put(id, weavedPartition);
		
	}
	
}
