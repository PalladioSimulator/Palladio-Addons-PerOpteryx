package de.uka.ipd.sdq.dsexplore.facade;

import java.util.List;

import de.uka.ipd.sdq.pcm.cost.CostRepository;

/**
 * Extension part of {@link IModule}. This part will be during the analysis of
 * the model.
 *
 * @author Dominik Fuchss
 *
 */
public interface IAnalysisExtension {
	/**
	 * Supply additional {@link CostRepository CostRepositories}.
	 * 
	 * @return a list of additional CostRepositories
	 */
	List<CostRepository> getAdditionalCostRepositories();
}
