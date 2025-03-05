package de.uka.ipd.sdq.dsexplore.analysis.lqn;

import java.util.Map;

import org.opt4j.core.Criterion;
import org.palladiosimulator.solver.core.models.PCMInstance;
import org.palladiosimulator.solver.lqn.LqnModelType;

import de.uka.ipd.sdq.dsexplore.analysis.AnalysisFailedException;
import de.uka.ipd.sdq.dsexplore.analysis.IStatisticAnalysisResult;
import de.uka.ipd.sdq.dsexplore.qml.pcm.datastructures.EvaluationAspectWithContext;
import de.uka.ipd.sdq.statistics.estimation.ConfidenceInterval;

/**
 * This class represents the result of a LQN simulation analysis.
 * 
 * @author pmerkle, martens
 *
 */
public class LQSimAnalysisResult extends LQNResult implements IStatisticAnalysisResult {


    public LQSimAnalysisResult(final LqnModelType model, final PCMInstance pcm,
            final Criterion criterion, final Map<Criterion, EvaluationAspectWithContext> objectiveToAspect,
            final LQNQualityAttributeDeclaration qualityAttributeInfo) throws AnalysisFailedException {
        super(pcm, model, criterion, objectiveToAspect, qualityAttributeInfo);

    }


    @Override
    public ConfidenceInterval getConfidenceInterval(Criterion criterion) {
        return null;
    }


    @Override
    public long getNumberOfObservations() {
        return 0;
    }

}
