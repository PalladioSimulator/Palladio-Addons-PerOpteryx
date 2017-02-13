package edu.kit.ipd.are.dsexplore.concern.manager;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import ConcernModel.Annotation;
import ConcernModel.AnnotationEnrich;
import ConcernModel.AnnotationTarget;
import ConcernModel.Association;
import ConcernModel.Concern;
import ConcernModel.DeploymentConstraint;
import ConcernModel.ElementaryConcernComponent;

public class ConcernManager {

	private static ConcernManager eInstance = null;
	
	private Concern concern;
	
	/**
	 * The constructor.
	 */
	private ConcernManager() {
		
	}
	
	public static ConcernManager getBy(Concern concern) {
		
		if (eInstance == null) {
			
			eInstance = new ConcernManager();
			
		}
		
		eInstance.concern = concern;
		
		return eInstance;
	}
	
	public List<ElementaryConcernComponent> getECCs() {
		
		return this.concern.getComponents();
		
	}
	
	public Optional<ElementaryConcernComponent> getElementaryConcernComponentBy(AnnotationEnrich annotationEnrich) {
		
		for (ElementaryConcernComponent eachECC : this.concern.getComponents()) {
		
			if (getNamesOf(eachECC.getAnnotationenrich()).contains(annotationEnrich.getName())) {
				
				return Optional.of(eachECC);
				
			}
		
		}
	
		return Optional.empty();
		
	}

	private List<String> getNamesOf(List<? extends Annotation> annotations) {
		
		return annotations.stream().map(eachAnnotation -> eachAnnotation.getName()).collect(Collectors.toList());
		
	}

	public HashMap<AnnotationEnrich, Optional<AnnotationTarget>> getTargetAnnotationOf(List<AnnotationEnrich> enrichAnnotations) {
		
		HashMap<AnnotationEnrich, Optional<AnnotationTarget>> enrichToTargetAnnotationMap = new HashMap<AnnotationEnrich, Optional<AnnotationTarget>>();
		
		for (AnnotationEnrich eachEnrichAnnotation : enrichAnnotations) {
			
			enrichToTargetAnnotationMap.put(eachEnrichAnnotation, getTargetAnnotationOf(eachEnrichAnnotation));
			
		}
		
		return enrichToTargetAnnotationMap;
		
	}
	
	private Optional<AnnotationTarget> getTargetAnnotationOf(AnnotationEnrich enrichAnnotation) {
		
		return this.concern.getConstraints().stream().filter(eachConstraint -> hasCorrespondingTargetAnnotation(eachConstraint, enrichAnnotation))
											  		 .map(constraint -> getTargetAnnotationOf(constraint).get())
											  		 .findFirst();
		
	}
	
	private Optional<AnnotationTarget> getTargetAnnotationOf(DeploymentConstraint constraint) {
		
		return constraint.getAnnotations().stream().filter(annotation -> annotation instanceof AnnotationTarget)
												   .map(eachAnnotation -> (AnnotationTarget) eachAnnotation)
												   .findFirst();
		
	}
	
	private boolean hasCorrespondingTargetAnnotation(DeploymentConstraint constraint, AnnotationEnrich enrichAnnotation) {
		
		return constraint.getAnnotations().contains(enrichAnnotation) && getTargetAnnotationOf(constraint).isPresent();
		
	}

	public Association getDeploymentConstraintOf(AnnotationEnrich enrichAnnotation) {
		
		return getDeploymentConstraintOf(Arrays.asList(enrichAnnotation));
		
	}
	
	public Association getDeploymentConstraintOf(Annotation firstAnnotation, Annotation secondAnnotation) {
		
		return getDeploymentConstraintOf(Arrays.asList(firstAnnotation, secondAnnotation));
		
	}
	
	private Association getDeploymentConstraintOf(List<Annotation> searchedAnnotations) {
		
		return this.concern.getConstraints().stream().filter(eachConstraint -> matches(searchedAnnotations, eachConstraint))
				 									 .map(constraint -> constraint.getAssociation())
				 									 .findFirst().orElse(Association.INDIFFERENT);
		
	}

	private boolean matches(List<Annotation> searchedAnnotations, DeploymentConstraint constraint) {

		List<Annotation> constrainedAnnotationPair = new ArrayList<Annotation>(constraint.getAnnotations());
		searchedAnnotations.forEach(eachAnnotation -> {
			
			constrainedAnnotationPair.removeIf(eachGivenAnnotation -> eachGivenAnnotation.getName().equals(eachAnnotation.getName()));
			
		});
		
		return constrainedAnnotationPair.size() == 0;
		
	}
	
}
