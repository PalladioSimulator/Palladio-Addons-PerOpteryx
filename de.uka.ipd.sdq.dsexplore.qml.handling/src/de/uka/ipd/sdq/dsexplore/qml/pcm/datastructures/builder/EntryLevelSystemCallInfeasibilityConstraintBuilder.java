package de.uka.ipd.sdq.dsexplore.qml.pcm.datastructures.builder;

import org.opt4j.core.Constraint.Direction;
import org.opt4j.core.InfeasibilityConstraint;
import org.palladiosimulator.pcm.usagemodel.EntryLevelSystemCall;

import de.uka.ipd.sdq.dsexplore.qml.pcm.datastructures.EntryLevelSystemCallInfeasibilityConstraint;

public class EntryLevelSystemCallInfeasibilityConstraintBuilder extends InfeasibilityConstraintBuilder {

	private EntryLevelSystemCall entryLevelSystemCall;

	public EntryLevelSystemCallInfeasibilityConstraintBuilder(
			EntryLevelSystemCall entryLevelSystemCall) {
		this.entryLevelSystemCall = entryLevelSystemCall;
	}

	@Override
	public InfeasibilityConstraint createInfeasibilityConstraint(String name,
			Direction direction, double limit) {
		return new EntryLevelSystemCallInfeasibilityConstraint(name+"_"+this.entryLevelSystemCall.getId(), direction, limit, this.entryLevelSystemCall);
	}

}
