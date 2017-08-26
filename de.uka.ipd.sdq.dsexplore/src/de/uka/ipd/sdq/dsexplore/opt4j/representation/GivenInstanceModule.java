package de.uka.ipd.sdq.dsexplore.opt4j.representation;

import org.opt4j.config.annotations.Info;
import org.opt4j.config.annotations.Order;
import org.opt4j.core.Genotype;
import org.opt4j.core.IndividualFactory;
import org.opt4j.core.optimizer.MaxIterations;
import org.opt4j.core.optimizer.OptimizerModule;
import org.opt4j.operator.copy.Copy;

import com.google.inject.TypeLiteral;

import de.uka.ipd.sdq.dsexplore.opt4j.operator.CopyDesignDecisionGenotype;
import de.uka.ipd.sdq.dsexplore.opt4j.optimizer.PredefinedInstanceEvaluator;

public class GivenInstanceModule extends OptimizerModule {

	@Info("The number of generations.")
	@Order(0)
	@MaxIterations	
	//not needed for this module, but otherwise Guice throws an error.
	protected int generations = 1000;
	
	@Override
	protected void config() {
		bindOptimizer(PredefinedInstanceEvaluator.class);
		
		bind(IndividualFactory.class).to(DSEIndividualFactory.class);
		
		bind(new TypeLiteral<Copy<Genotype>>() {}).to((Class<? extends Copy<Genotype>>) CopyDesignDecisionGenotype.class);
				
	}
	
	/**
	 * Returns the number of generations.
	 * 
	 * @return the number of generations
	 */
	public int getGenerations() {
		return generations;
	}
	
	/**
	 * Sets the number of generations.
	 * 
	 * @param generations
	 *            the number of generations
	 */
	public void setGenerations(int generations) {
		this.generations = generations;
	}

}
