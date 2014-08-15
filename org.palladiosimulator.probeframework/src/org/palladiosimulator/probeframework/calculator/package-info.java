/**
 * Calculators attach themselves to (a set of) probes to transform their 
 * measures to a measurement to be used further (e.g., for visualization or
 * recording). Therefore, they specify which measures are of interest outside
 * from analyzers.
 * 
 * For example, the response time calculator provides probes for start and end
 * time. Another example is the identity calculator that directly lets probe
 * measurements pass through.
 * 
 * This package provides a factory class (@see DefaultCalculatorFactory) 
 * to create such calculator objects.
 * 
 * @author Sebastian Lehrig
 */
package org.palladiosimulator.probeframework.calculator;