package de.uka.ipd.sdq.dsexplore.analysis.simucom;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.apache.commons.math.stat.descriptive.UnivariateStatistic;
import org.apache.commons.math.stat.descriptive.moment.Mean;
import org.apache.commons.math.stat.descriptive.moment.StandardDeviation;
import org.apache.commons.math.stat.descriptive.rank.Max;
import org.apache.commons.math.stat.descriptive.rank.Median;
import org.apache.commons.math.stat.descriptive.rank.Min;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.debug.core.ILaunchConfiguration;
import org.opt4j.core.Criterion;
import org.palladiosimulator.analyzer.resultdecorator.ResultDecoratorRepository;
import org.palladiosimulator.analyzer.resultdecorator.repositorydecorator.RepositorydecoratorFactory;
import org.palladiosimulator.analyzer.resultdecorator.repositorydecorator.ServiceResult;
import org.palladiosimulator.analyzer.resultdecorator.resourceenvironmentdecorator.ActiveResourceUtilisationResult;
import org.palladiosimulator.analyzer.resultdecorator.resourceenvironmentdecorator.PassiveResourceResult;
import org.palladiosimulator.analyzer.resultdecorator.resourceenvironmentdecorator.UtilisationResult;
import org.palladiosimulator.pcm.core.composition.AssemblyContext;
import org.palladiosimulator.pcm.core.entity.Entity;
import org.palladiosimulator.pcm.resourcetype.ResourceType;
import org.palladiosimulator.pcm.seff.ExternalCallAction;
import org.palladiosimulator.pcm.seff.ServiceEffectSpecification;
import org.palladiosimulator.pcm.usagemodel.UsageScenario;
import org.palladiosimulator.recorderframework.core.config.AbstractRecorderConfigurationFactory;
import org.palladiosimulator.recorderframework.sensorframework.DatasourceConfigurationInvalidException;
import org.palladiosimulator.recorderframework.sensorframework.SensorFrameworkRecorderConfigurationFactory;
import org.palladiosimulator.solver.core.models.PCMInstance;
import org.palladiosimulator.solver.core.transformations.ContextWrapper;

import de.uka.ipd.sdq.codegen.simucontroller.core.runconfig.SimuComWorkflowConfiguration;
import de.uka.ipd.sdq.codegen.simudatavisualisation.datatypes.AbstractPie;
import de.uka.ipd.sdq.codegen.simudatavisualisation.datatypes.PieEntity;
import de.uka.ipd.sdq.dsexplore.analysis.AnalysisFailedException;
import de.uka.ipd.sdq.dsexplore.analysis.IStatisticAnalysisResult;
import de.uka.ipd.sdq.dsexplore.qml.pcm.datastructures.EvaluationAspectWithContext;
import de.uka.ipd.sdq.sensorframework.SensorFrameworkDataset;
import de.uka.ipd.sdq.sensorframework.adapter.StateSensorToPieAdapter;
import de.uka.ipd.sdq.sensorframework.adapter.StateSensorToTimeDeltaPieAdapter;
import de.uka.ipd.sdq.sensorframework.entities.Experiment;
import de.uka.ipd.sdq.sensorframework.entities.ExperimentRun;
import de.uka.ipd.sdq.sensorframework.entities.Measurement;
import de.uka.ipd.sdq.sensorframework.entities.Sensor;
import de.uka.ipd.sdq.sensorframework.entities.SensorAndMeasurements;
import de.uka.ipd.sdq.sensorframework.entities.TimeSpanMeasurement;
import de.uka.ipd.sdq.sensorframework.entities.TimeSpanSensor;
import de.uka.ipd.sdq.sensorframework.entities.dao.IDAOFactory;
import de.uka.ipd.sdq.statistics.PhiMixingBatchAlgorithm;
import de.uka.ipd.sdq.statistics.estimation.ConfidenceInterval;
import de.uka.ipd.sdq.statistics.estimation.SampleMeanEstimator;

public class SimuComAnalysisSensorFrameworkResult extends SimuComAnalysisResult {

    // SensorFramework-specific attributes pushed down from superclass
    private final ExperimentRun run;
    private final Experiment experiment;

    public SimuComAnalysisSensorFrameworkResult(Entity entity,
			String experimentName, PCMInstance pcmInstance,
			Map<Criterion, EvaluationAspectWithContext> criterionToAspect,
			SimuComQualityAttributeDeclaration qualityAttributeInfo, 
			ILaunchConfiguration config)
			
                    throws AnalysisFailedException, CoreException {
        super(pcmInstance);
        
        this.experiment = findExperiment(experimentName, config);
        this.run = getLatestRun(this.experiment);
        
        this.pcmEntityIdentifier = entity.getEntityName(); //.replaceAll(" ", "_");

        this.objectiveToAspects = criterionToAspect;
        this.qualityAttributeInfo = qualityAttributeInfo;

        this.results =  retrieveResults(pcmInstance);
        this.maxUtilization = calculateMaxUtil("CPU");

        final SensorAndMeasurements sam = getUsageScenarioMeasurements();
        this.meanValue =  calculateUnivariateStatistic(sam, TimeseriesData.TIMESPAN, new Mean());
        this.stdDeviation = calculateUnivariateStatistic(sam, TimeseriesData.TIMESPAN, new StandardDeviation());
        this.medianValue = calculateUnivariateStatistic(sam, TimeseriesData.TIMESPAN, new Median());
        this.throughput = calculateThroughput(sam);
        this.observations = sam.getMeasurements().size();
        this.confidenceInterval = determineConfidenceInterval(sam);

        logger.debug("Initialised SimuCom result");
    }


    private static Experiment findExperiment(String experimentName,
    		ILaunchConfiguration config) throws CoreException{

    	final int selectedDataSourceID =
    			config.getAttribute(SensorFrameworkRecorderConfigurationFactory.DATASOURCE_ID, -1);
    	
    	final IDAOFactory factory = SensorFrameworkDataset.singleton().getDataSourceByID(selectedDataSourceID);

    	//XXX: Quick fix: Assuming that there is just one experiment with the name of the current PCM instance.
    	/* the Sensorframework cuts experiment names at a certain length, so need to check for the prefix*/
    	Collection<Experiment> experiments = factory.createExperimentDAO().getExperiments();
    	
    	/* it happened that an empty list of experiments was returned even if there should be some. So reload in that case. */
    	if (experiments.size() == 0){
        	SensorFrameworkDataset.singleton().reload();
        	experiments = factory.createExperimentDAO().getExperiments();
    	}
    	
    	for (Experiment experiment : experiments) {
			if (experimentName.startsWith(experiment.getExperimentName())){
				return experiment;
			}
		}

    	return null;
    }




	/**
     * Tries to find a matching experiment run in the selected data source. If a matching experiment run
     * is found, <code>true</code>. If not, <code>false</code> is returned.
     * @param experimentName The experiment name to match
     * @param workflowConfig
     * @param datasourceReloadCount
     * @param config 
     * @return <code>true</code> if experiment has been found, <code>false</code> otherwise
     * @throws CoreException 
     */
    static public boolean isExperimentRunExisting(final String experimentName, final SimuComWorkflowConfiguration workflowConfig, int datasourceReloadCount, ILaunchConfiguration config) throws CoreException
    {
    	// IRecorderConfiguration recorderConfig = this.simuComWorkflowConfiguration.getSimulationConfiguration().getRecorderConfig();

    	// Every few runs the datasource needs to be reloaded because the simulation will fail with OutOfmemoryError after ~300 simulations otherwise
    	if (datasourceReloadCount >= 100 ){
    		SensorFrameworkDataset.singleton().reload();
    		datasourceReloadCount = 0;
    	}
    	datasourceReloadCount++;

    	Experiment experiment = findExperiment(experimentName, config);
    	
    	if (experiment == null){
    		return false;
    	} else {
    		ExperimentRun myRun = getLatestRun(experiment);
    		if (myRun == null ){
    			return false;
    		} else {
    			return true;
    		}
    	}

    }

     
    private double calculateUnivariateStatistic(final SensorAndMeasurements sam, final TimeseriesData timespan, final UnivariateStatistic stat) {
        final double[] measurements = measurementsToDoubleArray(sam, timespan);
        return stat.evaluate(measurements);
    }

    private SensorAndMeasurements getUsageScenarioMeasurements() throws AnalysisFailedException{
        //Get usage scenario sensor.
        final Sensor respTimeSensor = getSensorForUsageScenario(experiment, this.pcmEntityIdentifier);
        if (respTimeSensor != null){
            return run.getMeasurementsOfSensor(respTimeSensor);

        } else {
            throw new AnalysisFailedException("Could not find sensor for usage scenario "+this.pcmEntityIdentifier);
        }
    }

    /**
     * Get the latest Run from the {@link Collection} based on the getExperimentDateTime()
     * value.
     * @param runs A collection of {@link ExperimentRun}
     * @return The latest run or the first in the collection if timestamps
     * cannot properly be parsed.
     */
    private static ExperimentRun getLatestRun(final Experiment currentExperiment) {

    	final Collection<ExperimentRun> runs = currentExperiment.getExperimentRuns();

    	final Iterator<ExperimentRun> iterator = runs.iterator();

    	long dateLatest = 0;
    	ExperimentRun latest = null;

    	if (iterator.hasNext()){

    		for (; iterator.hasNext();) {
    			final ExperimentRun experimentRun = iterator.next();
    			if (experimentRun.getMeasurements().size() != 0){
    				logger.debug("Looking at run "+experimentRun.getExperimentDateTime());
    				//FIXME: Due to Bug 395, I cannot get the order of ExperimentRuns.
    				//Quickfix: Extract it from the (nasty) ExperimentDateTime String as a long.
    				final long runDate = extractTimestamp(experimentRun.getExperimentDateTime());
    				if (dateLatest < runDate){
    					latest = experimentRun;
    					dateLatest = runDate;
    				}
    			}
    		}
    		if (latest != null){
    			logger.debug("Latest run: "+latest.getExperimentDateTime());
    		}
    		return latest;
    	} else {
    		return null;
    	}
    }

    public static final String EXPERIMENT_RUN_DATE_FORMAT = AbstractRecorderConfigurationFactory.EXPERIMENT_RUN_DATE_FORMAT;

    /**
     * Extract time stamps from the experimentDateTime string. This is just a
     * QuickFix because {@link ExperimentRun}s currently do not store their
     * time properly.
     *
     * @param experimentDateTime
     * @return The {@link Date} of the {@link ExperimentRun}
     */
    private static long extractTimestamp(final String experimentDateTime) {

        // FIXME: use constant from AbstractRecorderConfigurationFactory as soon as the Recorderframework build has been fixed.
        final SimpleDateFormat dateFormat = new SimpleDateFormat(EXPERIMENT_RUN_DATE_FORMAT);
        //SimpleDateFormat dateFormat = new SimpleDateFormat(AbstractRecorderConfigurationFactory.EXPERIMENT_RUN_DATE_FORMAT);
        try {
            return dateFormat.parse(experimentDateTime).getTime();
        } catch (final ParseException e) {
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

    private double calculateThroughput(final SensorAndMeasurements sam) throws AnalysisFailedException {
        final int numberOfMeasurements = sam.getMeasurements().size();
        // we assume that the last entry is the duration.
        // still, no way to get the maximum time... because this is a collection.
        final double duration = calculateUnivariateStatistic(sam, TimeseriesData.EVENTTIME, new Max()) - calculateUnivariateStatistic(sam, TimeseriesData.EVENTTIME, new Min());

        return numberOfMeasurements / duration;
    }

    // Extracted from retrieveServiceResults in superclass
    @Override
    protected void retrieveServiceResultsFinish(final PCMInstance pcmInstance, final ResultDecoratorRepository repo,
            final HashMap<String, ExternalCallAction> idToExternalCallMap,
            final Map<String, AssemblyContextContext> idToAssemblyContextMap,
            final List<String> completionComponentIdsToIgnore)
    {
        final Collection<Sensor> sensorList = this.experiment.getSensors();
        final List<ExternalCallActionWithSensors> externalCallsInContextWithSensorsList = new LinkedList<ExternalCallActionWithSensors>();

        for (final Sensor sensor : sensorList) {
            final String sensorName = sensor.getSensorName();
            if (sensorName.contains("CallID")){
                //current sensor is an ExternalCall sensor

                // parse external call id
                if (sensorName.lastIndexOf(" ") < sensorName.length()-2
                        && sensorName.lastIndexOf(" ") > -1
                        && sensorName.length() > 2){
                    final String externalCallID = sensorName.substring(sensorName.lastIndexOf(" ")+1, sensorName.length()-1);

                    // 	find the external call in the model
                    final ExternalCallAction myCall = idToExternalCallMap.get(externalCallID);

                    if (myCall != null){

                        //retrieve AssemblyContext from sensor name
                        final String assemblyContextID = sensorName.substring(sensorName.indexOf("AssemblyCtx")+13,sensorName.indexOf("CallID")-2);
                        final AssemblyContextContext myAssemblyContext = idToAssemblyContextMap.get(assemblyContextID);
                        if (myAssemblyContext != null){

                            ExternalCallActionWithSensors externalCallInContextWithSensors = new ExternalCallActionWithSensors(myCall, myAssemblyContext);

                            //reuse pair if it already there
                            final int index = externalCallsInContextWithSensorsList.indexOf(externalCallInContextWithSensors);
                            if (index > 0){
                                externalCallInContextWithSensors = externalCallsInContextWithSensorsList.get(index);
                            } else {
                                externalCallsInContextWithSensorsList.add(externalCallInContextWithSensors);
                            }

                            // map all result sensors to the SEFF they call
                            externalCallInContextWithSensors.addSensor(sensor);
                            continue;
                        }
                    } else {
                        // check if this is a completion component, if yes, ignore it and continue
                        final String componentID = sensorName.substring(sensorName.indexOf("Component: ")+11,sensorName.indexOf("AssemblyCtx")-2);
                        if (completionComponentIdsToIgnore.contains(componentID)){
                            logger.info("Ignoring completion component sensor "+sensorName+" when reading in SimuCom results.");
                            continue;
                        }
                    }
                }
                logger.warn("Cannot retrieve external call id from sensor. If this is a completion component, this is ok. Otherwise, sensor name labels must have changed. Contact developers if this sensors is needed. Sensor: "+sensorName);
            }

        }

        //FIXME: This all does not work if composite components themselves are used several times in the system, because then, the  AssemblyContexts of the inner components will not be unique anymore.

        // get the average time for the SEFFs (careful: contains network)
        // by getting the data of the chosen sensors from this.run

        for (final ExternalCallActionWithSensors externalCallActionWithSensors : externalCallsInContextWithSensorsList) {
            final List<Sensor> mySensors = externalCallActionWithSensors.getSensors();

            if (mySensors.size() > 0){

                //	create service result
                final ServiceResult myServiceResult = RepositorydecoratorFactory.eINSTANCE.createAllocationServiceResult();

                //get SEFF for external call

                final ContextWrapper contextWrapper = new ContextWrapper(pcmInstance);
                //set the AssemblyContext hierarchy
                final List<AssemblyContext> assemblyContextHierarchy = new ArrayList<AssemblyContext>(4);
                AssemblyContextContext currentContext = externalCallActionWithSensors.getAssemblyContext();
                while (currentContext != null) {
                    assemblyContextHierarchy.add(currentContext.getAssemblyContext());
                    currentContext = currentContext.getParentAssemblyContext();
                }
                //the currentContext needs to be last in the list.
                Collections.reverse(assemblyContextHierarchy);
                contextWrapper.setAssCtxList(assemblyContextHierarchy);

                final ServiceEffectSpecification seff = contextWrapper.getNextSEFF(externalCallActionWithSensors.getExternalCall());

                myServiceResult.setServiceEffectSpecification_ServiceResult(seff);

                double weightedAndCumulatedMeanResponseTime = 0;
                int totalNumberOfMeasurements = 0;

                for (final Sensor sensor : mySensors) {
                    final SensorAndMeasurements results = run.getMeasurementsOfSensor(sensor);
                    final Collection<Measurement> measurements = results.getMeasurements();
                    totalNumberOfMeasurements += measurements.size();
                    weightedAndCumulatedMeanResponseTime += calculateUnivariateStatistic(results, TimeseriesData.TIMESPAN, new Mean()) * totalNumberOfMeasurements;

                }
                final double meanResponseTime = weightedAndCumulatedMeanResponseTime / totalNumberOfMeasurements;
                myServiceResult.setMeanResponseTime(meanResponseTime);

                repo.getServiceResult_ResultDecoratorRepository().add(myServiceResult);

            }

        }
    }

    // Extracted from retrievePassiveResourceUtil in superclass
    @Override
    protected Map<String, PassiveResourceResult> retrievePassiveResourceUtilFinish(final Map<String, PassiveResourceResult> idsToPassiveResourceResult)
    {
        final Collection<Sensor> sensorList = this.experiment.getSensors();

        for (final Sensor sensor : sensorList) {
            final String sensorName = sensor.getSensorName();
            if (sensorName.contains("Passive Resource")){
                final String passiveResourceAndAssemblyContextID = sensorName.substring(sensorName.lastIndexOf(" ")+1);
                final PassiveResourceResult passiveResourceResult = idsToPassiveResourceResult.get(passiveResourceAndAssemblyContextID);

                if (passiveResourceResult != null){

                    final SensorAndMeasurements results = run.getMeasurementsOfSensor(sensor);

                    if (sensorName.contains("Hold time")){
                        passiveResourceResult.setAverageHoldingTime(calculateUnivariateStatistic(results, TimeseriesData.TIMESPAN, new Mean()));
                    } else if (sensorName.contains("Wait time")){
                        passiveResourceResult.setAverageWaitTime(calculateUnivariateStatistic(results, TimeseriesData.TIMESPAN, new Mean()));
                    } else if (sensorName.contains("Util")){
                        // for passive resources, also consider the capacity when calculating the util
                        final int capacity = Integer.parseInt(passiveResourceResult.getPassiveResource_PassiveResourceResult().getCapacity_PassiveResource().getSpecification());
                        retrieveUtilisationFromSensor(sensor, passiveResourceResult, capacity);

                    }
                } else {
                    logger.warn("Unknown passive resource id "+passiveResourceAndAssemblyContextID+", ignoring this sensor.");
                }
            }

        }

        return idsToPassiveResourceResult;
    }

    // Moved from superclass
    /**
     *
     * @param sensor
     * @param result
     * @param capacity The capacity of the resource, will divide busyFraction by this number to
     */
    private void retrieveUtilisationFromSensor(final Sensor sensor,
            final UtilisationResult result, final int capacity) {
        final SensorAndMeasurements sam = run.getMeasurementsOfSensor(sensor);
        double busyFraction = 0;

        double totalTime = 0;
        double weightedSumOfJobs = 0;

        if (sam.getMeasurements().size() > 0){
            final StateSensorToPieAdapter dataAdapter = new StateSensorToTimeDeltaPieAdapter(
                    sam);
            final AbstractPie pie = (AbstractPie) dataAdapter.getAdaptedObject();
            final Collection<PieEntity> pieParts = pie
                    .getEntities(Integer.MAX_VALUE);
            double totalIdleTime = 0;
            // 	I need to sum up all pie parts to get the 100% comparison

            double totalWeights = 0;
            int maxNumberOfJobs = 0;

            for (final Iterator<PieEntity> iterator = pieParts.iterator(); iterator
                    .hasNext();) {
                final PieEntity pieEntity = iterator.next();
                totalTime += pieEntity.getValue();
                totalWeights += pieEntity.getValue();

                if (pieEntity.getLabel().contains("Idle")) {
                    // this returns a large number > 399
                    totalIdleTime = pieEntity.getValue();
                } else {
                    final String[] busyLabel = pieEntity.getLabel().split(" ");
                    if (busyLabel.length > 1){
                        try {
                            final String numberOfJobsString = busyLabel[1];
                            final int noOfJobs = Integer.parseInt(numberOfJobsString);
                            totalWeights += pieEntity.getValue();
                            weightedSumOfJobs += noOfJobs * pieEntity.getValue();
                            if (noOfJobs > maxNumberOfJobs){
                                maxNumberOfJobs = noOfJobs;
                            }
                        } catch (final Exception e){
                            logger.warn("Cannot read in queue lengths, labels of the pie chart may have changed.");
                        }
                    } else {
                        logger.warn("Cannot read in queue lengths, labels of the pie chart may have changed.");
                    }
                }

            }
            busyFraction = (1 - (totalIdleTime / totalTime));
            //queue length including the active job.
            result.setAverageQueueLength(weightedSumOfJobs / totalWeights);
            result.setMaxQueueLength(maxNumberOfJobs);
        }
        if (capacity == 1){
            result.setResourceUtilisation(busyFraction);
        } else if (totalTime > 0){
            /* if capacity is larger than 1 (for passive resources), calculate
			   the interval below the line of current resource usage, which is
			   for each level of usage (noOfJobs) the time that it is active (x axis)
			   times the noOfJobs. Thus, this corresponds to the weightedSumOfJobs value.
			   Then divide by totalTime * capacity which is the maximum utilisation.
			   A value of 100% then means that all free resources have been used all the time.
             */
            final double util = weightedSumOfJobs / (totalTime * capacity);
            result.setResourceUtilisation(util);
        }
    }

    private ConfidenceInterval determineConfidenceInterval(final SensorAndMeasurements sam) throws AnalysisFailedException {
        ConfidenceInterval ci = null;
        final Sensor sensor = sam.getSensor();
        if (sensor instanceof TimeSpanSensor){
            final PhiMixingBatchAlgorithm statisticChecker = new PhiMixingBatchAlgorithm();

            for (final Measurement m : sam.getMeasurements()) {
                final TimeSpanMeasurement t = (TimeSpanMeasurement)m;
                statisticChecker.offerSample(t.getTimeSpan());
            }
            if (statisticChecker.hasValidBatches()){
                ci = new SampleMeanEstimator().estimateConfidence(statisticChecker.getBatchMeans(),this.alpha);
            }
            if (ci == null) {
                ci = new ConfidenceInterval(Double.NaN, 0, Double.POSITIVE_INFINITY, this.alpha);
            }
            return ci;
        } else {
            logger.error("Sensor of usage scenario is not a time span sensor, cannot calculate statistics.");
            return null;
        }
    }

    private static Sensor getSensorForUsageScenario(final Experiment exp, final String usageScenarioName) {
        final Collection<Sensor> sensors = exp.getSensors();
        for (final Iterator<Sensor> iterator = sensors.iterator(); iterator.hasNext();) {
            final Sensor sensor = iterator.next();
            //logger.debug("Experiment has a sensor with ID "+sensor.getSensorID()+" and name "+sensor.getSensorName()+".");
            if (sensor.getSensorName().contains(usageScenarioName)){
                logger.debug("Found sensor for usage scenario "+usageScenarioName);
                return sensor;
            }
        }
        logger.error("No sensor found for usage scenario "+usageScenarioName);
        return null;
    }

    private static Sensor getSensorForResource(final Experiment exp, final Entity rc, final ResourceType res, final String sensorTypeString) {
        final Collection<Sensor> sensors = exp.getSensors();
        for (final Iterator<Sensor> iterator = sensors.iterator(); iterator.hasNext();) {
            final Sensor sensor = iterator.next();
            //logger.debug("Experiment has a sensor with ID "+sensor.getSensorID()+" and name "+sensor.getSensorName()+".");
            if (
                    (sensor.getSensorName().contains(res.getEntityName())
                            || /* special naming for linking resource */
                            sensor.getSensorName().contains("Linking Resource")
                            && res.getEntityName().contains("LAN"))
                            && sensor.getSensorName().contains(sensorTypeString)
                            && sensor.getSensorName().contains(rc.getEntityName())){
                logger.debug("Found sensor of "+sensorTypeString+" for the resource "+rc.getEntityName()+": "+res.getEntityName());
                return sensor;
            }
        }
        logger.error("No sensor of "+sensorTypeString+" found for resource "+rc.getEntityName()+": "+res.getEntityName());
        return null;
    }

    /**An
     * array is filled with data from measurements.
     *
     * Copied from
     * de.uka.ipd.sdq.sensorframework.visualisation.rvisualisation.reports.RReport.
     * TODO: Possibly make this public in RReport and use it properly or refactor it
     * to a helper class.
     *
     * XXX Keep this when using apache commons math.
     *
     * @param measurements Measurements for a sensor.
     * @param dataSelection the data element to save.
     * @return array with one data element per Measurement
     * @author Henning, Anne
     */
    private static double[] measurementsToDoubleArray(
            final SensorAndMeasurements measurements,
            final TimeseriesData dataSelection) {
        final double[] measurementsArray =
                new double[measurements.getMeasurements().size()];
        if (measurements.getMeasurements().size() == Integer.MAX_VALUE) {
            logger.error("Too many measurements. Results might be inaccurate.");
        }
        int position = 0;
        for (final Measurement time : measurements.getMeasurements()) {
            final TimeSpanMeasurement tsm = (TimeSpanMeasurement) time;
            measurementsArray[position++] =
                    (dataSelection == TimeseriesData.EVENTTIME)
                    ? tsm.getEventTime()
                            : tsm.getTimeSpan();
        }
        return measurementsArray;
    }

    @Override
    protected void getUtilisationOfResource(final ActiveResourceUtilisationResult resultToFill, final Entity container, final ResourceType resourceType) throws AnalysisFailedException {
        final Sensor utilSensor = getSensorForResource(this.experiment, container, resourceType, "State of Active Resource");
        final Sensor demandedSensor = getSensorForResource(this.experiment, container, resourceType, "Demand");

        // for later when wait os available
        //Sensor waitSensor = getSensorForResource(this.experiment, container, resource, "Wait");

        if (utilSensor != null /*&& waitSensor != null*/){

            try {

                retrieveUtilisationFromSensor(utilSensor, resultToFill,1);

                /*
				SensorAndMeasurements sam = run.getMeasurementsOfSensor(waitSensor);
				result.setAverageWaitTime(calculateValue(sam, "mean"));
                 */
                resultToFill.setAverageWaitTime(Double.NaN);

                final SensorAndMeasurements sam = run.getMeasurementsOfSensor(demandedSensor);
                resultToFill.setDemandedTime(calculateUnivariateStatistic(sam, TimeseriesData.TIMESPAN, new Mean()));

            } catch (final RuntimeException e) {
                // FIXME: The call "SensorAndMeasurements sam =
                // run.getMeasurementsOfSensor(sensor);" above sometimes results
                // in a RuntimeException, because a State could not be
                // deserialised. Better fix that porperly instead of catching
                // the error here.
                resultToFill.setResourceUtilisation(Double.NaN);
                logger.error("A runtime exception occured while accessing the sendorframework. I'll try to ignore it and continue.");
                e.printStackTrace();
            }
        } else {
            resultToFill.setResourceUtilisation(Double.NaN);
            throw new AnalysisFailedException("Could not find sensor for resource "+container.getEntityName()+": "+resourceType.getEntityName());
        }
    }
}
