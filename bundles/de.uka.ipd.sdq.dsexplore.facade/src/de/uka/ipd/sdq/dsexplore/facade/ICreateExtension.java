package de.uka.ipd.sdq.dsexplore.facade;

import de.uka.ipd.sdq.pcm.designdecision.Choice;
import de.uka.ipd.sdq.pcm.designdecision.DegreeOfFreedomInstance;

public interface ICreateExtension {

	boolean shallHandle(DegreeOfFreedomInstance degree);

	Choice getChoice(DegreeOfFreedomInstance degree);

}
