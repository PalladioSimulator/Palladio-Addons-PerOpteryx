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
import edu.kit.ipd.are.dsexplore.featurecompletions.weaver.ErrorMessage;
import edu.kit.ipd.are.dsexplore.featurecompletions.weaver.FCCUtil;
import edu.kit.ipd.are.dsexplore.featurecompletions.weaver.port.FCCWeaverException;
import edu.kit.ipd.are.dsexplore.featurecompletions.weaver.strategy.WeavingInstruction;
import edu.kit.ipd.are.dsexplore.featurecompletions.weaver.strategy.handler.FCCStructureHandler;

/**
 * This class is responsible for weaving the allocation view-type in the context
 * of the adapter transformation strategy.
 *
 * @author scheerer
 *
 */
public class AllocationWeaving {

	private final IAdapterWeaving parent;

	public AllocationWeaving(IAdapterWeaving parent) {
		this.parent = parent;
	}

	private ResourceContainer resourceContainer;

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
		AllocationContext adapterAllocContext = this.parent.getPCMAllocationManager().createAllocationContextBy(this.parent.getAdapterAssemblyContext(), this.resourceContainer);
		this.addAllocationContext(adapterAllocContext);
	}

	private Optional<AllocationContext> getExistingAdapterAllocationContext() {
		return this.parent.getPCMAllocationManager().getAllocationContextBy(this.adapterAllocationContextSearchCriteria());
	}

	private Predicate<AllocationContext> adapterAllocationContextSearchCriteria() {
		return alloc -> FCCUtil.areEqual(alloc.getAssemblyContext_AllocationContext(), this.parent.getAdapterAssemblyContext());
	}

	private void addECCAndRequiredAllocationContexts(CompletionComponent fcc) throws FCCWeaverException {
		this.getAllocationContextsOfECCAndRequiredECCs(fcc).forEach(eachAllocationContext -> this.addAllocationContext(eachAllocationContext));
	}

	private void addAllocationContext(AllocationContext allocationContextToAdd) {
		if (this.parent.getPCMAllocationManager().existAllocationContextWith(allocationContextToAdd.getAssemblyContext_AllocationContext())) {
			return;
		}
		this.parent.getPCMAllocationManager().addAllocationContext(allocationContextToAdd);
	}

	private List<AllocationContext> getAllocationContextsOfECCAndRequiredECCs(CompletionComponent fcc) throws FCCWeaverException {
		try {
			return this.getECCAndRequiredAssemblyContexts(fcc).map(eachAssemblyContext -> this.parent.getPCMAllocationManager().createAllocationContextBy(eachAssemblyContext, this.resourceContainer))
					.collect(Collectors.toList());
		} catch (Exception ex) {
			throw new FCCWeaverException(ex.getMessage());
		}
	}

	private Stream<AssemblyContext> getECCAndRequiredAssemblyContexts(CompletionComponent fcc) {
		try {
			return new FCCStructureHandler(fcc, this.parent.getSolutionManager()).getStructureOfECCAndRequiredAccordingTo(this.getAssemblyContextCollector()).stream();
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
		List<AssemblyContext> foundAssemblyContexts = this.parent.getPCMSystemManager().getAssemblyContextsInstantiating(component);
		if (foundAssemblyContexts.size() != 1) {
			throw new FCCWeaverException(ErrorMessage.instantiationError(component, foundAssemblyContexts.size()));
		}
		return foundAssemblyContexts.get(0);
	}

}
