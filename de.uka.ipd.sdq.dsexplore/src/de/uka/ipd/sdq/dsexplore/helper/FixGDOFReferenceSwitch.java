package de.uka.ipd.sdq.dsexplore.helper;

import java.util.List;
import org.apache.log4j.Logger;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
//import org.eclipse.emf.diffmerge.api.IComparison;
//import org.eclipse.emf.diffmerge.api.Role;
//import org.eclipse.emf.diffmerge.api.diff.IDifference;
//import org.eclipse.emf.diffmerge.api.scopes.IEditableModelScope;
//import org.eclipse.emf.diffmerge.diffdata.impl.EComparisonImpl;
//import org.eclipse.emf.diffmerge.impl.scopes.FragmentedModelScope;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.palladiosimulator.pcm.allocation.Allocation;
import org.palladiosimulator.pcm.allocation.AllocationContext;
import org.palladiosimulator.pcm.allocation.impl.AllocationContextImpl;
import org.palladiosimulator.pcm.core.PCMRandomVariable;
import org.palladiosimulator.pcm.core.composition.AssemblyConnector;
import org.palladiosimulator.pcm.core.composition.AssemblyContext;
import org.palladiosimulator.pcm.core.composition.Connector;
import org.palladiosimulator.pcm.core.composition.impl.AssemblyConnectorImpl;
import org.palladiosimulator.pcm.core.composition.impl.AssemblyContextImpl;
import org.palladiosimulator.pcm.core.impl.PCMRandomVariableImpl;
import org.palladiosimulator.pcm.repository.BasicComponent;
import org.palladiosimulator.pcm.repository.CompositeComponent;
import org.palladiosimulator.pcm.repository.OperationProvidedRole;
import org.palladiosimulator.pcm.repository.OperationRequiredRole;
import org.palladiosimulator.pcm.repository.Repository;
import org.palladiosimulator.pcm.repository.impl.BasicComponentImpl;
import org.palladiosimulator.pcm.repository.impl.CompositeComponentImpl;
import org.palladiosimulator.pcm.repository.impl.OperationProvidedRoleImpl;
import org.palladiosimulator.pcm.repository.impl.OperationRequiredRoleImpl;
import org.palladiosimulator.pcm.resourceenvironment.ProcessingResourceSpecification;
import org.palladiosimulator.pcm.resourceenvironment.ResourceContainer;
import org.palladiosimulator.pcm.resourceenvironment.ResourceEnvironment;
import org.palladiosimulator.pcm.resourceenvironment.impl.ProcessingResourceSpecificationImpl;
import org.palladiosimulator.pcm.resourceenvironment.impl.ResourceContainerImpl;
import org.palladiosimulator.pcm.seff.ExternalCallAction;
import org.palladiosimulator.pcm.seff.InternalAction;
import org.palladiosimulator.pcm.seff.ResourceDemandingSEFF;
import org.palladiosimulator.pcm.seff.SeffFactory;
import org.palladiosimulator.pcm.seff.SeffPackage;
import org.palladiosimulator.pcm.seff.ServiceEffectSpecification;
import org.palladiosimulator.pcm.seff.SetVariableAction;
import org.palladiosimulator.pcm.seff.StartAction;
import org.palladiosimulator.pcm.seff.impl.ExternalCallActionImpl;
import org.palladiosimulator.pcm.seff.impl.InternalActionImpl;
import org.palladiosimulator.pcm.seff.impl.ResourceDemandingSEFFImpl;
import org.palladiosimulator.pcm.seff.impl.SetVariableActionImpl;
import org.palladiosimulator.pcm.seff.impl.StartActionImpl;
import org.palladiosimulator.pcm.seff.impl.StopActionImpl;
import org.palladiosimulator.pcm.usagemodel.UsageModel;
import org.palladiosimulator.solver.models.PCMInstance;

import de.uka.ipd.sdq.dsexplore.opt4j.start.Opt4JStarter;
import de.uka.ipd.sdq.identifier.Identifier;
import de.uka.ipd.sdq.pcm.designdecision.DegreeOfFreedomInstance;
import de.uka.ipd.sdq.pcm.designdecision.gdof.ChangeableElementDescription;
import de.uka.ipd.sdq.pcm.designdecision.gdof.DegreeOfFreedom;
import de.uka.ipd.sdq.pcm.designdecision.gdof.HelperOCLDefinition;
import de.uka.ipd.sdq.pcm.designdecision.gdof.StaticSelectionRule;
import de.uka.ipd.sdq.pcm.designdecision.gdof.util.gdofSwitch;
import de.uka.ipd.sdq.pcm.resourcerepository.ResourceDescription;
import de.uka.ipd.sdq.pcm.resourcerepository.ResourceDescriptionRepository;
import de.uka.ipd.sdq.pcm.resourcerepository.impl.ResourceDescriptionRepositoryImpl;

/**
 * 
 * This class does a reference switch, which is needed if for one model two
 * separate instances are loaded. This class addresses the problem which occurs
 * when using generic degrees of freedom. Degrees of freedom reference difference
 * element features and use them as context class. The problem is, these
 * references do not point  to the initial loaded PCM Instance but to a new
 * loaded model just to get the references. Using equals on these two elements
 * fails, even if they are the same, because they both reference another model.
 * To prevent this error this class here was created. This class switches the 
 * references in every degree of freedom to the references from the initial loaded
 * instance.
 * 
 * Besides the switch of the references, this class does also a switch of model
 * elements from the initial or another PCM Instance to the current (copied)
 * PCM Instance. 
 * 
 * @author Daniel Sachsenmaier
 *
 */
public class FixGDOFReferenceSwitch extends gdofSwitch<EObject> {

	protected static Logger logger = Logger.getLogger(FixGDOFReferenceSwitch.class.getName());
	
    private final PCMInstance pcmInstance;
    
    public FixGDOFReferenceSwitch(final PCMInstance initialInstance2) {
        this.pcmInstance = initialInstance2;
    }
    
    /**
     * This method switches the reference from the second loaded instance to the
     * references of the current instance.
     * 
     * @param dofi is the degree of freedom instance for which value rules, selection rules and
     * 		  helper definitions the references should be switched
     * @return the current degree of freedom instance
     */
    public EObject switchReferences(final DegreeOfFreedomInstance dofi) {

    	EList<EObject> decos = dofi.getDecoratorModel();
    	    	
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
    	
    	
    	EObject prim = dofi.getPrimaryChanged();
    	dofi.setPrimaryChanged(changeToLocal(prim,null));

		// iterate through all helperDefinitions of the valueRule of the primary
		// changeable
    	for (HelperOCLDefinition helpDef: dof.getPrimaryChangeable().getValueRule().getHelperDefinition()) {
    		helpDef.setContextClass(doContextClassSwitch(helpDef.getContextClass()));
    	}
    	
    	//iterate through the changeable element description to switch references  for all helper
    	for (ChangeableElementDescription ced : dof.getChangeableElementDescriptions()) {
    		
    		//change context class in helpers of the value rule
    		for (HelperOCLDefinition helpDef : ced.getValueRule().getHelperDefinition()) {
    			
    			EClass help = helpDef.getContextClass();
    			if(help == null) {
    				help = null;
    			}
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
	 * Because the different candidates are created with a local copy of the
	 * initial PCMInstance the elements which are used, changed or deleted
	 * during the decoding phase have to be changed to the copies.
	 * 
	 * This method retrieves the local copy for a given element or property.
	 * 
	 * @param changedElement
	 *            the element for which the local copy should be retrieved
	 * @param propertyInLoadedPCM
	 *            the property of the element to retrieve, can be null
	 * @return the local element
	 */
    public EObject changeToLocal(EObject changedElement, EStructuralFeature propertyInLoadedPCM) {
		//System.out.println(prim.toString());
		PCMInstance pcm = null;
    	if (Opt4JStarter.getProblem() == null) {
    		pcm = this.pcmInstance;
    	} else {
    		pcm = Opt4JStarter.getProblem().getCurrentInstance();
    	}
		List<Repository> repos = pcm.getRepositories();
		Repository repo = null;
		for (Repository r : repos) {
			if (r.eResource().getURI().toString().contains("pathmap")) continue;
			repo = r;
			break;
		}
    	
		if (changedElement instanceof AssemblyContextImpl) {
			final List<AssemblyContext> acs = pcm.getSystem().getAssemblyContexts__ComposedStructure();
			final AssemblyContext localPrim = (AssemblyContext) EMFHelper.retrieveEntityByID(acs,
					((AssemblyContext) changedElement).getId());
			if (localPrim != null) changedElement = localPrim;
		} 
		else if (changedElement instanceof AllocationContextImpl) {
			final List<AllocationContext> acs = pcm.getAllocation().getAllocationContexts_Allocation();
			final AllocationContext localPrim = (AllocationContext) EMFHelper.retrieveEntityByID(acs,
					((AllocationContext) changedElement).getId());
			
			if (localPrim != null) changedElement = localPrim;
		} 
		else if (changedElement instanceof AssemblyConnectorImpl) {
			changedElement = (AssemblyConnector)changedElement;
			String id = ((AssemblyConnector) changedElement).getId();
			EList<Connector> conns = pcm.getSystem().getConnectors__ComposedStructure();
			AssemblyConnector as = (AssemblyConnector)EMFHelper.retrieveEntityByID(conns, id);
			if (as != null) changedElement = as;
			
			return changedElement;
		}
		else if (changedElement instanceof ProcessingResourceSpecificationImpl) {
			if (((ProcessingResourceSpecification)changedElement).eContainer() == null) {
				return changedElement;
			}
			String id = ((ResourceContainer)((ProcessingResourceSpecification)changedElement).eContainer()).getId();
			final List<ResourceContainer> rcs = pcm.getResourceEnvironment()
					.getResourceContainer_ResourceEnvironment();
			final ResourceContainer localPrim = (ResourceContainer) EMFHelper
					.retrieveEntityByID(rcs, id);
			if (localPrim == null) return changedElement;
			final List<ProcessingResourceSpecification> prss = localPrim.getActiveResourceSpecifications_ResourceContainer();
			for (ProcessingResourceSpecification prs : prss) {
				if(prs.getId().equals(((ProcessingResourceSpecificationImpl) changedElement).getId())) {
					changedElement = prs;
					break;
				}
			}	
		}
		else if (changedElement instanceof BasicComponentImpl) {
			String choiceId = ((BasicComponent)changedElement).getId();
			BasicComponent copiedChoice = (BasicComponent)EMFHelper.retrieveEntityByID(repo.getComponents__Repository(), choiceId);
			if (copiedChoice != null) changedElement = copiedChoice;
			
		} 
		else if (changedElement instanceof PCMRandomVariableImpl) {
			if (!(((PCMRandomVariable)changedElement).eContainer() instanceof ProcessingResourceSpecificationImpl)) return changedElement;
			ProcessingResourceSpecification prsChoice = ((ProcessingResourceSpecification)((PCMRandomVariable)changedElement).eContainer());
			String choiceId = prsChoice.getId();
			String id = ((ResourceContainer)prsChoice.eContainer()).getId();
			final List<ResourceContainer> rcs = pcm.getResourceEnvironment()
					.getResourceContainer_ResourceEnvironment();
			final ResourceContainer rc = (ResourceContainer) EMFHelper
					.retrieveEntityByID(rcs, id);
			final List<ProcessingResourceSpecification> prss = rc.getActiveResourceSpecifications_ResourceContainer();
			for (ProcessingResourceSpecification prs : prss) {
				if (prs.getId().equals(choiceId)) {
					Object copiedChoice = prs.eGet(propertyInLoadedPCM);
					changedElement = (EObject) copiedChoice;
					break;
				}
			}
		} 
		else if (changedElement instanceof CompositeComponentImpl) {
			String choiceId = ((CompositeComponent)changedElement).getId();
			
			
			
			CompositeComponent copiedChoice = (CompositeComponent)EMFHelper.retrieveEntityByID(repo.getComponents__Repository(), choiceId);
			
			if (copiedChoice != null) changedElement = copiedChoice;
		} 
		else if (changedElement instanceof ResourceContainerImpl) {
			String id = ((ResourceContainer)changedElement).getId();
			final List<ResourceContainer> rcs = pcm.getResourceEnvironment()
					.getResourceContainer_ResourceEnvironment();
			final ResourceContainer copiedChoice = (ResourceContainer) EMFHelper
					.retrieveEntityByID(rcs, id);
			if (copiedChoice != null) changedElement = copiedChoice;
		}
		else if (changedElement instanceof OperationProvidedRoleImpl) {
			String parentId = ((OperationProvidedRole)changedElement).getProvidedInterface__OperationProvidedRole().getId();
			BasicComponent comp = (BasicComponent)EMFHelper.retrieveEntityByID(repo.getComponents__Repository(), parentId);
			//comp.getRequiredRoles_InterfaceRequiringEntity();
		}
		else if (changedElement instanceof ResourceDemandingSEFFImpl) {
			String parentId = ((ResourceDemandingSEFF)changedElement).getBasicComponent_ServiceEffectSpecification().getId();
			BasicComponent comp = (BasicComponent)EMFHelper.retrieveEntityByID(repo.getComponents__Repository(), parentId);
			if (comp == null) return null;
			EList<ServiceEffectSpecification> content = comp.getServiceEffectSpecifications__BasicComponent();
			for (ServiceEffectSpecification seff : content) {
				if (seff instanceof ResourceDemandingSEFFImpl) {
					if (((ResourceDemandingSEFF)seff).getId().equals(((ResourceDemandingSEFFImpl) changedElement).getId())) {
						changedElement = seff;
						break;
					}
				}
			}
		}
		else if (changedElement instanceof OperationRequiredRoleImpl) {

			String parentId = ((OperationRequiredRole) changedElement).getRequiredInterface__OperationRequiredRole().getId();
			BasicComponent comp = (BasicComponent) EMFHelper.retrieveEntityByID(repo.getComponents__Repository(),
					parentId);
			if (comp == null)
				return null;
		}

		else if (changedElement != null && changedElement.eContainer() instanceof ResourceDemandingSEFFImpl) {
			if (changedElement instanceof SetVariableActionImpl)
				changedElement = (SetVariableAction) changedElement;
			if (changedElement instanceof InternalActionImpl)
				changedElement = (InternalAction) changedElement;
			if (changedElement instanceof ExternalCallActionImpl)
				changedElement = (ExternalCallAction) changedElement;
			if (changedElement instanceof StartActionImpl)
				changedElement = (StartAction) changedElement;
			if (changedElement instanceof StopActionImpl)
				changedElement = (StopActionImpl) changedElement;

			ResourceDemandingSEFF rseff = (ResourceDemandingSEFF) changedElement.eContainer();
			String parentId = ((BasicComponent) rseff.getBasicComponent_ServiceEffectSpecification()).getId();
			BasicComponent comp = (BasicComponent) EMFHelper.retrieveEntityByID(repo.getComponents__Repository(),
					parentId);
			if (comp == null)
				return null;
			EList<ServiceEffectSpecification> content = comp.getServiceEffectSpecifications__BasicComponent();
			for (ServiceEffectSpecification seff : content) {
				if (seff instanceof ResourceDemandingSEFFImpl) {
					if (((ResourceDemandingSEFF) seff).getId().equals(((ResourceDemandingSEFFImpl) rseff).getId())) {
						EList<org.palladiosimulator.pcm.seff.AbstractAction> aa = ((ResourceDemandingSEFFImpl) seff)
								.getSteps_Behaviour();
						for (org.palladiosimulator.pcm.seff.AbstractAction action : aa) {
							if (action.getId().equals(((Identifier) changedElement).getId())) {

								return action;
							}
						}
					}
				}
			}
		}
		return changedElement;
	}
    
	/**
     * Select the correct method to get all the features, types and values of the 
     * model
     * 
     * @param helpDef is the helper definition for which the context class should be switched
     * @return the eClass from the current instance
     */
	private EClass doContextClassSwitch(EClass ctxClass) {
		
		
		EPackage container = (EPackage) ctxClass.eContainer();
		EPackage concontainer = (EPackage) container.eContainer();
		concontainer.getESubpackages();

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
			List<Repository> repositories = this.pcmInstance.getRepositories();
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
		ResourceEnvironment re = this.pcmInstance.getResourceEnvironment();
		EList<EObject> contents = re.eContents();
		EList<EClass> superTypes = re.eClass().getEAllSuperTypes();
		return switchClasses(ctxClass, contents, superTypes);
	}
	private EClass doSystemSwitch(EClass ctxClass) {
		EClass systemClass = this.pcmInstance.getSystem().eClass();
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
		
		UsageModel um = this.pcmInstance.getUsageModel();
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
		Allocation allocation = this.pcmInstance.getAllocation();
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
		List<Repository> repositories = this.pcmInstance.getRepositories();
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
	 * Preparation for the switch of a context which is contained in the
	 * composition package
	 * 
	 * @param ctxClass
	 *            is the context of the HelperOCLDefinition for which the
	 *            context class will be switched
	 */
	private EClass doCompositionSwich(EClass ctxClass) {
		org.palladiosimulator.pcm.system.System system = this.pcmInstance.getSystem();
		EList<EObject> contents = system.eContents();
		EList<EClass> superTypes = system.eClass().getEAllSuperTypes();
		return switchClasses(ctxClass, contents, superTypes);
	}

	/**
	 * Method to do the switch for the different contexts
	 * 
	 * @param helpDef
	 *            is the HelperOCLDefinition for which the context class will be
	 *            switched
	 * @param contents
	 *            All contents from the specific model which matches the context
	 *            of the HelperOCLDefinition
	 * @param superTypes
	 *            All SuperTypes from the specific model which matches the
	 *            context of the HelperOCLDefinition
	 */
	@SuppressWarnings("unchecked")
	private EClass switchClasses(EClass ctxClass, EList<?> contents, EList<?> superTypes) {
		// boolean found = false;

		for (Object content : contents) {

			if (content instanceof EClass) {
				EClass eClass = (EClass) content;
				if (ctxClass.getName().equals((eClass).getName())) {
					return eClass;
				}
			} else if (content instanceof EObject) {
				EObject eObj = (EObject) content;
				if (ctxClass.getName().equals((eObj).eClass().getName())) {
					return eObj.eClass();

				}
			}
		}
		for (EClass superType : (EList<EClass>) superTypes) {
			if (ctxClass.getName().equals(superType.getName())) {
				return superType;
			}
		}
		return ctxClass;
	}

}