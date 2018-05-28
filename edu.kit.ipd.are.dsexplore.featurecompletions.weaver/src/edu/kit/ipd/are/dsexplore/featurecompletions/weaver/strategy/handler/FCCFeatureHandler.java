package edu.kit.ipd.are.dsexplore.featurecompletions.weaver.strategy.handler;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;

import org.modelversioning.emfprofileapplication.StereotypeApplication;
import org.palladiosimulator.pcm.repository.ProvidedRole;

import FeatureCompletionModel.CompletionComponent;
import de.uka.ipd.sdq.dsexplore.tools.stereotypeapi.EMFProfileFilter;
import de.uka.ipd.sdq.dsexplore.tools.stereotypeapi.EcoreReferenceResolver;
import edu.kit.ipd.are.dsexplore.featurecompletions.weaver.ErrorMessage;
import edu.kit.ipd.are.dsexplore.featurecompletions.weaver.port.FCCWeaverException;
import edu.kit.ipd.are.dsexplore.featurecompletions.weaver.strategy.manager.MergedRepoManager;
import featureObjective.Feature;

/**
 * This class is responsible to resolve the corresponding provided roles a
 * particular ECC is providing.
 *
 * @author scheerer
 *
 */
public class FCCFeatureHandler {

	private final MergedRepoManager mergedRepoManager;

	public FCCFeatureHandler(MergedRepoManager mergedRepoManager) {
		this.mergedRepoManager = mergedRepoManager;
	}

	/**
	 * Retrieves the provided services of a given ECC.
	 *
	 * @param fcc
	 *            - The ECC which provided services are suppose to be retrieved.
	 * @return The provided services of a given ECC.
	 * @throws FCCWeaverException
	 *             - Will be thrown if the ECC is incorrectly annotated.
	 */
	public List<ProvidedRole> getProvidedFeaturesOf(CompletionComponent fcc) throws FCCWeaverException {
		Feature providedECCFeature = this.getFeatureProvidedBy(fcc);
		List<ProvidedRole> result = new ArrayList<>();
		for (ProvidedRole role : this.getProvidedRoleSpace()) {
			if (this.isAnnotatedWithFeatureAndFeatureIsEqualTo(providedECCFeature).test(role)) {
				result.add(role);
			}
		}
		return result;
	}

	private List<ProvidedRole> getProvidedRoleSpace() {
		return this.mergedRepoManager.getAllProvidedRoles();
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

	private Feature getFeatureProvidedBy(CompletionComponent fcc) throws FCCWeaverException {
		StereotypeApplication stereotypeApplication = EMFProfileFilter.getStereotypeApplicationsFrom(fcc).get(0);
		return this.getFeatureFrom(stereotypeApplication).orElseThrow(() -> new FCCWeaverException(ErrorMessage.annotationError(fcc.getName(), Feature.class)));
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
