package org.palladiosimulator.probeframework.calculator;

import java.util.List;

import org.palladiosimulator.edp2.models.measuringpoint.MeasuringPoint;
import org.palladiosimulator.probeframework.probes.Probe;

/**
 * Factory interface to create calculator objects. This interface covers all calculators that are
 * allowed to be instantiated from within the internal package
 * <code>org.palladiosimulator.probeframework.calculator.internal</code> (access without using the
 * factory class is impossible in OSGI because classes of internal packages are not exported).
 * 
 * @author Steffen Becker, Sebastian Lehrig
 */
public interface ICalculatorFactory {
    /**
     * Creates a response time calculator object based on the given name and the given probes.
     * 
     * @param measuringPoint
     *            The measuring point where this calculator is used, e.g., "Operation A".
     * @param probes
     *            List of two probes for starting point of the operation call and final point of the
     *            operation call.
     * @return A new response time calculator object.
     */
    public abstract Calculator buildResponseTimeCalculator(final MeasuringPoint measuringPoint, final List<Probe> probes);

    /**
     * Creates a demand-based waiting time calculator object based on the given name and the given
     * probes.
     * 
     * @param measuringPoint
     *            The measuring point where this calculator is used, e.g., "Passive Resource A".
     * @param probes
     *            List of three probes for (1) start request for processing, (2) end of processing
     *            event, and (3) the demanded time at the resource.
     * @return A new demand-based waiting time calculator object.
     */
    public abstract Calculator buildDemandBasedWaitingTimeCalculator(final MeasuringPoint measuringPoint,
            final List<Probe> probes);
    
    
    /**
     * Creates SLO violation calculator object based on the given name and the given
     * probes.
     * 
     * @param measuringPoint
     *            The measuring point where this calculator is used, e.g., "Operation A".
     * @param probes
     *           List of two probes for starting point of the operation call and final point of the
     *            operation call.    
     *   @return A new SLO violations calculator object.
     */
    public abstract Calculator buildSloViolationsCalculator(final MeasuringPoint measuringPoint, final List<Probe> probes);

    /**
     * Creates a waiting time calculator object based on the given name and the given probes.
     * 
     * @param measuringPoint
     *            The measuring point where this calculator is used, e.g., "Passive Resource A".
     * @param probes
     *            List of two probes for starting point of the waiting time and final point of
     *            waiting time.
     * @return A new waiting time calculator object.
     */
    public abstract Calculator buildWaitingTimeCalculator(final MeasuringPoint measuringPoint, final List<Probe> probes);

    /**
     * Creates a holding time calculator object based on the given name and the given probes.
     * 
     * @param measuringPoint
     *            The measuring point where this calculator is used, e.g., "Passive Resource A".
     * @param probes
     *            List of two probes for starting point of holding time and final point of holding
     *            time.
     * @return A new holding time time calculator object.
     */
    public abstract Calculator buildHoldingTimeCalculator(final MeasuringPoint measuringPoint, final List<Probe> probes);

    /**
     * Creates a state calculator object for an active resource based on the given name and the
     * given probe.
     * 
     * @param measuringPoint
     *            The measuring point where this calculator is used, e.g., "CPU 1".
     * @param probe
     *            A single probe providing the resource state of interest.
     * @return A new state calculator object.
     */
    public abstract Calculator buildStateOfActiveResourceCalculator(final MeasuringPoint measuringPoint,
            final Probe probe);

    /**
     * Creates an overall utilization calculator object for an active resource based on the given
     * name and the given probe.
     * 
     * @param measuringPoint
     *            The measuring point where this calculator is used, e.g., "CPU 1".
     * @param probe
     *            A single probe providing the resource state of interest.
     * @return A new overall utilization calculator object.
     */
    public abstract Calculator buildOverallStateOfActiveResourceCalculator(final MeasuringPoint measuringPoint,
            final Probe probe);

    /**
     * Creates a state calculator object for a passive resource based on the given name and the
     * given probe.
     * 
     * @param measuringPoint
     *            The measuring point where this calculator is used, e.g., "Connection Pool 1".
     * @param probe
     *            A single probe providing the resource state of interest.
     * @return A new state calculator object.
     */
    public abstract Calculator buildStateOfPassiveResourceCalculator(final MeasuringPoint measuringPoint,
            final Probe probe);

    /**
     * Creates an overall utilization calculator object for a passive resource based on the given
     * name and the given probe.
     * 
     * @param measuringPoint
     *            The measuring point where this calculator is used, e.g., "Connection Pool 1".
     * @param probe
     *            A single probe providing the resource state of interest.
     * @return A new overall utilization calculator object.
     */
    public abstract Calculator buildOverallStateOfPassiveResourceCalculator(final MeasuringPoint measuringPoint,
            final Probe probe);

    /**
     * Creates a demand calculator object based on the given name and the given probe.
     * 
     * @param measuringPoint
     *            The measuring point where this calculator is used, e.g., "CPU 1".
     * @param probe
     *            A single probe providing the resource demand.
     * @return A new demand calculator object.
     */
    public abstract Calculator buildResourceDemandCalculator(final MeasuringPoint measuringPoint, final Probe probe);

    /**
     * Creates an execution result calculator object based on the given name and the given probe.
     * 
     * @param measuringPoint
     *            The measuring point where this calculator is used, e.g., "Operation A".
     * @param probe
     *            A single probe providing the execution results.
     * @return A new execution result calculator object.
     */
    public abstract Calculator buildExecutionResultCalculator(final MeasuringPoint measuringPoint, final Probe probe);
}