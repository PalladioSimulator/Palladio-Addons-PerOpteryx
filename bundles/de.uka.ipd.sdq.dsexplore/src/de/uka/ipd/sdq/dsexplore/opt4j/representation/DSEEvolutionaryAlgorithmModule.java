package de.uka.ipd.sdq.dsexplore.opt4j.representation;

import org.opt4j.core.Genotype;
import org.opt4j.core.IndividualFactory;
import org.opt4j.operator.copy.Copy;
import org.opt4j.operator.mutate.Mutate;
import org.opt4j.optimizer.ea.ConstantCrossoverRate;
import org.opt4j.optimizer.ea.Coupler;
import org.opt4j.optimizer.ea.CouplerUnique;
import org.opt4j.optimizer.ea.CrossoverRate;
import org.opt4j.optimizer.ea.EvolutionaryAlgorithmModule;

import com.google.inject.TypeLiteral;

import de.uka.ipd.sdq.dsexplore.opt4j.operator.CopyDesignDecisionGenotype;
import de.uka.ipd.sdq.dsexplore.opt4j.operator.MutateDesignDecisionGenotype;
import de.uka.ipd.sdq.dsexplore.opt4j.optimizer.NoDuplicatesEvolutionaryAlgorithm;
import de.uka.ipd.sdq.tcfmoop.tcmanager.TerminationCriteriaManager;
public class DSEEvolutionaryAlgorithmModule extends EvolutionaryAlgorithmModule {
	
	
	/*
	 * (non-Javadoc)
	 * 
	 * @see org.opt4j.start.Opt4JModule#config()
	 */
	@Override
	public void config() {
		
/*       TODO try to get rid of NoDuplicatesEvolutionaryAlgorithm as I have found out that there is the CouplerUnique
		 which should already do the intended, i.e. make sure that there are no duplicate candidates in the offspring 
		 Need to implement the other feature of NoDuplicatesEvolutionaryAlgorithm, namely that a predefined starting population 
		 can be used(?), differently. */
		bindOptimizer(NoDuplicatesEvolutionaryAlgorithm.class);
		bind(Coupler.class).to(CouplerUnique.class).in(SINGLETON);
		
		bind(CrossoverRate.class).to(ConstantCrossoverRate.class).in(SINGLETON);
		
		bind(IndividualFactory.class).to(DSEIndividualFactory.class);
		
	
		bind(new TypeLiteral<Mutate<Genotype>>() {}).to((Class<? extends Mutate<Genotype>>) MutateDesignDecisionGenotype.class);
		
		bind(new TypeLiteral<Copy<Genotype>>() {}).to((Class<? extends Copy<Genotype>>) CopyDesignDecisionGenotype.class);

		addOptimizerIterationListener(TerminationCriteriaManager.class);

		// To exchange the selector, we cannot do the following because then the binding will be attempted twice and an exception is thrown. Thus, reimplement the selector module. 
		//bind(Selector.class).to(Nsga2.class).in(SINGLETON);
		//bind(Selector.class).to(Spea2.class).in(SINGLETON);
	}
	
}
