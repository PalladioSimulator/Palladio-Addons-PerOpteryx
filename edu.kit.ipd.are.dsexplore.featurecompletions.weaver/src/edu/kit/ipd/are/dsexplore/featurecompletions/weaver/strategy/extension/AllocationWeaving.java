package edu.kit.ipd.are.dsexplore.featurecompletions.weaver.strategy.extension;

import java.util.List;
import org.palladiosimulator.pcm.allocation.AllocationContext;
import org.palladiosimulator.pcm.core.composition.AssemblyContext;
import org.palladiosimulator.pcm.repository.RepositoryComponent;
import org.palladiosimulator.pcm.resourceenvironment.ResourceContainer;

import edu.kit.ipd.are.dsexplore.featurecompletions.weaver.port.FCCWeaverException;


public class AllocationWeaving {

	private final IExtensionWeaving parent;

	public AllocationWeaving(IExtensionWeaving parent) {
		this.parent = parent;
	}

	private ResourceContainer resourceContainer;

	public void weave(IWeavingInstruction instruction) throws FCCWeaverException {
		
		List<? extends IWeavingLocation> locations = instruction.getWeavingLocations();
		for (IWeavingLocation location : locations) {
				
			RepositoryComponent allocatedComponent = location.getAffectedComponent();
			AllocationContext allocationContext = this.parent.getPCMAllocationManager().getAllocationContextContaining(allocatedComponent);
			resourceContainer = allocationContext.getResourceContainer_AllocationContext();

			//add allocation contexts for unallocated assembly contexts (aka FCC ac)
			List<AssemblyContext> allContexts = this.parent.getPCMSystemManager().getAssemblyContextsBy(context -> true);
			for (AssemblyContext assemblyContext : allContexts) {
				if (!this.parent.getPCMAllocationManager().existAllocationContextWith(assemblyContext)) {
					AllocationContext newAssemblyContext = this.parent.getPCMAllocationManager().createAllocationContextBy(assemblyContext, resourceContainer);
					this.parent.getPCMAllocationManager().addAllocationContext(newAssemblyContext);
				}
			}	
		}
	}
	


}
