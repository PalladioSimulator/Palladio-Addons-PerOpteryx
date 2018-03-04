package de.uka.ipd.sdq.dsexplore.analysis.qes;

import static org.eclipse.core.runtime.IStatus.ERROR;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.StringJoiner;
import org.apache.log4j.Logger;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.common.util.URI;
import org.palladiosimulator.pcm.repository.RepositoryComponent;
import org.palladiosimulator.qes.qualityEffectSpecification.Model;
import org.palladiosimulator.qes.qualityEffectSpecification.NQA;
import org.palladiosimulator.qes.qualityEffectSpecification.QES;
import org.palladiosimulator.qes.qualityEffectSpecification.Transformation;
import org.palladiosimulator.solver.models.PCMInstance;
import de.uka.ipd.sdq.dsexplore.analysis.PCMPhenotype;
import de.uka.ipd.sdq.dsexplore.analysis.nqr.solver.NqrFactory;
import de.uka.ipd.sdq.dsexplore.analysis.nqr.solver.NqrProxy;
import de.uka.ipd.sdq.dsexplore.analysis.nqr.solver.ReasoningProxy;
import de.uka.ipd.sdq.dsexplore.qml.contracttype.QMLContractType.Dimension;

public class QesFactory extends NqrFactory {

    private static final Logger LOG = Logger.getLogger("de.uka.ipd.sdq.dsexplore.analysis.qes");

    private static QesParser loadParser(final String qualityEffectSpecificationUri) throws CoreException {
        try {
            return new QesParser(qualityEffectSpecificationUri);
        } catch (final Exception e) {
            throw new CoreException(new Status(ERROR, "de.uka.ipd.sdq.dsexplore.analysis.qes", 0,
                    "Qes Model " + String.valueOf(qualityEffectSpecificationUri) + " could not be loaded.", e));
        }
    }

    private final QesParser parser;
    private QesFinder finder;

    public QesFactory(final String reasoningComponentUri, final String reductionUri, final String dimensionTypeSetUri,
            final String qualityEffectSpecificationUri) throws CoreException {
        super(reasoningComponentUri, reductionUri, dimensionTypeSetUri);

        parser = loadParser(qualityEffectSpecificationUri);
        finder = null;
    }

    public void setInstance(PCMInstance instance) {
        finder = new QesFinder(instance);
    }

    @Override
    public List<NqrProxy> getNqrList(final String componentId) {
        if (finder == null || parser.getNqaSpecifications().isEmpty()) {
            return super.getNqrList(componentId);
        }
        final List<NqrProxy> nqrs = new ArrayList<>(super.getNqrList(componentId));

        for (QES specification : parser.getNqaSpecifications()) {
            if (finder.getEffectedComponents(specification.getComponents()).contains(componentId) == false) {
                continue;
            }
            for (Transformation transformation : specification.getTransformations()) {
                if (transformation == null || (transformation instanceof NQA) == false) {
                    continue;
                }
                NqrProxy newNqr = createNqrProxy((NQA) transformation);
                for (NqrProxy nqr : nqrs) {
                    if (nqr.getDimension().getEntityName().equalsIgnoreCase(newNqr.getDimension().getEntityName())) {

                    }
                }
            }
        }

        LOG.error("Is effected: " + getComponentName(componentId));
        return nqrs;
    }

    public NqrProxy createNqrProxy(final NQA nqa) {
        final String quality = nqa.getQuality();
        final String element = nqa.getElement();

        if ((quality == null) || (element == null) || !(dimensionsIdNameMap.containsKey(element))) {
            return null;
        }
        // TODO NqrProxy quality
        // return new NqrProxy(quality, getElementByName(element), dimensionsIdNameMap.get(element));
        return null;
    }

    @Override
    public List<ReasoningProxy> getReasoningList(final String componentId) {
        return super.getReasoningList(componentId);
    }

    @Override
    public String toString() {
        final StringBuilder builder = new StringBuilder();
        builder.append(super.toString());
        builder.append("Model (").append(String.valueOf(parser)).append(") ]").append(System.lineSeparator());
        // if (model != null && model.getElements() != null && !model.getElements().isEmpty()) {
        // for (Object element : model.getElements()) {
        // builder.append("\t").append(String.valueOf(element)).append(System.lineSeparator());
        // }
        // }
        builder.append("]").append(System.lineSeparator());
        return builder.toString();

    }

}
