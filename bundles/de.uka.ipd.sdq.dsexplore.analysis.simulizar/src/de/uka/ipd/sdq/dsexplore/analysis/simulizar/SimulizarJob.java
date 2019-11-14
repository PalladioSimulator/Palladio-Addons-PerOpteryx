package de.uka.ipd.sdq.dsexplore.analysis.simulizar;

import org.palladiosimulator.analyzer.workflow.jobs.CreatePluginProjectJob;
import org.palladiosimulator.analyzer.workflow.jobs.CreateWorkingCopyOfModelsJob;
import org.palladiosimulator.simulizar.runconfig.SimuLizarWorkflowConfiguration;

import de.uka.ipd.sdq.workflow.jobs.SequentialBlackboardInteractingJob;
import de.uka.ipd.sdq.workflow.mdsd.blackboard.MDSDBlackboard;

public class SimulizarJob extends SequentialBlackboardInteractingJob<MDSDBlackboard> {

	private String folder;
	private String original;
	private static int COUNTER = 0;

	public SimulizarJob(final SimuLizarWorkflowConfiguration configuration) {
		super(false);

		this.folder = configuration.getStoragePluginID() + "_" + (++SimulizarJob.COUNTER);
		this.original = configuration.getStoragePluginID();
		configuration.setStoragePluginID(this.folder);

		this.add(new CreatePluginProjectJob(configuration));
		// Copies the PCM to a temporary project and modifies the configuration
		this.add(new CreateWorkingCopyOfModelsJob(configuration));
		// Evaluate
		this.add(new CustomPCMInterpreterRootCompositeJob(configuration));
	}
}
