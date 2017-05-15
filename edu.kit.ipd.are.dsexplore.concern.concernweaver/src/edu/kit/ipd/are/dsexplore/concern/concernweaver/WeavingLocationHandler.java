package edu.kit.ipd.are.dsexplore.concern.concernweaver;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.palladiosimulator.pcm.core.composition.Connector;
import org.palladiosimulator.pcm.repository.Interface;
import org.palladiosimulator.pcm.repository.RepositoryComponent;
import org.palladiosimulator.pcm.repository.Role;
import org.palladiosimulator.pcm.repository.Signature;
import org.palladiosimulator.pcm.system.System;
import org.palladiosimulator.solver.models.PCMInstance;

import ConcernModel.AnnotationTarget;
import edu.kit.ipd.are.dsexplore.concern.exception.ConcernWeavingException;
import edu.kit.ipd.are.dsexplore.concern.exception.ErrorMessage;
import edu.kit.ipd.are.dsexplore.concern.util.ConcernWeaverUtil;
import edu.kit.ipd.are.dsexplore.concern.util.Pair;

/**
 * This class extracts all weaving locations based on target annotated objects.
 * @author scheerer
 *
 */
public class WeavingLocationHandler {

	private class JoinPointInfo {
		
		public Optional<Role> affectedRole;
		public Optional<Connector> affectedConnector;
		public List<? extends Signature> affectedSignatures;
		
		/**
		 * The constructor.
		 * @param affectedRole - The affected role.
		 * @param affectedSignatures - The affected signatures.
		 */
		public JoinPointInfo(Role affectedRole, List<? extends Signature> affectedSignatures) {
			
			this.affectedRole = Optional.of(affectedRole);
			this.affectedConnector = Optional.empty();
			this.affectedSignatures = affectedSignatures;
			
		}
		
		/**
		 * The constructor.
		 * @param affectedConnector - The affected connector.
		 * @param affectedSignatures -  The affected signatures.
		 */
		public JoinPointInfo(Connector affectedConnector, List<? extends Signature> affectedSignatures) {
			
			this.affectedRole = Optional.empty();
			this.affectedConnector = Optional.of(affectedConnector);
			this.affectedSignatures = affectedSignatures;
			
		}
		
	}
	
	private class WeavingLocationExtractor {
		
		private final List<EObject> objectsOfSameAnnotation;
		private final AnnotationTarget target;
		
		/**
		 * The constructor.
		 * @param target - A target annotation.
		 * @param annotatedObjects - All annotated objects.
		 * @throws ConcernWeavingException - Will be thrown if an error occurs.
		 */
		public WeavingLocationExtractor(AnnotationTarget target, List<Pair<AnnotationTarget, EObject>> annotatedObjectPairs) throws ConcernWeavingException {
			
			this.objectsOfSameAnnotation = getObjectsWithSame(target, annotatedObjectPairs);
			this.target = target;
			
		}
		
		private List<EObject> getObjectsWithSame(AnnotationTarget target, List<Pair<AnnotationTarget, EObject>> annotatedObjectPairs) throws ConcernWeavingException {
			
			return annotatedObjectPairs.stream().filter(each -> each.getFirst().getName().equals(target.getName()))
												.map(each -> each.getSecond())
										    	.collect(Collectors.toList());
			
		}
		
		/**
		 * There might exist annotated objects containing signatures which are equal or contained in signatures
		 * of other weaving locations. When the connectors are equal too then the locations need to be merged.
		 * @return all merged weaving locations
		 * @throws ConcernWeavingException
		 */
		public List<WeavingLocation> extractMergedWeavingLocations() throws ConcernWeavingException {
			
			return new WeavingLocationMerger(extractUnmergedWeavingLocations()).merge();
			
		}

		private List<WeavingLocation> extractUnmergedWeavingLocations() throws ConcernWeavingException {
			
			List<WeavingLocation> unmergedWeavingLocations = new ArrayList<WeavingLocation>();
			for (EObject each : objectsOfSameAnnotation) {
				
				unmergedWeavingLocations.addAll(getWeavingLocationsFrom(each, target));
				
			}
			
			return unmergedWeavingLocations;
			
		}
		
	}
	
	private final System system;
	
	/**
	 * The constructor.
	 * @param pcmInstance - The pcm model which contains the required system informations.
	 */
	public WeavingLocationHandler(PCMInstance pcmInstance) {
		
		this(pcmInstance.getSystem());
		
	}
	
	/**
	 * The constructor.
	 * @param system - Contains the required system informations.
	 */
	public WeavingLocationHandler(System system) {
		
		this.system = system;
		
	} 
	
	/**
	 * Extracts all weaving locations which can be derived by a set of annotated objects.
	 * @param annotatedObjects - Contains all objects that are annotated by target annotations.
	 * @return all pairs containing the weaving location and the associated target annotation.
	 * @throws ConcernWeavingException - Will be thrown if any error occurs.
	 */
	public List<Pair<AnnotationTarget, WeavingLocation>> extractWeavingLocationsFrom(List<Pair<AnnotationTarget, EObject>> annotatedObjects) throws ConcernWeavingException {

		List<Pair<AnnotationTarget, WeavingLocation>> weavingLocations = new ArrayList<Pair<AnnotationTarget, WeavingLocation>>();

		List<Pair<AnnotationTarget, EObject>> copy = new ArrayList<Pair<AnnotationTarget, EObject>>(annotatedObjects);
		while(!copy.isEmpty()) {
			
			AnnotationTarget target = copy.get(0).getFirst();
			weavingLocations.addAll(getPairsOf(extractMergedWeavingLocationsBy(target, copy), target));
			copy.removeIf(each -> each.getFirst().getName().equals(target.getName()));
			
		}
		
		return weavingLocations;
		
	}

	private List<WeavingLocation> extractMergedWeavingLocationsBy(AnnotationTarget target, List<Pair<AnnotationTarget, EObject>> annotatedObjectPairs) throws ConcernWeavingException {
		
		return new WeavingLocationExtractor(target, annotatedObjectPairs).extractMergedWeavingLocations();
		
	}
	
	private List<Pair<AnnotationTarget, WeavingLocation>> getPairsOf(List<WeavingLocation> locations, AnnotationTarget target) {
		
		return locations.stream().map(each -> Pair.of(target, each)).collect(Collectors.toList());
		
	}

	private List<WeavingLocation> getWeavingLocationsFrom(EObject annotatedObject, AnnotationTarget targetAnnotation) throws ConcernWeavingException {
		
		switch(targetAnnotation.getJoinPoint()) {
		
			case INTERFACE:
				return getWeavingLocationsFrom(getInterfaceJoinPointInfosFrom((RepositoryComponent) annotatedObject));
			case INTERFACE_PROVIDES:
				return getWeavingLocationsFrom(getProvidedInterfaceJoinPointInfosFrom((RepositoryComponent) annotatedObject));
			case INTERFACE_REQUIRES:
				return getWeavingLocationsFrom(getRequiredInterfaceJoinPointInfosFrom((RepositoryComponent) annotatedObject));
			case SIGNATURE:
				return getWeavingLocationsFrom(getSignatureJointPointInfosFrom((Signature) annotatedObject));
			default: 
				break;
				
		}
		
		throw new ConcernWeavingException(ErrorMessage.unhandledJoinPoint(targetAnnotation.getJoinPoint()));
		
	}

	private List<WeavingLocation> getWeavingLocationsFrom(List<JoinPointInfo> extractedJoinPointInfos) {
		
		return extractedJoinPointInfos.stream().flatMap(eachExtractedJoinPointInfo -> toWeavingLocations(eachExtractedJoinPointInfo).stream())
								  	  		   .collect(Collectors.toList());
		
	}

	private List<JoinPointInfo> getInterfaceJoinPointInfosFrom(RepositoryComponent component) {
				
		return Stream.concat(getProvidedInterfaceJoinPointInfosFrom(component).stream(), 
							 getRequiredInterfaceJoinPointInfosFrom(component).stream())
					 .collect(Collectors.toList());
		
	}

	private List<JoinPointInfo> getProvidedInterfaceJoinPointInfosFrom(RepositoryComponent component) {
		
		return getJoinPointInfosFrom(component.getProvidedRoles_InterfaceProvidingEntity());
		
	}

	private List<JoinPointInfo> getRequiredInterfaceJoinPointInfosFrom(RepositoryComponent component) {
		
		return getJoinPointInfosFrom(component.getRequiredRoles_InterfaceRequiringEntity());
		
	}

	private List<JoinPointInfo> getSignatureJointPointInfosFrom(Signature signature) {
		
		return getAllConnectors().filter(allInterfacesContaining(signature))
								 .map(each -> new JoinPointInfo(each, Arrays.asList(signature)))
								 .collect(Collectors.toList());
		
	}
	
	private List<JoinPointInfo> getJoinPointInfosFrom(List<? extends Role> roles) {
		
		return roles.stream().map(eachRole -> new JoinPointInfo(eachRole, getAllSignaturesOfInterfaceReferencedBy(eachRole)))
							 .collect(Collectors.toList());
		
	}

	private Stream<Connector> getAllConnectors() {
		
		return this.system.getConnectors__ComposedStructure().stream();
		
	}
	
	private Predicate<? super Connector> allInterfacesContaining(Signature signature) {
		
		return connector -> getAllSignaturesOfInterfaceReferencedBy(getAnyRoleOf(connector)).contains(signature);
		
	}
	
	private EObject getAnyRoleOf(Connector connector) {
		
		return getCrossReferencedElementFrom(connector, con -> con instanceof Role);
		
	}

	private List<Signature> getAllSignaturesOfInterfaceReferencedBy(EObject object) {
		
		return getSignaturesFrom((Interface) getCrossReferencedElementFrom(object, obj -> obj instanceof Interface));
		
	}
	
	private EObject getCrossReferencedElementFrom(EObject object, Predicate<EObject> withSearchCriteria) {
		
		return object.eCrossReferences().stream().filter(withSearchCriteria).findFirst().get();
		
	}

	private List<Signature> getSignaturesFrom(Interface refInterface) {
		
		List<Signature> signatures = new ArrayList<Signature>();
		
		TreeIterator<EObject> iterator = refInterface.eAllContents();
		while(iterator.hasNext()) {
			
			EObject current = iterator.next();
			if (current instanceof Signature) {
				
				signatures.add((Signature) current);
				
			}
			
		}
		
		return signatures;
		
	}
	
	private List<WeavingLocation> toWeavingLocations(JoinPointInfo joinPointInfo) {
		
		return getLocationsFrom(joinPointInfo).stream().map(each -> new WeavingLocation(joinPointInfo.affectedSignatures, each))
													   .collect(Collectors.toList());
		
	}

	private List<Connector> getLocationsFrom(JoinPointInfo joinPointInfo) {
		
		if (joinPointInfo.affectedConnector.isPresent()) {
			
			return Arrays.asList(joinPointInfo.affectedConnector.get());
			
		}
		
		return getLocationsFrom(joinPointInfo.affectedRole.get());
		
	}

	private List<Connector> getLocationsFrom(Role affectedRole) {
		
		return getAllConnectors().filter(eachConnector -> containsAffectedRole(eachConnector, affectedRole))
								 .collect(Collectors.toList());
		
	}

	private boolean containsAffectedRole(Connector connector, Role affectedRole) {
		
		return connector.eCrossReferences().stream().anyMatch(eachObject -> ConcernWeaverUtil.areEqual(eachObject, affectedRole));
		
	}
	
}
