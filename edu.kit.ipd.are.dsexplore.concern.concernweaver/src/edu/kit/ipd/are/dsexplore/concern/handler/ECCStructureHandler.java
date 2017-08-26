package edu.kit.ipd.are.dsexplore.concern.handler;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

import org.palladiosimulator.pcm.repository.RepositoryComponent;

import ConcernModel.Annotation;
import ConcernModel.AnnotationEnrich;
import ConcernModel.ElementaryConcernComponent;
import edu.kit.ipd.are.dsexplore.concern.manager.ConcernSolutionManager;

public class ECCStructureHandler {

	private final ElementaryConcernComponent ecc;
	private final ConcernSolutionManager concernRepositoryManager;

	public ECCStructureHandler(ElementaryConcernComponent ecc, ConcernSolutionManager concernRepositoryManager) {
		this.ecc = ecc;
		this.concernRepositoryManager = concernRepositoryManager;
	}

	public <T> List<T> getStructureOfECCAccordingTo(Function<RepositoryComponent, List<T>> resolvingFunction) {
		List<T> structure = new ArrayList<>();
		for (RepositoryComponent c : this.getAnnotatedComponents(false)) {
			for (T t : resolvingFunction.apply(c)) {
				structure.add(t);
			}
		}
		return structure;
		// return this.getAnnotatedComponents(false).flatMap(eachComponent ->
		// resolvingFunction.apply(eachComponent).stream()).collect(Collectors.toList());
	}

	public <T> List<T> getStructureOfECCAndRequiredAccordingTo(Function<RepositoryComponent, List<T>> resolvingFunction) {
		List<T> structure = new ArrayList<>();
		for (RepositoryComponent c : this.getAnnotatedComponents(true)) {
			for (T t : resolvingFunction.apply(c)) {
				structure.add(t);
			}
		}
		return structure;
		// return this.getAnnotatedComponents(true).flatMap(eachComponent ->
		// resolvingFunction.apply(eachComponent).stream()).collect(Collectors.toList());
	}

	private List<RepositoryComponent> getAnnotatedComponents(boolean considerRequired) {
		return this.concernRepositoryManager.getComponentsAnnotatedWith(this.getAnnotationsOfECC(considerRequired));
	}

	private List<Annotation> getAnnotationsOfECC(boolean considerRequired) {
		return !considerRequired ? this.getAnnotationsOf(this.ecc) : this.resolveAllAnnotationsOf(this.ecc);
	}

	private List<Annotation> resolveAllAnnotationsOf(ElementaryConcernComponent ecc) {
		List<Annotation> annotations = this.getAnnotationsOf(ecc);

		if (ecc.getRequires().isEmpty()) {
			return annotations;
		}
		List<Annotation> result = new ArrayList<>();
		for (ElementaryConcernComponent eccs : ecc.getRequires()) {
			List<Annotation> a = this.concat(annotations, this.resolveAllAnnotationsOf(eccs));
			result.addAll(a);
		}
		return result;
		// return ecc.getRequires().stream().flatMap(eachECC ->
		// this.concat(annotations,
		// this.resolveAllAnnotationsOf(eachECC))).collect(Collectors.toList());
	}

	private List<Annotation> concat(List<Annotation> annotations1, List<Annotation> annotations2) {
		List<Annotation> annotations = new ArrayList<>();
		annotations.addAll(annotations1);
		annotations.addAll(annotations2);
		return annotations;
		// return Stream.concat(annotations1.stream(), annotations2.stream());
	}

	private List<Annotation> getAnnotationsOf(ElementaryConcernComponent ecc) {
		List<Annotation> result = new ArrayList<>();
		for (AnnotationEnrich ae : ecc.getAnnotationenrich()) {
			result.add(ae);
		}
		return result;
		// return ecc.getAnnotationenrich().stream().map(each -> (Annotation)
		// each).collect(Collectors.toList());
	}
}
