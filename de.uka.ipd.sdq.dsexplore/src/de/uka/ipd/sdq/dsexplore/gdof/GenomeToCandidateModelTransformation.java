package de.uka.ipd.sdq.dsexplore.gdof;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.swing.AbstractAction;
import javax.xml.parsers.DocumentBuilderFactory;

import org.eclipse.debug.internal.ui.views.launch.DebugElementHelper;
import org.eclipse.emf.cdo.eresource.util.EresourceSwitch;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.ECollections;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.compare.Comparison;
import org.eclipse.emf.compare.Diff;
import org.eclipse.emf.compare.DifferenceKind;
import org.eclipse.emf.compare.Match;
import org.eclipse.emf.compare.MatchResource;
import org.eclipse.emf.compare.ReferenceChange;
import org.eclipse.emf.compare.impl.ComparisonImpl;
import org.eclipse.emf.compare.impl.ReferenceChangeImpl;
import org.eclipse.emf.compare.utils.EMFCompareCopier;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EEnumLiteral;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EParameter;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.impl.EStringToStringMapEntryImpl;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.EcoreAdapterFactory;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.EcoreUtil.Copier;
import org.eclipse.emf.ecore.util.FeatureMapUtil.FeatureEList.Basic;
//import org.eclipse.emf.query.conditions.numbers.NumberCondition;
//import org.eclipse.emf.query.conditions.numbers.NumberCondition.DoubleValue;
import org.eclipse.ocl.EvaluationEnvironment;
import org.eclipse.ocl.ParserException;
import org.eclipse.ocl.SemanticException;
import org.eclipse.ocl.ecore.CallOperationAction;
import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.EcoreEnvironmentFactory;
import org.eclipse.ocl.ecore.EcoreOCLStandardLibrary;
import org.eclipse.ocl.ecore.OCL;
import org.eclipse.ocl.ecore.OCL.Helper;
import org.eclipse.ocl.ecore.OCL.Query;
import org.eclipse.ocl.ecore.OCLExpression;
import org.eclipse.ocl.ecore.OperationCallExp;
import org.eclipse.ocl.ecore.SendSignalAction;
import org.eclipse.ocl.ecore.VariableExp;
import org.eclipse.ocl.expressions.ExpressionsFactory;
import org.eclipse.ocl.expressions.Variable;
import org.eclipse.ocl.types.OCLStandardLibrary;
import org.omg.CORBA.Environment;
import org.palladiosimulator.pcm.PcmFactory;
import org.palladiosimulator.pcm.allocation.Allocation;
import org.palladiosimulator.pcm.allocation.AllocationContext;
import org.palladiosimulator.pcm.allocation.AllocationFactory;
import org.palladiosimulator.pcm.allocation.impl.AllocationContextImpl;
import org.palladiosimulator.pcm.allocation.impl.AllocationImpl;
import org.palladiosimulator.pcm.core.CoreFactory;
import org.palladiosimulator.pcm.core.PCMRandomVariable;
import org.palladiosimulator.pcm.core.composition.AssemblyConnector;
import org.palladiosimulator.pcm.core.composition.AssemblyContext;
import org.palladiosimulator.pcm.core.composition.CompositionFactory;
import org.palladiosimulator.pcm.core.composition.Connector;
import org.palladiosimulator.pcm.core.composition.impl.AssemblyConnectorImpl;
import org.palladiosimulator.pcm.core.composition.impl.AssemblyContextImpl;
import org.palladiosimulator.pcm.core.composition.impl.ConnectorImpl;
import org.palladiosimulator.pcm.core.impl.PCMRandomVariableImpl;
import org.palladiosimulator.pcm.parameter.ParameterFactory;
import org.palladiosimulator.pcm.parameter.VariableCharacterisation;
import org.palladiosimulator.pcm.parameter.VariableCharacterisationType;
import org.palladiosimulator.pcm.parameter.VariableUsage;
import org.palladiosimulator.pcm.parameter.impl.VariableUsageImpl;
import org.palladiosimulator.pcm.repository.BasicComponent;
import org.palladiosimulator.pcm.repository.CompositeComponent;
import org.palladiosimulator.pcm.repository.OperationProvidedRole;
import org.palladiosimulator.pcm.repository.OperationRequiredRole;
import org.palladiosimulator.pcm.repository.PassiveResource;
import org.palladiosimulator.pcm.repository.Repository;
import org.palladiosimulator.pcm.repository.impl.BasicComponentImpl;
import org.palladiosimulator.pcm.repository.impl.CompositeComponentImpl;
import org.palladiosimulator.pcm.repository.impl.OperationProvidedRoleImpl;
import org.palladiosimulator.pcm.repository.impl.OperationRequiredRoleImpl;
import org.palladiosimulator.pcm.repository.impl.PassiveResourceImpl;
import org.palladiosimulator.pcm.repository.impl.RepositoryImpl;
import org.palladiosimulator.pcm.resourceenvironment.ProcessingResourceSpecification;
import org.palladiosimulator.pcm.resourceenvironment.ResourceContainer;
import org.palladiosimulator.pcm.resourceenvironment.ResourceEnvironment;
import org.palladiosimulator.pcm.resourceenvironment.impl.ProcessingResourceSpecificationImpl;
import org.palladiosimulator.pcm.resourceenvironment.impl.ResourceContainerImpl;
import org.palladiosimulator.pcm.resourceenvironment.impl.ResourceEnvironmentImpl;
import org.palladiosimulator.pcm.seff.ExternalCallAction;
import org.palladiosimulator.pcm.seff.InternalAction;
import org.palladiosimulator.pcm.seff.ResourceDemandingInternalBehaviour;
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
import org.palladiosimulator.pcm.system.SystemFactory;
import org.palladiosimulator.pcm.system.impl.SystemImpl;
import org.palladiosimulator.pcm.system.util.SystemAdapterFactory;
import org.palladiosimulator.solver.models.PCMInstance;

import de.uka.ipd.sdq.dsexplore.helper.EMFHelper;
import de.uka.ipd.sdq.dsexplore.helper.FixGDOFReferenceSwitch;
import de.uka.ipd.sdq.dsexplore.opt4j.genotype.DesignDecisionGenotype;
import de.uka.ipd.sdq.dsexplore.opt4j.representation.DSECreator;
import de.uka.ipd.sdq.dsexplore.opt4j.representation.DSEProblem;
import de.uka.ipd.sdq.dsexplore.opt4j.start.Opt4JStarter;
import de.uka.ipd.sdq.featuremodel.DoubleAttribute;
import de.uka.ipd.sdq.identifier.Identifier;
import de.uka.ipd.sdq.pcm.cost.ComponentCost;
import de.uka.ipd.sdq.pcm.cost.CostRepository;
import de.uka.ipd.sdq.pcm.cost.FixedProcessingResourceCost;
import de.uka.ipd.sdq.pcm.cost.costFactory;
import de.uka.ipd.sdq.pcm.cost.impl.ComponentCostImpl;
import de.uka.ipd.sdq.pcm.cost.impl.ComponentCostPerInstanceImpl;
import de.uka.ipd.sdq.pcm.cost.impl.CostRepositoryImpl;
import de.uka.ipd.sdq.pcm.cost.impl.FixedLinkingResourceCostImpl;
import de.uka.ipd.sdq.pcm.cost.impl.FixedProcessingResourceCostImpl;
import de.uka.ipd.sdq.pcm.cost.impl.VariableLinkingResourceCostImpl;
import de.uka.ipd.sdq.pcm.cost.impl.VariableProcessingResourceCostImpl;
import de.uka.ipd.sdq.pcm.designdecision.Candidate;
import de.uka.ipd.sdq.pcm.designdecision.Choice;
import de.uka.ipd.sdq.pcm.designdecision.DecisionSpace;
import de.uka.ipd.sdq.pcm.designdecision.DegreeOfFreedomInstance;
import de.uka.ipd.sdq.pcm.designdecision.diffrepository.DiffModel;
import de.uka.ipd.sdq.pcm.designdecision.diffrepository.impl.DiffModelImpl;
import de.uka.ipd.sdq.pcm.designdecision.gdof.ChangeableElementDescription;
import de.uka.ipd.sdq.pcm.designdecision.gdof.DecoratorModelDescription;
import de.uka.ipd.sdq.pcm.designdecision.gdof.DegreeOfFreedom;
import de.uka.ipd.sdq.pcm.designdecision.gdof.HelperOCLDefinition;
import de.uka.ipd.sdq.pcm.designdecision.gdof.InstanceSelectionRule;
import de.uka.ipd.sdq.pcm.designdecision.gdof.OCLRule;
import de.uka.ipd.sdq.pcm.designdecision.gdof.SelectionRule;
import de.uka.ipd.sdq.pcm.designdecision.gdof.StaticSelectionRule;
import de.uka.ipd.sdq.pcm.designdecision.gdof.ValueRule;
import de.uka.ipd.sdq.pcm.resourcerepository.ResourceDescriptionRepository;
import de.uka.ipd.sdq.stoex.AbstractNamedReference;

/**
 * see also http://www.eclipse.org/articles/article.php?file=Article-EMF-Codegen-with-OCL/index.html
 * 
 * Cite from there: 
 * This query accesses the derived isManager property and calls the reportsTo(Employee) operation, 
 * both of which we implemented using OCL. It is worth noting here that OCL encourages the 
 * definition of additional properties and operations externally to the model, as conveniences 
 * for the formulation of constraints. The OCL implementation supports these "def:" expressions 
 * via the OCL.parse() and OCLHelper.define() APIs.
 * 
 * @author martens
 *
 */
public class GenomeToCandidateModelTransformation {
	
	private static final org.eclipse.ocl.ecore.OCL OCL_ENV = org.eclipse.ocl.ecore.OCL.newInstance();
	
	// we need this to store the old and new values as variables to use it in the ocl queries
	public static Map<String, Object> chosenValues;
	
	/**
	 *  in this map the decorators which were selected in the dofi are stored to use them in the ocl queries.
	 *  Name is always the model name without spaces and small with an "$" at the end. For example "UsageModel"
	 *  would be "usagemodel$"
	 */
	private static Map<String, Object> decorator;
	
	/**
	 * With this method you can get a map of set decorators.
	 * @return a map of decorators with String as key and Object as value.
	 */
	public static Map<String, Object> getDecorator() {
		if (decorator == null) {
			decorator = new HashMap<String, Object>();
		}
		return decorator;
	}
	
	/**
	 * Set a new decorator to use it as a variable in the ocl queries.
	 * @param decorator is a map of String and Object tuples. The string is the variable name
	 * 	      for the decorator. The name is always the model name but with all characters small and no spaces.
	 *        and with "$" at the end.
	 * 	      For example "UsageModel" would be "usagemodel$"
	 *        The Object is the model which was selected in the dofi.
	 */
	public static void setDecorator(Map<String, Object> decorator) {
		GenomeToCandidateModelTransformation.decorator = decorator;
	}

	/**
	 * 
	 * 
	 * @return 
	 */
	public static Map<String, Object> getChosenValues() {
		//init the variables to set the global ocl environment variables
		if (chosenValues == null) {
			chosenValues = new HashMap<String, Object>();
			
		}
		return chosenValues;
	}
	
	/**
	 * 
	 * @param chosenValues
	 */
	public static void setChosenValues(Map<String, Object> chosenValues) {
		GenomeToCandidateModelTransformation.chosenValues = chosenValues;
	}



	/**
	 * The generic transformation method
	 * @param rootElements The initial architecture model or the architecture model of any other candidate. 
	 * @param candidate The decision vector to apply. 
	 * @return The choices that have not been transformed, e.g. because no GDoF has been specified from them
	 */
	public List<Choice> transform(List<EObject> rootElements, Candidate candidate){
		
		List<Choice> choices = candidate.getChoices();
		List<Choice> notTransformedChoices = new ArrayList<Choice>(choices.size());
		
		for (Choice choice : choices) {

			  boolean transSuccessful = transformChoice(rootElements, choice);
			  if (!transSuccessful){
				  notTransformedChoices.add(choice);
			  }
		}
		return notTransformedChoices;
		
	}
	
	public EObject changeToLocal(EObject prim, EStructuralFeature propertyInLoadedPCM) {
		//System.out.println(prim.toString());
		
		PCMInstance pcm = Opt4JStarter.getProblem().getCurrentInstance();
		List<Repository> repos = pcm.getRepositories();
		Repository repo = null;
		for (Repository r : repos) {
			if (r.eResource().getURI().toString().contains("pathmap")) continue;
			repo = r;
			break;
		}
		FixGDOFReferenceSwitch referenceSwitch = new FixGDOFReferenceSwitch(Opt4JStarter.getProblem().getCurrentInstance());

    	
		if (prim instanceof AssemblyContextImpl) {
			final List<AssemblyContext> acs = pcm.getSystem().getAssemblyContexts__ComposedStructure();
			final AssemblyContext localPrim = (AssemblyContext) EMFHelper.retrieveEntityByID(acs,
					((AssemblyContext) prim).getId());
			if (localPrim != null) prim = localPrim;
		} 
		else if (prim instanceof AllocationContextImpl) {
			final List<AllocationContext> acs = pcm.getAllocation().getAllocationContexts_Allocation();
			final AllocationContext localPrim = (AllocationContext) EMFHelper.retrieveEntityByID(acs,
					((AllocationContext) prim).getId());
			
			if (localPrim != null) prim = localPrim;
		} 
		else if (prim instanceof AssemblyConnectorImpl) {
			prim = (AssemblyConnector)prim;
			String id = ((AssemblyConnector) prim).getId();
			EList<Connector> conns = pcm.getSystem().getConnectors__ComposedStructure();
			AssemblyConnector as = (AssemblyConnector)EMFHelper.retrieveEntityByID(conns, id);
			if (as != null) prim = as;
			
//			AssemblyContext requ = ((AssemblyConnector)prim).getRequiringAssemblyContext_AssemblyConnector();
//			AssemblyContext prov = ((AssemblyConnector)prim).getProvidingAssemblyContext_AssemblyConnector();
//			List<AssemblyContext> acs = pcm.getSystem().getAssemblyContexts__ComposedStructure();
//			AssemblyContext localRequ = (AssemblyContext)EMFHelper.retrieveEntityByID(acs, requ.getId());
//			AssemblyContext localProv = (AssemblyContext)EMFHelper.retrieveEntityByID(acs, prov.getId());
//			if (localRequ != null) ((AssemblyConnector)prim).setRequiringAssemblyContext_AssemblyConnector(localRequ);
//			if (localProv != null) ((AssemblyConnector)prim).setRequiringAssemblyContext_AssemblyConnector(localProv);
			return prim;
		}
		else if (prim instanceof ProcessingResourceSpecificationImpl) {
			String id = ((ResourceContainer)((ProcessingResourceSpecification)prim).eContainer()).getId();
			final List<ResourceContainer> rcs = pcm.getResourceEnvironment()
					.getResourceContainer_ResourceEnvironment();
			final ResourceContainer localPrim = (ResourceContainer) EMFHelper
					.retrieveEntityByID(rcs, id);
			
			final List<ProcessingResourceSpecification> prss = localPrim.getActiveResourceSpecifications_ResourceContainer();
			for (ProcessingResourceSpecification prs : prss) {
				if(prs.getId().equals(((ProcessingResourceSpecificationImpl) prim).getId())) {
					prim = prs;
					break;
				}
			}	
		}
		else if (prim instanceof BasicComponentImpl) {
			String choiceId = ((BasicComponent)prim).getId();
			BasicComponent copiedChoice = (BasicComponent)EMFHelper.retrieveEntityByID(repo.getComponents__Repository(), choiceId);
			if (copiedChoice != null) prim = copiedChoice;
			
		} 
		else if (prim instanceof PCMRandomVariableImpl) {
			if (!(((PCMRandomVariable)prim).eContainer() instanceof ProcessingResourceSpecificationImpl)) return prim;
			ProcessingResourceSpecification prsChoice = ((ProcessingResourceSpecification)((PCMRandomVariable)prim).eContainer());
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
					prim = (EObject) copiedChoice;
					break;
				}
			}
		} 
		else if (prim instanceof CompositeComponentImpl) {
			String choiceId = ((CompositeComponent)prim).getId();
			
			
			
			CompositeComponent copiedChoice = (CompositeComponent)EMFHelper.retrieveEntityByID(repo.getComponents__Repository(), choiceId);
			
			if (copiedChoice != null) prim = copiedChoice;
		} 
		else if (prim instanceof ResourceContainerImpl) {
			String id = ((ResourceContainer)prim).getId();
			final List<ResourceContainer> rcs = pcm.getResourceEnvironment()
					.getResourceContainer_ResourceEnvironment();
			final ResourceContainer copiedChoice = (ResourceContainer) EMFHelper
					.retrieveEntityByID(rcs, id);
			if (copiedChoice != null) prim = copiedChoice;
		}
		else if (prim instanceof OperationProvidedRoleImpl) {
			String parentId = ((OperationProvidedRole)prim).getProvidedInterface__OperationProvidedRole().getId();
			BasicComponent comp = (BasicComponent)EMFHelper.retrieveEntityByID(repo.getComponents__Repository(), parentId);
			//comp.getRequiredRoles_InterfaceRequiringEntity();
		}
		else if (prim instanceof ResourceDemandingSEFFImpl) {
			String parentId = ((ResourceDemandingSEFF)prim).getBasicComponent_ServiceEffectSpecification().getId();
			BasicComponent comp = (BasicComponent)EMFHelper.retrieveEntityByID(repo.getComponents__Repository(), parentId);
			if (comp == null) return null;
			EList<ServiceEffectSpecification> content = comp.getServiceEffectSpecifications__BasicComponent();
			for (ServiceEffectSpecification seff : content) {
				if (seff instanceof ResourceDemandingSEFFImpl) {
					if (((ResourceDemandingSEFF)seff).getId().equals(((ResourceDemandingSEFFImpl) prim).getId())) {
						prim = seff;
						break;
					}
				}
			}
		}
		else if (prim instanceof OperationRequiredRoleImpl) {

			String parentId = ((OperationRequiredRole)prim).getRequiredInterface__OperationRequiredRole().getId();
			BasicComponent comp = (BasicComponent)EMFHelper.retrieveEntityByID(repo.getComponents__Repository(), parentId);
			if (comp == null) return null;
			//comp.getRequiredRoles_InterfaceRequiringEntity();
		}
//		else if (prim instanceof InternalActionImpl) {
//			ResourceDemandingSEFF rseff = (ResourceDemandingSEFF)((InternalAction)prim).eContainer();
//			String parentId = ((BasicComponent)rseff.getBasicComponent_ServiceEffectSpecification()).getId();
//			BasicComponent comp = (BasicComponent)EMFHelper.retrieveEntityByID(repo.getComponents__Repository(), parentId);
//			if (comp == null) return null;
//			EList<ServiceEffectSpecification> content = comp.getServiceEffectSpecifications__BasicComponent();
//			for (ServiceEffectSpecification seff : content) {
//				if (seff instanceof ResourceDemandingSEFFImpl) {
//					if (((ResourceDemandingSEFF)seff).getId().equals(((ResourceDemandingSEFFImpl) rseff).getId())) {
//						EList<org.palladiosimulator.pcm.seff.AbstractAction> aa = ((ResourceDemandingSEFFImpl) seff).getSteps_Behaviour();
//						for(org.palladiosimulator.pcm.seff.AbstractAction action : aa) {
//							if (action.getId().equals(((InternalAction) prim).getId())) {
//								
//								return action;
//							}
//						}
//					}
//				}
//			}
//		}
		else if (prim.eContainer() instanceof ResourceDemandingSEFFImpl) {
			if (prim instanceof SetVariableActionImpl) prim = (SetVariableAction)prim;
			if (prim instanceof InternalActionImpl) prim = (InternalAction)prim;
			if (prim instanceof ExternalCallActionImpl) prim = (ExternalCallAction)prim;
			if (prim instanceof StartActionImpl) prim = (StartAction)prim;
			if (prim instanceof StopActionImpl) prim = (StopActionImpl)prim;
			
			
			ResourceDemandingSEFF rseff = (ResourceDemandingSEFF)prim.eContainer();
			String parentId = ((BasicComponent)rseff.getBasicComponent_ServiceEffectSpecification()).getId();
			BasicComponent comp = (BasicComponent)EMFHelper.retrieveEntityByID(repo.getComponents__Repository(), parentId);
			if (comp == null) return null;
			EList<ServiceEffectSpecification> content = comp.getServiceEffectSpecifications__BasicComponent();
			for (ServiceEffectSpecification seff : content) {
				if (seff instanceof ResourceDemandingSEFFImpl) {
					if (((ResourceDemandingSEFF)seff).getId().equals(((ResourceDemandingSEFFImpl) rseff).getId())) {
						EList<org.palladiosimulator.pcm.seff.AbstractAction> aa = ((ResourceDemandingSEFFImpl) seff).getSteps_Behaviour();
						for(org.palladiosimulator.pcm.seff.AbstractAction action : aa) {
							if (action.getId().equals(((Identifier) prim).getId())) {
								
								return action;
							}
						}
					}
				}
			}
		}
		return prim;
	}
	
	public boolean transformChoice(List<EObject> rootElements, Choice choice) {
		// is choice active?
		if (choice.isActive()){

			DegreeOfFreedomInstance dofi = choice.getDegreeOfFreedomInstance();
			FixGDOFReferenceSwitch referenceSwitch = new FixGDOFReferenceSwitch(Opt4JStarter.getProblem().getCurrentInstance());
//			referenceSwitch.switchReferences(dofi);
			DegreeOfFreedom gdof = dofi.getDof();
			
			if (gdof != null) {

				//merge if value is a DiffModel
				if (choice.getValue() instanceof DiffModelImpl) {
					for (EObject comp : ((DiffModel)choice.getValue()).getDiffModel()){
						mergeModels((Comparison)comp);
						return true;
					}
				}
				// Store for each CED which instances have been selected
				Map<ChangeableElementDescription, Collection<EObject>> selectedModelElements = new HashMap<ChangeableElementDescription, Collection<EObject>>();

				// set primary element
//				EObject modelElement = changeToLocal(dofi.getPrimaryChanged());
				EObject modelElement = dofi.getPrimaryChanged();
				modelElement = changeToLocal(dofi.getPrimaryChanged(), null);
				
				//FIXME test to change the primary changed to the one from the copied instance
				PCMInstance pcm = Opt4JStarter.getProblem().getCurrentInstance();
//				if (modelElement instanceof AssemblyContextImpl) {
//					
//					String id = ((AssemblyContext)modelElement).getId();
//					final List<AssemblyContext> acs = pcm.getSystem().getAssemblyContexts__ComposedStructure();
//			        final AssemblyContext localModelElement = (AssemblyContext)EMFHelper.retrieveEntityByID(acs,id);
//			        modelElement = localModelElement;
//				} else if (modelElement instanceof ConnectorImpl) {
//					String id = ((Connector)modelElement).getId();
//					EList<Connector> conns = pcm.getSystem().getConnectors__ComposedStructure();
//					Connector localConn = (Connector)EMFHelper.retrieveEntityByID(conns,id);
//					modelElement = localConn;
//				}

				
				
				//determine property to change using GDoF
				EStructuralFeature property = gdof.getPrimaryChangeable().getChangeable();

				//FIXME testing get old Value
				EStructuralFeature propertyInLoadedPCM = modelElement.eClass().getEStructuralFeature(property.getName());
				Object oldChoice = modelElement.eGet(propertyInLoadedPCM);
				
				if (choice.getValue() instanceof EObject) {
					choice.setValue(changeToLocal((EObject) choice.getValue(), propertyInLoadedPCM));
				}
				
				
				// FIXME just a quick fix
				// Can a choice be a list? if yes then change this.
				if (oldChoice instanceof EList) {
					for (Object o : (EList<?>)oldChoice) {
						getChosenValues().put("oldValue$", o);
						break;
					}
				} else {
					getChosenValues().put("oldValue$", oldChoice);
				}
				getChosenValues().put("changeable$", modelElement);
				
				Object value = choice.getValue();
				//FIXME turnn current value to "oldValue" before!
				//Object oldValue = chosenValues.get("choiceValue$");
				
				//FIXME DEBUG -->
//				Object oc = chosenValues.get("oldValue$");
//				if(oc instanceof ProcessingResourceSpecificationImpl) {
//					ProcessingResourceSpecification prs = (ProcessingResourceSpecification)oc;
//					System.out.println("oldChoice: "+prs.getId());
//					
//					CostRepository costrepo = (CostRepository) decorator.get("costrepository$");
//					EList<?> cost = costrepo.getCost();
//					for (Object c : cost) {
//						if(c instanceof FixedProcessingResourceCostImpl) {
//							FixedProcessingResourceCost fprc2 = (FixedProcessingResourceCost)c;
//							System.out.println("CostRepo: "+fprc2.getProcessingresourcespecification().getId());
//						}
//					}
//				}
//				
				//<--
				
				
				//FIXME testing get choice Value
				chosenValues.put("choiceValue$", value);
				
				
				if (value instanceof VariableUsageImpl || value instanceof ProcessingResourceSpecificationImpl) {
					//VariableUsage vu = (VariableUsage)value;
					EList<Object> list = new BasicEList<Object>();
					list.add(value);
					setProperty(modelElement, property, list);
				} else {
				setProperty(modelElement, property, choice.getValue());
				}
				List<EObject> modelElementList = new ArrayList<EObject>(1);
				
				//FIXME model switch to copy
				//modelElement = dofi.getPrimaryChanged();
				
				modelElementList.add(modelElement);
				selectedModelElements.put(gdof.getPrimaryChangeable(),modelElementList);

				EList<ChangeableElementDescription> ceds = gdof.getChangeableElementDescriptions();
				for (ChangeableElementDescription ced : ceds){
					if (ced == gdof.getPrimaryChangeable())
						continue;

					//FIXME referencen test
//					if(ced.getSelectionRule() != null){
//					for(HelperOCLDefinition h : ced.getSelectionRule().getHelperDefinition()) {
//						System.out.println(h.getContextClass());
//					}
//					}
					
					
					Collection<EObject> changeableElements = selectionRule(ced, rootElements, selectedModelElements);
					Collection<EObject> localChangeableElements = new HashSet<>();
//					for (EObject obj : changeableElements) {
//						if (obj instanceof ConnectorImpl) {
//							String id = ((Connector)obj).getId();
//							EList<Connector> conns = pcm.getSystem().getConnectors__ComposedStructure();
//							Connector localConn = (Connector)EMFHelper.retrieveEntityByID(conns,id);
//							localChangeableElements.add(localConn);
//							
//						}
//					}
					selectedModelElements.put(ced, changeableElements);
					
					
					EStructuralFeature changeableProperty = ced.getChangeable();

					for (EObject changeableElement : changeableElements) {

						//FIXME
//						if(changeableElement instanceof ConnectorImpl) {
//							String id = ((AssemblyConnector)changeableElement).getId();
//							EList<Connector> conns = Opt4JStarter.getProblem().getCurrentInstance().getSystem().getConnectors__ComposedStructure();
//							AssemblyConnector localCon = (AssemblyConnector)EMFHelper.retrieveEntityByID(conns, id);
//							System.out.println(localCon.eClass());
//							changeableElement = localCon;
//						}
						
						Object newValue = valueRule(ced, changeableElement, rootElements);
						//FIXME 
						//System.out.println(ced.toString()+" -||- "+newValue.toString());
						
						//FIXME create loop to set properties if @newValue is a set
						//Set<Object> set = new HashSet<Object>();
						if (newValue instanceof HashSet<?>) {
							Set<?> s = (HashSet<?>) newValue;
							for (Object val: s) {
								// FIXME maybe this has side effects, it checks it the HashSet is a CostRepository
								if (val instanceof FixedProcessingResourceCostImpl ||
										val instanceof VariableProcessingResourceCostImpl ||
										val instanceof ComponentCostImpl ||
										val instanceof FixedLinkingResourceCostImpl ||
										val instanceof VariableLinkingResourceCostImpl ||
										val instanceof ComponentCostPerInstanceImpl) {
									
									setProperty(changeableElement, changeableProperty, newValue);
									break;
								}
								setProperty(changeableElement, changeableProperty, val);
							}
						} else {
							setProperty(changeableElement, changeableProperty, newValue);
						}
						
						

					}

				}
				return true;
			} else {
				return false;
			}
		} else {
			// not doing anything for an inactive choice is what is expected, so done for this one. 
			return true;
		}
	}
	
	public static void setProperty(EObject changeableElement, EStructuralFeature property,
			Object value) {
		EStructuralFeature propertyInLoadedPCM = changeableElement.eClass().getEStructuralFeature(property.getName());
		//FIXME if copy then create a method for this, or maybe there is one?
		String keyForChanged = null;
		if (decorator != null && decorator.containsValue(changeableElement)) {
			for (String key : decorator.keySet()) {
				if (decorator.get(key).equals(changeableElement)) {
					keyForChanged = key;
					break;
				}
			}
		}
		if (value instanceof  PCMRandomVariableImpl) {
			PCMRandomVariable varCopy = CoreFactory.eINSTANCE.createPCMRandomVariable();
			String spec = ((PCMRandomVariableImpl) value).getSpecification();
			varCopy.setSpecification(spec);
			changeableElement.eSet(propertyInLoadedPCM, varCopy);
		} else if (value instanceof Collection<?>) {
			EcoreUtil.Copier copier = new EcoreUtil.Copier();
			Collection<Object> col = new ArrayList<Object>();
			col = (Collection<Object>)value;
			Collection<Object> copy = copier.copyAll(col);
			copier.copyReferences();
			changeableElement.eSet(propertyInLoadedPCM, copy);
		} else if (value instanceof FixedProcessingResourceCostImpl) {
			FixedProcessingResourceCost fpr = costFactory.eINSTANCE.createFixedProcessingResourceCost();
			EcoreUtil.Copier copier = new EcoreUtil.Copier();
			fpr = (FixedProcessingResourceCost) copier.copy((EObject) value);
			Collection<Object> col = new ArrayList<Object>();
			col.add(fpr);
			changeableElement.eSet(propertyInLoadedPCM, col);
		} else if (property.getName().equals("specification") && (value instanceof Integer || value instanceof Double)) {
			String newVal = value.toString();
			changeableElement.eSet(propertyInLoadedPCM, newVal);
		} else if (value instanceof AllocationContextImpl) {
			DSEProblem problem = Opt4JStarter.getProblem();
			Allocation alloOrigin = problem.getCurrentInstance().getAllocation();
			org.palladiosimulator.pcm.system.System sys = problem.getCurrentInstance().getSystem();
			Allocation alloCopy = AllocationFactory.eINSTANCE.createAllocation();
			AllocationContext ac = AllocationFactory.eINSTANCE.createAllocationContext();
			EcoreUtil.Copier copierAC = new EcoreUtil.Copier();
			ac = (AllocationContext)copierAC.copy((AllocationContext)value);
			copierAC.copyReferences();
			EcoreUtil.Copier copier = new EcoreUtil.Copier();
			alloCopy = (Allocation) copier.copy(alloOrigin);
			copier.copyReferences();
			EList<AssemblyContext> assCons = new BasicEList<AssemblyContext>();
			EList<AllocationContext> aclist = alloOrigin.getAllocationContexts_Allocation();
			for (AllocationContext a : aclist) {
				assCons.add(a.getAssemblyContext_AllocationContext());
			}
			
			if (!alloOrigin.getAllocationContexts_Allocation().contains(value)
					&& !assCons.contains(((AllocationContext)value).getAssemblyContext_AllocationContext())) {
				alloCopy.getAllocationContexts_Allocation().add(ac);
			}

			changeableElement.eSet(propertyInLoadedPCM, alloCopy.getAllocationContexts_Allocation());
		} else if ((value instanceof Double || value instanceof Integer) && property.getName().contains("processingRate")) {
			PCMRandomVariable varCopy = CoreFactory.eINSTANCE.createPCMRandomVariable();
			String spec = value.toString();
			varCopy.setSpecification(spec);
			changeableElement.eSet(propertyInLoadedPCM, varCopy);
		}
		
		//test FIXME
//		else if (value instanceof AssemblyContextImpl) {
//			DSEProblem problem = Opt4JStarter.getProblem();
//			org.palladiosimulator.pcm.system.System sys = problem.getInitialInstance().getSystem();
//			AssemblyContext ac = CompositionFactory.eINSTANCE.createAssemblyContext();
//			//EcoreUtil.Copier copier = new EcoreUtil.Copier();
//			//ac = (AssemblyContext) copier.copy((AssemblyContext)value);
//			ac.setEntityName("blablabla");
//			ac.setId("_uhdsnksd8siddfwDK");
//			
//			
//			EcoreUtil.Copier copier2 = new EcoreUtil.Copier();
//			org.palladiosimulator.pcm.system.System newsys = SystemFactory.eINSTANCE.createSystem();
//			newsys = (org.palladiosimulator.pcm.system.System) copier2.copy(sys);
//			copier2.copyReferences();
//			//newsys.getAssemblyContexts__ComposedStructure().add(ac);
//			
////			changeableElement.eSet(propertyInLoadedPCM, newsys.getAssemblyContexts__ComposedStructure());
//		}
		//test
		
		else {
			changeableElement.eSet(propertyInLoadedPCM, value);
		}
		if (keyForChanged != null) {
			decorator.remove(keyForChanged);
			decorator.put(keyForChanged, changeableElement);
		}
	}
	
	public static Object getProperty(EObject changeableElement, EStructuralFeature property) {
		EStructuralFeature propertyInLoadedPCM = changeableElement.eClass().getEStructuralFeature(property.getName());
		
		return changeableElement.eGet(propertyInLoadedPCM);
		
	}

	public static Object valueRule(ChangeableElementDescription ced, EObject changeableElement,
			List<EObject> rootElements) {

		ValueRule oclValueRule = ced.getValueRule();

		Query parsedQuery = parseInstanceContextOCL(oclValueRule, changeableElement, rootElements);
		
		if (changeableElement == null) {
			return parsedQuery.evaluate();
		}
		
		return parsedQuery.evaluate(changeableElement);
		
	}
	
	public static Collection<Object> valueRuleForCollection (ChangeableElementDescription ced, EObject changeableElement,
			List<EObject> rootElements){
		if(changeableElement != null) {
		EStructuralFeature propertyInLoadedPCM = changeableElement.eClass().getEStructuralFeature(ced.getChangeable().getName());
		Object change = changeableElement.eGet(propertyInLoadedPCM);
		
		//init
		GenomeToCandidateModelTransformation.getChosenValues().put("oldChoice$", change);
		GenomeToCandidateModelTransformation.getChosenValues().put("choiceValue$", change);
		GenomeToCandidateModelTransformation.getChosenValues().put("changeable$", changeableElement);
		}
		Object object = valueRule(ced, changeableElement, rootElements);

		if (object instanceof Collection<?>){
			return (Collection<Object>)object;
		} else {
			List<Object> result = new ArrayList<Object>(1);
			result.add((Object)object);
			return result;
		} 
	}

	private Collection<EObject> selectionRule(ChangeableElementDescription ced,
			List<EObject> rootElements, Map<ChangeableElementDescription, Collection<EObject>> selectedModelElements)  {
		
	    SelectionRule oclSelectionRule = ced.getSelectionRule();
		if (oclSelectionRule == null){
			return selectAllInstancesOf(ced.getChangeable().getEContainingClass(), rootElements);
		} else {
			
			if (oclSelectionRule instanceof StaticSelectionRule){
				EClass contextClass = ((StaticSelectionRule)oclSelectionRule).getContextClass();
				Query parsedQuery = parseClassContextOCL(oclSelectionRule, contextClass, rootElements);
				Object result = parsedQuery.evaluate();
				
				return extractEObjectCollection(result);
	
			} else if (oclSelectionRule instanceof InstanceSelectionRule){
				ChangeableElementDescription referencedCED = ((InstanceSelectionRule)oclSelectionRule).getContextInstance();
				Collection<EObject> contextInstances = selectedModelElements.get(referencedCED);
				Query parsedQuery = parseInstanceContextOCL(oclSelectionRule, contextInstances, rootElements);
				Object singleResult = null;
				List<EObject> resultList = new ArrayList<EObject>(contextInstances.size());
				for (EObject eObject : contextInstances) {
					singleResult = parsedQuery.evaluate(eObject);
					resultList.addAll(extractEObjectCollection(singleResult));
				}
				return resultList;
				
			} else {
				throw new RuntimeException("Unknown type of selection rule "+oclSelectionRule.getClass().getName());
			}

		}
		
	}



	private Collection<EObject> extractEObjectCollection(Object result) {
		
		if (result instanceof ECollections || result instanceof Collection<?>){
			return (Collection<EObject>)result;
		} 
		if (result instanceof EObject){
			List<EObject> list = new ArrayList<EObject>(1);
			list.add((EObject) result);
			return list;
		}
		return null;
	}
	
	private Query parseInstanceContextOCL(OCLRule oclRule,
			Collection<EObject> contextInstances, List<EObject> rootElements)  {
		return parseInstanceContextOCL(oclRule, contextInstances.iterator().next(), rootElements);
	}
	
	private static Query parseInstanceContextOCL(OCLRule oclRule,
			EObject contextInstance, List<EObject> rootElements)  { 
		Helper helper = OCL_ENV.createOCLHelper();
		
		List<HelperOCLDefinition> helpers = oclRule.getHelperDefinition();

		defineHelpers(helper, helpers);
		
		//FIXME for all instances
		helper.setInstanceContext(contextInstance);
		
		//FIXME: Maybe fix problem by aligning the loaded java classes with the classes 
		//from the loaded PCM model. Switch through all first. See DSEProblem for initial idea.
		Query query = createOCLQuery(oclRule, helper);
		
		return query;
	}
	
	private Query parseClassContextOCL(OCLRule oclRule,
			EClass contextClass, List<EObject> rootElements)  {
		Helper helper = OCL_ENV.createOCLHelper();
		
		
		List<HelperOCLDefinition> helpers = oclRule.getHelperDefinition();
		
		defineHelpers(helper, helpers);
		
		helper.setContext(contextClass);
		
		Query query = createOCLQuery(oclRule, helper);
		
		return query;
	}

	private static Query setEvaluationEnvironment(Query query) {

		//dfd
		Set<String> keys = GenomeToCandidateModelTransformation.getChosenValues().keySet();
		for (String key : keys) {
			query.getEvaluationEnvironment().add(key, GenomeToCandidateModelTransformation.getChosenValues().get(key));
		}
		//lndlfk
		if (decorator != null && !decorator.isEmpty()) {
			for (String key : decorator.keySet()) {
				EObject dec = (EObject) decorator.get(key);
				Variable<EClassifier, EParameter> contextVar = ExpressionsFactory.eINSTANCE.createVariable();
				contextVar.setName(key);
				contextVar.setType(dec.eClass());
				if (query.getEvaluationEnvironment().getValueOf(key) == null) {
					query.getEvaluationEnvironment().add(key, dec);
					
				}
			}
			
		}
		
		return query;
	}



	private static void defineHelpers(Helper helper, List<HelperOCLDefinition> helpers) {
		try {

			//FIXME maybe buggy... check in detail
			if (decorator != null && !decorator.isEmpty()) {
				Set<String> keys = decorator.keySet();
				for (String key : keys) {
					EObject dec = (EObject) decorator.get(key);
					Variable<EClassifier, EParameter> contextVar = ExpressionsFactory.eINSTANCE.createVariable();
					contextVar.setName(key);
					contextVar.setType(dec.eClass());
					
					if (OCL_ENV.getEnvironment().lookup(contextVar.getName()) == null) {
						OCL_ENV.getEnvironment().addElement(contextVar.getName(), contextVar, true);
					}
					
				}
			}
			
			Set<String> keys = GenomeToCandidateModelTransformation.getChosenValues().keySet();
			for (String key: keys) {
				Variable<EClassifier, EParameter> contextVar = ExpressionsFactory.eINSTANCE.createVariable();
				contextVar.setName(key);
				Object val = GenomeToCandidateModelTransformation.getChosenValues().get(key);
				if (val instanceof Integer || val instanceof String || val instanceof Double) {
					OCLStandardLibrary<EClassifier> stdLibrary = OCL_ENV.getEnvironment().getOCLStandardLibrary();
					
					if (val instanceof Double) contextVar.setType(stdLibrary.getReal());
					if (val instanceof String) contextVar.setType(stdLibrary.getString());
					if (val instanceof Integer) contextVar.setType(stdLibrary.getInteger());
					OCL_ENV.getEnvironment().deleteElement(key);
					OCL_ENV.getEnvironment().addElement(key, contextVar, true);
					continue;
				}
				if (val instanceof List<?>) {
					EList<?> valList = (EList<?>) val;
					for (Object first : valList) {
						contextVar.setType(((EObject) first).eClass());
						break;
					}
				} else {
				
					EObject value = (EObject)GenomeToCandidateModelTransformation.getChosenValues().get(key);
					contextVar.setType(value.eClass());
				}
				OCL_ENV.getEnvironment().deleteElement(key);
				OCL_ENV.getEnvironment().addElement(key, contextVar, true);
			}
			

			for (HelperOCLDefinition helperOCLDefinition : helpers) {

				helper.setContext(helperOCLDefinition.getContextClass());

				
				try {
				helper.defineOperation(helperOCLDefinition.getMainOclQuery());
				}catch (SemanticException e) {
					if (!e.getMessage().contains("already defined in type")) {
						throw e;
					} else {
						//System.out.println("already defined in type");
						//return;
					}
				}
			}
		}catch (ParserException e) {
			e.printStackTrace();
			throw new RuntimeException(e);
		}
	}

	private static Query createOCLQuery(OCLRule oclRule, Helper helper) {
		try {
			
			//System.out.println(helper.getEnvironment().getSelfVariable().toString());
			//System.out.println(oclRule);
			OCLExpression oclExpresssion = helper.createQuery(oclRule.getMainOclQuery());
			Query query = OCL_ENV.createQuery(oclExpresssion);
			
			return setEvaluationEnvironment(query);
		} catch (ParserException e) {
			e.printStackTrace();
			throw new RuntimeException(e);
		}
	}



	/** EMF does offer no cheap way to select all instances of a class, so we need to traverse everything...
	 * See Bergmann et al., Incremental Model Queries over EMF Models, MODELS 2010.  
	 * http://home.mit.bme.hu/~rath/pub/conf/beta/models10-submitted.pdf
	 * @param eClass
	 * @param rootElements
	 */
	private List<EObject> selectAllInstancesOf(EClass eClass, List<EObject> rootElements) {
		List<EObject> results = new ArrayList<EObject>();
		for (EObject rootNamedElement : rootElements) {
			
			for (Iterator<EObject> iterator = rootNamedElement.eAllContents(); iterator
					.hasNext();) {
				EObject namedElement = (EObject) iterator.next();
				if (eClass.isInstance(namedElement)){
					results.add(namedElement);
				}
			}
		}
		return results;
	}

//	public Query parseOCLExpression(String expression){
//		Helper helper = OCL_ENV.createOCLHelper();
//		
//		// helper.setAttributeContext(EmployeePackage.Literals.DEPARTMENT, eFeature);
//
//		// helper.setInstanceContext(instance) ?
//
//		// helper.setContext(context) ? 
//
//		// first, read in all the helper methods. 
//		// strip the context from the ocl and find its context
//		
//		// XXX: separate context and "body" in RSA metamodel.
//		
//		helper.setContext(context);
//		
//		// strip the def : from the definition. 
//		
//		
//		helper.defineOperation(defExpression);
//		
//		
//		try {
//			OCLExpression oclExpresssion = helper.createQuery(expression);
//			Query query = OCL_ENV.createQuery(oclExpresssion);
//			return query;
//
//		} catch (ParserException e) {
//			throw new UnsupportedOperationException(e.getLocalizedMessage());
//		}
//
//	}
	
	/** 
	 * PCM specific method to conveniently call the transformation
	 * @param pcm
	 * @param candidate
	 * @return The choices that have not been transformed, e.g. because no GDoF has been specified from them
	 */
	public List<Choice>  transform(PCMInstance pcm, Candidate candidate){
		
		List<EObject> rootElements = getPCMRootElements(pcm);
		
		// TODO: add my resource repository with the alternative resources. Rename it first, because the repository of resource types is already named resource repository.
		return transform(rootElements, candidate);
	}



	public static List<EObject> getPCMRootElements(PCMInstance pcm) {
		List<EObject> rootElements = new ArrayList<EObject>();
		
		List<Repository> repos = pcm.getRepositories();
		for (Repository repository : repos) {
			rootElements.add(repository);
		}
		rootElements.add(pcm.getSystem());
		rootElements.add(pcm.getResourceEnvironment());
		rootElements.add(pcm.getAllocation());
		// usage model is probably not needed
		return rootElements;
	}



	/** 
	 * PCM specific method to conveniently call the transformation for one {@link Choice}
	 * @param pcm
	 * @param candidate
	 */
	public boolean transformChoice(PCMInstance pcm, Choice choice) {
		
		List<EObject> rootElements = getPCMRootElements(pcm);
		
		// TODO: add my resource repository with the alternative resources. Rename it first, bcause the repository of resource types is already named resource repository.
		return transformChoice(rootElements, choice);
		
	}
	
	@SuppressWarnings("deprecation")
	private void mergeModels(org.eclipse.emf.compare.Comparison com) {
		
		if (com.getDifferences().isEmpty()) return;
		
		Repository repo = null;
		org.palladiosimulator.pcm.system.System sys = null;
		Allocation allo = null;

		PCMInstance pcm = Opt4JStarter.getProblem().getCurrentInstance();
		sys = pcm.getSystem();
		allo = pcm.getAllocation();
		List<Repository> repos = pcm.getRepositories();
		for (Repository r : repos) {
			if (r.eResource().getURI().toString().contains("pathmap")) continue;
			repo = r;
			break;
		}
		
//		int count = 1;
//		for(Connector conn : sys.getConnectors__ComposedStructure()) {
//			System.out.println(count+++conn.toString());
//		}
//		System.out.println("--------------------");
		
		
		EcoreUtil.Copier copier = new EcoreUtil.Copier();
		Comparison localComp = (Comparison)copier.copy(com); 
		copier.copyReferences();
		
		
		EList<Match> match = localComp.getMatches();
		
		
		
		ResourceEnvironment resenv = pcm.getResourceEnvironment();
		
		//System.out.println(".....................................");
		
		
		
		for (Match m : match) {
			//TODO all models on right have to be from the copied instance
			//set system of instance to merge to actual system
			if (m.getLeft() instanceof SystemImpl) {
				m.setRight(sys);
			} else if (m.getLeft() instanceof AllocationImpl) {
				m.setRight(allo);
			} else if (m.getLeft() instanceof RepositoryImpl) {
				m.setRight(repo);
			}

//			for (Diff d : m.getDifferences()) {
//				if (d.getKind().equals(DifferenceKind.ADD)) {
//					d.copyLeftToRight();
//				}
//			}
			
			for(Match subm : m.getSubmatches()) {
				if(subm.getDifferences().isEmpty()) continue;
				
				if (subm.getRight() != null) subm.setRight(changeToLocal(subm.getLeft(), null));
				
				for (Match subsubm : subm.getSubmatches()) {
					if(subsubm.getDifferences().isEmpty()) continue;
					if (subsubm.getRight() != null) subsubm.setRight(changeToLocal(subsubm.getLeft(), null));
					for (Match subsubsubm : subsubm.getSubmatches()) {
						if(subsubsubm.getDifferences().isEmpty()) continue;
						if (subsubsubm.getRight() != null) subsubsubm.setRight(changeToLocal(subsubsubm.getLeft(), null));
						for (Match subsubsubsubm : subsubsubm.getSubmatches()) {
							if(subsubsubsubm.getDifferences().isEmpty()) continue;
							if (subsubsubsubm.getRight() != null) subsubsubsubm.setRight(changeToLocal(subsubsubsubm.getLeft(), null));
						}
					}
				}
			}
		}
		
		EList<MatchResource> matches = localComp.getMatchedResources();
		for (int i = 0; i < matches.size(); i++) {
			EObject left = match.get(i).getLeft();
			EObject right = match.get(i).getRight();
			matches.get(i).setLeft(match.get(i).getLeft().eResource());
			if (right != null) {
				matches.get(i).setRight(match.get(i).getRight().eResource());
				matches.get(i).setRightURI(match.get(i).getRight().eResource().getURI().toString());
			}
		}
//		
		Iterator<Diff> diffs = localComp.getDifferences().iterator();
		while (diffs.hasNext()) {
			Diff d = diffs.next();
			
			EObject value = ((ReferenceChange)d).getValue();
			EObject nevalue = changeToLocal(value, null);
			if (nevalue != null ) 
				((ReferenceChange)d).setValue(nevalue);
			else {
				//System.out.println(value.toString()+" ist null!");
			}
			if (value instanceof ResourceContainerImpl) {
				if(((ResourceContainer)value).getEntityName().contains("server3")) {
					//System.out.println("");
				}
			}
			
			Match matsch = localComp.getMatch(((ReferenceChange)d).getValue());
			//matsch = d.getMatch();
			if (matsch != null) matsch.setRight(changeToLocal(matsch.getLeft(), null));
			
			
//			System.out.println(d.getKind().toString());
//			System.out.println(d.getMatch().getLeft().toString());
//			if (!(d instanceof ReferenceChangeImpl)) continue;
//			EObject value = ((ReferenceChange)d).getValue();
//			if (value instanceof AssemblyContextImpl) {
//				if(((AssemblyContext)value).getEntityName().contains("Database")) {
//					d.copyLeftToRight();
//				}
//			}
		}
		
		Iterator<Diff> diff = localComp.getDifferences().iterator();
		while (diff.hasNext()) {
			diff.next().copyLeftToRight();
		}
//		int c = 1;
//		for(Connector conn : sys.getConnectors__ComposedStructure()) {
//			System.out.println(c+++conn.getEntityName());
//		}

		resenv = pcm.getResourceEnvironment();
		int stopper = 1;
		stopper = stopper+1;
	}
}
