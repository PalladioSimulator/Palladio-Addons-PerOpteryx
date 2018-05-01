package de.uka.ipd.sdq.dsexplore.designdecisions.completions;

import java.util.List;
import java.util.stream.Collectors;

import FeatureCompletionModel.FeatureCompletion;
import FeatureCompletionModel.FeatureCompletionRepository;
import de.uka.ipd.sdq.dsexplore.tools.repository.MergedRepository;
import de.uka.ipd.sdq.pcm.designdecision.specific.FeatureCompletionDegree;
import de.uka.ipd.sdq.pcm.designdecision.specific.specificFactory;

public class CompletionDesignDecision {

	private final FeatureCompletionRepository fcRepository;
	private final MergedRepository merged;

	public CompletionDesignDecision(FeatureCompletionRepository fcRepository, MergedRepository merged) {
		this.fcRepository = fcRepository;
		this.merged = merged;
	}

	public List<FeatureCompletionDegree> generateFCCDegrees() {
		return this.fcRepository.getFeatureCompletions().stream().map(this::generateCompletionDegreeWith).filter(this::hasDesignOptions).collect(Collectors.toList());
	}

	private FeatureCompletionDegree generateCompletionDegreeWith(FeatureCompletion featureCompletion) {
		FeatureCompletionDegree completionDegree = specificFactory.eINSTANCE.createFeatureCompletionDegree();
		completionDegree.setPrimaryChanged(featureCompletion);
		completionDegree.getClassDesignOptions().add(this.merged);
		return completionDegree;
	}

	private boolean hasDesignOptions(FeatureCompletionDegree completionDegree) {
		return !completionDegree.getClassDesignOptions().isEmpty();
	}

}
