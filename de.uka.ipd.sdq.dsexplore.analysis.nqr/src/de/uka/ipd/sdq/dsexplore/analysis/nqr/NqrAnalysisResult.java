package de.uka.ipd.sdq.dsexplore.analysis.nqr;

import java.util.Map;

import org.apache.log4j.Logger;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.opt4j.core.Criterion;

import de.uka.ipd.sdq.dsexplore.analysis.IAnalysisResult;
import de.uka.ipd.sdq.dsexplore.qml.contracttype.QMLContractType.Dimension;
import de.uka.ipd.sdq.dsexplore.qml.pcm.datastructures.EvaluationAspectWithContext;
import de.uka.ipd.sdq.pcm.nqr.helper.NqrUtil;

public class NqrAnalysisResult implements IAnalysisResult {
	
	/** Logger for log4j. */
	private static Logger logger = 
		Logger.getLogger("de.uka.ipd.sdq.dsexplore.analysis.nqr");

	private Map<Criterion, EvaluationAspectWithContext> criterionToAspectMap;
	private NqrSolverQualityAttributeDeclaration nqrQualityDimensionDeclaration;
	private de.uka.ipd.sdq.dsexplore.qml.contract.QMLContract.Criterion targetCrit;

	public NqrAnalysisResult(Map<Criterion, EvaluationAspectWithContext> criterionToAspect, de.uka.ipd.sdq.dsexplore.qml.contract.QMLContract.Criterion targetCrit, NqrSolverQualityAttributeDeclaration nqrQualityDimensionDeclaration) {
		this.criterionToAspectMap = criterionToAspect;
		this.nqrQualityDimensionDeclaration = nqrQualityDimensionDeclaration;
		this.targetCrit = targetCrit;
	}
	
	@Override
	public double getValueFor(Criterion criterion)  {
		EvaluationAspectWithContext aspect = this.criterionToAspectMap.get(criterion);
		
		if (aspect != null){
			for (Dimension dim: nqrQualityDimensionDeclaration.getDimensions())
			{
				if (EcoreUtil.equals(aspect.getDimension(), dim))
				{
					nqrQualityDimensionDeclaration.getRequirement(dim);
					return NqrUtil.getNqrValue(aspect.getCriterion(), targetCrit);
				}
			}
		} 
		
		logger.warn("Unknown aspect for Nqr result, adding NaN.");
		return Double.NaN;
	}

}
