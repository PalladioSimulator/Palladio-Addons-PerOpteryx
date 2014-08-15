package org.palladiosimulator.probeframework.calculator.internal;

import java.util.List;

import org.palladiosimulator.edp2.models.measuringpoint.MeasuringPoint;
import org.palladiosimulator.measurementframework.Measurement;
import org.palladiosimulator.measurementframework.TupleMeasurement;
import org.palladiosimulator.measurementframework.measureprovider.IMeasureProvider;
import org.palladiosimulator.measurementframework.measureprovider.MeasurementListMeasureProvider;
import org.palladiosimulator.metricspec.MetricSetDescription;
import org.palladiosimulator.probeframework.exceptions.CalculatorException;
import org.palladiosimulator.probeframework.measurement.ProbeMeasurement;
import org.palladiosimulator.probeframework.probes.Probe;

/**
 * Identity calculators are unary calculators that directly let probe measurements pass through. For
 * example, the current state of a "take passive resource state probe" may directly be passed
 * through in order to determine its utilization.
 * 
 * @author Sebastian Lehrig
 */
public class IdentityCalculator extends UnaryCalculator {

    /**
     * Default constructor. Directly passes all elements to the unary calculator constructor.
     * 
     * @param metricDescription
     *            MetricDescriptions as needed by the superclass.
     * @param measuringPoint
     *            MeasuringPoint as needed by the superclass.
     * @param probe
     *            The observed probe.
     */
    public IdentityCalculator(final MetricSetDescription metricDescription, final MeasuringPoint measuringPoint,
            final Probe probe) {
        super(metricDescription, measuringPoint, probe);
    }

    /**
     * This calculation directly lets a single probe measurement pass through.
     * 
     * TODO Update JavaDoc
     * 
     * @param probeMeasurements
     *            The list of probe measurements is expected to contain a single measurement of type
     *            TupleMeasurement.
     * @return The probe measurement value wrapped in a measurement.
     * @throws CalculatorException
     *             In case the received probe measurements do not conform to the specified metric
     * @see org.palladiosimulator.probeframework.calculator.Calculator#calculate
     */
    @Override
    protected Measurement calculate(final List<ProbeMeasurement> probeMeasurements) throws CalculatorException {
        final MetricSetDescription metricSetDescription = (MetricSetDescription) this.getMetricDesciption();
        final IMeasureProvider measureProvider = probeMeasurements.get(0).getMeasureProvider();

        if (!(measureProvider instanceof MeasurementListMeasureProvider)) {
            throw new CalculatorException(
                    "Measure provider used within identity calculators have to be of type MeasurementListMeasureProvider");
        }        
        final List<Measurement> measurements = ((MeasurementListMeasureProvider) measureProvider).getSubsumedMeasurements();
                
        return new TupleMeasurement(measurements, metricSetDescription);        
    }
}
