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
import de.uka.ipd.sdq.pcm.designdecision.ClassChoice;
import de.uka.ipd.sdq.pcm.designdecision.designdecisionFactory;
import de.uka.ipd.sdq.pcm.designdecision.specific.ClassDegree;
import de.uka.ipd.sdq.pcm.designdecision.specific.ComplementumVisnetisDegree;
import de.uka.ipd.sdq.pcm.designdecision.specific.FeatureCompletionDegree;
import de.uka.ipd.sdq.pcm.designdecision.specific.specificFactory;
import edu.kit.ipd.are.dsexplore.featurecompletions.weaver.port.FCCWeaverException;
import edu.kit.ipd.are.dsexplore.featurecompletions.weaver.strategy.handler.FCCFeatureHandler;
import edu.kit.ipd.are.dsexplore.featurecompletions.weaver.strategy.manager.SolutionManager;
import featureObjective.Feature;
import featureObjective.FeatureGroup;
import featureSolution.ExtensionInclusion;
import featureSolution.InclusionMechanism;

/**
 * @author Maximilian Eckert (maximilian.eckert@student.kit.edu, maxieckert@web.de)
 * 
 *
 */
public class ComplementumVisnetisDesignDecision {

	private FeatureCompletion fc;
	private List<Repository> solutions;
	private List<Feature> features;

	/**
	 * @param degree
	 * @param solutions 
	 */
	public ComplementumVisnetisDesignDecision(FeatureCompletionDegree degree, List<Repository> solutions) {
		this.fc = (FeatureCompletion) degree.getPrimaryChanged();
		this.solutions = solutions;
		//TODO von welchem Advice Features/CV holen?
		this.features = ((ExtensionInclusion) determineIM(solutions)).getAdvice().get(0).getCompletion().getFeatures().stream().map(cv -> cv.getComplementaryFeature()).collect(Collectors.toList());
	}

	/**
	 * @return
	 */
	public List<ClassChoice> generateComplementumVisnetisDegrees() {
		List<ClassChoice> result = new ArrayList<ClassChoice>();
		
		List<FeatureGroup> featureGroups = new ArrayList<FeatureGroup>();

		for (Feature feature : features) {
			if (feature.eContainer() instanceof FeatureGroup) {
				featureGroups.add((FeatureGroup) feature.eContainer());
			}
		}
		//add dof for each feature group
		for (FeatureGroup featureGroup : featureGroups) {
			ComplementumVisnetisDegree cvDegree = specificFactory.eINSTANCE.createComplementumVisnetisDegree();
			cvDegree.setEntityName("cv");
			cvDegree.setPrimaryChanged(featureGroup);
			//TODO add only features that are supported by all solutions??
			for (Feature feature : featureGroup.getChildren()) {
				if (featureSupportedByAllSolutions(feature)) {
					cvDegree.getClassDesignOptions().add(cvProvidingFeature(feature));
				}
			}
			
			
			ClassChoice choice = designdecisionFactory.eINSTANCE.createClassChoice();
			choice.setDegreeOfFreedomInstance(cvDegree);
			choice.setChosenValue(cvDegree.getClassDesignOptions().get(0));
			
			result.add(choice);
		}
		
		return result;
	}
	
	/**
	 * @param feature
	 * @return
	 */
	private ComplementumVisnetis cvProvidingFeature(Feature feature) {
		return fc.getComplementa().stream().filter(c -> c instanceof ComplementumVisnetis).map(c -> (ComplementumVisnetis) c).filter(cv -> cv.getComplementaryFeature().getId().equals(feature.getId())).findAny().get();
	}

	/**
	 * @param feature
	 * @return
	 */
	private boolean featureSupportedByAllSolutions(Feature feature) {
		for (Repository solution : solutions) {
			List<Feature> providedFeatures = new FCCFeatureHandler(new SolutionManager(solution)).extractProvidedCVs().stream().map(pair -> pair.second.getComplementaryFeature()).collect(Collectors.toList());
			if (!providedFeatures.stream().anyMatch(f -> f.getId().equals(feature.getId()))) {
				return false;
			}
		}
		return true;
	}

	//TODO replication in FCCWeaver???
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
