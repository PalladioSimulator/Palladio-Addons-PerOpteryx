package de.uka.ipd.sdq.dsexplore.designdecisions.concern;

import java.util.List;
import java.util.stream.Collectors;

import org.palladiosimulator.pcm.repository.Repository;

import ConcernModel.Concern;
import ConcernModel.ConcernRepository;
import SolutionModel.Solution;
import de.uka.ipd.sdq.pcm.designdecision.specific.ConcernDegree;
import de.uka.ipd.sdq.pcm.designdecision.specific.specificFactory;

public class ConcernDesignDecision {

	private final ConcernRepository concernRepository;
	
	public ConcernDesignDecision(ConcernRepository concernRepository) {
		
		this.concernRepository = concernRepository;
		
	}

	public List<ConcernDegree> generateConcernDegrees() {
		
		return this.concernRepository.getConcerns().stream().map(eachConcern -> generateConcernDegreeWith(eachConcern))
															.filter(eachConcernDegree -> hasDesignOptions(eachConcernDegree))
															.collect(Collectors.toList());
		
	}

	private ConcernDegree generateConcernDegreeWith(Concern concern) {
		
		ConcernDegree concernDegree = specificFactory.eINSTANCE.createConcernDegree();
		concernDegree.setPrimaryChanged(concern);
		concernDegree.getClassDesignOptions().addAll(getConcernSolutionsOf(concern));
		
		return concernDegree;
		
	}

	private boolean hasDesignOptions(ConcernDegree concernDegree) {
		
		return !concernDegree.getClassDesignOptions().isEmpty();
		
	}
	
	private List<Repository> getConcernSolutionsOf(Concern concern) {
	
		List<Solution> concernSolutions = concern.getStrategies().get(0).getConcernSolutions();	
		return concernSolutions.stream().map(eachSolution -> eachSolution.getRepository()).collect(Collectors.toList());
		
	}
	
}
