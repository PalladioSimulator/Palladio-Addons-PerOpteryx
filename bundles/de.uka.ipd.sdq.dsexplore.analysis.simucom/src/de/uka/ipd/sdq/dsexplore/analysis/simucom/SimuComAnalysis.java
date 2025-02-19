package de.uka.ipd.sdq.dsexplore.analysis.simucom;

import java.util.HashMap;
import java.util.Map;

import org.apache.log4j.Logger;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.Status;
import org.eclipse.debug.core.ILaunchConfiguration;
import org.eclipse.debug.core.ILaunchConfigurationWorkingCopy;
import org.eclipse.debug.core.ILaunchManager;
import org.opt4j.core.Criterion;
import org.palladiosimulator.analyzer.workflow.core.blackboard.PCMResourceSetPartition;
import org.palladiosimulator.analyzer.workflow.core.jobs.LoadPCMModelsIntoBlackboardJob;
import org.palladiosimulator.edp2.models.Repository.Repository;
import org.palladiosimulator.pcm.core.entity.Entity;
import org.palladiosimulator.solver.core.models.PCMInstance;

import de.uka.ipd.sdq.codegen.simucontroller.runconfig.SimuComWorkflowConfiguration;
import de.uka.ipd.sdq.codegen.simucontroller.runconfig.SimuComWorkflowLauncher;
import de.uka.ipd.sdq.codegen.simucontroller.workflow.jobs.SimuComJob;
import de.uka.ipd.sdq.dsexplore.analysis.AbstractAnalysis;
import de.uka.ipd.sdq.dsexplore.analysis.AbstractPerformanceAttributeDeclaration;
import de.uka.ipd.sdq.dsexplore.analysis.AnalysisFailedException;
import de.uka.ipd.sdq.dsexplore.analysis.IAnalysis;
import de.uka.ipd.sdq.dsexplore.analysis.IAnalysisResult;
import de.uka.ipd.sdq.dsexplore.analysis.IStatisticAnalysisResult;
import de.uka.ipd.sdq.dsexplore.analysis.PCMPhenotype;
import de.uka.ipd.sdq.dsexplore.exception.ExceptionHelper;
import de.uka.ipd.sdq.dsexplore.helper.ConfigurationHelper;
import de.uka.ipd.sdq.dsexplore.launch.DSEConstantsContainer.QualityAttribute;
import de.uka.ipd.sdq.dsexplore.launch.DSEWorkflowConfiguration;
import de.uka.ipd.sdq.dsexplore.qml.contracttype.QMLContractType.Dimension;
import de.uka.ipd.sdq.dsexplore.qml.pcm.datastructures.EntryLevelSystemCallCriterion;
import de.uka.ipd.sdq.dsexplore.qml.pcm.datastructures.UsageScenarioBasedCriterion;
import de.uka.ipd.sdq.simucomframework.SimuComConfig;
import de.uka.ipd.sdq.simulation.AbstractSimulationConfig;
import de.uka.ipd.sdq.workflow.jobs.CleanupFailedException;
import de.uka.ipd.sdq.workflow.jobs.JobFailedException;
import de.uka.ipd.sdq.workflow.jobs.UserCanceledException;
import de.uka.ipd.sdq.workflow.mdsd.blackboard.MDSDBlackboard;
import de.uka.ipd.sdq.workflow.mdsd.blackboard.ResourceSetPartition;

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
     * @see de.uka.ipd.sdq.dsexplore.analysis.IAnalysis#analyse(PCMPhenotype, de.org.palladiosimulator.solver.core.models.PCMInstance)
     */
    @Override
    public void analyse(final PCMPhenotype pheno, final IProgressMonitor monitor) throws AnalysisFailedException, CoreException, UserCanceledException {

        final String experimentName = getExperimentName(pheno);
        final String experimentSettingName = getExperimentSettingName(pheno);
        this.previousExperimentNames.put(pheno.getGenotypeID().hashCode(), experimentSettingName);

        final ILaunchConfigurationWorkingCopy launchWorkingCopy = this.config.getWorkingCopy();
        
        launchWorkingCopy.setAttribute(AbstractSimulationConfig.EXPERIMENT_RUN, experimentName);
        launchWorkingCopy.setAttribute(AbstractSimulationConfig.VARIATION_ID, experimentSettingName);

        /* this method call already creates an empty run if EDP2 is used. */
        this.simuComWorkflowConfiguration = new DSESimuComWorkflowLauncher().deriveConfiguration(launchWorkingCopy);
        this.simuComWorkflowConfiguration.setOverwriteWithoutAsking(true);

        //this.simuComWorkflowConfiguration.getSimulationConfiguration().setNameBase(experimentName);
        //((AbstractRecorderConfigurationFactory)this.simuComWorkflowConfiguration.getSimulationConfiguration().getRecorderConfigurationFactory()).setExperimentNameAndRunName(experimentName);

        System.gc();

        if (isExperimentRunDoesNotExist(experimentName, experimentSettingName)){
            launchSimuCom( monitor);
        }


    }



    /**
     * Search in all open data sources whether there is already an experiment run with this name and check that it contains some results.
     * @param experimentSettingName
     * @return
     */
    private boolean isExperimentRunDoesNotExist(final String experimentName, final String experimentSettingName) throws CoreException {
    	
        if (config.getAttribute("persistenceFramework", "").equals("SensorFramework"))
        {
        	return !SimuComAnalysisSensorFrameworkResult.isExperimentRunExisting(experimentName, this.simuComWorkflowConfiguration, this.datasourceReloadCount, config);
        }
        // In case the selected persistence framework is EDP2
        else 
        {
        	return !SimuComAnalysisEDP2Result.isExperimentRunExisting(experimentName, experimentSettingName, SimuComAnalysisEDP2Result.findSelectedEDP2Repository(config));
        }
        
    }



    private String getExperimentName(final PCMPhenotype pheno) throws CoreException {
        if (config.getAttribute("persistenceFramework", "").equals("SensorFramework"))
        {
        	return this.initialExperimentName + " " + pheno.getGenotypeID();
        }
        // In case the selected persistence framework is EDP2
        else 
        {
        	return this.initialExperimentName;
        }
        
    }
    
    private String getExperimentSettingName(final PCMPhenotype pheno) throws CoreException {

    	return pheno.getGenotypeID();
        
    }


    /**
     * FIXME: This method should not depend on the state of the blackboard anymore... but it does at this time.
     *
     * @param pheno
     * @param entity
     * @return
     * @throws CoreException
     * @throws AnalysisFailedException
     */
    private IStatisticAnalysisResult retrieveSimuComResults(final PCMPhenotype pheno, final Entity entity)
            throws CoreException, AnalysisFailedException {

        final String experimentName = this.getExperimentName(pheno);
        final String experimentSettingName = this.getExperimentSettingName(pheno);
        final PCMResourceSetPartition pcmPartition = (PCMResourceSetPartition)this.blackboard.getPartition(LoadPCMModelsIntoBlackboardJob.PCM_MODELS_PARTITION_ID);
        final PCMInstance pcmInstance = new PCMInstance(pcmPartition);

        IStatisticAnalysisResult result = null;
        
        // Decide whether it's SensorFramework or EDP2
        if ("SensorFramework".equals(config.getAttribute("persistenceFramework", "")))
        {        	
                result = new SimuComAnalysisSensorFrameworkResult(entity,
                        experimentName, pcmInstance, this.criterionToAspect, (SimuComQualityAttributeDeclaration)this.qualityAttribute, this.config);
            
            if (result == null)
            {
                final String errormessage = "There was no experiment run or no experiment for experiment named \""
                        +experimentName+"\" in the selected data source after analysing the PCM instance \""
                        +experimentName+"\" of candidate "+pheno.getNumericID()+" "+pheno.getGenotypeID();
                logger.error(errormessage);
                throw new AnalysisFailedException(errormessage);
            }


        }
        // In case the selected persistence framework is EDP2
        else 
        {

        	Repository selectedRepo = SimuComAnalysisEDP2Result.findSelectedEDP2Repository(config);
        	
        	result = SimuComAnalysisEDP2Result.findExperimentRunAndCreateResult(entity, experimentName,
					experimentSettingName, pcmInstance, selectedRepo, this.criterionToAspect, (SimuComQualityAttributeDeclaration)this.qualityAttribute);
        	
            if (result == null)
            {
                final String errormessage = "There was no experiment named \""
                        +experimentName+"\" with an experiment setting \""+experimentSettingName+"\""
                        +" in the selected data source after analysing the PCM instance \""
                        +experimentName+"\" of candidate "+pheno.getNumericID()+" "+pheno.getGenotypeID();
                logger.error(errormessage);
                throw new AnalysisFailedException(errormessage);
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
                if (e.getCause() != null){
                	String causingErrorMessage = e.getCause().getMessage();
                	if (numberOfTries > 0 && causingErrorMessage != null && causingErrorMessage.contains("Couldn't find extension")){
                		logger.warn("Trying to start SimuCom again.");
                		continue;
                	}
                }
                // try to roll back and clean up (e.g. delete temporary folder). This is not tested yet and may cause problems. 
                try {
					job.cleanup(monitor);
				} catch (CleanupFailedException e1) {
					logger.error("Cleanup of failed simucoim run failed, probably you need to clean up manually (e.g. delete temorary plugin);");
					e1.printStackTrace();
				}
                throw new AnalysisFailedException(e);
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

        Entity entity = getPCMEntityForCriterion(criterion);
        return this.retrieveSimuComResults(pheno, entity);
        
    }
    
    private Entity getPCMEntityForCriterion(final Criterion criterion) throws CoreException{
    	 if(criterion instanceof UsageScenarioBasedCriterion){
             return ((UsageScenarioBasedCriterion)criterion).getUsageScenario();
         } else if (criterion instanceof EntryLevelSystemCallCriterion){
        	 return ((EntryLevelSystemCallCriterion)criterion).getEntryLevelSystemCall();
         }
    	 throw new CoreException(new Status(Status.ERROR, "de.uka.ipd.sdq.dsexplore.analysis.simucom", "Cannot handle Criterion of type "+criterion.getClass()+". Required is UsageScenarioBasedCriterion or EntryLevelSystemCallCriterion."));
    }



    @Override
    public QualityAttribute getQualityAttribute() throws CoreException {
        //return DSEConstantsContainer.MEAN_RESPONSE_TIME_QUALITY;
        return qualityAttribute.getQualityAttribute();
    }


    //TODO remove Criterion parameter again, not needed. 
    @Override
    public boolean hasStatisticResultsFor() throws CoreException {
    	// FIXME: need to properly map between criterion and the quality attribute dimension. Cannot fix this before PALLADIO-384 is fixed. 
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
