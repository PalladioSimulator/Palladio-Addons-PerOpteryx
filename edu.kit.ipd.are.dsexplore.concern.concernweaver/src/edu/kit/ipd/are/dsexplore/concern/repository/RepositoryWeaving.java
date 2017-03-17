package edu.kit.ipd.are.dsexplore.concern.repository;

import edu.kit.ipd.are.dsexplore.concern.concernweaver.WeavingInstruction;
import edu.kit.ipd.are.dsexplore.concern.concernweaver.WeavingStep;
import edu.kit.ipd.are.dsexplore.concern.exception.ConcernWeavingException;

public class RepositoryWeaving extends WeavingStep {
	
	/**
	 * Weaves all changes to the PCM repository which results through inclusion of a certain concern.
	 * @throws ConcernWeavingException 
	 * @see WeavingPipe#weave(PCMInstance, Triplet<WeavingLocation, Transformation, ElementaryConcernComponent>)
	 */
	@Override
	public void weave(WeavingInstruction weavingInstruction) throws ConcernWeavingException {
	
		getWeavingStrategy().weaveRepository(weavingInstruction);
		
	}
	
}