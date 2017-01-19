package edu.kit.ipd.are.dsexplore.concern.weavingstrategy.adapter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.palladiosimulator.pcm.repository.BasicComponent;
import org.palladiosimulator.pcm.repository.Interface;
import org.palladiosimulator.pcm.repository.OperationInterface;
import org.palladiosimulator.pcm.repository.OperationRequiredRole;
import org.palladiosimulator.pcm.repository.Signature;
import org.palladiosimulator.pcm.repository.ProvidedRole;
import org.palladiosimulator.pcm.repository.RepositoryComponent;
import org.palladiosimulator.pcm.repository.RequiredRole;
import org.palladiosimulator.pcm.repository.Signature;
import org.palladiosimulator.pcm.seff.ServiceEffectSpecification;

import TransformationModel.AdapterTransformation;
import TransformationModel.Transformation;
import edu.kit.ipd.are.dsexplore.concern.concernweaver.WeavingInstruction;
import edu.kit.ipd.are.dsexplore.concern.concernweaver.WeavingLocation;
import edu.kit.ipd.are.dsexplore.concern.manager.PcmServiceEffectSpecificationManager;
import edu.kit.ipd.are.dsexplore.concern.util.Pair;

public abstract class AdapterServiceEffectSpecificationWeaving extends AdapterWeaving {

	private PcmServiceEffectSpecificationManager pcmSeffManager = PcmServiceEffectSpecificationManager.get();
	private Transformation transformationStrategy;
	private List<ProvidedRole> consumedFeautresOfECC;
	private BasicComponent adapterComponent;
	private WeavingLocation weavingLocation;
	
	private void setTransformationRepositoryManager(Transformation transformationStrategy) {
		
		this.transformationStrategy = transformationStrategy;
		
	}
	
	private void setConsumedFeautresOfECC(List<ProvidedRole> consumedFeautresOfECC) {
		
		this.consumedFeautresOfECC = concernRepositoryManager.getEquivalentConsumedFeaturesFromRepository(consumedFeautresOfECC);
		
	}
	
	private void setAdapterComponentBy(String uniqueName) {
		
		this.adapterComponent = (BasicComponent) concernRepositoryManager.getComponentByUnique(uniqueName).get();
		
	}
	
	private void setWeavingLocation(WeavingLocation weavingLocation) {
		
		this.weavingLocation = weavingLocation;
		
	}
	
	@Override
	public void weave(WeavingInstruction weavingInstruction) {
		
		setAdapterComponentBy(getUniqueAdapterName(weavingInstruction));
		setWeavingLocation(weavingInstruction.getWeavingLocation());
		setConsumedFeautresOfECC(weavingInstruction.getECCWithConsumedFeatures().getSecond());
		setTransformationRepositoryManager(weavingInstruction.getTransformationStrategy());

		createServiceEffectSpecificationForAdapterBy(getCalledComponentBy(weavingLocation));
		
	}

	protected abstract BasicComponent getCalledComponentBy(WeavingLocation weavingLocation);
	
	private void createServiceEffectSpecificationForAdapterBy(BasicComponent calledComponent) {
		
		createServiceEffectSpecificationsBy(calledComponent).forEach(eachCreatedSeff -> this.pcmSeffManager.addServiceEffectSpecificationTo(this.adapterComponent, eachCreatedSeff));
		
	}

	private List<ServiceEffectSpecification> createServiceEffectSpecificationsBy(BasicComponent component) {

		return getServiceEffectSpecificationsFrom(component).stream().map(eachSeff -> transformToAdapterSeff(eachSeff))
															     	 .collect(Collectors.toList());
		
	}
	
	private ServiceEffectSpecification transformToAdapterSeff(ServiceEffectSpecification seffToTransform) {
		
		ServiceEffectSpecification transformedSeff = this.pcmSeffManager.createServiceEffectSpecificationFor(seffToTransform.getDescribedService__SEFF());
		
		if (isAffected(seffToTransform.getDescribedService__SEFF())) {
			
			return this.pcmSeffManager.addExternalCallActionPipeBy(createOrderedExternalCallActionPipeBy(seffToTransform), transformedSeff);
			
		}
		
		return this.pcmSeffManager.addExternalCallActionPipeBy(createOrdinaryPutThroughActionPipeBy(seffToTransform), transformedSeff);

	}

	private boolean isAffected(Signature describedService) {

		Optional<List<? extends Signature>> affectedSignatures = this.weavingLocation.getAffectedSignatures();
		return affectedSignatures.isPresent() ? affectedSignatures.get().contains(describedService) : false;
		
	}

	private List<Pair<Signature, RequiredRole>> createOrdinaryPutThroughActionPipeBy(ServiceEffectSpecification seffToTransform) {
		
		return Arrays.asList(getExternalCallInfosFrom(seffToTransform));
		
	}
	
	private List<Pair<Signature, RequiredRole>> createOrderedExternalCallActionPipeBy(ServiceEffectSpecification seffToTransform) {

		List<Pair<Signature, RequiredRole>> externalCallInfos = new ArrayList<Pair<Signature, RequiredRole>>();
		
		switch(((AdapterTransformation) transformationStrategy).getAppear()) {
		
			case AFTER:
				externalCallInfos.add(getExternalCallInfosFrom(seffToTransform));
				externalCallInfos.addAll(getExternalCallInfosFrom(this.consumedFeautresOfECC));
				break;
			case BEFORE:
				externalCallInfos.addAll(getExternalCallInfosFrom(this.consumedFeautresOfECC));
				externalCallInfos.add(getExternalCallInfosFrom(seffToTransform));
				break;
			case AROUND:
				externalCallInfos.addAll(getExternalCallInfosFrom(this.consumedFeautresOfECC));
				externalCallInfos.add(getExternalCallInfosFrom(seffToTransform));
				externalCallInfos.addAll(getExternalCallInfosFrom(this.consumedFeautresOfECC));
				break;
			default:
				externalCallInfos.addAll(getExternalCallInfosFrom(this.consumedFeautresOfECC));
				externalCallInfos.add(getExternalCallInfosFrom(seffToTransform));
				break;
		
		}
		
		return externalCallInfos;
		
	}

	private Pair<Signature, RequiredRole> getExternalCallInfosFrom(ServiceEffectSpecification seffToTransform) {
		
		Signature signature = (Signature) seffToTransform.getDescribedService__SEFF();
		RequiredRole requiredRole = getRequiredRoleOf(signature); 
		
		return Pair.of(signature, requiredRole);
		
	}

	private RequiredRole getRequiredRoleOf(Signature signature) {
		
		return this.adapterComponent.getRequiredRoles_InterfaceRequiringEntity().stream().filter(eachRequiredRole -> areEqual(getInterfaceFrom(eachRequiredRole.eCrossReferences()),
																															  (Interface) signature.eContainer()))
				 																		 .findFirst().get();
		
	}

	private boolean areEqual(Interface interface1, Interface interface2) {
		
		return interface1.getId().equals(interface2.getId());
		
	}

	//TODO concernweaverutil -> provide method that returns all operation(provided|required)roles from a given list of (provided|required)roles...
	private List<Pair<Signature, RequiredRole>> getExternalCallInfosFrom(List<ProvidedRole> consumedFeautresOfECC) {
		
		return getAllRequiredRolesConnectedWith(consumedFeautresOfECC).flatMap(eachRequiredRole -> transformToExternalCallInfo(eachRequiredRole))
																	  .collect(Collectors.toList());
		
	}
	
	private Stream<Pair<Signature, RequiredRole>> transformToExternalCallInfo(RequiredRole requiredRole) {
		
		return getSignaturesOf(requiredRole).map(eachSignature -> Pair.of(eachSignature, requiredRole));
		
	}

	private Stream<Signature> getSignaturesOf(RequiredRole requiredRole) {
		
		return getSignaturesOf(getInterfaceFrom(requiredRole.eCrossReferences()).eAllContents());
		
	}

	private Stream<Signature> getSignaturesOf(TreeIterator<EObject> interfaceObjectIterator) {
		
//		return references.stream().filter(eachReference -> eachReference instanceof Signature)
//								  .map(eachSignature -> (Signature) eachSignature);
		List<Signature> signatures = new ArrayList<Signature>();
		while(interfaceObjectIterator.hasNext()) {
			
			EObject current = interfaceObjectIterator.next();
			if (current instanceof Signature) {
				
				signatures.add((Signature) current);
				
			}
			
		}
		
		return signatures.stream();
		
	}

	private Stream<RequiredRole> getAllRequiredRolesConnectedWith(List<ProvidedRole> consumedFeautresOfECC) {
		
		return this.adapterComponent.getRequiredRoles_InterfaceRequiringEntity().stream().filter(eachOperationRequiredRole -> existConnection(eachOperationRequiredRole, consumedFeautresOfECC));
		
	}

	private boolean existConnection(RequiredRole requiredRole, List<ProvidedRole> providedRoles) {
		
		return providedRoles.stream().anyMatch(eachProvidedRole -> areConnected(eachProvidedRole.eCrossReferences(), requiredRole.eCrossReferences()));
		
	}

	private boolean areConnected(List<EObject> references, List<EObject> references2) {
		
		Interface firstInterface = getInterfaceFrom(references);
		Interface secondInterface = getInterfaceFrom(references2);
		
		return firstInterface.getId().equals(secondInterface.getId());
		
	}

	private Interface getInterfaceFrom(List<EObject> references) {
		
		return (Interface) references.stream().filter(eachReference -> eachReference instanceof Interface).findFirst().get();
		
	}

	private List<ServiceEffectSpecification> getServiceEffectSpecificationsFrom(BasicComponent component) {
			
		return component.getServiceEffectSpecifications__BasicComponent().stream().filter(eachSeff -> anyMatch(getInterfacesOf(this.adapterComponent), eachSeff.getDescribedService__SEFF()))
																				  .collect(Collectors.toList());
		
	}
	
	private boolean anyMatch(List<OperationInterface> interfaces, Signature signature) {
		
		return interfaces.stream().anyMatch(eachInterface -> eachInterface.getSignatures__OperationInterface().contains(signature));
		
	}

	private List<OperationInterface> getInterfacesOf(BasicComponent component) {
		
		return component.getRequiredRoles_InterfaceRequiringEntity().stream().filter(eachRequiredRole -> eachRequiredRole instanceof OperationRequiredRole)
				 															 .map(eachRequiredRole -> (OperationRequiredRole) eachRequiredRole)
				 															 .map(eachOperationRequiredRole -> eachOperationRequiredRole.getRequiredInterface__OperationRequiredRole())
				 															 .collect(Collectors.toList());
		
	}

}
