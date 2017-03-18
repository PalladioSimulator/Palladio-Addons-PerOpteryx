package edu.kit.ipd.are.dsexplore.concern.concernweaver;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.eclipse.emf.ecore.EObject;
import org.palladiosimulator.pcm.core.composition.Connector;
import org.palladiosimulator.pcm.repository.Interface;
import org.palladiosimulator.pcm.repository.OperationInterface;
import org.palladiosimulator.pcm.repository.RepositoryComponent;
import org.palladiosimulator.pcm.repository.Role;
import org.palladiosimulator.pcm.repository.Signature;
import org.palladiosimulator.pcm.system.System;
import org.palladiosimulator.solver.models.PCMInstance;

import ConcernModel.AnnotationTarget;
import de.uka.ipd.sdq.identifier.Identifier;
import edu.kit.ipd.are.dsexplore.concern.concernweaver.WeavingLocation;
import edu.kit.ipd.are.dsexplore.concern.exception.ConcernWeavingException;
import edu.kit.ipd.are.dsexplore.concern.exception.ErrorMessage;

public class WeavingLocationHandler {

	private class JoinPointInfo {
		
		public Role affectedRole;
		public List<? extends Signature> affectedSignatures;
		
		public JoinPointInfo(Role affectedRole, List<? extends Signature> affectedSignatures) {
			
			this.affectedRole = affectedRole;
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
	
	public List<WeavingLocation> getWeavingLocationFrom(RepositoryComponent component, AnnotationTarget targetAnnotation) throws ConcernWeavingException {
		
		switch(targetAnnotation.getJoinPoint()) {
		
			case INTERFACE:
				return getWeavingLocationFrom(getInterfaceJoinPointInfosFrom(component));
			case INTERFACE_PROVIDES:
				return getWeavingLocationFrom(getProvidedInterfaceJoinPointInfosFrom(component));
			case INTERFACE_REQUIRES:
				return getWeavingLocationFrom(getRequiredInterfaceJoinPointInfosFrom(component));
			case SIGNATURE:
				return getWeavingLocationFrom(getSignatureJointPointInfosFrom(component, targetAnnotation));
			default: 
				break;
				
		}
		
		throw new ConcernWeavingException(ErrorMessage.unhandledJoinPoint(targetAnnotation.getJoinPoint()));
		
	}

	private List<WeavingLocation> getWeavingLocationFrom(List<JoinPointInfo> extractedJoinPointInfos) {
		
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

	private List<JoinPointInfo> getSignatureJointPointInfosFrom(RepositoryComponent component, AnnotationTarget targetAnnotation) {
		
		//TODO this is going to be changed... later...
		if (targetAnnotation.getSignatures().isEmpty()) {
			
			throw new NullPointerException("Wrong configuration, signatures must be set.");
			
		}
		
		return getInterfaceJoinPointInfosFrom(component).stream().filter(eachJoinPointInfo -> interfaceContains(targetAnnotation.getSignatures(), eachJoinPointInfo))
																 .collect(Collectors.toList());
		
	}

	private boolean interfaceContains(List<Signature> signatures, JoinPointInfo joinPointInfo) {
		
		Optional<Interface> joinPointInterface = getInterfaceOf(joinPointInfo.affectedRole);
		if (!joinPointInterface.isPresent() && !(joinPointInterface.get() instanceof OperationInterface)) {
			
			return false;
			
		}
		
		return ((OperationInterface) joinPointInterface.get()).getSignatures__OperationInterface().containsAll(signatures);
		
	}

	private List<JoinPointInfo> getJoinPointInfosFrom(List<? extends Role> roles) {
		
		List<JoinPointInfo> matchingJoinPointInterfaces = new ArrayList<JoinPointInfo>();
		
		roles.forEach(role -> {
			
			getInterfaceOf(role).ifPresent(matchingJoinPointInterface -> 
			
				matchingJoinPointInterfaces.add(new JoinPointInfo(role, getSignaturesFrom(matchingJoinPointInterface))));
			
		});
		
		return matchingJoinPointInterfaces;
		
	}
	
	private List<? extends Signature> getSignaturesFrom(Interface matchingJoinPointInterface) {
		
		if (matchingJoinPointInterface instanceof OperationInterface) {
			
			OperationInterface operationInterface = (OperationInterface) matchingJoinPointInterface;
			return operationInterface.getSignatures__OperationInterface();
			
		}
		
		return null;
		
	}
	
	private Optional<Interface> getInterfaceOf(Role role) {
		
		return role.eCrossReferences().stream().filter(eachObject -> eachObject instanceof Interface)
											   .map(foundObject -> (Interface) foundObject)
									    	   .findFirst();
		
	}
	
	private WeavingLocation toWeavingLocation(JoinPointInfo joinPointInfo) {
		
		return new WeavingLocation(joinPointInfo.affectedSignatures, getLocationFrom(joinPointInfo.affectedRole));
		
	}

	private Connector getLocationFrom(Role affectedRole) {
		
		return this.system.getConnectors__ComposedStructure().stream().filter(eachConnector -> containsAffectedRole(eachConnector, affectedRole))
																	  .findFirst().get();
		
	}

	private boolean containsAffectedRole(Connector connector, Role affectedRole) {
		
		return connector.eCrossReferences().stream().anyMatch(eachObject -> areEqual(eachObject, affectedRole));
		
	}

	private boolean areEqual(EObject object1, EObject object2) {
		
		if (object1 instanceof Identifier && object2 instanceof Identifier) {
			
			return ((Identifier) object1).getId().equals(((Identifier) object2).getId());
			
		}
		
		return false;
		
	}
	
}
