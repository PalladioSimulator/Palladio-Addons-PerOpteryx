/**
 * 
 */
package edu.kit.ipd.are.dsexplore.featurecompletions.weaver.strategy.extension;

import java.util.List;

import org.palladiosimulator.pcm.resourceenvironment.ResourceContainer;

import featureSolution.Advice;

/**
 * @author Maximilian Eckert (maximilian.eckert@student.kit.edu, maxieckert@web.de)
 * 
 *
 */
public interface IWeavingInstruction {

	public List<? extends IWeavingLocation> getWeavingLocations();
	
	public Advice getAdvice();

	/**
	 * @return
	 */
	public ResourceContainer getResourceContainer();
}
