package de.uka.ipd.sdq.dsexplore.opt4j.genotype;

import java.util.List;

import genericdesigndecision.DecisionSpace;

public interface Adapter {

	/**
	 * Translates the given {@link DesignDecisionGenotype} named DDGenotype 
	 * to a {@link List} of {@link BinaryGenotype} objects. 
	 * Each {@link BinaryGenotype} object holds 
	 * the binary representation of a particular {@link Choice} object in the DDGenotype. 
	 * The DDGenotype contains the private field "choices", which
	 *  is actually a {@link List} of {@link Choice} objects. 
	 *  Each {@link Choice} object is referenced to a particular DOF
	 * @param DDGenotype
	 * @return
	 */
	public abstract List<BinaryGenotype> translateDesignDecisionGenotype(DesignDecisionGenotype DDGenotype, DecisionSpace decisionSpace);
	
	/** Translates the given {@link FinalBinaryGenotype} named FBGenotype to a 
	 * {@link DesignDecisionGenotype}.
	 * @param FBGenotype
	 * @return
	 */
	public abstract DesignDecisionGenotype translateFinalBinaryGenotype(FinalBinaryGenotype FBGenotype, DecisionSpace decisionSpace);
}
