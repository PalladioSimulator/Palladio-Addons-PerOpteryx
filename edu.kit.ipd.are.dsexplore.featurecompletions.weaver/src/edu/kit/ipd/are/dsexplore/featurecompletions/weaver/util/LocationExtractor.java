package edu.kit.ipd.are.dsexplore.featurecompletions.weaver.util;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;

import org.eclipse.debug.internal.ui.views.memory.PropertyChangeNotifier;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.palladiosimulator.pcm.core.composition.AssemblyConnector;
import org.palladiosimulator.pcm.core.composition.AssemblyContext;
import org.palladiosimulator.pcm.core.composition.Connector;
import org.palladiosimulator.pcm.core.composition.ProvidedDelegationConnector;
import org.palladiosimulator.pcm.repository.Interface;
import org.palladiosimulator.pcm.repository.OperationSignature;
import org.palladiosimulator.pcm.repository.RepositoryComponent;
import org.palladiosimulator.pcm.repository.Role;
import org.palladiosimulator.solver.models.PCMInstance;

import FeatureCompletionModel.ComplementumVisnetis;
import FeatureCompletionModel.Visnetum;
import de.uka.ipd.sdq.dsexplore.tools.primitives.Pair;
import edu.kit.ipd.are.dsexplore.featurecompletions.weaver.FCCUtil;
import edu.kit.ipd.are.dsexplore.featurecompletions.weaver.port.FCCWeaverException;
import edu.kit.ipd.are.dsexplore.featurecompletions.weaver.strategy.WeavingLocation;

public final class LocationExtractor {
	public static List<WeavingLocation> extractLocation(Pair<String, ComplementumVisnetis> connector, PCMInstance pcm) {
		Visnetum visnetum = connector.second.getVisnetum();
		Connector connectorInstance = getConnector(pcm, connector.first);
		switch (visnetum) {
		case INTERFACE:
			return extractWeavingLocationFromInterface(connectorInstance, pcm);
		case INTERFACE_PROVIDES:
			return extractWeavingLocationsFromProvidedInterface(connectorInstance, pcm);
		case INTERFACE_REQUIRES:
			return extractWeavingLocationsFromRequiredInterface(connectorInstance, pcm);
		default:
			break;
		}

		throw new Error("Unidentified Visnetum " + visnetum);
	}

	private static List<WeavingLocation> extractWeavingLocationFromInterface(Connector conn, PCMInstance pcm) {
		List<WeavingLocation> result = new ArrayList<WeavingLocation>();
		result.addAll(extractWeavingLocationsFromProvidedInterface(conn, pcm));
		result.addAll(extractWeavingLocationsFromRequiredInterface(conn, pcm));
		
		List<OperationSignature> osis = new ArrayList<OperationSignature>();
		for (WeavingLocation wlocs : result)
			osis.addAll(wlocs.getAffectedSignatures());
		WeavingLocation merged = new WeavingLocation(osis, conn);
		return Arrays.asList(merged);
	}

	private static List<WeavingLocation> extractWeavingLocationsFromProvidedInterface(Connector conn, PCMInstance pcm) {
		if (conn instanceof AssemblyConnector)
			return handleAssemblyConnectorProvidesSide((AssemblyConnector) conn, pcm);
		if (conn instanceof ProvidedDelegationConnector)
			return handleProvidedDelegationConnectorProvidesSide((ProvidedDelegationConnector) conn, pcm);
		throw new FCCWeaverException("Unknown Connector!");
	}

	private static List<WeavingLocation> extractWeavingLocationsFromRequiredInterface(Connector conn, PCMInstance pcm) {
		if (conn instanceof AssemblyConnector)
			return handleAssemblyConnectorRequiresSide((AssemblyConnector) conn, pcm);
		if (conn instanceof ProvidedDelegationConnector)
			return handleProvidedDelegationConnectorRequiresSide((ProvidedDelegationConnector) conn, pcm);
		throw new FCCWeaverException("Unknown Connector!");
	}

	private static List<WeavingLocation> handleProvidedDelegationConnectorRequiresSide(ProvidedDelegationConnector conn,
			PCMInstance pcm) {
		List<WeavingLocation> result = new ArrayList<WeavingLocation>();

		List<OperationSignature> osis = conn.getInnerProvidedRole_ProvidedDelegationConnector()
				.getProvidedInterface__OperationProvidedRole().getSignatures__OperationInterface();
		result.add(new WeavingLocation(osis, conn));
		return result;
	}

	private static List<WeavingLocation> handleProvidedDelegationConnectorProvidesSide(ProvidedDelegationConnector conn,
			PCMInstance pcm) {
		List<WeavingLocation> result = new ArrayList<WeavingLocation>();

		List<OperationSignature> osis = conn.getOuterProvidedRole_ProvidedDelegationConnector()
				.getProvidedInterface__OperationProvidedRole().getSignatures__OperationInterface();
		result.add(new WeavingLocation(osis, conn));
		return result;
	}

	private static List<WeavingLocation> handleAssemblyConnectorRequiresSide(AssemblyConnector conn, PCMInstance pcm) {
		List<WeavingLocation> result = new ArrayList<WeavingLocation>();
		
		List<OperationSignature> osis = conn.getRequiredRole_AssemblyConnector().getRequiredInterface__OperationRequiredRole().getSignatures__OperationInterface();
		result.add(new WeavingLocation(osis, conn));
		return result;
	}

	private static List<WeavingLocation> handleAssemblyConnectorProvidesSide(AssemblyConnector conn, PCMInstance pcm) {
		List<WeavingLocation> result = new ArrayList<WeavingLocation>();

		List<OperationSignature> osis = conn.getProvidedRole_AssemblyConnector().getProvidedInterface__OperationProvidedRole().getSignatures__OperationInterface();
		result.add(new WeavingLocation(osis, conn));
		return result;
	}

	private static AssemblyContext getAssemblyContext(PCMInstance pcm, String connectorID) {
		for (Connector connector : pcm.getSystem().getConnectors__ComposedStructure()) {
			if (connector.getId().equals(connectorID)) {
				return LocationExtractor.getAssemblyContext(connector);
			}
		}
		return null;
	}

	private static Connector getConnector(PCMInstance pcm, String connectorID) {
		for (Connector connector : pcm.getSystem().getConnectors__ComposedStructure()) {
			if (connector.getId().equals(connectorID)) {
				return connector;
			}
		}
		return null;
	}

	private static AssemblyContext getAssemblyContext(Connector connector) {
		if (connector instanceof AssemblyConnector) {
			AssemblyContext target = ((AssemblyConnector) connector).getProvidingAssemblyContext_AssemblyConnector();
			return target;
		} else if (connector instanceof ProvidedDelegationConnector) {
			AssemblyContext target = ((ProvidedDelegationConnector) connector)
					.getAssemblyContext_ProvidedDelegationConnector();
			return target;
		}
		return null;
	}

	private static EList<Connector> getAllConnectors(PCMInstance pcm) {
		return pcm.getSystem().getConnectors__ComposedStructure();
	}

	private static EObject getCrossReferencedElementFrom(EObject object, Predicate<EObject> withSearchCriteria) {
		return object.eCrossReferences().stream().filter(withSearchCriteria).findFirst().get();
	}

	private static List<OperationSignature> getSignaturesFrom(Interface refInterface) {
		List<OperationSignature> signatures = new ArrayList<>();

		TreeIterator<EObject> iterator = refInterface.eAllContents();
		while (iterator.hasNext()) {
			EObject current = iterator.next();
			if (current instanceof OperationSignature) {
				signatures.add((OperationSignature) current);
			}
		}
		return signatures;
	}

	private static List<WeavingLocation> getWeavingLocationsFrom(List<JoinPointInfo> extractedJoinPointInfos,
			PCMInstance pcm) {
		List<WeavingLocation> locations = new ArrayList<>();
		for (JoinPointInfo info : extractedJoinPointInfos) {
			List<WeavingLocation> locs = LocationExtractor.toWeavingLocations(info, pcm);
			locations.addAll(locs);
		}
		return locations;
	}

	private static List<WeavingLocation> toWeavingLocations(JoinPointInfo joinPointInfo, PCMInstance pcm) {
		List<WeavingLocation> locations = new ArrayList<>();
		List<Connector> connectors = LocationExtractor.getLocationsFrom(joinPointInfo, pcm);
		for (Connector c : connectors) {
			locations.add(new WeavingLocation(joinPointInfo.affectedSignatures, c));
		}
		return locations;

	}

	private static List<Connector> getLocationsFrom(Role affectedRole, PCMInstance pcm) {
		EList<Connector> connectors = LocationExtractor.getAllConnectors(pcm);
		List<Connector> locations = new ArrayList<>();
		for (Connector c : connectors) {
			if (LocationExtractor.containsAffectedRole(c, affectedRole)) {
				locations.add(c);
			}
		}
		return locations;
	}

	private static boolean containsAffectedRole(Connector connector, Role affectedRole) {

//		if (connector instanceof AssemblyConnector) {
//			AssemblyConnector ac = (AssemblyConnector) connector;
//			if (ac.getProvidedRole_AssemblyConnector().getId().equals(affectedRole.getId())) {
//				return true;
//			}
//			if (ac.getRequiredRole_AssemblyConnector().getId().equals(affectedRole.getId())) {
//				return true;
//			}
//		}
//
//		if (connector instanceof ProvidedDelegationConnector) {
//			ProvidedDelegationConnector pdc = (ProvidedDelegationConnector) connector;
//			if (pdc.getInnerProvidedRole_ProvidedDelegationConnector().getId().equals(affectedRole.getId())) {
//				return true;
//			}
//			if (pdc.getOuterProvidedRole_ProvidedDelegationConnector().getId().equals(affectedRole.getId())) {
//				return true;
//			}
//		}
		for (EObject ref : connector.eCrossReferences()) {
			if (FCCUtil.areEqual(ref, affectedRole)) {
				return true;
			}
		}
		return false;

	}

	private static List<Connector> getLocationsFrom(JoinPointInfo joinPointInfo, PCMInstance pcm) {
		if (joinPointInfo.affectedConnector.isPresent()) {
			return Arrays.asList(joinPointInfo.affectedConnector.get());
		}
		return LocationExtractor.getLocationsFrom(joinPointInfo.affectedRole.get(), pcm);
	}

	private static List<JoinPointInfo> getJoinPointInfosFrom(List<? extends Role> roles) {
		List<JoinPointInfo> jpi = new ArrayList<>();
		for (Role r : roles) {
			List<OperationSignature> sigs = LocationExtractor.getAllSignaturesOfInterfaceReferencedBy(r);
			jpi.add(new JoinPointInfo(r, sigs));
		}
		return jpi;
	}

	private static List<OperationSignature> getAllSignaturesOfInterfaceReferencedBy(EObject object) {
		return LocationExtractor.getSignaturesFrom(
				(Interface) LocationExtractor.getCrossReferencedElementFrom(object, obj -> obj instanceof Interface));
	}

	private static List<JoinPointInfo> getInterfaceJoinPointInfosFrom(RepositoryComponent component) {
		List<JoinPointInfo> ifaceJPI = new ArrayList<>();
		for (JoinPointInfo provided : LocationExtractor.getProvidedInterfaceJoinPointInfosFrom(component)) {
			ifaceJPI.add(provided);
		}
		for (JoinPointInfo required : LocationExtractor.getRequiredInterfaceJoinPointInfosFrom(component)) {
			ifaceJPI.add(required);
		}
		return ifaceJPI;
	}

	private static List<JoinPointInfo> getProvidedInterfaceJoinPointInfosFrom(RepositoryComponent component) {
		return LocationExtractor.getJoinPointInfosFrom(component.getProvidedRoles_InterfaceProvidingEntity());
	}

	private static List<JoinPointInfo> getRequiredInterfaceJoinPointInfosFrom(RepositoryComponent component) {
		return LocationExtractor.getJoinPointInfosFrom(component.getRequiredRoles_InterfaceRequiringEntity());
	}

	private static class JoinPointInfo {

		public Optional<Role> affectedRole;
		public Optional<Connector> affectedConnector;
		public List<? extends OperationSignature> affectedSignatures;

		/**
		 * The constructor.
		 *
		 * @param affectedRole       - The affected role.
		 * @param affectedSignatures - The affected signatures.
		 */
		public JoinPointInfo(Role affectedRole, List<? extends OperationSignature> affectedSignatures) {
			this.affectedRole = Optional.of(affectedRole);
			this.affectedConnector = Optional.empty();
			this.affectedSignatures = affectedSignatures;
		}

		/**
		 * The constructor.
		 *
		 * @param affectedConnector  - The affected connector.
		 * @param affectedSignatures - The affected signatures.
		 */
		public JoinPointInfo(Connector affectedConnector, List<? extends OperationSignature> affectedSignatures) {
			this.affectedRole = Optional.empty();
			this.affectedConnector = Optional.of(affectedConnector);
			this.affectedSignatures = affectedSignatures;
		}
	}

}
