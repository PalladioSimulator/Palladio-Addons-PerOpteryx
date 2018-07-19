package edu.kit.ipd.are.dsexplore.featurecompletions.weaver.strategy.handler;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.function.Function;
import java.util.stream.Collectors;

import org.eclipse.emf.common.util.EList;
import org.palladiosimulator.pcm.repository.RepositoryComponent;

import FeatureCompletionModel.Complementum;
import FeatureCompletionModel.CompletionComponent;
import FeatureCompletionModel.impl.ComplementumImpl;
import de.uka.ipd.sdq.dsexplore.tools.stereotypeapi.StereotypeAPIHelper;
import edu.kit.ipd.are.dsexplore.featurecompletions.weaver.strategy.manager.SolutionManager;

public class FCCStructureHandler {

	private final CompletionComponent fcc;
	private final SolutionManager mergedRepoManager;

	public FCCStructureHandler(CompletionComponent fcc, SolutionManager mergedRepoManager) {
		this.fcc = fcc;
		this.mergedRepoManager = mergedRepoManager;
	}

	public <T> List<T> getStructureOfFCCAccordingTo(Function<RepositoryComponent, List<T>> resolvingFunction) {
		List<T> structure = new ArrayList<>();
		for (RepositoryComponent c : this.getAllAssociatedFCCs(false)) {
			for (T t : resolvingFunction.apply(c)) {
				structure.add(t);
			}
		}
		return structure;
		// return this.getAnnotatedComponents(false).flatMap(eachComponent ->
		// resolvingFunction.apply(eachComponent).stream()).collect(Collectors.toList());
	}
	
	//TODO new for extension
	public List<CompletionComponent> getFCCsRequiredBy(CompletionComponent fcc) {
		List<CompletionComponent> result = new ArrayList<CompletionComponent>();
		if (!fcc.getRequiredComponents().isEmpty()) {
			EList<CompletionComponent> requiredFCCs = fcc.getRequiredComponents();
			result.addAll(requiredFCCs);
			for (CompletionComponent completionComponent : requiredFCCs) {
				result.addAll(getFCCsRequiredBy(completionComponent));
			}
		}
		return result;
	}

	public <T> List<T> getStructureOfECCAndRequiredAccordingTo(Function<RepositoryComponent, List<T>> resolvingFunction) {
		List<T> structure = new ArrayList<>();
		for (RepositoryComponent c : this.getAllAssociatedFCCs(true)) {
			for (T t : resolvingFunction.apply(c)) {
				structure.add(t);
			}
		}
		return structure;
		// return this.getAnnotatedComponents(true).flatMap(eachComponent ->
		// resolvingFunction.apply(eachComponent).stream()).collect(Collectors.toList());
	}

	private List<RepositoryComponent> getAllAssociatedFCCs(boolean considerRequired) {
		return this.mergedRepoManager.getAffectedComponentsByFCCList(this.getAnnotationsOfECC(considerRequired));
	}

	private List<CompletionComponent> getAnnotationsOfECC(boolean considerRequired) {
		return !considerRequired ? Arrays.asList(this.fcc) : this.resolveAllFCCsOf(this.fcc);
	}

	private List<CompletionComponent> resolveAllFCCsOf(CompletionComponent fcc) {
		List<CompletionComponent> result = new ArrayList<>();
		Queue<CompletionComponent> queue = new LinkedList<>();

		queue.add(fcc);

		while (!queue.isEmpty()) {
			CompletionComponent peek = queue.poll();
			result.add(peek);
			queue.addAll(peek.getRequiredComponents());
		}

		return result;

	}

	/**
	 * @param realizingComponents
	 * @return
	 */
	public boolean requiresComplementa(List<RepositoryComponent> realizingComponents) {
		return realizingComponents.stream().anyMatch(component -> !StereotypeAPIHelper.getViaStereoTypeFrom(component, ComplementumImpl.class).stream().filter(compl -> compl.getClass().equals(ComplementumImpl.class)).collect(Collectors.toList()).isEmpty());
	}

	/**
	 * @param realizingComponents
	 * @return
	 */
	public List<RepositoryComponent> getRequiredComplementa(List<RepositoryComponent> realizingComponents) {
		List<RepositoryComponent> result = new ArrayList<RepositoryComponent>();
		for (RepositoryComponent repositoryComponent : realizingComponents) {
			List<ComplementumImpl> requiredComplementa = StereotypeAPIHelper.getViaStereoTypeFrom(repositoryComponent, ComplementumImpl.class);
			requiredComplementa = requiredComplementa.stream().filter(compl -> compl.getClass().equals(ComplementumImpl.class)).collect(Collectors.toList()); //TODO nur ComplementumImpl hier betrachten, keine ComplVisnetis
			if (!requiredComplementa.isEmpty()) {
				result.add(this.mergedRepoManager.getFulfillingComponentForComplementum(requiredComplementa.get(0))); //TODO mehrere Complementa?
			}
		}
		return result;
	}
}
