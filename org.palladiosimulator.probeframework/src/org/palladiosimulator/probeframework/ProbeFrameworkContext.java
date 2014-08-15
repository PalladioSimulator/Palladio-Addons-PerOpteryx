package org.palladiosimulator.probeframework;

import org.palladiosimulator.probeframework.calculator.ICalculatorFactory;
import org.palladiosimulator.probeframework.calculator.RegisterCalculatorFactoryDecorator;

/**
 * This class allows to create context objects for the Probe Framework, i.e., these objects store
 * state information needed by the Probe Framework. The central state information is the employed
 * calculator factory. Therefore, this class maintains a calculator factory member variable. In
 * particular, this class provides the <code>getCalculatorFactory</code> getter method for this
 * factory as well as a <code>finish</code> method for informing the factory about the end of
 * calculator usage.
 * 
 * @author Steffen Becker, Sebastian Lehrig
 */
public class ProbeFrameworkContext {

    /** The used calculator factory */
    private final RegisterCalculatorFactoryDecorator calculatorFactory;

    /**
     * Default constructor. Expects a calculator factory to be stored as Probe Framework state
     * information. Internally, this factory is decorated by a register to manage the life-cycle of
     * calculators.
     * 
     * @param calculatorFactory
     *            The calculator factory to be used by the Probe Framework.
     */
    public ProbeFrameworkContext(final ICalculatorFactory calculatorFactory) {
        super();
        if (calculatorFactory == null) {
            throw new IllegalArgumentException("A valid calculator factory is required.");
        }
        this.calculatorFactory = new RegisterCalculatorFactoryDecorator(calculatorFactory);
    }

    /**
     * Getter for the calculator factory.
     * 
     * @return The calculator factory.
     */
    public ICalculatorFactory getCalculatorFactory() {
        return calculatorFactory;
    }

    /**
     * Call-back method informing about the end of calculator usage.
     */
    public void finish() {
        this.calculatorFactory.finish();
    }

}
