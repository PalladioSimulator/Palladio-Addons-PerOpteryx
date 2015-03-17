package de.uka.ipd.sdq.dsexplore.opt4j.optimizer;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

import org.opt4j.common.random.Rand;
import org.opt4j.core.Genotype;
import org.opt4j.core.Individual;
import org.opt4j.core.IndividualFactory;
import org.opt4j.operator.copy.Copy;
import org.opt4j.operator.crossover.Crossover;
import org.opt4j.operator.mutate.Mutate;
import org.opt4j.operator.mutate.MutationRate;
import org.opt4j.optimizer.ea.Coupler;
import org.opt4j.optimizer.ea.CrossoverRate;
import org.opt4j.optimizer.ea.Mating;
import org.opt4j.optimizer.ea.MatingCrossoverMutate;
import org.opt4j.optimizer.mopso.Particle;
import org.opt4j.optimizer.ea.BasicMatingModule;
import org.rosuda.JRI.Rengine;
import org.rosuda.REngine.REXP;
import org.rosuda.REngine.REXPMismatchException;
import org.rosuda.REngine.Rserve.RConnection;
import org.rosuda.REngine.Rserve.RserveException;

import de.uka.ipd.sdq.dsexplore.opt4j.genotype.Adapter;
import de.uka.ipd.sdq.dsexplore.opt4j.genotype.BinaryGenotype;
import de.uka.ipd.sdq.dsexplore.opt4j.genotype.DesignDecisionGenotype;
import de.uka.ipd.sdq.dsexplore.opt4j.genotype.FinalBinaryGenotype;
import de.uka.ipd.sdq.dsexplore.opt4j.optimizer.WriteFile;
import de.uka.ipd.sdq.pcm.designdecision.DecisionSpace;
import de.uka.ipd.sdq.pcm.designdecision.designdecisionFactory;

/** This class is meant to contain methods
 * that operate on a collection of Binary strings.
 * These methods build a Bayesian Network out of the Binary Strings
 * and sample out new Binary Strings. Each Binary String
 * is actually a translated {@link DesignDecisionGenoytpe} (i.e a {@link FinalBinaryGenotype})   
 * 
 */
public class MatingBayes implements Mating{
	
	
	// Testing here ...
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] array = new int[3][9];
		System.out.println(array.length);
		
		Rengine re=new Rengine(args, false, null);
		
		// Recommended, though not needed as such.
		//if (!Rengine.versionCheck()) {System.exit(0);}
		
		// This just reports whether R was running and we connected to it, or whether we started it.
		if (re.isStandAlone()) System.out.println("R initialised by java");
		re.eval("library(bnlearn)");
		re.eval("b = data.frame(matrix(c(1,1,1,1,1,0,0,0,0,0,1,1,1,1,1,0,0,0,0,0,1,1,1,1,1,0,0,0,0,0),nrow=10,ncol=3))");
		org.rosuda.JRI.REXP a = re.eval("b");
		re.eval("g = tabu(b)");
		//org.rosuda.JRI.REXP a = re.eval("rbn(g,10,b)");
		System.out.println(a.toString());

	}
	
	private int NumberOfGenomes; // Stores the number of Genomes one wants as output
	private String SearchAlgorithm; // Specify whether 'tabu' or 'hc'
	private String ScoreMethod; // Can be 'loglik', 'aic','bic',bde', 'k2'
	private int IterationNumber; // Stores the Iteration number value
	Adapter TranslatorObj;
	/*
	public MatingBayes(Crossover<Genotype> crossover, Mutate<Genotype> mutate,
			Copy<Genotype> copy, Coupler coupler, CrossoverRate crossoverRate,
			MutationRate mutationRate, Rand random,
			IndividualFactory individualFactory) {
		super(crossover, mutate, copy, coupler, crossoverRate, mutationRate, random,
				individualFactory);
		// TODO Auto-generated constructor stub
		this.NumberOfGenomes = 10;
		this.SearchAlgorithm = "tabu";
		this.ScoreMethod = "k2";
		this.IterationNumber = 0;
	}
	*/
	
	// Create the constructors
	public MatingBayes(){
		// Default values
		this.NumberOfGenomes = 10;
		this.SearchAlgorithm = "tabu";
		this.ScoreMethod = "k2";
		this.IterationNumber = 0;
		DecisionSpace dspace = designdecisionFactory.eINSTANCE.createDecisionSpace();
		this.TranslatorObj = new Adapter(dspace);
	}
	
	public MatingBayes(int NumberOfGenomes,String SearchAlgorithm,String ScoreMethod, int IterationNumber, Adapter TranslatorObj){
		// Create the MatingBayes object and initialize its data field.
		this.NumberOfGenomes = NumberOfGenomes;
		this.SearchAlgorithm = SearchAlgorithm;
		this.ScoreMethod = ScoreMethod;
		this.IterationNumber = IterationNumber;
		this.TranslatorObj = TranslatorObj;
	}
	
	
	
	// Methods here ...
	
	/** A method to process on the data (which consists of 1s and 0s)
	 * and sample new data from the learned 
	 * Bayesian Structure. This method first constructs a Bayesian
	 * Network out of the input data and then samples new data out of it
	 * and gives it as an output.
	*/
	public int[][] getSampledGenomes(int[][] currentGenomes) throws REXPMismatchException,RserveException{
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
	
	/** This method is similar to the {@link getSampledGenomes} method, the only difference being
	 * that this method operates on a collection of {@link Individual} objects. The {@link Individual} objects
	 * are converted to {@link Collection} of {@link DesignDecisionGenotype} objects, which are converted to {@link FinalBinaryGenotype}
	 * objects. The {@link getSampledGenomes} is invoked on this list of {@link FinalBinaryGenotype} objects to output new solutions.
	 * These are then converted systematically back to {@link Individual} type of objects
	 */
	@Override
	public Collection<Individual> getOffspring(int Size, Collection<Individual> Parents){
		

		// Convert Parents to list of DesignDecisionGenotype objects
		List<DesignDecisionGenotype> DDGenotypeList = new ArrayList<DesignDecisionGenotype>();
		Iterator IndividualIterator = Parents.iterator();
		for(int i=0; i< Parents.size();i++){
			Individual individual = (Individual) IndividualIterator.next();
			DDGenotypeList.add((DesignDecisionGenotype) individual.getGenotype());
		}
		

		// Now convert DDGenotypeList to a list of FinalBinaryGenotype objects
		List<FinalBinaryGenotype> FBGenotypeList = new ArrayList<FinalBinaryGenotype>();
		//Adapter TranslatorObj = new Adapter();
		for(int i=0;i<DDGenotypeList.size();i++){		
			List<BinaryGenotype> IntermediateList = this.TranslatorObj.translateDesignDecisionGenotype(DDGenotypeList.get(i));
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
		
		// Give BinaryGenesint as input to getSampledGenomes method in class MatingBayes
		//MatingBayes OffspringGenerator = new MatingBayes();
		this.NumberOfGenomes = Size;
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
			return IndividualOffspringList;
			// End the process here ...
		} catch (RserveException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (REXPMismatchException e) {
				// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return null;
	}

	@Override
	public Collection<Individual> getOffspring(int arg0, Individual... arg1) {
		// TODO Auto-generated method stub
		// Implement this later.
		return null;
	}

}
