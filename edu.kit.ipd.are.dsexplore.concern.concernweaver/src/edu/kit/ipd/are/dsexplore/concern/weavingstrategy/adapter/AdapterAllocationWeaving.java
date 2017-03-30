package edu.kit.ipd.are.dsexplore.concern.weavingstrategy.adapter;

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

import ConcernModel.ElementaryConcernComponent;
import edu.kit.ipd.are.dsexplore.concern.concernweaver.WeavingInstruction;
import edu.kit.ipd.are.dsexplore.concern.exception.ConcernWeavingException;
import edu.kit.ipd.are.dsexplore.concern.exception.ErrorMessage;
import edu.kit.ipd.are.dsexplore.concern.handler.ECCStructureHandler;
import edu.kit.ipd.are.dsexplore.concern.util.ConcernWeaverUtil;

/**
 * This class is responsible for weaving the allocation view-type in the context of the adapter transformation strategy.
 * @author scheerer
 *
 */
public class AdapterAllocationWeaving extends AdapterWeaving {

	private ResourceContainer resourceContainer;
	
	private void setResourceContainer(ResourceContainer resourceContainer) {
		
		this.resourceContainer = resourceContainer;
		
	}

	/**
	 * @see AdapterWeaving#weave(WeavingInstruction)
	 */
	@Override
	public void weave(WeavingInstruction weavingInstruction) throws ConcernWeavingException {
		
		setResourceContainer(weavingInstruction.getResourceContainer());
		addAdapterAllocationContextRegarding(weavingInstruction.getTransformationStrategy().isMultiple());
		addECCAndRequiredAllocationContexts(weavingInstruction.getECCWithConsumedFeatures().getFirst());
		
	}

	private void addAdapterAllocationContextRegarding(boolean isMultiple) throws ConcernWeavingException {
		
		if (isMultiple) {
			
			createAndAddAdapterAllocationContext();
			
		} else {
			
			createAndAddAdapterAllocationContextIfNotExist();
			
		}
		
	}

	private void createAndAddAdapterAllocationContextIfNotExist() {
		
		if (getExistingAdapterAllocationContext().isPresent()) {
			
			return;
			
		}
		
		createAndAddAdapterAllocationContext();
		
	}

	private void createAndAddAdapterAllocationContext() {
		
		AllocationContext adapterAllocContext = pcmAllocationManager.createAllocationContextBy(adapterAssemblyContext, this.resourceContainer);
		addAllocationContext(adapterAllocContext);
		
	}
	
	private Optional<AllocationContext> getExistingAdapterAllocationContext() {
		
		return pcmAllocationManager.getAllocationContextBy(adapterAllocationContextSearchCriteria());
		
	}

	private Predicate<AllocationContext> adapterAllocationContextSearchCriteria() {
		
		return alloc -> ConcernWeaverUtil.areEqual(alloc.getAssemblyContext_AllocationContext(), adapterAssemblyContext);
		
	}

	private void addECCAndRequiredAllocationContexts(ElementaryConcernComponent ecc) throws ConcernWeavingException {
		
		getAllocationContextsOfECCAndRequiredECCs(ecc).forEach(eachAllocationContext -> addAllocationContext(eachAllocationContext));
		
	}
	
	private void addAllocationContext(AllocationContext allocationContextToAdd) {
		
		if (pcmAllocationManager.existAllocationContextWith(allocationContextToAdd.getAssemblyContext_AllocationContext())) {
			
			return;
			
		}
		
		pcmAllocationManager.addAllocationContext(allocationContextToAdd);
		
	}
	
	private List<AllocationContext> getAllocationContextsOfECCAndRequiredECCs(ElementaryConcernComponent ecc) throws ConcernWeavingException {
		
		try {
		
			return getECCAndRequiredAssemblyContexts(ecc).map(eachAssemblyContext -> pcmAllocationManager.createAllocationContextBy(eachAssemblyContext, this.resourceContainer))
													  	 .collect(Collectors.toList());
		} catch (Exception ex) {
			
			throw new ConcernWeavingException(ex.getMessage());
			
		}
		
	}

	private Stream<AssemblyContext> getECCAndRequiredAssemblyContexts(ElementaryConcernComponent ecc) {

		try {
			
			return new ECCStructureHandler(ecc, concernRepositoryManager).getStructureOfECCAndRequiredAccordingTo(getAssemblyContextCollector()).stream();
			
		} catch (ConcernWeavingException ex) {
			
			throw new RuntimeException(ex);
			
		}
		
	}
	
	private Function<RepositoryComponent, List<AssemblyContext>> getAssemblyContextCollector() throws ConcernWeavingException {
		
		try {
		
			return (component) -> toAssemblyContext(component);
			
		} catch (Exception ex) {
			
			throw new ConcernWeavingException(ex.getMessage());
			
		}
			
		
	}
	
	private List<AssemblyContext> toAssemblyContext(RepositoryComponent component) {
		
		try {
			
			return Arrays.asList(getUniqueAssemblyContextOf(component));
			
		} catch (ConcernWeavingException ex) {
			
			throw new RuntimeException(ex);
			
		}
		
	}

	//Notice, this method is only used for ECC related components which should be allocated exactly once.
	private AssemblyContext getUniqueAssemblyContextOf(RepositoryComponent component) throws ConcernWeavingException {
		
		List<AssemblyContext> foundAssemblyContexts = pcmSystemManager.getAssemblyContextsInstantiating(component);
		if (foundAssemblyContexts.size() != 1) {
			
			throw new ConcernWeavingException(ErrorMessage.instantiationError(component, foundAssemblyContexts.size()));
			
		}
		
		return foundAssemblyContexts.get(0);
		
	}

}
