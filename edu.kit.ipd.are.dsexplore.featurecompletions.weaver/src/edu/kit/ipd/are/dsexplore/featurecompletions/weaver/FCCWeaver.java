package edu.kit.ipd.are.dsexplore.featurecompletions.weaver;

import java.util.List;

import org.palladiosimulator.solver.Pair;
import org.palladiosimulator.solver.models.PCMInstance;

import de.uka.ipd.sdq.dsexplore.tools.repository.MergedRepository;
import de.uka.ipd.sdq.pcm.designdecision.Choice;
import de.uka.ipd.sdq.pcm.designdecision.specific.FeatureDegree;

public class FCCWeaver {
	public FCCWeaver(PCMInstance pcm, MergedRepository solutions) {
	}

	public PCMInstance getWeavedInstance(List<Pair<FeatureDegree, Choice>> choices) {
		return null;
	}

	public List<FeatureDegree> getOptionalFeaturesAsDegree() {
		return null;
	}
}
