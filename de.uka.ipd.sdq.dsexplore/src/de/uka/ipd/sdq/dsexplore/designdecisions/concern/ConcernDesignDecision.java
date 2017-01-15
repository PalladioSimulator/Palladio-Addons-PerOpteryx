package de.uka.ipd.sdq.dsexplore.designdecisions.concern;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.palladiosimulator.pcm.repository.Repository;

import ConcernModel.Annotation;
import ConcernModel.Concern;
import ConcernModel.ConcernRepository;
import de.uka.ipd.sdq.pcm.designdecision.specific.ConcernDegree;
import de.uka.ipd.sdq.pcm.designdecision.specific.specificFactory;
import edu.kit.ipd.are.dsexplore.concern.util.AnnotationFilter;

public class ConcernDesignDecision {

	private final ConcernRepository concernRepository;
	private final List<Repository> repositories;
	
	public ConcernDesignDecision(ConcernRepository concernRepository, List<Repository> repositories) {
		
		this.concernRepository = concernRepository;
		this.repositories = repositories;
		
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
	
		return getConcernRepositoriesWith(getEnrichAnnotationsOf(concern));
		
	}

	private List<Repository> getConcernRepositoriesWith(List<Annotation> enrichAnnotations) {
		
		return this.repositories.stream().filter(eachRepository -> containsAnnotations(eachRepository, enrichAnnotations))
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
