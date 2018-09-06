/**
 * 
 */
package edu.kit.ipd.are.dsexplore.featurecompletions.weaver.strategy.behaviour;

import org.palladiosimulator.pcm.core.composition.AssemblyContext;
import org.palladiosimulator.pcm.core.composition.Connector;
import org.palladiosimulator.pcm.repository.Signature;

/**
 * Models an external call weaving location; that is a signature/connector at which a fc will be added. 
 * 
 * @author Maximilian Eckert (maximilian.eckert@student.kit.edu, maxieckert@web.de)
 * 
 */
public class ExternalCallWeavingLocation implements IWeavingLocation {
	//TODO was wird wirklich benötigt?
	private final Signature affectedSignature;
	
	private final Connector affectedConnector;
	
	private final AssemblyContext affectedContext;

	/**
	 * @param affectedSignature
	 * @param affectedConnector
	 */
	public ExternalCallWeavingLocation(Signature affectedSignature, Connector affectedConnector, AssemblyContext affectedContext) {
		this.affectedSignature = affectedSignature;
		this.affectedConnector = affectedConnector;
		this.affectedContext = affectedContext;
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

	/**
	 * @return the affectedContext
	 */
	public AssemblyContext getAffectedContext() {
		return affectedContext;
	}
}
