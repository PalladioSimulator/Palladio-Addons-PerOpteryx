package de.uka.ipd.sdq.dsexplore.analysis.qes;

import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.palladiosimulator.pcm.core.composition.Connector;
import org.palladiosimulator.pcm.core.composition.impl.AssemblyConnectorImpl;
import org.palladiosimulator.pcm.repository.BasicComponent;
import org.palladiosimulator.pcm.repository.CompositeComponent;
import org.palladiosimulator.pcm.repository.RepositoryComponent;
import org.palladiosimulator.pcm.subsystem.SubSystem;
import org.palladiosimulator.qes.qualityEffectSpecification.Assembly;
import org.palladiosimulator.qes.qualityEffectSpecification.AssemblyType;
import org.palladiosimulator.qes.qualityEffectSpecification.ComponentSpecification;
import org.palladiosimulator.qes.qualityEffectSpecification.ComponentProperty;
import org.palladiosimulator.qes.qualityEffectSpecification.ComponentType;
import org.palladiosimulator.qes.qualityEffectSpecification.Identifier;
import org.palladiosimulator.qes.qualityEffectSpecification.Name;
import org.palladiosimulator.qes.qualityEffectSpecification.Resource;
import org.palladiosimulator.qes.qualityEffectSpecification.Role;
import org.palladiosimulator.qes.qualityEffectSpecification.Type;
import org.palladiosimulator.solver.models.PCMInstance;
import de.uka.ipd.sdq.dsexplore.analysis.nqr.graph.DirectedGraph;

public class QesFinder {

    private static final String IDENTIFIER_WILDCARD = "_";

    private final DirectedGraph<RepositoryComponent> componentGraph;

    public QesFinder(PCMInstance instance) {
        componentGraph = new DirectedGraph<>();
        for (final Connector c : instance.getSystem().getConnectors__ComposedStructure()) {
            if (c instanceof AssemblyConnectorImpl) {
                final AssemblyConnectorImpl ac = (AssemblyConnectorImpl) c;
                // Requiring -> Providing | -( --> O-
                componentGraph.addEdge(
                        ac.getRequiringAssemblyContext_AssemblyConnector().getEncapsulatedComponent__AssemblyContext(),
                        ac.getProvidingAssemblyContext_AssemblyConnector().getEncapsulatedComponent__AssemblyContext());
            }
        }
    }

    public Set<String> getEffectedComponents(List<ComponentSpecification> componentsSpecifications) {
        final Set<String> effectedComponents = new HashSet<>();

        if ((componentsSpecifications == null) || componentsSpecifications.isEmpty()) {
            return Collections.unmodifiableSet(effectedComponents);
        }

        for (final ComponentSpecification component : componentsSpecifications) {
            effectedComponents.addAll(getComponents(component));
        }

        return Collections.unmodifiableSet(effectedComponents);
    }

    private Set<String> getComponents(ComponentSpecification componentSpecifications) {
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

    private Set<String> getComponents(ComponentProperty property) {
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

    private Set<String> getComponents(Name name) {
        final Set<String> effectedComponents = new HashSet<>();

        final boolean isNot = name.isNot();
        final String valueOfName = String.valueOf(name.getName());

        for (final RepositoryComponent component : componentGraph) {
            final String componentName = String.valueOf(component.getEntityName());
            final boolean equals = componentName.equalsIgnoreCase(valueOfName);

            if (isNot != equals) {
                effectedComponents.add(String.valueOf(component.getId()));
            }
        }

        return effectedComponents;
    }

    private Set<String> getComponents(Identifier identifier) {
        final Set<String> effectedComponents = new HashSet<>();

        final boolean isNot = identifier.isNot();
        final String valueOfId = String.valueOf(identifier.getId());

        for (final RepositoryComponent component : componentGraph) {
            final String componentIdentifier = String.valueOf(component.getId());

            if (valueOfId.equals(IDENTIFIER_WILDCARD)) {
                effectedComponents.add(componentIdentifier);
                continue;
            }

            final boolean equals = componentIdentifier.equalsIgnoreCase(valueOfId);

            if (isNot != equals) {
                effectedComponents.add(componentIdentifier);
            }

        }

        return effectedComponents;
    }

    private Set<String> getComponents(Type type) {
        final Set<String> effectedComponents = new HashSet<>();

        final boolean isNot = type.isNot();
        final ComponentType componentType = type.getType();
        if (componentType == null || (componentType == ComponentType.ANY && isNot)) { // NON
            return effectedComponents;
        }

        for (final RepositoryComponent component : componentGraph) {
            if (componentType == ComponentType.ANY && isNot == false) { // ANY
                effectedComponents.add(String.valueOf(component.getId()));
            } else if ((componentType == ComponentType.BASIC && isNot == false)
                    || (componentType == ComponentType.COMPOSITE && isNot)) { // BASIC
                if (component instanceof BasicComponent) {
                    effectedComponents.add(String.valueOf(component.getId()));
                }
            } else if ((componentType == ComponentType.COMPOSITE && isNot == false)
                    || (componentType == ComponentType.BASIC && isNot)) { // COMPOSITE
                if (component instanceof CompositeComponent || component instanceof SubSystem) {
                    effectedComponents.add(String.valueOf(component.getId()));
                }
            }
        }

        return effectedComponents;
    }

    private Set<String> getComponents(Role role) {
        return new HashSet<>(); // TODO
    }

    private Set<String> getComponents(Assembly assembly) {
        final Set<String> effectedComponents = new HashSet<>();

        boolean isNot = assembly.isNot();
        AssemblyType type = assembly.getType();
        if (isNot && type == AssemblyType.ANY) {
            return effectedComponents; // not any?
        }

        final Set<String> assemblyComponents = getEffectedComponents(assembly.getComponents());
        if (assemblyComponents.isEmpty()) {
            return effectedComponents;
        }

        boolean provided = true;
        boolean required = true;

        if ((isNot && type == AssemblyType.PROVIDED) || (isNot == false && type == AssemblyType.REQUIRED)) {
            provided = false;
        } else if ((isNot && type == AssemblyType.REQUIRED) || (isNot == false && type == AssemblyType.PROVIDED)) {
            required = false;
        }

        if (required) {
            for (RepositoryComponent component : componentGraph) {
                for (RepositoryComponent edge : componentGraph.edgesFrom(component)) {
                    boolean equals = false;
                    for (String id : assemblyComponents) {
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
            for (RepositoryComponent component : componentGraph) {
                for (String id : assemblyComponents) {
                    if (id.equalsIgnoreCase(component.getId())) {
                        for (RepositoryComponent edge : componentGraph.edgesFrom(component)) {
                            effectedComponents.add(edge.getId());
                        }
                        break;
                    }
                }
            }

        }

        return effectedComponents;
    }

    private Set<String> getComponents(Resource resource) {
        return new HashSet<>(); // TODO
    }

}
