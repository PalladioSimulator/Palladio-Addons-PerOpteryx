package de.uka.ipd.sdq.pcm.pcm2taskmodel.runconfig;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Level;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.debug.core.ILaunch;
import org.eclipse.debug.core.ILaunchConfiguration;
import org.palladiosimulator.analyzer.workflow.core.configurations.AbstractPCMLaunchConfigurationDelegate;
import org.palladiosimulator.analyzer.workflow.core.configurations.PCMWorkflowConfigurationBuilder;

import de.uka.ipd.sdq.dsexplore.launch.DSEConstantsContainer;
import de.uka.ipd.sdq.pcm.pcm2taskmodel.jobs.PCM2TaskModelJob;
import de.uka.ipd.sdq.workflow.BlackboardBasedWorkflow;
import de.uka.ipd.sdq.workflow.WorkflowExceptionHandler;
import de.uka.ipd.sdq.workflow.jobs.IJob;
import de.uka.ipd.sdq.workflow.launchconfig.core.configbuilder.AbstractWorkflowConfigurationBuilder;
import de.uka.ipd.sdq.workflow.logging.console.LoggerAppenderStruct;
import de.uka.ipd.sdq.workflow.mdsd.blackboard.MDSDBlackboard;
import de.uka.ipd.sdq.workflow.ui.UIBasedWorkflow;
import de.uka.ipd.sdq.workflow.ui.UIBasedWorkflowExceptionHandler;

public class PCM2TaskModelLaunchConfigurationDelegate
        extends AbstractPCMLaunchConfigurationDelegate<PCM2TaskModelWorkflowRunConfiguration> {
    @Override
    protected BlackboardBasedWorkflow<MDSDBlackboard> createWorkflow(
            final PCM2TaskModelWorkflowRunConfiguration workflowConfiguration, final IProgressMonitor monitor,
            final ILaunch launch) throws CoreException {
        return new UIBasedWorkflow<>(this.createWorkflowJob(workflowConfiguration, launch), monitor,
                this.createExceptionHandler(workflowConfiguration.isInteractive()), this.createBlackboard());
    }

    @Override
    protected WorkflowExceptionHandler createExceptionHandler(boolean interactive) {
        return new UIBasedWorkflowExceptionHandler(!interactive);
    }

    @Override
    protected IJob createWorkflowJob(PCM2TaskModelWorkflowRunConfiguration config, ILaunch launch)
            throws CoreException {
        return new PCM2TaskModelJob(config, launch);
    }

    @Override
    protected PCM2TaskModelWorkflowRunConfiguration deriveConfiguration(ILaunchConfiguration configuration, String mode)
            throws CoreException {
        PCM2TaskModelWorkflowRunConfiguration solverConfiguration = new PCM2TaskModelWorkflowRunConfiguration();

        AbstractWorkflowConfigurationBuilder builder;

        builder = new PCMWorkflowConfigurationBuilder(configuration, mode);
        builder.fillConfiguration(solverConfiguration);

        // no builder required for just two filenames
        solverConfiguration.setTaskmodelResultFile(configuration.getAttribute(
                TaskmodelFileNamesInputTab.TASKMODEL_OUTPUT, TaskmodelFileNamesInputTab.TASKMODEL_DEFAULT_OUTPUT));
        solverConfiguration
            .setDesignDecisionFileName(configuration.getAttribute(DSEConstantsContainer.DESIGN_DECISION_FILE, ""));

        return solverConfiguration;
    }

    @Override
    protected List<LoggerAppenderStruct> setupLogging(Level logLevel) throws CoreException {
        List<LoggerAppenderStruct> loggerList = new ArrayList<>(super.setupLogging(logLevel));
        loggerList.add(setupLogger("de.uka.ipd.sdq.pcm.pcm2taskmodel", logLevel,
                Level.DEBUG == logLevel ? DETAILED_LOG_PATTERN : SHORT_LOG_PATTERN));

        return loggerList;
    }

}
