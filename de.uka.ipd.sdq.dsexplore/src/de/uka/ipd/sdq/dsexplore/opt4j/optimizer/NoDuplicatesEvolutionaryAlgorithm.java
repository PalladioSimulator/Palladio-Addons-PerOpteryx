package de.uka.ipd.sdq.dsexplore.opt4j.optimizer;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

import org.apache.log4j.Logger;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.ocl.ecore.delegate.OCLSettingDelegate.Changeable;
import org.opt4j.core.Genotype;
import org.opt4j.core.Individual;
import org.opt4j.core.IndividualFactory;
import org.opt4j.core.optimizer.Archive;
import org.opt4j.core.optimizer.Control;
import org.opt4j.core.optimizer.IndividualCompleter;
import org.opt4j.core.optimizer.Iteration;
import org.opt4j.core.optimizer.Population;
import org.opt4j.core.optimizer.StopException;
import org.opt4j.core.optimizer.TerminationException;
import org.opt4j.optimizer.ea.EvolutionaryAlgorithm;
import org.opt4j.optimizer.ea.Mating;
import org.opt4j.optimizer.ea.Selector;
import org.opt4j.start.Constant;

import com.google.inject.Inject;

import de.uka.ipd.sdq.dsexplore.gdof.GenomeToCandidateModelTransformation;
import de.uka.ipd.sdq.dsexplore.launch.OptimisationJob;
import de.uka.ipd.sdq.dsexplore.opt4j.genotype.DesignDecisionGenotype;
import de.uka.ipd.sdq.dsexplore.opt4j.optimizer.heuristic.startingPopulation.impl.StartingPopulationHeuristicImpl;
import de.uka.ipd.sdq.dsexplore.opt4j.representation.DSEIndividual;
import de.uka.ipd.sdq.dsexplore.opt4j.start.Opt4JStarter;
import de.uka.ipd.sdq.pcm.designdecision.Choice;

/**
 * Copy of {@link EvolutionaryAlgorithm} that detects duplicates in the population and creates new random candidates
 * to replace them. 
 * @author martens
 *
 */
public class NoDuplicatesEvolutionaryAlgorithm extends EvolutionaryAlgorithm {
	
	//FIXME maybe adjust the maximum number of duplicates
	private static final int MAX_DUPLICATES = 500;
	/** Logger for log4j. */
	private static Logger logger = 
		Logger.getLogger("de.uka.ipd.sdq.dsexplore.opt4j.optimizer.NoDuplicatesEvolutionaryAlgorithm");


	/**
	 * {@inheritDoc}
	 */
	@Inject
	public NoDuplicatesEvolutionaryAlgorithm(
			Population population,
			Archive archive,
			IndividualFactory individualFactory,
			IndividualCompleter completer,
			Control control,
			Selector selector,
			Mating mating,
			Iteration generations,
			@Constant(value = "alpha", namespace = EvolutionaryAlgorithm.class) int alpha,
			@Constant(value = "mu", namespace = EvolutionaryAlgorithm.class) int mu,
			@Constant(value = "lambda", namespace = EvolutionaryAlgorithm.class) int lambda) {
		super(population, archive, individualFactory, completer, control, selector, mating, generations, alpha, mu, lambda);
	}
	
	/*
	 * (non-Javadoc)
	 * 
	 * @see org.opt4j.core.optimizer.Optimizer#optimize()
	 */
	@Override
	public void optimize() throws TerminationException, StopException {

		selector.init(alpha + lambda);
		
		final boolean useGeneratedStartingPopulation = Opt4JStarter.getDSEWorkflowConfig().getUseStartingPopulationHeuristic();
		final boolean usePredefinedPopulation = Opt4JStarter.getDSEWorkflowConfig().getPredefinedInstancesFileName() != null;
		if (useGeneratedStartingPopulation && ! usePredefinedPopulation) {
			DSEIndividual firstIndividual = (DSEIndividual) individualFactory.create();
			StartingPopulationHeuristicImpl startingPopulationHelper = new StartingPopulationHeuristicImpl(Opt4JStarter.getDSEWorkflowConfig());
			Collection<DSEIndividual> generatedStartingPopulation = startingPopulationHelper.getStartingPopulation(completer, individualFactory, firstIndividual);
			population.add(firstIndividual);
			population.addAll(generatedStartingPopulation);
		}
		
		//FIXME remove measurement --->
//		logger.warn("Time elapsed: "+((System.nanoTime()-OptimisationJob.getStartTimestampMillis())/Math.pow(10, 9))+" seconds");
//		logger.info("MEASURMENT: Creating individuals1...");
		
//    	double startTime = System.nanoTime();
		int count = 0;
		while (population.size() < alpha && count < alpha + MAX_DUPLICATES) {

			Individual i = individualFactory.create();
			Genotype g = i.getGenotype();
			DesignDecisionGenotype ddg = (DesignDecisionGenotype) g;
			boolean found = true;
			
			//if the changeable elements are restricted from the user, check here if the selected choice is one of
			//of the allowed elements
			for (Choice c : ddg) {
				if (!found) break;
				
				//primitives can not be restricted
				if (c.getValue() instanceof Integer || c.getValue() instanceof Double) {
					continue;
				}
				
				EList<EObject> elements = c.getDegreeOfFreedomInstance().getChangeableElements();
				EObject value = (EObject) c.getValue();
				
				for (EObject eo : elements) {
					found = false;
					if (value.equals(eo)) {
						found = true;
						break;
					} 
				}

			}
//			if (found) {
//				logger.warn("FOUND!");
//			}
			if (!population.contains(i) && found){
				population.add(i);
			}
//			if (count%1000 == 0) {
//				logger.warn(count);
//			}
			count ++;
		}
		
		if ( count == alpha+MAX_DUPLICATES ) {
			int dups = alpha+MAX_DUPLICATES;

			logger.warn("Stopped candidate creation after finding "+dups+" duplicates.");
		}
		
//		double endTime = System.nanoTime();
//        double result = (endTime - startTime) / Math.pow(10, 9);
//        logger.info("MEASURMENT: Finished CREATING individuals in "+(result)+" seconds");
//        logger.warn("---------");
//        logger.warn("Time elapsed: "+((System.nanoTime()-OptimisationJob.getStartTimestampMillis())/Math.pow(10, 9))+" seconds");
        //<---
        
		nextIteration();

		while (iteration.value() < iteration.max()) {

			Collection<Individual> parents = selector
					.getParents(mu, population);
			Collection<Individual> offspring = mating.getOffspring(lambda,
					parents);
			
			
			int sizeBefore = offspring.size();
			//remove duplicates
			offspring.removeAll(population);
			
			//we had one un-reproducible case in which the offspring list contained a null.
			//catch this here. 
			for (Iterator<Individual> iterator = offspring.iterator(); iterator.hasNext();) {
				Individual individual = iterator.next();
				if (individual == null || individual.getGenotype().size() == 0){
					iterator.remove();
//					logger.warn("Encountered a null individual or empty genotype in offspring, removing it.");
				}
			}
			int sizeAfter = offspring.size();
			
			population.addAll(offspring); //This causes a decrease in population, TODO: get to the root of this problem

			//TODO: If the offspring contains duplicates, they should also be removed. Andere Datenstruktur (Set)?
			if (sizeBefore > sizeAfter){
				int maximumTries = 100; //we do not want to get stuck here...
				count = sizeAfter;
				int duplicates = 0;
//				logger.info("MEASURMENT: Creating individuals2...");
//				startTime = System.nanoTime();
				while (count < sizeBefore && count < maximumTries + sizeAfter && duplicates < MAX_DUPLICATES){

					Individual i = individualFactory.create();
					Genotype g = i.getGenotype();
					DesignDecisionGenotype ddg = (DesignDecisionGenotype) g;
					boolean found = true;
					
					//if the changeable elements are restricted from the user, check here if the selected choice is one of
					//of the allowed elements
					for (Choice c : ddg) {
						if (!found) break;
						
						//primitives can not be restricted
						if (c.getValue() instanceof Integer || c.getValue() instanceof Double) {
							continue;
						}
						
						EList<EObject> elements = c.getDegreeOfFreedomInstance().getChangeableElements();
						EObject value = (EObject) c.getValue();

						for (EObject eo : elements) {
							found = false;
							if (value.equals(eo)) {
								found = true;
								break;
							} 
						}

					}
					if (!population.contains(i) && found){
						completer.complete(i);
						population.add(i);
						count ++;
					} else {
						duplicates ++;
					}
				}
				if (duplicates == MAX_DUPLICATES ) {
					logger.warn("Stopped candidate creation after finding "+duplicates+" duplicates.");
				}
			}
			
//			endTime = System.nanoTime();
//	        result = (endTime - startTime) / Math.pow(10, 9);
//			logger.info("MEASURMENT: Finished CREATING individuals in "+(result)+" seconds");
//			logger.warn("---------");
			// evaluate offspring before selecting lames
			completer.complete(offspring);
			

			//Only remove so many that population is reduced to original size
			if (population.size() > alpha){
				/* Get lame candidates based on Nsga2 */
				Collection<Individual> lames = selector
						.getLames(population.size() - alpha, population);
				/* Remove these lames */
				population.removeAll(lames);
			}

			nextIteration();
			
		}
	}

}
