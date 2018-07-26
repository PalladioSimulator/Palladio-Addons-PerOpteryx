package edu.kit.ipd.are.dsexplore.featurecompletions.weaver.extensions;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.eclipse.emf.ecore.EObject;
import org.opt4j.genotype.ListGenotype;
import org.palladiosimulator.analyzer.workflow.blackboard.PCMResourceSetPartition;
import org.palladiosimulator.pcm.repository.Repository;
import org.palladiosimulator.pcm.resourceenvironment.ResourceContainer;
import org.palladiosimulator.pcm.system.System;
import org.palladiosimulator.solver.models.PCMInstance;

import FeatureCompletionModel.CompletionComponent;
import FeatureCompletionModel.FeatureCompletion;
import FeatureCompletionModel.FeatureCompletionPackage;
import FeatureCompletionModel.FeatureCompletionRepository;
import de.uka.ipd.sdq.dsexplore.facade.IProblemExtension;
import de.uka.ipd.sdq.dsexplore.tools.primitives.Pointer;
import de.uka.ipd.sdq.dsexplore.tools.stereotypeapi.StereotypeAPIHelper;
import de.uka.ipd.sdq.pcm.cost.CostRepository;
import de.uka.ipd.sdq.pcm.designdecision.BoolChoice;
import de.uka.ipd.sdq.pcm.designdecision.Choice;
import de.uka.ipd.sdq.pcm.designdecision.ClassChoice;
import de.uka.ipd.sdq.pcm.designdecision.DecisionSpace;
import de.uka.ipd.sdq.pcm.designdecision.DegreeOfFreedomInstance;
import de.uka.ipd.sdq.pcm.designdecision.FeatureChoice;
import de.uka.ipd.sdq.pcm.designdecision.designdecisionFactory;
import de.uka.ipd.sdq.pcm.designdecision.specific.FeatureCompletionDegree;
import de.uka.ipd.sdq.pcm.designdecision.specific.FeatureDegree;
import de.uka.ipd.sdq.pcm.designdecision.specific.MultipleInclusionDegree;
import de.uka.ipd.sdq.pcm.designdecision.specific.specificFactory;
import de.uka.ipd.sdq.workflow.mdsd.blackboard.MDSDBlackboard;
import edu.kit.ipd.are.dsexplore.featurecompletions.weaver.FCCWeaver;
import edu.kit.ipd.are.dsexplore.featurecompletions.weaver.designdecision.AdvicePlacementDesignDecision;
import edu.kit.ipd.are.dsexplore.featurecompletions.weaver.designdecision.ComplementumVisnetisDesignDecision;
import edu.kit.ipd.are.dsexplore.featurecompletions.weaver.designdecision.CompletionDesignDecision;
import edu.kit.ipd.are.dsexplore.featurecompletions.weaver.designdecision.FCCAllocDegreeDesignDecision;
import edu.kit.ipd.are.dsexplore.featurecompletions.weaver.designdecision.MultipleInclusionDesignDecision;
import edu.kit.ipd.are.dsexplore.featurecompletions.weaver.port.FCCModule;
import featureObjective.Feature;

public class FCCProblemExtension implements IProblemExtension {

	// SEE de.uka.ipd.sdq.dsexplore.launch.MoveInitialPCMModelPartitionJob
	public static final String INITIAL_PCM_MODEL_PARTITION_ID = "initialPCModelPartitionID";

	private final Pointer<FCCWeaver> weaver;

	private PCMInstance initialInstance;

	public FCCProblemExtension(Pointer<FCCWeaver> weaver) {
		this.weaver = weaver;
	}

	@Override
	public void initializeProblem(MDSDBlackboard blackboard, List<DegreeOfFreedomInstance> dds, ListGenotype<Choice> initialCandidate, PCMInstance initialInstance, CostRepository costRepo) {
		this.initialInstance = initialInstance;
		this.determineFCCDecisions(blackboard, dds, initialCandidate, costRepo);
	}

	@Override
	public void determineInitialGenotype(MDSDBlackboard blackboard, DecisionSpace problem, ListGenotype<Choice> genotype, PCMInstance initialInstance, CostRepository costRepo) {
		this.initialInstance = initialInstance;
		List<FeatureCompletionDegree> fccDegree = this.getFCFrom(problem.getDegreesOfFreedom());
		if (!fccDegree.isEmpty()) {
			this.initializeWeaver(blackboard, costRepo);
			for (FeatureCompletionDegree each : fccDegree) {
				this.createFCCAllocationDegreesFrom(each, problem.getDegreesOfFreedom(), genotype);
			}

		}
	}

	private List<FeatureCompletionDegree> getFCFrom(List<DegreeOfFreedomInstance> degreesOfFreedom) {
		List<FeatureCompletionDegree> fcd = new ArrayList<>();
		for (DegreeOfFreedomInstance dofi : degreesOfFreedom) {
			if (!(dofi instanceof FeatureCompletionDegree)) {
				continue;
			}
			fcd.add((FeatureCompletionDegree) dofi);
		}
		return fcd;
	}

	private FeatureCompletionDegree determineFCCDecisions(MDSDBlackboard blackboard, List<DegreeOfFreedomInstance> dds, ListGenotype<Choice> initialCandidate, CostRepository costRepo) {
		FeatureCompletionRepository fcRepo = this.getFCRepository(blackboard).orElse(null);
		if (fcRepo == null) {
			return null;
		}
		try {
			return this.createFCCDegreeBy(blackboard, costRepo, fcRepo, dds, initialCandidate);
		} catch (Exception ex) {
			FCCModule.logger.error("Error while creating FeatureCompletionDegree ..: " + ex.getMessage());
			ex.printStackTrace();
			return null;
		}

	}

	private Optional<FeatureCompletionRepository> getFCRepository(MDSDBlackboard blackboard) {
		PCMResourceSetPartition pcmPartition = (PCMResourceSetPartition) blackboard.getPartition(FCCProblemExtension.INITIAL_PCM_MODEL_PARTITION_ID);
		try {
			List<EObject> fccRepository = pcmPartition.getElement(FeatureCompletionPackage.eINSTANCE.getFeatureCompletionRepository());
			return Optional.of((FeatureCompletionRepository) fccRepository.get(0));
		} catch (Exception e) {
			return Optional.empty();
		}
	}

	private FeatureCompletionDegree createFCCDegreeBy(MDSDBlackboard blackboard, CostRepository costRepo, FeatureCompletionRepository fcRepo, List<DegreeOfFreedomInstance> dds,
			ListGenotype<Choice> initialCandidate) {
		this.initializeWeaver(blackboard, costRepo);
		List<FeatureCompletionDegree> featureCompletionDegrees = new CompletionDesignDecision(fcRepo, this.weaver.get().getSolutionRepositories()).generateFCCDegrees();
		if (featureCompletionDegrees.size() != 1) {
			FCCModule.logger.warn("FCCRepo count: " + featureCompletionDegrees.size() + " -> skipping!");
			return null;
		}
		FeatureCompletionDegree degree = featureCompletionDegrees.get(0);
		this.createClassChoice(degree, dds, initialCandidate);
		this.createFCCAllocationDegreesFrom(degree, dds, initialCandidate);
		this.determineOptionalAsDegreeDecisions(degree, dds, initialCandidate, fcRepo);
		//add dof for multiple-flag in inclusion mechanism
		this.createMultipleInclusionDegree(degree, dds, initialCandidate, this.weaver.get().getSolutionRepositories());
		//add dof for advice placement policy
		this.createAdvicePlacementDegree(dds, initialCandidate, this.weaver.get().getSolutionRepositories());
		//TODO add dof for cv selection
		this.createComplementumVisnetisDegree(degree, dds, initialCandidate, this.weaver.get().getSolutionRepositories());
		return degree;
	}

	/**
	 * @param degree
	 * @param dds
	 * @param degree
	 * @param solutions 
	 */
	private void createComplementumVisnetisDegree(FeatureCompletionDegree degree, List<DegreeOfFreedomInstance> dds, ListGenotype<Choice> initialCandidate, List<Repository> solutions) {
		List<ClassChoice> complementumVisnetisDegrees = new ComplementumVisnetisDesignDecision(degree, solutions).generateComplementumVisnetisDegrees();
		
		for (ClassChoice classChoice : complementumVisnetisDegrees) {
			initialCandidate.add(classChoice);
			dds.add(classChoice.getDegreeOfFreedomInstance());
		}
	}

	/**
	 * @param dds
	 * @param initialCandidate
	 * @param solutions 
	 */
	private void createAdvicePlacementDegree(List<DegreeOfFreedomInstance> dds, ListGenotype<Choice> initialCandidate, List<Repository> solutions) {
		List<BoolChoice> advicePlacementDegrees = new AdvicePlacementDesignDecision(solutions).generateAdvicePlacementDegrees();
		
		for (BoolChoice featureChoice : advicePlacementDegrees) {
			initialCandidate.add(featureChoice);
			dds.add(featureChoice.getDegreeOfFreedomInstance());
		}
	}

	/**
	 * @param degree 
	 * @param dds
	 * @param initialCandidate 
	 */
	private void createMultipleInclusionDegree(FeatureCompletionDegree degree, List<DegreeOfFreedomInstance> dds, ListGenotype<Choice> initialCandidate, List<Repository> solutions) {
		//add dof for multiple-flag in inclusion mechanism
		BoolChoice choice = new MultipleInclusionDesignDecision(solutions).generateMultipleInclusionDegree();
		
		initialCandidate.add(choice);
		dds.add(choice.getDegreeOfFreedomInstance());
	}

	private void createClassChoice(FeatureCompletionDegree fccDegree, List<DegreeOfFreedomInstance> dds, ListGenotype<Choice> initialCandidate) {
		ClassChoice choice = designdecisionFactory.eINSTANCE.createClassChoice();
		choice.setDegreeOfFreedomInstance(fccDegree);
		choice.setChosenValue(fccDegree.getClassDesignOptions().get(0));
		initialCandidate.add(choice);
		dds.add(fccDegree);
	}

	private void initializeWeaver(MDSDBlackboard blackboard, CostRepository costModel) {
		if (this.weaver.get() != null) {
			return;
		}
		PCMResourceSetPartition initialPartition = (PCMResourceSetPartition) blackboard.getPartition(FCCProblemExtension.INITIAL_PCM_MODEL_PARTITION_ID);
		System pcmSystem = initialPartition.getSystem();

		List<Repository> solutionRepos = StereotypeAPIHelper.getViaStereoTypeFrom(pcmSystem, Repository.class);

		if (solutionRepos == null || solutionRepos.isEmpty()) {
			// No solutions accessible via stereotype
			return;
		}

		this.weaver.set(new FCCWeaver(blackboard, solutionRepos, costModel));

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
	private void determineOptionalAsDegreeDecisions(FeatureCompletionDegree cd, List<DegreeOfFreedomInstance> dds, ListGenotype<Choice> initialCandidate, FeatureCompletionRepository fcRepo) {
		FeatureCompletion c = (FeatureCompletion) cd.getPrimaryChanged();
		List<CompletionComponent> fccs = c.getCompletionComponents();
		List<Feature> features = new ArrayList<>();

		for (CompletionComponent ecc : fccs) {
			List<Feature> provided = StereotypeAPIHelper.getViaStereoTypeFrom(ecc, Feature.class);
			if (provided.isEmpty()) {
				FCCModule.logger.error(ecc + " does not provide a Feature.");
				continue;
			}
			// INFO:
			// For now only features which are directly mapped to an ECC will be
			// mentioned here ..
			// Maybe someone will decide to search features recursively .. then
			// you can use this line ..
			// this.getThisAndSubfeatures(features, feature);
			features.addAll(provided);
		}

		List<Feature> optionals = new ArrayList<>();
		for (Feature f : features) {
			// INFO: Only SimpleOptional will be mentioned . FeatureGroups are
			// not needed so far.
			boolean isOptional = f.getSimpleOptional() != null;
			if (isOptional) {
				optionals.add(f);
			}
		}
		for (Feature op : optionals) {
			FeatureDegree oad = specificFactory.eINSTANCE.createFeatureDegree();
			oad.setPrimaryChanged(op);
			dds.add(oad);
			FeatureChoice ch = designdecisionFactory.eINSTANCE.createFeatureChoice();
			ch.setDegreeOfFreedomInstance(oad);
			initialCandidate.add(ch);
		}

	}

	private void createFCCAllocationDegreesFrom(FeatureCompletionDegree completionDegree, List<DegreeOfFreedomInstance> dds, ListGenotype<Choice> initialCandidate) {
		FCCAllocDegreeDesignDecision eccAllocDegreeDesignDecision = new FCCAllocDegreeDesignDecision((FeatureCompletion) completionDegree.getPrimaryChanged(), this.initialInstance.getSystem());
		List<ResourceContainer> allPcmResourceContainer = this.initialInstance.getResourceEnvironment().getResourceContainer_ResourceEnvironment();
		List<ClassChoice> choices = eccAllocDegreeDesignDecision.getFCCClassChoicesFrom(allPcmResourceContainer);
		for (ClassChoice eccClassChoice : choices) {
			initialCandidate.add(eccClassChoice);
			dds.add(eccClassChoice.getDegreeOfFreedomInstance());
		}

	}

}
