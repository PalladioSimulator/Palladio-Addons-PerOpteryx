package de.uka.ipd.sdq.dsexplore.analysis.qes;

import static org.eclipse.core.runtime.IStatus.ERROR;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.apache.log4j.Logger;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.Status;
import org.palladiosimulator.qes.qualityEffectSpecification.NQA;
import org.palladiosimulator.qes.qualityEffectSpecification.QES;
import org.palladiosimulator.qes.qualityEffectSpecification.Reasoning;
import org.palladiosimulator.qes.qualityEffectSpecification.Transformation;
import org.palladiosimulator.solver.models.PCMInstance;
import de.uka.ipd.sdq.dsexplore.analysis.nqr.solver.NqrFactory;
import de.uka.ipd.sdq.dsexplore.analysis.nqr.solver.NqrProxy;
import de.uka.ipd.sdq.dsexplore.analysis.nqr.solver.NqrReductionProxy;
import de.uka.ipd.sdq.dsexplore.analysis.nqr.solver.ReasoningProxy;
import de.uka.ipd.sdq.dsexplore.qml.contracttype.QMLContractType.Dimension;
import de.uka.ipd.sdq.dsexplore.qml.contracttype.QMLContractType.Element;

public class QesFactory extends NqrFactory {

    private static final Logger LOG = Logger.getLogger("de.uka.ipd.sdq.dsexplore.analysis.qes");

    private static void debug(String name, Transformation transformation) {
        StringBuilder message = new StringBuilder(name);
        message.append(": ");
        if (transformation instanceof NQA) {
            NQA nqa = (NQA) transformation;
            message.append(nqa.getQuality()).append("=").append(nqa.getElement());
        } else if (transformation instanceof Reasoning) {
            Reasoning reasoning = (Reasoning) transformation;
            message.append(reasoning.getQuality());
        }

        LOG.warn(message.toString());
    }


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
        if ((finder == null) || parser.getNqaSpecifications().isEmpty()) {
            return super.getNqrList(componentId);
        }

        final NqrReductionProxy reduction = createNqrReductionProxy();
        for (final QES specification : parser.getNqaSpecifications()) {
            if (finder.getEffectedComponents(specification.getComponents()).contains(componentId) == false) {
                continue;
            }
            for (final Transformation transformation : specification.getTransformations()) {
                if ((transformation != null) && (transformation instanceof NQA)) {
                    debug(getComponentName(componentId), transformation); // TODO
                    reduction.add(createNqrProxy((NQA) transformation));
                }
            }
        }

        final List<NqrProxy> nqrs = new ArrayList<>(reduction.get());
        for (final NqrProxy original : super.getNqrList(componentId)) {
            boolean contains = false;
            for (final NqrProxy transformation : nqrs) {
                if (transformation.getDimensionId().equals(original.getDimensionId())) {
                    contains = true;
                    break;
                }
            }
            if (contains == false) {
                nqrs.add(original);
            }
        }

        return Collections.unmodifiableList(nqrs);
    }

    private NqrProxy createNqrProxy(final NQA nqa) {
        if (nqa == null) {
            return null;
        }

        final String quality = nqa.getQuality();
        final String element = nqa.getElement();

        if ((quality == null) || (element == null)) {
            return null;
        }

        // Dimension S
        Dimension nqrDimension = getDimensionByName(quality);
        if (nqrDimension == null) {
            nqrDimension = getDimensionById(quality);
        }
        if (nqrDimension == null) {
            return null;
        }

        // Element +
        Element nqrElement = getElementByName(element);
        if (nqrElement == null) {
            nqrElement = getElementById(element);
        }
        if (nqrElement == null) {
            return null;
        }

        return new NqrProxy(nqrDimension, nqrElement, dimensionsIdNameMap.get(nqrDimension.getId()));

    }

    @Override
    public List<ReasoningProxy> getReasoningList(final String componentId) {
        if ((finder == null) || parser.getReasoningSpecifications().isEmpty()) {
            return super.getReasoningList(componentId);
        }

        List<ReasoningProxy> reasonings = new ArrayList<ReasoningProxy>();

        for (final QES specification : parser.getReasoningSpecifications()) {
            if (finder.getEffectedComponents(specification.getComponents()).contains(componentId) == false) {
                continue;
            }
            for (final Transformation transformation : specification.getTransformations()) {
                if ((transformation == null) || (transformation instanceof Reasoning) == false) {
                    continue;
                }
                ReasoningProxy newReasoning = createReasoningProxy((Reasoning) transformation);
                if (newReasoning == null) {
                    continue;
                }
                boolean contains = false;
                for (final ReasoningProxy reasoning : reasonings) {
                    if (reasoning.getOutput().getId().equals(newReasoning.getOutput().getId())) {
                        contains = true;
                        break;
                    }
                }
                if (contains == false) {
                    debug(getComponentName(componentId), transformation); // TODO
                    reasonings.add(newReasoning);
                }
            }
        }

        for (final ReasoningProxy original : super.getReasoningList(componentId)) {
            boolean contains = false;
            for (final ReasoningProxy transformation : reasonings) {
                if (transformation.getOutput().getId().equals(original.getOutput().getId())) {
                    contains = true;
                    break;
                }
            }
            if (contains == false) {
                reasonings.add(original);
            }
        }

        return Collections.unmodifiableList(reasonings);
    }

    private ReasoningProxy createReasoningProxy(final Reasoning reasoning) {
        return null; // TODO
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
