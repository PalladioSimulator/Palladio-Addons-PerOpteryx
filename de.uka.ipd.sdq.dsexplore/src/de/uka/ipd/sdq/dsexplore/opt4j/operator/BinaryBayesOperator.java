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
		
		// Convert GoodIndividuals to list of DesignDecisionGenotype objects
		List<DesignDecisionGenotype> DDGenotypeList = new ArrayList<DesignDecisionGenotype>();
		Iterator IndividualIterator = GoodIndividuals.iterator();
		for(int i=0; i< GoodIndividuals.size();i++){
			Individual individual = (Individual) IndividualIterator.next();
			DDGenotypeList.add((DesignDecisionGenotype) individual.getGenotype());
		}
		
		// Now convert DDGenotypeList to a list of FinalBinaryGenotype objects
		List<FinalBinaryGenotype> FBGenotypeList = new ArrayList<FinalBinaryGenotype>();
		Adapter TranslatorObj = new Adapter();
		for(int i=0;i<DDGenotypeList.size();i++){		
			List<BinaryGenotype> IntermediateList = TranslatorObj.translateDesignDecisionGenotype(DDGenotypeList.get(i));
			FinalBinaryGenotype FBObj = new FinalBinaryGenotype(IntermediateList);
			FBGenotypeList.add(FBObj);
		}
		
		// Now create a 2-D matrix using the info in FBGenotypeList.
		// Each row corresponds to an individual
		Integer[][] BinaryGenes = new Integer[FBGenotypeList.size()][FBGenotypeList.get(0).getBinaryGenotype().size()];
		for(int i=0;i<FBGenotypeList.size();i++){
			FBGenotypeList.get(i).getBinaryGenotype().toArray(BinaryGenes[i]);
		}
		// Finally convert BinaryGenes from Integer[][] to int[][]
		int[][] BinaryGenesint = new int[BinaryGenes.length][BinaryGenes[0].length];
		for(int i=0;i<BinaryGenes.length;i++){
			for(int j=0;j< BinaryGenes[0].length;j++){
				BinaryGenesint[i][j] = (int) BinaryGenes[i][j];
			}
		}
		// Give BinaryGenes as input to getOffspring method in class MatingBayes
		MatingBayes OffspringGenerator = new MatingBayes();
		try {
			int[][] Offspring = OffspringGenerator.getOffspring(BinaryGenesint);
			// Got the Offspring !!!
			// Now convert back to List of FBGenotype objects
			List<FinalBinaryGenotype> FBGenotypeOffspringList = new ArrayList<FinalBinaryGenotype>();
			for(int i=0;i<Offspring.length;i++){
				List<Integer> GeneratedOffspringList = new ArrayList<Integer>();
				for(int j=0;j<Offspring[0].length;j++){
					GeneratedOffspringList.add(Offspring[i][j]);
				}
				// Create a FBGenotype object
				FinalBinaryGenotype FBOffspringObj = new FinalBinaryGenotype();
				FBOffspringObj.setBinaryGenotype(GeneratedOffspringList);
				FBOffspringObj.setBitsPerDegree(FBGenotypeList.get(0).getBitsPerDegree());
				FBOffspringObj.setOrderOfDegrees(FBGenotypeList.get(0).getOrderOfDegrees());
				FBGenotypeOffspringList.add(FBOffspringObj);
			}
			// You have the list of Offsprings as a list of FinalBinaryGenotype Objects
			// Now convert them to DesignDecisionGenotype object list
			List<DesignDecisionGenotype> DDGenotypeOffspringList = new ArrayList<DesignDecisionGenotype>();
			for(int i = 0;i<FBGenotypeOffspringList.size();i++){
				DDGenotypeOffspringList.add(TranslatorObj.translateFinalBinaryGenotype(FBGenotypeOffspringList.get(i)));
			}
			// Got the DesignDecisionGenotype list of Offsprings.
			List<Individual> IndividualOffspringList = new ArrayList<Individual>();
			for(int i = 0;i<DDGenotypeOffspringList.size();i++){
				// Create a new Individual object
				Individual IndividualObj = new Particle();
				IndividualObj = (Individual) IndividualObj;
				IndividualObj.setGenotype(DDGenotypeOffspringList.get(i));
				IndividualOffspringList.add(IndividualObj);
			}
			this.Population.addAll(IndividualOffspringList);
			this.Population.removeAll(SelectorObject.getLames(10, this.Population));
			// End the process here ...
		} catch (RserveException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (REXPMismatchException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}	
}
