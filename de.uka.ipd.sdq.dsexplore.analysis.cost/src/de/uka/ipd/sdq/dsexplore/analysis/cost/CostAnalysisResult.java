package de.uka.ipd.sdq.dsexplore.analysis.cost;

import java.util.Map;
import org.apache.log4j.Logger;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.opt4j.core.Criterion;
import org.palladiosimulator.solver.models.PCMInstance;
import de.uka.ipd.sdq.dsexplore.analysis.IAnalysisResult;
import de.uka.ipd.sdq.dsexplore.qml.pcm.datastructures.EvaluationAspectWithContext;

public class CostAnalysisResult implements IAnalysisResult {

    /** Logger for log4j. */
    private static final Logger LOGGER = Logger.getLogger("de.uka.ipd.sdq.dsexplore.analysis.cost");

    private final double totalCost;
    private final double operatingCost;
    private final double initialCost;

    private final Map<Criterion, EvaluationAspectWithContext> criterionToAspectMap;
    private final CostSolverQualityAttributeDeclaration costQualityDimensionDeclaration;


    public CostAnalysisResult(final double totalCost, final double initialCost,
            final double operatingCost, final PCMInstance pcmInstance,
            final Map<Criterion, EvaluationAspectWithContext> criterionToAspect,
            final CostSolverQualityAttributeDeclaration costQualityAttribute) {
        this.totalCost = totalCost;
        this.operatingCost = operatingCost;
        this.initialCost = initialCost;
        criterionToAspectMap = criterionToAspect;
        costQualityDimensionDeclaration = costQualityAttribute;
    }

    @Override
    public double getValueFor(final Criterion criterion) {
        final EvaluationAspectWithContext aspect = criterionToAspectMap.get(criterion);

        if (aspect != null) {
            if (EcoreUtil.equals(aspect.getDimension(),
                    costQualityDimensionDeclaration.getTotalCostDimension())) {
                return getTotalCost();
            } else if (EcoreUtil.equals(aspect.getDimension(),
                    costQualityDimensionDeclaration.getInitialCostDimension())) {
                return getInitialCost();
            } else if (EcoreUtil.equals(aspect.getDimension(),
                    costQualityDimensionDeclaration.getOperatingCostDimension())) {
                return getOperatingCost();
            }
        }

        LOGGER.warn("Unknown aspect for LQN result, adding NaN.");
        return Double.NaN;
    }

    public double getOperatingCost() {
        return operatingCost;
    }

    public double getInitialCost() {
        return initialCost;
    }

    public double getTotalCost() {
        return totalCost;
    }


}
