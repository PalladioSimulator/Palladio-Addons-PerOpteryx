package de.uka.ipd.sdq.dsexplore.helper;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil.EqualityHelper;
import org.eclipse.emf.ecore.util.Switch;

import de.uka.ipd.sdq.dsexplore.opt4j.start.Opt4JStarter;
import de.uka.ipd.sdq.pcm.core.entity.Entity;
import de.uka.ipd.sdq.pcm.designdecision.Candidate;
import de.uka.ipd.sdq.pcm.designdecision.Candidates;
import de.uka.ipd.sdq.pcm.designdecision.Choice;
import de.uka.ipd.sdq.pcm.designdecision.ClassChoice;
import de.uka.ipd.sdq.pcm.designdecision.DecisionSpace;
import de.uka.ipd.sdq.pcm.designdecision.DegreeOfFreedomInstance;
import de.uka.ipd.sdq.pcm.designdecision.specific.ClassDegree;
import de.uka.ipd.sdq.pcm.designdecision.util.designdecisionSwitch;
import de.uka.ipd.sdq.pcmsolver.models.PCMInstance;

/**
 * This class fixes the references of designdecision models. The problem 
 * addressed is, that if you separately load a PCM model and a designdecision
 * model, the object identities of the loaded elements are not the same. For 
 * example, a basic component A may be represented by a Java object A1 when 
 * loaded directly from the repository file. When a degree of freedom model is 
 * loaded, and the PCM instance is accessed usingthe references in that model,
 * the PCM model is loaded again and the component A is represented by a second
 * Java object A2. Calling equals on A1 and A2 results in false. Thus,
 * collection.contains(A1) will fail even if A2 is contained. 
 * 
 * Thus, this class fixes the references by replacing each reference to A2 to 
 * a reference to A1, so that only one consistent object tree represents the 
 * models at the end. 
 * 
 * XXX: Maybe this could be done more generically based on EObject and the structural 
 * features, without being meta model dependent. 
 * 
 * One solution idea was to just use the same EMF resource set when loading more models 
 * and then resolve proxies using ECoreUtil#resolveAll. Although this worked before 2011-02-24,
 * it did not work anymore afterwards, so I reenabled this switch. 
 * 
 * @author martens
 */
public class FixDesignDecisionReferenceSwitch extends designdecisionSwitch<EObject> {
	
	protected static Logger logger = Logger
		.getLogger(FixDesignDecisionReferenceSwitch.class.getName());

	public void fixEntitiesForDomain(List<EObject> eListToUpdate, List<Entity> memoryEntityList) {

		List<Entity> newList = new ArrayList<Entity>();
		
		for (EObject entity : eListToUpdate) {
			Entity rightOne = EMFHelper.retrieveEntityByID(memoryEntityList, entity);
			newList.add(rightOne);
		}

		eListToUpdate.clear();
		eListToUpdate.addAll(newList);
	}

	private Switch<EObject> specificSwitch;
	private FixSpecificDesignDecisionReferenceSwitch fixSpecificDesignDecisionSwitch;

	public FixDesignDecisionReferenceSwitch(PCMInstance initialInstance2) {
		this.specificSwitch = new FixSpecificDesignDecisionReferenceSwitch(initialInstance2);
		this.fixSpecificDesignDecisionSwitch = new FixSpecificDesignDecisionReferenceSwitch(initialInstance2);
	}


	@Override
	public EObject caseCandidate(Candidate object) {
		List<Choice> choices = object.getChoices();
		for (Choice choice : choices) {
			doSwitch(choice);
		}
		
		return object;
	}

	@Override
	public EObject caseCandidates(Candidates object) {
		
		object.setProblem(Opt4JStarter.getProblem().getEMFProblem());
		
		for (Candidate candidate: object.getCandidate()) {
			doSwitch(candidate);
		}
		return object;
	}

	@Override
	public EObject caseChoice(Choice object) {
		
		DecisionSpace inMemoryProblem = Opt4JStarter.getProblem().getEMFProblem();
		
		DegreeOfFreedomInstance originalDegree = object.getDegreeOfFreedomInstance();		
		
		this.fixSpecificDesignDecisionSwitch.doSwitch(originalDegree);
		
		boolean foundDegree = false;
		
		for (DegreeOfFreedomInstance inMemoryDegree : inMemoryProblem.getDegreesOfFreedom()) {
			// Need to initialize this every time anew, because otherwise it will remember old comparisons and compares with previous matches. 
			EqualityHelper equalityHelper = new EqualityHelper();
			if (equalityHelper.equals(inMemoryDegree, originalDegree)){
				object.setDegreeOfFreedomInstance(inMemoryDegree);
				foundDegree = true;
				break;
			}
		}
		
		if (!foundDegree){
			throw new RuntimeException("Fixing design decision references failed, could not find in memory degree for "+object.getDegreeOfFreedomInstance());
		}
		return object;
	}

	@Override
	public EObject caseClassChoice(ClassChoice object) {
		
		//First need to fix the references of the degrees of freedom  
		caseChoice(object);
	
		// Fix the chosen entity. Is one of the degree of freedoms domain (which must have been fixed before). 
		DegreeOfFreedomInstance degree = object.getDegreeOfFreedomInstance();
		if (degree instanceof ClassDegree){
			ClassDegree enumDegree = (ClassDegree)degree;
			Entity inMemoryEntity = EMFHelper.retrieveEntityByID(enumDegree.getClassDesignOptions(), object.getChosenValue());
			
			if (inMemoryEntity == null){
				throw new RuntimeException("Cannot find Entity "+((Entity)object.getChosenValue()).getId()+" in the specified PCM ALlocation Model. Maybe the design decision file does not match the analysed PCM instance?");
			}
			
			object.setChosenValue(inMemoryEntity);
		} else {
			throw new RuntimeException("Invalid enumeration choice encountered: Referenced degree of freedom must be of type ClassDegree.");
		}
		
		return object;
	}

	
	@Override
	public EObject caseDecisionSpace(DecisionSpace object) {
		
		try {
			for (DegreeOfFreedomInstance dd : object.getDegreesOfFreedom()) {
				doSwitch(dd);
			};
		} catch (ClassCastException e){
			logger.error("Class cast exception when visiting .designdecision model. Please check your model for validity using the Ecore tree editor. References might be broken.");
			throw e;
		}
		return object;
	}

	
	@Override
	public EObject defaultCase(EObject eObject){
		return this.specificSwitch.doSwitch(eObject);
		
	}
	

	
	
}
