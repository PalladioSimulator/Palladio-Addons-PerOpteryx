/**
 *
 */
package edu.kit.ipd.are.dsexplore.analysis.sec;

import java.util.ArrayList;
import java.util.List;

import de.uka.ipd.sdq.dsexplore.analysis.IAnalysisQualityAttributeDeclaration;
import de.uka.ipd.sdq.dsexplore.launch.DSEConstantsContainer.QualityAttribute;
import de.uka.ipd.sdq.dsexplore.qml.contract.QMLContract.EvaluationAspect;
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

	// adapt QMLConstantsContainer with:
	// public static final String QUALITY_ATTRIBUTE_DIMENSION_SECURITY_PATH =
	// "platform:/resource/BRSOptimisationTactics/QMLSecurity/Security.qmlcontracttype";

	// and add it to the QUALITY_ATTRIBUTE_DIMENSION_DEFINITION_PATHS

	private Dimension securityValue;

	/* (non-Javadoc)
	 * @see de.uka.ipd.sdq.dsexplore.analysis.IQualityAttribute#getDimension()
	 */
	@Override
	public List<Dimension> getDimensions() {
		// TODO neue Dimension erstellen
		this.securityValue = new QMLDimensionReader().getDimension(qualityAttributeSecurity);
		List<Dimension> result = new ArrayList<Dimension>(1); // TODO
		result.add(this.securityValue);
		return result;
	}


	public Dimension getSecurityValue() {
		return this.securityValue;
	}

	/* (non-Javadoc)
	 * @see de.uka.ipd.sdq.dsexplore.analysis.IAnalysisQualityAttribute#getDimension()
	 */
	@Override
	public boolean canEvaluateAspectForDimension(EvaluationAspect aspect, Dimension dimension) {
		// if(aspect instanceof Value) {
		// return true;
		// }
		// return false;
		return true;
	}

	@Override
	public QualityAttribute getQualityAttribute() {
		return QualityAttribute.NEW_SECURITY_QUALITY;
	}

}
