package de.uka.ipd.sdq.dsexplore.opt4j.representation;

import org.opt4j.core.Phenotype;
import de.uka.ipd.sdq.dsexplore.opt4j.genotype.DesignDecisionGenotype;

public interface DSEDecoder {

	public Phenotype decode(final DesignDecisionGenotype genotype);
}
