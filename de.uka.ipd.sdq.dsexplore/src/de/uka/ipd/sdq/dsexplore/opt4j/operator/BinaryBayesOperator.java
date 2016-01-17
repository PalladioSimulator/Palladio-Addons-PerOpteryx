package de.uka.ipd.sdq.dsexplore.opt4j.operator;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.apache.log4j.Logger;
import org.opt4j.common.random.Rand;
import org.opt4j.optimizer.ea.Pair;

import com.google.inject.Inject;

import de.uka.ipd.sdq.dsexplore.bayesnets.samplers.BOAsampler;
import de.uka.ipd.sdq.dsexplore.bayesnets.searchers.ChowLiuTree;
import de.uka.ipd.sdq.dsexplore.opt4j.genotype.Binary;
import de.uka.ipd.sdq.dsexplore.opt4j.genotype.BinaryGenotype;
import de.uka.ipd.sdq.dsexplore.opt4j.genotype.DesignDecisionGenotype;
import de.uka.ipd.sdq.dsexplore.opt4j.genotype.FinalBinaryGenotype;
import de.uka.ipd.sdq.dsexplore.opt4j.optimizer.WriteFile;
import de.uka.ipd.sdq.dsexplore.opt4j.start.Opt4JStarter;
import genericdesigndecision.Choice;

/**  
 * Operator to operate on a collection of 
 * {@link DesignDecisionGenotype}
 * @author Apoorv
 *
 */
public class BinaryBayesOperator implements BayesianCrossover<DesignDecisionGenotype> {
	
	private static Logger logger = 
			Logger.getLogger("de.uka.ipd.sdq.dsexplore.opt4j.operator.BinaryBayesOperator");
	
	private Random random;
	
	private static int GraphNumber=0;
	
	@Inject
	public BinaryBayesOperator(Rand random) {
		this.random = random;
	}
	
	@Override
	public Pair<DesignDecisionGenotype> crossover(DesignDecisionGenotype arg0,
			DesignDecisionGenotype arg1) {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public List<DesignDecisionGenotype> crossover(List<DesignDecisionGenotype> parents) {
		logger.info("BinaryBayesOperator.crossover: Entering ...");
		// Some trial method
		DesignDecisionGenotype DDGTemplate = parents.get(0);
		List<Choice> ChoiceTemplate = new ArrayList<Choice>();
		for(int j = 0 ; j < DDGTemplate.size() ; j++){
			ChoiceTemplate.add(DDGTemplate.get(j));
		}
		// Choice template done
		List<FinalBinaryGenotype> FBGenotypeList = new ArrayList<FinalBinaryGenotype>();
		for(int i = 0 ; i < parents.size() ; i++){
			List<BinaryGenotype> BGenotypeList = Opt4JStarter.getProblem().translateDesignDecisionGenotype(parents.get(i));
			FBGenotypeList.add(new FinalBinaryGenotype(BGenotypeList));
		}
		// Now create a 2-D matrix using the info in FBGenotypeList.
		// Each row corresponds to an individual
		Binary[][] BinaryGenes = new Binary[FBGenotypeList.size()][FBGenotypeList.get(0).getBinaryGenotype().size()];
		for(int i=0;i<FBGenotypeList.size();i++){
			FBGenotypeList.get(i).getBinaryGenotype().toArray(BinaryGenes[i]);
		}
		
		Binary[][] Offspring = new Binary[100][BinaryGenes[0].length];
		Offspring = getSampledGenomes(BinaryGenes, FBGenotypeList.get(0).getBitsPerDegree());
		
		// Got the Offspring !!!
		// Now convert back to List of FBGenotype objects
		List<FinalBinaryGenotype> FBGenotypeOffspringList = new ArrayList<FinalBinaryGenotype>();
		for(int i=0;i<Offspring.length;i++){
			List<Binary> GeneratedOffspringList = new ArrayList<Binary>();
			for(int j=0;j<Offspring[0].length;j++){
				GeneratedOffspringList.add(Offspring[i][j]);
			}
			// Create an FBGenotype object
			FinalBinaryGenotype FBOffspringObj = new FinalBinaryGenotype();
			FBOffspringObj.setBinaryGenotype(GeneratedOffspringList);
			FBOffspringObj.setBitsPerDegree(FBGenotypeList.get(0).getBitsPerDegree());
			FBOffspringObj.setOrderOfDegrees(FBGenotypeList.get(0).getOrderOfDegrees());
			FBGenotypeOffspringList.add(FBOffspringObj);
		}	
		// You have the list of Offsprings as a list of FinalBinaryGenotype Objects
		// Now convert them to DesignDecisionGenotype object list
		List<DesignDecisionGenotype> DDGenotypeOffspringList = new ArrayList<DesignDecisionGenotype>();
		for(int i = 0; i<FBGenotypeOffspringList.size(); i++){
			DesignDecisionGenotype ddg = Opt4JStarter.getProblem().translateFinalBinaryGenotype(FBGenotypeOffspringList.get(i));
			DesignDecisionGenotype ddgpure = new DesignDecisionGenotype();
			for(int k = 0 ; k < ddg.size() ; k++){
				Choice purechoice = ChoiceTemplate.get(k).getDofInstance().createChoice();
				purechoice.setDofInstance(ChoiceTemplate.get(k).getDofInstance());
				purechoice.setActive(ChoiceTemplate.get(k).isActive());
				purechoice.setValue(ddg.get(k).getValue());
				
				ddgpure.add(purechoice);
			}
			DDGenotypeOffspringList.add(ddgpure);
		}
		// Got the DesignDecisionGenotype list of Offsprings.
		logger.info("BinaryBayesOperator.crossover: returning ...");
		return DDGenotypeOffspringList;
			
	}
	
	
	/*
	private int[][] getSampledGenomes(int[][] currentGenomes) throws REXPMismatchException,RserveException{
		
		
		int NumberOfGenomes = 10; // Stores the number of Genomes one wants as output
		String SearchAlgorithm = "tabu"; // Specify whether 'tabu' or 'hc'
		//String ScoreMethod = "loglik"; // Can be 'loglik', 'aic','bic',bde', 'k2'
		int IterationNumber  = 21;
		
		// Copy currentGenomes to file data.txt
		String file_name = "C:/Users/Hp/Documents/R/data1.txt";
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
		//Rengine RserveStarter = new Rengine();
		// This just reports whether R was running and we connected to it, or whether we started it.
		//if (RserveStarter.isStandAlone()) System.out.println("R initialised by java");
		//RserveStarter.eval("library(Rserve)");
		//RserveStarter.eval("Rserve()");
		// This patch of code starts Rserve ... 
		//<-------------------------------------------------->
		
		// The next written code is intact ...
		RConnection RCommunicator= new RConnection();   
		RCommunicator.eval("source(\"C:/Users/Hp/Documents/R/Bayesopt.R\")");
		RCommunicator.assign("z", Integer.toString(NumberOfGenomes));
		RCommunicator.eval("z=strtoi(z)");
		RCommunicator.assign("SearchAlgo", SearchAlgorithm);
		//RCommunicator.assign("ScoreMeth", ScoreMethod);
		RCommunicator.assign("iteration", Integer.toString(IterationNumber));
		RCommunicator.eval("iteration=strtoi(iteration)");
		
		double[][] Offspring= RCommunicator.eval("BayesNetOperator(z,SearchAlgo,21)").asDoubleMatrix();
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
	*/
	
	/** A method to process on the data and sample new data from the learned 
	 * Bayesian Structure. This method first constructs a Bayesian
	 * Network out of the input data and then samples new data out of it
	 * and gives it as an output.
	*/
	private Binary[][] getSampledGenomes(Binary[][] currentGenomes, List<Integer> bitsPerDegree){
		logger.info("BinaryBayesOperator.getSampledGenomes: Entering ...");
		
		// GDOF author Ferdinand: dont want to modify bayesnets code -> translate table of Binary values to table of of 1s and 0s
		int[][] integerMatrix = new int[currentGenomes.length][currentGenomes[0].length];
		for(int i=0;i<currentGenomes.length;i++){
			for(int j=0;j< currentGenomes[0].length;j++){
				integerMatrix[i][j] = (currentGenomes[i][j] == Binary.ACTIVE) ? 1 : 0;
			}
		}
		
		// Part1: Learn Network Structure
		//<--------------------------------------------------------------------->
		//HillClimber hc = new HillClimber();
		//int[][] Graph = hc.search(currentGenomes, 5); // 2nd argument is the maximum-number-of-parents-any-node-can-have constraint.
		ChowLiuTree clt = new ChowLiuTree(integerMatrix);
		int[][] Graph = clt.search();
		//<--------------------------------------------------------------------->
		
		// Part 2: If you want a constant structure, specify here ...
		//<--------------------------------------------------------------------->
		
		//int[][] Graph = new int[27][27];
		//Graph[0][10]=1; // edge from 0th node to 10th node and so on ... 
		//Graph[0][26]=1;
		//Graph[5][10]=1;
		
		//<--------------------------------------------------------------------->
		
		// Part3: Write Graph to file ...
		//<--------------------------------------------------------------------->
		int index = this.GraphNumber++;
		String file_name = Opt4JStarter.getDSEWorkflowConfig().getResultFolder() + "Graph"+Integer.toString(index)+".txt";
		
		WriteFile data = new WriteFile(file_name,true);
		for(int i=1;i<=Graph.length;i++){
		  	String myData = "     "+Integer.toString(Graph[i-1][0]);
		   	for(int idx=1;idx<=Graph[0].length-1;idx++){	
		   		myData = myData + "     "+Integer.toString(Graph[i-1][idx]);        		       	
		   	}
		    
		   	try {
				data.writeToFile(myData);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		   	}
		// End of writing data
		//<--------------------------------------------------------------------->
		
		
		
		// Part4: Sample new data
		//<--------------------------------------------------------------------->
		BOAsampler boasampler = new BOAsampler(Graph, integerMatrix);
		//CustomSampler cSampler = new CustomSampler(Graph, currentGenomes, bitsPerDegree);
		int[][] integerResult = boasampler.sample(100);
		logger.info("BinaryBayesOperator.crossover: Returning ...");
		
		//dont want to modify bayesnets code -> retranslate table of of 1s and 0s to table of Binary values
		Binary[][] returnMatrix = new Binary[integerResult.length][integerResult[0].length];
		for(int i=0;i<integerResult.length;i++){
			for(int j=0;j< integerResult[0].length;j++){
				returnMatrix[i][j] = (integerResult[i][j] == 1) ? Binary.ACTIVE : Binary.INACTIVE;
			}
		}
		
		return returnMatrix;
	}
	
}
