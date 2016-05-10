package de.uka.ipd.sdq.dsexplore.gdof;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.eclipse.debug.internal.ui.views.launch.DebugElementHelper;
import org.eclipse.emf.cdo.eresource.util.EresourceSwitch;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.ECollections;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EEnumLiteral;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EParameter;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.EcoreUtil;
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
import org.eclipse.ocl.expressions.ExpressionsFactory;
import org.eclipse.ocl.expressions.Variable;
import org.omg.CORBA.Environment;
import org.palladiosimulator.pcm.PcmFactory;
import org.palladiosimulator.pcm.core.CoreFactory;
import org.palladiosimulator.pcm.core.PCMRandomVariable;
import org.palladiosimulator.pcm.core.composition.AssemblyContext;
import org.palladiosimulator.pcm.core.composition.impl.AssemblyContextImpl;
import org.palladiosimulator.pcm.core.impl.PCMRandomVariableImpl;
import org.palladiosimulator.pcm.parameter.ParameterFactory;
import org.palladiosimulator.pcm.parameter.VariableCharacterisation;
import org.palladiosimulator.pcm.parameter.VariableCharacterisationType;
import org.palladiosimulator.pcm.parameter.VariableUsage;
import org.palladiosimulator.pcm.parameter.impl.VariableUsageImpl;
import org.palladiosimulator.pcm.repository.BasicComponent;
import org.palladiosimulator.pcm.repository.PassiveResource;
import org.palladiosimulator.pcm.repository.Repository;
import org.palladiosimulator.pcm.repository.impl.PassiveResourceImpl;
import org.palladiosimulator.pcm.resourceenvironment.ProcessingResourceSpecification;
import org.palladiosimulator.pcm.resourceenvironment.impl.ProcessingResourceSpecificationImpl;
import org.palladiosimulator.solver.models.PCMInstance;

import de.uka.ipd.sdq.dsexplore.opt4j.genotype.DesignDecisionGenotype;
import de.uka.ipd.sdq.dsexplore.opt4j.representation.DSECreator;
import de.uka.ipd.sdq.dsexplore.opt4j.start.Opt4JStarter;
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
	
	
	public boolean transformChoice(List<EObject> rootElements, Choice choice) {
		// is choice active?
		if (choice.isActive()){

			DegreeOfFreedomInstance dofi = choice.getDegreeOfFreedomInstance();
			DegreeOfFreedom gdof = dofi.getDof();
			
			if (gdof != null) {

				// Store for each CED which instances have been selected
				Map<ChangeableElementDescription, Collection<EObject>> selectedModelElements = new HashMap<ChangeableElementDescription, Collection<EObject>>();

				// set primary element
				EObject modelElement = dofi.getPrimaryChanged();

				//determine property to change using GDoF
				EStructuralFeature property = gdof.getPrimaryChangeable().getChangeable();

				//FIXME testing get old Value
				EStructuralFeature propertyInLoadedPCM = modelElement.eClass().getEStructuralFeature(property.getName());
				Object oldChoice = modelElement.eGet(propertyInLoadedPCM);
				
				// FIXME just a quick fix
				// Can a choice be a list? if yes then change this.
				if (oldChoice instanceof EList) {
					for (Object o : (EList<?>)oldChoice) {
						chosenValues.put("oldValue$", o);
						break;
					}
				} else {
					chosenValues.put("oldValue$", oldChoice);
				}
				chosenValues.put("changeable$", modelElement);
				
				Object value = choice.getValue();
				//FIXME turnn current value to "oldValue" before!
				//Object oldValue = chosenValues.get("choiceValue$");
				
				//FIXME DEBUG -->
				Object oc = chosenValues.get("oldValue$");
				if(oc instanceof ProcessingResourceSpecificationImpl) {
					ProcessingResourceSpecification prs = (ProcessingResourceSpecification)oc;
					System.out.println("oldChoice: "+prs.getId());
					
					CostRepository costrepo = (CostRepository) decorator.get("costrepository$");
					EList<?> cost = costrepo.getCost();
					for (Object c : cost) {
						if(c instanceof FixedProcessingResourceCostImpl) {
							FixedProcessingResourceCost fprc2 = (FixedProcessingResourceCost)c;
							System.out.println("CostRepo: "+fprc2.getProcessingresourcespecification().getId());
						}
					}
				}
				
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
				modelElementList.add(modelElement);
				selectedModelElements.put(gdof.getPrimaryChangeable(),modelElementList);

				for (ChangeableElementDescription ced : gdof.getChangeableElementDescriptions()){
					if (ced == gdof.getPrimaryChangeable())
						continue;

					Collection<EObject> changeableElements = selectionRule(ced, rootElements, selectedModelElements);
					selectedModelElements.put(ced, changeableElements);

					
					EStructuralFeature changeableProperty = ced.getChangeable();

					for (EObject changeableElement : changeableElements) {

						Object newValue = valueRule(ced, changeableElement, rootElements);
						//FIXME chosenValues.put(ced.getName().replace(".", "_").toLowerCase(), newValue);
						
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
		}
		
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
		
		return parsedQuery.evaluate(changeableElement);
		
	}
	
	public static Collection<Object> valueRuleForCollection (ChangeableElementDescription ced, EObject changeableElement,
			List<EObject> rootElements){

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
				if (val instanceof Integer || val instanceof String || val instanceof Double) continue;
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
			
			System.out.println(helper.getEnvironment().getSelfVariable().toString());
			System.out.println(oclRule);
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




}
