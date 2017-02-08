package edu.kit.ipd.are.dsexplore.concern.concernweaver.test.adapter;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.util.List;

import org.junit.Test;

import edu.kit.ipd.are.dsexplore.concern.concernweaver.ConcernWeaver;
import edu.kit.ipd.are.dsexplore.concern.concernweaver.WeavingInstruction;
import edu.kit.ipd.are.dsexplore.concern.concernweaver.test.util.WeavingTest;

public class ConcernWeaverTest extends WeavingTest {

	@Test
	public void testAllocationWeaving() {
		
		List<WeavingInstruction> weavingInstructions = createTestWeavingInstructions();
		
		try {
			
			ConcernWeaver.getBy(pcmToAdapt, concernSolution).start(weavingInstructions);
			
		} catch (Exception ex) {
			
			fail("Error occured during weaving-process: \n" + ex.getMessage());
			
		}
		
		assertTrue(true);
		
	}

}
