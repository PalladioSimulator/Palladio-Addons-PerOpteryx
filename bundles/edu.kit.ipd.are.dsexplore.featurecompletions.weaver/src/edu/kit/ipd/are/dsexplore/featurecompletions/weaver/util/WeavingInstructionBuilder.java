package edu.kit.ipd.are.dsexplore.featurecompletions.weaver.util;

import java.util.List;

import org.palladiosimulator.pcm.repository.ProvidedRole;
import org.palladiosimulator.pcm.resourceenvironment.ResourceContainer;

import FeatureCompletionModel.ComplementumVisnetis;
import FeatureCompletionModel.CompletionComponent;
import de.uka.ipd.sdq.dsexplore.tools.primitives.Pair;
import edu.kit.ipd.are.dsexplore.featurecompletions.weaver.strategy.WeavingInstruction;
import edu.kit.ipd.are.dsexplore.featurecompletions.weaver.strategy.WeavingLocation;
import featureSolution.InclusionMechanism;

public class WeavingInstructionBuilder {

	private Pair<CompletionComponent, List<ProvidedRole>> fccWithConsumedFeatures = null;
	private WeavingLocation weavingLocation = null;
	private InclusionMechanism inclusionMechanism = null;
	private ResourceContainer resourceContainer = null;

	public WeavingInstructionBuilder setFCCWithConsumedFeatures(Pair<CompletionComponent, List<ProvidedRole>> eccWithConsumedFeatures) {
		this.fccWithConsumedFeatures = eccWithConsumedFeatures;
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

	public WeavingInstruction build(ComplementumVisnetis cv) {
		return new WeavingInstruction(this.fccWithConsumedFeatures, this.weavingLocation, this.inclusionMechanism, this.resourceContainer, cv);
	}

}
