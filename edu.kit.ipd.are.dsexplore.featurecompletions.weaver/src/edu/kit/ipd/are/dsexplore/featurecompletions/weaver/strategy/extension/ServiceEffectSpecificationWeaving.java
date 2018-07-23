/**
 * 
 */
package edu.kit.ipd.are.dsexplore.featurecompletions.weaver.strategy.extension;

import org.eclipse.emf.ecore.EObject;
import org.palladiosimulator.pcm.repository.BasicComponent;
import org.palladiosimulator.pcm.repository.OperationInterface;
import org.palladiosimulator.pcm.repository.OperationProvidedRole;
import org.palladiosimulator.pcm.repository.OperationRequiredRole;
import org.palladiosimulator.pcm.repository.OperationSignature;
import org.palladiosimulator.pcm.repository.RequiredRole;
import org.palladiosimulator.pcm.seff.AbstractAction;
import org.palladiosimulator.pcm.seff.ExternalCallAction;
import org.palladiosimulator.pcm.seff.ResourceDemandingBehaviour;
import org.palladiosimulator.pcm.seff.SeffFactory;
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
	protected void addFCCallTo(ResourceDemandingBehaviour seff, AbstractAction internalAction, Appearance appears, OperationProvidedRole operationProvidedRole) {	
		AbstractAction predecessor = internalAction.getPredecessor_AbstractAction();
		AbstractAction successor = internalAction.getSuccessor_AbstractAction();
		
		OperationRequiredRole fcRequiredRole = getFcRequiredRole(internalAction, operationProvidedRole.getProvidedInterface__OperationProvidedRole());
		
		switch (appears) {
		case BEFORE:
			addFCBetween(predecessor, internalAction, createExternalCallAction(operationProvidedRole.getProvidedInterface__OperationProvidedRole(), fcRequiredRole), seff);
			break;
		case AFTER:
			addFCBetween(internalAction, successor, createExternalCallAction(operationProvidedRole.getProvidedInterface__OperationProvidedRole(), fcRequiredRole), seff);		
			break;
		case AROUND:
			addFCBetween(predecessor, internalAction, createExternalCallAction(operationProvidedRole.getProvidedInterface__OperationProvidedRole(), fcRequiredRole), seff);
			addFCBetween(internalAction, successor, createExternalCallAction(operationProvidedRole.getProvidedInterface__OperationProvidedRole(), fcRequiredRole), seff);	
			break;
		default:
			break;
		}			
	}

	/**
	 * @param internalAction
	 * @param operationInterface 
	 * @return
	 */
	protected OperationRequiredRole getFcRequiredRole(AbstractAction internalAction, OperationInterface operationInterface) {
		BasicComponent comp = null;
		EObject container = internalAction.eContainer();
		while (!(container instanceof BasicComponent)) { //search for containing component
			container = container.eContainer();
		}
		comp = (BasicComponent) container;
		
		for (RequiredRole requiredRole : comp.getRequiredRoles_InterfaceRequiringEntity()) {
			if (((OperationRequiredRole) requiredRole).getRequiredInterface__OperationRequiredRole().getId().equals(operationInterface.getId())) {
				return (OperationRequiredRole) requiredRole;
			}
		}
		return null;
	}

	/**
	 * @param operationInterface
	 * @param fcRequiredRole 
	 * @return
	 */
	ExternalCallAction createExternalCallAction(OperationInterface operationInterface, OperationRequiredRole fcRequiredRole) {
			ExternalCallAction externalCallAction = this.seffFactory.createExternalCallAction();
			OperationSignature calledService = (OperationSignature) operationInterface.getSignatures__OperationInterface().get(0); //TODO add all Signatures from Interface??
			externalCallAction.setEntityName(calledService.getEntityName());
			externalCallAction.setCalledService_ExternalService(calledService);
			//add role to ext call
			externalCallAction.setRole_ExternalService(fcRequiredRole);
	
			return externalCallAction;
		}

	/**
	 * @param predecessor
	 * @param internalAction
	 * @param externalCallAction
	 * @param seff
	 */
	void addFCBetween(AbstractAction previous, AbstractAction next, ExternalCallAction externalCallAction, ResourceDemandingBehaviour seff) {
		seff.getSteps_Behaviour().add(externalCallAction);
		previous.setSuccessor_AbstractAction(externalCallAction);
		externalCallAction.setPredecessor_AbstractAction(previous);
		externalCallAction.setSuccessor_AbstractAction(next);
		next.setPredecessor_AbstractAction(externalCallAction);
	}
}
