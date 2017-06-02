package de.uka.ipd.sdq.dsexplore.analysis.privacy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import de.uka.ipd.sdq.dsexplore.analysis.IAnalysisQualityAttributeDeclaration;
import de.uka.ipd.sdq.dsexplore.launch.DSEConstantsContainer.QualityAttribute;
import de.uka.ipd.sdq.dsexplore.qml.contract.QMLContract.EvaluationAspect;
import de.uka.ipd.sdq.dsexplore.qml.contract.QMLContract.Value;
import de.uka.ipd.sdq.dsexplore.qml.contracttype.QMLContractType.Dimension;
import de.uka.ipd.sdq.dsexplore.qml.profile.QMLProfile.Requirement;

public class PrivacyAnalysisQualityAttributeDeclaration implements IAnalysisQualityAttributeDeclaration {

	private List<Dimension> privacyDims = new ArrayList<Dimension>();
	private Map<Dimension, Requirement> requirements = new HashMap<Dimension, Requirement>();

	@Override
	public List<Dimension> getDimensions() {
		return privacyDims;
	}

	public void addDimension(Dimension dim) {
		privacyDims.add(dim);
	}

	public void addRequirement(Dimension dimension, Requirement requirement) {
		requirements.put(dimension, requirement);
	}

	public Requirement getRequirement(Dimension dimension) {
		requirements.get(dimension);
		return requirements.get(dimension);
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
		return QualityAttribute.PIVACY_QUALITY;
	}

}
