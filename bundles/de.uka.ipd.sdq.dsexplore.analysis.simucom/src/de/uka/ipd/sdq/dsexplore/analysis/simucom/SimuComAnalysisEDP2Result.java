package de.uka.ipd.sdq.dsexplore.analysis.simucom;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import jakarta.measure.quantity.Quantity;

import org.apache.commons.math.stat.descriptive.UnivariateStatistic;
import org.apache.commons.math.stat.descriptive.moment.Mean;
import org.apache.commons.math.stat.descriptive.moment.StandardDeviation;
import org.apache.commons.math.stat.descriptive.rank.Max;
import org.apache.commons.math.stat.descriptive.rank.Median;
import org.apache.commons.math.stat.descriptive.rank.Min;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.debug.core.ILaunchConfiguration;
import org.eclipse.emf.common.util.ECollections;
import org.eclipse.emf.common.util.EList;
import org.opt4j.core.Criterion;
import org.palladiosimulator.analyzer.resultdecorator.ResultDecoratorRepository;
import org.palladiosimulator.analyzer.resultdecorator.resourceenvironmentdecorator.ActiveResourceUtilisationResult;
import org.palladiosimulator.analyzer.resultdecorator.resourceenvironmentdecorator.PassiveResourceResult;
import org.palladiosimulator.edp2.dao.MeasurementsDao;
import org.palladiosimulator.edp2.impl.RepositoryManager;
import org.palladiosimulator.edp2.models.ExperimentData.DataSeries;
import org.palladiosimulator.edp2.models.ExperimentData.ExperimentGroup;
import org.palladiosimulator.edp2.models.ExperimentData.ExperimentRun;
import org.palladiosimulator.edp2.models.ExperimentData.ExperimentSetting;
import org.palladiosimulator.edp2.models.ExperimentData.Measurement;
import org.palladiosimulator.edp2.models.ExperimentData.MeasuringType;
import org.palladiosimulator.edp2.models.Repository.Repository;
import org.palladiosimulator.edp2.models.measuringpoint.MeasuringPoint;
import org.palladiosimulator.edp2.models.measuringpoint.StringMeasuringPoint;
import org.palladiosimulator.edp2.util.MeasurementsUtility;
import org.palladiosimulator.metricspec.BaseMetricDescription;
import org.palladiosimulator.pcm.core.entity.Entity;
import org.palladiosimulator.pcm.resourcetype.ResourceType;
import org.palladiosimulator.pcm.seff.ExternalCallAction;
import org.palladiosimulator.solver.models.PCMInstance;

import de.uka.ipd.sdq.dsexplore.analysis.AnalysisFailedException;
import de.uka.ipd.sdq.dsexplore.analysis.IStatisticAnalysisResult;
import de.uka.ipd.sdq.dsexplore.qml.pcm.datastructures.EvaluationAspectWithContext;
import de.uka.ipd.sdq.statistics.estimation.ConfidenceInterval;
import de.uka.ipd.sdq.statistics.estimation.SampleMeanEstimator;

public class SimuComAnalysisEDP2Result extends SimuComAnalysisResult {

	/**
	 * The experiment setting represents an experiment with ONE setting and multiple
	 * runs.
	 */
	private final ExperimentSetting experimentSetting;

	/**
	 * The experiment run is the latest run in the experiment group above. As the
	 * experiment group only has one setting, this run is the latest run of that one
	 * setting.
	 */
	private final ExperimentRun run;

	// The metric descriptions and measuring types are needed to retrieve the raw
	// data.
	private List<BaseMetricDescription> metricDescriptions;
	private List<MeasuringType> measuringTypes;

	/**
	 * Constructor. Creates an instance of SimuComAnalysisEDP2Result.
	 * 
	 * @param run                  The latest run of the experiment.
	 * @param experiment           The experiment (at the moment with only one
	 *                             experiment setting).
	 * @param pcmInstance
	 * @param pcmEntity
	 * @param objectiveToAspect
	 * @param qualityAttributeInfo
	 * @throws AnalysisFailedException
	 */
	public SimuComAnalysisEDP2Result(final ExperimentRun run, final ExperimentSetting experiment,
			final PCMInstance pcmInstance, final Entity pcmEntity,
			final Map<Criterion, EvaluationAspectWithContext> objectiveToAspect,
			final SimuComQualityAttributeDeclaration qualityAttributeInfo) throws AnalysisFailedException {
		super(pcmInstance);

		this.experimentSetting = experiment;
		this.run = run;

		this.pcmEntityIdentifier = pcmEntity.getEntityName();

		this.objectiveToAspects = objectiveToAspect;
		this.qualityAttributeInfo = qualityAttributeInfo;

		// The results are NOT being retrieved as the methods are not implemented yet.
		// The following two lines basically do nothing right now.
		this.results = retrieveResults(pcmInstance);
		this.maxUtilization = calculateMaxUtil("CPU");

		final double[] values = this.getValuesForPcmEntity();
		this.meanValue = calculateUnivariateStatistic(values, new Mean());
		this.stdDeviation = calculateUnivariateStatistic(values, new StandardDeviation());
		this.medianValue = calculateUnivariateStatistic(values, new Median());
		this.throughput = calculateThroughput(this.getTimePointsForPcmEntity());
		this.observations = values.length;
		this.confidenceInterval = determineConfidenceInterval(values);

		logger.debug("Initialised SimuCom EDP2 result");
	}

	/**
	 * Tries to find a matching experiment setting in all data sources available in
	 * the repository manager. If a matching experiment setting that contains at
	 * least one run is found, <code>true</code>. If not, <code>false</code> is
	 * returned.
	 * 
	 * @param experimentSettingName The experiment name to match
	 * @return <code>true</code> if experiment has been found, <code>false</code>
	 *         otherwise
	 */
	static public boolean isExperimentRunExisting(final String experimentName, final String experimentSettingName,
			Repository repo) {
		return (findExperimentRun(experimentName, experimentSettingName, repo) != null);
	}

	/**
	 * Tries to find a matching experiment setting in all data sources available in
	 * the repository manager. If a matching experiment setting that contains at
	 * least one run is found, it is returned. If not, <code>null</code> is
	 * returned.
	 * 
	 * @param experimentSettingName The experiment name to match
	 * @param repo
	 * @return The experiment setting if it has been found, <code>null</code>
	 *         otherwise
	 */
	static private ExperimentSetting findExperimentRun(final String experimentName, final String experimentSettingName,
			Repository repo) {

		// Iterate through all experiment groups and find the one with the requested
		// name
		final EList<ExperimentGroup> currentExperimentGroups = repo.getExperimentGroups();

		for (final ExperimentGroup curr : currentExperimentGroups) {
			if (experimentName.equals(curr.getPurpose())) {

				final EList<ExperimentSetting> settings = curr.getExperimentSettings();

				for (ExperimentSetting experimentSetting : settings) {

					if (experimentSettingName.equals(experimentSetting.getDescription())) {
						// Assuming that each experiment group only has ONE setting
						// NOTE: Change to loop if data structure is altered to find the matching
						// setting
						final EList<ExperimentRun> expRuns = experimentSetting.getExperimentRuns();

						// Return true if there are runs
						if (expRuns.size() > 0) {
							for (ExperimentRun experimentRun : expRuns) {
								if (experimentRun.getMeasurement().size() > 0) {
									return experimentSetting;
								}
							}

						}
					}
				}
			}
		}

		return null;
	}

	protected static Repository findSelectedEDP2Repository(final ILaunchConfiguration config) throws CoreException {
		final String selectedDataSourceID = config.getAttribute("EDP2RepositoryID", "");

		// Get the repository with the given name frRepositoryository manager.
		EList<Repository> repos = RepositoryManager.getCentralRepository().getAvailableRepositories();

		for (int i = 0; i < repos.size(); ++i) {
			String s = repos.get(i).getId();
			if (s.equals(selectedDataSourceID)) {
				return repos.get(i);

			}
		}
		return null;
	}

	/**
	 * Tries to find a matching experiment run in the passed data source (via the
	 * passed <code>Repository</code>). If a matching experiment run is found, a new
	 * {@link IStatisticAnalysisResult} is created for it. If not, <code>null</code>
	 * is returned.
	 * 
	 * @param pcmEntity         The usage scenario to determine the response time
	 *                          values for.
	 * @param experimentName    The experiment name to match
	 * @param pcmInstance       The PCM instance to get the available resources and
	 *                          retrieve utilisation values.
	 * @param repo              The access to the data source.
	 * @param criterionToAspect
	 * @param qualityAttribute
	 * @return The instantiated {@link IStatisticAnalysisResult} for this experiment
	 *         name, or <code>null</code> if no matching experiment run could be
	 *         found.
	 * @throws AnalysisFailedException
	 */
	static public IStatisticAnalysisResult findExperimentRunAndCreateResult(final Entity pcmEntity,
			final String experimentName, final String experimentSettingName, final PCMInstance pcmInstance,
			final Repository repo, final Map<Criterion, EvaluationAspectWithContext> criterionToAspect,
			final SimuComQualityAttributeDeclaration qualityAttribute) throws AnalysisFailedException {

		ExperimentSetting mySetting = findExperimentRun(experimentName, experimentSettingName, repo);

		if (mySetting != null) {

			final EList<ExperimentRun> expRuns = mySetting.getExperimentRuns();

			// Find latest run
			final Comparator<ExperimentRun> comp = new ExperimentRunComparator();

			/* sort so that the newest it at the beginning */
			ECollections.sort(expRuns, comp);

			ExperimentRun reqRun = null;
			for (ExperimentRun experimentRun : expRuns) {
				if (experimentRun.getMeasurement().size() > 0) {
					reqRun = experimentRun;
					break;
				}
			}

			// Return new instance of SimuComAnalysisEDP2Result for the requested run
			return new SimuComAnalysisEDP2Result(reqRun, mySetting, pcmInstance, pcmEntity, criterionToAspect,
					qualityAttribute);
		}

		return null;
	}

	/**
	 * Not implemented.
	 */
	@Override
	protected void retrieveServiceResultsFinish(final PCMInstance pcmInstance, final ResultDecoratorRepository repo,
			final HashMap<String, ExternalCallAction> idToExternalCallMap,
			final Map<String, AssemblyContextContext> idToAssemblyContextMap,
			final List<String> completionComponentIdsToIgnore) {
		logger.warn("SimuComAnalysisEDP2Result.retrieveServiceResultsFinish not yet implemented for EDP2");
	}

	/**
	 * Not implemented
	 */
	@Override
	protected Map<String, PassiveResourceResult> retrievePassiveResourceUtilFinish(
			final Map<String, PassiveResourceResult> idsToPassiveResourceResult) {
		logger.warn("SimuComAnalysisEDP2Result.retrievePassiveResourceUtilFinish not yet implemented for EDP2");
		return Collections.emptyMap();
	}

	/**
	 * Not implemented.
	 */
	@Override
	protected void getUtilisationOfResource(final ActiveResourceUtilisationResult resultToFill, final Entity container,
			final ResourceType resourceType) throws AnalysisFailedException {

		logger.warn("SimuComAnalysisEDP2Result.getUtilisationOfResource not yet implemented for EDP2");
	}

	/**
	 * Calculates the confidence interval for a given set of values.
	 * 
	 * @param values Values as double array
	 * @return ConfidenceInterval object
	 */
	private ConfidenceInterval determineConfidenceInterval(final double[] values) {
		final List<Double> valueList = new ArrayList<Double>();
		for (int i = 0; i < values.length; ++i) {
			valueList.add(values[i]);
		}
		return new SampleMeanEstimator().estimateConfidence(valueList, this.alpha);
	}

	/**
	 * Calculates the throughput for a given value array.
	 * 
	 * @param values The measuring time points in an array.
	 * @return Returns the throughput
	 */
	private double calculateThroughput(final double[] values) {
		final int numberOfMeasurements = values.length;
		final double duration = calculateUnivariateStatistic(values, new Max())
				- calculateUnivariateStatistic(values, new Min());
		return numberOfMeasurements / duration;
	}

	/**
	 * Retrieves the values for a given PCM entity identified by
	 * pcmEntityIdentifier.
	 *
	 * Note: See constraints for methods used.
	 * 
	 * @param pcmEntityIdentifier The entity to look for.
	 * @return Returns the values as a double array or <code>null</code> if no
	 *         matching measurement is found.
	 */
	private double[] getValuesForPcmEntity() {
		return this.getValuesFromMeasurement(this.getPcmEntityMeasurements());
	}

	/**
	 * Retrieves the measuring time points for a given PCM entity identified by
	 * pcmEntityIdentifier.
	 *
	 * Note: See constraints for methods used.
	 * 
	 * @param pcmEntity The entity to look for.
	 * @return Returns the time points as a double array or <code>null</code> if no
	 *         matching measurement is found.
	 */
	private double[] getTimePointsForPcmEntity() {
		return this.getTimePointsFromMeasurement(this.getPcmEntityMeasurements());
	}

	/**
	 * Retrieves the actual values from a measurement.
	 *
	 * Assumption: Each measurement has two data series with the first being the
	 * time points of the measurements and the second data series being the actual
	 * measured values. Needs to be changed if storage structure is changed.
	 *
	 * Also: Each measurement only has ONE measurement range. Loop needs to be
	 * inserted if changed.
	 *
	 * @param measurement The measurement to retrieve the values for.
	 * @return Array with the values, <code>null</code> if fails
	 */
	private double[] getValuesFromMeasurement(final Measurement measurement) {
		if (measurement == null) {
			return null;
		}

		final DataSeries dataSeries = measurement.getMeasurementRanges().get(0).getRawMeasurements().getDataSeries()
				.get(1);
		return this.getValuesFromDataSeries(dataSeries);
	}

	/**
	 * Retrieves the measuring time points from a measurement.
	 *
	 * Assumption: Each measurement has two data series with the first being the
	 * time points of the measurements and the second data series being the actual
	 * measured values. Needs to be changed if storage structure is changed.
	 *
	 * Also: Each measurement only has ONE measurement range. Loop needs to be
	 * inserted if changed.
	 *
	 * @param measurement The measurement to retrieve the time points for.
	 * @return Array with the time points as double, <code>null</code> if fails
	 */
	private double[] getTimePointsFromMeasurement(final Measurement measurement) {
		if (measurement == null) {
			return null;
		}

		final DataSeries dataSeries = measurement.getMeasurementRanges().get(0).getRawMeasurements().getDataSeries()
				.get(0);
		return this.getValuesFromDataSeries(dataSeries);
	}

	/**
	 * Returns all values of a data series.
	 * 
	 * @param dataSeries The data series to retrieve the values for.
	 * @return Returns the values as a double array or <code>null</code> if no valid
	 *         data series is given.
	 */
	@SuppressWarnings("unchecked")
	private double[] getValuesFromDataSeries(final DataSeries dataSeries) {
		if (dataSeries == null) {
			return null;
		}

		final MeasurementsDao<Double, Quantity> meaDao = (MeasurementsDao<Double, Quantity>) MeasurementsUtility
				.getMeasurementsDao(dataSeries);
		final List<jakarta.measure.Measure<Double, Quantity>> values = meaDao.getMeasurements();

		// Create array for result
		final double[] result = new double[values.size()];

		for (int i = 0; i < values.size(); ++i) {
			result[i] = values.get(i).getValue();
		}

		return result;
	}

	/**
	 * Finds the measurement representing the usage scenario.
	 * 
	 * @return measurement or <code>null</code> if no matching measurement found
	 */
	private Measurement getPcmEntityMeasurements() {
		for (final Measurement m : run.getMeasurement()) {
			final MeasuringPoint measuringPoint = m.getMeasuringType().getMeasuringPoint();
			if (measuringPoint instanceof StringMeasuringPoint) {
				if (isRequestedMeasurement(pcmEntityIdentifier,
						((StringMeasuringPoint) measuringPoint).getMeasuringPoint())) {
					return m;
				}
			}
		}
		return null;
	}

	/**
	 * Returns whether the measuring point contains the usage scenario name.
	 * 
	 * @param usageScenarioName The name of the usage scenario.
	 * @param measuringPoint    The measuring point name.
	 * @return <code>true</code> if the measuringPoint contains the
	 *         usageScenarioName, false otherwise
	 */
	private boolean isRequestedMeasurement(final String usageScenarioName, final String measuringPoint) {
		if (usageScenarioName != null && measuringPoint != null) {
			return measuringPoint.contains(usageScenarioName);
		}

		return false;
	}

	/**
	 * Calculates statistical values.
	 * 
	 * @param values All values.
	 * @param stat   The statistical size to calculate.
	 * @return The result as double.
	 */
	private double calculateUnivariateStatistic(final double[] values, final UnivariateStatistic stat) {
		return stat.evaluate(values);
	}

}

/**
 * Comparator for ExperimentRuns to sort them ordered by start date in
 * descending order (newest first).
 * 
 * @author Shengjia Feng
 */
class ExperimentRunComparator implements Comparator<ExperimentRun> {
	/**
	 * Sorts experiment runs by their start date in ascending order.
	 */
	@Override
	public int compare(final ExperimentRun first, final ExperimentRun second) {
		return second.getStartTime().compareTo(first.getStartTime());
	}
}
