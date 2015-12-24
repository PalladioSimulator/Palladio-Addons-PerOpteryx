package de.uka.ipd.sdq.dsexplore.helper;

import java.util.List;

import de.uka.ipd.sdq.dsexplore.opt4j.genotype.DesignDecisionGenotype;

public interface GenotypeReader {

	abstract List<DesignDecisionGenotype> loadGenotypesFromEMF(final String filename);
}
