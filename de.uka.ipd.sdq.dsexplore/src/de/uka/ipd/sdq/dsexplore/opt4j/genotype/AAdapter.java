package de.uka.ipd.sdq.dsexplore.opt4j.genotype;

import java.util.List;

import org.apache.log4j.Logger;

import genericdesigndecision.DecisionSpace;

/*@link AAdapter} contains methods to translate between {@link DesignDecisionGenotype} 
* and {@link FinalBinaryGenotype}. In the conversion process, the following steps are
* involved:
* 
* <p>
* 1) The {@link DesignDecisionGenotype} (a list of {@link Choice} objects), is first converted to 
* a list of {@link BinaryGenotype} objects.
* <p>
*  2) The list of {@link BinaryGenotype} objects are converted to {@link FinalBinaryGenotype} object
*  using the {@link FinalBinaryGenotype} constructor. This is the final stage of the conversion where
*  we have obtained our end result (that of converting the {@link DesignDecisionGenotype} to a {@link FinalBinaryGenotype}).
*  <p>
*  For the retranslation process, we have to convert the {@link FinalBinaryGenotype} to a {@link DesignDecisionGenotype}. The 
*  process goes as follows:
*  
* <p>
* 1) {@link FinalBinaryGenotype} is converted to a list of {@link BinaryGenotype} objects
* <p>
* 2)This list is converted to a list of {@link Choice} objects and is used
* to construct a {@link DesignDecisionGenotype}
* 
*/
public abstract class AAdapter implements Adapter {

	protected static Logger logger = 
			Logger.getLogger("de.uka.ipd.sdq.dsexplore.opt4j.genotype.AAdapter");
	
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
	@Override
	public abstract List<BinaryGenotype> translateDesignDecisionGenotype(DesignDecisionGenotype DDGenotype, DecisionSpace decisionSpace);
	
	/** Translates the given {@link FinalBinaryGenotype} named FBGenotype to a 
	 * {@link DesignDecisionGenotype}.
	 * @param FBGenotype
	 * @return
	 */
	@Override
	public abstract DesignDecisionGenotype translateFinalBinaryGenotype(FinalBinaryGenotype FBGenotype, DecisionSpace decisionSpace);

}
