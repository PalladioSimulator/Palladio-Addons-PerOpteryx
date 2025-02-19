package de.uka.ipd.sdq.dsexplore.analysis.simulizar;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;

import javax.measure.Measure;
import javax.measure.quantity.Quantity;

import org.apache.commons.math.stat.descriptive.moment.Mean;
import org.apache.commons.math.stat.descriptive.moment.StandardDeviation;
import org.apache.commons.math.stat.descriptive.rank.Median;
import org.apache.log4j.Logger;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.debug.core.ILaunchConfiguration;
import org.eclipse.emf.common.util.ECollections;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.opt4j.core.Criterion;
import org.palladiosimulator.analyzer.resultdecorator.ResultDecoratorRepository;
import org.palladiosimulator.analyzer.resultdecorator.ResultdecoratorFactory;
import org.palladiosimulator.analyzer.resultdecorator.resourceenvironmentdecorator.ActiveResourceUtilisationResult;
import org.palladiosimulator.analyzer.resultdecorator.resourceenvironmentdecorator.LinkingResourceResults;
import org.palladiosimulator.analyzer.resultdecorator.resourceenvironmentdecorator.ProcessingResourceSpecificationResult;
import org.palladiosimulator.analyzer.resultdecorator.resourceenvironmentdecorator.ResourceenvironmentdecoratorFactory;
import org.palladiosimulator.edp2.dao.MeasurementsDao;
import org.palladiosimulator.edp2.impl.RepositoryManager;
import org.palladiosimulator.edp2.models.ExperimentData.DataSeries;
import org.palladiosimulator.edp2.models.ExperimentData.ExperimentGroup;
import org.palladiosimulator.edp2.models.ExperimentData.ExperimentRun;
import org.palladiosimulator.edp2.models.ExperimentData.ExperimentSetting;
import org.palladiosimulator.edp2.models.ExperimentData.Measurement;
import org.palladiosimulator.edp2.models.ExperimentData.MeasurementRange;
import org.palladiosimulator.edp2.models.ExperimentData.MeasuringType;
import org.palladiosimulator.edp2.models.Repository.Repository;
import org.palladiosimulator.edp2.models.measuringpoint.MeasuringPoint;
import org.palladiosimulator.edp2.util.MeasurementsUtility;
import org.palladiosimulator.metricspec.MetricDescription;
import org.palladiosimulator.metricspec.MetricSetDescription;
import org.palladiosimulator.metricspec.constants.MetricDescriptionConstants;
import org.palladiosimulator.pcm.core.entity.Entity;
import org.palladiosimulator.pcm.resourceenvironment.LinkingResource;
import org.palladiosimulator.pcm.resourceenvironment.ProcessingResourceSpecification;
import org.palladiosimulator.pcm.resourceenvironment.ResourceContainer;
import org.palladiosimulator.pcm.resourcetype.ProcessingResourceType;
import org.palladiosimulator.pcm.resourcetype.ResourceType;
import org.palladiosimulator.pcmmeasuringpoint.ActiveResourceMeasuringPoint;
import org.palladiosimulator.pcmmeasuringpoint.UsageScenarioMeasuringPoint;
import org.palladiosimulator.solver.core.models.PCMInstance;

import de.uka.ipd.sdq.dsexplore.analysis.AbstractPerformanceAnalysisResult;
import de.uka.ipd.sdq.dsexplore.analysis.AnalysisFailedException;
import de.uka.ipd.sdq.dsexplore.analysis.IPerformanceAnalysisResult;
import de.uka.ipd.sdq.dsexplore.analysis.IStatisticAnalysisResult;
import de.uka.ipd.sdq.dsexplore.qml.contracttype.QMLContractType.Dimension;
import de.uka.ipd.sdq.dsexplore.qml.pcm.datastructures.EvaluationAspectWithContext;
import de.uka.ipd.sdq.statistics.estimation.ConfidenceInterval;

public class SimulizarAnalysisResult extends AbstractPerformanceAnalysisResult implements IStatisticAnalysisResult, IPerformanceAnalysisResult {

	private static Logger logger = Logger.getLogger("de.uka.ipd.sdq.dsexplore");

	private long observations;
	private final Map<Criterion, EvaluationAspectWithContext> objectiveToAspects;
	private final SimulizarQualityAttributeDeclaration qualityAttributeInfo;
	private final ExperimentRun run;

	private double meanValue;
	private double stdDeviation;
	private double medianValue;
	private double throughput;
	private double maxUtilization;
	private ConfidenceInterval confidenceInterval;

	protected SimulizarAnalysisResult(final ExperimentRun run, final PCMInstance pcmInstance, final Entity pcmEntity, final Map<Criterion, EvaluationAspectWithContext> objectiveToAspect,
			final SimulizarQualityAttributeDeclaration qualityAttributeInfo) throws AnalysisFailedException {
		super(pcmInstance);

		this.run = run;

		this.objectiveToAspects = objectiveToAspect;
		this.qualityAttributeInfo = qualityAttributeInfo;

		this.results = this.retrieveResults(pcmInstance);
		this.calculateResults();
		SimulizarAnalysisResult.logger.debug("Initialised Simulizar EDP2 result");
	}

	private void calculateResults() {
		this.observations = 0;

		this.meanValue = Double.NaN;
		this.stdDeviation = Double.NaN;
		this.medianValue = Double.NaN;
		this.throughput = Double.NaN;
		this.maxUtilization = Double.NaN;

		double[] values = this.getResponseTimesOfScenario();
		if (values == null) {
			return;
		}

		this.observations = values.length;
		this.meanValue = new Mean().evaluate(values);
		this.stdDeviation = new StandardDeviation().evaluate(values);
		this.medianValue = new Median().evaluate(values);

		// TODO ...
		// this.throughput =
		// this.maxUtilization =

		// final SensorAndMeasurements sam = getUsageScenarioMeasurements();
		// this.throughput = calculateThroughput(sam);
		// this.confidenceInterval = determineConfidenceInterval(sam);

	}

	private List<Measurement> findMeasurement(MetricSetDescription id, Class<? extends MeasuringPoint> type) {
		List<Measurement> result = new ArrayList<>();

		List<Measurement> measurements = this.run.getMeasurement();
		for (Measurement measurement : measurements) {
			MeasuringType mType = measurement.getMeasuringType();
			MetricDescription mdsc = mType.getMetric();
			if (!mdsc.getId().equals(id.getId())) {
				continue;
			}

			MeasuringPoint mp = measurement.getMeasuringType().getMeasuringPoint();
			if (type != null && !(type.isInstance(mp))) {
				continue;
			}
			result.add(measurement);
		}

		return result;
	}

	private double[] getResponseTimesOfScenario() {
		double[] values = null;
		List<Measurement> measurements = this.findMeasurement(MetricDescriptionConstants.RESPONSE_TIME_METRIC_TUPLE, UsageScenarioMeasuringPoint.class);
		if (measurements.size() != 1) {
			SimulizarAnalysisResult.logger.error("Invalid amount of measurement points for scenario have been found!");
			return null;
		}

		Measurement measurement = measurements.get(0);

		// Get the one an only measurement range
		MeasurementRange range = measurement.getMeasurementRanges().get(0);
		// Read Response times
		DataSeries series = range.getRawMeasurements().getDataSeries().get(1);
		@SuppressWarnings("unchecked")
		MeasurementsDao<Double, Quantity> qa = (MeasurementsDao<Double, Quantity>) MeasurementsUtility.getMeasurementsDao(series);
		List<Measure<Double, Quantity>> q = qa.getMeasurements();
		values = new double[q.size()];
		int i = 0;
		for (Measure<Double, Quantity> m : q) {
			values[i++] = m.getValue();
		}

		return values;
	}

	private ResultDecoratorRepository retrieveResults(final PCMInstance pcmInstance) throws AnalysisFailedException {
		final ResultDecoratorRepository repo = ResultdecoratorFactory.eINSTANCE.createResultDecoratorRepository();
		this.retrieveActiveResourceUtil(pcmInstance, repo);
		this.retrieveServiceResults(pcmInstance, repo);
		this.retrievePassiveResourceUtil(repo, pcmInstance);
		return repo;
	}

	private void retrievePassiveResourceUtil(ResultDecoratorRepository repo, PCMInstance pcmInstance) {
		// TODO Implement me
		// See also SimuComAnalysisSensorFrameworkResult
		SimulizarAnalysisResult.logger.warn("Passive Resources will not monitored so far");
	}

	private void retrieveServiceResults(PCMInstance pcmInstance, ResultDecoratorRepository repo) {
		// TODO Implement me
		// See also SimuComAnalysisSensorFrameworkResult
		SimulizarAnalysisResult.logger.warn("Services will not monitored so far");
	}

	private void retrieveActiveResourceUtil(PCMInstance pcmInstance, ResultDecoratorRepository repo) {
		final List<ResourceContainer> resourceContainerList = pcmInstance.getResourceEnvironment().getResourceContainer_ResourceEnvironment();
		for (final ResourceContainer resourceContainer : resourceContainerList) {
			final List<ProcessingResourceSpecification> resources = resourceContainer.getActiveResourceSpecifications_ResourceContainer();
			for (final ProcessingResourceSpecification resource : resources) {
				final ProcessingResourceSpecificationResult result = ResourceenvironmentdecoratorFactory.eINSTANCE.createProcessingResourceSpecificationResult();
				this.getUtilisationOfResource(result, resourceContainer, resource.getActiveResourceType_ActiveResourceSpecification());
				if (result != null && result.getResourceUtilisation() != Double.NaN) {
					result.setEntityName("Util of " + resourceContainer.getEntityName() + "_" + resource.getActiveResourceType_ActiveResourceSpecification().getEntityName());
					result.setProcessingResourceSpecification_ProcessingResourceSpecificationResult(resource);
					repo.getUtilisationResults_ResultDecoratorRepository().add(result);
				}
			}

		}
		final List<LinkingResource> linkList = pcmInstance.getResourceEnvironment().getLinkingResources__ResourceEnvironment();
		for (final LinkingResource linkingResource : linkList) {
			final ResourceType type = linkingResource.getCommunicationLinkResourceSpecifications_LinkingResource().getCommunicationLinkResourceType_CommunicationLinkResourceSpecification();
			final LinkingResourceResults result = ResourceenvironmentdecoratorFactory.eINSTANCE.createLinkingResourceResults();
			result.setLinkingResource_LinkingResourceResults(linkingResource);
			this.getUtilisationOfResource(result, linkingResource, type);
			if (result != null && result.getResourceUtilisation() != Double.NaN) {
				result.setEntityName("Util of " + linkingResource.getEntityName() + "_" + type);
				repo.getUtilisationResults_ResultDecoratorRepository().add(result);
			}
		}

	}

	private void getUtilisationOfResource(final ActiveResourceUtilisationResult resultToFill, final Entity container, final ResourceType resourceType) {
		List<Measurement> measurements = this.findMeasurement(MetricDescriptionConstants.UTILIZATION_OF_ACTIVE_RESOURCE_TUPLE, ActiveResourceMeasuringPoint.class);
		if (measurements.isEmpty()) {
			resultToFill.setResourceUtilisation(Double.NaN);
			return;
		}

		// For non CPU:
		if (!(resourceType instanceof ProcessingResourceType)) {
			SimulizarAnalysisResult.logger.warn("Only CPU measurements are currently supported ..");
			resultToFill.setResourceUtilisation(Double.NaN);
			return;
		}

		String cpuId = ((ResourceContainer) container).getActiveResourceSpecifications_ResourceContainer().get(0).getId();
		for (Measurement measurement : measurements) {
			MeasuringType type = measurement.getMeasuringType();
			MeasuringPoint mp = type.getMeasuringPoint();
			if (!mp.getResourceURIRepresentation().endsWith(cpuId)) {
				continue;
			}

			// CPU Monitor found:
			// Get the one an only measurement range
			MeasurementRange range = measurement.getMeasurementRanges().get(0);
			// Read Response times
			DataSeries series = range.getRawMeasurements().getDataSeries().get(1);
			@SuppressWarnings("unchecked")
			MeasurementsDao<Double, Quantity> qa = (MeasurementsDao<Double, Quantity>) MeasurementsUtility.getMeasurementsDao(series);
			List<Measure<Double, Quantity>> q = qa.getMeasurements();
			double[] values = new double[q.size()];
			int i = 0;
			for (Measure<Double, Quantity> m : q) {
				values[i++] = m.getValue();
			}
			resultToFill.setResourceUtilisation(new Mean().evaluate(values));
		}
		// Iff none found .. NaN
		resultToFill.setResourceUtilisation(Double.NaN);
	}

	// GETTERS //

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
	public double getMedianValue() {
		return this.medianValue;
	}

	@Override
	public double getMeanValue() {
		return this.meanValue;
	}

	@Override
	public double getStandardDeviation() {
		return this.stdDeviation;
	}

	@Override
	public double getCoefficientOfVariance() {
		final double std = this.getStandardDeviation();
		final double mean = this.getMeanValue();
		return std / mean;
	}

	@Override
	public ConfidenceInterval getConfidenceInterval(Criterion criterion) {
		if (EcoreUtil.equals(this.getDimensionForCriterion(criterion), this.qualityAttributeInfo.getResponseTime())) {
			return this.confidenceInterval;
		} else {
			return null;
		}
	}

	@Override
	public long getNumberOfObservations() {
		return this.observations;
	}

	////////////////////// LOAD /////////////////////////
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
			/* sort so that the newest it at the beginning */
			ECollections.sort(expRuns, new ExperimentRunComparator());

			ExperimentRun reqRun = null;
			for (ExperimentRun experimentRun : expRuns) {
				if (experimentRun.getMeasurement().size() > 0) {
					reqRun = experimentRun;
					break;
				}
			}
			return new SimulizarAnalysisResult(reqRun, pcmInstance, entity, criterionToAspect, qualityAttribute);
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
