package edu.kit.ipd.are.dsexplore.concern.weavingstrategy.adapter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.palladiosimulator.pcm.repository.BasicComponent;
import org.palladiosimulator.pcm.repository.OperationInterface;
import org.palladiosimulator.pcm.repository.OperationProvidedRole;
import org.palladiosimulator.pcm.repository.OperationRequiredRole;
import org.palladiosimulator.pcm.repository.OperationSignature;
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
	private List<OperationProvidedRole> consumedFeautresOfECC;
	private BasicComponent adapterComponent;
	private WeavingLocation weavingLocation;
	
	private void setTransformationRepositoryManager(Transformation transformationStrategy) {
		
		this.transformationStrategy = transformationStrategy;
		
	}
	
	private void setConsumedFeautresOfECC(List<OperationProvidedRole> consumedFeautresOfECC) {
		
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

	private List<Pair<OperationSignature, OperationRequiredRole>> createOrdinaryPutThroughActionPipeBy(ServiceEffectSpecification seffToTransform) {
		
		return Arrays.asList(getExternalCallInfosFrom(seffToTransform));
		
	}
	
	private List<Pair<OperationSignature, OperationRequiredRole>> createOrderedExternalCallActionPipeBy(ServiceEffectSpecification seffToTransform) {

		List<Pair<OperationSignature, OperationRequiredRole>> externalCallInfos = new ArrayList<Pair<OperationSignature, OperationRequiredRole>>();
		
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

	private Pair<OperationSignature, OperationRequiredRole> getExternalCallInfosFrom(ServiceEffectSpecification seffToTransform) {
		
		OperationSignature signature = (OperationSignature) seffToTransform.getDescribedService__SEFF();
		OperationRequiredRole requiredRole = getRequiredRoleOf(signature); 
		
		return Pair.of(signature, requiredRole);
		
	}

	private OperationRequiredRole getRequiredRoleOf(OperationSignature signature) {
		
		return this.adapterComponent.getRequiredRoles_InterfaceRequiringEntity().stream().filter(eachRequiredRole -> eachRequiredRole instanceof OperationRequiredRole)
				 																		 .map(eachRequiredRole -> (OperationRequiredRole) eachRequiredRole)
				 																		 .filter(eachOperationRequiredRole -> contains(signature, eachOperationRequiredRole.getRequiredInterface__OperationRequiredRole()))
				 																		 .findFirst().get();
		
	}

	private boolean contains(OperationSignature signature, OperationInterface operationInterface) {
		
		return operationInterface.getSignatures__OperationInterface().contains(signature);
		
	}

	//TODO concernweaverutil -> provide method that returns all operation(provided|required)roles from a given list of (provided|required)roles...
	private List<Pair<OperationSignature, OperationRequiredRole>> getExternalCallInfosFrom(List<OperationProvidedRole> consumedFeautresOfECC) {
		
		return getAllRequiredRolesConnectedWith(consumedFeautresOfECC).flatMap(eachOperationRequiredRole -> transformToExternalCallInfo(eachOperationRequiredRole))
																			.collect(Collectors.toList());
		
	}
	
	private Stream<Pair<OperationSignature, OperationRequiredRole>> transformToExternalCallInfo(OperationRequiredRole requiredRole) {
		
		return requiredRole.getRequiredInterface__OperationRequiredRole()
						   .getSignatures__OperationInterface().stream().map(eachSignature -> Pair.of(eachSignature, requiredRole));
		
	}

	private Stream<OperationRequiredRole> getAllRequiredRolesConnectedWith(List<OperationProvidedRole> consumedFeautresOfECC) {
		
		return this.adapterComponent.getRequiredRoles_InterfaceRequiringEntity().stream().filter(eachRequiredRole -> eachRequiredRole instanceof OperationRequiredRole)
																						 .map(eachRequiredRole -> (OperationRequiredRole) eachRequiredRole)
																						 .filter(eachOperationRequiredRole -> existConnection(eachOperationRequiredRole, consumedFeautresOfECC));
		
	}

	private boolean existConnection(OperationRequiredRole requiredRole, List<OperationProvidedRole> providedRoles) {
		
		return providedRoles.stream().anyMatch(eachProvidedRole -> eachProvidedRole.getProvidedInterface__OperationProvidedRole().equals(requiredRole.getRequiredInterface__OperationRequiredRole()));
		
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
