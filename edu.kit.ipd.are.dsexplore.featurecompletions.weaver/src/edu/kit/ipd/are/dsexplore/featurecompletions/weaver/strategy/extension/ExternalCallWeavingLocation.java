/**
 * 
 */
package edu.kit.ipd.are.dsexplore.featurecompletions.weaver.strategy.extension;

import org.palladiosimulator.pcm.core.composition.AssemblyContext;
import org.palladiosimulator.pcm.core.composition.Connector;
import org.palladiosimulator.pcm.repository.RepositoryComponent;
import org.palladiosimulator.pcm.repository.Signature;

/**
 * @author Maximilian Eckert (maximilian.eckert@student.kit.edu, maxieckert@web.de)
 * 
 *
 */
public class ExternalCallWeavingLocation implements IWeavingLocation {
	
	private final Signature affectedSignature;
	
	private final Connector affectedConnector;
	
	private final RepositoryComponent affectedComponent; //TODO Componenten oder COntext??
	
	private final AssemblyContext affectedContext; //TODO Componenten oder COntext??

	/**
	 * @param affectedSignature
	 * @param affectedConnector
	 */
	public ExternalCallWeavingLocation(Signature affectedSignature, Connector affectedConnector, RepositoryComponent affectedComponent, AssemblyContext affectedContext) {
		this.affectedSignature = affectedSignature;
		this.affectedConnector = affectedConnector;
		this.affectedComponent = affectedComponent;
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
	 * @return the affectedComponent
	 */
	public RepositoryComponent getAffectedComponent() {
		return affectedComponent;
	}

	/**
	 * @return the affectedContext
	 */
	public AssemblyContext getAffectedContext() {
		return affectedContext;
	}
	
	

}
