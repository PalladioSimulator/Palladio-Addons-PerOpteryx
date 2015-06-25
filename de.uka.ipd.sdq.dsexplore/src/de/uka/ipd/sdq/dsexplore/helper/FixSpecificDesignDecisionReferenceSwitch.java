package de.uka.ipd.sdq.dsexplore.helper;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;
import org.eclipse.emf.ecore.EObject;
import org.palladiosimulator.pcm.allocation.AllocationContext;
import org.palladiosimulator.pcm.core.composition.AssemblyContext;
import org.palladiosimulator.pcm.core.entity.Entity;
import org.palladiosimulator.pcm.repository.BasicComponent;
import org.palladiosimulator.pcm.repository.PassiveResource;
import org.palladiosimulator.pcm.repository.Repository;
import org.palladiosimulator.pcm.repository.RepositoryComponent;
import org.palladiosimulator.pcm.resourceenvironment.ProcessingResourceSpecification;
import org.palladiosimulator.pcm.resourceenvironment.ResourceContainer;
import org.palladiosimulator.pcm.resourcetype.ProcessingResourceType;
import org.palladiosimulator.solver.models.PCMInstance;

import de.uka.ipd.sdq.pcm.designdecision.specific.AllocationDegree;
import de.uka.ipd.sdq.pcm.designdecision.specific.AssembledComponentDegree;
import de.uka.ipd.sdq.pcm.designdecision.specific.CapacityDegree;
import de.uka.ipd.sdq.pcm.designdecision.specific.ExchangeComponentRule;
import de.uka.ipd.sdq.pcm.designdecision.specific.ProcessingResourceDegree;
import de.uka.ipd.sdq.pcm.designdecision.specific.ResourceContainerReplicationDegree;
import de.uka.ipd.sdq.pcm.designdecision.specific.ResourceContainerReplicationDegreeWithComponentChange;
import de.uka.ipd.sdq.pcm.designdecision.specific.util.specificSwitch;

/**
 * This class fixes the references of designdecision/specific models. See FixDesignDecisionReferenceSwitch for reference.
 * Is called by FixDesignDecisionReferenceSwitch if that does not find a matching case.
 *
 * @author martens
 */
public class FixSpecificDesignDecisionReferenceSwitch extends specificSwitch<EObject> {

    protected static Logger logger = Logger
            .getLogger(FixSpecificDesignDecisionReferenceSwitch.class.getName());

    public void fixEntitiesForDomain(final List<EObject> eListToUpdate, final List<Entity> memoryEntityList) {

        final List<Entity> newList = new ArrayList<Entity>();

        for (final EObject entity : eListToUpdate) {
            final Entity rightOne = EMFHelper.retrieveEntityByID(memoryEntityList, entity);
            newList.add(rightOne);
        }

        eListToUpdate.clear();
        eListToUpdate.addAll(newList);
    }

    private final PCMInstance initialInstance;

    public FixSpecificDesignDecisionReferenceSwitch(final PCMInstance initialInstance2) {
        this.initialInstance = initialInstance2;
    }

    @Override
    public EObject caseAllocationDegree(final AllocationDegree object) {
        final String id = ((AllocationContext)object.getPrimaryChanged()).getId();
        final List<AllocationContext> acs = this.initialInstance.getAllocation().getAllocationContexts_Allocation();
        final AllocationContext rightOne = (AllocationContext)EMFHelper.retrieveEntityByID(acs,id);

        if (rightOne == null){
            throw new RuntimeException("Cannot find AllocationContext "+id+" in the specified PCM ALlocation Model. Maybe the design decision file does not match the analysed PCM instance?");
        }

        object.setPrimaryChanged(rightOne);


        final List<Entity> allCurrentServers = new ArrayList<Entity>();
        allCurrentServers.addAll(this.initialInstance.getResourceEnvironment().getResourceContainer_ResourceEnvironment());

        fixEntitiesForDomain(object.getClassDesignOptions(), allCurrentServers);

        return object;
    }


    @Override
    public EObject caseAssembledComponentDegree(
            final AssembledComponentDegree object) {

        final String id = ((Entity)object.getPrimaryChanged()).getId();
        final List<AssemblyContext> acs = this.initialInstance.getSystem().getAssemblyContexts__ComposedStructure();
        final AssemblyContext rightOne = (AssemblyContext)EMFHelper.retrieveEntityByID(acs, id);

        if (rightOne == null){
            throw new RuntimeException("Cannot find AssemblyContext "+id+" in the specified PCM ALlocation Model. Maybe the design decision file does not match the analysed PCM instance?");
        }

        object.setPrimaryChanged(rightOne);

        final List<Entity> allCurrentComponents = new ArrayList<Entity>();
        final List<Repository> repositories = this.initialInstance.getRepositories();
        for (final Repository repository : repositories) {
            allCurrentComponents.addAll(repository.getComponents__Repository());
        }

        fixEntitiesForDomain(object.getClassDesignOptions(), allCurrentComponents);

        return object;
    }


    @Override
    public EObject caseProcessingResourceDegree(final ProcessingResourceDegree object) {
        final String id = ((ResourceContainer)object.getPrimaryChanged()).getId();

        final List<ResourceContainer> rcs = this.initialInstance.getResourceEnvironment().getResourceContainer_ResourceEnvironment();
        final ResourceContainer rightOne = (ResourceContainer)EMFHelper.retrieveEntityByID(rcs, id);

        if (rightOne == null){
            throw new RuntimeException("Cannot find ResourceContainer "+id+" in the specified PCM ALlocation Model. Maybe the design decision file does not match the analysed PCM instance?");
        }

        object.setPrimaryChanged(rightOne);

        final ProcessingResourceType originalType = object.getProcessingresourcetype();
        final List<ProcessingResourceSpecification> resources = rightOne.getActiveResourceSpecifications_ResourceContainer();
        boolean foundResourceType = false;
        for (final ProcessingResourceSpecification resource : resources) {
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
    public EObject caseCapacityDegree(final CapacityDegree object) {

        final String id = ((Entity)object.getPrimaryChanged()).getId();

        final List<Repository> repos = this.initialInstance.getRepositories();
        for (final Repository repository : repos) {
            final List<RepositoryComponent> components = repository.getComponents__Repository();
            for (final RepositoryComponent component : components) {
                if (component instanceof BasicComponent){
                    final List<PassiveResource> prs = ((BasicComponent)component).getPassiveResource_BasicComponent();
                    final PassiveResource rightOne = (PassiveResource)EMFHelper.retrieveEntityByID(prs, id);
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
            final ResourceContainerReplicationDegree object) {
        final String id = ((Entity)object.getPrimaryChanged()).getId();
        final List<ResourceContainer> acs = this.initialInstance.getResourceEnvironment().getResourceContainer_ResourceEnvironment();
        final ResourceContainer rightOne = (ResourceContainer)EMFHelper.retrieveEntityByID(acs,id);

        if (rightOne == null){
            throw new RuntimeException("Cannot find ResourceContainer "+id+" in the specified PCM ResourceEnvironment Model. Maybe the design decision file does not match the analysed PCM instance?");
        }

        object.setPrimaryChanged(rightOne);

        return object;
    }

    @Override
    public EObject caseResourceContainerReplicationDegreeWithComponentChange(
            final ResourceContainerReplicationDegreeWithComponentChange object) {

        caseResourceContainerReplicationDegree(object);

        for (final ExchangeComponentRule rule : object.getExchangeComponentRule()) {
            final String id = rule.getAllocationContext().getId();

            final List<AllocationContext> acs = this.initialInstance.getAllocation().getAllocationContexts_Allocation();
            final AllocationContext rightOne = (AllocationContext)EMFHelper.retrieveEntityByID(acs, id);
            rule.setAllocationContext(rightOne);

            final List<Entity> allCurrentComponents = new ArrayList<Entity>();
            final List<Repository> repositories = this.initialInstance.getRepositories();
            for (final Repository repository : repositories) {
                allCurrentComponents.addAll(repository.getComponents__Repository());
            }

            final List<RepositoryComponent> newList = new ArrayList<RepositoryComponent>();

            for (final RepositoryComponent entity : rule.getRepositoryComponent()) {
                final RepositoryComponent rightOne2 = (RepositoryComponent)EMFHelper.retrieveEntityByID(allCurrentComponents, entity);
                newList.add(rightOne2);
            }

            rule.getRepositoryComponent().clear();
            rule.getRepositoryComponent().addAll(newList);
        }

        return object;
    }







}
