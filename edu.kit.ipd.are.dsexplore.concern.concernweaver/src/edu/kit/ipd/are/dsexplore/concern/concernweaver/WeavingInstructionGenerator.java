package edu.kit.ipd.are.dsexplore.concern.concernweaver;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Random;
import java.util.function.UnaryOperator;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.modelversioning.emfprofileapplication.StereotypeApplication;
import org.palladiosimulator.pcm.core.composition.AssemblyContext;
import org.palladiosimulator.pcm.repository.Interface;
import org.palladiosimulator.pcm.repository.ProvidedRole;
import org.palladiosimulator.pcm.repository.RepositoryComponent;
import org.palladiosimulator.pcm.resourceenvironment.ResourceContainer;
import org.palladiosimulator.solver.models.PCMInstance;

import ConcernModel.AnnotationEnrich;
import ConcernModel.AnnotationTarget;
import ConcernModel.Concern;
import ConcernModel.ElementaryConcernComponent;
import SolutionModel.Solution;
import TransformationModel.Transformation;
import concernStrategy.Feature;
import de.uka.ipd.sdq.pcm.designdecision.Choice;
import de.uka.ipd.sdq.pcm.designdecision.FeatureChoice;
import de.uka.ipd.sdq.pcm.designdecision.specific.FeatureDegree;
import edu.kit.ipd.are.dsexplore.concern.emfprofilefilter.AnnotationFilter;
import edu.kit.ipd.are.dsexplore.concern.emfprofilefilter.EMFProfileFilter;
import edu.kit.ipd.are.dsexplore.concern.exception.ConcernWeavingException;
import edu.kit.ipd.are.dsexplore.concern.exception.ErrorMessage;
import edu.kit.ipd.are.dsexplore.concern.handler.ECCFeatureHandler;
import edu.kit.ipd.are.dsexplore.concern.manager.ConcernManager;
import edu.kit.ipd.are.dsexplore.concern.manager.PcmSystemManager;
import edu.kit.ipd.are.dsexplore.concern.manager.TransformationRepositoryManager;
import edu.kit.ipd.are.dsexplore.concern.util.EcoreReferenceResolver;
import edu.kit.ipd.are.dsexplore.concern.util.Pair;
import edu.kit.ipd.are.dsexplore.concern.util.WeavingInstructionBuilder;

/**
 * This class is responsible to derive all weaving instructions from an
 * annotated PCM model.
 *
 * @author scheerer
 *
 */
public class WeavingInstructionGenerator {

	private static WeavingInstructionGenerator instance = null;

	private PCMInstance pcmInstance;
	private ConcernManager concernManager;
	private ECCFeatureHandler featureHandler;
	private Map<ElementaryConcernComponent, ResourceContainer> eccToResourceContainerMap;

	/**
	 * Returns an already existing or newly created
	 * WeavingInstructionGenerator-instance.
	 *
	 * @param pcmInstance
	 *            - The annotated PCM model.
	 * @param concern
	 *            - The concern model.
	 * @param concernSolution
	 *            - The concern solution realizing a concern.
	 * @return a WeavingInsztructiongenerator-instance
	 */
	public static WeavingInstructionGenerator getInstanceBy(PCMInstance pcmInstance, Concern concern, Solution concernSolution) {
		WeavingInstructionGenerator.initialize(pcmInstance, concern, concernSolution, new HashMap<ElementaryConcernComponent, ResourceContainer>());
		return WeavingInstructionGenerator.instance;
	}

	/**
	 * Returns an already existing or newly created
	 * WeavingInstructionGenerator-instance.
	 *
	 * @param pcmInstance
	 *            - The annotated PCM model.
	 * @param concern
	 *            - The concern model.
	 * @param concernSolution
	 *            - The concern solution realizing a concern.
	 * @param eccToResourceContainerMap
	 *            - A mapping between an ECC and a resource container the ECC is
	 *            suppose to be allocated.
	 * @return a WeavingInsztructiongenerator-instance
	 */
	public static WeavingInstructionGenerator getInstanceBy(PCMInstance pcmInstance, Concern concern, Solution concernSolution,
			Map<ElementaryConcernComponent, ResourceContainer> eccToResourceContainerMap) {
		WeavingInstructionGenerator.initialize(pcmInstance, concern, concernSolution, eccToResourceContainerMap);
		return WeavingInstructionGenerator.instance;
	}

	private static void initialize(PCMInstance pcmInstance, Concern concern, Solution concernSolution, Map<ElementaryConcernComponent, ResourceContainer> eccToResourceContainerMap) {
		if (WeavingInstructionGenerator.instance == null) {
			WeavingInstructionGenerator.instance = new WeavingInstructionGenerator();
		}
		WeavingInstructionGenerator.instance.pcmInstance = pcmInstance;
		WeavingInstructionGenerator.instance.concernManager = ConcernManager.getInstanceBy(concern);
		WeavingInstructionGenerator.instance.featureHandler = new ECCFeatureHandler(concernSolution);
		WeavingInstructionGenerator.instance.eccToResourceContainerMap = eccToResourceContainerMap;

	}

	/**
	 * Derives all weaving instructions from the annotated PCM model.
	 *
	 * @param optChoice
	 *            all optional choices
	 * @param featureIndicators
	 * @return the generated weaving instructions.
	 *
	 * @throws ConcernWeavingException
	 *             - Will be thrown if an error occurs during the generation of
	 *             the weaving instructions.
	 */
	public List<WeavingInstruction> getWeavingInstructions(List<Pair<FeatureDegree, Choice>> optChoice) throws ConcernWeavingException {
		try {
			List<Pair<AnnotationTarget, WeavingLocation>> targetLocs = this.getWeavingLocationsFrom(this.getTargetAnnotatedElementPairs());
			List<WeavingInstruction> instructions = new ArrayList<>();
			for (Pair<AnnotationTarget, WeavingLocation> targetLoc : targetLocs) {
				instructions.add(this.generate(targetLoc));
			}
			this.applyOptionalAsDegree(optChoice, instructions);
			return instructions;
		} catch (Exception ex) {
			// TODO HERE Exception ... :(
			throw new ConcernWeavingException(ex.getMessage());
		}

	}

	/**
	 * Apply {@link FeatureDegree}-Choices to the {@link WeavingInstruction
	 * WeavingInstructions}.
	 *
	 * @param optChoice
	 *            the {@link FeatureDegree}-Choices
	 * @param instructions
	 *            the {@link WeavingInstruction WeavingInstructions}
	 * @author Dominik Fuchss
	 */
	private void applyOptionalAsDegree(List<Pair<FeatureDegree, Choice>> optChoice, List<WeavingInstruction> instructions) {
		if (optChoice == null) {
			return;
		}
		Iterator<WeavingInstruction> iter = instructions.iterator();
		while (iter.hasNext()) {
			WeavingInstruction instruct = iter.next();
			boolean deleteMe = this.checkDelete(instruct, optChoice);
			if (deleteMe) {
				iter.remove();
			}
		}
	}

	/**
	 * Check whether a {@link WeavingInstruction} shall be deleted because of an
	 * {@link FeatureDegree}-Choice.
	 *
	 * @param instruct
	 *            the {@link WeavingInstruction}
	 * @param optChoice
	 *            all {@link FeatureDegree}-Choices
	 * @return {@code true} if instruction shall deleted, {@code false}
	 *         otherwise
	 * @author Dominik Fuchss
	 */
	private boolean checkDelete(WeavingInstruction instruct, List<Pair<FeatureDegree, Choice>> optChoice) {
		Feature feature = this.getFeatureProvidedBy(instruct.getECCWithConsumedFeatures().getFirst());
		Object id = feature.getId();
		Choice ch = null;
		for (Pair<FeatureDegree, Choice> p : optChoice) {
			Feature cF = (Feature) p.getFirst().getPrimaryChanged();
			Object cId = cF.getId();
			if (id.equals(cId)) {
				ch = p.getSecond();
				break;
			}
		}

		if (ch == null) {
			return false;
		}
		return !((FeatureChoice) ch).isSelected();
	}

	///////////////////////////////////////
	// See edu.kit.ipd.are.dsexplore.concern.handler.ECCFeatureHandler
	private Feature getFeatureProvidedBy(ElementaryConcernComponent ecc) {
		StereotypeApplication stereotypeApplication = EMFProfileFilter.getStereotypeApplicationsFrom(ecc).get(0);
		return this.getFeatureFrom(stereotypeApplication).orElseGet(() -> null);
	}

	private Optional<Feature> getFeatureFrom(StereotypeApplication stereotypeApplication) {
		List<Feature> features = this.getFeaturesFrom(stereotypeApplication);
		return features.isEmpty() ? Optional.empty() : Optional.of(features.get(0));
	}

	private List<Feature> getFeaturesFrom(StereotypeApplication stereotypeApplication) {
		return new EcoreReferenceResolver(stereotypeApplication).getCrossReferencedElementsOfType(Feature.class);
	}

	////////////////////////////////////////////////

	private List<Pair<AnnotationTarget, WeavingLocation>> getWeavingLocationsFrom(List<Pair<AnnotationTarget, EObject>> targetAnnotatedElements) throws ConcernWeavingException {
		return new WeavingLocationHandler(this.pcmInstance).extractWeavingLocationsFrom(targetAnnotatedElements);
	}

	private List<Pair<AnnotationTarget, EObject>> getTargetAnnotatedElementPairs() throws ConcernWeavingException {
		return this.considerOnlyInstantiatedComponents(this.getUncheckedTargetAnnotatedElementPairs());
	}

	private List<Pair<AnnotationTarget, EObject>> getUncheckedTargetAnnotatedElementPairs() {
		List<EObject> annotatedElements = new AnnotationFilter(this.pcmInstance.getRepositories()).getTargetAnnotatedElements();
		List<Pair<AnnotationTarget, EObject>> targetsObjects = new ArrayList<>();
		for (EObject each : annotatedElements) {
			Pair<AnnotationTarget, EObject> pair = Pair.of(AnnotationFilter.getTargetAnnotationFrom(each).get(), each);
			targetsObjects.add(pair);
		}
		return targetsObjects;
		// return annotatedElements.map(each ->
		// Pair.of(AnnotationFilter.getTargetAnnotationFrom(each).get(),
		// each)).collect(Collectors.toList());

	}

	private List<Pair<AnnotationTarget, EObject>> considerOnlyInstantiatedComponents(List<Pair<AnnotationTarget, EObject>> annotatedElements) throws ConcernWeavingException {
		annotatedElements.replaceAll(this.nonInstantiatedComponents());
		return annotatedElements;
	}

	private UnaryOperator<Pair<AnnotationTarget, EObject>> nonInstantiatedComponents() throws ConcernWeavingException {
		try {
			return pair -> this.isComponent(pair.getSecond()) ? this.getInstantiatedComponentAndCheckException(pair) : pair;
		} catch (Exception ex) {
			throw new ConcernWeavingException(ex.getMessage());
		}
	}

	private boolean isComponent(EObject obj) {
		return obj instanceof RepositoryComponent;
	}

	private Pair<AnnotationTarget, EObject> getInstantiatedComponentAndCheckException(Pair<AnnotationTarget, EObject> pair) {
		try {
			return Pair.of(pair.getFirst(), this.getInstantiatedComponent((RepositoryComponent) pair.getSecond()));
		} catch (ConcernWeavingException ex) {
			throw new RuntimeException(ex);
		}
	}

	private EObject getInstantiatedComponent(RepositoryComponent component) throws ConcernWeavingException {
		if (this.isInstantiated(component)) {
			return component;
		}
		return this.getInstantiatedAlternativeOf(component).orElseThrow(() -> new ConcernWeavingException(ErrorMessage.missingInstantiation(component)));
	}

	private boolean isInstantiated(EObject object) {
		return !PcmSystemManager.getInstanceBy(this.pcmInstance.getSystem()).getAssemblyContextsInstantiating((RepositoryComponent) object).isEmpty();
	}

	private Optional<RepositoryComponent> getInstantiatedAlternativeOf(RepositoryComponent component) {
		for (RepositoryComponent rc : this.getAllInstantiatedComponents()) {
			if (this.ifFunctionalEqual(component, rc)) {
				return Optional.of(rc);
			}
		}
		return Optional.empty();
		// return
		// this.getAllInstantiatedComponents().filter(this.ifFunctionalEqual(component)).findFirst();
	}

	private boolean ifFunctionalEqual(RepositoryComponent component1, RepositoryComponent toTest) {
		boolean res = this.hasSameSizeOfProvidedRoles(toTest, component1);
		res &= this.areProvidingTheSameInterfaces(toTest.getProvidedRoles_InterfaceProvidingEntity(), component1.getProvidedRoles_InterfaceProvidingEntity());
		return res;
	}

	private boolean hasSameSizeOfProvidedRoles(RepositoryComponent component1, RepositoryComponent component2) {
		List<ProvidedRole> providedRolesOfComponent1 = component1.getProvidedRoles_InterfaceProvidingEntity();
		List<ProvidedRole> providedRolesOfComponent2 = component2.getProvidedRoles_InterfaceProvidingEntity();
		return providedRolesOfComponent1.size() == providedRolesOfComponent2.size();

	}

	private boolean areProvidingTheSameInterfaces(List<ProvidedRole> providedRoles1, List<ProvidedRole> providedRoles2) {
		List<Interface> interfacesOfProvidedRoles1 = this.toInterfaces(providedRoles1);
		List<Interface> interfacesOfProvidedRoles2 = this.toInterfaces(providedRoles2);

		List<Interface> copy = new ArrayList<>(interfacesOfProvidedRoles1);
		copy.removeAll(interfacesOfProvidedRoles2);
		return copy.isEmpty();
	}

	private List<Interface> toInterfaces(List<ProvidedRole> providedRoles) {
		List<Interface> interfaces = new ArrayList<>();
		for (ProvidedRole role : providedRoles) {
			List<EObject> crossRefs = role.eCrossReferences();
			for (EObject obj : crossRefs) {
				if (obj instanceof Interface) {
					interfaces.add((Interface) obj);
				}
			}
		}
		return interfaces;
		// return providedRoles.stream().flatMap(eachProvidedRole ->
		// eachProvidedRole.eCrossReferences().stream()).filter(eachEObject ->
		// eachEObject instanceof Interface)
		// .map(eachEObject -> (Interface)
		// eachEObject).collect(Collectors.toList());

	}

	private WeavingInstruction generate(Pair<AnnotationTarget, WeavingLocation> pair) {
		try {
			return this.generateWeavingInstructionFrom(this.getECCWithRequiredFeaturesFrom(pair.getFirst()), pair.getSecond(), pair.getFirst());
		} catch (ConcernWeavingException ex) {
			throw new RuntimeException(ex);
		}
	}

	private WeavingInstruction generateWeavingInstructionFrom(Pair<ElementaryConcernComponent, List<ProvidedRole>> eccWithRequiredFeatures, WeavingLocation weavingLocation,
			AnnotationTarget targetAnnotation) throws ConcernWeavingException {

		return new WeavingInstructionBuilder().setECCWithConsumedFeatures(eccWithRequiredFeatures).setResourceContainer(this.getResourceContainerFrom(eccWithRequiredFeatures.getFirst()))
				.setTransformationStrategy(this.getTransformationStrategy(targetAnnotation)).setWeavingLocation(weavingLocation).build();

	}

	private List<RepositoryComponent> getAllInstantiatedComponents() {
		List<RepositoryComponent> components = new ArrayList<>();
		EList<AssemblyContext> assembly = this.pcmInstance.getSystem().getAssemblyContexts__ComposedStructure();
		for (AssemblyContext ac : assembly) {
			RepositoryComponent c = ac.getEncapsulatedComponent__AssemblyContext();
			components.add(c);
		}
		return components;
		// return
		// this.pcmInstance.getSystem().getAssemblyContexts__ComposedStructure().stream().map(each
		// -> each.getEncapsulatedComponent__AssemblyContext());

	}

	private Transformation getTransformationStrategy(AnnotationTarget targetAnnotation) throws ConcernWeavingException {

		TransformationRepositoryManager transManager = TransformationRepositoryManager.getInstance();
		AnnotationEnrich enrichAnnotation = transManager.getEnrichAnnotationBy(targetAnnotation)
				.orElseThrow(() -> new ConcernWeavingException(ErrorMessage.missingAnnotationOpponent(targetAnnotation)));
		return TransformationRepositoryManager.getInstance().getTransformationBy(enrichAnnotation, targetAnnotation)
				.orElseThrow(() -> new ConcernWeavingException(ErrorMessage.missingTransformation(targetAnnotation, enrichAnnotation)));

	}

	private ResourceContainer getResourceContainerFrom(ElementaryConcernComponent ecc) {
		return this.eccToResourceContainerMap.keySet().contains(ecc) ? this.eccToResourceContainerMap.get(ecc) : this.getRandomResourceContainer();
	}

	private ResourceContainer getRandomResourceContainer() {
		int bound = this.pcmInstance.getResourceEnvironment().getResourceContainer_ResourceEnvironment().size();
		return this.pcmInstance.getResourceEnvironment().getResourceContainer_ResourceEnvironment().get(this.getRandomIndex(bound));
	}

	private int getRandomIndex(int bound) {
		return new Random(System.currentTimeMillis()).nextInt(--bound);
	}

	private Pair<ElementaryConcernComponent, List<ProvidedRole>> getECCWithRequiredFeaturesFrom(AnnotationTarget targetAnnotation) throws ConcernWeavingException {
		AnnotationEnrich enrich = this.getEnrichAnnotationBy(targetAnnotation);
		ElementaryConcernComponent ecc = this.getECCWith(enrich);
		// At this point all provided ecc features are going to be used
		return Pair.of(ecc, this.featureHandler.getProvidedFeaturesOf(ecc));
	}

	private AnnotationEnrich getEnrichAnnotationBy(AnnotationTarget target) throws ConcernWeavingException {
		return TransformationRepositoryManager.getInstance().getEnrichAnnotationBy(target).orElseThrow(() -> new ConcernWeavingException(ErrorMessage.missingAnnotationOpponent(target)));
	}

	private ElementaryConcernComponent getECCWith(AnnotationEnrich enrich) throws ConcernWeavingException {
		return this.concernManager.getElementaryConcernComponentBy(enrich).orElseThrow(() -> new ConcernWeavingException(ErrorMessage.missingECC(enrich)));
	}

}
