package de.uka.ipd.sdq.dsexplore.helper;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import org.apache.log4j.Logger;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceImpl;

import de.uka.ipd.sdq.dsexplore.opt4j.representation.DSEIndividual;
import de.uka.ipd.sdq.dsexplore.opt4j.start.Opt4JStarter;
import de.uka.ipd.sdq.identifier.Identifier;
import genericdesigndecision.Candidates;
import genericdesigndecision.GenericdesigndecisionFactory;

/**
 * Also see {@link EcoreUtil} for more helper functions
 * like {@link EcoreUtil#equals(EObject, EObject)} to
 * test for equality.
 * @author martens
 *
 */
public class EMFHelper {

    /**
     * Checks for two model elements whether they are the same, i.e. whether
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
        if (i1 instanceof Identifier && i2 instanceof Identifier){
            if (((Identifier) i1).getId().equals(((Identifier) i2).getId())) {
                // logger.debug("Two model elements match with Id: "+i1.getId());
                return true;
            } else {
                return false;
            }} else {
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
    public static boolean contains(final Collection<? extends EObject> coll, final EObject i){
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

    public static Candidates createEMFCandidates(final Collection<DSEIndividual> individuals) {
	    final Candidates candidates = GenericdesigndecisionFactory.eINSTANCE.createCandidates();
	    candidates.setProblem(Opt4JStarter.getProblem().getProblem());
	
	    for (final DSEIndividual dseIndividual : individuals) {
	        candidates.getCandidate().add(dseIndividual.getGenotype().getEMFCandidate());
	    }
	    return candidates;
	}

	/**
     * Save the given EObject to the file given by filename.
     *
     * @param modelToSave
     *            The EObject to save
     * @param fileName
     *            The filename where to save.
     */
    public static void saveToXMIFile(final EObject modelToSave, final String fileName){
    	
    	saveToXMIFile(modelToSave, fileName, true);
    }

    /**
     * Additional parameter mayRetry to detect to deep recursion. 
     * @param modelToSave
     * @param fileName
     * @param mayRetry
     */
    private static void saveToXMIFile(final EObject modelToSave, final String fileName, boolean mayRetry){
        final Logger logger = Logger.getLogger("de.uka.ipd.sdq.dsexplore");

        logger.debug("Saving " + modelToSave.toString() + " to " + fileName);

        // Create a resource set.
        final ResourceSet resourceSet = new ResourceSetImpl();

        // Register the default resource factory -- only needed for stand-alone!
        resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap()
        .put(Resource.Factory.Registry.DEFAULT_EXTENSION,
                new XMIResourceFactoryImpl());
        
        final URI myURI = URI.createURI(fileName);

        final Resource resource = resourceSet.createResource(myURI);
        resource.getContents().add(modelToSave);

        try {
            resource.save(Collections.EMPTY_MAP);
        } catch (final FileNotFoundException e){
            if (mayRetry && fileName.length() > 250){
                //try again with a shorter filename, but just one more try (mayRetry = false). 
                saveToXMIFile(modelToSave, fileName.substring(0, fileName.indexOf("-"))+"-shortened-"+fileName.hashCode(), false);
            }
        } catch (final IOException e) {
            logger.error(e.getMessage());
        }
        // logger.debug("Saved " + fileURI);
    }
    
    
    /**
     * loads root element of ecore model persisted as XMI file and specified by given filename;
     * intended to be used to load input architecture model, on which Peropteryx optimises
     * @param fileName
     * @return
     */
    public static EPackage loadModelFromXMIFile(final String modelFileName) {   
    	final Logger logger = Logger.getLogger("de.uka.ipd.sdq.dsexplore");
        logger.debug("Loading model from " + modelFileName);
        
    	final File file = new File(modelFileName);
        final URI uri = file.isFile() ? URI.createFileURI(file.getAbsolutePath())
                : URI.createURI(modelFileName);
        Resource resource = new XMIResourceImpl(uri);
        
    	try {
			resource.load(null);
		} catch (IOException e) {
			logger.error("loading failed with message: " + e.getMessage());
			e.printStackTrace();
		}
    	EObject eObject = resource.getContents().get(0);
    	EPackage model = (EPackage) eObject.eContents().get(0);
    	
    	EPackage model2 = (EPackage) EcoreUtil.getRootContainer(eObject);
    	assert(checkIdentity(model, model2));
    	
    	return model;
    }

    /**
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

}