package edu.kit.ipd.are.dsexplore.concern.manager;

import java.util.Optional;

import FeatureCompletionModel.ComplementumVisnetis;
import FeatureCompletionModel.CompletionComponent;
import FeatureCompletionModel.FeatureCompletion;
import featureObjective.Feature;

/**
 * This class provides all operations performed on a given concern.
 *
 * @author scheerer
 *
 */
public class FeatureCompletionManager {
	private static FeatureCompletionManager eInstance = null;
	private FeatureCompletion featureCompletion;

	private FeatureCompletionManager() {
	}

	/**
	 * Creates or returns a ConcernManager-instance.
	 *
	 * @param concern
	 *            - A given concern.
	 * @return a ConcernManager-instance.
	 */
	public static FeatureCompletionManager getInstanceBy(FeatureCompletion featureCompletion) {
		if (FeatureCompletionManager.eInstance == null) {
			FeatureCompletionManager.eInstance = new FeatureCompletionManager();
		}
		FeatureCompletionManager.eInstance.featureCompletion = featureCompletion;
		return FeatureCompletionManager.eInstance;
	}

	/**
	 * Retrieve the ECC which contains the corresponding enrich annotation.
	 *
	 * @param annotationEnrich
	 *            - The enrich annotation of the ECC that is suppose to be
	 *            retrieved.
	 * @return An optional of the retrieved ECC.
	 */
	public Optional<CompletionComponent> getElementaryConcernComponentBy(ComplementumVisnetis annotationEnrich) {
		for (CompletionComponent eachFCC : this.featureCompletion.getCompletionComponents()) {
			for (Feature providedFeature: eachFCC.getPerimeterProviding().getFeatureProviding())
				if (annotationEnrich.getComplementaryFeature().getId().equals(providedFeature.getId()))
					return Optional.of(eachFCC);
		}
		return Optional.empty();
	}

}
