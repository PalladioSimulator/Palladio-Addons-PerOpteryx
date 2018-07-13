/**
 * 
 */
package edu.kit.ipd.are.dsexplore.featurecompletions.weaver.strategy.extension;

import java.util.ArrayList;
import java.util.List;

import org.palladiosimulator.pcm.repository.OperationInterface;
import org.palladiosimulator.pcm.repository.ProvidedRole;
import org.palladiosimulator.pcm.repository.Signature;
import org.palladiosimulator.pcm.resourceenvironment.ResourceContainer;

import FeatureCompletionModel.CompletionComponent;
import de.uka.ipd.sdq.dsexplore.tools.primitives.Pair;
import featureSolution.Advice;
import featureSolution.InclusionMechanism;

/**
 * @author Maximilian Eckert (maximilian.eckert@student.kit.edu, maxieckert@web.de)
 * 
 *
 */
public class ExtensionWeavingInstruction implements IWeavingInstruction {

	//private final Pair<CompletionComponent, List<OperationInterface>> fccWithConsumedFeatures;
	private final Pair<CompletionComponent, List<ProvidedRole>> fccWithProvidedRoles;
	
	private final Advice advice;
	
	private final List<? extends IWeavingLocation> weavingLocations;
	
	private final ResourceContainer resourceContainer;
	
	private final InclusionMechanism inclusionMechanism;

	/**
	 * @param advice
	 * @param weavingLocations
	 */
	public ExtensionWeavingInstruction(Pair<CompletionComponent, List<ProvidedRole>> fccWithProvidedRoles, Advice advice, List<? extends IWeavingLocation> weavingLocations, ResourceContainer resourceContainer, InclusionMechanism inclusonMechanism) {
		this.advice = advice;
		this.weavingLocations = weavingLocations;
		this.resourceContainer = resourceContainer;
		this.fccWithProvidedRoles = fccWithProvidedRoles;
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
	public Pair<CompletionComponent, List<ProvidedRole>> getFccWithProvidedRoles() {
		return fccWithProvidedRoles;
	}

	/**
	 * @return the inclusionMechanism
	 */
	public InclusionMechanism getInclusionMechanism() {
		return inclusionMechanism;
	}
}
