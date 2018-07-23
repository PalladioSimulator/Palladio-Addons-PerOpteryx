/**
 * 
 */
package edu.kit.ipd.are.dsexplore.featurecompletions.weaver.strategy.extension;

import java.util.List;

import org.palladiosimulator.pcm.repository.ProvidedRole;
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
public interface IWeavingInstruction {

	public List<? extends IWeavingLocation> getWeavingLocations();
	
	public Advice getAdvice();

	/**
	 * @return
	 */
	public ResourceContainer getResourceContainer();
	
	public Pair<CompletionComponent, List<ProvidedRole>> getFccWithProvidedRoles();
	
	public InclusionMechanism getInclusionMechanism();
}
