package de.uka.ipd.sdq.dsexplore.helper;

import java.util.List;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.palladiosimulator.pcm.allocation.Allocation;
import org.palladiosimulator.pcm.allocation.AllocationContext;
import org.palladiosimulator.pcm.core.composition.Connector;
import org.palladiosimulator.pcm.repository.Interface;
import org.palladiosimulator.pcm.repository.Repository;
import org.palladiosimulator.pcm.repository.RepositoryComponent;
import org.palladiosimulator.pcm.resourceenvironment.ProcessingResourceSpecification;
import org.palladiosimulator.pcm.resourceenvironment.ResourceContainer;
import org.palladiosimulator.pcm.resourceenvironment.ResourceEnvironment;
import org.palladiosimulator.pcm.seff.SeffFactory;
import org.palladiosimulator.pcm.seff.SeffPackage;
import org.palladiosimulator.solver.models.PCMInstance;

import de.uka.ipd.sdq.pcm.designdecision.DegreeOfFreedomInstance;
import de.uka.ipd.sdq.pcm.designdecision.gdof.ChangeableElementDescription;
import de.uka.ipd.sdq.pcm.designdecision.gdof.DegreeOfFreedom;
import de.uka.ipd.sdq.pcm.designdecision.gdof.HelperOCLDefinition;
import de.uka.ipd.sdq.pcm.designdecision.gdof.util.gdofSwitch;
import de.uka.ipd.sdq.stoex.Expression;

public class FixGDOFReferenceSwitch extends gdofSwitch<EObject> {

    private final PCMInstance initialInstance;

    public FixGDOFReferenceSwitch(final PCMInstance initialInstance2) {
        this.initialInstance = initialInstance2;
    }
    @Override
    public EObject caseChangeableElementDescription(final ChangeableElementDescription object) {
    	
//    	final String id = ((Entity)object.getPrimaryChanged()).getId();
//        final List<AssemblyContext> acs = this.initialInstance.getSystem().getAssemblyContexts__ComposedStructure();
//        final AssemblyContext rightOne = (AssemblyContext)EMFHelper.retrieveEntityByID(acs, id);
    	
		return object;
    	
    }
    @Override
    public EObject caseDegreeOfFreedom(final DegreeOfFreedom object) {
//       final String id = object.getPrimaryChangeable().getId();
//        final String id2 = object.getChangeableElementDescriptions().get(1).getId();
//        EObject container = object.eContainer();
//        //get ced
//        ChangeableElementDescription ced1 = object.getChangeableElementDescriptions().get(0);
//        ced1.setName("test123");
//        //ced1.getChangeable().setName("feature");
//        //ced1.setChangeable(value);
//        
//        EStructuralFeature feat = object.getPrimaryChangeable().getChangeable();
//        //feat.setName("feature alter");
//        ced1.setChangeable(feat);
//        //EMFHelper.re
//        final List<AssemblyContext> acs = this.initialInstance.getSystem().getAssemblyContexts__ComposedStructure();
//        for (AssemblyContext  ac : acs) {
//        ac.getId();
//        
//        }
//        final List<RepositoryComponent> reps = this.initialInstance.getRepositories().get(0).getComponents__Repository();
////        final AssemblyContext rightOne = (AssemblyContext)EMFHelper.retrieveEntityByID(acs, id);
////        final AssemblyContext bla = (AssemblyContext) EMFHelper.retrieveEntityByID(acs, object);
//    	object.setName("doener");
    	return object;
    }
    
    public EObject blabla(final DegreeOfFreedomInstance dofi) {
    	org.palladiosimulator.pcm.system.System system = this.initialInstance.getSystem();
    	Allocation allocation = this.initialInstance.getAllocation();
    	ResourceEnvironment resEnv = this.initialInstance.getResourceEnvironment();
    	EList<ResourceContainer> resContainers = resEnv.getResourceContainer_ResourceEnvironment();
    	EClass prsClass = null;
    	for (ResourceContainer rc : resContainers) {
    		if (prsClass != null) break;
    		for (ProcessingResourceSpecification prs : rc.getActiveResourceSpecifications_ResourceContainer()) {
    			prsClass = prs.eClass();
    			break;
    		}
    	}
//    	EList<ResourceContainer> reCons = this.initialInstance.getResourceEnvironment().getResourceContainer_ResourceEnvironment();
    	EList<AllocationContext> alloCons = allocation.getAllocationContexts_Allocation();
    	SeffPackage sp = SeffFactory.eINSTANCE.getSeffPackage();
    	EClass rdb = sp.getResourceDemandingBehaviour();
    	DegreeOfFreedom dof = dofi.getDof();
    	//--- TEST
//    	for (ResourceContainer recon : reCons) {
//    		EList<ProcessingResourceSpecification> acts = recon.getActiveResourceSpecifications_ResourceContainer();
//    		recon.eClass().getEAllSuperTypes();
//    		recon.getClass();
//    	}
    	
    	EClass alloConClass = null;
    	for (AllocationContext ac : alloCons) {
    		alloConClass = ac.eClass();
    		break;
    	}
    	
    	EList<Connector> connectors = system.getConnectors__ComposedStructure();
    	
    	EClass requDelConn = null;
    	EClass provDelConn = null;
    	EClass connClass = null;
    	for (Connector conn : connectors) {
    		if (conn.eClass().getName().equals("AssemblyConnector") && connClass == null) {
	    		connClass = conn.eClass();
    		} else if (conn.eClass().getName().equals("ProvidedDelegationConnector") && provDelConn == null) {
    			provDelConn = conn.eClass();
    		} else if (conn.eClass().getName().equals("RequiredDelegationConnector") && requDelConn == null) {
    			requDelConn = conn.eClass();
    		} else if (requDelConn != null && provDelConn != null && connClass != null) {
    			break;
    		}
    	}
    	
    	EClass compStruct = null;
    	for (EClass st : system.eClass().getEAllSuperTypes()) {
    		if (st.getName().equals("ComposedStructure")) {
    			compStruct = st;
    		}
    	}
    	
    	EClass interfaceComp = null;
    	EClass repoComp = null;
    	List<Repository> reps = this.initialInstance.getRepositories();
    	for (Repository r : reps) {
    		if (repoComp != null && interfaceComp != null) break;
    		List<RepositoryComponent> rcs = r.getComponents__Repository();
    		// get Interface Class -->
    		for (Interface in : r.getInterfaces__Repository()) {
    			EList<EClass> interSuperTypes = in.eClass().getEAllSuperTypes();
    			for (EClass st : interSuperTypes) {
	    			String interName = st.getName();
	    			if (interName.equals("Interface")) {
	    				interfaceComp = st;
	    				break;
	    			}
    			}
    		}
    		// <--
    		for (RepositoryComponent rc : rcs) {
    			if (repoComp != null && interfaceComp != null) break;
    			EList<EClass> te = rc.eClass().getEAllSuperTypes();
    			for (EClass st : te) {
    				String na = st.getName();
    				
    				if (na.equals("RepositoryComponent")) {
//    					System.out.println(st.toString());
    					repoComp = st;
    					break;
    				} 
    			}
    			

    		}
    		
    	}
    	
//    	for (Repository r : reps) {
//    		for (RepositoryComponent rc : r.getComponents__Repository()) {
//    			String s = rc.getEntityName();
//    			rc.eClass().getClass();
//    		}
//    	}
//    	
    	//--- TEST
    	EObject eTarget = dofi.getPrimaryChanged();
    	//System.out.println(eTarget.eClass().getName());
    	for (ChangeableElementDescription ced : dof.getChangeableElementDescriptions()) {
    		String changeableContainingClassName = ced.getChangeable().getEContainingClass().getName();
    		System.out.println("ChangeableContainingClass: "+changeableContainingClassName);
    			//change context class in value rules
	    		for (HelperOCLDefinition helpDef : ced.getValueRule().getHelperDefinition()) {
	    			String nameCtxClass = helpDef.getContextClass().getName();
	    			System.out.println("ValueRule:"+nameCtxClass);
	    			// -->
	    			if (nameCtxClass.equals("Interface")) {
	    				helpDef.setContextClass(interfaceComp);
	    			}
	    			// <--
	    			else if (nameCtxClass.equals("ProcessingResourceSpecification")) {
	    				helpDef.setContextClass(prsClass);
	    			}
	    			else if (nameCtxClass.equals("AllocationContext")) {
	    				helpDef.setContextClass(alloConClass);
	    			}
	    			else if (nameCtxClass.equals("ResourceDemandingBehaviour")) {
	    				helpDef.setContextClass(rdb);
	    			}
	    			else if (nameCtxClass.equals("RepositoryComponent")) {
	    				helpDef.setContextClass(repoComp);
	    			}
	    			else if (nameCtxClass.equals("ComposedStructure")) {
	    				helpDef.setContextClass(compStruct);
	    			}
	    			else if (nameCtxClass.equals("ProvidedDelegationConnector")) {
	    				helpDef.setContextClass(provDelConn);
	    			}
	    			else if (nameCtxClass.equals("RequiredDelegationConnector")) {
	    				helpDef.setContextClass(requDelConn);
	    			}
	    			else if (nameCtxClass.equals(eTarget.eClass().getName())) {
//	    				System.out.println("eTarget:          "+eTarget.eClass().toString());
//	    				System.out.println("helperContext:    "+helpDef.getContextClass().toString());
	    				helpDef.setContextClass(eTarget.eClass());
	    			}
	    			else if (nameCtxClass.equals("AssemblyConnector")) {
//	    				System.out.println("initialInstance : "+connClass.toString());
//	    				System.out.println("helperContext:    "+helpDef.getContextClass().toString());
	    				helpDef.setContextClass(connClass);
	    			}
	    		}
	    		//change context class in selection rules
	    		if (ced.getSelectionRule() != null) { 
		    		for (HelperOCLDefinition helpDef : ced.getSelectionRule().getHelperDefinition()) {
		    			String nameCtxClass = helpDef.getContextClass().getName();
		    			System.out.println("SelectionRule:"+nameCtxClass);
		    			if (nameCtxClass.equals("ComposedStructure")) {
		    				helpDef.setContextClass(compStruct);
		    			}
		    			else if (nameCtxClass.equals("System")) {
		    				helpDef.setContextClass(system.eClass());
		    			}
		    			else if (nameCtxClass.equals("ProvidedDelegationConnector")) {
		    				helpDef.setContextClass(provDelConn);
		    			}
		    			else if (nameCtxClass.equals("RequiredDelegationConnector")) {
		    				helpDef.setContextClass(requDelConn);
		    			}
		    			else if (nameCtxClass.equals(eTarget.eClass().getName())) {
		    				helpDef.setContextClass(eTarget.eClass());
		    			} 
		    			else if (nameCtxClass.equals("AssemblyConnector")) {
		    				helpDef.setContextClass(connClass);
		    			}
		    		}
	    		}
	    		
    		
    		// ist das "Property" in der Evaluation EReferenceImpl@228b2420
//    		EStructuralFeature changeable = ced.getChangeable();
//    		ced.setChangeable(eTarget.eClass().getEStructuralFeature(changeable.getName()));
//    		String name = dof.eClass().getName();
//    		
//    		//changed changeable ->property EReferenceImpl@67b7b892
//    		EStructuralFeature property = ced.getChangeable();
//    		
//    		//eTarget.eClass().eSet(changeable, eTarget);
//    		
//    		System.out.println(name);
    		//Object o = GenomeToCandidateModelTransformation.getProperty(obj, changeable);
    		
    		///System.out.println(o.toString());
    		//EStructuralFeature bla = (EStructuralFeature) ced.eGet(changeable);
    		
    	}
    	
    	
//    	EObject primaryChanged = dofi.getPrimaryChanged();
//    	DegreeOfFreedom dof = dofi.getDof();
//    	ChangeableElementDescription primaryChangeable = dof.getPrimaryChangeable();
//    	EStructuralFeature changeable = primaryChangeable.getChangeable();
//    	EObject container =  changeable.eContainer();
//    	RepositoryComponent rc = ((AssemblyContext)primaryChanged).getEncapsulatedComponent__AssemblyContext();
//    	
//    	EObject o = dofi.getPrimaryChanged();
//    	EList<HelperOCLDefinition> helperdefs = dof.getPrimaryChangeable().getValueRule().getHelperDefinition();
//    	HelperOCLDefinition hep = helperdefs.get(0);
//    	hep.eGet(changeable);
//    	
//    	
//    	String id = ((AssemblyContext)o).getId();
//    	EList<AssemblyContext> assCons = this.initialInstance.getSystem().getAssemblyContexts__ComposedStructure();
//    	AssemblyContext rightOne = (AssemblyContext)EMFHelper.retrieveEntityByID(assCons,id);
//    	dofi.setPrimaryChanged(rightOne);
//    	
//    	final org.eclipse.ocl.ecore.OCL OCL_ENV = org.eclipse.ocl.ecore.OCL.newInstance();
//    	EvaluationEnvironment<EClassifier, EOperation, EStructuralFeature, EClass, EObject> evalEnv = OCL_ENV.getEvaluationEnvironment();
//    	
////    	EObject objectWithOldValue = object.getPrimaryChanged();
////    	
////    	//final List<AssemblyContext> acs = this.initialInstance.getSystem().getAssemblyContexts__ComposedStructure();
////    	EStructuralFeature newValue = object.getDof().getPrimaryChangeable().getChangeable();
////    	EList<EStructuralFeature> featuresOld = objectWithOldValue.eClass().getEStructuralFeatures();
////    	String nameNewValue = newValue.getName();
//    	
////    	for (EStructuralFeature feature : featuresOld) {
////    		String nameOldVal = feature.getName();
////    		if (nameOldVal.equals(nameNewValue)) {
////    			featuresOld.remove(feature);
////    			featuresOld.add(newValue);
////    			break;
////    		}
////    	}
//    	
//    	
//    	
////    	for (AssemblyContext ac : acs) {
////    		if (ac.equals((AssemblyContext)oo)) {
////    			System.out.println("gleich");
////    		}
////    	}
//    	
    	return dofi;
    }

}
