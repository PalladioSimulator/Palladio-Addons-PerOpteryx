package de.uka.ipd.sdq.dsexplore.constraints;

import java.util.stream.Stream;

import org.palladiosimulator.pcm.allocation.AllocationContext;
import org.palladiosimulator.pcm.repository.RepositoryComponent;
import org.palladiosimulator.pcm.resourceenvironment.ResourceContainer;

import ConcernModel.Association;
import ConcernModel.ElementaryConcernComponent;
import de.uka.ipd.sdq.dsexplore.helper.EMFHelper;
import de.uka.ipd.sdq.dsexplore.opt4j.genotype.DesignDecisionGenotype;
import de.uka.ipd.sdq.pcm.designdecision.ClassChoice;
import de.uka.ipd.sdq.pcm.designdecision.specific.AllocationDegree;
import de.uka.ipd.sdq.pcm.designdecision.specific.impl.AllocationDegreeImpl;

public class IsolatedDeploymentConstraint extends ConcernDeploymentConstraint {
	
	@Override
	public boolean isValid(DesignDecisionGenotype genotype) {
		
		setDesignDecisionGenotype(genotype);
		
		return getInstancesOfType(AllocationDegreeImpl.class, genotype).filter(eachClassChoice -> containsECC(eachClassChoice))
				   													   .allMatch(eachClassChoice -> isValid(eachClassChoice));
		
	}

	private boolean isValid(ClassChoice classChoice) {
		
		ElementaryConcernComponent ecc = getECCFrom(classChoice);
		return ecc.getAnnotationenrich().stream().allMatch(eachAnnotationEnrich -> {
		
					if (concernManager.getDeploymentConstraintOf(eachAnnotationEnrich).equals(Association.ISOLATED)) {
				
						return isIsolatedOn((ResourceContainer) classChoice.getChosenValue(), ecc);
				
					}
			
					return true;
			
		});
		
		
	}

	private boolean isIsolatedOn(ResourceContainer resourceContainer, ElementaryConcernComponent ecc) {
		
		return getComponentsAllocatedOn(resourceContainer).count() == 0;
		
	}

	private Stream<RepositoryComponent> getComponentsAllocatedOn(ResourceContainer resourceContainer) {
		
		return getInstancesOfType(AllocationDegreeImpl.class, this.genotype).filter(eachClassChoice -> isAllocatedOn(resourceContainer, eachClassChoice) && 
																									   !isECCAllocationDegree(eachClassChoice))
																	 		.map(eachClassChoice -> getEncapsulatedComponent(eachClassChoice));
		
	}

	private boolean isECCAllocationDegree(ClassChoice classChoice) {
		
		AllocationDegree allocDegree = (AllocationDegree) classChoice.getDegreeOfFreedomInstance();
		return allocDegree.getPrimaryChanged() instanceof ElementaryConcernComponent;
		
	}

	private RepositoryComponent getEncapsulatedComponent(ClassChoice classChoice) {

		AllocationDegree allocDegree = (AllocationDegree) classChoice.getDegreeOfFreedomInstance();
		return ((AllocationContext) allocDegree.getPrimaryChanged()).getAssemblyContext_AllocationContext().getEncapsulatedComponent__AssemblyContext();
		
	}

	private boolean isAllocatedOn(ResourceContainer resourceContainer, ClassChoice classChoice) {
		
		return EMFHelper.checkIdentity((ResourceContainer) classChoice.getChosenValue(), resourceContainer);
		
	}

}
