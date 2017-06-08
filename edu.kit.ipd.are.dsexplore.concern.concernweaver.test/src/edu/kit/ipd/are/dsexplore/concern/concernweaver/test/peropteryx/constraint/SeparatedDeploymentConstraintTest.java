package edu.kit.ipd.are.dsexplore.concern.concernweaver.test.peropteryx.constraint;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import ConcernModel.Association;
import de.uka.ipd.sdq.dsexplore.constraints.SeparatedDeploymentConstraint;
import de.uka.ipd.sdq.dsexplore.opt4j.genotype.DesignDecisionGenotype;
import edu.kit.ipd.are.dsexplore.concern.concernweaver.test.util.ConcernWeavingTestUtil;

public class SeparatedDeploymentConstraintTest extends DeploymentConstraintTest {
	
	@Test
	public void testCheckSeparatedDeploymentConstraint_PositiveCase() {
		
		givenValidGenotype();
		whenCheckForValidity();
		thenSeparatedDeploymentConstraintShouldBeValid();
		
	}
	
	@Test
	public void testCheckSeparatedDeploymentConstraint_NegativeCase() {
		
		givenNonValidGenotype();
		whenCheckForValidity();
		thenSeparatedDeploymentConstraintShouldNotBeValid();
		
	}

	private void givenValidGenotype() {
		
		DesignDecisionGenotype genotype = new DesignDecisionGenotype();
		addAllocationContextsAllocatedOnOneContainer(genotype);
		addECCToEmptyContainer(genotype, ConcernWeavingTestUtil.getAnalysisECCOf(concern));
		setGenotype(genotype);
		setAssociationOfDeploymentConstraint(1, Association.SEPARATED);
		
	}
	
	private void givenNonValidGenotype() {
		
		DesignDecisionGenotype genotype = new DesignDecisionGenotype();
		addDefaultAllocation(genotype);
		addECCToSpecificContainer(genotype, ConcernWeavingTestUtil.getAnalysisECCOf(concern), getFirstResourceContainer());
		setGenotype(genotype);
		setAssociationOfDeploymentConstraint(1, Association.SEPARATED);
		
	}

	private void whenCheckForValidity() {
		
		this.result = new SeparatedDeploymentConstraint().isValid(this.genotype);
		
	}
	
	private void thenSeparatedDeploymentConstraintShouldBeValid() {
		
		assertTrue(this.result);
		
	}
	
	private void thenSeparatedDeploymentConstraintShouldNotBeValid() {
		
		assertFalse(this.result);
		
	}

}
