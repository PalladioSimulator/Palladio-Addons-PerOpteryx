package edu.kit.ipd.are.dsexplore.featurecompletions.weaver.strategy.behaviour;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

import org.eclipse.emf.ecore.EObject;
import org.opt4j.genotype.ListGenotype;
import org.palladiosimulator.pcm.repository.Repository;

import FeatureCompletionModel.ComplementumVisnetis;
import FeatureCompletionModel.CompletionComponent;
import FeatureCompletionModel.FeatureCompletion;
import de.uka.ipd.sdq.dsexplore.tools.stereotypeapi.StereotypeAPIHelper;
import de.uka.ipd.sdq.pcm.designdecision.BoolChoice;
import de.uka.ipd.sdq.pcm.designdecision.Choice;
import de.uka.ipd.sdq.pcm.designdecision.DegreeOfFreedomInstance;
import de.uka.ipd.sdq.pcm.designdecision.FeatureChoice;
import de.uka.ipd.sdq.pcm.designdecision.designdecisionFactory;
import de.uka.ipd.sdq.pcm.designdecision.specific.AdvicePlacementDegree;
import de.uka.ipd.sdq.pcm.designdecision.specific.ComplementumVisnetisDegree;
import de.uka.ipd.sdq.pcm.designdecision.specific.FeatureCompletionDegree;
import de.uka.ipd.sdq.pcm.designdecision.specific.FeatureDegree;
import de.uka.ipd.sdq.pcm.designdecision.specific.MultipleInclusionDegree;
import de.uka.ipd.sdq.pcm.designdecision.specific.specificFactory;
import edu.kit.ipd.are.dsexplore.featurecompletions.weaver.FCCWeaver;
import edu.kit.ipd.are.dsexplore.featurecompletions.weaver.designdecision.AdvicePlacementDesignDecision;
import edu.kit.ipd.are.dsexplore.featurecompletions.weaver.designdecision.ComplementumVisnetisDesignDecision;
import edu.kit.ipd.are.dsexplore.featurecompletions.weaver.designdecision.MultipleInclusionDesignDecision;
import edu.kit.ipd.are.dsexplore.featurecompletions.weaver.port.FCCModule;
import edu.kit.ipd.are.dsexplore.featurecompletions.weaver.port.FCCWeaverException;
import edu.kit.ipd.are.dsexplore.featurecompletions.weaver.strategy.IStrategyExtension;
import edu.kit.ipd.are.dsexplore.featurecompletions.weaver.strategy.handler.FCCFeatureHandler;
import edu.kit.ipd.are.dsexplore.featurecompletions.weaver.strategy.manager.SolutionManager;
import featureObjective.Feature;
import featureSolution.SelectedCV;

public class BehaviourStrategyExtension implements IStrategyExtension {

	List<Choice> featureChoices;
	// dof for advice placements
	List<Choice> advicePlacementChoices;
	// dof for multiple-flag in inclusion mechanism
	Choice multipleInclusionChoice;
	// TODO dof for cv choice
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
			} else if (c.getDegreeOfFreedomInstance() instanceof FeatureDegree) {
				this.featureChoices.add(c);
			} else if (c.getDegreeOfFreedomInstance() instanceof ComplementumVisnetisDegree) {
				// add dof for advice placements //TODO meta-model?
				this.cvChoices.add(c);
			}
		}

		// TODO check if choices are consistent/valid (selected cvs are
		// supported by selected solution
		// to prevent an infinite loop if there is no appropriate solution
		int checkedSolutionsCounter = 0;
		boolean solutionChoiceValid = this.checkSolutionChoiceSupportsSelectedCVs((Repository) fccChoice.getValue())
									&& this.checkSolutionChoiceSupportsAllNonOptionalCVs((Repository) fccChoice.getValue());
//		if (!solutionChoiceValid) {
//			throw new FCCWeaverException("Invalid solution."); //this does not work, as FCCWeaverException is a RuntimeException!
//		}
		
		 if (!solutionChoiceValid && checkedSolutionsCounter < 20) { 
			 // TODO constant choice? 
			 // TODO this is a dirty fix, what if no valid solutions exists?? 
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
		this.determineOptionalAsDegreeDecisions(degree, dds, initialCandidate);
		// add dof for multiple-flag in inclusion mechanism
		this.createMultipleInclusionDegree(degree, dds, initialCandidate, weaver.getSolutionRepositories());
		// add dof for advice placement policy
		this.createAdvicePlacementDegree(dds, initialCandidate, weaver.getSolutionRepositories());
		// TODO add dof for cv selection
		this.createComplementumVisnetisDegree(degree, dds, initialCandidate, weaver.getSolutionRepositories());

	}

	private void createComplementumVisnetisDegree(FeatureCompletionDegree degree, List<DegreeOfFreedomInstance> dds, ListGenotype<Choice> initialCandidate, List<Repository> solutions) {
		List<Choice> complementumVisnetisDegrees = new ComplementumVisnetisDesignDecision(degree, solutions).generateComplementumVisnetisDegrees();

		for (Choice choice : complementumVisnetisDegrees) {
			initialCandidate.add(choice);
			dds.add(choice.getDegreeOfFreedomInstance());
		}
	}

	private void createAdvicePlacementDegree(List<DegreeOfFreedomInstance> dds, ListGenotype<Choice> initialCandidate, List<Repository> solutions) {
		List<BoolChoice> advicePlacementDegrees = new AdvicePlacementDesignDecision(solutions).generateAdvicePlacementDegrees();

		for (BoolChoice featureChoice : advicePlacementDegrees) {
			initialCandidate.add(featureChoice);
			dds.add(featureChoice.getDegreeOfFreedomInstance());
		}
	}

	private void createMultipleInclusionDegree(FeatureCompletionDegree degree, List<DegreeOfFreedomInstance> dds, ListGenotype<Choice> initialCandidate, List<Repository> solutions) {
		// add dof for multiple-flag in inclusion mechanism
		BoolChoice choice = new MultipleInclusionDesignDecision(solutions).generateMultipleInclusionDegree();

		initialCandidate.add(choice);
		dds.add(choice.getDegreeOfFreedomInstance());
	}

	/**
	 * Determine {@link OptionalAsDegree}-DoFs.
	 *
	 * @param cd
	 *            the concern degree
	 * @param dds
	 *            all DoFs do far
	 * @param initialCandidate
	 *            the initial candidate
	 * @param fcRepo
	 *            the concern repo
	 * @author Dominik Fuchss
	 */
	private void determineOptionalAsDegreeDecisions(FeatureCompletionDegree cd, List<DegreeOfFreedomInstance> dds, ListGenotype<Choice> initialCandidate) {
		//TODO dont use this mechanism
		
//		FeatureCompletion c = (FeatureCompletion) cd.getPrimaryChanged();
//		List<CompletionComponent> fccs = c.getCompletionComponents();
//		List<Feature> features = new ArrayList<>();
//
//		for (CompletionComponent ecc : fccs) {
//			List<Feature> provided = StereotypeAPIHelper.getViaStereoTypeFrom(ecc, Feature.class);
//			if (provided.isEmpty()) {
//				FCCModule.logger.error(ecc + " does not provide a Feature.");
//				continue;
//			}
//			// INFO:
//			// For now only features which are directly mapped to an ECC will be
//			// mentioned here ..
//			// Maybe someone will decide to search features recursively .. then
//			// you can use this line ..
//			// this.getThisAndSubfeatures(features, feature);
//			features.addAll(provided);
//		}
//
//		List<Feature> optionals = new ArrayList<>();
//		for (Feature f : features) {
//			// INFO: Only SimpleOptional will be mentioned . FeatureGroups are
//			// not needed so far.
//
//			boolean isOptional = false; // f.getSimpleOptional() != null;
//			if (isOptional) {
//				optionals.add(f);
//			}
//		}
//		for (Feature op : optionals) {
//			FeatureDegree oad = specificFactory.eINSTANCE.createFeatureDegree();
//			oad.setPrimaryChanged(op);
//			dds.add(oad);
//			FeatureChoice ch = designdecisionFactory.eINSTANCE.createFeatureChoice();
//			ch.setDegreeOfFreedomInstance(oad);
//			initialCandidate.add(ch);
//		}

	}

}
