package edu.kit.ipd.are.dsexplore.concern.util;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.eclipse.emf.ecore.EObject;
import org.palladiosimulator.pcm.core.composition.AssemblyContext;
import org.palladiosimulator.pcm.core.composition.DelegationConnector;
import org.palladiosimulator.pcm.system.System;

import de.uka.ipd.sdq.dsexplore.tools.stereotypeapi.StereotypeAPIHelper;
import featureObjective.Feature;

/**
 * This class is responsible to retrieve all components that are target
 * annotated or are affected by the target annotation of another object.
 *
 * @author max scheerer
 *
 */
public class ComponentResolver {

	private final System system;

	public ComponentResolver(System system) {
		this.system = system;
	}

	/**
	 * Retrieves only the components affected by the given target annotation of
	 * a specific element.
	 *
	 * @param target
	 *            - The target annotation which only needs to be considered.
	 * @return all components affected by a given target annotation.
	 */
	public List<AssemblyContext> getOnlyAffectedComponentsConsidering(Feature targetFeature) {
		List<EObject> allAffectedObjects = this.getAllElementsWithFeature(targetFeature);
		List<AssemblyContext> affectedAssemblyContexts = this.getAllAffectedAssemblyContextsBy(allAffectedObjects);
		List<AssemblyContext> indirectlyAffectedAssemblyContexts = this.getIndirectlyAffectedAssemblyContextsOf(allAffectedObjects);

		Set<AssemblyContext> result = new HashSet<>();
		result.addAll(affectedAssemblyContexts);
		result.addAll(indirectlyAffectedAssemblyContexts);
		return new ArrayList<>(result);
	}

	/*
	 * Retrieves all components affected by all target annotations of a specific
	 * element.
	 *
	 * @return all affected components.
	 */
	// public List<AssemblyContext> getAllAffectedAssemblyContexts() {
	// return
	// this.getAllAffectedAssemblyContextsBy(this.getAllTargetAnnotatedAssemblyContexts());
	// }

	private List<AssemblyContext> getAllAffectedAssemblyContextsBy(List<EObject> targetAnnotatedObjects) {
		List<AssemblyContext> result = new ArrayList<>();
		for (EObject o : targetAnnotatedObjects) {
			if (o instanceof AssemblyContext) {
				result.add((AssemblyContext) o);
			}
		}
		return result;
	}

	private List<EObject> getAllElementsWithFeature(Feature feature) {
		List<EObject> results = new ArrayList<>();
		Iterator<EObject> iterator = this.system.eAllContents();
		while (iterator.hasNext()) {
			EObject o = iterator.next();
			List<Feature> possibleFeatures = StereotypeAPIHelper.getViaStereoTypeFrom(o, Feature.class);
			if (possibleFeatures.contains(feature)) {
				results.add(o);
			}
		}
		return results;
	}

	// private List<AssemblyContext> getAllTargetAnnotatedAssemblyContexts() {
	// List<AssemblyContext> assemblies = new ArrayList<AssemblyContext>();
	// for (AssemblyContext assemblyContext :
	// this.system.getAssemblyContexts__ComposedStructure()) {
	// List<Feature> features =
	// StereotypeApiHelper.getViaStereoTypeFrom(assemblyContext, Feature.class);
	// if (features.size() > 0)
	// assemblies.add(assemblyContext);
	// }
	// return assemblies;
	// }

	// private List<AssemblyContext> getElementsAnnotatedWith(Feature
	// targetFeature) {
	// List<AssemblyContext> result = new ArrayList<>();
	// for (AssemblyContext ac : this.getAllTargetAnnotatedAssemblyContexts()) {
	// if (this.onlyElementsAnnotatedWith(ac, targetFeature)) {
	// result.add(ac);
	// }
	// }
	// return result;
	// // return
	// //
	// this.getAllTargetAnnotatedObjects().stream().filter(this.onlyElementsAnnotatedWith(target)).collect(Collectors.toList());
	//
	// }

	// private boolean onlyElementsAnnotatedWith(AssemblyContext ac, Feature
	// target) {
	// return StereotypeApiHelper.getViaStereoTypeFrom(ac,
	// Feature.class).contains(target);
	// }

	private List<AssemblyContext> getIndirectlyAffectedAssemblyContextsOf(List<EObject> targetAnnotatedObjects) {
		List<AssemblyContext> affectedAssemblyContexts = new ArrayList<>();
		for (EObject each : targetAnnotatedObjects) {
			if (each instanceof DelegationConnector) {
				List<AssemblyContext> to = ((DelegationConnector) each).getParentStructure__Connector().getAssemblyContexts__ComposedStructure();
				affectedAssemblyContexts.addAll(to);
			}
		}
		return affectedAssemblyContexts;
	}

	// private List<RepositoryComponent>
	// getComponentsWhichRequiredInterfacesContains(Signature signature) {
	// List<RepositoryComponent> result = new ArrayList<>();
	// for (RepositoryComponent c : this.getAllComponents()) {
	// if (this.componentsWhichRequiredInterfacesContains(signature).test(c)) {
	// result.add(c);
	// }
	// }
	// return result;
	// // return
	// //
	// this.getAllComponents().stream().filter(this.componentsWhichRequiredInterfacesContains(signature)).collect(Collectors.toList());
	// }

}
