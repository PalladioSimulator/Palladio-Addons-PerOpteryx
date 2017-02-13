package edu.kit.ipd.are.dsexplore.concern.weavingstrategy.adapter;

import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;

import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.palladiosimulator.pcm.core.composition.AssemblyConnector;
import org.palladiosimulator.pcm.core.composition.Connector;
import org.palladiosimulator.pcm.core.composition.ProvidedDelegationConnector;
import org.palladiosimulator.pcm.parameter.VariableUsage;
import org.palladiosimulator.pcm.repository.BasicComponent;
import org.palladiosimulator.pcm.repository.OperationProvidedRole;
import org.palladiosimulator.pcm.repository.OperationSignature;
import org.palladiosimulator.pcm.repository.Parameter;
import org.palladiosimulator.pcm.repository.Signature;
import org.palladiosimulator.pcm.seff.ExternalCallAction;
import org.palladiosimulator.pcm.seff.ServiceEffectSpecification;
import org.palladiosimulator.pcm.system.System;
import org.palladiosimulator.pcm.usagemodel.EntryLevelSystemCall;

public class AdapterDelegationLocationSeffWeaving extends AdapterServiceEffectSpecificationWeaving {

	@Override
	protected BasicComponent getCalledComponent() {

		// TODO check if cast to basic-component holds if component iscomposite-component.
		ProvidedDelegationConnector location = (ProvidedDelegationConnector) weavingLocation.getLocation();
		return (BasicComponent) location.getAssemblyContext_ProvidedDelegationConnector().getEncapsulatedComponent__AssemblyContext();

	}

	@Override
	protected ExternalCallInfo getExternalCallInfoFrom(ServiceEffectSpecification seffToTransform) {
		
		// TODO exception handling
		Signature calledService = (Signature) seffToTransform.getDescribedService__SEFF();
		try {

			return new ExternalCallInfo(calledService, 
										getRequiredRoleOf(calledService),
										getReturnVariableUsagesBy(calledService), 
										getInputVariableUsagesBy(calledService),
										getSetVariableActions(seffToTransform));

		} catch (Exception ex) {

			return null;

		}

	}

	private List<VariableUsage> getReturnVariableUsagesBy(Signature calledService) throws Exception {

		if (!hasReturnType(calledService)) {

			return Collections.emptyList();

		}

		if (getContainerOfOuterProvidedRole() instanceof System) {
			
			return getEntryLevelSystemCallInvoking(calledService).getOutputParameterUsages_EntryLevelSystemCall();		
		
		}
		
		return getExternalCallActionInvoking(calledService).getReturnVariableUsage__CallReturnAction();

	}

	private List<VariableUsage> getInputVariableUsagesBy(Signature calledService) throws Exception {

		if (!hasInputVariables(calledService)) {

			return Collections.emptyList();

		}

		if (getContainerOfOuterProvidedRole() instanceof System) {
			
			return getEntryLevelSystemCallInvoking(calledService).getInputParameterUsages_EntryLevelSystemCall(); 		
		
		}
		
		return getExternalCallActionInvoking(calledService).getInputVariableUsages__CallAction();

	}

	private boolean hasReturnType(Signature calledService) {

		return (calledService instanceof OperationSignature) && 
			   ((OperationSignature) calledService).getReturnType__OperationSignature() != null;

	}

	private boolean hasInputVariables(Signature calledService) {

		TreeIterator<EObject> iterator = calledService.eAllContents();
		while (iterator.hasNext()) {

			EObject current = iterator.next();
			if (current instanceof Parameter) {

				return true;

			}

		}

		return false;

	}

	private EObject getContainerOfOuterProvidedRole() {
		
		ProvidedDelegationConnector location = (ProvidedDelegationConnector) weavingLocation.getLocation();
		return location.getOuterProvidedRole_ProvidedDelegationConnector().eContainer();
		
	}

	private EntryLevelSystemCall getEntryLevelSystemCallInvoking(Signature calledService) throws Exception {
		
		List<EntryLevelSystemCall> entryLevelSystemCalls = pcmUsageModelManager.getEntryLevelSystemCalls().orElseThrow(() -> new Exception());
		return entryLevelSystemCalls.stream().filter(eachSystemCall -> areEqual(eachSystemCall.getOperationSignature__EntryLevelSystemCall(), 
																				calledService))
											 .findFirst().orElseThrow(() -> new Exception());
		
	}
	
	private ExternalCallAction getExternalCallActionInvoking(Signature calledService) throws Exception {

		// TODO exception handling
		for (ServiceEffectSpecification eachSEFF : getCallingComponent().getServiceEffectSpecifications__BasicComponent()) {

			Optional<ExternalCallAction> externalCallAction = getExternalCallActionFrom(eachSEFF, calledService);
			if (externalCallAction.isPresent()) {
				
				return externalCallAction.get();
				
			}

		}

		throw new Exception();

	}

	private BasicComponent getCallingComponent() throws Exception {

		ProvidedDelegationConnector location = (ProvidedDelegationConnector) weavingLocation.getLocation();
		Optional<Connector> assemblyConnector = getAssemblyConnectorOf(location.getOuterProvidedRole_ProvidedDelegationConnector());
		if (assemblyConnector.isPresent()) {
			
			return (BasicComponent) ((AssemblyConnector) assemblyConnector.get()).getRequiringAssemblyContext_AssemblyConnector()
																				 .getEncapsulatedComponent__AssemblyContext();
			
		}
		
		throw new Exception();
		
	}

	private Optional<Connector> getAssemblyConnectorOf(OperationProvidedRole outerProvidedRole) {
		
		List<Connector> matchingAssConnectors = pcmSystemManager.getConnectorsBy(searchCriteria(outerProvidedRole));
		return matchingAssConnectors.isEmpty() ? Optional.empty() : Optional.of(matchingAssConnectors.get(0));
		
	}

	private Predicate<Connector> searchCriteria(OperationProvidedRole providedRole) {
		
		return connector -> (connector instanceof AssemblyConnector) &&
				            containsProvidedRole((AssemblyConnector) connector, providedRole);
		
	}

	private boolean containsProvidedRole(AssemblyConnector connector, OperationProvidedRole providedRole) {
		
		return connector.getProvidedRole_AssemblyConnector().getId().equals(providedRole.getId());
		
	}

	private boolean areEqual(Signature signature1, Signature signature2) {

		return signature1.getId().equals(signature2.getId());

	}

	private Optional<ExternalCallAction> getExternalCallActionFrom(ServiceEffectSpecification seff, Signature calledService) {

		TreeIterator<EObject> iterator = seff.eAllContents();
		while (iterator.hasNext()) {

			EObject current = iterator.next();
			if (isExternalCallActionOf(calledService, current)) {

				return Optional.of((ExternalCallAction) current);

			}

		}

		return Optional.empty();

	}

	private boolean isExternalCallActionOf(Signature calledService, EObject object) {

		return (object instanceof ExternalCallAction) && 
			   (areEqual(((ExternalCallAction) object).getCalledService_ExternalService(), calledService));

	}

}
