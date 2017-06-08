package edu.kit.ipd.are.dsexplore.concern.concernweaver;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Optional;
import java.util.Random;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.eclipse.emf.ecore.EObject;
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
import edu.kit.ipd.are.dsexplore.concern.emfprofilefilter.AnnotationFilter;
import edu.kit.ipd.are.dsexplore.concern.exception.ConcernWeavingException;
import edu.kit.ipd.are.dsexplore.concern.exception.ErrorMessage;
import edu.kit.ipd.are.dsexplore.concern.handler.ECCFeatureHandler;
import edu.kit.ipd.are.dsexplore.concern.manager.ConcernManager;
import edu.kit.ipd.are.dsexplore.concern.manager.PcmSystemManager;
import edu.kit.ipd.are.dsexplore.concern.manager.TransformationRepositoryManager;
import edu.kit.ipd.are.dsexplore.concern.util.Pair;
import edu.kit.ipd.are.dsexplore.concern.util.WeavingInstructionBuilder;

/**
 * This class is responsible to derive all weaving instructions from an annotated PCM model.
 * @author scheerer
 *
 */
public class WeavingInstructionGenerator {

	private static WeavingInstructionGenerator instance = null;
	
	private PCMInstance pcmInstance;
	private ConcernManager concernManager;
	private ECCFeatureHandler featureHandler;
	private HashMap<ElementaryConcernComponent, ResourceContainer> eccToResourceContainerMap;
	
	/**
	 * Returns an already existing or newly created WeavingInstructionGenerator-instance.
	 * @param pcmInstance - The annotated PCM model.
	 * @param concern - The concern model.
	 * @param concernSolution - The concern solution realizing a concern.
	 * @return a WeavingInsztructiongenerator-instance
	 */
	public static WeavingInstructionGenerator getInstanceBy(PCMInstance pcmInstance, 
															Concern concern,
															Repository concernSolution) {
		
		initialize(pcmInstance, concern, concernSolution, new HashMap<ElementaryConcernComponent, ResourceContainer>());
		
		return instance;
		
	}
	
	/**
	 * Returns an already existing or newly created WeavingInstructionGenerator-instance.
	 * @param pcmInstance - The annotated PCM model.
	 * @param concern - The concern model.
	 * @param concernSolution - The concern solution realizing a concern.
	 * @param eccToResourceContainerMap - A mapping between an ECC and a resource container the ECC is suppose to be allocated.
	 * @return a WeavingInsztructiongenerator-instance
	 */
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
		instance.concernManager = ConcernManager.getInstanceBy(concern);
		instance.featureHandler = new ECCFeatureHandler(concernSolution);
		instance.eccToResourceContainerMap = eccToResourceContainerMap;
		
	}

	/**
	 * Derives all weaving instructions from the annotated PCM model.
	 * @return the generated weaving instructions.
	 * @throws ConcernWeavingException - Will be thrown if an error occurs during the generation of the weaving instructions.
	 */
	public List<WeavingInstruction> getWeavingInstructions() throws ConcernWeavingException {
		
		try {
			
			return getWeavingLocationsFrom(getTargetAnnotatedElementPairs()).map(each -> generate(each))
																			.collect(Collectors.toList());
			
		} catch (Exception ex) {
			
			throw new ConcernWeavingException(ex.getMessage());
			
		}
		
	}

	private Stream<Pair<AnnotationTarget, WeavingLocation>> getWeavingLocationsFrom(List<Pair<AnnotationTarget, EObject>> targetAnnotatedElements) throws ConcernWeavingException {
		
		return new WeavingLocationHandler(this.pcmInstance).extractWeavingLocationsFrom(targetAnnotatedElements).stream();
		
	}

	private List<Pair<AnnotationTarget, EObject>> getTargetAnnotatedElementPairs() throws ConcernWeavingException {
		
		return considerOnlyInstantiatedComponents(getUncheckedTargetAnnotatedElementPairs());
		
	}
	
	private List<Pair<AnnotationTarget, EObject>> getUncheckedTargetAnnotatedElementPairs() {
		
		Stream<EObject> annotatedElements = new AnnotationFilter(this.pcmInstance.getRepositories()).getTargetAnnotatedElements().stream();
		return annotatedElements.map(each -> Pair.of(AnnotationFilter.getTargetAnnotationFrom(each).get(), each))
								.collect(Collectors.toList());
		
	}
	
	private List<Pair<AnnotationTarget, EObject>> considerOnlyInstantiatedComponents(List<Pair<AnnotationTarget, EObject>> annotatedElements) throws ConcernWeavingException {
		
		annotatedElements.replaceAll(nonInstantiatedComponents());
		return annotatedElements;
		
	}

	private UnaryOperator<Pair<AnnotationTarget, EObject>> nonInstantiatedComponents() throws ConcernWeavingException {
		
		try {
		
			return pair -> isComponent(pair.getSecond()) ? getInstantiatedComponentAndCheckException(pair) : pair;
			
		} catch (Exception ex) {
			
			throw new ConcernWeavingException(ex.getMessage());
			
		}
		
	}

	private boolean isComponent(EObject obj) {
		
		return obj instanceof RepositoryComponent;
		
	}

	private Pair<AnnotationTarget, EObject> getInstantiatedComponentAndCheckException(Pair<AnnotationTarget, EObject> pair) {
		
		try {
			
			return Pair.of(pair.getFirst(), getInstantiatedComponent((RepositoryComponent) pair.getSecond()));
			
		} catch (ConcernWeavingException ex) {
			
			throw new RuntimeException(ex);
		}
		
	}
	
	private EObject getInstantiatedComponent(RepositoryComponent component) throws ConcernWeavingException {
		
		if (isInstantiated(component)) {
			
			return component;
				
		}
		
		return getInstantiatedAlternativeOf(component).orElseThrow(() -> new ConcernWeavingException(ErrorMessage.missingInstantiation(component)));
		
	}

	private boolean isInstantiated(EObject object) {
		
		return !PcmSystemManager.getInstanceBy(this.pcmInstance.getSystem()).getAssemblyContextsInstantiating((RepositoryComponent) object).isEmpty();
		
	}
	
	private Optional<RepositoryComponent> getInstantiatedAlternativeOf(RepositoryComponent component) {
		
		return getAllInstantiatedComponents().filter(ifFunctionalEqual(component))
											 .findFirst();
		
	}

	private Predicate<RepositoryComponent> ifFunctionalEqual(RepositoryComponent component2) {
		
		return component1 -> hasSameSizeOfProvidedRoles(component1, component2) &&
						     areProvidingTheSameInterfaces(component1.getProvidedRoles_InterfaceProvidingEntity(), 
						    		 					   component2.getProvidedRoles_InterfaceProvidingEntity());	
		
	}
	
	private boolean hasSameSizeOfProvidedRoles(RepositoryComponent component1, RepositoryComponent component2) {
		
		List<ProvidedRole> providedRolesOfComponent1 = component1.getProvidedRoles_InterfaceProvidingEntity();
		List<ProvidedRole> providedRolesOfComponent2 = component2.getProvidedRoles_InterfaceProvidingEntity();
		return providedRolesOfComponent1.size() == providedRolesOfComponent2.size();
		
	}

	private boolean areProvidingTheSameInterfaces(List<ProvidedRole> providedRoles1, List<ProvidedRole> providedRoles2) {
		
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
	
	private WeavingInstruction generate(Pair<AnnotationTarget, WeavingLocation> pair)  {
		
		try {
			
			return generateWeavingInstructionFrom(getECCWithRequiredFeaturesFrom(pair.getFirst()), pair.getSecond(), pair.getFirst());
			
		} catch(ConcernWeavingException ex) {
			
			throw new RuntimeException(ex);
			
		}
	
		
	}
	
	private WeavingInstruction generateWeavingInstructionFrom(Pair<ElementaryConcernComponent, List<ProvidedRole>> eccWithRequiredFeatures,
															  WeavingLocation weavingLocation,
															  AnnotationTarget targetAnnotation) throws ConcernWeavingException {
		
		return new WeavingInstructionBuilder().setECCWithConsumedFeatures(eccWithRequiredFeatures)
				  							  .setResourceContainer(getResourceContainerFrom(eccWithRequiredFeatures.getFirst()))
				  							  .setTransformationStrategy(getTransformationStrategy(targetAnnotation))
				  							  .setWeavingLocation(weavingLocation)
				  							  .build();

		
	}

	private Stream<RepositoryComponent> getAllInstantiatedComponents() {
		
		return this.pcmInstance.getSystem().getAssemblyContexts__ComposedStructure().stream().map(each -> each.getEncapsulatedComponent__AssemblyContext());
		
	}

	private Transformation getTransformationStrategy(AnnotationTarget targetAnnotation) throws ConcernWeavingException {
		
		TransformationRepositoryManager transManager = TransformationRepositoryManager.getInstance();
		AnnotationEnrich enrichAnnotation = transManager.getEnrichAnnotationBy(targetAnnotation).orElseThrow(() -> new ConcernWeavingException(ErrorMessage.missingAnnotationOpponent(targetAnnotation)));
		return TransformationRepositoryManager.getInstance().getTransformationBy(enrichAnnotation, targetAnnotation).orElseThrow(() -> new ConcernWeavingException(ErrorMessage.missingTransformation(targetAnnotation, enrichAnnotation)));
		
	}

	private ResourceContainer getResourceContainerFrom(ElementaryConcernComponent ecc) {
		
		return this.eccToResourceContainerMap.keySet().contains(ecc) ? this.eccToResourceContainerMap.get(ecc) : getRandomResourceContainer();
		
	}

	private ResourceContainer getRandomResourceContainer() {
		
		int bound = this.pcmInstance.getResourceEnvironment().getResourceContainer_ResourceEnvironment().size();
		return this.pcmInstance.getResourceEnvironment().getResourceContainer_ResourceEnvironment().get(getRandomIndex(bound));
		
	}

	private int getRandomIndex(int bound) {
		
		return new Random(System.currentTimeMillis()).nextInt(--bound);
		
	}
	
	private Pair<ElementaryConcernComponent, List<ProvidedRole>> getECCWithRequiredFeaturesFrom(AnnotationTarget targetAnnotation) throws ConcernWeavingException {
		
		AnnotationEnrich enrich = getEnrichAnnotationBy(targetAnnotation);
		ElementaryConcernComponent ecc = getECCWith(enrich);
		//At this point all provided ecc features are going to be used
		return Pair.of(ecc, this.featureHandler.getProvidedFeaturesOf(ecc));
		
	}

	private AnnotationEnrich getEnrichAnnotationBy(AnnotationTarget target) throws ConcernWeavingException {
		
		return TransformationRepositoryManager.getInstance().getEnrichAnnotationBy(target)
											  .orElseThrow(() -> new ConcernWeavingException(ErrorMessage.missingAnnotationOpponent(target)));
		
	}
	
	private ElementaryConcernComponent getECCWith(AnnotationEnrich enrich) throws ConcernWeavingException {
		
		return this.concernManager.getElementaryConcernComponentBy(enrich)
								  .orElseThrow(() -> new ConcernWeavingException(ErrorMessage.missingECC(enrich)));
		
	}
	
}
