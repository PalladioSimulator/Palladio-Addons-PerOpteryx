package de.uka.ipd.sdq.dsexplore.opt4j.optimizer.heuristic.operators;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Random;

import org.opt4j.core.Genotype;
import org.opt4j.operator.copy.Copy;

import com.google.inject.Inject;

import de.uka.ipd.sdq.dsexplore.helper.AResultsWriter;
import de.uka.ipd.sdq.dsexplore.launch.DSEWorkflowConfiguration;
import de.uka.ipd.sdq.dsexplore.opt4j.representation.DSEIndividual;
import de.uka.ipd.sdq.dsexplore.opt4j.representation.DSEIndividualFactory;
import de.uka.ipd.sdq.dsexplore.opt4j.start.Opt4JStarter;

/**
 * 
 * @author martens, beyer
 *
 */
public class TacticOperatorsManager {

	
	/**
	 * Heuristics to be used to generate candidates
	 */
	protected Collection<ITactic> heuristics = new ArrayList<ITactic>();
	protected AResultsWriter writer;
	protected Random generator = new Random();
	
	/**
	 * @param copy Creates copy of genotypes
	 * @param individualFactory Builds individual
	 */
	@Inject
	public TacticOperatorsManager(Copy<Genotype> copy, DSEIndividualFactory individualFactory) {
		DSEWorkflowConfiguration configuration = Opt4JStarter.getDSEWorkflowConfig();
		heuristics = TacticOperatorsFactory.getActivatedInstances(copy, individualFactory, configuration);
		this.writer = Opt4JStarter.getProblem().getWriter(Opt4JStarter.getDSEWorkflowConfig().getResultFolder()+"heuristicsInfo");
		writer.writeToLogFile("Tactic;Candidate numeric id;Parent numeric id;Candidate genome (several cols);Parent genome (several cols);Utilization value and whether returned\n");
	}
	
	/**
	 * Applies registered heuristics to individual and returns candidates
	 * @param individual
	 * @return
	 */
	public List<TacticsResultCandidate> getAllCandidates(DSEIndividual individual) {		
		
		List<TacticsResultCandidate> result = new ArrayList<TacticsResultCandidate>();
		Collection<TacticsResultCandidate> candidatesFromCurrentHeuristic;
		for (ITactic heuristic : heuristics) {
			candidatesFromCurrentHeuristic = heuristic.getHeuristicCandidates(individual);
			if (candidatesFromCurrentHeuristic.size() > 0) {
				this.writer.writeTacticCandidateInfo(heuristic, candidatesFromCurrentHeuristic);
				result.addAll(candidatesFromCurrentHeuristic);
			}
		}
		return result;
	}
	
	

	/**
	 * Applies registered heuristics to individual and returns random candidate
	 * based on candidate weight and heuristic weight. Returns null if no heuristic
	 * can be be applied.
	 * @param individual
	 * @return Random candidate from registered heuristic or null if no heuristic can be applied
	 */
	public DSEIndividual getCandidate(DSEIndividual individual) {
		Collection <TacticsResultCandidate> candidates = getAllCandidates(individual);
		double sumOfAllWeights = 0;
		for (TacticsResultCandidate c : candidates) {
			sumOfAllWeights += c.getFinalWeight();
		}
		
		double threshold = generator.nextDouble()*sumOfAllWeights;
		double currentLevel = 0;
		for (TacticsResultCandidate c : candidates) {
			currentLevel += c.getFinalWeight();
			// use spectrum of candidate weights to select candidate. The larger the
			// weight of the candidate the higher the probability of being selected
			if (currentLevel >= threshold) {
				this.writer.writeTacticManagerChoice(c);
				return c;
			}
		}
		if (candidates.size() > 0) {
			throw new RuntimeException("Random selection failed.");
		} 
		// won't be executed unless candidates list is empty
		else {
			return null;
		}
	}
	
	public Collection<ITactic> getHeuristics() {
		return heuristics;
	}
	
	
}
