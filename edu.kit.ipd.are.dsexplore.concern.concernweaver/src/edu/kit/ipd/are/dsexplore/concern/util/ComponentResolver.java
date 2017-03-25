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
 * This class is responsible to retrieve all components that are target annotated or are
 * affected by the target annotation of another object. 
 * @author max scheerer
 *
 */
public class ComponentResolver {

	private final List<Repository> repositories;
	
	public ComponentResolver(List<Repository> repositories) {
		
		this.repositories = repositories;
		
	}
	
	/**
	 * Retrieves only the components affected by the given target annotation of a specific element.
	 * @param target - The target annotation which only needs to be considered.
	 * @return all components affected by a given target annotation.
	 */
	public List<RepositoryComponent> getOnlyAffectedComponentsConsidering(AnnotationTarget target) {
		
		return getAllAffectedComponentsBy(getElementsAnnotatedWith(target));
		
	}

	/**
	 * Retrieves all components affected by all target annotations of a specific element.
	 * @return all affected components.
	 */
	public List<RepositoryComponent> getAllAffectedComponents() {
		
		return getAllAffectedComponentsBy(getAllTargetAnnotatedObjects());
		
	}
	
	private List<RepositoryComponent> getAllAffectedComponentsBy(List<EObject> targetAnnotatedObjects) {
		
		return Stream.concat(getAnnotatedComponentsOf(targetAnnotatedObjects), 
				 			 getInderectlyAffectedComponentsOf(targetAnnotatedObjects))
					 .collect(Collectors.toList());
		
	}

	private List<EObject> getAllTargetAnnotatedObjects() {
		
		return new AnnotationFilter(this.repositories).getTargetAnnotatedElements();
		
	}
	
	private List<EObject> getElementsAnnotatedWith(AnnotationTarget target) {
		
		return getAllTargetAnnotatedObjects().stream().filter(onlyElementsAnnotatedWith(target))
													  .collect(Collectors.toList());
		
	}

	private Predicate<EObject> onlyElementsAnnotatedWith(AnnotationTarget target) {
		
		return obj -> AnnotationFilter.getTargetAnnotationFrom(obj).get().getName().equals(target.getName());
		
	}
	
	private Stream<RepositoryComponent> getAnnotatedComponentsOf(List<EObject> targetAnnotatedObjects) {
		
		return targetAnnotatedObjects.stream().filter(each -> each instanceof RepositoryComponent)
											  .map(each -> (RepositoryComponent) each);
		
	}

	private Stream<RepositoryComponent> getInderectlyAffectedComponentsOf(List<EObject> targetAnnotatedObjects) {
		
		List<RepositoryComponent> affectedComponents = new ArrayList<RepositoryComponent>();
		for (EObject each : targetAnnotatedObjects) {
			
			if (each instanceof Signature) {
				
				affectedComponents.addAll(getComponentsWhichRequiredInterfacesContains((Signature) each));
				
			}
			
		}
		
		return affectedComponents.stream();
		
	}

	private List<RepositoryComponent> getComponentsWhichRequiredInterfacesContains(Signature signature) {
		
		return getAllComponents().stream().filter(componentsWhichRequiredInterfacesContains(signature))
										  .collect(Collectors.toList());
		
	}

	private List<RepositoryComponent> getAllComponents() {
		
		return this.repositories.stream().flatMap(each -> each.getComponents__Repository().stream())
										 .collect(Collectors.toList());
		
	}
	
	private Predicate<RepositoryComponent> componentsWhichRequiredInterfacesContains(Signature signature) {
		
		return component -> getRequiredInterfacesOf(component).stream().anyMatch(each -> ConcernWeaverUtil.areEqual(each, (Interface) signature.eContainer()));
		
	}

	private List<Interface> getRequiredInterfacesOf(RepositoryComponent component) {
		
		return component.getRequiredRoles_InterfaceRequiringEntity().stream().map(each -> ConcernWeaverUtil.getInterfaceFrom(each).get())
																			 .collect(Collectors.toList());
		
	}
	
}
