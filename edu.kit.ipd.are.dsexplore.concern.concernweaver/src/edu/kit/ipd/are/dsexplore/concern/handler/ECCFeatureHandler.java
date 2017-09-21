package edu.kit.ipd.are.dsexplore.concern.handler;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;

import org.modelversioning.emfprofileapplication.StereotypeApplication;
import org.palladiosimulator.pcm.repository.ProvidedRole;

import ConcernModel.ElementaryConcernComponent;
import SolutionModel.Solution;
import concernStrategy.Feature;
import edu.kit.ipd.are.dsexplore.concern.emfprofilefilter.EMFProfileFilter;
import edu.kit.ipd.are.dsexplore.concern.exception.ConcernWeavingException;
import edu.kit.ipd.are.dsexplore.concern.exception.ErrorMessage;
import edu.kit.ipd.are.dsexplore.concern.manager.ConcernSolutionManager;
import edu.kit.ipd.are.dsexplore.concern.util.EcoreReferenceResolver;

/**
 * This class is responsible to resolve the corresponding provided roles a
 * particular ECC is providing.
 *
 * @author scheerer
 *
 */
public class ECCFeatureHandler {

	private final ConcernSolutionManager concernRepositoryManager;

	/**
	 * The constructor.
	 *
	 * @param concernSolution
	 *            - The concern solution which is explored in order to filter
	 *            all provided services.
	 */
	public ECCFeatureHandler(Solution concernSolution) {
		this.concernRepositoryManager = ConcernSolutionManager.getInstanceBy(concernSolution);
	}

	/**
	 * The constructor.
	 *
	 * @param concernRepositoryManager
	 *            - Provides several operations applied on a given concern
	 *            solution.
	 */
	public ECCFeatureHandler(ConcernSolutionManager concernRepositoryManager) {
		this.concernRepositoryManager = concernRepositoryManager;
	}

	/**
	 * Retrieves the provided services of a given ECC.
	 *
	 * @param ecc
	 *            - The ECC which provided services are suppose to be retrieved.
	 * @return The provided services of a given ECC.
	 * @throws ConcernWeavingException
	 *             - Will be thrown if the ECC is incorrectly annotated.
	 */
	public List<ProvidedRole> getProvidedFeaturesOf(ElementaryConcernComponent ecc) throws ConcernWeavingException {
		Feature providedECCFeature = this.getFeatureProvidedBy(ecc);
		List<ProvidedRole> result = new ArrayList<>();
		for (ProvidedRole role : this.getProvidedRoleSpace()) {
			if (this.isAnnotatedWithFeatureAndFeatureIsEqualTo(providedECCFeature).test(role)) {
				result.add(role);
			}
		}
		return result;
		// return
		// this.getProvidedRoleSpace().filter(this.isAnnotatedWithFeatureAndFeatureIsEqualTo(providedECCFeature)).collect(Collectors.toList());
	}

	private List<ProvidedRole> getProvidedRoleSpace() {
		return this.concernRepositoryManager.getAllProvidedRoles();
	}

	private Predicate<ProvidedRole> isAnnotatedWithFeatureAndFeatureIsEqualTo(Feature providedECCFeature) {
		return eachProvidedRole -> this.isFeature(eachProvidedRole) && this.areEqual(providedECCFeature, this.getFeatureOf(eachProvidedRole));
	}

	private boolean isFeature(ProvidedRole providedRole) {
		return EMFProfileFilter.isAnnotated(providedRole);
	}

	private boolean areEqual(Feature feature1, Feature feature2) {
		return feature1.getId().equals(feature2.getId());
	}

	private Feature getFeatureProvidedBy(ElementaryConcernComponent ecc) throws ConcernWeavingException {
		StereotypeApplication stereotypeApplication = EMFProfileFilter.getStereotypeApplicationsFrom(ecc).get(0);
		return this.getFeatureFrom(stereotypeApplication).orElseThrow(() -> new ConcernWeavingException(ErrorMessage.annotationError(ecc.getName(), Feature.class)));
	}

	private Feature getFeatureOf(ProvidedRole providedRole) {
		StereotypeApplication stereotypeApplication = EMFProfileFilter.getStereotypeApplicationsFrom(providedRole).get(0);
		return this.getFeatureFrom(stereotypeApplication).get();
	}

	private Optional<Feature> getFeatureFrom(StereotypeApplication stereotypeApplication) {
		List<Feature> features = this.getFeaturesFrom(stereotypeApplication);
		return features.isEmpty() ? Optional.empty() : Optional.of(features.get(0));
	}

	private List<Feature> getFeaturesFrom(StereotypeApplication stereotypeApplication) {
		return new EcoreReferenceResolver(stereotypeApplication).getCrossReferencedElementsOfType(Feature.class);
	}

}
