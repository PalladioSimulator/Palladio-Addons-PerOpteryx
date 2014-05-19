package de.uka.ipd.sdq.dsexplore.analysis.reliability;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.apache.log4j.Logger;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.debug.core.ILaunchManager;
import org.opt4j.core.Criterion;
import org.opt4j.core.InfeasibilityConstraint;
import org.opt4j.core.Objective;
import org.opt4j.core.SatisfactionConstraint;

import de.uka.ipd.sdq.dsexplore.analysis.AbstractAnalysis;
import de.uka.ipd.sdq.dsexplore.analysis.AnalysisFailedException;
import de.uka.ipd.sdq.dsexplore.analysis.IAnalysis;
import de.uka.ipd.sdq.dsexplore.analysis.IAnalysisQualityAttributeDeclaration;
import de.uka.ipd.sdq.dsexplore.analysis.IAnalysisResult;
import de.uka.ipd.sdq.dsexplore.analysis.PCMPhenotype;
import de.uka.ipd.sdq.dsexplore.helper.EMFHelper;
import de.uka.ipd.sdq.dsexplore.launch.DSEConstantsContainer.QualityAttribute;
import de.uka.ipd.sdq.dsexplore.launch.DSEWorkflowConfiguration;
import de.uka.ipd.sdq.dsexplore.qml.contracttype.QMLContractType.Dimension;
import de.uka.ipd.sdq.dsexplore.qml.pcm.datastructures.EvaluationAspectWithContext;
import de.uka.ipd.sdq.dsexplore.qml.pcm.datastructures.UsageScenarioBasedCriterion;
import de.uka.ipd.sdq.dsexplore.qml.pcm.datastructures.builder.UsageScenarioBasedInfeasibilityConstraintBuilder;
import de.uka.ipd.sdq.dsexplore.qml.pcm.datastructures.builder.UsageScenarioBasedObjectiveBuilder;
import de.uka.ipd.sdq.dsexplore.qml.pcm.datastructures.builder.UsageScenarioBasedSatisfactionConstraintBuilder;
import de.uka.ipd.sdq.dsexplore.qml.pcm.reader.PCMDeclarationsReader;
import de.uka.ipd.sdq.dsexplore.qml.profile.QMLProfile.UsageScenarioRequirement;
import de.uka.ipd.sdq.pcm.usagemodel.UsageModel;
import de.uka.ipd.sdq.pcm.usagemodel.UsageScenario;
import de.uka.ipd.sdq.pcmsolver.models.PCMInstance;
import de.uka.ipd.sdq.pcmsolver.runconfig.PCMSolverConfigurationBasedConfigBuilder;
import de.uka.ipd.sdq.pcmsolver.runconfig.PCMSolverWorkflowRunConfiguration;
import de.uka.ipd.sdq.reliability.solver.pcm2markov.MarkovTransformationResult;
import de.uka.ipd.sdq.reliability.solver.pcm2markov.Pcm2MarkovStrategy;
import de.uka.ipd.sdq.reliability.solver.runconfig.PCMSolverReliabilityConfigurationBasedConfigBuilder;
import de.uka.ipd.sdq.reliability.solver.runconfig.RunPCMReliabilityAnalysisJob;
import de.uka.ipd.sdq.workflow.blackboard.Blackboard;
import de.uka.ipd.sdq.workflow.jobs.JobFailedException;
import de.uka.ipd.sdq.workflow.jobs.UserCanceledException;
import de.uka.ipd.sdq.workflow.launchconfig.AbstractWorkflowConfigurationBuilder;
import de.uka.ipd.sdq.workflow.mdsd.blackboard.MDSDBlackboard;
import de.uka.ipd.sdq.workflow.pcm.blackboard.PCMResourceSetPartition;
import de.uka.ipd.sdq.workflow.pcm.configurations.PCMWorkflowConfigurationBuilder;
import de.uka.ipd.sdq.workflow.pcm.jobs.LoadPCMModelsIntoBlackboardJob;

/**
 * Starts a reliability Solver Analysis for the design space exploration.
 * 
 * @author pmerkle, anne
 *
 */
public class ReliabilityAnalysis extends AbstractAnalysis implements IAnalysis {
	
	public ReliabilityAnalysis() {
		super(new ReliabilitySolverQualityAttributeDeclaration());
		// TODO Auto-generated constructor stub
	}


	/** Logger for log4j. */
	private static Logger logger = 
		Logger.getLogger("de.uka.ipd.sdq.dsexplore.analysis.reliability.ReliabilityAnalysis");
	
	/**
	 * Store the launch parameters so that we do not have to pass them all the
	 * time.
	 */
	private DSEWorkflowConfiguration config;
	
	private PCMSolverWorkflowRunConfiguration lastPCMSolverConfiguration;
	
	
	/**
	 * Cache for previous reliability results.
	 */
	private Map<Long, List<MarkovTransformationResult>> previousReliabilityResults = new HashMap<Long, List<MarkovTransformationResult>>();
	
	/**
	 * {@inheritDoc}
	 * @throws UserCanceledException 
	 * @throws JobFailedException 
	 */
	public void analyse(PCMPhenotype pheno, IProgressMonitor monitor)
			throws CoreException, JobFailedException, UserCanceledException {
		
		launchReliabilitySolver(pheno, monitor);
		
	}
	
	private IAnalysisResult retrieveReliabilitySolverResults(PCMPhenotype pheno, UsageScenario scenario) throws AnalysisFailedException  {
		
		List<MarkovTransformationResult> results = this.previousReliabilityResults.get(pheno.getNumericID());
		MarkovTransformationResult resultForScenario = null;
		
		for (MarkovTransformationResult markovTransformationResult : results) {
			if (EMFHelper.checkIdentity(markovTransformationResult.getScenario(), scenario)) {
				resultForScenario = markovTransformationResult;
				break;
			}
		}
		if (resultForScenario == null) {
			throw new AnalysisFailedException("Cannot find reliability results. Contact developers.");
		}
		
		
		ReliabilityAnalysisResult result = new ReliabilityAnalysisResult(resultForScenario.getSuccessProbability(), this.lastPCMSolverConfiguration);
	
		return result;
	}
	
	/**
	 * Launches the LQN Solver.
	 * @param monitor 
	 * 
	 * @param pheno the instance of PCM
	 * @throws CoreException 
	 * @throws UserCanceledException 
	 * @throws JobFailedException 
	 */
	private void launchReliabilitySolver(PCMPhenotype pheno, IProgressMonitor monitor)
			throws CoreException, JobFailedException, UserCanceledException {
		
		PCMSolverWorkflowRunConfiguration solverConfiguration = new PCMSolverWorkflowRunConfiguration();
		AbstractWorkflowConfigurationBuilder builder;

		builder = new PCMWorkflowConfigurationBuilder(this.config.getRawConfiguration(), ILaunchManager.RUN_MODE);
		builder.fillConfiguration(solverConfiguration);

		builder = new PCMSolverConfigurationBasedConfigBuilder(this.config.getRawConfiguration(),
				ILaunchManager.RUN_MODE);
		builder.fillConfiguration(solverConfiguration);
		
		builder = new PCMSolverReliabilityConfigurationBasedConfigBuilder(this.config.getRawConfiguration(), ILaunchManager.RUN_MODE);
		builder.fillConfiguration(solverConfiguration);
		
		solverConfiguration.setShowHtmlResults(false);

		solverConfiguration.setInteractive(false);
		
		this.lastPCMSolverConfiguration = solverConfiguration;
		
		// Create a new Analysis job
		RunPCMReliabilityAnalysisJob solverJob = new RunPCMReliabilityAnalysisJob(solverConfiguration); 
		solverJob.setBlackboard(blackboard);
		
		//execute the job
		solverJob.execute(monitor);
		
		this.previousReliabilityResults.put(pheno.getNumericID(), ((Pcm2MarkovStrategy) solverJob.getStrategy()).getAllSolvedValues());
		
		logger.debug("Finished reliability solver analysis");
		
	}

	/**
	 * {@inheritDoc}
	 * @see de.uka.ipd.sdq.dsexplore.analysis.IAnalysis#initialise(org.eclipse.debug.core.ILaunchConfiguration, java.lang.String, org.eclipse.debug.core.ILaunch, org.eclipse.core.runtime.IProgressMonitor)
	 */
	public void initialise(DSEWorkflowConfiguration configuration) throws CoreException {
		this.config = configuration;
		
		initialiseCriteria(configuration);
	}
	
	
	/**
	 * {@inheritDoc}
	 */
	public boolean hasStatisticResults() throws CoreException {
		return false;
	}

//	//TODO support several usage scenarios, then also change hasObjectivePerUsageScenario
//	@Override
//	public List<Objective> getObjectives() throws CoreException {
//		List<Objective> objectives = new ArrayList<Objective>(1);
//		Objective o = new Objective(this.getQualityAttribute(), Objective.Sign.MIN);
//		objectives.add(o);
//		
//		return objectives;
//	}
	
	
	@Override
	public IAnalysisResult retrieveResultsFor(PCMPhenotype pheno, Criterion criterion)
			throws AnalysisFailedException {
		
		if (criterion instanceof UsageScenarioBasedCriterion) {
			IAnalysisResult result = retrieveReliabilitySolverResults(pheno, ((UsageScenarioBasedCriterion) criterion).getUsageScenario());
			
			//It is always the pofod, i.e. objective and constraint always have to refer to the MeanValue (-> no other aspects atm)
			//If more possible aspects are added, the criterion needs to be examined here
			return result;
		} else {
			throw new RuntimeException("Reliability criteria need to be defined for a usage scenario");
		}
		

	}

	@Override
	public boolean hasObjectivePerUsageScenario() throws CoreException {
		return true;
	}


	@Override
	public void setBlackboard(MDSDBlackboard blackboard) {
		this.blackboard = blackboard;
		
	}
	
	
	
}
