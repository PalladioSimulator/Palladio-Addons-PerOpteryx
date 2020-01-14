package de.uka.ipd.sdq.dsexplore.analysis.simulizar;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.palladiosimulator.simulizar.launcher.jobs.PCMInterpreterRootCompositeJob;
import org.palladiosimulator.simulizar.runconfig.SimuLizarWorkflowConfiguration;

import de.uka.ipd.sdq.codegen.simucontroller.workflow.jobs.AbstractSimulationJob;
import de.uka.ipd.sdq.workflow.jobs.CleanupFailedException;

/**
 * Defines the job which runs SimuLizar on the current PCM Model of PerOpteryx
 *
 * @author Dominik Fuchss
 *
 */
public class SimulizarJob extends AbstractSimulationJob<SimuLizarWorkflowConfiguration> {
	/**
	 * Create the job.
	 *
	 * @param configuration
	 *            the configuration
	 * @param counter
	 *            the current count of runs (for id of temp location)
	 * @throws CoreException
	 *             throw from super class
	 */
	public SimulizarJob(final SimuLizarWorkflowConfiguration configuration, int counter) throws CoreException {
		super(SimulizarJob.updateConfig(configuration, counter), null, false);

	}

	/**
	 * Change temporary storage location.
	 *
	 * @param configuration
	 *            the configuration
	 * @param counter
	 *            the iteration
	 * @return the same configuration for chaning
	 */
	private static SimuLizarWorkflowConfiguration updateConfig(SimuLizarWorkflowConfiguration configuration, int counter) {
		configuration.setStoragePluginID(configuration.getStoragePluginID() + "_" + (counter));
		return configuration;
	}

	@Override
	protected void addSimulatorSpecificJobs(SimuLizarWorkflowConfiguration configuration) {
		this.add(new PathChangerJob(configuration));
		this.add(new PCMInterpreterRootCompositeJob(configuration));
	}

	@Override
	public void cleanup(IProgressMonitor monitor) throws CleanupFailedException {
		// Disable cleanup for issues with missing partitions..
	}
}
