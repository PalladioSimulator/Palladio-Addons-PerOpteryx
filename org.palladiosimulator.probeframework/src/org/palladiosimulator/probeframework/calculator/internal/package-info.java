/**
 * The Probe Framework provides a factory class (@see DefaultCalculatorFactory) 
 * to create calculator objects. Concrete calculators are collected in this
 * internal package. Accessing it without using the factory class is impossible
 * (in OSGI, classes of internal packages are not exported).
 * 
 * Note that the main super class of all calculators is the abstract class
 * {@link org.palladiosimulator.probeframework.calculator.Calculator}.
 * 
 * @author Sebastian Lehrig, Steffen Becker
 */
package org.palladiosimulator.probeframework.calculator.internal;