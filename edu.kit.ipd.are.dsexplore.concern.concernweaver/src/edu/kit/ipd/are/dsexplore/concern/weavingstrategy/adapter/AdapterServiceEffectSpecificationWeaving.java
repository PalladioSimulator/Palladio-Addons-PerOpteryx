package edu.kit.ipd.are.dsexplore.concern.weavingstrategy.adapter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.palladiosimulator.pcm.parameter.VariableUsage;
import org.palladiosimulator.pcm.repository.BasicComponent;
import org.palladiosimulator.pcm.repository.Interface;
import org.palladiosimulator.pcm.repository.OperationInterface;
import org.palladiosimulator.pcm.repository.OperationRequiredRole;
import org.palladiosimulator.pcm.repository.ProvidedRole;
import org.palladiosimulator.pcm.repository.RequiredRole;
import org.palladiosimulator.pcm.repository.Signature;
import org.palladiosimulator.pcm.seff.ServiceEffectSpecification;
import org.palladiosimulator.pcm.seff.SetVariableAction;

import TransformationModel.AdapterTransformation;
import TransformationModel.Transformation;
import edu.kit.ipd.are.dsexplore.concern.concernweaver.WeavingInstruction;
import edu.kit.ipd.are.dsexplore.concern.concernweaver.WeavingLocation;
import edu.kit.ipd.are.dsexplore.concern.exception.ConcernWeavingException;
import edu.kit.ipd.are.dsexplore.concern.manager.PcmServiceEffectSpecificationManager;

public abstract class AdapterServiceEffectSpecificationWeaving extends AdapterWeaving {
	
	public class ExternalCallInfo {
		
		public Signature calledService;
		public RequiredRole requiredRole;
		public List<VariableUsage> returnVariableUsage;
		public List<VariableUsage> inputVariableUsages;
		public List<SetVariableAction> setVariableActions;
		
		public ExternalCallInfo(Signature calledService, RequiredRole requiredRole) {
			
			this(calledService, requiredRole, new ArrayList<VariableUsage>(), new ArrayList<VariableUsage>(), new ArrayList<SetVariableAction>());
			
		}
		
		public ExternalCallInfo(Signature calledService,
								RequiredRole requiredRole,
								List<VariableUsage> returnVariableUsage,
								List<VariableUsage> inputVariableUsages,
								List<SetVariableAction> setVariableActions) {
			
			this.calledService = calledService;
			this.requiredRole = requiredRole;
			this.returnVariableUsage = returnVariableUsage;
			this.inputVariableUsages = inputVariableUsages;
			this.setVariableActions = setVariableActions;
			
		}
		
	}
	
	private PcmServiceEffectSpecificationManager pcmSeffManager = PcmServiceEffectSpecificationManager.get();
	private Transformation transformationStrategy;
	private List<ProvidedRole> consumedFeautresOfECC;
	
	protected WeavingLocation weavingLocation;
	
	private void setTransformationRepositoryManager(Transformation transformationStrategy) {
		
		this.transformationStrategy = transformationStrategy;
		
	}
	
	private void setConsumedFeautresOfECC(List<ProvidedRole> consumedFeautresOfECC) {
		
		this.consumedFeautresOfECC = concernRepositoryManager.getEquivalentConsumedFeaturesFromRepository(consumedFeautresOfECC);
		
	}
	
	private void setWeavingLocation(WeavingLocation weavingLocation) {
		
		this.weavingLocation = weavingLocation;
		
	}
	
	@Override
	public void weave(WeavingInstruction weavingInstruction) throws ConcernWeavingException {
		
		setWeavingLocation(weavingInstruction.getWeavingLocation());
		setConsumedFeautresOfECC(weavingInstruction.getECCWithConsumedFeatures().getSecond());
		setTransformationRepositoryManager(weavingInstruction.getTransformationStrategy());

		createServiceEffectSpecificationForAdapterBy(getCalledComponent());
		
	}

	protected abstract BasicComponent getCalledComponent();
	
	private void createServiceEffectSpecificationForAdapterBy(BasicComponent calledComponent) throws ConcernWeavingException {
		
		createServiceEffectSpecificationsBy(calledComponent).forEach(eachCreatedSeff -> this.pcmSeffManager.addServiceEffectSpecificationTo((BasicComponent) adapter, eachCreatedSeff));
		
	}

	private List<ServiceEffectSpecification> createServiceEffectSpecificationsBy(BasicComponent component) throws ConcernWeavingException {

		try {
			
			return getServiceEffectSpecificationsFrom(component).stream().map(eachSeff -> transformToAdaperSeffAndCheckForException(eachSeff))
															     	 .collect(Collectors.toList());
		} catch (Exception ex) {
			
			throw new ConcernWeavingException(ex.getMessage());
			
		}
		
	}
	
	private ServiceEffectSpecification transformToAdaperSeffAndCheckForException(ServiceEffectSpecification seffToTransform) {
		
		try {
			
			return transformToAdapterSeff(seffToTransform);
			
		} catch(ConcernWeavingException ex) {
			
			throw new RuntimeException(ex);
			
		}
		
	}
	
	private List<ServiceEffectSpecification> getServiceEffectSpecificationsFrom(BasicComponent component) {
		
		return component.getServiceEffectSpecifications__BasicComponent().stream().filter(eachSeff -> anyMatch(getInterfacesOf((BasicComponent) adapter), eachSeff.getDescribedService__SEFF()))
																				  .collect(Collectors.toList());
		
	}
	
	private ServiceEffectSpecification transformToAdapterSeff(ServiceEffectSpecification seffToTransform) throws ConcernWeavingException {
		
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

	private List<ExternalCallInfo> createOrdinaryPutThroughActionPipeBy(ServiceEffectSpecification seffToTransform) throws ConcernWeavingException {
		
		return Arrays.asList(getExternalCallInfoFrom(seffToTransform));
		
	}
	
	private List<ExternalCallInfo> createOrderedExternalCallActionPipeBy(ServiceEffectSpecification seffToTransform) throws ConcernWeavingException {

		List<ExternalCallInfo> externalCallInfos = new ArrayList<ExternalCallInfo>();
		
		switch(((AdapterTransformation) transformationStrategy).getAppear()) {
		
			case AFTER:
				externalCallInfos.add(getExternalCallInfoFrom(seffToTransform));
				externalCallInfos.addAll(getExternalCallInfosFrom(this.consumedFeautresOfECC));
				break;
			case BEFORE:
				externalCallInfos.addAll(getExternalCallInfosFrom(this.consumedFeautresOfECC));
				externalCallInfos.add(getExternalCallInfoFrom(seffToTransform));
				break;
			case AROUND:
				externalCallInfos.addAll(getExternalCallInfosFrom(this.consumedFeautresOfECC));
				externalCallInfos.add(getExternalCallInfoFrom(seffToTransform));
				externalCallInfos.addAll(getExternalCallInfosFrom(this.consumedFeautresOfECC));
				break;
			default:
				externalCallInfos.addAll(getExternalCallInfosFrom(this.consumedFeautresOfECC));
				externalCallInfos.add(getExternalCallInfoFrom(seffToTransform));
				break;
		
		}
		
		return externalCallInfos;
		
	}

	protected abstract ExternalCallInfo getExternalCallInfoFrom(ServiceEffectSpecification seffToTransform) throws ConcernWeavingException; 

	protected RequiredRole getRequiredRoleOf(Signature signature) {
		
		return ((BasicComponent) adapter).getRequiredRoles_InterfaceRequiringEntity().stream().filter(eachRequiredRole -> areEqual(getInterfaceFrom(eachRequiredRole.eCrossReferences()),
																															  (Interface) signature.eContainer()))
				 																		 	  .findFirst().get();
		
	}

	private boolean areEqual(Interface interface1, Interface interface2) {
		
		return interface1.getId().equals(interface2.getId());
		
	}

	//TODO concernweaverutil -> provide method that returns all operation(provided|required)roles from a given list of (provided|required)roles...
	private List<ExternalCallInfo> getExternalCallInfosFrom(List<ProvidedRole> consumedFeautresOfECC) {
		
		return getAllRequiredRolesConnectedWith(consumedFeautresOfECC).flatMap(eachRequiredRole -> transformToExternalCallInfo(eachRequiredRole))
																	  .collect(Collectors.toList());
		
	}
	
	
	//TODO implement variable usage 
	private Stream<ExternalCallInfo> transformToExternalCallInfo(RequiredRole requiredRole) {
		
		return getSignaturesOf(requiredRole).map(eachSignature -> new ExternalCallInfo(eachSignature, requiredRole));
		
	}

	private Stream<Signature> getSignaturesOf(RequiredRole requiredRole) {
		
		return getSignaturesOf(getInterfaceFrom(requiredRole.eCrossReferences()).eAllContents());
		
	}

	private Stream<Signature> getSignaturesOf(TreeIterator<EObject> interfaceObjectIterator) {
		
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
		
		return ((BasicComponent) adapter).getRequiredRoles_InterfaceRequiringEntity().stream().filter(eachOperationRequiredRole -> existConnection(eachOperationRequiredRole, consumedFeautresOfECC));
		
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
	
	//TODO refactor operation interface
	private boolean anyMatch(List<OperationInterface> interfaces, Signature signature) {
		
		return interfaces.stream().anyMatch(eachInterface -> eachInterface.getSignatures__OperationInterface().contains(signature));
		
	}

	private List<OperationInterface> getInterfacesOf(BasicComponent component) {
		
		return component.getRequiredRoles_InterfaceRequiringEntity().stream().filter(eachRequiredRole -> eachRequiredRole instanceof OperationRequiredRole)
				 															 .map(eachRequiredRole -> (OperationRequiredRole) eachRequiredRole)
				 															 .map(eachOperationRequiredRole -> eachOperationRequiredRole.getRequiredInterface__OperationRequiredRole())
				 															 .collect(Collectors.toList());
		
	}
	
	protected List<SetVariableAction> getSetVariableActions(ServiceEffectSpecification seffToTransform) {
		
		List<SetVariableAction> setVariableActions = new ArrayList<SetVariableAction>();
		
		TreeIterator<EObject> seffIterator = seffToTransform.eAllContents();
		while (seffIterator.hasNext()) {
			
			EObject current = seffIterator.next();
			if (current instanceof SetVariableAction) {
				
				setVariableActions.add((SetVariableAction) current);
				
			}
			
		}
		
		return setVariableActions;
		
	}

}
