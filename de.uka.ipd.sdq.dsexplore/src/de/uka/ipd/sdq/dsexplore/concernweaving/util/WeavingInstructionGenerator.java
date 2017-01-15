package de.uka.ipd.sdq.dsexplore.concernweaving.util;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

import org.palladiosimulator.pcm.allocation.AllocationContext;
import org.palladiosimulator.pcm.repository.OperationProvidedRole;
import org.palladiosimulator.pcm.repository.RepositoryComponent;
import org.palladiosimulator.pcm.resourceenvironment.ResourceContainer;
import org.palladiosimulator.solver.models.PCMInstance;

import ConcernModel.AnnotationEnrich;
import ConcernModel.AnnotationTarget;
import ConcernModel.Concern;
import ConcernModel.ElementaryConcernComponent;
import TransformationModel.Transformation;
import de.uka.ipd.sdq.dsexplore.helper.EMFHelper;
import edu.kit.ipd.are.dsexplore.concern.concernweaver.WeavingInstruction;
import edu.kit.ipd.are.dsexplore.concern.concernweaver.WeavingLocation;
import edu.kit.ipd.are.dsexplore.concern.manager.ConcernManager;
import edu.kit.ipd.are.dsexplore.concern.manager.TransformationRepositoryManager;
import edu.kit.ipd.are.dsexplore.concern.util.AnnotationFilter;
import edu.kit.ipd.are.dsexplore.concern.util.Pair;
import edu.kit.ipd.are.dsexplore.concern.util.WeavingInstructionBuilder;

public class WeavingInstructionGenerator {

	private static WeavingInstructionGenerator instance = null;
	
	private PCMInstance pcmInstance;
	private ConcernManager concernManager;
	private HashMap<ElementaryConcernComponent, ResourceContainer> eccToResourceContainerMap;
	
	public static WeavingInstructionGenerator getInstanceBy(PCMInstance pcmInstance, Concern concern) {
		
		initialize(pcmInstance, concern, new HashMap<ElementaryConcernComponent, ResourceContainer>());
		
		return instance;
		
	}
	
	public static WeavingInstructionGenerator getInstanceBy(PCMInstance pcmInstance, Concern concern, HashMap<ElementaryConcernComponent, ResourceContainer> eccToResourceContainerMap) {
		
		initialize(pcmInstance, concern, eccToResourceContainerMap);
		
		return instance;
		
	}
	
	private static void initialize(PCMInstance pcmInstance, Concern concern, HashMap<ElementaryConcernComponent, ResourceContainer> eccToResourceContainerMap) {
		
		if (instance == null) {
			
			instance = new WeavingInstructionGenerator();
			
		}
		
		instance.pcmInstance = pcmInstance;
		instance.concernManager = ConcernManager.getBy(concern);
		instance.eccToResourceContainerMap = eccToResourceContainerMap;
		
	}
	
	public List<WeavingInstruction> getWeavingInstructions() {
		
		return generate();
		
	}
	
	public Optional<Set<ElementaryConcernComponent>> getIndirectlyUsedECCs(Set<ElementaryConcernComponent> usedECCs) {
		
		Set<ElementaryConcernComponent> indirectlyUsedECCs = getIndirectlyUsedECCsFrom(generate(), usedECCs);
		return indirectlyUsedECCs.isEmpty() ? Optional.empty() : Optional.of(indirectlyUsedECCs);
		
	}
	
	private Set<ElementaryConcernComponent> getIndirectlyUsedECCsFrom(List<WeavingInstruction> weavingInstructions, Set<ElementaryConcernComponent> usedECCs) {
		
		usedECCs.removeIf(ecc -> isContainedIn(weavingInstructions, ecc));
		return usedECCs;
		
	}

	private boolean isContainedIn(List<WeavingInstruction> weavingInstructions, ElementaryConcernComponent ecc) {
		
		return weavingInstructions.stream().anyMatch(eachWeavingInstruction -> eachWeavingInstruction.getECCWithConsumedFeatures().getFirst().equals(ecc));
		
	}

	private List<WeavingInstruction> generate() {
		
		List<WeavingInstruction> weavingInstructions = new ArrayList<WeavingInstruction>();
		AnnotationFilter annotationFilter = new AnnotationFilter(this.pcmInstance.getRepositories());
		
		annotationFilter.getTargetAnnotatedComponents().forEach(annotatedComponent -> {
			
			AnnotationTarget targetAnnotation = annotationFilter.getTargetAnnotationFrom(annotatedComponent).get();
			weavingInstructions.addAll(generateWeavingInstructionFrom(annotatedComponent, targetAnnotation));
			
		});
		
		return weavingInstructions;
		
	}
	
	private List<WeavingInstruction> generateWeavingInstructionFrom(RepositoryComponent annotatedComponent, AnnotationTarget targetAnnotation) {
		
		Pair<ElementaryConcernComponent, List<OperationProvidedRole>> eccWithRequiredFeatures = getECCWithRequiredFeaturesFrom(targetAnnotation);
		return getWeavingLocationsFrom(annotatedComponent, targetAnnotation).stream().map(eachWeavingLocation -> generateWeavingInstructionFrom(eccWithRequiredFeatures, 
																																				eachWeavingLocation, 
																																				annotatedComponent, 
																																				targetAnnotation))
																					 .collect(Collectors.toList());
		
	}
	
	private WeavingInstruction generateWeavingInstructionFrom(Pair<ElementaryConcernComponent, List<OperationProvidedRole>> eccWithRequiredFeatures,
															  WeavingLocation weavingLocation,
															  RepositoryComponent annotatedComponent,
															  AnnotationTarget targetAnnotation) {
		
		return new WeavingInstructionBuilder().setECCWithConsumedFeatures(eccWithRequiredFeatures)
				  							  .setResourceContainer(getResourceContainerFrom(eccWithRequiredFeatures.getFirst(), annotatedComponent))
				  							  .setTransformationStrategy(getTransformationStrategy(targetAnnotation))
				  							  .setWeavingLocation(weavingLocation)
				  							  .build();
		
	}

	private List<WeavingLocation> getWeavingLocationsFrom(RepositoryComponent annotatedComponent, AnnotationTarget targetAnnotation) {
		
		try {
			
			return new WeavingLocationHandler(pcmInstance).getWeavingLocationFrom(annotatedComponent, targetAnnotation);
			
		} catch (Exception e) {
			
			// TODO need to be handled
			return null;
		}
		
	}

	private Transformation getTransformationStrategy(AnnotationTarget targetAnnotation) {
		
		//This function is bijective.
		AnnotationEnrich enrichAnnotation = this.concernManager.getCorrespondingEnrichAnotationFrom(targetAnnotation).get(0);
		//TODO introduce exceptions
		//return TransformationRepositoryManager.getInstance().getTransformationBy(enrichAnnotation, targetAnnotation).orElseThrow(() -> new Exception());
		return TransformationRepositoryManager.getInstance().getTransformationBy(enrichAnnotation, targetAnnotation).get();
		
	}

	private ResourceContainer getResourceContainerFrom(ElementaryConcernComponent ecc, RepositoryComponent componentRelatedToECC) {
		
		return this.eccToResourceContainerMap.keySet().contains(ecc) ? this.eccToResourceContainerMap.get(ecc) : getDefaultResourceContainer(componentRelatedToECC);
		
	}

	private ResourceContainer getDefaultResourceContainer(RepositoryComponent componentRelatedToECC) {
		
		return this.pcmInstance.getAllocation().getAllocationContexts_Allocation().stream().filter(eachAllocationContext -> contains(componentRelatedToECC, eachAllocationContext))
																						   .map(eachAllocationContext -> eachAllocationContext.getResourceContainer_AllocationContext())
																						   .findFirst().get();
		
	}

	private boolean contains(RepositoryComponent component, AllocationContext allocationContext) {
		
		return EMFHelper.checkIdentity(allocationContext.getAssemblyContext_AllocationContext().getEncapsulatedComponent__AssemblyContext(), component);
		
	}
	
	private Pair<ElementaryConcernComponent, List<OperationProvidedRole>> getECCWithRequiredFeaturesFrom(AnnotationTarget targetAnnotation) {
		
		//TODO introduce exception
		//ElementaryConcernComponent ecc = this.concernManager.getCorrespondingECCFrom(targetAnnotation).orElseThrow(() -> new Exception());
		ElementaryConcernComponent ecc = this.concernManager.getCorrespondingECCFrom(targetAnnotation).get();
		//At this point all provided ecc features are going to be used
		return Pair.of(ecc, ecc.getPerimeterInterface());
		
	}
	
}
