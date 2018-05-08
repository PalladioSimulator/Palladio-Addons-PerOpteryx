package edu.kit.ipd.are.dsexplore.featurecompletions.weaver.extensions;

import de.uka.ipd.sdq.dsexplore.facade.ICreateExtension;
import de.uka.ipd.sdq.pcm.designdecision.Choice;
import de.uka.ipd.sdq.pcm.designdecision.DegreeOfFreedomInstance;

public class FCCCreateExtension implements ICreateExtension {
	@Override
	public boolean shallHandle(DegreeOfFreedomInstance degree) {
		return false;
	}

	@Override
	public Choice getChoice(DegreeOfFreedomInstance degree) {
		throw new UnsupportedOperationException("You shall not execute this method if #shallHandle returns false!");
	}

}
