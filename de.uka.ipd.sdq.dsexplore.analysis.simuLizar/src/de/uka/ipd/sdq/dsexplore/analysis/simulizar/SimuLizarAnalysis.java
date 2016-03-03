package de.uka.ipd.sdq.dsexplore.analysis.simulizar;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

import org.apache.log4j.Logger;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.Status;
import org.eclipse.debug.core.ILaunchConfiguration;
import org.eclipse.debug.core.ILaunchConfigurationWorkingCopy;
import org.eclipse.debug.core.ILaunchManager;
import org.opt4j.core.Criterion;
import org.palladiosimulator.analyzer.workflow.blackboard.PCMResourceSetPartition;
import org.palladiosimulator.analyzer.workflow.jobs.LoadPCMModelsIntoBlackboardJob;
import org.palladiosimulator.edp2.impl.RepositoryManager;
import org.palladiosimulator.edp2.models.ExperimentData.ExperimentDataFactory;
import org.palladiosimulator.edp2.models.ExperimentData.ExperimentGroup;
import org.palladiosimulator.edp2.models.ExperimentData.ExperimentSetting;
import org.palladiosimulator.edp2.models.Repository.Repository;
import org.palladiosimulator.pcm.usagemodel.UsageScenario;
import org.palladiosimulator.recorderframework.edp2.config.AbstractEDP2RecorderConfigurationFactory;
import org.palladiosimulator.simulizar.launcher.PCMInterpreterLauncher;
import org.palladiosimulator.simulizar.launcher.jobs.PCMInterpreterRootCompositeJob;
import org.palladiosimulator.simulizar.runconfig.SimuLizarWorkflowConfiguration;
import org.palladiosimulator.solver.models.PCMInstance;

import de.uka.ipd.sdq.dsexplore.analysis.AbstractAnalysis;
import de.uka.ipd.sdq.dsexplore.analysis.AnalysisFailedException;
import de.uka.ipd.sdq.dsexplore.analysis.IAnalysis;
import de.uka.ipd.sdq.dsexplore.analysis.IAnalysisResult;
import de.uka.ipd.sdq.dsexplore.analysis.IStatisticAnalysisResult;
import de.uka.ipd.sdq.dsexplore.analysis.PCMPhenotype;
import de.uka.ipd.sdq.dsexplore.analysis.simucom.SimuComQualityAttributeDeclaration;
import de.uka.ipd.sdq.dsexplore.exception.ExceptionHelper;
import de.uka.ipd.sdq.dsexplore.launch.DSEWorkflowConfiguration;
import de.uka.ipd.sdq.dsexplore.qml.pcm.datastructures.UsageScenarioBasedInfeasibilityConstraint;
import de.uka.ipd.sdq.dsexplore.qml.pcm.datastructures.UsageScenarioBasedObjective;
import de.uka.ipd.sdq.dsexplore.qml.pcm.datastructures.UsageScenarioBasedSatisfactionConstraint;
import de.uka.ipd.sdq.simucomframework.SimuComConfig;
import de.uka.ipd.sdq.simulation.AbstractSimulationConfig;
import de.uka.ipd.sdq.workflow.jobs.JobFailedException;
import de.uka.ipd.sdq.workflow.jobs.UserCanceledException;
import de.uka.ipd.sdq.workflow.mdsd.blackboard.MDSDBlackboard;

public class SimuLizarAnalysis extends AbstractAnalysis implements IAnalysis {
    /** Logger for log4j. */
    private final static Logger LOGGER = Logger.getLogger("de.uka.ipd.sdq.dsexplore.simulizar");

    /**
     * Store the launch parameters so that we do not have to pass them all the time.
     */
    private ILaunchConfiguration config;

    private String initialExperimentName;
    private Map<Integer, String> previousExperimentNames = new HashMap<Integer, String>();

    private SimuLizarWorkflowConfiguration simuLizarWorkflowConfiguration;

    public SimuLizarAnalysis() {
        super(new SimuComQualityAttributeDeclaration());
    }

    private String getExperimentName(PCMPhenotype pheno) {
        return this.initialExperimentName + " " + pheno.getGenotypeID();
    }

    @Override
    public void analyse(PCMPhenotype pheno, IProgressMonitor monitor)
            throws CoreException, UserCanceledException, JobFailedException, AnalysisFailedException {
        String experimentName = getExperimentName(pheno);
        ILaunchConfigurationWorkingCopy configCopy = config.copy("ConfigCopy");
        configCopy.setAttribute(AbstractSimulationConfig.VARIATION_ID, experimentName);
        this.simuLizarWorkflowConfiguration = new DSESimuLizarWorkflowLauncher().deriveConfiguration(configCopy);
        this.simuLizarWorkflowConfiguration.setOverwriteWithoutAsking(true);
        this.previousExperimentNames.put(pheno.getGenotypeID().hashCode(), experimentName);
        launchSimuLizar(monitor);
    }

    @Override
    public void initialise(DSEWorkflowConfiguration configuration) throws CoreException {
        this.previousExperimentNames.clear();
        this.config = configuration.getRawConfiguration();
        if (blackboard == null) {
            throw ExceptionHelper.createNewCoreException(
                    "Error in initialisation: No Blackboard was set when initialising the SimuLizar Analysis. Contact the developers.");
        }

        this.initialExperimentName = this.config.getAttribute(SimuComConfig.EXPERIMENT_RUN, "");
        initialiseCriteria(configuration);
    }

    private void launchSimuLizar(IProgressMonitor monitor)
            throws CoreException, AnalysisFailedException, UserCanceledException, JobFailedException {

        PCMInterpreterRootCompositeJob job = new PCMInterpreterRootCompositeJob(this.simuLizarWorkflowConfiguration);
        LOGGER.info("Starting experiment "
                + this.simuLizarWorkflowConfiguration.getSimulationConfiguration().getNameExperimentRun());
        job.setBlackboard(blackboard);
        job.execute(monitor);

    }

    @Override
    public boolean hasObjectivePerUsageScenario() throws CoreException {
        return false;
    }

    @Override
    public void setBlackboard(MDSDBlackboard blackboard) {
        this.blackboard = blackboard;

    }

    private IStatisticAnalysisResult retrieveSimuComResults(PCMPhenotype pheno, UsageScenario usageScenario)
            throws CoreException, AnalysisFailedException {

        String experimentRunName = getExperimentName(pheno);

        PCMResourceSetPartition pcmPartition = (PCMResourceSetPartition) this.blackboard
                .getPartition(LoadPCMModelsIntoBlackboardJob.PCM_MODELS_PARTITION_ID);
        PCMInstance pcmInstance = new PCMInstance(pcmPartition);

        Optional<IStatisticAnalysisResult> result = createResult(usageScenario, experimentRunName, pcmInstance);

        if (result.isPresent()) {
            return result.get();
        } else {
            String errormessage = "There was no experiment run or no experiment for experiment named \""
                    + experimentRunName + "\" in any available data source after analysing the PCM instance \""
                    + experimentRunName + "\" of candidate " + pheno.getNumericID() + " " + pheno.getGenotypeID();
            LOGGER.error(errormessage);
            throw new AnalysisFailedException(errormessage);
        }
    }

    private Optional<IStatisticAnalysisResult> createResult(UsageScenario usageScenario, String experimentRunName,
            PCMInstance pcmInstance) throws AnalysisFailedException {

        String repositoryId = "";
        try {
            repositoryId = (String) this.config.getAttributes()
                    .get(AbstractEDP2RecorderConfigurationFactory.REPOSITORY_ID);
        } catch (CoreException e) {
            LOGGER.error(e.getMessage());
        }
        Optional<IStatisticAnalysisResult> result = Optional.empty();
        final Repository repository = RepositoryManager.getRepositoryFromUUID(repositoryId);
        final ExperimentGroup experimentGroup = this.getExperimentGroup(repository,
                this.simuLizarWorkflowConfiguration.getSimulationConfiguration().getNameBase());
        final ExperimentSetting experimentSetting = this.getExperimentSetting(experimentGroup,
                this.simuLizarWorkflowConfiguration.getSimulationConfiguration().getVariationId());
        int lastExperimentRun = experimentSetting.getExperimentRuns().size() - 1;
        if (lastExperimentRun >= 0) {
            org.palladiosimulator.edp2.models.ExperimentData.ExperimentRun experimentRun = experimentSetting
                    .getExperimentRuns().get(lastExperimentRun);
            IStatisticAnalysisResult simuLizarResult = new SimuLizarAnalysisEDP2Result(experimentRun, experimentSetting,
                    pcmInstance, usageScenario, this.criterionToAspect,
                    (SimuComQualityAttributeDeclaration) this.qualityAttribute);
            result = Optional.ofNullable(simuLizarResult);
        } else {
            LOGGER.debug("There is no experiment run.");
        }
        return result;
    }

    @Override
    public IAnalysisResult retrieveResultsFor(PCMPhenotype pheno, Criterion criterion)
            throws CoreException, AnalysisFailedException {
        if (criterion instanceof UsageScenarioBasedObjective) {
            return this.retrieveSimuComResults(pheno, ((UsageScenarioBasedObjective) criterion).getUsageScenario());
        } else if (criterion instanceof UsageScenarioBasedInfeasibilityConstraint) {
            // Handle constraint here
            // As the mean is default (for the value as well as the evaluation
            // aspect of the constraint), no further action is required
            // We allowed only mean constraint during the initialization
            return this.retrieveSimuComResults(pheno,
                    ((UsageScenarioBasedInfeasibilityConstraint) criterion).getUsageScenario());
        } else if (criterion instanceof UsageScenarioBasedSatisfactionConstraint) {
            // Handle constraint here
            // As the mean is default (for the value as well as the evaluation
            // aspect of the constraint), no further action is required
            // We allowed only mean constraint during the initialization
            return this.retrieveSimuComResults(pheno,
                    ((UsageScenarioBasedSatisfactionConstraint) criterion).getUsageScenario());
        }
        throw new CoreException(new Status(Status.ERROR, "org.palladiosimulator.simulizar",
                "Cannot handle Criterion of type " + criterion.getClass()
                        + ". Required is UsageScenarioBasedObjective or UsageScenarioBasedConstraint."));
    }

    private ExperimentGroup getExperimentGroup(final Repository repository, final String purpose) {
        for (final ExperimentGroup experimentGroup : repository.getExperimentGroups()) {
            if (experimentGroup.getPurpose().equals(purpose)) {
                return experimentGroup;
            }
        }
        throw new IllegalArgumentException("Could not find experiment group with purpose \"" + purpose + "\"");
    }

    private ExperimentSetting getExperimentSetting(final ExperimentGroup experimentGroup, final String variationId) {
        for (final ExperimentSetting expSetting : experimentGroup.getExperimentSettings()) {
            if (expSetting.getDescription().equals(variationId)) {
                return expSetting;
            }
        }

        ExperimentSetting experimentSetting = ExperimentDataFactory.eINSTANCE.createExperimentSetting();
        experimentSetting.setDescription(variationId);
        experimentSetting.setExperimentGroup(experimentGroup);
        return experimentSetting;
    }

    class DSESimuLizarWorkflowLauncher extends PCMInterpreterLauncher {

        public SimuLizarWorkflowConfiguration deriveConfiguration(ILaunchConfiguration config) throws CoreException {
            return super.deriveConfiguration(config, ILaunchManager.RUN_MODE);

        }

    }
}
