package edu.kit.ipd.are.dsexplore.featurecompletions.weaver.strategy.handler;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.eclipse.emf.common.util.EList;
import org.modelversioning.emfprofileapplication.StereotypeApplication;
import org.palladiosimulator.pcm.repository.OperationInterface;
import org.palladiosimulator.pcm.repository.OperationProvidedRole;
import org.palladiosimulator.pcm.repository.OperationSignature;
import org.palladiosimulator.pcm.repository.ProvidedRole;

import FeatureCompletionModel.ComplementumVisnetis;
import FeatureCompletionModel.CompletionComponent;
import FeatureCompletionModel.PerimeterProviding;
import de.uka.ipd.sdq.dsexplore.tools.stereotypeapi.EMFProfileFilter;
import de.uka.ipd.sdq.dsexplore.tools.stereotypeapi.EcoreReferenceResolver;
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
	 * Retrieves the provided services of a given FCC.
	 *
	 * @param fcc
	 *            - The FCC which provided services are suppose to be retrieved.
	 * @return The provided services of a given ECC.
	 * @throws FCCWeaverException
	 *             - Will be thrown if the ECC is incorrectly annotated.
	 */
	public List<ProvidedRole> getProvidedFeaturesOf(CompletionComponent fcc) throws FCCWeaverException {
		// TODO Welche Provided Roles?
		Feature providedECCFeature = this.getFeatureProvidedBy(fcc);
		List<ProvidedRole> result = new ArrayList<>();
		for (ProvidedRole role : this.getProvidedRoleSpace()) {
			boolean match = this.isFeature(role);
			match = match && this.areEqual(providedECCFeature, this.getFeatureOf(role));
			if (match) {
				result.add(role);
			}
		}
		return result;
	}
	
	//TODO added for extension
	public List<OperationInterface> getFullfillingInterfacesFor(ComplementumVisnetis cv) throws FCCWeaverException {

		List<OperationInterface> result = new ArrayList<>();
		List<OperationInterface> allInterfaces = this.mergedRepoManager.getAllProvidedRoles().stream().map(providedRole -> ((OperationProvidedRole) providedRole).getProvidedInterface__OperationProvidedRole()).collect(Collectors.toList());
		for (OperationInterface iface : allInterfaces) {
			boolean match = this.isFeature(iface);
			match = match && this.areEqual(cv, this.getCVOf(iface));
			if (match) {
				result.add(iface);
			}
		}
		return result;
	}
	
	//TODO added for extension
		public List<ProvidedRole> getProvidedRolesOf(CompletionComponent fcc, ComplementumVisnetis cv) throws FCCWeaverException {

			List<ProvidedRole> result = new ArrayList<>();
			List<ProvidedRole> allProvidedRoles = this.mergedRepoManager.getAllProvidedRoles();
			for (ProvidedRole providedRole : allProvidedRoles) {
				EList<OperationSignature> allSignatures = ((OperationProvidedRole) providedRole).getProvidedInterface__OperationProvidedRole().getSignatures__OperationInterface();
				for (OperationSignature operationSignature : allSignatures) {
					boolean match = this.isFeature(operationSignature);
					match = match && this.areEqual(cv, this.getCVOf(operationSignature));
					if (match) {
						result.add(providedRole);
						break;
					}
				}
			}
			return result;
		}

	/**
		 * @param operationSignature
		 * @return
		 */
		private ComplementumVisnetis getCVOf(OperationSignature operationSignature) {
			StereotypeApplication stereotypeApplication = EMFProfileFilter.getStereotypeApplicationsFrom(operationSignature).get(0);
			return this.getCVFrom(stereotypeApplication).get();
		}

	/**
	 * @param operationSignature
	 * @return
	 */
	private boolean isFeature(OperationSignature operationSignature) {
		return EMFProfileFilter.isAnnotated(operationSignature);
	}

	/**
	 * @param cv
	 * @param cvOf
	 * @return
	 */
	//TODO added for extension
	private boolean areEqual(ComplementumVisnetis cv, ComplementumVisnetis cvOf) {
		return cv.getId().equals(cvOf.getId());
	}

	/**
	 * @param iface
	 * @return
	 */
	//TODO added for extension
	private ComplementumVisnetis getCVOf(OperationInterface iface) {
		StereotypeApplication stereotypeApplication = EMFProfileFilter.getStereotypeApplicationsFrom(iface).get(0);
		return this.getCVFrom(stereotypeApplication).get();
	}

	/**
	 * @param stereotypeApplication
	 * @return
	 */
	//TODO added for extension
	private Optional<ComplementumVisnetis> getCVFrom(StereotypeApplication stereotypeApplication) {
		List<ComplementumVisnetis> cvs = this.getCVsFrom(stereotypeApplication);
		return cvs.isEmpty() ? Optional.empty() : Optional.of(cvs.get(0));
	}

	/**
	 * @param stereotypeApplication
	 * @return
	 */
	//TODO added for extension
	private List<ComplementumVisnetis> getCVsFrom(StereotypeApplication stereotypeApplication) {
		return new EcoreReferenceResolver(stereotypeApplication).getCrossReferencedElementsOfType(ComplementumVisnetis.class);
	}

	/**
	 * @param iface
	 * @return
	 */
	private boolean isFeature(OperationInterface iface) {
		return EMFProfileFilter.isAnnotated(iface);
	}

	private List<ProvidedRole> getProvidedRoleSpace() {
		return this.mergedRepoManager.getAllProvidedRoles();
	}

	private boolean isFeature(ProvidedRole providedRole) {
		return EMFProfileFilter.isAnnotated(providedRole);
	}

	private boolean areEqual(Feature feature1, Feature feature2) {
		return feature1.getId().equals(feature2.getId());
	}

	private Feature getFeatureProvidedBy(CompletionComponent fcc) throws FCCWeaverException {
		PerimeterProviding pp = fcc.getPerimeterProviding();
		if (pp == null) {
			throw new FCCWeaverException("No suitable amount of features provided: NIL");
		}
		List<Feature> features = pp.getFeatureProviding();
		if (features.size() != 1) {
			throw new FCCWeaverException("No suitable amount of features provided: " + features.size());
		}
		return features.get(0);
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