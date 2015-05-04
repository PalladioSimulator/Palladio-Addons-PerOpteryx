package de.uka.ipd.sdq.dsexplore.opt4j.operator;


import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

import org.apache.log4j.Logger;
import org.opt4j.common.random.Rand;
import org.opt4j.common.random.RandomJava;
import org.opt4j.core.Individual;
import org.opt4j.operator.crossover.Crossover;
import org.opt4j.optimizer.ea.ElitismSelector;
import org.opt4j.optimizer.ea.Pair;
import org.opt4j.optimizer.mopso.Particle;

import com.google.inject.Inject;

import de.uka.ipd.sdq.dsexplore.bayesnets.samplers.BOAsampler;
import de.uka.ipd.sdq.dsexplore.opt4j.genotype.Adapter;
import de.uka.ipd.sdq.dsexplore.opt4j.genotype.BinaryGenotype;
import de.uka.ipd.sdq.dsexplore.opt4j.genotype.DesignDecisionGenotype;
import de.uka.ipd.sdq.dsexplore.opt4j.genotype.FinalBinaryGenotype;
import de.uka.ipd.sdq.dsexplore.opt4j.optimizer.MatingBayes;
import de.uka.ipd.sdq.dsexplore.opt4j.optimizer.WriteFile;
import de.uka.ipd.sdq.pcm.designdecision.Candidate;
import de.uka.ipd.sdq.pcm.designdecision.Choice;
import de.uka.ipd.sdq.pcm.designdecision.ClassChoice;
import de.uka.ipd.sdq.pcm.designdecision.ContinousRangeChoice;
import de.uka.ipd.sdq.pcm.designdecision.DiscreteRangeChoice;
import de.uka.ipd.sdq.pcm.designdecision.designdecisionFactory;
import de.uka.ipd.sdq.pcm.designdecision.specific.AllocationDegree;
import de.uka.ipd.sdq.pcm.designdecision.specific.AssembledComponentDegree;
import de.uka.ipd.sdq.pcm.designdecision.specific.CapacityDegree;
import de.uka.ipd.sdq.pcm.designdecision.specific.ContinuousProcessingRateDegree;
import de.uka.ipd.sdq.pcm.designdecision.specific.ResourceSelectionDegree;

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
	private static Logger logger = 
			Logger.getLogger("de.uka.ipd.sdq.dsexplore.opt4j.operator.BinaryBayesOperator");
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
	
	
	/*
	// For debugging
	@Override
	public List<DesignDecisionGenotype> crossover(List<DesignDecisionGenotype> parents) {
		List<DesignDecisionGenotype> list = new ArrayList<DesignDecisionGenotype>();
		//list.add(parents.get(0));
		//list.add(parents.get(1));
		return list;
	}
	*/
	
	@Override
	public List<DesignDecisionGenotype> crossover(List<DesignDecisionGenotype> parents) {
		// TODO Auto-generated method stub
		Adapter adapter = new Adapter();
		// Some trial method
		DesignDecisionGenotype DDGTemplate = parents.get(0);
		List<Choice> ChoiceTemplate = new ArrayList<Choice>();
		for(int j = 0 ; j < DDGTemplate.size() ; j++){
			ChoiceTemplate.add(DDGTemplate.get(j));
		}
		// Choice template done
		List<FinalBinaryGenotype> FBGenotypeList = new ArrayList<FinalBinaryGenotype>();
		for(int i = 0 ; i < parents.size() ; i++){
			logger.info("I am at line 86 in BBOperator");
			List<BinaryGenotype> BGenotypeList = adapter.translateDesignDecisionGenotype(parents.get(i));
			FBGenotypeList.add(new FinalBinaryGenotype(BGenotypeList));
		}
		logger.info("Now I reached line 90 in BBOperator");
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
		logger.info("Now I reached line 104 in BBOperator");
		int[][] Offspring = new int[10][BinaryGenesint[0].length];
		//try {
			try {
				Offspring = getSampledGenomes(BinaryGenesint);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			// Got the Offspring !!!
			// Now convert back to List of FBGenotype objects
			logger.info("Now I reached line 109 in BBOperator");
			logger.info(Offspring.toString());
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
			logger.info("Now I reached line 123 in BBOperator");
			// You have the list of Offsprings as a list of FinalBinaryGenotype Objects
			// Now convert them to DesignDecisionGenotype object list
			List<DesignDecisionGenotype> DDGenotypeOffspringList = new ArrayList<DesignDecisionGenotype>();
			for(int i = 0;i<FBGenotypeOffspringList.size();i++){
				DesignDecisionGenotype ddg = adapter.translateFinalBinaryGenotype(FBGenotypeOffspringList.get(i));
				DesignDecisionGenotype ddgpure = new DesignDecisionGenotype();
				for(int k = 0 ; k < ddg.size() ; k++){
					if(ChoiceTemplate.get(k).getDegreeOfFreedomInstance() instanceof ContinuousProcessingRateDegree){
						ContinousRangeChoice purechoice = designdecisionFactory.eINSTANCE.createContinousRangeChoice();
						purechoice.setDegreeOfFreedomInstance(ChoiceTemplate.get(k).getDegreeOfFreedomInstance());
						purechoice.setIsActive(ChoiceTemplate.get(k).isActive());
						purechoice.setValue(ddg.get(k).getValue());
					
						ddgpure.add(purechoice);
					}else if(ChoiceTemplate.get(k).getDegreeOfFreedomInstance() instanceof ResourceSelectionDegree){
						Choice purechoice = designdecisionFactory.eINSTANCE.createChoice();
						purechoice.setDegreeOfFreedomInstance(ChoiceTemplate.get(k).getDegreeOfFreedomInstance());
						purechoice.setIsActive(ChoiceTemplate.get(k).isActive());
						purechoice.setValue(ddg.get(k).getValue());
					
						ddgpure.add(purechoice);
					}else if((ChoiceTemplate.get(k).getDegreeOfFreedomInstance() instanceof AllocationDegree) || (ChoiceTemplate.get(k).getDegreeOfFreedomInstance() instanceof AssembledComponentDegree)){
						ClassChoice purechoice = designdecisionFactory.eINSTANCE.createClassChoice();
						purechoice.setDegreeOfFreedomInstance(ChoiceTemplate.get(k).getDegreeOfFreedomInstance());
						purechoice.setIsActive(ChoiceTemplate.get(k).isActive());
						purechoice.setValue(ddg.get(k).getValue());
					
						ddgpure.add(purechoice);
					}else if(ChoiceTemplate.get(k).getDegreeOfFreedomInstance() instanceof CapacityDegree){
						DiscreteRangeChoice purechoice = designdecisionFactory.eINSTANCE.createDiscreteRangeChoice();
						purechoice.setDegreeOfFreedomInstance(ChoiceTemplate.get(k).getDegreeOfFreedomInstance());
						purechoice.setIsActive(ChoiceTemplate.get(k).isActive());
						purechoice.setValue(ddg.get(k).getValue());
					
						ddgpure.add(purechoice);
					}
					
				}
				DDGenotypeOffspringList.add(ddgpure);
			}
			logger.info("Now I reached line 130 in BBOperator");
			// Got the DesignDecisionGenotype list of Offsprings.
			logger.info(DDGenotypeOffspringList.get(0).get(0));
			return DDGenotypeOffspringList;
		//} catch (RserveException e) {
		//		// TODO Auto-generated catch block
		//	e.printStackTrace();
		//} catch (REXPMismatchException e) {
		//	// TODO Auto-generated catch block
		//	e.printStackTrace();
		//} catch (Exception e){
		//	e.printStackTrace();
		//} 
		//return null;
	}
	
	/** A method to process on the data (which consists of 1s and 0s)
	 * and sample new data from the learned 
	 * Bayesian Structure. This method first constructs a Bayesian
	 * Network out of the input data and then samples new data out of it
	 * and gives it as an output.
	*/
	/*
	private int[][] getSampledGenomes(int[][] currentGenomes) {
		return null;
	}
	
	
	/*private int[][] getSampledGenomes(int[][] currentGenomes) throws REXPMismatchException,RserveException{
		
		
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
	}*/
	*/
	
	// For debugging
	private int[][] getSampledGenomes(int[][] currentGenomes) throws REXPMismatchException,RserveException{
		// Learn Network Structure
		//RandomSearch rs = new RandomSearch();
		//int[][] Graph = rs.search(currentGenomes);
		// Create a Directed Acyclic Graph ... Need to replace with an appropriate learning algo.
		int[][] Graph = new int[27][27];
		Graph[0][10]=1; // edge from 0th node to 10th node and so on ... 
		Graph[0][26]=1;
		Graph[5][10]=1;
		
		// Uncomment this portion between the lines later
		//<--------------------------------------------------------------------->
		/*
		// Write Graph to file ...
		int index = random.nextInt(100);
		String file_name = "C:/Users/Hp/Documents/R/Graph"+Integer.toString(index)+".txt";
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
		*/
		//<--------------------------------------------------------------------->
		BOAsampler boasampler = new BOAsampler(Graph, currentGenomes);
		int[][] returnmatrix = boasampler.sample(10);
		//logger.debug(returnmatrix);
		return returnmatrix;
	}
	
}
