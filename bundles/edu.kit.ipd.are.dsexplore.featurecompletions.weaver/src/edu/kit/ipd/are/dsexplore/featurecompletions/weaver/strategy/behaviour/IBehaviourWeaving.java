package edu.kit.ipd.are.dsexplore.featurecompletions.weaver.strategy.behaviour;

import java.util.List;

import org.palladiosimulator.solver.core.models.PCMInstance;

import FeatureCompletionModel.ComplementumVisnetis;
import edu.kit.ipd.are.dsexplore.featurecompletions.weaver.strategy.manager.PcmAllocationManager;
import edu.kit.ipd.are.dsexplore.featurecompletions.weaver.strategy.manager.PcmServiceEffectSpecificationManager;
import edu.kit.ipd.are.dsexplore.featurecompletions.weaver.strategy.manager.PcmSystemManager;
import edu.kit.ipd.are.dsexplore.featurecompletions.weaver.strategy.manager.PcmUsageModelManager;
import edu.kit.ipd.are.dsexplore.featurecompletions.weaver.strategy.manager.SolutionManager;

/**
 * Interface for behaviour weaving strategy.
 *
 * @author Maximilian Eckert (maximilian.eckert@student.kit.edu,
 *         maxieckert@web.de)
 *
 */
interface IBehaviourWeaving {

	PCMInstance getPCMToAdapt();

	// Managers
	SolutionManager getMergedRepoManager();

	PcmAllocationManager getPCMAllocationManager();

	PcmServiceEffectSpecificationManager getPCMSEFFManager();

	PcmSystemManager getPCMSystemManager();

	PcmUsageModelManager getPCMUsageModelManager();

	// Utilities
	List<ComplementumVisnetis> getSelectedCVs();

}
