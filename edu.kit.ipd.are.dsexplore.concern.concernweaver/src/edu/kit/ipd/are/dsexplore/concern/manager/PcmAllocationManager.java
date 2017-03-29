package edu.kit.ipd.are.dsexplore.concern.manager;

import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.palladiosimulator.pcm.allocation.Allocation;
import org.palladiosimulator.pcm.allocation.AllocationContext;
import org.palladiosimulator.pcm.allocation.AllocationFactory;
import org.palladiosimulator.pcm.core.composition.AssemblyContext;
import org.palladiosimulator.pcm.repository.RepositoryComponent;
import org.palladiosimulator.pcm.resourceenvironment.ResourceContainer;

import edu.kit.ipd.are.dsexplore.concern.exception.ConcernWeavingException;
import edu.kit.ipd.are.dsexplore.concern.exception.ErrorMessage;
import edu.kit.ipd.are.dsexplore.concern.util.ConcernWeaverUtil;

/**
 * This class provides all operations performed on a given PCM allocation.
 * @author scheerer
 *
 */
public class PcmAllocationManager {

	private static PcmAllocationManager eInstance = null;
	
	private Allocation allocation;
	
	private PcmAllocationManager() {
		
	}
	
	/**
	 * Creates or returns a PcmAllocationManager-instance.
	 * @param allocation - A given PCM allocation.
	 * @return a PcmAllocationManager-instance.
	 */
	public static PcmAllocationManager getInstanceBy(Allocation allocation) {
		
		if (eInstance == null) {
			
			eInstance = new PcmAllocationManager();
			
		}
		
		eInstance.allocation = allocation;
		
		return eInstance;
		
	}
	
	/**
	 * Filters the allocation contexts which satisfies the given predicate.
	 * @param searchCriteria - The search criteria for filtering the allocation contexts.
	 * @return the first filtered component.
	 */
	public Optional<AllocationContext> getAllocationContextBy(Predicate<AllocationContext> searchCriteria) {
		
		return getAllAllocationContexts().filter(searchCriteria).findFirst();
		
	}
	
	private Stream<AllocationContext> getAllAllocationContexts() {
		
		return this.allocation.getAllocationContexts_Allocation().stream();
		
	}
	
	/**
	 * Returns the allocation contexts which allocates a given component. Therefore, it is assumed that the
	 * input component is only allocated once.
	 * @param allocatedComponent - The component whose allocation context is supposed to be retrieved.
	 * @return the allocation context allocating the given component.
	 * @throws ConcernWeavingException - Will be thrown if the resulting size of the filtered allocation contexts is not one.
	 */
	public AllocationContext getAllocationContextContaining(RepositoryComponent allocatedComponent) throws ConcernWeavingException {
		
		List<AllocationContext> allocs = getAllocationContextsAllocating(allocatedComponent);
		if (allocs.size() != 1) {
			
			throw new ConcernWeavingException(ErrorMessage.allocationError(allocatedComponent, allocs.size()));
			
		}
		
		return allocs.get(0);
		
	}
	
	private List<AllocationContext> getAllocationContextsAllocating(RepositoryComponent component) {
		
		return getAllAllocationContexts().filter(allocationContextAllocating(component)).collect(Collectors.toList());
		
	}

	private Predicate<AllocationContext> allocationContextAllocating(RepositoryComponent component) {
		
		return alloc -> ConcernWeaverUtil.areEqual(getAllocatedComponentOf(alloc), component);
		
	}

	private RepositoryComponent getAllocatedComponentOf(AllocationContext alloc) {
		
		return alloc.getAssemblyContext_AllocationContext().getEncapsulatedComponent__AssemblyContext();
		
	}

	/**
	 * Checks if there exist at least one allocation context that allocates a given assembly context.
	 * @param assemblyContext - The assembly context that is suppose to be checked.
	 * @return true if the assembly context is allocated and false if not.
	 */
	public boolean existAllocationContextWith(AssemblyContext assemblyContext) {
		
		return getAllAllocationContexts().anyMatch(isAllocated(assemblyContext));
		
	}
	
	private Predicate<AllocationContext> isAllocated(AssemblyContext assemblyContext) {
		
		return alloc -> ConcernWeaverUtil.areEqual(alloc.getAssemblyContext_AllocationContext(), assemblyContext);
		
	}

	/**
	 * Adds an allocation context to the PCM allocation.
	 * @param allocationContext - The allocation context to add.
	 */
	public void addAllocationContext(AllocationContext allocationContext) {
		
		this.allocation.getAllocationContexts_Allocation().add(allocationContext);
		
	}
	
	/**
	 * Adds a set of allocation contexts to the PCM allocation.
	 * @param allocationContexts - The set of allocations contexts to add.
	 */
	public void addAllAllocationContexts(List<AllocationContext> allocationContexts) {
		
		this.allocation.getAllocationContexts_Allocation().addAll(allocationContexts);
		
	}
	
	/**
	 * Creates a new allocation context.
	 * @param assemblyContext - The assembly context that is suppose to be allocated.
	 * @param resourceContainer - The resource container the assembly context is allocated on.
	 * @return the newly created allocation context.
	 */
	public AllocationContext createAllocationContextBy(AssemblyContext assemblyContext, ResourceContainer resourceContainer) {
		
		AllocationContext allocationContext = AllocationFactory.eINSTANCE.createAllocationContext();
		allocationContext.setEntityName(String.format("%1s_Allocation", assemblyContext.getEntityName()));
		allocationContext.setAssemblyContext_AllocationContext(assemblyContext);
		allocationContext.setResourceContainer_AllocationContext(resourceContainer);
		
		return allocationContext;
		
	}
	
}
