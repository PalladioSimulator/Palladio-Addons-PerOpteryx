/**
 *
 */
package edu.kit.ipd.are.dsexplore.featurecompletions.weaver.designdecision;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.palladiosimulator.pcm.repository.Repository;

import FeatureCompletionModel.ComplementumVisnetis;
import FeatureCompletionModel.FeatureCompletion;
import de.uka.ipd.sdq.dsexplore.tools.stereotypeapi.StereotypeAPIHelper;
import de.uka.ipd.sdq.pcm.designdecision.Choice;
import de.uka.ipd.sdq.pcm.designdecision.ClassChoice;
import de.uka.ipd.sdq.pcm.designdecision.FeatureChoice;
import de.uka.ipd.sdq.pcm.designdecision.designdecisionFactory;
import de.uka.ipd.sdq.pcm.designdecision.specific.ComplementumVisnetisDegree;
import de.uka.ipd.sdq.pcm.designdecision.specific.FeatureCompletionDegree;
import de.uka.ipd.sdq.pcm.designdecision.specific.FeatureDegree;
import de.uka.ipd.sdq.pcm.designdecision.specific.specificFactory;
import edu.kit.ipd.are.dsexplore.featurecompletions.weaver.port.FCCWeaverException;
import edu.kit.ipd.are.dsexplore.featurecompletions.weaver.strategy.handler.FCCFeatureHandler;
import edu.kit.ipd.are.dsexplore.featurecompletions.weaver.strategy.manager.SolutionManager;
import featureObjective.Feature;
import featureSolution.ExtensionInclusion;
import featureSolution.FeatureList;
import featureSolution.InclusionMechanism;
import featureSolution.SelectedCV;

/**
 * @author Maximilian Eckert (maximilian.eckert@student.kit.edu,
 *         maxieckert@web.de)
 *
 *
 */
public class ComplementumVisnetisDesignDecision {

	private FeatureCompletion fc;
	private List<Repository> solutions;
	private List<FeatureList> featureLists;

	/**
	 * @param degree
	 * @param solutions
	 */
	public ComplementumVisnetisDesignDecision(FeatureCompletionDegree degree, List<Repository> solutions) {
		this.fc = (FeatureCompletion) degree.getPrimaryChanged();
		this.solutions = solutions;
		// TODO von welchem Advice Features/CV holen?
		this.featureLists = ((ExtensionInclusion) this.determineIM(solutions)).getAdvice().get(0).getCompletion().getFeatureLists();
	}

	/**
	 * @return
	 */
	public List<Choice> generateComplementumVisnetisDegrees() {
		List<Choice> result = new ArrayList<>();

		// add dof for each feature group
		for (FeatureList featureList : this.featureLists) {
			// TODO handle optional cvs
//			if (this.containsOptionalCVs(featureList)) {
//				result.addAll(this.createOptionalCVChoice(featureList));
//				continue;
//			}

			ComplementumVisnetisDegree cvDegree = specificFactory.eINSTANCE.createComplementumVisnetisDegree();
			cvDegree.setEntityName("cv");
			cvDegree.setPrimaryChanged(featureList);
			// TODO add only features that are supported by all solutions??
			for (SelectedCV selectedCV : featureList.getFeatures()) {
				cvDegree.getClassDesignOptions().add(selectedCV);

			}

			ClassChoice choice = designdecisionFactory.eINSTANCE.createClassChoice();
			choice.setDegreeOfFreedomInstance(cvDegree);
			choice.setChosenValue(cvDegree.getClassDesignOptions().get(0));

			result.add(choice);
		}

		return result;
	}

	/**
	 * @param featureList
	 * @return
	 */
	private boolean containsOptionalCVs(FeatureList featureList) {
		return featureList.getFeatures().stream().anyMatch(selectedcv -> selectedcv.isOptional());
	}

	public List<FeatureChoice> createOptionalCVChoice(FeatureList featureList) {
		List<FeatureChoice> result = new ArrayList<>();
		for (SelectedCV cv : featureList.getFeatures()) {
			FeatureDegree optionalCVDegree = specificFactory.eINSTANCE.createFeatureDegree();
			optionalCVDegree.setEntityName("optional_cv");
			optionalCVDegree.setPrimaryChanged(cv.getComplementumVisnetis());

			FeatureChoice choice = designdecisionFactory.eINSTANCE.createFeatureChoice();
			choice.setDegreeOfFreedomInstance(optionalCVDegree);
			choice.setSelected(false);

			result.add(choice);
		}
		return result;
	}

	/**
	 * @param feature
	 * @return
	 */
	private ComplementumVisnetis cvProvidingFeature(Feature feature) {
		return this.fc.getComplementa().stream().filter(c -> c instanceof ComplementumVisnetis).map(c -> (ComplementumVisnetis) c)
				.filter(cv -> cv.getComplementaryFeature().getId().equals(feature.getId())).findAny().get();
	}

	/**
	 * @param feature
	 * @return
	 */
	private boolean featureSupportedByAllSolutions(Feature feature) {
		for (Repository solution : this.solutions) {
			List<Feature> providedFeatures = new FCCFeatureHandler(new SolutionManager(solution)).extractProvidedCVs().stream().map(pair -> pair.second.getComplementaryFeature())
					.collect(Collectors.toList());
			if (!providedFeatures.stream().anyMatch(f -> f.getId().equals(feature.getId()))) {
				return false;
			}
		}
		return true;
	}

	// TODO replication in FCCWeaver???
	private InclusionMechanism determineIM(List<Repository> solutions) {
		InclusionMechanism meachanism = null;
		for (Repository repo : solutions) {
			List<InclusionMechanism> meachanisms = StereotypeAPIHelper.getViaStereoTypeFrom(repo, InclusionMechanism.class, "transformation");
			if (meachanisms.size() != 1) {
				continue;
			}
			if (meachanism == null) {
				meachanism = meachanisms.get(0);
			} else if (!meachanism.getId().equals(meachanisms.get(0).getId())) {
				throw new FCCWeaverException("Multiple InclusionMechanisms are not supported yet.");
			}
		}
		return meachanism;
	}

}
