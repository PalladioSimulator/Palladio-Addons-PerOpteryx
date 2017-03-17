package edu.kit.ipd.are.dsexplore.concern.manager;

import java.util.List;
import java.util.Optional;

import ConcernModel.AnnotationEnrich;
import ConcernModel.AnnotationTarget;
import TransformationModel.AdapterTransformation;
import TransformationModel.Appearance;
import TransformationModel.Transformation;
import TransformationModel.TransformationModelFactory;
import TransformationModel.TransformationRepository;

public class TransformationRepositoryManager {

	private static TransformationRepositoryManager instance = null;
	
	private TransformationRepository transformationRepository;
	

	private TransformationRepositoryManager() {
		
	}
	
	private TransformationRepositoryManager(List<Transformation> transformations) {
		
		this.transformationRepository = TransformationModelFactory.eINSTANCE.createTransformationRepository();
		this.transformationRepository.getTransformation().addAll(transformations);
		
	}
	
	public static void initialize(TransformationRepository transformationRepository) {
		
		instance = new TransformationRepositoryManager();
		instance.transformationRepository = transformationRepository;
		
	}
	
	public static TransformationRepositoryManager getInstance() throws NullPointerException {
		
		if (instance == null) {
			
			throw new NullPointerException("The TransformationRepositoryManager has not been initialized.");
			
		}
		
		return instance;
	}
	
	public static TransformationRepositoryManager getNewInstanceBy(List<Transformation> transformations) {
		
		return new TransformationRepositoryManager(transformations);
		
	}
	
	public Optional<Appearance> getPositionBy(AnnotationEnrich enrichAnnotation, AnnotationTarget targetAnnotation) {
		
		Optional<Transformation> transfromation = getTransformationBy(enrichAnnotation, targetAnnotation);
		if (transfromation.isPresent() && (transfromation.get() instanceof AdapterTransformation)) {
			
			return Optional.of(((AdapterTransformation) transfromation.get()).getAppear());
			
		}
		
		return Optional.empty();
		
	}
	
	public Optional<Transformation> getTransformationBy(AnnotationEnrich enrichAnnotation, AnnotationTarget targetAnnotation) {
		
		return this.transformationRepository.getTransformation().stream().filter(transformation -> hasAnnotations(transformation, enrichAnnotation, targetAnnotation))
																 		 .findFirst();
		
	}
	
	private boolean hasAnnotations(Transformation transformation, AnnotationEnrich enrichAnnotation, AnnotationTarget targetAnnotation) {
		
		return transformation.getTarget().getName().equals(targetAnnotation.getName()) &&
			   transformation.getInjectable().getName().equals(enrichAnnotation.getName());
		
	}
	
	/**
	 * Resolves for a given target annotation the corresponding enrich annotation. This function is bijective.
	 * @param targetAnnotation
	 * @return optional containing the enrich annotation or empty optional.
	 */
	public Optional<AnnotationEnrich> getEnrichAnnotationBy(AnnotationTarget targetAnnotation) {
		
		return this.transformationRepository.getTransformation().stream().filter(eachTrans -> areEqual(eachTrans.getTarget(), targetAnnotation))
																		 .map(eachTrans -> eachTrans.getInjectable())
																		 .findFirst();
		
	}

	private boolean areEqual(AnnotationTarget target1, AnnotationTarget target2) {
		
		return target1.getName().equals(target2.getName());
		
	}
	
}
