package de.uka.ipd.sdq.dsexplore.opt4j.representation;

import java.util.Collection;
import java.util.List;

import org.eclipse.core.runtime.IProgressMonitor;
import org.opt4j.core.Objective;
import org.opt4j.core.Phenotype;
import org.opt4j.core.problem.Evaluator;

import de.uka.ipd.sdq.dsexplore.analysis.IAnalysis;
import de.uka.ipd.sdq.workflow.mdsd.blackboard.MDSDBlackboard;

/**
 * The Evaluator is responsible for determining the objective functions values 
 * for an individual based on the phenotype.
 */
public interface DSEEvaluator<P extends Phenotype> extends Evaluator<P> {
	//TODO add required methods on demand (look at PCM related implementation)
	public Collection<Objective> getObjectives();
	
	public List<Exception> getExceptionList();
	
	public void init(List<IAnalysis> evaluators, IProgressMonitor monitor, MDSDBlackboard blackboard, boolean stopOnInitialFailure);
}



