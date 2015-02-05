package de.uka.ipd.sdq.dsexplore.opt4j.optimizer;

import java.io.IOException;

import org.rosuda.REngine.REXPMismatchException;
import org.rosuda.REngine.Rserve.RConnection;
import org.rosuda.REngine.Rserve.RserveException;

import de.uka.ipd.sdq.dsexplore.opt4j.optimizer.WriteFile;

/**
 * @ author Apoorv 
 */
public class MatingBayes {
	
	/* This class is meant to contain methods
	 * that take a collection of Binary strings
	 * as input, build a Bayesian Network out of them
	 * and sample out new Binary Strings. Each Binary String
	 * is actually a translated DesignDecisionGenoytpe
	 */
	
	// Testing here ...
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] array = new int[3][9];
		System.out.println(array.length);

	}
	
	private int NumberOfGenomes; // Stores the number of Genomes one wants as output
	private String SearchAlgorithm; // Specify whether 'tabu' or 'hc'
	private String ScoreMethod; // Can be 'loglik', 'aic','bic',bde', 'k2'
	
	
	// Create the constructors
	public MatingBayes(){
		// Default values
		this.NumberOfGenomes = 10;
		this.SearchAlgorithm = "tabu";
		this.ScoreMethod = "k2";
	}
	
	public MatingBayes(int NumberOfGenomes,String SearchAlgorithm,String ScoreMethod){
		// Create the MatingBayes object and initialize its data field.
		this.NumberOfGenomes = NumberOfGenomes;
		this.SearchAlgorithm = SearchAlgorithm;
		this.ScoreMethod = ScoreMethod;
	}
	
	
	
	// Methods here ...
	
	/* Create a method to process on the data 
	 * and sample new data from the learned 
	 * Bayesian Structure
	*/
	public int[][] getOffspring(int[][] currentGenomes) throws REXPMismatchException,RserveException{
		/* This method learns the Bayesian Structure by considering
		 * currentGenomes as the input data. The control is passed
		 * to the R function in file Bayesopt.R, which learns the 
		 * Bayesian Structure and samples new data.
		*/
		
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
		
		
		// Start the connection to R software    
		RConnection RCommunicator= new RConnection();   
		RCommunicator.eval("source(\"C:/Users/Hp/Documents/R/Bayesopt.R\")");
		RCommunicator.assign("z", Integer.toString(NumberOfGenomes));
		RCommunicator.eval("z=strtoi(z)");
		RCommunicator.assign("SearchAlgo", SearchAlgorithm);
		RCommunicator.assign("ScoreMeth", ScoreMethod);
		
		
		double[][] Offspring= RCommunicator.eval("BayesNetOperator(z,SearchAlgo,ScoreMeth)").asDoubleMatrix();
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
