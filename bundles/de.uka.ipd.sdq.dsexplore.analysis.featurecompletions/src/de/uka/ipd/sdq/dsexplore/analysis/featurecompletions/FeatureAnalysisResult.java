package de.uka.ipd.sdq.dsexplore.analysis.featurecompletions;

import org.apache.log4j.Logger;
import org.opt4j.core.Criterion;

import de.uka.ipd.sdq.dsexplore.analysis.IAnalysisResult;

public class FeatureAnalysisResult implements IAnalysisResult {

	/** Logger for log4j. */
	private static Logger logger = Logger.getLogger("de.uka.ipd.sdq.dsexplore.analysis.featurecompletions");

	public FeatureAnalysisResult() {
	}

	@Override
	public double getValueFor(Criterion criterion) {
		return Double.NaN;
	}

}
