package edu.kit.ipd.are.dsexplore.featurecompletions.weaver.strategy.adapter;

import java.util.List;

import org.opt4j.genotype.ListGenotype;
import org.palladiosimulator.pcm.repository.Repository;

import de.uka.ipd.sdq.pcm.designdecision.Choice;
import de.uka.ipd.sdq.pcm.designdecision.DegreeOfFreedomInstance;
import de.uka.ipd.sdq.pcm.designdecision.specific.FeatureCompletionDegree;
import edu.kit.ipd.are.dsexplore.featurecompletions.weaver.FCCWeaver;
import edu.kit.ipd.are.dsexplore.featurecompletions.weaver.strategy.IStrategyExtension;

public class AdapterStrategyExtension implements IStrategyExtension {

	@Override
	public void nextDecodeStart() {
		// TODO Auto-generated method stub

	}

	@Override
	public void grabChoices(Repository solution, List<Choice> notTransformedChoices) {
		// TODO Auto-generated method stub

	}

	@Override
	public void additionalCreateFCCDegreeBy(FeatureCompletionDegree degree, List<DegreeOfFreedomInstance> dds, ListGenotype<Choice> initialCandidate, FCCWeaver fccWeaver) {
		// TODO Auto-generated method stub

	}

}
