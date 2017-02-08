package de.uka.ipd.sdq.dsexplore.concernweaving.util;

import java.util.HashMap;

import org.palladiosimulator.pcm.repository.Repository;
import org.palladiosimulator.pcm.resourceenvironment.ResourceContainer;
import org.palladiosimulator.solver.models.PCMInstance;

import ConcernModel.Concern;
import ConcernModel.ElementaryConcernComponent;
import edu.kit.ipd.are.dsexplore.concern.concernweaver.ConcernWeaver;

public class WeavingJob {

	private final WeavingInstructionGenerator generator;
	private final ConcernWeaver concernWeaver;
	
	public WeavingJob(Concern concern, 
					  Repository concernSolution, 
					  PCMInstance pcmToWeave, 
					  HashMap<ElementaryConcernComponent, ResourceContainer> eccAllocationMap) {
		
		this.generator = WeavingInstructionGenerator.getInstanceBy(pcmToWeave, concern, concernSolution, eccAllocationMap);
		this.concernWeaver = ConcernWeaver.getBy(pcmToWeave, concernSolution);
		
	}
	
	public void execute() {
		
		this.concernWeaver.start(this.generator.getWeavingInstructions());
		
	}
	
}
