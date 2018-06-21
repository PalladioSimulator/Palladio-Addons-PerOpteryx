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

/**
 * @author Maximilian Eckert (maximilian.eckert@student.kit.edu, maxieckert@web.de)
 * 
 *
 */
public class ExtensionWeavingInstruction implements IWeavingInstruction {

	private final Pair<CompletionComponent, List<OperationInterface>> fccWithConsumedFeatures;
	
	private final Advice advice;
	
	private final List<? extends IWeavingLocation> weavingLocations;
	
	private final ResourceContainer resourceContainer;

	/**
	 * @param advice
	 * @param weavingLocations
	 */
	public ExtensionWeavingInstruction(Pair<CompletionComponent, List<OperationInterface>> fccWithConsumedFeatures, Advice advice, List<? extends IWeavingLocation> weavingLocations, ResourceContainer resourceContainer) {
		this.advice = advice;
		this.weavingLocations = weavingLocations;
		this.resourceContainer = resourceContainer;
		this.fccWithConsumedFeatures = fccWithConsumedFeatures;
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
	public Pair<CompletionComponent, List<OperationInterface>> getFccWithConsumedFeatures() {
		return fccWithConsumedFeatures;
	}
}
