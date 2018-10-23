package edu.kit.ipd.are.dsexplore.featurecompletions.weaver.extensions;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.palladiosimulator.pcm.repository.Repository;

import de.uka.ipd.sdq.dsexplore.facade.IAnalysisExtension;
import de.uka.ipd.sdq.dsexplore.tools.primitives.Pointer;
import de.uka.ipd.sdq.dsexplore.tools.stereotypeapi.StereotypeAPIHelper;
import de.uka.ipd.sdq.pcm.cost.CostRepository;
import edu.kit.ipd.are.dsexplore.featurecompletions.weaver.FCCWeaver;

public class FCCAnalysisExtension implements IAnalysisExtension {
	private final Pointer<FCCWeaver> weaver;

	public FCCAnalysisExtension(Pointer<FCCWeaver> weaver) {
		this.weaver = weaver;
	}

	@Override
	public List<CostRepository> getAdditionalCostRepositories() {
		FCCWeaver weaver = this.weaver.get();
		if (weaver == null) {
			return new ArrayList<>();
		}
		Set<CostRepository> result = new HashSet<>();
		for (Repository solution : weaver.getSolutionRepositories()) {
			List<CostRepository> additionalCosts = StereotypeAPIHelper.getViaStereoTypeFrom(solution, CostRepository.class, "cost");
			result.addAll(additionalCosts);
		}
		return new ArrayList<>(result);
	}

}
