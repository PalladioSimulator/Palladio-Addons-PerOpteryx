/**
 * 
 */
package edu.kit.ipd.are.dsexplore.featurecompletions.weaver.strategy.extension;

import java.util.ArrayList;
import java.util.List;

import org.palladiosimulator.pcm.resourceenvironment.ResourceContainer;

import featureSolution.Advice;

/**
 * @author Maximilian Eckert (maximilian.eckert@student.kit.edu, maxieckert@web.de)
 * 
 *
 */
public class ExtensionWeavingInstruction implements IWeavingInstruction {

	
	private final Advice advice;
	
	private final List<? extends IWeavingLocation> weavingLocations;
	
	private final ResourceContainer resourceContainer;

	/**
	 * @param advice
	 * @param weavingLocations
	 */
	public ExtensionWeavingInstruction(Advice advice, List<? extends IWeavingLocation> weavingLocations, ResourceContainer resourceContainer) {
		this.advice = advice;
		this.weavingLocations = weavingLocations;
		this.resourceContainer = resourceContainer;
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
}
