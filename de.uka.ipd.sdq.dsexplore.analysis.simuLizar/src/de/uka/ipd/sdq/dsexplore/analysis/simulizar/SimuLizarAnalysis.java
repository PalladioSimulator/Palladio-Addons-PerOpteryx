package de.uka.ipd.sdq.dsexplore.analysis.simulizar;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.debug.core.ILaunch;
import org.eclipse.debug.core.ILaunchConfiguration;
import org.eclipse.debug.core.ILaunchManager;
import org.opt4j.core.Criterion;
import de.uka.ipd.sdq.codegen.simucontroller.runconfig.SimuComWorkflowConfiguration;
import de.uka.ipd.sdq.codegen.simucontroller.runconfig.SimuComWorkflowLauncher;
import de.uka.ipd.sdq.dsexplore.analysis.AbstractAnalysis;
import de.uka.ipd.sdq.dsexplore.analysis.AnalysisFailedException;
import de.uka.ipd.sdq.dsexplore.analysis.IAnalysis;
import de.uka.ipd.sdq.dsexplore.analysis.IAnalysisResult;
import de.uka.ipd.sdq.dsexplore.analysis.PCMPhenotype;
import de.uka.ipd.sdq.dsexplore.exception.ExceptionHelper;
import de.uka.ipd.sdq.dsexplore.launch.DSEConstantsContainer.QualityAttribute;
import de.uka.ipd.sdq.dsexplore.launch.DSEWorkflowConfiguration;
import de.uka.ipd.sdq.probespec.framework.ISampleBlackboard;
import de.uka.ipd.sdq.probespec.framework.ProbeSpecContext;
import de.uka.ipd.sdq.probespec.framework.SampleBlackboard;
import de.uka.ipd.sdq.simucomframework.DiscardInvalidMeasurementsBlackboardDecorator;
import de.uka.ipd.sdq.simucomframework.ExperimentRunner;
import de.uka.ipd.sdq.simucomframework.SimuComConfig;
import de.uka.ipd.sdq.simucomframework.SimuComGarbageCollector;
import de.uka.ipd.sdq.simucomframework.calculator.CalculatorFactory;
import de.uka.ipd.sdq.simucomframework.calculator.SetupPipesAndFiltersStrategy;
import de.uka.ipd.sdq.simucomframework.model.SimuComModel;
import de.uka.ipd.sdq.simucomframework.probes.SimuComProbeStrategyRegistry;
import de.uka.ipd.sdq.simucomframework.simucomstatus.SimuComStatus;
import de.uka.ipd.sdq.simucomframework.simucomstatus.SimucomstatusFactory;
import de.uka.ipd.sdq.simulation.AbstractSimulationConfig;
import de.uka.ipd.sdq.simulation.abstractsimengine.ISimEngineFactory;
import de.uka.ipd.sdq.simulation.preferences.SimulationPreferencesHelper;
import de.uka.ipd.sdq.workflow.jobs.IJob;
import de.uka.ipd.sdq.workflow.jobs.JobFailedException;
import de.uka.ipd.sdq.workflow.jobs.UserCanceledException;
import de.uka.ipd.sdq.workflow.logging.console.LoggerAppenderStruct;
import de.uka.ipd.sdq.workflow.mdsd.blackboard.MDSDBlackboard;

import org.palladiosimulator.simulizar.access.AccessFactory;
import org.palladiosimulator.simulizar.access.IModelAccessFactory;
import org.palladiosimulator.simulizar.access.UsageModelAccess;
import org.palladiosimulator.simulizar.interpreter.InterpreterDefaultContext;
import org.palladiosimulator.simulizar.interpreter.listener.LogDebugListener;
import org.palladiosimulator.simulizar.interpreter.listener.ProbeSpecListener;
import org.palladiosimulator.simulizar.launcher.jobs.PCMInterpreterRootCompositeJob;
import org.palladiosimulator.simulizar.reconfiguration.IReconfigurator;
import org.palladiosimulator.simulizar.reconfiguration.ReconfigurationListener;
import org.palladiosimulator.simulizar.reconfiguration.storydiagrams.SDReconfigurator;
import org.palladiosimulator.simulizar.utils.ResourceSyncer;


public class SimuLizarAnalysis extends AbstractAnalysis implements IAnalysis {
	
	private static final Logger logger = Logger.getLogger(SimuLizarAnalysis.class.getName());
	 private SimuComWorkflowConfiguration configuration;
	 private MDSDBlackboard blackboard;
	 private String initialExperimentName;
	 private ILaunchConfiguration config;
	 private Map<Integer, String> previousExperimentNames = new HashMap<Integer, String>();
	 
	 
	public SimuLizarAnalysis(final SimuComWorkflowConfiguration configuration) {
		super(new SimuLizarQualityAttributeDeclaration());
		this.configuration = configuration;
	}

	@Override
	public void analyse(PCMPhenotype pheno, IProgressMonitor monitor)
			throws CoreException, UserCanceledException, JobFailedException,
			AnalysisFailedException {
		
		String experimentName = getExperimentName(pheno);
		this.previousExperimentNames.put(pheno.getGenotypeID().hashCode(), experimentName);
		this.configuration.getSimulationConfiguration().setNameBase(experimentName);
		System.gc();
		launchSimuLizar(monitor);
	}
	
	private String getExperimentName(PCMPhenotype pheno) {
		return this.initialExperimentName+" "+pheno.getGenotypeID();
	}

	 private SimuComModel initialiseSimuComModel() {
	        // Configuration options for the simulation engine
	        final AbstractSimulationConfig simulationConfiguration = this.getConfiguration().getSimulationConfiguration();

	        // Status model to store the runtime state of the simulator
	        final SimuComStatus simuComStatus = this.createSimuComStatus();

	        // Factory used to create the simulation engine used in the simulation,
	        // e.g., SSJ engine or Desmo-J engine
	        final ISimEngineFactory simEngineFactory = this.getSimEngineFactory();

	        // Probe spec context used to take the measurements of the simulation
	        final ProbeSpecContext probeSpecContext = new ProbeSpecContext();

	        final SimuComModel simuComModel = new SimuComModel((SimuComConfig) simulationConfiguration, simuComStatus,
	                simEngineFactory, false, probeSpecContext);

	        simuComModel.getSimulationStatus().setCurrentSimulationTime(0);

	        this.linkSimuComAndProbeSpec(simuComModel, probeSpecContext);

	        return simuComModel;
	    }
	 
	 private void linkSimuComAndProbeSpec(final SimuComModel simuComModel, final ProbeSpecContext probeSpecContext) {
	        final ISampleBlackboard discardingBlackboard = new DiscardInvalidMeasurementsBlackboardDecorator(
	                new SampleBlackboard(), simuComModel.getSimulationControl());

	        probeSpecContext.initialise(discardingBlackboard, new SimuComProbeStrategyRegistry(), new CalculatorFactory(
	                simuComModel, new SetupPipesAndFiltersStrategy(simuComModel)));

	        // install a garbage collector which keeps track of the samples stored
	        // on the blackboard and
	        // removes samples when they become obsolete
	        probeSpecContext.setBlackboardGarbageCollector(new SimuComGarbageCollector(discardingBlackboard));
	    }
	 
	 public void initialise(DSEWorkflowConfiguration configuration) throws CoreException {
			
		 this.previousExperimentNames.clear();
		 this.config = configuration.getRawConfiguration();
			if (blackboard == null){
				throw ExceptionHelper.createNewCoreException("Error in initialisation: No Blackboard was set when initialising the SimuCom Analysis. Contact the developers.");
			}
			
			this.initialExperimentName = this.config.getAttribute(SimuComConfig.EXPERIMENT_RUN, "");
			
			//this.configuration = new DSESimuComWorkflowLauncher().deriveConfiguration(this.config);
			//this.configuration.setOverwriteWithoutAsking(true);
			initialiseCriteria(configuration);
		}
	 
	 private ISimEngineFactory getSimEngineFactory() {
	        // load factory for the preferred simulation engine
	        final ISimEngineFactory factory = SimulationPreferencesHelper.getPreferredSimulationEngine();
	        if (factory == null) {
	            throw new RuntimeException("There is no simulation engine available. Install at least one engine.");
	        }
	        return factory;
	    }
	 
	 private SimuComStatus createSimuComStatus() {
	        final SimuComStatus simuComStatus = SimucomstatusFactory.eINSTANCE.createSimuComStatus();

	        simuComStatus.setProcessStatus(SimucomstatusFactory.eINSTANCE.createSimulatedProcesses());
	        simuComStatus.setResourceStatus(SimucomstatusFactory.eINSTANCE.createSimulatedResources());

	        return simuComStatus;
	    }


	    /**
	     * @return returns the configuration.
	     */
	    private SimuComWorkflowConfiguration getConfiguration() {
	        return this.configuration;
	    }

	    
	    private void launchSimuLizar(final IProgressMonitor monitor) throws JobFailedException, UserCanceledException{
	    	logger.info("Start job: " + this);

	        // 1. Initialise SimuComModel & Simulation Engine
	        final SimuComModel simuComModel = this.initialiseSimuComModel();

	        // 2. Initialise Model Access Factory
	        final IModelAccessFactory modelAccessFactory = AccessFactory.createModelAccessFactory(this.blackboard);

	        final InterpreterDefaultContext mainContext = new InterpreterDefaultContext(simuComModel);
	        mainContext.getEventNotificationHelper().addListener(new LogDebugListener());
	        mainContext.getEventNotificationHelper().addListener(new ProbeSpecListener(modelAccessFactory, simuComModel));

	        // 3. Setup interpreters for each usage scenario
	        final UsageModelAccess usageModelAccess = modelAccessFactory.getUsageModelAccess(mainContext);
	        simuComModel.setUsageScenarios(usageModelAccess.getWorkloadDrivers(modelAccessFactory));

	        /*
	         * 4. Setup Actuators that keep simulated system and model@runtime consistent Sync Resources
	         * from global pcm model with simucom model for the first time, models are already loaded
	         * into the blackboard by the workflow engine
	         */
	        final ResourceSyncer resourceSyncer = new ResourceSyncer(simuComModel, modelAccessFactory);
	        resourceSyncer.initialiseResourceEnvironment();

	        // 5. Setup reconfiguration rules and engines
	        final ReconfigurationListener reconfigurator = new ReconfigurationListener(modelAccessFactory,
	                new IReconfigurator[] { new SDReconfigurator(modelAccessFactory) });
	        reconfigurator.startListening();

	        // 6. Run Simulation
	        logger.debug("Start simulation");
	        final double simRealTimeNano = ExperimentRunner.run(simuComModel);
	        logger.debug("Finished Simulation. Simulator took " + (simRealTimeNano / Math.pow(10, 9))
	                + " real time seconds");

	        // 7. Deregister all listeners and execute cleanup code
	        mainContext.getEventNotificationHelper().removeAllListener();
	        reconfigurator.stopListening();
	        simuComModel.getProbeSpecContext().finish();
	        logger.info("finished job: " + this);
	    }
	
	@Override
	public IAnalysisResult retrieveResultsFor(PCMPhenotype pheno,
			Criterion criterion) throws CoreException, AnalysisFailedException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public QualityAttribute getQualityAttribute() throws CoreException {
		// TODO Auto-generated method stub
		return qualityAttribute.getQualityAttribute();
	}

	@Override
	public boolean hasStatisticResults() throws CoreException {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public List<Criterion> getCriterions() throws CoreException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean hasObjectivePerUsageScenario() throws CoreException {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public void setBlackboard(MDSDBlackboard blackboard) {
		// TODO Auto-generated method stub
		this.blackboard = blackboard;
	}
}

/**
 * Factory for the job for launching the pcm interpreter.
 * 
 * @author Joachim Meyer
 * 
 */
class PCMInterpreterLauncher extends SimuComWorkflowLauncher {

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
    
    public SimuComWorkflowConfiguration deriveConfiguration(ILaunchConfiguration config) throws CoreException{
		return super.deriveConfiguration(config, ILaunchManager.RUN_MODE);

	}
}


