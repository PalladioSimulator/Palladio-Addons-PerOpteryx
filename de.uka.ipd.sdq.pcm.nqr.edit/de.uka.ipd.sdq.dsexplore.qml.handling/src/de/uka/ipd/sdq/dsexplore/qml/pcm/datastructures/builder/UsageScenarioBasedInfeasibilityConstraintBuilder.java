package de.uka.ipd.sdq.dsexplore.qml.pcm.datastructures.builder;

import org.opt4j.core.Constraint.Direction;
import org.palladiosimulator.pcm.usagemodel.UsageScenario;

import de.uka.ipd.sdq.dsexplore.qml.pcm.datastructures.UsageScenarioBasedInfeasibilityConstraint;

public class UsageScenarioBasedInfeasibilityConstraintBuilder extends InfeasibilityConstraintBuilder{

	private UsageScenario usageScenario;

	public UsageScenarioBasedInfeasibilityConstraintBuilder(
			UsageScenario usageScenario) {
		this.usageScenario = usageScenario;
	}

	@Override
	public UsageScenarioBasedInfeasibilityConstraint createInfeasibilityConstraint(String name,
			Direction direction, double limit) {
		return new UsageScenarioBasedInfeasibilityConstraint(name+"_"+this.usageScenario.getId(), direction, limit, this.usageScenario);
	}

	
	
	
}
