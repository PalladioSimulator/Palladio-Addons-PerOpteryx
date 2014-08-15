/**
 * Probes specify which probe type they measure (using metrics such as "current time" or
 * "CPU state/queue size"). In particular, probes know how to measure their type, i.e., 
 * they come with a suitable implementation. Once implemented, probes can be placed all
 * over the simulator to steadily probe.
 * 
 * This package provides the (widely abstract) type hierarchy for such probes. Probed
 * environments (e.g., a simulator) typically have to create concrete subclasses of
 * appropriate probe types to realize their concrete probe variant (concrete probes
 * depend on the implementation of the instrumented environment).
 * 
 * The superclass of all probes is the <code>Probe</code> class.
 * 
 * @see org.palladiosimulator.probeframework.probes.Probe
 * 
 * @author Sebastian Lehrig
 */
package org.palladiosimulator.probeframework.probes;