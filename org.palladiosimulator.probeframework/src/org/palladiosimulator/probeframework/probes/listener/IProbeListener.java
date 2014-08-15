package org.palladiosimulator.probeframework.probes.listener;

import org.palladiosimulator.probeframework.measurement.ProbeMeasurement;

/**
 * Once probes have new measurements at hand, they have to inform registered observers about these
 * new measurements. To do so, probes provide this dedicated interfaces with call-back methods that
 * observers have to implement. Probes bind this interface to the generic type parameter
 * <code>T</code> of <code>AbstractObservable</code> to implement this observer pattern.
 * 
 * @author Sebastian Lehrig
 */
public interface IProbeListener {

    /**
     * Call-back method for observers who want to be informed about new probe measurements.
     * 
     * @param probeMeasurement
     *            The newly available probe measurements.
     */
    public void newProbeMeasurementAvailable(final ProbeMeasurement probeMeasurement);

}
