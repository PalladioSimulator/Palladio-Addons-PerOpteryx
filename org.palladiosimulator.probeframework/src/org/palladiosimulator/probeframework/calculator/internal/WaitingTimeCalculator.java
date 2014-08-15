package org.palladiosimulator.probeframework.calculator.internal;

import static org.palladiosimulator.metricspec.constants.MetricDescriptionConstants.WAITING_TIME_METRIC_TUPLE;

import java.util.List;

import org.palladiosimulator.edp2.models.measuringpoint.MeasuringPoint;
import org.palladiosimulator.probeframework.probes.Probe;

/**
 * Calculates a time span representing the waiting time as defined by the WAITING_TIME_METRIC_TUPLE.
 * It expects a probe giving the start of waiting and a probe giving the end of waiting, e.g., at a
 * passive resource pool. The final result is a (start point in time, waiting time)-tuple.
 * 
 * @author Sebastian Lehrig, Steffen Becker
 * @see TimeSpanCalculator
 */
public class WaitingTimeCalculator extends TimeSpanCalculator {

    /**
     * Default Constructor.
     * 
     * @param measuringPoint
     *            MeasuringPoint as needed by the superclass.
     * @param probes
     *            The two probes for starting point of waiting time and final point of waiting time.
     */
    public WaitingTimeCalculator(final MeasuringPoint measuringPoint, final List<Probe> probes) {
        super(WAITING_TIME_METRIC_TUPLE, measuringPoint, probes);
    }
}
