package de.uka.ipd.sdq.pcmsupport;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EcorePackage;
import org.palladiosimulator.analyzer.completions.CompletionsPackage;
import org.palladiosimulator.analyzer.workflow.ConstantsContainer;
import org.palladiosimulator.analyzer.workflow.blackboard.PCMResourceSetPartition;
import org.palladiosimulator.analyzer.workflow.jobs.IIssueReceiver;
import org.palladiosimulator.analyzer.workflow.runconfig.AccuracyInfluenceAnalysisState;
import org.palladiosimulator.pcm.PcmPackage;
import org.palladiosimulator.pcm.allocation.AllocationPackage;
import org.palladiosimulator.pcm.core.CorePackage;
import org.palladiosimulator.pcm.parameter.ParameterPackage;
import org.palladiosimulator.pcm.qosannotations.qos_reliability.QosReliabilityPackage;
import org.palladiosimulator.pcm.reliability.ReliabilityPackage;
import org.palladiosimulator.pcm.repository.RepositoryPackage;
import org.palladiosimulator.pcm.resourceenvironment.ResourceenvironmentPackage;
import org.palladiosimulator.pcm.resourcetype.ResourcetypePackage;
import org.palladiosimulator.pcm.seff.SeffPackage;
import org.palladiosimulator.pcm.seff.seff_reliability.SeffReliabilityPackage;
import org.palladiosimulator.pcm.system.SystemPackage;
import org.palladiosimulator.pcm.usagemodel.UsagemodelPackage;

import de.uka.ipd.sdq.dsexplore.launch.DSEWorkflowConfiguration;
import de.uka.ipd.sdq.identifier.IdentifierPackage;
import de.uka.ipd.sdq.probfunction.ProbfunctionPackage;
import de.uka.ipd.sdq.stoex.StoexPackage;
import de.uka.ipd.sdq.units.UnitsPackage;
import de.uka.ipd.sdq.workflow.configuration.InvalidWorkflowJobConfigurationException;
import de.uka.ipd.sdq.workflow.mdsd.blackboard.ResourceSetPartition;
import genericdesigndecision.universalDoF.Metamodel;

/**
 * Base class of workflow configuration objects where the workflow has to deal with a PCM model
 * instance. This configuration class holds the locations of the PCM model parts, and (for
 * convenience) a list of EPackages needed to read the files.
 *
 * @author Steffen Becker
 */
public class PCMWorkflowConfiguration extends DSEWorkflowConfiguration {

	public static final URI PCM_PALLADIO_RESOURCE_TYPE_URI = URI
            .createURI("pathmap://PCM_MODELS/Palladio.resourcetype");
    public static final URI PCM_PALLADIO_PRIMITIVE_TYPE_REPOSITORY_URI = URI
            .createURI("pathmap://PCM_MODELS/PrimitiveTypes.repository");
    
 // taken from ValidatePCMModelsJob
    private static final String PCM_CHECK_FILENAME = "pcm";
    
	/** Logger for this class. */
    private static final Logger LOGGER = Logger.getLogger(PCMWorkflowConfiguration.class);

    protected String rmiMiddlewareFile;
    protected String eventMiddlewareFile;
    protected List<String> allocationFiles;
    protected String usageModelFile;

    /**
     * information to the original models the generated project was built on. Currently only needed
     * when running the simulation again without regeneration of the project
     */
    private String baseProjectID = null;

    /**
     * Contains the paths to every model that is not recognized by the configuration yet such as
     * System
     */
    private List<String> modelPaths = null;
    
    /**
     * Contains the path for the generated plug-in. This is equal to the
     * temporaryDataLocation when using the Rerun Simulator but due to the code of the 
     * SimuBench and the Rerun Simulation both attributes are needed
     */
    private String generatedProjectPath = null;

    /** Storage for temporary models and code. */
    protected String temporaryDataLocation;
    /** State if temporary data (models and/or code) should be deleted after the analysis. */
    protected boolean deleteTemporaryDataAfterAnalysis;

    /** Activation state of the accuracy influence analysis. */
    protected boolean accuracyInfluenceAnalysisEnabled;
    /** Path to the file containing the accuracy information model. */
    protected String accuracyInformationModelFile;
    /** State of the current accuracy influence analysis. */
    protected AccuracyInfluenceAnalysisState accuracyInfluenceAnalysisState;
    /** Job receiving the issues occurred during accuracy influence analysis. */
    protected IIssueReceiver accuracyInfluenceIssueReceivingJob;

    protected boolean overwriteWithoutAsking = false;
    
    public PCMWorkflowConfiguration() {
    	this.metamodel = Metamodel.PCM;
    	this.setEpackages(new EPackage[] {
                // Packages needed by QVT Transformations {{
                EcorePackage.eINSTANCE,
                IdentifierPackage.eINSTANCE,
                UnitsPackage.eINSTANCE,
                ProbfunctionPackage.eINSTANCE,
                PcmPackage.eINSTANCE,
                // }}
                SeffPackage.eINSTANCE, RepositoryPackage.eINSTANCE, ParameterPackage.eINSTANCE,
                UsagemodelPackage.eINSTANCE, SystemPackage.eINSTANCE, ResourcetypePackage.eINSTANCE,
                ResourceenvironmentPackage.eINSTANCE, AllocationPackage.eINSTANCE, StoexPackage.eINSTANCE,
                CorePackage.eINSTANCE, CompletionsPackage.eINSTANCE, ReliabilityPackage.eINSTANCE,
                QosReliabilityPackage.eINSTANCE, SeffReliabilityPackage.eINSTANCE });
    }
    
    @Override
    public ResourceSetPartition preparePartition() {
		PCMResourceSetPartition pcmPartition = new PCMResourceSetPartition();
		
		if (LOGGER.isDebugEnabled()) {
            LOGGER.debug("Initializing EPackages");
        }
		
		pcmPartition.initialiseResourceSetEPackages(this.getEpackages());
		pcmPartition.loadModel(PCMWorkflowConfiguration.PCM_PALLADIO_PRIMITIVE_TYPE_REPOSITORY_URI);
        pcmPartition.loadModel(PCMWorkflowConfiguration.PCM_PALLADIO_RESOURCE_TYPE_URI);
        return pcmPartition;
	}

	@Override
	public List<String> getModelLoadFiles() {
		ArrayList<String> files = new ArrayList<String>();
		files.addAll(this.getPCMModelFiles());
		files.add(this.getRMIMiddlewareFile());
		files.add(this.getEventMiddlewareFile());
		return files;
	}

	/**
     * @return Returns the receiving job for accuracy influence analysis issues
     */
    public IIssueReceiver getAccuracyInfluenceIssueReceivingJob() {
        return accuracyInfluenceIssueReceivingJob;
    }

    /**
     * @param accuracyInfluenceIssueReceivingJob
     *            Sets the receiving job for accuracy influence analysis issues.
     */
    public void setAccuracyInfluenceIssueReceivingJob(IIssueReceiver accuracyInfluenceIssueReceivingJob) {
        this.accuracyInfluenceIssueReceivingJob = accuracyInfluenceIssueReceivingJob;
    }

    /**
     * @return Returns the current accuracy influence analysis state.
     */
    public AccuracyInfluenceAnalysisState getAccuracyInfluenceAnalysisState() {
        return accuracyInfluenceAnalysisState;
    }

    /**
     * Sets the accuracy influence analysis state.
     * 
     * @param accuracyInfluenceAnalysisState
     *            The new state.
     */
    public void setAccuracyInfluenceAnalysisState(AccuracyInfluenceAnalysisState accuracyInfluenceAnalysisState) {
        this.accuracyInfluenceAnalysisState = accuracyInfluenceAnalysisState;
    }

    /**
     * @return if deletion of temporary data after analysis is enabled.
     */
    public boolean isDeleteTemporaryDataAfterAnalysis() {
        return deleteTemporaryDataAfterAnalysis;
    }

    /**
     * Sets the activation state for the deletion of temporary data after an analysis.
     * 
     * @param deleteTemporaryDataAfterAnalysis
     */
    public void setDeleteTemporaryDataAfterAnalysis(boolean deleteTemporaryDataAfterAnalysis) {
        checkFixed();
        this.deleteTemporaryDataAfterAnalysis = deleteTemporaryDataAfterAnalysis;
    }

    /**
     * @return Returns the activation state of the accuracy influence analysis.
     */
    public boolean isAccuracyInfluenceAnalysisEnabled() {
        return accuracyInfluenceAnalysisEnabled;
    }

    /**
     * Set the activation state of the accuracy influence analysis.
     * 
     * @param enabled
     *            Activation state.
     */
    public void setAccuracyInfluenceAnalysisEnabled(boolean enabled) {
        checkFixed();
        this.accuracyInfluenceAnalysisEnabled = enabled;
    }

    /**
     * @return Returns the string representation of the path to the file containing the accuracy
     *         information model.
     */
    public String getAccuracyInformationModelFile() {
        return accuracyInformationModelFile;
    }

    /**
     * Set the path to the file containing the accuracy information model.
     * 
     * @param accuracyInformationModelFile
     */
    public void setAccuracyInformationModelFile(String accuracyInformationModelFile) {
        checkFixed();
        this.accuracyInformationModelFile = accuracyInformationModelFile;
    }

    /**
     * @return Returns the ID of the Eclipse plug-in project to be generated as temporary storage
     *         for models and, if applicable, code.
     */
    public String getStoragePluginID() {
        StringBuilder sb = new StringBuilder();
        sb.append(temporaryDataLocation);
        if (isAccuracyInfluenceAnalysisEnabled()) {
            sb.append("_" + accuracyInfluenceAnalysisState);
        }
        return sb.toString();
    }

    /**
     * Sets the name of the Eclipse plug-in project which will be generated as temporary storage for
     * models and, if applicable, code.
     *
     * @param pluginID
     *            The name of the project containing the generated code
     */
    public void setStoragePluginID(String pluginID) {
        checkFixed();
        this.temporaryDataLocation = pluginID;
    }

    /**
     * @return Returns a list of string URIs containing all model files needed for a full PCM
     *         instance
     */
    public List<String> getPCMModelFiles() {
        ArrayList<String> files = new ArrayList<String>();
        files.addAll(allocationFiles);
        files.add(usageModelFile);
        if (accuracyInfluenceAnalysisEnabled) {
            files.add(accuracyInformationModelFile);
        }

        return files;
    }

    /**
     * @return Returns the filename of the PCM's RMI middleware repository
     */
    public String getRMIMiddlewareFile() {
        return rmiMiddlewareFile;
    }

    /**
     * Sets the filename of the PCM's RMI middleware repository
     *
     * @param middlewareFile
     */
    public void setRMIMiddlewareFile(String rmiMiddlewareFile) {
        checkFixed();
        this.rmiMiddlewareFile = rmiMiddlewareFile;
    }

    /**
     * @return Returns the filename of the PCM's middleware completion repository. If the repository
     *         was not set before, the default file will be returned.
     */
    public String getEventMiddlewareFile() {
        if (eventMiddlewareFile != null) {
            return eventMiddlewareFile;
        } else {
            return ConstantsContainer.DEFAULT_EVENT_MIDDLEWARE_FILE;
        }
    }

    /**
     * Sets the filename of the PCM's middleware completion repository
     *
     * @param eventMiddlewareFile
     */
    public void setEventMiddlewareFile(String eventMiddlewareFile) {
        checkFixed();
        this.eventMiddlewareFile = eventMiddlewareFile;
    }

    public List<String> getAllocationFiles() {
        return allocationFiles;
    }

    public void setAllocationFiles(List<String> allocationFile) {
        checkFixed();
        this.allocationFiles = allocationFile;
    }

    public String getUsageModelFile() {
        return usageModelFile;
    }

    public void setUsageModelFile(String usageModelFile) {
        checkFixed();
        this.usageModelFile = usageModelFile;
    }

    @Override
	public String getCheckFilename() {
		return PCMWorkflowConfiguration.PCM_CHECK_FILENAME;
	}

	public boolean isOverwriteWithoutAsking() {
        return overwriteWithoutAsking;
    }

    public void setOverwriteWithoutAsking(boolean overwriteWithoutAsking) {
        this.overwriteWithoutAsking = overwriteWithoutAsking;
    }

    public String getBaseProjectID() {
        return baseProjectID;
    }

    public void setBaseProjectID(String baseProjectID) {
        this.baseProjectID = baseProjectID;
    }

    public List<String> getModelPaths() {
        return modelPaths;
    }

    public void setModelPaths(List<String> modelPaths) {
        this.modelPaths = modelPaths;
    }
    
    public String getGeneratedProjectPath() {
        return generatedProjectPath;
    }

    public void setGeneratedProjectPath(String generatedProjectPath) {
        this.generatedProjectPath = generatedProjectPath;
    }

    /*
     * (non-Javadoc)
     * 
     * @see de.uka.ipd.sdq.workflow.launchconfig.AbstractWorkflowBasedRunConfiguration
     * #validateAndFreeze()
     */
    @Override
    public void validateAndFreeze() throws InvalidWorkflowJobConfigurationException {
        super.validateAndFreeze();
        for (String fileURI : getPCMModelFiles()) {
            if (fileURI == null) {
                throw new InvalidWorkflowJobConfigurationException(
                        "Workflow configuration is invalid, not all PCM models are set");
            }
            URI fileLocation = URI.createURI(fileURI);
            // TODO: Check whether file exists
        }
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        PCMWorkflowConfiguration config = (PCMWorkflowConfiguration) super.clone();
        config.accuracyInfluenceAnalysisEnabled = this.accuracyInfluenceAnalysisEnabled;
        config.accuracyInfluenceAnalysisState = this.accuracyInfluenceAnalysisState;
        config.accuracyInformationModelFile = new String(this.accuracyInformationModelFile);
        ArrayList<String> newAllocationFiles = new ArrayList<String>(this.allocationFiles.size());
        for (String allocationFile : this.allocationFiles) {
            newAllocationFiles.add(new String(allocationFile));
        }
        config.allocationFiles = newAllocationFiles;
        config.deleteTemporaryDataAfterAnalysis = this.deleteTemporaryDataAfterAnalysis;
        config.eventMiddlewareFile = new String(this.eventMiddlewareFile);
        config.rmiMiddlewareFile = new String(this.rmiMiddlewareFile);
        config.temporaryDataLocation = new String(temporaryDataLocation);
        config.usageModelFile = new String(usageModelFile);
        config.accuracyInfluenceIssueReceivingJob = this.accuracyInfluenceIssueReceivingJob;
        return config;
    }

    public PCMWorkflowConfiguration getClone() {
        try {
            return (PCMWorkflowConfiguration) clone();
        } catch (CloneNotSupportedException e) {
            if (LOGGER.isEnabledFor(Level.FATAL)) {
                LOGGER.fatal("Could not clone configuration.", e);
            }
            return null;
        }
    }

}
