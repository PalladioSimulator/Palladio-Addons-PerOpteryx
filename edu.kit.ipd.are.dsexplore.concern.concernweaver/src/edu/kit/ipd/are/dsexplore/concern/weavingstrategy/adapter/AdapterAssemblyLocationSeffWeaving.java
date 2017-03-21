package edu.kit.ipd.are.dsexplore.concern.weavingstrategy.adapter;

import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.palladiosimulator.pcm.core.composition.AssemblyConnector;
import org.palladiosimulator.pcm.parameter.VariableUsage;
import org.palladiosimulator.pcm.repository.BasicComponent;
import org.palladiosimulator.pcm.repository.OperationSignature;
import org.palladiosimulator.pcm.repository.Parameter;
import org.palladiosimulator.pcm.repository.Signature;
import org.palladiosimulator.pcm.seff.ServiceEffectSpecification;

import edu.kit.ipd.are.dsexplore.concern.exception.ConcernWeavingException;

public class AdapterAssemblyLocationSeffWeaving extends AdapterServiceEffectSpecificationWeaving {

	@Override
	protected BasicComponent getCallingComponent() {
		
		AssemblyConnector location = (AssemblyConnector) weavingLocation.getLocation();
		return (BasicComponent) location.getRequiringAssemblyContext_AssemblyConnector().getEncapsulatedComponent__AssemblyContext();
		
	}
	
	@Override
	protected BasicComponent getCalledComponent() {
		
		AssemblyConnector location = (AssemblyConnector) weavingLocation.getLocation();
		return (BasicComponent) location.getProvidingAssemblyContext_AssemblyConnector().getEncapsulatedComponent__AssemblyContext();
		
	}

	@Override
	protected ExternalCallInfo getExternalCallInfoFrom(ServiceEffectSpecification seffToTransform) throws ConcernWeavingException {
		
		Signature calledService = (Signature) seffToTransform.getDescribedService__SEFF();
		return new ExternalCallInfo(calledService, 
									getRequiredRoleOfAdapterBy(calledService), 
									getReturnVariableUsageBy(calledService), 
									getInputVariableUsagesBy(calledService),
									getSetVariableActions(seffToTransform));

	}

	private List<VariableUsage> getReturnVariableUsageBy(Signature calledService) throws ConcernWeavingException {
		
		if (hasReturnType(calledService)) {
			
			return getExternalCallActionInvoking(calledService).getReturnVariableUsage__CallReturnAction();
			
		}
		
		return Collections.emptyList();
		
	}

	private List<VariableUsage> getInputVariableUsagesBy(Signature calledService) throws ConcernWeavingException {
		
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

}
