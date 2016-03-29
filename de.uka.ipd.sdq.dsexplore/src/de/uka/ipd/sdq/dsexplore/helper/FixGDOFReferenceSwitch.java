package de.uka.ipd.sdq.dsexplore.helper;

import java.util.List;

import javax.sql.ConnectionEvent;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.Switch;
import org.eclipse.ocl.EvaluationEnvironment;
import org.eclipse.ocl.ecore.OCL;
import org.palladiosimulator.pcm.allocation.AllocationContext;
import org.palladiosimulator.pcm.core.composition.AssemblyConnector;
import org.palladiosimulator.pcm.core.composition.AssemblyContext;
import org.palladiosimulator.pcm.core.composition.Connector;
import org.palladiosimulator.pcm.core.composition.impl.AssemblyContextImpl;
import org.palladiosimulator.pcm.core.entity.Entity;
import org.palladiosimulator.pcm.repository.ProvidedRole;
import org.palladiosimulator.pcm.repository.RepositoryComponent;
import org.palladiosimulator.pcm.repository.RequiredRole;
import org.palladiosimulator.solver.models.PCMInstance;

import de.uka.ipd.sdq.dsexplore.gdof.GenomeToCandidateModelTransformation;
import de.uka.ipd.sdq.pcm.designdecision.DegreeOfFreedomInstance;
import de.uka.ipd.sdq.pcm.designdecision.gdof.ChangeableElementDescription;
import de.uka.ipd.sdq.pcm.designdecision.gdof.DegreeOfFreedom;
import de.uka.ipd.sdq.pcm.designdecision.gdof.HelperOCLDefinition;
import de.uka.ipd.sdq.pcm.designdecision.gdof.SelectionRule;
import de.uka.ipd.sdq.pcm.designdecision.gdof.util.gdofSwitch;

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
       final String id = object.getPrimaryChangeable().getId();
        final String id2 = object.getChangeableElementDescriptions().get(1).getId();
        EObject container = object.eContainer();
        //get ced
        ChangeableElementDescription ced1 = object.getChangeableElementDescriptions().get(0);
        ced1.setName("test123");
        //ced1.getChangeable().setName("feature");
        //ced1.setChangeable(value);
        
        EStructuralFeature feat = object.getPrimaryChangeable().getChangeable();
        //feat.setName("feature alter");
        ced1.setChangeable(feat);
        //EMFHelper.re
        final List<AssemblyContext> acs = this.initialInstance.getSystem().getAssemblyContexts__ComposedStructure();
        for (AssemblyContext  ac : acs) {
        ac.getId();
        
        }
        final List<RepositoryComponent> reps = this.initialInstance.getRepositories().get(0).getComponents__Repository();
//        final AssemblyContext rightOne = (AssemblyContext)EMFHelper.retrieveEntityByID(acs, id);
//        final AssemblyContext bla = (AssemblyContext) EMFHelper.retrieveEntityByID(acs, object);
    	object.setName("doener");
    	return object;
    }
    
    public EObject blabla(final DegreeOfFreedomInstance dofi) {
    	DegreeOfFreedom dof = dofi.getDof();
    	//--- TEST
    	EClass connClass = null;
    	for (Connector conn : this.initialInstance.getSystem().getConnectors__ComposedStructure()) {
    		connClass = conn.eClass();
    		break;
    	}
    	
    	//--- TEST
    	EObject eTarget = dofi.getPrimaryChanged();
    	//System.out.println(eTarget.eClass().getName());
    	for (ChangeableElementDescription ced : dof.getChangeableElementDescriptions()) {
    		String changeableContainingClassName = ced.getChangeable().getEContainingClass().getName();
    			//change context class in value rules
	    		for (HelperOCLDefinition helpDef : ced.getValueRule().getHelperDefinition()) {
	    			String nameCtxClass = helpDef.getContextClass().getName();
	    			if (nameCtxClass.equals(eTarget.eClass().getName())) {
	    				System.out.println("eTarget:          "+eTarget.eClass().toString());
	    				System.out.println("helperContext:    "+helpDef.getContextClass().toString());
	    				helpDef.setContextClass(eTarget.eClass());
	    			} else if (nameCtxClass.equals(changeableContainingClassName)) {
	    				System.out.println("initialInstance : "+connClass.toString());
	    				System.out.println("helperContext:    "+helpDef.getContextClass().toString());
	    				helpDef.setContextClass(connClass);
	    			}
	    		}
	    		//change context class in selection rules
	    		for (HelperOCLDefinition helpDef : ced.getSelectionRule().getHelperDefinition()) {
	    			String nameCtxClass = helpDef.getContextClass().getName();
	    			if (nameCtxClass.equals(eTarget.eClass().getName())) {
	    				helpDef.setContextClass(eTarget.eClass());
	    			} else if (nameCtxClass.equals(changeableContainingClassName)) {
	    				helpDef.setContextClass(connClass);
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
