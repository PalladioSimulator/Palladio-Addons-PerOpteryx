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
import de.uka.ipd.sdq.pcm.designdecision.specific.impl.AllocationDegreeImpl;

public abstract class TargetEnrichAnnotationConstraint extends ConcernDeploymentConstraint {

	protected Association association;
	protected boolean shouldBeAllocatedTogether;
	
	protected abstract void setAssociation();
	protected abstract boolean areCorrectlyAllocated(List<RepositoryComponent> targetAnnotatedComponents, ResourceContainer eccResourceContainer);
	
	@Override
	public boolean isValid(DesignDecisionGenotype genotype) {
		
		setDesignDecisionGenotype(genotype);
		setAssociation();
		
		return getInstancesOfType(AllocationDegreeImpl.class, genotype).filter(eachClassChoice -> containsECC(eachClassChoice))
																	   .allMatch(eachClassChoice -> isValid(eachClassChoice));
		
	}
	
	private boolean isValid(ClassChoice classChoice) {
		
		Iterator<Entry<AnnotationEnrich, Optional<AnnotationTarget>>> enrichTargetEntries = getIteratorBy(classChoice);
		while (enrichTargetEntries.hasNext()) {
			
			//TODO introduce exceptions
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
		
		return concernManager.getDeploymentConstraintOf(annotationEnrich, annotationTarget).equals(this.association);
		
	}
	
	protected EObject getResourceContainerOf(RepositoryComponent annotatedComponent) {
		
		return getInstancesOfType(AllocationDegreeImpl.class, this.genotype).filter(eachAllocationDegree -> encapsulates(annotatedComponent, eachAllocationDegree))
																	 		.map(eachAllocationDegree -> eachAllocationDegree.getChosenValue())
																	 		.findFirst().get();
	
	}

	protected boolean encapsulates(RepositoryComponent annotatedComponent, ClassChoice allocationDegree) {
		
		if (allocationDegree.getDegreeOfFreedomInstance().getPrimaryChanged() instanceof ElementaryConcernComponent) {
			
			return false;
			
		}
		
		AssemblyContext assemblyContext = ((AllocationContext) allocationDegree.getDegreeOfFreedomInstance().getPrimaryChanged()).getAssemblyContext_AllocationContext();
		return EMFHelper.checkIdentity(assemblyContext.getEncapsulatedComponent__AssemblyContext(), annotatedComponent);
		
	}
	
}
