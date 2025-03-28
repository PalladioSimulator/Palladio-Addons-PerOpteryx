package de.uka.ipd.sdq.dsexplore.analysis.lqn;

import org.eclipse.core.runtime.CoreException;
import org.opt4j.core.Criterion;
import org.palladiosimulator.solver.core.models.PCMInstance;
import org.palladiosimulator.solver.lqn.LqnModelType;
import org.palladiosimulator.solver.runconfig.MessageStrings;

import de.uka.ipd.sdq.dsexplore.analysis.AnalysisFailedException;
import de.uka.ipd.sdq.dsexplore.analysis.IAnalysisResult;
import de.uka.ipd.sdq.dsexplore.analysis.IStatisticAnalysisResult;

/**
 * Starts a LQN simulation analysis for the design space exploration.
 * 
 * @author pmerkle, martens
 *
 */
public class LQSimAnalysis extends AbstractLQNAnalysis  {

	
	@Override
	protected String getSolverMessageString() {
		return MessageStrings.LQSIM_SOLVER;
	}
	
	@Override
	protected LQNResult retrieveResult(PCMInstance pcm,
			LqnModelType model, Criterion criterion) throws AnalysisFailedException {
		LQSimAnalysisResult result = new LQSimAnalysisResult(model, pcm, criterion, this.criterionToAspect, (LQNQualityAttributeDeclaration)this.qualityAttribute);
		return result;
	}		


	@Override
	protected IAnalysisResult handleException(RuntimeException e, PCMInstance pcm) {
		throw e;
	}

	@Override
	public boolean hasObjectivePerUsageScenario() throws CoreException {
		return true;
	}

}
