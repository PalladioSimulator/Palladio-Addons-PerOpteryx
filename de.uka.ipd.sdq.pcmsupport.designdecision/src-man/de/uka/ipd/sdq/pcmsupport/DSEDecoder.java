package de.uka.ipd.sdq.pcmsupport;

import de.uka.ipd.sdq.dsexplore.opt4j.genotype.DesignDecisionGenotype;
import de.uka.ipd.sdq.dsexplore.opt4j.start.Opt4JStarter;
import de.uka.ipd.sdq.pcmsupport.designdecision.DSEProblem;

public class DSEDecoder implements de.uka.ipd.sdq.dsexplore.opt4j.representation.DSEDecoder<PCMPhenotype> {

	@Override
	public PCMPhenotype decode(DesignDecisionGenotype genotype) {
		return ((DSEProblem) Opt4JStarter.getProblem()).decode(genotype);
	}

}
