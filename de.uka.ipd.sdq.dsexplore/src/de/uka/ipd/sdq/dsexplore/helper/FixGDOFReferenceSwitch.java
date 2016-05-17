package de.uka.ipd.sdq.dsexplore.helper;

import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.log4j.Logger;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.diffmerge.api.IComparison;
import org.eclipse.emf.diffmerge.api.Role;
import org.eclipse.emf.diffmerge.api.diff.IDifference;
import org.eclipse.emf.diffmerge.api.scopes.IEditableModelScope;
import org.eclipse.emf.diffmerge.diffdata.impl.EComparisonImpl;
import org.eclipse.emf.diffmerge.impl.scopes.FragmentedModelScope;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.ui.model.IComparableContribution;
import org.opt4j.start.Opt4J;
import org.palladiosimulator.pcm.allocation.Allocation;
import org.palladiosimulator.pcm.repository.Repository;
import org.palladiosimulator.pcm.resourceenvironment.ResourceEnvironment;
import org.palladiosimulator.pcm.resourcetype.ResourceRepository;
import org.palladiosimulator.pcm.seff.SeffFactory;
import org.palladiosimulator.pcm.seff.SeffPackage;
import org.palladiosimulator.pcm.usagemodel.UsageModel;
import org.palladiosimulator.solver.models.PCMInstance;

import de.uka.ipd.sdq.dsexplore.gdof.GenomeToCandidateModelTransformation;
import de.uka.ipd.sdq.dsexplore.opt4j.representation.DSEProblem;
import de.uka.ipd.sdq.dsexplore.opt4j.start.Opt4JStarter;
import de.uka.ipd.sdq.pcm.designdecision.DegreeOfFreedomInstance;
import de.uka.ipd.sdq.pcm.designdecision.gdof.ChangeableElementDescription;
import de.uka.ipd.sdq.pcm.designdecision.gdof.DegreeOfFreedom;
import de.uka.ipd.sdq.pcm.designdecision.gdof.HelperOCLDefinition;
import de.uka.ipd.sdq.pcm.designdecision.gdof.StaticContextRule;
import de.uka.ipd.sdq.pcm.designdecision.gdof.StaticSelectionRule;
import de.uka.ipd.sdq.pcm.designdecision.gdof.util.gdofSwitch;
import de.uka.ipd.sdq.pcm.resourcerepository.ResourceDescription;
import de.uka.ipd.sdq.pcm.resourcerepository.ResourceDescriptionRepository;
import de.uka.ipd.sdq.pcm.resourcerepository.impl.ResourceDescriptionRepositoryImpl;
import de.uka.ipd.sdq.stoex.Comparison;

/**
 * This class does a reference switch because the context references which are set in the helper definitions 
 * of the value and selection rules are references of the meta model and not of the loaded pcm instance.
 * 
 * 
 * @author Daniel Sachsenmaier
 *
 */
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
    
    /**
     * This method switches the reference from the second loaded instance to the references of the current instance.
     * 
     * @param dofi is the degree of freedom instance for which value rules, selection rules and
     * 		  helper definitions the references should be switched
     * @return the current degree of freedom instance
     */
    public EObject switchReferences(final DegreeOfFreedomInstance dofi) {
   
    	
    	Map<String, EObject> diffMerge = new HashMap<>();
    	//first, set the decorators if there are any
    	EList<EObject> decos = dofi.getDecoratorModel();
    	for (EObject deco : decos) {
    		String name = deco.eClass().getName().toLowerCase()+'$';
    		GenomeToCandidateModelTransformation.getDecorator().put(name, deco);
    		//FIXME test
    		if (diffMerge.isEmpty()) diffMerge.put("left", deco);
    		else diffMerge.put("right", deco);
    	}
    	
    	//Test EMF DIFF -->
    	// if diffmerge active do this   	
    	Resource left = (Resource) ((EObject)diffMerge.get("left")).eResource();
    	Resource right = (Resource) ((EObject)diffMerge.get("right")).eResource();

    	IEditableModelScope targetScope = new FragmentedModelScope(right, true); // For example
    	IEditableModelScope referenceScope = new FragmentedModelScope(left, true); // For example
    	
    	IComparison comparison = new EComparisonImpl(targetScope, referenceScope);
    	comparison.compute(null, null, null, null);
    	Collection<IDifference> differences = comparison.getRemainingDifferences();
    	
    	
    	
    	differences = comparison.merge(differences, Role.TARGET, true, null);
    	
    	// <--
    	
    	EClass rdrEClass = null;
    	EClass rdEclass = null;
    	for (EObject dec : decos) {
    		if (dec instanceof ResourceDescriptionRepositoryImpl) {
    			ResourceDescriptionRepository rdr = (ResourceDescriptionRepository)dec;
    			rdrEClass = rdr.eClass();
    			EList<ResourceDescription> resourceDes = rdr.getAvailableProcessingResources_ResourceRepository();
    			for (ResourceDescription rd : resourceDes) {
    				rdEclass = rd.eClass();
    			}
    		}
    	}
    	
    	DegreeOfFreedom dof = dofi.getDof();
    	
    	//iterate through the changeable element description to switch references  for all helper
    	for (ChangeableElementDescription ced : dof.getChangeableElementDescriptions()) {
    		
    		//change context class in helpers of the value rule
    		for (HelperOCLDefinition helpDef : ced.getValueRule().getHelperDefinition()) {
    			
    			EClass help = helpDef.getContextClass();
    			if(help.getName().equals("ResourceDescriptionRepository")) {
    				helpDef.setContextClass(rdrEClass);
    				continue;
    			}else if (help.getName().equals("ResourceDescription")) {
    				helpDef.setContextClass(rdEclass);
    				continue;
    			}
    			
    			helpDef.setContextClass(doContextClassSwitch(helpDef.getContextClass()));  			

    		}
    		//change context class in helpers of the selection rule
    		if (ced.getSelectionRule() != null) {
	    		for (HelperOCLDefinition helpDef : ced.getSelectionRule().getHelperDefinition()) {

	    			helpDef.setContextClass(doContextClassSwitch(helpDef.getContextClass()));

	    		}
	    		if (ced.getSelectionRule() instanceof StaticSelectionRule) {
	    			StaticSelectionRule ssr = (StaticSelectionRule)ced.getSelectionRule();
	    			ssr.setContextClass(doContextClassSwitch(ssr.getContextClass()));
	    		}
    		}
    	}
    	return dofi;
    }
    /**
     * Select the correct method to get all the features, types and values of the model
     * 
     * @param helpDef is the helper definition for which the context class should be switched
     * @return 
     */
	private EClass doContextClassSwitch(EClass ctxClass) {
		
		
		EPackage container = (EPackage) ctxClass.eContainer();
		EPackage concontainer = (EPackage) container.eContainer();
		concontainer.getESubpackages();
		System.out.println(container.getName());
		if (container.getName().equals("composition")) {
			return doCompositionSwich(ctxClass);
		} else if (container.getName().equals("entity")) {
			return doEntitySwitch(ctxClass);
		} else if (container.getName().equals("usagemodel")) {
			return doUsagemodelSwitch(ctxClass);
		} else if (container.getName().equals("repository")) {
			return doRepositorySwitch(ctxClass);
		} else if (container.getName().equals("resourcetype")) {
			return doResourcetypeSwitch(ctxClass);
		} else if (container.getName().equals("protocol")) {
			return doProtocolSwitch(ctxClass);
		} else if (container.getName().equals("parameter")) {
			return doParameterSwitch(ctxClass);
		} else if (container.getName().equals("reliability")) {
			return doReliabilitySwitch(ctxClass);
		} else if (container.getName().equals("seff")) {
			return doSeffSwitch(ctxClass);
		} else if (container.getName().equals("qosannotations")) {
			return doQosannotationsSwitch(ctxClass);
		} else if (container.getName().equals("system")) {
			return doSystemSwitch(ctxClass);
		} else if (container.getName().equals("resourceenvironment")) {
			return doResourceenvironmentSwitch(ctxClass);
		} else if (container.getName().equals("allocation")) {
			return doAllocationSwitch(ctxClass);
		} else if (container.getName().equals("subsystem")) {
			return doSubsystemSwitch(ctxClass);
		} else if (container.getName().equals("resourcerepository")) {
			
			logger.error(
	                 "Please set the decorator model for: "+ctxClass.getName());
		} else {
			logger.error(
	                 "Please implement Swich for: "+ctxClass.getName());
		}
		return ctxClass;
	}
	private EClass doSubsystemSwitch(EClass ctxClass) {
		 logger.error(
                 "Please implement Swich for: "+ctxClass.getName());
			List<Repository> repositories = this.initialInstance.getRepositories();
			EList<EObject> contents = new BasicEList<EObject>();
			EList<EClass> superTypes = new BasicEList<EClass>();
			for (Repository repository : repositories) {
				contents.addAll(repository.eContents());
			}
			for (EObject content : contents) {
				superTypes.addAll(content.eClass().getEAllSuperTypes());
			}
			return switchClasses(ctxClass, contents, superTypes);
		 
	}
	private EClass doResourceenvironmentSwitch(EClass ctxClass) {
		 logger.error(
                 "Please implement Swich for: "+ctxClass.getName());
		ResourceEnvironment re = this.initialInstance.getResourceEnvironment();
		EList<EObject> contents = re.eContents();
		EList<EClass> superTypes = re.eClass().getEAllSuperTypes();
		return switchClasses(ctxClass, contents, superTypes);
	}
	private EClass doSystemSwitch(EClass ctxClass) {
		EClass systemClass = this.initialInstance.getSystem().eClass();
		if (ctxClass.getName().equals(systemClass.getName())) {
			return systemClass;
		}
		return ctxClass;
	}
	private EClass doQosannotationsSwitch(EClass ctxClass) {
		// TODO Auto-generated method stub
		logger.error(
                "Please implement Swich for: "+ctxClass.getName());
		return ctxClass;
	}
	private EClass doReliabilitySwitch(EClass ctxClass) {
		// TODO Auto-generated method stub
		logger.error(
                "Please implement Swich for: "+ctxClass.getName());
		return ctxClass;
	}
	private EClass doParameterSwitch(EClass ctxClass) {
		// TODO Auto-generated method stub
		logger.error(
                "Please implement Swich for: "+ctxClass.getName());
		return ctxClass;
	}
	private EClass doProtocolSwitch(EClass ctxClass) {
		// TODO Auto-generated method stub
		logger.error(
                "Please implement Swich for: "+ctxClass.getName());
		return ctxClass;
	}
	private EClass doResourcetypeSwitch(EClass ctxClass) {
		// TODO Auto-generated method stub
		logger.error(
                "Please implement Swich for: "+ctxClass.getName());
		return ctxClass;
	}
	private EClass doUsagemodelSwitch(EClass ctxClass) {
		// TODO Auto-generated method stub
		
		UsageModel um = this.initialInstance.getUsageModel();
		ctxClass = um.eClass();
		logger.error(
                "Please implement Swich for: "+ctxClass.getName());
		return ctxClass;
	}
	private EClass doEntitySwitch(EClass ctxClass) {
		// TODO Auto-generated method stub
		logger.error(
                "Please implement Swich for: "+ctxClass.getName());
		return ctxClass;
	}
	private EClass doAllocationSwitch(EClass ctxClass) {
		Allocation allocation = this.initialInstance.getAllocation();
		EList<EObject> contents = allocation.eContents();
		EList<EClass> superTypes = allocation.eClass().getEAllSuperTypes();
		return switchClasses(ctxClass, contents, superTypes);
	}
	private EClass doSeffSwitch(EClass ctxClass) {
		SeffPackage seffPackage = SeffFactory.eINSTANCE.getSeffPackage();
		EList<?> contents = seffPackage.eContents();
		EList<EClass> superTypes = seffPackage.eClass().getEAllSuperTypes();
		return switchClasses(ctxClass, contents, superTypes);
	}
	private EClass doRepositorySwitch(EClass ctxClass) {
		List<Repository> repositories = this.initialInstance.getRepositories();
		EList<EObject> contents = new BasicEList<EObject>();
		EList<EClass> superTypes = new BasicEList<EClass>();
		for (Repository repository : repositories) {
			contents.addAll(repository.eContents());
		}
		for (EObject content : contents) {
			superTypes.addAll(content.eClass().getEAllSuperTypes());
		}
		return switchClasses(ctxClass, contents, superTypes);
	}
	/**
	 * Preparation for the switch of a context which is contained in the composition package
	 * @param ctxClass is the HelperOCLDefinition for which the context class will be switched
	 */
	private EClass doCompositionSwich(EClass ctxClass) {
		org.palladiosimulator.pcm.system.System system = this.initialInstance.getSystem();
		EList<EObject> contents = system.eContents();
		EList<EClass> superTypes = system.eClass().getEAllSuperTypes();
		return switchClasses(ctxClass, contents, superTypes);
	}
	/**
	 * Method to do the switch for the different contexts
	 * 
	 * @param helpDef is the HelperOCLDefinition for which the context class will be switched
	 * @param contents All contents from the specific model which matches the context of the HelperOCLDefinition
	 * @param superTypes All SuperTypes from the specific model which matches the context of the HelperOCLDefinition
	 */
	@SuppressWarnings("unchecked")
	private EClass switchClasses(EClass ctxClass, EList<?> contents, EList<?> superTypes) {
		//boolean found = false;
		
		for (Object content : contents) {
			
			if (content instanceof EClass) {
				EClass eClass = (EClass)content;
				if (ctxClass.getName().equals((eClass).getName())) {
					return eClass;
				}
			} else if (content instanceof EObject) {
				EObject eObj = (EObject)content;
				if (ctxClass.getName().equals((eObj).eClass().getName())) {
					return eObj.eClass();
					
				}
			}
			for (EClass superType : (EList<EClass>)superTypes) {
				if (ctxClass.getName().equals(superType.getName())) {
					return superType;			
				}
			}	
			
		}
		//FIXME maybe something better than null?
		return ctxClass;
	}

}