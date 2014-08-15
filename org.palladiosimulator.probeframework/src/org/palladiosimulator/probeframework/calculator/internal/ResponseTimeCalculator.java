package org.palladiosimulator.probeframework.calculator.internal;

import static org.palladiosimulator.metricspec.constants.MetricDescriptionConstants.RESPONSE_TIME_METRIC_TUPLE;

import java.util.List;

import org.palladiosimulator.edp2.models.measuringpoint.MeasuringPoint;
import org.palladiosimulator.probeframework.probes.Probe;

/**
 * Calculates a time span representing the response time as defined by the
 * RESPONSE_TIME_METRIC_TUPLE. It expects a probe giving the start and a probe giving the end point
 * in time of an operation call. The final result is a (start point in time, response time)-tuple.
 * 
 * @author Sebastian Lehrig, Steffen Becker
 * @see TimeSpanCalculator
 */
public class ResponseTimeCalculator extends TimeSpanCalculator {

    /**
     * Default Constructor.
     * 
     * @param measuringPoint
     *            MeasuringPoint as needed by the superclass.
     * @param probes
     *            The two probes for starting point of the operation call and final point of the
     *            operation call.
     */
    public ResponseTimeCalculator(final MeasuringPoint measuringPoint, final List<Probe> probes) {
        super(RESPONSE_TIME_METRIC_TUPLE, measuringPoint, probes);
    }
}
