package edu.kit.ipd.are.dsexplore.featurecompletions.weaver.strategy.adapter;

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

import edu.kit.ipd.are.dsexplore.featurecompletions.weaver.port.FCCWeaverException;

/**
 * This class returns informations for the SEFF depending on the connection of
 * the components the adapter is inserted in between.
 *
 * @author scheerer
 *
 */
public class AssemblyLocationSeffWeaving extends ServiceEffectSpecificationWeaving {

	public AssemblyLocationSeffWeaving(IAdapterWeaving parent) {
		super(parent);
	}

	/**
	 * @see AdapterServiceEffectSpecificationWeaving#getCallingComponent()
	 */
	@Override
	protected BasicComponent getCallingComponent() {
		AssemblyConnector location = (AssemblyConnector) this.weavingLocation.getLocation();
		return (BasicComponent) location.getRequiringAssemblyContext_AssemblyConnector().getEncapsulatedComponent__AssemblyContext();
	}

	/**
	 * @see AdapterServiceEffectSpecificationWeaving#getCalledComponent()
	 */
	@Override
	protected BasicComponent getCalledComponent() {
		AssemblyConnector location = (AssemblyConnector) this.weavingLocation.getLocation();
		return (BasicComponent) location.getProvidingAssemblyContext_AssemblyConnector().getEncapsulatedComponent__AssemblyContext();
	}

	/**
	 * @see AdapterServiceEffectSpecificationWeaving#getExternalCallInfoFrom(ServiceEffectSpecification)
	 */
	@Override
	protected ExternalCallInfo getExternalCallInfoFrom(ServiceEffectSpecification seffToTransform) throws FCCWeaverException {
		Signature calledService = seffToTransform.getDescribedService__SEFF();
		return new ExternalCallInfo(calledService, this.getRequiredRoleOfAdapterBy(calledService), this.getReturnVariableUsageBy(calledService), this.getInputVariableUsagesBy(calledService),
				this.getSetVariableActions(seffToTransform));
	}

	private List<VariableUsage> getReturnVariableUsageBy(Signature calledService) throws FCCWeaverException {
		if (this.hasReturnType(calledService)) {
			return this.getReturnVariableUsageIfServiceIsCalled(calledService);
		}
		return Collections.emptyList();
	}

	private List<VariableUsage> getInputVariableUsagesBy(Signature calledService) throws FCCWeaverException {
		if (!this.hasInputVariables(calledService)) {
			return Collections.emptyList();
		}
		return this.getInputVariableUsageIfServiceIsCalled(calledService);
	}

	private boolean hasReturnType(Signature calledService) {
		return (calledService instanceof OperationSignature) && ((OperationSignature) calledService).getReturnType__OperationSignature() != null;
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
