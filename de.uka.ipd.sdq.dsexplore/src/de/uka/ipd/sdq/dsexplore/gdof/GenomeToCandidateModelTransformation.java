package de.uka.ipd.sdq.dsexplore.gdof;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.ECollections;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.compare.Comparison;
import org.eclipse.emf.compare.Diff;
import org.eclipse.emf.compare.Match;
import org.eclipse.emf.compare.MatchResource;
import org.eclipse.emf.compare.ReferenceChange;
import org.eclipse.emf.compare.impl.AttributeChangeImpl;
import org.eclipse.emf.compare.impl.ReferenceChangeImpl;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EParameter;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.ocl.ParserException;
import org.eclipse.ocl.SemanticException;
import org.eclipse.ocl.ecore.OCL.Helper;
import org.eclipse.ocl.ecore.OCL.Query;
import org.eclipse.ocl.ecore.OCLExpression;
import org.eclipse.ocl.expressions.ExpressionsFactory;
import org.eclipse.ocl.expressions.Variable;
import org.eclipse.ocl.types.OCLStandardLibrary;
import org.palladiosimulator.analyzer.workflow.blackboard.PCMResourceSetPartition;
import org.palladiosimulator.pcm.allocation.Allocation;
import org.palladiosimulator.pcm.allocation.AllocationContext;
import org.palladiosimulator.pcm.allocation.AllocationFactory;
import org.palladiosimulator.pcm.allocation.impl.AllocationContextImpl;
import org.palladiosimulator.pcm.allocation.impl.AllocationImpl;
import org.palladiosimulator.pcm.core.CoreFactory;
import org.palladiosimulator.pcm.core.PCMRandomVariable;
import org.palladiosimulator.pcm.core.composition.AssemblyContext;
import org.palladiosimulator.pcm.core.impl.PCMRandomVariableImpl;
import org.palladiosimulator.pcm.parameter.impl.VariableUsageImpl;
import org.palladiosimulator.pcm.repository.Repository;
import org.palladiosimulator.pcm.repository.impl.RepositoryImpl;
import org.palladiosimulator.pcm.resourceenvironment.ProcessingResourceSpecification;
import org.palladiosimulator.pcm.resourceenvironment.impl.ProcessingResourceSpecificationImpl;
import org.palladiosimulator.pcm.system.impl.SystemImpl;
import org.palladiosimulator.solver.models.PCMInstance;

import de.uka.ipd.sdq.dsexplore.helper.EMFHelper;
import de.uka.ipd.sdq.dsexplore.helper.FixGDOFReferenceSwitch;
import de.uka.ipd.sdq.dsexplore.opt4j.representation.DSEProblem;
import de.uka.ipd.sdq.dsexplore.opt4j.start.Opt4JStarter;
import de.uka.ipd.sdq.pcm.cost.FixedProcessingResourceCost;
import de.uka.ipd.sdq.pcm.cost.costFactory;
import de.uka.ipd.sdq.pcm.cost.impl.ComponentCostImpl;
import de.uka.ipd.sdq.pcm.cost.impl.ComponentCostPerInstanceImpl;
import de.uka.ipd.sdq.pcm.cost.impl.CostRepositoryImpl;
import de.uka.ipd.sdq.pcm.cost.impl.FixedLinkingResourceCostImpl;
import de.uka.ipd.sdq.pcm.cost.impl.FixedProcessingResourceCostImpl;
import de.uka.ipd.sdq.pcm.cost.impl.VariableLinkingResourceCostImpl;
import de.uka.ipd.sdq.pcm.cost.impl.VariableProcessingResourceCostImpl;
import de.uka.ipd.sdq.pcm.cost.util.costResourceImpl;
import de.uka.ipd.sdq.pcm.designdecision.Candidate;
import de.uka.ipd.sdq.pcm.designdecision.Choice;
import de.uka.ipd.sdq.pcm.designdecision.DegreeOfFreedomInstance;
import de.uka.ipd.sdq.pcm.designdecision.diffrepository.DiffModel;
import de.uka.ipd.sdq.pcm.designdecision.diffrepository.impl.DiffModelImpl;
import de.uka.ipd.sdq.pcm.designdecision.gdof.ChangeableElementDescription;
import de.uka.ipd.sdq.pcm.designdecision.gdof.DegreeOfFreedom;
import de.uka.ipd.sdq.pcm.designdecision.gdof.HelperOCLDefinition;
import de.uka.ipd.sdq.pcm.designdecision.gdof.InstanceSelectionRule;
import de.uka.ipd.sdq.pcm.designdecision.gdof.OCLRule;
import de.uka.ipd.sdq.pcm.designdecision.gdof.SelectionRule;
import de.uka.ipd.sdq.pcm.designdecision.gdof.StaticSelectionRule;
import de.uka.ipd.sdq.pcm.designdecision.gdof.ValueRule;

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
	 *  in this map the decorators which were selected in the dofi are stored to use them in the OCL queries.
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
	 * 
	 * @param decorator
	 *            is a map of String and Object tuples. The string is the
	 *            variable name for the decorator. The name is always the model
	 *            name but with all characters small and no spaces. and with "$"
	 *            at the end. For example "UsageModel" would be "usagemodel$"
	 *            The Object is the model which was selected in the dofi.
	 */
	public static void setDecorator(Map<String, Object> decorator) {
		GenomeToCandidateModelTransformation.decorator = decorator;
	}

	/**
	 * Retrieves the map with the old and new choice value
	 * 
	 * @return the a map with the values for the old and new choice
	 */
	public static Map<String, Object> getChosenValues() {
		//init the variables to set the global ocl environment variables
		if (chosenValues == null) {
			chosenValues = new HashMap<String, Object>();
			
		}
		return chosenValues;
	}
	
	/**
	 * Sets the whole map with the chosen choice values
	 * Note: To add a choice value to the map use "put".
	 * 
	 * @param chosenValues is the new map which should overwrite the current
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
	
	
	
	public boolean transformChoice(List<EObject> rootElements, Choice choice) {
		// is choice active?
		if (choice.isActive()){

			DegreeOfFreedomInstance dofi = choice.getDegreeOfFreedomInstance();
			FixGDOFReferenceSwitch referenceSwitch = new FixGDOFReferenceSwitch(Opt4JStarter.getProblem().getCurrentInstance());

			DegreeOfFreedom gdof = dofi.getDof();
			
			if (gdof != null) {

				// merge if value is a DiffModel
				// no further actions for this DoF after merging
				if (choice.getValue() instanceof DiffModelImpl) {
					for (EObject comp : ((DiffModel)choice.getValue()).getDiffModel()){
						mergeModels((Comparison)comp);
						return true;
					}
				}
				// Store for each CED which instances have been selected
				Map<ChangeableElementDescription, Collection<EObject>> selectedModelElements = new HashMap<ChangeableElementDescription, Collection<EObject>>();

				EObject modelElement = dofi.getPrimaryChanged();
				modelElement = referenceSwitch.changeToLocal(dofi.getPrimaryChanged(), null);

				// determine property to change using GDoF
				EStructuralFeature property = gdof.getPrimaryChangeable().getChangeable();

				EStructuralFeature propertyInLoadedPCM = modelElement.eClass()
						.getEStructuralFeature(property.getName());
				Object oldChoice = modelElement.eGet(propertyInLoadedPCM);

				/*
				 * if a ProcessingResourceSpecification is the choice then it is
				 * necessary to check if there is a sibling 
				 * ProcessingResourceSpecification which should be collected
				 * 
				 * For example, a CPU should be changed and the DELAY should not
				 * be changed then the DELAY have to be retrieved to set both as list.
				 * 
				 * This is necessary because ProcessingResourceSpecification are
				 * only set as a list
				 */
				List<Object> fullchoice = new ArrayList<>();
				boolean oldChoiceSet = false;
				if (oldChoice instanceof EList) {
					for (Object o : (EList<?>) oldChoice) {
						if (o instanceof ProcessingResourceSpecificationImpl) {
							ProcessingResourceSpecification prs = (ProcessingResourceSpecification) o;
							if (!prs.getActiveResourceType_ActiveResourceSpecification().getId()
									.equals(((ProcessingResourceSpecification) choice.getValue())
											.getActiveResourceType_ActiveResourceSpecification().getId())) {
								fullchoice.add(prs);
							} else {
								getChosenValues().put("oldValue$", o);
								oldChoiceSet = true;
							}
						}
					}
				}
				
				if (choice.getValue() instanceof EObject) {
					choice.setValue(referenceSwitch.changeToLocal((EObject) choice.getValue(), propertyInLoadedPCM));
				}
				fullchoice.add(choice.getValue());
				
				// FIXME if elements are set as list and only one element of the
				// list should be changed retrieve the siblings to set all.
				if (oldChoice instanceof EList && !oldChoiceSet) {
					for (Object o : (EList<?>)oldChoice) {
						getChosenValues().put("oldValue$", o);
						break;
					}
				} else if (!oldChoiceSet) {
					getChosenValues().put("oldValue$", oldChoice);
				}
				getChosenValues().put("changeable$", modelElement);
				
				Object value = choice.getValue();
				
				chosenValues.put("choiceValue$", value);

				if (value instanceof VariableUsageImpl 
						|| value instanceof ProcessingResourceSpecificationImpl) {
					// set full list of ProcessingResourceSpecifications if only
					// one is changed
					if (value instanceof ProcessingResourceSpecificationImpl) {
						setProperty(modelElement, property, fullchoice);
					} else {
						EList<Object> list = new BasicEList<Object>();
						list.add(value);
						setProperty(modelElement, property, list);
					}
				} else {
					setProperty(modelElement, property, choice.getValue());
				}
				List<EObject> modelElementList = new ArrayList<EObject>(1);
				
				modelElementList.add(modelElement);
				selectedModelElements.put(gdof.getPrimaryChangeable(),modelElementList);

				EList<ChangeableElementDescription> ceds = gdof.getChangeableElementDescriptions();
				for (ChangeableElementDescription ced : ceds){
					if (ced == gdof.getPrimaryChangeable())
						continue;

					if (gdof.getName().contains("Resource Selection")) {
						
					}
					Collection<EObject> changeableElements = selectionRule(ced, rootElements, selectedModelElements);

					selectedModelElements.put(ced, changeableElements);
					
					
					EStructuralFeature changeableProperty = ced.getChangeable();

					for (EObject changeableElement : changeableElements) {

						
						Object newValue = valueRule(ced, changeableElement, rootElements);
						
						if (newValue instanceof HashSet<?>) {
							Set<?> s = (HashSet<?>) newValue;
							for (Object val: s) {
								// FIXME maybe this has side effects, it checks 
								//if the HashSet is a CostRepository
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

	/**
	 * This method sets the new value for a given element. The method checks 
	 * which value should be changed and sets a copied element to the element.
	 * 
	 * @param changeableElement is the element to which the value is set
	 * @param property the property in the changeableElement which should 
	 * 		  be changed
	 * @param value is the new value to set
	 */
	public static void setProperty(EObject changeableElement, EStructuralFeature property,
			Object value) {
		EStructuralFeature propertyInLoadedPCM = changeableElement.eClass().getEStructuralFeature(property.getName());

		String keyForChanged = null;
		
		if (decorator != null && decorator.containsValue(changeableElement)) {
			for (String key : decorator.keySet()) {
				if (decorator.get(key).equals(changeableElement)) {
					keyForChanged = key;
					break;
				}
			}
		}
		
		// set PCMRandomVariable
		if (value instanceof  PCMRandomVariableImpl) {
			PCMRandomVariable varCopy = CoreFactory.eINSTANCE.createPCMRandomVariable();
			String spec = ((PCMRandomVariableImpl) value).getSpecification();
			varCopy.setSpecification(spec);
			changeableElement.eSet(propertyInLoadedPCM, varCopy);
			
		// set a whole collection
		} else if (value instanceof Collection<?>) {
			EcoreUtil.Copier copier = new EcoreUtil.Copier();
			Collection<Object> col = new ArrayList<Object>();
			col = (Collection<Object>)value;
			Collection<Object> copy = copier.copyAll(col);
			copier.copyReferences();
			
			if (propertyInLoadedPCM.getName().equals("cost")) {
				PCMResourceSetPartition pcmPartition = Opt4JStarter.getProblem().getCurrentInstancePartition();
				boolean found = false;
		        for (Resource resource : pcmPartition.getResourceSet().getResources()) {
		        	if (found) break;
		        	if (resource instanceof costResourceImpl) {
		        		for (EObject cr : resource.getContents()) {
		        			changeableElement = cr;
		        			found = true;
		        			break;
		        		}
		        		
		        	}
		        }
			}
			changeableElement.eSet(propertyInLoadedPCM, copy);
			
		// set fixed costs
		} else if (value instanceof FixedProcessingResourceCostImpl) {
			FixedProcessingResourceCost fpr = costFactory.eINSTANCE.createFixedProcessingResourceCost();
			EcoreUtil.Copier copier = new EcoreUtil.Copier();
			fpr = (FixedProcessingResourceCost) copier.copy((EObject) value);
			Collection<Object> col = new ArrayList<Object>();
			col.add(fpr);
			changeableElement.eSet(propertyInLoadedPCM, col);
			
		// Set integer or double
		} else if (property.getName().equals("specification") 
				&& (value instanceof Integer || value instanceof Double)) {
			String newVal = value.toString();
			changeableElement.eSet(propertyInLoadedPCM, newVal);
			
		// Set an AllocationContext
		} else if (value instanceof AllocationContextImpl) {
			DSEProblem problem = Opt4JStarter.getProblem();
			Allocation alloOrigin = problem.getCurrentInstance().getAllocation();
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
			
		// Set a processingRate as PCMRandomeVariable
		} else if ((value instanceof Double || value instanceof Integer) && property.getName().contains("processingRate")) {
			PCMRandomVariable varCopy = CoreFactory.eINSTANCE.createPCMRandomVariable();
			String spec = value.toString();
			varCopy.setSpecification(spec);
			changeableElement.eSet(propertyInLoadedPCM, varCopy);
		}
		else {
			changeableElement.eSet(propertyInLoadedPCM, value);
		}
		
		// set new decorator if it was changed
		if (keyForChanged != null && changeableElement instanceof CostRepositoryImpl) {
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

			// init of the OCL variables that they can be used in the global OCL
			// environment of the helper definitions
		GenomeToCandidateModelTransformation.getChosenValues().put("oldValue$", change);
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

	/**
	 * 
	 * @param query is the OCL query to which's OCL environment the OCL variables
	 *        should be added
	 * @return the query with added OCL variables in its OCL environment
	 */
	private static Query setEvaluationEnvironment(Query query) {
		// set the old and new choice as OCL varibale
		Set<String> keys = GenomeToCandidateModelTransformation.getChosenValues().keySet();
		for (String key : keys) {
			query.getEvaluationEnvironment().add(key, GenomeToCandidateModelTransformation.getChosenValues().get(key));
		}
		
		// set the decorators as OCL variable
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

			// Set the decorators to the global OCL environment
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
			
			// set the old and new choice values to the global OCL environment
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
						System.out.println("already defined in type");
						
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
		
		// if no differences, do nothing
		if (com.getDifferences().isEmpty()) return;
		
		Repository repo = null;
		org.palladiosimulator.pcm.system.System sys = null;
		Allocation allo = null;

		PCMInstance pcm = Opt4JStarter.getProblem().getCurrentInstance();
		FixGDOFReferenceSwitch referenceSwitch = 
				new FixGDOFReferenceSwitch(Opt4JStarter.getProblem().getCurrentInstance());
		sys = pcm.getSystem();
		allo = pcm.getAllocation();
		List<Repository> repos = pcm.getRepositories();
		for (Repository r : repos) {
			if (r.eResource().getURI().toString().contains("pathmap")) continue;
			repo = r;
			break;
		}
		
		EcoreUtil.Copier copier = new EcoreUtil.Copier();
		Comparison localComp = (Comparison)copier.copy(com); 
		copier.copyReferences();
		
		EList<Match> match = localComp.getMatches();
		
		/*
		 * the elements to which the differences should be merged have to be 
		 * elements from the current PCM instance.
		 * 
		 */
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
			
			for(Match subm : m.getSubmatches()) {
				if (subm.getLeft()==null && subm.getRight() != null)  
					subm.setRight(referenceSwitch.changeToLocal(subm.getRight(), null));
				if(subm.getDifferences().isEmpty()) continue;
				
				if (subm.getRight() != null && subm.getLeft() != null) 
					subm.setRight(referenceSwitch.changeToLocal(subm.getLeft(), null));
				
				for (Match subsubm : subm.getSubmatches()) {
					if (subsubm.getLeft() == null && subsubm.getRight() != null)
						subsubm.setRight(referenceSwitch.changeToLocal(subsubm.getRight(), null));

					if (subsubm.getDifferences().isEmpty())
						continue;

					if (subsubm.getRight() != null && subsubm.getLeft() != null)
						subsubm.setRight(referenceSwitch.changeToLocal(subsubm.getLeft(), null));

					for (Match subsubsubm : subsubm.getSubmatches()) {
						if (subsubsubm.getLeft() == null && subsubsubm.getRight() != null)
							subsubsubm.setRight(referenceSwitch.changeToLocal(subsubsubm.getRight(), null));

						if (subsubsubm.getDifferences().isEmpty())
							continue;

						if (subsubsubm.getRight() != null && subsubsubm.getLeft() != null)
							subsubsubm.setRight(referenceSwitch.changeToLocal(subsubsubm.getLeft(), null));

						for (Match subsubsubsubm : subsubsubm.getSubmatches()) {
							if (subsubsubsubm.getLeft() == null && subsubsubsubm.getRight() != null)
								subsubsubsubm.setRight(referenceSwitch.changeToLocal(subsubsubsubm.getRight(), null));

							if (subsubsubsubm.getDifferences().isEmpty())
								continue;

							if (subsubsubsubm.getRight() != null && subsubsubsubm.getLeft() != null)
								subsubsubsubm.setRight(referenceSwitch.changeToLocal(subsubsubsubm.getLeft(), null));
						}
					}
				}
			}
		}
		
		EList<MatchResource> matches = localComp.getMatchedResources();
		for (int i = 0; i < match.size(); i++) {
			EObject right = match.get(i).getRight();
			matches.get(i).setLeft(match.get(i).getLeft().eResource());
			if (right != null) {
				matches.get(i).setRight(match.get(i).getRight().eResource());
				matches.get(i).setRightURI(match.get(i).getRight().eResource().getURI().toString());
			}
		}
		
		Iterator<Diff> diffs = localComp.getDifferences().iterator();
		while (diffs.hasNext()) {
			Diff d = diffs.next();
			EObject value = null;
			if (d instanceof ReferenceChangeImpl) {
				value = ((ReferenceChange)d).getValue();
			} else if (d instanceof AttributeChangeImpl) {
				value = d.eContainer();
				Object right = ((Match)value).getRight();
				if (right instanceof ProcessingResourceSpecificationImpl) {
					EObject local = referenceSwitch.changeToLocal((EObject)right, null);
					((Match)value).setRight(local);
				}
				continue;
			}
			
			EObject nevalue = referenceSwitch.changeToLocal(value, null);
			if (nevalue != null ) 
				((ReferenceChange)d).setValue(nevalue);
			
			Match ma = localComp.getMatch(((ReferenceChange)d).getValue());
			
			if (ma != null && ma.getLeft() != null) 
				ma.setRight(referenceSwitch.changeToLocal(ma.getLeft(), null));
			
		}
		
		Iterator<Diff> diff = localComp.getDifferences().iterator();
		while (diff.hasNext()) {
			Diff d = diff.next();
			d.copyLeftToRight();
		}

	}
}
