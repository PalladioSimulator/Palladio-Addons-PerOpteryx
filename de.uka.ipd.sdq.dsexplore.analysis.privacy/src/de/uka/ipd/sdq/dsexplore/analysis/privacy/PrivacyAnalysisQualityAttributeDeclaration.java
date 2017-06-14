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
import de.uka.ipd.sdq.dsexplore.qml.reader.QMLDimensionReader;

/**
 * This class declares, which {@code Dimension} and {@code EvaluationAspect} can
 * be evaluated by this extension.
 * 
 * @author Philipp Weimann
 * @author Robert Heinrich
 */
public class PrivacyAnalysisQualityAttributeDeclaration implements IAnalysisQualityAttributeDeclaration {

	private List<Dimension> privacyDims = null;
	private Map<Dimension, Requirement> requirements = new HashMap<Dimension, Requirement>();

	@Override
	public List<Dimension> getDimensions() {
		if (privacyDims == null) {
			privacyDims = new ArrayList<Dimension>();
			Dimension privacyDim = new QMLDimensionReader()
					.getDimension("platform:/plugin/de.uka.ipd.sdq.dsexplore.analysis.privacy/res/Dimension_privacy.qmlcontracttype");
			privacyDims.add(privacyDim);
		}

		return privacyDims;
	}

	/**
	 * @param dim
	 *            the PrivacyAnalysis Dimension
	 */
	public void addDimension(Dimension dim) {
		privacyDims.add(dim);
	}

	/**
	 * @param dimension
	 *            the dimension
	 * @param requirement
	 *            the requirement
	 */
	public void addRequirement(Dimension dimension, Requirement requirement) {
		requirements.put(dimension, requirement);
	}

	/**
	 * @param dimension
	 *            the according requirement
	 * @return the dimension
	 */
	public Requirement getRequirement(Dimension dimension) {
		return requirements.get(dimension);
	}

	@Override
	public boolean canEvaluateAspectForDimension(EvaluationAspect aspect, Dimension dimension) {
		for (Dimension privacyDimension : this.privacyDims)
			if (dimension.getId().equals(privacyDimension.getId()))
				if (aspect instanceof Value) {
					return true;
				}
		return false;
	}

	@Override
	public QualityAttribute getQualityAttribute() {
		return QualityAttribute.PRIVACY_QUALITY;
	}

}
