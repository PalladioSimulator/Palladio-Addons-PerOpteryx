/**
 * 
 */
package edu.kit.ipd.are.dsexplore.featurecompletions.weaver.designdecision;

import java.util.ArrayList;
import java.util.List;

import FeatureCompletionModel.PlacementPolicy;

import de.uka.ipd.sdq.pcm.designdecision.BoolChoice;
import de.uka.ipd.sdq.pcm.designdecision.designdecisionFactory;
import de.uka.ipd.sdq.pcm.designdecision.specific.AdvicePlacementDegree;
import de.uka.ipd.sdq.pcm.designdecision.specific.specificFactory;

import featureSolution.Advice;
import featureSolution.BehaviourInclusion;
import featureSolution.InclusionMechanism;

/**
 * Responsible for creating the advice placement degrees in the behaviour inclusion mechanism. 
 * 
 * @author Maximilian Eckert (maximilian.eckert@student.kit.edu, maxieckert@web.de)
 * 
 */
public class AdvicePlacementDesignDecision {

	private final InclusionMechanism im;
	
	public AdvicePlacementDesignDecision(InclusionMechanism im) {
		this.im = im;
	}
	
	/**
	 * Returns the list of BoolChoices that represent the advice placement degrees.
	 * 
	 * @return the list of BoolChoices that represent the advice placement degrees.
	 */
	public List<BoolChoice> generateAdvicePlacementDegrees() {
		List<BoolChoice> result = new ArrayList<>();
		
		if (im instanceof BehaviourInclusion) {
			for (Advice advice : ((BehaviourInclusion) im).getAdvice()) {
				AdvicePlacementDegree advicePlacementDegree = specificFactory.eINSTANCE.createAdvicePlacementDegree();
				advicePlacementDegree.setEntityName("advice");
				advicePlacementDegree.setPrimaryChanged(advice);
				
				BoolChoice choice = designdecisionFactory.eINSTANCE.createBoolChoice();
				choice.setDegreeOfFreedomInstance(advicePlacementDegree);
				choice.setChosenValue(false);
				
				//only add degree if placement is optional
				if (advice.getPlacementPolicy() == PlacementPolicy.OPTIONAL) { 
					result.add(choice);
				}
			}
		}
		return result;
	}
}