package de.uka.ipd.sdq.dsexplore.analysis.privacy;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.opt4j.core.Criterion;

import de.uka.ipd.sdq.dsexplore.analysis.AbstractAnalysis;
import de.uka.ipd.sdq.dsexplore.analysis.AnalysisFailedException;
import de.uka.ipd.sdq.dsexplore.analysis.IAnalysis;
import de.uka.ipd.sdq.dsexplore.analysis.IAnalysisQualityAttributeDeclaration;
import de.uka.ipd.sdq.dsexplore.analysis.IAnalysisResult;
import de.uka.ipd.sdq.dsexplore.analysis.PCMPhenotype;
import de.uka.ipd.sdq.dsexplore.launch.DSEWorkflowConfiguration;
import de.uka.ipd.sdq.workflow.jobs.JobFailedException;
import de.uka.ipd.sdq.workflow.jobs.UserCanceledException;
import de.uka.ipd.sdq.workflow.mdsd.blackboard.MDSDBlackboard;

public class PrivacyEvaluator extends AbstractAnalysis implements IAnalysis {

	public PrivacyEvaluator(IAnalysisQualityAttributeDeclaration qualityAttribute) {
		super(qualityAttribute);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void initialise(DSEWorkflowConfiguration configuration) throws CoreException {
		// TODO Auto-generated method stub

	}

	@Override
	public void analyse(PCMPhenotype pheno, IProgressMonitor monitor)
			throws CoreException, UserCanceledException, JobFailedException, AnalysisFailedException {
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
		// TODO Auto-generated method stub
	}

}
