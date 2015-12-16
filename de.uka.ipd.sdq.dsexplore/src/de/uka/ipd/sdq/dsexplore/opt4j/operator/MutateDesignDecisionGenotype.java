package de.uka.ipd.sdq.dsexplore.opt4j.operator;

import org.opt4j.common.random.Rand;
import org.opt4j.genotype.DoubleGenotype;
import org.opt4j.genotype.IntegerGenotype;
import org.opt4j.operator.mutate.Mutate;
import org.opt4j.operator.mutate.MutateDouble;
import org.opt4j.operator.mutate.MutateInteger;
import org.opt4j.operator.mutate.MutationRate;

import com.google.inject.Inject;

import de.uka.ipd.sdq.dsexplore.opt4j.genotype.DesignDecisionGenotype;
import genericdesigndecision.Choice;


/**
 * Mutator for {@link DesignDecisionGenotype}s. Calls the bound {@link MutateInteger} or {@link MutateDouble}, depending on 
 * the type of {@link DegreeOfFreedomInstance} of each gene. 
 * 
 * @author martens
 *
 */
public class MutateDesignDecisionGenotype implements Mutate<DesignDecisionGenotype> {
	
	private MutateInteger mutateInteger;
	private MutateDouble mutateDouble;
	private MutationRate mutationRate;
	private Rand random;
	
	@Inject
	public MutateDesignDecisionGenotype(Rand random, MutateInteger mutateInteger, MutateDouble mutateDouble, MutationRate rate){
		 this.mutateDouble = mutateDouble;
		 this.mutateInteger = mutateInteger;
		 this.mutationRate = rate;
		 this.random = random; 
	}

	/**
	 * Mutates the passed {@link DesignDecisionGenotype} by calling a matching {@link Mutate}
	 * for each gene.
	 */
	@Override
	public void mutate(DesignDecisionGenotype genotype, double mutationRate) {
		for (Choice choice : genotype) {
			if (random.nextDouble() < mutationRate) {
				if(choice.getDofInstance() == null) {
					throw new UnsupportedOperationException("Choice type "+choice+" not supported.");
				}
				choice.mutate(this);
			}
		}
	}

	public double mutateDouble(double oldValue, double lowerBound, double upperBound) {
		DoubleGenotype doubleGenotype = new DoubleGenotype(lowerBound, upperBound);
		doubleGenotype.add(oldValue);
		this.mutateDouble.mutate(doubleGenotype, this.mutationRate.get());
		double newValue = doubleGenotype.get(0);
		return newValue;
	}

	public int mutateInteger(int oldValue, int lowerBound, int upperBound) {
		IntegerGenotype integerGenotype = new IntegerGenotype(lowerBound, upperBound);
		integerGenotype.add(oldValue);
		this.mutateInteger.mutate(integerGenotype, this.mutationRate.get());
		int newValue = integerGenotype.get(0);
		return newValue;
	}

}
