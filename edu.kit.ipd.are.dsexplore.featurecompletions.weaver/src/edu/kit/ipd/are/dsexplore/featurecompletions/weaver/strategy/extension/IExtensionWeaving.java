package edu.kit.ipd.are.dsexplore.featurecompletions.weaver.strategy.extension;

import org.palladiosimulator.pcm.core.composition.AssemblyContext;
import org.palladiosimulator.pcm.repository.RepositoryComponent;
import org.palladiosimulator.solver.models.PCMInstance;

import edu.kit.ipd.are.dsexplore.featurecompletions.weaver.strategy.manager.MergedRepoManager;
import edu.kit.ipd.are.dsexplore.featurecompletions.weaver.strategy.manager.PcmAllocationManager;
import edu.kit.ipd.are.dsexplore.featurecompletions.weaver.strategy.manager.PcmServiceEffectSpecificationManager;
import edu.kit.ipd.are.dsexplore.featurecompletions.weaver.strategy.manager.PcmSystemManager;
import edu.kit.ipd.are.dsexplore.featurecompletions.weaver.strategy.manager.PcmUsageModelManager;

/**
 * @author Maximilian Eckert (maximilian.eckert@student.kit.edu, maxieckert@web.de)
 * 
 *
 */
interface IExtensionWeaving {
	void setFcComponent(RepositoryComponent component);
	RepositoryComponent getFcComponent();
	
	void setAdapter(RepositoryComponent component);

	void setAdapter(AssemblyContext assembly);

	PCMInstance getPCMToAdapt();

	RepositoryComponent getAdapterComponent();

	AssemblyContext getAdapterAssemblyContext();

	// Managers
	MergedRepoManager getMergedRepoManager();

	PcmAllocationManager getPCMAllocationManager();

	PcmServiceEffectSpecificationManager getPCMSEFFManager();

	PcmSystemManager getPCMSystemManager();

	PcmUsageModelManager getPCMUsageModelManager();
}
