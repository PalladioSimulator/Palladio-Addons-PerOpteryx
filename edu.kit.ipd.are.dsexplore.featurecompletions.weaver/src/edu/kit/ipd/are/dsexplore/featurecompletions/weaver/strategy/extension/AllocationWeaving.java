package edu.kit.ipd.are.dsexplore.featurecompletions.weaver.strategy.extension;

import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
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
			
			//TODO nur die zur Weaving location gehrenden Contexts auf selben ResourceConainer mappen
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
