package edu.kit.ipd.are.dsexplore.concern.concernweaver.test.peropteryx.constraint;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import ConcernModel.Association;
import de.uka.ipd.sdq.dsexplore.constraints.IsolatedDeploymentConstraint;
import de.uka.ipd.sdq.dsexplore.opt4j.genotype.DesignDecisionGenotype;
import edu.kit.ipd.are.dsexplore.concern.concernweaver.test.util.ConcernWeavingTestUtil;

public class IsolatedDeploymentConstraintTest extends DeploymentConstraintTest {
	
	@Test
	public void testCheckIsolatedDeploymentConstraint_PositiveCase() {
		
		givenValidGenotype();
		whenCheckForValidity();
		thenIsolatedDeploymentConstraintShouldBeValid();
		
	}
	
	@Test
	public void testCheckIsolatedDeploymentConstraint_NegativeCase() {
		
		givenNonValidGenotype();
		whenCheckForValidity();
		thenIsolatedDeploymentConstraintShouldBeNotValid();
		
	}

	private void givenValidGenotype() {
		
		DesignDecisionGenotype genotype = new DesignDecisionGenotype();
		addAllocationContextsAllocatedOnOneContainer(genotype);
		addECCToEmptyContainer(genotype, ConcernWeavingTestUtil.getResponseECCOf(concern));
		setGenotype(genotype);
		setAssociationOfDeploymentConstraint(2, Association.ISOLATED);

	}
	
	private void givenNonValidGenotype() {
		
		DesignDecisionGenotype genotype = new DesignDecisionGenotype();
		addDefaultAllocation(genotype);
		addECCToNonEmptyContainer(genotype, ConcernWeavingTestUtil.getResponseECCOf(concern));
		setGenotype(genotype);
		setAssociationOfDeploymentConstraint(2, Association.ISOLATED);
		
	}

	private void whenCheckForValidity() {
		
		this.result = new IsolatedDeploymentConstraint().isValid(this.genotype);
		
	}

	private void thenIsolatedDeploymentConstraintShouldBeValid() {
		
		assertTrue(this.result);
		
	}
	
	private void thenIsolatedDeploymentConstraintShouldBeNotValid() {
		
		assertFalse(this.result);
		
	}

}
