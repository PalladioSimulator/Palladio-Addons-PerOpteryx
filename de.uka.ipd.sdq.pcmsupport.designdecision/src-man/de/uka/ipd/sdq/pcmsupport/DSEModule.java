package de.uka.ipd.sdq.pcmsupport;

import de.uka.ipd.sdq.dsexplore.opt4j.representation.ADSEModule;
import de.uka.ipd.sdq.dsexplore.opt4j.representation.DSECreator;
import de.uka.ipd.sdq.pcmsupport.analysis.DSEEvaluator;

import org.opt4j.core.problem.Creator;
import org.opt4j.core.problem.Decoder;
import org.opt4j.core.problem.Evaluator;

public class DSEModule extends ADSEModule {

	@Override
	protected Class<? extends Creator<?>> getCreatorClass() {
		return DSECreator.class;
	}

	@Override
	protected Class<? extends Evaluator<?>> getEvaluatorClass() {
		return DSEEvaluator.class;
	}

	@Override
	protected Class<? extends Decoder<?, ?>> getDecoderClass() {
		return DSEDecoder.class;
	}

}
