package de.uka.ipd.sdq.dsexplore.concernweaving.util;

import java.util.List;
import java.util.Map;

import org.palladiosimulator.pcm.repository.Repository;
import org.palladiosimulator.pcm.resourceenvironment.ResourceContainer;
import org.palladiosimulator.solver.models.PCMInstance;

import ConcernModel.Concern;
import ConcernModel.ElementaryConcernComponent;
import de.uka.ipd.sdq.pcm.designdecision.Choice;
import de.uka.ipd.sdq.pcm.designdecision.specific.OptionalAsDegree;
import edu.kit.ipd.are.dsexplore.concern.concernweaver.ConcernWeaver;
import edu.kit.ipd.are.dsexplore.concern.concernweaver.WeavingInstructionGenerator;
import edu.kit.ipd.are.dsexplore.concern.exception.ConcernWeavingException;
import edu.kit.ipd.are.dsexplore.concern.util.Pair;

public class WeavingJob {

	private final WeavingInstructionGenerator generator;
	private final ConcernWeaver concernWeaver;

	public WeavingJob(Concern concern, Repository concernSolution, PCMInstance pcmToWeave, Map<ElementaryConcernComponent, ResourceContainer> eccAllocationMap) {
		this.generator = WeavingInstructionGenerator.getInstanceBy(pcmToWeave, concern, concernSolution, eccAllocationMap);
		this.concernWeaver = ConcernWeaver.getBy(pcmToWeave, concernSolution);
	}

	public void execute(List<Pair<OptionalAsDegree, Choice>> optChoice) throws ConcernWeavingException {
		this.concernWeaver.start(this.generator.getWeavingInstructions(optChoice));
	}

}
