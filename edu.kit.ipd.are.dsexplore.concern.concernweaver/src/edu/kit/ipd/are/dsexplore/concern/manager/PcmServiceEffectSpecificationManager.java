package edu.kit.ipd.are.dsexplore.concern.manager;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.eclipse.emf.ecore.util.EcoreUtil;
import org.palladiosimulator.pcm.parameter.VariableUsage;
import org.palladiosimulator.pcm.repository.BasicComponent;
import org.palladiosimulator.pcm.repository.EventType;
import org.palladiosimulator.pcm.repository.OperationRequiredRole;
import org.palladiosimulator.pcm.repository.OperationSignature;
import org.palladiosimulator.pcm.repository.Signature;
import org.palladiosimulator.pcm.repository.SourceRole;
import org.palladiosimulator.pcm.seff.AbstractAction;
import org.palladiosimulator.pcm.seff.EmitEventAction;
import org.palladiosimulator.pcm.seff.ExternalCallAction;
import org.palladiosimulator.pcm.seff.ResourceDemandingBehaviour;
import org.palladiosimulator.pcm.seff.SeffFactory;
import org.palladiosimulator.pcm.seff.ServiceEffectSpecification;
import org.palladiosimulator.pcm.seff.SetVariableAction;
import org.palladiosimulator.pcm.seff.StartAction;
import org.palladiosimulator.pcm.seff.StopAction;

import edu.kit.ipd.are.dsexplore.concern.weavingstrategy.adapter.AdapterServiceEffectSpecificationWeaving.ExternalCallInfo;

/**
 * This class provides all operations concerned with SEFF.
 *
 * @author scheerer
 *
 */
public class PcmServiceEffectSpecificationManager {

	private final static String START_ACTION_NAME = "start";
	private final static String STOP_ACTION_NAME = "stop";

	private static PcmServiceEffectSpecificationManager eInstance = null;

	private SeffFactory seffFactory = SeffFactory.eINSTANCE;

	private PcmServiceEffectSpecificationManager() {
	}

	/**
	 * Creates or returns a PcmServiceEffectSpecificationManager-instance.
	 *
	 * @return a PcmServiceEffectSpecificationManager-instance.
	 */
	public static PcmServiceEffectSpecificationManager getInstance() {
		if (PcmServiceEffectSpecificationManager.eInstance == null) {
			PcmServiceEffectSpecificationManager.eInstance = new PcmServiceEffectSpecificationManager();
		}
		return PcmServiceEffectSpecificationManager.eInstance;
	}

	/**
	 * Adds a SEFF to a given component.
	 *
	 * @param component
	 *            - The component a SEFF should be added to.
	 * @param seff
	 *            - The SEFF which is going to be added to a given component.
	 */
	public void addServiceEffectSpecificationTo(BasicComponent component, ServiceEffectSpecification seff) {
		component.getServiceEffectSpecifications__BasicComponent().add(seff);
	}

	/**
	 * Creates a SEFF for a given service.
	 *
	 * @param signature
	 *            - Represents the service the SEFF should describe.
	 * @return the created SEFF.
	 */
	public ServiceEffectSpecification createServiceEffectSpecificationFor(Signature signature) {
		ServiceEffectSpecification seff = this.seffFactory.createResourceDemandingSEFF();
		seff.setDescribedService__SEFF(signature);
		return seff;
	}

	/**
	 * Adds an ordered external call action sequence and establishes the links
	 * between the actions.
	 *
	 * @param orderedExternalCallInfoSequence
	 *            - The ordered external call action sequence.
	 * @param seff
	 *            - The SEFF the external call actions are going to be added to.
	 * @return the SEFF containing the external call action sequence.
	 */
	public ServiceEffectSpecification addExternalCallActionPipeBy(List<ExternalCallInfo> orderedExternalCallInfoSequence, ServiceEffectSpecification seff) {
		((ResourceDemandingBehaviour) seff).getSteps_Behaviour().addAll(this.toAbstractActions(orderedExternalCallInfoSequence));
		return seff;
	}

	private List<AbstractAction> toAbstractActions(List<ExternalCallInfo> orderedExternalCallInfoSequence) {
		List<AbstractAction> unlinkedActions = new ArrayList<>();
		unlinkedActions.add(this.getStartAction());
		unlinkedActions.addAll(this.toExternalCallActions(orderedExternalCallInfoSequence));
		unlinkedActions.add(this.getStopAction());
		return this.establishLinksBetween(unlinkedActions);
	}

	private List<AbstractAction> establishLinksBetween(List<AbstractAction> unlinkedActions) {
		int size = unlinkedActions.size();
		for (int i = 0; i < size; i++) {
			AbstractAction predeccessor = null;
			AbstractAction successor = null;
			AbstractAction current = unlinkedActions.get(i);

			if (this.isStartAction(i)) {
				predeccessor = null;
				successor = unlinkedActions.get(i + 1);
			} else if (this.isStopAction(i, size)) {
				predeccessor = unlinkedActions.get(i - 1);
				successor = null;
			} else {
				predeccessor = unlinkedActions.get(i - 1);
				successor = unlinkedActions.get(i + 1);
			}
			current.setPredecessor_AbstractAction(predeccessor);
			current.setSuccessor_AbstractAction(successor);
		}
		return unlinkedActions;
	}

	private boolean isStartAction(int i) {
		return i == 0;
	}

	private boolean isStopAction(int i, int size) {
		return i == (size - 1);
	}

	private List<AbstractAction> toExternalCallActions(List<ExternalCallInfo> orderedExternalCallInfoSequence) {
		List<AbstractAction> result = new ArrayList<>();
		for (ExternalCallInfo info : orderedExternalCallInfoSequence) {
			for (AbstractAction action : this.createAbstractExternalActionCallOf(info)) {
				result.add(action);
			}
		}
		return result;
		// return orderedExternalCallInfoSequence.stream().flatMap(eachInfo ->
		// this.createAbstractExternalActionCallOf(eachInfo).stream()).collect(Collectors.toList());
	}

	private AbstractAction getStopAction() {
		StopAction stopAction = this.seffFactory.createStopAction();
		stopAction.setEntityName(PcmServiceEffectSpecificationManager.STOP_ACTION_NAME);

		return stopAction;
	}

	private AbstractAction getStartAction() {
		StartAction startAction = this.seffFactory.createStartAction();
		startAction.setEntityName(PcmServiceEffectSpecificationManager.START_ACTION_NAME);

		return startAction;
	}

	// TODO refactor to some handler like its done with RoleHandler...
	private List<AbstractAction> createAbstractExternalActionCallOf(ExternalCallInfo externalCallInfo) {
		List<AbstractAction> abstractActions = new ArrayList<>();

		if (externalCallInfo.requiredRole instanceof OperationRequiredRole) {
			abstractActions.add(this.createExternalActionCallOf(externalCallInfo));
		} else {
			abstractActions.add(this.createEmitEventActionOf(externalCallInfo));
		}

		abstractActions.addAll(this.getSetVariableActionsFrom(externalCallInfo.setVariableActions));
		return abstractActions;
	}

	private List<SetVariableAction> getSetVariableActionsFrom(List<SetVariableAction> setVariableActions) {
		return setVariableActions.stream().map(each -> EcoreUtil.copy(each)).collect(Collectors.toList());
	}

	private AbstractAction createExternalActionCallOf(ExternalCallInfo externalCallInfo) {
		OperationSignature calledService = (OperationSignature) externalCallInfo.calledService;

		ExternalCallAction externalCallAction = this.seffFactory.createExternalCallAction();
		externalCallAction.setEntityName(calledService.getEntityName());
		externalCallAction.setCalledService_ExternalService(calledService);
		externalCallAction.setRole_ExternalService((OperationRequiredRole) externalCallInfo.requiredRole);
		externalCallAction.getInputVariableUsages__CallAction().addAll(this.copy(externalCallInfo.inputVariableUsages));
		externalCallAction.getReturnVariableUsage__CallReturnAction().addAll(this.copy(externalCallInfo.returnVariableUsage));

		return externalCallAction;
	}

	private AbstractAction createEmitEventActionOf(ExternalCallInfo externalCallInfo) {
		EventType emittedEvent = (EventType) externalCallInfo.calledService;

		EmitEventAction emitEventAction = this.seffFactory.createEmitEventAction();
		emitEventAction.setEntityName(emittedEvent.getEntityName());
		emitEventAction.setEventType__EmitEventAction(emittedEvent);
		emitEventAction.setSourceRole__EmitEventAction((SourceRole) externalCallInfo.requiredRole);
		emitEventAction.getInputVariableUsages__CallAction().addAll(this.copy(externalCallInfo.inputVariableUsages));

		return emitEventAction;
	}

	private List<VariableUsage> copy(List<VariableUsage> variableUsages) {
		List<VariableUsage> copy = new ArrayList<>();
		for (VariableUsage eachVariableUsage : variableUsages) {
			copy.add(EcoreUtil.copy(eachVariableUsage));
		}
		return copy;
	}
}