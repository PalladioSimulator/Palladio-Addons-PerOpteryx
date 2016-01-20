package de.uka.ipd.sdq.pcmsupport.helper;

import java.io.File;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import org.apache.log4j.Logger;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.palladiosimulator.pcm.allocation.Allocation;
import org.palladiosimulator.pcm.allocation.AllocationContext;
import org.palladiosimulator.pcm.allocation.AllocationPackage;
import org.palladiosimulator.pcm.core.composition.AssemblyContext;
import org.palladiosimulator.pcm.core.entity.ComposedProvidingRequiringEntity;
import org.palladiosimulator.pcm.core.entity.Entity;
import org.palladiosimulator.pcm.parameter.ParameterPackage;
import org.palladiosimulator.pcm.repository.BasicComponent;
import org.palladiosimulator.pcm.repository.PassiveResource;
import org.palladiosimulator.pcm.repository.Repository;
import org.palladiosimulator.pcm.repository.RepositoryComponent;
import org.palladiosimulator.pcm.repository.RepositoryPackage;
import org.palladiosimulator.pcm.resourceenvironment.ResourceenvironmentPackage;
import org.palladiosimulator.pcm.resourcetype.ResourcetypePackage;
import org.palladiosimulator.pcm.seff.SeffPackage;
import org.palladiosimulator.pcm.system.SystemPackage;
import org.palladiosimulator.pcm.usagemodel.UsagemodelPackage;

/**
 * Also see {@link EcoreUtil} for more helper functions
 * like {@link EcoreUtil#equals(EObject, EObject)} to
 * test for equality.
 * @author martens
 *
 */
public class EMFHelper extends de.uka.ipd.sdq.dsexplore.helper.EMFHelper{

    /**
     * Copied From de.uka.ipd.sdq.pcmsolver.models.PCMInstance.
     *
     * @param fileName
     *            the filename specifying the file to load from
     * @return The EObject loaded from the file
     */
    public static EObject loadFromXMIFile(final String fileName, final EPackage ePackage) {
        // Create a resource set to hold the resources.
        final ResourceSet resourceSet = new ResourceSetImpl();

        // Register the appropriate resource factory to handle all file
        // extensions.
        resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap()
        .put(Resource.Factory.Registry.DEFAULT_EXTENSION,
                new XMIResourceFactoryImpl());

        // Register the package to ensure it is available during loading.
        registerPackages(resourceSet);

        return loadFromXMIFile(fileName, resourceSet, ePackage);
    }

    public static EObject loadFromXMIFile(final String fileName, final ResourceSet resourceSet, final EPackage ePackage){
        // Construct the URI for the instance file.
        // The argument is treated as a file path only if it denotes an existing
        // file. Otherwise, it's directly treated as a URL.
        final File file = new File(fileName);
        final URI uri = file.isFile() ? URI.createFileURI(file.getAbsolutePath())
                : URI.createURI(fileName);

        Resource resource = null;
        // Demand load resource for this file.
        try {
            resourceSet.getPackageRegistry().put(ePackage.getNsURI(), ePackage);
            resource = resourceSet.getResource(uri, true);
        } catch (final Exception e) {
            Logger.getLogger("de.uka.ipd.sdq.dsexplore").error(e.getMessage());
            return null;
        }

        // logger.debug("Loaded " + uri);

        // if (!fileName.endsWith(".assembly") &&
        // !fileName.endsWith("repository")) {
        // // Validate the contents of the loaded resource.
        // for (Iterator j = resource.getContents().iterator(); j.hasNext();) {
        // EObject eObject = (EObject) j.next();
        // Diagnostic diagnostic = Diagnostician.INSTANCE
        // .validate(eObject);
        // if (diagnostic.getSeverity() != Diagnostic.OK) {
        // System.out.println();
        // System.out.println(diagnostic.getMessage());
        // // printDiagnostic(diagnostic, "");
        //
        // }
        // }
        // }
        final EObject eObject = resource.getContents().iterator().next();
        return EcoreUtil.getRootContainer(eObject);
    }

    /**
     * Copied From de.uka.ipd.sdq.pcmsolver.models.PCMInstance.
     *
     * @param resourceSet
     *            The resource set to register all contained model packages
     *            with.
     */
    private static void registerPackages(final ResourceSet resourceSet) {

        resourceSet.getPackageRegistry().put(AllocationPackage.eNS_URI,
                AllocationPackage.eINSTANCE);
        resourceSet.getPackageRegistry().put(ParameterPackage.eNS_URI,
                ParameterPackage.eINSTANCE);
        resourceSet.getPackageRegistry().put(
                ResourceenvironmentPackage.eNS_URI,
                ResourceenvironmentPackage.eINSTANCE);
        resourceSet.getPackageRegistry().put(ResourcetypePackage.eNS_URI,
                ResourcetypePackage.eINSTANCE);
        resourceSet.getPackageRegistry().put(RepositoryPackage.eNS_URI,
                RepositoryPackage.eINSTANCE);
        resourceSet.getPackageRegistry().put(SeffPackage.eNS_URI,
                SeffPackage.eINSTANCE);
        resourceSet.getPackageRegistry().put(SystemPackage.eNS_URI,
                SystemPackage.eINSTANCE);
        resourceSet.getPackageRegistry().put(UsagemodelPackage.eNS_URI,
                UsagemodelPackage.eINSTANCE);

    }

    public static Entity retrieveEntityByID(final List<? extends EObject> entities, final EObject object){
        if (object instanceof Entity){
            final List<Entity> castedEntities = new ArrayList<Entity>();
            for (final EObject eObject : entities) {
                if (eObject instanceof Entity){
                    castedEntities.add((Entity) eObject);
                }
            }
            return retrieveEntityByID(castedEntities, ((Entity)object).getId());
        }
        return null;
    }

    public static Entity retrieveEntityByID(final List<? extends Entity> entities, final String id) {
        for (final Entity entity : entities) {

            if (entity.getId().equals(id)){
                return entity;
            }
        }
        return null;
    }

    public static int indexOfByID(final List<? extends Entity> entities, final String id) {
        final Entity entity = retrieveEntityByID(entities, id);
        return entities.indexOf(entity);
    }

    public static List<PassiveResource> getPassiveResources(final List<Repository> repositoryList){


        final List<PassiveResource> passiveResourceList = new ArrayList<PassiveResource>(repositoryList.size());

        for (final Repository repository : repositoryList) {
            final List<RepositoryComponent> repoComponents = repository
                    .getComponents__Repository();
            for (final RepositoryComponent repositoryComponent : repoComponents) {
                if (repositoryComponent instanceof BasicComponent) {
                    final BasicComponent basicComponent = (BasicComponent) repositoryComponent;
                    final List<PassiveResource> passiveResourceOfComponentList = basicComponent
                            .getPassiveResource_BasicComponent();
                    for (final PassiveResource passiveResource : passiveResourceOfComponentList) {

                        passiveResourceList.add(passiveResource);
                    }

                }
            }
        }
        return passiveResourceList;
    }

    /** Recursively get all contained AssemblyContexts in one flat list.
     * */
    public static List<AssemblyContext> getAllUsedAssemblyContexts(final ComposedProvidingRequiringEntity composite){
        final List<AssemblyContext> resultList = new LinkedList<AssemblyContext>();

        final List<AssemblyContext> currentAssemblyContexts = composite.getAssemblyContexts__ComposedStructure();
        resultList.addAll(currentAssemblyContexts);

        for (final AssemblyContext assemblyContext : currentAssemblyContexts) {
            final RepositoryComponent innerComponent = assemblyContext.getEncapsulatedComponent__AssemblyContext();
            if (innerComponent instanceof ComposedProvidingRequiringEntity){
                resultList.addAll(getAllUsedAssemblyContexts((ComposedProvidingRequiringEntity) innerComponent));
            }
        }
        return resultList;

    }

    public static List<AllocationContext> getAllUsedAllocationContexts(
            final Allocation allocation) {
        return allocation.getAllocationContexts_Allocation();
    }

}
