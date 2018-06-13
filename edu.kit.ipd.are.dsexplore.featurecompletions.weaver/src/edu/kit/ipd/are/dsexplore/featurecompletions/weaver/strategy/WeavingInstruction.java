package edu.kit.ipd.are.dsexplore.featurecompletions.weaver.strategy;

import java.util.List;

import org.palladiosimulator.pcm.repository.ProvidedRole;
import org.palladiosimulator.pcm.resourceenvironment.ResourceContainer;

import FeatureCompletionModel.CompletionComponent;
import de.uka.ipd.sdq.dsexplore.tools.primitives.Pair;
import featureSolution.InclusionMechanism;

/**
 * This class is a container for the weaving instruction informations required
 * by the concern weaver.
 *
 * @author scheerer
 *
 */
public class WeavingInstruction {

	private final Pair<CompletionComponent, List<ProvidedRole>> fccWithConsumedFeatures;
	private final WeavingLocation weavingLocation;
	private final InclusionMechanism inclusionMechanism;
	private final ResourceContainer resourceContainer;

	/**
	 * The constructor.
	 *
	 * @param eccWithConsumedFeatures
	 *            - A pair of an ECC with its corresponding provided features.
	 * @param weavingLocation
	 *            - The concrete weaving location in the PCM model.
	 * @param transformationStrategy
	 *            - The transformation strategy which defines the integration
	 *            mechanism.
	 * @param resourceContainer
	 *            - The resource container the ECC is going to be allocated.
	 */
	public WeavingInstruction(Pair<CompletionComponent, List<ProvidedRole>> eccWithConsumedFeatures, WeavingLocation weavingLocation, InclusionMechanism inclusionMechanism,
			ResourceContainer resourceContainer) {
		this.fccWithConsumedFeatures = eccWithConsumedFeatures;
		this.weavingLocation = weavingLocation;
		this.inclusionMechanism = inclusionMechanism;
		this.resourceContainer = resourceContainer;

	}

	/**
	 * The getter-method of the ECC and provided features pair.
	 *
	 * @return a pair of an ECC and its provided features.
	 */
	public Pair<CompletionComponent, List<ProvidedRole>> getFCCWithConsumedFeatures() {
		return this.fccWithConsumedFeatures;
	}

	/**
	 * The getter-method of the weaving location.
	 *
	 * @return the concrete weaving location in the PCM model.
	 */
	public WeavingLocation getWeavingLocation() {
		return this.weavingLocation;
	}

	/**
	 * The getter-method of the transformation strategy.
	 *
	 * @return the transformation strategy which defines the integration
	 *         mechanism.
	 */
	public InclusionMechanism getInclusionMechanism() {
		return this.inclusionMechanism;
	}

	/**
	 * The getter-method of the resource container.
	 *
	 * @return the resource container the ECC is going to be allocated.
	 */
	public ResourceContainer getResourceContainer() {
		return this.resourceContainer;
	}

}
