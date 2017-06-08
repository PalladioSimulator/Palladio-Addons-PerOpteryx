package edu.kit.ipd.are.dsexplore.concern.concernweaver.test.peropteryx.constraint;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import ConcernModel.Association;
import de.uka.ipd.sdq.dsexplore.constraints.TogetherDeploymentConstraint;
import de.uka.ipd.sdq.dsexplore.opt4j.genotype.DesignDecisionGenotype;
import edu.kit.ipd.are.dsexplore.concern.concernweaver.test.util.ConcernWeavingTestUtil;

public class TogetherDeploymentConstraintTest extends DeploymentConstraintTest {

	@Test
	public void testCheckTogetherDeploymentConstraint_PositiveCase() {
		
		givenValidGenotype();
		whenCheckForValidity();
		thenTogetherDeploymentConstraintShouldBeValid();
		
	}
	
	@Test
	public void testCheckTogetherDeploymentConstraint_NegativeCase() {
		
		givenNonValidGenotype();
		whenCheckForValidity();
		thenTogetherDeploymentConstraintShouldNotBeValid();
		
	}

	private void givenValidGenotype() {
		
		DesignDecisionGenotype genotype = new DesignDecisionGenotype();
		addAllocationContextsAllocatedOnOneContainer(genotype);
		addECCToSpecificContainer(genotype, ConcernWeavingTestUtil.getDetectionECCOf(concern), getFirstResourceContainer());
		setGenotype(genotype);
		setAssociationOfDeploymentConstraint(0, Association.TOGETHER);
		
	}
	
	private void givenNonValidGenotype() {
		
		DesignDecisionGenotype genotype = new DesignDecisionGenotype();
		addDefaultAllocation(genotype);
		addECCToSpecificContainer(genotype, ConcernWeavingTestUtil.getDetectionECCOf(concern), getFirstResourceContainer());
		setGenotype(genotype);
		setAssociationOfDeploymentConstraint(0, Association.TOGETHER);
		
	}

	private void whenCheckForValidity() {
		
		this.result = new TogetherDeploymentConstraint().isValid(this.genotype);
		
	}
	
	private void thenTogetherDeploymentConstraintShouldBeValid() {
		
		assertTrue(this.result);
		
	}
	
	private void thenTogetherDeploymentConstraintShouldNotBeValid() {
		
		assertFalse(this.result);
		
	}


}
