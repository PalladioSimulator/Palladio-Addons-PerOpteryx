package de.uka.ipd.sdq.dsexplore.analysis.simucom;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import org.apache.log4j.Logger;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.Status;
import org.eclipse.debug.core.ILaunchConfiguration;
import org.eclipse.debug.core.ILaunchConfigurationWorkingCopy;
import org.eclipse.debug.core.ILaunchManager;
import org.opt4j.core.Criterion;
import org.palladiosimulator.recorderframework.AbstractRecorderConfigurationFactory;
import org.palladiosimulator.recorderframework.sensorframework.DatasourceConfigurationInvalidException;
import org.palladiosimulator.recorderframework.sensorframework.SensorFrameworkRecorderConfigurationFactory;

import de.uka.ipd.sdq.codegen.simucontroller.runconfig.SimuComWorkflowConfiguration;
import de.uka.ipd.sdq.codegen.simucontroller.runconfig.SimuComWorkflowLauncher;
import de.uka.ipd.sdq.codegen.simucontroller.workflow.jobs.SimuComJob;
import de.uka.ipd.sdq.dsexplore.analysis.AbstractAnalysis;
import de.uka.ipd.sdq.dsexplore.analysis.AnalysisFailedException;
import de.uka.ipd.sdq.dsexplore.analysis.IAnalysis;
import de.uka.ipd.sdq.dsexplore.analysis.IAnalysisResult;
import de.uka.ipd.sdq.dsexplore.analysis.IStatisticAnalysisResult;
import de.uka.ipd.sdq.dsexplore.analysis.PCMPhenotype;
import de.uka.ipd.sdq.dsexplore.exception.ExceptionHelper;
import de.uka.ipd.sdq.dsexplore.helper.ConfigurationHelper;
import de.uka.ipd.sdq.dsexplore.launch.DSEConstantsContainer.QualityAttribute;
import de.uka.ipd.sdq.dsexplore.launch.DSEWorkflowConfiguration;
import de.uka.ipd.sdq.dsexplore.qml.pcm.datastructures.UsageScenarioBasedInfeasibilityConstraint;
import de.uka.ipd.sdq.dsexplore.qml.pcm.datastructures.UsageScenarioBasedObjective;
import de.uka.ipd.sdq.dsexplore.qml.pcm.datastructures.UsageScenarioBasedSatisfactionConstraint;
import de.uka.ipd.sdq.pcm.usagemodel.UsageScenario;
import de.uka.ipd.sdq.pcmsolver.models.PCMInstance;
import de.uka.ipd.sdq.sensorframework.SensorFrameworkDataset;
import de.uka.ipd.sdq.sensorframework.entities.Experiment;
import de.uka.ipd.sdq.sensorframework.entities.ExperimentRun;
import de.uka.ipd.sdq.sensorframework.entities.dao.IDAOFactory;
import de.uka.ipd.sdq.simucomframework.SimuComConfig;
import de.uka.ipd.sdq.simulation.AbstractSimulationConfig;
import de.uka.ipd.sdq.workflow.jobs.JobFailedException;
import de.uka.ipd.sdq.workflow.jobs.UserCanceledException;
import de.uka.ipd.sdq.workflow.mdsd.blackboard.MDSDBlackboard;
import de.uka.ipd.sdq.workflow.mdsd.blackboard.ResourceSetPartition;
import de.uka.ipd.sdq.workflow.pcm.blackboard.PCMResourceSetPartition;
import de.uka.ipd.sdq.workflow.pcm.jobs.LoadPCMModelsIntoBlackboardJob;

/**
 * Starts a SimuCom Analysis for the design space exploration.
 * @author Anne
 *
 */
public class SimuComAnalysis extends AbstractAnalysis implements IAnalysis{

    public SimuComAnalysis() {
        super(new SimuComQualityAttributeDeclaration());
    }



    /** Logger for log4j. */
    private static Logger logger =
            Logger.getLogger("de.uka.ipd.sdq.dsexplore");

    /** Store the launch parameters so that we do not have to pass them all the time.*/
    private ILaunchConfiguration config;

    private String initialExperimentName;
    private final Map<Integer, String> previousExperimentNames = new HashMap<Integer, String>();

    private SimuComWorkflowConfiguration simuComWorkflowConfiguration;

    private int datasourceReloadCount = 1;

    /**
     * Calls SimuCom. Before doing so, it calls the {@link ConfigurationHelper}
     * to update the {@link ILaunchConfiguration} and stores the
     * {@link PCMInstance} to files, so that SimuCom can read it as usual. After
     * the SimuCom run, the analysis results are extracted from the
     * sensorFramework data sources and returned. The returned
     * {@link IAnalysisResult} is a {@link SimuComAnalysisResult} which does not
     * store the results directly, but provides access to the underlying
     * sensorFramework data sources.
     * 
     * {@inheritDoc}
     * @throws UserCanceledException
     * 
     * @see de.uka.ipd.sdq.dsexplore.analysis.IAnalysis#analyse(PCMPhenotype, de.uka.ipd.sdq.dsexplore.PCMInstance)
     */
    @Override
    public void analyse(final PCMPhenotype pheno, final IProgressMonitor monitor) throws AnalysisFailedException, CoreException, UserCanceledException {

        final String experimentName = getExperimentName(pheno);
        this.previousExperimentNames.put(pheno.getGenotypeID().hashCode(), experimentName);
        
        ILaunchConfigurationWorkingCopy launchWorkingCopy = this.config.getWorkingCopy();
        launchWorkingCopy.setAttribute(AbstractSimulationConfig.EXPERIMENT_RUN, experimentName);
                
        this.simuComWorkflowConfiguration = new DSESimuComWorkflowLauncher().deriveConfiguration(launchWorkingCopy);
        this.simuComWorkflowConfiguration.setOverwriteWithoutAsking(true);
        
        //this.simuComWorkflowConfiguration.getSimulationConfiguration().setNameBase(experimentName);
        //((AbstractRecorderConfigurationFactory)this.simuComWorkflowConfiguration.getSimulationConfiguration().getRecorderConfigurationFactory()).setExperimentNameAndRunName(experimentName);

        System.gc();

        if (isExperimentRunDoesNotExist(experimentName)){
            launchSimuCom( monitor);
        }


    }



    /**
     * Search in all open data sources whether there is already an experiment run with this name and check that it contains some results. 
     * @param experimentName
     * @return
     */
    private boolean isExperimentRunDoesNotExist(final String experimentName) {

        // IRecorderConfiguration recorderConfig = this.simuComWorkflowConfiguration.getSimulationConfiguration().getRecorderConfig();

        if (this.simuComWorkflowConfiguration.getSimulationConfiguration().getRecorderName().toLowerCase().contains("sensorframework")){

            // Every few runs the datasource needs to be reloaded because the simulation will fail with OutOfmemoryError after ~300 simulations otherwise
            if (this.datasourceReloadCount >= 100 ){
                SensorFrameworkDataset.singleton().reload();
                this.datasourceReloadCount = 0;
            }
            this.datasourceReloadCount++;

            // Obtain DAOFactories. Search in any open data source.
            final Collection<IDAOFactory> daoFactoryCollection = SensorFrameworkDataset.singleton().getDataSources();

            for (final IDAOFactory daoFactory : daoFactoryCollection) {
                if (daoFactory == null) {
                    throw new DatasourceConfigurationInvalidException();
                }

                Experiment experiment;
                // Find an existing or create a new Experiment
                final Collection<Experiment> experimentSet = daoFactory.createExperimentDAO().findByExperimentName(experimentName);

                if (experimentSet.size() > 0){
                    experiment = experimentSet.iterator().next();

                    if (experiment.getExperimentRuns().size() > 0 && experiment.getSensors().size() > 0 ){
                        return false;
                    }

                }
            }

        }
        return true;
    }



    private String getExperimentName(final PCMPhenotype pheno) {
        return this.initialExperimentName+" "+pheno.getGenotypeID();
    }


    /**
     * FIXME: This method should not depend on the state of the blackboard anymore... but it does at this time.
     * 
     * @param pheno
     * @param usageScenario
     * @return
     * @throws CoreException
     * @throws AnalysisFailedException
     */
    private IStatisticAnalysisResult retrieveSimuComResults(final PCMPhenotype pheno, final UsageScenario usageScenario)
            throws CoreException, AnalysisFailedException {

        final String experimentName = this.previousExperimentNames.get(pheno.getGenotypeID().hashCode());
        final PCMResourceSetPartition pcmPartition = (PCMResourceSetPartition)this.blackboard.getPartition(LoadPCMModelsIntoBlackboardJob.PCM_MODELS_PARTITION_ID);
        final PCMInstance pcmInstance = new PCMInstance(pcmPartition);

        IStatisticAnalysisResult result = null;
        final int selectedDataSourceID =
                config.getAttribute(
                        SensorFrameworkRecorderConfigurationFactory.DATASOURCE_ID, -1);

        // try the configured data source first.
        final IDAOFactory factory = SensorFrameworkDataset.singleton().getDataSourceByID(selectedDataSourceID);
        if (factory != null){
            result = findExperimentRunAndCreateResult(usageScenario,
                    experimentName, pcmInstance, factory);
        }

        if (result == null){
            // try all other open data sources.
            final Collection<IDAOFactory> daoFactories = SensorFrameworkDataset.singleton().getDataSources();
            for (final IDAOFactory idaoFactory : daoFactories) {
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
            final String errormessage = "There was no experiment run or no experiment for experiment named \""
                    +experimentName+"\" in any available data source after analysing the PCM instance \""
                    +experimentName+"\" of candidate "+pheno.getNumericID()+" "+pheno.getGenotypeID();
            logger.error(errormessage);
            throw new AnalysisFailedException(errormessage);
        }

        return result;
    }


    /**
     * Tries to find a matching experiment run in the passed data source (via the passed <code>factory</code>). If a matching experiment run
     * is found, a new {@link IStatisticAnalysisResult} is created for it. If not, <code>null</code> is returned.
     * @param usageScenario The usage scenario to determine the response time values for.
     * @param experimentName The experiment name to match
     * @param pcmInstance The PCM instance to get the available resources and retrieve utilisation values.
     * @param factory The access to the data source.
     * @return The instantiated {@link IStatisticAnalysisResult} for this experiment name, or <code>null</code> if no matching experiment run could be found.
     * @throws AnalysisFailedException
     */
    private IStatisticAnalysisResult findExperimentRunAndCreateResult(
            final UsageScenario usageScenario, final String experimentName,
            final PCMInstance pcmInstance,
            final IDAOFactory factory) throws AnalysisFailedException {
        IStatisticAnalysisResult result = null;
        //XXX: Quick fix: Assume that there is just one experiment with the name of the current PCM instance.
        //Iterator<Experiment> it = factory.createExperimentDAO().findByExperimentName(experimentName
        //		+" RunNo. "+config.getAttribute(ConstantsContainer.RUN_NO, "0")).iterator();
        final Iterator<Experiment> it = factory.createExperimentDAO().findByExperimentName(experimentName).iterator();
        if (it.hasNext()){
            final Experiment resultingExperiment = it.next();
            final Collection<ExperimentRun> runs = resultingExperiment.getExperimentRuns();
            if (runs.size() > 0){
                final ExperimentRun myrun = getLatestRun(runs);
                result = new SimuComAnalysisResult(myrun, resultingExperiment, pcmInstance, usageScenario, this.criterionToAspect, (SimuComQualityAttributeDeclaration)this.qualityAttribute);
            }
        }
        return result;
    }


    private void launchSimuCom(final IProgressMonitor monitor)
            throws CoreException, AnalysisFailedException, UserCanceledException {

        /*		LoadPCMModelsIntoBlackboardJob loadJob = new LoadPCMModelsIntoBlackboardJob(config);

		PCMInstance pcm = new PCMInstance((PCMResourceSetPartition)this.blackboard.getPartition(LoadPCMModelsIntoBlackboardJob.PCM_MODELS_PARTITION_ID));
		pcm.saveToXMIFile(pcm.getSystem(), this.config.getAttribute(ConstantsContainer.SYSTEM_FILE, ""));
		pcm.saveToXMIFile(pcm.getAllocation(), this.config.getAttribute(ConstantsContainer.ALLOCATION_FILE, ""));

		SimuComWorkflowLauncher simuCom = new SimuComWorkflowLauncher();

		AbstractPCMWorkflowRunConfiguration PCMConfig;*/

        // load feature config files into blackboard

        final String featureConfigFile = this.simuComWorkflowConfiguration.getFeatureConfigFile();
        if (featureConfigFile != null && !"".equals(featureConfigFile)){
            final ResourceSetPartition pcmPartition = this.blackboard.getPartition(LoadPCMModelsIntoBlackboardJob.PCM_MODELS_PARTITION_ID);
            pcmPartition.loadModel(featureConfigFile);
        }

        this.simuComWorkflowConfiguration.setInteractive(false);

        final SimuComJob job = new SimuComJob(this.simuComWorkflowConfiguration, null, false);
        job.setBlackboard(this.blackboard);

        // retry simulation if the cause was that an extension could not be loaded, because that seems to be a transient problem (it only happens sometimes)
        final int numberOfTries = 2;
        for (int i = 0; i < numberOfTries; i++){
            try {
                // start SimuCom
                job.execute(monitor);
                logger.debug("Finished SimuCom analysis");
                break;
            } catch (final JobFailedException e) {
                logger.error(e.getMessage());
                if (numberOfTries > 0 && e.getCause().getMessage().contains("Couldn't find extension")){
                    logger.warn("Trying to start SimuCom again.");
                } else {
                    throw new AnalysisFailedException(e);
                }
            }
        }

    }


    //	/** Put all the old appends back in the logger. FIXME: does not work as expected :( but whatever.
    //	 * @throws CoreException */
    //	private void restoreLogger(ILaunchConfiguration config) throws CoreException {
    //		BasicConfigurator.resetConfiguration();
    //		LoggerHelper.initializeLogger(config);
    //	}


    /**
     * Get the latest Run from the {@link Collection} based on the getExperimentDateTime()
     * value.
     * @param runs A collection of {@link ExperimentRun}
     * @return The latest run or the first in the collection if timestamps
     * cannot properly be parsed.
     */
    private ExperimentRun getLatestRun(final Collection<ExperimentRun> runs) {
        final Iterator<ExperimentRun> iterator = runs.iterator();
        ExperimentRun latest = iterator.next();
        //FIXME: Due to Bug 395, I cannot get the order of ExperimentRuns.
        //Quickfix: Extract it from the (nasty) ExperimentDateTime String as a long.
        long dateLatest = extractTimestamp(latest.getExperimentDateTime());
        for (; iterator.hasNext();) {
            final ExperimentRun experimentRun = iterator.next();
            logger.debug("Looking at run "+experimentRun.getExperimentDateTime());
            final long runDate = extractTimestamp(experimentRun.getExperimentDateTime());
            if (dateLatest < runDate){
                latest = experimentRun;
                dateLatest = runDate;
            }
        }
        logger.debug("Latest run: "+latest.getExperimentDateTime());
        return latest;
    }

    /**
     * Extract time stamps from the experimentDateTime string. This is just a
     * QuickFix because {@link ExperimentRun}s currently do not store their
     * time properly.
     * 
     * Delete this method after Bug 395 is fixed.
     * 
     * @param experimentDateTime
     * @return The {@link Date} of the {@link ExperimentRun}
     */
	private long extractTimestamp(String experimentDateTime) {
		
		SimpleDateFormat dateFormat = new SimpleDateFormat(AbstractRecorderConfigurationFactory.EXPERIMENT_RUN_DATE_FORMAT);
        //SimpleDateFormat dateFormat = new SimpleDateFormat(AbstractRecorderConfigurationFactory.EXPERIMENT_RUN_DATE_FORMAT);
		try {
			return dateFormat.parse(experimentDateTime).getTime();
		} catch (ParseException e) {
			logger.error("Cannot parse sensorframework experiment run String");
			e.printStackTrace();
			return 0;
		}
    	
    	//return Date.parse(experimentDateTime);

        /*//Cut the "Run " part.
        experimentDateTime = experimentDateTime.substring(4);
        final String[] experimentDateTimeArray = experimentDateTime.split(" ");
        final String month = experimentDateTimeArray[1];

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
        } else {
            monthNo = 12;
        }

        final int day = Integer.parseInt(experimentDateTimeArray[2]);
        final String[] time = experimentDateTimeArray[3].split(":");
        final int hour = Integer.parseInt(time[0]);
        final int minute = Integer.parseInt(time[1]);
        final int second = Integer.parseInt(time[2]);
        final int year = Integer.parseInt(experimentDateTimeArray[5]);

        //The date in seconds since year 0.
        final long date = (((((year * 12) + monthNo) * 31 + day)* 24 + hour)*60 + minute ) * 60 + second;

        return date;*/
    }



    /**
     * {@inheritDoc}
     * @throws CoreException
     * @see de.uka.ipd.sdq.dsexplore.analysis.IAnalysis#initialise(org.eclipse.debug.core.ILaunchConfiguration, java.lang.String, org.eclipse.debug.core.ILaunch, org.eclipse.core.runtime.IProgressMonitor)
     */
    @Override
    public void initialise(final DSEWorkflowConfiguration configuration) throws CoreException {

        this.previousExperimentNames.clear();

        this.config = configuration.getRawConfiguration();
        if (blackboard == null){
            throw ExceptionHelper.createNewCoreException("Error in initialisation: No Blackboard was set when initialising the SimuCom Analysis. Contact the developers.");
        }

        this.initialExperimentName = this.config.getAttribute(SimuComConfig.EXPERIMENT_RUN, "");

        //		this.objectives = new ArrayList<Objective>(scenarios.size());
        //		for (UsageScenario usageScenario : scenarios) {
        //			objectives.add(new UsageScenarioBasedObjective(this.getQualityAttribute(), Objective.Sign.MIN, usageScenario));
        //		}

        initialiseCriteria(configuration);
    }





    //MOVED to PCMDeclarationsReader
    //	public UsageScenarioBasedObjective translateEvalAspectToObjective(EvaluationAspectWithContext aspect, UsageScenario usageScenario){
    //		//Make sure, the aspect IS an objective
    //		try {
    //			if(aspect.getDimension().getType().getRelationSemantics().getRelSem() == EnumRelationSemantics.DECREASING) {
    //				return new UsageScenarioBasedObjective(this.getQualityAttribute(), Objective.Sign.MIN, usageScenario);
    //			} else {
    //				//INCREASING
    //				return new UsageScenarioBasedObjective(this.getQualityAttribute(), Objective.Sign.MAX, usageScenario);
    //			}
    //		} catch (CoreException e) {
    //			e.printStackTrace();
    //			throw new RuntimeException("Could not get response time quality attribute!");
    //		}
    //	}

    @Override
    public IStatisticAnalysisResult retrieveResultsFor(final PCMPhenotype pheno, final Criterion criterion) throws CoreException, AnalysisFailedException {
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



    @Override
    public QualityAttribute getQualityAttribute() throws CoreException {
        //return DSEConstantsContainer.MEAN_RESPONSE_TIME_QUALITY;
        return qualityAttribute.getQualityAttribute();
    }



    @Override
    public boolean hasStatisticResults() throws CoreException {
        return true;
    }


    @Override
    public boolean hasObjectivePerUsageScenario() throws CoreException {
        return true;
    }



    @Override
    public void setBlackboard(final MDSDBlackboard blackboard) {
        this.blackboard = blackboard;

    }



}

class DSESimuComWorkflowLauncher extends SimuComWorkflowLauncher{

    public SimuComWorkflowConfiguration deriveConfiguration(final ILaunchConfiguration config) throws CoreException{
        return super.deriveConfiguration(config, ILaunchManager.RUN_MODE);

    }

}
