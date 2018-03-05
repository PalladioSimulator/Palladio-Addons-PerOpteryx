package edu.kit.ipd.are.dsexplore.concern.handler;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.function.Function;

import org.palladiosimulator.pcm.repository.RepositoryComponent;

import FeatureCompletionModel.CompletionComponent;
import edu.kit.ipd.are.dsexplore.concern.manager.ConcernSolutionManager;

public class FCCStructureHandler {

	private final CompletionComponent fcc;
	private final ConcernSolutionManager completionRepositoryManager;

	public FCCStructureHandler(CompletionComponent fcc, ConcernSolutionManager completionRepositoryManager) {
		this.fcc = fcc;
		this.completionRepositoryManager = completionRepositoryManager;
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

	public <T> List<T> getStructureOfECCAndRequiredAccordingTo(
			Function<RepositoryComponent, List<T>> resolvingFunction) {
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
		return this.completionRepositoryManager.getAffectedComponentsByFCCList(this.getAnnotationsOfECC(considerRequired));
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
		// return ecc.getRequires().stream().flatMap(eachECC ->
		// this.concat(annotations,
		// this.resolveAllAnnotationsOf(eachECC))).collect(Collectors.toList());
	}

	// private List<Annotation> getAnnotationsOf(CompletionComponent fcc) {
	// List<Annotation> result = new ArrayList<>();
	// for (AnnotationEnrich ae : ecc.getAnnotationenrich()) {
	// result.add(ae);
	// }
	// return result;
	// return ecc.getAnnotationenrich().stream().map(each -> (Annotation)
	// each).collect(Collectors.toList());
	// }
}
