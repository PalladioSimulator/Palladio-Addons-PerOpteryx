package de.uka.ipd.sdq.dsexplore.facade;

import de.uka.ipd.sdq.pcm.designdecision.Choice;
import de.uka.ipd.sdq.pcm.designdecision.DegreeOfFreedomInstance;

/**
 * Extension part of {@link IModule}. This part will be during the creation of
 * the model's DoFIs.
 *
 * @author Dominik Fuchss
 *
 */
public interface ICreateExtension {
	/**
	 * Indicates whether this extension wants to handle this type of DoFI. In
	 * this case PerOpteryx shall invoke
	 * {@link #getChoice(DegreeOfFreedomInstance)}.
	 *
	 * @param degree
	 *            the degree
	 * @return the indicator
	 */
	boolean shallHandle(DegreeOfFreedomInstance degree);

	/**
	 * Calculate {@link Choice} for a given DoFI.
	 *
	 * @param degree
	 *            the degree
	 * @return the chosen choice
	 */
	Choice getChoice(DegreeOfFreedomInstance degree);

}
