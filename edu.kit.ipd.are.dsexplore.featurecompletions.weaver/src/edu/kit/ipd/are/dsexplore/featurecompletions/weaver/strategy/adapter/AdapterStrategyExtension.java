package edu.kit.ipd.are.dsexplore.featurecompletions.weaver.strategy.adapter;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Set;

import org.opt4j.genotype.ListGenotype;
import org.palladiosimulator.pcm.repository.Repository;

import FeatureCompletionModel.FeatureCompletion;
import de.uka.ipd.sdq.pcm.designdecision.BoolChoice;
import de.uka.ipd.sdq.pcm.designdecision.Choice;
import de.uka.ipd.sdq.pcm.designdecision.DegreeOfFreedomInstance;
import de.uka.ipd.sdq.pcm.designdecision.designdecisionFactory;
import de.uka.ipd.sdq.pcm.designdecision.specific.FeatureCompletionDegree;
import de.uka.ipd.sdq.pcm.designdecision.specific.FeatureDegree;
import de.uka.ipd.sdq.pcm.designdecision.specific.specificFactory;
import edu.kit.ipd.are.dsexplore.featurecompletions.weaver.FCCWeaver;
import edu.kit.ipd.are.dsexplore.featurecompletions.weaver.port.FCCWeaverException;
import edu.kit.ipd.are.dsexplore.featurecompletions.weaver.strategy.IStrategyExtension;
import featureObjective.Feature;

public class AdapterStrategyExtension implements IStrategyExtension {
	List<BoolChoice> optionalFeatures;

	@Override
	public void nextDecodeStart() {
		// Reset all ..
		this.optionalFeatures = new ArrayList<>();

	}

	@Override
	public void grabChoices(Repository solution, List<Choice> notTransformedChoices) {
		for (Choice c : notTransformedChoices) {
			if (c.getDegreeOfFreedomInstance() instanceof FeatureDegree) {
				this.optionalFeatures.add((BoolChoice) c);
			}
		}
		this.optionalFeatures.forEach(f -> notTransformedChoices.remove(f));
		this.checkPossibleSolution(solution);
	}

	private void checkPossibleSolution(Repository solution) {
		List<Feature> features = this.getFeatures(solution);
		for (BoolChoice ch : this.optionalFeatures) {
			if (!ch.isChosenValue()) {
				continue;
			}

			Feature feature = (Feature) ((FeatureDegree) ch.getDegreeOfFreedomInstance()).getPrimaryChanged();
			if (!features.contains(feature)) {
				throw new FCCWeaverException("Feature " + feature + " not found in Solution " + solution);
			}
		}
	}

	private List<Feature> getFeatures(Repository solution) {
		return new ArrayList<>();
	}

	@Override
	public void additionalCreateFCCDegreeBy(FeatureCompletionDegree degree, List<DegreeOfFreedomInstance> dds, ListGenotype<Choice> initialCandidate, FCCWeaver fccWeaver) {
		FeatureCompletion fc = (FeatureCompletion) degree.getPrimaryChanged();
		Set<Feature> features = this.getOptionalFeatures(fc);
		// Add Choices
		for (Feature optional : features) {
			FeatureDegree fd = specificFactory.eINSTANCE.createFeatureDegree();
			fd.setPrimaryChanged(optional);
			BoolChoice bc = designdecisionFactory.eINSTANCE.createBoolChoice();
			bc.setDegreeOfFreedomInstance(fd);
			dds.add(fd);
			initialCandidate.add(bc);
		}
	}

	private Set<Feature> getOptionalFeatures(FeatureCompletion fc) {
		Set<Feature> res = new HashSet<>();
		Feature root = fc.getFeatureObjectives().getRootFeature();
		Queue<Feature> features = new LinkedList<>();
		features.add(root);

		while (!features.isEmpty()) {
			Feature current = features.poll();
			// TODO DTHF1
		}
		return res;
	}

}
