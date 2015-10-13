package de.uka.ipd.sdq.dsexplore.opt4j.operator;

import java.util.List;

import org.opt4j.core.Genotype;
import org.opt4j.operator.crossover.Crossover;

public interface BayesianCrossover<G extends Genotype> extends Crossover<G>{
	
	public List<G> crossover(List<G> individuals);

}
