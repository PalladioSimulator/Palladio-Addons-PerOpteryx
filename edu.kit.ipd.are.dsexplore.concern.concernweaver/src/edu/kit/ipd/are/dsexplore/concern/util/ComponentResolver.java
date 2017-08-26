package edu.kit.ipd.are.dsexplore.concern.util;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.eclipse.emf.ecore.EObject;
import org.palladiosimulator.pcm.repository.Interface;
import org.palladiosimulator.pcm.repository.Repository;
import org.palladiosimulator.pcm.repository.RepositoryComponent;
import org.palladiosimulator.pcm.repository.Signature;

import ConcernModel.AnnotationTarget;
import edu.kit.ipd.are.dsexplore.concern.emfprofilefilter.AnnotationFilter;

/**
 * This class is responsible to retrieve all components that are target
 * annotated or are affected by the target annotation of another object.
 *
 * @author max scheerer
 *
 */
public class ComponentResolver {

	private final List<Repository> repositories;

	public ComponentResolver(List<Repository> repositories) {
		this.repositories = repositories;
	}

	/**
	 * Retrieves only the components affected by the given target annotation of
	 * a specific element.
	 *
	 * @param target
	 *            - The target annotation which only needs to be considered.
	 * @return all components affected by a given target annotation.
	 */
	public List<RepositoryComponent> getOnlyAffectedComponentsConsidering(AnnotationTarget target) {
		return this.getAllAffectedComponentsBy(this.getElementsAnnotatedWith(target));
	}

	/**
	 * Retrieves all components affected by all target annotations of a specific
	 * element.
	 *
	 * @return all affected components.
	 */
	public List<RepositoryComponent> getAllAffectedComponents() {
		return this.getAllAffectedComponentsBy(this.getAllTargetAnnotatedObjects());
	}

	private List<RepositoryComponent> getAllAffectedComponentsBy(List<EObject> targetAnnotatedObjects) {
		return Stream.concat(this.getAnnotatedComponentsOf(targetAnnotatedObjects), this.getInderectlyAffectedComponentsOf(targetAnnotatedObjects)).collect(Collectors.toList());
	}

	private List<EObject> getAllTargetAnnotatedObjects() {
		return new AnnotationFilter(this.repositories).getTargetAnnotatedElements();
	}

	private List<EObject> getElementsAnnotatedWith(AnnotationTarget target) {
		List<EObject> result = new ArrayList<>();
		for (EObject o : this.getAllTargetAnnotatedObjects()) {
			if (this.onlyElementsAnnotatedWith(target).test(o)) {
				result.add(o);
			}
		}
		return result;
		// return
		// this.getAllTargetAnnotatedObjects().stream().filter(this.onlyElementsAnnotatedWith(target)).collect(Collectors.toList());

	}

	private Predicate<EObject> onlyElementsAnnotatedWith(AnnotationTarget target) {
		return obj -> AnnotationFilter.getTargetAnnotationFrom(obj).get().getName().equals(target.getName());
	}

	private Stream<RepositoryComponent> getAnnotatedComponentsOf(List<EObject> targetAnnotatedObjects) {
		return targetAnnotatedObjects.stream().filter(each -> each instanceof RepositoryComponent).map(each -> (RepositoryComponent) each);
	}

	private Stream<RepositoryComponent> getInderectlyAffectedComponentsOf(List<EObject> targetAnnotatedObjects) {
		List<RepositoryComponent> affectedComponents = new ArrayList<>();
		for (EObject each : targetAnnotatedObjects) {
			if (each instanceof Signature) {
				affectedComponents.addAll(this.getComponentsWhichRequiredInterfacesContains((Signature) each));
			}
		}
		return affectedComponents.stream();
	}

	private List<RepositoryComponent> getComponentsWhichRequiredInterfacesContains(Signature signature) {
		List<RepositoryComponent> result = new ArrayList<>();
		for (RepositoryComponent c : this.getAllComponents()) {
			if (this.componentsWhichRequiredInterfacesContains(signature).test(c)) {
				result.add(c);
			}
		}
		return result;
		// return
		// this.getAllComponents().stream().filter(this.componentsWhichRequiredInterfacesContains(signature)).collect(Collectors.toList());
	}

	private List<RepositoryComponent> getAllComponents() {
		List<RepositoryComponent> result = new ArrayList<>();
		for (Repository c : this.repositories) {
			List<RepositoryComponent> cmps = c.getComponents__Repository();
			result.addAll(cmps);
		}
		return result;
		// return this.repositories.stream().flatMap(each ->
		// each.getComponents__Repository().stream()).collect(Collectors.toList());
	}

	private Predicate<RepositoryComponent> componentsWhichRequiredInterfacesContains(Signature signature) {
		return component -> this.getRequiredInterfacesOf(component).stream().anyMatch(each -> ConcernWeaverUtil.areEqual(each, signature.eContainer()));
	}

	private List<Interface> getRequiredInterfacesOf(RepositoryComponent component) {
		return component.getRequiredRoles_InterfaceRequiringEntity().stream().map(each -> ConcernWeaverUtil.getInterfaceFrom(each).get()).collect(Collectors.toList());
	}

}
