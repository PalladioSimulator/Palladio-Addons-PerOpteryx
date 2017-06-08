package de.uka.ipd.sdq.dsexplore.analysis;

import org.palladiosimulator.analyzer.resultdecorator.ResultDecoratorRepository;
import org.palladiosimulator.solver.context.aggregatedUsageContext.ComputedAggregatedUsage;
import org.palladiosimulator.solver.context.computed_usage.ComputedUsageContext;
import org.palladiosimulator.solver.models.PCMInstance;
import org.palladiosimulator.solver.visitors.AggregatedContextUsageModelVisitor;
import org.palladiosimulator.solver.visitors.UsageModelVisitor;

import de.uka.ipd.sdq.dsexplore.opt4j.start.Opt4JStarter;

public abstract class AbstractPerformanceAnalysisResult implements
		IPerformanceAnalysisResult {

	private ComputedAggregatedUsage computedAggregatedUsage = null;
	
	protected ResultDecoratorRepository results;

	public AbstractPerformanceAnalysisResult(PCMInstance model) {
		
		if (Opt4JStarter.getDSEWorkflowConfig().isUseHeuristics()) {

			solveDependencies(model);

			this.computedAggregatedUsage = model.getComputedAggregatedUsage();
		}
		
	}

	/**
	 * Careful: Must only be called per {@link PCMInstance} once, because otherwise it will 
	 * reuse {@link ComputedUsageContext} from old candidates.  
	 * @param model
	 */
	public static void solveDependencies(PCMInstance model) {
		// XXX: Dependency solver replaces IntPMFs and DoublePMFs by
		// DoublePDFs.
		
		model.resetComputedContexts();
		
		UsageModelVisitor visitor = new AggregatedContextUsageModelVisitor(
				model);
		visitor.doSwitch(model.getUsageModel());
		
	}

	/**
	 * @return the computedAggregatedUsage
	 */
	public ComputedAggregatedUsage getComputedAggregatedUsage() {
		return computedAggregatedUsage;
	}

	public ResultDecoratorRepository getResults() {
		//TODO add logic to store the ResultDecoratorReporitory model here if needed.
		return results;
	}


	

}
