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
import org.palladiosimulator.pcm.repository.ProvidedRole;
import org.palladiosimulator.pcm.repository.RepositoryComponent;
import org.palladiosimulator.pcm.repository.Role;
import org.palladiosimulator.pcm.repository.Signature;
import org.palladiosimulator.pcm.system.System;
import org.palladiosimulator.solver.models.PCMInstance;

import ConcernModel.AnnotationTarget;
import edu.kit.ipd.are.dsexplore.concern.exception.ConcernWeavingException;
import edu.kit.ipd.are.dsexplore.concern.exception.ErrorMessage;
import edu.kit.ipd.are.dsexplore.concern.util.ConcernWeaverUtil;

/**
 * This class extracts all weaving locations based on target annotated objects.
 * @author scheerer
 *
 */
public class WeavingLocationHandler {

	private class JoinPointInfo {
		
		public Role affectedRole;
		public Optional<Connector> affectedConnector;
		public List<? extends Signature> affectedSignatures;
		
		public JoinPointInfo(Role affectedRole, List<? extends Signature> affectedSignatures) {
			
			this.affectedRole = affectedRole;
			this.affectedConnector = Optional.empty();
			this.affectedSignatures = affectedSignatures;
			
		}
		
		public JoinPointInfo(Connector affectedConnector, List<? extends Signature> affectedSignatures) {
			
			this.affectedRole = null;
			this.affectedConnector = Optional.of(affectedConnector);
			this.affectedSignatures = affectedSignatures;
			
		}
		
	}
	
	private final System system;
	
	public WeavingLocationHandler(PCMInstance pcmInstance) {
		
		this(pcmInstance.getSystem());
		
	}
	
	public WeavingLocationHandler(System system) {
		
		this.system = system;
		
	} 
	
	public List<WeavingLocation> getWeavingLocationsFrom(List<EObject> annotatedObjects, AnnotationTarget targetAnnotation) throws ConcernWeavingException {
		
		List<WeavingLocation> weavingLocations = new ArrayList<WeavingLocation>();
		for (EObject eachAnnotatedObject : annotatedObjects) {
			
			weavingLocations.addAll(getWeavingLocationFrom(eachAnnotatedObject, targetAnnotation));
			
		}
		
		return mergeWeavingLocations(weavingLocations);
		
	}
	
	/*There might exist annotated objects containing signatures which are equal or contained in signatures
	 *of other weaving locations. When the connectors are equal too then the locations need to be merged.*/
	private List<WeavingLocation> mergeWeavingLocations(List<WeavingLocation> unmergedLocations) {
		
		return new WeavingLocationMerger(unmergedLocations).merge();
		
	}

	public List<WeavingLocation> getWeavingLocationFrom(EObject annotatedObject, AnnotationTarget targetAnnotation) throws ConcernWeavingException {
		
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
		
		return extractedJoinPointInfos.stream().map(eachExtractedJoinPointInfo -> toWeavingLocation(eachExtractedJoinPointInfo))
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
	
	private WeavingLocation toWeavingLocation(JoinPointInfo joinPointInfo) {
		
		return new WeavingLocation(joinPointInfo.affectedSignatures, getLocationFrom(joinPointInfo));
		
	}

	private Connector getLocationFrom(JoinPointInfo joinPointInfo) {
		
		return joinPointInfo.affectedConnector.orElse(getLocationFrom(joinPointInfo.affectedRole));
		
	}

	private Connector getLocationFrom(Role affectedRole) {
		
		return this.system.getConnectors__ComposedStructure().stream().filter(eachConnector -> containsAffectedRole(eachConnector, affectedRole))
																	  .findFirst().get();
		
	}

	private boolean containsAffectedRole(Connector connector, Role affectedRole) {
		
		return connector.eCrossReferences().stream().anyMatch(eachObject -> ConcernWeaverUtil.areEqual(eachObject, affectedRole));
		
	}
	
}
