package de.uka.ipd.sdq.dsexplore.qml.pcm.datastructures.builder;

import org.opt4j.core.Constraint.Direction;
import org.opt4j.core.Objective;
import org.opt4j.core.SatisfactionConstraint;

public class SatisfactionConstraintBuilder {

	public SatisfactionConstraint createSatisfactionConstraint(String id,
			Direction direction, double limit, Objective objective) {
		
		return new SatisfactionConstraint(id, direction, limit, objective);
	}

}
