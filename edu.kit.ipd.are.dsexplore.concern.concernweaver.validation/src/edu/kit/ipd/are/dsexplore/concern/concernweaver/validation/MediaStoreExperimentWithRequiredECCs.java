package edu.kit.ipd.are.dsexplore.concern.concernweaver.validation;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.After;
import org.junit.Test;
import org.palladiosimulator.pcm.repository.Repository;
import org.palladiosimulator.pcm.repository.RepositoryPackage;

import edu.kit.ipd.are.dsexplore.concern.concernweaver.ConcernWeaver;
import edu.kit.ipd.are.dsexplore.concern.concernweaver.WeavingInstruction;
import edu.kit.ipd.are.dsexplore.concern.concernweaver.WeavingStep;
import edu.kit.ipd.are.dsexplore.concern.concernweaver.test.util.ConcernWeavingTestUtil;
import edu.kit.ipd.are.dsexplore.concern.concernweaver.validation.util.ExperimentUtil;
import edu.kit.ipd.are.dsexplore.concern.concernweaver.validation.util.WeavingInstructionFactory;
import edu.kit.ipd.are.dsexplore.concern.util.ConcernWeaverConstant;

public class MediaStoreExperimentWithRequiredECCs extends ExperimentConfiguration {

	/**
	 * This method tests a weaving process where the eccs to weave has required eccs. 
	 * An intrusion detection system (ossec) has to be woven in the MediaStore.
	 * The configurations are: appearance = after, strategy = adapter. 
	 */
	@Test
	public void testWeavingScenarioWithRequiredECCs() {
		
		List<WeavingInstruction> weavingInstructions = WeavingInstructionFactory.getBy(this.pcmToAdapt, this.concern).getWeavingInstructionWithRequiredECCs();
		
		try {
			
			Repository concernSolution = (Repository) ConcernWeavingTestUtil.loadWithProfiles(RepositoryPackage.eINSTANCE, String.format("/models/%s.repository", ConcernWeaverConstant.CONCERN_REPOSITORY_NAME));
			ConcernWeaver.getBy(this.pcmToAdapt, concernSolution).start(weavingInstructions);
			
		} catch (Exception ex) {
			
			fail("Error occured during weaving-process: \n" + ex.getMessage());
			
		}
		
		assertTrue(true);
		
	}
	
	@After
	public void saveModels() {
		
		ExperimentUtil.savePCMAndConcernRepositoryToResultFolder(WeavingStep.getPCMConcernRepository(), this.pcmToAdapt);
		
	}
	
}
