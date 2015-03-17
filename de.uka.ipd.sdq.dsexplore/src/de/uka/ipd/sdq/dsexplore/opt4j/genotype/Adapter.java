package de.uka.ipd.sdq.dsexplore.opt4j.genotype;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Random;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.opt4j.core.Genotype;
import org.opt4j.genotype.Bounds;
import org.opt4j.genotype.IntegerGenotype;
import org.opt4j.genotype.ListGenotype;

import de.uka.ipd.sdq.dsexplore.helper.EMFHelper;
import de.uka.ipd.sdq.dsexplore.opt4j.genotype.BinaryGenotypeRepresentation.TypeOfDegree;
import de.uka.ipd.sdq.pcm.PcmFactory;
import de.uka.ipd.sdq.pcm.allocation.AllocationContext;
import de.uka.ipd.sdq.pcm.designdecision.specific.*;
import de.uka.ipd.sdq.pcm.designdecision.Candidate;
import de.uka.ipd.sdq.pcm.designdecision.Choice;
import de.uka.ipd.sdq.pcm.designdecision.ClassChoice;
import de.uka.ipd.sdq.pcm.designdecision.DecisionSpace;
import de.uka.ipd.sdq.pcm.designdecision.DegreeOfFreedomInstance;
import de.uka.ipd.sdq.pcm.designdecision.designdecisionFactory;
import de.uka.ipd.sdq.pcm.designdecision.gdof.ChangeableElementDescription;
import de.uka.ipd.sdq.pcm.designdecision.gdof.DegreeOfFreedom;
import de.uka.ipd.sdq.pcm.designdecision.gdof.gdofFactory;
import de.uka.ipd.sdq.pcm.designdecision.impl.ChoiceImpl;
import de.uka.ipd.sdq.pcm.designdecision.impl.designdecisionFactoryImpl;
import de.uka.ipd.sdq.pcm.designdecision.specific.AllocationDegree;
import de.uka.ipd.sdq.pcm.designdecision.specific.ContinuousProcessingRateDegree;
import de.uka.ipd.sdq.pcm.designdecision.specific.ResourceSelectionDegree;
import de.uka.ipd.sdq.pcm.designdecision.specific.specificFactory;
import de.uka.ipd.sdq.pcm.designdecision.specific.specificPackage;
import de.uka.ipd.sdq.pcm.designdecision.specific.impl.specificFactoryImpl;
import de.uka.ipd.sdq.pcm.resourceenvironment.ProcessingResourceSpecification;
import de.uka.ipd.sdq.pcm.resourceenvironment.ResourceContainer;
import de.uka.ipd.sdq.pcm.resourceenvironment.ResourceenvironmentFactory;
import de.uka.ipd.sdq.pcm.resourcetype.ProcessingResourceType;
import de.uka.ipd.sdq.pcm.resourcetype.ResourcetypeFactory;
/**
 * The {@link Adapter} contains methods to translate between {@link DesignDecisionGenotype} 
 * and {@link FinalBinaryGenotype}. In the conversion process, the following steps are
 * involved:
 * 
 * <p>
 * 1) The {@link DesignDecisionGenotype} (a list of {@link Choice} objects), is first converted to 
 * a list of {@link BinaryGenotype} objects.
 * <p>
 *  2) The list of {@link BinaryGenotype} objects are converted to {@link FinalBinaryGenotype} object
 *  using the {@link FinalBinaryGenotype} constructor. This is the final stage of the conversion where
 *  we have obtained our end result (that of converting the {@link DesignDecisionGenotype} to a {@link FinalBinaryGenotype}).
 *  <p>
 *  For the retranslation process, we have to convert the {@link FinalBinaryGenotype} to a {@link DesignDecisionGenotype}. The 
 *  process goes as follows:
 *  
 * <p>
 * 1) {@link FinalBinaryGenotype} is converted to a list of {@link BinaryGenotype} objects
 * <p>
 * 2)This list is converted to a list of {@link Choice} objects and is used
 * to construct a {@link DesignDecisionGenotype}
 * 
 *<p>
 *NOTE: During the retranslation for the ContinuousProcessingRateDegree, we cannot assign
 *the correct server speed value to the corresponding {@link Choice} object, because
 * the binary representation gives us server speed intervals (instead of particular values).
 * This problem is partially overcome by randomly assigning one of the previously used values of server speed
 * (in a particular interval) during the initialization of the problem.
 * @author Apoorv
 *
 */
public class Adapter {
	
	//<----------------------------------------------------------------------------------->
	/*
	// Orginal code
	String[] SERVERS = {"S1","S2","S3","S4"}; // Taken from getAllocatedServerBinaryRep method
	String[] WEBSERVERS = {"A","B","C"}; // Change the names of the WebServers here. This is taken from getWebServerBinaryRep method
	double[] SERVER_INTERVALS = {1,2,3,4}; // Specify the Server intervals here. Can be of any length. This is taken from getServerBinaryRep method
	*/
	// New Code
	// These have to be set in the constructor according to the Design
	List<EObject> SERVERS; 
	List<EObject> WEBSERVERS; 
	double[] SERVER_INTERVALS; 
	//<----------------------------------------------------------------------------------->
	
	/**The ContinuousProcessingRateArchiveStorage stores the 
	 * various values of server speeds of the candidates 
	 * given to translateDesignDecisionGenotype method. These stored values are then used by 
	 * translateFinalBinaryGenotype (while retranslating the {@link ContinuousProcessingRateDegree}) to produce {@link DesignDecisonGenotype}
	*/
	ArrayList<ArrayList<Double>> ContinuousProcessingRateArchiveStorage;
	DecisionSpace problemSpace;
	
	// Constructor here
	public Adapter(DecisionSpace problemSpace){
		// First create the SERVER_INTERVALS field.
		this.problemSpace = problemSpace;
		// Based on the problemSpace variable initialize the SERVERS,WEBSERVERS and SERVER_INTERVALS fields.
		boolean traversed_ContinuousProcessingRateDegree = false;
		boolean traversed_AllocationDegree = false;
		boolean traversed_ResourceSelectionDegree = false;
		for(DegreeOfFreedomInstance dofi: this.problemSpace.getDegreesOfFreedom()){
			
			if((dofi instanceof ContinuousProcessingRateDegree) && !traversed_ContinuousProcessingRateDegree){
				// then set the SERVER_INTERVALS variable here
				
				double server_interval_lowerbound = ((ContinuousProcessingRateDegree) dofi).getFrom();
				double server_interval_upperbound = ((ContinuousProcessingRateDegree) dofi).getTo();
				// Currently code to create 4 equi_length intervals
				double diff = (server_interval_upperbound - server_interval_lowerbound)/4;
				for(int i = 0 ; i < 4 ; i++){
					SERVER_INTERVALS[i] = server_interval_lowerbound + i*diff;
				}
				traversed_ContinuousProcessingRateDegree = true;
			}else if(dofi instanceof AllocationDegree && !traversed_AllocationDegree){
				// then set the SERVERS variable here
				this.SERVERS = ((AllocationDegree) dofi).getClassDesignOptions();
				traversed_AllocationDegree = true;
			}else if(dofi instanceof ResourceSelectionDegree && !traversed_ResourceSelectionDegree){
				// then set the WEBSERVERS variable here
				this.WEBSERVERS = ((ResourceSelectionDegree) dofi).getClassDesignOptions();
				traversed_ResourceSelectionDegree = true;
			}
		}
		this.ContinuousProcessingRateArchiveStorage = new ArrayList<ArrayList<Double>>();
		for(int i=0; i< this.SERVER_INTERVALS.length;i++){
			this.ContinuousProcessingRateArchiveStorage.add(new ArrayList<Double>());
		}
		
	}
	
	// Testing here
	public static void main(String[] args){
		
		/*
		ProcessingResourceType p = ResourcetypeFactory.eINSTANCE.createProcessingResourceType();
		System.out.println(p.getResourceRepository_ResourceType());
		System.out.println(p.getHardwareInducedFailureType__ProcessingResourceType());
		// Testing about the DOFs
		// Start by making a choice
		DegreeOfFreedomInstance dofsi = designdecisionFactory.eINSTANCE.createDegreeOfFreedomInstance();
		ClassChoice chois = designdecisionFactory.eINSTANCE.createClassChoice();
		chois.setDegreeOfFreedomInstance(dofsi);
		AllocationDegree ad = (AllocationDegree) dofsi;
		ResourceSelectionDegree rsd = (ResourceSelectionDegree) dofsi;
		AllocationContext ac = (AllocationContext) ad.getPrimaryChanged();
		chois.setChosenValue(ac.getResourceContainer_AllocationContext());
		ResourceContainer rc = ResourceenvironmentFactory.eINSTANCE.createResourceContainer();
		ProcessingResourceSpecification prs = (ProcessingResourceSpecification) rc.getActiveResourceSpecifications_ResourceContainer();
		System.out.println(dofsi.getDof());
		System.out.println(dofsi.getEntityName());
		System.out.println(dofsi.getChangeableElements());
		System.out.println(dofsi.getPrimaryChanged());
		
		//DegreeOfFreedom dof = gdofFactory.eINSTANCE.createDegreeOfFreedom();
		ContinuousProcessingRateDegree dof = specificFactoryImpl.eINSTANCE.createContinuousProcessingRateDegree();
		dof.setFrom(0);
		dof.setTo(10);
		
		ChangeableElementDescription ced = gdofFactory.eINSTANCE.createChangeableElementDescription();
		dof.setPrimaryChanged(ced);
		System.out.println(dof.getChangeableElements());
		System.out.println(dof.getFrom() + dof.getTo());
		System.out.println(dof.getPrimaryChanged());
		//System.out.println(dof.getClassDesignOptions());
		System.out.println(ced.getValueRule());
		*/
		// --------------------------
		ArrayList<ArrayList<Double>> some = new ArrayList<ArrayList<Double>>(); 
		ArrayList<Double> some1 = new ArrayList<Double>();
		some.add(some1);
		some.get(0).add(1.0);
		System.out.println(some.get(0).get(0));
		Random r = new Random();
		System.out.println(r.nextInt(10));
		//DesignDecisionGenotype d = new DesignDecisionGenotype();
		//List<Choice> genotype = d.getInternalList();
		Candidate c = designdecisionFactory.eINSTANCE.createCandidate();
		EList<Choice> list = c.getChoices();
		Choice choice = designdecisionFactory.eINSTANCE.createChoice();
		//choice.setDegreeOfFreedomInstance(designdecisionFactory.eINSTANCE.createDegreeOfFreedomInstance());
		choice.setValue("S1");
		//DegreeOfFreedomInstance dofi = designdecisionFactory.eINSTANCE.createDegreeOfFreedomInstance();
		AllocationDegree dofi = specificFactoryImpl.eINSTANCE.createAllocationDegree();
		dofi.setEntityName("Allocation");
		choice.setDegreeOfFreedomInstance(dofi);
		list.add(choice);
		/*-----------------------------------------------------------------*/
		Choice choice1 = designdecisionFactory.eINSTANCE.createChoice();
		choice1.setValue(3.89);
		ContinuousProcessingRateDegree dofi1 = specificFactory.eINSTANCE.createContinuousProcessingRateDegree();
		dofi1.setEntityName("Server Speed");
		choice1.setDegreeOfFreedomInstance(dofi1);
		list.add(choice1);
		
		/*-----------------------------------------------------------------*/
		Choice choice2 = designdecisionFactory.eINSTANCE.createChoice();
		choice2.setValue(3.55);
		ContinuousProcessingRateDegree dofi2 = specificFactory.eINSTANCE.createContinuousProcessingRateDegree();
		dofi2.setEntityName("Server Speed");
		choice2.setDegreeOfFreedomInstance(dofi2);
		list.add(choice2);
		
		/*-----------------------------------------------------------------*/
		Choice choice3 = designdecisionFactory.eINSTANCE.createChoice();
		choice3.setValue(2.55);
		ContinuousProcessingRateDegree dofi3 = specificFactory.eINSTANCE.createContinuousProcessingRateDegree();
		dofi3.setEntityName("Server Speed");
		choice3.setDegreeOfFreedomInstance(dofi3);
		list.add(choice3);
		
		/* For initial testing of Adapter (for the file in the backup folder)
		// Put into Candidate
		c.getChoices().addAll(list);
		DesignDecisionGenotype d = new DesignDecisionGenotype(c);
		Adapter a =new Adapter();
		List<Integer> binarygenotype = a.translateDesignDecisionGenotype(d);
		
			
		System.out.println(binarygenotype);
		*/
		c.getChoices().addAll(list);
		DesignDecisionGenotype d = new DesignDecisionGenotype(c);
		DecisionSpace ds = designdecisionFactory.eINSTANCE.createDecisionSpace();
		Adapter a =new Adapter(ds);
		List<BinaryGenotype> binarygenotype = a.translateDesignDecisionGenotype(d);
		FinalBinaryGenotype F = new FinalBinaryGenotype(binarygenotype);
		DesignDecisionGenotype DD = a.translateFinalBinaryGenotype(F);
		System.out.println(DD.getInternalList().get(0).getValue());
		System.out.println(DD.getInternalList().get(0).getDegreeOfFreedomInstance());
		System.out.println(DD.getInternalList().get(1).getValue());
		System.out.println(DD.getInternalList().get(1).getDegreeOfFreedomInstance());
		System.out.println(DD.getInternalList().get(2).getValue());
		System.out.println(DD.getInternalList().get(2).getDegreeOfFreedomInstance());
		System.out.println(DD.getInternalList().get(3).getValue());
		System.out.println(DD.getInternalList().get(3).getDegreeOfFreedomInstance());
		System.out.println(((ContinuousProcessingRateDegree) DD.getInternalList().get(3).getDegreeOfFreedomInstance()).getFrom());
		System.out.println(((ContinuousProcessingRateDegree) DD.getInternalList().get(3).getDegreeOfFreedomInstance()).getTo());
		/*
		System.out.println(binarygenotype.get(0).getDegreeType());
		System.out.println(binarygenotype.get(1).getDegreeType());
		System.out.println(F.getBinaryGenotype());
		System.out.println(F.getOrderOfDegrees());
		System.out.println(F.getBitsPerDegree());
		System.out.println(Math.random());
		*/
		
		/*---------------Some interesting code-----------------------------------*/
		ArrayList<ArrayList<String>> listOLists = new ArrayList<ArrayList<String>>();
		ArrayList<String> singleList = new ArrayList<String>();
		singleList.add("hello");
		singleList.add("world");
		listOLists.add(singleList);

		ArrayList<String> anotherList = new ArrayList<String>();
		anotherList.add("this is another list");
		listOLists.add(anotherList);
		System.out.println(listOLists);
		/*------------------------------------------------------------------------*/
		
		/*
		for(Choice c1: list){
			boolean some = (c1.getDegreeOfFreedomInstance().getClass() == specificFactory.eINSTANCE.createAllocationDegree().getClass());
			
			System.out.println(specificFactory.eINSTANCE.createAllocationDegree().getClass());
		}
		
		Iterator<Choice> choiceit = list.iterator();
		*/
		
		//int[] b = a.translateDesignDecisionGenotype(d);
		/*
		for(Choice c1: list){
			System.out.println(c1.getValue());
			System.out.println(c1.getDegreeOfFreedomInstance());
			System.out.println(c1.getDegreeOfFreedomInstance().getEntityName());
		}*/
		/*
		for(int i=0;i < 2;i++){
			//System.out.println(choiceit.hasNext());
			
			Choice ci = choiceit.next();
			System.out.println(ci.getValue());
			System.out.println(ci.getDegreeOfFreedomInstance().toString());
			System.out.println(ci.getDegreeOfFreedomInstance().getEntityName());
			
		}*/
		/*
		for(Integer i:a.getWebServerBinaryRep("A")){
			System.out.println(i);
		}*/
		//System.out.println(a.getAllocatedServerBinaryRep("S4").toString());
		
		
	}
	
	// Methods here
	/**
	 * Translates the given {@link DesignDecisionGenotype} named DDGenotype 
	 * to a {@link List} of {@link BinaryGenotype} objects. 
	 * Each {@link BinaryGenotype} object holds 
	 * the binary representation of a particular {@link Choice} object in the DDGenotype. 
	 * The DDGenotype contains the private field "choices", which
	 *  is actually a {@link List} of {@link Choice} objects. 
	 *  Each {@link Choice} object is referenced to a particular DOF
	 * @param DDGenotype
	 * @return
	 */
	public List<BinaryGenotype> translateDesignDecisionGenotype(DesignDecisionGenotype DDGenotype){
		
		// ChoiceList contains the list of Choice objects in DDGenotype 
		List<Choice> ChoiceList = DDGenotype.getInternalList();
		
		/* The TranslatedGenotype list is a list of BinaryGenotype Objects. 
		 * The for loop will convert each Choice in ChoiceList
		 * to a corresponding Binary representation of 1s and 0s --> (which is a BinaryGenotype Object).
		 * The only whimsical thing is that the binary nature
		 * of TranslatedGenotype is encoded using integers.
		 */
		List<BinaryGenotype> TranslatedGenotype = new ArrayList<BinaryGenotype>();
		
		
		/* Now, iterate through each choice object
		 * in the ChoiceList, find its corresponding degree of Freedom
		 * and apply the conversion to it.
		 */
		Iterator<Choice> ChoiceIteratorInstance = ChoiceList.iterator();
		  for(int i=0; i < ChoiceList.size(); i++){
			/* A comprehensive list of 
			 * if-else statements corresponding to each
			 * DOF.
			 */
			  Choice ChoiceIterator = ChoiceIteratorInstance.next();
			//if(ChoiceIterator.getDegreeOfFreedomInstance().getClass() == specificFactory.eINSTANCE.createContinuousProcessingRateDegree().getClass()){
			  if(ChoiceIterator.getDegreeOfFreedomInstance() instanceof ContinuousProcessingRateDegree){	
			  /* If the Choice object is representing Server Speed (ContinuousProcessingRateDegree)
				 * then take the server speed value and convert to
				 * binary number.
				 */
				double ServerSpeed=(Double) ChoiceIterator.getValue(); // Got the Server speed in double
				/* Now determine the interval 
				 * in which ServerSpeed value lies
				 */
				
				List<Integer> ServerBinaryRep = getServerBinaryRep(ServerSpeed);
				
				// Add the server speed value at the proper place in the archive storage
				for(int w=0;w<ServerBinaryRep.size();w++){
					if(ServerBinaryRep.get(w) == 1){
						this.ContinuousProcessingRateArchiveStorage.get(w).add(ServerSpeed);
					}
				}
				//-------------------------------------------------------------------------
				
				BinaryGenotype ServerBinaryGenotypeObj = new BinaryGenotype(ServerBinaryRep, BinaryGenotypeRepresentation.TypeOfDegree.ContinuousProcessingRateDegree);
				TranslatedGenotype.add(ServerBinaryGenotypeObj);
			}else if(ChoiceIterator.getDegreeOfFreedomInstance() instanceof ResourceSelectionDegree){
				// TODO Find the class corresponding to Webserver Selection. (Maybe it is the ResourceSelectionDegree?)
				/* If the Choice object is representing WebServer Allocation
				 * then take the Webserver and convert to
				 * binary number.
				 */
				EObject WebServer= ((ClassChoice) ChoiceIterator).getChosenValue(); // Got the WebServer in EObject
				List<Integer> WebServerBinaryRep = getWebServerBinaryRep(WebServer);
				BinaryGenotype WebServerBinaryGenotypeObj = new BinaryGenotype(WebServerBinaryRep, BinaryGenotypeRepresentation.TypeOfDegree.ResourceSelectionDegree);
				TranslatedGenotype.add(WebServerBinaryGenotypeObj);
			}else if(ChoiceIterator.getDegreeOfFreedomInstance() instanceof AllocationDegree){
				/* If the Choice object is representing Component Allocation (AllocationDegree)
				 * then take the Server and convert to
				 * binary number.
				 */
				EObject AllocatedServer= ((ClassChoice) ChoiceIterator).getChosenValue(); // Got the Component in EObject
			    List<Integer> AllocatedServerBinaryRep = getAllocatedServerBinaryRep(AllocatedServer);
				BinaryGenotype AllocatedServerBinaryGenotypeObj = new BinaryGenotype(AllocatedServerBinaryRep, BinaryGenotypeRepresentation.TypeOfDegree.AllocationDegree);			    
			    TranslatedGenotype.add(AllocatedServerBinaryGenotypeObj);
			}else throwOutOfScopeDegreeException(ChoiceIterator.getDegreeOfFreedomInstance());
		}
		 
		return TranslatedGenotype;
	}
	
	

	/** Translates the given {@link FinalBinaryGenotype} named FBGenotype to a 
	 * {@link DesignDecisionGenotype}.
	 * @param FBGenotype
	 * @return
	 */
	public DesignDecisionGenotype translateFinalBinaryGenotype(FinalBinaryGenotype FBGenotype){
		 
		// First create a list of BinaryGenotype Objects
		List<BinaryGenotype> TranslatedBGObjects = new ArrayList<BinaryGenotype>();
		for(int i=0; i < FBGenotype.getBitsPerDegree().size(); i++){
			List<Integer> BinaryString = new ArrayList<Integer>();
			for(int j = 0; j < FBGenotype.getBitsPerDegree().get(i); j++){
				BinaryString.add(FBGenotype.getBinaryGenotype().remove(0));
			}
			BinaryGenotype BGObject = new BinaryGenotype(BinaryString, FBGenotype.getOrderOfDegrees().get(i));
			TranslatedBGObjects.add(BGObject);
		}
		// Now, TranslatedBGObjects is a list of BinaryGenotypeObjects
		
		/* In the following for loop,
		 * we have to take each BinaryGenotype Object
		 * and convert to corresponding Choice Objects
		 */
		List<Choice> ChoiceObjectList = new ArrayList<Choice>();
		for(int i = 0 ; i < TranslatedBGObjects.size() ; i++ ){
			if(TranslatedBGObjects.get(i).getDegreeType() == TypeOfDegree.ContinuousProcessingRateDegree){
				List<Integer> BinaryList = TranslatedBGObjects.get(i).getInternalList();
				Choice ChoiceObject = designdecisionFactory.eINSTANCE.createChoice();
				for(int j = 0; j < BinaryList.size(); j++){
					if(BinaryList.get(j) == 1){
						
						// Old code -------------------------------------------
						// /* Create a 
						//  * random value between
						//  * SERVER_INTERVALS[j] AND SERVER_INTERVALS[j-1] 
						//  */
						// double ServerSpeedValue = Math.random()*(SERVER_INTERVALS[j]-SERVER_INTERVALS[j-1])+SERVER_INTERVALS[j-1];
						// ChoiceObject.setValue(ServerSpeedValue);
					    // -----------------------------------------------------
						
						// New Code --------------------------------------------
						/* Take out a random value from the archive storage 
						 * from the jth ArrayList
						 */
						Random rnum = new Random();
						double ServerSpeedValue = (Double) this.ContinuousProcessingRateArchiveStorage.get(j).get(rnum.nextInt(this.ContinuousProcessingRateArchiveStorage.get(j).size()));
						ChoiceObject.setValue(ServerSpeedValue);
					}
				}
				ContinuousProcessingRateDegree DegreeObject = specificFactory.eINSTANCE.createContinuousProcessingRateDegree(); 
				DegreeObject.setEntityName("Server Speed");
				ChoiceObject.setDegreeOfFreedomInstance(DegreeObject);
				ChoiceObjectList.add(ChoiceObject);
			}else if(TranslatedBGObjects.get(i).getDegreeType() == TypeOfDegree.ResourceSelectionDegree){
				List<Integer> BinaryList = TranslatedBGObjects.get(i).getInternalList();
				Choice ChoiceObject = designdecisionFactory.eINSTANCE.createChoice();
				for(int j = 0; j < BinaryList.size(); j++){
					if(BinaryList.get(j) == 1){
						((ClassChoice) ChoiceObject).setChosenValue(WEBSERVERS.get(j));
					}
				}
				ResourceSelectionDegree DegreeObject = specificFactory.eINSTANCE.createResourceSelectionDegree(); 
				DegreeObject.setEntityName("WebServer");
				ChoiceObject.setDegreeOfFreedomInstance(DegreeObject);
				ChoiceObjectList.add(ChoiceObject);
			}else if(TranslatedBGObjects.get(i).getDegreeType() == TypeOfDegree.AllocationDegree){
				List<Integer> BinaryList = TranslatedBGObjects.get(i).getInternalList();
				Choice ChoiceObject = designdecisionFactory.eINSTANCE.createChoice();
				for(int j = 0; j < BinaryList.size(); j++){
					if(BinaryList.get(j) == 1){
						((ClassChoice) ChoiceObject).setChosenValue(SERVERS.get(j));
					}
				}
				AllocationDegree DegreeObject = specificFactory.eINSTANCE.createAllocationDegree(); 
				DegreeObject.setEntityName("Allocation Degree");
				ChoiceObject.setDegreeOfFreedomInstance(DegreeObject);
				ChoiceObjectList.add(ChoiceObject);
			}
		}
		// Here in ChoiceObjectList, a list of Choice objects have been created
		// Now create a Candidate object
		Candidate CandidateObject = designdecisionFactory.eINSTANCE.createCandidate();
		CandidateObject.getChoices().addAll(ChoiceObjectList);
		DesignDecisionGenotype FinalDesignDecisionGenotype=new DesignDecisionGenotype(CandidateObject);
		return FinalDesignDecisionGenotype;
	}
	
	/**
	 * Converts the input value of server speed
	 * to a binary string according to the 
	 * server-speed intervals specified in the field
	 * SERVER_INTERVALS
	 * @param serverSpeed
	 * @return
	 */
	private List<Integer> getServerBinaryRep(double serverSpeed) {
		 
		boolean FOUNDINTERVAL = false;
		List<Integer> Result = new ArrayList<Integer>();
		// TODO Auto-generated method stub
		for(int i=0;i<SERVER_INTERVALS.length;i++){
			if(serverSpeed< SERVER_INTERVALS[i] & !FOUNDINTERVAL){
				Result.add(1);
				FOUNDINTERVAL = true;
			}else{
				Result.add(0);
			}
		}
		
		return Result;
	}
	
	/**
	 * Converts the input value of webServer (an EObject)
	 * to a binary string according to the 
	 * {@link List} of EObjects stored
	 * in the field WEBSERVERS
	 * @param webServer
	 * @return
	 */
	private List<Integer> getWebServerBinaryRep(EObject webServer) {
		// TODO Auto-generated method stub
		
		List<Integer> Result = new ArrayList<Integer>(); // For returning the final result
		
		for(int i=0;i<WEBSERVERS.size();i++){
			if(webServer.equals(WEBSERVERS.get(i))){
				Result.add(1);
			}else{
				Result.add(0);
			}
		}
		return Result;
	}
	
	/**
	 * Converts the input value of allocatedServer (an EObject)
	 * to a binary string according to the 
	 * {@link List} of EObjects stored
	 * in the field SERVERS
	 * @param allocatedServer
	 * @return
	 */
	private List<Integer> getAllocatedServerBinaryRep(EObject allocatedServer) {
		// TODO Auto-generated method stub
		
		List<Integer> Result = new ArrayList<Integer>(); // For returning the final result
		
		for(int i=0;i<SERVERS.size();i++){
			if(allocatedServer.equals(SERVERS.get(i))){
				Result.add(1);
			}else{
				Result.add(0);
			}
		}
		return Result;
	}
	
	private void throwOutOfScopeDegreeException(DegreeOfFreedomInstance dd) {
		throw new RuntimeException("The degree of freedom "+dd.toString()+" is out of scope for the current version of Adapter.");		
	}
	
}
