/**
 * 
 */
package edu.kit.ipd.are.dsexplore.featurecompletions.weaver.strategy.behaviour;

import org.palladiosimulator.pcm.core.composition.AssemblyContext;
import org.palladiosimulator.pcm.repository.Signature;

/**
 * Models an external call weaving location; that is a signature/connector at which a fc will be added. 
 * 
 * @author Maximilian Eckert (maximilian.eckert@student.kit.edu, maxieckert@web.de)
 * 
 */
public class ExternalCallWeavingLocation implements IWeavingLocation {

	private final Signature affectedSignature;
	
	private final AssemblyContext affectedContext;

	/**
	 * @param affectedSignature
	 * @param affectedConnector
	 */
	public ExternalCallWeavingLocation(Signature affectedSignature, AssemblyContext affectedContext) {
		this.affectedSignature = affectedSignature;
		this.affectedContext = affectedContext;
	}

	/**
	 * @return the affectedSignature
	 */
	public Signature getAffectedSignature() {
		return affectedSignature;
	}

	/**
	 * @return the affectedContext
	 */
	public AssemblyContext getAffectedContext() {
		return affectedContext;
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((affectedContext == null) ? 0 : affectedContext.hashCode());
		result = prime * result + ((affectedSignature == null) ? 0 : affectedSignature.hashCode());
		return result;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ExternalCallWeavingLocation other = (ExternalCallWeavingLocation) obj;
		if (affectedContext == null) {
			if (other.affectedContext != null)
				return false;
		} else if (!affectedContext.equals(other.affectedContext))
			return false;
		if (affectedSignature == null) {
			if (other.affectedSignature != null)
				return false;
		} else if (!affectedSignature.equals(other.affectedSignature))
			return false;
		return true;
	}
}
