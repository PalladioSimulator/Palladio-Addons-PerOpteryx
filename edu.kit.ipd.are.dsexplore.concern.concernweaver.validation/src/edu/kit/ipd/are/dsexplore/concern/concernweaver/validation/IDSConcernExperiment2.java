package edu.kit.ipd.are.dsexplore.concern.concernweaver.validation;

import static org.junit.Assert.fail;

import org.junit.After;
import org.junit.Test;

import TransformationModel.TransformationRepository;
import edu.kit.ipd.are.dsexplore.concern.concernweaver.ConcernWeaver;
import edu.kit.ipd.are.dsexplore.concern.concernweaver.WeavingInstructionGenerator;
import edu.kit.ipd.are.dsexplore.concern.concernweaver.WeavingStep;
import edu.kit.ipd.are.dsexplore.concern.concernweaver.validation.util.ExperimentUtil;
import edu.kit.ipd.are.dsexplore.concern.manager.TransformationRepositoryManager;

public class IDSConcernExperiment2 extends ExperimentConfiguration {
	
	private WeavingInstructionGenerator generator;
	
	public void initialize()  {
		
		this.generator = WeavingInstructionGenerator.getInstanceBy(this.pcmToAdapt, 
				  												   this.concernModel.getConcerns().get(0), 
				  												   this.concernSolution);
		
		TransformationRepositoryManager.initialize((TransformationRepository) this.adapterTransformation.eContainer());
		
	}
	
	@Test
	public void executeIDSExperiment2() {
		
		initialize();
		
		try {
			
			ConcernWeaver.getBy(this.pcmToAdapt, this.concernSolution).start(this.generator.getWeavingInstructions());
			
		} catch (Exception ex) {
			
			fail("Error occured during weaving-process: \n" + ex.getMessage());
			
		}
		
	}
	
	@After
	public void saveModels() {
		
		ExperimentUtil.savePCMAndConcernRepositoryToResultFolder(WeavingStep.getConcernSolution(), this.pcmToAdapt);
		
	}

}
