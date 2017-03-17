package de.uka.ipd.sdq.dsexplore.constraints;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;

import org.eclipse.emf.ecore.EObject;
import org.palladiosimulator.pcm.allocation.AllocationContext;
import org.palladiosimulator.pcm.core.composition.AssemblyContext;
import org.palladiosimulator.pcm.repository.RepositoryComponent;
import org.palladiosimulator.pcm.resourceenvironment.ResourceContainer;

import ConcernModel.AnnotationEnrich;
import ConcernModel.AnnotationTarget;
import ConcernModel.Association;
import ConcernModel.ElementaryConcernComponent;
import de.uka.ipd.sdq.dsexplore.helper.EMFHelper;
import de.uka.ipd.sdq.dsexplore.opt4j.genotype.DesignDecisionGenotype;
import de.uka.ipd.sdq.pcm.designdecision.ClassChoice;
import de.uka.ipd.sdq.pcm.designdecision.specific.AssembledComponentDegree;
import de.uka.ipd.sdq.pcm.designdecision.specific.impl.AllocationDegreeImpl;

public abstract class TargetEnrichAnnotationConstraint extends ConcernDeploymentConstraint {

	protected boolean shouldBeAllocatedTogether;
	
	protected abstract Association getAssociation();
	protected abstract boolean areCorrectlyAllocated(List<RepositoryComponent> targetAnnotatedComponents, ResourceContainer eccResourceContainer);
	
	@Override
	public boolean isValid(DesignDecisionGenotype genotype) {
		
		setDesignDecisionGenotype(genotype);
		
		return getInstancesOfType(AllocationDegreeImpl.class, genotype).filter(eachClassChoice -> containsECC(eachClassChoice))
																	   .allMatch(eachClassChoice -> isValid(eachClassChoice));
		
	}
	
	private boolean isValid(ClassChoice classChoice) {
		
		Iterator<Entry<AnnotationEnrich, Optional<AnnotationTarget>>> enrichTargetEntries = getIteratorBy(classChoice);
		while (enrichTargetEntries.hasNext()) {
			
			Map.Entry<AnnotationEnrich, Optional<AnnotationTarget>> enrichTargetEntry = enrichTargetEntries.next();
			if (enrichTargetEntry.getValue().isPresent() && hasDeploymentConfiguration(enrichTargetEntry.getKey(), enrichTargetEntry.getValue().get())) {
				
				List<RepositoryComponent> targetAnnotatedComponents = annotationFilter.getTargetAnnotatedComponentsWith(enrichTargetEntry.getValue().get().getName());
				if (targetAnnotatedComponents.isEmpty()) {
					
					break;
					
				}
				
				ResourceContainer eccResourceContainer = (ResourceContainer) classChoice.getChosenValue();
				if (!areCorrectlyAllocated(targetAnnotatedComponents, eccResourceContainer)) {
					
					return false;
					
				}
				
			}
			
		}
		
		return true;
		
	}

	private Iterator<Entry<AnnotationEnrich, Optional<AnnotationTarget>>> getIteratorBy(ClassChoice classChoice) {
		
		ElementaryConcernComponent ecc = getECCFrom(classChoice);
		return concernManager.getTargetAnnotationOf(ecc.getAnnotationenrich()).entrySet().iterator();
		
	}
	
	private boolean hasDeploymentConfiguration(AnnotationEnrich annotationEnrich, AnnotationTarget annotationTarget) {
		
		return concernManager.getDeploymentConstraintOf(annotationEnrich, annotationTarget).equals(getAssociation());
		
	}
	
	protected Optional<EObject> getResourceContainerOf(RepositoryComponent annotatedComponent) {
		
		if(existFunctionalEqualComponents(annotatedComponent)) {
			
			return resolveResourceContainerOf(annotatedComponent);
			
		}
		
		return Optional.of(getResourceContainerOfInstantiated(annotatedComponent));
	
	}
	
	private boolean existFunctionalEqualComponents(RepositoryComponent component) {
		
		return getAffectedAssemblyContext(component).isPresent();
		
	}
	
	private Optional<EObject> resolveResourceContainerOf(RepositoryComponent annotatedComponent) {
		
		//No exception handling required because the check has already been done before.
		AssemblyContext affectedAssemblyContext = getAffectedAssemblyContext(annotatedComponent).get();
		return getInstancesOfType(AllocationDegreeImpl.class, this.genotype).filter(eachAllocationDegree -> encapsulates(affectedAssemblyContext, eachAllocationDegree))
		 																	.map(eachAllocationDegree -> eachAllocationDegree.getChosenValue())
		 																	.findFirst();
		
	}
	protected EObject getResourceContainerOfInstantiated(RepositoryComponent component) {
		
		return getInstancesOfType(AllocationDegreeImpl.class, this.genotype).filter(eachAllocationDegree -> encapsulates(component, eachAllocationDegree))
																	 		.map(eachAllocationDegree -> eachAllocationDegree.getChosenValue())
																	 		.findFirst().get();
	
	}

	private Optional<AssemblyContext> getAffectedAssemblyContext(RepositoryComponent annotatedComponent) {
		
		return getInstancesOfType(AssembledComponentDegree.class, this.genotype).filter(eachChoice -> isContainedIn((AssembledComponentDegree) eachChoice.getDegreeOfFreedomInstance(), annotatedComponent))
																				.map(choice -> (AssemblyContext) choice.getDegreeOfFreedomInstance().getPrimaryChanged())
																				.findFirst();
		
	}

	private boolean isContainedIn(AssembledComponentDegree degreeOfFreedomInstance, RepositoryComponent annotatedComponent) {
		
		return degreeOfFreedomInstance.getClassDesignOptions().contains(annotatedComponent);
		
	}
	
	protected boolean encapsulates(RepositoryComponent annotatedComponent, ClassChoice allocationDegree) {
		
		if(allocatesECC(allocationDegree)) {
			
			return false;
			
		}
		
		return EMFHelper.checkIdentity(getAllocatedAssemblyContextOf(allocationDegree).getEncapsulatedComponent__AssemblyContext(), annotatedComponent);
		
	}
	
	protected boolean encapsulates(AssemblyContext assemblyContext, ClassChoice allocationDegree) {
		
		if(allocatesECC(allocationDegree)) {
			
			return false;
			
		}
		
		return EMFHelper.checkIdentity(assemblyContext, getAllocatedAssemblyContextOf(allocationDegree));
		
	}
	
	private AssemblyContext getAllocatedAssemblyContextOf(ClassChoice allocationDegree) {
		
		return ((AllocationContext) allocationDegree.getDegreeOfFreedomInstance().getPrimaryChanged()).getAssemblyContext_AllocationContext();
		
	}
	
	private boolean allocatesECC(ClassChoice allocationDegree) {
		
		return allocationDegree.getDegreeOfFreedomInstance().getPrimaryChanged() instanceof ElementaryConcernComponent;

		
	}
	
}
