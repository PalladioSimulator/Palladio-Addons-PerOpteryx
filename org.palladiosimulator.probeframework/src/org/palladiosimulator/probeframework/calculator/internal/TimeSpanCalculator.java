package org.palladiosimulator.probeframework.calculator.internal;

import static org.palladiosimulator.metricspec.constants.MetricDescriptionConstants.POINT_IN_TIME_METRIC;

import java.util.ArrayList;
import java.util.List;

import javax.measure.Measure;
import javax.measure.quantity.Duration;
import javax.measure.unit.SI;

import org.palladiosimulator.edp2.models.measuringpoint.MeasuringPoint;
import org.palladiosimulator.measurementframework.BasicMeasurement;
import org.palladiosimulator.measurementframework.Measurement;
import org.palladiosimulator.measurementframework.TupleMeasurement;
import org.palladiosimulator.metricspec.BaseMetricDescription;
import org.palladiosimulator.metricspec.MetricDescription;
import org.palladiosimulator.metricspec.MetricSetDescription;
import org.palladiosimulator.probeframework.calculator.Calculator;
import org.palladiosimulator.probeframework.measurement.ProbeMeasurement;
import org.palladiosimulator.probeframework.probes.Probe;

/**
 * Time span calculators calculate a time span. These calculators expect two probes, each providing
 * at least a POINT_IN_TIME_METRIC measurement. Subsequently, they calculate the time span by
 * subtracting the point in time of the first probe from the point in time of the second probe. The
 * final result is a (start point in time, time span)-tuple.
 * 
 * @author Sebastian Lehrig, Steffen Becker
 */
public abstract class TimeSpanCalculator extends Calculator {

    /**
     * Default constructor.
     * 
     * @param metricDescription
     *            MetricDescription as needed by the superclass.
     * @param measuringPoint
     *            MeasuringPoint as needed by the superclass.
     * @param probes
     *            Probes as needed by the superclass.
     */
    protected TimeSpanCalculator(final MetricDescription metricDescription, final MeasuringPoint measuringPoint,
            final List<Probe> probes) {
        super(metricDescription, measuringPoint, probes);
    }

    /**
     * Calculates a time span based on subtracting two points in time.
     * 
     * @param probeMeasurements
     *            List containing the two points in time probes measurements.
     * @return The newly calculated measurement.
     * @see org.palladiosimulator.probeframework.calculator.Calculator#calculate
     */
    @Override
    protected Measurement calculate(final List<ProbeMeasurement> probeMeasurements) {
        final List<Measurement> result = new ArrayList<Measurement>(2);

        final Measure<Double, Duration> startTimeMeasure = probeMeasurements.get(0).getMeasureProvider()
                .getMeasureForMetric(POINT_IN_TIME_METRIC);
        final Measure<Double, Duration> endTimeMeasure = probeMeasurements.get(1).getMeasureProvider()
                .getMeasureForMetric(POINT_IN_TIME_METRIC);
        final double timeSpan = endTimeMeasure.doubleValue(SI.SECOND) - startTimeMeasure.doubleValue(SI.SECOND);
        final Measure<Double, Duration> timeSpanMeasure = Measure.valueOf(timeSpan, SI.SECOND);

        final Measurement endTimeMeasurement = probeMeasurements.get(1).getBasicMeasurement()
                .getMeasurementForMetric(POINT_IN_TIME_METRIC);
        result.add(endTimeMeasurement);
        final Measurement timeSpanMeasurement = new BasicMeasurement<Double, Duration>(timeSpanMeasure,
                (BaseMetricDescription) ((MetricSetDescription) this.getMetricDesciption()).getSubsumedMetrics().get(1));
        result.add(timeSpanMeasurement);

        return new TupleMeasurement(result, (MetricSetDescription) this.getMetricDesciption());
    }
}
