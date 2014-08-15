package de.uka.ipd.sdq.dsexplore.helper;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;
import org.eclipse.emf.ecore.EObject;

import de.uka.ipd.sdq.pcm.allocation.AllocationContext;
import de.uka.ipd.sdq.pcm.core.composition.AssemblyContext;
import de.uka.ipd.sdq.pcm.core.entity.Entity;
import de.uka.ipd.sdq.pcm.designdecision.specific.AllocationDegree;
import de.uka.ipd.sdq.pcm.designdecision.specific.AssembledComponentDegree;
import de.uka.ipd.sdq.pcm.designdecision.specific.CapacityDegree;
import de.uka.ipd.sdq.pcm.designdecision.specific.ExchangeComponentRule;
import de.uka.ipd.sdq.pcm.designdecision.specific.ProcessingResourceDegree;
import de.uka.ipd.sdq.pcm.designdecision.specific.ResourceContainerReplicationDegree;
import de.uka.ipd.sdq.pcm.designdecision.specific.ResourceContainerReplicationDegreeWithComponentChange;
import de.uka.ipd.sdq.pcm.designdecision.specific.util.specificSwitch;
import de.uka.ipd.sdq.pcm.repository.BasicComponent;
import de.uka.ipd.sdq.pcm.repository.PassiveResource;
import de.uka.ipd.sdq.pcm.repository.Repository;
import de.uka.ipd.sdq.pcm.repository.RepositoryComponent;
import de.uka.ipd.sdq.pcm.resourceenvironment.ProcessingResourceSpecification;
import de.uka.ipd.sdq.pcm.resourceenvironment.ResourceContainer;
import de.uka.ipd.sdq.pcm.resourcetype.ProcessingResourceType;
import de.uka.ipd.sdq.pcmsolver.models.PCMInstance;

/**
 * This class fixes the references of designdecision/specific models. See FixDesignDecisionReferenceSwitch for reference. 
 * Is called by FixDesignDecisionReferenceSwitch if that does not find a matching case. 
 * 
 * @author martens
 */
public class FixSpecificDesignDecisionReferenceSwitch extends specificSwitch<EObject> {
	
	protected static Logger logger = Logger
		.getLogger(FixSpecificDesignDecisionReferenceSwitch.class.getName());

	public void fixEntitiesForDomain(List<EObject> eListToUpdate, List<Entity> memoryEntityList) {

		List<Entity> newList = new ArrayList<Entity>();
		
		for (EObject entity : eListToUpdate) {
			Entity rightOne = EMFHelper.retrieveEntityByID(memoryEntityList, entity);
			newList.add(rightOne);
		}

		eListToUpdate.clear();
		eListToUpdate.addAll(newList);
	}

	private PCMInstance initialInstance;

	public FixSpecificDesignDecisionReferenceSwitch(PCMInstance initialInstance2) {
		this.initialInstance = initialInstance2;
	}

	@Override
	public EObject caseAllocationDegree(AllocationDegree object) {
		String id = ((AllocationContext)object.getPrimaryChanged()).getId();
		List<AllocationContext> acs = this.initialInstance.getAllocation().getAllocationContexts_Allocation();
		AllocationContext rightOne = (AllocationContext)EMFHelper.retrieveEntityByID(acs,id);
		
		if (rightOne == null){
			throw new RuntimeException("Cannot find AllocationContext "+id+" in the specified PCM ALlocation Model. Maybe the design decision file does not match the analysed PCM instance?");
		}
		
		object.setPrimaryChanged(rightOne);
		
		
		List<Entity> allCurrentServers = new ArrayList<Entity>();
		allCurrentServers.addAll(this.initialInstance.getResourceEnvironment().getResourceContainer_ResourceEnvironment());
		
		fixEntitiesForDomain(object.getClassDesignOptions(), allCurrentServers);
		
		return object;
	}


	@Override
	public EObject caseAssembledComponentDegree(
			AssembledComponentDegree object) {
		
		String id = ((Entity)object.getPrimaryChanged()).getId();
		List<AssemblyContext> acs = this.initialInstance.getSystem().getAssemblyContexts__ComposedStructure();
		AssemblyContext rightOne = (AssemblyContext)EMFHelper.retrieveEntityByID(acs, id);
		
		if (rightOne == null){
			throw new RuntimeException("Cannot find AssemblyContext "+id+" in the specified PCM ALlocation Model. Maybe the design decision file does not match the analysed PCM instance?");
		}
		
		object.setPrimaryChanged(rightOne);
		
		List<Entity> allCurrentComponents = new ArrayList<Entity>();
		List<Repository> repositories = this.initialInstance.getRepositories();
		for (Repository repository : repositories) {
			allCurrentComponents.addAll(repository.getComponents__Repository());
		}
		
		fixEntitiesForDomain(object.getClassDesignOptions(), allCurrentComponents);

		return object;
	}


	@Override
	public EObject caseProcessingResourceDegree(ProcessingResourceDegree object) {
		String id = ((ResourceContainer)object.getPrimaryChanged()).getId();
			
		List<ResourceContainer> rcs = this.initialInstance.getResourceEnvironment().getResourceContainer_ResourceEnvironment();
		ResourceContainer rightOne = (ResourceContainer)EMFHelper.retrieveEntityByID(rcs, id);
		
		if (rightOne == null){
			throw new RuntimeException("Cannot find ResourceContainer "+id+" in the specified PCM ALlocation Model. Maybe the design decision file does not match the analysed PCM instance?");
		}
		
		object.setPrimaryChanged(rightOne);
		
		ProcessingResourceType originalType = object.getProcessingresourcetype();
		List<ProcessingResourceSpecification> resources = rightOne.getActiveResourceSpecifications_ResourceContainer();
		boolean foundResourceType = false;
		for (ProcessingResourceSpecification resource : resources) {
			if (EMFHelper.checkIdentity(resource.getActiveResourceType_ActiveResourceSpecification(), originalType)){
				object.setProcessingresourcetype(resource.getActiveResourceType_ActiveResourceSpecification());
				foundResourceType = true;
				break;
			}
		}
		if (!foundResourceType){
			throw new RuntimeException("Fixing design decision references failed, could not find in memory resource type for "+object.getProcessingresourcetype());
		}
		
		return object;
	}

	@Override
	public EObject caseCapacityDegree(CapacityDegree object) {
		
		String id = ((Entity)object.getPrimaryChanged()).getId();
		
		List<Repository> repos = this.initialInstance.getRepositories();
		for (Repository repository : repos) {
			List<RepositoryComponent> components = repository.getComponents__Repository();
			for (RepositoryComponent component : components) {
				if (component instanceof BasicComponent){
					List<PassiveResource> prs = ((BasicComponent)component).getPassiveResource_BasicComponent();
					PassiveResource rightOne = (PassiveResource)EMFHelper.retrieveEntityByID(prs, id);
					if (rightOne != null){
						object.setPrimaryChanged(rightOne);
						return object;
					}
				}
			}
		}
		//logger.warn("Could not find "+object.getPrimaryChanged().getEntityName()+" in design decision reference switch, errors may occur.");
		throw new RuntimeException("Cannot find PassiveResource "+id+" in the specified PCM ALlocation Model. Maybe the design decision file does not match the analysed PCM instance?");
	}

	@Override
	public EObject caseResourceContainerReplicationDegree(
			ResourceContainerReplicationDegree object) {
		String id = ((Entity)object.getPrimaryChanged()).getId();
		List<ResourceContainer> acs = this.initialInstance.getResourceEnvironment().getResourceContainer_ResourceEnvironment();
		ResourceContainer rightOne = (ResourceContainer)EMFHelper.retrieveEntityByID(acs,id);
		
		if (rightOne == null){
			throw new RuntimeException("Cannot find ResourceContainer "+id+" in the specified PCM ResourceEnvironment Model. Maybe the design decision file does not match the analysed PCM instance?");
		}
		
		object.setPrimaryChanged(rightOne);
		
		return object;
	}

	@Override
	public EObject caseResourceContainerReplicationDegreeWithComponentChange(
			ResourceContainerReplicationDegreeWithComponentChange object) {
		
		caseResourceContainerReplicationDegree(object);
		
		for (ExchangeComponentRule rule : object.getExchangeComponentRule()) {
			String id = rule.getAllocationContext().getId();
			
			List<AllocationContext> acs = this.initialInstance.getAllocation().getAllocationContexts_Allocation();
			AllocationContext rightOne = (AllocationContext)EMFHelper.retrieveEntityByID(acs, id);
			rule.setAllocationContext(rightOne);
			
			List<Entity> allCurrentComponents = new ArrayList<Entity>();
			List<Repository> repositories = this.initialInstance.getRepositories();
			for (Repository repository : repositories) {
				allCurrentComponents.addAll(repository.getComponents__Repository());
			}
			
			List<RepositoryComponent> newList = new ArrayList<RepositoryComponent>();
			
			for (RepositoryComponent entity : rule.getRepositoryComponent()) {
				RepositoryComponent rightOne2 = (RepositoryComponent)EMFHelper.retrieveEntityByID(allCurrentComponents, entity);
				newList.add(rightOne2);
			}

			rule.getRepositoryComponent().clear();
			rule.getRepositoryComponent().addAll(newList);
		}
		
		return object; 
	}
	
	
	
	

	
	
}
