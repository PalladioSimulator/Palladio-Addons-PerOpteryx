package de.uka.ipd.sdq.dsexplore.designdecisions.completions;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Set;

import org.palladiosimulator.pcm.core.composition.AssemblyContext;
import org.palladiosimulator.pcm.resourceenvironment.ResourceContainer;

import FeatureCompletionModel.CompletionComponent;
import FeatureCompletionModel.FeatureCompletion;
import FeatureCompletionModel.PerimeterProviding;
import de.uka.ipd.sdq.dsexplore.helper.StereotypeApiHelper;
import de.uka.ipd.sdq.pcm.designdecision.ClassChoice;
import de.uka.ipd.sdq.pcm.designdecision.designdecisionFactory;
import de.uka.ipd.sdq.pcm.designdecision.specific.AllocationDegree;
import de.uka.ipd.sdq.pcm.designdecision.specific.specificFactory;
import featureObjective.Feature;

public class FCCAllocDegreeDesignDecision {

	// private final FeatureCompletionManager concernManager;
	// private final ComponentsToBeWovenFilter annotationFilter;
	private final List<AssemblyContext> assemblies;
	private final FeatureCompletion featureCompletion;

	public FCCAllocDegreeDesignDecision(FeatureCompletion featureCompletion, List<AssemblyContext> assemblies) {
		// this.concernManager =
		// FeatureCompletionManager.getInstanceBy(featureCompletion);
		this.featureCompletion = featureCompletion;
		this.assemblies = assemblies;
		// this.annotationFilter = new ComponentsToBeWovenFilter(repositories);
	}

	public List<ClassChoice> getFCCClassChoicesFrom(List<ResourceContainer> availableResourceContainer) {
		List<CompletionComponent> fccs = this.getUsedFCCs();
		List<ClassChoice> choices = new ArrayList<>();
		for (CompletionComponent fcc : fccs) {
			ClassChoice c = this.toClassChoice(fcc, availableResourceContainer);
			choices.add(c);
		}
		return choices;
	}

	private List<Feature> getAllUsedFeatures() {
		Set<Feature> allFeatures = new HashSet<>();

		for (AssemblyContext assembly : this.assemblies) {
			List<Feature> featurePerAssembly = StereotypeApiHelper.getViaStereoTypeFrom(assembly, Feature.class);
			allFeatures.addAll(featurePerAssembly);
		}

		return new ArrayList<>(allFeatures);
	}

	private List<CompletionComponent> getUsedFCCs() {
		List<Feature> allUsedFeatures = this.getAllUsedFeatures();
		Set<CompletionComponent> usedFCCs = new HashSet<>();

		for (CompletionComponent c : this.featureCompletion.getCompletionComponents()) {
			PerimeterProviding pp = c.getPerimeterProviding();
			for (Feature ppf : pp.getFeatureProviding()) {
				if (allUsedFeatures.contains(ppf)) {
					usedFCCs.add(c);
				}
			}
		}

		Queue<CompletionComponent> queue = new LinkedList<>(usedFCCs);
		usedFCCs.clear();
		while (!queue.isEmpty()) {
			CompletionComponent currentC = queue.poll();
			if (usedFCCs.add(currentC)) {
				queue.addAll(currentC.getRequiredComponents());
			}

		}
		return new ArrayList<>(usedFCCs);
	}

	private AllocationDegree createAllocationDegreeWith(CompletionComponent fcc, List<ResourceContainer> availableResourceContainer) {
		AllocationDegree allocDegree = specificFactory.eINSTANCE.createAllocationDegree();
		allocDegree.setPrimaryChanged(fcc);
		allocDegree.getClassDesignOptions().addAll(availableResourceContainer);
		return allocDegree;
	}

	private ClassChoice toClassChoice(CompletionComponent fcc, List<ResourceContainer> availableResourceContainer) {
		AllocationDegree allocDegree = this.createAllocationDegreeWith(fcc, availableResourceContainer);
		ClassChoice choice = this.createClassChoiceWith(allocDegree);

		return this.deployOnRandomResourceContainer(choice, availableResourceContainer);
	}

	private ClassChoice createClassChoiceWith(AllocationDegree allocDegree) {
		ClassChoice choice = designdecisionFactory.eINSTANCE.createClassChoice();
		choice.setDegreeOfFreedomInstance(allocDegree);
		return choice;
	}

	private ClassChoice deployOnRandomResourceContainer(ClassChoice choice, List<ResourceContainer> availableResourceContainer) {
		choice.setChosenValue(availableResourceContainer.get(0));
		return choice;
	}

}
// private final FeatureCompletionManager concernManager;
// private final ComponentsToBeWovenFilter annotationFilter;
// private static final Random RANDOM = new SecureRandom();
//
// public FCCAllocDegreeDesignDecision(FeatureCompletion featureCompletion,
// List<Repository> repositories) {
// this.concernManager =
// FeatureCompletionManager.getInstanceBy(featureCompletion);
// this.annotationFilter = new ComponentsToBeWovenFilter(repositories);
// }
//
// public List<ClassChoice> getECCClassChoicesFrom(List<ResourceContainer>
// availableResourceContainer)
// throws ConcernWeavingException {
// List<CompletionComponent> fccs =
// this.getUsedFCCs().collect(Collectors.toList());
// List<ClassChoice> choices = new ArrayList<>();
// for (CompletionComponent fcc : fccs) {
// ClassChoice c = this.toClassChoice(fcc, availableResourceContainer);
// choices.add(c);
// }
// return choices;
// // return this.getUsedECCs().map(eachECC -> this.toClassChoice(eachECC,
// // availableResourceContainer)).collect(Collectors.toList());
// }
//
// private Stream<CompletionComponent> getUsedFCCs() throws
// ConcernWeavingException {
// // TODO Here add all possible optional ECC
// try {
// return this.getAllOccuringTargetAnnotations()
// .flatMap(targetAnnotation ->
// this.getFCCsRelatedTo(targetAnnotation)).distinct();
// } catch (Exception ex) {
// throw new ConcernWeavingException(ex.getMessage());
// }
// }
//
// private List<CompletionComponent> getFCCsRelatedTo(Feature targetFeature) {
//
// try {
// ComplementumVisnetis enrich = this.getEnrichAnnotationBy(target);
// return this.resolveAllRequiredFCCsFrom(this.getECCWith(enrich));
// } catch (ConcernWeavingException ex) {
// throw new RuntimeException(ex);
// }
//
// }
//
// private AnnotationEnrich getEnrichAnnotationBy(AnnotationTarget target)
// throws ConcernWeavingException {
// return
// TransformationRepositoryManager.getInstance().getEnrichAnnotationBy(target)
// .orElseThrow(() -> new
// ConcernWeavingException(ErrorMessage.missingAnnotationOpponent(target)));
// }
//
// private CompletionComponent getECCWith(AnnotationEnrich enrich) throws
// ConcernWeavingException {
// return this.concernManager.getElementaryConcernComponentBy(enrich)
// .orElseThrow(() -> new
// ConcernWeavingException(ErrorMessage.missingECC(enrich)));
// }
//
// private Stream<CompletionComponent>
// resolveAllRequiredFCCsFrom(CompletionComponent fcc) {
//
// if (fcc.getRequires().isEmpty()) {
// return Stream.of(fcc);
// }
//
// return Stream.concat(Stream.of(fcc), fcc.getRequires().stream()
// .flatMap(eachRequiredECC ->
// this.resolveAllRequiredFCCsFrom(eachRequiredECC)));
//
// }
//
// private Stream<AnnotationTarget> getAllOccuringTargetAnnotations() {
// return this.annotationFilter.getTargetAnnotatedElements().stream()
// .map(each ->
// ComponentsToBeWovenFilter.getTargetAnnotationFrom(each).get()).distinct();
// }
//
// private ClassChoice toClassChoice(CompletionComponent fcc,
// List<ResourceContainer> availableResourceContainer) {
// AllocationDegree allocDegree = this.createAllocationDegreeWith(fcc,
// availableResourceContainer);
// ClassChoice choice = this.createClassChoiceWith(allocDegree);
//
// return this.deployOnRandomResourceContainer(choice,
// availableResourceContainer);
// }
//
// private ClassChoice createClassChoiceWith(AllocationDegree allocDegree) {
// ClassChoice choice = designdecisionFactory.eINSTANCE.createClassChoice();
// choice.setDegreeOfFreedomInstance(allocDegree);
//
// return choice;
// }
//
//
// private ClassChoice deployOnRandomResourceContainer(ClassChoice choice,
// List<ResourceContainer> availableResourceContainer) {
// int index =
// FCCAllocDegreeDesignDecision.RANDOM.nextInt(availableResourceContainer.size());
// choice.setChosenValue(availableResourceContainer.get(index));
// return choice;
// }
