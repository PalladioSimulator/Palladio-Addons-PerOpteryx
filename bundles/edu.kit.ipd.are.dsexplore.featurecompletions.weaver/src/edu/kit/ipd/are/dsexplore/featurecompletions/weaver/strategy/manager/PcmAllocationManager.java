package edu.kit.ipd.are.dsexplore.featurecompletions.weaver.strategy.manager;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;

import org.palladiosimulator.pcm.allocation.Allocation;
import org.palladiosimulator.pcm.allocation.AllocationContext;
import org.palladiosimulator.pcm.allocation.AllocationFactory;
import org.palladiosimulator.pcm.core.composition.AssemblyContext;
import org.palladiosimulator.pcm.repository.RepositoryComponent;
import org.palladiosimulator.pcm.resourceenvironment.ResourceContainer;

import edu.kit.ipd.are.dsexplore.featurecompletions.weaver.ErrorMessage;
import edu.kit.ipd.are.dsexplore.featurecompletions.weaver.FCCUtil;
import edu.kit.ipd.are.dsexplore.featurecompletions.weaver.port.FCCWeaverException;

/**
 * This class provides all operations performed on a given PCM allocation.
 *
 * @author scheerer
 *
 */
public class PcmAllocationManager {
	private Allocation allocation;

	public PcmAllocationManager(Allocation allocation) {
		this.allocation = allocation;
	}

	/**
	 * Filters the allocation contexts which satisfies the given predicate.
	 *
	 * @param searchCriteria
	 *            - The search criteria for filtering the allocation contexts.
	 * @return the first filtered component.
	 */
	public Optional<AllocationContext> getAllocationContextBy(Predicate<AllocationContext> searchCriteria) {
		for (AllocationContext ac : this.getAllAllocationContexts()) {
			if (searchCriteria.test(ac)) {
				return Optional.of(ac);
			}
		}
		return Optional.empty();
		// return
		// this.getAllAllocationContexts().filter(searchCriteria).findFirst();
	}

	private List<AllocationContext> getAllAllocationContexts() {
		return this.allocation.getAllocationContexts_Allocation();
	}

	/**
	 * Returns the allocation contexts which allocates a given component.
	 * Therefore, it is assumed that the input component is only allocated once.
	 *
	 * @param allocatedComponent
	 *            - The component whose allocation context is supposed to be
	 *            retrieved.
	 * @return the allocation context allocating the given component.
	 * @throws FCCWeaverException
	 *             - Will be thrown if the resulting size of the filtered
	 *             allocation contexts is not one.
	 */
	public AllocationContext getAllocationContextContaining(RepositoryComponent allocatedComponent) throws FCCWeaverException {
		List<AllocationContext> allocs = this.getAllocationContextsAllocating(allocatedComponent);
		if (allocs.size() != 1) {
			throw new FCCWeaverException(ErrorMessage.allocationError(allocatedComponent, allocs.size()));
		}
		return allocs.get(0);

	}

	private List<AllocationContext> getAllocationContextsAllocating(RepositoryComponent component) {
		List<AllocationContext> result = new ArrayList<>();
		for (AllocationContext ac : this.getAllAllocationContexts()) {
			if (this.allocationContextAllocating(ac, component)) {
				result.add(ac);
			}
		}
		return result;
	}

	private boolean allocationContextAllocating(AllocationContext alloc, RepositoryComponent component) {
		return FCCUtil.areEqual(this.getAllocatedComponentOf(alloc), component);
	}

	private RepositoryComponent getAllocatedComponentOf(AllocationContext alloc) {
		return alloc.getAssemblyContext_AllocationContext().getEncapsulatedComponent__AssemblyContext();
	}

	/**
	 * Checks if there exist at least one allocation context that allocates a
	 * given assembly context.
	 *
	 * @param assemblyContext
	 *            - The assembly context that is suppose to be checked.
	 * @return true if the assembly context is allocated and false if not.
	 */
	public boolean existAllocationContextWith(AssemblyContext assemblyContext) {
		for (AllocationContext ac : this.getAllAllocationContexts()) {
			if (this.isAllocated(ac, assemblyContext)) {
				return true;
			}
		}
		return false;
	}

	private boolean isAllocated(AllocationContext alloc, AssemblyContext assemblyContext) {
		return FCCUtil.areEqual(alloc.getAssemblyContext_AllocationContext(), assemblyContext);
	}

	/**
	 * Adds an allocation context to the PCM allocation.
	 *
	 * @param allocationContext
	 *            - The allocation context to add.
	 */
	public void addAllocationContext(AllocationContext allocationContext) {
		this.allocation.getAllocationContexts_Allocation().add(allocationContext);
	}

	/**
	 * Creates a new allocation context.
	 *
	 * @param assemblyContext
	 *            - The assembly context that is suppose to be allocated.
	 * @param resourceContainer
	 *            - The resource container the assembly context is allocated on.
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
