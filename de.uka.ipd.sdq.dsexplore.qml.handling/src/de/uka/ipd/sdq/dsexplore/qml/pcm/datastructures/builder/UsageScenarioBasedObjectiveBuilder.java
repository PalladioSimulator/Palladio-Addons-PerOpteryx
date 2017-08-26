package de.uka.ipd.sdq.dsexplore.qml.pcm.datastructures.builder;

import org.opt4j.core.Objective;
import org.opt4j.core.Objective.Sign;
import org.palladiosimulator.pcm.usagemodel.UsageScenario;

import de.uka.ipd.sdq.dsexplore.qml.pcm.datastructures.UsageScenarioBasedObjective;

public class UsageScenarioBasedObjectiveBuilder extends ObjectiveBuilder{

	private UsageScenario usageScenario;

	public UsageScenarioBasedObjectiveBuilder(UsageScenario usageScenario) {
		this.usageScenario = usageScenario;
	}

	@Override
	public Objective createObjective(String name, Sign sign) {
		return new UsageScenarioBasedObjective(name+"_"+this.usageScenario.getId(), sign, this.usageScenario);
	}

}
