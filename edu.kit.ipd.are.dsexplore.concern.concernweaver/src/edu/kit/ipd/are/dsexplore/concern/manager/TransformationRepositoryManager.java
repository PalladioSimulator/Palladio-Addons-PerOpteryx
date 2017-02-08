package edu.kit.ipd.are.dsexplore.concern.manager;

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
	
	private TransformationRepositoryManager(Transformation transformation) {
		
		this.transformationRepository = TransformationModelFactory.eINSTANCE.createTransformationRepository();
		this.transformationRepository.getTransformation().add(transformation);
		
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
	
	public static TransformationRepositoryManager getNewInstanceBy(Transformation transformation) {
		
		return new TransformationRepositoryManager(transformation);
		
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
	
}
