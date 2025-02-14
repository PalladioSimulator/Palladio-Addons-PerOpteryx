package de.uka.ipd.sdq.dsexplore.analysis.simulizar;

import java.util.HashMap;
import java.util.Map;

import org.apache.log4j.Logger;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.debug.core.ILaunchConfiguration;
import org.eclipse.debug.core.ILaunchConfigurationWorkingCopy;
import org.eclipse.debug.core.ILaunchManager;
import org.opt4j.core.Criterion;
import org.palladiosimulator.analyzer.workflow.blackboard.PCMResourceSetPartition;
import org.palladiosimulator.analyzer.workflow.core.configurations.PCMWorkflowConfigurationBuilder;
import org.palladiosimulator.analyzer.workflow.jobs.LoadPCMModelsIntoBlackboardJob;
import org.palladiosimulator.edp2.models.Repository.Repository;
import org.palladiosimulator.pcm.core.entity.Entity;
import org.palladiosimulator.simulizar.runconfig.SimuLizarLaunchConfigurationBasedConfigBuilder;
import org.palladiosimulator.simulizar.runconfig.SimuLizarWorkflowConfiguration;
import org.palladiosimulator.solver.models.PCMInstance;

import de.uka.ipd.sdq.dsexplore.analysis.AbstractAnalysis;
import de.uka.ipd.sdq.dsexplore.analysis.AnalysisFailedException;
import de.uka.ipd.sdq.dsexplore.analysis.IAnalysis;
import de.uka.ipd.sdq.dsexplore.analysis.IStatisticAnalysisResult;
import de.uka.ipd.sdq.dsexplore.analysis.PCMPhenotype;
import de.uka.ipd.sdq.dsexplore.exception.ExceptionHelper;
import de.uka.ipd.sdq.dsexplore.launch.DSEWorkflowConfiguration;
import de.uka.ipd.sdq.dsexplore.qml.pcm.datastructures.EntryLevelSystemCallCriterion;
import de.uka.ipd.sdq.dsexplore.qml.pcm.datastructures.UsageScenarioBasedCriterion;
import de.uka.ipd.sdq.simulation.AbstractSimulationConfig;
import de.uka.ipd.sdq.workflow.jobs.CleanupFailedException;
import de.uka.ipd.sdq.workflow.jobs.JobFailedException;
import de.uka.ipd.sdq.workflow.jobs.UserCanceledException;
import de.uka.ipd.sdq.workflow.launchconfig.core.AbstractWorkflowConfigurationBuilder;
import de.uka.ipd.sdq.workflow.mdsd.blackboard.MDSDBlackboard;

/**
 * Starts a SimuLizar Analysis for the design space exploration. Mainly adopted
 * from classes in de.uka.ipd.sdq.dsexplore.analysis.simucom
 */
public class SimulizarAnalysis extends AbstractAnalysis implements IAnalysis {

	private static int COUNTER = 0;

	/** Logger for log4j. */
	private static Logger logger = Logger.getLogger("de.uka.ipd.sdq.dsexplore");

	/**
	 * Store the launch parameters so that we do not have to pass them all the
	 * time.
	 */
	private ILaunchConfiguration config;

	private String initialExperimentName;
	private final Map<Integer, String> previousExperimentNames = new HashMap<>();

	private SimuLizarWorkflowConfiguration workflowConfig;

	public SimulizarAnalysis() {
		super(new SimulizarQualityAttributeDeclaration());
	}

	@Override
	public void analyse(final PCMPhenotype pheno, final IProgressMonitor monitor) throws AnalysisFailedException, CoreException, UserCanceledException {
		final String experimentName = this.getExperimentName(pheno);
		final String experimentSettingName = this.getExperimentSettingName(pheno);
		this.previousExperimentNames.put(pheno.getGenotypeID().hashCode(), experimentSettingName);

		final ILaunchConfigurationWorkingCopy launchWorkingCopy = this.config.getWorkingCopy();

		launchWorkingCopy.setAttribute(AbstractSimulationConfig.EXPERIMENT_RUN, experimentName);
		launchWorkingCopy.setAttribute(AbstractSimulationConfig.VARIATION_ID, experimentSettingName);

		this.workflowConfig = this.deriveConfiguration(launchWorkingCopy, ILaunchManager.RUN_MODE);
		this.workflowConfig.setOverwriteWithoutAsking(true);

		System.gc();

		if (this.isExperimentRunDoesNotExist(experimentName, experimentSettingName)) {
			this.launchSimulizar(monitor);
		}
	}

	private void launchSimulizar(IProgressMonitor monitor) throws CoreException, AnalysisFailedException {
		this.workflowConfig.setInteractive(false);

		final SimulizarJob job = new SimulizarJob(this.workflowConfig, ++SimulizarAnalysis.COUNTER);
		job.setBlackboard(this.blackboard);

		try {
			job.execute(monitor);
			SimulizarAnalysis.logger.debug("Finished Simulizar analysis");
			job.cleanup(monitor);
		} catch (JobFailedException | UserCanceledException | CleanupFailedException e) {
			SimulizarAnalysis.logger.error("Error during simulation.");
			e.printStackTrace();
			throw new AnalysisFailedException(e);
		}
	}

	@Override
	public void initialise(DSEWorkflowConfiguration configuration) throws CoreException {
		this.previousExperimentNames.clear();
		this.config = configuration.getRawConfiguration();

		if (!this.config.getAttribute("persistenceFramework", "").contains("EDP2")) {
			throw ExceptionHelper.createNewCoreException("Only EDP2 is supported");
		}

		if (this.blackboard == null) {
			throw ExceptionHelper.createNewCoreException("Error in initialisation: No Blackboard was set when initialising the SimuLizar Analysis. Contact the developers.");
		}

		this.initialExperimentName = this.config.getAttribute(AbstractSimulationConfig.EXPERIMENT_RUN, "");
		this.initialiseCriteria(configuration);
	}

	@Override
	public IStatisticAnalysisResult retrieveResultsFor(final PCMPhenotype pheno, final Criterion criterion) throws CoreException, AnalysisFailedException {
		Entity entity = this.getPCMEntityForCriterion(criterion);
		return this.retrieveSimulizarResults(pheno, entity);
	}

	private IStatisticAnalysisResult retrieveSimulizarResults(PCMPhenotype pheno, Entity entity) throws AnalysisFailedException, CoreException {

		final String experimentName = this.getExperimentName(pheno);
		final String experimentSettingName = this.getExperimentSettingName(pheno);
		final PCMResourceSetPartition pcmPartition = (PCMResourceSetPartition) this.blackboard.getPartition(LoadPCMModelsIntoBlackboardJob.PCM_MODELS_PARTITION_ID);
		// TODO Iff no copy of Blackboard in launchSimulizar is done this fails
		// .. (shall not be so)
		final PCMInstance pcmInstance = new PCMInstance(pcmPartition);

		Repository repo = SimulizarAnalysisResult.findSelectedEDP2Repository(this.config);
		SimulizarQualityAttributeDeclaration sq = (SimulizarQualityAttributeDeclaration) this.qualityAttribute;
		IStatisticAnalysisResult result = SimulizarAnalysisResult.findExperimentRunAndCreateResult(entity, experimentName, experimentSettingName, pcmInstance, repo, this.criterionToAspect, sq);

		if (result == null) {
			final String errormessage = ""//
					+ "There was no experiment named \"" + experimentName + "\" with an experiment setting \"" + experimentSettingName + "\"" //
					+ " in the selected data source after analysing the PCM instance \"" + experimentName + "\" of candidate " + pheno.getNumericID() + " " + pheno.getGenotypeID();
			SimulizarAnalysis.logger.error(errormessage);
			throw new AnalysisFailedException(errormessage);
		}

		return result;
	}

	private Entity getPCMEntityForCriterion(final Criterion criterion) throws CoreException {
		if (criterion instanceof UsageScenarioBasedCriterion) {
			return ((UsageScenarioBasedCriterion) criterion).getUsageScenario();
		} else if (criterion instanceof EntryLevelSystemCallCriterion) {
			return ((EntryLevelSystemCallCriterion) criterion).getEntryLevelSystemCall();
		}
		throw new CoreException(new Status(IStatus.ERROR, "de.uka.ipd.sdq.dsexplore.analysis.simulizar",
				"Cannot handle Criterion of type " + criterion.getClass() + ". Required is UsageScenarioBasedCriterion or EntryLevelSystemCallCriterion."));
	}

	@Override
	public boolean hasObjectivePerUsageScenario() throws CoreException {
		return true;
	}

	@Override
	public void setBlackboard(MDSDBlackboard blackboard) {
		this.blackboard = blackboard;
	}

	// From SimuComAnalysis

	/**
	 * Search in all open data sources whether there is already an experiment
	 * run with this name and check that it contains some results.
	 *
	 * @param experimentSettingName
	 * @return the indicator
	 */
	private boolean isExperimentRunDoesNotExist(final String experimentName, final String experimentSettingName) throws CoreException {
		return !SimulizarAnalysisResult.isExperimentRunExisting(experimentName, experimentSettingName, SimulizarAnalysisResult.findSelectedEDP2Repository(this.config));
	}

	// From PCMInterpreterLauncher
	protected SimuLizarWorkflowConfiguration deriveConfiguration(final ILaunchConfiguration configuration, final String mode) throws CoreException {
		final SimuLizarWorkflowConfiguration config = new SimuLizarWorkflowConfiguration(configuration.getAttributes());

		AbstractWorkflowConfigurationBuilder builder;
		builder = new PCMWorkflowConfigurationBuilder(configuration, mode);
		builder.fillConfiguration(config);

		builder = new SimuLizarLaunchConfigurationBasedConfigBuilder(configuration, mode);
		builder.fillConfiguration(config);

		return config;
	}

	private String getExperimentName(final PCMPhenotype pheno) throws CoreException {
		return this.initialExperimentName + " " + pheno.getGenotypeID();
	}

	private String getExperimentSettingName(final PCMPhenotype pheno) throws CoreException {
		return pheno.getGenotypeID();
	}

}