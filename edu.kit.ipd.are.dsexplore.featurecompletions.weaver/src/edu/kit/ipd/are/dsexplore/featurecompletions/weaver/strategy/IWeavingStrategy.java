package edu.kit.ipd.are.dsexplore.featurecompletions.weaver.strategy;

import java.util.List;

import FeatureCompletionModel.ComplementumVisnetis;
import de.uka.ipd.sdq.dsexplore.tools.primitives.Pair;
import de.uka.ipd.sdq.pcm.designdecision.Choice;
import edu.kit.ipd.are.dsexplore.featurecompletions.weaver.port.FCCWeaverException;

/**
 * The weaving strategy interface contains all methods that need to be
 * implemented in order to integrate a concern solution into a given PCM model
 * according to the strategy of a class implementing this interface.
 *
 * @author scheerer
 * @author Dominik Fuchss
 *
 */
public interface IWeavingStrategy {
	void initialize(List<Pair<ComplementumVisnetis, WeavingLocation>> locations, Choice fcSolutionChoice, Choice fccChoice, List<Choice> featureChoices, List<Choice> allocationChoices);

	void weave() throws FCCWeaverException;

	List<Choice> getConvertedFCCClassChoices();
}
