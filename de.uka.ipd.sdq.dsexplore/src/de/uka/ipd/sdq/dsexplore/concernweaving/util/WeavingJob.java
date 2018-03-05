package de.uka.ipd.sdq.dsexplore.concernweaving.util;

import java.util.List;
import java.util.Map;

import org.apache.log4j.Logger;
import org.palladiosimulator.pcm.repository.Repository;
import org.palladiosimulator.pcm.resourceenvironment.ResourceContainer;
import org.palladiosimulator.solver.models.PCMInstance;

import FeatureCompletionModel.CompletionComponent;
import FeatureCompletionModel.FeatureCompletion;
import de.uka.ipd.sdq.pcm.designdecision.Choice;
import de.uka.ipd.sdq.pcm.designdecision.specific.FeatureDegree;
import edu.kit.ipd.are.dsexplore.concern.concernweaver.FeatureCompletionWeaver;
import edu.kit.ipd.are.dsexplore.concern.concernweaver.WeavingInstruction;
import edu.kit.ipd.are.dsexplore.concern.concernweaver.WeavingInstructionGenerator;
import edu.kit.ipd.are.dsexplore.concern.exception.ConcernWeavingException;
import edu.kit.ipd.are.dsexplore.concern.util.Pair;

public class WeavingJob {
	/** Logger for log4j. */
	private static Logger logger = Logger.getLogger("de.uka.ipd.sdq.dsexplore");

	private final WeavingInstructionGenerator generator;
	private final FeatureCompletionWeaver concernWeaver;
	// private final Solution solution;

	public WeavingJob(FeatureCompletion fc, PCMInstance pcmToWeave, Map<CompletionComponent, ResourceContainer> eccAllocationMap, Repository mergedRepo) {
		this.generator = WeavingInstructionGenerator.getInstanceBy(pcmToWeave, fc, mergedRepo, eccAllocationMap);
		this.concernWeaver = FeatureCompletionWeaver.getBy(pcmToWeave, mergedRepo);
	}

	public void execute(List<Pair<FeatureDegree, Choice>> optChoice) throws ConcernWeavingException {
		List<WeavingInstruction> instructions = this.generator.getWeavingInstructions(optChoice);
		// this.deleteAccordingToSolution(instructions);
		this.concernWeaver.start(instructions);
	}

	/*
	 * Delete {@link WeavingInstruction WeavingInstructions} for ECCs which are
	 * not available for selected Solution.
	 *
	 * @param instructions all instructions
	 */
	// private void deleteAccordingToSolution(List<WeavingInstruction>
	// instructions) {
	// List<RepositoryComponent> rcs = this.getAllComponents(this.m);
	// List<Feature> allFeatures = new ArrayList<>();
	//
	// for (RepositoryComponent rc : rcs) {
	// List<ProvidedRole> pr = rc.getProvidedRoles_InterfaceProvidingEntity();
	// allFeatures.addAll(this.extractFeatures(pr));
	// }
	// Iterator<WeavingInstruction> iter = instructions.iterator();
	// while (iter.hasNext()) {
	// WeavingInstruction ins = iter.next();
	// CompletionComponent fcc = ins.getFCCWithConsumedFeatures().getFirst();
	// Feature toSearch = StereotypeApiHelper.getViaStereoTypeFrom(fcc,
	// Feature.class).get(0);
	// if (!allFeatures.contains(toSearch)) {
	// if (toSearch.getSimpleMandatory() != null) {
	// // Mandatory:
	// WeavingJob.logger.error("WeavingInstruction for Feature " + toSearch
	// + " has been deleted because Solution " + this.solution + " doesn't
	// provide this feature!");
	// } else {
	// // Optional
	// WeavingJob.logger.warn("WeavingInstruction for Feature " + toSearch
	// + " has been deleted because Solution " + this.solution + " doesn't
	// provide this feature!");
	// }
	// iter.remove();
	// }
	// }
	//
	// }

	/*
	 * Extract features of ProvidedRole
	 *
	 * @param prs all {@link ProvidedRole}
	 *
	 * @return the annotated Features
	 *
	 * @author Dominik Fuchss
	 */
	// private List<Feature> extractFeatures(List<ProvidedRole> prs) {
	// List<Feature> features = new ArrayList<>();
	// for (ProvidedRole pr : prs) {
	// features.addAll(this.getViaStereoTypeFrom(pr, Feature.class));
	// }
	// return features;
	// }

	// private List<RepositoryComponent> getAllComponents(Solution sol) {
	// List<RepositoryComponent> res = new ArrayList<>();
	// for (RepositoryComponent rc :
	// sol.getRepository().getComponents__Repository()) {
	// if (this.belongsToSolutionOrIsGeneral(sol, rc)) {
	// res.add(rc);
	// }
	// }
	//
	// return res;
	// }

	/*
	 * Check whether {@link RepositoryComponent} belongs to this solution or at
	 * least to no other solution
	 *
	 * @param sol the solution
	 *
	 * @param rc the repository component
	 *
	 * @return {@code true} if SolutionStereoType is set to this solution or
	 * none
	 *
	 * @author Dominik Fuchss
	 */
	// private boolean belongsToSolutionOrIsGeneral(Solution sol,
	// RepositoryComponent rc) {
	// List<Solution> sols = StereotypeApiHelper.getViaStereoTypeFrom(rc,
	// Solution.class);
	// // Size == 0 must be included, as generated adapters cannot be annotated
	// // easily
	// boolean contains = sols.contains(sol) || sols.size() == 0;
	// return contains;
	// }

}
