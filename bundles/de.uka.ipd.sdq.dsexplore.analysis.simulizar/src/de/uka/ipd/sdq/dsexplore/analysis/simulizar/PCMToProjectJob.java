package de.uka.ipd.sdq.dsexplore.analysis.simulizar;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.palladiosimulator.analyzer.workflow.blackboard.PCMResourceSetPartition;
import org.palladiosimulator.analyzer.workflow.configurations.AbstractPCMWorkflowRunConfiguration;
import org.palladiosimulator.analyzer.workflow.jobs.CreatePluginProjectJob;
import org.palladiosimulator.analyzer.workflow.jobs.LoadPCMModelsIntoBlackboardJob;

import de.uka.ipd.sdq.workflow.jobs.CleanupFailedException;
import de.uka.ipd.sdq.workflow.jobs.IBlackboardInteractingJob;
import de.uka.ipd.sdq.workflow.jobs.IJob;
import de.uka.ipd.sdq.workflow.jobs.JobFailedException;
import de.uka.ipd.sdq.workflow.jobs.UserCanceledException;
import de.uka.ipd.sdq.workflow.mdsd.blackboard.MDSDBlackboard;

/**
 * Job to create a working copy of the models to simulate. This ensures that any
 * downstream job changing the models does not modify the original models.
 *
 * Prerequisite of this job: This job copies the models to the configured
 * project created in the workflow. It has to exist to be able to store the
 * model copy into it.
 *
 * The job currently only creates a working copy of the partition containing the
 * pcm models: {@link LoadPCMModelsIntoBlackboardJob}.PCM_MODELS_PARTITION_ID
 *
 * @author Benjamin Klatt, Sebastian Krach
 *
 */
public class PCMToProjectJob implements IJob, IBlackboardInteractingJob<MDSDBlackboard> {

	private static final String MODEL_FOLDER = "model";

	/** The LOGGER for this class */
	private static final Logger LOGGER = Logger.getLogger(PCMToProjectJob.class);

	/** The blackboard to interact with */
	private MDSDBlackboard blackboard = null;

	/** The work flow configuration to get the required information from */
	private final AbstractPCMWorkflowRunConfiguration configuration;

	/**
	 * Constructor requiring the necessary configuration object.
	 *
	 * @param configuration
	 *            The configuration for this job.
	 */
	public PCMToProjectJob(final AbstractPCMWorkflowRunConfiguration configuration) {
		this.configuration = configuration;
	}

	/**
	 * Execute this job and create the model copy.
	 */
	@Override
	public void execute(final IProgressMonitor monitor) throws JobFailedException, UserCanceledException {

		final IFolder modelFolder = this.getOrCreateModelFolder();

		final URI modelFolderURI = URI.createFileURI(modelFolder.getLocation().toOSString());

		// access the resources
		final PCMResourceSetPartition partition = (PCMResourceSetPartition) this.blackboard.getPartition(LoadPCMModelsIntoBlackboardJob.PCM_MODELS_PARTITION_ID);
		final ResourceSet resourceSet = partition.getResourceSet();

		final PCMResourceSetPartition workingCopyPartition = new PCMResourceSetPartition();

		// Cannot do a deep copy within iterating the resource set, because if
		// proxies are resolved, new resources are created within the resource
		// set and a ConcurrentModificationException will be raised (happened
		// for Peropteryx when having the ConnectorConfig.featureconfig in the
		// ResourceSet, which causes the FeatureConfig to be copied, which has a
		// FeatureDiagram as "annotatedElement" which needs to be resolved.
		// Resolving the FeatureDiagramImpl proxy lead to modification of the
		// ResourceSet).
		// Thus, create new ArrayList to iterate.
		// TODO test whether the resource of resolved proxy is copied as
		// expected.

		// TODO check whether latest change conflicts with the deep copy issue
		// from above (Sebastian Krach)
		// should not be the case since there is no deep copy anymore

		final List<Resource> resourceListToIterate = new ArrayList<>();
		resourceListToIterate.addAll(resourceSet.getResources());

		final List<String> originalModelPaths = new ArrayList<>();

		for (final Resource resource : resourceListToIterate) {
			if (resource.getURI().scheme().equals("pathmap")) {
				// If its a pathmap resource we do not need to change its path
				workingCopyPartition.setContents(resource.getURI(), resource.getContents());
			} else {
				// Otherwise redirect path to generated simulation plugin
				final URI originalURI = resource.getURI();

				final URI newURI = PCMToProjectJob.concatenateURIs(modelFolderURI, originalURI);

				// Add base Plug-in ID and model paths to the configuration
				if (this.configuration.getBaseProjectID() == null) {
					final String[] splitString = originalURI.toString().split("/");
					this.configuration.setBaseProjectID(splitString[2]);
				}

				if (originalURI.toString() != null) {
					originalModelPaths.add(originalURI.toString());
				}

				workingCopyPartition.setContents(newURI, resource.getContents());
			}
		}

		try {
			workingCopyPartition.storeAllResources();
		} catch (final IOException e) {
			if (PCMToProjectJob.LOGGER.isEnabledFor(Level.ERROR)) {
				PCMToProjectJob.LOGGER.error("Unable to serialize the working copy of the pcm models.", e);
			}
		}

		// Remove the partition which references the models in the original
		// project
		this.blackboard.removePartition(LoadPCMModelsIntoBlackboardJob.PCM_MODELS_PARTITION_ID);

		// and replace it with the new working copy, so that further
		// modifications of the
		// model do not change the original model files.
		this.blackboard.addPartition(LoadPCMModelsIntoBlackboardJob.PCM_MODELS_PARTITION_ID, workingCopyPartition);

		this.configuration.setModelPaths(originalModelPaths);
	}

	public static URI concatenateURIs(final URI modelFolderURI, final URI uri) {
		// Use all segments of URI as model files may reside in
		// different folders or projects and may have the same file
		// name, e.g. a myproject/default.system referencing a
		// myproject/default.repository and a
		// anotherproject/default.repository.
		final String[] segments = uri.segments();
		final String schemeSegment = uri.scheme();

		final URI newURI = modelFolderURI.appendSegment(schemeSegment).appendSegments(segments);
		return newURI;
	}

	private IFolder getOrCreateModelFolder() throws JobFailedException {
		assert (this.configuration != null);
		final IProject project = CreatePluginProjectJob.getProject(this.configuration.getStoragePluginID());
		assert (project != null);

		return CreatePluginProjectJob.getOrCreateFolder(project, PCMToProjectJob.MODEL_FOLDER);
	}

	@Override
	public String getName() {
		return "Create working copy of models";
	}

	@Override
	public void cleanup(final IProgressMonitor monitor) throws CleanupFailedException {
		// nothing to clean up
	}

	@Override
	public void setBlackboard(final MDSDBlackboard blackboard) {
		this.blackboard = blackboard;
	}

}