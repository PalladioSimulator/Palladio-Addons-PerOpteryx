package de.uka.ipd.sdq.dsexplore.analysis.qes;

import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.palladiosimulator.pcm.repository.Repository;
import org.palladiosimulator.pcm.repository.RepositoryComponent;
import org.palladiosimulator.qes.qualityEffectSpecification.Component;
import org.palladiosimulator.qes.qualityEffectSpecification.ComponentPropertie;
import org.palladiosimulator.qes.qualityEffectSpecification.Identifier;
import org.palladiosimulator.qes.qualityEffectSpecification.Name;
import org.palladiosimulator.solver.models.PCMInstance;

public class QesFinder {

    private static final String IDENTIFIER_WILDCARD = "_";

    private static Set<RepositoryComponent> getComponents(List<Repository> repositories) {
        final Set<RepositoryComponent> components = new HashSet<>();

        if ((repositories == null) || repositories.isEmpty()) {
            return Collections.unmodifiableSet(components);
        }

        for (final Repository repository : repositories) {
            final List<RepositoryComponent> repositoryComponents = repository.getComponents__Repository();
            if ((repositoryComponents == null) || repositoryComponents.isEmpty()) {
                continue;
            }
            for (final RepositoryComponent component : repositoryComponents) {
                if (component != null) {
                    components.add(component);
                }
            }
        }

        return Collections.unmodifiableSet(components);
    }

    private final Set<RepositoryComponent> repositoryComponents;

    public QesFinder(PCMInstance instance) {
        repositoryComponents = getComponents(instance.getRepositories());
    }

    public Set<String> getEffectedComponents(List<Component> components) {
        final Set<String> effectedComponents = new HashSet<>();

        if ((components == null) || components.isEmpty()) {
            return effectedComponents;
        }

        for (final Component component : components) {
            effectedComponents.addAll(getComponents(component));
        }

        return effectedComponents;
    }

    private Set<String> getComponents(Component component) {
        final Set<String> effectedComponents = new HashSet<>();

        if ((component == null) || (component.getProperties() == null) || component.getProperties().isEmpty()) {
            return effectedComponents;
        }

        for (final ComponentPropertie propertie : component.getProperties()) {
            if (effectedComponents.isEmpty()) {
                effectedComponents.addAll(getComponents(propertie));
            } else {
                effectedComponents.retainAll(getComponents(propertie));
            }

            if (effectedComponents.isEmpty()) {
                break;
            }
        }

        return effectedComponents;
    }

    private Set<String> getComponents(ComponentPropertie propertie) {
        final Set<String> effectedComponents = new HashSet<>();

        if (propertie == null) {
            return effectedComponents;
        }

        if (propertie instanceof Name) {
            return getComponents((Name) propertie);
        }

        if (propertie instanceof Identifier) {
            return getComponents((Identifier) propertie);
        }


        return effectedComponents;
    }

    private Set<String> getComponents(Name name) {
        final Set<String> effectedComponents = new HashSet<>();

        final boolean not = name.isNot();
        final String valueOfName = String.valueOf(name.getName());

        for (final RepositoryComponent component : repositoryComponents) {
            final String componentName = String.valueOf(component.getEntityName());
            final boolean equals = componentName.equalsIgnoreCase(valueOfName);

            if (not != equals) {
                effectedComponents.add(String.valueOf(component.getId()));
            }
        }

        return effectedComponents;
    }

    private Set<String> getComponents(Identifier identifier) {
        final Set<String> effectedComponents = new HashSet<>();

        final boolean not = identifier.isNot();
        final String valueOfId = String.valueOf(identifier.getId());

        for (final RepositoryComponent component : repositoryComponents) {
            final String componentIdentifier = String.valueOf(component.getId());

            if (valueOfId.equals(IDENTIFIER_WILDCARD)) {
                effectedComponents.add(componentIdentifier);
                continue;
            }

            final boolean equals = componentIdentifier.equalsIgnoreCase(valueOfId);

            if (not != equals) {
                effectedComponents.add(componentIdentifier);
            }

        }

        return effectedComponents;
    }

}
