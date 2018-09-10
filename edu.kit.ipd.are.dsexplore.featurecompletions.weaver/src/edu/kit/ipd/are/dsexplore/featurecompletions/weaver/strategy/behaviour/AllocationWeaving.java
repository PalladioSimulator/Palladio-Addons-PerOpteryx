package edu.kit.ipd.are.dsexplore.featurecompletions.weaver.strategy.behaviour;

import java.util.List;
import java.util.Random;

import org.palladiosimulator.pcm.allocation.AllocationContext;
import org.palladiosimulator.pcm.core.composition.AssemblyContext;
import org.palladiosimulator.pcm.resourceenvironment.ResourceContainer;

import edu.kit.ipd.are.dsexplore.featurecompletions.weaver.port.FCCModule;
import edu.kit.ipd.are.dsexplore.featurecompletions.weaver.port.FCCWeaverException;

/**
 * This class handles weaving of the PCM allocation model.
 * 
 * @author Maximilian Eckert (maximilian.eckert@student.kit.edu, maxieckert@web.de)
 * 
 */
public class AllocationWeaving {

	private final IBehaviourWeaving parent;

	public AllocationWeaving(IBehaviourWeaving parent) {
		this.parent = parent;
	}

	private ResourceContainer resourceContainer;

	/**
	 * Applies the weaving operation on the allocation model. 
	 * FC components are allocated on arbitrary resource containers, as PerOpteryx takes care of rearranging allocations in its DSE.
	 * 
	 * @param instruction the weaving instruction to apply.
	 * @throws FCCWeaverException
	 */
	public void weave(IWeavingInstruction instruction) throws FCCWeaverException {
		FCCModule.logger.debug("Allocation Behaviour Weaving");

		//determine random resource container
		int bound = this.parent.getPCMToAdapt().getResourceEnvironment().getResourceContainer_ResourceEnvironment().size();
		resourceContainer = this.parent.getPCMToAdapt().getResourceEnvironment().getResourceContainer_ResourceEnvironment().get(new Random().nextInt(bound));

		//add allocation contexts for unallocated assembly contexts (that is all FCC and Complementum components)
		List<AssemblyContext> allContexts = this.parent.getPCMSystemManager().getAssemblyContextsBy(context -> true);
		for (AssemblyContext assemblyContext : allContexts) {
			if (!this.parent.getPCMAllocationManager().existAllocationContextWith(assemblyContext)) {
				AllocationContext newAssemblyContext = this.parent.getPCMAllocationManager().createAllocationContextBy(assemblyContext, resourceContainer);
				this.parent.getPCMAllocationManager().addAllocationContext(newAssemblyContext);
			}
		}	
	}
}
