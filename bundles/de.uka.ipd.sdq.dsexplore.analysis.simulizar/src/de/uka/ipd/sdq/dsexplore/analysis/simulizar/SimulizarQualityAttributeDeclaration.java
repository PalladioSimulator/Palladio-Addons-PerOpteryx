package de.uka.ipd.sdq.dsexplore.analysis.simulizar;

import org.eclipse.emf.ecore.util.EcoreUtil;

import de.uka.ipd.sdq.dsexplore.analysis.AbstractPerformanceAttributeDeclaration;
import de.uka.ipd.sdq.dsexplore.analysis.IAnalysisQualityAttributeDeclaration;
import de.uka.ipd.sdq.dsexplore.qml.contract.QMLContract.EvaluationAspect;
import de.uka.ipd.sdq.dsexplore.qml.contract.QMLContract.Mean;
import de.uka.ipd.sdq.dsexplore.qml.contracttype.QMLContractType.Dimension;

/**
 * Defines the Dimensions of this analyzer.
 *
 * @author Dominik Fuchss
 *
 */
public class SimulizarQualityAttributeDeclaration extends AbstractPerformanceAttributeDeclaration implements IAnalysisQualityAttributeDeclaration {

	public SimulizarQualityAttributeDeclaration() {
		super();

	}

	@Override
	public boolean canEvaluateAspectForDimension(EvaluationAspect aspect, Dimension dimension) {
		if (EcoreUtil.equals(dimension, this.responseTimeDimension) && aspect instanceof Mean) {
			return true;
		}
		// if (EcoreUtil.equals(dimension, this.throughputDimension) && aspect
		// instanceof Mean) {
		// return true;
		// }
		// if (EcoreUtil.equals(dimension, this.maxUtilizationDimension)) {
		// return true;
		// }
		return false;
	}

}
