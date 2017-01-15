package edu.kit.ipd.are.dsexplore.concern.util;

import java.util.function.Predicate;

import org.palladiosimulator.pcm.repository.Role;

public interface IConnectorGeneratorExploration {

	public abstract Predicate<Role> canBeApplied();
	
}
