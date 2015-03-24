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
import org.opt4j.optimizer.ea.Pair;
import org.opt4j.optimizer.mopso.Particle;
import org.opt4j.optimizer.ea.BasicMatingModule;
import org.rosuda.JRI.Rengine;
import org.rosuda.REngine.REXP;
import org.rosuda.REngine.REXPMismatchException;
import org.rosuda.REngine.Rserve.RConnection;
import org.rosuda.REngine.Rserve.RserveException;

import com.google.inject.Inject;

import de.uka.ipd.sdq.dsexplore.opt4j.genotype.Adapter;
import de.uka.ipd.sdq.dsexplore.opt4j.genotype.BinaryGenotype;
import de.uka.ipd.sdq.dsexplore.opt4j.genotype.DesignDecisionGenotype;
import de.uka.ipd.sdq.dsexplore.opt4j.genotype.FinalBinaryGenotype;
import de.uka.ipd.sdq.dsexplore.opt4j.operator.BayesianCrossover;
import de.uka.ipd.sdq.dsexplore.opt4j.operator.BinaryBayesOperator;
import de.uka.ipd.sdq.dsexplore.opt4j.optimizer.WriteFile;
import de.uka.ipd.sdq.dsexplore.opt4j.optimizer.heuristic.operators.QMLBoundDependentTacticOperatorsManager;
import de.uka.ipd.sdq.dsexplore.opt4j.optimizer.heuristic.operators.TacticOperatorsManager;
import de.uka.ipd.sdq.dsexplore.opt4j.representation.DSEIndividual;
import de.uka.ipd.sdq.dsexplore.opt4j.representation.DSEIndividualFactory;
import de.uka.ipd.sdq.dsexplore.opt4j.start.Opt4JStarter;
import de.uka.ipd.sdq.pcm.designdecision.DecisionSpace;
import de.uka.ipd.sdq.pcm.designdecision.designdecisionFactory;

/** This class is meant to contain methods
 * that operate on a collection of Binary strings.
 * These methods build a Bayesian Network out of the Binary Strings
 * and sample out new Binary Strings. Each Binary String
 * is actually a translated {@link DesignDecisionGenoytpe} (i.e a {@link FinalBinaryGenotype})   
 * 
 */
public class MatingBayes extends MatingCrossoverMutate{
	
	private TacticOperatorsManager heuristicManager;
	//private BayesianCrossover crossover;
	
	public TacticOperatorsManager getHeuristicManager() {
		return this.heuristicManager;
	}
	/*
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
	*/
	
	
	// Create the constructor
	@Inject
	public MatingBayes(Crossover<Genotype> crossover, Mutate<Genotype> mutate, Copy<Genotype> copy,
			Coupler coupler, CrossoverRate crossoverRate, MutationRate mutationRate, Rand random,
			IndividualFactory individualFactory, 
			/*noorshams: inject this, I don't want to break the "injection chain"*/
			QMLBoundDependentTacticOperatorsManager qmlTacticManager
			) {
		super(crossover, mutate, copy, coupler, crossoverRate, mutationRate, random,
				individualFactory);
		if (Opt4JStarter.getDSEWorkflowConfig().isConsiderQMLBoundsWhenApplyingHeuristics()) {
			heuristicManager = qmlTacticManager;
		} else if (Opt4JStarter.getDSEWorkflowConfig().isUseHeuristics()){
			heuristicManager = new TacticOperatorsManager(copy, (DSEIndividualFactory)individualFactory);
		}
		//this.crossover = crossover;
	}
	
	
	
	
	/** This method is similar to the {@link getSampledGenomes} method, the only difference being
	 * that this method operates on a collection of {@link Individual} objects. The {@link Individual} objects
	 * are converted to {@link Collection} of {@link DesignDecisionGenotype} objects, which are converted to {@link FinalBinaryGenotype}
	 * objects. The {@link getSampledGenomes} is invoked on this list of {@link FinalBinaryGenotype} objects to output new solutions.
	 * These are then converted systematically back to {@link Individual} type of objects
	 */
	@Override
	public Collection<Individual> getOffspring(int size, Collection<Individual> parents){
		Collection<Individual> offspring = new ArrayList<Individual>();
		Collection<Pair<Individual>> couples = coupler.getCouples((int) Math
				.ceil(((double) size / 2)), new ArrayList<Individual>(parents));
		
		List<Individual> parentslist = new ArrayList<Individual>();
		for (Pair<Individual> couple : couples) {
			Individual parent1 = couple.getFirst();
			Individual parent2 = couple.getSecond();
			parentslist.add(parent1);
			parentslist.add(parent2);
		}
		offspring = mate(parentslist);
		// TODO: Size check
		return offspring;
	}


	private Collection<Individual> mate(List<Individual> parentslist) {
		// TODO Auto-generated method stub
		// Convert parentslist to a list of Genotypes
		List<Genotype> parentgenotypelist = new ArrayList<Genotype>();
		for(int i = 0 ; i < parentslist.size() ; i++){
			parentgenotypelist.add(parentslist.get(i).getGenotype());
		}
		// try to apply heuristics
		// if not applicable: mutate
		boolean useHeuristics = Opt4JStarter.getDSEWorkflowConfig().isUseHeuristics();
		double tacticsProbability = Opt4JStarter.getDSEWorkflowConfig().getTacticsProbability();
		
		List<Individual> tacticsindividuals = new ArrayList<Individual>();
		for(int i = 0 ; i < parentslist.size() ; i++){
			if (useHeuristics && Math.random() < tacticsProbability){ 
				tacticsindividuals.add(heuristicManager.getCandidate((DSEIndividual)parentslist.get(i)));
			}
		}

		List<Genotype> offspring = ((BayesianCrossover<Genotype>) crossover).crossover(parentgenotypelist);
		List<Individual> crossoverindividuals = new ArrayList<Individual>();
		for(int j = 0 ; j < offspring.size() ; j++){
			crossoverindividuals.add(individualFactory.create(offspring.get(j)));
		}
		List<Individual> individuals = new ArrayList<Individual>();
		individuals.addAll(tacticsindividuals);
		individuals.addAll(crossoverindividuals);
		return individuals;
	}
	
}
