package de.uka.ipd.sdq.dsexplore.constraints;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.function.BiFunction;

import org.palladiosimulator.pcm.resourceenvironment.ResourceContainer;

import FeatureCompletionModel.ArchitectureConstraints;
import FeatureCompletionModel.CompletionComponent;
import FeatureCompletionModel.ConstrainableElement;
import FeatureCompletionModel.Constraint;
import FeatureCompletionModel.FeatureCompletion;
import de.uka.ipd.sdq.dsexplore.opt4j.genotype.DesignDecisionGenotype;
import de.uka.ipd.sdq.pcm.designdecision.Choice;
import de.uka.ipd.sdq.pcm.designdecision.ClassChoice;
import de.uka.ipd.sdq.pcm.designdecision.specific.AllocationDegree;
import de.uka.ipd.sdq.pcm.designdecision.specific.FeatureCompletionDegree;
import edu.kit.ipd.are.dsexplore.featurecompletions.weaver.port.FCCWeaverException;

public class DesignSpaceConstraintManager {

	private static DesignSpaceConstraintManager instance = new DesignSpaceConstraintManager();

	private Map<Constraint, BiFunction<ArchitectureConstraints, DesignDecisionGenotype, Boolean>> constraintHandlers;

	private DesignSpaceConstraintManager() {
		this.constraintHandlers = new HashMap<>();
		this.constraintHandlers.put(Constraint.ISOLATED, this::checkIsolatedConstraint);
		this.constraintHandlers.put(Constraint.SEPARATED, this::checkSeparatedConstraint);
		this.constraintHandlers.put(Constraint.TOGETHER, this::checkTogetherConstraint);
		this.constraintHandlers.put(Constraint.ANY, this::checkAnyConstraint);
	}

	public static Optional<DesignSpaceConstraintManager> getInstanceBy(DesignDecisionGenotype genotype) throws NullPointerException {
		Optional<FeatureCompletion> featureCompletion = DesignSpaceConstraintManager.getFCFrom(genotype);
		if (!featureCompletion.isPresent()) {
			return Optional.empty();
		}
		return Optional.of(DesignSpaceConstraintManager.instance);

	}

	private static Optional<FeatureCompletion> getFCFrom(DesignDecisionGenotype genotype) {
		return genotype.stream().filter(eachChoice -> eachChoice.getDegreeOfFreedomInstance() instanceof FeatureCompletionDegree)
				.map(choice -> (FeatureCompletion) (choice.getDegreeOfFreedomInstance().getPrimaryChanged())).findFirst();
	}

	public boolean violatesNoConstraint(DesignDecisionGenotype genotype) {
		Optional<FeatureCompletion> fc = DesignSpaceConstraintManager.getFCFrom(genotype);
		if (!fc.isPresent()) {
			return true;
		}

		List<ArchitectureConstraints> archConstraints = fc.get().getArchitectureConstraints();
		for (ArchitectureConstraints ac : archConstraints) {
			boolean valid = this.constraintHandlers.get(ac.getConstraint()).apply(ac, genotype);
			if (!valid) {
				return false;
			}
		}
		return true;
	}

	private List<ClassChoice> getAllocationChoices(List<Choice> choices, boolean onlyFCCs) {
		List<ClassChoice> allocationChoices = new ArrayList<>();
		for (Choice c : choices) {
			if (c.getDegreeOfFreedomInstance() instanceof AllocationDegree && (!onlyFCCs || c.getDegreeOfFreedomInstance().getPrimaryChanged() instanceof CompletionComponent)) {
				allocationChoices.add((ClassChoice) c);
			}
		}
		return allocationChoices;
	}

	private ClassChoice findConstrainableElementInClassChoice(List<ClassChoice> allocationChoices, ConstrainableElement ce) {
		for (ClassChoice classChoice : allocationChoices) {
			CompletionComponent fcc = (CompletionComponent) (((AllocationDegree) classChoice.getDegreeOfFreedomInstance()).getPrimaryChanged());
			if (fcc.getId().equals(ce.getId())) {
				return classChoice;
			}
		}
		// TODO DTHF1 check whether this should also be in the module.
		throw new FCCWeaverException("no class choice found for " + ce);
	}

	private int countAllocationsOnResourceContainer(List<Choice> allChoices, ResourceContainer resource) {
		int counter = 0;
		List<ClassChoice> allocationChoices = this.getAllocationChoices(allChoices, false);
		for (ClassChoice choice : allocationChoices) {
			ResourceContainer rescont = (ResourceContainer) choice.getChosenValue();
			if (rescont.getId().equals(resource.getId())) {
				counter += 1;
			}
		}
		return counter;
	}

	private Boolean checkIsolatedConstraint(ArchitectureConstraints archConstr, DesignDecisionGenotype ddg) {
		List<ClassChoice> allocationChoices = this.getAllocationChoices(ddg, true);
		for (ConstrainableElement ce : archConstr.getArchitectureElements()) {
			ClassChoice allocationChoice = this.findConstrainableElementInClassChoice(allocationChoices, ce);
			ResourceContainer targetResource = (ResourceContainer) allocationChoice.getChosenValue();
			if (this.countAllocationsOnResourceContainer(ddg, targetResource) != 1) {
				return false;
			}
		}
		return true;
	}

	private Boolean checkTogetherConstraint(ArchitectureConstraints archConstr, DesignDecisionGenotype ddg) {
		List<ClassChoice> allocaChoices = this.getAllocationChoices(ddg, true);
		List<ConstrainableElement> ces = archConstr.getArchitectureElements();
		if (ces.size() == 0) {
			return true;
		}
		ResourceContainer targetResource = (ResourceContainer) this.findConstrainableElementInClassChoice(allocaChoices, ces.get(0)).getChosenValue();
		for (ConstrainableElement ce : ces) {
			ResourceContainer currentResource = (ResourceContainer) this.findConstrainableElementInClassChoice(allocaChoices, ce).getChosenValue();
			if (!targetResource.getId().equals(currentResource.getId())) {
				return false;
			}
		}
		return true;
	}

	private Boolean checkSeparatedConstraint(ArchitectureConstraints archConstr, DesignDecisionGenotype ddg) {
		List<ClassChoice> allocaChoices = this.getAllocationChoices(ddg, true);
		List<ConstrainableElement> ces = archConstr.getArchitectureElements();

		Set<String> resourceContainerIds = new HashSet<>();
		for (ConstrainableElement ce : ces) {
			ResourceContainer currentResource = (ResourceContainer) this.findConstrainableElementInClassChoice(allocaChoices, ce).getChosenValue();
			if (!resourceContainerIds.add(currentResource.getId())) {
				return false;
			}
		}
		return true;
	}

	private Boolean checkAnyConstraint(ArchitectureConstraints archConstr, DesignDecisionGenotype ddg) {
		return true;
	}
}
