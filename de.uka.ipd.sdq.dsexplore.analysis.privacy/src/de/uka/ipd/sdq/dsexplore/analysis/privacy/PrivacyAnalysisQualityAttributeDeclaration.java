package de.uka.ipd.sdq.dsexplore.analysis.privacy;

import de.uka.ipd.sdq.dsexplore.analysis.AbstractPerformanceAttributeDeclaration;
import de.uka.ipd.sdq.dsexplore.analysis.IAnalysisQualityAttributeDeclaration;
import de.uka.ipd.sdq.dsexplore.qml.contract.QMLContract.EvaluationAspect;
import de.uka.ipd.sdq.dsexplore.qml.contracttype.QMLContractType.Dimension;

public class PrivacyAnalysisQualityAttributeDeclaration extends AbstractPerformanceAttributeDeclaration implements IAnalysisQualityAttributeDeclaration {

	@Override
	public boolean canEvaluateAspectForDimension(EvaluationAspect aspect, Dimension dimension) {
		// TODO Auto-generated method stub
		return false;
	}

}
