package de.uka.ipd.sdq.dsexplore.analysis.simulizar;
import org.palladiosimulator.commons.eclipseutils.ExtensionHelper;
import org.palladiosimulator.simulizar.launcher.SimulizarConstants;
import org.palladiosimulator.simulizar.launcher.jobs.LoadMonitorRepositoryModelIntoBlackboardJob;
import org.palladiosimulator.simulizar.launcher.jobs.LoadServiceLevelObjectiveRepositoryIntoBlackboardJob;
import org.palladiosimulator.simulizar.launcher.jobs.LoadUEModelIntoBlackboardJob;
import org.palladiosimulator.simulizar.runconfig.SimuLizarWorkflowConfiguration;

import de.uka.ipd.sdq.workflow.extension.AbstractWorkflowExtensionConfigurationBuilder;
import de.uka.ipd.sdq.workflow.extension.AbstractWorkflowExtensionJob;
import de.uka.ipd.sdq.workflow.jobs.SequentialBlackboardInteractingJob;
import de.uka.ipd.sdq.workflow.mdsd.blackboard.MDSDBlackboard;

public class CustomLoadSimuLizarModelsIntoBlackboardJob extends SequentialBlackboardInteractingJob<MDSDBlackboard> {

	public static final String PCM_MODELS_ANALYZED_PARTITION_ID = "org.palladiosimulator.analyzed.partition";

	/**
	 * @param config
	 */
	public CustomLoadSimuLizarModelsIntoBlackboardJob(final SimuLizarWorkflowConfiguration configuration) {
		this(configuration, true);
	}

	/**
	 * @param config
	 */
	public CustomLoadSimuLizarModelsIntoBlackboardJob(final SimuLizarWorkflowConfiguration configuration, final boolean loadExtensions) {
		super(false);

		// this.addJob(new PreparePCMBlackboardPartitionJob());
		// this.addJob(new LoadPCMModelsInterpreterJob(configuration));
		this.addJob(new LoadMonitorRepositoryModelIntoBlackboardJob(configuration));
		this.addJob(new LoadServiceLevelObjectiveRepositoryIntoBlackboardJob(configuration));
		this.addJob(new LoadUEModelIntoBlackboardJob(configuration));
		if (loadExtensions) {
			this.addModelLoadExtensionJobs(configuration);
		}
	}

	private void addModelLoadExtensionJobs(final SimuLizarWorkflowConfiguration configuration) {
		final Iterable<AbstractWorkflowExtensionJob<MDSDBlackboard>> loadJobs = ExtensionHelper.getExecutableExtensions(SimulizarConstants.MODEL_LOAD_EXTENSION_POINT_ID,
				SimulizarConstants.MODEL_LOAD_EXTENSION_POINT_JOB_ATTRIBUTE, SimulizarConstants.MODEL_LOAD_EXTENSION_POINT_JOB_ATTRIBUTE);

		for (final AbstractWorkflowExtensionJob<MDSDBlackboard> loadJob : loadJobs) {
			// check if corresponding config builder is available
			// filter available extensions by name of job class
			// this can be improved
			final AbstractWorkflowExtensionConfigurationBuilder builder = ExtensionHelper.getExecutableExtension(SimulizarConstants.MODEL_LOAD_EXTENSION_POINT_ID,
					SimulizarConstants.MODEL_LOAD_EXTENSION_POINT_JOB_CONFIG_BUILDER_ATTRIBUTE, SimulizarConstants.MODEL_LOAD_EXTENSION_POINT_JOB_ATTRIBUTE, loadJob.getClass().getName());
			if (builder != null) {
				// may be null as it is an optional attribute
				loadJob.setJobConfiguration(builder.buildConfiguration(configuration.getAttributes()));
			}
			this.add(loadJob);
		}
	}

}
