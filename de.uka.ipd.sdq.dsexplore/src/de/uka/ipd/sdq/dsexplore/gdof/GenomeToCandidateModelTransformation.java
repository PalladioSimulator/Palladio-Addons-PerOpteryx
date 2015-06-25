package de.uka.ipd.sdq.dsexplore.gdof;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.util.ECollections;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.ocl.ParserException;
import org.eclipse.ocl.ecore.OCL.Helper;
import org.eclipse.ocl.ecore.OCL.Query;
import org.eclipse.ocl.ecore.OCLExpression;
import org.palladiosimulator.pcm.repository.Repository;
import org.palladiosimulator.solver.models.PCMInstance;

import de.uka.ipd.sdq.pcm.designdecision.Candidate;
import de.uka.ipd.sdq.pcm.designdecision.Choice;
import de.uka.ipd.sdq.pcm.designdecision.DegreeOfFreedomInstance;
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

				setProperty(modelElement, property, choice.getValue());

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
						setProperty(changeableElement, changeableProperty, newValue);

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
		changeableElement.eSet(propertyInLoadedPCM, value);
		
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

	private static void defineHelpers(Helper helper, List<HelperOCLDefinition> helpers) {
		try {
			for (HelperOCLDefinition helperOCLDefinition : helpers) {
				helper.setContext(helperOCLDefinition.getContextClass());
				helper.defineOperation(helperOCLDefinition.getMainOclQuery());
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
			return query;
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
