package de.uka.ipd.sdq.dsexplore.concernweaving.util;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.apache.log4j.Logger;
import org.eclipse.emf.ecore.EObject;
import org.modelversioning.emfprofileapplication.StereotypeApplication;
import org.palladiosimulator.pcm.repository.ProvidedRole;
import org.palladiosimulator.pcm.repository.RepositoryComponent;
import org.palladiosimulator.pcm.repository.RequiredRole;
import org.palladiosimulator.pcm.resourceenvironment.ResourceContainer;
import org.palladiosimulator.solver.models.PCMInstance;

import ConcernModel.Concern;
import ConcernModel.ElementaryConcernComponent;
import SolutionModel.Solution;
import concernStrategy.Feature;
import de.uka.ipd.sdq.pcm.designdecision.Choice;
import de.uka.ipd.sdq.pcm.designdecision.specific.FeatureDegree;
import edu.kit.ipd.are.dsexplore.concern.concernweaver.ConcernWeaver;
import edu.kit.ipd.are.dsexplore.concern.concernweaver.WeavingInstruction;
import edu.kit.ipd.are.dsexplore.concern.concernweaver.WeavingInstructionGenerator;
import edu.kit.ipd.are.dsexplore.concern.emfprofilefilter.EMFProfileFilter;
import edu.kit.ipd.are.dsexplore.concern.exception.ConcernWeavingException;
import edu.kit.ipd.are.dsexplore.concern.util.EcoreReferenceResolver;
import edu.kit.ipd.are.dsexplore.concern.util.Pair;

public class WeavingJob {
	/** Logger for log4j. */
	private static Logger logger = Logger.getLogger("de.uka.ipd.sdq.dsexplore");

	private final WeavingInstructionGenerator generator;
	private final ConcernWeaver concernWeaver;
	private final Solution solution;

	public WeavingJob(Concern concern, Solution concernSolution, PCMInstance pcmToWeave, Map<ElementaryConcernComponent, ResourceContainer> eccAllocationMap) {
		this.generator = WeavingInstructionGenerator.getInstanceBy(pcmToWeave, concern, concernSolution, eccAllocationMap);
		this.concernWeaver = ConcernWeaver.getBy(pcmToWeave, concernSolution);
		this.solution = concernSolution;
	}

	public void execute(List<Pair<FeatureDegree, Choice>> optChoice) throws ConcernWeavingException {
		List<WeavingInstruction> instructions = this.generator.getWeavingInstructions(optChoice);
		this.deleteAccordingToSolution(instructions);
		this.concernWeaver.start(instructions);
	}

	/**
	 * Delete {@link WeavingInstruction WeavingInstructions} for ECCs which are
	 * not available for selected Solution.
	 *
	 * @param instructions
	 *            all instructions
	 */
	private void deleteAccordingToSolution(List<WeavingInstruction> instructions) {
		List<RepositoryComponent> rcs = this.getAllComponents(this.solution);
		List<Feature> allFeatures = new ArrayList<>();

		for (RepositoryComponent rc : rcs) {
			List<ProvidedRole> pr = rc.getProvidedRoles_InterfaceProvidingEntity();
			List<RequiredRole> rr = rc.getRequiredRoles_InterfaceRequiringEntity();
			allFeatures.addAll(this.extractFeatures(pr, rr));
		}
		Iterator<WeavingInstruction> iter = instructions.iterator();
		while (iter.hasNext()) {
			WeavingInstruction ins = iter.next();
			ElementaryConcernComponent ecc = ins.getECCWithConsumedFeatures().getFirst();
			Feature toSearch = this.getViaStereoTypeFrom(ecc, Feature.class).get(0);
			if (!allFeatures.contains(toSearch)) {
				if (toSearch.getSimpleMandatory() != null) {
					// Mandatory:
					WeavingJob.logger.error("WeavingInstruction for Feature " + toSearch + " has been deleted because Solution " + this.solution + " doesn't provide this feature!");
				} else {
					// Optional
					WeavingJob.logger.warn("WeavingInstruction for Feature " + toSearch + " has been deleted because Solution " + this.solution + " doesn't provide this feature!");
				}
				iter.remove();
			}
		}

	}

	/**
	 * Extract features of ProvidedRole and RequiredRoles
	 *
	 * @param prs
	 *            all {@link ProvidedRole}
	 *
	 * @param rrs
	 *            all {@link RequiredRole}
	 * @return the annotated Features
	 * @author Dominik Fuchss
	 */
	private List<Feature> extractFeatures(List<ProvidedRole> prs, List<RequiredRole> rrs) {
		List<Feature> features = new ArrayList<>();
		for (ProvidedRole pr : prs) {
			features.addAll(this.getViaStereoTypeFrom(pr, Feature.class));
		}

		for (RequiredRole rr : rrs) {
			features.addAll(this.getViaStereoTypeFrom(rr, Feature.class));
		}
		return features;
	}

	private List<RepositoryComponent> getAllComponents(Solution sol) {
		List<RepositoryComponent> res = new ArrayList<>();
		for (RepositoryComponent rc : sol.getRepository().getComponents__Repository()) {
			if (this.belongsToSolutionOrIsGeneral(sol, rc)) {
				res.add(rc);
			}
		}

		return res;
	}

	/**
	 * Check whether {@link RepositoryComponent} belongs to this solution or at
	 * least to no other solution
	 *
	 * @param sol
	 *            the solution
	 * @param rc
	 *            the repository component
	 * @return {@code true} if SolutionStereoType is set to this solution or
	 *         none
	 * @author Dominik Fuchss
	 */
	private boolean belongsToSolutionOrIsGeneral(Solution sol, RepositoryComponent rc) {
		List<Solution> sols = this.getViaStereoTypeFrom(rc, Solution.class);
		if (sols.size() == 0) {
			return true;
		}
		if (sols.size() == 1) {
			return sol.getName().equals(sols.get(0).getName());
		}
		return false;
	}

	/**
	 * Find all referenced Elements by type and base
	 *
	 * @param base
	 *            the base (search location)
	 * @param target
	 *            the target type
	 * @return a list of Elements found
	 * @author Dominik Fuchss
	 */
	private <ElementType, Base extends EObject> List<ElementType> getViaStereoTypeFrom(Base base, Class<ElementType> target) {
		List<ElementType> res = new ArrayList<>();
		List<StereotypeApplication> appls = EMFProfileFilter.getStereotypeApplicationsFrom(base);
		for (StereotypeApplication appl : appls) {
			List<ElementType> provided = new EcoreReferenceResolver(appl).getCrossReferencedElementsOfType(target);
			res.addAll(provided);
		}
		return res;
	}

}
