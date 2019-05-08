package edu.kit.ipd.are.dsexplore.analysis.security;

import java.util.Map;

import org.apache.log4j.Logger;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.opt4j.core.Criterion;
import org.palladiosimulator.solver.models.PCMInstance;

import de.uka.ipd.sdq.dsexplore.analysis.IAnalysisResult;
import de.uka.ipd.sdq.dsexplore.qml.pcm.datastructures.EvaluationAspectWithContext;

public class SecurityAnalysisResult implements IAnalysisResult {

	/** Logger for log4j. */
	private static Logger logger =
			Logger.getLogger("edu.kit.ipd.are.dsexplore.analysis.security");

	private double securityCost;

	private Map<Criterion, EvaluationAspectWithContext> criterionToAspectMap;
	private SecuritySolverQualityAttributeDeclaration securityQualityDimensionDeclaration;


	public SecurityAnalysisResult(double security, PCMInstance pcmInstance2, Map<Criterion, EvaluationAspectWithContext> criterionToAspect, SecuritySolverQualityAttributeDeclaration securityQualityAttribute) {
		this.securityCost = security;
		this.criterionToAspectMap = criterionToAspect;
		this.securityQualityDimensionDeclaration = securityQualityAttribute;
	}

	@Override
	public double getValueFor(Criterion criterion)  {
		EvaluationAspectWithContext aspect = this.criterionToAspectMap.get(criterion);

		if (aspect != null){
			if (EcoreUtil.equals(aspect.getDimension(), this.securityQualityDimensionDeclaration.getSecurityDimension())){
				return this.getSecurity();
				//			} else if (EcoreUtil.equals(aspect.getDimension(), this.costQualityDimensionDeclaration.getInitialCostDimension())){
				//				return this.getInitialCost();
				//			}  else if (EcoreUtil.equals(aspect.getDimension(), this.costQualityDimensionDeclaration.getOperatingCostDimension())){
				//				return this.getOperatingCost();
			}
		}

		logger.warn("Unknown aspect for Security result, adding NaN.");
		return Double.NaN;
	}

	public double getSecurity() {
		return this.securityCost;
	}


}
