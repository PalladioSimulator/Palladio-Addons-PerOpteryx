package de.uka.ipd.sdq.dsexplore.analysis.privacy;

import java.util.Map;

import org.apache.log4j.Logger;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.opt4j.core.Criterion;
import org.palladiosimulator.solver.models.PCMInstance;

import de.uka.ipd.sdq.dsexplore.analysis.IAnalysisResult;
import de.uka.ipd.sdq.dsexplore.qml.contracttype.QMLContractType.Dimension;
import de.uka.ipd.sdq.dsexplore.qml.pcm.datastructures.EvaluationAspectWithContext;

/**
 * 
 * @author Philipp Weimann
 *
 */
public class PrivacyAnalysisResult implements IAnalysisResult {

	private static Logger logger = Logger.getLogger("de.uka.ipd.sdq.dsexplore.analysis.privacy");

	private String[] illegalDeployments;

	private Map<Criterion, EvaluationAspectWithContext> criterionToAspectMap;
	private PrivacyAnalysisQualityAttributeDeclaration privacyQualityDimensionDeclaration;

	/**
	 * 
	 * @param illegalDeployments
	 * @param criterionToAspect
	 * @param privacyQualityDimensionDeclaration
	 */
	public PrivacyAnalysisResult(String[] illegalDeployments, Map<Criterion, EvaluationAspectWithContext> criterionToAspect,
			PrivacyAnalysisQualityAttributeDeclaration privacyQualityDimensionDeclaration) {

		this.illegalDeployments = illegalDeployments;
		this.criterionToAspectMap = criterionToAspect;
		this.privacyQualityDimensionDeclaration = privacyQualityDimensionDeclaration;
	}

	@Override
	public double getValueFor(Criterion criterion) {
		EvaluationAspectWithContext aspect = this.criterionToAspectMap.get(criterion);

		if (aspect != null) {
			for (Dimension dim : this.privacyQualityDimensionDeclaration.getDimensions()) {
				if (EcoreUtil.equals(aspect.getDimension(), dim)) {
					return Math.floor((double) this.illegalDeployments.length);
				}
			}
		}

		logger.warn("Unknown aspect for Privacy Analysis result, adding NaN.");
		return Double.NaN;
	}

}
