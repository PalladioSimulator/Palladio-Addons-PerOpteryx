package edu.kit.ipd.are.dsexplore.featurecompletions.weaver.strategy.adapter.util;

import java.util.function.Predicate;

public interface IConnectorGeneratorExploration {
	public abstract Predicate<ConnectionInfo> canBeApplied();
}
