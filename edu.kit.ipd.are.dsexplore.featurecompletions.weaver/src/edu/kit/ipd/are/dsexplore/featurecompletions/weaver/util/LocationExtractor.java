package edu.kit.ipd.are.dsexplore.featurecompletions.weaver.util;

import org.palladiosimulator.pcm.core.composition.Connector;
import org.palladiosimulator.solver.models.PCMInstance;

import FeatureCompletionModel.ComplementumVisnetis;
import FeatureCompletionModel.Visnetum;
import de.uka.ipd.sdq.dsexplore.tools.primitives.Pair;
import edu.kit.ipd.are.dsexplore.featurecompletions.weaver.strategy.WeavingLocation;

public final class LocationExtractor {
	public static WeavingLocation extractLocation(Pair<Connector, ComplementumVisnetis> connector, PCMInstance pcm) {
		Visnetum visnetum = connector.second.getVisnetum();
		switch (visnetum) {
		case INTERFACE:
			return LocationExtractor.handleInterface(connector, pcm);

		}

		throw new Error("Unidentified Visnetum " + visnetum);
	}

	private static WeavingLocation handleInterface(Pair<Connector, ComplementumVisnetis> connector, PCMInstance pcm) {

		return null;
	}
}
