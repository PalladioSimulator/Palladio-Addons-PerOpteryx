package de.uka.ipd.sdq.dsexplore.launch;

import org.eclipse.core.runtime.IProgressMonitor;
import org.palladiosimulator.analyzer.workflow.core.blackboard.PCMResourceSetPartition;
import org.palladiosimulator.analyzer.workflow.jobs.LoadPCMModelsIntoBlackboardJob;

import de.uka.ipd.sdq.workflow.jobs.CleanupFailedException;
import de.uka.ipd.sdq.workflow.jobs.IBlackboardInteractingJob;
import de.uka.ipd.sdq.workflow.jobs.IJob;
import de.uka.ipd.sdq.workflow.jobs.JobFailedException;
import de.uka.ipd.sdq.workflow.jobs.UserCanceledException;
import de.uka.ipd.sdq.workflow.mdsd.blackboard.MDSDBlackboard;


public class MoveInitialPCMModelPartitionJob implements IJob, IBlackboardInteractingJob<MDSDBlackboard> {

	public static final String INITIAL_PCM_MODEL_PARTITION_ID = "initialPCModelPartitionID";
	MDSDBlackboard blackboard;
	
	public MoveInitialPCMModelPartitionJob() {
	}

	@Override
	public void execute(IProgressMonitor monitor) throws JobFailedException,
			UserCanceledException {
		
		String id = LoadPCMModelsIntoBlackboardJob.PCM_MODELS_PARTITION_ID;
		PCMResourceSetPartition partition = (PCMResourceSetPartition)this.blackboard.getPartition(id);
		this.blackboard.removePartition(id);
		this.blackboard.addPartition(MoveInitialPCMModelPartitionJob.INITIAL_PCM_MODEL_PARTITION_ID, partition);
	}

	@Override
	public String getName() {
		return this.getClass().getName();
	}

	@Override
	public void setBlackboard(MDSDBlackboard blackboard) {
		this.blackboard = blackboard;
		
	}

	@Override
	public void cleanup(IProgressMonitor arg0) throws CleanupFailedException {
		this.blackboard.removePartition(MoveInitialPCMModelPartitionJob.INITIAL_PCM_MODEL_PARTITION_ID);
	}
	
	


}
