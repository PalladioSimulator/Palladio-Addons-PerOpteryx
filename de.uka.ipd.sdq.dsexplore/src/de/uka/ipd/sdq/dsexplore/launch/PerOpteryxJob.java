package de.uka.ipd.sdq.dsexplore.launch;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import de.uka.ipd.sdq.workflow.jobs.CleanupFailedException;
import de.uka.ipd.sdq.workflow.jobs.ICompositeJob;
import de.uka.ipd.sdq.workflow.jobs.SequentialBlackboardInteractingJob;
import de.uka.ipd.sdq.workflow.mdsd.blackboard.MDSDBlackboard;

public class PerOpteryxJob extends
SequentialBlackboardInteractingJob<MDSDBlackboard> implements
ICompositeJob {
	
    public PerOpteryxJob(final DSEWorkflowConfiguration config, final DSELaunch launch) throws CoreException {
        super(false);

        // 1. Load Models into memory
        this.addJob(new LoadModelIntoBlackboardJob(config));

        // 2. Validate Models
        this.addJob(new ValidateModelsJob(config));

        // 3. Copy initial instance to separate blackboard partition
        this.add(new MoveInitialModelPartitionJob());

        // 4. create the partition anew but empty
        this.add(new PrepareBlackboardPartitionJob(config));

        // 5. Load the candidate models again from updated files
        //this.addJob(new LoadPCMModelsIntoBlackboardJob(candidateConfig));

        // 6. Run Optimisation on Loaded Models
        this.add(new OptimisationJob(config, launch));

    }

    @Override
    public void cleanup(final IProgressMonitor monitor) throws CleanupFailedException {
        super.cleanup(monitor);
        /*try {
			this.candidateConfig.getRawConfiguration().delete();
		} catch (CoreException e) {
			throw new RollbackFailedException("Could not delete launch configuration "+this.candidateConfig.getRawConfiguration().getName(),e);
		}*/
        monitor.worked(1);
    }


}
