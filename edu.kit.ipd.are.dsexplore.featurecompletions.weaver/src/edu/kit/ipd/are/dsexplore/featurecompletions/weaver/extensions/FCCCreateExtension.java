package edu.kit.ipd.are.dsexplore.featurecompletions.weaver.extensions;

import java.util.Random;

import de.uka.ipd.sdq.dsexplore.facade.ICreateExtension;
import de.uka.ipd.sdq.pcm.designdecision.BoolChoice;
import de.uka.ipd.sdq.pcm.designdecision.Choice;
import de.uka.ipd.sdq.pcm.designdecision.DegreeOfFreedomInstance;
import de.uka.ipd.sdq.pcm.designdecision.FeatureChoice;
import de.uka.ipd.sdq.pcm.designdecision.designdecisionFactory;
import de.uka.ipd.sdq.pcm.designdecision.specific.AdvicePlacementDegree;
import de.uka.ipd.sdq.pcm.designdecision.specific.MultipleInclusionDegree;

public class FCCCreateExtension implements ICreateExtension {
	private Random random = new Random();
	
	@Override
	public boolean shallHandle(DegreeOfFreedomInstance degree) {
		if (degree instanceof MultipleInclusionDegree) {
			return true;
		} else if (degree instanceof AdvicePlacementDegree) {
			return true;
		}
		return false;
	}

	@Override
	public Choice getChoice(DegreeOfFreedomInstance degree) {
		if (degree instanceof MultipleInclusionDegree ||
			degree instanceof AdvicePlacementDegree) {
			BoolChoice choice = designdecisionFactory.eINSTANCE.createBoolChoice();
			choice.setChosenValue(this.random.nextBoolean());
			return choice;
		}
		throw new UnsupportedOperationException("You shall not execute this method if #shallHandle returns false!");
	}

}
