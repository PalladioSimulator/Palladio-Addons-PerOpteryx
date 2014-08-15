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
 * Implements the <code>doMeasure</code> method by returning a <code>BasicMeasurement</code>, i.e.,
 * a measurement for a <code>BaseMetricDescription</code>. Therefore, basic triggered probes are
 * constructed by passing an appropriate base metric description as a parameter that is used to
 * construct basic measurements.
 * 
 * For determining the measurement itself, basic triggered probes invoke the template method
 * <code>getBasicMeasure</code>. The values of the returned measure are of type V and their quantity
 * is given in Q.
 * 
 * @see Measure
 * 
 * @author Steffen Becker, Sebastian Lehrig
 * 
 * @param <V>
 *            The value type of the basic measure.
 * @param <Q>
 *            The quantity type of the basic measure.
 */
public abstract class BasicTriggeredProbe<V, Q extends Quantity> extends TriggeredProbe implements IMetricEntity {

    /** Delegate object for implementing IMetricEntity. */
    private final IMetricEntity metricEntityDelegate; 
    
    /**
     * Default constructor. Restricts general metric descriptions to BaseMetricDescriptions (central
     * characteristic of this type of triggered probe).
     * 
     * @param metricDescription
     *            A BaseMetricDescription as needed by the superclass.
     */
    public BasicTriggeredProbe(final BaseMetricDescription metricDescription) {
        super();
        this.metricEntityDelegate = new MetricEntity(metricDescription);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected final ProbeMeasurement doMeasure(final RequestContext measurementContext) {
        final BasicMeasurement<V, Q> resultMeasurement = new BasicMeasurement<V, Q>(
                getBasicMeasure(measurementContext), (BaseMetricDescription) this.getMetricDesciption());
        return new ProbeMeasurement(resultMeasurement, this, measurementContext);
    }

    /**
     * Template method for taking the desired measure in a given request context.
     * 
     * @param measurementContext
     *            The measurement context for this probe.
     * @return The taken measure.
     */
    protected abstract Measure<V, Q> getBasicMeasure(RequestContext measurementContext);
    
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
