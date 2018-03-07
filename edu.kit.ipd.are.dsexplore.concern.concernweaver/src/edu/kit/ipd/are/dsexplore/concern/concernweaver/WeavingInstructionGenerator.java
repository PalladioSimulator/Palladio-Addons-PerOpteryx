package edu.kit.ipd.are.dsexplore.concern.concernweaver;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Random;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.modelversioning.emfprofileapplication.StereotypeApplication;
import org.palladiosimulator.pcm.core.composition.AssemblyContext;
import org.palladiosimulator.pcm.repository.Interface;
import org.palladiosimulator.pcm.repository.OperationInterface;
import org.palladiosimulator.pcm.repository.OperationSignature;
import org.palladiosimulator.pcm.repository.ProvidedRole;
import org.palladiosimulator.pcm.repository.Repository;
import org.palladiosimulator.pcm.repository.RepositoryComponent;
import org.palladiosimulator.pcm.resourceenvironment.ResourceContainer;
import org.palladiosimulator.solver.models.PCMInstance;

import FeatureCompletionModel.ComplementumVisnetis;
import FeatureCompletionModel.CompletionComponent;
import FeatureCompletionModel.FeatureCompletion;
import de.uka.ipd.sdq.dsexplore.tools.stereotypeapi.EMFProfileFilter;
import de.uka.ipd.sdq.dsexplore.tools.stereotypeapi.EcoreReferenceResolver;
import de.uka.ipd.sdq.dsexplore.tools.stereotypeapi.StereotypeAPIHelper;
import de.uka.ipd.sdq.pcm.designdecision.Choice;
import de.uka.ipd.sdq.pcm.designdecision.FeatureChoice;
import de.uka.ipd.sdq.pcm.designdecision.specific.FeatureDegree;
import edu.kit.ipd.are.dsexplore.concern.exception.ConcernWeavingException;
import edu.kit.ipd.are.dsexplore.concern.exception.ErrorMessage;
import edu.kit.ipd.are.dsexplore.concern.handler.FCCFeatureHandler;
import edu.kit.ipd.are.dsexplore.concern.manager.FeatureCompletionManager;
import edu.kit.ipd.are.dsexplore.concern.manager.PcmSystemManager;
import edu.kit.ipd.are.dsexplore.concern.util.Pair;
import edu.kit.ipd.are.dsexplore.concern.util.WeavingInstructionBuilder;
import featureObjective.Feature;
import featureSolution.InclusionMechanism;

/**
 * This class is responsible to derive all weaving instructions from an
 * annotated PCM model.
 *
 * @author scheerer
 *
 */
public class WeavingInstructionGenerator {

	private static final Random RANDOM = new Random();

	private static WeavingInstructionGenerator instance = null;

	private PCMInstance pcmInstance;
	private FeatureCompletionManager concernManager;
	private FCCFeatureHandler featureHandler;
	private Map<CompletionComponent, ResourceContainer> eccToResourceContainerMap;
	private FeatureCompletion fc;
	private Repository mergedRepo;

	/**
	 * Returns an already existing or newly created
	 * WeavingInstructionGenerator-instance.
	 *
	 * @param pcmInstance
	 *            - The annotated PCM model.
	 * @param fc
	 *            - The concern model.
	 * @param concernSolution
	 *            - The concern solution realizing a concern.
	 * @return a WeavingInsztructiongenerator-instance
	 */
	public static WeavingInstructionGenerator getInstanceBy(PCMInstance pcmInstance, FeatureCompletion fc, Repository mergedRepo) {
		WeavingInstructionGenerator.initialize(pcmInstance, fc, mergedRepo, new HashMap<CompletionComponent, ResourceContainer>());
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
	public static WeavingInstructionGenerator getInstanceBy(PCMInstance pcmInstance, FeatureCompletion fc, Repository mergedRepo,
			Map<CompletionComponent, ResourceContainer> eccToResourceContainerMap) {
		WeavingInstructionGenerator.initialize(pcmInstance, fc, mergedRepo, eccToResourceContainerMap);
		return WeavingInstructionGenerator.instance;
	}

	private static void initialize(PCMInstance pcmInstance, FeatureCompletion fc, Repository mergedRepo, Map<CompletionComponent, ResourceContainer> eccToResourceContainerMap) {
		if (WeavingInstructionGenerator.instance == null) {
			WeavingInstructionGenerator.instance = new WeavingInstructionGenerator();
		}
		WeavingInstructionGenerator.instance.pcmInstance = pcmInstance;
		WeavingInstructionGenerator.instance.concernManager = FeatureCompletionManager.getInstanceBy(fc);
		WeavingInstructionGenerator.instance.featureHandler = new FCCFeatureHandler(mergedRepo);
		WeavingInstructionGenerator.instance.eccToResourceContainerMap = eccToResourceContainerMap;
		WeavingInstructionGenerator.instance.fc = fc;
		WeavingInstructionGenerator.instance.mergedRepo = mergedRepo;
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
		// TODO DTHF1 Check
		/*
		 * System pcmSystem = this.pcmInstance.getSystem(); List<Repository>
		 * pcmSolutionRepository =
		 * StereotypeAPIHelper.getViaStereoTypeFrom(pcmSystem,
		 * Repository.class);
		 */
		// TODO DTHF1 Fix merge. Stereotypes will be not accessible after merge
		// ..

		List<Repository> pcmSolutionRepository = Arrays.asList(this.mergedRepo);
		try {
			List<Pair<ComplementumVisnetis, WeavingLocation>> targetLocs = this.getWeavingLocationsFrom(this.getTargetAnnotatedElementPairs(pcmSolutionRepository));
			List<WeavingInstruction> instructions = new ArrayList<>();
			for (Pair<ComplementumVisnetis, WeavingLocation> targetLoc : targetLocs) {
				instructions.add(this.generate(targetLoc, pcmSolutionRepository));
			}
			this.applyOptionalAsDegree(optChoice, instructions);
			return instructions;
		} catch (Exception ex) {
			// Exception ... :(
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
		Feature feature = this.getViaStereoTypeFrom(instruct.getFCCWithConsumedFeatures().getFirst(), Feature.class).get(0);
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

	/**
	 * Find all referenced Elements by type and base
	 *
	 * @param base
	 *            the base (search location)
	 * @param target
	 *            the target type
	 * @return a list of Elements found
	 * @author Dominik Fuchss
	 */
	private <ElementType, Base extends EObject> List<ElementType> getViaStereoTypeFrom(Base base, Class<ElementType> target) {
		List<ElementType> res = new ArrayList<>();
		List<StereotypeApplication> appls = EMFProfileFilter.getStereotypeApplicationsFrom(base);
		for (StereotypeApplication appl : appls) {
			List<ElementType> provided = new EcoreReferenceResolver(appl).getCrossReferencedElementsOfType(target);
			res.addAll(provided);
		}
		return res;
	}

	private List<Pair<ComplementumVisnetis, WeavingLocation>> getWeavingLocationsFrom(List<Pair<ComplementumVisnetis, EObject>> targetAnnotatedElements) throws ConcernWeavingException {
		return new WeavingLocationHandler(this.pcmInstance).extractWeavingLocationsFrom(targetAnnotatedElements);
	}

	private List<Pair<ComplementumVisnetis, EObject>> getTargetAnnotatedElementPairs(List<Repository> pcmSolutionRepository) throws ConcernWeavingException {
		List<Pair<ComplementumVisnetis, EObject>> uncheckedCVAEP = this.getUncheckedComplementumVisnetisAnnotatedElementPairs(pcmSolutionRepository);
		return this.considerOnlyInstantiatedComponents(uncheckedCVAEP);
	}

	private List<Pair<ComplementumVisnetis, EObject>> getUncheckedComplementumVisnetisAnnotatedElementPairs(List<Repository> pcmSolutionRepository) {
		List<Pair<ComplementumVisnetis, EObject>> resultPair = new ArrayList<>();
		for (Repository pcmRepo : pcmSolutionRepository) {
			for (RepositoryComponent pcmSolutionRepoComponent : pcmRepo.getComponents__Repository()) {
				List<ComplementumVisnetis> solutionComponentAnnotatedComplVisnetis = StereotypeAPIHelper.getViaStereoTypeFrom(pcmSolutionRepoComponent, ComplementumVisnetis.class,
						"fulfillsComplementumVisnetis");
				for (ComplementumVisnetis solutionCV : solutionComponentAnnotatedComplVisnetis) {
					resultPair.add(new Pair<ComplementumVisnetis, EObject>(solutionCV, pcmSolutionRepoComponent));
				}
			}
			for (Interface pcmSolutionInterface : pcmRepo.getInterfaces__Repository()) {
				if (!(pcmSolutionInterface instanceof OperationInterface)) {
					continue;
				}
				OperationInterface pcmSolutionOperationInterface = (OperationInterface) pcmSolutionInterface;
				List<ComplementumVisnetis> solutionInterfaceAnnotatedComplVisnetis = StereotypeAPIHelper.getViaStereoTypeFrom(pcmSolutionOperationInterface, ComplementumVisnetis.class,
						"fulfillsComplementumVisnetis");
				for (ComplementumVisnetis solutionCV : solutionInterfaceAnnotatedComplVisnetis) {
					resultPair.add(new Pair<ComplementumVisnetis, EObject>(solutionCV, pcmSolutionOperationInterface));
				}

				for (OperationSignature pcmSolutionOperationSignature : pcmSolutionOperationInterface.getSignatures__OperationInterface()) {
					List<ComplementumVisnetis> solutionOperationSignatureAnnotatedComplVisnetis = StereotypeAPIHelper.getViaStereoTypeFrom(pcmSolutionOperationSignature, ComplementumVisnetis.class,
							"fulfillsComplementumVisnetis");
					for (ComplementumVisnetis solutionCV : solutionOperationSignatureAnnotatedComplVisnetis) {
						resultPair.add(new Pair<ComplementumVisnetis, EObject>(solutionCV, pcmSolutionOperationSignature));
					}
				}
			}
		}

		return resultPair;

	}

	private List<Pair<ComplementumVisnetis, EObject>> considerOnlyInstantiatedComponents(List<Pair<ComplementumVisnetis, EObject>> annotatedElements) throws ConcernWeavingException {
		List<Pair<ComplementumVisnetis, EObject>> result = new ArrayList<>();
		Iterator<Pair<ComplementumVisnetis, EObject>> iter = annotatedElements.iterator();
		Pair<ComplementumVisnetis, EObject> current;
		while (iter.hasNext()) {
			current = iter.next();
			if (!(current.getSecond() instanceof RepositoryComponent)) {
				result.add(current);
				continue;
			}
			Pair<ComplementumVisnetis, EObject> replace = Pair.of(current.getFirst(), this.getInstantiatedComponent((RepositoryComponent) current.getSecond()));
			result.add(replace);
		}
		annotatedElements.clear();
		annotatedElements.addAll(result);
		return annotatedElements;
	}

	private EObject getInstantiatedComponent(RepositoryComponent component) throws ConcernWeavingException {
		if (this.isInstantiated(component)) {
			return component;
		}
		Optional<RepositoryComponent> alternative = this.getInstantiatedAlternativeOf(component);
		return alternative.orElseThrow(() -> new ConcernWeavingException(ErrorMessage.missingInstantiation(component)));
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
	}

	private WeavingInstruction generate(Pair<ComplementumVisnetis, WeavingLocation> pair, List<Repository> solutionRepos) throws ConcernWeavingException {
		Pair<CompletionComponent, List<ProvidedRole>> fccWithReqFeatures = this.getFCCWithRequiredFeaturesFrom(pair.getFirst());
		return this.generateWeavingInstructionFrom(fccWithReqFeatures, pair.getSecond(), solutionRepos);

	}

	private CompletionComponent getFCCByVisnetis(ComplementumVisnetis cv) {
		String featureID = cv.getComplementaryFeature().getId();
		for (CompletionComponent fccCurrent : this.fc.getCompletionComponents()) {
			for (Feature fccCurrentProvidedFeature : fccCurrent.getPerimeterProviding().getFeatureProviding()) {
				if (fccCurrentProvidedFeature.getId().equalsIgnoreCase(featureID)) {
					return fccCurrent;
				}
			}
		}
		throw new ConcernWeavingException("No FCC found for Complementum Visnetis with ID " + cv.getId());
	}

	private Pair<CompletionComponent, List<ProvidedRole>> getFCCWithRequiredFeaturesFrom(ComplementumVisnetis cv) {
		CompletionComponent fcc = this.getFCCByVisnetis(cv);
		return Pair.of(fcc, this.featureHandler.getProvidedFeaturesOf(fcc));
	}

	private WeavingInstruction generateWeavingInstructionFrom(Pair<CompletionComponent, List<ProvidedRole>> fccWithRequiredFeatures, WeavingLocation wl, List<Repository> solutionRepos)
			throws ConcernWeavingException {

		ResourceContainer container = this.getResourceContainerFrom(fccWithRequiredFeatures.getFirst());
		InclusionMechanism im = this.getTransformationStrategy(solutionRepos);
		return new WeavingInstructionBuilder().setECCWithConsumedFeatures(fccWithRequiredFeatures).setResourceContainer(container).setTransformationStrategy(im).setWeavingLocation(wl).build();

	}

	private List<RepositoryComponent> getAllInstantiatedComponents() {
		List<RepositoryComponent> components = new ArrayList<>();
		EList<AssemblyContext> assembly = this.pcmInstance.getSystem().getAssemblyContexts__ComposedStructure();
		for (AssemblyContext ac : assembly) {
			RepositoryComponent c = ac.getEncapsulatedComponent__AssemblyContext();
			components.add(c);
		}
		return components;
	}

	private InclusionMechanism getTransformationStrategy(List<Repository> solutionRepos) throws ConcernWeavingException {
		InclusionMechanism inclusionMechanism = null;
		for (Repository solutionRepo : solutionRepos) {
			for (InclusionMechanism currentMechanism : StereotypeAPIHelper.getViaStereoTypeFrom(solutionRepo, InclusionMechanism.class)) {
				if (inclusionMechanism != null && !inclusionMechanism.getId().equalsIgnoreCase(currentMechanism.getId())) {
					throw new ConcernWeavingException("Multiple InclusionMechanisms currently not supported");
				} else {
					inclusionMechanism = currentMechanism;
				}
			}
		}
		return inclusionMechanism;
	}

	private ResourceContainer getResourceContainerFrom(CompletionComponent fcc) {
		return this.eccToResourceContainerMap.keySet().contains(fcc) ? this.eccToResourceContainerMap.get(fcc) : this.getRandomResourceContainer();
	}

	private ResourceContainer getRandomResourceContainer() {
		int bound = this.pcmInstance.getResourceEnvironment().getResourceContainer_ResourceEnvironment().size();
		return this.pcmInstance.getResourceEnvironment().getResourceContainer_ResourceEnvironment().get(this.getRandomIndex(bound));
	}

	private int getRandomIndex(int bound) {
		return WeavingInstructionGenerator.RANDOM.nextInt(--bound);
	}

}
