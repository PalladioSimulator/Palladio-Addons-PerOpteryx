package de.uka.ipd.sdq.dsexplore.opt4j.optimizer;

import java.util.Collection;
import java.util.Iterator;
import java.util.Optional;

import org.apache.log4j.Logger;
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

import de.uka.ipd.sdq.dsexplore.constraints.DesignSpaceConstraintManager;
import de.uka.ipd.sdq.dsexplore.opt4j.genotype.DesignDecisionGenotype;
import de.uka.ipd.sdq.dsexplore.opt4j.optimizer.heuristic.startingPopulation.impl.StartingPopulationHeuristicImpl;
import de.uka.ipd.sdq.dsexplore.opt4j.representation.DSEIndividual;
import de.uka.ipd.sdq.dsexplore.opt4j.start.Opt4JStarter;

/**
 * Copy of {@link EvolutionaryAlgorithm} that detects duplicates in the
 * population and creates new random candidates to replace them.
 * 
 * @author martens
 *
 */
public class NoDuplicatesEvolutionaryAlgorithm extends EvolutionaryAlgorithm {

	// FIXME maybe adjust the maximum number of duplicates
	private static final int MAX_DUPLICATES = 100;
	/** Logger for log4j. */
	private static Logger logger = Logger.getLogger("de.uka.ipd.sdq.dsexplore.opt4j.optimizer.NoDuplicatesEvolutionaryAlgorithm");

	/**
	 * {@inheritDoc}
	 */
	@Inject
	public NoDuplicatesEvolutionaryAlgorithm(Population population, Archive archive, IndividualFactory individualFactory, IndividualCompleter completer, Control control, Selector selector,
			Mating mating, Iteration generations, @Constant(value = "alpha", namespace = EvolutionaryAlgorithm.class) int alpha,
			@Constant(value = "mu", namespace = EvolutionaryAlgorithm.class) int mu, @Constant(value = "lambda", namespace = EvolutionaryAlgorithm.class) int lambda) {
		super(population, archive, individualFactory, completer, control, selector, mating, generations, alpha, mu, lambda);
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see org.opt4j.core.optimizer.Optimizer#optimize()
	 */
	@Override
	public void optimize() throws TerminationException, StopException {

		this.selector.init(this.alpha + this.lambda);

		final boolean useGeneratedStartingPopulation = Opt4JStarter.getDSEWorkflowConfig().getUseStartingPopulationHeuristic();
		final boolean usePredefinedPopulation = Opt4JStarter.getDSEWorkflowConfig().getPredefinedInstancesFileName() != null;
		if (useGeneratedStartingPopulation && !usePredefinedPopulation) {
			DSEIndividual firstIndividual = (DSEIndividual) this.individualFactory.create();
			StartingPopulationHeuristicImpl startingPopulationHelper = new StartingPopulationHeuristicImpl(Opt4JStarter.getDSEWorkflowConfig());
			Collection<DSEIndividual> generatedStartingPopulation = startingPopulationHelper.getStartingPopulation(this.completer, this.individualFactory, firstIndividual);
			this.population.add(firstIndividual);
			this.population.addAll(generatedStartingPopulation);
		}

		this.removeInvalidIndividualsFrom(this.population);

		int count = 0;
		while (this.population.size() < this.alpha && count < this.alpha + 200) {
			Individual i = this.individualFactory.create();
			if (!this.isValid(i)) {
				continue;
			}

			if (!this.population.contains(i)) {
				this.population.add(i);
			}
			count++;
		}

		this.nextIteration();

		while (this.iteration.value() < this.iteration.max()) {

			Collection<Individual> parents = this.selector.getParents(this.mu, this.population);
			Collection<Individual> offspring = this.mating.getOffspring(this.lambda, parents);

			int sizeBefore = offspring.size();
			// remove duplicates
			offspring.removeAll(this.population);

			// we had one un-reproducible case in which the offspring list
			// contained a null.
			// catch this here.
			for (Iterator<Individual> iterator = offspring.iterator(); iterator.hasNext();) {
				Individual individual = iterator.next();
				if (individual == null || individual.getGenotype().size() == 0) {
					iterator.remove();
					NoDuplicatesEvolutionaryAlgorithm.logger.warn("Encountered a null individual or empty genotype in offspring, removing it.");
				}
			}
			int sizeAfter = offspring.size();

			this.removeInvalidIndividualsFrom(offspring);

			this.population.addAll(offspring); // This causes a decrease in
												// population, TODO: get to the
												// root of this problem

			// TODO: If the offspring contains duplicates, they should also be
			// removed. Andere Datenstruktur (Set)?
			if (sizeBefore > sizeAfter) {
				int maximumTries = 100; // we do not want to get stuck here...
				count = sizeAfter;
				int duplicates = 0;

				while (count < sizeBefore && count < maximumTries + sizeAfter && duplicates < NoDuplicatesEvolutionaryAlgorithm.MAX_DUPLICATES) {
					Individual i = this.individualFactory.create();
					if (!this.isValid(i)) {
						continue;
					}

					if (!this.population.contains(i)) {
						this.completer.complete(i);
						this.population.add(i);
						count++;
					} else {
						duplicates++;
					}
				}
				if (duplicates == NoDuplicatesEvolutionaryAlgorithm.MAX_DUPLICATES) {
					NoDuplicatesEvolutionaryAlgorithm.logger.warn("Stopped candidate creation after finding " + duplicates + " duplicates.");
				}
			}

			// evaluate offspring before selecting lames
			this.completer.complete(offspring);

			// Only remove so many that population is reduced to original size
			if (this.population.size() > this.alpha) {
				/* Get lame candidates based on Nsga2 */
				Collection<Individual> lames = this.selector.getLames(this.population.size() - this.alpha, this.population);
				/* Remove these lames */
				this.population.removeAll(lames);
			}

			this.nextIteration();

		}
	}

	private boolean isValid(Individual individual) {
		Genotype genotype = individual.getGenotype();
		return (genotype instanceof DesignDecisionGenotype) ? this.isValid((DesignDecisionGenotype) genotype) : true;
	}

	private boolean isValid(DesignDecisionGenotype genotype) {
		Optional<DesignSpaceConstraintManager> constraintManager = DesignSpaceConstraintManager.getInstanceBy(genotype);
		return constraintManager.isPresent() ? constraintManager.get().violatesNoConstraint(genotype) : true;
	}

	private void removeInvalidIndividualsFrom(Collection<Individual> individuals) {
		individuals.removeIf(eachIndividual -> !this.isValid(eachIndividual));
	}

}
