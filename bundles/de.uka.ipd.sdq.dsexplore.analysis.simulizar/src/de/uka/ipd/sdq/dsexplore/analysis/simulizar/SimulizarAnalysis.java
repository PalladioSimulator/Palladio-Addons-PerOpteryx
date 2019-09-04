package de.uka.ipd.sdq.dsexplore.analysis.simulizar;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.debug.core.ILaunchConfiguration;
import org.opt4j.core.Criterion;
import org.palladiosimulator.solver.models.PCMInstance;

import de.uka.ipd.sdq.dsexplore.analysis.AbstractAnalysis;
import de.uka.ipd.sdq.dsexplore.analysis.AnalysisFailedException;
import de.uka.ipd.sdq.dsexplore.analysis.IAnalysis;
import de.uka.ipd.sdq.dsexplore.analysis.IAnalysisResult;
import de.uka.ipd.sdq.dsexplore.analysis.PCMPhenotype;
import de.uka.ipd.sdq.dsexplore.helper.ConfigurationHelper;
import de.uka.ipd.sdq.dsexplore.launch.DSEWorkflowConfiguration;
import de.uka.ipd.sdq.workflow.jobs.UserCanceledException;
import de.uka.ipd.sdq.workflow.mdsd.blackboard.MDSDBlackboard;

/**
 * Starts a Simulizar Analysis for the design space exploration.
 */
public class SimulizarAnalysis extends AbstractAnalysis implements IAnalysis {

	public SimulizarAnalysis() {
		super(new SimulizarQualityAttributeDeclaration());
	}

	/**
	 * Calls Simulizar. Before doing so, it calls the
	 * {@link ConfigurationHelper} to update the {@link ILaunchConfiguration}
	 * and stores the {@link PCMInstance} to files, so that SimuCom can read it
	 * as usual. After the SimuCom run, the analysis results are extracted from
	 * the sensorFramework data sources and returned. The returned
	 * {@link IAnalysisResult} is a {@link SimuComAnalysisResult} which does not
	 * store the results directly, but provides access to the underlying
	 * sensorFramework data sources.
	 *
	 * {@inheritDoc}
	 *
	 * @throws UserCanceledException
	 *
	 * @see de.uka.ipd.sdq.dsexplore.analysis.IAnalysis#analyse(PCMPhenotype,
	 *      de.uka.ipd.sdq.dsexplore.PCMInstance)
	 */
	@Override
	public void analyse(final PCMPhenotype pheno, final IProgressMonitor monitor) throws AnalysisFailedException, CoreException, UserCanceledException {

	}

	@Override
	public void initialise(DSEWorkflowConfiguration configuration) throws CoreException {
		// TODO Auto-generated method stub

	}

	@Override
	public IAnalysisResult retrieveResultsFor(PCMPhenotype pheno, Criterion criterion) throws CoreException, AnalysisFailedException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean hasObjectivePerUsageScenario() throws CoreException {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void setBlackboard(MDSDBlackboard blackboard) {
	}

}