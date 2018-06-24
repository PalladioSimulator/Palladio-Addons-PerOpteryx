/**
 * 
 */
package edu.kit.ipd.are.dsexplore.featurecompletions.weaver.strategy.extension;

import org.eclipse.emf.common.util.EList;
import org.palladiosimulator.pcm.repository.OperationInterface;
import org.palladiosimulator.pcm.repository.OperationProvidedRole;
import org.palladiosimulator.pcm.repository.OperationRequiredRole;
import org.palladiosimulator.pcm.repository.OperationSignature;
import org.palladiosimulator.pcm.repository.RequiredRole;
import org.palladiosimulator.pcm.seff.AbstractAction;
import org.palladiosimulator.pcm.seff.ExternalCallAction;
import org.palladiosimulator.pcm.seff.ResourceDemandingBehaviour;
import org.palladiosimulator.pcm.seff.SeffFactory;
import org.palladiosimulator.pcm.seff.ServiceEffectSpecification;

import featureSolution.Appearance;

/**
 * @author Maximilian Eckert (maximilian.eckert@student.kit.edu, maxieckert@web.de)
 * 
 *
 */
public abstract class ServiceEffectSpecificationWeaving {

	private final SeffFactory seffFactory = SeffFactory.eINSTANCE;
	
	protected final IExtensionWeaving parent;

	public ServiceEffectSpecificationWeaving(IExtensionWeaving parent) {
		this.parent = parent;
	}

	/**
	 * @param instruction
	 */
	public abstract void weave(IWeavingInstruction instruction);

	/**
	 * @param seff 
	 * @param internalAction
	 * @param appears
	 * @param operationProvidedRole 
	 */
	protected void addFCCallTo(ServiceEffectSpecification seff, AbstractAction internalAction, Appearance appears, OperationProvidedRole operationProvidedRole) {	
		AbstractAction predecessor = internalAction.getPredecessor_AbstractAction();
		AbstractAction successor = internalAction.getSuccessor_AbstractAction();
		
		switch (appears) {
		case BEFORE:
			addFCBetween(predecessor, internalAction, createExternalCallAction(operationProvidedRole.getProvidedInterface__OperationProvidedRole()), seff);
			break;
		case AFTER:
			addFCBetween(internalAction, successor, createExternalCallAction(operationProvidedRole.getProvidedInterface__OperationProvidedRole()), seff);		
			break;
		case AROUND:
			addFCBetween(predecessor, internalAction, createExternalCallAction(operationProvidedRole.getProvidedInterface__OperationProvidedRole()), seff);
			addFCBetween(internalAction, successor, createExternalCallAction(operationProvidedRole.getProvidedInterface__OperationProvidedRole()), seff);	
			break;
		default:
			break;
		}
		
		//TODO add required role only if not yet existing
		RequiredRole requiredRole = this.parent.getMergedRepoManager().createRequiredRoleBy(operationProvidedRole);
		EList<RequiredRole> allRequiredRoles = seff.getBasicComponent_ServiceEffectSpecification().getRequiredRoles_InterfaceRequiringEntity();
		if (allRequiredRoles.stream().noneMatch(role -> ((OperationRequiredRole) role).getRequiredInterface__OperationRequiredRole().getId().equals(((OperationRequiredRole) requiredRole).getRequiredInterface__OperationRequiredRole().getId()))) {
			allRequiredRoles.add(requiredRole);
		}
			
	}

	/**
	 * @param operationInterface
	 * @return
	 */
	ExternalCallAction createExternalCallAction(OperationInterface operationInterface) {
			ExternalCallAction externalCallAction = this.seffFactory.createExternalCallAction();
			OperationSignature calledService = (OperationSignature) operationInterface.getSignatures__OperationInterface().get(0); //TODO add all Signatures from Interface??
			externalCallAction.setEntityName(calledService.getEntityName());
			externalCallAction.setCalledService_ExternalService(calledService);
			//TODO add required role to component?
	//		externalCallAction.setRole_ExternalService((OperationRequiredRole) externalCallInfo.requiredRole);
	//		externalCallAction.getInputVariableUsages__CallAction().addAll(this.copy(externalCallInfo.inputVariableUsages));
	//		externalCallAction.getReturnVariableUsage__CallReturnAction().addAll(this.copy(externalCallInfo.returnVariableUsage));
			return externalCallAction;
		}

	/**
	 * @param predecessor
	 * @param internalAction
	 * @param externalCallAction
	 * @param seff
	 */
	void addFCBetween(AbstractAction previous, AbstractAction next, ExternalCallAction externalCallAction, ServiceEffectSpecification seff) {
		((ResourceDemandingBehaviour) seff).getSteps_Behaviour().add(externalCallAction);
		previous.setSuccessor_AbstractAction(externalCallAction);
		externalCallAction.setPredecessor_AbstractAction(previous);
		externalCallAction.setSuccessor_AbstractAction(next);
		next.setPredecessor_AbstractAction(externalCallAction);
	}
}
