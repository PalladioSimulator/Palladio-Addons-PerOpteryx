package de.uka.ipd.sdq.dsexplore.analysis.simucom;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.measure.Measure;
import javax.measure.converter.ConversionException;
import javax.measure.quantity.Quantity;
import javax.measure.unit.Unit;

import org.apache.commons.math.MathException;
import org.apache.commons.math.distribution.TDistribution;
import org.apache.commons.math.distribution.TDistributionImpl;
import org.apache.commons.math.stat.descriptive.SummaryStatistics;
import org.apache.commons.math.stat.descriptive.UnivariateStatistic;
import org.apache.commons.math.stat.descriptive.moment.Mean;
import org.apache.commons.math.stat.descriptive.moment.StandardDeviation;
import org.apache.commons.math.stat.descriptive.rank.Max;
import org.apache.commons.math.stat.descriptive.rank.Median;
import org.apache.commons.math.stat.descriptive.rank.Min;
import org.eclipse.emf.common.util.EList;
import org.opt4j.core.Criterion;
import org.palladiosimulator.edp2.dao.MeasurementsDao;
import org.palladiosimulator.edp2.impl.RepositoryManager;
import org.palladiosimulator.edp2.models.ExperimentData.DataSeries;
import org.palladiosimulator.edp2.models.ExperimentData.ExperimentGroup;
import org.palladiosimulator.edp2.models.ExperimentData.ExperimentRun;
import org.palladiosimulator.edp2.models.ExperimentData.ExperimentSetting;
import org.palladiosimulator.edp2.models.ExperimentData.Measurement;
import org.palladiosimulator.edp2.models.ExperimentData.MeasuringType;
import org.palladiosimulator.edp2.models.ExperimentData.NumericalIntervalStatistics;
import org.palladiosimulator.edp2.models.ExperimentData.NumericalNominalStatistics;
import org.palladiosimulator.edp2.models.ExperimentData.RawMeasurements;
import org.palladiosimulator.edp2.models.Repository.Repository;
import org.palladiosimulator.edp2.models.measuringpoint.MeasuringPoint;
import org.palladiosimulator.edp2.models.measuringpoint.StringMeasuringPoint;
import org.palladiosimulator.edp2.models.measuringpoint.impl.StringMeasuringPointImpl;
import org.palladiosimulator.edp2.util.MeasurementsUtility;
import org.palladiosimulator.metricspec.BaseMetricDescription;
import org.palladiosimulator.metricspec.CaptureType;
import org.palladiosimulator.metricspec.MetricDescription;
import org.palladiosimulator.metricspec.MetricSetDescription;
import org.palladiosimulator.metricspec.NumericalBaseMetricDescription;
import org.palladiosimulator.metricspec.TextualBaseMetricDescription;

import de.uka.ipd.sdq.dsexplore.analysis.AnalysisFailedException;
import de.uka.ipd.sdq.dsexplore.analysis.IStatisticAnalysisResult;
import de.uka.ipd.sdq.dsexplore.analysis.simucom.SimuComAnalysisResult.TimeseriesData;
import de.uka.ipd.sdq.dsexplore.qml.pcm.datastructures.EvaluationAspectWithContext;
import de.uka.ipd.sdq.pcm.core.entity.Entity;
import de.uka.ipd.sdq.pcm.resourcetype.ResourceType;
import de.uka.ipd.sdq.pcm.resultdecorator.ResultDecoratorRepository;
import de.uka.ipd.sdq.pcm.resultdecorator.resourceenvironmentdecorator.ActiveResourceUtilisationResult;
import de.uka.ipd.sdq.pcm.resultdecorator.resourceenvironmentdecorator.PassiveResourceResult;
import de.uka.ipd.sdq.pcm.seff.ExternalCallAction;
import de.uka.ipd.sdq.pcm.usagemodel.UsageScenario;
import de.uka.ipd.sdq.pcmsolver.models.PCMInstance;
import de.uka.ipd.sdq.statistics.PhiMixingBatchAlgorithm;
import de.uka.ipd.sdq.statistics.estimation.ConfidenceInterval;
import de.uka.ipd.sdq.statistics.estimation.SampleMeanEstimator;

public class SimuComAnalysisEDP2Result extends SimuComAnalysisResult {

	/**
	 * The experiment group represents an experiment with ONE setting and multiple runs. 
	 */
	private ExperimentGroup experimentGroup;
	
	/**
	 * The experiment run is the latest run in the experiment group above. As the experiment group only
	 * has one setting, this run is the latest run of that one setting. 
	 */
	private ExperimentRun run;
	
	// The metric descriptions and measuring types are needed to retrieve the raw data.
	private List<BaseMetricDescription> metricDescriptions;
	private List<MeasuringType> measuringTypes;
	
	/**
	 * Constructor. Creates an instance of SimuComAnalysisEDP2Result. 
	 * @param run The latest run of the experiment.
	 * @param experiment The experiment (at the moment with only one experiment setting).
	 * @param pcmInstance
	 * @param usageScenario
	 * @param objectiveToAspect
	 * @param qualityAttributeInfo
	 * @throws AnalysisFailedException
	 */
	public SimuComAnalysisEDP2Result(ExperimentRun run, ExperimentGroup experiment, PCMInstance pcmInstance, 
			UsageScenario usageScenario, Map<Criterion, EvaluationAspectWithContext> objectiveToAspect,
			SimuComQualityAttributeDeclaration qualityAttributeInfo) 
	throws AnalysisFailedException {
		super(pcmInstance);
		
		this.experimentGroup = experiment; 
		this.run = run; 
		
		this.usageScenarioName = usageScenario.getEntityName(); //.replaceAll(" ", "_");
		
		this.objectiveToAspects = objectiveToAspect;
		this.qualityAttributeInfo = qualityAttributeInfo;
		
		// The results are NOT being retrieved as the methods are not implemented yet.
		// The following two lines basically do nothing right now.
		this.results =  retrieveResults(pcmInstance);
		this.maxUtilization = calculateMaxUtil("CPU");
			
		double[] values = this.getValuesForUsageScenario(usageScenario);
		this.meanValue = calculateUnivariateStatistic(values, new Mean());
		this.stdDeviation = calculateUnivariateStatistic(values, new StandardDeviation());
		this.medianValue = calculateUnivariateStatistic(values, new Median());
		this.throughput = calculateThroughput(this.getTimePointsForUsageScenario(usageScenario));
		this.observations = values.length;
		this.confidenceInterval = determineConfidenceInterval(values);
		
		logger.debug("Initialised SimuCom result");
	}
	
    /**
     * Tries to find a matching experiment run in all data sources available in the repository manager. If a matching experiment run
     * is found, <code>true</code>. If not, <code>false</code> is returned.
     * @param experimentName The experiment name to match
     * @return <code>true</code> if experiment has been found, <code>false</code> otherwise
     */
	static public boolean isExperimentRunExisting(final String experimentName) 
	{
		// Get all available repositories
		EList<Repository> repositories = RepositoryManager.getCentralRepository().getAvailableRepositories();

		// Iterate through all repositories
		for (Repository repo : repositories)
		{
			// Iterate through all experiment groups and find the one with the requested name
			EList<ExperimentGroup> currentExperimentGroups = repo.getExperimentGroups();
			for (ExperimentGroup curr : currentExperimentGroups)
			{
				// If match found, check if there are any runs
				if (curr.getId().equals(experimentName))
				{
					// Assuming that each experiment group only has ONE setting
					// NOTE: Change to loop if data structure is altered to find the matching setting
					EList<ExperimentRun> expRuns = curr.getExperimentSettings().get(0).getExperimentRuns();
					
					// Return true if there are runs
					if (expRuns.size() > 0)
					{
						return true;
					}
				}
			}
		}
		return false;
	}

    /**
     * Tries to find a matching experiment run in the passed data source (via the passed <code>Repository</code>). If a matching experiment run
     * is found, a new {@link IStatisticAnalysisResult} is created for it. If not, <code>null</code> is returned.
     * @param usageScenario The usage scenario to determine the response time values for.
     * @param experimentName The experiment name to match
     * @param pcmInstance The PCM instance to get the available resources and retrieve utilisation values.
     * @param repo The access to the data source.
     * @param criterionToAspect
     * @param qualityAttribute
     * @return The instantiated {@link IStatisticAnalysisResult} for this experiment name, or <code>null</code> if no matching experiment run could be found.
     * @throws AnalysisFailedException
     */
	static public IStatisticAnalysisResult findExperimentRunAndCreateResult(
        final UsageScenario usageScenario, final String experimentName,
        final PCMInstance pcmInstance,
        final Repository repo,
        Map<Criterion, EvaluationAspectWithContext> criterionToAspect,
        SimuComQualityAttributeDeclaration qualityAttribute
		) throws AnalysisFailedException 
	{
		// Iterate through all experiment groups and find the one with the requested name
		EList<ExperimentGroup> currentExperimentGroups = repo.getExperimentGroups();
		for (ExperimentGroup curr : currentExperimentGroups)
		{
			if (curr.getPurpose().equals(experimentName))
			{
				// Assuming that each experiment group only has ONE setting
				// NOTE: Change to loop if data structure is altered to find the matching setting
				EList<ExperimentRun> expRuns = curr.getExperimentSettings().get(0).getExperimentRuns();
				
				// Find latest run
				Comparator<ExperimentRun> comp = new ExperimentRunComparator();
				Collections.sort(expRuns, comp);
				ExperimentRun reqRun = expRuns.get(expRuns.size() - 1);
				
				// Return new instance of SimuComAnalysisEDP2Result for the requested run
				return new SimuComAnalysisEDP2Result(reqRun, curr, pcmInstance, usageScenario, criterionToAspect, qualityAttribute);
			}
		}
		return null;
	}
	
	/**
	 * Not implemented.
	 */
	protected void retrieveServiceResultsFinish(PCMInstance pcmInstance, ResultDecoratorRepository repo, 
			HashMap<String, ExternalCallAction> idToExternalCallMap,
			Map<String, AssemblyContextContext> idToAssemblyContextMap,
			List<String> completionComponentIdsToIgnore)
	{
		throw new UnsupportedOperationException();
	}
	
	/**
	 * Not implemented
	 */
	protected Map<String, PassiveResourceResult> retrievePassiveResourceUtilFinish(Map<String, PassiveResourceResult> idsToPassiveResourceResult)
	{
		throw new UnsupportedOperationException();
	}
	
	/**
	 * Not implemented.
	 */
	protected void getUtilisationOfResource(ActiveResourceUtilisationResult resultToFill, Entity container, ResourceType resourceType) 
			throws AnalysisFailedException 
	{
		throw new UnsupportedOperationException();
	}
	
	/**
	 * Calculates the confidence interval for a given set of values.
	 * @param values Values as double array
	 * @return ConfidenceInterval object
	 */
	private ConfidenceInterval determineConfidenceInterval(double[] values) {
		List<Double> valueList = new ArrayList<Double>();
		for (int i = 0; i < values.length; ++i)
		{
			valueList.add(values[i]);
		}
		return new SampleMeanEstimator().estimateConfidence(valueList, this.alpha);
	}
	
	/**
	 * Calculates the throughput for a given value array.
	 * @param values The measuring time points in an array.
	 * @return Returns the throughput
	 */
	private double calculateThroughput(double[] values) 
	{
		int numberOfMeasurements = values.length;
		double duration = calculateUnivariateStatistic(values, new Max()) - calculateUnivariateStatistic(values, new Min());
		return numberOfMeasurements / duration;
	}
	
	/**
	 * Retrieves the values for a given usage scenario.
	 * 
	 * Note: See constraints for methods used.
	 * @param usageScenario The usage scenario to look for.
	 * @return Returns the values as a double array or <code>null</code> if no matching measurement is found.
	 */
	private double[] getValuesForUsageScenario(UsageScenario usageScenario)
	{
		return this.getValuesFromMeasurement(this.getUsageScenarioMeasurements(usageScenario));
	}
	
	/**
	 * Retrieves the measuring time points for a given usage scenario.
	 * 
	 * Note: See constraints for methods used.
	 * @param usageScenario The usage scenario to look for.
	 * @return Returns the time points as a double array or <code>null</code> if no matching measurement is found.
	 */
	private double[] getTimePointsForUsageScenario(UsageScenario usageScenario)
	{
		return this.getTimePointsFromMeasurement(this.getUsageScenarioMeasurements(usageScenario));
	}
	
	/**
	 * Retrieves the actual values from a measurement. 
	 * 
	 * Assumption: Each measurement has two data series with the first being the time points of the measurements
	 * and the second data series being the actual measured values. Needs to be changed if storage structure is changed.
	 * 
	 * Also: Each measurement only has ONE measurement range. Loop needs to be inserted if changed.
	 * 
	 * @param measurement The measurement to retrieve the values for.
	 * @return Array with the values, <code>null</code> if fails
	 */
	private double[] getValuesFromMeasurement(Measurement measurement)
	{
		if (measurement == null)
		{
			return null;
		}
		
		DataSeries dataSeries = measurement.getMeasurementRanges().get(0).getRawMeasurements().getDataSeries().get(1);
		return this.getValuesFromDataSeries(dataSeries);
	}
	
	/**
	 * Retrieves the measuring time points from a measurement. 
	 * 
	 * Assumption: Each measurement has two data series with the first being the time points of the measurements
	 * and the second data series being the actual measured values. Needs to be changed if storage structure is changed.
	 * 
	 * Also: Each measurement only has ONE measurement range. Loop needs to be inserted if changed.
	 * 
	 * @param measurement The measurement to retrieve the time points for.
	 * @return Array with the time points as double, <code>null</code> if fails
	 */
	private double[] getTimePointsFromMeasurement(Measurement measurement)
	{
		if (measurement == null)
		{
			return null;
		}
		
		DataSeries dataSeries = measurement.getMeasurementRanges().get(0).getRawMeasurements().getDataSeries().get(0);
		return this.getValuesFromDataSeries(dataSeries);
	}
	
	/**
	 * Returns all values of a data series.
	 * @param dataSeries The data series to retrieve the values for.
	 * @return Returns the values as a double array or <code>null</code> if no valid data series is given.
	 */
	@SuppressWarnings("unchecked")
	private double[] getValuesFromDataSeries(DataSeries dataSeries)
	{
		if (dataSeries == null)
		{
			return null;
		}
		
		MeasurementsDao<Double, Quantity> meaDao 
			= (MeasurementsDao<Double, Quantity>) MeasurementsUtility.getMeasurementsDao(dataSeries);
		List<javax.measure.Measure<Double, Quantity>> values = meaDao.getMeasurements();
		
		// Create array for result
		double[] result = new double[values.size()];
		
		for (int i = 0; i < values.size(); ++i)
		{
			result[i] = values.get(i).getValue();
		}
		
		return result;
	}
	
	/**
	 * Finds the measurement representing the usage scenario.
	 * @param usageScenario
	 * @return measurement or <code>null</code> if no matching measurement found
	 */
	private Measurement getUsageScenarioMeasurements(UsageScenario usageScenario) 
	{
		EList<Measurement> measurements = run.getMeasurement();
		for (Measurement m : measurements)
		{
			MeasuringPoint measuringPoint = m.getMeasuringType().getMeasuringPoint();
			if (measuringPoint instanceof StringMeasuringPoint)
			{
				if (isRequestedMeasurement(usageScenario.getEntityName(), ((StringMeasuringPoint) measuringPoint).getMeasuringPoint()))
				{
					return m;
				}
			}
		}
		return null;
	}
	
	/** 
	 * Returns whether the measuring point contains the usage scenario name.
	 * @param usageScenarioName The name of the usage scenario.
	 * @param measuringPoint The measuring point name.
	 * @return <code>true</code> if the measuringPoint contains the usageScenarioName, false otherwise
	 */
	private boolean isRequestedMeasurement(String usageScenarioName, String measuringPoint)
	{
		if (usageScenarioName != null && measuringPoint != null)
		{
			return measuringPoint.contains(usageScenarioName);
		}
		
		return false;
	}
	
	/**
	 * Calculates statistical values.
	 * @param values All values.
	 * @param stat The statistical size to calculate.
	 * @return The result as double.
	 */
	private double calculateUnivariateStatistic(double[] values, UnivariateStatistic stat) {
		return stat.evaluate(values);
	}
	
}

/**
 * Comparator for ExperimentRuns to sort them ordered by start date in ascending order.
 * @author Shengjia Feng
 */
class ExperimentRunComparator implements Comparator<ExperimentRun>
{
	/**
	 * Sorts experiment runs by their start date in ascending order.
	 */
	public int compare(ExperimentRun first, ExperimentRun second)
	{
		return first.getStartTime().compareTo(second.getStartTime());
	}
}
