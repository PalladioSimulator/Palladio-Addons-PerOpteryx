package edu.kit.ipd.are.dsexplore.featurecompletions.weaver.strategy.adapter;

import org.palladiosimulator.pcm.core.composition.AssemblyContext;
import org.palladiosimulator.pcm.repository.RepositoryComponent;
import org.palladiosimulator.solver.core.models.PCMInstance;

import edu.kit.ipd.are.dsexplore.featurecompletions.weaver.strategy.manager.SolutionManager;
import edu.kit.ipd.are.dsexplore.featurecompletions.weaver.strategy.manager.PcmAllocationManager;
import edu.kit.ipd.are.dsexplore.featurecompletions.weaver.strategy.manager.PcmServiceEffectSpecificationManager;
import edu.kit.ipd.are.dsexplore.featurecompletions.weaver.strategy.manager.PcmSystemManager;
import edu.kit.ipd.are.dsexplore.featurecompletions.weaver.strategy.manager.PcmUsageModelManager;

interface IAdapterWeaving {
	void setAdapter(RepositoryComponent component);

	void setAdapter(AssemblyContext assembly);

	PCMInstance getPCMToAdapt();

	RepositoryComponent getAdapterComponent();

	AssemblyContext getAdapterAssemblyContext();

	// Managers
	SolutionManager getSolutionManager();

	PcmAllocationManager getPCMAllocationManager();

	PcmServiceEffectSpecificationManager getPCMSEFFManager();

	PcmSystemManager getPCMSystemManager();

	PcmUsageModelManager getPCMUsageModelManager();
}
