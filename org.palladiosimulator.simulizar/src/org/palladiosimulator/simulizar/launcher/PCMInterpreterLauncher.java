package org.palladiosimulator.simulizar.launcher;

import java.util.ArrayList;

import org.apache.log4j.Level;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.debug.core.ILaunch;
import org.palladiosimulator.simulizar.launcher.jobs.PCMInterpreterRootCompositeJob;

import de.uka.ipd.sdq.codegen.simucontroller.runconfig.SimuComWorkflowConfiguration;
import de.uka.ipd.sdq.codegen.simucontroller.runconfig.SimuComWorkflowLauncher;
import de.uka.ipd.sdq.workflow.jobs.IJob;
import de.uka.ipd.sdq.workflow.logging.console.LoggerAppenderStruct;

/**
 * Factory for the job for launching the pcm interpreter.
 * 
 * @author Joachim Meyer
 * 
 */
public class PCMInterpreterLauncher extends SimuComWorkflowLauncher {

    @Override
    protected IJob createWorkflowJob(final SimuComWorkflowConfiguration config, final ILaunch launch)
            throws CoreException {
        return new PCMInterpreterRootCompositeJob(config);
    }

    @Override
    protected ArrayList<LoggerAppenderStruct> setupLogging(final org.apache.log4j.Level logLevel) throws CoreException {
        final ArrayList<LoggerAppenderStruct> result = super.setupLogging(logLevel);
        result.add(this.setupLogger("de.upb.pcm.simulizar", logLevel, Level.DEBUG == logLevel ? DETAILED_LOG_PATTERN
                : SHORT_LOG_PATTERN));

        return result;
    }
}