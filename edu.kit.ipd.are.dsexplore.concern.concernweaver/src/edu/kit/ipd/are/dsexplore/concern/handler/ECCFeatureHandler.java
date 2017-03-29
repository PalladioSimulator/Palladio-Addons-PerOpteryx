package edu.kit.ipd.are.dsexplore.concern.handler;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.modelversioning.emfprofileapplication.StereotypeApplication;
import org.palladiosimulator.mdsdprofiles.api.StereotypeAPI;
import org.palladiosimulator.pcm.repository.ProvidedRole;
import org.palladiosimulator.pcm.repository.Repository;

import ConcernModel.ElementaryConcernComponent;
import concernStrategy.Feature;
import edu.kit.ipd.are.dsexplore.concern.manager.ConcernSolutionManager;

public class ECCFeatureHandler {

	private final ConcernSolutionManager concernRepositoryManager;
	
	public ECCFeatureHandler(Repository concernSolution) {
		
		this.concernRepositoryManager = ConcernSolutionManager.getInstanceBy(concernSolution);
		
	}
	
	public ECCFeatureHandler(ConcernSolutionManager concernRepositoryManager) {
		
		this.concernRepositoryManager = concernRepositoryManager;
		
	}
	
	public List<ProvidedRole> getProvidedFeaturesOf(ElementaryConcernComponent ecc) { 
		
		Feature providedECCFeature = getFeatureProvidedBy(ecc);
		return this.concernRepositoryManager.getAllProvidedRoles().stream().filter(eachProvidedRole -> isFeature(eachProvidedRole))
																		   .filter(eachProvidedRole -> areEqual(providedECCFeature, getFeatureOf(eachProvidedRole)))
																		   .collect(Collectors.toList());
		
	}

	private Feature getFeatureProvidedBy(ElementaryConcernComponent ecc) {
		
		StereotypeApplication stereotypeApplication = StereotypeAPI.getStereotypeApplications(ecc).get(0);
		//TODO exception handling
		//return getFeatureFrom(stereotypeApplication).orElseThrow(() -> new Exception());
		return getFeatureFrom(stereotypeApplication).get();
	}

	private boolean isFeature(ProvidedRole providedRole) {
		
		return StereotypeAPI.hasStereotypeApplications(providedRole);
		
	}

	private boolean areEqual(Feature feature1, Feature feature2) {
		
		return feature1.getId().equals(feature2.getId());
		
	}

	private Feature getFeatureOf(ProvidedRole providedRole) {
		
		StereotypeApplication stereotypeApplication = StereotypeAPI.getStereotypeApplications(providedRole).get(0);
		//TODO exception handling
		//return getFeatureFrom(stereotypeApplication).orElseThrow(() -> new Exception());
		return getFeatureFrom(stereotypeApplication).get();
		
	}
	
	private Optional<Feature> getFeatureFrom(StereotypeApplication stereotypeApplication) {
		
		return stereotypeApplication.eCrossReferences().stream().filter(eachReferencedObject -> eachReferencedObject instanceof Feature)
																.map(foundObject -> (Feature) foundObject)
																.findFirst();
		
	}
	
}
