package edu.kit.ipd.are.dsexplore.concern.manager;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.palladiosimulator.pcm.allocation.Allocation;
import org.palladiosimulator.pcm.allocation.AllocationContext;
import org.palladiosimulator.pcm.allocation.AllocationFactory;
import org.palladiosimulator.pcm.core.composition.AssemblyContext;
import org.palladiosimulator.pcm.repository.RepositoryComponent;
import org.palladiosimulator.pcm.resourceenvironment.ResourceContainer;

public class PcmAllocationManager {

	private static PcmAllocationManager eInstance = null;
	
	private Allocation allocation;
	
	private PcmAllocationManager() {
		
	}
	
	public static PcmAllocationManager getBy(Allocation allocation) {
		
		if (eInstance == null) {
			
			eInstance = new PcmAllocationManager();
			
		}
		
		eInstance.allocation = allocation;
		
		return eInstance;
		
	}
	
	public AllocationContext getAllocationContextContaining(RepositoryComponent allocatedComponent) throws Exception {
		
		List<AllocationContext> allocs = this.allocation.getAllocationContexts_Allocation().stream().filter(eachAlloc -> contains(allocatedComponent, eachAlloc))
																									.collect(Collectors.toList());
		
		if (allocs.size() != 1) {
			
			throw new Exception();
			
		}
		
		return allocs.get(0);
		
	}
	
	private boolean contains(RepositoryComponent allocatedComponent, AllocationContext allocContext) {
		
		RepositoryComponent givenComp = allocContext.getAssemblyContext_AllocationContext().getEncapsulatedComponent__AssemblyContext();
		return allocatedComponent.getId().equals(givenComp.getId());
		
	}

	public boolean existAllocationContextWith(AssemblyContext allocatedAssemblyContext) {
		
		return this.allocation.getAllocationContexts_Allocation().stream().anyMatch(eachAllocationContext -> allocates(allocatedAssemblyContext, eachAllocationContext));
		
	}
	
	private boolean allocates(AssemblyContext allocatedAssemblyContext, AllocationContext allocationContext) {
		
		return allocationContext.getAssemblyContext_AllocationContext().equals(allocatedAssemblyContext);
		
	}

	public void addAllocationContext(AllocationContext allocationContext) {
		
		this.allocation.getAllocationContexts_Allocation().add(allocationContext);
		
	}
	
	public void addAllAllocationContexts(List<AllocationContext> allocationContexts) {
		
		this.allocation.getAllocationContexts_Allocation().addAll(allocationContexts);
		
	}
	
	public AllocationContext createAllocationContextBy(AssemblyContext assemblyContext, ResourceContainer resourceContainer) {
		
		AllocationContext allocationContext = AllocationFactory.eINSTANCE.createAllocationContext();
		allocationContext.setEntityName(String.format("%1s_Allocation", assemblyContext.getEntityName()));
		allocationContext.setAssemblyContext_AllocationContext(assemblyContext);
		allocationContext.setResourceContainer_AllocationContext(resourceContainer);
		
		return allocationContext;
		
	}
	
	public Optional<ResourceContainer> getResourceContainerOf(AssemblyContext assemblyContext) {
		
		Optional<AllocationContext> searchedAllocationContext =  this.allocation.getAllocationContexts_Allocation().stream().filter(eachAllocationContext -> areEqual(eachAllocationContext.getAssemblyContext_AllocationContext(), assemblyContext))
																		  													.findFirst();
		
		if (searchedAllocationContext.isPresent()) {
			
			return Optional.of(searchedAllocationContext.get().getResourceContainer_AllocationContext());
			
		}
		
		return Optional.empty();
		
	}

	private boolean areEqual(AssemblyContext givenAssemblyContext, AssemblyContext searchedAssemblyContext) {
		
		String givenAssemblyContextId = givenAssemblyContext.getId();
		String searchedAssemblyContextId = searchedAssemblyContext.getId();
		
		return givenAssemblyContextId.equals(searchedAssemblyContextId);
		
	}
	
}
