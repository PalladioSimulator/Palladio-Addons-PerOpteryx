package edu.kit.ipd.are.dsexplore.featurecompletions.weaver.strategy;

import java.util.List;

import org.opt4j.genotype.ListGenotype;
import org.palladiosimulator.pcm.repository.Repository;

import de.uka.ipd.sdq.pcm.designdecision.Choice;
import de.uka.ipd.sdq.pcm.designdecision.DegreeOfFreedomInstance;
import de.uka.ipd.sdq.pcm.designdecision.specific.FeatureCompletionDegree;
import edu.kit.ipd.are.dsexplore.featurecompletions.weaver.FCCWeaver;

public interface IStrategyExtension {

	void nextDecodeStart();

	void grabChoices(Choice fccChoice, List<Choice> notTransformedChoices);

	void additionalCreateFCCDegreeBy(FeatureCompletionDegree degree, List<DegreeOfFreedomInstance> dds, ListGenotype<Choice> initialCandidate, FCCWeaver fccWeaver);
}