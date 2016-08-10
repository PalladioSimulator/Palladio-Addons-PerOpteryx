package de.uka.ipd.sdq.dsexplore.opt4j.operator;

import org.eclipse.emf.ecore.util.EcoreUtil.Copier;
import org.opt4j.common.random.Rand;
import org.opt4j.operator.crossover.Crossover;
import org.opt4j.optimizer.ea.Pair;

import com.google.inject.Inject;

import de.uka.ipd.sdq.dsexplore.opt4j.genotype.DesignDecisionGenotype;
import de.uka.ipd.sdq.pcm.designdecision.Choice;

/**
 * Uniform crossover implementation. For each gene of the first offspring, 
 * it is randomly decided whether the value of parent 1 or parent 2 is taken.
 * The second offspring then is the opposite.  
 * 
 * @author martens
 *
 */
public class UniformDesignDecisionGenotypeCrossover implements Crossover<DesignDecisionGenotype>  {

	private Rand random;

	@Inject
	public UniformDesignDecisionGenotypeCrossover(Rand random) {
		this.random = random;
	}

	@Override
	public Pair<DesignDecisionGenotype> crossover(DesignDecisionGenotype parent1, DesignDecisionGenotype parent2) {
		
		DesignDecisionGenotype o1 = parent1.newInstance();
		DesignDecisionGenotype o2 = parent2.newInstance();

		if (parent1.size() != parent2.size()){
			throw new RuntimeException("Two genomes do not have the same length: "+parent1 + " and "+parent2);
		}
		Copier copy = new Copier();
		int size = parent2.size();
		for (int i = 0; i < size; i++) {
			if (this.random.nextBoolean()){
				o1.add((Choice) copy.copy(parent1.get(i)));
				o2.add((Choice) copy.copy(parent2.get(i)));
				copy.copyReferences();
			} else {
				o1.add((Choice) copy.copy(parent2.get(i)));
				o2.add((Choice) copy.copy(parent1.get(i)));
				copy.copyReferences();
			}
		}
		Pair<DesignDecisionGenotype> offspring = new Pair<DesignDecisionGenotype>(o1, o2);
		return offspring;
	}

}
