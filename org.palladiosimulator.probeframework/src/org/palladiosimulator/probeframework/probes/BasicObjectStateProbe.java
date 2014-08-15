package org.palladiosimulator.probeframework.probes;

import javax.measure.quantity.Quantity;

import org.palladiosimulator.metricspec.BaseMetricDescription;

/**
 * This class realizes a basic triggered probe that observes an object's state, thus, additionally
 * maintaining an <code>observeredStateObject</code> member variable.
 * 
 * It leaves the implementation of the template method <code>getBasicMeasure</code> to its
 * subclasses.
 * 
 * @author Steffen Becker, Sebastian Lehrig
 * 
 * @param <StateObjectType>
 *            The type of the maintained state object.
 * @param <V>
 *            The value type of the basic measure (as needed by the superclass).
 * @param <Q>
 *            The quantity type of the basic measure (as needed by the superclass).
 */
public abstract class BasicObjectStateProbe<StateObjectType, V, Q extends Quantity> extends BasicTriggeredProbe<V, Q> {

    /** Maintained state object, e.g., a CPU state object. */
    private final StateObjectType observedStateObject;

    /**
     * Default constructor.
     * 
     * @param stateObject
     *            The state object to be maintained, e.g., a CPU state object.
     * @param metricDesciption
     *            The metric description as needed by the superclass.
     * @throws IllegalArgumentException
     *             If the state object is null.
     */
    public BasicObjectStateProbe(final StateObjectType stateObject, final BaseMetricDescription metricDesciption) {
        super(metricDesciption);
        if (stateObject == null) {
            throw new IllegalArgumentException("State object must not be null");
        }
        this.observedStateObject = stateObject;
    }

    /**
     * Getter method for the maintained state object.
     * 
     * @return The state object.
     */
    protected StateObjectType getStateObject() {
        return this.observedStateObject;
    }
}
