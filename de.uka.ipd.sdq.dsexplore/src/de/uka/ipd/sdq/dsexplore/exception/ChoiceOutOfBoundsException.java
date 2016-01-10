package de.uka.ipd.sdq.dsexplore.exception;

import genericdesigndecision.ClassChoice;
import genericdesigndecision.DiscreteRangeChoice;

/**
 * Thrown in the value of a {@link Choice} is not contained in the corresponding {@link DegreeOfFreedomInstance}.
 * Example: {@link DiscreteRangeChoice} A has the chosen value 5, but the linked {@link DegreeOfFreedomInstance} D 
 * has from = 7 and to = 10.
 *   
 * @author martens
 *
 */
public class ChoiceOutOfBoundsException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5518058966677144866L;
	
	public ChoiceOutOfBoundsException(ClassChoice choice){
		super("Chosen entity "+choice.getChosenValue()+" of choice "+choice.getClass().getSimpleName()+" does not exist in domain of degree "+choice.getDofInstance().getDegreeDescription()+" of type "+choice.getDofInstance().getClass().getSimpleName());
	}
	
	public ChoiceOutOfBoundsException(ClassChoice choice, String location){
		super(location+": Chosen entity "+choice.getChosenValue()+" of choice "+choice.getClass().getSimpleName()+" does not exist in domain of degree "+choice.getDofInstance().getDegreeDescription()+" of type "+choice.getDofInstance().getClass().getSimpleName());
	}

	public ChoiceOutOfBoundsException(DiscreteRangeChoice discreteChoice) {
		super("Chosen value "+discreteChoice.getChosenValue()+" of choice "+discreteChoice.getClass().getSimpleName()+" does not exist in domain of degree "+discreteChoice.getDofInstance().getDegreeDescription()+" of type "+discreteChoice.getDofInstance().getClass().getSimpleName());
	}
	
	public ChoiceOutOfBoundsException(DiscreteRangeChoice discreteChoice, String message) {
		super("Chosen value "+discreteChoice.getChosenValue()+" of choice "+discreteChoice.getClass().getSimpleName()+" does not exist in domain of degree "+discreteChoice.getDofInstance().getDegreeDescription()+" of type "+discreteChoice.getDofInstance().getClass().getSimpleName()+". Details: "+message);
	}


}
