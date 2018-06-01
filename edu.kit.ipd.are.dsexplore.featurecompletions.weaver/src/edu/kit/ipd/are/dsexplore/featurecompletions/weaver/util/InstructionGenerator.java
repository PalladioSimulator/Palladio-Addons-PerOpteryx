package edu.kit.ipd.are.dsexplore.featurecompletions.weaver.util;

import java.util.List;

import org.palladiosimulator.pcm.repository.ProvidedRole;

import FeatureCompletionModel.ComplementumVisnetis;
import FeatureCompletionModel.CompletionComponent;
import FeatureCompletionModel.FeatureCompletion;
import de.uka.ipd.sdq.dsexplore.tools.primitives.Pair;
import edu.kit.ipd.are.dsexplore.featurecompletions.weaver.port.FCCWeaverException;
import edu.kit.ipd.are.dsexplore.featurecompletions.weaver.strategy.WeavingInstruction;
import edu.kit.ipd.are.dsexplore.featurecompletions.weaver.strategy.WeavingLocation;
import featureObjective.Feature;

public final class InstructionGenerator {

	private FeatureCompletion fc;

	public InstructionGenerator(FeatureCompletion fc) {
		this.fc = fc;
	}

	public WeavingInstruction generate(Pair<ComplementumVisnetis, WeavingLocation> location) {
		Pair<CompletionComponent, List<ProvidedRole>> fccWithReqFeatures = InstructionGenerator.getFCCWithRequiredFeaturesFrom(location.first);
		return generateWeavingInstructionFrom(fccWithReqFeatures, location.second);
	}

	private Pair<CompletionComponent, List<ProvidedRole>> getFCCWithRequiredFeaturesFrom(ComplementumVisnetis cv) {
		CompletionComponent fcc = InstructionGenerator.getFCCByVisnetis(cv);
		return Pair.of(fcc, featureHandler.getProvidedFeaturesOf(fcc));
	}

	private CompletionComponent getFCCByVisnetis(ComplementumVisnetis cv) {
		String featureID = cv.getComplementaryFeature().getId();
		for (CompletionComponent fccCurrent : this.fc.getCompletionComponents()) {
			for (Feature fccCurrentProvidedFeature : fccCurrent.getPerimeterProviding().getFeatureProviding()) {
				if (fccCurrentProvidedFeature.getId().equalsIgnoreCase(featureID)) {
					return fccCurrent;
				}
			}
		}
		throw new FCCWeaverException("No FCC found for Complementum Visnetis with ID " + cv.getId());
	}
}
