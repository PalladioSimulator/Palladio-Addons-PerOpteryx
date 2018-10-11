package edu.kit.ipd.are.dsexplore.featurecompletions.weaver.strategy.handler;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.palladiosimulator.pcm.core.entity.Entity;
import org.palladiosimulator.pcm.repository.OperationInterface;
import org.palladiosimulator.pcm.repository.OperationProvidedRole;
import org.palladiosimulator.pcm.repository.OperationSignature;
import org.palladiosimulator.pcm.repository.ProvidedRole;
import org.palladiosimulator.pcm.repository.RepositoryComponent;

import FeatureCompletionModel.ComplementumVisnetis;
import FeatureCompletionModel.CompletionComponent;
import FeatureCompletionModel.FeatureCompletion;
import FeatureCompletionModel.PerimeterProviding;

import de.uka.ipd.sdq.dsexplore.tools.primitives.Pair;
import de.uka.ipd.sdq.dsexplore.tools.stereotypeapi.StereotypeAPIHelper;
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

	/**
	 * Determines the FCC of a FC that offers the specified complementum visnetis via its perimeter provided interface.
	 * 
	 * @param selectedCVs the complementum visnetis.
	 * @param fc the feature completion.
	 * @return the FCC that offers the specified complementum visnetis.
	 * @throws FCCWeaverException
	 */
	public CompletionComponent getPerimeterProvidingFCCFor(List<ComplementumVisnetis> selectedCVs, FeatureCompletion fc) throws FCCWeaverException {
		List<Feature> selectedFeatures = selectedCVs.stream().map(selectedCV -> selectedCV.getComplementaryFeature()).collect(Collectors.toList());
		CompletionComponent fcc = null;

		for (CompletionComponent fccCurrent : fc.getCompletionComponents()) {
			List<Feature> providedFeatures = fccCurrent.getPerimeterProviding().getFeatureProviding();
			//FCC has to provide all selected CVs in order to be the entry point
			if (selectedFeatures.stream().allMatch(selectedFeature -> providedFeatures.stream().anyMatch(providedFeature -> providedFeature.getId().equals(selectedFeature.getId())))) {
				fcc = fccCurrent;
				return fcc;
			}
		}
		return fcc;
	}
	
	/**
	 * Determines the perimeter provided roles of the solution component for a given fcc.
	 * 
	 * @param completionComponent the fcc.
	 * @param selectedCVs the selected CVs.
	 * @param fc the fc to be weaved.
	 * @return the perimeter provided roles of the solution component.
	 */
	public List<OperationSignature> getPerimeterProvidedRolesFor(CompletionComponent completionComponent, List<ComplementumVisnetis> selectedCVs, FeatureCompletion fc) {
		List<OperationSignature> result = new ArrayList<>();
		
		//get solution components fulfilling fcc
		List<RepositoryComponent> components = this.solutionManager.getAffectedComponentsByFCCList(Arrays.asList(completionComponent));
		RepositoryComponent component = this.solutionManager.getComponentFullfillingCV(components, selectedCVs);
		
		//fulfilled by component
		List<ComplementumVisnetis> fullfilledByComponentCVs = StereotypeAPIHelper.getViaStereoTypeFrom(component, ComplementumVisnetis.class);
		if (SolutionManager.anyCVcontainedInList(fullfilledByComponentCVs, selectedCVs)) {
			result.addAll(component.getProvidedRoles_InterfaceProvidingEntity().stream().flatMap(role -> ((OperationProvidedRole) role).getProvidedInterface__OperationProvidedRole().getSignatures__OperationInterface().stream()).collect(Collectors.toList()));
		}
		
		//fulfilled by interface
		for (OperationInterface iface : component.getProvidedRoles_InterfaceProvidingEntity().stream().map(role -> ((OperationProvidedRole) role).getProvidedInterface__OperationProvidedRole()).collect(Collectors.toList())) {
			List<ComplementumVisnetis> fullfilledByInterfaceCVs = StereotypeAPIHelper.getViaStereoTypeFrom(iface, ComplementumVisnetis.class);
			if (SolutionManager.anyCVcontainedInList(fullfilledByInterfaceCVs, selectedCVs)) {
				result.addAll(iface.getSignatures__OperationInterface());
			}
			//fulfilled by signature
			for (OperationSignature sig : iface.getSignatures__OperationInterface()) {
				List<ComplementumVisnetis> fullfilledBySignatureCVs = StereotypeAPIHelper.getViaStereoTypeFrom(sig, ComplementumVisnetis.class);
				if (SolutionManager.anyCVcontainedInList(fullfilledBySignatureCVs, selectedCVs)) {
					result.add(sig);
				}
			}
		}
		
		return result;
	}

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
