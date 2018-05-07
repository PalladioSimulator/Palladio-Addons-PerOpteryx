package edu.kit.ipd.are.dsexplore.featurecompletions.weaver;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.apache.log4j.Logger;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.opt4j.genotype.ListGenotype;
import org.palladiosimulator.analyzer.workflow.blackboard.PCMResourceSetPartition;
import org.palladiosimulator.pcm.repository.Repository;
import org.palladiosimulator.pcm.resourceenvironment.ResourceContainer;
import org.palladiosimulator.pcm.system.System;
import org.palladiosimulator.solver.transformations.EMFHelper;

import FeatureCompletionModel.FeatureCompletion;
import FeatureCompletionModel.FeatureCompletionPackage;
import FeatureCompletionModel.FeatureCompletionRepository;
import de.uka.ipd.sdq.dsexplore.facade.ICreateExtension;
import de.uka.ipd.sdq.dsexplore.facade.IDecodeExtension;
import de.uka.ipd.sdq.dsexplore.facade.IModule;
import de.uka.ipd.sdq.dsexplore.facade.IProblemExtension;
import de.uka.ipd.sdq.dsexplore.tools.repository.MergedRepository;
import de.uka.ipd.sdq.dsexplore.tools.stereotypeapi.StereotypeAPIHelper;
import de.uka.ipd.sdq.pcm.cost.CostRepository;
import de.uka.ipd.sdq.pcm.cost.costPackage;
import de.uka.ipd.sdq.pcm.designdecision.Choice;
import de.uka.ipd.sdq.pcm.designdecision.ClassChoice;
import de.uka.ipd.sdq.pcm.designdecision.DecisionSpace;
import de.uka.ipd.sdq.pcm.designdecision.DegreeOfFreedomInstance;
import de.uka.ipd.sdq.pcm.designdecision.designdecisionFactory;
import de.uka.ipd.sdq.pcm.designdecision.specific.FeatureCompletionDegree;
import de.uka.ipd.sdq.workflow.mdsd.blackboard.MDSDBlackboard;
import edu.kit.ipd.are.dsexplore.featurecompletions.weaver.designdecision.CompletionDesignDecision;
import edu.kit.ipd.are.dsexplore.featurecompletions.weaver.designdecision.FCCAllocDegreeDesignDecision;

public class FCCModule implements IModule, IProblemExtension, ICreateExtension, IDecodeExtension {
	private static Logger logger = Logger.getLogger("edu.kit.ipd.are.dsexplore.featurecompletions.weaver");

	// SEE de.uka.ipd.sdq.dsexplore.launch.MoveInitialPCMModelPartitionJob
	public static final String INITIAL_PCM_MODEL_PARTITION_ID = "initialPCModelPartitionID";

	private FCCWeaver weaver;

	@Override
	public void reset() {
		this.weaver = null;
	}

	@Override
	public IProblemExtension getProblemExtension() {
		return this;
	}

	@Override
	public ICreateExtension getCreateExtension() {
		return this;
	}

	@Override
	public IDecodeExtension getDecodeExtension() {
		return this;
	}

	@Override
	public void initializeProblem(MDSDBlackboard blackboard, List<DegreeOfFreedomInstance> dds, ListGenotype<Choice> initialCandidate) {
		this.determineFCCDecisions(blackboard, dds, initialCandidate);
	}

	@Override
	public void determineInitialGenotype(MDSDBlackboard blackboard, DecisionSpace problem, ListGenotype<Choice> genotype) {
		List<FeatureCompletionDegree> fccDegree = this.getFCFrom(problem.getDegreesOfFreedom());
		if (!fccDegree.isEmpty()) {
			this.initializeWeaver();
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

	private void determineFCCDecisions(MDSDBlackboard blackboard, List<DegreeOfFreedomInstance> dds, ListGenotype<Choice> initialCandidate) {
		FeatureCompletionRepository concernRepo = this.getFCRepository(blackboard).orElse(null);
		if (concernRepo == null) {
			return;
		}
		try {
			this.createFCCDegreeBy(blackboard, concernRepo, dds, initialCandidate);
		} catch (Exception ex) {
			FCCModule.logger.error("Error while creating ConcernDegree ..: " + ex.getMessage());
			ex.printStackTrace();
			return;
		}

	}

	private Optional<FeatureCompletionRepository> getFCRepository(MDSDBlackboard blackboard) {
		PCMResourceSetPartition pcmPartition = (PCMResourceSetPartition) blackboard.getPartition(FCCModule.INITIAL_PCM_MODEL_PARTITION_ID);
		try {
			List<EObject> fccRepository = pcmPartition.getElement(FeatureCompletionPackage.eINSTANCE.getFeatureCompletionRepository());
			return Optional.of((FeatureCompletionRepository) fccRepository.get(0));
		} catch (Exception e) {
			return Optional.empty();
		}
	}

	private void createFCCDegreeBy(MDSDBlackboard blackboard, FeatureCompletionRepository fcRepo, List<DegreeOfFreedomInstance> dds, ListGenotype<Choice> initialCandidate) {
		this.initializeWeaver();
		List<FeatureCompletionDegree> featureCompletionDegrees = new CompletionDesignDecision(fcRepo, this.weaver.getMergedRepo()).generateFCCDegrees();
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

	private void initializeWeaver() {
		if (this.weaver != null) {
			return;
		}
		PCMResourceSetPartition initialPartition = (PCMResourceSetPartition) this.blackboard.getPartition(MoveInitialPCMModelPartitionJob.INITIAL_PCM_MODEL_PARTITION_ID);
		System pcmSystem = initialPartition.getSystem();

		Optional<String> costModelFileName = this.getCostModelFileName();
		Optional<CostRepository> costModel = this.getCostModel();

		List<Repository> solutionRepos = StereotypeAPIHelper.getViaStereoTypeFrom(pcmSystem, Repository.class);
		MergedRepository merged = solutionRepos.size() > 0 ? new MergedRepository(solutionRepos) : null;

		if (merged == null) {
			// No solutions accessible via stereotype
			return;
		}

		this.weaver = new FCCWeaver(initialPartition, this.initialInstance, merged, costModelFileName, costModel);

	}

	private Optional<CostRepository> getCostModel() {
		Optional<String> costModelFileName = this.getCostModelFileName();
		if (!costModelFileName.isPresent()) {
			return Optional.empty();
		}
		String fileName = costModelFileName.get();
		URI locationToLoadFrom = URI.createURI(fileName);
		if (locationToLoadFrom == null || !locationToLoadFrom.isPlatform()) {
			locationToLoadFrom = URI.createFileURI(fileName);
		}
		CostRepository cr = (CostRepository) EMFHelper.loadFromXMIFile(locationToLoadFrom, costPackage.eINSTANCE);
		return cr == null ? Optional.empty() : Optional.of(cr);
	}

	private Optional<String> getCostModelFileName() {
		try {
			return Optional.of(this.dseConfig.getRawConfiguration().getAttribute(DSEConstantsContainer.COST_FILE, ""));
		} catch (CoreException e) {
			return Optional.empty();
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
