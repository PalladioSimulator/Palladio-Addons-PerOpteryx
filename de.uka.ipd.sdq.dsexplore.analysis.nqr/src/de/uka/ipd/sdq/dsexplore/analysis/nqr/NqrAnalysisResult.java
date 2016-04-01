package de.uka.ipd.sdq.dsexplore.analysis.nqr;

import java.util.List;
import java.util.Map;

import org.apache.log4j.Logger;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.opt4j.core.Criterion;

import de.uka.ipd.sdq.dsexplore.analysis.IAnalysisResult;
import de.uka.ipd.sdq.dsexplore.qml.dimensions.Dimension;
import de.uka.ipd.sdq.dsexplore.qml.pcm.datastructures.EvaluationAspectWithContext;
import de.uka.ipd.sdq.nqr.Nqr;
import de.uka.ipd.sdq.pcm.nqr.helper.NqrUtil;

public class NqrAnalysisResult implements IAnalysisResult {
	
	/** Logger for log4j. */
	private static Logger logger = 
		Logger.getLogger("de.uka.ipd.sdq.dsexplore.analysis.nqr");

	private Map<Criterion, EvaluationAspectWithContext> criterionToAspectMap;
	private NqrSolverQualityAttributeDeclaration nqrQualityDimensionDeclaration;
	private List<Nqr> nqr;

	public NqrAnalysisResult(Map<Criterion, EvaluationAspectWithContext> criterionToAspect, List<Nqr> nqr, NqrSolverQualityAttributeDeclaration nqrQualityDimensionDeclaration) {
		this.criterionToAspectMap = criterionToAspect;
		this.nqrQualityDimensionDeclaration = nqrQualityDimensionDeclaration;
		this.nqr = nqr;
	}
	
	@Override
	public double getValueFor(Criterion criterion)  {
		EvaluationAspectWithContext aspect = this.criterionToAspectMap.get(criterion);
		double result = Integer.MIN_VALUE;
		
		if (aspect != null){
			for (Dimension dim: nqrQualityDimensionDeclaration.getDimensions())
			{
				if (EcoreUtil.equals(aspect.getDimension(), dim))
				{
					nqrQualityDimensionDeclaration.getRequirement(dim);
					for (int i = 0; i < nqr.size(); ++i)
						for (int j = 0; j < nqr.get(i).getCriterion().size(); ++j)
						{
							if (EcoreUtil.equals(dim, nqr.get(i).getCriterion().get(j).getDimension()))
								result = NqrUtil.getNqrValue(aspect.getCriterion(), nqr.get(i).getCriterion().get(j));
						}
				}
			}
			return result;
		} 
		
		logger.warn("Unknown aspect for Nqr result, adding NaN.");
		return Double.NaN;
	}

}
