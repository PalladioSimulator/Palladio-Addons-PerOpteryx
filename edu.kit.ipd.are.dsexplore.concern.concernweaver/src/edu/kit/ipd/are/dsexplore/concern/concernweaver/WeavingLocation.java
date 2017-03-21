package edu.kit.ipd.are.dsexplore.concern.concernweaver;

import java.util.List;

import org.palladiosimulator.pcm.core.composition.Connector;
import org.palladiosimulator.pcm.repository.Signature;

public class WeavingLocation {

	private final List<? extends Signature> affectedSignatures;
	private final Connector location;
	
	public WeavingLocation(List<? extends Signature> affectedSignatures, Connector location) {
		
		this.affectedSignatures = affectedSignatures;
		this.location = location;
		
	}
	
	public List<? extends Signature> getAffectedSignatures() {
		
		return this.affectedSignatures;
		
	}
	
	public Connector getLocation() {
		
		return this.location;
		
	}
	
}
