package edu.kit.ipd.are.dsexplore.featurecompletions.weaver;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.palladiosimulator.analyzer.workflow.blackboard.PCMResourceSetPartition;
import org.palladiosimulator.solver.models.PCMInstance;

import de.uka.ipd.sdq.dsexplore.tools.repository.MergedRepository;
import de.uka.ipd.sdq.pcm.cost.CostRepository;
import de.uka.ipd.sdq.pcm.designdecision.Choice;

public final class FCCWeaver {
	private final MergedRepository mergedRepo;

	public FCCWeaver(PCMResourceSetPartition initialPartition, PCMInstance pcm, MergedRepository solutions, Optional<String> costModelFileName, Optional<CostRepository> costModel) {
		this.mergedRepo = solutions;
	}

	public void nextDecodeStart() {

	}

	public void grabChoices(List<Choice> notTransformedChoices) {

	}

	public PCMInstance getWeavedInstance(PCMInstance original) {
		return original;
	}

	public MergedRepository getMergedRepo() {
		return this.mergedRepo;
	}

	public List<Choice> getConvertedFCCClassChoices() {
		return new ArrayList<>();
	}

}
