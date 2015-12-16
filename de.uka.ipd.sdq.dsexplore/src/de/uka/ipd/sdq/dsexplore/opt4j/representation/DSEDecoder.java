package de.uka.ipd.sdq.dsexplore.opt4j.representation;

import org.opt4j.core.Phenotype;
import org.opt4j.core.problem.Decoder;

import de.uka.ipd.sdq.dsexplore.opt4j.genotype.DesignDecisionGenotype;
import genericdesigndecision.Choice;

public interface DSEDecoder extends Decoder<DesignDecisionGenotype, Phenotype>{

	public Phenotype decode(final DesignDecisionGenotype genotype);
	
	public String getDecisionString(final Choice choice);
}
