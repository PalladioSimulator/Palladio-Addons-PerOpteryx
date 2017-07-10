/**
 *
 */
package edu.kit.ipd.are.dsexplore.analysis.security;

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
 * @author keim
 *
 */
public class SecuritySolverQualityAttributeDeclaration implements IAnalysisQualityAttributeDeclaration {

	public static final String qualityAttributeSecurity = QMLConstantsContainer.QUALITY_ATTRIBUTE_DIMENSION_SECURITY_PATH;

	private Dimension security;

	/* (non-Javadoc)
	 * @see de.uka.ipd.sdq.dsexplore.analysis.IQualityAttribute#getDimension()
	 */
	@Override
	public List<Dimension> getDimensions() {
		this.security = new QMLDimensionReader().getDimension(qualityAttributeSecurity);
		List<Dimension> result = new ArrayList<Dimension>(1);
		result.add(this.security);
		return result;
	}

	protected Dimension getSecurityDimension(){
		return this.security;
	}

	/* (non-Javadoc)
	 * @see de.uka.ipd.sdq.dsexplore.analysis.IAnalysisQualityAttribute#getDimension()
	 */
	@Override
	public boolean canEvaluateAspectForDimension(EvaluationAspect aspect, Dimension dimension) {
		if(aspect instanceof Value) {
			return true;
		}
		return false;
	}

	@Override
	public QualityAttribute getQualityAttribute() {
		return QualityAttribute.NEW_SECURITY_QUALITY;
	}

}
