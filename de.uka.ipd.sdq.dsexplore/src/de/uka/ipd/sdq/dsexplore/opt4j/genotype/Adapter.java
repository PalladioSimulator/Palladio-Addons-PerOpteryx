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
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.opt4j.core.Genotype;
import org.opt4j.genotype.Bounds;
import org.opt4j.genotype.IntegerGenotype;
import org.opt4j.genotype.ListGenotype;

import de.uka.ipd.sdq.dsexplore.helper.EMFHelper;
import de.uka.ipd.sdq.dsexplore.opt4j.genotype.BinaryGenotypeRepresentation.TypeOfDegree;
import de.uka.ipd.sdq.pcm.designdecision.specific.*;
import de.uka.ipd.sdq.pcm.designdecision.Candidate;
import de.uka.ipd.sdq.pcm.designdecision.Choice;
import de.uka.ipd.sdq.pcm.designdecision.DecisionSpace;
import de.uka.ipd.sdq.pcm.designdecision.DegreeOfFreedomInstance;
import de.uka.ipd.sdq.pcm.designdecision.designdecisionFactory;
import de.uka.ipd.sdq.pcm.designdecision.impl.ChoiceImpl;
import de.uka.ipd.sdq.pcm.designdecision.impl.designdecisionFactoryImpl;
import de.uka.ipd.sdq.pcm.designdecision.specific.AllocationDegree;
import de.uka.ipd.sdq.pcm.designdecision.specific.ContinuousProcessingRateDegree;
import de.uka.ipd.sdq.pcm.designdecision.specific.ResourceSelectionDegree;
import de.uka.ipd.sdq.pcm.designdecision.specific.specificFactory;
import de.uka.ipd.sdq.pcm.designdecision.specific.specificPackage;
import de.uka.ipd.sdq.pcm.designdecision.specific.impl.specificFactoryImpl;
/**
 * The {@link Adapter} contains methods to translate between {@link DesignDecisionGenotype} 
 * and {@link FinalBinaryGenotype}. 
 * @author Apoorv
 *
 */
public class Adapter {
	
	String[] SERVERS = {"S1","S2","S3","S4"}; // Taken from getAllocatedServerBinaryRep method
	String[] WEBSERVERS = {"A","B","C"}; // Change the names of the WebServers here. This is taken from getWebServerBinaryRep method
	double[] SERVER_INTERVALS = {1,2,3,4}; // Specify the Server intervals here. Can be of any length. This is taken from getServerBinaryRep method
	// The ContinuousProcessingRateArchiveStorage stores the various values of server speeds for the candidates
	// given to translateDesignDecisionGenotype method. These stored values are then
	// used by translateFinalBinaryGenotype to produce DesignDecisonGenotype
	ArrayList<ArrayList<Double>> ContinuousProcessingRateArchiveStorage;
	/* The Adapter class has the methods to convert 
	 * a DesignDecisionGenotype genotype to a binary 
	 * genotype and vice versa. The binary genotype
	 * is actually a int vector of 1s and 0s.
	 */
	
	// Constructor here
	public Adapter(){
		this.ContinuousProcessingRateArchiveStorage = new ArrayList<ArrayList<Double>>();
		for(int i=0; i< this.SERVER_INTERVALS.length;i++){
			this.ContinuousProcessingRateArchiveStorage.add(new ArrayList<Double>());
		}
		
	}
	
	// Testing here
	
	public static void main(String[] args){
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
		Adapter a =new Adapter();
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
	// translateDesignDecisionGenotype method tested successfully ...
	/**
	 * This is a javadoc
	 * @param DDGenotype
	 * @return
	 */
	public List<BinaryGenotype> translateDesignDecisionGenotype(DesignDecisionGenotype DDGenotype){
		int SERVER_BITS_FOR_REPRESENTATION = 4;
		int NUMBER_OF_WEBSERVERS = 3;
		int NUMBER_OF_SERVERS = 4;
		int NUMBER_OF_COMPONENTS = 3;
		 
		/* Translates the given DesignDecisionGenotype named DDGenotype to 
		 * a list of BinaryGenotype objects. Each BinaryGenotype object holds
		 * the binary representation of a particular Choice object in the DDGenotype
		 * . The DDGenotype contains the private field "choices", which
		 * is actually a list of Choice objects. Each Choice object is referenced
		 * to a particular DOF
		 */
		List<Choice> ChoiceList = DDGenotype.getInternalList();
		// ChoiceList contains the list of Choice objects in DDGenotype
		
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
		//for(Choice ChoiceIterator: ChoiceList){
		  for(int i=0; i < ChoiceList.size(); i++){
			/* A comprehensive list of 
			 * if-else statements corresponding to each
			 * DOF.
			 */
			  Choice ChoiceIterator = ChoiceIteratorInstance.next();
			//if(ChoiceIterator.getDegreeOfFreedomInstance().getClass() == "Server Speed"){
			if(ChoiceIterator.getDegreeOfFreedomInstance().getClass() == specificFactory.eINSTANCE.createContinuousProcessingRateDegree().getClass()){
				/* If the Choice object is representing Server Speed (ContinuousProcessingRateDegree)
				 * then take the server speed value and convert to
				 * binary number.
				 */
				double ServerSpeed=(Double) ChoiceIterator.getValue(); // Got the Server speed in double
				/* Now determine the interval in which ServerSpeed value lies
				 * 
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
			}
			if(ChoiceIterator.getDegreeOfFreedomInstance().getClass() == specificFactory.eINSTANCE.createResourceSelectionDegree().getClass()){
				// TODO Find the class corresponding to Webserver Selection. (Maybe it is the ResourceSelectionDegree?)
				/* If the Choice object is representing WebServer Allocation
				 * then take the Webserver and convert to
				 * binary number.
				 */
				String WebServer=(String) ChoiceIterator.getValue(); // Got the WebServer in String
				List<Integer> WebServerBinaryRep = getWebServerBinaryRep(WebServer);
				BinaryGenotype WebServerBinaryGenotypeObj = new BinaryGenotype(WebServerBinaryRep, BinaryGenotypeRepresentation.TypeOfDegree.ResourceSelectionDegree);
				TranslatedGenotype.add(WebServerBinaryGenotypeObj);
			}
			if(ChoiceIterator.getDegreeOfFreedomInstance().getClass() == specificFactory.eINSTANCE.createAllocationDegree().getClass()){
				/* If the Choice object is representing Component Allocation (AllocationDegree)
				 * then take the Server and convert to
				 * binary number.
				 */
				String AllocatedServer=(String) ChoiceIterator.getValue(); // Got the Component in String
			    List<Integer> AllocatedServerBinaryRep = getAllocatedServerBinaryRep(AllocatedServer);
				BinaryGenotype AllocatedServerBinaryGenotypeObj = new BinaryGenotype(AllocatedServerBinaryRep, BinaryGenotypeRepresentation.TypeOfDegree.AllocationDegree);			    
			    TranslatedGenotype.add(AllocatedServerBinaryGenotypeObj);
			}
		}
		 
		return TranslatedGenotype;
	}
	
	

	
	// Tested successfully ...
	
	/** Translates the given {@link FinalBinaryGenotype} named FBGenotype to a 
	 * {@link DesignDecisionGenotype}.
	 * @param FBGenotype
	 * @return
	 */
	public DesignDecisionGenotype translateFinalBinaryGenotype(FinalBinaryGenotype FBGenotype){
		 
		/* First create a list of BinaryGenotype Objects
		 * 
		 */
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
			}
			
			if(TranslatedBGObjects.get(i).getDegreeType() == TypeOfDegree.ResourceSelectionDegree){
				List<Integer> BinaryList = TranslatedBGObjects.get(i).getInternalList();
				Choice ChoiceObject = designdecisionFactory.eINSTANCE.createChoice();
				for(int j = 0; j < BinaryList.size(); j++){
					if(BinaryList.get(j) == 1){
						ChoiceObject.setValue(WEBSERVERS[j]);
					}
				}
				ResourceSelectionDegree DegreeObject = specificFactory.eINSTANCE.createResourceSelectionDegree(); 
				DegreeObject.setEntityName("WebServer");
				ChoiceObject.setDegreeOfFreedomInstance(DegreeObject);
				ChoiceObjectList.add(ChoiceObject);
			}
			
			if(TranslatedBGObjects.get(i).getDegreeType() == TypeOfDegree.AllocationDegree){
				List<Integer> BinaryList = TranslatedBGObjects.get(i).getInternalList();
				Choice ChoiceObject = designdecisionFactory.eINSTANCE.createChoice();
				for(int j = 0; j < BinaryList.size(); j++){
					if(BinaryList.get(j) == 1){
						ChoiceObject.setValue(SERVERS[j]);
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
	
	// Testing done successfully for getServerBinaryRep function.
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
	
	// You have to write similar functions to get binary representation 
	// of Webserver allocation and Component Allocation
	
	// Testing done for the getWebServerBinaryRep method
	private List<Integer> getWebServerBinaryRep(String webServer) {
		// TODO Auto-generated method stub
		
		List<Integer> Result = new ArrayList<Integer>(); // For returning the final result
		
		for(int i=0;i<WEBSERVERS.length;i++){
			if(webServer == WEBSERVERS[i]){
				Result.add(1);
			}else{
				Result.add(0);
			}
		}
		return Result;
	}
	

	// Testing done for the getAllocatedServerBinaryRep method
	private List<Integer> getAllocatedServerBinaryRep(String allocatedServer) {
		// TODO Auto-generated method stub
		
		List<Integer> Result = new ArrayList<Integer>(); // For returning the final result
		
		for(int i=0;i<SERVERS.length;i++){
			if(allocatedServer == SERVERS[i]){
				Result.add(1);
			}else{
				Result.add(0);
			}
		}
		return Result;
	}
	
}
