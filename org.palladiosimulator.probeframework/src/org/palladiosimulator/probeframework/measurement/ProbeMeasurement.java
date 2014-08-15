package org.palladiosimulator.probeframework.measurement;

import javax.measure.quantity.Quantity;

import org.palladiosimulator.measurementframework.BasicMeasurement;
import org.palladiosimulator.measurementframework.measureprovider.IMeasureProvider;
import org.palladiosimulator.probeframework.probes.Probe;

/**
 * Data class representing a ({@link IMeasureProvider}, {@link ProbeAndRequestContext})-tuple.
 * Therefore, concrete data objects can store a measureProvider coming from a given
 * ProbeAndRequestContext.
 * 
 * @author Steffen Becker, Sebastian Lehrig
 */
public class ProbeMeasurement {

    /** The measureProvider to be stored. */
    private final IMeasureProvider measureProvider;

    /** The probe and the request context. */
    private final ProbeAndRequestContext probeAndContext;

    /**
     * Default constructor. Constructs the object tuple.
     * 
     * @param measureProvider
     *            The measureProvider to be stored.
     * @param probe
     *            The referred probe.
     * @param requestContext
     *            The referred request context.
     */
    public ProbeMeasurement(final IMeasureProvider measureProvider, final Probe probe,
            final RequestContext requestContext) {
        super();
        this.measureProvider = measureProvider;
        this.probeAndContext = new ProbeAndRequestContext(probe, requestContext);
    }

    /**
     * Getter for the measureProvider.
     * 
     * @return The measureProvider.
     */
    public final IMeasureProvider getMeasureProvider() {
        return this.measureProvider;
    }

    /**
     * Getter for the probe and request context.
     * 
     * @return The probeAndContext.
     */
    public final ProbeAndRequestContext getProbeAndContext() {
        return this.probeAndContext;
    }

    /**
     * Checks whether the stored {@link IMeasureProvider} object is a {@link BasicMeasurement}. Only
     * basic probes (e.g., basic triggered probes) are realized as {@link BasicMeasurement}.
     * 
     * @return <code>true</code> if the stored {@link IMeasureProvider} is a
     *         {@link BasicMeasurement}; <code>false</code> otherwise.
     */
    public boolean isBasicMeasurement() {
        return (this.measureProvider instanceof BasicMeasurement);
    }

    /**
     * Returns a {@link BasicMeasurement} based on the stored {@link IMeasureProvider} object. Only
     * basic probes (e.g., basic triggered probes) are realized as {@link BasicMeasurement}.
     * 
     * @return The {@link BasicMeasurement}
     * @throws UnsupportedOperationException
     *             If the stored {@link IMeasureProvider} object is not a {@link BasicMeasurement}.
     * @param <V>
     *            Value type of the {@link BasicMeasurement}. Most often used values are Double or
     *            Long
     * @param <Q>
     *            Quantity to be stored, see {@link Quantity}
     */
    @SuppressWarnings("unchecked")
    public <V, Q extends Quantity> BasicMeasurement<V, Q> getBasicMeasurement() {
        if (isBasicMeasurement()) {
            return (BasicMeasurement<V, Q>) this.measureProvider;
        } else {
            throw new UnsupportedOperationException(
                    "Operation can only be invoked on probe measurements of basic probes");
        }
    }
}
