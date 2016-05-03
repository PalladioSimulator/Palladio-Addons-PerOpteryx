package de.uka.ipd.sdq.dsexplore.helper;

import java.util.List;

import org.apache.log4j.Logger;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.palladiosimulator.pcm.allocation.Allocation;
import org.palladiosimulator.pcm.core.PCMRandomVariable;
import org.palladiosimulator.pcm.repository.Repository;
import org.palladiosimulator.pcm.resourceenvironment.ProcessingResourceSpecification;
import org.palladiosimulator.pcm.resourceenvironment.ResourceEnvironment;
import org.palladiosimulator.pcm.seff.SeffFactory;
import org.palladiosimulator.pcm.seff.SeffPackage;
import org.palladiosimulator.solver.models.PCMInstance;

import de.uka.ipd.sdq.dsexplore.gdof.GenomeToCandidateModelTransformation;
import de.uka.ipd.sdq.pcm.cost.CostRepository;
import de.uka.ipd.sdq.pcm.cost.impl.CostImpl;
import de.uka.ipd.sdq.pcm.cost.impl.CostRepositoryImpl;
import de.uka.ipd.sdq.pcm.designdecision.DegreeOfFreedomInstance;
import de.uka.ipd.sdq.pcm.designdecision.gdof.ChangeableElementDescription;
import de.uka.ipd.sdq.pcm.designdecision.gdof.DegreeOfFreedom;
import de.uka.ipd.sdq.pcm.designdecision.gdof.HelperOCLDefinition;
import de.uka.ipd.sdq.pcm.designdecision.gdof.util.gdofSwitch;
import de.uka.ipd.sdq.pcm.resourcerepository.ResourceDescription;
import de.uka.ipd.sdq.pcm.resourcerepository.ResourceDescriptionRepository;
import de.uka.ipd.sdq.pcm.resourcerepository.impl.ResourceDescriptionRepositoryImpl;

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
//    	org.palladiosimulator.pcm.system.System system = this.initialInstance.getSystem();
    	//first, set the decorators if there are any
    	EList<EObject> decos = dofi.getDecoratorModel();
    	for (EObject deco : decos) {
    		String name = deco.eClass().getName().toLowerCase()+'$';
    		GenomeToCandidateModelTransformation.getDecorator().put(name, deco);
    		
    	}
    	
    	
    	//FIXME cleanup
    	EClass rdrEClass = null;
    	EClass rdEclass = null;
//    	EClass crEclass = null;
//    	EReference costRef = null;
    	
    	for (EObject dec : decos) {
    		if (dec instanceof ResourceDescriptionRepositoryImpl) {
    			ResourceDescriptionRepository rdr = (ResourceDescriptionRepository)dec;
    			rdrEClass = rdr.eClass();
    			EList<ResourceDescription> resourceDes = rdr.getAvailableProcessingResources_ResourceRepository();
    			for (ResourceDescription rd : resourceDes) {
    				rdEclass = rd.eClass();
    			EList<ProcessingResourceSpecification> ars = rd.getProcessingResourceSpecification_ResourceDescription().getActiveResourceSpecifications_ResourceContainer();
    			for (ProcessingResourceSpecification sd : ars) {
    				System.out.println(sd.getProcessingRate_ProcessingResourceSpecification().toString());
    			}
    			}
    		}
//    		else if (dec instanceof CostRepositoryImpl) {
//    			CostRepository cr = (CostRepository) dec;
//    			EList<EStructuralFeature> featList = cr.eClass().getEAllStructuralFeatures();
//    			crEclass = cr.eClass();
//    			for (EStructuralFeature eo : featList) {
//    				if (eo.getName().equals("cost")) {
//    					costRef = (EReference) eo;
//    				}
//    			}
//    		}
    		
    	}
    	
    	//------- nice code starts here
    	DegreeOfFreedom dof = dofi.getDof();
    	for (ChangeableElementDescription ced : dof.getChangeableElementDescriptions()) {

    		//FIXME cleanup
//    		if (ced.getChangeable().getName().equals("cost")) {
//    			ced.setChangeable(costRef);
//    		}
    		
    		
	    		for (HelperOCLDefinition helpDef : ced.getValueRule().getHelperDefinition()) {

	    			EClass help = helpDef.getContextClass();
	    			if(help.getName().equals("ResourceDescriptionRepository")) {
	    				helpDef.setContextClass(rdrEClass);
	    			}else if (help.getName().equals("ResourceDescription")) {
	    				helpDef.setContextClass(rdEclass);
	    			}
	    			
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
		EPackage concontainer = (EPackage) container.eContainer();
		concontainer.getESubpackages();
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
	private void doResourceenvironmentSwitch(HelperOCLDefinition helpDef) {
		 logger.error(
                 "Please implement Swich for: "+helpDef.getContextClass().getName());
		ResourceEnvironment re = this.initialInstance.getResourceEnvironment();
		EList<EObject> contents = re.eContents();
		EList<EClass> superTypes = re.eClass().getEAllSuperTypes();
		switchClasses(helpDef, contents, superTypes);
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