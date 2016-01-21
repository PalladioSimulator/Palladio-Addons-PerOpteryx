package de.uka.ipd.sdq.dsexplore.launch;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.eclipse.core.runtime.IProgressMonitor;

import de.uka.ipd.sdq.workflow.jobs.CleanupFailedException;
import de.uka.ipd.sdq.workflow.jobs.IBlackboardInteractingJob;
import de.uka.ipd.sdq.workflow.jobs.IJob;
import de.uka.ipd.sdq.workflow.jobs.JobFailedException;
import de.uka.ipd.sdq.workflow.jobs.UserCanceledException;
import de.uka.ipd.sdq.workflow.jobs.SequentialBlackboardInteractingJob;
import de.uka.ipd.sdq.workflow.mdsd.blackboard.MDSDBlackboard;
import de.uka.ipd.sdq.workflow.mdsd.blackboard.ResourceSetPartition;

/**
 * Loads the models given in the configuration into a MDSD blackboard and store the models in a
 * temporary eclipse project. The temporary storage allows to transform and modify input models
 * without a modification of the source models and can be accessed after the analysis to check the
 * model used in the analysis.
 *
 */
public class LoadModelJob extends SequentialBlackboardInteractingJob<MDSDBlackboard> implements IJob,
IBlackboardInteractingJob<MDSDBlackboard> {

	private static final Logger LOGGER = Logger.getLogger(LoadModelJob.class);
    private MDSDBlackboard blackboard;
    private DSEWorkflowConfiguration configuration = null;
    
	public LoadModelJob(final DSEWorkflowConfiguration configuration) {
        super(false);
        this.configuration = configuration;
    }
	
    @Override
    public void setBlackboard(final MDSDBlackboard blackboard) {
        this.blackboard = blackboard;
    }

	@Override
    public void execute(final IProgressMonitor monitor) throws JobFailedException, UserCanceledException {
        final ResourceSetPartition modelPartition = this.blackboard.getPartition(LoadModelIntoBlackboardJob.MODEL_PARTITION_ID);

        // Load the model itself
        if (LOGGER.isEnabledFor(Level.INFO))
            LOGGER.info("Loading models");
        
        for (final String modelFile : this.configuration.getModelLoadFiles()) {
            modelPartition.loadModel(modelFile);
        }
        modelPartition.resolveAllProxies();
    }

    @Override
    public String getName() {
        return "Perform Model Load";
    }

    @Override
    public void cleanup(final IProgressMonitor monitor) throws CleanupFailedException {
    }
}
