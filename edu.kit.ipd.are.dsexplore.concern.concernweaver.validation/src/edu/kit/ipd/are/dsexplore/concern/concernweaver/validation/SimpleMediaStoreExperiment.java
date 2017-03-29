package edu.kit.ipd.are.dsexplore.concern.concernweaver.validation;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.util.List;

import org.junit.After;
import org.junit.Test;

import edu.kit.ipd.are.dsexplore.concern.concernweaver.ConcernWeaver;
import edu.kit.ipd.are.dsexplore.concern.concernweaver.WeavingInstruction;
import edu.kit.ipd.are.dsexplore.concern.concernweaver.WeavingStep;
import edu.kit.ipd.are.dsexplore.concern.concernweaver.validation.util.ExperimentUtil;
import edu.kit.ipd.are.dsexplore.concern.concernweaver.validation.util.WeavingInstructionFactory;

public class SimpleMediaStoreExperiment extends ExperimentConfiguration {
	
	/**
	 * This method tests a simple weaving process. An intrusion detection system (ossec) has to be woven in the MediaStore.
	 * The configurations are: appearance = before, strategy = adapter, multiple = true. 
	 */
	@Test
	public void testSimpleWeavingScenario() {
		
		List<WeavingInstruction> weavingInstructions = WeavingInstructionFactory.getBy(this.pcmToAdapt, this.concernModel, concernSolution).getSimpleWeavingInstructions();
		
		try {
			
			ConcernWeaver.getBy(this.pcmToAdapt, concernSolution).start(weavingInstructions);
			
		} catch (Exception ex) {
			
			fail("Error occured during weaving-process: \n" + ex.getMessage());
			
		}
		
		assertTrue(true);
		
	}
	
	@After
	public void saveModels() {
		
		ExperimentUtil.savePCMAndConcernRepositoryToResultFolder(WeavingStep.getConcernSolution(), this.pcmToAdapt);
		
	}
	
}
