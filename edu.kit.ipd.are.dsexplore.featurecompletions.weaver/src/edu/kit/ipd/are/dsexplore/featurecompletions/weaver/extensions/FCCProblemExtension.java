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
import de.uka.ipd.sdq.dsexplore.tools.repository.MergedRepository;
import de.uka.ipd.sdq.dsexplore.tools.stereotypeapi.StereotypeAPIHelper;
import de.uka.ipd.sdq.pcm.cost.CostRepository;
import de.uka.ipd.sdq.pcm.designdecision.Choice;
import de.uka.ipd.sdq.pcm.designdecision.ClassChoice;
import de.uka.ipd.sdq.pcm.designdecision.DecisionSpace;
import de.uka.ipd.sdq.pcm.designdecision.DegreeOfFreedomInstance;
import de.uka.ipd.sdq.pcm.designdecision.FeatureChoice;
import de.uka.ipd.sdq.pcm.designdecision.designdecisionFactory;
import de.uka.ipd.sdq.pcm.designdecision.specific.FeatureCompletionDegree;
import de.uka.ipd.sdq.pcm.designdecision.specific.FeatureDegree;
import de.uka.ipd.sdq.pcm.designdecision.specific.specificFactory;
import de.uka.ipd.sdq.workflow.mdsd.blackboard.MDSDBlackboard;
import edu.kit.ipd.are.dsexplore.featurecompletions.weaver.FCCWeaver;
import edu.kit.ipd.are.dsexplore.featurecompletions.weaver.designdecision.CompletionDesignDecision;
import edu.kit.ipd.are.dsexplore.featurecompletions.weaver.designdecision.FCCAllocDegreeDesignDecision;
import edu.kit.ipd.are.dsexplore.featurecompletions.weaver.port.FCCModule;
import featureObjective.Feature;

public class FCCProblemExtension implements IProblemExtension {

	// SEE de.uka.ipd.sdq.dsexplore.launch.MoveInitialPCMModelPartitionJob
	static final String INITIAL_PCM_MODEL_PARTITION_ID = "initialPCModelPartitionID";

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

	private void determineFCCDecisions(MDSDBlackboard blackboard, List<DegreeOfFreedomInstance> dds, ListGenotype<Choice> initialCandidate, CostRepository costRepo) {
		FeatureCompletionRepository fcRepo = this.getFCRepository(blackboard).orElse(null);
		if (fcRepo == null) {
			return;
		}
		try {
			this.createFCCDegreeBy(blackboard, costRepo, fcRepo, dds, initialCandidate);
		} catch (Exception ex) {
			FCCModule.logger.error("Error while creating FeatureCompletionDegree ..: " + ex.getMessage());
			ex.printStackTrace();
			return;
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

	private void createFCCDegreeBy(MDSDBlackboard blackboard, CostRepository costRepo, FeatureCompletionRepository fcRepo, List<DegreeOfFreedomInstance> dds, ListGenotype<Choice> initialCandidate) {
		this.initializeWeaver(blackboard, costRepo);
		List<FeatureCompletionDegree> featureCompletionDegrees = new CompletionDesignDecision(fcRepo, this.weaver.get().getMergedRepo()).generateFCCDegrees();
		if (featureCompletionDegrees.size() != 1) {
			FCCModule.logger.warn("FCCRepo count: " + featureCompletionDegrees.size() + " -> skipping!");
			return;
		}
		FeatureCompletionDegree degree = featureCompletionDegrees.get(0);
		this.createClassChoice(degree, dds, initialCandidate);
		this.createFCCAllocationDegreesFrom(degree, dds, initialCandidate);
		this.determineOptionalAsDegreeDecisions(degree, dds, initialCandidate, fcRepo);
	}

	private void createClassChoice(FeatureCompletionDegree concernDegree, List<DegreeOfFreedomInstance> dds, ListGenotype<Choice> initialCandidate) {
		ClassChoice choice = designdecisionFactory.eINSTANCE.createClassChoice();
		choice.setDegreeOfFreedomInstance(concernDegree);
		choice.setChosenValue(concernDegree.getClassDesignOptions().get(0));
		initialCandidate.add(choice);
		dds.add(concernDegree);
	}

	private void initializeWeaver(MDSDBlackboard blackboard, CostRepository costModel) {
		if (this.weaver.get() != null) {
			return;
		}
		PCMResourceSetPartition initialPartition = (PCMResourceSetPartition) blackboard.getPartition(FCCProblemExtension.INITIAL_PCM_MODEL_PARTITION_ID);
		System pcmSystem = initialPartition.getSystem();

		List<Repository> solutionRepos = StereotypeAPIHelper.getViaStereoTypeFrom(pcmSystem, Repository.class);
		MergedRepository merged = solutionRepos.size() > 0 ? new MergedRepository(solutionRepos) : null;

		if (merged == null) {
			// No solutions accessible via stereotype
			return;
		}

		this.weaver.set(new FCCWeaver(initialPartition, merged, costModel));

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
