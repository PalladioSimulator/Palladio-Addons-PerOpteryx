package de.uka.ipd.sdq.dsexplore.qml.pcm.datastructures.builder;

import org.opt4j.core.Constraint.Direction;
import org.opt4j.core.Objective;
import org.opt4j.core.SatisfactionConstraint;
import org.palladiosimulator.pcm.usagemodel.EntryLevelSystemCall;

import de.uka.ipd.sdq.dsexplore.qml.pcm.datastructures.EntryLevelSystemCallSatisfactionConstraint;

public class EntryLevelSystemCallSatisfactionConstraintBuilder extends SatisfactionConstraintBuilder {

	private EntryLevelSystemCall entryLevelSystemCall;

	public EntryLevelSystemCallSatisfactionConstraintBuilder(
			EntryLevelSystemCall entryLevelSystemCall) {
		this.entryLevelSystemCall = entryLevelSystemCall;
	}

	@Override
	public SatisfactionConstraint createSatisfactionConstraint(String id,
			Direction direction, double limit, Objective objective) {
		return new EntryLevelSystemCallSatisfactionConstraint(id+"_"+this.entryLevelSystemCall.getId(), direction, limit, objective, this.entryLevelSystemCall);
	}

}
