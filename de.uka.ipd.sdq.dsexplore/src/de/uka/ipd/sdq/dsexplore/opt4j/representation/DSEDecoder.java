package de.uka.ipd.sdq.dsexplore.opt4j.representation;

import org.opt4j.core.Phenotype;
import org.opt4j.core.problem.Decoder;

import de.uka.ipd.sdq.dsexplore.opt4j.genotype.DesignDecisionGenotype;

public interface DSEDecoder<P extends Phenotype> extends Decoder<DesignDecisionGenotype, P>{

	public P decode(final DesignDecisionGenotype genotype);
}
