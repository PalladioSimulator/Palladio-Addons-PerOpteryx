package edu.kit.ipd.are.dsexplore.featurecompletions.weaver.strategy.handler;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.palladiosimulator.pcm.core.entity.Entity;
import org.palladiosimulator.pcm.repository.OperationInterface;
import org.palladiosimulator.pcm.repository.OperationProvidedRole;
import org.palladiosimulator.pcm.repository.OperationSignature;
import org.palladiosimulator.pcm.repository.ProvidedRole;
import org.palladiosimulator.pcm.repository.Repository;
import org.palladiosimulator.pcm.repository.RepositoryComponent;

import FeatureCompletionModel.ComplementumVisnetis;
import FeatureCompletionModel.CompletionComponent;
import FeatureCompletionModel.FeatureCompletion;
import FeatureCompletionModel.PerimeterProviding;

import de.uka.ipd.sdq.dsexplore.tools.primitives.Pair;

import edu.kit.ipd.are.dsexplore.featurecompletions.weaver.FCCUtil;
import edu.kit.ipd.are.dsexplore.featurecompletions.weaver.port.FCCWeaverException;
import edu.kit.ipd.are.dsexplore.featurecompletions.weaver.strategy.manager.SolutionManager;

import featureObjective.Feature;

/**
 * This class is responsible to resolve the corresponding provided roles a
 * particular ECC is providing.
 *
 * @author scheerer, Maximilian Eckert (maximilian.eckert@student.kit.edu, maxieckert@web.de)
 *
 */
public class FCCFeatureHandler {

	private final SolutionManager solutionManager;

	public FCCFeatureHandler(SolutionManager mergedRepoManager) {
		this.solutionManager = mergedRepoManager;
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
		Feature providedFCCFeature = this.getFeatureProvidedBy(fcc);
		List<ProvidedRole> result = new ArrayList<>();

		for (Pair<Entity, ComplementumVisnetis> partAndCV : this.extractProvidedCVs()) {
			if (!FCCUtil.areEqual(partAndCV.second.getComplementaryFeature(), providedFCCFeature)) {
				continue;
			}

			if (partAndCV.first instanceof OperationInterface) {
				for (RepositoryComponent comps : this.solutionManager.getRepository().getComponents__Repository()) {
					for (ProvidedRole provided : comps.getProvidedRoles_InterfaceProvidingEntity()) {
						if (provided instanceof OperationProvidedRole) {
							if (FCCUtil.areEqual(((OperationProvidedRole) provided).getProvidedInterface__OperationProvidedRole(), partAndCV.first)) {
								result.add(provided);
							}
						}
					}
				}
			} else if (partAndCV.first instanceof OperationSignature) {
				OperationInterface parentPartAndCVFirst = (OperationInterface) partAndCV.first.eContainer();
				for (RepositoryComponent comps : this.solutionManager.getRepository().getComponents__Repository()) {
					for (ProvidedRole provided : comps.getProvidedRoles_InterfaceProvidingEntity()) {
						if (provided instanceof OperationProvidedRole) {
							if (FCCUtil.areEqual(((OperationProvidedRole) provided).getProvidedInterface__OperationProvidedRole(), parentPartAndCVFirst)) {
								result.add(provided);
							}
						}
					}
				}
			} else if (partAndCV.first instanceof RepositoryComponent) {
				RepositoryComponent rc = (RepositoryComponent) partAndCV.first;
				result.addAll(rc.getProvidedRoles_InterfaceProvidingEntity());
			}
		}

		// for (ProvidedRole role : this.getProvidedRoleSpace()) {
		// boolean match = this.isFeature(role);
		// match = match && this.areEqual(providedECCFeature,
		// this.getFeatureOf(role));
		// if (match) {
		// result.add(role);
		// }
		// }
		return result;
	}

	// TODO added for Behaviour
//	private List<OperationInterface> getFullfillingInterfacesFor(ComplementumVisnetis cv) throws FCCWeaverException {
//
//		List<OperationInterface> result = new ArrayList<>();
//		List<OperationInterface> allInterfaces = this.solutionManager.getAllProvidedRoles().stream()
//				.map(providedRole -> ((OperationProvidedRole) providedRole).getProvidedInterface__OperationProvidedRole()).collect(Collectors.toList());
//		for (OperationInterface iface : allInterfaces) {
//			boolean match = this.isFeature(iface);
//			match = match && this.areEqual(cv, this.getCVOf(iface));
//			if (match) {
//				result.add(iface);
//			}
//		}
//		return result;
//	}

	/**
	 * Determines the FCC of a FC that offers the specified complementum visnetis via its perimeter provided interface.
	 * 
	 * @param cv the complementum visnetis.
	 * @param fc the feature completion.
	 * @return the FCC that offers the specified complementum visnetis.
	 * @throws FCCWeaverException
	 */
	public CompletionComponent getPerimeterProvidingFCCFor(ComplementumVisnetis cv, FeatureCompletion fc) throws FCCWeaverException {
		Feature feature = cv.getComplementaryFeature();
		CompletionComponent fcc = null;

		for (CompletionComponent fccCurrent : fc.getCompletionComponents()) {
			if (fccCurrent.getPerimeterProviding().getFeatureProviding().stream().anyMatch(f -> f.getId().equals(feature.getId()))) {
				fcc = fccCurrent;
			}
		}
		return fcc;
	}

	// TODO added for Behaviour
//	private List<ProvidedRole> getProvidedRolesOf(CompletionComponent fcc, ComplementumVisnetis cv) throws FCCWeaverException {
//
//		List<ProvidedRole> result = new ArrayList<>();
//		List<ProvidedRole> allProvidedRoles = this.solutionManager.getAllProvidedRoles();
//		for (ProvidedRole providedRole : allProvidedRoles) {
//			EList<OperationSignature> allSignatures = ((OperationProvidedRole) providedRole).getProvidedInterface__OperationProvidedRole().getSignatures__OperationInterface();
//			for (OperationSignature operationSignature : allSignatures) {
//				boolean match = this.isFeature(operationSignature);
//				match = match && this.areEqual(cv, this.getCVOf(operationSignature));
//				if (match) {
//					result.add(providedRole);
//					break;
//				}
//			}
//		}
//		return result;
//	}

	// TODO added for Behaviour
	public ProvidedRole getPerimeterProvidedRoleFor(ComplementumVisnetis cv, FeatureCompletion fc, Repository repo) throws FCCWeaverException {
		Feature feature = cv.getComplementaryFeature();
		List<ProvidedRole> result = new ArrayList<>();

		for (CompletionComponent fccCurrent : fc.getCompletionComponents()) {
			if (fccCurrent.getPerimeterProviding().getFeatureProviding().stream().anyMatch(f -> f.getId().equals(feature.getId()))) {
				// List<RepositoryComponent> components =
				// this.mergedRepoManager.getAffectedComponentsByFCCList(Arrays.asList(fccCurrent));
				// TODO select only providedRoles for current solution Choice
				List<RepositoryComponent> components = this.solutionManager.getAffectedComponentsByFCCList(Arrays.asList(fccCurrent));
				RepositoryComponent component = this.solutionManager.getComponentFullfillingCV(components, Arrays.asList(cv));
				List<ProvidedRole> providedRoles = component.getProvidedRoles_InterfaceProvidingEntity(); // TODO welche Iface??
				// Role
				result.addAll(providedRoles);
			}
		}
		if (result.size() != 1) {
			throw new FCCWeaverException("there should only be one perimteter role providing the selected cv");
		}
		return result.get(0);
	}

//	/**
//	 * @param operationSignature
//	 * @return
//	 */
//	private ComplementumVisnetis getCVOf(OperationSignature operationSignature) {
//		StereotypeApplication stereotypeApplication = EMFProfileFilter.getStereotypeApplicationsFrom(operationSignature).get(0);
//		return this.getCVFrom(stereotypeApplication).get();
//	}

//	/**
//	 * @param operationSignature
//	 * @return
//	 */
//	private boolean isFeature(OperationSignature operationSignature) {
//		return EMFProfileFilter.isAnnotated(operationSignature);
//	}

//	// TODO added for Behaviour
//	private boolean isFeature(OperationInterface operationInterface) {
//		return EMFProfileFilter.isAnnotated(operationInterface);
//	}

//	/**
//	 * @param cv
//	 * @param cvOf
//	 * @return
//	 */
//	// TODO added for Behaviour
//	private boolean areEqual(ComplementumVisnetis cv, ComplementumVisnetis cvOf) {
//		return cv.getId().equals(cvOf.getId());
//	}

//	/**
//	 * @param iface
//	 * @return
//	 */
//	// TODO added for Behaviour
//	private ComplementumVisnetis getCVOf(OperationInterface iface) {
//		StereotypeApplication stereotypeApplication = EMFProfileFilter.getStereotypeApplicationsFrom(iface).get(0);
//		return this.getCVFrom(stereotypeApplication).get();
//	}

//	/**
//	 * @param stereotypeApplication
//	 * @return
//	 */
//	// TODO added for Behaviour
//	private Optional<ComplementumVisnetis> getCVFrom(StereotypeApplication stereotypeApplication) {
//		List<ComplementumVisnetis> cvs = this.getCVsFrom(stereotypeApplication);
//		return cvs.isEmpty() ? Optional.empty() : Optional.of(cvs.get(0));
//	}

//	/**
//	 * @param stereotypeApplication
//	 * @return
//	 */
//	// TODO added for Behaviour
//	private List<ComplementumVisnetis> getCVsFrom(StereotypeApplication stereotypeApplication) {
//		return new EcoreReferenceResolver(stereotypeApplication).getCrossReferencedElementsOfType(ComplementumVisnetis.class);
//	}

	public List<Pair<Entity, ComplementumVisnetis>> extractProvidedCVs() {
		return FeatureHelper.getCVsFromRepo(this.solutionManager.getRepository());
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
}
