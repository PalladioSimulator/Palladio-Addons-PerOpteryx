package de.uka.ipd.sdq.dsexplore.analysis.simulizar;

import java.util.Map;

import org.apache.log4j.Logger;
import org.opt4j.core.Criterion;
import org.palladiosimulator.solver.models.PCMInstance;

import de.uka.ipd.sdq.dsexplore.analysis.AbstractPerformanceAnalysisResult;
import de.uka.ipd.sdq.dsexplore.analysis.IPerformanceAnalysisResult;
import de.uka.ipd.sdq.dsexplore.analysis.IStatisticAnalysisResult;
import de.uka.ipd.sdq.dsexplore.qml.pcm.datastructures.EvaluationAspectWithContext;
import de.uka.ipd.sdq.statistics.estimation.ConfidenceInterval;

public class SimulizarAnalysisResult extends AbstractPerformanceAnalysisResult implements IStatisticAnalysisResult, IPerformanceAnalysisResult {

	protected String pcmEntityIdentifier;

	protected Map<Criterion, EvaluationAspectWithContext> objectiveToAspects;

	protected SimulizarQualityAttributeDeclaration qualityAttributeInfo;

	protected static Logger logger = Logger.getLogger("de.uka.ipd.sdq.dsexplore");

	protected SimulizarAnalysisResult(final PCMInstance pcm) {
		super(pcm);
	}

	@Override
	public double getValueFor(Criterion criterion) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double getMedianValue() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double getMeanValue() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double getStandardDeviation() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double getCoefficientOfVariance() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public ConfidenceInterval getConfidenceInterval(Criterion criterion) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public long getNumberOfObservations() {
		// TODO Auto-generated method stub
		return 0;
	}

}
