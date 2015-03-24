package de.uka.ipd.sdq.dsexplore.opt4j.operator;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

import org.opt4j.common.random.Rand;
import org.opt4j.common.random.RandomJava;
import org.opt4j.core.Individual;
import org.opt4j.operator.crossover.Crossover;
import org.opt4j.optimizer.ea.ElitismSelector;
import org.opt4j.optimizer.ea.Pair;
import org.opt4j.optimizer.mopso.Particle;
import org.rosuda.JRI.Rengine;
import org.rosuda.REngine.REXPMismatchException;
import org.rosuda.REngine.Rserve.RConnection;
import org.rosuda.REngine.Rserve.RserveException;

import com.google.inject.Inject;

import de.uka.ipd.sdq.dsexplore.opt4j.genotype.Adapter;
import de.uka.ipd.sdq.dsexplore.opt4j.genotype.BinaryGenotype;
import de.uka.ipd.sdq.dsexplore.opt4j.genotype.DesignDecisionGenotype;
import de.uka.ipd.sdq.dsexplore.opt4j.genotype.FinalBinaryGenotype;
import de.uka.ipd.sdq.dsexplore.opt4j.optimizer.MatingBayes;
import de.uka.ipd.sdq.dsexplore.opt4j.optimizer.WriteFile;
import de.uka.ipd.sdq.pcm.designdecision.Candidate;
import de.uka.ipd.sdq.pcm.designdecision.designdecisionFactory;

/**  
 * Operator to operate on a collection of 
 * {@link DesignDecisionGenotype}
 * @author Apoorv
 *
 */
public class BinaryBayesOperator implements BayesianCrossover<DesignDecisionGenotype> {
	
	//private Adapter adapter;
	/*
	private int NumberOfGenomes; // Stores the number of Genomes one wants as output
	private String SearchAlgorithm; // Specify whether 'tabu' or 'hc'
	private String ScoreMethod; // Can be 'loglik', 'aic','bic',bde', 'k2'
	private int IterationNumber; // Stores the Iteration number value
	*/
	private Rand random;
	@Inject
	public BinaryBayesOperator(Rand random) {
		this.random = random;
		//this.adapter = adapter;
	}
	
	@Override
	public Pair<DesignDecisionGenotype> crossover(DesignDecisionGenotype arg0,
			DesignDecisionGenotype arg1) {
		// TODO Auto-generated method stub
		
		return null;
	}
	@Override
	public List<DesignDecisionGenotype> crossover(List<DesignDecisionGenotype> parents) {
		// TODO Auto-generated method stub
		Adapter adapter = new Adapter();
		
		
		List<FinalBinaryGenotype> FBGenotypeList = new ArrayList<FinalBinaryGenotype>();
		for(int i = 0 ; i < parents.size() ; i++){
			List<BinaryGenotype> BGenotypeList = adapter.translateDesignDecisionGenotype(parents.get(i));
			FBGenotypeList.add(new FinalBinaryGenotype(BGenotypeList));
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
		
		try {
			int[][] Offspring = getSampledGenomes(BinaryGenesint);
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
				DDGenotypeOffspringList.add(adapter.translateFinalBinaryGenotype(FBGenotypeOffspringList.get(i)));
			}
			// Got the DesignDecisionGenotype list of Offsprings.
			return DDGenotypeOffspringList;
		} catch (RserveException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (REXPMismatchException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	
	/** A method to process on the data (which consists of 1s and 0s)
	 * and sample new data from the learned 
	 * Bayesian Structure. This method first constructs a Bayesian
	 * Network out of the input data and then samples new data out of it
	 * and gives it as an output.
	*/
	private int[][] getSampledGenomes(int[][] currentGenomes) throws REXPMismatchException,RserveException{
		/* This method learns the Bayesian Structure by considering
		 * currentGenomes as the input data. The control is passed
		 * to the R function in file Bayesopt.R, which learns the 
		 * Bayesian Structure and samples new data.
		*/
		
		int NumberOfGenomes = 10; // Stores the number of Genomes one wants as output
		String SearchAlgorithm = "tabu"; // Specify whether 'tabu' or 'hc'
		String ScoreMethod = "loglik"; // Can be 'loglik', 'aic','bic',bde', 'k2'
		int IterationNumber  = 1;
		
		// Copy currentGenomes to file data.txt
		String file_name = "C:/Users/Hp/Documents/R/data.txt";
		WriteFile data = new WriteFile(file_name,true);
		for(int i=1;i<=currentGenomes.length;i++){
		  	String myData = "     "+Integer.toString(currentGenomes[i-1][0]);
		   	for(int idx=1;idx<=currentGenomes[0].length-1;idx++){	
		   		myData = myData + "     "+Integer.toString(currentGenomes[i-1][idx]);        		       	
		   	}
		    
		   	try {
				data.writeToFile(myData);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		   	}
		    
		// End of writing data
		
		//<-------------------------------------------------->
		// Start the connection to R software    
		Rengine RserveStarter = new Rengine();
		// This just reports whether R was running and we connected to it, or whether we started it.
		if (RserveStarter.isStandAlone()) System.out.println("R initialised by java");
		RserveStarter.eval("library(Rserve)");
		RserveStarter.eval("Rserve()");
		// This patch of code starts Rserve ... 
		//<-------------------------------------------------->
		// The next written code is intact ...
		RConnection RCommunicator= new RConnection();   
		RCommunicator.eval("source(\"C:/Users/Hp/Documents/R/Bayesopt.R\")");
		RCommunicator.assign("z", Integer.toString(NumberOfGenomes));
		RCommunicator.eval("z=strtoi(z)");
		RCommunicator.assign("SearchAlgo", SearchAlgorithm);
		RCommunicator.assign("ScoreMeth", ScoreMethod);
		RCommunicator.assign("iteration", Integer.toString(IterationNumber));
		RCommunicator.eval("iteration=strtoi(iteration)");
		
		double[][] Offspring= RCommunicator.eval("BayesNetOperator(z,SearchAlgo,iteration)").asDoubleMatrix();
		// Convert double matrix to int matrix
		int[][] FinalOffspring = new int[NumberOfGenomes][Offspring[1].length];
		for(int i=0;i<NumberOfGenomes;i++){
		   	for(int j=0;j<Offspring[1].length;j++){
		   		if(Offspring[i][j]<=0){
		   			FinalOffspring[i][j]=0;
		   		}else{
		   			FinalOffspring[i][j]=1;
		   		}
		   	}
		   }
		    
		return FinalOffspring;		
	}
	
	
}
