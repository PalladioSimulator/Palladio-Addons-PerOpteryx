package edu.kit.ipd.are.dsexplore.concern.util;

import java.util.List;

import org.palladiosimulator.pcm.repository.ProvidedRole;
import org.palladiosimulator.pcm.resourceenvironment.ResourceContainer;

import FeatureCompletionModel.CompletionComponent;
import edu.kit.ipd.are.dsexplore.concern.concernweaver.WeavingInstruction;
import edu.kit.ipd.are.dsexplore.concern.concernweaver.WeavingLocation;
import featureSolution.InclusionMechanism;

public class WeavingInstructionBuilder {

	private Pair<CompletionComponent, List<ProvidedRole>> eccWithConsumedFeatures = null;
	private WeavingLocation weavingLocation = null;
	private InclusionMechanism inclusionMechanism = null;
	private ResourceContainer resourceContainer = null;

	public WeavingInstructionBuilder setECCWithConsumedFeatures(
			Pair<CompletionComponent, List<ProvidedRole>> eccWithConsumedFeatures) {
		this.eccWithConsumedFeatures = eccWithConsumedFeatures;
		return this;
	}

	public WeavingInstructionBuilder setWeavingLocation(WeavingLocation weavingLocation) {
		this.weavingLocation = weavingLocation;
		return this;
	}

	public WeavingInstructionBuilder setTransformationStrategy(InclusionMechanism inclusionMechanism) {
		this.inclusionMechanism = inclusionMechanism;
		return this;
	}

	public WeavingInstructionBuilder setResourceContainer(ResourceContainer resourceContainer) {
		this.resourceContainer = resourceContainer;
		return this;
	}

	public WeavingInstruction build() {
		return new WeavingInstruction(this.eccWithConsumedFeatures, this.weavingLocation, this.inclusionMechanism,
				this.resourceContainer);
	}

}
