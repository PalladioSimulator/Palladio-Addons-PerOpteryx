package edu.kit.ipd.are.dsexplore.concern.manager;

import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;

import ConcernModel.AnnotationEnrich;
import ConcernModel.AnnotationTarget;
import TransformationModel.AdapterTransformation;
import TransformationModel.Appearance;
import TransformationModel.Transformation;
import TransformationModel.TransformationModelFactory;
import TransformationModel.TransformationRepository;

/**
 * This class provides all operations performed on a transformation repository.
 *
 * @author scheerer
 *
 */
public class TransformationRepositoryManager {
	private static TransformationRepositoryManager instance = null;
	private TransformationRepository transformationRepository;

	private TransformationRepositoryManager() {
	}

	private TransformationRepositoryManager(List<Transformation> transformations) {
		this.transformationRepository = TransformationModelFactory.eINSTANCE.createTransformationRepository();
		this.transformationRepository.getTransformation().addAll(transformations);
	}

	/**
	 * Initializes the TransformationRepositoryManager with a given
	 * transformation repository. Note, this method has to be called in order to
	 * use the method {@link #getInstance()}.
	 *
	 * @param transformationRepository
	 *            - The transformation repository which contains all
	 *            transformation strategies.
	 */
	public static void initialize(TransformationRepository transformationRepository) {
		TransformationRepositoryManager.instance = new TransformationRepositoryManager();
		TransformationRepositoryManager.instance.transformationRepository = transformationRepository;
	}

	/**
	 * Returns the current TransformationRepositoryManager-instance.
	 *
	 * @return the TransformationRepositoryManager-instance.
	 * @throws NullPointerException
	 *             - Will be thrown if the method
	 *             {@link #initialize(TransformationRepository)} has not been
	 *             invoked before.
	 */
	public static TransformationRepositoryManager getInstance() throws NullPointerException {
		if (TransformationRepositoryManager.instance == null) {
			throw new NullPointerException("The TransformationRepositoryManager has not been initialized.");
		}
		return TransformationRepositoryManager.instance;
	}

	/**
	 * Creates a new TransformationRepositoryManager-instance given by a set of
	 * transformations.
	 *
	 * @param transformations
	 *            - A set of transformation strategies.
	 * @return
	 */
	public static TransformationRepositoryManager getNewInstanceBy(List<Transformation> transformations) {
		return new TransformationRepositoryManager(transformations);
	}

	/**
	 * Retrieves the position of an adapter transformation strategy which
	 * contains the given association pair including a target- and enrich
	 * annotation pair.
	 *
	 * @param enrich
	 *            - The enrich annotation.
	 * @param target
	 *            - The target annotation.
	 * @return the position.
	 */
	public Optional<Appearance> getPositionBy(AnnotationEnrich enrich, AnnotationTarget target) {
		Optional<Transformation> transfromation = this.getTransformationBy(enrich, target);
		if (transfromation.isPresent() && (transfromation.get() instanceof AdapterTransformation)) {
			return Optional.of(((AdapterTransformation) transfromation.get()).getAppear());
		}
		return Optional.empty();
	}

	/**
	 * Retrieves the transformation strategy which contains the given
	 * association pair including a target- and enrich annotation pair.
	 *
	 * @param enrich
	 *            - The enrich annotation.
	 * @param target
	 *            - The target annotation.
	 * @return the transformation strategy.
	 */
	public Optional<Transformation> getTransformationBy(AnnotationEnrich enrich, AnnotationTarget target) {
		for (Transformation t : this.getAllTransformations()) {
			if (this.theTransformationContaining(enrich, target).test(t)) {
				return Optional.of(t);
			}
		}
		return Optional.empty();
		// return
		// this.getAllTransformations().filter(this.theTransformationContaining(enrich,
		// target)).findFirst();
	}

	private Predicate<Transformation> theTransformationContaining(AnnotationEnrich enrich, AnnotationTarget target) {
		return this.contains(enrich).and(this.contains(target));
	}

	/**
	 * Resolves for a given target annotation the corresponding enrich
	 * annotation. This function is bijective.
	 *
	 * @param targetAnnotation
	 *            - The target annotation whose corresponding enrich annotation
	 *            is suppose to be retrieved.
	 * @return an optional containing the potential enrich annotation.
	 */
	public Optional<AnnotationEnrich> getEnrichAnnotationBy(AnnotationTarget target) {
		for (Transformation t : this.getAllTransformations()) {
			if (this.theTransformationContaining(target).test(t)) {
				AnnotationEnrich inj = t.getInjectable();
				return Optional.of(inj);
			}
		}
		return Optional.empty();
		// return
		// this.getAllTransformations().filter(this.theTransformationContaining(target)).map(eachTrans
		// -> eachTrans.getInjectable()).findFirst();

	}

	private Predicate<Transformation> theTransformationContaining(AnnotationTarget target) {
		return this.contains(target);
	}

	private Predicate<Transformation> contains(AnnotationTarget target) {
		return trans -> trans.getTarget().getName().equals(target.getName());
	}

	private Predicate<Transformation> contains(AnnotationEnrich enrich) {
		return trans -> trans.getInjectable().getName().equals(enrich.getName());
	}

	private List<Transformation> getAllTransformations() {
		return this.transformationRepository.getTransformation();
	}

}
