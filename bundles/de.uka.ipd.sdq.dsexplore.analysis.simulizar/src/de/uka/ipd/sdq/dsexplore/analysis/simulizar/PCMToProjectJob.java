package de.uka.ipd.sdq.dsexplore.analysis.simulizar;

import org.eclipse.core.runtime.IProgressMonitor;
import org.palladiosimulator.simulizar.runconfig.SimuLizarWorkflowConfiguration;

import de.uka.ipd.sdq.workflow.jobs.CleanupFailedException;
import de.uka.ipd.sdq.workflow.jobs.IBlackboardInteractingJob;
import de.uka.ipd.sdq.workflow.jobs.IJob;
import de.uka.ipd.sdq.workflow.jobs.JobFailedException;
import de.uka.ipd.sdq.workflow.jobs.UserCanceledException;
import de.uka.ipd.sdq.workflow.mdsd.blackboard.MDSDBlackboard;

public class PCMToProjectJob implements IJob, IBlackboardInteractingJob<MDSDBlackboard> {

	private static int PROJECT_COUNTER = 1;

	private SimuLizarWorkflowConfiguration configuration;
	private MDSDBlackboard blackboard;

	private final String projectName;

	public PCMToProjectJob(SimuLizarWorkflowConfiguration configuration) {
		this.configuration = configuration;
		this.projectName = "org.palladio.temporary." + (PCMToProjectJob.PROJECT_COUNTER++);
	}

	@Override
	public void execute(IProgressMonitor monitor) throws JobFailedException, UserCanceledException {
		// Store static files.

		// Create dynamic files.

	}

	@Override
	public void setBlackboard(MDSDBlackboard blackboard) {
		this.blackboard = blackboard;
	}

	@Override
	public void cleanup(IProgressMonitor monitor) throws CleanupFailedException {
		// Cleanup temporary project, cleanup configuration
	}

	@Override
	public String getName() {
		return "PCMToProjectJob4Simulizar";
	}
}
