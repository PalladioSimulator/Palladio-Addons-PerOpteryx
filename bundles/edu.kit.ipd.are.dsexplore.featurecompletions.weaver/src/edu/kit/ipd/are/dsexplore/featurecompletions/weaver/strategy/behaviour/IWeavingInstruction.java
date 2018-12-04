/**
 * 
 */
package edu.kit.ipd.are.dsexplore.featurecompletions.weaver.strategy.behaviour;

import java.util.List;

import org.palladiosimulator.pcm.repository.OperationSignature;
import org.palladiosimulator.pcm.repository.ProvidedRole;
import org.palladiosimulator.pcm.resourceenvironment.ResourceContainer;

import FeatureCompletionModel.CompletionComponent;

import de.uka.ipd.sdq.dsexplore.tools.primitives.Pair;

import placementDescription.Advice;
import featureSolution.InclusionMechanism;

/**
 * Interface for all weaving instructions.
 * 
 * @author Maximilian Eckert (maximilian.eckert@student.kit.edu, maxieckert@web.de)
 * 
 */
public interface IWeavingInstruction {

	public List<? extends IWeavingLocation> getWeavingLocations();
	
	public Advice getAdvice();
	
	public Pair<CompletionComponent, List<OperationSignature>> getFccWithProvidedRole();
	
	public InclusionMechanism getInclusionMechanism();
}
