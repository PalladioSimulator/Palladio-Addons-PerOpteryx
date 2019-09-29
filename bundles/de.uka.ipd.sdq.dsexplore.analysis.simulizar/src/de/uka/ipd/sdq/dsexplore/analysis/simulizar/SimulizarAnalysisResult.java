package de.uka.ipd.sdq.dsexplore.analysis.simulizar;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;

import javax.measure.quantity.Quantity;

import org.apache.commons.math.stat.descriptive.UnivariateStatistic;
import org.apache.commons.math.stat.descriptive.moment.Mean;
import org.apache.commons.math.stat.descriptive.moment.StandardDeviation;
import org.apache.commons.math.stat.descriptive.rank.Max;
import org.apache.commons.math.stat.descriptive.rank.Median;
import org.apache.commons.math.stat.descriptive.rank.Min;
import org.apache.log4j.Logger;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.debug.core.ILaunchConfiguration;
import org.eclipse.emf.common.util.ECollections;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.opt4j.core.Criterion;
import org.palladiosimulator.analyzer.resultdecorator.ResultDecoratorRepository;
import org.palladiosimulator.analyzer.resultdecorator.ResultdecoratorFactory;
import org.palladiosimulator.analyzer.resultdecorator.resourceenvironmentdecorator.UtilisationResult;
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
import org.palladiosimulator.solver.models.PCMInstance;

import de.uka.ipd.sdq.dsexplore.analysis.AbstractPerformanceAnalysisResult;
import de.uka.ipd.sdq.dsexplore.analysis.AnalysisFailedException;
import de.uka.ipd.sdq.dsexplore.analysis.IPerformanceAnalysisResult;
import de.uka.ipd.sdq.dsexplore.analysis.IStatisticAnalysisResult;
import de.uka.ipd.sdq.dsexplore.qml.contracttype.QMLContractType.Dimension;
import de.uka.ipd.sdq.dsexplore.qml.pcm.datastructures.EvaluationAspectWithContext;
import de.uka.ipd.sdq.statistics.estimation.ConfidenceInterval;
import de.uka.ipd.sdq.statistics.estimation.SampleMeanEstimator;

public class SimulizarAnalysisResult extends AbstractPerformanceAnalysisResult implements IStatisticAnalysisResult, IPerformanceAnalysisResult {
	private double meanValue;
	private double medianValue;
	private double throughput;
	private double maxUtilization;
	private double stdDeviation;
	private ConfidenceInterval confidenceInterval;
	private double alpha = 0.95;

	protected long observations = 0;
	private final Map<Criterion, EvaluationAspectWithContext> objectiveToAspects;
	private final SimulizarQualityAttributeDeclaration qualityAttributeInfo;
	private final ExperimentSetting experimentSetting;
	private final ExperimentRun run;

	// The metric descriptions and measuring types are needed to retrieve the
	// raw data.
	private List<BaseMetricDescription> metricDescriptions;
	private List<MeasuringType> measuringTypes;
	private String pcmEntityIdentifier;

	protected static Logger logger = Logger.getLogger("de.uka.ipd.sdq.dsexplore");

	protected SimulizarAnalysisResult(final ExperimentRun run, final ExperimentSetting experiment, final PCMInstance pcmInstance, final Entity pcmEntity,
			final Map<Criterion, EvaluationAspectWithContext> objectiveToAspect, final SimulizarQualityAttributeDeclaration qualityAttributeInfo) throws AnalysisFailedException {
		super(pcmInstance);

		this.experimentSetting = experiment;
		this.run = run;

		this.objectiveToAspects = objectiveToAspect;
		this.qualityAttributeInfo = qualityAttributeInfo;

		// The results are NOT being retrieved as the methods are not
		// implemented yet.
		// The following two lines basically do nothing right now.
		this.results = this.retrieveResults(pcmInstance);
		this.maxUtilization = this.calculateMaxUtil("CPU");

		final double[] values = this.getValuesForPcmEntity();
		this.meanValue = this.calculateUnivariateStatistic(values, new Mean());
		this.stdDeviation = this.calculateUnivariateStatistic(values, new StandardDeviation());
		this.medianValue = this.calculateUnivariateStatistic(values, new Median());
		this.throughput = this.calculateThroughput(this.getTimePointsForPcmEntity());
		this.observations = values.length;
		this.confidenceInterval = this.determineConfidenceInterval(values);

		SimulizarAnalysisResult.logger.debug("Initialised Simulizar EDP2 result");
	}

	// From SimuComAnalysisEDP2Result

	protected ResultDecoratorRepository retrieveResults(final PCMInstance pcmInstance) throws AnalysisFailedException {

		final ResultDecoratorRepository repo = ResultdecoratorFactory.eINSTANCE.createResultDecoratorRepository();
		// FIXME : Not implemented for EDP2 yet -> commented for testing
		// The following three functions can be commented in as soon as they are
		// implemented in
		// SimuComAnalysisEDP2Result.

		// TODO DTHF1
		// retrieveResourceUtilisation(pcmInstance, repo);
		// retrieveServiceResults(pcmInstance, repo);
		// retrievePassiveResourceUtil(repo, pcmInstance);

		return repo;
	}

	protected double calculateMaxUtil(final String resourceType) {
		double maxUtil = 0.0;
		for (final UtilisationResult utilResult : this.results.getUtilisationResults_ResultDecoratorRepository()) {
			if (utilResult.getEntityName().contains(resourceType) && maxUtil < utilResult.getResourceUtilisation()) {
				maxUtil = utilResult.getResourceUtilisation();
			}
		}
		return maxUtil;
	}

	/**
	 * Calculates the confidence interval for a given set of values.
	 *
	 * @param values
	 *            Values as double array
	 * @return ConfidenceInterval object
	 */
	private ConfidenceInterval determineConfidenceInterval(final double[] values) {
		final List<Double> valueList = new ArrayList<>();
		for (int i = 0; i < values.length; ++i) {
			valueList.add(values[i]);
		}
		return new SampleMeanEstimator().estimateConfidence(valueList, this.alpha);
	}

	/**
	 * Calculates the throughput for a given value array.
	 *
	 * @param values
	 *            The measuring time points in an array.
	 * @return Returns the throughput
	 */
	private double calculateThroughput(final double[] values) {
		final int numberOfMeasurements = values.length;
		final double duration = this.calculateUnivariateStatistic(values, new Max()) - this.calculateUnivariateStatistic(values, new Min());
		return numberOfMeasurements / duration;
	}

	/**
	 * Retrieves the values for a given PCM entity identified by
	 * pcmEntityIdentifier.
	 *
	 * Note: See constraints for methods used.
	 *
	 * @param pcmEntityIdentifier
	 *            The entity to look for.
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
	 * @param pcmEntity
	 *            The entity to look for.
	 * @return Returns the time points as a double array or <code>null</code> if
	 *         no matching measurement is found.
	 */
	private double[] getTimePointsForPcmEntity() {
		return this.getTimePointsFromMeasurement(this.getPcmEntityMeasurements());
	}

	/**
	 * Retrieves the actual values from a measurement.
	 *
	 * Assumption: Each measurement has two data series with the first being the
	 * time points of the measurements and the second data series being the
	 * actual measured values. Needs to be changed if storage structure is
	 * changed.
	 *
	 * Also: Each measurement only has ONE measurement range. Loop needs to be
	 * inserted if changed.
	 *
	 * @param measurement
	 *            The measurement to retrieve the values for.
	 * @return Array with the values, <code>null</code> if fails
	 */
	private double[] getValuesFromMeasurement(final Measurement measurement) {
		if (measurement == null) {
			return null;
		}

		final DataSeries dataSeries = measurement.getMeasurementRanges().get(0).getRawMeasurements().getDataSeries().get(1);
		return this.getValuesFromDataSeries(dataSeries);
	}

	/**
	 * Retrieves the measuring time points from a measurement.
	 *
	 * Assumption: Each measurement has two data series with the first being the
	 * time points of the measurements and the second data series being the
	 * actual measured values. Needs to be changed if storage structure is
	 * changed.
	 *
	 * Also: Each measurement only has ONE measurement range. Loop needs to be
	 * inserted if changed.
	 *
	 * @param measurement
	 *            The measurement to retrieve the time points for.
	 * @return Array with the time points as double, <code>null</code> if fails
	 */
	private double[] getTimePointsFromMeasurement(final Measurement measurement) {
		if (measurement == null) {
			return null;
		}

		final DataSeries dataSeries = measurement.getMeasurementRanges().get(0).getRawMeasurements().getDataSeries().get(0);
		return this.getValuesFromDataSeries(dataSeries);
	}

	/**
	 * Returns all values of a data series.
	 *
	 * @param dataSeries
	 *            The data series to retrieve the values for.
	 * @return Returns the values as a double array or <code>null</code> if no
	 *         valid data series is given.
	 */
	@SuppressWarnings("unchecked")
	private double[] getValuesFromDataSeries(final DataSeries dataSeries) {
		if (dataSeries == null) {
			return null;
		}

		final MeasurementsDao<Double, Quantity> meaDao = (MeasurementsDao<Double, Quantity>) MeasurementsUtility.getMeasurementsDao(dataSeries);
		final List<javax.measure.Measure<Double, Quantity>> values = meaDao.getMeasurements();

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
		for (final Measurement m : this.run.getMeasurement()) {
			final MeasuringPoint measuringPoint = m.getMeasuringType().getMeasuringPoint();
			if (measuringPoint instanceof StringMeasuringPoint) {
				// TODO DTHF1 PCM Entity Identifier is always NULL
				if (this.isRequestedMeasurement(this.pcmEntityIdentifier, ((StringMeasuringPoint) measuringPoint).getMeasuringPoint())) {
					return m;
				}
			}
		}
		return null;
	}

	/**
	 * Returns whether the measuring point contains the usage scenario name.
	 *
	 * @param usageScenarioName
	 *            The name of the usage scenario.
	 * @param measuringPoint
	 *            The measuring point name.
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
	 * @param values
	 *            All values.
	 * @param stat
	 *            The statistical size to calculate.
	 * @return The result as double.
	 */
	private double calculateUnivariateStatistic(final double[] values, final UnivariateStatistic stat) {
		return stat.evaluate(values);
	}

	@Override
	public double getValueFor(Criterion criterion) {
		if (EcoreUtil.equals(this.getDimensionForCriterion(criterion), this.qualityAttributeInfo.getResponseTime())) {
			return this.meanValue;
		} else if (EcoreUtil.equals(this.getDimensionForCriterion(criterion), this.qualityAttributeInfo.getThroughput())) {
			return this.throughput;
		} else if (EcoreUtil.equals(this.getDimensionForCriterion(criterion), this.qualityAttributeInfo.getMaxUtilization())) {
			return this.maxUtilization;
		}

		SimulizarAnalysisResult.logger.warn("Unknown aspect for simu com result, adding NaN.");
		return Double.NaN;
	}

	private Dimension getDimensionForCriterion(final Criterion criterion) {
		final EvaluationAspectWithContext aspect = this.objectiveToAspects.get(criterion);
		if (aspect != null) {
			return aspect.getDimension();
		} else {
			return null;
		}
	}

	@Override
	public double getMeanValue() {
		return this.meanValue;
	}

	@Override
	public double getStandardDeviation() {
		return this.stdDeviation;
	}

	public double getVariance() throws AnalysisFailedException {
		final double std = this.getStandardDeviation();
		return std * std;
	}

	@Override
	public double getCoefficientOfVariance() {
		final double std = this.getStandardDeviation();
		final double mean = this.getMeanValue();
		return std / mean;
	}

	/**
	 * Retrieves the confidence interval for the Criterion.
	 */
	@Override
	public ConfidenceInterval getConfidenceInterval(Criterion criterion) {
		// Only the criterion that represents the mean value of this result has
		// a confidence interval
		if (EcoreUtil.equals(this.getDimensionForCriterion(criterion), this.qualityAttributeInfo.getResponseTime())) {
			return this.confidenceInterval;
		} else {
			return null;
		}
	}

	@Override
	public double getMedianValue() {
		return this.medianValue;
	}

	@Override
	public long getNumberOfObservations() {
		return this.observations;
	}

	/**
	 * Tries to find a matching experiment setting in all data sources available
	 * in the repository manager. If a matching experiment setting that contains
	 * at least one run is found, <code>true</code>. If not, <code>false</code>
	 * is returned.
	 *
	 * @param experimentSettingName
	 *            The experiment name to match
	 * @return <code>true</code> if experiment has been found,
	 *         <code>false</code> otherwise
	 */
	public static boolean isExperimentRunExisting(final String experimentName, final String experimentSettingName, Repository repo) {
		return (SimulizarAnalysisResult.findExperimentRun(experimentName, experimentSettingName, repo) != null);
	}

	public static IStatisticAnalysisResult findExperimentRunAndCreateResult(Entity entity, String experimentName, String experimentSettingName, PCMInstance pcmInstance, Repository repo,
			Map<Criterion, EvaluationAspectWithContext> criterionToAspect, SimulizarQualityAttributeDeclaration qualityAttribute) throws AnalysisFailedException {
		ExperimentSetting mySetting = SimulizarAnalysisResult.findExperimentRun(experimentName, experimentSettingName, repo);

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

			// Return new instance of SimuComAnalysisEDP2Result for the
			// requested run
			return new SimulizarAnalysisResult(reqRun, mySetting, pcmInstance, entity, criterionToAspect, qualityAttribute);
		}

		return null;
	}

	/**
	 * Comparator for ExperimentRuns to sort them ordered by start date in
	 * descending order (newest first).
	 *
	 * @author Shengjia Feng
	 */
	private static class ExperimentRunComparator implements Comparator<ExperimentRun> {
		/**
		 * Sorts experiment runs by their start date in ascending order.
		 */
		@Override
		public int compare(final ExperimentRun first, final ExperimentRun second) {
			return second.getStartTime().compareTo(first.getStartTime());
		}
	}

	/**
	 * Tries to find a matching experiment setting in all data sources available
	 * in the repository manager. If a matching experiment setting that contains
	 * at least one run is found, it is returned. If not, <code>null</code> is
	 * returned.
	 *
	 * @param experimentSettingName
	 *            The experiment name to match
	 * @param repo
	 * @return The experiment setting if it has been found, <code>null</code>
	 *         otherwise
	 */
	private static ExperimentSetting findExperimentRun(final String experimentName, final String experimentSettingName, Repository repo) {

		// Iterate through all experiment groups and find the one with the
		// requested name
		final EList<ExperimentGroup> currentExperimentGroups = repo.getExperimentGroups();

		for (final ExperimentGroup curr : currentExperimentGroups) {
			if (experimentName.equals(curr.getPurpose())) {

				final EList<ExperimentSetting> settings = curr.getExperimentSettings();

				for (ExperimentSetting experimentSetting : settings) {

					if (experimentSettingName.equals(experimentSetting.getDescription())) {
						// Assuming that each experiment group only has ONE
						// setting
						// NOTE: Change to loop if data structure is altered to
						// find the matching setting
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
		for (Repository repo : repos) {
			if (repo.getId().equals(selectedDataSourceID)) {
				return repo;
			}
		}
		return null;
	}

}
