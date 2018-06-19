/**
 * 
 */
package edu.kit.ipd.are.dsexplore.featurecompletions.weaver.strategy.extension;

import org.palladiosimulator.pcm.core.composition.Connector;
import org.palladiosimulator.pcm.repository.Signature;

/**
 * @author Maximilian Eckert (maximilian.eckert@student.kit.edu, maxieckert@web.de)
 * 
 *
 */
public class ExternalCallWeavingLocation implements IWeavingLocation {
	
	private final Signature affectedSignature;
	
	private final Connector affectedConnector;

	/**
	 * @param affectedSignature
	 * @param affectedConnector
	 */
	public ExternalCallWeavingLocation(Signature affectedSignature, Connector affectedConnector) {
		this.affectedSignature = affectedSignature;
		this.affectedConnector = affectedConnector;
	}

	/**
	 * @return the affectedSignature
	 */
	public Signature getAffectedSignature() {
		return affectedSignature;
	}

	/**
	 * @return the affectedConnector
	 */
	public Connector getAffectedConnector() {
		return affectedConnector;
	}
	
	

}
