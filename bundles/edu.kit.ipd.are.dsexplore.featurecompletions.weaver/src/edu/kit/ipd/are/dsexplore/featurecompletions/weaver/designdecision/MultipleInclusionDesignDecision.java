/**
 * 
 */
package edu.kit.ipd.are.dsexplore.featurecompletions.weaver.designdecision;

import de.uka.ipd.sdq.pcm.designdecision.BoolChoice;
import de.uka.ipd.sdq.pcm.designdecision.designdecisionFactory;
import de.uka.ipd.sdq.pcm.designdecision.specific.MultipleInclusionDegree;
import de.uka.ipd.sdq.pcm.designdecision.specific.specificFactory;

import featureSolution.InclusionMechanism;

/**
 * Responsible for creating the multiple degree in the behaviour inclusion mechanism. 
 * 
 * @author Maximilian Eckert (maximilian.eckert@student.kit.edu, maxieckert@web.de)
 * 
 */
public class MultipleInclusionDesignDecision {

	private InclusionMechanism im;

	public MultipleInclusionDesignDecision(InclusionMechanism im) {
		this.im = im;
	}

	/**
	 * Returns the BoolChoice that represent the multiple degree.
	 * 
	 * @return the BoolChoice that represent the multiple degree.
	 */
	public BoolChoice generateMultipleInclusionDegree() {
		MultipleInclusionDegree multipleInclusionDegree = specificFactory.eINSTANCE.createMultipleInclusionDegree();
		
		multipleInclusionDegree.setEntityName("multiple_inclusion");
		multipleInclusionDegree.setPrimaryChanged(im);
			
		BoolChoice choice = designdecisionFactory.eINSTANCE.createBoolChoice();
		choice.setChosenValue(false);
		choice.setDegreeOfFreedomInstance(multipleInclusionDegree);

		return choice;
	}
}
