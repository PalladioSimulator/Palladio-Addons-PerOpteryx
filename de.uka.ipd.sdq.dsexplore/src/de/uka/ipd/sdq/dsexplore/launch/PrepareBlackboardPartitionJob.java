package de.uka.ipd.sdq.dsexplore.launch;

import org.apache.log4j.Logger;
import org.eclipse.core.runtime.IProgressMonitor;
import de.uka.ipd.sdq.workflow.jobs.CleanupFailedException;
import de.uka.ipd.sdq.workflow.jobs.IBlackboardInteractingJob;
import de.uka.ipd.sdq.workflow.jobs.IJob;
import de.uka.ipd.sdq.workflow.jobs.JobFailedException;
import de.uka.ipd.sdq.workflow.jobs.UserCanceledException;
import de.uka.ipd.sdq.workflow.mdsd.blackboard.MDSDBlackboard;
import de.uka.ipd.sdq.workflow.mdsd.blackboard.ResourceSetPartition;

/**
 * Creates and fills the model partition.
 * 
 */
public class PrepareBlackboardPartitionJob implements IJob, IBlackboardInteractingJob<MDSDBlackboard> {
	
	private static final Logger LOGGER = Logger.getLogger(PrepareBlackboardPartitionJob.class);
    private MDSDBlackboard blackboard;
    private DSEWorkflowConfiguration configuration;
    
    public PrepareBlackboardPartitionJob(DSEWorkflowConfiguration dseConfig) {
    	this.configuration = dseConfig;
	}

    @Override
    public void execute(final IProgressMonitor monitor) throws JobFailedException, UserCanceledException {
        if (LOGGER.isDebugEnabled()) {
            LOGGER.debug("Creating Model Partition");
        }
        
        final ResourceSetPartition partition = this.configuration.preparePartition();
        this.blackboard.addPartition(LoadModelIntoBlackboardJob.MODEL_PARTITION_ID, partition);
    }

    @Override
    public String getName() {
        return "Prepare Blackboard Partitions";
    }

    @Override
    public void cleanup(final IProgressMonitor monitor) throws CleanupFailedException {
        this.blackboard.removePartition(LoadModelIntoBlackboardJob.MODEL_PARTITION_ID);
    }

    @Override
    public void setBlackboard(final MDSDBlackboard blackboard) {
        this.blackboard = blackboard;
    }

}
