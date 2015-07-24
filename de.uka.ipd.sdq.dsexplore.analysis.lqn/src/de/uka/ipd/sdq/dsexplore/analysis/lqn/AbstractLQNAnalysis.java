package de.uka.ipd.sdq.dsexplore.analysis.lqn;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

import org.apache.log4j.Logger;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.debug.core.ILaunchConfiguration;
import org.eclipse.debug.core.ILaunchConfigurationWorkingCopy;
import org.eclipse.debug.core.ILaunchManager;
import org.opt4j.core.Criterion;
import org.palladiosimulator.analyzer.workflow.configurations.PCMWorkflowConfigurationBuilder;
import org.palladiosimulator.solver.RunPCMAnalysisJob;
import org.palladiosimulator.solver.lqn.LqnModelType;
import org.palladiosimulator.solver.models.PCMInstance;
import org.palladiosimulator.solver.runconfig.MessageStrings;
import org.palladiosimulator.solver.runconfig.PCMSolverConfigurationBasedConfigBuilder;
import org.palladiosimulator.solver.runconfig.PCMSolverWorkflowRunConfiguration;
import org.palladiosimulator.solver.transformations.SolverStrategy;
import org.palladiosimulator.solver.transformations.pcm2lqn.LqnXmlHandler;
import org.palladiosimulator.solver.transformations.pcm2lqn.Pcm2LqnStrategy;

import de.uka.ipd.sdq.dsexplore.analysis.AbstractAnalysis;
import de.uka.ipd.sdq.dsexplore.analysis.AnalysisFailedException;
import de.uka.ipd.sdq.dsexplore.analysis.IAnalysis;
import de.uka.ipd.sdq.dsexplore.analysis.IAnalysisResult;
import de.uka.ipd.sdq.dsexplore.analysis.PCMPhenotype;
import de.uka.ipd.sdq.dsexplore.launch.DSEWorkflowConfiguration;
import de.uka.ipd.sdq.workflow.jobs.JobFailedException;
import de.uka.ipd.sdq.workflow.jobs.UserCanceledException;
import de.uka.ipd.sdq.workflow.launchconfig.AbstractWorkflowConfigurationBuilder;
import de.uka.ipd.sdq.workflow.mdsd.blackboard.MDSDBlackboard;

public abstract class AbstractLQNAnalysis extends AbstractAnalysis implements IAnalysis {

	/** Logger for log4j. */
	protected static Logger logger = 
		Logger.getLogger("de.uka.ipd.sdq.dsexplore.analysis.lqn.LQNSolverAnalysis");
	
	
	/**
	 * Store the launch parameters so that we do not have to pass them all the
	 * time.
	 */
	private ILaunchConfiguration config;
	
	protected int iteration = -1;

	private Map<Long, String> previousResultFileName = new HashMap<Long, String>();
	
	// cache for LQN models so that they do not have to be loaded so often. Limited capacity (below) to not store too many models. 
	private LinkedList<LqnModelType> recentModels = new LinkedList<LqnModelType>();
	private static int RECENT_MODEL_CAPACITY = 10;
	
	public AbstractLQNAnalysis(){
		super(new LQNQualityAttributeDeclaration());
	}
	
	/**
	 * {@inheritDoc}
	 * @throws UserCanceledException 
	 */
	public void analyse(PCMPhenotype pheno, IProgressMonitor monitor)
			throws AnalysisFailedException, CoreException, UserCanceledException {
		
		ILaunchConfigurationWorkingCopy wcopy = this.config.getWorkingCopy();
		wcopy.setAttribute(MessageStrings.SOLVER,
				this.getSolverMessageString());
		this.config = wcopy.doSave();
		
		iteration++;
		
		PCMInstance pcm = getPCMInstance();
		
		try {
			launchLQNSolver(pheno, monitor);
			//IAnalysisResult result = retrieveLQNSolverResults(pcm);
			//return result;
		} catch (RuntimeException e){
			handleException(e, pcm);
		}
		
		
	}

	/**
	 * FIXME: Make this method independent of the blackboard state.  
	 */
	public IAnalysisResult retrieveResultsFor(PCMPhenotype pheno, Criterion criterion) throws AnalysisFailedException{
		PCMInstance pcm = getPCMInstance();
		IAnalysisResult result = retrieveLQNSolverResults(pheno, pcm,criterion);
		return result;
	}
	
	/**
	 * try to handle the exception or throw it back. 
	 * @param e
	 * @param pcm 
	 * @return
	 */
	protected abstract IAnalysisResult handleException(RuntimeException e, PCMInstance pcm);

	protected abstract String getSolverMessageString();

	ILQNResult retrieveLQNSolverResults(PCMPhenotype pheno, PCMInstance pcm, Criterion criterion) throws AnalysisFailedException {
		
		String xmlFileName = this.previousResultFileName.get(pheno.getNumericID());
		
		// check recent models if the one is in there
		LqnModelType model =  null;
		for (LqnModelType recentModel : this.recentModels) {
			if (isFileNameBelongsToModel(xmlFileName, recentModel)){
				model = recentModel;
			}
		}
		
		// if not, read in from file. 
		if (model == null){
			// Read XML output file generated by LQNSolver
			model =  LqnXmlHandler.loadModelFromXMI(xmlFileName);
		}
				
		if (model == null){
			throw new AnalysisFailedException("LQN model "+xmlFileName+" could not be loaded. See previous logging entries for details.");
		}
		
		// delete the oldest model from the recent model list; and add the current one. 
		if (this.recentModels.size() >= RECENT_MODEL_CAPACITY){
			this.recentModels.pollLast();
		}
		
		this.recentModels.push(model);
		
		ILQNResult result = retrieveResult(pcm, model, criterion);
		return result;	
		
	}

	private boolean isFileNameBelongsToModel(String xmlFileName,
			LqnModelType recentModel) {
		String modelString = recentModel.eResource().getURI().toString();
		modelString = modelString.substring(modelString.lastIndexOf("/")+1);
		return xmlFileName.contains(modelString);
	}

	protected abstract ILQNResult retrieveResult(PCMInstance pcm,
			LqnModelType model, Criterion criterion) throws AnalysisFailedException;

	/**
	 * Launches the LQN Solver.
	 * @param monitor 
	 * 
	 * @param pcmInstance the instance of PCM
	 * @return 
	 * @throws AnalysisFailedException 
	 * @throws CoreException 
	 * @throws UserCanceledException 
	 */
	private void  launchLQNSolver(PCMPhenotype pheno, IProgressMonitor monitor)
			throws AnalysisFailedException, CoreException, UserCanceledException {
	
		if (monitor == null){
			throw new AnalysisFailedException(this.getClass().getName()+" was not correctly initialised.");
		}


		PCMSolverWorkflowRunConfiguration solverConfiguration = new PCMSolverWorkflowRunConfiguration();
		AbstractWorkflowConfigurationBuilder builder;

		builder = new PCMWorkflowConfigurationBuilder(this.config, ILaunchManager.RUN_MODE);
		builder.fillConfiguration(solverConfiguration);

		builder = new PCMSolverConfigurationBasedConfigBuilder(this.config,
				ILaunchManager.RUN_MODE);
		builder.fillConfiguration(solverConfiguration);
		solverConfiguration.setInteractive(false);
		
		
		// Create a new Analysis job
		RunPCMAnalysisJob solverJob = new RunPCMAnalysisJob(solverConfiguration);

		solverJob.setBlackboard(blackboard);
		SolverStrategy strategy = solverJob.getStrategy();
		if (strategy instanceof Pcm2LqnStrategy){
			this.previousResultFileName.put(pheno.getNumericID(), ((Pcm2LqnStrategy)strategy).getFilenameResultXML());
		} else {
			throw new AnalysisFailedException("PCM solver was not configured to use Pcm2Lqn. Please contact the developers. Strategy was: "+strategy);
		}

		try {
			
			//TODO catch exceptions due to convergence problems and handle them nicely. For example, set the response time to MAXINT or similar.
			
			//execute the job
			solverJob.execute(monitor);
			
			logger.debug("Finished PCMSolver LQN analysis");
			
		} catch (JobFailedException e) {  
			logger.error(e.getMessage());
			throw new AnalysisFailedException(e);
		} 
		
		
	}

	/**
	 * {@inheritDoc}
	 * @throws CoreException 
	 * @see de.uka.ipd.sdq.dsexplore.analysis.IAnalysis#initialise(org.eclipse.debug.core.ILaunchConfiguration, java.lang.String, org.eclipse.debug.core.ILaunch, org.eclipse.core.runtime.IProgressMonitor)
	 */
	@Override
	public void initialise(DSEWorkflowConfiguration configuration) throws CoreException {
		this.config = configuration.getRawConfiguration();
		
		initialiseCriteria(configuration);

//		this.objectives = new ArrayList<Objective>(scenarios.size());
//		for (UsageScenario usageScenario : scenarios) {
//			//FIXME: hardcoded usage scenario selection
//			String scenName = usageScenario.getEntityName();
//			if (!scenName.contains("AlarmRetrieve") 
//					&& !scenName.contains("Wrapper")
//					&& !scenName.contains("HistoryRetrieve")){
//				objectives.add(new UsageScenarioBasedObjective(this.getQualityAttribute(), Objective.Sign.MIN, usageScenario));
//			}
//		}


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
	
	public abstract boolean hasStatisticResults() throws CoreException;
	
	
	@Override
	public void setBlackboard(MDSDBlackboard blackboard){
		this.blackboard = blackboard;
	}

}
