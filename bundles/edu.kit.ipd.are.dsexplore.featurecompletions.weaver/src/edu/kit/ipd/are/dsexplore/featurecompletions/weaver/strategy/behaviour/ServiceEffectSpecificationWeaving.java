/**
 *
 */
package edu.kit.ipd.are.dsexplore.featurecompletions.weaver.strategy.behaviour;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.palladiosimulator.pcm.repository.BasicComponent;
import org.palladiosimulator.pcm.repository.OperationInterface;
import org.palladiosimulator.pcm.repository.OperationRequiredRole;
import org.palladiosimulator.pcm.repository.OperationSignature;
import org.palladiosimulator.pcm.repository.RequiredRole;
import org.palladiosimulator.pcm.seff.AbstractAction;
import org.palladiosimulator.pcm.seff.ExternalCallAction;
import org.palladiosimulator.pcm.seff.ResourceDemandingBehaviour;
import org.palladiosimulator.pcm.seff.SeffFactory;
import org.palladiosimulator.pcm.seff.StartAction;
import org.palladiosimulator.pcm.seff.StopAction;

import featureSolution.Appearance;

/**
 * This class handles weaving of the PCM abstract behavior description model
 * (SEFF).
 *
 * @author Maximilian Eckert (maximilian.eckert@student.kit.edu,
 *         maxieckert@web.de)
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
	 * @param instruction
	 *            the instruction to apply.
	 */
	public abstract void weave(IWeavingInstruction instruction);

	/**
	 * Adds a fc call to a SEFF at the specified position (action).
	 *
	 * @param seff
	 *            the SEFF.
	 * @param internalAction
	 *            the position at which the fc call will be added.
	 * @param appears
	 *            specifies whether the call will be added BEFORE, AFTER or
	 *            AROUND the specified position
	 * @param list
	 *            provided role of the fc call to add.
	 */
	protected void addFCCallTo(ResourceDemandingBehaviour seff, AbstractAction internalAction, Appearance appears, List<OperationSignature> list) {
		AbstractAction predecessor = internalAction.getPredecessor_AbstractAction();
		AbstractAction successor = internalAction.getSuccessor_AbstractAction();

		switch (appears) {
		case BEFORE:
			this.addFCBetween(predecessor, internalAction, this.createExternalCallAction(list, internalAction), seff);
			break;
		case AFTER:
			this.addFCBetween(internalAction, successor, this.createExternalCallAction(list, internalAction), seff);
			break;
		case AROUND:
			this.addFCBetween(predecessor, internalAction, this.createExternalCallAction(list, internalAction), seff);
			this.addFCBetween(internalAction, successor, this.createExternalCallAction(list, internalAction), seff);
			break;
		default:
			break;
		}
	}

	/**
	 * Determines the fc required role of the component containing the specified
	 * internal action.
	 *
	 * @param internalAction
	 *            the internal action.
	 * @param operationInterface
	 *            inteface of the fc.
	 * @return the fc required role.
	 */
	protected OperationRequiredRole getFcRequiredRole(AbstractAction internalAction, OperationInterface operationInterface) {
		BasicComponent comp = null;
		EObject container = internalAction.eContainer();
		while (!(container instanceof BasicComponent)) { // search for
															// containing
															// component
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
	 * Creates an external call action with the specified interface and required
	 * role.
	 *
	 * @param list
	 *            the interface of the external call.
	 * @param internalAction
	 * @param fcRequiredRole
	 * @param fcRequiredRole
	 *            the required role of the component.
	 * @return an external call action with the specified interface and required
	 *         role.
	 */
	List<ExternalCallAction> createExternalCallAction(List<OperationSignature> list, AbstractAction internalAction) {
		List<ExternalCallAction> externalCallActions = new ArrayList<>();
		for (OperationSignature sig : list) {
			ExternalCallAction externalCallAction = this.seffFactory.createExternalCallAction();
			OperationSignature calledService = sig;
			externalCallAction.setEntityName(calledService.getEntityName());
			externalCallAction.setCalledService_ExternalService(calledService);
			// add role to ext call
			OperationRequiredRole fcRequiredRole = this.getFcRequiredRole(internalAction, sig.getInterface__OperationSignature());
			externalCallAction.setRole_ExternalService(fcRequiredRole);
			externalCallActions.add(externalCallAction);
		}

		return externalCallActions;
	}

	/**
	 * Adds an external call action between two actions of a SEFF.
	 *
	 * @param previous
	 *            first action.
	 * @param next
	 *            second action.
	 * @param list
	 *            external call action to add.
	 * @param seff
	 *            the seff.
	 */
	void addFCBetween(AbstractAction previous, AbstractAction next, List<ExternalCallAction> list, ResourceDemandingBehaviour seff) {
		for (ExternalCallAction externalCallAction : list) {
			this.addFCAfter(previous, externalCallAction, seff);
		}
	}

	void addFCAfter(AbstractAction action, ExternalCallAction externalCall, ResourceDemandingBehaviour seff) {
		seff.getSteps_Behaviour().add(externalCall);
		AbstractAction next = action.getSuccessor_AbstractAction();
		action.setSuccessor_AbstractAction(externalCall);
		externalCall.setPredecessor_AbstractAction(action);
		externalCall.setSuccessor_AbstractAction(next);
		next.setPredecessor_AbstractAction(externalCall);
	}

	/**
	 * Adds a FC call to a SEFF, whereby BEFORE or AFTER mean at the beginning
	 * or at the end of the whole SEFF.
	 *
	 * @param instruction
	 * @param forkedSEFF
	 */
	protected void addFCCallToSEFF(IWeavingInstruction instruction, ResourceDemandingBehaviour seff) {
		if (instruction.getAdvice().getAppears() == Appearance.BEFORE) {
			AbstractAction start = this.getStartAction(seff.getSteps_Behaviour());
			this.addFCCallTo(seff, start, Appearance.AFTER, instruction.getFccWithProvidedRole().getSecond());
		} else if (instruction.getAdvice().getAppears() == Appearance.AFTER) {
			AbstractAction stop = this.getStopAction(seff.getSteps_Behaviour());
			this.addFCCallTo(seff, stop, Appearance.BEFORE, instruction.getFccWithProvidedRole().getSecond());
		} else if (instruction.getAdvice().getAppears() == Appearance.AROUND) {
			AbstractAction start = this.getStartAction(seff.getSteps_Behaviour());
			AbstractAction stop = this.getStopAction(seff.getSteps_Behaviour());
			this.addFCCallTo(seff, start, Appearance.AFTER, instruction.getFccWithProvidedRole().getSecond());
			this.addFCCallTo(seff, stop, Appearance.BEFORE, instruction.getFccWithProvidedRole().getSecond());
		}
	}

	private AbstractAction getStopAction(List<AbstractAction> steps) {
		return steps.stream().filter(action -> action instanceof StopAction).findFirst().get();
	}

	private AbstractAction getStartAction(List<AbstractAction> steps) {
		return steps.stream().filter(action -> action instanceof StartAction).findFirst().get();
	}
}
