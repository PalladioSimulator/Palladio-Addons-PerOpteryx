package de.uka.ipd.sdq.pcmsupport.helper;

import de.uka.ipd.sdq.dsexplore.opt4j.genotype.DesignDecisionGenotype;
import de.uka.ipd.sdq.dsexplore.opt4j.representation.ADSEModule;
import de.uka.ipd.sdq.dsexplore.opt4j.representation.DSECreator;
import de.uka.ipd.sdq.pcmsupport.designdecision.DSEProblem;

import org.opt4j.core.problem.Creator;
import org.opt4j.core.problem.Decoder;
import org.opt4j.core.problem.Evaluator;

import com.google.inject.TypeLiteral;

public class DSEModule extends ADSEModule {

	public DSEModule() {
		super();
	}

	@Override
	protected void config() {
		//bind(DSENeighbor.class).asEagerSingleton();
		
		Class<? extends Creator<?>> creator = DSECreator.class;
		Class<? extends Decoder<?, ?>> decoder = DSEProblem.class;
		Class<? extends Evaluator<?>> evaluator = DSEEvaluator.class;

		bind(new TypeLiteral<Creator<DesignDecisionGenotype>>() {}).to((Class<? extends Creator<DesignDecisionGenotype>>) DSECreator.class);


		bindProblem(creator, decoder, evaluator);

		//This did not work, so I moved it to Opt4JStarter.runTask(..)
		//bindIndividualStateListener(DSEIndividualStateListener.class);
	}

}
