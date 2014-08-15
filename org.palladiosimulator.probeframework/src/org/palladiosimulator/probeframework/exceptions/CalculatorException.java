package org.palladiosimulator.probeframework.exceptions;

/**
 * This Exception arises if something during the execution of a calculator went wrong.
 * 
 * @author Faber, Sebastian Lehrig
 */
public class CalculatorException extends Exception {

    /**
     * Generated serialVersionUID.
     */
    private static final long serialVersionUID = -5967757360389441076L;

    /**
     * Default constructor.
     * 
     * @param desc
     *            Description text of this exception.
     */
    public CalculatorException(String desc) {
        super(desc);
    }

}
