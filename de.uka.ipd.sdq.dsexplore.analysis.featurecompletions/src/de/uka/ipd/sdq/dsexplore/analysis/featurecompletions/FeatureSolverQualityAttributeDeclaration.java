/**
 *
 */
package de.uka.ipd.sdq.dsexplore.analysis.featurecompletions;

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
 * This class declares, which {@code Dimension} and {@code EvaluationAspect} can
 * be evaluated by this extension.
 *
 * @author noorshams
 *
 */
public class FeatureSolverQualityAttributeDeclaration implements IAnalysisQualityAttributeDeclaration {

	public static final String qualityHasFeature = QMLConstantsContainer.QUALITY_ATTRIBUTE_DIMENSION_HASFEATURE_PATH;

	private Dimension isFeature;

	@Override
	public List<Dimension> getDimensions() {
		this.isFeature = new QMLDimensionReader().getDimension(FeatureSolverQualityAttributeDeclaration.qualityHasFeature);
		List<Dimension> result = new ArrayList<>(1);
		result.add(this.isFeature);
		return result;
	}

	@Override
	public boolean canEvaluateAspectForDimension(EvaluationAspect aspect, Dimension dimension) {
		if (aspect instanceof Value) {
			return true;
		}
		return false;
	}

	@Override
	public QualityAttribute getQualityAttribute() {
		return QualityAttribute.FEATURE_QUALITY;
	}

}
