package de.uka.ipd.sdq.dsexplore.analysis.cost;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import org.palladiosimulator.qes.qualityEffectSpecification.NumericValue;
import org.palladiosimulator.qes.qualityEffectSpecification.QualityEffectSpecification;
import org.palladiosimulator.qes.qualityEffectSpecification.TransformationSpecification;
import org.palladiosimulator.qes.qualityEffectSpecification.TransformationType;
import org.palladiosimulator.solver.models.PCMInstance;
import de.uka.ipd.sdq.dsexplore.analysis.qes.QesFinder;
import de.uka.ipd.sdq.dsexplore.analysis.qes.QesHelper;
import de.uka.ipd.sdq.dsexplore.analysis.qes.QesParser;
import de.uka.ipd.sdq.dsexplore.launch.DSEConstantsContainer;
import de.uka.ipd.sdq.dsexplore.launch.DSEWorkflowConfiguration;
import de.uka.ipd.sdq.pcm.cost.ComponentCost;

public class QesCostExtension {

    private static final String INITIAL_COST = "InitialCost";
    private static final String OPERATING_COST = "OperatingCost";

    private static double getComponentCost(final TransformationType transformationType,
            final String transformationNumber, final double componentCost) {
        switch (transformationType) {
            case IS:
                return (QesHelper.doubleValue(transformationNumber));
            case PLUS:
                return (componentCost + QesHelper.doubleValue(transformationNumber));
            case MINUS:
                return (componentCost - QesHelper.doubleValue(transformationNumber));
            case MULTIPLICATION:
                return (componentCost * QesHelper.doubleValue(transformationNumber));
            case DIVISION:
                return (componentCost / QesHelper.doubleValue(transformationNumber));
            default:
                return componentCost;
        }
    }

    private static Set<QualityEffectSpecification> getQesCostSpecifications(
            final DSEWorkflowConfiguration configuration) {
        try {
            final Set<QualityEffectSpecification> specifications =
                    new HashSet<QualityEffectSpecification>();
            final QesParser parser = new QesParser(configuration.getRawConfiguration()
                    .getAttribute(DSEConstantsContainer.QUALITY_EFFECT_SPECIFICATION_FILE, ""));
            if ((parser.isEmpty() == false) && parser.isValid()) {
                specifications.addAll(parser.getSpecifications(INITIAL_COST));
                specifications.addAll(parser.getSpecifications(OPERATING_COST));
            }
            return Collections.unmodifiableSet(specifications);
        } catch (final Exception e) {
            return Collections.EMPTY_SET;
        }
    }

    private QesFinder finder;
    private final Set<QualityEffectSpecification> specifications;

    public QesCostExtension(final DSEWorkflowConfiguration configuration) {
        specifications = getQesCostSpecifications(configuration);
    }

    public void evaluateQesModel(final ComponentCost componentCost) {
        if ((finder == null) || specifications.isEmpty() || (componentCost == null)
                || (componentCost.getRepositoryComponent() == null)) {
            return;
        }

        final String componentId = componentCost.getRepositoryComponent().getId();

        for (final QualityEffectSpecification specification : specifications) {
            if (finder.getEffectedComponents(specification.getComponents())
                    .contains(componentId) == false) {
                continue;
            }

            for (final TransformationSpecification transformation : specification
                    .getTransformations()) {
                if ((transformation instanceof NumericValue) == false) {
                    continue;
                }

                final NumericValue numericValueTransformation = (NumericValue) transformation;

                if (numericValueTransformation.getValueType().equals(INITIAL_COST)) {
                    componentCost.setComponentInitialCost(
                            getComponentCost(numericValueTransformation.getTransformationType(),
                                    numericValueTransformation.getTransformationNumber(),
                                    componentCost.getInitialCost()));
                } else if (numericValueTransformation.getValueType().equals(OPERATING_COST)) {
                    componentCost.setComponentOperatingCost(
                            getComponentCost(numericValueTransformation.getTransformationType(),
                                    numericValueTransformation.getTransformationNumber(),
                                    componentCost.getOperatingCost()));
                }
            }
        }
    }

    public void updateModel(final PCMInstance pcmInstance) {
        if ((specifications == null) || specifications.isEmpty()) {
            return;
        }
        finder = new QesFinder(pcmInstance);
    }


}
