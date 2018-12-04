package de.uka.ipd.sdq.dsexplore.facade;

import java.util.List;

import de.uka.ipd.sdq.pcm.cost.CostRepository;

public interface IAnalysisExtension {
	List<CostRepository> getAdditionalCostRepositories();
}
