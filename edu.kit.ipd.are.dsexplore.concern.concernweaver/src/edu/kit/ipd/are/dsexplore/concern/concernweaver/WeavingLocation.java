package edu.kit.ipd.are.dsexplore.concern.concernweaver;

import java.util.List;

import org.palladiosimulator.pcm.core.composition.Connector;
import org.palladiosimulator.pcm.repository.OperationSignature;
import org.palladiosimulator.pcm.repository.Signature;

/**
 * This class is a container for the informations of the weaving location.
 *
 * @author scheerer
 *
 */
public class WeavingLocation {

	private final List<? extends OperationSignature> affectedSignatures;
	private final Connector location;

	/**
	 * The constructor.
	 *
	 * @param affectedSignatures
	 *            - Contains all signatures that need to be considered during
	 *            the weaving process.
	 * @param location
	 *            - Represents the concrete location that needs to be woven.
	 */
	public WeavingLocation(List<? extends OperationSignature> affectedSignatures, Connector location) {
		this.affectedSignatures = affectedSignatures;
		this.location = location;
	}

	/**
	 * The getter-method for the affected signatures.
	 *
	 * @return the affected signatures.
	 */
	public List<? extends OperationSignature> getAffectedSignatures() {
		return this.affectedSignatures;
	}

	/**
	 * The getter-method for the weaving location.
	 *
	 * @return the weaving location.
	 */
	public Connector getLocation() {
		return this.location;
	}

}
