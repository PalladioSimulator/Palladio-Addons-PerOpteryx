package org.palladiosimulator.probeframework.probes;

import org.palladiosimulator.probeframework.measurement.ProbeMeasurement;
import org.palladiosimulator.probeframework.measurement.RequestContext;

/**
 * Triggered probes measure as soon as their <code>takeMeasurement</code> method is invoked (with
 * optional context parameter of type <code>RequestContext</code>, e.g., the thread that triggered
 * the probe. This invocation triggers the template method <code>doMeasure</code> (with an
 * optionally empty context). After <code>doMeasure</code> computed a new measurement,
 * <code>takeMeasurement</code> further informs all registered observers about the newly available
 * measurement.
 * 
 * The method <code>doMeasure</code> itself has to be provided by classes inheriting from the this
 * class.
 * 
 * @author Steffen Becker, Sebastian Lehrig
 */
public abstract class TriggeredProbe extends Probe {

    /**
     * Default constructor.
     */
    protected TriggeredProbe() {
        super();
    }

    /**
     * Takes a probe measurement. Convenience method for an empty request context; refer to @see
     * #takeMeasurement(RequestContext) for full documentation.
     * 
     * @return The taken probe measurement.
     */
    public ProbeMeasurement takeMeasurement() {
        return takeMeasurement(RequestContext.EMPTY_REQUEST_CONTEXT);
    }

    /**
     * Takes a probe measurement for the given request context. This method is externally triggered,
     * thus, being the main characteristic of this type of probe.
     * 
     * Internally, the template method <code>doMeasure</code> is used to obtain the concrete
     * measurement. Afterwards, all registered observers are informed about this new measurement.
     * 
     * @param measurementContext
     *            The measurement context for this probe.
     * @return The taken probe measurement.
     */
    public ProbeMeasurement takeMeasurement(final RequestContext measurementContext) {
        final ProbeMeasurement newMeasurement = doMeasure(measurementContext);
        notifyMeasurementSourceListener(newMeasurement);
        return newMeasurement;
    }

    /**
     * Template method for taking the desired probe measurement in a given request context.
     * 
     * @param measurementContext
     *            The measurement context for this probe.
     * @return The taken probe measurement.
     */
    protected abstract ProbeMeasurement doMeasure(RequestContext measurementContext);
}
