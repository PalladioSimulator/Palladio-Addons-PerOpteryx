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
import org.palladiosimulator.pcm.repository.ProvidedRole;
import org.palladiosimulator.pcm.repository.RequiredRole;
import org.palladiosimulator.pcm.repository.Signature;
import org.palladiosimulator.pcm.seff.ExternalCallAction;
import org.palladiosimulator.pcm.seff.ServiceEffectSpecification;
import org.palladiosimulator.pcm.seff.SetVariableAction;

import TransformationModel.AdapterTransformation;
import TransformationModel.Transformation;
import edu.kit.ipd.are.dsexplore.concern.concernweaver.WeavingInstruction;
import edu.kit.ipd.are.dsexplore.concern.concernweaver.WeavingLocation;
import edu.kit.ipd.are.dsexplore.concern.exception.ConcernWeavingException;
import edu.kit.ipd.are.dsexplore.concern.exception.ErrorMessage;
import edu.kit.ipd.are.dsexplore.concern.manager.PcmServiceEffectSpecificationManager;
import edu.kit.ipd.are.dsexplore.concern.util.ConcernWeaverUtil;

/**
 * This class is responsible for weaving the SEFF of the adapter in the context of the adapter transformation strategy.
 * @author scheerer
 *
 */
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
	
	private PcmServiceEffectSpecificationManager pcmSeffManager = PcmServiceEffectSpecificationManager.getInstance();
	private Transformation transformationStrategy;
	private List<ProvidedRole> consumedFeautresOfECC;
	
	protected WeavingLocation weavingLocation;
	
	private void setTransformationStrategy(Transformation transformationStrategy) {
		
		this.transformationStrategy = transformationStrategy;
		
	}
	
	private void setConsumedFeautresOfECC(List<ProvidedRole> consumedFeautresOfECC) {
		
		this.consumedFeautresOfECC = consumedFeautresOfECC;
		
	}
	
	private void setWeavingLocation(WeavingLocation weavingLocation) {
		
		this.weavingLocation = weavingLocation;
		
	}
	
	/**
	 * @see AdapterWeaving#weave(WeavingInstruction)
	 */
	@Override
	public void weave(WeavingInstruction weavingInstruction) throws ConcernWeavingException {
		
		setWeavingLocation(weavingInstruction.getWeavingLocation());
		setConsumedFeautresOfECC(weavingInstruction.getECCWithConsumedFeatures().getSecond());
		setTransformationStrategy(weavingInstruction.getTransformationStrategy());
		createServiceEffectSpecificationForAdapterBy(getCalledComponent());
		
	}

	/**
	 * Retrieves the required component which requires several services the adapter provides now. Based on the connection of 
	 * the components the adapter is inserted in between the calling component needs to be retrieved differently.
	 * @return The required component which is calling several services it requires.
	 */
	protected abstract BasicComponent getCalledComponent();
	
	/**
	 * Retrieves the provided component which provides several services the adapter requires now. Based on the connection of 
	 * the components the adapter is inserted in between the called component needs to be retrieved differently.
	 * @return The provided component which is called by the adapter and was required by the requiring component in the first place.
	 * @throws ConcernWeavingException - Will be thrown if an error occurs during the recovering of the called component.
	 */
	protected abstract BasicComponent getCallingComponent() throws ConcernWeavingException;
	
	/**
	 * Retrieves the external call informations for a given SEFF which contains the service, required role and the input and output parameters.
	 * @param seffToTransform - The SEFF from which the informations are estracted.
	 * @return the external call informations.
	 * @throws ConcernWeavingException - Will be thrown if an error occurs.
	 */
	protected abstract ExternalCallInfo getExternalCallInfoFrom(ServiceEffectSpecification seffToTransform) throws ConcernWeavingException;
	
	private void createServiceEffectSpecificationForAdapterBy(BasicComponent calledComponent) throws ConcernWeavingException {
		
		createServiceEffectSpecificationsBy(calledComponent).forEach(eachCreatedSeff -> this.pcmSeffManager.addServiceEffectSpecificationTo((BasicComponent) adapter, eachCreatedSeff));
		
	}

	private List<ServiceEffectSpecification> createServiceEffectSpecificationsBy(BasicComponent calledComponent) throws ConcernWeavingException {

		try {
			
			return getSEFFsInvokedByTheAdapterFrom(calledComponent).map(eachSeff -> transformToAdaperSeffAndCheckForException(eachSeff))
															       .collect(Collectors.toList());
		} catch (Exception ex) {
			
			throw new ConcernWeavingException(ex.getMessage());
			
		}
		
	}
	
	private Stream<ServiceEffectSpecification> getSEFFsInvokedByTheAdapterFrom(BasicComponent calledComponent) {
		
		return calledComponent.getServiceEffectSpecifications__BasicComponent().stream().filter(eachSeff -> isInvokedByAdapter(eachSeff.getDescribedService__SEFF()));
		
	}
	
	private boolean isInvokedByAdapter(Signature signature) {
		
		return getAllRequiredServicesOfAdapter().anyMatch(eachSignature -> ConcernWeaverUtil.areEqual(eachSignature, signature));
		
	}
	
	private Stream<Signature> getAllRequiredServicesOfAdapter() {
		
		return getAllRequiredRolesOfAdapter().flatMap(eachRequRole -> ConcernWeaverUtil.getSignaturesOfReferencedInterfaceBy(eachRequRole));
		
	}
	
	private Stream<RequiredRole> getAllRequiredRolesOfAdapter() {
		
		return adapter.getRequiredRoles_InterfaceRequiringEntity().stream();
		
	}

	private ServiceEffectSpecification transformToAdaperSeffAndCheckForException(ServiceEffectSpecification seffToTransform) {
		
		try {
			
			return transformToAdapterSeff(seffToTransform);
			
		} catch(ConcernWeavingException ex) {
			
			throw new RuntimeException(ex);
			
		}
		
	}
	
	private ServiceEffectSpecification transformToAdapterSeff(ServiceEffectSpecification seffToTransform) throws ConcernWeavingException {
		
		ServiceEffectSpecification createdAdapterSeff = this.pcmSeffManager.createServiceEffectSpecificationFor(seffToTransform.getDescribedService__SEFF());
		
		if (isAffected(seffToTransform.getDescribedService__SEFF())) {
			
			return this.pcmSeffManager.addExternalCallActionPipeBy(createOrderedExternalCallActionPipeBy(seffToTransform), createdAdapterSeff);
			
		}
		
		return this.pcmSeffManager.addExternalCallActionPipeBy(createOrdinaryPutThroughActionPipeBy(seffToTransform), createdAdapterSeff);

	}

	private boolean isAffected(Signature describedService) {

		return this.weavingLocation.getAffectedSignatures().contains(describedService);
		
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

	private List<ExternalCallInfo> getExternalCallInfosFrom(List<ProvidedRole> consumedFeautresOfECC) {
		
		return getAllRequiredRolesOfAdapterConnectedWith(consumedFeautresOfECC).flatMap(eachRequiredRole -> transformToExternalCallInfo(eachRequiredRole))
																	  		   .collect(Collectors.toList());
		
	}
	
	private Stream<RequiredRole> getAllRequiredRolesOfAdapterConnectedWith(List<ProvidedRole> consumedFeaturesOfECC) {
		
		return getAllRequiredRolesOfAdapter().filter(eachOperationRequiredRole -> existConnection(eachOperationRequiredRole, consumedFeaturesOfECC));
		
	}
	
	private boolean existConnection(RequiredRole requiredRole, List<ProvidedRole> providedRoles) {
		
		return providedRoles.stream().anyMatch(eachProvidedRole -> ConcernWeaverUtil.referencesSameInterface(requiredRole, eachProvidedRole));
		
	}
	
	protected RequiredRole getRequiredRoleOfAdapterBy(Signature signature) throws ConcernWeavingException {
		
		return (RequiredRole) getAllRequiredRolesOfAdapter().filter(eachRequiredRole -> ConcernWeaverUtil.areEqual(ConcernWeaverUtil.getInterfaceFrom(eachRequiredRole).get(), 
																												   signature.eContainer()))
															.findFirst().orElseThrow(() -> new ConcernWeavingException(ErrorMessage.missingRoleReferencing(signature, adapter)));
	
	}
	
	//At this stage there is no possibility to get the value characterisations of input or output parameters of a given ECC.
	//TODO implement variable usage 
	private Stream<ExternalCallInfo> transformToExternalCallInfo(RequiredRole requiredRole) {
		
		return ConcernWeaverUtil.getSignaturesOfReferencedInterfaceBy(requiredRole).map(eachSignature -> new ExternalCallInfo(eachSignature, requiredRole));
		
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
	
	protected ExternalCallAction getExternalCallActionInvoking(Signature calledService) throws ConcernWeavingException {

		for (ServiceEffectSpecification eachSEFF : getCallingComponent().getServiceEffectSpecifications__BasicComponent()) {

			Optional<ExternalCallAction> externalCallAction = getExternalCallActionFrom(eachSEFF, calledService);
			if (externalCallAction.isPresent()) {
				
				return externalCallAction.get();
				
			}

		}

		throw new ConcernWeavingException(ErrorMessage.missingExternalCall(getCallingComponent(), calledService));

	}
	
	private Optional<ExternalCallAction> getExternalCallActionFrom(ServiceEffectSpecification seff, Signature calledService) {
		
		TreeIterator<EObject> iterator = seff.eAllContents();
		while (iterator.hasNext()) {
			
			EObject current = iterator.next();
			if (isExternalCallAction(current)) {
				
				ExternalCallAction extCallAction = (ExternalCallAction) current;
				if (ConcernWeaverUtil.areEqual(calledService, extCallAction.getCalledService_ExternalService())) {
					
					return Optional.of(extCallAction);
					
				}
				
			}
			
		}
		
		return Optional.empty();
		
	}

	private boolean isExternalCallAction(EObject object) {
		
		return object instanceof ExternalCallAction;
		
	}

}
