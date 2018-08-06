package de.uka.ipd.sdq.dsexplore.analysis.qes;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.eclipse.emf.ecore.EObject;
import org.modelversioning.emfprofile.Stereotype;
import org.modelversioning.emfprofileapplication.StereotypeApplication;
import org.palladiosimulator.mdsdprofiles.api.StereotypeAPI;
import org.palladiosimulator.pcm.allocation.AllocationContext;
import org.palladiosimulator.pcm.core.composition.AssemblyContext;
import org.palladiosimulator.pcm.core.composition.Connector;
import org.palladiosimulator.pcm.core.composition.impl.AssemblyConnectorImpl;
import org.palladiosimulator.pcm.core.composition.impl.ProvidedDelegationConnectorImpl;
import org.palladiosimulator.pcm.core.entity.Entity;
import org.palladiosimulator.pcm.repository.BasicComponent;
import org.palladiosimulator.pcm.repository.CompositeComponent;
import org.palladiosimulator.pcm.repository.InfrastructureProvidedRole;
import org.palladiosimulator.pcm.repository.InfrastructureRequiredRole;
import org.palladiosimulator.pcm.repository.OperationProvidedRole;
import org.palladiosimulator.pcm.repository.OperationRequiredRole;
import org.palladiosimulator.pcm.repository.ProvidedRole;
import org.palladiosimulator.pcm.repository.RepositoryComponent;
import org.palladiosimulator.pcm.repository.RequiredRole;
import org.palladiosimulator.pcm.resourceenvironment.ResourceContainer;
import org.palladiosimulator.pcm.subsystem.SubSystem;
import org.palladiosimulator.qes.qualityEffectSpecification.Annotation;
import org.palladiosimulator.qes.qualityEffectSpecification.Assembly;
import org.palladiosimulator.qes.qualityEffectSpecification.AssemblyType;
import org.palladiosimulator.qes.qualityEffectSpecification.ComponentProperty;
import org.palladiosimulator.qes.qualityEffectSpecification.ComponentSpecification;
import org.palladiosimulator.qes.qualityEffectSpecification.ComponentType;
import org.palladiosimulator.qes.qualityEffectSpecification.Identifier;
import org.palladiosimulator.qes.qualityEffectSpecification.Name;
import org.palladiosimulator.qes.qualityEffectSpecification.Resource;
import org.palladiosimulator.qes.qualityEffectSpecification.ResourceProperty;
import org.palladiosimulator.qes.qualityEffectSpecification.Role;
import org.palladiosimulator.qes.qualityEffectSpecification.RoleProperty;
import org.palladiosimulator.qes.qualityEffectSpecification.RoleType;
import org.palladiosimulator.qes.qualityEffectSpecification.Type;
import org.palladiosimulator.solver.models.PCMInstance;

import FeatureCompletionModel.ComplementumVisnetis;

public class QesFinder {

	private static DirectedGraph<RepositoryComponent> getComponentGraph(final PCMInstance instance) {
		final DirectedGraph<RepositoryComponent> componentGraph = new DirectedGraph<>();
		for (final Connector c : instance.getSystem().getConnectors__ComposedStructure()) {
			if (c instanceof AssemblyConnectorImpl) {
				final AssemblyConnectorImpl ac = (AssemblyConnectorImpl) c;
				// Requiring -> Providing | -( --> O-
				componentGraph.addEdge(
						ac.getRequiringAssemblyContext_AssemblyConnector().getEncapsulatedComponent__AssemblyContext(),
						ac.getProvidingAssemblyContext_AssemblyConnector().getEncapsulatedComponent__AssemblyContext());
			}
		}
		return componentGraph;
	}

	private static Set<RepositoryComponent> getInfrastructureRolls(final PCMInstance instance) {
		final Set<RepositoryComponent> components = new HashSet<RepositoryComponent>();
		for (final Connector c : instance.getSystem().getConnectors__ComposedStructure()) {
			if (c instanceof ProvidedDelegationConnectorImpl) {
				final ProvidedDelegationConnectorImpl dc = (ProvidedDelegationConnectorImpl) c;
				final AssemblyContext sc = dc.getAssemblyContext_ProvidedDelegationConnector();
				final RepositoryComponent rc = sc.getEncapsulatedComponent__AssemblyContext();
				components.add(rc);
			}
		}
		return Collections.unmodifiableSet(components);
	}

	private static Set<Entity> getRolesEntities(final RepositoryComponent component) {
		final Set<Entity> effectedComponents = new HashSet<>();

		component.getProvidedRoles_InterfaceProvidingEntity().forEach(effectedComponents::add);
		component.getRequiredRoles_InterfaceRequiringEntity().forEach(effectedComponents::add);

		return effectedComponents;
	}

	private static Map<ResourceContainer, Set<RepositoryComponent>> getServerMap(final PCMInstance instance) {
		final Map<ResourceContainer, Set<RepositoryComponent>> serverMap = new HashMap<>();
		for (final AllocationContext allocationContext : instance.getAllocation().getAllocationContexts_Allocation()) {
			final ResourceContainer container = allocationContext.getResourceContainer_AllocationContext();
			final RepositoryComponent component = allocationContext.getAssemblyContext_AllocationContext()
					.getEncapsulatedComponent__AssemblyContext();
			if (serverMap.containsKey(container)) {
				serverMap.get(container).add(component);
			} else {
				final HashSet<RepositoryComponent> componentSet = new HashSet<>();
				componentSet.add(component);
				serverMap.put(container, componentSet);
			}

		}
		return serverMap;
	}
	
	private static boolean isComponentProvided(final RepositoryComponent component) {
		if ((component == null) || (component.getProvidedRoles_InterfaceProvidingEntity() == null)) {
			return false;
		}

		for (final ProvidedRole role : component.getProvidedRoles_InterfaceProvidingEntity()) {
			if ((role != null) && (role instanceof OperationProvidedRole)) {
				return true;
			}
		}
		return false;
	}

	private static boolean isComponentRequired(final RepositoryComponent component) {
		if ((component == null) || (component.getRequiredRoles_InterfaceRequiringEntity() == null)) {
			return false;
		}

		for (final RequiredRole role : component.getRequiredRoles_InterfaceRequiringEntity()) {
			if ((role != null) && (role instanceof OperationRequiredRole)) {
				return true;
			}
		}
		return false;
	}

	private static boolean isInfrastructureProvided(final RepositoryComponent component) {
		if ((component == null) || (component.getProvidedRoles_InterfaceProvidingEntity() == null)) {
			return false;
		}

		for (final ProvidedRole role : component.getProvidedRoles_InterfaceProvidingEntity()) {
			if ((role != null) && (role instanceof InfrastructureProvidedRole)) {
				return true;
			}
		}
		return false;
	}

	private static boolean isInfrastructureRequired(final RepositoryComponent component) {
		if ((component == null) || (component.getRequiredRoles_InterfaceRequiringEntity() == null)) {
			return false;
		}

		for (final RequiredRole role : component.getRequiredRoles_InterfaceRequiringEntity()) {
			if ((role != null) && (role instanceof InfrastructureRequiredRole)) {
				return true;
			}
		}
		return false;
	}

	private final DirectedGraph<RepositoryComponent> componentGraph;
	private final Set<RepositoryComponent> infrastructure;
	private final Map<ResourceContainer, Set<RepositoryComponent>> serverMap;
	private final Map<String, Set<RepositoryComponent>> annotationMap;

	public QesFinder(final PCMInstance instance) {
		componentGraph = getComponentGraph(instance);
		System.err.println(componentGraph);
		serverMap = getServerMap(instance);
		System.err.println(serverMap);
		infrastructure = getInfrastructureRolls(instance);
		System.err.println(infrastructure);
		annotationMap = getAnnotationMap(instance);
		System.err.println(annotationMap);

	}

	private static void put(Map<String, Set<RepositoryComponent>> annotationMap, Set<String> annotations, RepositoryComponent component) {
		if(annotations == null || annotations.isEmpty()) {
			return;
		}
		for (String annotation : annotations) {
			if(annotation == null || annotation.length() == 0) {
				continue;
			}
			if(annotationMap.containsKey(annotation)) {
				annotationMap.get(annotation).add(component);
			} else {
				final Set<RepositoryComponent> components = new HashSet<RepositoryComponent>();
				components.add(component);
				annotationMap.put(annotation, components);
			}
		}
	}
	
	private static void put(Map<String, Set<RepositoryComponent>> annotationMap, RepositoryComponent component) {
		put(annotationMap, getAnnotatios(component), component);
	}
	
	private static void put(Map<String, Set<RepositoryComponent>> annotationMap, AssemblyConnectorImpl connector) {
		Set<String> annotations = getAnnotatios(connector);
		final RepositoryComponent requiring = connector.getRequiringAssemblyContext_AssemblyConnector().getEncapsulatedComponent__AssemblyContext();
		put(annotationMap, annotations, requiring);
		put(annotationMap, requiring);
		final RepositoryComponent providing = connector.getProvidingAssemblyContext_AssemblyConnector().getEncapsulatedComponent__AssemblyContext();
		put(annotationMap, annotations, providing);
		put(annotationMap, providing);
	}
	
	private static void put(Map<String, Set<RepositoryComponent>> annotationMap, ProvidedDelegationConnectorImpl connector) {
		Set<String> annotations = getAnnotatios(connector);
		final RepositoryComponent providing = connector.getAssemblyContext_ProvidedDelegationConnector().getEncapsulatedComponent__AssemblyContext();
		put(annotationMap, annotations, providing);
		put(annotationMap, providing);
	}
		
	private static Map<String, Set<RepositoryComponent>> getAnnotationMap(PCMInstance instance) {
		Map<String, Set<RepositoryComponent>> annotations = new HashMap<String, Set<RepositoryComponent>>();
		for (final Connector connector : instance.getSystem().getConnectors__ComposedStructure()) {
			if (connector instanceof AssemblyConnectorImpl) {
				put(annotations, (AssemblyConnectorImpl) connector);
			} else if (connector instanceof ProvidedDelegationConnectorImpl) {
				put(annotations, (ProvidedDelegationConnectorImpl) connector);
			}
		}
		return Collections.unmodifiableMap(annotations);
	}
	
	private static Set<String> getAnnotatios(EObject object) {
		if (StereotypeAPI.hasStereotypeApplications(object) == false) {
			return Collections.emptySet();
		}
		Set<String> annotatios = new HashSet<String>();
		for (final StereotypeApplication application : StereotypeAPI.getStereotypeApplications(object)) {
			annotatios.add(application.getStereotype().getName());
		}
		return Collections.unmodifiableSet(annotatios);
	}

	private Set<String> getComponents(final Annotation annotation) {
		if (annotationMap == null || annotationMap.isEmpty() || annotation == null) {
			return Collections.emptySet();
		}
		final String name = annotation.getAnnotation();
		if(name == null || name.length() == 0 || annotationMap.containsKey(name) == false) {
			return Collections.emptySet();
		}
		
		final Set<String> annotatedComponents = new HashSet<String>();
		for (RepositoryComponent component : annotationMap.get(name)) {
			annotatedComponents.add(component.getId());
		}
		
		final boolean isNot = annotation.isNot();
		if(isNot) {
			Set<String> notAnnotatedComponents = new HashSet<String>();
			for (RepositoryComponent component : componentGraph) {
				final String id = component.getId();
				if (annotatedComponents.contains(id) == false) {
					notAnnotatedComponents.add(id);
				}
			}
			return Collections.unmodifiableSet(notAnnotatedComponents);
		} 
		
		return Collections.unmodifiableSet(annotatedComponents);
	}
	

	
	private Set<String> getComponents(final Assembly assembly) {
		final Set<String> effectedComponents = new HashSet<>();

		final boolean isNot = assembly.isNot();
		final AssemblyType type = assembly.getType();
		
		final Set<String> assemblyComponents = getComponents(assembly.getComponent());
		if (assemblyComponents.isEmpty()) {
			return effectedComponents;
		}

		if (isNot && (type == AssemblyType.ANY)) {
			final Set<String> assembling = new HashSet<>();
			for (final RepositoryComponent component : componentGraph) {
				for (final String id : assemblyComponents) {
					if (id.equalsIgnoreCase(component.getId())) {
						for (final RepositoryComponent edge : componentGraph.edgesFrom(component)) {					
							assembling.add(edge.getId());
						}
					}
				}
			}
			
			for (final RepositoryComponent component : componentGraph) {
				boolean hasAssembly = false;
				for (final RepositoryComponent edge : componentGraph.edgesFrom(component)) {
					for (final String id : assemblyComponents) {
						if (id.equalsIgnoreCase(edge.getId())) {
							hasAssembly = true;
							break;
						}
					}
				}
				
				for (final String id : assembling) {
					if (id.equalsIgnoreCase(component.getId())) {
						hasAssembly = true;
						break;
					}
				}
				
				if(hasAssembly == false) { 
					effectedComponents.add(component.getId());
				}
			}
			return effectedComponents;
		}
		
		boolean provided = true;
		boolean required = true;

		if ((isNot && (type == AssemblyType.PROVIDED)) || ((isNot == false) && (type == AssemblyType.REQUIRED))) {
			provided = false;
		} else if ((isNot && (type == AssemblyType.REQUIRED))
				|| ((isNot == false) && (type == AssemblyType.PROVIDED))) {
			required = false;
		}

		if (required) {
			for (final RepositoryComponent component : componentGraph) {
				for (final RepositoryComponent edge : componentGraph.edgesFrom(component)) {
					boolean equals = false;
					for (final String id : assemblyComponents) {
						if (id.equalsIgnoreCase(edge.getId())) {
							equals = true;
							break;
						}
					}
					if (equals) {
						effectedComponents.add(component.getId());
					}
				}
			}
		}
		if (provided) {
			for (final RepositoryComponent component : componentGraph) {
				for (final String id : assemblyComponents) {
					if (id.equalsIgnoreCase(component.getId())) {
						for (final RepositoryComponent edge : componentGraph.edgesFrom(component)) {
							effectedComponents.add(edge.getId());
						}
						break;
					}
				}
			}

		}

		return effectedComponents;
	}

	private Set<RepositoryComponent> getComponents(final boolean isNot, final RoleType type) {
		final Set<RepositoryComponent> effectedComponents = new HashSet<>();

		if ((type == null) || (isNot && (type == RoleType.ANY))) {
			return effectedComponents; // not any?
		}

		if ((isNot && (type == RoleType.COMPONENT_REQUIRED_PROVIDED))
				|| ((isNot == false) && ((type == RoleType.INFRASTRUCTURE_REQUIRED) || (type == RoleType.INFRASTRUCTURE_PROVIDED)
						|| (type == RoleType.INFRASTRUCTURE_REQUIRED_PROVIDED)))) {
			return infrastructure;
		}

		for (final RepositoryComponent component : componentGraph) {
			if (type == RoleType.ANY) {
				effectedComponents.add(component);
				continue;
			}

			final boolean isComponentProvided = isComponentProvided(component);
			final boolean isComponentRequired = isComponentRequired(component);
			final boolean isInfrastructureProvided = isInfrastructureProvided(component);
			final boolean isInfrastructureRequired = isInfrastructureRequired(component);

			if ((isNot == false) && isComponentProvided
					&& ((type == RoleType.COMPONENT_PROVIDED) || (type == RoleType.COMPONENT_REQUIRED_PROVIDED))) {
				effectedComponents.add(component);
				continue;
			}
			if ((isNot == false) && isComponentRequired
					&& ((type == RoleType.COMPONENT_REQUIRED) || (type == RoleType.COMPONENT_REQUIRED_PROVIDED))) {
				effectedComponents.add(component);
				continue;
			}

			if ((isNot == false) && isInfrastructureProvided && ((type == RoleType.INFRASTRUCTURE_PROVIDED)
					|| (type == RoleType.INFRASTRUCTURE_REQUIRED_PROVIDED))) {
				effectedComponents.add(component);
				continue;
			}
			if ((isNot == false) && isInfrastructureRequired && ((type == RoleType.INFRASTRUCTURE_REQUIRED)
					|| (type == RoleType.INFRASTRUCTURE_REQUIRED_PROVIDED))) {
				effectedComponents.add(component);
				continue;
			}

			if (isNot
					&& ((type == RoleType.INFRASTRUCTURE_REQUIRED_PROVIDED)
							|| (type == RoleType.INFRASTRUCTURE_REQUIRED) || (type == RoleType.INFRASTRUCTURE_PROVIDED))
					&& (isComponentProvided || isComponentRequired)) {
				effectedComponents.add(component);
				continue;
			}

			if (isNot
					&& ((type == RoleType.COMPONENT_REQUIRED_PROVIDED) || (type == RoleType.COMPONENT_REQUIRED)
							|| (type == RoleType.COMPONENT_PROVIDED))
					&& (isInfrastructureProvided || isInfrastructureRequired)) {
				effectedComponents.add(component);
				continue;
			}

		}
		return effectedComponents;
	}

	private Set<String> getComponents(final ComponentProperty property) {
		final Set<String> effectedComponents = new HashSet<>();

		if (property == null) {
			return effectedComponents;
		}

		if (property instanceof Name) {
			return getComponents((Name) property);
		}

		if (property instanceof Identifier) {
			return getComponents((Identifier) property);
		}

		if (property instanceof Annotation) {
			return getComponents((Annotation) property);
		}

		if (property instanceof Type) {
			return getComponents((Type) property);
		}

		if (property instanceof Role) {
			return getComponents((Role) property);
		}

		if (property instanceof Assembly) {
			return getComponents((Assembly) property);
		}

		if (property instanceof Resource) {
			return getComponents((Resource) property);
		}

		return effectedComponents;
	}

	private Set<String> getComponents(final ComponentSpecification componentSpecifications) {
		final Set<String> effectedComponents = new HashSet<>();

		if ((componentSpecifications == null) || (componentSpecifications.getProperties() == null)
				|| componentSpecifications.getProperties().isEmpty()) {
			return effectedComponents;
		}

		for (final ComponentProperty property : componentSpecifications.getProperties()) {
			if (effectedComponents.isEmpty()) {
				effectedComponents.addAll(getComponents(property));
			} else {
				effectedComponents.retainAll(getComponents(property));
			}

			if (effectedComponents.isEmpty()) {
				break;
			}
		}

		return effectedComponents;
	}

	private Set<String> getComponents(final Identifier identifier) {
		final Set<String> effectedComponents = new HashSet<>();

		for (final RepositoryComponent component : componentGraph) {
			if (QesHelper.equalsIgnoreCase(component.getId(), identifier.isNot(), identifier.getId())) {
				effectedComponents.add(component.getId());
			}
		}

		return effectedComponents;
	}

	private Set<String> getComponents(final Name name) {
		final Set<String> effectedComponents = new HashSet<>();

		for (final RepositoryComponent component : componentGraph) {
			if (QesHelper.equalsIgnoreCase(component.getEntityName(), name.isNot(), name.getAutonym())) {
				effectedComponents.add(component.getId());
			}
		}

		return effectedComponents;
	}

	private Set<String> getComponents(final Resource resource) {
		final Set<String> effectedComponents = new HashSet<>();

		for (final Entity entity : serverMap.keySet()) {
			for (final ResourceProperty property : resource.getProperties()) {
				if (property instanceof Name) {
					if (QesHelper.equalsIgnoreCase(entity.getEntityName(), ((Name) property).isNot(),
							((Name) property).getAutonym())) {
						for (final RepositoryComponent component : serverMap.get(entity)) {
							effectedComponents.add(component.getId());
						}
					}
				} else if (property instanceof Identifier) {
					if (QesHelper.equalsIgnoreCase(entity.getId(), ((Identifier) property).isNot(),
							((Identifier) property).getId())) {
						for (final RepositoryComponent component : serverMap.get(entity)) {
							effectedComponents.add(component.getId());
						}
					}
				}
			}
		}

		return effectedComponents;
	}

	private Set<String> getComponents(final Role role) {
		final Set<String> effectedComponents = new HashSet<>();

		for (final RepositoryComponent component : getComponents(role.isNot(), role.getType())) {
			if(role.getProperties() == null || role.getProperties().isEmpty()) {
				effectedComponents.add(component.getId());
				continue;
			}
			for (final Entity entity : getRolesEntities(component)) {
				for (final RoleProperty property : role.getProperties()) {
					if (property instanceof Name) {
						if (QesHelper.equalsIgnoreCase(entity.getEntityName(), ((Name) property).isNot(),
								((Name) property).getAutonym())) {
							effectedComponents.add(component.getId());
						}

					}

					if (property instanceof Identifier) {
						if (QesHelper.equalsIgnoreCase(entity.getId(), ((Identifier) property).isNot(),
								((Identifier) property).getId())) {
							effectedComponents.add(component.getId());
						}
					}

					if (property instanceof Annotation) {
						if (StereotypeAPI.hasStereotypeApplications(property) == false) {
							continue;
						}
						for (final Stereotype stereotype : StereotypeAPI.getAppliedStereotypes(property)) {
							for (final EObject refs : stereotype.eCrossReferences()) {
								if ((refs instanceof ComplementumVisnetis) && QesHelper.equalsIgnoreCase(
										((ComplementumVisnetis) refs).getName(), ((Annotation) property).isNot(),
										((Annotation) property).getAnnotation())) {
									effectedComponents.add(component.getId());
								}
							}
						}
					}
				}
			}
		}

		return effectedComponents;
	}

	private Set<String> getComponents(final Type type) {
		final Set<String> effectedComponents = new HashSet<>();

		final boolean isNot = type.isNot();
		final ComponentType componentType = type.getType();
		if ((componentType == null) || ((componentType == ComponentType.ANY) && isNot)) { // NON
			return effectedComponents;
		}

		for (final RepositoryComponent component : componentGraph) {
			if ((componentType == ComponentType.ANY) && (isNot == false)) { // ANY
				effectedComponents.add(String.valueOf(component.getId()));
			} else if (((componentType == ComponentType.BASIC) && (isNot == false))
					|| ((componentType == ComponentType.COMPOSITE) && isNot)) { // BASIC
				if (component instanceof BasicComponent) {
					effectedComponents.add(String.valueOf(component.getId()));
				}
			} else if (((componentType == ComponentType.COMPOSITE) && (isNot == false))
					|| ((componentType == ComponentType.BASIC) && isNot)) { // COMPOSITE
				if ((component instanceof CompositeComponent) || (component instanceof SubSystem)) {
					effectedComponents.add(String.valueOf(component.getId()));
				}
			}
		}

		return effectedComponents;
	}

	public Set<String> getEffectedComponents(final List<ComponentSpecification> componentsSpecifications) {
		final Set<String> effectedComponents = new HashSet<>();

		if ((componentsSpecifications == null) || componentsSpecifications.isEmpty()) {
			return Collections.unmodifiableSet(effectedComponents);
		}

		for (final ComponentSpecification component : componentsSpecifications) {
			effectedComponents.addAll(getComponents(component));
		}

		return Collections.unmodifiableSet(effectedComponents);
	}

}
