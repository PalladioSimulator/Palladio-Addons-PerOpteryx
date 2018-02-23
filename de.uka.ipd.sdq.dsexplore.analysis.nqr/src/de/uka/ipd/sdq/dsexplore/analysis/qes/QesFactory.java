package de.uka.ipd.sdq.dsexplore.analysis.qes;

import static org.eclipse.core.runtime.IStatus.ERROR;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.StringJoiner;
import org.apache.log4j.Logger;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.common.util.URI;
import org.palladiosimulator.pcm.core.composition.Connector;
import org.palladiosimulator.pcm.core.composition.impl.AssemblyConnectorImpl;
import org.palladiosimulator.pcm.repository.RepositoryComponent;
import org.palladiosimulator.qes.qualityEffectSpecification.Model;
import de.uka.ipd.sdq.dsexplore.analysis.PCMPhenotype;
import de.uka.ipd.sdq.dsexplore.analysis.nqr.solver.NqrFactory;
import de.uka.ipd.sdq.dsexplore.analysis.nqr.solver.NqrProxy;
import de.uka.ipd.sdq.dsexplore.analysis.nqr.solver.ReasoningProxy;

public class QesFactory extends NqrFactory {

    private static final Logger LOG = Logger.getLogger("de.uka.ipd.sdq.dsexplore.analysis.qes");

    private static Model loadModel(final String qualityEffectSpecificationUri) throws CoreException {
        try {
            URI loadFrom = URI.createURI(qualityEffectSpecificationUri);
            if (!loadFrom.isPlatform()) {
                loadFrom = URI.createFileURI(qualityEffectSpecificationUri);
            }
            return new QesParser().getModel(loadFrom);
        } catch (final Exception e) {
            throw new CoreException(new Status(ERROR, "de.uka.ipd.sdq.dsexplore.analysis.qes", 0,
                    "Qes Model " + String.valueOf(qualityEffectSpecificationUri) + " could not be loaded.", e));
        }


    }

    private final Model model;
    private Set<String> effectedComponents;

    public QesFactory(final String reasoningComponentUri, final String reductionUri, final String dimensionTypeSetUri,
            final String qualityEffectSpecificationUri) throws CoreException {
        super(reasoningComponentUri, reductionUri, dimensionTypeSetUri);

        model = loadModel(qualityEffectSpecificationUri);
    }

    public void determineEffectedComponents(final PCMPhenotype pheno) {
        if ((model == null) || (pheno == null)) {
            return;
        }

        effectedComponents = new HashSet<>();

        // for (final FindByName byName : model.getElements()) {
        // final String name = byName.getName();
        // for (final Connector c : pheno.getPCMInstance().getSystem().getConnectors__ComposedStructure()) {
        // if ((c != null) && (c instanceof AssemblyConnectorImpl)) {
        // final AssemblyConnectorImpl ac = (AssemblyConnectorImpl) c;
        //
        // equalsName(name, ac.basicGetProvidingAssemblyContext_AssemblyConnector()
        // .getEncapsulatedComponent__AssemblyContext());
        //
        // equalsName(name, ac.getRequiringAssemblyContext_AssemblyConnector()
        // .getEncapsulatedComponent__AssemblyContext());
        // }
        // }
        // }
    }

    private void equalsName(final String name, final RepositoryComponent component) {
        if (component.getEntityName().equalsIgnoreCase(name)) {
            effectedComponents.add(component.getId());
        }
    }

    @Override
    public List<NqrProxy> getNqrList(final String componentId) {
        if (!isEffected(componentId)) {
            return super.getNqrList(componentId);
        }

        final List<NqrProxy> nqrs = new ArrayList<>(super.getNqrList(componentId));

        LOG.error("Is effected: " + getComponentName(componentId));
        return nqrs;
    }

    @Override
    public List<ReasoningProxy> getReasoningList(final String componentId) {
        if (!isEffected(componentId)) {
            return super.getReasoningList(componentId);
        }

        final List<ReasoningProxy> reasonings = new ArrayList<>(super.getReasoningList(componentId));

        LOG.error("Is effected: " + getComponentName(componentId));
        return reasonings;
    }

    private boolean isEffected(final String componentId) {
        return (effectedComponents != null) && (componentId != null) && effectedComponents.contains(componentId);
    }

    @Override
    public String toString() {
        final StringBuilder builder = new StringBuilder();
        builder.append(super.toString());
        builder.append("Effected Components [");
        if (effectedComponents != null && !effectedComponents.isEmpty()) {
            final StringJoiner joiner = new StringJoiner(", ");
            effectedComponents.forEach(component -> joiner.add(getComponentName(component)));
        }
        builder.append("]").append(System.lineSeparator());
        builder.append("Model (").append(String.valueOf(model)).append(") ]").append(System.lineSeparator());
        // if (model != null && model.getElements() != null && !model.getElements().isEmpty()) {
        // for (Object element : model.getElements()) {
        // builder.append("\t").append(String.valueOf(element)).append(System.lineSeparator());
        // }
        // }
        builder.append("]").append(System.lineSeparator());
        return builder.toString();

    }

}
