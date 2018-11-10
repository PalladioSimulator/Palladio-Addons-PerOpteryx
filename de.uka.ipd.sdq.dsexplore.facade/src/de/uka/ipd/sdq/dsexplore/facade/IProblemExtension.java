package de.uka.ipd.sdq.dsexplore.facade;

import java.util.List;

import org.opt4j.genotype.ListGenotype;
import org.palladiosimulator.solver.models.PCMInstance;

import de.uka.ipd.sdq.pcm.cost.CostRepository;
import de.uka.ipd.sdq.pcm.designdecision.Choice;
import de.uka.ipd.sdq.pcm.designdecision.DecisionSpace;
import de.uka.ipd.sdq.pcm.designdecision.DegreeOfFreedomInstance;
import de.uka.ipd.sdq.workflow.mdsd.blackboard.MDSDBlackboard;

/**
 * Extension part of {@link IModule}. This part will be during the problem
 * examination process of the model.
 *
 * @author Dominik Fuchss
 *
 */
public interface IProblemExtension {
	/**
	 * Initialize Module during problem examination. Add new DoFIs and default
	 * Choices.
	 *
	 * @param blackboard
	 *            the blackboard
	 * @param dds
	 *            the list of DoFIs
	 * @param initialCandidate
	 *            the initial candiate's choices
	 * @param initialInstance
	 *            the initial PCMInstance
	 * @param costRepo
	 *            the default cost repository
	 */
	void initializeProblem(MDSDBlackboard blackboard, List<DegreeOfFreedomInstance> dds, ListGenotype<Choice> initialCandidate, PCMInstance initialInstance, CostRepository costRepo);

	/**
	 * Initialize Module during problem examination. Add new DoFIs and default
	 * Choices.
	 *
	 * @param blackboard
	 *            the blackboard
	 * @param problem
	 *            the initial design space
	 * @param genotype
	 *            the initial genotype
	 * @param initialInstance
	 *            the initial PCMInstance
	 * @param costRepo
	 *            the default cost repository
	 */
	void determineInitialGenotype(MDSDBlackboard blackboard, DecisionSpace problem, ListGenotype<Choice> genotype, PCMInstance initialInstance, CostRepository costRepo);

}
