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

import FeatureCompletionModel.FeatureCompletion;
import FeatureCompletionModel.FeatureCompletionPackage;
import FeatureCompletionModel.FeatureCompletionRepository;
import de.uka.ipd.sdq.dsexplore.facade.IProblemExtension;
import de.uka.ipd.sdq.dsexplore.tools.primitives.Pointer;
import de.uka.ipd.sdq.dsexplore.tools.stereotypeapi.StereotypeAPIHelper;
import de.uka.ipd.sdq.pcm.cost.CostRepository;
import de.uka.ipd.sdq.pcm.designdecision.Choice;
import de.uka.ipd.sdq.pcm.designdecision.ClassChoice;
import de.uka.ipd.sdq.pcm.designdecision.DecisionSpace;
import de.uka.ipd.sdq.pcm.designdecision.DegreeOfFreedomInstance;
import de.uka.ipd.sdq.pcm.designdecision.designdecisionFactory;
import de.uka.ipd.sdq.pcm.designdecision.specific.FeatureCompletionDegree;
import de.uka.ipd.sdq.workflow.mdsd.blackboard.MDSDBlackboard;
import edu.kit.ipd.are.dsexplore.featurecompletions.weaver.FCCWeaver;
import edu.kit.ipd.are.dsexplore.featurecompletions.weaver.designdecision.CompletionDesignDecision;
import edu.kit.ipd.are.dsexplore.featurecompletions.weaver.designdecision.FCCAllocDegreeDesignDecision;
import edu.kit.ipd.are.dsexplore.featurecompletions.weaver.port.FCCModule;
import edu.kit.ipd.are.dsexplore.featurecompletions.weaver.strategy.IStrategyExtension;
import edu.kit.ipd.are.dsexplore.featurecompletions.weaver.strategy.WeavingStrategies;

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
			FCCModule.LOGGER.error("Error while creating FeatureCompletionDegree ..: " + ex.getMessage());
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
			FCCModule.LOGGER.warn("FCCRepo count: " + featureCompletionDegrees.size() + " -> skipping!");
			return null;
		}
		FeatureCompletionDegree degree = featureCompletionDegrees.get(0);
		this.createClassChoice(degree, dds, initialCandidate);
		this.createFCCAllocationDegreesFrom(degree, dds, initialCandidate);

		IStrategyExtension extension = WeavingStrategies.getStrategy(this.weaver.get().getInclusionMechanism()).getExtension();
		extension.additionalCreateFCCDegreeBy(degree, dds, initialCandidate, this.weaver.get());

		return degree;
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
