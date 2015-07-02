package de.uka.ipd.sdq.dsexplore.analysis.nqr;

import java.util.HashMap;
import java.util.Map;

import org.apache.log4j.Logger;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.opt4j.core.Criterion;

import de.uka.ipd.sdq.dsexplore.analysis.IAnalysisResult;
import de.uka.ipd.sdq.dsexplore.qml.contracttype.QMLContractType.Dimension;
import de.uka.ipd.sdq.dsexplore.qml.pcm.datastructures.EvaluationAspectWithContext;
import de.uka.ipd.sdq.dsexplore.qml.profile.QMLProfile.Requirement;
import de.uka.ipd.sdq.pcmsolver.models.PCMInstance;

public class NqrAnalysisResult implements IAnalysisResult {
	
	/** Logger for log4j. */
	private static Logger logger = 
		Logger.getLogger("de.uka.ipd.sdq.dsexplore.analysis.nqr");

	private Map<Criterion, EvaluationAspectWithContext> criterionToAspectMap;
	private NqrSolverQualityAttributeDeclaration nqrQualityDimensionDeclaration;
	private Map<Criterion, Double> criterionToValueMap = new HashMap<Criterion, Double>();

	public NqrAnalysisResult(Criterion crit, double val, Map<Criterion, EvaluationAspectWithContext> criterionToAspect, NqrSolverQualityAttributeDeclaration nqrQualityDimensionDeclaration) {
		this.criterionToAspectMap = criterionToAspect;
		this.nqrQualityDimensionDeclaration = nqrQualityDimensionDeclaration;
	}
	
	public void addCriterionResult(Criterion crit, double critValue)
	{
		criterionToValueMap.put(crit, critValue);
	}

	@Override
	public double getValueFor(Criterion criterion)  {
		EvaluationAspectWithContext aspect = this.criterionToAspectMap.get(criterion);
		
		if (aspect != null){
			for (Dimension dim: nqrQualityDimensionDeclaration.getDimensions())
			{
				if (EcoreUtil.equals(aspect.getDimension(), dim))
					nqrQualityDimensionDeclaration.getRequirement(dim);
				return 42d;
			}
		} 
		
		logger.warn("Unknown aspect for LQN result, adding NaN.");
		return Double.NaN;
	}

}
