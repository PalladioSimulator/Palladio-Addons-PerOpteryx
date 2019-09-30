package de.uka.ipd.sdq.dsexplore.analysis.simulizar;

import java.util.Comparator;
import java.util.Map;

import org.apache.log4j.Logger;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.debug.core.ILaunchConfiguration;
import org.eclipse.emf.common.util.ECollections;
import org.eclipse.emf.common.util.EList;
import org.opt4j.core.Criterion;
import org.palladiosimulator.analyzer.resultdecorator.ResultDecoratorRepository;
import org.palladiosimulator.analyzer.resultdecorator.ResultdecoratorFactory;
import org.palladiosimulator.edp2.impl.RepositoryManager;
import org.palladiosimulator.edp2.models.ExperimentData.ExperimentGroup;
import org.palladiosimulator.edp2.models.ExperimentData.ExperimentRun;
import org.palladiosimulator.edp2.models.ExperimentData.ExperimentSetting;
import org.palladiosimulator.edp2.models.Repository.Repository;
import org.palladiosimulator.pcm.core.entity.Entity;
import org.palladiosimulator.solver.models.PCMInstance;

import de.uka.ipd.sdq.dsexplore.analysis.AbstractPerformanceAnalysisResult;
import de.uka.ipd.sdq.dsexplore.analysis.AnalysisFailedException;
import de.uka.ipd.sdq.dsexplore.analysis.IPerformanceAnalysisResult;
import de.uka.ipd.sdq.dsexplore.analysis.IStatisticAnalysisResult;
import de.uka.ipd.sdq.dsexplore.qml.pcm.datastructures.EvaluationAspectWithContext;
import de.uka.ipd.sdq.statistics.estimation.ConfidenceInterval;

public class SimulizarAnalysisResult extends AbstractPerformanceAnalysisResult implements IStatisticAnalysisResult, IPerformanceAnalysisResult {

	private static Logger logger = Logger.getLogger("de.uka.ipd.sdq.dsexplore");

	private long observations = 0;
	private final Map<Criterion, EvaluationAspectWithContext> objectiveToAspects;
	private final SimulizarQualityAttributeDeclaration qualityAttributeInfo;
	private final ExperimentSetting experimentSetting;
	private final ExperimentRun run;

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

		SimulizarAnalysisResult.logger.debug("Initialised Simulizar EDP2 result");
	}

	// From SimuComAnalysisEDP2Result

	private ResultDecoratorRepository retrieveResults(final PCMInstance pcmInstance) throws AnalysisFailedException {
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

	@Override
	public double getValueFor(Criterion criterion) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double getMedianValue() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double getMeanValue() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double getStandardDeviation() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double getCoefficientOfVariance() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public ConfidenceInterval getConfidenceInterval(Criterion criterion) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public long getNumberOfObservations() {
		// TODO Auto-generated method stub
		return 0;
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
