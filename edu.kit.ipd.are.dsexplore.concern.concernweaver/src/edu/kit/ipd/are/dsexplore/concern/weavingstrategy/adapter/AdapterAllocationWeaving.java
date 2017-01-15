package edu.kit.ipd.are.dsexplore.concern.weavingstrategy.adapter;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

import org.palladiosimulator.pcm.allocation.AllocationContext;
import org.palladiosimulator.pcm.core.composition.AssemblyContext;
import org.palladiosimulator.pcm.repository.RepositoryComponent;
import org.palladiosimulator.pcm.resourceenvironment.ResourceContainer;

import ConcernModel.ElementaryConcernComponent;
import edu.kit.ipd.are.dsexplore.concern.concernweaver.WeavingInstruction;
import edu.kit.ipd.are.dsexplore.concern.handler.ECCStructureHandler;
import edu.kit.ipd.are.dsexplore.concern.util.ConcernWeaverUtil;

public class AdapterAllocationWeaving extends AdapterWeaving {

	private ResourceContainer resourceContainer;
	
	private void setResourceContainer(ResourceContainer resourceContainer) {
		
		this.resourceContainer = resourceContainer;
		
	}
	
	@Override
	public void weave(WeavingInstruction weavingInstruction) {
				
		String name = getUniqueAdapterName(weavingInstruction);
		
		setResourceContainer(weavingInstruction.getResourceContainer());
		
		addEccAllocationContexts(weavingInstruction.getECCWithConsumedFeatures().getFirst());
		addAdapterAllocationContextWith(name);
		
	}

	private void addAdapterAllocationContextWith(String name) {
		
		AssemblyContext assemblyContextToAllocate = getAssemblyContextOfComponentWith(ConcernWeaverUtil.getDefaultInstanceNameWith(name));
		AllocationContext allocationContextToAdd = pcmAllocationManager.createAllocationContextBy(assemblyContextToAllocate, this.resourceContainer);
		addAllocationContext(allocationContextToAdd);
		
	}

	private void addEccAllocationContexts(ElementaryConcernComponent ecc) {
		
		RepositoryComponent eccComponent = getComponentOf(ecc); 
		if (eccComponent.getRequiredRoles_InterfaceRequiringEntity().isEmpty()) {
			
			addAllocationContextOfECC(eccComponent);
			return;
			
		}
		
		getAllocationContextsOfECCAndRequiredECCs(ecc, this.resourceContainer).forEach(eachAllocationContext -> addAllocationContext(eachAllocationContext));
		
	}
	
	private void addAllocationContextOfECC(RepositoryComponent eccComponent) {
		
		AssemblyContext eccAssemblyContext = getUniqueAssemblyContextOf(eccComponent);
		AllocationContext allocationContextToAdd = pcmAllocationManager.createAllocationContextBy(eccAssemblyContext, this.resourceContainer);
		addAllocationContext(allocationContextToAdd);
		
	}
	
	private void addAllocationContext(AllocationContext allocationContextToAdd) {
		
		if (pcmAllocationManager.existAllocationContextWith(allocationContextToAdd.getAssemblyContext_AllocationContext())) {
			
			return;
			
		}
		
		pcmAllocationManager.addAllocationContext(allocationContextToAdd);
		
	}
	
	private AssemblyContext getAssemblyContextOfComponentWith(String uniqueName) {
		
		//TODO introduce exception
		return pcmSystemManager.getAssemblyContextByUniqueName(uniqueName).get();
		
	}
	
	private List<AllocationContext> getAllocationContextsOfECCAndRequiredECCs(ElementaryConcernComponent ecc, ResourceContainer resourceContainer) {
		
		return getECCAndRequiredAssemblyContexts(ecc).stream().map(eachAssemblyContext -> pcmAllocationManager.createAllocationContextBy(eachAssemblyContext, resourceContainer))
												  		      .collect(Collectors.toList());
		
	}

	private List<AssemblyContext> getECCAndRequiredAssemblyContexts(ElementaryConcernComponent ecc) {
		
//		RepositoryComponent eccComponent = concernRepositoryManager.getElementaryConcernComponentOf(ecc.getPerimeterInterface()).get();
//		RequiredECCHandler requiredEccHandler = new RequiredECCHandler(eccComponent, concernRepositoryManager.getAllProvidedRoles());
//		return requiredEccHandler.getRequiredECCsWith(getAssemblyContextCollector()).get();
//		return Arrays.asList(getUniqueAssemblyContextOf(eccComponent));
		return new ECCStructureHandler(ecc, concernRepositoryManager).getStructureWithInECCAccordingTo(getAssemblyContextCollector());
		
	}
	
	private Function<RepositoryComponent, List<AssemblyContext>> getAssemblyContextCollector() {
		
		return (component) -> assemblyContextCollector(component);
		
	}
	
	private List<AssemblyContext> assemblyContextCollector(RepositoryComponent component) {
		
		return Arrays.asList(getUniqueAssemblyContextOf(component));
		
	}

	private AssemblyContext getUniqueAssemblyContextOf(RepositoryComponent component) {
		
		Optional<List<AssemblyContext>> foundAssemblyContexts = pcmSystemManager.getAssemblyContextsInstantiating(component);
		if (foundAssemblyContexts.get().size() == 0) {
			
			//TODO introduce exception
			return null;
			
		}
		
		if (foundAssemblyContexts.get().size() > 1) {
			
			//TODO introduce exception
			return null;
			
		}
		
		return foundAssemblyContexts.get().get(0);
		
	}

}
