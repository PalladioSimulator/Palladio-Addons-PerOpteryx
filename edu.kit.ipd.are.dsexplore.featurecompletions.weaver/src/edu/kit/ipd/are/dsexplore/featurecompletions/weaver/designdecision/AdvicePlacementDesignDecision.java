/**
 * 
 */
package edu.kit.ipd.are.dsexplore.featurecompletions.weaver.designdecision;

import java.util.ArrayList;
import java.util.List;

import org.palladiosimulator.pcm.repository.Repository;

import FeatureCompletionModel.PlacementPolicy;
import de.uka.ipd.sdq.dsexplore.tools.stereotypeapi.StereotypeAPIHelper;
import de.uka.ipd.sdq.pcm.designdecision.BoolChoice;
import de.uka.ipd.sdq.pcm.designdecision.FeatureChoice;
import de.uka.ipd.sdq.pcm.designdecision.designdecisionFactory;
import de.uka.ipd.sdq.pcm.designdecision.specific.AdvicePlacementDegree;
import de.uka.ipd.sdq.pcm.designdecision.specific.FeatureCompletionDegree;
import de.uka.ipd.sdq.pcm.designdecision.specific.FeatureDegree;
import de.uka.ipd.sdq.pcm.designdecision.specific.specificFactory;
import edu.kit.ipd.are.dsexplore.featurecompletions.weaver.port.FCCWeaverException;
import featureSolution.AdapterInclusion;
import featureSolution.Advice;
import featureSolution.BehaviourInclusion;
import featureSolution.InclusionMechanism;

/**
 * @author Maximilian Eckert (maximilian.eckert@student.kit.edu, maxieckert@web.de)
 * 
 *
 */
public class AdvicePlacementDesignDecision {

	private final InclusionMechanism im;
	
	/**
	 * 
	 */
	public AdvicePlacementDesignDecision(List<Repository> solutions) {
		this.im = determineIM(solutions);
	}
	
	//TODO meta model degree instead of using feature degree?
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
				
				if (advice.getPlacementPolicy() == PlacementPolicy.OPTIONAL) { //only add degree if placement is obligatory
					result.add(choice);
				}
			}
		}
		
		return result;
	}
	
	//TODO replication in FCCWeaver???
	private InclusionMechanism determineIM(List<Repository> solutions) {
		InclusionMechanism meachanism = null;
		for (Repository repo : solutions) {
			List<InclusionMechanism> meachanisms = StereotypeAPIHelper.getViaStereoTypeFrom(repo, InclusionMechanism.class, "transformation");
			if (meachanisms.size() != 1) {
				continue;
			}
			if (meachanism == null) {
				meachanism = meachanisms.get(0);
			} else if (!meachanism.getId().equals(meachanisms.get(0).getId())) {
				throw new FCCWeaverException("Multiple InclusionMechanisms are not supported yet.");
			}
		}
		return meachanism;
	}

}
