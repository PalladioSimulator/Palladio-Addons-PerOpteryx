package de.uka.ipd.sdq.dsexplore.designdecisions.concern;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.palladiosimulator.pcm.repository.Repository;

import ConcernModel.Annotation;
import ConcernModel.Concern;
import ConcernModel.ConcernRepository;
import SolutionModel.Solution;
import de.uka.ipd.sdq.pcm.designdecision.specific.ConcernDegree;
import de.uka.ipd.sdq.pcm.designdecision.specific.specificFactory;
import edu.kit.ipd.are.dsexplore.concern.emfprofilefilter.AnnotationFilter;
import edu.kit.ipd.are.dsexplore.concern.emfprofilefilter.EMFProfileFilter;

public class ConcernDesignDecision {

	private final ConcernRepository concernRepository;
	private final Stream<Repository> repositories;
	
	public ConcernDesignDecision(ConcernRepository concernRepository, List<Repository> repositories) {
		
		this.concernRepository = concernRepository;
		this.repositories = repositories.stream();
		
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
	
		//return getConcernRepositoriesWith(getEnrichAnnotationsOf(concern));
//		return getSolutionsOf(concern).map(eachSolution -> getRepositoryContaining(eachSolution).orElse(null))
//									  .filter(eachRepo -> eachRepo != null)
//									  .collect(Collectors.toList());
		List<Solution> concernSolutions = concern.getStrategies().get(0).getConcernSolutions();
		if (concernSolutions.isEmpty()) {
			
			//throw new Exception();
			
		}
		
		return concernSolutions.stream().map(eachSolution -> eachSolution.getRepository()).collect(Collectors.toList());
		
	}
	
	private Optional<Repository> getRepositoryContaining(Solution solution) {
		
		return this.repositories.filter(eachRepo -> contains(solution, eachRepo))
								.findFirst();
		
	}

	private boolean contains(Solution solution, Repository repository) {
		
		TreeIterator<EObject> iterator = repository.eAllContents();
		while (iterator.hasNext()) {
			
			if (EMFProfileFilter.isAnnotatedWith(getSearchCriteria(solution), iterator.next())) {
				
				return true;
				
			}
			
		}
		
		return false;
				
	}

	private Predicate<EObject> getSearchCriteria(Solution solution) {
		
		return object -> (object instanceof Solution) && (((Solution) object).getName().equals(solution.getName()));
		
	}

	//TODO: Concern Degree for each strategy? at this point we consider only one strategy
	private Stream<Solution> getSolutionsOf(Concern concern) {
		
		return concern.getStrategies().get(0).getConcernSolutions().stream();
		
	}

	private List<Repository> getConcernRepositoriesWith(List<Annotation> enrichAnnotations) {
		
		return this.repositories.filter(eachRepository -> containsAnnotations(eachRepository, enrichAnnotations))
								.collect(Collectors.toList());
		
	}

	private boolean containsAnnotations(Repository repository, List<Annotation> enrichAnnotations) {
		
		return !new AnnotationFilter(Arrays.asList(repository)).getComponentsAnnotatedWith(enrichAnnotations).isEmpty(); 
		
	}

	private List<Annotation> getEnrichAnnotationsOf(Concern concern) {
		
		return concern.getComponents().stream().flatMap(eachComponent -> eachComponent.getAnnotationenrich().stream())
											   .collect(Collectors.toList());
		
	}
	
}
