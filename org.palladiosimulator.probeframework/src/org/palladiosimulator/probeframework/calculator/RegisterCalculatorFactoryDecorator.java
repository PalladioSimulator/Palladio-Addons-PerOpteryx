package org.palladiosimulator.probeframework.calculator;

import java.util.Collection;
import java.util.HashSet;
import java.util.List;

import org.palladiosimulator.edp2.models.measuringpoint.MeasuringPoint;
import org.palladiosimulator.probeframework.probes.Probe;

/**
 * Decorates an existing ICalculatorFactory by a register for its calculators. In case a calculator
 * is registered in this register, this factory directly returns the calculator from it. Otherwise,
 * a new calculator is instantiated, put into the register, and returned.
 * 
 * Furthermore, this class provides convenience methods for cleaning up calculators (detach their
 * probes and cleaning the register; c.f., <code>finish</code> method).
 * 
 * @see ICalculatorFactory
 * 
 * @author Steffen Becker, Sebastian Lehrig
 */
public class RegisterCalculatorFactoryDecorator implements ICalculatorFactory {

    /** Factory to be decorated by a register. */
    private final ICalculatorFactory decoratedFactory;

    /** Register for calculators. */
    private final Collection<Calculator> calculatorRegister = new HashSet<Calculator>();

    /**
     * Default constructor. Decorates given factory by a register.
     * 
     * @param decoratedFactory
     *            The calculator factory to be decorated.
     */
    public RegisterCalculatorFactoryDecorator(final ICalculatorFactory decoratedFactory) {
        super();
        this.decoratedFactory = decoratedFactory;
    }

    /**
     * Cleans up all registered calculators informing each calculator about being unregistered and
     * subsequently cleaning the register.
     */
    public void finish() {
        for (final Calculator calculator : this.calculatorRegister) {
            calculator.preUnregister();
        }
        calculatorRegister.clear();
    }

    /**
     * Registers the given calculator in the register.
     * 
     * @param calculator
     *            The calculator to be registered.
     * @return The unmodified calculator (allows for fluent API).
     * @throws IllegalArgumentException If the given calculator is already registered.
     */
    private Calculator register(final Calculator calculator) {
        if (calculatorRegister.contains(calculator)) {
            throw new IllegalArgumentException("Calculators can only be registered once to the calculator registry");
        }
        calculatorRegister.add(calculator);
        return calculator;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Calculator buildResponseTimeCalculator(final MeasuringPoint measuringPoint, final List<Probe> probes) {
        return register(decoratedFactory.buildResponseTimeCalculator(measuringPoint, probes));
    }
    
    @Override
	public Calculator buildSloViolationsCalculator(MeasuringPoint measuringPoint, List<Probe> probes) {
		// TODO Auto-generated method stub
    	return register(decoratedFactory.buildSloViolationsCalculator(measuringPoint, probes));
	}    

    /**
     * {@inheritDoc}
     */
    @Override
    public Calculator buildDemandBasedWaitingTimeCalculator(final MeasuringPoint measuringPoint,
            final List<Probe> probes) {
        return register(decoratedFactory.buildDemandBasedWaitingTimeCalculator(measuringPoint, probes));
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Calculator buildWaitingTimeCalculator(final MeasuringPoint measuringPoint, final List<Probe> probes) {
        return register(decoratedFactory.buildWaitingTimeCalculator(measuringPoint, probes));
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Calculator buildHoldingTimeCalculator(final MeasuringPoint measuringPoint, final List<Probe> probes) {
        return register(decoratedFactory.buildHoldingTimeCalculator(measuringPoint, probes));
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Calculator buildStateOfActiveResourceCalculator(final MeasuringPoint measuringPoint, final Probe probe) {
        return register(decoratedFactory.buildStateOfActiveResourceCalculator(measuringPoint, probe));
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Calculator buildOverallStateOfActiveResourceCalculator(final MeasuringPoint measuringPoint, final Probe probe) {
        return register(decoratedFactory.buildOverallStateOfActiveResourceCalculator(measuringPoint, probe));
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Calculator buildStateOfPassiveResourceCalculator(MeasuringPoint measuringPoint, Probe probe) {
        return register(decoratedFactory.buildStateOfPassiveResourceCalculator(measuringPoint, probe));
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Calculator buildOverallStateOfPassiveResourceCalculator(MeasuringPoint measuringPoint, Probe probe) {
        return register(decoratedFactory.buildOverallStateOfPassiveResourceCalculator(measuringPoint, probe));
    }
    
    /**
     * {@inheritDoc}
     */
    @Override
    public Calculator buildResourceDemandCalculator(final MeasuringPoint measuringPoint, final Probe probe) {
        return register(decoratedFactory.buildResourceDemandCalculator(measuringPoint, probe));
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Calculator buildExecutionResultCalculator(final MeasuringPoint measuringPoint, final Probe probe) {
        return register(decoratedFactory.buildExecutionResultCalculator(measuringPoint, probe));
    }

	
}
