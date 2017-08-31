package de.uka.ipd.sdq.dsexplore.helper;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
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

import de.uka.ipd.sdq.dsexplore.opt4j.representation.DSEIndividual;
import de.uka.ipd.sdq.dsexplore.opt4j.start.Opt4JStarter;
import de.uka.ipd.sdq.identifier.Identifier;
import de.uka.ipd.sdq.pcm.designdecision.Candidates;
import de.uka.ipd.sdq.pcm.designdecision.designdecisionFactory;

/**
 * Also see {@link EcoreUtil} for more helper functions
 * like {@link EcoreUtil#equals(EObject, EObject)} to
 * test for equality.
 * @author martens
 *
 */
public class EMFHelper {

    /**
     * Checks for two PCM model elements whether they are the same, i.e. whether
     * they have the same ID. The model elements have to be derived from
     * Identifier. Note that two systems might use the same assembly contexts
     * and components, but still are two different systems. If one of the
     * Identifiers in null, false is returned.
     *
     * @param i1
     *            One Identifier
     * @param i2
     *            Another Identifier
     * @return true if i1.getId().equals(i2.getId()), false otherwise
     */
    public static boolean checkIdentity(final EObject i1, final EObject i2) {
        if (i1 == null || i2 == null) {
            return false;
        }
		if (i1 instanceof Identifier && i2 instanceof Identifier) {
			return (((Identifier) i1).getId().equals(((Identifier) i2).getId())); 
		} else {
			return EcoreUtil.equals(i1, i2);
		}
    }

    /**
     * Implements an identifier-based contains. Calls {@link #checkIdentity(Identifier, Identifier)}
     * to compare the {@link Identifier} i with the contents of the collection.
     *
     * @param coll
     * @param i
     * @return true if there is an {@link Identifier} in coll with an id equal to i.getID().
     */
    public static boolean contains(final Collection<? extends EObject> coll, final EObject i) {
        for (final EObject identifier : coll) {
            if (checkIdentity(identifier, i)){
                return true;
            }
        }
        return false;
    }

    public static boolean retainAll(final Collection<? extends Identifier> collection, final Collection<? extends EObject> itemsToRetain){
        boolean removedAny = false;
        for (final Iterator<? extends Identifier> iterator = collection.iterator(); iterator.hasNext();) {
            final Identifier identifier = iterator.next();
            boolean identifierContainedInItemsToRetain = false;
            for (final EObject identifierToRetain : itemsToRetain) {
                if (checkIdentity(identifier, identifierToRetain)){
                    identifierContainedInItemsToRetain = true;
                }
            }
            if (!identifierContainedInItemsToRetain){
                iterator.remove();
                removedAny = true;
            }
        }
        return removedAny;
    }

    /**
     * Save the given EObject to the file given by filename.
     *
     * @param modelToSave
     *            The EObject to save
     * @param fileName
     *            The filename where to save.
     */
    public static void saveToXMIFile(final EObject modelToSave, final URI fileName){
    	
    	saveToXMIFile(modelToSave, fileName, true);
    }

    /**
     * Additional parameter mayRetry to detect to deep recursion. 
     * @param modelToSave
     * @param fileName
     * @param mayRetry
     */
    private static void saveToXMIFile(final EObject modelToSave, final URI myURI, boolean mayRetry){
        final Logger logger = Logger.getLogger("de.uka.ipd.sdq.dsexplore");

        logger.debug("Saving " + modelToSave.toString() + " to " + myURI);

        // Create a resource set.
        final ResourceSet resourceSet = new ResourceSetImpl();

        // Register the default resource factory -- only needed for stand-alone!
        resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap()
        .put(Resource.Factory.Registry.DEFAULT_EXTENSION,
                new XMIResourceFactoryImpl());
        
        final Resource resource = resourceSet.createResource(myURI);
        resource.getContents().add(modelToSave);

        try {
            resource.save(Collections.EMPTY_MAP);
        } catch (final FileNotFoundException e){
            if (mayRetry && myURI.toFileString().length() > 250){
                //try again with a shorter filename, but just one more try (mayRetry = false). 
            	String lastSegment = myURI.segment(myURI.segmentCount()-1);
            	int lengthOfShortenedSegment = lastSegment.length() > 25 ? 25 : lastSegment.length() / 2; 
            	String lastSegmentShortened = lastSegment.substring(0, lengthOfShortenedSegment);
            	URI myShorterURI = myURI.trimSegments(1);
            	myShorterURI = myShorterURI.appendSegment(lastSegmentShortened+"-shortened-"+myURI.toString().hashCode());
                saveToXMIFile(modelToSave, myShorterURI, false);
            }
        } catch (final IOException e) {
            logger.error("Caught IOException:"+e.getClass()+": " + e.getMessage()+ " when trying to save to file "+myURI.toString());
        }
        // logger.debug("Saved " + fileURI);
    }

    /**
     * Copied From de.uka.ipd.sdq.pcmsolver.models.PCMInstance.
     *
     * @param fileName
     *            the filename specifying the file to load from
     * @return The EObject loaded from the file
     */
    public static EObject loadFromXMIFile(final URI fileName, final EPackage ePackage) {
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

    public static EObject loadFromXMIFile(final URI uri, final ResourceSet resourceSet, final EPackage ePackage){
        
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

    public static Candidates createEMFCandidates(final Collection<DSEIndividual> individuals) {
        final Candidates candidates = designdecisionFactory.eINSTANCE.createCandidates();
        candidates.setProblem(Opt4JStarter.getProblem().getEMFProblem());

        for (final DSEIndividual dseIndividual : individuals) {
            candidates.getCandidate().add(dseIndividual.getGenotype().getEMFCandidate());
        }
        return candidates;
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

    /**
     * @deprecated use {@link #loadFromXMIFile(URI, EPackage)} instead 
     */
	public static EObject loadFromXMIFile(String fileName, EPackage ePackage) {
		URI locationToLoadFrom = URI.createURI(fileName);
		if (locationToLoadFrom == null || !locationToLoadFrom.isPlatform()){
			locationToLoadFrom = URI.createFileURI(fileName);
		}
		return loadFromXMIFile(locationToLoadFrom, ePackage);
	}

}
