package org.palladiosimulator.probeframework.probes;

import javax.measure.Measure;
import javax.measure.quantity.Quantity;

import org.palladiosimulator.measurementframework.BasicMeasurement;
import org.palladiosimulator.metricspec.BaseMetricDescription;
import org.palladiosimulator.metricspec.MetricDescription;
import org.palladiosimulator.metricspec.metricentity.IMetricEntity;
import org.palladiosimulator.metricspec.metricentity.MetricEntity;
import org.palladiosimulator.probeframework.measurement.ProbeMeasurement;
import org.palladiosimulator.probeframework.measurement.RequestContext;

/**
 * Basic event probes refer to exactly one base metric description, thus, specializing the general
 * event probe.
 * 
 * Moreover, basic event probes provide a generic <code>notify</code> method. This method allows
 * subclasses to pass an event measurement to it when they receive an event. Subsequently,
 * <code>notify</code> can generically inform registered probe listeners about a newly available
 * probe measurement. For characterizing the measurement itself, basic event probes refer to V as
 * the value of the measure to Q as their quantity.
 * 
 * Note that this class still leaves the implementation of the abstract method
 * <code>registerListener</code> to its subclasses.
 * 
 * @author Steffen Becker, Sebastian Lehrig
 * 
 * @param <EventSourceType>
 *            The type of the event source (as needed by the superclass).
 * @param <V>
 *            The value type of the basic measure (as needed by the superclass).
 * @param <Q>
 *            The quantity type of the basic measure (as needed by the superclass).
 */
public abstract class BasicEventProbe<EventSourceType, V, Q extends Quantity> extends EventProbe<EventSourceType>
        implements IMetricEntity {

    /** Delegate object for implementing IMetricEntity. */
    private final IMetricEntity metricEntityDelegate;

    /**
     * Default constructor.
     * 
     * @param eventSource
     *            The event source as needed by the superclass.
     * @param metricDescription
     *            The metric description as needed by the superclass.
     */
    public BasicEventProbe(final EventSourceType eventSource, final BaseMetricDescription metricDescription) {
        super(eventSource);
        this.metricEntityDelegate = new MetricEntity(metricDescription);
    }

    /**
     * Allows subclasses to pass an event measurement to it when they receive an event.
     * Subsequently, <code>notify</code> can generically inform registered probe listeners about a
     * newly available probe measurement.
     * 
     * @param eventMeasure
     *            The measurement received from the event.
     */
    protected void notify(final Measure<V, Q> eventMeasure) {
        final BasicMeasurement<V, Q> basicMeasurement = new BasicMeasurement<V, Q>(eventMeasure,
                (BaseMetricDescription) this.getMetricDesciption());
        final ProbeMeasurement newMeasurement = new ProbeMeasurement(basicMeasurement, this,
                RequestContext.EMPTY_REQUEST_CONTEXT);
        this.notifyMeasurementSourceListener(newMeasurement);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MetricDescription getMetricDesciption() {
        return this.metricEntityDelegate.getMetricDesciption();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public boolean isCompatibleWith(MetricDescription other) {
        return this.metricEntityDelegate.isCompatibleWith(other);
    }
}
