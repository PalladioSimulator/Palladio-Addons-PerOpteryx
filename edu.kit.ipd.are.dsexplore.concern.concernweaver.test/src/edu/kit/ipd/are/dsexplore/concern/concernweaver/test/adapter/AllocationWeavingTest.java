package edu.kit.ipd.are.dsexplore.concern.concernweaver.test.adapter;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.util.List;

import org.junit.After;
import org.junit.Test;
import org.palladiosimulator.solver.transformations.EMFHelper;

import edu.kit.ipd.are.dsexplore.concern.concernweaver.ConcernWeaver;
import edu.kit.ipd.are.dsexplore.concern.concernweaver.WeavingInstruction;
import edu.kit.ipd.are.dsexplore.concern.concernweaver.test.util.ConcernWeavingTestUtil;
import edu.kit.ipd.are.dsexplore.concern.concernweaver.test.util.WeavingTest;

public class AllocationWeavingTest extends WeavingTest {

	@Test
	public void testAllocationWeaving() {
		
		try {
			
			List<WeavingInstruction> weavingInstructions = createTestWeavingInstructions();
			ConcernWeaver.getBy(pcmToAdapt, concernSolution).start(weavingInstructions);
			
		} catch (Exception ex) {
			
			fail("Error occured during weaving-process: \n" + ex.getMessage());
			
		}
		
		assertTrue(true);
		
	}
	
	@After
	public void tearDown() {
		
		EMFHelper.saveToXMIFile(pcmToAdapt.getAllocation(), ConcernWeavingTestUtil.RELATIVE_ALLOCATION_PERSISTING_PATH);
		
	}

}
