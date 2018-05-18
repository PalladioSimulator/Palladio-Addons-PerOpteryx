package de.uka.ipd.sdq.dsexplore.analysis.cost;

import java.util.ArrayList;
import java.util.List;
import de.uka.ipd.sdq.dsexplore.analysis.IAnalysisQualityAttributeDeclaration;
import de.uka.ipd.sdq.dsexplore.launch.DSEConstantsContainer.QualityAttribute;
import de.uka.ipd.sdq.dsexplore.qml.contract.QMLContract.EvaluationAspect;
import de.uka.ipd.sdq.dsexplore.qml.contract.QMLContract.Value;
import de.uka.ipd.sdq.dsexplore.qml.contracttype.QMLContractType.Dimension;
import de.uka.ipd.sdq.dsexplore.qml.handling.QMLConstantsContainer;
import de.uka.ipd.sdq.dsexplore.qml.reader.QMLDimensionReader;

/**
 * This class declares, which {@code Dimension} and {@code EvaluationAspect} can be evaluated by
 * this extension.
 *
 * @author noorshams
 *
 */
public class CostSolverQualityAttributeDeclaration implements IAnalysisQualityAttributeDeclaration {

    private Dimension initialCost;
    private Dimension operatingCost;
    private Dimension totalCost;

    /*
     * (non-Javadoc)
     *
     * @see de.uka.ipd.sdq.dsexplore.analysis.IAnalysisQualityAttribute#getDimension()
     */
    @Override
    public boolean canEvaluateAspectForDimension(final EvaluationAspect aspect,
            final Dimension dimension) {
        return (aspect instanceof Value);
    }

    /*
     * (non-Javadoc)
     *
     * @see de.uka.ipd.sdq.dsexplore.analysis.IQualityAttribute#getDimension()
     */
    @Override
    public List<Dimension> getDimensions() {
        totalCost = new QMLDimensionReader().getDimension(
                QMLConstantsContainer.QUALITY_ATTRIBUTE_DIMENSION_TOTAL_COST_DEFINITION_PATH);
        initialCost = new QMLDimensionReader().getDimension(
                QMLConstantsContainer.QUALITY_ATTRIBUTE_DIMENSION_INITIAL_COST_DEFINITION_PATH);
        operatingCost = new QMLDimensionReader().getDimension(
                QMLConstantsContainer.QUALITY_ATTRIBUTE_DIMENSION_OPERATING_COST_DEFINITION_PATH);
        final List<Dimension> result = new ArrayList<Dimension>(3);
        result.add(totalCost);
        result.add(initialCost);
        result.add(operatingCost);
        return result;
    }

    protected Dimension getInitialCostDimension() {
        return initialCost;
    }

    protected Dimension getOperatingCostDimension() {
        return operatingCost;
    }

    @Override
    public QualityAttribute getQualityAttribute() {
        return QualityAttribute.COST_QUALITY;
    }

    protected Dimension getTotalCostDimension() {
        return totalCost;
    }

}
