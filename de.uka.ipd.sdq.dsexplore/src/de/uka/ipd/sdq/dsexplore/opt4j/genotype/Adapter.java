package de.uka.ipd.sdq.dsexplore.opt4j.genotype;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;

import org.apache.log4j.Logger;
import org.eclipse.emf.ecore.EObject;

import de.uka.ipd.sdq.dsexplore.opt4j.genotype.BinaryGenotypeRepresentation.TypeOfDegree;
import de.uka.ipd.sdq.dsexplore.opt4j.start.Opt4JStarter;
import de.uka.ipd.sdq.pcm.designdecision.Candidate;
import de.uka.ipd.sdq.pcm.designdecision.Choice;
import de.uka.ipd.sdq.pcm.designdecision.ClassChoice;
import de.uka.ipd.sdq.pcm.designdecision.ContinousRangeChoice;
import de.uka.ipd.sdq.pcm.designdecision.DecisionSpace;
import de.uka.ipd.sdq.pcm.designdecision.DegreeOfFreedomInstance;
import de.uka.ipd.sdq.pcm.designdecision.DiscreteRangeChoice;
import de.uka.ipd.sdq.pcm.designdecision.designdecisionFactory;
import de.uka.ipd.sdq.pcm.designdecision.specific.AllocationDegree;
import de.uka.ipd.sdq.pcm.designdecision.specific.AssembledComponentDegree;
import de.uka.ipd.sdq.pcm.designdecision.specific.CapacityDegree;
import de.uka.ipd.sdq.pcm.designdecision.specific.ContinuousProcessingRateDegree;
import de.uka.ipd.sdq.pcm.designdecision.specific.ResourceSelectionDegree;
import de.uka.ipd.sdq.pcm.designdecision.specific.specificFactory;
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
	
	private static Logger logger = 
			Logger.getLogger("de.uka.ipd.sdq.dsexplore.opt4j.genotype.Adapter");
	
	// These have to be set in the constructor according to the Design problem
	List<EObject> SERVERS; 
	List<EObject> WEBSERVERS; 
	List<EObject> COMPONENTS;
	double[] SERVER_INTERVALS = {0,0,0,0}; // Initialization
	double[] CAPACITYDEGREE_INTERVALS = {0,0,0,0}; // Initialization
	
	/**The ContinuousProcessingRateArchiveStorage stores the 
	 * various values of server speeds of the candidates 
	 * given to translateDesignDecisionGenotype method. These stored values are then used by 
	 * translateFinalBinaryGenotype (while retranslating the {@link ContinuousProcessingRateDegree}) to produce {@link DesignDecisonGenotype}
	*/
	Map<Integer, ArrayList<Object>> ContinuousProcessingRateArchiveStorage;
	DecisionSpace problemSpace;
	
	// Constructor here
	//@Inject
	public Adapter(){
		this.ContinuousProcessingRateArchiveStorage = new HashMap<Integer, ArrayList<Object>>();
		this.problemSpace = Opt4JStarter.getProblem().getEMFProblem();
		
		logger.info("The problem is registered in Adapter");
		
		// Based on the problemSpace variable initialize the SERVERS,WEBSERVERS and SERVER_INTERVALS fields.
		boolean traversed_AllocationDegree = false;
		boolean traversed_ResourceSelectionDegree = false;
		int count = 0;
		for(DegreeOfFreedomInstance dofi: this.problemSpace.getDegreesOfFreedom()){
			
			if(dofi instanceof ContinuousProcessingRateDegree){
				// then set the SERVER_INTERVALS variable here
				
				double server_interval_lowerbound = ((ContinuousProcessingRateDegree) dofi).getFrom();
				double server_interval_upperbound = ((ContinuousProcessingRateDegree) dofi).getTo();
				// Currently code to create 4 equi_length intervals
				double diff = (server_interval_upperbound - server_interval_lowerbound)/4;
				for(int i = 0 ; i < 4 ; i++){
					SERVER_INTERVALS[i] = server_interval_lowerbound + i*diff;
				}
				// Also set the ContinuousProcessingRateArchiveStorage
				ContinuousProcessingRateArchiveStorage.put(count, new ArrayList<Object>());
				List<ArrayList<Double>> arrayList = new ArrayList<ArrayList<Double>>();
				List<Double> server_intervals_list = new ArrayList<Double>();
				for(int i=0; i< this.SERVER_INTERVALS.length;i++){
					List<Double> list = new ArrayList<Double>();
					
					double rnum = 0;
					if(i == 0){
						rnum = Math.random()*SERVER_INTERVALS[i];
					}else{
						rnum = Math.random()*(SERVER_INTERVALS[i]-SERVER_INTERVALS[i-1])+SERVER_INTERVALS[i-1];
					}
					list.add(rnum);
					server_intervals_list.add(SERVER_INTERVALS[i]);
					arrayList.add((ArrayList<Double>) list);
				}
				ContinuousProcessingRateArchiveStorage.get(count).add(arrayList);
				ContinuousProcessingRateArchiveStorage.get(count).add(server_intervals_list);
			}else if(dofi instanceof AllocationDegree && !traversed_AllocationDegree){
				// then set the SERVERS variable here
				this.SERVERS = ((AllocationDegree) dofi).getClassDesignOptions();
				traversed_AllocationDegree = true;
			}else if(dofi instanceof ResourceSelectionDegree && !traversed_ResourceSelectionDegree){
				// then set the WEBSERVERS variable here
				this.WEBSERVERS = ((ResourceSelectionDegree) dofi).getClassDesignOptions();
				traversed_ResourceSelectionDegree = true;
			}else if(dofi instanceof AssembledComponentDegree){
				this.COMPONENTS = ((AssembledComponentDegree) dofi).getClassDesignOptions();
			}else if(dofi instanceof CapacityDegree){
				// then set the CAPACITYDEGREE_INTERVALS variable here
				
				double capacitydegree_interval_lowerbound = ((CapacityDegree) dofi).getFrom();
				double capacitydegree_interval_upperbound = ((CapacityDegree) dofi).getTo();
				// Currently code to create 4 equi_length intervals
				double diff = (capacitydegree_interval_upperbound - capacitydegree_interval_lowerbound)/4;
				if(diff != 0){
					for(int i = 0 ; i < 4 ; i++){
						CAPACITYDEGREE_INTERVALS[i] = capacitydegree_interval_lowerbound + i*diff;
					}
				}else{
					for(int i = 0 ; i < 4 ; i++){
						CAPACITYDEGREE_INTERVALS[i] = SERVER_INTERVALS[i];
					}
				}
				//logger.info(CAPACITYDEGREE_INTERVALS);
			}
			count++;
		}
		
		
	}
	
	// Testing here
	public static void main(String[] args){
		Map<DegreeOfFreedomInstance, ArrayList<Double> > Dict = new HashMap<DegreeOfFreedomInstance, ArrayList<Double> >();
		DegreeOfFreedomInstance dof = designdecisionFactory.eINSTANCE.createDegreeOfFreedomInstance();
		List<Double> list = new ArrayList<Double>();
		Dict.put(dof, (ArrayList<Double>) list);
		System.out.println(Dict.get(dof).size());
		Dict.get(dof).add(0.0);
		Dict.get(dof).add(1.0);
		System.out.println(Dict.get(dof).get(1));
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
			  if(ChoiceIterator.getDegreeOfFreedomInstance() instanceof ContinuousProcessingRateDegree){	
			  /* If the Choice object is representing Server Speed (ContinuousProcessingRateDegree)
				 * then take the server speed value and convert to
				 * binary number.
				 */
				double ServerSpeed=(Double) ChoiceIterator.getValue(); // Got the Server speed in double
				/* Now determine the interval 
				 * in which ServerSpeed value lies
				 */
				
				List<Integer> ServerBinaryRep = getServerBinaryRep(ServerSpeed,i);
				
				// Add the server speed value at the proper place in the archive storage
				for(int w=0;w<ServerBinaryRep.size();w++){
					if(ServerBinaryRep.get(w) == 1){
						//this.ContinuousProcessingRateArchiveStorage.get(w).add(ServerSpeed);
						((ArrayList<ArrayList<Double>>) this.ContinuousProcessingRateArchiveStorage.get(i).get(0)).get(w).add(ServerSpeed);
					}
				}
				
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
			}else if(ChoiceIterator.getDegreeOfFreedomInstance() instanceof AssembledComponentDegree){
				/* If the Choice object is representing AssembledComponentDegree 
				 * then take the Component and convert to
				 * binary number.
				 */
				EObject AllocatedComponent= ((ClassChoice) ChoiceIterator).getChosenValue(); // Got the Component in EObject
			    List<Integer> AllocatedComponentBinaryRep = getAllocatedComponentBinaryRep(AllocatedComponent);
				BinaryGenotype AllocatedComponentBinaryGenotypeObj = new BinaryGenotype(AllocatedComponentBinaryRep, BinaryGenotypeRepresentation.TypeOfDegree.AssembledComponentDegree);			    
			    TranslatedGenotype.add(AllocatedComponentBinaryGenotypeObj);
			}else if(ChoiceIterator.getDegreeOfFreedomInstance() instanceof CapacityDegree){
				/* If the Choice object is representing CapacityDegree 
				 * then take the numerical value and convert to
				 * binary number.
				 */
				double capacityDegreeValue=(Integer) ChoiceIterator.getValue(); // Got the Server speed in double
				/* Now determine the interval 
				 * in which capacityDegreeValue value lies
				 */
				
				List<Integer> capacityDegreeValueBinaryRep = getCapacityBinaryRep(capacityDegreeValue);
				
				BinaryGenotype capacityDegreeValueBinaryGenotypeObj = new BinaryGenotype(capacityDegreeValueBinaryRep, BinaryGenotypeRepresentation.TypeOfDegree.CapacityDegree);
				TranslatedGenotype.add(capacityDegreeValueBinaryGenotypeObj);
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
		
		//Make them compatible
		makeCompatible(TranslatedBGObjects);
		/* In the following for loop,
		 * we have to take each BinaryGenotype Object
		 * and convert to corresponding Choice Objects
		 */
		List<Choice> ChoiceObjectList = new ArrayList<Choice>();
		
		for(int i = 0 ; i < TranslatedBGObjects.size() ; i++ ){
			
			if(TranslatedBGObjects.get(i).getDegreeType().toString() == "ContinuousProcessingRateDegree" ){
				List<Integer> BinaryList = TranslatedBGObjects.get(i).getInternalList();
				logger.info(BinaryList);
				ContinousRangeChoice ChoiceObject = designdecisionFactory.eINSTANCE.createContinousRangeChoice();
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
						//logger.info(this.ContinuousProcessingRateArchiveStorage.get(j).size());
						
						double ServerSpeedValue = (Double) ((ArrayList<ArrayList<Double>>) this.ContinuousProcessingRateArchiveStorage.get(i).get(0)).get(j).get(rnum.nextInt(((ArrayList<ArrayList<Double>>) this.ContinuousProcessingRateArchiveStorage.get(i).get(0)).get(j).size()));
						ChoiceObject.setValue(ServerSpeedValue);
								
						logger.info("Adapter Line 528: The ServerSpeedValue is " + ((Double)ServerSpeedValue).toString());
						
					}
				}
				ContinuousProcessingRateDegree DegreeObject = specificFactory.eINSTANCE.createContinuousProcessingRateDegree(); 
				DegreeObject.setEntityName("Server Speed");
				ChoiceObject.setDegreeOfFreedomInstance(DegreeObject);
				ChoiceObjectList.add((ContinousRangeChoice)ChoiceObject);
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
				ClassChoice ChoiceObject = designdecisionFactory.eINSTANCE.createClassChoice();
				for(int j = 0; j < BinaryList.size(); j++){
					if(BinaryList.get(j) == 1){
						ChoiceObject.setChosenValue(SERVERS.get(j));
					}
				}
				AllocationDegree DegreeObject = specificFactory.eINSTANCE.createAllocationDegree(); 
				DegreeObject.setEntityName("Allocation Degree");
				ChoiceObject.setDegreeOfFreedomInstance(DegreeObject);
				ChoiceObjectList.add(ChoiceObject);
			}else if(TranslatedBGObjects.get(i).getDegreeType() == TypeOfDegree.AssembledComponentDegree){
				List<Integer> BinaryList = TranslatedBGObjects.get(i).getInternalList();
				ClassChoice ChoiceObject = designdecisionFactory.eINSTANCE.createClassChoice();
				for(int j = 0; j < BinaryList.size(); j++){
					if(BinaryList.get(j) == 1){
						ChoiceObject.setChosenValue(COMPONENTS.get(j));
					}
				}
				AssembledComponentDegree DegreeObject = specificFactory.eINSTANCE.createAssembledComponentDegree(); 
				DegreeObject.setEntityName("AssembledComponent Degree");
				ChoiceObject.setDegreeOfFreedomInstance(DegreeObject);
				ChoiceObjectList.add(ChoiceObject);
			}else if(TranslatedBGObjects.get(i).getDegreeType() == TypeOfDegree.CapacityDegree){
				List<Integer> BinaryList = TranslatedBGObjects.get(i).getInternalList();
				DiscreteRangeChoice ChoiceObject = designdecisionFactory.eINSTANCE.createDiscreteRangeChoice();
				for(int j = 0; j < BinaryList.size(); j++){
					if(BinaryList.get(j) == 1){
						
						// Old code -------------------------------------------
						// /* Create a 
						//  * random value between
						//  * SERVER_INTERVALS[j] AND SERVER_INTERVALS[j-1] 
						//  */
						 int CapacityDegreeValue = 1;//Math.random()*(CAPACITYDEGREE_INTERVALS[j]-CAPACITYDEGREE_INTERVALS[j-1])+CAPACITYDEGREE_INTERVALS[j-1];
						 ChoiceObject.setValue(CapacityDegreeValue);
					    // -----------------------------------------------------
						
					}
				}
				CapacityDegree DegreeObject = specificFactory.eINSTANCE.createCapacityDegree(); 
				DegreeObject.setEntityName("Capacity Degree");
				ChoiceObject.setDegreeOfFreedomInstance(DegreeObject);
				ChoiceObjectList.add(ChoiceObject);
			}else throwUnidentifiedObjectException(TranslatedBGObjects.get(i).getDegreeType());
		}
		// Here in ChoiceObjectList, a list of Choice objects have been created
		// Now create a Candidate object
		logger.info("Line 595: FBGeno");
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
	private List<Integer> getServerBinaryRep(double serverSpeed, int key) {
		Double[] Server_Intervals = new Double[((List<Double>) this.ContinuousProcessingRateArchiveStorage.get(key).get(1)).size()];
		((List<Double>) this.ContinuousProcessingRateArchiveStorage.get(key).get(1)).toArray(Server_Intervals);
		boolean FOUNDINTERVAL = false;
		List<Integer> Result = new ArrayList<Integer>();
		// TODO Auto-generated method stub
		for(int i=0;i<Server_Intervals.length;i++){
			if(serverSpeed< Server_Intervals[i] & !FOUNDINTERVAL){
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
	
	private List<Integer> getAllocatedComponentBinaryRep(EObject allocatedComponent) {
		// TODO Auto-generated method stub
		List<Integer> Result = new ArrayList<Integer>(); // For returning the final result
		
		for(int i=0;i<COMPONENTS.size();i++){
			if(allocatedComponent.equals(COMPONENTS.get(i))){
				Result.add(1);
			}else{
				Result.add(0);
			}
		}
		return Result;
	}
	
	private List<Integer> getCapacityBinaryRep(double capacityDegreeValue) {
		// TODO Auto-generated method stub
		boolean FOUNDINTERVAL = false;
		List<Integer> Result = new ArrayList<Integer>();
		// TODO Auto-generated method stub
		for(int i=0;i<CAPACITYDEGREE_INTERVALS.length;i++){
			if(capacityDegreeValue< SERVER_INTERVALS[i] & !FOUNDINTERVAL){
				Result.add(1);
				FOUNDINTERVAL = true;
			}else{
				Result.add(0);
			}
		}
		
		return Result;
	}
	
	private void throwOutOfScopeDegreeException(DegreeOfFreedomInstance dd) {
		throw new RuntimeException("The degree of freedom "+dd.toString()+" is out of scope for the current version of Adapter.");		
	}
	
	private void throwUnidentifiedObjectException(Object dd) {
		throw new RuntimeException("The object "+dd.toString()+" is not identified/out of scope for the current version of Adapter.");		
	}
	
	private void makeCompatible(List<BinaryGenotype> bg){
		for(int i = 0 ; i < bg.size() ; i++){
			List<Integer> binaryList = bg.get(i).getInternalList();
			if(!binaryList.contains(1)){
				// randomly set any element to 1
				Random random = new Random();
				binaryList.set(random.nextInt(binaryList.size()-1), 1);
			}else{
				int index = 0;
				for(int j = 0 ; j < binaryList.size() ; j++){
					if(binaryList.get(j) == 1){
						index = j;
					}
				}
				for(int j = 0 ; j < binaryList.size() ; j++){
					if(j != index){
						binaryList.set(j, 0);
					}
				}
				bg.get(i).setInternalList(binaryList);	
			}
			
		}
	}
	
}
