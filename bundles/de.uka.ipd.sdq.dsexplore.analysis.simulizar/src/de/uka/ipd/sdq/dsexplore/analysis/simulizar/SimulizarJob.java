package de.uka.ipd.sdq.dsexplore.analysis.simulizar;

import org.eclipse.core.runtime.CoreException;
import org.palladiosimulator.simulizar.launcher.jobs.PCMInterpreterRootCompositeJob;
import org.palladiosimulator.simulizar.runconfig.SimuLizarWorkflowConfiguration;

import de.uka.ipd.sdq.codegen.simucontroller.workflow.jobs.AbstractSimulationJob;

public class SimulizarJob extends AbstractSimulationJob<SimuLizarWorkflowConfiguration> {

	public SimulizarJob(final SimuLizarWorkflowConfiguration configuration, int counter) throws CoreException {
		super(SimulizarJob.updateConfig(configuration, counter), null, false);

	}

	private static SimuLizarWorkflowConfiguration updateConfig(SimuLizarWorkflowConfiguration configuration, int counter) {
		configuration.setStoragePluginID(configuration.getStoragePluginID() + "_" + (counter));
		return configuration;
	}

	@Override
	protected void addSimulatorSpecificJobs(SimuLizarWorkflowConfiguration configuration) {
		this.add(new PathChangerJob(configuration));
		this.add(new PCMInterpreterRootCompositeJob(configuration));
	}
}
