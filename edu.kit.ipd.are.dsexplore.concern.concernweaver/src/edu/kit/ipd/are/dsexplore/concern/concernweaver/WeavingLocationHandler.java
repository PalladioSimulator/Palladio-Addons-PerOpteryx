package edu.kit.ipd.are.dsexplore.concern.concernweaver;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.palladiosimulator.pcm.core.composition.Connector;
import org.palladiosimulator.pcm.repository.Interface;
import org.palladiosimulator.pcm.repository.OperationSignature;
import org.palladiosimulator.pcm.repository.RepositoryComponent;
import org.palladiosimulator.pcm.repository.Role;
import org.palladiosimulator.pcm.repository.Signature;
import org.palladiosimulator.pcm.system.System;
import org.palladiosimulator.solver.models.PCMInstance;

import FeatureCompletionModel.ComplementumVisnetis;
import edu.kit.ipd.are.dsexplore.concern.exception.ConcernWeavingException;
import edu.kit.ipd.are.dsexplore.concern.util.ConcernWeaverUtil;
import edu.kit.ipd.are.dsexplore.concern.util.Pair;

/**
 * This class extracts all weaving locations based on target annotated objects.
 *
 * @author scheerer
 *
 */
public class WeavingLocationHandler {

	private class JoinPointInfo {

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

	private class WeavingLocationExtractor {
		private final List<EObject> objectsOfSameAnnotation;
		private final ComplementumVisnetis targetCV;

		/**
		 * The constructor.
		 *
		 * @param target
		 *            - A target annotation.
		 * @param annotatedObjects
		 *            - All annotated objects.
		 * @throws ConcernWeavingException
		 *             - Will be thrown if an error occurs.
		 */
		public WeavingLocationExtractor(ComplementumVisnetis targetCV, List<Pair<ComplementumVisnetis, EObject>> annotatedObjectPairs) throws ConcernWeavingException {
			this.objectsOfSameAnnotation = this.getObjectsWithSame(targetCV, annotatedObjectPairs);
			this.targetCV = targetCV;
		}

		private List<EObject> getObjectsWithSame(ComplementumVisnetis targetComplementumVisnetis, List<Pair<ComplementumVisnetis, EObject>> annotatedObjectPairs) throws ConcernWeavingException {
			List<EObject> objWithSame = new ArrayList<>();
			for (Pair<ComplementumVisnetis, EObject> each : annotatedObjectPairs) {
				if (each.getFirst().getId().equals(targetComplementumVisnetis.getId())) {
					objWithSame.add(each.getSecond());
				}
			}
			return objWithSame;
			// return annotatedObjectPairs.stream().filter(each ->
			// each.getFirst().getName().equals(target.getName()))
			// .map(each -> each.getSecond())
			// .collect(Collectors.toList());
		}

		/**
		 * There might exist annotated objects containing signatures which are
		 * equal or contained in signatures of other weaving locations. When the
		 * connectors are equal too then the locations need to be merged.
		 *
		 * @return all merged weaving locations
		 * @throws ConcernWeavingException
		 */
		public List<WeavingLocation> extractMergedWeavingLocations() throws ConcernWeavingException {
			return new WeavingLocationMerger(this.extractUnmergedWeavingLocations()).merge();
		}

		private List<WeavingLocation> extractUnmergedWeavingLocations() throws ConcernWeavingException {
			List<WeavingLocation> unmergedWeavingLocations = new ArrayList<>();
			for (EObject each : this.objectsOfSameAnnotation) {
				unmergedWeavingLocations.addAll(WeavingLocationHandler.this.getWeavingLocationsFrom(each, this.targetCV));
			}
			return unmergedWeavingLocations;
		}
	}

	private final System system;

	/**
	 * The constructor.
	 *
	 * @param pcmInstance
	 *            - The pcm model which contains the required system
	 *            informations.
	 */
	public WeavingLocationHandler(PCMInstance pcmInstance) {
		this(pcmInstance.getSystem());
	}

	/**
	 * The constructor.
	 *
	 * @param system
	 *            - Contains the required system informations.
	 */
	public WeavingLocationHandler(System system) {
		this.system = system;
	}

	/**
	 * Extracts all weaving locations which can be derived by a set of annotated
	 * objects.
	 *
	 * @param annotatedObjects
	 *            - Contains all objects that are annotated by target
	 *            annotations.
	 * @return all pairs containing the weaving location and the associated
	 *         target annotation.
	 * @throws ConcernWeavingException
	 *             - Will be thrown if any error occurs.
	 */
	public List<Pair<ComplementumVisnetis, WeavingLocation>> extractWeavingLocationsFrom(List<Pair<ComplementumVisnetis, EObject>> annotatedObjects) throws ConcernWeavingException {
		List<Pair<ComplementumVisnetis, WeavingLocation>> weavingLocations = new ArrayList<>();

		List<Pair<ComplementumVisnetis, EObject>> copy = new ArrayList<>(annotatedObjects);
		while (!copy.isEmpty()) {
			ComplementumVisnetis target = copy.get(0).getFirst();
			weavingLocations.addAll(this.getPairsOf(this.extractMergedWeavingLocationsBy(target, copy), target));
			copy.removeIf(each -> each.getFirst().getName().equals(target.getName()));
		}

		return weavingLocations;
	}

	private List<WeavingLocation> extractMergedWeavingLocationsBy(ComplementumVisnetis target, List<Pair<ComplementumVisnetis, EObject>> annotatedObjectPairs) throws ConcernWeavingException {
		return new WeavingLocationExtractor(target, annotatedObjectPairs).extractMergedWeavingLocations();
	}

	private List<Pair<ComplementumVisnetis, WeavingLocation>> getPairsOf(List<WeavingLocation> locations, ComplementumVisnetis targetCV) {
		return locations.stream().map(each -> Pair.of(targetCV, each)).collect(Collectors.toList());
	}

	private List<WeavingLocation> getWeavingLocationsFrom(EObject annotatedObject, ComplementumVisnetis targetCV) throws ConcernWeavingException {
		switch (targetCV.getVisnetum()) {
		case INTERFACE:
			return this.getWeavingLocationsFrom(this.getInterfaceJoinPointInfosFrom((RepositoryComponent) annotatedObject));
		case INTERFACE_PROVIDES:
			return this.getWeavingLocationsFrom(this.getProvidedInterfaceJoinPointInfosFrom((RepositoryComponent) annotatedObject));
		case INTERFACE_REQUIRES:
			return this.getWeavingLocationsFrom(this.getRequiredInterfaceJoinPointInfosFrom((RepositoryComponent) annotatedObject));
		case SIGNATURE:
			return this.getWeavingLocationsFrom(this.getSignatureJointPointInfosFrom((OperationSignature) annotatedObject));
		default:
			break;
		}
		throw new Error();
	}

	private List<WeavingLocation> getWeavingLocationsFrom(List<JoinPointInfo> extractedJoinPointInfos) {
		List<WeavingLocation> locations = new ArrayList<>();
		for (JoinPointInfo info : extractedJoinPointInfos) {
			List<WeavingLocation> locs = this.toWeavingLocations(info);
			locations.addAll(locs);
		}
		return locations;
		// return
		// extractedJoinPointInfos.stream().flatMap(eachExtractedJoinPointInfo
		// ->
		// this.toWeavingLocations(eachExtractedJoinPointInfo).stream()).collect(Collectors.toList());
	}

	private List<JoinPointInfo> getInterfaceJoinPointInfosFrom(RepositoryComponent component) {
		List<JoinPointInfo> ifaceJPI = new ArrayList<>();
		for (JoinPointInfo provided : this.getProvidedInterfaceJoinPointInfosFrom(component)) {
			ifaceJPI.add(provided);
		}
		for (JoinPointInfo required : this.getRequiredInterfaceJoinPointInfosFrom(component)) {
			ifaceJPI.add(required);
		}
		return ifaceJPI;
		// return
		// Stream.concat(this.getProvidedInterfaceJoinPointInfosFrom(component).stream(),
		// this.getRequiredInterfaceJoinPointInfosFrom(component).stream()).collect(Collectors.toList());
	}

	private List<JoinPointInfo> getProvidedInterfaceJoinPointInfosFrom(RepositoryComponent component) {
		return this.getJoinPointInfosFrom(component.getProvidedRoles_InterfaceProvidingEntity());
	}

	private List<JoinPointInfo> getRequiredInterfaceJoinPointInfosFrom(RepositoryComponent component) {
		return this.getJoinPointInfosFrom(component.getRequiredRoles_InterfaceRequiringEntity());
	}

	private List<JoinPointInfo> getSignatureJointPointInfosFrom(OperationSignature signature) {
		List<JoinPointInfo> jpi = new ArrayList<>();
		for (Connector c : this.getAllConnectors()) {
			if (this.allInterfacesContaining(signature).test(c)) {
				jpi.add(new JoinPointInfo(c, Arrays.asList(signature)));
			}
		}
		return jpi;
		// return
		// this.getAllConnectors().filter(this.allInterfacesContaining(signature)).map(each
		// -> new JoinPointInfo(each,
		// Arrays.asList(signature))).collect(Collectors.toList());

	}

	private List<JoinPointInfo> getJoinPointInfosFrom(List<? extends Role> roles) {
		List<JoinPointInfo> jpi = new ArrayList<>();
		for (Role r : roles) {
			List<OperationSignature> sigs = this.getAllSignaturesOfInterfaceReferencedBy(r);
			jpi.add(new JoinPointInfo(r, sigs));
		}
		return jpi;
		// return roles.stream().map(eachRole -> new JoinPointInfo(eachRole,
		// this.getAllSignaturesOfInterfaceReferencedBy(eachRole))).collect(Collectors.toList());

	}

	private EList<Connector> getAllConnectors() {
		return this.system.getConnectors__ComposedStructure();
	}

	private Predicate<? super Connector> allInterfacesContaining(Signature signature) {
		return connector -> this.getAllSignaturesOfInterfaceReferencedBy(this.getAnyRoleOf(connector)).contains(signature);
	}

	private EObject getAnyRoleOf(Connector connector) {
		return this.getCrossReferencedElementFrom(connector, con -> con instanceof Role);
	}

	private List<OperationSignature> getAllSignaturesOfInterfaceReferencedBy(EObject object) {
		return this.getSignaturesFrom((Interface) this.getCrossReferencedElementFrom(object, obj -> obj instanceof Interface));
	}

	private EObject getCrossReferencedElementFrom(EObject object, Predicate<EObject> withSearchCriteria) {
		return object.eCrossReferences().stream().filter(withSearchCriteria).findFirst().get();
	}

	private List<OperationSignature> getSignaturesFrom(Interface refInterface) {
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

	private List<WeavingLocation> toWeavingLocations(JoinPointInfo joinPointInfo) {
		List<WeavingLocation> locations = new ArrayList<>();
		List<Connector> connectors = this.getLocationsFrom(joinPointInfo);
		for (Connector c : connectors) {
			locations.add(new WeavingLocation(joinPointInfo.affectedSignatures, c));
		}
		return locations;
		// return this.getLocationsFrom(joinPointInfo).stream().map(each -> new
		// WeavingLocation(joinPointInfo.affectedSignatures,
		// each)).collect(Collectors.toList());

	}

	private List<Connector> getLocationsFrom(JoinPointInfo joinPointInfo) {
		if (joinPointInfo.affectedConnector.isPresent()) {
			return Arrays.asList(joinPointInfo.affectedConnector.get());
		}
		return this.getLocationsFrom(joinPointInfo.affectedRole.get());
	}

	private List<Connector> getLocationsFrom(Role affectedRole) {
		EList<Connector> connectors = this.getAllConnectors();
		List<Connector> locations = new ArrayList<>();
		for (Connector c : connectors) {
			if (this.containsAffectedRole(c, affectedRole)) {
				locations.add(c);
			}
		}
		return locations;
		// return this.getAllConnectors().filter(eachConnector ->
		// this.containsAffectedRole(eachConnector,
		// affectedRole)).collect(Collectors.toList());
	}

	private boolean containsAffectedRole(Connector connector, Role affectedRole) {
		for (EObject ref : connector.eCrossReferences()) {
			if (ConcernWeaverUtil.areEqual(ref, affectedRole)) {
				return true;
			}
		}
		return false;

	}

}
