package de.uka.ipd.sdq.dsexplore.constraints;

import java.util.stream.Stream;

import org.eclipse.emf.ecore.EObject;
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
		
		//count == 1, because the ECC under consideration should be the only object allocated on the resource container
		//allocation contexts with only one fixed resource container are also modelled as design decision.
		return getObjectsAllocatedOn(resourceContainer).count() == 1;
		
	}

	private Stream<EObject> getObjectsAllocatedOn(ResourceContainer resourceContainer) {
		
		return getInstancesOfType(AllocationDegreeImpl.class, this.genotype).filter(eachClassChoice -> isAllocatedOn(resourceContainer, eachClassChoice))
																	 		.map(eachClassChoice -> getObject(eachClassChoice));
		
	}

	private EObject getObject(ClassChoice classChoice) {

		return (EObject) classChoice.getDegreeOfFreedomInstance().getPrimaryChanged();
		
	}

	private boolean isAllocatedOn(ResourceContainer resourceContainer, ClassChoice classChoice) {
		
		return EMFHelper.checkIdentity((ResourceContainer) classChoice.getChosenValue(), resourceContainer);
		
	}

}
