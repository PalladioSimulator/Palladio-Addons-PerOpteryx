package de.uka.ipd.sdq.dsexplore.analysis.qes;

import java.util.Set;
import org.eclipse.emf.common.util.URI;
import org.palladiosimulator.qes.qualityEffectSpecification.NumericValue;
import org.palladiosimulator.qes.qualityEffectSpecification.QES;
import org.palladiosimulator.qes.qualityEffectSpecification.TransformationSpecification;
import org.palladiosimulator.qes.qualityEffectSpecification.TransformationType;
import de.uka.ipd.sdq.pcm.cost.ComponentCost;

public final class QesHelper {

    private QesHelper() {
        assert false;
    }

    private static final String WILDCARD = "_";

    public static boolean equalsIgnoreCase(final Object o1, final boolean isNot, final Object o2) {
        final String s1 = String.valueOf(o1);
        final String s2 = String.valueOf(o2);
        return s1.equalsIgnoreCase(WILDCARD) || s2.equalsIgnoreCase(WILDCARD)
                || (isNot != s1.equalsIgnoreCase(s2));
    }

    public static double doubleValue(final String s) {
        try {
            return Double.valueOf(s).doubleValue();
        } catch (final Exception e) {
            return 0.0;
        }
    }

    public static URI createUri(final String string) {
        final URI loadFrom = URI.createURI(string);
        return loadFrom.isPlatform() ? loadFrom : URI.createFileURI(string);
    }

    public static boolean isValidQesFileUri(final String uri) {
        if (uri == null || (uri.endsWith("qes") == false)) {
            return false;
        }

        try {
            return new QesParser(createUri(uri)).isValid();
        } catch (Exception e) {
            return false;
        }

    }

    public static void evaluateQesCostModel(final ComponentCost componentCost,
            final QesFinder finder, final Set<QES> qesCostSpecifications) {
        if ((finder == null) || (qesCostSpecifications == null) || qesCostSpecifications.isEmpty()
                || (componentCost == null) || (componentCost.getRepositoryComponent() == null)) {
            return;
        }

        final String componentId = componentCost.getRepositoryComponent().getId();

        for (final QES specification : qesCostSpecifications) {
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

                if (numericValueTransformation.getValueType().equals("InitialCost")) {
                    componentCost.setComponentInitialCost(
                            getComponentCost(numericValueTransformation.getTransformationType(),
                                    numericValueTransformation.getTransformationNumber(),
                                    componentCost.getInitialCost()));
                } else if (numericValueTransformation.getValueType().equals("OperatingCost")) {
                    componentCost.setComponentOperatingCost(
                            getComponentCost(numericValueTransformation.getTransformationType(),
                                    numericValueTransformation.getTransformationNumber(),
                                    componentCost.getOperatingCost()));
                }
            }
        }
    }

    private static double getComponentCost(final TransformationType transformationType,
            final String transformationNumber, final double componentCost) {
        switch (transformationType) {
            case IS:
                return (doubleValue(transformationNumber));
            case PLUS:
                return (componentCost + doubleValue(transformationNumber));
            case MINUS:
                return (componentCost - doubleValue(transformationNumber));
            case MULTIPLICATION:
                return (componentCost * doubleValue(transformationNumber));
            case DIVISION:
                return (componentCost / doubleValue(transformationNumber));
            default:
                return componentCost;
        }
    }

}
