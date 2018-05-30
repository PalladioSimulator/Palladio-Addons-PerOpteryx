package edu.kit.ipd.are.dsexplore.featurecompletions.weaver.util;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.palladiosimulator.pcm.core.composition.AssemblyConnector;
import org.palladiosimulator.pcm.core.composition.AssemblyContext;
import org.palladiosimulator.pcm.core.composition.Connector;
import org.palladiosimulator.pcm.repository.Interface;
import org.palladiosimulator.pcm.repository.OperationSignature;
import org.palladiosimulator.pcm.repository.RepositoryComponent;
import org.palladiosimulator.pcm.repository.Role;
import org.palladiosimulator.pcm.repository.Signature;
import org.palladiosimulator.solver.models.PCMInstance;

import FeatureCompletionModel.ComplementumVisnetis;
import FeatureCompletionModel.Visnetum;
import de.uka.ipd.sdq.dsexplore.tools.primitives.Pair;
import edu.kit.ipd.are.dsexplore.featurecompletions.weaver.FCCUtil;
import edu.kit.ipd.are.dsexplore.featurecompletions.weaver.strategy.WeavingLocation;

public final class LocationExtractor {
	public static List<WeavingLocation> extractLocation(Pair<AssemblyConnector, ComplementumVisnetis> connector, PCMInstance pcm) {
		Visnetum visnetum = connector.second.getVisnetum();
		// TODO DTHF1: Welche Seite des connectors?
		AssemblyContext target = connector.first.getProvidingAssemblyContext_AssemblyConnector();
		RepositoryComponent component = target.getEncapsulatedComponent__AssemblyContext();

		switch (visnetum) {
		case INTERFACE:
			return LocationExtractor.getWeavingLocationsFrom(LocationExtractor.getInterfaceJoinPointInfosFrom(component));
		case INTERFACE_PROVIDES:
			return LocationExtractor.getWeavingLocationsFrom(LocationExtractor.getProvidedInterfaceJoinPointInfosFrom(component));
		case INTERFACE_REQUIRES:
			return LocationExtractor.getWeavingLocationsFrom(LocationExtractor.getRequiredInterfaceJoinPointInfosFrom(component));
		case SIGNATURE:
			// TODO Signature ?!
			return LocationExtractor.getWeavingLocationsFrom(LocationExtractor.getSignatureJointPointInfosFrom((OperationSignature) component));
		}

		throw new Error("Unidentified Visnetum " + visnetum);
	}

	private static List<WeavingLocation> getWeavingLocationsFrom(List<JoinPointInfo> extractedJoinPointInfos) {
		List<WeavingLocation> locations = new ArrayList<>();
		for (JoinPointInfo info : extractedJoinPointInfos) {
			List<WeavingLocation> locs = LocationExtractor.toWeavingLocations(info);
			locations.addAll(locs);
		}
		return locations;
	}

	private static List<WeavingLocation> toWeavingLocations(JoinPointInfo joinPointInfo) {
		List<WeavingLocation> locations = new ArrayList<>();
		List<Connector> connectors = LocationExtractor.getLocationsFrom(joinPointInfo);
		for (Connector c : connectors) {
			locations.add(new WeavingLocation(joinPointInfo.affectedSignatures, c));
		}
		return locations;

	}

	private static List<Connector> getLocationsFrom(Role affectedRole) {
		EList<Connector> connectors = getAllConnectors();
		List<Connector> locations = new ArrayList<>();
		for (Connector c : connectors) {
			if (LocationExtractor.containsAffectedRole(c, affectedRole)) {
				locations.add(c);
			}
		}
		return locations;
	}

	private static boolean containsAffectedRole(Connector connector, Role affectedRole) {
		for (EObject ref : connector.eCrossReferences()) {
			if (FCCUtil.areEqual(ref, affectedRole)) {
				return true;
			}
		}
		return false;

	}

	private static List<Connector> getLocationsFrom(JoinPointInfo joinPointInfo) {
		if (joinPointInfo.affectedConnector.isPresent()) {
			return Arrays.asList(joinPointInfo.affectedConnector.get());
		}
		return LocationExtractor.getLocationsFrom(joinPointInfo.affectedRole.get());
	}

	private List<JoinPointInfo> getJoinPointInfosFrom(List<? extends Role> roles) {
		List<JoinPointInfo> jpi = new ArrayList<>();
		for (Role r : roles) {
			List<OperationSignature> sigs = LocationExtractor.getAllSignaturesOfInterfaceReferencedBy(r);
			jpi.add(new JoinPointInfo(r, sigs));
		}
		return jpi;
	}

	private static List<OperationSignature> getAllSignaturesOfInterfaceReferencedBy(EObject object) {
		return getSignaturesFrom((Interface) getCrossReferencedElementFrom(object, obj -> obj instanceof Interface));
	}

	private static List<JoinPointInfo> getSignatureJointPointInfosFrom(OperationSignature signature) {
		List<JoinPointInfo> jpi = new ArrayList<>();
		for (Connector c : getAllConnectors()) {
			if (LocationExtractor.allInterfacesContaining(signature).test(c)) {
				jpi.add(new JoinPointInfo(c, Arrays.asList(signature)));
			}
		}
		return jpi;

	}

	// TODO DTHF1: Lambda weg ..
	private static Predicate<? super Connector> allInterfacesContaining(Signature signature) {
		return connector -> this.getAllSignaturesOfInterfaceReferencedBy(this.getAnyRoleOf(connector)).contains(signature);
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
		return this.getJoinPointInfosFrom(component.getProvidedRoles_InterfaceProvidingEntity());
	}

	private static List<JoinPointInfo> getRequiredInterfaceJoinPointInfosFrom(RepositoryComponent component) {
		return this.getJoinPointInfosFrom(component.getRequiredRoles_InterfaceRequiringEntity());
	}

	private static WeavingLocation handleInterface(Pair<AssemblyConnector, ComplementumVisnetis> connector, PCMInstance pcm) {
		// TODO DTHF1: Welche Seite des connectors?
		AssemblyContext target = connector.first.getProvidingAssemblyContext_AssemblyConnector();
		RepositoryComponent component = target.getEncapsulatedComponent__AssemblyContext();

		List<OperationSignature> signatures = null;

		WeavingLocation wl = new WeavingLocation(signatures, connector.first);
		return null;
	}

	private static class JoinPointInfo {

		public Optional<Role> affectedRole;
		public Optional<Connector> affectedConnector;
		public List<? extends OperationSignature> affectedSignatures;

		/**
		 * The constructor.
		 *
		 * @param affectedRole
		 *            - The affected role.
		 * @param affectedSignatures
		 *            - The affected signatures.
		 */
		public JoinPointInfo(Role affectedRole, List<? extends OperationSignature> affectedSignatures) {
			this.affectedRole = Optional.of(affectedRole);
			this.affectedConnector = Optional.empty();
			this.affectedSignatures = affectedSignatures;
		}

		/**
		 * The constructor.
		 *
		 * @param affectedConnector
		 *            - The affected connector.
		 * @param affectedSignatures
		 *            - The affected signatures.
		 */
		public JoinPointInfo(Connector affectedConnector, List<? extends OperationSignature> affectedSignatures) {
			this.affectedRole = Optional.empty();
			this.affectedConnector = Optional.of(affectedConnector);
			this.affectedSignatures = affectedSignatures;
		}
	}

}
