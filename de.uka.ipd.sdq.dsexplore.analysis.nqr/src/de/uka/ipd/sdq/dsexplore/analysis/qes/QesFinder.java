package de.uka.ipd.sdq.dsexplore.analysis.qes;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.palladiosimulator.pcm.core.composition.Connector;
import org.palladiosimulator.pcm.core.composition.impl.AssemblyConnectorImpl;
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
import de.uka.ipd.sdq.dsexplore.analysis.nqr.graph.DirectedGraph;

public class QesFinder {

    private static final String WILDCARD = "_";

    private final DirectedGraph<RepositoryComponent> componentGraph;
    private final Map<Entity, List<RepositoryComponent>> serverMap;

    public QesFinder(final PCMInstance instance) {
        componentGraph = getComponentGraph(instance);
        serverMap = getServerMap(instance);
    }

    private static Map<Entity, List<RepositoryComponent>> getServerMap(final PCMInstance instance) {
        final Map<Entity, List<RepositoryComponent>> serverMap = new HashMap<>();
        // instance.getAllocation().getAllocationContexts_Allocation().get(0).getAllocation_AllocationContext().get
        // instance.getRe
        // instance.getAllocation().getSystem_Allocation(); // TODO
        return serverMap;
    }

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

    private static boolean equalsIgnoreCase(final Object o1, final boolean isNot, final Object o2) {
        final String s1 = String.valueOf(o1);
        final String s2 = String.valueOf(o2);
        return s1.equalsIgnoreCase(WILDCARD) || s2.equalsIgnoreCase(WILDCARD) || (isNot != s1.equalsIgnoreCase(s2));
    }

    private Set<String> getComponents(final Name name) {
        final Set<String> effectedComponents = new HashSet<>();

        for (final RepositoryComponent component : componentGraph) {
            if (equalsIgnoreCase(component.getEntityName(), name.isNot(), name.getName())) {
                effectedComponents.add(component.getId());
            }
        }

        return effectedComponents;
    }

    private Set<String> getComponents(final Identifier identifier) {
        final Set<String> effectedComponents = new HashSet<>();

        for (final RepositoryComponent component : componentGraph) {
            if (equalsIgnoreCase(component.getId(), identifier.isNot(), identifier.getId())) {
                effectedComponents.add(component.getId());
            }
        }

        return effectedComponents;
    }

    private Set<String> getComponents(final Annotation annotation) {
        final Set<String> effectedComponents = new HashSet<>();

        for (final RepositoryComponent component : componentGraph) {
        	// TODO component.getAnnotation()?
//            if (equalsIgnoreCase(component.getAnnotation(), annotation.isNot(), annotation.getAnnotation())) {
//                effectedComponents.add(component.getId());
//            }
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

    private Set<String> getComponents(final Role role) {
        final Set<String> effectedComponents = new HashSet<>();

        for (final RepositoryComponent component : getComponents(role.isNot(), role.getType())) {
            for (final Entity entity : getRolesEntities(component)) {
                for (final RoleProperty property : role.getProperties()) {
                    if (property instanceof Name) {
                        if (equalsIgnoreCase(entity.getEntityName(), ((Name) property).isNot(),
                                ((Name) property).getName())) {
                            effectedComponents.add(component.getId());
                        }

                    }

                    if (property instanceof Identifier) {
                        if (equalsIgnoreCase(entity.getId(), ((Identifier) property).isNot(),
                                ((Identifier) property).getId())) {
                            effectedComponents.add(component.getId());
                        }
                    }

                    // TODO entity.getAnnotation() ?
//                    if (property instanceof Annotation) {
//                        if (equalsIgnoreCase(entity.getAnnotation(), ((Annotation) property).isNot(),
//                                ((Annotation) property).getAnnotation())) {
//                            effectedComponents.add(component.getId());
//                        }
//
//                    }

                }
            }
        }

        return effectedComponents;
    }


    private static Set<Entity> getRolesEntities(final RepositoryComponent component) {
        final Set<Entity> effectedComponents = new HashSet<>();

        component.getProvidedRoles_InterfaceProvidingEntity().forEach(effectedComponents::add);
        component.getRequiredRoles_InterfaceRequiringEntity().forEach(effectedComponents::add);

        return effectedComponents;
    }

    private Set<RepositoryComponent> getComponents(final boolean isNot, final RoleType type) {
        final Set<RepositoryComponent> effectedComponents = new HashSet<>();

        if ((type == null) || (isNot && (type == RoleType.ANY))) {
            return effectedComponents; // not any?
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

    private Set<String> getComponents(final Assembly assembly) {
        final Set<String> effectedComponents = new HashSet<>();

        final boolean isNot = assembly.isNot();
        final AssemblyType type = assembly.getType();
        if (isNot && (type == AssemblyType.ANY)) {
            return effectedComponents; // not any?
        }

        final Set<String> assemblyComponents = getEffectedComponents(assembly.getComponents());
        if (assemblyComponents.isEmpty()) {
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

    private Set<String> getComponents(final Resource resource) {
        final Set<String> effectedComponents = new HashSet<>();

        for (final Entity entity : serverMap.keySet()) {
            for (final ResourceProperty property : resource.getProperties()) {
                if (property instanceof Name) {
                    if (equalsIgnoreCase(entity.getEntityName(), ((Name) property).isNot(),
                            ((Name) property).getName())) {
                        for (final RepositoryComponent component : serverMap.get(entity)) {
                            effectedComponents.add(component.getId());
                        }
                    }
                } else if (property instanceof Identifier) {
                    if (equalsIgnoreCase(entity.getId(), ((Identifier) property).isNot(),
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

}
