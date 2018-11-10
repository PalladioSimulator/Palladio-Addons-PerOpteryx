package edu.kit.ipd.are.dsexplore.featurecompletions.weaver.util;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.palladiosimulator.pcm.core.composition.AssemblyConnector;
import org.palladiosimulator.pcm.core.composition.Connector;
import org.palladiosimulator.pcm.core.composition.ProvidedDelegationConnector;
import org.palladiosimulator.pcm.repository.OperationSignature;
import org.palladiosimulator.solver.models.PCMInstance;

import FeatureCompletionModel.ComplementumVisnetis;
import FeatureCompletionModel.Visnetum;
import de.uka.ipd.sdq.dsexplore.tools.primitives.Pair;
import edu.kit.ipd.are.dsexplore.featurecompletions.weaver.port.FCCWeaverException;
import edu.kit.ipd.are.dsexplore.featurecompletions.weaver.strategy.WeavingLocation;

public final class LocationExtractor {
	public static List<WeavingLocation> extractLocation(Pair<String, ComplementumVisnetis> connector, PCMInstance pcm) {
		Visnetum visnetum = connector.second.getVisnetum();
		Connector connectorInstance = LocationExtractor.getConnector(pcm, connector.first);
		switch (visnetum) {
		case INTERFACE:
			return LocationExtractor.extractWeavingLocationFromInterface(connectorInstance, pcm);
		case INTERFACE_PROVIDES:
			return LocationExtractor.extractWeavingLocationsFromProvidedInterface(connectorInstance, pcm);
		case INTERFACE_REQUIRES:
			return LocationExtractor.extractWeavingLocationsFromRequiredInterface(connectorInstance, pcm);
		default:
			break;
		}

		throw new Error("Unidentified Visnetum " + visnetum);
	}

	private static List<WeavingLocation> extractWeavingLocationFromInterface(Connector conn, PCMInstance pcm) {
		List<WeavingLocation> result = new ArrayList<>();
		result.addAll(LocationExtractor.extractWeavingLocationsFromProvidedInterface(conn, pcm));
		result.addAll(LocationExtractor.extractWeavingLocationsFromRequiredInterface(conn, pcm));

		List<OperationSignature> osis = new ArrayList<>();
		for (WeavingLocation wlocs : result) {
			osis.addAll(wlocs.getAffectedSignatures());
		}
		WeavingLocation merged = new WeavingLocation(osis, conn);
		return Arrays.asList(merged);
	}

	private static List<WeavingLocation> extractWeavingLocationsFromProvidedInterface(Connector conn, PCMInstance pcm) {
		if (conn instanceof AssemblyConnector) {
			return LocationExtractor.handleAssemblyConnectorProvidesSide((AssemblyConnector) conn, pcm);
		}
		if (conn instanceof ProvidedDelegationConnector) {
			return LocationExtractor.handleProvidedDelegationConnectorProvidesSide((ProvidedDelegationConnector) conn, pcm);
		}
		throw new FCCWeaverException("Unknown Connector!");
	}

	private static List<WeavingLocation> extractWeavingLocationsFromRequiredInterface(Connector conn, PCMInstance pcm) {
		if (conn instanceof AssemblyConnector) {
			return LocationExtractor.handleAssemblyConnectorRequiresSide((AssemblyConnector) conn, pcm);
		}
		if (conn instanceof ProvidedDelegationConnector) {
			return LocationExtractor.handleProvidedDelegationConnectorRequiresSide((ProvidedDelegationConnector) conn, pcm);
		}
		throw new FCCWeaverException("Unknown Connector!");
	}

	private static List<WeavingLocation> handleProvidedDelegationConnectorRequiresSide(ProvidedDelegationConnector conn, PCMInstance pcm) {
		List<WeavingLocation> result = new ArrayList<>();

		List<OperationSignature> osis = conn.getInnerProvidedRole_ProvidedDelegationConnector().getProvidedInterface__OperationProvidedRole().getSignatures__OperationInterface();
		result.add(new WeavingLocation(osis, conn));
		return result;
	}

	private static List<WeavingLocation> handleProvidedDelegationConnectorProvidesSide(ProvidedDelegationConnector conn, PCMInstance pcm) {
		List<WeavingLocation> result = new ArrayList<>();

		List<OperationSignature> osis = conn.getOuterProvidedRole_ProvidedDelegationConnector().getProvidedInterface__OperationProvidedRole().getSignatures__OperationInterface();
		result.add(new WeavingLocation(osis, conn));
		return result;
	}

	private static List<WeavingLocation> handleAssemblyConnectorRequiresSide(AssemblyConnector conn, PCMInstance pcm) {
		List<WeavingLocation> result = new ArrayList<>();

		List<OperationSignature> osis = conn.getRequiredRole_AssemblyConnector().getRequiredInterface__OperationRequiredRole().getSignatures__OperationInterface();
		result.add(new WeavingLocation(osis, conn));
		return result;
	}

	private static List<WeavingLocation> handleAssemblyConnectorProvidesSide(AssemblyConnector conn, PCMInstance pcm) {
		List<WeavingLocation> result = new ArrayList<>();

		List<OperationSignature> osis = conn.getProvidedRole_AssemblyConnector().getProvidedInterface__OperationProvidedRole().getSignatures__OperationInterface();
		result.add(new WeavingLocation(osis, conn));
		return result;
	}

	private static Connector getConnector(PCMInstance pcm, String connectorID) {
		for (Connector connector : pcm.getSystem().getConnectors__ComposedStructure()) {
			if (connector.getId().equals(connectorID)) {
				return connector;
			}
		}
		return null;
	}

}
