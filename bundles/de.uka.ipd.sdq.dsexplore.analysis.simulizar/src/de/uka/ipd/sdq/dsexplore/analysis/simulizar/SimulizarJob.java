package de.uka.ipd.sdq.dsexplore.analysis.simulizar;

import org.palladiosimulator.simulizar.launcher.jobs.PCMInterpreterRootCompositeJob;
import org.palladiosimulator.simulizar.runconfig.SimuLizarWorkflowConfiguration;

import de.uka.ipd.sdq.workflow.jobs.SequentialBlackboardInteractingJob;
import de.uka.ipd.sdq.workflow.mdsd.blackboard.MDSDBlackboard;

public class SimulizarJob extends SequentialBlackboardInteractingJob<MDSDBlackboard> {

	public SimulizarJob(final SimuLizarWorkflowConfiguration configuration) {
		super(false);
		// Copies the PCM to a temporary project and modifies the configuration
		this.add(new PCMToProjectJob(configuration));
		// Evaluate
		this.add(new PCMInterpreterRootCompositeJob(configuration));
	}

}
