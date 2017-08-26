package de.uka.ipd.sdq.dsexplore.designdecisions.concern;

import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.palladiosimulator.pcm.repository.Repository;
import org.palladiosimulator.pcm.resourceenvironment.ResourceContainer;

import ConcernModel.AnnotationEnrich;
import ConcernModel.AnnotationTarget;
import ConcernModel.Concern;
import ConcernModel.ElementaryConcernComponent;
import de.uka.ipd.sdq.pcm.designdecision.ClassChoice;
import de.uka.ipd.sdq.pcm.designdecision.designdecisionFactory;
import de.uka.ipd.sdq.pcm.designdecision.specific.AllocationDegree;
import de.uka.ipd.sdq.pcm.designdecision.specific.specificFactory;
import edu.kit.ipd.are.dsexplore.concern.emfprofilefilter.AnnotationFilter;
import edu.kit.ipd.are.dsexplore.concern.exception.ConcernWeavingException;
import edu.kit.ipd.are.dsexplore.concern.exception.ErrorMessage;
import edu.kit.ipd.are.dsexplore.concern.manager.ConcernManager;
import edu.kit.ipd.are.dsexplore.concern.manager.TransformationRepositoryManager;

public class ECCAllocDegreeDesignDecision {

	private final ConcernManager concernManager;
	private final AnnotationFilter annotationFilter;
	private static final Random RANDOM = new SecureRandom();

	public ECCAllocDegreeDesignDecision(Concern concern, List<Repository> repositories) {
		this.concernManager = ConcernManager.getInstanceBy(concern);
		this.annotationFilter = new AnnotationFilter(repositories);
	}

	public List<ClassChoice> getECCClassChoicesFrom(List<ResourceContainer> availableResourceContainer) throws ConcernWeavingException {
		List<ElementaryConcernComponent> eccs = this.getUsedECCs().collect(Collectors.toList());
		List<ClassChoice> choices = new ArrayList<>();
		for (ElementaryConcernComponent ecc : eccs) {
			ClassChoice c = this.toClassChoice(ecc, availableResourceContainer);
			choices.add(c);
		}
		return choices;
		// return this.getUsedECCs().map(eachECC -> this.toClassChoice(eachECC,
		// availableResourceContainer)).collect(Collectors.toList());
	}

	private Stream<ElementaryConcernComponent> getUsedECCs() throws ConcernWeavingException {
		// TODO Here add all possible optional ECC
		try {
			return this.getAllOccuringTargetAnnotations().flatMap(targetAnnotation -> this.getECCsRelatedTo(targetAnnotation)).distinct();
		} catch (Exception ex) {
			throw new ConcernWeavingException(ex.getMessage());
		}
	}

	private Stream<ElementaryConcernComponent> getECCsRelatedTo(AnnotationTarget targetAnnotation) {

		try {
			AnnotationEnrich enrich = this.getEnrichAnnotationBy(targetAnnotation);
			return this.resolveAllRequiredECCsFrom(this.getECCWith(enrich));
		} catch (ConcernWeavingException ex) {
			throw new RuntimeException(ex);
		}

	}

	private AnnotationEnrich getEnrichAnnotationBy(AnnotationTarget target) throws ConcernWeavingException {
		return TransformationRepositoryManager.getInstance().getEnrichAnnotationBy(target).orElseThrow(() -> new ConcernWeavingException(ErrorMessage.missingAnnotationOpponent(target)));
	}

	private ElementaryConcernComponent getECCWith(AnnotationEnrich enrich) throws ConcernWeavingException {
		return this.concernManager.getElementaryConcernComponentBy(enrich).orElseThrow(() -> new ConcernWeavingException(ErrorMessage.missingECC(enrich)));
	}

	private Stream<ElementaryConcernComponent> resolveAllRequiredECCsFrom(ElementaryConcernComponent ecc) {

		if (ecc.getRequires().isEmpty()) {
			return Stream.of(ecc);
		}

		return Stream.concat(Stream.of(ecc), ecc.getRequires().stream().flatMap(eachRequiredECC -> this.resolveAllRequiredECCsFrom(eachRequiredECC)));

	}

	private Stream<AnnotationTarget> getAllOccuringTargetAnnotations() {
		return this.annotationFilter.getTargetAnnotatedElements().stream().map(each -> AnnotationFilter.getTargetAnnotationFrom(each).get()).distinct();
	}

	private ClassChoice toClassChoice(ElementaryConcernComponent ecc, List<ResourceContainer> availableResourceContainer) {
		AllocationDegree allocDegree = this.createAllocationDegreeWith(ecc, availableResourceContainer);
		ClassChoice choice = this.createClassChoiceWith(allocDegree);

		return this.deployOnRandomResourceContainer(choice, availableResourceContainer);
	}

	private ClassChoice createClassChoiceWith(AllocationDegree allocDegree) {
		ClassChoice choice = designdecisionFactory.eINSTANCE.createClassChoice();
		choice.setDegreeOfFreedomInstance(allocDegree);

		return choice;
	}

	private AllocationDegree createAllocationDegreeWith(ElementaryConcernComponent ecc, List<ResourceContainer> availableResourceContainer) {
		AllocationDegree allocDegree = specificFactory.eINSTANCE.createAllocationDegree();
		allocDegree.setPrimaryChanged(ecc);
		allocDegree.getClassDesignOptions().addAll(availableResourceContainer);

		return allocDegree;
	}

	private ClassChoice deployOnRandomResourceContainer(ClassChoice choice, List<ResourceContainer> availableResourceContainer) {
		int index = ECCAllocDegreeDesignDecision.RANDOM.nextInt(availableResourceContainer.size());
		choice.setChosenValue(availableResourceContainer.get(index));
		return choice;
	}

}
