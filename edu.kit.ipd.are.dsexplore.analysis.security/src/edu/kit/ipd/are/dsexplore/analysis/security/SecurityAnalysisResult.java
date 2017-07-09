package edu.kit.ipd.are.dsexplore.analysis.security;

import org.apache.log4j.Logger;
import org.opt4j.core.Criterion;

import de.uka.ipd.sdq.dsexplore.analysis.IAnalysisResult;

public class SecurityAnalysisResult implements IAnalysisResult {

	/** Logger for log4j. */
	private static Logger logger =
			Logger.getLogger("edu.kit.ipd.are.dsexplore.analysis.security");

	private double securityValue;
	private SecuritySolverQualityAttributeDeclaration securityQualityAttribute;

	public SecurityAnalysisResult(double securityValue,
			SecuritySolverQualityAttributeDeclaration securityQualityAttribute) {
		this.securityValue = securityValue;
		this.securityQualityAttribute = securityQualityAttribute;
	}

	@Override
	public double getValueFor(Criterion criterion)  {
		logger.warn("Unknown aspect for LQN result, adding NaN.");
		return Double.NaN;
	}

	public double getSecurityValue() {
		return this.securityValue;
	}
}
