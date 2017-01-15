package de.uka.ipd.sdq.dsexplore.constraints;

import de.uka.ipd.sdq.dsexplore.opt4j.genotype.DesignDecisionGenotype;

public interface IDesignSpaceConstraint {
	
	public boolean isValid(DesignDecisionGenotype genotype);
	
}
