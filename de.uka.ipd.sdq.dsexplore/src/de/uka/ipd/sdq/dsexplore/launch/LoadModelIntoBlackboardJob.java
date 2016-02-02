package de.uka.ipd.sdq.dsexplore.launch;

import de.uka.ipd.sdq.workflow.jobs.IBlackboardInteractingJob;
import de.uka.ipd.sdq.workflow.jobs.IJob;
import de.uka.ipd.sdq.workflow.jobs.SequentialBlackboardInteractingJob;
import de.uka.ipd.sdq.workflow.mdsd.blackboard.MDSDBlackboard;

/**
 * A job to be used in the SDQ workflow engine which loads a model instance into one or more
 * MDSDBlackboard partitions.
 * 
 * @author Ferdinand Swoboda
 */
public class LoadModelIntoBlackboardJob extends SequentialBlackboardInteractingJob<MDSDBlackboard> implements IJob,
IBlackboardInteractingJob<MDSDBlackboard> {

	/**
     * ID of the blackboard partition containing the fully loaded model instance. The blackboard
     * partition is ensured to be of type {@link ResourceSetPartition}
     */
	// FIXME this is just a workaround to avoid renaming commits to org.palladio - IMPORTANT!!
    public static final String MODEL_PARTITION_ID = "org.palladiosimulator.pcmmodels.partition"; // "dsexplore.blackboard.inputmodel.partition";
    
	/**
     * Constructor of the loader job
     * 
     * @param config
     *            A workflow configuration containing the list of URIs where to find the
     *            model files
     */
	public LoadModelIntoBlackboardJob(final DSEWorkflowConfiguration config) {
		super(false);
        this.add(new PrepareBlackboardPartitionJob(config));
        this.add(new LoadModelJob(config));
	}

}
