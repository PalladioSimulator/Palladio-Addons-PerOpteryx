package de.uka.ipd.sdq.dsexplore.designdecisions.completions;

import java.util.List;
import java.util.stream.Collectors;

import org.palladiosimulator.solver.models.PCMInstance;

import FeatureCompletionModel.FeatureCompletion;
import FeatureCompletionModel.FeatureCompletionRepository;
import de.uka.ipd.sdq.dsexplore.concernweaving.util.WeavingManager;
import de.uka.ipd.sdq.dsexplore.tools.repository.MergedRepository;
import de.uka.ipd.sdq.pcm.designdecision.specific.FeatureCompletionDegree;
import de.uka.ipd.sdq.pcm.designdecision.specific.specificFactory;

public class CompletionDesignDecision {

	private final FeatureCompletionRepository fcRepository;
	private final PCMInstance pcm;

	public CompletionDesignDecision(PCMInstance pcm, FeatureCompletionRepository fcRepository) {
		this.fcRepository = fcRepository;
		this.pcm = pcm;
	}

	public List<FeatureCompletionDegree> generateConcernDegrees() {
		return this.fcRepository.getFeatureCompletions().stream().map(this::generateCompletionDegreeWith).filter(this::hasDesignOptions).collect(Collectors.toList());

	}

	private FeatureCompletionDegree generateCompletionDegreeWith(FeatureCompletion featureCompletion) {
		FeatureCompletionDegree completionDegree = specificFactory.eINSTANCE.createFeatureCompletionDegree();
		completionDegree.setPrimaryChanged(featureCompletion);

		MergedRepository mergedPalladioRepo = this.getMergedRepository();
		completionDegree.getClassDesignOptions().add(mergedPalladioRepo);
		return completionDegree;

	}

	private MergedRepository getMergedRepository() {
		// TODO DTHF1 merged ..
		MergedRepository merged = WeavingManager.getInstance().map(WeavingManager::getMergedRepo).orElse(null);
		return merged;
	}

	private boolean hasDesignOptions(FeatureCompletionDegree completionDegree) {
		return !completionDegree.getClassDesignOptions().isEmpty();
	}

}
