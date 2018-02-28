package de.uka.ipd.sdq.dsexplore.designdecisions.completions;

import java.util.List;
import java.util.stream.Collectors;

import org.palladiosimulator.pcm.repository.Repository;

import FeatureCompletionModel.FeatureCompletion;
import FeatureCompletionModel.FeatureCompletionRepository;
import de.uka.ipd.sdq.pcm.designdecision.specific.FeatureCompletionDegree;
import de.uka.ipd.sdq.pcm.designdecision.specific.specificFactory;

public class CompletionDesignDecision {

	private final FeatureCompletionRepository fcRepository;

	public CompletionDesignDecision(FeatureCompletionRepository fcRepository) {
		this.fcRepository = fcRepository;
	}

	public List<FeatureCompletionDegree> generateConcernDegrees() {
		return this.fcRepository.getFeatureCompletions().stream().map(this::generateCompletionDegreeWith).filter(this::hasDesignOptions).collect(Collectors.toList());

	}

	private FeatureCompletionDegree generateCompletionDegreeWith(FeatureCompletion featureCompletion) {
		FeatureCompletionDegree completionDegree = specificFactory.eINSTANCE.createFeatureCompletionDegree();
		completionDegree.setPrimaryChanged(featureCompletion);
		// TODO DTHF1 mergedRepo
		Repository mergedPalladioRepo = null;
		completionDegree.getClassDesignOptions().add(mergedPalladioRepo);
		return completionDegree;

	}

	private boolean hasDesignOptions(FeatureCompletionDegree completionDegree) {

		return !completionDegree.getClassDesignOptions().isEmpty();

	}

}
