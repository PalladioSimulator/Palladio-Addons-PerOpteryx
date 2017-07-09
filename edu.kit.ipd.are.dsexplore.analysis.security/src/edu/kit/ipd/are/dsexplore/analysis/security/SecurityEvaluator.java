package edu.kit.ipd.are.dsexplore.analysis.security;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.log4j.Logger;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.opt4j.core.Criterion;

import de.uka.ipd.sdq.dsexplore.analysis.AbstractAnalysis;
import de.uka.ipd.sdq.dsexplore.analysis.AnalysisFailedException;
import de.uka.ipd.sdq.dsexplore.analysis.IAnalysis;
import de.uka.ipd.sdq.dsexplore.analysis.IAnalysisResult;
import de.uka.ipd.sdq.dsexplore.analysis.PCMPhenotype;
import de.uka.ipd.sdq.dsexplore.launch.DSEWorkflowConfiguration;
import de.uka.ipd.sdq.workflow.jobs.JobFailedException;
import de.uka.ipd.sdq.workflow.jobs.UserCanceledException;
import de.uka.ipd.sdq.workflow.mdsd.blackboard.MDSDBlackboard;

public class SecurityEvaluator extends AbstractAnalysis implements IAnalysis{

	public SecurityEvaluator() {
		super(new SecuritySolverQualityAttributeDeclaration());
	}


	/** Logger for log4j. */
	private static Logger logger =
			Logger.getLogger("edu.kit.ipd.are.dsexplore.analysis.security");

	private Map<Long, SecurityAnalysisResult> previousSecurityResults = new HashMap<Long, SecurityAnalysisResult>();



	@Override
	public void analyse(PCMPhenotype pheno, IProgressMonitor monitor)
			throws CoreException, UserCanceledException, JobFailedException,
			AnalysisFailedException {
		// PCMInstance pcm = pheno.getPCMInstance();
		//Important: "Read in" the right PCM instance first.

		logger.debug("Hi from analyse()");

	}


	@Override
	public void initialise(DSEWorkflowConfiguration configuration) throws CoreException {
		logger.debug("Hi from initialise()");
	}


	@Override
	public List<Criterion> getCriterions() throws CoreException {
		List<Criterion> criterions = new ArrayList<Criterion>();

		// criterions.addAll(this.criteriaList);

		return criterions;
	}

	@Override
	public IAnalysisResult retrieveResultsFor(PCMPhenotype pheno, Criterion criterion)
			throws CoreException, AnalysisFailedException {
		//It is always the cost value, i.e. objective and constraint always have to refer to the SimpleValue (-> no statistical requirements atm)
		//If more possible aspects are added, the criterion needs to be examined here

		logger.debug("Hi from retrieveResultsFor()");

		return this.previousSecurityResults.get(pheno.getNumericID());
	}

	@Override
	public boolean hasObjectivePerUsageScenario() throws CoreException {
		return false;
	}

	@Override
	public boolean hasStatisticResultsFor() throws CoreException {
		return false;
	}


	@Override
	public void setBlackboard(MDSDBlackboard blackboard) {
		this.blackboard = blackboard;
	}

}
