package edu.kit.ipd.are.dsexplore.concern.concernweaver.test.adapter;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.palladiosimulator.solver.transformations.EMFHelper;

import edu.kit.ipd.are.dsexplore.concern.concernweaver.WeavingInstruction;
import edu.kit.ipd.are.dsexplore.concern.concernweaver.WeavingStep;
import edu.kit.ipd.are.dsexplore.concern.concernweaver.test.util.ConcernWeavingTestUtil;
import edu.kit.ipd.are.dsexplore.concern.concernweaver.test.util.WeavingTest;
import edu.kit.ipd.are.dsexplore.concern.repository.RepositoryWeaving;

public class RepositoryWeavingTest extends WeavingTest {
	
	@Before
	public void setUp() {
		
		WeavingStep.setGlobalSettings(pcmToAdapt, getPcmConcernRepository());
        
	}

	@Test
	public void testRepositoryWeaving() {
		
		try {
			
			List<WeavingInstruction> weavingInstructions = createTestWeavingInstructions();
			for (WeavingInstruction eachWeavingInstruction : weavingInstructions) {
				
				WeavingStep.setWeavingStrategy(eachWeavingInstruction.getTransformationStrategy());
				new RepositoryWeaving().weave(eachWeavingInstruction);
				
			}
			
		} catch (Exception ex) {
			
			fail("Error occured during weaving-process: \n" + ex.getMessage());
			
		}
		
		assertTrue(true);
		
	}
	
	@After
	public void tearDown() {
		
		EMFHelper.saveToXMIFile(WeavingStep.getConcernSolution(), ConcernWeavingTestUtil.RELATIVE_CONCERN_REPOSITORY_PERSISTING_PATH);
		
	}

}
