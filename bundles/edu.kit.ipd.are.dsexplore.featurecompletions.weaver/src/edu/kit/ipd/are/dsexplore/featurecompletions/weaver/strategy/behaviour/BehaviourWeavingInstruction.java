/**
 *
 */
package edu.kit.ipd.are.dsexplore.featurecompletions.weaver.strategy.behaviour;

import java.util.List;

import org.palladiosimulator.pcm.repository.OperationSignature;

import FeatureCompletionModel.CompletionComponent;
import de.uka.ipd.sdq.dsexplore.tools.primitives.Pair;
import featureSolution.InclusionMechanism;
import placementDescription.Advice;

/**
 * Models a Behaviour weaving instruction. An Behaviour weaving instruction
 * contains of the advice to be applied at several weaving locations and the fc
 * to be inserted.
 *
 * @author Maximilian Eckert (maximilian.eckert@student.kit.edu,
 *         maxieckert@web.de)
 *
 */
public class BehaviourWeavingInstruction implements IWeavingInstruction {

	private final Pair<CompletionComponent, List<OperationSignature>> fccWithProvidedRole;

	private final Advice advice;

	private final List<? extends IWeavingLocation> weavingLocations;

	private final InclusionMechanism inclusionMechanism;

	/**
	 * @param advice
	 * @param weavingLocations
	 */
	public BehaviourWeavingInstruction(Pair<CompletionComponent, List<OperationSignature>> pair, Advice advice, List<? extends IWeavingLocation> weavingLocations,
			InclusionMechanism inclusonMechanism) {
		this.advice = advice;
		this.weavingLocations = weavingLocations;
		this.fccWithProvidedRole = pair;
		this.inclusionMechanism = inclusonMechanism;
	}

	/**
	 * @return the advice
	 */
	@Override
	public Advice getAdvice() {
		return this.advice;
	}

	/**
	 * @return the weavingLocations
	 */
	@Override
	public List<? extends IWeavingLocation> getWeavingLocations() {
		return this.weavingLocations;
	}

	/**
	 * @return the fccWithConsumedFeatures
	 */
	@Override
	public Pair<CompletionComponent, List<OperationSignature>> getFccWithProvidedRole() {
		return this.fccWithProvidedRole;
	}

	/**
	 * @return the inclusionMechanism
	 */
	@Override
	public InclusionMechanism getInclusionMechanism() {
		return this.inclusionMechanism;
	}
}
