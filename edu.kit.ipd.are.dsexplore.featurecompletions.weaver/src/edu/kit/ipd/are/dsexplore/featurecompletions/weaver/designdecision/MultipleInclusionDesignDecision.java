/**
 * 
 */
package edu.kit.ipd.are.dsexplore.featurecompletions.weaver.designdecision;

import java.util.List;

import org.palladiosimulator.pcm.repository.Repository;

import FeatureCompletionModel.FeatureCompletion;
import de.uka.ipd.sdq.dsexplore.tools.stereotypeapi.StereotypeAPIHelper;
import de.uka.ipd.sdq.pcm.designdecision.BoolChoice;
import de.uka.ipd.sdq.pcm.designdecision.FeatureChoice;
import de.uka.ipd.sdq.pcm.designdecision.designdecisionFactory;
import de.uka.ipd.sdq.pcm.designdecision.specific.FeatureCompletionDegree;
import de.uka.ipd.sdq.pcm.designdecision.specific.MultipleInclusionDegree;
import de.uka.ipd.sdq.pcm.designdecision.specific.specificFactory;
import edu.kit.ipd.are.dsexplore.featurecompletions.weaver.port.FCCWeaverException;
import featureSolution.InclusionMechanism;

/**
 * @author Maximilian Eckert (maximilian.eckert@student.kit.edu, maxieckert@web.de)
 * 
 *
 */
public class MultipleInclusionDesignDecision {

	private InclusionMechanism im;

	/**
	 * @param solutions
	 */
	public MultipleInclusionDesignDecision(List<Repository> solutions) {
		this.im = determineIM(solutions);
	}

	/**
	 * @return
	 */
	public BoolChoice generateMultipleInclusionDegree() {
		MultipleInclusionDegree multipleInclusionDegree = specificFactory.eINSTANCE.createMultipleInclusionDegree();
		
		multipleInclusionDegree.setEntityName("multiple_inclusion");
		multipleInclusionDegree.setPrimaryChanged(im); //TODO auf was setzen??
			
		BoolChoice choice = designdecisionFactory.eINSTANCE.createBoolChoice();
		choice.setChosenValue(false);
		choice.setDegreeOfFreedomInstance(multipleInclusionDegree);

		return choice;
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
