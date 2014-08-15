package org.palladiosimulator.probeframework.measurement;

import org.palladiosimulator.probeframework.probes.Probe;

/**
 * Data class representing a (Probe, {@link RequestContext})-pair. The combination of probe and
 * request context uniquely identifies data objects.
 * 
 * @author Steffen Becker, Sebastian Lehrig
 */
public final class ProbeAndRequestContext {

    /** The measured probe. */
    private final Probe probe;

    /** The request context. */
    private final RequestContext requestContext;

    /**
     * Default constructor. Constructs a pair consisting of a probe and a {@link RequestContext}.
     * 
     * @param probe
     *            The measured probe.
     * @param requestContext
     *            The RequestContext.
     */
    public ProbeAndRequestContext(final Probe probe, final RequestContext requestContext) {
        this.probe = probe;
        this.requestContext = requestContext;
    }

    /**
     * Returns the probe.
     * 
     * @return The probe.
     */
    public final Probe getProbe() {
        return probe;
    }

    /**
     * Returns the {@link RequestContext}.
     * 
     * @return The context.
     */
    public final RequestContext getRequestContext() {
        return requestContext;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((requestContext == null) ? 0 : requestContext.hashCode());
        result = prime * result + ((probe == null) ? 0 : probe.hashCode());
        return result;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public boolean equals(final Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (!(obj instanceof ProbeAndRequestContext)) {
            return false;
        }
        final ProbeAndRequestContext other = (ProbeAndRequestContext) obj;
        if (requestContext == null) {
            if (other.requestContext != null) {
                return false;
            }
        } else if (!requestContext.equals(other.requestContext)) {
            return false;
        }
        if (probe == null) {
            if (other.probe != null) {
                return false;
            }
        } else if (!probe.equals(other.probe)) {
            return false;
        }
        return true;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String toString() {
        return probe + "-" + requestContext.toString();
    }

}
