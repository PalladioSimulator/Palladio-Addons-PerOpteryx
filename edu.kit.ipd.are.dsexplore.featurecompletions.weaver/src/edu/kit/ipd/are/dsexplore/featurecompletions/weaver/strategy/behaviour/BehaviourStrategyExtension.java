package edu.kit.ipd.are.dsexplore.featurecompletions.weaver.strategy.behaviour;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

import org.eclipse.emf.ecore.EObject;

import org.opt4j.genotype.ListGenotype;

import org.palladiosimulator.pcm.repository.Repository;

import FeatureCompletionModel.ComplementumVisnetis;

import de.uka.ipd.sdq.pcm.designdecision.BoolChoice;
import de.uka.ipd.sdq.pcm.designdecision.Choice;
import de.uka.ipd.sdq.pcm.designdecision.DegreeOfFreedomInstance;
import de.uka.ipd.sdq.pcm.designdecision.specific.AdvicePlacementDegree;
import de.uka.ipd.sdq.pcm.designdecision.specific.ComplementumVisnetisDegree;
import de.uka.ipd.sdq.pcm.designdecision.specific.FeatureCompletionDegree;
import de.uka.ipd.sdq.pcm.designdecision.specific.MultipleInclusionDegree;

import edu.kit.ipd.are.dsexplore.featurecompletions.weaver.FCCWeaver;
import edu.kit.ipd.are.dsexplore.featurecompletions.weaver.designdecision.AdvicePlacementDesignDecision;
import edu.kit.ipd.are.dsexplore.featurecompletions.weaver.designdecision.ComplementumVisnetisDesignDecision;
import edu.kit.ipd.are.dsexplore.featurecompletions.weaver.designdecision.MultipleInclusionDesignDecision;
import edu.kit.ipd.are.dsexplore.featurecompletions.weaver.strategy.IStrategyExtension;
import edu.kit.ipd.are.dsexplore.featurecompletions.weaver.strategy.handler.FCCFeatureHandler;
import edu.kit.ipd.are.dsexplore.featurecompletions.weaver.strategy.manager.SolutionManager;
import featureSolution.BehaviourInclusion;
import featureSolution.InclusionMechanism;
import placementDescription.SelectedCV;

public class BehaviourStrategyExtension implements IStrategyExtension {

	//dof for advice placements
	List<Choice> advicePlacementChoices;
	//dof for multiple-flag in inclusion mechanism
	Choice multipleInclusionChoice;
	//dof for cv choice
	List<Choice> cvChoices;

	@Override
	public void nextDecodeStart() {
		this.multipleInclusionChoice = null;
		this.advicePlacementChoices = new ArrayList<>();
		this.cvChoices = new ArrayList<>();
	}

	@Override
	public void grabChoices(Choice fccChoice, List<Choice> notTransformedChoices) {
		for (Choice c : notTransformedChoices) {
			if (c.getDegreeOfFreedomInstance() instanceof MultipleInclusionDegree) {
				// add dof for multiple-flag in inclusion mechanism
				this.multipleInclusionChoice = c;
			} else if (c.getDegreeOfFreedomInstance() instanceof AdvicePlacementDegree) {
				// add dof for advice placements
				this.advicePlacementChoices.add(c);
			} else if (c.getDegreeOfFreedomInstance() instanceof ComplementumVisnetisDegree) {
				// add dof for advice placements
				this.cvChoices.add(c);
			}
		}

		//check if choices are consistent/valid (selected cvs are supported by selected solution)
		//counter prevents an infinite loop if there is no appropriate solution
		int checkedSolutionsCounter = 0;
		boolean solutionChoiceValid = this.checkSolutionChoiceSupportsSelectedCVs((Repository) fccChoice.getValue())
									&& this.checkSolutionChoiceSupportsAllNonOptionalCVs((Repository) fccChoice.getValue());
		
		if (!solutionChoiceValid && checkedSolutionsCounter < 20) { 
			//this is a dirty fix, if still no appropriate solution exists there will be an exception thrown
			List<EObject> solutions = ((FeatureCompletionDegree) fccChoice.getDegreeOfFreedomInstance()).getClassDesignOptions();
			fccChoice.setValue(solutions.get(new Random().nextInt(solutions.size())));
			this.grabChoices(fccChoice, notTransformedChoices); 
		}
		 
		notTransformedChoices.remove(this.multipleInclusionChoice);
		for (Choice ac : this.advicePlacementChoices) {
			notTransformedChoices.remove(ac);
		}
		for (Choice c : this.cvChoices) {
			notTransformedChoices.remove(c);
		}
	}

	/**
	 * Checks if the given solution supports all CVs that need to be evaluated.
	 * 
	 * @param solution the given solution.
	 * @return whether the given solution supports all CVs.
	 */
	private boolean checkSolutionChoiceSupportsAllNonOptionalCVs(Repository solution) {
		List<SelectedCV> allSelectedCVs = this.cvChoices.stream()
				.map(choice -> (ComplementumVisnetisDegree) choice.getDegreeOfFreedomInstance())
				.flatMap(cvDegree -> cvDegree.getClassDesignOptions().stream().map(option -> (SelectedCV) option))
				.filter(selectedCV -> !selectedCV.isOptional())
				.collect(Collectors.toList());

		FCCFeatureHandler featureHandler = new FCCFeatureHandler(new SolutionManager(solution));
		List<ComplementumVisnetis> supportedCVs = featureHandler.extractProvidedCVs().stream().map(pair -> pair.second).collect(Collectors.toList());

		boolean valid = allSelectedCVs.stream().allMatch(cv -> supportedCVs.stream().anyMatch(supportedCV -> supportedCV.getId().equals(cv.getComplementumVisnetis().getId())));
		java.lang.System.out.println("Solution: " + solution.getEntityName() + " ------------ optional checkChoicesValid: " + valid + " -----------");
		return valid;
	}
	
	/**
	 * Checks if the given solution supports the currently selected CVs for this iteration.
	 * 
	 * @param solution the given solution.
	 * @return whether the given solution supports the currently selected CVs.
	 */
	private boolean checkSolutionChoiceSupportsSelectedCVs(Repository solution) {
		List<SelectedCV> cvs = this.cvChoices.stream().map(choice -> (SelectedCV) choice.getValue()).collect(Collectors.toList());

		FCCFeatureHandler featureHandler = new FCCFeatureHandler(new SolutionManager(solution));
		List<ComplementumVisnetis> supportedCVs = featureHandler.extractProvidedCVs().stream().map(pair -> pair.second).collect(Collectors.toList());

		boolean valid = cvs.stream().allMatch(cv -> supportedCVs.stream().anyMatch(supportedCV -> supportedCV.getId().equals(cv.getComplementumVisnetis().getId())));
		java.lang.System.out.println("------------ checkChoicesValid: " + valid + " -----------");
		return valid;
	}

	// PROBLEM EXTENSION

	@Override
	public void additionalCreateFCCDegreeBy(FeatureCompletionDegree degree, List<DegreeOfFreedomInstance> dds, ListGenotype<Choice> initialCandidate, FCCWeaver weaver) {
		//add dof for multiple-flag in inclusion mechanism
		this.createMultipleInclusionDegree(degree, dds, initialCandidate, weaver.getInclusionMechanism());
		//add dof for advice placement policy
		this.createAdvicePlacementDegree(dds, initialCandidate, weaver.getInclusionMechanism());
		//add dof for cv selection
		this.createComplementumVisnetisDegree(degree, dds, initialCandidate, weaver.getInclusionMechanism());
		//add dof for allocation
		this.createFCCAllocationDegree(degree, dds, initialCandidate, weaver.getInclusionMechanism());
	}

	private void createFCCAllocationDegree(FeatureCompletionDegree degree, List<DegreeOfFreedomInstance> dds, ListGenotype<Choice> initialCandidate, InclusionMechanism inclusionMechanism) {
		// nothing to do here, as this is done in the weaving process 
	}

	private void createComplementumVisnetisDegree(FeatureCompletionDegree degree, List<DegreeOfFreedomInstance> dds, ListGenotype<Choice> initialCandidate, InclusionMechanism im) {
		List<Choice> complementumVisnetisDegrees = new ComplementumVisnetisDesignDecision(degree, im).generateComplementumVisnetisDegrees();

		for (Choice choice : complementumVisnetisDegrees) {
			initialCandidate.add(choice);
			dds.add(choice.getDegreeOfFreedomInstance());
		}
	}

	private void createAdvicePlacementDegree(List<DegreeOfFreedomInstance> dds, ListGenotype<Choice> initialCandidate, InclusionMechanism im) {
		List<BoolChoice> advicePlacementDegrees = new AdvicePlacementDesignDecision(im).generateAdvicePlacementDegrees();

		for (BoolChoice featureChoice : advicePlacementDegrees) {
			initialCandidate.add(featureChoice);
			dds.add(featureChoice.getDegreeOfFreedomInstance());
		}
	}

	private void createMultipleInclusionDegree(FeatureCompletionDegree degree, List<DegreeOfFreedomInstance> dds, ListGenotype<Choice> initialCandidate, InclusionMechanism im) {
		if (((BehaviourInclusion) im).isMultiple()) {
			BoolChoice choice = new MultipleInclusionDesignDecision(im).generateMultipleInclusionDegree();
	
			initialCandidate.add(choice);
			dds.add(choice.getDegreeOfFreedomInstance());
		}
	}
}
