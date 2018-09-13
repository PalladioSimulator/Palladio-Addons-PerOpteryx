/**
 *
 */
package edu.kit.ipd.are.dsexplore.featurecompletions.weaver.designdecision;

import java.util.ArrayList;
import java.util.List;

import de.uka.ipd.sdq.pcm.designdecision.Choice;
import de.uka.ipd.sdq.pcm.designdecision.ClassChoice;
import de.uka.ipd.sdq.pcm.designdecision.designdecisionFactory;
import de.uka.ipd.sdq.pcm.designdecision.specific.ComplementumVisnetisDegree;
import de.uka.ipd.sdq.pcm.designdecision.specific.FeatureCompletionDegree;
import de.uka.ipd.sdq.pcm.designdecision.specific.specificFactory;

import featureSolution.BehaviourInclusion;
import placementDescription.FeatureList;
import featureSolution.InclusionMechanism;
import placementDescription.SelectedCV;

/**
 * Responsible for creating the complementum visnetis degrees in the behaviour inclusion mechanism. 
 * 
 * @author Maximilian Eckert (maximilian.eckert@student.kit.edu, maxieckert@web.de)
 *
 */
public class ComplementumVisnetisDesignDecision {
	
	private final InclusionMechanism im;

	public ComplementumVisnetisDesignDecision(FeatureCompletionDegree degree, InclusionMechanism im) {
		this.im = im;
	}

	/**
	 * Returns the list of ClassChoices that represent the complementum visnetis degrees.
	 * 
	 * @return the list of ClassChoices that represent the complementum visnetis degrees.
	 */
	public List<Choice> generateComplementumVisnetisDegrees() {
		List<Choice> result = new ArrayList<>();

		//add dof for each group of alternative features (featureLists)
		List<FeatureList> featureLists = ((BehaviourInclusion) im).getFeatureCompletion().getFeatureLists();
		for (FeatureList featureList : featureLists) {
			ComplementumVisnetisDegree cvDegree = specificFactory.eINSTANCE.createComplementumVisnetisDegree();
			cvDegree.setEntityName("cv");
			cvDegree.setPrimaryChanged(featureList);
			//add all features in this group as design options
			for (SelectedCV selectedCV : featureList.getFeatures()) {
				cvDegree.getClassDesignOptions().add(selectedCV);
			}

			ClassChoice choice = designdecisionFactory.eINSTANCE.createClassChoice();
			choice.setDegreeOfFreedomInstance(cvDegree);
			choice.setChosenValue(cvDegree.getClassDesignOptions().get(0));

			result.add(choice);
		}
		return result;
	}
}