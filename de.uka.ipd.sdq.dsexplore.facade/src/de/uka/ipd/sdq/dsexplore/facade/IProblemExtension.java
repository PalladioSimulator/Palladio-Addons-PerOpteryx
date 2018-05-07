package de.uka.ipd.sdq.dsexplore.facade;

import java.util.List;

import org.opt4j.genotype.ListGenotype;

import de.uka.ipd.sdq.pcm.designdecision.Choice;
import de.uka.ipd.sdq.pcm.designdecision.DecisionSpace;
import de.uka.ipd.sdq.pcm.designdecision.DegreeOfFreedomInstance;
import de.uka.ipd.sdq.workflow.mdsd.blackboard.MDSDBlackboard;

public interface IProblemExtension {
	void initializeProblem(MDSDBlackboard blackboard, List<DegreeOfFreedomInstance> dds, ListGenotype<Choice> initialCandidate);

	void determineInitialGenotype(MDSDBlackboard blackboard, DecisionSpace problem, ListGenotype<Choice> genotype);
}
