package edu.kit.ipd.are.dsexplore.concern.weavingstrategy.adapter;

import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.stream.Stream;

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
import org.palladiosimulator.pcm.seff.ServiceEffectSpecification;
import org.palladiosimulator.pcm.system.System;
import org.palladiosimulator.pcm.usagemodel.EntryLevelSystemCall;

import edu.kit.ipd.are.dsexplore.concern.exception.ConcernWeavingException;
import edu.kit.ipd.are.dsexplore.concern.exception.ErrorMessage;
import edu.kit.ipd.are.dsexplore.concern.util.ConcernWeaverUtil;

/**
 * This class returns informations for the SEFF depending on the connection of the components the adapter
 * is inserted in between.
 * @author scheerer
 *
 */
public class AdapterDelegationLocationSeffWeaving extends AdapterServiceEffectSpecificationWeaving {

	/**
	 * @see AdapterServiceEffectSpecificationWeaving#getCallingComponent()
	 */
	@Override
	protected BasicComponent getCallingComponent() throws ConcernWeavingException {

		ProvidedDelegationConnector location = (ProvidedDelegationConnector) weavingLocation.getLocation();
		Optional<Connector> assemblyConnector = getAssemblyConnectorOf(location.getOuterProvidedRole_ProvidedDelegationConnector());
		if (assemblyConnector.isPresent()) {
			
			return (BasicComponent) ((AssemblyConnector) assemblyConnector.get()).getRequiringAssemblyContext_AssemblyConnector()
																				 .getEncapsulatedComponent__AssemblyContext();
			
		}
		
		throw new ConcernWeavingException(ErrorMessage.missingConnectorWith(location.getOuterProvidedRole_ProvidedDelegationConnector()));
		
	}
	
	/**
	 * @see AdapterServiceEffectSpecificationWeaving#getCalledComponent()
	 */
	@Override
	protected BasicComponent getCalledComponent() {

		// TODO check if cast to basic-component holds if component is composite-component.
		ProvidedDelegationConnector location = (ProvidedDelegationConnector) weavingLocation.getLocation();
		return (BasicComponent) location.getAssemblyContext_ProvidedDelegationConnector().getEncapsulatedComponent__AssemblyContext();

	}

	/**
	 * @see AdapterServiceEffectSpecificationWeaving#getExternalCallInfoFrom(ServiceEffectSpecification)
	 */
	@Override
	protected ExternalCallInfo getExternalCallInfoFrom(ServiceEffectSpecification seffToTransform) throws ConcernWeavingException {
		

		Signature calledService = (Signature) seffToTransform.getDescribedService__SEFF();
		return new ExternalCallInfo(calledService, 
									getRequiredRoleOfAdapterBy(calledService),
									getReturnVariableUsagesBy(calledService), 
									getInputVariableUsagesBy(calledService),
									getSetVariableActions(seffToTransform));

	}

	private List<VariableUsage> getReturnVariableUsagesBy(Signature calledService) throws ConcernWeavingException {

		if (!hasReturnType(calledService)) {

			return Collections.emptyList();

		}

		if (isOuterProvidedRoleExposedByTheSystem()) {
			
			return getEntryLevelSystemCallInvoking(calledService).getOutputParameterUsages_EntryLevelSystemCall();		
		
		}
		
		return getReturnVariableUsageIfServiceIsCalled(calledService);

	}

	private List<VariableUsage> getInputVariableUsagesBy(Signature calledService) throws ConcernWeavingException {

		if (!hasInputVariables(calledService)) {

			return Collections.emptyList();

		}

		if (isOuterProvidedRoleExposedByTheSystem()) {
			
			return getEntryLevelSystemCallInvoking(calledService).getInputParameterUsages_EntryLevelSystemCall(); 		
		
		}
		
		return getInputVariableUsageIfServiceIsCalled(calledService);

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

	private boolean isOuterProvidedRoleExposedByTheSystem() {
		
		return getContainerOfOuterProvidedRole() instanceof System;
		
	}
	
	private EObject getContainerOfOuterProvidedRole() {
		
		ProvidedDelegationConnector location = (ProvidedDelegationConnector) weavingLocation.getLocation();
		return location.getOuterProvidedRole_ProvidedDelegationConnector().eContainer();
		
	}

	private EntryLevelSystemCall getEntryLevelSystemCallInvoking(Signature calledService) throws ConcernWeavingException {
		
		Stream<EntryLevelSystemCall> entryLevelSystemCalls = pcmUsageModelManager.getEntryLevelSystemCalls().stream();
		return entryLevelSystemCalls.filter(entryLevelSystemCallsInvoking(calledService))
									.findFirst().orElseThrow(() -> new ConcernWeavingException(ErrorMessage.missingEntryLevelSystemCall(calledService)));
		
	}
	
	private Predicate<EntryLevelSystemCall> entryLevelSystemCallsInvoking(Signature calledService) {
		
		return eachSystemCall -> ConcernWeaverUtil.areEqual(eachSystemCall.getOperationSignature__EntryLevelSystemCall(), calledService);
		
	}

	private Optional<Connector> getAssemblyConnectorOf(OperationProvidedRole outerProvidedRole) {
		
		List<Connector> matchingAssConnectors = pcmSystemManager.getConnectorsBy(contains(outerProvidedRole));
		return matchingAssConnectors.isEmpty() ? Optional.empty() : Optional.of(matchingAssConnectors.get(0));
		
	}

	private Predicate<Connector> contains(OperationProvidedRole providedRole) {
		
		return connector -> (connector instanceof AssemblyConnector) &&
				            ConcernWeaverUtil.areEqual(((AssemblyConnector) connector).getProvidedRole_AssemblyConnector(), providedRole);
		
	}

}
