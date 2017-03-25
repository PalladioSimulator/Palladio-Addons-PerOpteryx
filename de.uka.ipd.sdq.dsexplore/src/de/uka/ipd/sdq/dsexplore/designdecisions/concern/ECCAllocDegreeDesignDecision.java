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
import edu.kit.ipd.are.dsexplore.concern.exception.ConcernWeavingException;
import edu.kit.ipd.are.dsexplore.concern.exception.ErrorMessage;
import edu.kit.ipd.are.dsexplore.concern.manager.ConcernManager;
import edu.kit.ipd.are.dsexplore.concern.manager.TransformationRepositoryManager;

public class ECCAllocDegreeDesignDecision {

	private final ConcernManager concernManager;
	private final AnnotationFilter annotationFilter;
	
	public ECCAllocDegreeDesignDecision(Concern concern, List<Repository> repositories) {
		
		this.concernManager = ConcernManager.getBy(concern);
		this.annotationFilter = new AnnotationFilter(repositories);
		
	}
	
	public List<ClassChoice> getECCClassChoicesFrom(List<ResourceContainer> availableResourceContainer) throws ConcernWeavingException {
		
		return getUsedECCs().map(eachECC -> toClassChoice(eachECC, availableResourceContainer))
							.collect(Collectors.toList());
		
	}

	private Stream<ElementaryConcernComponent> getUsedECCs() throws ConcernWeavingException {
		
		try {
			
			return getAllOccuringTargetAnnotations().flatMap(targetAnnotation -> getECCsRelatedTo(targetAnnotation))
					 					 			.distinct();
			
		} catch (Exception ex) {
			
			throw new ConcernWeavingException(ex.getMessage());
			
		}
		
	}

	private Stream<ElementaryConcernComponent> getECCsRelatedTo(AnnotationTarget targetAnnotation) {
		
		try {
			
			AnnotationEnrich enrich = getEnrichAnnotationBy(targetAnnotation);
			return resolveAllRequiredECCsFrom(getECCWith(enrich));
			
		} catch (ConcernWeavingException ex) {
			
			throw new RuntimeException(ex);
			
		}
	
		
	}
	
	private AnnotationEnrich getEnrichAnnotationBy(AnnotationTarget target) throws ConcernWeavingException {
		
		return TransformationRepositoryManager.getInstance().getEnrichAnnotationBy(target)
											  .orElseThrow(() -> new ConcernWeavingException(ErrorMessage.missingAnnotationOpponent(target)));
		
	}
	
	private ElementaryConcernComponent getECCWith(AnnotationEnrich enrich) throws ConcernWeavingException {
		
		return this.concernManager.getElementaryConcernComponentBy(enrich)
								  .orElseThrow(() -> new ConcernWeavingException(ErrorMessage.missingECC(enrich)));
		
	}
	
	private Stream<ElementaryConcernComponent> resolveAllRequiredECCsFrom(ElementaryConcernComponent ecc) {
		
		if (ecc.getRequires().isEmpty()) {
			
			return Stream.of(ecc);
		
		}
		
		return Stream.concat(Stream.of(ecc), ecc.getRequires().stream().flatMap(eachRequiredECC -> resolveAllRequiredECCsFrom(eachRequiredECC)));
		
	}

	private Stream<AnnotationTarget> getAllOccuringTargetAnnotations() {
		
		return this.annotationFilter.getTargetAnnotatedElements().stream().map(each -> AnnotationFilter.getTargetAnnotationFrom(each).get())
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
