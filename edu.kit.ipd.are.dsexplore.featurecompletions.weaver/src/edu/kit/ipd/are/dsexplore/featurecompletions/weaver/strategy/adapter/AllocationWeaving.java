package edu.kit.ipd.are.dsexplore.featurecompletions.weaver.strategy.adapter;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.palladiosimulator.pcm.allocation.AllocationContext;
import org.palladiosimulator.pcm.core.composition.AssemblyContext;
import org.palladiosimulator.pcm.repository.RepositoryComponent;
import org.palladiosimulator.pcm.resourceenvironment.ResourceContainer;

import FeatureCompletionModel.CompletionComponent;
import edu.kit.ipd.are.dsexplore.featurecompletions.weaver.port.FCCWeaverException;
import edu.kit.ipd.are.dsexplore.featurecompletions.weaver.strategy.WeavingInstruction;

/**
 * This class is responsible for weaving the allocation view-type in the context
 * of the adapter transformation strategy.
 *
 * @author scheerer
 *
 */
public class AllocationWeaving {
	private ResourceContainer resourceContainer;

	private void setResourceContainer(ResourceContainer resourceContainer) {
		this.resourceContainer = resourceContainer;
	}

	public void weave(WeavingInstruction weavingInstruction) throws FCCWeaverException {
		this.resourceContainer = weavingInstruction.getResourceContainer();
		this.addAdapterAllocationContextRegarding(weavingInstruction.getInclusionMechanism().isMultiple());
		this.addECCAndRequiredAllocationContexts(weavingInstruction.getFCCWithConsumedFeatures().getFirst());
	}

	private void addAdapterAllocationContextRegarding(boolean isMultiple) throws FCCWeaverException {
		if (isMultiple) {
			this.createAndAddAdapterAllocationContext();
		} else {
			this.createAndAddAdapterAllocationContextIfNotExist();
		}
	}

	private void createAndAddAdapterAllocationContextIfNotExist() {
		if (this.getExistingAdapterAllocationContext().isPresent()) {
			return;
		}
		this.createAndAddAdapterAllocationContext();

	}

	private void createAndAddAdapterAllocationContext() {
		AllocationContext adapterAllocContext = AdapterWeaving.pcmAllocationManager.createAllocationContextBy(AdapterWeaving.adapterAssemblyContext, this.resourceContainer);
		this.addAllocationContext(adapterAllocContext);
	}

	private Optional<AllocationContext> getExistingAdapterAllocationContext() {
		return AdapterWeaving.pcmAllocationManager.getAllocationContextBy(this.adapterAllocationContextSearchCriteria());
	}

	private Predicate<AllocationContext> adapterAllocationContextSearchCriteria() {
		return alloc -> FCCWeaverUtil.areEqual(alloc.getAssemblyContext_AllocationContext(), AdapterWeaving.adapterAssemblyContext);
	}

	private void addECCAndRequiredAllocationContexts(CompletionComponent fcc) throws FCCWeaverException {
		this.getAllocationContextsOfECCAndRequiredECCs(fcc).forEach(eachAllocationContext -> this.addAllocationContext(eachAllocationContext));
	}

	private void addAllocationContext(AllocationContext allocationContextToAdd) {
		if (AdapterWeaving.pcmAllocationManager.existAllocationContextWith(allocationContextToAdd.getAssemblyContext_AllocationContext())) {
			return;
		}
		AdapterWeaving.pcmAllocationManager.addAllocationContext(allocationContextToAdd);
	}

	private List<AllocationContext> getAllocationContextsOfECCAndRequiredECCs(CompletionComponent fcc) throws FCCWeaverException {
		try {
			return this.getECCAndRequiredAssemblyContexts(fcc).map(eachAssemblyContext -> AdapterWeaving.pcmAllocationManager.createAllocationContextBy(eachAssemblyContext, this.resourceContainer))
					.collect(Collectors.toList());
		} catch (Exception ex) {
			throw new FCCWeaverException(ex.getMessage());
		}
	}

	private Stream<AssemblyContext> getECCAndRequiredAssemblyContexts(CompletionComponent fcc) {
		try {
			return new FCCStructureHandler(fcc, AdapterWeaving.concernRepositoryManager).getStructureOfECCAndRequiredAccordingTo(this.getAssemblyContextCollector()).stream();
		} catch (FCCWeaverException ex) {
			throw new RuntimeException(ex);
		}

	}

	private Function<RepositoryComponent, List<AssemblyContext>> getAssemblyContextCollector() throws FCCWeaverException {
		try {
			return (component) -> this.toAssemblyContext(component);
		} catch (Exception ex) {
			throw new FCCWeaverException(ex.getMessage());
		}
	}

	private List<AssemblyContext> toAssemblyContext(RepositoryComponent component) {
		try {
			return Arrays.asList(this.getUniqueAssemblyContextOf(component));
		} catch (FCCWeaverException ex) {
			throw new RuntimeException(ex);
		}
	}

	// Notice, this method is only used for FCC related components which should
	// be allocated exactly once.
	private AssemblyContext getUniqueAssemblyContextOf(RepositoryComponent component) throws FCCWeaverException {
		List<AssemblyContext> foundAssemblyContexts = AdapterWeaving.pcmSystemManager.getAssemblyContextsInstantiating(component);
		if (foundAssemblyContexts.size() != 1) {
			throw new FCCWeaverException(ErrorMessage.instantiationError(component, foundAssemblyContexts.size()));
		}
		return foundAssemblyContexts.get(0);
	}

}
