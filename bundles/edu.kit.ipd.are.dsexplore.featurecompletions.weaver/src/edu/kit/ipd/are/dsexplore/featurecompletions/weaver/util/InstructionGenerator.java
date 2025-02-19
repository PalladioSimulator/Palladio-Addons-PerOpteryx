package edu.kit.ipd.are.dsexplore.featurecompletions.weaver.util;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

import org.palladiosimulator.pcm.repository.ProvidedRole;
import org.palladiosimulator.pcm.resourceenvironment.ResourceContainer;
import org.palladiosimulator.solver.core.models.PCMInstance;

import FeatureCompletionModel.ComplementumVisnetis;
import FeatureCompletionModel.CompletionComponent;
import FeatureCompletionModel.FeatureCompletion;
import de.uka.ipd.sdq.dsexplore.tools.primitives.Pair;
import edu.kit.ipd.are.dsexplore.featurecompletions.weaver.port.FCCWeaverException;
import edu.kit.ipd.are.dsexplore.featurecompletions.weaver.strategy.WeavingInstruction;
import edu.kit.ipd.are.dsexplore.featurecompletions.weaver.strategy.WeavingLocation;
import edu.kit.ipd.are.dsexplore.featurecompletions.weaver.strategy.handler.FCCFeatureHandler;
import featureObjective.Feature;
import featureSolution.InclusionMechanism;

public final class InstructionGenerator {
	private static final Random RANDOM = new Random();

	private final FeatureCompletion fc;
	private final InclusionMechanism im;

	private final FCCFeatureHandler fccfh;
	private final PCMInstance pcm;

	private final Map<CompletionComponent, ResourceContainer> fccToResourceContainerMap = new HashMap<>();

	public InstructionGenerator(FeatureCompletion fc, InclusionMechanism im, FCCFeatureHandler fccfh, PCMInstance pcm) {
		this.fc = fc;
		this.im = im;
		this.fccfh = fccfh;
		this.pcm = pcm;
	}

	public WeavingInstruction generate(Pair<ComplementumVisnetis, WeavingLocation> location) {
		Pair<CompletionComponent, List<ProvidedRole>> fccWithReqFeatures = this.getFCCWithRequiredFeaturesFrom(location.first);
		return this.generateWeavingInstructionFrom(fccWithReqFeatures, location.second, location.first);
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

	private Pair<CompletionComponent, List<ProvidedRole>> getFCCWithRequiredFeaturesFrom(ComplementumVisnetis cv) {
		CompletionComponent fcc = this.getFCCByVisnetis(cv);
		return Pair.of(fcc, this.fccfh.getProvidedFeaturesOf(fcc));
	}

	private WeavingInstruction generateWeavingInstructionFrom(Pair<CompletionComponent, List<ProvidedRole>> fccWithRequiredFeatures, WeavingLocation wl, ComplementumVisnetis cv)
			throws FCCWeaverException {
		ResourceContainer container = this.getResourceContainerFrom(fccWithRequiredFeatures.getFirst());
		return new WeavingInstructionBuilder().setFCCWithConsumedFeatures(fccWithRequiredFeatures).setResourceContainer(container).setTransformationStrategy(this.im).setWeavingLocation(wl).build(cv);

	}

	private ResourceContainer getResourceContainerFrom(CompletionComponent fcc) {
		return this.fccToResourceContainerMap.keySet().contains(fcc) ? this.fccToResourceContainerMap.get(fcc) : this.getRandomResourceContainer();
	}

	private ResourceContainer getRandomResourceContainer() {
		int bound = this.pcm.getResourceEnvironment().getResourceContainer_ResourceEnvironment().size();
		return this.pcm.getResourceEnvironment().getResourceContainer_ResourceEnvironment().get(InstructionGenerator.RANDOM.nextInt(bound));
	}

}
