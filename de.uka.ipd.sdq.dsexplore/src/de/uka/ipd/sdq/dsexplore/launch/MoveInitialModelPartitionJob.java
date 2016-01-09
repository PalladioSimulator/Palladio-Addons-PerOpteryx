package de.uka.ipd.sdq.dsexplore.launch;

import org.eclipse.core.runtime.IProgressMonitor;

import de.uka.ipd.sdq.workflow.jobs.CleanupFailedException;
import de.uka.ipd.sdq.workflow.jobs.IBlackboardInteractingJob;
import de.uka.ipd.sdq.workflow.jobs.IJob;
import de.uka.ipd.sdq.workflow.jobs.JobFailedException;
import de.uka.ipd.sdq.workflow.jobs.UserCanceledException;
import de.uka.ipd.sdq.workflow.mdsd.blackboard.MDSDBlackboard;
import de.uka.ipd.sdq.workflow.mdsd.blackboard.ResourceSetPartition;


public class MoveInitialModelPartitionJob implements IJob, IBlackboardInteractingJob<MDSDBlackboard> {

	public static final String INITIAL_PCM_MODEL_PARTITION_ID = "initialPCModelPartitionID";
	MDSDBlackboard blackboard;
	
	public MoveInitialModelPartitionJob() {
	}

	@Override
	public void execute(IProgressMonitor monitor) throws JobFailedException,
			UserCanceledException {
		
		String id = LoadModelIntoBlackboardJob.MODEL_PARTITION_ID;
		ResourceSetPartition partition = this.blackboard.getPartition(id);
		this.blackboard.removePartition(id);
		this.blackboard.addPartition(MoveInitialModelPartitionJob.INITIAL_PCM_MODEL_PARTITION_ID, partition);
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
		this.blackboard.removePartition(MoveInitialModelPartitionJob.INITIAL_PCM_MODEL_PARTITION_ID);
	}
}
