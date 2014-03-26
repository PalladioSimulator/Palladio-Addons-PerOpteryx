package de.uka.ipd.sdq.dsexplore.analysis.simulizar;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.Status;
import org.eclipse.debug.core.ILaunch;
import org.eclipse.debug.core.ILaunchConfiguration;
import org.eclipse.debug.core.ILaunchManager;
import org.opt4j.core.Criterion;
import org.palladiosimulator.simulizar.launcher.jobs.PCMInterpreterRootCompositeJob;


import de.uka.ipd.sdq.codegen.simucontroller.runconfig.SimuComWorkflowConfiguration;
import de.uka.ipd.sdq.codegen.simucontroller.runconfig.SimuComWorkflowLauncher;
import de.uka.ipd.sdq.dsexplore.analysis.AbstractAnalysis;
import de.uka.ipd.sdq.dsexplore.analysis.AnalysisFailedException;
import de.uka.ipd.sdq.dsexplore.analysis.IAnalysis;
import de.uka.ipd.sdq.dsexplore.analysis.IAnalysisResult;
import de.uka.ipd.sdq.dsexplore.analysis.IStatisticAnalysisResult;
import de.uka.ipd.sdq.dsexplore.analysis.PCMPhenotype;
import de.uka.ipd.sdq.dsexplore.analysis.simucom.SimuComAnalysisResult;
import de.uka.ipd.sdq.dsexplore.analysis.simucom.SimuComQualityAttributeDeclaration;
import de.uka.ipd.sdq.dsexplore.exception.ExceptionHelper;
import de.uka.ipd.sdq.dsexplore.launch.DSEWorkflowConfiguration;
import de.uka.ipd.sdq.dsexplore.qml.pcm.datastructures.UsageScenarioBasedInfeasibilityConstraint;
import de.uka.ipd.sdq.dsexplore.qml.pcm.datastructures.UsageScenarioBasedObjective;
import de.uka.ipd.sdq.dsexplore.qml.pcm.datastructures.UsageScenarioBasedSatisfactionConstraint;
import de.uka.ipd.sdq.pcm.usagemodel.UsageScenario;
import de.uka.ipd.sdq.pcmsolver.models.PCMInstance;
import de.uka.ipd.sdq.pipesandfilters.framework.recorder.launch.IRecorderConfiguration;
import de.uka.ipd.sdq.pipesandfilters.framework.recorder.sensorframework.DatasourceConfigurationInvalidException;
import de.uka.ipd.sdq.pipesandfilters.framework.recorder.sensorframework.launch.SensorFrameworkConfig;
import de.uka.ipd.sdq.sensorframework.SensorFrameworkDataset;
import de.uka.ipd.sdq.sensorframework.entities.Experiment;
import de.uka.ipd.sdq.sensorframework.entities.ExperimentRun;
import de.uka.ipd.sdq.sensorframework.entities.dao.IDAOFactory;
import de.uka.ipd.sdq.simucomframework.SimuComConfig;
import de.uka.ipd.sdq.workflow.jobs.IJob;
import de.uka.ipd.sdq.workflow.jobs.JobFailedException;
import de.uka.ipd.sdq.workflow.jobs.SequentialBlackboardInteractingJob;
import de.uka.ipd.sdq.workflow.jobs.UserCanceledException;
import de.uka.ipd.sdq.workflow.logging.console.LoggerAppenderStruct;
import de.uka.ipd.sdq.workflow.mdsd.blackboard.MDSDBlackboard;
import de.uka.ipd.sdq.workflow.mdsd.blackboard.ResourceSetPartition;
import de.uka.ipd.sdq.workflow.pcm.blackboard.PCMResourceSetPartition;
import de.uka.ipd.sdq.workflow.pcm.jobs.LoadPCMModelsIntoBlackboardJob;




public class SimuLizarAnalysis extends AbstractAnalysis implements IAnalysis 
{
	/** Logger for log4j. */
	private static Logger logger = Logger.getLogger("de.uka.ipd.sdq.dsexplore");
	
	/** Store the launch parameters so that we do not have to pass them all the time.*/
	private ILaunchConfiguration config;

	private String initialExperimentName;
	private Map<Integer, String> previousExperimentNames = new HashMap<Integer, String>();

	private SimuComWorkflowConfiguration simuComWorkflowConfiguration;
	

	private int datasourceReloadCount = 1;
	

	public SimuLizarAnalysis() {
		super(new SimuLizarQualityAttributeDeclaration());
		// TODO Auto-generated constructor stub
	}
	
	private String getExperimentName(PCMPhenotype pheno) {
		return this.initialExperimentName+" "+pheno.getGenotypeID();
	}


	@Override
	public void analyse(PCMPhenotype pheno, IProgressMonitor monitor)
			throws CoreException, UserCanceledException, JobFailedException,
			AnalysisFailedException {
		String experimentName = getExperimentName(pheno);
		this.previousExperimentNames.put(pheno.getGenotypeID().hashCode(), experimentName);
		this.simuComWorkflowConfiguration.getSimulationConfiguration().setNameBase(experimentName);
		System.gc();
		if (isExperimentRunDoesNotExist(experimentName)){
			launchSimuLizar(monitor);
		}
	}
	
	

	@Override
	public void initialise(DSEWorkflowConfiguration configuration) throws CoreException {
		this.previousExperimentNames.clear();
		this.config = configuration.getRawConfiguration();
		if(blackboard == null) {
			throw ExceptionHelper.createNewCoreException("Error in initialisation: No Blackboard was set when initialising the SimuLizar Analysis. Contact the developers.");
		}
		
		this.initialExperimentName = this.config.getAttribute(SimuComConfig.EXPERIMENT_RUN, "");
		this.simuComWorkflowConfiguration = new DSESimuComWorkflowLauncher().deriveConfiguration(this.config);
		this.simuComWorkflowConfiguration.setOverwriteWithoutAsking(true);
		initialiseCriteria(configuration);
	}
	
	
private boolean isExperimentRunDoesNotExist(String experimentName) {
		
		IRecorderConfiguration recorderConfig = this.simuComWorkflowConfiguration.getSimulationConfiguration().getRecorderConfig();
		
		if (recorderConfig instanceof SensorFrameworkConfig){
			
			// Every few runs the datasource needs to be reloaded because the simulation will fail with OutOfmemoryError after ~300 simulations otherwise
			if (this.datasourceReloadCount >= 100 ){
				SensorFrameworkDataset.singleton().reload();
				this.datasourceReloadCount = 0;
			}
			this.datasourceReloadCount++;
			
			// Obtain DAOFactories. Search in any open data source. 
			Collection<IDAOFactory> daoFactoryCollection = SensorFrameworkDataset.singleton().getDataSources();
			
			for (IDAOFactory daoFactory : daoFactoryCollection) {
				if (daoFactory == null)
					throw new DatasourceConfigurationInvalidException();

				Experiment experiment;
				// Find an existing or create a new Experiment
				Collection<Experiment> experimentSet = daoFactory.createExperimentDAO().findByExperimentName(experimentName);
				
				if (experimentSet.size() > 0){
					experiment = experimentSet.iterator().next();
					
					if (experiment.getExperimentRuns().size() > 0){
						return false;
					}
					
				} 
			}
			
		}
		return true;
	}

private void launchSimuLizar(IProgressMonitor monitor) throws CoreException, AnalysisFailedException, UserCanceledException, JobFailedException {
	String featureConfigFile = this.simuComWorkflowConfiguration.getFeatureConfigFile();
	if (featureConfigFile != null && !"".equals(featureConfigFile)){
		ResourceSetPartition pcmPartition = this.blackboard.getPartition(LoadPCMModelsIntoBlackboardJob.PCM_MODELS_PARTITION_ID);
		pcmPartition.loadModel(featureConfigFile);
	}
	
	PCMInterpreterRootCompositeJob job = new PCMInterpreterRootCompositeJob(this.simuComWorkflowConfiguration);
	job.setBlackboard(blackboard);
	job.execute(monitor);
			
}

	
	
	@Override
	public boolean hasStatisticResults() throws CoreException {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean hasObjectivePerUsageScenario() throws CoreException {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void setBlackboard(MDSDBlackboard blackboard) {
		// TODO Auto-generated method stub
		this.blackboard = blackboard;
		
	}
	
	private IStatisticAnalysisResult retrieveSimuComResults(PCMPhenotype pheno, UsageScenario usageScenario)
			throws CoreException, AnalysisFailedException {
		
		String experimentName = this.previousExperimentNames.get(pheno.getGenotypeID().hashCode());
		PCMResourceSetPartition pcmPartition = (PCMResourceSetPartition)this.blackboard.getPartition(LoadPCMModelsIntoBlackboardJob.PCM_MODELS_PARTITION_ID);
		PCMInstance pcmInstance = new PCMInstance(pcmPartition);
		
		IStatisticAnalysisResult result = null;
		int selectedDataSourceID = 
			config.getAttribute(
					SensorFrameworkConfig.DATASOURCE_ID, -1);

		// try the configured data source first. 
		IDAOFactory factory = SensorFrameworkDataset.singleton().getDataSourceByID(selectedDataSourceID);
		if (factory != null){
			result = findExperimentRunAndCreateResult(usageScenario,
					experimentName, pcmInstance, factory);
		}

		if (result == null){
			// try all other open data sources. 
			Collection<IDAOFactory> daoFactories = SensorFrameworkDataset.singleton().getDataSources();
			for (IDAOFactory idaoFactory : daoFactories) {
				if (idaoFactory == factory){
					// we tried this one already
					continue;
				}
				result = findExperimentRunAndCreateResult(usageScenario,
						experimentName, pcmInstance, idaoFactory);

				if (result != null){
					logger.warn("Found matching experiment run for this candidate in data source "+idaoFactory.getName()+" "+idaoFactory.getDescription()+"(id: "+idaoFactory.getID()+"), using it as the result for this candidate. Unload all other data sources and restart the optimisation if this is not correct. Candidate: "+pheno.getNumericID()+" "+pheno.getGenotypeID());
					break;
				}
			}
		}


		if (result == null){
			String errormessage = "There was no experiment run or no experiment for experiment named \""
				+experimentName+"\" in any available data source after analysing the PCM instance \""
				+experimentName+"\" of candidate "+pheno.getNumericID()+" "+pheno.getGenotypeID();
			logger.error(errormessage);
			throw new AnalysisFailedException(errormessage);
		}
		
		return result;
	}
	
	private IStatisticAnalysisResult findExperimentRunAndCreateResult(
			UsageScenario usageScenario, String experimentName,
			PCMInstance pcmInstance,
			IDAOFactory factory) throws AnalysisFailedException {
		IStatisticAnalysisResult result = null;
		//XXX: Quick fix: Assume that there is just one experiment with the name of the current PCM instance.
		//Iterator<Experiment> it = factory.createExperimentDAO().findByExperimentName(experimentName
		//		+" RunNo. "+config.getAttribute(ConstantsContainer.RUN_NO, "0")).iterator();
		Iterator<Experiment> it = factory.createExperimentDAO().findByExperimentName(experimentName).iterator();
		if (it.hasNext()){
		  Experiment resultingExperiment = it.next();
		  Collection<ExperimentRun> runs = resultingExperiment.getExperimentRuns();
		  if (runs.size() > 0){
			  ExperimentRun myrun = getLatestRun(runs);
			  result = new SimuLizarAnalysisResult(myrun, resultingExperiment, pcmInstance, usageScenario, this.criterionToAspect, (SimuLizarQualityAttributeDeclaration)this.qualityAttribute);					  
		  } 
		}
		return result;
	}
	
	private ExperimentRun getLatestRun(Collection<ExperimentRun> runs) {
		Iterator<ExperimentRun> iterator = runs.iterator();
		ExperimentRun latest = iterator.next();
		//FIXME: Due to Bug 395, I cannot get the order of ExperimentRuns. 
		//Quickfix: Extract it from the (nasty) ExperimentDateTime String as a long.
		long dateLatest = extractTimestamp(latest.getExperimentDateTime());
		for (; iterator.hasNext();) {
			ExperimentRun experimentRun = iterator.next();
			logger.debug("Looking at run "+experimentRun.getExperimentDateTime());
			long runDate = extractTimestamp(experimentRun.getExperimentDateTime());
			if (dateLatest < runDate){
				latest = experimentRun;
				dateLatest = runDate;
			}
		}
		logger.debug("Latest run: "+latest.getExperimentDateTime());
		return latest;
	}
	
	private long extractTimestamp(String experimentDateTime) {
		//XXX fix this as soon as Bug 395 is fixed
		
		//Cut the "Run " part.
		experimentDateTime = experimentDateTime.substring(4);
		String[] experimentDateTimeArray = experimentDateTime.split(" ");
		String month = experimentDateTimeArray[1];
		
		//This is stupid, but what else to do with the nasty string...
		int monthNo = 0;
		if (month.equals("Jan")){
			monthNo = 1;
		} else if (month.equals("Feb")){
			monthNo = 2;
		} else if (month.equals("Mar")){
			monthNo = 3;
		} else if (month.equals("Apr")){
			monthNo = 4;
		} else if (month.equals("May")){
			monthNo = 5;
		} else if (month.equals("Jun")){
			monthNo = 6;
		} else if (month.equals("Jul")){
			monthNo = 7;
		} else if (month.equals("Aug")){
			monthNo = 8;
		} else if (month.equals("Sep")){
			monthNo = 9;
		} else if (month.equals("Oct")){
			monthNo = 10;
		} else if (month.equals("Nov")){
			monthNo = 11;
		} else monthNo = 12;
		
		int day = Integer.parseInt(experimentDateTimeArray[2]);
		String[] time = experimentDateTimeArray[3].split(":");
		int hour = Integer.parseInt(time[0]);
		int minute = Integer.parseInt(time[1]);
		int second = Integer.parseInt(time[2]);
		int year = Integer.parseInt(experimentDateTimeArray[5]);
		
		//The date in seconds since year 0.
		long date = (((((year * 12) + monthNo) * 31 + day)* 24 + hour)*60 + minute ) * 60 + second;
		
		return date;
	}



	@Override
	public IAnalysisResult retrieveResultsFor(PCMPhenotype pheno,
			Criterion criterion) throws CoreException, AnalysisFailedException {
		// TODO Auto-generated method stub
		if(criterion instanceof UsageScenarioBasedObjective){
			return this.retrieveSimuComResults(pheno, ((UsageScenarioBasedObjective)criterion).getUsageScenario());
		} else if (criterion instanceof UsageScenarioBasedInfeasibilityConstraint) {
			//Handle constraint here
			// As the mean is default (for the value as well as the evaluation aspect of the constraint), no further action is required
			//We allowed only mean constraint during the initialization
			
			return this.retrieveSimuComResults(pheno, ((UsageScenarioBasedInfeasibilityConstraint)criterion).getUsageScenario());
		} else if (criterion instanceof UsageScenarioBasedSatisfactionConstraint) {
			//Handle constraint here
			// As the mean is default (for the value as well as the evaluation aspect of the constraint), no further action is required
			//We allowed only mean constraint during the initialization
			
			return this.retrieveSimuComResults(pheno, ((UsageScenarioBasedSatisfactionConstraint)criterion).getUsageScenario());
		}
		throw new CoreException(new Status(Status.ERROR, "de.uka.ipd.sdq.dsexplore.analysis.simucom", "Cannot handle Criterion of type "+criterion.getClass()+". Required is UsageScenarioBasedObjective or UsageScenarioBasedConstraint."));
	}
	
}

class DSESimuComWorkflowLauncher extends SimuComWorkflowLauncher{
	
	public SimuComWorkflowConfiguration deriveConfiguration(ILaunchConfiguration config) throws CoreException{
		return super.deriveConfiguration(config, ILaunchManager.RUN_MODE);

	}
	
	 @Override
	    protected IJob createWorkflowJob(final SimuComWorkflowConfiguration config, final ILaunch launch)
	            throws CoreException {
	        return new SimuLizarModelInterpreterRootCompositeJob(config);
	    }

	    @Override
	    protected ArrayList<LoggerAppenderStruct> setupLogging(final org.apache.log4j.Level logLevel) throws CoreException {
	        final ArrayList<LoggerAppenderStruct> result = super.setupLogging(logLevel);
	        result.add(this.setupLogger("de.upb.pcm.simulizar", logLevel, Level.DEBUG == logLevel ? DETAILED_LOG_PATTERN
	                : SHORT_LOG_PATTERN));

	        return result;
	    }
	
}
