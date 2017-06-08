package de.uka.ipd.sdq.dsexplore.concernweaving.util;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.palladiosimulator.pcm.allocation.AllocationContext;
import org.palladiosimulator.pcm.repository.Repository;
import org.palladiosimulator.pcm.resourceenvironment.ResourceContainer;
import org.palladiosimulator.solver.models.PCMInstance;

import ConcernModel.Concern;
import ConcernModel.ElementaryConcernComponent;
import de.uka.ipd.sdq.pcm.designdecision.Choice;
import de.uka.ipd.sdq.pcm.designdecision.ClassChoice;
import de.uka.ipd.sdq.pcm.designdecision.DegreeOfFreedomInstance;
import de.uka.ipd.sdq.pcm.designdecision.impl.designdecisionFactoryImpl;
import de.uka.ipd.sdq.pcm.designdecision.specific.AllocationDegree;
import de.uka.ipd.sdq.pcm.designdecision.specific.ConcernDegree;
import de.uka.ipd.sdq.pcm.designdecision.specific.impl.specificFactoryImpl;
import edu.kit.ipd.are.dsexplore.concern.exception.ConcernWeavingException;
import edu.kit.ipd.are.dsexplore.concern.exception.ErrorMessage;
import edu.kit.ipd.are.dsexplore.concern.handler.ECCStructureHandler;
import edu.kit.ipd.are.dsexplore.concern.manager.ConcernSolutionManager;
import edu.kit.ipd.are.dsexplore.concern.manager.PcmAllocationManager;
import edu.kit.ipd.are.dsexplore.concern.util.Pair;

//XXX This implementation assumes that only one concern is going to be woven.
public class WeavingExecuter {

	private Pair<Concern, Repository> concernWithSolutionPair;
	private List<ClassChoice> eccClassChoices = new ArrayList<ClassChoice>();
	private PCMInstance wovenPCM = null;
	
	public WeavingExecuter(List<Choice> choices) {
		
		initialize(choices);
		
	}

	private void initialize(List<Choice> choices) {
		
		Optional<ClassChoice> concernChoice = getConcernChoiceFrom(choices);
		if (!concernChoice.isPresent()) {
			
			return;
			
		}
		
		choices.remove(concernChoice.get());
		
		initSolutionMap(concernChoice.get());
		initECCClassChoices(choices);
		
	}
	
	private void initSolutionMap(ClassChoice concernChoice) {
		
		this.concernWithSolutionPair = Pair.of(getConcernFrom(concernChoice), (Repository) concernChoice.getChosenValue());
		
	}

	private void initECCClassChoices(List<Choice> choices) {

		List<ClassChoice> eccAllocDegrees = getAllocDegreesRelatedTo(concernWithSolutionPair.getFirst(), choices);
		this.eccClassChoices.addAll(eccAllocDegrees);
		choices.removeAll(eccAllocDegrees);
		
	}
	
	private Optional<ClassChoice> getConcernChoiceFrom(List<Choice> choices) {
		
		return choices.stream().filter(eachChoice -> isConcernDegree(eachChoice.getDegreeOfFreedomInstance()))
							   .map(eachChoice -> (ClassChoice) eachChoice)
						       .findFirst();
		
	}
	
	private List<ClassChoice> getAllocDegreesRelatedTo(Concern concern, List<Choice> notTransformedChoices) {
		
		return notTransformedChoices.stream().filter(eachChoice -> isAllocationDegreeWithECC(eachChoice.getDegreeOfFreedomInstance()))
											 .filter(eachChoice -> isRelatedTo(concern, (AllocationDegree) eachChoice.getDegreeOfFreedomInstance()))
				 							 .map(eachChoice -> (ClassChoice) eachChoice)
				 							 .collect(Collectors.toList());
		
	}
	
	private Concern getConcernFrom(ClassChoice concernChoice) {
		
		ConcernDegree concernDegree = (ConcernDegree) concernChoice.getDegreeOfFreedomInstance();
		return (Concern) (concernDegree).getPrimaryChanged();
		
	}
	
	private Concern getConcernFrom(AllocationDegree allocDegree) {

		ElementaryConcernComponent ecc = (ElementaryConcernComponent) allocDegree.getPrimaryChanged();
		return (Concern) ecc.eContainer();
		
	}
	
	private boolean isConcernDegree(DegreeOfFreedomInstance degreeOfFreedomInstance) {
		
		return degreeOfFreedomInstance instanceof ConcernDegree;
		
	}
	
	private boolean isAllocationDegreeWithECC(DegreeOfFreedomInstance degreeOfFreedomInstance) {
		
		return degreeOfFreedomInstance instanceof AllocationDegree && 
			   ((AllocationDegree) degreeOfFreedomInstance).getPrimaryChanged() instanceof ElementaryConcernComponent;
		
	}
	
	private boolean isRelatedTo(Concern concern, AllocationDegree allocDegree) {
	
		String expectedConcernName = concern.getName();
		String actualConcernName = getConcernFrom(allocDegree).getName();
		return expectedConcernName.equals(actualConcernName);
		
	}
	
	public PCMInstance getWeavedPCMInstanceOf(PCMInstance pcm) throws ConcernWeavingException, IOException {
		
		if (!WeavingManager.getInstance().isPresent()) {
			
			return pcm;
			
		}
		
		WeavingManager weavingManager = WeavingManager.getInstance().orElseThrow(() -> new ConcernWeavingException(ErrorMessage.weavingManagerIsNotInitialized()));
		this.wovenPCM = weavingManager.getWeavedPCMInstanceOf(this.concernWithSolutionPair.getFirst(), 
															  this.concernWithSolutionPair.getSecond(),
															  getECCAllocationMap());
		
		return wovenPCM;
		
	}
	
	private HashMap<ElementaryConcernComponent, ResourceContainer> getECCAllocationMap() {
		
		HashMap<ElementaryConcernComponent, ResourceContainer> eccAllocationMap = new HashMap<ElementaryConcernComponent, ResourceContainer>();
		for(ClassChoice eccClassChoice : this.eccClassChoices) {
			
			ElementaryConcernComponent ecc = (ElementaryConcernComponent) eccClassChoice.getDegreeOfFreedomInstance().getPrimaryChanged();
			ResourceContainer chosenResourceContainer = (ResourceContainer) eccClassChoice.getChosenValue();
			eccAllocationMap.put(ecc, chosenResourceContainer);
			
		}
		
		return eccAllocationMap;
		
	}

	public List<ClassChoice> getConvertedECCClassChoices() {
		
		if (!checkIfPCMInstanceWasWoven()) {
			
			return Collections.emptyList();
			
		}
		
		PcmAllocationManager allocManager = PcmAllocationManager.getInstanceBy(this.wovenPCM.getAllocation());
		List<ClassChoice> allocChoices = new ArrayList<ClassChoice>();
		
		for(ClassChoice eccClassChoice : this.eccClassChoices) {
			
			ElementaryConcernComponent ecc = (ElementaryConcernComponent) eccClassChoice.getDegreeOfFreedomInstance().getPrimaryChanged();
			ECCStructureHandler eccHandler = new ECCStructureHandler(ecc, ConcernSolutionManager.getInstanceBy(this.concernWithSolutionPair.getSecond()));
			eccHandler.getStructureOfECCAccordingTo(component -> Arrays.asList(component)).forEach(comp -> {
				
				try {
					
					AllocationContext alloc = allocManager.getAllocationContextContaining(comp);
					AllocationDegree ad = specificFactoryImpl.init().createAllocationDegree();
		            ad.setPrimaryChanged(alloc);
		            ClassChoice choice = designdecisionFactoryImpl.init().createClassChoice();
		    		choice.setDegreeOfFreedomInstance(ad);
		    		choice.setChosenValue(eccClassChoice.getChosenValue());
		    		allocChoices.add(choice);
		            
				} catch (Exception e) {
					
					//Can be ignored
				}
				
			});
			
		}
		
		return allocChoices;
		
	}

	private boolean checkIfPCMInstanceWasWoven() {
		
		return !(this.wovenPCM == null);
		
	}
	
}
