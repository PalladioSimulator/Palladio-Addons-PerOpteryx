package edu.kit.ipd.are.dsexplore.featurecompletions.weaver.strategy.handler;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.eclipse.emf.common.util.EList;
import org.modelversioning.emfprofileapplication.StereotypeApplication;
import org.palladiosimulator.pcm.core.entity.Entity;
import org.palladiosimulator.pcm.core.entity.InterfaceProvidingEntity;
import org.palladiosimulator.pcm.repository.Interface;
import org.palladiosimulator.pcm.repository.OperationInterface;
import org.palladiosimulator.pcm.repository.OperationProvidedRole;
import org.palladiosimulator.pcm.repository.OperationSignature;
import org.palladiosimulator.pcm.repository.ProvidedRole;
import org.palladiosimulator.pcm.repository.Repository;
import org.palladiosimulator.pcm.repository.RepositoryComponent;
import org.palladiosimulator.pcm.repository.RepositoryFactory;
import org.palladiosimulator.pcm.repository.RepositoryPackage;
import org.palladiosimulator.pcm.repository.impl.OperationInterfaceImpl;
import org.palladiosimulator.solver.transformations.EMFHelper;

import FeatureCompletionModel.ComplementumVisnetis;
import FeatureCompletionModel.CompletionComponent;
import FeatureCompletionModel.FeatureCompletion;
import FeatureCompletionModel.PerimeterProviding;
import de.uka.ipd.sdq.dsexplore.tools.primitives.Pair;
import de.uka.ipd.sdq.dsexplore.tools.stereotypeapi.EMFProfileFilter;
import de.uka.ipd.sdq.dsexplore.tools.stereotypeapi.EcoreReferenceResolver;
import de.uka.ipd.sdq.dsexplore.tools.stereotypeapi.StereotypeAPIHelper;
import edu.kit.ipd.are.dsexplore.featurecompletions.weaver.FCCUtil;
import edu.kit.ipd.are.dsexplore.featurecompletions.weaver.port.FCCWeaverException;
import edu.kit.ipd.are.dsexplore.featurecompletions.weaver.strategy.manager.SolutionManager;
import featureObjective.Feature;

/**
 * This class is responsible to resolve the corresponding provided roles a
 * particular ECC is providing.
 *
 * @author scheerer
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
				for (RepositoryComponent comps : solutionManager.getRepository().getComponents__Repository()) {
					for (ProvidedRole provided: comps.getProvidedRoles_InterfaceProvidingEntity()) {
						if (provided instanceof OperationProvidedRole)
							if (FCCUtil.areEqual(((OperationProvidedRole)provided).getProvidedInterface__OperationProvidedRole(), partAndCV.first))
								result.add(provided);
					}
				}
			} else if (partAndCV.first instanceof OperationSignature) {
				OperationInterface parentPartAndCVFirst = (OperationInterface)partAndCV.first.eContainer();
				for (RepositoryComponent comps : solutionManager.getRepository().getComponents__Repository()) {
					for (ProvidedRole provided: comps.getProvidedRoles_InterfaceProvidingEntity()) {
						if (provided instanceof OperationProvidedRole)
							if (FCCUtil.areEqual(((OperationProvidedRole)provided).getProvidedInterface__OperationProvidedRole(), parentPartAndCVFirst))
								result.add(provided);
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

	// TODO added for extension
	public List<OperationInterface> getFullfillingInterfacesFor(ComplementumVisnetis cv) throws FCCWeaverException {

		List<OperationInterface> result = new ArrayList<>();
		List<OperationInterface> allInterfaces = this.solutionManager.getAllProvidedRoles().stream()
				.map(providedRole -> ((OperationProvidedRole) providedRole).getProvidedInterface__OperationProvidedRole()).collect(Collectors.toList());
		for (OperationInterface iface : allInterfaces) {
			boolean match = this.isFeature(iface);
			match = match && this.areEqual(cv, this.getCVOf(iface));
			if (match) {
				result.add(iface);
			}
		}
		return result;
	}

	// TODO added for extension
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

	// TODO added for extension
	public List<ProvidedRole> getProvidedRolesOf(CompletionComponent fcc, ComplementumVisnetis cv) throws FCCWeaverException {

		List<ProvidedRole> result = new ArrayList<>();
		List<ProvidedRole> allProvidedRoles = this.solutionManager.getAllProvidedRoles();
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

	// TODO added for extension
	public List<ProvidedRole> getPerimeterProvidedRolesFor(ComplementumVisnetis cv, FeatureCompletion fc, Repository repo) throws FCCWeaverException {
		Feature feature = cv.getComplementaryFeature();
		List<ProvidedRole> result = new ArrayList<>();

		for (CompletionComponent fccCurrent : fc.getCompletionComponents()) {
			if (fccCurrent.getPerimeterProviding().getFeatureProviding().stream().anyMatch(f -> f.getId().equals(feature.getId()))) {
				// List<RepositoryComponent> components =
				// this.mergedRepoManager.getAffectedComponentsByFCCList(Arrays.asList(fccCurrent));
				// TODO select only providedRoles for current solution Choice
				List<RepositoryComponent> components = this.solutionManager.getAffectedComponentsByFCCList(Arrays.asList(fccCurrent), repo);
				List<ProvidedRole> providedRoles = components.stream().map(component -> component.getProvidedRoles_InterfaceProvidingEntity().get(0)).collect(Collectors.toList()); // TODO
																																													// Annahme:
																																													// Completion
																																													// Component
																																													// mit
																																													// Perimeter
																																													// Providing
																																													// hat
																																													// nur
																																													// genau
																																													// 1
																																													// Provided
																																													// Role
				result.addAll(providedRoles);
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

	// TODO added for extension
	private boolean isFeature(OperationInterface operationInterface) {
		return EMFProfileFilter.isAnnotated(operationInterface);
	}

	/**
	 * @param cv
	 * @param cvOf
	 * @return
	 */
	// TODO added for extension
	private boolean areEqual(ComplementumVisnetis cv, ComplementumVisnetis cvOf) {
		return cv.getId().equals(cvOf.getId());
	}

	/**
	 * @param iface
	 * @return
	 */
	// TODO added for extension
	private ComplementumVisnetis getCVOf(OperationInterface iface) {
		StereotypeApplication stereotypeApplication = EMFProfileFilter.getStereotypeApplicationsFrom(iface).get(0);
		return this.getCVFrom(stereotypeApplication).get();
	}

	/**
	 * @param stereotypeApplication
	 * @return
	 */
	// TODO added for extension
	private Optional<ComplementumVisnetis> getCVFrom(StereotypeApplication stereotypeApplication) {
		List<ComplementumVisnetis> cvs = this.getCVsFrom(stereotypeApplication);
		return cvs.isEmpty() ? Optional.empty() : Optional.of(cvs.get(0));
	}

	/**
	 * @param stereotypeApplication
	 * @return
	 */
	// TODO added for extension
	private List<ComplementumVisnetis> getCVsFrom(StereotypeApplication stereotypeApplication) {
		return new EcoreReferenceResolver(stereotypeApplication).getCrossReferencedElementsOfType(ComplementumVisnetis.class);
	}

	private List<Pair<Entity, ComplementumVisnetis>> extractProvidedCVs() {
		List<Pair<Entity, ComplementumVisnetis>> result = new ArrayList<>();
		Repository pcmRepo = this.solutionManager.getRepository();

		for (RepositoryComponent rc : pcmRepo.getComponents__Repository()) {
			List<ComplementumVisnetis> cvsRc = StereotypeAPIHelper.getViaStereoTypeFrom(rc, ComplementumVisnetis.class, "fulfillsComplementumVisnetis");
			for (ComplementumVisnetis cv : cvsRc) {
				result.add(Pair.of(rc, cv));
			}
		}
		for (Interface iface : pcmRepo.getInterfaces__Repository()) {
			if (!(iface instanceof OperationInterface)) {
				continue;
			}
			OperationInterface opIface = (OperationInterface) iface;
			List<ComplementumVisnetis> cvsIface = StereotypeAPIHelper.getViaStereoTypeFrom(opIface, ComplementumVisnetis.class, "fulfillsComplementumVisnetis");
			for (ComplementumVisnetis cv : cvsIface) {
				result.add(Pair.of(opIface, cv));
			}

			for (OperationSignature opSig : opIface.getSignatures__OperationInterface()) {
				List<ComplementumVisnetis> cvsSig = StereotypeAPIHelper.getViaStereoTypeFrom(opSig, ComplementumVisnetis.class, "fulfillsComplementumVisnetis");
				for (ComplementumVisnetis cv : cvsSig) {
					result.add(Pair.of(opSig, cv));
				}
			}
		}

		return result;
	}

	// private List<ProvidedRole> getProvidedRoleSpace() {
	// return this.mergedRepoManager.getAllProvidedRoles();
	// }
	//
	// private boolean isFeature(ProvidedRole providedRole) {
	// return EMFProfileFilter.isAnnotated(providedRole);
	// }
	//
	// private boolean areEqual(Feature feature1, Feature feature2) {
	// return feature1.getId().equals(feature2.getId());
	// }

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

	// private Feature getFeatureOf(ProvidedRole providedRole) {
	// StereotypeApplication stereotypeApplication =
	// EMFProfileFilter.getStereotypeApplicationsFrom(providedRole).get(0);
	// return this.getFeatureFrom(stereotypeApplication).get();
	// }

	// private Optional<Feature> getFeatureFrom(StereotypeApplication
	// stereotypeApplication) {
	// List<Feature> features = this.getFeaturesFrom(stereotypeApplication);
	// return features.isEmpty() ? Optional.empty() :
	// Optional.of(features.get(0));
	// }

	// private List<Feature> getFeaturesFrom(StereotypeApplication
	// stereotypeApplication) {
	// return new
	// EcoreReferenceResolver(stereotypeApplication).getCrossReferencedElementsOfType(Feature.class);
	// }

}
