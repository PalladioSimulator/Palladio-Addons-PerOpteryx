package peropteryx.operator.bayesian;

import peropteryx.operator.bayesian.WriteFile;

import java.io.IOException;

import org.rosuda.JRI.Rengine;
import org.rosuda.REngine.REXP;
import org.rosuda.REngine.REXPMismatchException;
import org.rosuda.REngine.RList;
import org.rosuda.REngine.Rserve.RConnection;
import org.rosuda.REngine.Rserve.RserveException;

public class BayesOperator {

	// This class encodes the Bayesian Structure Learning as well as producing new data from the learnt Bayesian Structure

		private int NumberOfGenomes; // Stores the number of Genomes one wants as output
		private String SearchAlgorithm; // Specify whether 'tabu' or 'hc'
		private String ScoreMethod; // Can be 'loglik', 'aic','bic',bde', 'k2'
		// Create the constructors
		public BayesOperator(){
			// Default values
			this.NumberOfGenomes = 10;
			this.SearchAlgorithm = "tabu";
			this.ScoreMethod = "k2";
		}
		
		public BayesOperator(int NumberOfGenomes,String SearchAlgorithm,String ScoreMethod){
			// Create the BayesOpt object and initialize its data field.
			this.NumberOfGenomes = NumberOfGenomes;
			this.SearchAlgorithm = SearchAlgorithm;
			this.ScoreMethod = ScoreMethod;
		}
		
		/* Create a method to process on the data 
		 * and sample new data from the learned 
		 * Bayesian Structure
		*/
		public int[][] getSampledGenomes(int[][] currentGenomes) throws REXPMismatchException,RserveException{
			/* This method learns the Bayesian Structure by considering
			 * currentGenomes as the input data. The control is passed
			 * to the R function in file Bayesopt.R, which learns the 
			 * Bayesian Structure and samples new data.
			*/
			
			// Copy currentGenomes to file data.txt
			String file_name = "C:/Users/Hp/Documents/R/data.txt";
			WriteFile data = new WriteFile( file_name , true );
			for(int i=1;i<=10;i++){
			  	String myData = "     "+Integer.toString(currentGenomes[i-1][0]);
			   	for(int idx=1;idx<=5;idx++){	
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
			    
			RConnection c= new RConnection();
			    
			    
			c.eval("source(\"C:/Users/Hp/Documents/R/Bayesopt.R\")");
			c.assign("z", Integer.toString(NumberOfGenomes));
			c.eval("z=strtoi(z)");
			c.assign("SearchAlgo", SearchAlgorithm);
			c.assign("ScoreMeth", ScoreMethod);
			double[][] SampledGenomes= c.eval("BayesNetOperator(z,SearchAlgo,ScoreMeth)").asDoubleMatrix();
			// Convert d matrix to int matrix
			int[][] FinalSampledGenomes = new int[NumberOfGenomes][SampledGenomes[1].length];
			for(int i=0;i<NumberOfGenomes;i++){
			   	for(int j=0;j<SampledGenomes[1].length;j++){
			   		if(SampledGenomes[i][j]<=0){
			   			FinalSampledGenomes[i][j]=0;
			   		}else{
			   			FinalSampledGenomes[i][j]=1;
			   		}
			   	}
			   }
			    
			return FinalSampledGenomes;		
		}
	
}
