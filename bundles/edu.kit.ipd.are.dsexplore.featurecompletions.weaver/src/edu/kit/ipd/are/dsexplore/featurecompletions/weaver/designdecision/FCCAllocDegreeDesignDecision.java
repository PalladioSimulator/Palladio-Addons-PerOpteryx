package edu.kit.ipd.are.dsexplore.featurecompletions.weaver.designdecision;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Set;

import org.palladiosimulator.pcm.core.composition.Connector;
import org.palladiosimulator.pcm.resourceenvironment.ResourceContainer;
import org.palladiosimulator.pcm.system.System;

import FeatureCompletionModel.ComplementumVisnetis;
import FeatureCompletionModel.CompletionComponent;
import FeatureCompletionModel.FeatureCompletion;
import FeatureCompletionModel.PerimeterProviding;
import de.uka.ipd.sdq.dsexplore.tools.stereotypeapi.StereotypeAPIHelper;
import de.uka.ipd.sdq.pcm.designdecision.ClassChoice;
import de.uka.ipd.sdq.pcm.designdecision.designdecisionFactory;
import de.uka.ipd.sdq.pcm.designdecision.specific.AllocationDegree;
import de.uka.ipd.sdq.pcm.designdecision.specific.specificFactory;
import featureObjective.Feature;

public class FCCAllocDegreeDesignDecision {

	// private final FeatureCompletionManager concernManager;
	// private final ComponentsToBeWovenFilter annotationFilter;
	private final System system;
	private final FeatureCompletion featureCompletion;

	public FCCAllocDegreeDesignDecision(FeatureCompletion featureCompletion, System system) {
		// this.concernManager =
		// FeatureCompletionManager.getInstanceBy(featureCompletion);
		this.featureCompletion = featureCompletion;
		this.system = system;
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

		for (Connector assembly : this.system.getConnectors__ComposedStructure()) {
			List<ComplementumVisnetis> cvs = StereotypeAPIHelper.getViaStereoTypeFrom(assembly, ComplementumVisnetis.class);
			for (ComplementumVisnetis cv : cvs) {
				if (cv.getComplementaryFeature() != null) {
					allFeatures.add(cv.getComplementaryFeature());
				}
			}

		}

		return new ArrayList<>(allFeatures);
	}

	private List<CompletionComponent> getUsedFCCs() {
		List<Feature> allUsedFeatures = this.getAllUsedFeatures();
		Set<CompletionComponent> usedFCCs = new HashSet<>();

		for (CompletionComponent c : this.featureCompletion.getCompletionComponents()) {
			PerimeterProviding pp = c.getPerimeterProviding();
			if (pp == null) {
				continue;
			}
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
