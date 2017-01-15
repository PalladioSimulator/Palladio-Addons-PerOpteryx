package edu.kit.ipd.are.dsexplore.concern.util;

import java.util.List;

import org.palladiosimulator.pcm.repository.OperationProvidedRole;
import org.palladiosimulator.pcm.resourceenvironment.ResourceContainer;

import ConcernModel.ElementaryConcernComponent;
import TransformationModel.Transformation;
import edu.kit.ipd.are.dsexplore.concern.concernweaver.WeavingInstruction;
import edu.kit.ipd.are.dsexplore.concern.concernweaver.WeavingLocation;

public class WeavingInstructionBuilder {

	private Pair<ElementaryConcernComponent, List<OperationProvidedRole>> eccWithConsumedFeatures = null;
	private WeavingLocation weavingLocation = null;
	private Transformation transformationStrategy = null;
	private ResourceContainer resourceContainer = null;

	public WeavingInstructionBuilder setECCWithConsumedFeatures(Pair<ElementaryConcernComponent, List<OperationProvidedRole>> eccWithConsumedFeatures) {
		
		this.eccWithConsumedFeatures = eccWithConsumedFeatures;
		return this;
		
	}

	public WeavingInstructionBuilder setWeavingLocation(WeavingLocation weavingLocation) {
		
		this.weavingLocation = weavingLocation;
		return this;
		
	}

	public WeavingInstructionBuilder setTransformationStrategy(Transformation transformationStrategy) {
		
		this.transformationStrategy = transformationStrategy;
		return this;
		
	}
	
	public WeavingInstructionBuilder setResourceContainer(ResourceContainer resourceContainer) {
		
		this.resourceContainer = resourceContainer;
		return this;
		
	}
	
	public WeavingInstruction build() {
		
		return new WeavingInstruction(this.eccWithConsumedFeatures,
									  this.weavingLocation,
									  this.transformationStrategy,
									  this.resourceContainer);
		
	}
	
}
