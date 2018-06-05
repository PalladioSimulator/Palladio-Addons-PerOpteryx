package edu.kit.ipd.are.dsexplore.concern.weavingstrategy.extension;

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
import edu.kit.ipd.are.dsexplore.concern.concernweaver.WeavingInstruction;
import edu.kit.ipd.are.dsexplore.concern.exception.ConcernWeavingException;
import edu.kit.ipd.are.dsexplore.concern.exception.ErrorMessage;
import edu.kit.ipd.are.dsexplore.concern.handler.FCCStructureHandler;
import edu.kit.ipd.are.dsexplore.concern.util.ConcernWeaverUtil;
import edu.kit.ipd.are.dsexplore.concern.weavingstrategy.adapter.AdapterWeaving;

/**
 * Taken from AdapterWeavingStrategy //TODO adopt for Extension Mechanism
 * @author Maximilian Eckert (maxieckert@web.de)
 *
 */
public class ExtensionAllocationWeaving extends ExtensionWeaving {

	private ResourceContainer resourceContainer;

	private void setResourceContainer(ResourceContainer resourceContainer) {
		this.resourceContainer = resourceContainer;
	}

	/**
	 * @see ExtensionWeaving#weave(WeavingInstruction)
	 */
	@Override
	public void weave(WeavingInstruction weavingInstruction) throws ConcernWeavingException {
		this.setResourceContainer(weavingInstruction.getResourceContainer());
		this.addAdapterAllocationContextRegarding(weavingInstruction.getInclusionMechanism().isMultiple());
		this.addECCAndRequiredAllocationContexts(weavingInstruction.getFCCWithConsumedFeatures().getFirst());
	}

	private void addAdapterAllocationContextRegarding(boolean isMultiple) throws ConcernWeavingException {
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
		AllocationContext adapterAllocContext = ExtensionWeaving.pcmAllocationManager
				.createAllocationContextBy(ExtensionWeaving.adapterAssemblyContext, this.resourceContainer);
		this.addAllocationContext(adapterAllocContext);
	}

	private Optional<AllocationContext> getExistingAdapterAllocationContext() {
		return ExtensionWeaving.pcmAllocationManager
				.getAllocationContextBy(this.adapterAllocationContextSearchCriteria());
	}

	private Predicate<AllocationContext> adapterAllocationContextSearchCriteria() {
		return alloc -> ConcernWeaverUtil.areEqual(alloc.getAssemblyContext_AllocationContext(),
				ExtensionWeaving.adapterAssemblyContext);
	}

	private void addECCAndRequiredAllocationContexts(CompletionComponent fcc) throws ConcernWeavingException {
		this.getAllocationContextsOfECCAndRequiredECCs(fcc)
				.forEach(eachAllocationContext -> this.addAllocationContext(eachAllocationContext));
	}

	private void addAllocationContext(AllocationContext allocationContextToAdd) {
		if (ExtensionWeaving.pcmAllocationManager
				.existAllocationContextWith(allocationContextToAdd.getAssemblyContext_AllocationContext())) {
			return;
		}
		ExtensionWeaving.pcmAllocationManager.addAllocationContext(allocationContextToAdd);
	}

	private List<AllocationContext> getAllocationContextsOfECCAndRequiredECCs(CompletionComponent fcc)
			throws ConcernWeavingException {
		try {
			return this.getECCAndRequiredAssemblyContexts(fcc)
					.map(eachAssemblyContext -> ExtensionWeaving.pcmAllocationManager
							.createAllocationContextBy(eachAssemblyContext, this.resourceContainer))
					.collect(Collectors.toList());
		} catch (Exception ex) {
			throw new ConcernWeavingException(ex.getMessage());
		}
	}

	private Stream<AssemblyContext> getECCAndRequiredAssemblyContexts(CompletionComponent fcc) {
		try {
			return new FCCStructureHandler(fcc, ExtensionWeaving.concernRepositoryManager)
					.getStructureOfECCAndRequiredAccordingTo(this.getAssemblyContextCollector()).stream();
		} catch (ConcernWeavingException ex) {
			throw new RuntimeException(ex);
		}

	}

	private Function<RepositoryComponent, List<AssemblyContext>> getAssemblyContextCollector()
			throws ConcernWeavingException {
		try {
			return (component) -> this.toAssemblyContext(component);
		} catch (Exception ex) {
			throw new ConcernWeavingException(ex.getMessage());
		}
	}

	private List<AssemblyContext> toAssemblyContext(RepositoryComponent component) {
		try {
			return Arrays.asList(this.getUniqueAssemblyContextOf(component));
		} catch (ConcernWeavingException ex) {
			throw new RuntimeException(ex);
		}
	}

	// Notice, this method is only used for ECC related components which should
	// be allocated exactly once.
	private AssemblyContext getUniqueAssemblyContextOf(RepositoryComponent component) throws ConcernWeavingException {
		List<AssemblyContext> foundAssemblyContexts = ExtensionWeaving.pcmSystemManager
				.getAssemblyContextsInstantiating(component);
		if (foundAssemblyContexts.size() != 1) {
			throw new ConcernWeavingException(ErrorMessage.instantiationError(component, foundAssemblyContexts.size()));
		}
		return foundAssemblyContexts.get(0);
	}
}
