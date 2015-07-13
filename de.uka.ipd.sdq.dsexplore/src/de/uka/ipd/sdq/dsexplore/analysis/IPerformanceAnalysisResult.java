package de.uka.ipd.sdq.dsexplore.analysis;

import org.palladiosimulator.analyzer.resultdecorator.ResultDecoratorRepository;
import org.palladiosimulator.solver.context.aggregatedUsageContext.ComputedAggregatedUsage;

public interface IPerformanceAnalysisResult extends IAnalysisResult {

	public ResultDecoratorRepository getResults();
	
	public ComputedAggregatedUsage getComputedAggregatedUsage();
	
}
