package edu.kit.ipd.are.dsexplore.concern.concernweaver;

import java.util.List;
import java.util.Optional;

import org.palladiosimulator.pcm.core.composition.Connector;
import org.palladiosimulator.pcm.repository.Signature;

public class WeavingLocation {

	private final Optional<List<? extends Signature>> affectedSignatures;
	private final Connector location;
	
	public WeavingLocation(List<? extends Signature> affectedSignatures, Connector location) {
		
		this.affectedSignatures = Optional.of(affectedSignatures);
		this.location = location;
		
	}
	
	public Optional<List<? extends Signature>> getAffectedSignatures() {
		
		return this.affectedSignatures;
		
	}
	
	public Connector getLocation() {
		
		return this.location;
		
	}
	
}
