package edu.kit.ipd.are.dsexplore.concern.concernweaver;

import java.util.List;

import org.palladiosimulator.pcm.repository.ProvidedRole;
import org.palladiosimulator.pcm.resourceenvironment.ResourceContainer;

import ConcernModel.ElementaryConcernComponent;
import TransformationModel.Transformation;
import edu.kit.ipd.are.dsexplore.concern.util.Pair;

public class WeavingInstruction {
	
	private final Pair<ElementaryConcernComponent, List<ProvidedRole>> eccWithConsumedFeatures;
	private final WeavingLocation weavingLocation;
	private final Transformation transformationStrategy;
	private final ResourceContainer resourceContainer;
	
	public WeavingInstruction(Pair<ElementaryConcernComponent, List<ProvidedRole>> eccWithConsumedFeatures,
							  WeavingLocation weavingLocation,
							  Transformation transformationStrategy,
							  ResourceContainer resourceContainer) {
		
		this.eccWithConsumedFeatures = eccWithConsumedFeatures;
		this.weavingLocation = weavingLocation;
		this.transformationStrategy = transformationStrategy;
		this.resourceContainer = resourceContainer;
		
	}
	
	public Pair<ElementaryConcernComponent, List<ProvidedRole>> getECCWithConsumedFeatures() {
	
		return eccWithConsumedFeatures;
		
	}
	
	public WeavingLocation getWeavingLocation() {

		return weavingLocation;
	
	}
	
	public Transformation getTransformationStrategy() {
	
		return transformationStrategy;
	
	}

	public ResourceContainer getResourceContainer() {
		
		return resourceContainer;
		
	}
	
}
