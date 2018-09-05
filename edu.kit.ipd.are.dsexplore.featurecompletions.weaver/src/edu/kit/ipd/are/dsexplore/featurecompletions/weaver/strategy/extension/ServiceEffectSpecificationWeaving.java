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

import edu.kit.ipd.are.dsexplore.featurecompletions.weaver.strategy.handler.FCCStructureHandler;
import featureSolution.Appearance;

/**
 * This class handles weaving of the PCM abstract behavior description model (SEFF). 
 * 
 * @author Maximilian Eckert (maximilian.eckert@student.kit.edu, maxieckert@web.de)
 * 
 */
public abstract class ServiceEffectSpecificationWeaving {

	private final SeffFactory seffFactory = SeffFactory.eINSTANCE;
	
	protected final IBehaviourWeaving parent;

	public ServiceEffectSpecificationWeaving(IBehaviourWeaving parent) {
		this.parent = parent;
	}

	/**
	 * Applies weaving instruction on SEFF.
	 * 
	 * @param instruction the instruction to apply.
	 */
	public abstract void weave(IWeavingInstruction instruction);

	/**
	 * Adds a fc call to a SEFF at the specified position.
	 * 
	 * @param seff the SEFF.
	 * @param internalAction the position at which the fc call will be added.
	 * @param appears specifies whether the call will be added BEFORE, AFTER or AROUND the specified position
	 * @param operationProvidedRole provided role of the fc call to add.
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
	 * Determines the fc required role of the component containing the specified internal action.
	 * 
	 * @param internalAction the internal action.
	 * @param operationInterface inteface of the fc.
	 * @return the fc required role.
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
	 * Creates an external call action with the specified interface and required role.
	 * 
	 * @param operationInterface the interface of the external call.
	 * @param fcRequiredRole the required role of the component.
	 * @return an external call action with the specified interface and required role.
	 */
	ExternalCallAction createExternalCallAction(OperationInterface operationInterface, OperationRequiredRole fcRequiredRole) {
			ExternalCallAction externalCallAction = this.seffFactory.createExternalCallAction();
			OperationSignature calledService = this.parent.getMergedRepoManager().getFulfillingSignatureFrom(operationInterface, this.parent.getSelectedOptionalCV());
					//(OperationSignature) operationInterface.getSignatures__OperationInterface().get(0); //TODO add all Signatures from Interface??
			externalCallAction.setEntityName(calledService.getEntityName());
			externalCallAction.setCalledService_ExternalService(calledService);
			//add role to ext call
			externalCallAction.setRole_ExternalService(fcRequiredRole);
	
			return externalCallAction;
		}

	/**
	 * Adds an external call action between two actions of a SEFF.
	 * 
	 * @param previous first action.
	 * @param next second action.
	 * @param externalCallAction external call action to add.
	 * @param seff the seff.
	 */
	void addFCBetween(AbstractAction previous, AbstractAction next, ExternalCallAction externalCallAction, ResourceDemandingBehaviour seff) {
		seff.getSteps_Behaviour().add(externalCallAction);
		previous.setSuccessor_AbstractAction(externalCallAction);
		externalCallAction.setPredecessor_AbstractAction(previous);
		externalCallAction.setSuccessor_AbstractAction(next);
		next.setPredecessor_AbstractAction(externalCallAction);
	}
}
