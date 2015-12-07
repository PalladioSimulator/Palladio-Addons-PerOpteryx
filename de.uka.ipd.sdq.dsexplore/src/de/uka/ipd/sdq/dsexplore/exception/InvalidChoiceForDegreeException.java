package de.uka.ipd.sdq.dsexplore.exception;

import genericdesigndecision.Choice;

/**
 * This exception is thrown if a {@link Choice} and the linked {@link DegreeOfFreedomInstance} 
 * do not match by their type. 
 * 
 * Example: an
 * {@link ClassChoice} links a {@link ContinuousRangeDegree}).
 * 
 * @author martens
 *
 */
public class InvalidChoiceForDegreeException extends RuntimeException {

	public InvalidChoiceForDegreeException(Choice choice) {
		super("Degree "+choice.getDofInstance().getClass().getName()+" and choice "+choice.getClass().getName()+" do not match!");

	}

	/**
	 * 
	 */
	private static final long serialVersionUID = 6487974641238880884L;

}
