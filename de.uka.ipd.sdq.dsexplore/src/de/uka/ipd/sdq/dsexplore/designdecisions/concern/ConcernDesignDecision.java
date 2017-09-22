package de.uka.ipd.sdq.dsexplore.designdecisions.concern;

import java.util.List;
import java.util.stream.Collectors;

import ConcernModel.Concern;
import ConcernModel.ConcernRepository;
import ConcernModel.ConcernStrategy;
import SolutionModel.Solution;
import de.uka.ipd.sdq.pcm.designdecision.specific.ConcernDegree;
import de.uka.ipd.sdq.pcm.designdecision.specific.specificFactory;

public class ConcernDesignDecision {

	private final ConcernRepository concernRepository;

	public ConcernDesignDecision(ConcernRepository concernRepository) {

		this.concernRepository = concernRepository;

	}

	public List<ConcernDegree> generateConcernDegrees() {

		return this.concernRepository.getConcerns().stream().map(eachConcern -> this.generateConcernDegreeWith(eachConcern)).filter(eachConcernDegree -> this.hasDesignOptions(eachConcernDegree))
				.collect(Collectors.toList());

	}

	private ConcernDegree generateConcernDegreeWith(Concern concern) {
		ConcernDegree concernDegree = specificFactory.eINSTANCE.createConcernDegree();
		concernDegree.setPrimaryChanged(concern);
		concernDegree.getClassDesignOptions().addAll(this.getConcernSolutionsOf(concern));
		return concernDegree;

	}

	private boolean hasDesignOptions(ConcernDegree concernDegree) {

		return !concernDegree.getClassDesignOptions().isEmpty();

	}

	private List<Solution> getConcernSolutionsOf(Concern concern) {
		List<ConcernStrategy> strategies = concern.getStrategies();
		if (strategies.size() > 1) {
			throw new RuntimeException("More than one strategy is currently not supported");
		}
		List<Solution> concernSolutions = strategies.get(0).getConcernSolutions();
		return concernSolutions;

	}

}
