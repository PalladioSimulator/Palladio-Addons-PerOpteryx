package org.palladiosimulator.probeframework.calculator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.apache.log4j.Logger;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.palladiosimulator.edp2.models.measuringpoint.MeasuringPoint;
import org.palladiosimulator.measurementframework.Measurement;
import org.palladiosimulator.measurementframework.listener.IMeasurementSourceListener;
import org.palladiosimulator.measurementframework.listener.MeasurementSource;
import org.palladiosimulator.metricspec.MetricDescription;
import org.palladiosimulator.probeframework.exceptions.CalculatorException;
import org.palladiosimulator.probeframework.measurement.ProbeMeasurement;
import org.palladiosimulator.probeframework.measurement.RequestContext;
import org.palladiosimulator.probeframework.probes.Probe;
import org.palladiosimulator.probeframework.probes.listener.IProbeListener;

/**
 * <p>
 * This class is the abstract super class for all calculator implementations. All specific
 * calculators have to inherit from this class.
 * </p>
 * 
 * <p>
 * Because calculators have to observe probes, they implement the IProbeListener interface. They
 * also inherit from MeasurementSource, thus, making them to observable objects on their own. For
 * instance, they can provide newly calculated measurements to recorders (recorders implement the
 * IMeasurementSourceListener interface).
 * </p>
 * 
 * <p>
 * Furthermore, calculators expect a list of probes to be measured before they can do their
 * calculation. For example, a response time calculator needs a measurement series of two probe
 * measurements (one for start time and one for end time of an operation call). For this measurement
 * series, calculators maintain a memory to store measurements of the observed probes. As soon as
 * the last sample arrives, calculators start their calculation by invoking the template method
 * {@link Calculator#calculate(List)}.
 * </p>
 * 
 * <p>
 * When a sample originating from the first probe arrives (after a measurement series has started
 * and before it ended with the last probe), an exception is thrown because the first series of
 * measurements has to be finished first.
 * </p>
 * 
 * @author Sebastian Lehrig, Steffen Becker
 */
public abstract class Calculator extends MeasurementSource implements IProbeListener {

    /** Logger of this class */
    private static final Logger LOGGER = Logger.getLogger(Calculator.class);

    /** List of probes **/
    protected final List<Probe> probes;

    /** Maintained memory of probe measurements */
    private final Map<RequestContext, List<ProbeMeasurement>> arrivedMeasurementMemory;

    /** Measuring point of this measurement source, e.g., a CPU or an Operation. */
    private final MeasuringPoint measuringPoint;

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((this.getMetricDesciption() == null) ? 0 : this.getMetricDesciption().getId().hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        Calculator other = (Calculator) obj;
        if (this.getMetricDesciption() == null) {
            if (other.getMetricDesciption() != null) {
                return false;
            }
        } else if (!this.isCompatibleWith(other.getMetricDesciption())) {
            return false;
        }
        if (measuringPoint == null) {
            if (other.measuringPoint != null) {
                return false;
            }
        } else if (!EcoreUtil.equals(measuringPoint, other.measuringPoint)) {
            return false;
        }
        return true;
    }

    /**
     * Default constructor. Creates the observed list of probes and initializes the measurement
     * memory.
     * 
     * @param computedMetric
     *            Metric calculated by this calculator.
     * @param measuringPoint
     *            The measuring point serving as the source of measurements.
     * @param childProbes
     *            List of probes.
     */
    protected Calculator(final MetricDescription computedMetric, final MeasuringPoint measuringPoint,
            final List<Probe> childProbes) {
        super(computedMetric);
        this.measuringPoint = measuringPoint;
        this.arrivedMeasurementMemory = new HashMap<RequestContext, List<ProbeMeasurement>>();

        this.probes = Collections.unmodifiableList(new ArrayList<Probe>(childProbes));
        for (final Probe probe : childProbes) {
            probe.addObserver(this);
        }
    }

    /**
     * Calculates a measurement based on a given set of probe measurements.
     * 
     * @param probeMeasurements
     *            Probe measurements conforming to the registered probes of this calculator.
     * @return AbstractMeasureProvider that conforms to the static declaration of the metric of this class of
     *         calculators.
     * @throws CalculatorException
     *             In case something during the execution of the calculator went wrong.
     */
    protected abstract Measurement calculate(List<ProbeMeasurement> probeMeasurements) throws CalculatorException;

    /**
     * Returns the measuring point serving as the source of measurements.
     * 
     * @return The measuring point.
     */
    public MeasuringPoint getMeasuringPoint() {
        return measuringPoint;
    }

    /**
     * This method informs calculators before they are unregistered in the calculator factory. This
     * information gives them the chance to remove themselves from observed probes as well as to
     * inform and remove their own observers about being unregistered.
     */
    public void preUnregister() {
        for (final Probe probe : probes) {
            probe.removeObserver(this);
        }

        for (final IMeasurementSourceListener l : this.getMeasurementSourceListeners()) {
            l.preUnregister();
            removeObserver(l);
        }
    }

    /**
     * Call-back method to be informed about new probe measurements.
     * 
     * @param probeMeasurement
     *            The last ProbeMeasurement that was received from an observed probe.
     * @see org.palladiosimulator.probeframework.probes.listener.IProbeListener#newProbeMeasurementAvailable
     */
    @Override
    public void newProbeMeasurementAvailable(final ProbeMeasurement probeMeasurement) {
        if (isMeasurementFromFirstProbe(probeMeasurement)) {
            if (arrivedMeasurementMemory.containsKey(probeMeasurement.getProbeAndContext().getRequestContext())) {
                throw new IllegalStateException("First measurement to the same context arrived while"
                        + "previous series of the same context did not complete.");
            }
            arrivedMeasurementMemory.put(probeMeasurement.getProbeAndContext().getRequestContext(),
                    new LinkedList<ProbeMeasurement>());
        }
        final List<ProbeMeasurement> measurementMemory = arrivedMeasurementMemory.get(probeMeasurement
                .getProbeAndContext().getRequestContext());
        measurementMemory.add(probeMeasurement);
        if (isMeasurementFromLastProbe(probeMeasurement)) {
            fireCalculated(measurementMemory);
            arrivedMeasurementMemory.remove(probeMeasurement.getProbeAndContext().getRequestContext());
        }
    }

    /**
     * Triggers the calculation of a measurement based on a given set of probe measurements. Also
     * informs all registered observers about this new measurement.
     * 
     * @param probeMeasurements
     *            Probe measurements conforming to the registered probes of this calculator.
     */
    private void fireCalculated(final List<ProbeMeasurement> probeMeasurements) {
        try {
            final Measurement calculatedMeasures = calculate(probeMeasurements);
            notifyMeasurementSourceListener(calculatedMeasures);
        } catch (final CalculatorException e) {
            LOGGER.error(e);
            throw new RuntimeException(e);
        }
    }

    /**
     * Checks whether the given measurement comes from the last probe.
     * 
     * @param probeMeasurement
     *            The measurement to be investigated.
     * @return <code>true</code> if the measurement comes from the last probe, <code>false</code>
     *         otherwise.
     */
    private boolean isMeasurementFromLastProbe(final ProbeMeasurement probeMeasurement) {
        return (probeMeasurement.getProbeAndContext().getProbe() == probes.get(probes.size() - 1));
    }

    /**
     * Checks whether the given measurement comes from the first probe.
     * 
     * @param probeMeasurement
     *            The measurement to be investigated.
     * @return <code>true</code> if the measurement comes from the first probe, <code>false</code>
     *         otherwise.
     */
    private boolean isMeasurementFromFirstProbe(final ProbeMeasurement probeMeasurement) {
        return (probeMeasurement.getProbeAndContext().getProbe() == probes.get(0));
    }
}
