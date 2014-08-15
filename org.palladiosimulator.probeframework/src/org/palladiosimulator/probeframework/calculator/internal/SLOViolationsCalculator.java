package org.palladiosimulator.probeframework.calculator.internal;

import static org.palladiosimulator.metricspec.constants.MetricDescriptionConstants.POINT_IN_TIME_METRIC;
import static org.palladiosimulator.metricspec.constants.MetricDescriptionConstants.SLO_VIOLATIONS_METRIC_TUPLE;
import javax.measure.quantity.Dimensionless;
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
import org.palladiosimulator.metricspec.MetricSetDescription;
import org.palladiosimulator.probeframework.measurement.ProbeMeasurement;
import org.palladiosimulator.probeframework.probes.Probe;

public class SLOViolationsCalculator extends TimeSpanCalculator {
	private long sloviolations = 0;
	public static final double RESPONSE_TIME_LIMIT = 3.0;
	
	public SLOViolationsCalculator(final MeasuringPoint measuringPoint, final List<Probe> probes) {
        super(SLO_VIOLATIONS_METRIC_TUPLE, measuringPoint, probes);
    }
	
	@Override
	public Measurement calculate(final List<ProbeMeasurement> probeMeasurements) {
        final List<Measurement> result = new ArrayList<Measurement>(2);

        final Measure<Double, Duration> startTimeMeasure = probeMeasurements.get(0).getMeasureProvider()
                .getMeasureForMetric(POINT_IN_TIME_METRIC);
        final Measure<Double, Duration> endTimeMeasure = probeMeasurements.get(1).getMeasureProvider()
                .getMeasureForMetric(POINT_IN_TIME_METRIC);
        final double timeSpan = endTimeMeasure.doubleValue(SI.SECOND) - startTimeMeasure.doubleValue(SI.SECOND);
        if(timeSpan > RESPONSE_TIME_LIMIT) {
        	this.sloviolations++;
        }
        final Measure<Long, Dimensionless> sloViolationsMeasure = Measure.valueOf(this.sloviolations, Dimensionless.UNIT);
        final Measurement endTimeMeasurement = probeMeasurements.get(1).getBasicMeasurement().getMeasurementForMetric(POINT_IN_TIME_METRIC);
        result.add(endTimeMeasurement);
        final Measurement sloViolationsMeasurement = new BasicMeasurement<Long, Dimensionless>(sloViolationsMeasure,(BaseMetricDescription) ((MetricSetDescription) this.getMetricDesciption()).getSubsumedMetrics().get(1));
        result.add(sloViolationsMeasurement);
        return new TupleMeasurement(result, (MetricSetDescription) this.getMetricDesciption());
    }

}
