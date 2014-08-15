package org.palladiosimulator.probeframework.probes;

import org.palladiosimulator.commons.designpatterns.AbstractObservable;
import org.palladiosimulator.commons.designpatterns.IAbstractObservable;
import org.palladiosimulator.probeframework.measurement.ProbeMeasurement;
import org.palladiosimulator.probeframework.probes.listener.IProbeListener;

/**
 * This class is the abstract super class for all probe implementations. All specific probes have to
 * (indirectly) inherit from this class.
 * 
 * Because probes are typed by a metric, they inherit from <code>MetricEntity</code>. For example, a
 * probe taking the state of a passive resource would be typed by the
 * <code>STATE_OF_PASSIVE_RESOURCE_METRIC</code>.
 * 
 * Because calculators have to observe such probes, this class also implements the
 * <code>IAbstractObservable</code> interface. Calculators have to implement the
 * <code>IProbeListener</code> interface to get informed about new probe measurements.
 * 
 * @author Steffen Becker, Sebastian Lehrig
 */
public abstract class Probe implements IAbstractObservable<IProbeListener> {

    /** Delegator object used for implementing IAbstractObservable (c.f., "Delegator pattern") */
    private final AbstractObservable<IProbeListener> observableDelegate;

    /**
     * Default constructor.
     */
    protected Probe() {
        super();
        this.observableDelegate = new AbstractObservable<IProbeListener>() {
        };
    }

    /**
     * Notifies all registered observers about a new probe measurement.
     * 
     * @param newMeasurement
     *            The new probe measurement.
     * @throws IllegalArgumentException
     *             If the new measurement does not conform to the metric of this probe.
     */
    protected void notifyMeasurementSourceListener(final ProbeMeasurement newMeasurement) {
        observableDelegate.getEventDispatcher().newProbeMeasurementAvailable(newMeasurement);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void addObserver(final IProbeListener observer) {
        observableDelegate.addObserver(observer);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void removeObserver(final IProbeListener observer) {
        observableDelegate.removeObserver(observer);
    }
}
