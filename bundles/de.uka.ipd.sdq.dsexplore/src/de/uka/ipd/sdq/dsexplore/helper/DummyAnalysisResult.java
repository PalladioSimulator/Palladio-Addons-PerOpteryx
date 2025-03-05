package de.uka.ipd.sdq.dsexplore.helper;

import org.opt4j.core.Criterion;
import org.palladiosimulator.solver.core.models.PCMInstance;

import de.uka.ipd.sdq.dsexplore.analysis.IAnalysisResult;

public class DummyAnalysisResult implements IAnalysisResult {

	public DummyAnalysisResult(PCMInstance pcmInstance) {
		
	}

	@Override
	public double getValueFor(Criterion criterion){
		return 0;
	}


}
