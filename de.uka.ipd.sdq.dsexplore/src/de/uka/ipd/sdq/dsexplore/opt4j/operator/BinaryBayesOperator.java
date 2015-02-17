package de.uka.ipd.sdq.dsexplore.opt4j.operator;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

import org.opt4j.common.random.RandomJava;
import org.opt4j.core.Individual;
import org.opt4j.optimizer.ea.ElitismSelector;
import org.opt4j.optimizer.mopso.Particle;
import org.rosuda.REngine.REXPMismatchException;
import org.rosuda.REngine.Rserve.RserveException;

import de.uka.ipd.sdq.dsexplore.opt4j.genotype.Adapter;
import de.uka.ipd.sdq.dsexplore.opt4j.genotype.BinaryGenotype;
import de.uka.ipd.sdq.dsexplore.opt4j.genotype.DesignDecisionGenotype;
import de.uka.ipd.sdq.dsexplore.opt4j.genotype.FinalBinaryGenotype;
import de.uka.ipd.sdq.dsexplore.opt4j.optimizer.MatingBayes;
import de.uka.ipd.sdq.pcm.designdecision.Candidate;


public class BinaryBayesOperator {

	/* BinaryBayesOperator is a class
	 * that operates on a collection of Individuals.
	 * It first gets the DesignDecisionGenotypes from the 
	 * collection of Individuals, converts them to FinalBinaryGenotype.
	 * Then, MatingBayes is invoked which outputs new binary strings.
	 * These new binary strings correspond to new DesignDecisionGenotypes which are
	 * converted back to Individuals and added to the original population of Individuals.
	 * Later, some bad Individuals are discarded from the population to keep its size constant
	 */
	
	// Testing here ...
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}
	
	// The population on which the Operator works.
	Collection<Individual> Population; 
	
	// Constructors here ...
	
	public BinaryBayesOperator(){
		// Default values here
		this.Population = new ArrayList<Individual>();
	}
	
	// A more useful Constructor
	public BinaryBayesOperator(Collection<Individual> Population){
		this.Population = Population;
	}
	
	// Constructors end here ...
	
	// Methods from this point ...
	
	/* Create a method named getRefinedPopulation
	 * which operates on the Population variable of this class
	 * and returns the next iteration Population.
	 */
	
	public void getRefinedPopulation(){
		// Construct the ElitismSelector Object
		RandomJava SelectorInput = new RandomJava(0);
		ElitismSelector SelectorObject = new ElitismSelector(SelectorInput);
		// Done ...
		// Select the good individuals
		Collection<Individual> GoodIndividuals = SelectorObject.getParents(10, this.Population);
		// Give GoodIndividuals as input to getOffspring method in MatingBayes class
		MatingBayes BayesianOffspringGenerator = new MatingBayes();
		Collection<Individual> NewIndividuals = BayesianOffspringGenerator.getOffspring(10, GoodIndividuals);
		this.Population.addAll(NewIndividuals);
		this.Population.removeAll(SelectorObject.getLames(10, this.Population));
		// Ending the process here ...		
	}	
}
