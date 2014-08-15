package org.palladiosimulator.probeframework.calculator.internal;

import java.util.Arrays;

import org.palladiosimulator.edp2.models.measuringpoint.MeasuringPoint;
import org.palladiosimulator.metricspec.MetricDescription;
import org.palladiosimulator.probeframework.calculator.Calculator;
import org.palladiosimulator.probeframework.probes.Probe;

/**
 * <p>
 * This abstract class represents a unary calculator. Unary calculators expect exactly one probe,
 * thus, restricting calculators to only one probe.
 * </p>
 * 
 * @author Sebastian Lehrig, Steffen Becker
 */
public abstract class UnaryCalculator extends Calculator {

    /**
     * Default constructor. Restricts number of observed probes to exactly one.
     * 
     * @param metricDescription
     *            MetricDescriptions as needed by the superclass.
     * @param measuringPoint
     *            MeasuringPoint as needed by the superclass.
     * @param childProbe
     *            The observed probe.
     */
    protected UnaryCalculator(final MetricDescription metricDescription, final MeasuringPoint measuringPoint,
            final Probe childProbe) {
        super(metricDescription, measuringPoint, Arrays.asList(childProbe));
    }

}
