package org.palladiosimulator.simulizar.exceptions;

import de.mdelab.sdm.interpreter.core.SDMException;

/**
 * Class for exceptions while interpreting a pcm model.
 * 
 * @author Joachim Meyer
 * 
 */
public class PCMModelInterpreterException extends PCMModelAccessException {

    /**
    * 
    */
    private static final long serialVersionUID = 8959342145045102098L;

    /**
     * @param exception
     *            the exception message.
     */
    public PCMModelInterpreterException(final String message) {
        super(message);

    }

    public PCMModelInterpreterException(String msg, SDMException e) {
        super(msg, e);
    }

}
