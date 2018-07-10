package edu.kit.ipd.are.dsexplore.concern.util;

import java.util.function.Predicate;

public interface IConnectorGeneratorExploration {
	public abstract Predicate<ConnectionInfo> canBeApplied();
}
