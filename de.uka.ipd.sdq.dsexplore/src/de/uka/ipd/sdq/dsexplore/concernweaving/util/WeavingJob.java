package de.uka.ipd.sdq.dsexplore.concernweaving.util;

import org.palladiosimulator.pcm.repository.Repository;
import org.palladiosimulator.solver.models.PCMInstance;

import ConcernModel.Concern;
import edu.kit.ipd.are.dsexplore.concern.concernweaver.ConcernWeaver;

public class WeavingJob {

	private final WeavingInstructionGenerator generator;
	private final ConcernWeaver concernWeaver;
	
	public WeavingJob(Concern concern, Repository concernSolution, PCMInstance pcmToWeave) {
		
		this.generator = WeavingInstructionGenerator.getInstanceBy(pcmToWeave, concern);
		this.concernWeaver = ConcernWeaver.getBy(pcmToWeave, concernSolution);
		
	}
	
	public void execute() {
		
		this.concernWeaver.start(this.generator.getWeavingInstructions());
		
	}
	
}
