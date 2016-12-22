package de.uka.ipd.sdq.dsexplore.analysis.lqn;

import org.palladiosimulator.analyzer.resultdecorator.ResultDecoratorRepository;

import de.uka.ipd.sdq.dsexplore.analysis.IAnalysisResult;
import de.uka.ipd.sdq.dsexplore.analysis.IPerformanceAnalysisResult;
import de.uka.ipd.sdq.dsexplore.analysis.IStatisticAnalysisResult;

public interface ILQNResult extends IAnalysisResult, IStatisticAnalysisResult, IPerformanceAnalysisResult{

	public double getMedianValue();

	/**
	 * {@inheritDoc}
	 */
	public double getMeanValue();

	public double getSquaredCoefficientOfVariance();

	public double getCoefficientOfVariance();

	public double getVariance();

	public double getStandardDeviation();

	public ResultDecoratorRepository getResults();

}