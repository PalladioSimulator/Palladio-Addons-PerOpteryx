package de.uka.ipd.sdq.dsexplore.concernweaving.util;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.palladiosimulator.pcm.allocation.AllocationContext;
import org.palladiosimulator.pcm.repository.Interface;
import org.palladiosimulator.pcm.repository.ProvidedRole;
import org.palladiosimulator.pcm.repository.Repository;
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
import edu.kit.ipd.are.dsexplore.concern.emfprofilefilter.AnnotationFilter;
import edu.kit.ipd.are.dsexplore.concern.handler.ECCFeatureHandler;
import edu.kit.ipd.are.dsexplore.concern.manager.ConcernManager;
import edu.kit.ipd.are.dsexplore.concern.manager.PcmSystemManager;
import edu.kit.ipd.are.dsexplore.concern.manager.TransformationRepositoryManager;
import edu.kit.ipd.are.dsexplore.concern.util.Pair;
import edu.kit.ipd.are.dsexplore.concern.util.WeavingInstructionBuilder;

public class WeavingInstructionGenerator {

	private static WeavingInstructionGenerator instance = null;
	
	private PCMInstance pcmInstance;
	private ConcernManager concernManager;
	private ECCFeatureHandler featureHandler;
	private HashMap<ElementaryConcernComponent, ResourceContainer> eccToResourceContainerMap;
	
	public static WeavingInstructionGenerator getInstanceBy(PCMInstance pcmInstance, 
															Concern concern,
															Repository concernSolution) {
		
		initialize(pcmInstance, concern, concernSolution, new HashMap<ElementaryConcernComponent, ResourceContainer>());
		
		return instance;
		
	}
	
	public static WeavingInstructionGenerator getInstanceBy(PCMInstance pcmInstance, 
			   												Concern concern,
			   												Repository concernSolution,
			   												HashMap<ElementaryConcernComponent, ResourceContainer> eccToResourceContainerMap) {
		
		initialize(pcmInstance, concern, concernSolution, eccToResourceContainerMap);
		
		return instance;
		
	}
	
	private static void initialize(PCMInstance pcmInstance, 
								   Concern concern,
								   Repository concernSolution,
								   HashMap<ElementaryConcernComponent, ResourceContainer> eccToResourceContainerMap) {
		
		if (instance == null) {
			
			instance = new WeavingInstructionGenerator();
			
		}
		
		instance.pcmInstance = pcmInstance;
		instance.concernManager = ConcernManager.getBy(concern);
		instance.featureHandler = new ECCFeatureHandler(concernSolution);
		instance.eccToResourceContainerMap = eccToResourceContainerMap;
		
	}
	
//	private static TransformationRepository getTransformationRepoFrom(Repository concernSolution) {
//		
//		//TODO exception handling
//		List<EObject> transformations = EMFProfileFilter.getAllAnnotationsFrom(concernSolution, object -> object instanceof Transformation);
//		if (transformations.isEmpty()) {
//			
//			//throw new Exception(); 
//			
//		}
//		
//		return (TransformationRepository) transformations.get(0).eContainer();
//		
//	}

	public List<WeavingInstruction> getWeavingInstructions() {
		
		List<WeavingInstruction> weavingInstructions = new ArrayList<WeavingInstruction>();
		
		AnnotationFilter annotationFilter = new AnnotationFilter(this.pcmInstance.getRepositories());
		annotationFilter.getTargetAnnotatedComponents().forEach(annotatedComponent -> {
			
			AnnotationTarget targetAnnotation = annotationFilter.getTargetAnnotationFrom(annotatedComponent).get();
			weavingInstructions.addAll(generateWeavingInstructionFrom(annotatedComponent, targetAnnotation));
			
		});
		
		return weavingInstructions;
		
	}
	
	public Optional<Set<ElementaryConcernComponent>> getIndirectlyUsedECCs(Set<ElementaryConcernComponent> usedECCs) {
		
		Set<ElementaryConcernComponent> indirectlyUsedECCs = getIndirectlyUsedECCsFrom(getWeavingInstructions(), usedECCs);
		return indirectlyUsedECCs.isEmpty() ? Optional.empty() : Optional.of(indirectlyUsedECCs);
		
	}
	
	private Set<ElementaryConcernComponent> getIndirectlyUsedECCsFrom(List<WeavingInstruction> weavingInstructions, Set<ElementaryConcernComponent> usedECCs) {
		
		usedECCs.removeIf(ecc -> isContainedIn(weavingInstructions, ecc));
		return usedECCs;
		
	}

	private boolean isContainedIn(List<WeavingInstruction> weavingInstructions, ElementaryConcernComponent ecc) {
		
		return weavingInstructions.stream().anyMatch(eachWeavingInstruction -> eachWeavingInstruction.getECCWithConsumedFeatures().getFirst().equals(ecc));
		
	}
	
	private List<WeavingInstruction> generateWeavingInstructionFrom(RepositoryComponent annotatedComponent, AnnotationTarget targetAnnotation) {
		
		Pair<ElementaryConcernComponent, List<ProvidedRole>> eccWithRequiredFeatures = getECCWithRequiredFeaturesFrom(targetAnnotation);
		return getWeavingLocationsFrom(annotatedComponent, targetAnnotation).stream().map(eachWeavingLocation -> generateWeavingInstructionFrom(eccWithRequiredFeatures, 
																																				eachWeavingLocation, 
																																				annotatedComponent, 
																																				targetAnnotation))
																					 .collect(Collectors.toList());
		
	}
	
	private WeavingInstruction generateWeavingInstructionFrom(Pair<ElementaryConcernComponent, List<ProvidedRole>> eccWithRequiredFeatures,
															  WeavingLocation weavingLocation,
															  RepositoryComponent annotatedComponent,
															  AnnotationTarget targetAnnotation) {
		
		return new WeavingInstructionBuilder().setECCWithConsumedFeatures(eccWithRequiredFeatures)
				  							  .setResourceContainer(getResourceContainerFrom(eccWithRequiredFeatures.getFirst(), annotatedComponent))
				  							  .setTransformationStrategy(getTransformationStrategy(targetAnnotation))
				  							  .setWeavingLocation(weavingLocation)
				  							  .build();
		
	}

	private List<WeavingLocation> getWeavingLocationsFrom(RepositoryComponent component, AnnotationTarget targetAnnotation) {
		
		try {
			
			if (!isInstantiated(component)) {
				
				component = getInstantiatedAlternativeOf(component).get();
				
			}
			
			return new WeavingLocationHandler(pcmInstance).getWeavingLocationFrom(component, targetAnnotation);
			
		} catch (Exception e) {
			
			// TODO need to be handled
			return null;
		}
		
	}

	private boolean isInstantiated(RepositoryComponent component) {
		
		return !PcmSystemManager.getBy(this.pcmInstance.getSystem()).getAssemblyContextsInstantiating(component).get().isEmpty();
		
	}

	private Optional<RepositoryComponent> getInstantiatedAlternativeOf(RepositoryComponent component) {
		
		return getAllInstantiatedComponents().filter(eachInstantiatedComponent -> areFunctionalEqual(eachInstantiatedComponent, component))
											 .findFirst();
		
	}
	
	private boolean areFunctionalEqual(RepositoryComponent component1, RepositoryComponent component2) {
		
		List<ProvidedRole> providedRolesOfComponent1 = component1.getProvidedRoles_InterfaceProvidingEntity();
		List<ProvidedRole> providedRolesOfComponent2 = component2.getProvidedRoles_InterfaceProvidingEntity();
		if (providedRolesOfComponent1.size() != providedRolesOfComponent2.size()) {
			
			return false;
			
		}
		
		return providesSameInterfaces(providedRolesOfComponent1, providedRolesOfComponent2);
		
	}

	private boolean providesSameInterfaces(List<ProvidedRole> providedRoles1, List<ProvidedRole> providedRoles2) {
		
		List<Interface> interfacesOfProvidedRoles1 = toInterfaces(providedRoles1);
		List<Interface> interfacesOfProvidedRoles2 = toInterfaces(providedRoles2);
		
		List<Interface> copy = new ArrayList<Interface>(interfacesOfProvidedRoles1);
		copy.removeAll(interfacesOfProvidedRoles2);
		
		return copy.isEmpty();
		
	}

	private List<Interface> toInterfaces(List<ProvidedRole> providedRoles) {
		
		return providedRoles.stream().flatMap(eachProvidedRole -> eachProvidedRole.eCrossReferences().stream())
									 .filter(eachEObject -> eachEObject instanceof Interface)
									 .map(eachEObject -> (Interface) eachEObject)
									 .collect(Collectors.toList());
		
	}

	private Stream<RepositoryComponent> getAllInstantiatedComponents() {
		
		return this.pcmInstance.getSystem().getAssemblyContexts__ComposedStructure().stream().map(each -> each.getEncapsulatedComponent__AssemblyContext());
		
	}

	private Transformation getTransformationStrategy(AnnotationTarget targetAnnotation) {
		
		//TODO introduce exceptions
		TransformationRepositoryManager transManager = TransformationRepositoryManager.getInstance();
		//This function is bijective.
		AnnotationEnrich enrichAnnotation = transManager.getEnrichAnnotationBy(targetAnnotation).get();
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
	
	private Pair<ElementaryConcernComponent, List<ProvidedRole>> getECCWithRequiredFeaturesFrom(AnnotationTarget targetAnnotation) {
		
		//TODO introduce exception
		//ElementaryConcernComponent ecc = this.concernManager.getCorrespondingECCFrom(targetAnnotation).orElseThrow(() -> new Exception());
		AnnotationEnrich enrich = TransformationRepositoryManager.getInstance().getEnrichAnnotationBy(targetAnnotation).get();
		ElementaryConcernComponent ecc = this.concernManager.getElementaryConcernComponentBy(enrich).get();
		//At this point all provided ecc features are going to be used
		return Pair.of(ecc, this.featureHandler.getProvidedFeaturesOf(ecc));
		
	}
	
}
