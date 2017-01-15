package edu.kit.ipd.are.dsexplore.concern.handler;

import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.palladiosimulator.pcm.repository.RepositoryComponent;

import ConcernModel.Annotation;
import ConcernModel.ElementaryConcernComponent;
import edu.kit.ipd.are.dsexplore.concern.manager.ConcernRepositoryManager;

public class ECCStructureHandler {
	
	private final ElementaryConcernComponent ecc;
	private final ConcernRepositoryManager concernRepositoryManager;
	
	public ECCStructureHandler(ElementaryConcernComponent ecc, ConcernRepositoryManager concernRepositoryManager) {
		
		this.ecc = ecc;
		this.concernRepositoryManager = concernRepositoryManager;
		
	}
	
	public <T> List<T> getStructureWithInECCAccordingTo(Function<RepositoryComponent, List<T>> resolvingFunction) {
		
		return concernRepositoryManager.getComponentsAnnotatedWith(getAnnotationsOfECC(false)).stream().flatMap(eachComponent -> resolvingFunction.apply(eachComponent).stream())
																								  	   .collect(Collectors.toList());
		
	}
	
	public <T> List<T> getStructureWithInECCAndRequiredAccordingTo(Function<RepositoryComponent, List<T>> resolvingFunction) {
		
		return concernRepositoryManager.getComponentsAnnotatedWith(getAnnotationsOfECC(true)).stream().flatMap(eachComponent -> resolvingFunction.apply(eachComponent).stream())
																								  	  .collect(Collectors.toList());
		
	}
	
	private List<Annotation> getAnnotationsOfECC(boolean considerRequired) {
		
		return !considerRequired ? getAnnotationsOf(ecc) : resolveAllAnnotationsOf(this.ecc);
		
	}
	
	private List<Annotation> resolveAllAnnotationsOf(ElementaryConcernComponent ecc) {
		
		List<Annotation> annotations = getAnnotationsOf(ecc);
		
		if (ecc.getRequires().isEmpty()) {
			
			return annotations;
			
		}
		
		return ecc.getRequires().stream().flatMap(eachECC -> concat(annotations, resolveAllAnnotationsOf(eachECC)))
										 .collect(Collectors.toList());
		
	}

	private Stream<Annotation> concat(List<Annotation> annotations1, List<Annotation> annotations2) {
		
		return Stream.concat(annotations1.stream(), annotations2.stream());
		
	}

	private List<Annotation> getAnnotationsOf(ElementaryConcernComponent ecc) {
		
		return ecc.getAnnotationenrich().stream().map(each -> (Annotation) each).collect(Collectors.toList());
		
	}
	
}
