package edu.kit.ipd.are.dsexplore.concern.weavingstrategy.adapter;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.palladiosimulator.pcm.core.composition.AssemblyConnector;
import org.palladiosimulator.pcm.parameter.VariableUsage;
import org.palladiosimulator.pcm.repository.BasicComponent;
import org.palladiosimulator.pcm.repository.OperationSignature;
import org.palladiosimulator.pcm.repository.Parameter;
import org.palladiosimulator.pcm.repository.Signature;
import org.palladiosimulator.pcm.seff.ExternalCallAction;
import org.palladiosimulator.pcm.seff.ServiceEffectSpecification;
import org.palladiosimulator.pcm.seff.SetVariableAction;

public class AdapterAssemblyLocationSeffWeaving extends AdapterServiceEffectSpecificationWeaving {

	@Override
	protected BasicComponent getCalledComponent() {
		
		AssemblyConnector location = (AssemblyConnector) weavingLocation.getLocation();
		return (BasicComponent) location.getProvidingAssemblyContext_AssemblyConnector().getEncapsulatedComponent__AssemblyContext();
		
	}

	@Override
	protected ExternalCallInfo getExternalCallInfoFrom(ServiceEffectSpecification seffToTransform) {
		
		//TODO exception handling
		Signature calledService = (Signature) seffToTransform.getDescribedService__SEFF();
		try {
			
			return new ExternalCallInfo(calledService, 
										getRequiredRoleOf(calledService), 
										getReturnVariableUsageBy(calledService), 
										getInputVariableUsagesBy(calledService),
										getSetVariableActions(seffToTransform));
			
		} catch (Exception ex) {
			
			return null;
			
		}
		
	}

	private List<VariableUsage> getReturnVariableUsageBy(Signature calledService) throws Exception {
		
		if (!hasReturnType(calledService)) {
			
			return Collections.emptyList();
			
		}
		
		return getExternalCallActionInvoking(calledService).getReturnVariableUsage__CallReturnAction();
		
	}

	private List<VariableUsage> getInputVariableUsagesBy(Signature calledService) throws Exception {
		
		if (!hasInputVariables(calledService)) {
			
			return Collections.emptyList();
			
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
	
	private ExternalCallAction getExternalCallActionInvoking(Signature calledService) throws Exception {
		
		//TODO exception handling
		for (ServiceEffectSpecification eachSEFF : getCallingComponent().getServiceEffectSpecifications__BasicComponent()) {
			
			Optional<ExternalCallAction> externalCallAction = getExternalCallActionFrom(eachSEFF, calledService);
			if (externalCallAction.isPresent()) {
				
				return externalCallAction.get();
				
			}
			
		}
		
		throw new Exception();
		
	}

	private BasicComponent getCallingComponent() {
		
		AssemblyConnector location = (AssemblyConnector) weavingLocation.getLocation();
		return (BasicComponent) location.getRequiringAssemblyContext_AssemblyConnector().getEncapsulatedComponent__AssemblyContext();
		
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
