/**
 * 
 */
package edu.kit.ipd.are.dsexplore.featurecompletions.weaver.strategy.behaviour;

import java.util.List;

import org.palladiosimulator.pcm.repository.ProvidedRole;
import org.palladiosimulator.pcm.resourceenvironment.ResourceContainer;

import FeatureCompletionModel.CompletionComponent;
import de.uka.ipd.sdq.dsexplore.tools.primitives.Pair;
import featureSolution.Advice;
import featureSolution.InclusionMechanism;

/**
 * Models a Behaviour weaving instruction. An Behaviour weaving instruction contains of the advice to be applied at several weaving locations and the fc to be inserted.
 * 
 * @author Maximilian Eckert (maximilian.eckert@student.kit.edu, maxieckert@web.de)
 * 
 */
public class BehaviourWeavingInstruction implements IWeavingInstruction {

	private final Pair<CompletionComponent, ProvidedRole> fccWithProvidedRole;
	
	private final Advice advice;
	
	private final List<? extends IWeavingLocation> weavingLocations;
	
	private final ResourceContainer resourceContainer;
	
	private final InclusionMechanism inclusionMechanism;

	/**
	 * @param advice
	 * @param weavingLocations
	 */
	public BehaviourWeavingInstruction(Pair<CompletionComponent, ProvidedRole> fccWithProvidedRole, Advice advice, List<? extends IWeavingLocation> weavingLocations, ResourceContainer resourceContainer, InclusionMechanism inclusonMechanism) {
		this.advice = advice;
		this.weavingLocations = weavingLocations;
		this.resourceContainer = resourceContainer;
		this.fccWithProvidedRole = fccWithProvidedRole;
		this.inclusionMechanism = inclusonMechanism;
	}

	/**
	 * @return the advice
	 */
	public Advice getAdvice() {
		return advice;
	}

	/**
	 * @return the weavingLocations
	 */
	public List<? extends IWeavingLocation> getWeavingLocations() {
		return weavingLocations;
	}

	/**
	 * @return the resourceContainer
	 */
	public ResourceContainer getResourceContainer() {
		return resourceContainer;
	}

	/**
	 * @return the fccWithConsumedFeatures
	 */
	public Pair<CompletionComponent, ProvidedRole> getFccWithProvidedRole() {
		return fccWithProvidedRole;
	}

	/**
	 * @return the inclusionMechanism
	 */
	public InclusionMechanism getInclusionMechanism() {
		return inclusionMechanism;
	}
}
