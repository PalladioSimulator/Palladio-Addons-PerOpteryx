package edu.kit.ipd.are.dsexplore.featurecompletions.weaver.designdecision;

import java.util.List;
import java.util.stream.Collectors;

import org.palladiosimulator.pcm.repository.Repository;

import FeatureCompletionModel.FeatureCompletion;
import FeatureCompletionModel.FeatureCompletionRepository;
import de.uka.ipd.sdq.pcm.designdecision.specific.FeatureCompletionDegree;
import de.uka.ipd.sdq.pcm.designdecision.specific.specificFactory;

public class CompletionDesignDecision {

	private final FeatureCompletionRepository fcRepository;
	private final List<Repository> solutions;

	public CompletionDesignDecision(FeatureCompletionRepository fcRepository, List<Repository> solutions) {
		this.fcRepository = fcRepository;
		this.solutions = solutions;
	}

	public List<FeatureCompletionDegree> generateFCCDegrees() {
		return this.fcRepository.getFeatureCompletions().stream().map(this::generateCompletionDegreeWith).filter(this::hasDesignOptions).collect(Collectors.toList());
	}

	private FeatureCompletionDegree generateCompletionDegreeWith(FeatureCompletion featureCompletion) {
		FeatureCompletionDegree completionDegree = specificFactory.eINSTANCE.createFeatureCompletionDegree();
		completionDegree.setPrimaryChanged(featureCompletion);
		completionDegree.getClassDesignOptions().addAll(this.solutions);
		return completionDegree;
	}

	private boolean hasDesignOptions(FeatureCompletionDegree completionDegree) {
		return !completionDegree.getClassDesignOptions().isEmpty();
	}

}
