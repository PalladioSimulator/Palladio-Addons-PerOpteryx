package de.uka.ipd.sdq.dsexplore.designdecisions.concern;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.eclipse.emf.ecore.EObject;
import org.modelversioning.emfprofileapplication.StereotypeApplication;
import org.palladiosimulator.pcm.repository.Repository;

import ConcernModel.Concern;
import ConcernModel.ConcernRepository;
import ConcernModel.ElementaryConcernComponent;
import SolutionModel.Solution;
import concernStrategy.Feature;
import concernStrategy.FeatureDiagram;
import de.uka.ipd.sdq.pcm.designdecision.specific.ConcernDegree;
import de.uka.ipd.sdq.pcm.designdecision.specific.specificFactory;
import edu.kit.ipd.are.dsexplore.concern.emfprofilefilter.EMFProfileFilter;
import edu.kit.ipd.are.dsexplore.concern.util.EcoreReferenceResolver;

public class ConcernDesignDecision {

	private final ConcernRepository concernRepository;

	public ConcernDesignDecision(ConcernRepository concernRepository) {

		this.concernRepository = concernRepository;

	}

	public List<ConcernDegree> generateConcernDegrees() {

		return this.concernRepository.getConcerns().stream().map(eachConcern -> this.generateConcernDegreeWith(eachConcern)).filter(eachConcernDegree -> this.hasDesignOptions(eachConcernDegree))
				.collect(Collectors.toList());

	}

	private ConcernDegree generateConcernDegreeWith(Concern concern) {
		ConcernDegree concernDegree = specificFactory.eINSTANCE.createConcernDegree();
		concernDegree.setPrimaryChanged(concern);
		concernDegree.getClassDesignOptions().addAll(this.getConcernSolutionsOf(concern));
		this.tryToAddFeatureDiagram(concernDegree, concern);
		return concernDegree;

	}

	/**
	 * Try to add the FeatureDiagram to the ConcernDegree (if present)
	 *
	 * @param concernDegree
	 *            the {@link ConcernDegree}
	 * @param concern
	 *            the {@link Concern}
	 * @author Dominik Fuchss
	 */
	// assert: Only one FeatureDiagram per Concern
	private void tryToAddFeatureDiagram(ConcernDegree concernDegree, Concern concern) {
		FeatureDiagram fd = null;
		for (ElementaryConcernComponent ecc : concern.getComponents()) {
			Feature feature = this.getFeatureProvidedBy(ecc);
			FeatureDiagram cfd = this.getFeatureDiagram(feature);
			if (cfd != null) {
				fd = cfd;
				break;
			}
		}
		if (fd != null) {
			concernDegree.setFeatureDiagram(fd);
		}
	}

	private FeatureDiagram getFeatureDiagram(Feature f) {
		EObject obj = f;
		while (obj != null && !(obj instanceof FeatureDiagram)) {
			obj = obj.eContainer();
		}
		return (FeatureDiagram) obj;
	}
	///////////////////////////////////////
	// See edu.kit.ipd.are.dsexplore.concern.handler.ECCFeatureHandler

	private Feature getFeatureProvidedBy(ElementaryConcernComponent ecc) {
		StereotypeApplication stereotypeApplication = EMFProfileFilter.getStereotypeApplicationsFrom(ecc).get(0);
		return this.getFeatureFrom(stereotypeApplication).orElseGet(() -> null);
	}

	private Optional<Feature> getFeatureFrom(StereotypeApplication stereotypeApplication) {
		List<Feature> features = this.getFeaturesFrom(stereotypeApplication);
		return features.isEmpty() ? Optional.empty() : Optional.of(features.get(0));
	}

	private List<Feature> getFeaturesFrom(StereotypeApplication stereotypeApplication) {
		return new EcoreReferenceResolver(stereotypeApplication).getCrossReferencedElementsOfType(Feature.class);
	}

	////////////////////////////////////////////////

	private boolean hasDesignOptions(ConcernDegree concernDegree) {

		return !concernDegree.getClassDesignOptions().isEmpty();

	}

	private List<Repository> getConcernSolutionsOf(Concern concern) {

		List<Solution> concernSolutions = concern.getStrategies().get(0).getConcernSolutions();
		return concernSolutions.stream().map(eachSolution -> eachSolution.getRepository()).collect(Collectors.toList());

	}

}
