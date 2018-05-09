package edu.kit.ipd.are.dsexplore.featurecompletions.weaver;

import java.util.ArrayList;
import java.util.List;

import org.palladiosimulator.analyzer.workflow.blackboard.PCMResourceSetPartition;
import org.palladiosimulator.pcm.repository.Repository;
import org.palladiosimulator.solver.models.PCMInstance;

import de.uka.ipd.sdq.dsexplore.tools.repository.MergedRepository;
import de.uka.ipd.sdq.dsexplore.tools.stereotypeapi.StereotypeAPIHelper;
import de.uka.ipd.sdq.pcm.cost.CostRepository;
import de.uka.ipd.sdq.pcm.designdecision.Choice;
import edu.kit.ipd.are.dsexplore.featurecompletions.weaver.port.FCCWeaverException;
import edu.kit.ipd.are.dsexplore.featurecompletions.weaver.strategy.IWeavingStrategy;
import edu.kit.ipd.are.dsexplore.featurecompletions.weaver.strategy.WeavingStrategies;
import featureSolution.InclusionMechanism;

public final class FCCWeaver {
	private final MergedRepository mergedRepo;
	private final IWeavingStrategy strategy;

	public FCCWeaver(PCMResourceSetPartition initialPartition, PCMInstance pcm, MergedRepository solutions, CostRepository costModel) {
		this.mergedRepo = solutions;
		this.strategy = this.determineStrategy(solutions);

	}

	private IWeavingStrategy determineStrategy(MergedRepository solutions) {
		InclusionMechanism meachanism = null;
		for (Repository repo : solutions) {
			List<InclusionMechanism> meachanisms = StereotypeAPIHelper.getViaStereoTypeFrom(repo, InclusionMechanism.class, "transformation");
			if (meachanisms.size() != 0) {
				continue;
			}
			if (meachanism == null) {
				meachanism = meachanisms.get(0);
			} else if (!meachanism.getId().equals(meachanisms.get(0).getId())) {
				throw new FCCWeaverException("Multiple InclusionMechanisms are not supported yet.");
			}
		}

		IWeavingStrategy strategy = WeavingStrategies.getStrategy(meachanism);
		if (strategy == null) {
			throw new FCCWeaverException("No Strategy found for " + meachanism);
		}
		return strategy;
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
