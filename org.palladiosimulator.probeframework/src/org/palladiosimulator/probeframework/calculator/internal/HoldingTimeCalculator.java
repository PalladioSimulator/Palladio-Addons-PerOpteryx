package org.palladiosimulator.probeframework.calculator.internal;

import static org.palladiosimulator.metricspec.constants.MetricDescriptionConstants.HOLDING_TIME_METRIC_TUPLE;

import java.util.List;

import org.palladiosimulator.edp2.models.measuringpoint.MeasuringPoint;
import org.palladiosimulator.probeframework.probes.Probe;

/**
 * Calculates a time span representing the holding time as defined by the HOLDING_TIME_METRIC_TUPLE.
 * It expects a probe giving the start of holding and a probe giving the end of holding, e.g., in a
 * passive resource pool. The final result is a (start point in time, holding time)-tuple.
 * 
 * @author Sebastian Lehrig, Steffen Becker
 */
public class HoldingTimeCalculator extends TimeSpanCalculator {

    /**
     * Default Constructor.
     * 
     * @param measuringPoint
     *            MeasuringPoint as needed by the superclass.
     * @param probes
     *            The two probes for starting point of hold time and final point of hold time.
     */
    public HoldingTimeCalculator(final MeasuringPoint measuringPoint, final List<Probe> probes) {
        super(HOLDING_TIME_METRIC_TUPLE, measuringPoint, probes);
    }
}
