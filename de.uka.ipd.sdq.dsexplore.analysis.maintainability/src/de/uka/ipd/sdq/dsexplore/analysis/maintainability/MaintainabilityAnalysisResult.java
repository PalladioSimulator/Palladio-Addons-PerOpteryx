package de.uka.ipd.sdq.dsexplore.analysis.maintainability;

import java.util.Map;

import org.apache.log4j.Logger;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.opt4j.core.Criterion;

import de.uka.ipd.sdq.dsexplore.analysis.IAnalysisResult;
import de.uka.ipd.sdq.dsexplore.qml.pcm.datastructures.EvaluationAspectWithContext;

public class MaintainabilityAnalysisResult implements IAnalysisResult {

	/** Logger for log4j. */
	private static Logger logger = Logger.getLogger("de.uka.ipd.sdq.dsexplore.analysis.maintainability");

	private double changeImpact;

	private Map<Criterion, EvaluationAspectWithContext> criterionToAspectMap;
	private MaintainabilityQualityAttributeDeclaration maintainabilityQualityAttributeDeclaration;

	public MaintainabilityAnalysisResult(double changeImpact,
			Map<Criterion, EvaluationAspectWithContext> criterionToAspect,
			MaintainabilityQualityAttributeDeclaration maintainabilityQualityAttributeDeclaration) {
		this.changeImpact = changeImpact;
		this.criterionToAspectMap = criterionToAspect;
		this.maintainabilityQualityAttributeDeclaration = maintainabilityQualityAttributeDeclaration;
	}

	@Override
	public double getValueFor(Criterion criterion) {
		EvaluationAspectWithContext aspect = this.criterionToAspectMap.get(criterion);
		if (aspect != null) {
			if (EcoreUtil.equals(aspect.getDimension(),
					this.maintainabilityQualityAttributeDeclaration.getChangeImpactDimension())) {
				return this.getChangeImpact();
			}
		}
		logger.warn("Unknown aspect for maintainability result, adding NaN.");
		return Double.NaN;
	}

	private double getChangeImpact() {
		return this.changeImpact;
	}

}
