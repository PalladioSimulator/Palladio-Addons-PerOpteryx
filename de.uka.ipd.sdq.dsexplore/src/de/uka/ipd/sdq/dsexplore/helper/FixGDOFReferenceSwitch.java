package de.uka.ipd.sdq.dsexplore.helper;

import java.util.List;

import org.apache.log4j.Logger;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.palladiosimulator.pcm.allocation.Allocation;
import org.palladiosimulator.pcm.repository.Repository;
import org.palladiosimulator.pcm.seff.SeffFactory;
import org.palladiosimulator.pcm.seff.SeffPackage;
import org.palladiosimulator.solver.models.PCMInstance;

import de.uka.ipd.sdq.pcm.designdecision.DegreeOfFreedomInstance;
import de.uka.ipd.sdq.pcm.designdecision.gdof.ChangeableElementDescription;
import de.uka.ipd.sdq.pcm.designdecision.gdof.DegreeOfFreedom;
import de.uka.ipd.sdq.pcm.designdecision.gdof.HelperOCLDefinition;
import de.uka.ipd.sdq.pcm.designdecision.gdof.util.gdofSwitch;

public class FixGDOFReferenceSwitch extends gdofSwitch<EObject> {

	protected static Logger logger = Logger.getLogger(FixGDOFReferenceSwitch.class.getName());
	
    private final PCMInstance initialInstance;

    public FixGDOFReferenceSwitch(final PCMInstance initialInstance2) {
        this.initialInstance = initialInstance2;
    }
    @Override
    public EObject caseChangeableElementDescription(final ChangeableElementDescription object) {

		return object;
    	
    }
    @Override
    public EObject caseDegreeOfFreedom(final DegreeOfFreedom object) {
    	return object;
    }
    
    public EObject switchReferences(final DegreeOfFreedomInstance dofi) {

    	DegreeOfFreedom dof = dofi.getDof();
    	for (ChangeableElementDescription ced : dof.getChangeableElementDescriptions()) {

	    		for (HelperOCLDefinition helpDef : ced.getValueRule().getHelperDefinition()) {

	    			doContextClassSwitch(helpDef);  			

	    		}
	    		//change context class in selection rules
	    		if (ced.getSelectionRule() != null) { 
		    		for (HelperOCLDefinition helpDef : ced.getSelectionRule().getHelperDefinition()) {

		    			doContextClassSwitch(helpDef);

		    		}
	    		}
    	}
    	return dofi;
    }
	private void doContextClassSwitch(HelperOCLDefinition helpDef) {
		EClass helperClass = helpDef.getContextClass();
		EPackage container = (EPackage) helperClass.eContainer();
		System.out.println(container.getName());
		if (container.getName().equals("composition")) {
			doCompositionSwich(helpDef);
		} else if (container.getName().equals("entity")) {
			doEntitySwitch(helpDef);
		} else if (container.getName().equals("usagemodel")) {
			doUsagemodelSwitch(helpDef);
		} else if (container.getName().equals("repository")) {
			doRepositorySwitch(helpDef);
		} else if (container.getName().equals("resourcetype")) {
			doResourcetypeSwitch(helpDef);
		} else if (container.getName().equals("protocol")) {
			doProtocolSwitch(helpDef);
		} else if (container.getName().equals("parameter")) {
			doParameterSwitch(helpDef);
		} else if (container.getName().equals("reliability")) {
			doReliabilitySwitch(helpDef);
		} else if (container.getName().equals("seff")) {
			doSeffSwitch(helpDef);
		} else if (container.getName().equals("qosannotations")) {
			doQosannotationsSwitch(helpDef);
		} else if (container.getName().equals("system")) {
			doSystemSwitch(helpDef);
		} else if (container.getName().equals("resourceenvironment")) {
			doResourceenvironmentSwitch(helpDef);
		} else if (container.getName().equals("allocation")) {
			doAllocationSwitch(helpDef);
		} else if (container.getName().equals("subsystem")) {
			doSubsystemSwitch(helpDef);
		}
	}
	private void doSubsystemSwitch(HelperOCLDefinition helpDef) {
		 logger.error(
                 "Please implement Swich for: "+helpDef.getContextClass().getName());
	}
	private void doResourceenvironmentSwitch(HelperOCLDefinition helpDef) {
		// TODO Auto-generated method stub
		logger.error(
                "Please implement Swich for: "+helpDef.getContextClass().getName());
	}
	private void doSystemSwitch(HelperOCLDefinition helpDef) {
		EClass systemClass = this.initialInstance.getSystem().eClass();
		if (helpDef.getContextClass().getName().equals(systemClass.getName())) {
			helpDef.setContextClass(systemClass);
		}
	}
	private void doQosannotationsSwitch(HelperOCLDefinition helpDef) {
		// TODO Auto-generated method stub
		logger.error(
                "Please implement Swich for: "+helpDef.getContextClass().getName());
	}
	private void doReliabilitySwitch(HelperOCLDefinition helpDef) {
		// TODO Auto-generated method stub
		logger.error(
                "Please implement Swich for: "+helpDef.getContextClass().getName());
	}
	private void doParameterSwitch(HelperOCLDefinition helpDef) {
		// TODO Auto-generated method stub
		logger.error(
                "Please implement Swich for: "+helpDef.getContextClass().getName());
	}
	private void doProtocolSwitch(HelperOCLDefinition helpDef) {
		// TODO Auto-generated method stub
		logger.error(
                "Please implement Swich for: "+helpDef.getContextClass().getName());
	}
	private void doResourcetypeSwitch(HelperOCLDefinition helpDef) {
		// TODO Auto-generated method stub
		logger.error(
                "Please implement Swich for: "+helpDef.getContextClass().getName());
	}
	private void doUsagemodelSwitch(HelperOCLDefinition helpDef) {
		// TODO Auto-generated method stub
		logger.error(
                "Please implement Swich for: "+helpDef.getContextClass().getName());
	}
	private void doEntitySwitch(HelperOCLDefinition helpDef) {
		// TODO Auto-generated method stub
		logger.error(
                "Please implement Swich for: "+helpDef.getContextClass().getName());
	}
	private void doAllocationSwitch(HelperOCLDefinition helpDef) {
		Allocation allocation = this.initialInstance.getAllocation();
		EList<EObject> contents = allocation.eContents();
		EList<EClass> superTypes = allocation.eClass().getEAllSuperTypes();
		switchClasses(helpDef, contents, superTypes);
	}
	private void doSeffSwitch(HelperOCLDefinition helpDef) {
		SeffPackage seffPackage = SeffFactory.eINSTANCE.getSeffPackage();
		EList<?> contents = seffPackage.eContents();
		EList<EClass> superTypes = seffPackage.eClass().getEAllSuperTypes();
		switchClasses(helpDef, contents, superTypes);
	}
	private void doRepositorySwitch(HelperOCLDefinition helpDef) {
		List<Repository> repositories = this.initialInstance.getRepositories();
		EList<EObject> contents = new BasicEList<EObject>();
		EList<EClass> superTypes = new BasicEList<EClass>();
		for (Repository repository : repositories) {
			contents.addAll(repository.eContents());
		}
		for (EObject content : contents) {
			superTypes.addAll(content.eClass().getEAllSuperTypes());
		}
		switchClasses(helpDef, contents, superTypes);
	}
	/**
	 * Preparation for the switch of a context which is contained in the composition package
	 * @param helpDef is the HelperOCLDefinition for which the context class will be switched
	 */
	private void doCompositionSwich(HelperOCLDefinition helpDef) {
		org.palladiosimulator.pcm.system.System system = this.initialInstance.getSystem();
		EList<EObject> contents = system.eContents();
		EList<EClass> superTypes = system.eClass().getEAllSuperTypes();
		switchClasses(helpDef, contents, superTypes);
	}
	/**
	 * Method to do the switch for the different contexts
	 * 
	 * @param helpDef is the HelperOCLDefinition for which the context class will be switched
	 * @param contents All contents from the specific model which matches the context of the HelperOCLDefinition
	 * @param superTypes All SuperTypes from the specific model which matches the context of the HelperOCLDefinition
	 */
	@SuppressWarnings("unchecked")
	private void switchClasses(HelperOCLDefinition helpDef, EList<?> contents, EList<?> superTypes) {
		boolean found = false;
		
		for (Object content : contents) {
			
			if (content instanceof EClass) {
				EClass eClass = (EClass)content;
				if (helpDef.getContextClass().getName().equals((eClass).getName())) {
					helpDef.setContextClass(eClass);
					found = true;
					break;
				}
			} else if (content instanceof EObject) {
				EObject eObj = (EObject)content;
				if (helpDef.getContextClass().getName().equals((eObj).eClass().getName())) {
					helpDef.setContextClass(eObj.eClass());
					found = true;
					break;
				}
			}
		}
		if (!found) {
			for (EClass superType : (EList<EClass>)superTypes) {
				if (helpDef.getContextClass().getName().equals(superType.getName())) {
					helpDef.setContextClass(superType);
					found = true;
					break;
				}
			}
		} 
	}

}