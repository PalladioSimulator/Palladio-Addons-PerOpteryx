package de.uka.ipd.sdq.dsexplore.designdecisions.concern;

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
import edu.kit.ipd.are.dsexplore.concern.manager.ConcernManager;
import edu.kit.ipd.are.dsexplore.concern.manager.TransformationRepositoryManager;

public class ECCAllocDegreeDesignDecision {

	private final ConcernManager concernManager;
	private final AnnotationFilter annotationFilter;
	
	public ECCAllocDegreeDesignDecision(Concern concern, List<Repository> repositories) {
		
		this.concernManager = ConcernManager.getBy(concern);
		this.annotationFilter = new AnnotationFilter(repositories);
		
	}
	
	public List<ClassChoice> getECCClassChoicesFrom(List<ResourceContainer> availableResourceContainer) {
		
		return getUsedECCs().map(eachECC -> toClassChoice(eachECC, availableResourceContainer))
							.collect(Collectors.toList());
		
	}

	private Stream<ElementaryConcernComponent> getUsedECCs() {
		
		return getTargetAnnotations().flatMap(targetAnnotation -> getECCsRelatedTo(targetAnnotation))
									 .distinct();
		
	}

	private Stream<ElementaryConcernComponent> getECCsRelatedTo(AnnotationTarget targetAnnotation) {
		
		//TODO exception handling
		AnnotationEnrich enrich = TransformationRepositoryManager.getInstance().getEnrichAnnotationBy(targetAnnotation).get();
		return resolveAllRequiredECCsFrom(this.concernManager.getElementaryConcernComponentBy(enrich).get());
		
	}
	
	private Stream<ElementaryConcernComponent> resolveAllRequiredECCsFrom(ElementaryConcernComponent ecc) {
		
		Stream<ElementaryConcernComponent> current = Stream.of(ecc);
		
		if (ecc.getRequires().isEmpty()) {
			
			return current;
		
		}
		
		return Stream.concat(current, ecc.getRequires().stream().flatMap(eachRequiredECC -> resolveAllRequiredECCsFrom(eachRequiredECC)));
		
	}

	private Stream<AnnotationTarget> getTargetAnnotations() {
		
		return this.annotationFilter.getTargetAnnotatedComponents().stream().map(eachComponent -> this.annotationFilter.getTargetAnnotationFrom(eachComponent).get())
																			.distinct();
		
	}
	
	private ClassChoice toClassChoice(ElementaryConcernComponent ecc, List<ResourceContainer> availableResourceContainer) {
		
		AllocationDegree allocDegree = createAllocationDegreeWith(ecc, availableResourceContainer);
		ClassChoice choice = createClassChoiceWith(allocDegree);
		
		return deployOnRandomResourceContainer(choice, availableResourceContainer);
		
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
		
		int index = getRandomIndex(availableResourceContainer.size());
		choice.setChosenValue(availableResourceContainer.get(index));
		
		return choice;
		
	}
	
	private int getRandomIndex(int bound) {
		
		return new Random(System.currentTimeMillis()).nextInt(--bound);
		
	}
	
}
