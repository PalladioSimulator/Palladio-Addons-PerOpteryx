package de.uka.ipd.sdq.dsexplore.analysis.simulizar;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.runtime.IProgressMonitor;
import org.palladiosimulator.simulizar.core.runconfig.SimuLizarWorkflowConfiguration;

import de.uka.ipd.sdq.workflow.jobs.CleanupFailedException;
import de.uka.ipd.sdq.workflow.jobs.IJob;
import de.uka.ipd.sdq.workflow.jobs.JobFailedException;
import de.uka.ipd.sdq.workflow.jobs.UserCanceledException;

/**
 * This job modifies the paths to PCM Models in the
 * {@link SimuLizarWorkflowConfiguration} to the temporary model created by
 * PerOpteryx and stored by {@link SimulizarJob}.
 *
 * @author Dominik Fuchss
 *
 */
public class PathChangerJob implements IJob {

	private final SimuLizarWorkflowConfiguration configuration;
	private String basePath;

	/**
	 * Create the job
	 *
	 * @param configuration
	 *            the configuration to be changed by
	 *            {@link SimuLizarWorkflowConfiguration#getStoragePluginID()}
	 */
	public PathChangerJob(SimuLizarWorkflowConfiguration configuration) {
		this.configuration = configuration;
	}

	@Override
	public void execute(IProgressMonitor monitor) throws JobFailedException, UserCanceledException {
		this.basePath = "platform:/resource/" + this.configuration.getStoragePluginID() + "/model/platform/resource/" + this.configuration.getBaseProjectID();

		this.setAllocationFiles();
		this.setUsageFile();
		this.setModelPaths();
	}

	private void setAllocationFiles() {
		this.configuration.setAllocationFiles(this.changePaths(this.configuration.getAllocationFiles()));
	}

	private void setUsageFile() {
		this.configuration.setUsageModelFile(this.changePath(this.configuration.getUsageModelFile()));
	}

	private void setModelPaths() {
		this.configuration.setModelPaths(this.changePaths(this.configuration.getModelPaths()));
	}

	private List<String> changePaths(List<String> models) {
		List<String> result = new ArrayList<>();
		for (String model : models) {
			result.add(this.changePath(model));
		}
		return result;

	}

	/**
	 * Change a path to the new model path.
	 *
	 * @param model
	 *            the path to the model
	 * @return the new path
	 */
	private String changePath(String model) {
		if (model.startsWith("pathmap") || model.contains("cand.")) {
			return model;
		}

		String file = model.split(this.configuration.getBaseProjectID())[1];
		String newFileName = this.newFileName(file);
		return this.basePath + newFileName;
	}

	private String fileWithoutExtension(String file) {
		return file.substring(0, file.lastIndexOf('.'));
	}

	private String newFileName(String file) {
		String ending = file.substring(file.lastIndexOf('.'));

		if (file.endsWith(ending + "cand" + ending)) {
			return file;
		}

		return this.fileWithoutExtension(file) + ending + "cand" + ending;

	}

	@Override
	public void cleanup(IProgressMonitor monitor) throws CleanupFailedException {
		// Do nothing for now ..
	}

	@Override
	public String getName() {
		return "PathChanger";
	}

}
