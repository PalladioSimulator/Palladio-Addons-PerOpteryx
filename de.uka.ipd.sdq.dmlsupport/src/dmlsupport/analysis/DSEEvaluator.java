package dmlsupport.analysis;

import java.util.Collection;
import java.util.List;

import org.eclipse.core.runtime.IProgressMonitor;
import org.opt4j.core.Objective;
import org.opt4j.core.Objectives;

import de.uka.ipd.sdq.dsexplore.analysis.IAnalysis;
import de.uka.ipd.sdq.workflow.mdsd.blackboard.MDSDBlackboard;
import dmlsupport.helper.DMLPhenotype;

public class DSEEvaluator implements de.uka.ipd.sdq.dsexplore.opt4j.representation.DSEEvaluator<DMLPhenotype> {

	@Override
	public Collection<Objective> getObjectives() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Exception> getExceptionList() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void init(List<IAnalysis> evaluators, IProgressMonitor monitor, MDSDBlackboard blackboard,
			boolean stopOnInitialFailure) {
		// TODO Auto-generated method stub
	}

	@Override
	public Objectives evaluate(DMLPhenotype phenotype) {
		// TODO Auto-generated method stub
		return null;
	}

}
