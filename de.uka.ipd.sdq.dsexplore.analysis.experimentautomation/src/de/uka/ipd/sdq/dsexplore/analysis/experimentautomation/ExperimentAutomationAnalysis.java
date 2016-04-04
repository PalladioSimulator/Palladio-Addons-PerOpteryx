package de.uka.ipd.sdq.dsexplore.analysis.experimentautomation;

import java.util.Optional;

import org.apache.log4j.Logger;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.debug.core.ILaunch;
import org.eclipse.debug.core.ILaunchConfiguration;
import org.eclipse.debug.core.ILaunchManager;
import org.eclipse.debug.core.Launch;
import org.palladiosimulator.edp2.impl.RepositoryManager;
import org.palladiosimulator.edp2.models.ExperimentData.ExperimentGroup;
import org.palladiosimulator.edp2.models.ExperimentData.ExperimentSetting;
import org.palladiosimulator.edp2.models.Repository.Repository;
import org.palladiosimulator.experimentautomation.abstractsimulation.AbstractSimulationConfiguration;
import org.palladiosimulator.experimentautomation.abstractsimulation.AbstractsimulationFactory;
import org.palladiosimulator.experimentautomation.abstractsimulation.EDP2Datasource;
import org.palladiosimulator.experimentautomation.abstractsimulation.MemoryDatasource;
import org.palladiosimulator.experimentautomation.application.config.ExperimentAutomationConfiguration;
import org.palladiosimulator.experimentautomation.application.jobs.RunExperimentAutomationJob;
import org.palladiosimulator.experimentautomation.application.tooladapter.simulizar.model.impl.SimulizartooladapterFactoryImpl;
import org.palladiosimulator.experimentautomation.application.workflow.ExperimentAutomationWorkflowLauncher;
import org.palladiosimulator.experimentautomation.experiments.Experiment;
import org.palladiosimulator.pcm.usagemodel.UsageScenario;
import org.palladiosimulator.solver.models.PCMInstance;

import de.uka.ipd.sdq.dsexplore.analysis.AnalysisFailedException;
import de.uka.ipd.sdq.dsexplore.analysis.IStatisticAnalysisResult;
import de.uka.ipd.sdq.dsexplore.analysis.PCMPhenotype;
import de.uka.ipd.sdq.dsexplore.analysis.simucom.SimuComQualityAttributeDeclaration;
import de.uka.ipd.sdq.dsexplore.analysis.simulizar.SimuLizarAnalysis;
import de.uka.ipd.sdq.dsexplore.analysis.simulizar.SimuLizarAnalysisEDP2Result;
import de.uka.ipd.sdq.dsexplore.launch.DSEWorkflowConfiguration;
import de.uka.ipd.sdq.workflow.extension.AbstractExtendableJob;
import de.uka.ipd.sdq.workflow.jobs.IJob;
import de.uka.ipd.sdq.workflow.jobs.JobFailedException;
import de.uka.ipd.sdq.workflow.jobs.UserCanceledException;
import de.uka.ipd.sdq.workflow.mdsd.blackboard.MDSDBlackboard;

public class ExperimentAutomationAnalysis extends SimuLizarAnalysis {
    /** Logger for log4j. */
    private final static Logger LOGGER = Logger.getLogger("de.uka.ipd.sdq.dsexplore.analysis.experimentautomation");
    private static MemoryDatasource MEMORY_DATASOURCE = AbstractsimulationFactory.eINSTANCE.createMemoryDatasource();

    private ILaunchConfiguration config;
    private ExperimentAutomationConfiguration experimentAutomationConfig;
    private AbstractSimulationConfiguration toolConfig;

    public ExperimentAutomationAnalysis() {
        super();
    }

    @Override
    public void initialise(DSEWorkflowConfiguration configuration) throws CoreException {
        this.config = configuration.getRawConfiguration();
        initialiseCriteria(configuration);
    }

    @Override
    public void analyse(PCMPhenotype pheno, IProgressMonitor monitor)
            throws CoreException, UserCanceledException, JobFailedException, AnalysisFailedException {

        DSEExperimentAutomationWorkflowLauncher workflowLauncher = new DSEExperimentAutomationWorkflowLauncher();
        this.initialiseExperimentAutomationConfig(workflowLauncher, pheno);
        this.launchExperimentAutomation(monitor, workflowLauncher);

    }

    private void initialiseExperimentAutomationConfig(DSEExperimentAutomationWorkflowLauncher workflowLauncher,
            PCMPhenotype pheno) throws CoreException {
        this.experimentAutomationConfig = workflowLauncher.deriveConfiguration(config);
        experimentRunName = getExperimentName(pheno);
        Experiment experiment = this.experimentAutomationConfig.getExperiments().get(0);
        experiment.getInitialModel().setAllocation(pheno.getPCMInstance().getAllocation());

        experiment.getToolConfiguration().stream().filter(sc -> sc instanceof AbstractSimulationConfiguration)
                .map(sc -> (AbstractSimulationConfiguration) sc).forEach(sc -> {
                    sc.setName(experimentRunName);
                    if (sc.getDatasource() instanceof MemoryDatasource) {
                        if (RepositoryManager.getRepositoryFromUUID(MEMORY_DATASOURCE.getId()) == null) {
                            MEMORY_DATASOURCE = AbstractsimulationFactory.eINSTANCE.createMemoryDatasource();
                        }
                        sc.setDatasource(MEMORY_DATASOURCE);
                    }
                });

        Optional<AbstractSimulationConfiguration> abstractSimulationConfiguration = experiment.getToolConfiguration()
                .stream().filter(sc -> sc instanceof AbstractSimulationConfiguration).findFirst()
                .map(sc -> (AbstractSimulationConfiguration) sc);

        this.toolConfig = abstractSimulationConfiguration
                .orElse(SimulizartooladapterFactoryImpl.init().createSimuLizarConfiguration());
    }

    private void launchExperimentAutomation(IProgressMonitor monitor,
            DSEExperimentAutomationWorkflowLauncher workflowLauncher) {
        ILaunch launch = new Launch(config, ILaunchManager.DEBUG_MODE, null);
        try {
            IJob job = workflowLauncher.createWorkflowJob(experimentAutomationConfig, launch);
            if (job instanceof RunExperimentAutomationJob) {
                AbstractExtendableJob<MDSDBlackboard> experimentAutomationJob = (RunExperimentAutomationJob) job;
                experimentAutomationJob.setBlackboard(blackboard);
                experimentAutomationJob.execute(monitor);
            } else {
                LOGGER.debug("The created Job is not an ExperimentAutomationJob.");
            }
        } catch (CoreException e) {
            LOGGER.error(e.getMessage());
        } catch (JobFailedException e) {
            LOGGER.error(e.getMessage());
        } catch (UserCanceledException e) {
            LOGGER.error(e.getMessage());
        }
    }

    @Override
    protected Optional<IStatisticAnalysisResult> createResult(UsageScenario usageScenario, PCMInstance pcmInstance)
            throws AnalysisFailedException {

        Optional<IStatisticAnalysisResult> result = Optional.empty();
        String repositoryId = "";
        EDP2Datasource datasource = this.toolConfig.getDatasource();
        repositoryId = datasource.getId();
        Experiment experiment = this.experimentAutomationConfig.getExperiments().get(0);
        final Repository repository = RepositoryManager.getRepositoryFromUUID(repositoryId);
        if (repository != null) {
            final ExperimentGroup experimentGroup = this.getExperimentGroup(repository,
                    this.getExperimentPurpose(experiment));
            final ExperimentSetting experimentSetting = this.getExperimentSetting(experimentGroup, experimentRunName);
            int lastExperimentRun = experimentSetting.getExperimentRuns().size() - 1;
            if (lastExperimentRun >= 0) {
                org.palladiosimulator.edp2.models.ExperimentData.ExperimentRun experimentRun = experimentSetting
                        .getExperimentRuns().get(lastExperimentRun);
                IStatisticAnalysisResult simuLizarResult = new SimuLizarAnalysisEDP2Result(experimentRun,
                        experimentSetting, pcmInstance, usageScenario, this.criterionToAspect,
                        (SimuComQualityAttributeDeclaration) this.qualityAttribute);
                result = Optional.ofNullable(simuLizarResult);
            } else {
                LOGGER.debug("There is no experiment run.");
            }
        }
        return result;
    }

    private String getExperimentPurpose(Experiment experiment) {
        StringBuilder stringBuilder = new StringBuilder(experiment.getName());
        stringBuilder.append(" [");
        stringBuilder.append(experiment.getId());
        stringBuilder.append("]");
        return stringBuilder.toString();
    }

    @Override
    protected ExperimentSetting getExperimentSetting(final ExperimentGroup experimentGroup, final String variationId) {
        for (final ExperimentSetting expSetting : experimentGroup.getExperimentSettings()) {
            if (expSetting.getDescription().contains(variationId)) {
                return expSetting;
            }
        }
        throw new IllegalArgumentException("Could not find experiment setting with purpose \"" + variationId + "\"");

    }

    class DSEExperimentAutomationWorkflowLauncher extends ExperimentAutomationWorkflowLauncher {

        public ExperimentAutomationConfiguration deriveConfiguration(ILaunchConfiguration config) throws CoreException {
            return super.deriveConfiguration(config, ILaunchManager.RUN_MODE);

        }

        @Override
        protected IJob createWorkflowJob(final ExperimentAutomationConfiguration config, final ILaunch launch)
                throws CoreException {
            return super.createWorkflowJob(config, launch);
        }
    }

}
