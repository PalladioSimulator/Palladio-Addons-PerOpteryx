package de.uka.ipd.sdq.dsexplore.analysis.simulizar;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.log4j.Logger;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.debug.core.ILaunchConfiguration;
import org.opt4j.core.Criterion;

import de.uka.ipd.sdq.codegen.simucontroller.runconfig.SimuComWorkflowConfiguration;
import de.uka.ipd.sdq.dsexplore.analysis.AbstractAnalysis;
import de.uka.ipd.sdq.dsexplore.analysis.AnalysisFailedException;
import de.uka.ipd.sdq.dsexplore.analysis.IAnalysis;
import de.uka.ipd.sdq.dsexplore.analysis.IAnalysisResult;
import de.uka.ipd.sdq.dsexplore.analysis.PCMPhenotype;
import de.uka.ipd.sdq.dsexplore.exception.ExceptionHelper;
import de.uka.ipd.sdq.dsexplore.launch.DSEConstantsContainer.QualityAttribute;
import de.uka.ipd.sdq.dsexplore.launch.DSEWorkflowConfiguration;
import de.uka.ipd.sdq.probespec.framework.ISampleBlackboard;
import de.uka.ipd.sdq.probespec.framework.ProbeSpecContext;
import de.uka.ipd.sdq.probespec.framework.SampleBlackboard;
import de.uka.ipd.sdq.simucomframework.DiscardInvalidMeasurementsBlackboardDecorator;
import de.uka.ipd.sdq.simucomframework.ExperimentRunner;
import de.uka.ipd.sdq.simucomframework.SimuComConfig;
import de.uka.ipd.sdq.simucomframework.SimuComGarbageCollector;
import de.uka.ipd.sdq.simucomframework.calculator.CalculatorFactory;
import de.uka.ipd.sdq.simucomframework.calculator.SetupPipesAndFiltersStrategy;
import de.uka.ipd.sdq.simucomframework.model.SimuComModel;
import de.uka.ipd.sdq.simucomframework.probes.SimuComProbeStrategyRegistry;
import de.uka.ipd.sdq.simucomframework.simucomstatus.SimuComStatus;
import de.uka.ipd.sdq.simucomframework.simucomstatus.SimucomstatusFactory;
import de.uka.ipd.sdq.simulation.AbstractSimulationConfig;
import de.uka.ipd.sdq.simulation.abstractsimengine.ISimEngineFactory;
import de.uka.ipd.sdq.simulation.preferences.SimulationPreferencesHelper;
import de.uka.ipd.sdq.workflow.jobs.JobFailedException;
import de.uka.ipd.sdq.workflow.jobs.UserCanceledException;
import de.uka.ipd.sdq.workflow.mdsd.blackboard.MDSDBlackboard;

import org.palladiosimulator.simulizar.access.AccessFactory;
import org.palladiosimulator.simulizar.access.IModelAccessFactory;
import org.palladiosimulator.simulizar.access.UsageModelAccess;
import org.palladiosimulator.simulizar.interpreter.InterpreterDefaultContext;
import org.palladiosimulator.simulizar.interpreter.listener.LogDebugListener;
import org.palladiosimulator.simulizar.interpreter.listener.ProbeSpecListener;
import org.palladiosimulator.simulizar.launcher.PCMInterpreterLauncher;
import org.palladiosimulator.simulizar.reconfiguration.IReconfigurator;
import org.palladiosimulator.simulizar.reconfiguration.ReconfigurationListener;
import org.palladiosimulator.simulizar.reconfiguration.storydiagrams.SDReconfigurator;
import org.palladiosimulator.simulizar.utils.ResourceSyncer;


public class SimuLizarAnalysis extends AbstractAnalysis implements IAnalysis 
{
	
	private static final Logger logger = Logger.getLogger(SimuLizarAnalysis.class.getName());
	 private SimuComWorkflowConfiguration configuration;
	 private MDSDBlackboard blackboard;
	 private String initialExperimentName;
	 private ILaunchConfiguration config;
	 private Map<Integer, String> previousExperimentNames = new HashMap<Integer, String>();
	 
	 
	public SimuLizarAnalysis() 
	{
		super(new SimuLizarQualityAttributeDeclaration());
	}


	@Override
	public void analyse(PCMPhenotype pheno, IProgressMonitor monitor) throws CoreException, UserCanceledException, JobFailedException, AnalysisFailedException {
	
		
	}


	@Override
	public void initialise(DSEWorkflowConfiguration configuration) throws CoreException {
	
		new PCMInterpreterLauncher();
	}


	@Override
	public IAnalysisResult retrieveResultsFor(PCMPhenotype pheno, Criterion criterion) throws CoreException, AnalysisFailedException {
		return null;
	}


	@Override
	public boolean hasStatisticResults() throws CoreException {
		return false;
	}


	@Override
	public boolean hasObjectivePerUsageScenario() throws CoreException {
		
		return false;
	}


	@Override
	public void setBlackboard(MDSDBlackboard blackboard) {
		
	}
}

	

