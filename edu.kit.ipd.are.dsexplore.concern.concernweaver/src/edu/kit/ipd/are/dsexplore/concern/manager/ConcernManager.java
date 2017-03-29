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
import edu.kit.ipd.are.dsexplore.concern.util.Pair;

/**
 * This class provides all operations performed on a given concern.
 * @author scheerer
 *
 */
public class ConcernManager {

	private static ConcernManager eInstance = null;
	
	private Concern concern;
	
	private ConcernManager() {
		
	}
	
	/**
	 * Creates or returns a ConcernManager-instance.
	 * @param concern - A given concern.
	 * @return a ConcernManager-instance.
	 */
	public static ConcernManager getInstanceBy(Concern concern) {
		
		if (eInstance == null) {
			
			eInstance = new ConcernManager();
			
		}
		
		eInstance.concern = concern;
		
		return eInstance;
	}
	
	/**
	 * Retrieve the ECC which contains the corresponding enrich annotation.
	 * @param annotationEnrich - The enrich annotation of the ECC that is suppose to be retrieved.
	 * @return An optional of the retrieved ECC.
	 */
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

	/**
	 * Creates a map of enrich and target pairs which are constraint.
	 * @param enrichs - A list of enrich annotations.
	 * @return a map of enrich and potential target pairs.
	 */
	public HashMap<AnnotationEnrich, Optional<AnnotationTarget>> getTargetAnnotationOf(List<AnnotationEnrich> enrichs) {
		
		HashMap<AnnotationEnrich, Optional<AnnotationTarget>> enrichToTargetAnnotationMap = new HashMap<AnnotationEnrich, Optional<AnnotationTarget>>();
		for (AnnotationEnrich enrich : enrichs) {
			
			for (Optional<AnnotationTarget> potentialTarget : getTargetsOfConstraintsContaining(enrich)) {
				
				enrichToTargetAnnotationMap.put(enrich, potentialTarget);
				
			}
			
		}
		
		return enrichToTargetAnnotationMap;
		
	}

	private List<Optional<AnnotationTarget>> getTargetsOfConstraintsContaining(AnnotationEnrich enrich) {
		
		return this.concern.getConstraints().stream().filter(eachConstraint -> containsCorrespondingTarget(eachConstraint, enrich))
											  		 .map(constraint -> getTargetAnnotationOf(constraint))
											  		 .collect(Collectors.toList());
		
	}
	
	private boolean containsCorrespondingTarget(DeploymentConstraint constraint, AnnotationEnrich enrich) {
		
		return constraint.getAnnotations().contains(enrich) && getTargetAnnotationOf(constraint).isPresent();
		
	}
	
	//It is assumed that constraint.getAnnotations().size() == 2, if association != ISOLATED
	private Optional<AnnotationTarget> getTargetAnnotationOf(DeploymentConstraint constraint) {
		
		return constraint.getAnnotations().stream().filter(annotation -> annotation instanceof AnnotationTarget)
												   .map(eachAnnotation -> (AnnotationTarget) eachAnnotation)
												   .findFirst();
		
	}

	/**
	 * Retrieves the association for a given enrich annotations.
	 * @param enrich - The enrich annotation.
	 * @return The corresponding association.
	 */
	public Association getDeploymentConstraintOf(AnnotationEnrich enrich) {
		
		return getDeploymentConstraintOf(Arrays.asList(enrich));
		
	}
	
	/**
	 * Retrieves the association for a given annotation  pair.
	 * @param annotationPair - The annotation pair.
	 * @return The corresponding association.
	 */
	public Association getDeploymentConstraintOf(Pair<Annotation,Annotation> annotationPair) {
		
		return getDeploymentConstraintOf(Arrays.asList(annotationPair.getFirst(), annotationPair.getSecond()));
		
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
