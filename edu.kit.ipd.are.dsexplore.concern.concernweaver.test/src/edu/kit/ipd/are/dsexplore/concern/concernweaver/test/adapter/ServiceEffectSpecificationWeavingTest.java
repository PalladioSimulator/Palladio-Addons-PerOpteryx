package edu.kit.ipd.are.dsexplore.concern.concernweaver.test.adapter;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.util.List;

import org.junit.After;
import org.junit.Test;
import org.palladiosimulator.pcm.repository.Repository;
import org.palladiosimulator.solver.transformations.EMFHelper;

import edu.kit.ipd.are.dsexplore.concern.concernweaver.ConcernWeaver;
import edu.kit.ipd.are.dsexplore.concern.concernweaver.WeavingInstruction;
import edu.kit.ipd.are.dsexplore.concern.concernweaver.WeavingStep;
import edu.kit.ipd.are.dsexplore.concern.concernweaver.test.util.ConcernWeavingTestUtil;
import edu.kit.ipd.are.dsexplore.concern.concernweaver.test.util.WeavingTest;

public class ServiceEffectSpecificationWeavingTest extends WeavingTest {

	@Test
	public void testRepositoryWeaving() {
		
		List<WeavingInstruction> weavingInstructions = createTestWeavingInstructions();
		
		try {
			
			ConcernWeaver.getBy(this.pcmToAdapt, this.concernSolution).start(weavingInstructions);
			
		} catch (Exception ex) {
			
			fail("Error occured during weaving-process: \n" + ex.getMessage());
			
		}
		
		assertTrue(true);
		
	}

	@After
	public void tearDown() {
		
		persistPcmConcernRepository();
		persistEachRepository();
		
	}

	private void persistPcmConcernRepository() {
		
		EMFHelper.saveToXMIFile(WeavingStep.getPCMConcernRepository(), ConcernWeavingTestUtil.getAbsoluteResultFolderPathOf(WeavingStep.getPCMConcernRepository()));
		
	}

	private void persistEachRepository() {
		
		this.pcmToAdapt.getRepositories().forEach(eachRepository -> this.pcmToAdapt.saveToXMIFile(eachRepository, getPersistingPathOf(eachRepository)));
				
	}

	private String getPersistingPathOf(Repository repository) {
		
		return ConcernWeavingTestUtil.RELATIVE_REPOSITORY_PERSISTING_PATH.replace("$", repository.getEntityName());
		
	}

}
