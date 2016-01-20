package de.uka.ipd.sdq.pcmsupport.helper;

import java.util.List;

import org.opt4j.core.Genotype;
import org.opt4j.operator.copy.Copy;

import de.uka.ipd.sdq.dsexplore.launch.DSEWorkflowConfiguration;
import de.uka.ipd.sdq.dsexplore.opt4j.optimizer.heuristic.operators.AbstractTactic;
import de.uka.ipd.sdq.dsexplore.opt4j.optimizer.heuristic.operators.TacticsResultCandidate;
import de.uka.ipd.sdq.dsexplore.opt4j.representation.DSEIndividual;
import de.uka.ipd.sdq.dsexplore.opt4j.representation.DSEIndividualFactory;

public abstract class APCMTactic extends AbstractTactic {

	public APCMTactic(Copy<Genotype> copy, DSEIndividualFactory individualFactory,
			DSEWorkflowConfiguration configuration, String[] strings) {
		super(copy, individualFactory, configuration, strings);
	}

	@Override
	public List<TacticsResultCandidate> getHeuristicCandidates(DSEIndividual i) {
		throw new UnsupportedOperationException("Not implemented in PCM, relate to developer");
	}

	/**
	 * Generates improved individuals based on heuristic and given
	 * individual.
	 * Candidates must only use model objects from the design decision model, 
	 * they must not refer to model elements from the PCM model (as these may not be 
	 * identical Java objects even if they represent the same EMF object).   
	 * 
	 * @param i The individual that should be improved
	 * @param resultsCache 
	 * @return Collection of improved individuals
	 */
	public abstract List<TacticsResultCandidate> getHeuristicCandidates(DSEIndividual i, UtilisationResultCacheAndHelper resultsCache);

}
