package edu.kit.ipd.are.dsexplore.concern.manager;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.eclipse.emf.ecore.util.EcoreUtil;
import org.palladiosimulator.pcm.parameter.ParameterFactory;
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
import org.palladiosimulator.pcm.seff.StartAction;
import org.palladiosimulator.pcm.seff.StopAction;

import edu.kit.ipd.are.dsexplore.concern.weavingstrategy.adapter.AdapterServiceEffectSpecificationWeaving.ExternalCallInfo;

public class PcmServiceEffectSpecificationManager {

	private final static String START_ACTION_NAME = "start";
	private final static String STOP_ACTION_NAME = "stop";
	
	private static PcmServiceEffectSpecificationManager eInstance = null;
	
	private SeffFactory seffFactory = SeffFactory.eINSTANCE;
	
	private PcmServiceEffectSpecificationManager() {
		
	}
	
	public static PcmServiceEffectSpecificationManager get() {
		
		if (eInstance == null) {
			
			eInstance = new PcmServiceEffectSpecificationManager();
			
		}
		
		return eInstance;
		
	}
	
	public void addServiceEffectSpecificationTo(BasicComponent component, ServiceEffectSpecification seff) {
		
		component.getServiceEffectSpecifications__BasicComponent().add(seff);
		
	}

	public ServiceEffectSpecification createServiceEffectSpecificationFor(Signature signature) {
		
		ServiceEffectSpecification seff = this.seffFactory.createResourceDemandingSEFF();
		seff.setDescribedService__SEFF(signature);
		
		return seff;
		
	}
	
	public ServiceEffectSpecification addExternalCallActionPipeBy(List<ExternalCallInfo> orderedExternalCallInfoSequence, ServiceEffectSpecification seff) {
		
		((ResourceDemandingBehaviour) seff).getSteps_Behaviour().addAll(toAbstractActions(orderedExternalCallInfoSequence));
		
		return seff;
		
	}

	private List<AbstractAction> toAbstractActions(List<ExternalCallInfo> orderedExternalCallInfoSequence) {
		
		List<AbstractAction> unlinkedActions = new ArrayList<AbstractAction>();
		unlinkedActions.add(getStartAction());
		unlinkedActions.addAll(toExternalCallActions(orderedExternalCallInfoSequence));
		unlinkedActions.add(getStopAction());
		
		return establishLinksBetween(unlinkedActions);
				
	}
	
	private List<AbstractAction> establishLinksBetween(List<AbstractAction> unlinkedActions) {
		
		AbstractAction action = null;
		int size = unlinkedActions.size();
		
		for (int i = 0; i < size; i++) {
			
			action = unlinkedActions.get(i);
			
			if (i == 0) {
				
				action.setPredecessor_AbstractAction(null);
				action.setSuccessor_AbstractAction(unlinkedActions.get(i + 1));
				continue;
				
			}
			
			if(i == (size - 1)) {
				
				action.setPredecessor_AbstractAction(unlinkedActions.get(i - 1));
				action.setSuccessor_AbstractAction(null);
				break;
				
			}
			
			action.setPredecessor_AbstractAction(unlinkedActions.get(i - 1));
			action.setSuccessor_AbstractAction(unlinkedActions.get(i + 1));
			
		}
		
		return unlinkedActions;
		
	}
	
	private List<AbstractAction> toExternalCallActions(List<ExternalCallInfo> orderedExternalCallInfoSequence) {
		
		return orderedExternalCallInfoSequence.stream().map(eachInfo -> createAbstractExternalActionCallOf(eachInfo))
													   .collect(Collectors.toList());
		
	}

	private AbstractAction getStopAction() {
		
		StopAction stopAction = this.seffFactory.createStopAction();
		stopAction.setEntityName(STOP_ACTION_NAME);
		
		return stopAction;
		
	}
	
	private AbstractAction getStartAction() {
		
		StartAction startAction = this.seffFactory.createStartAction();
		startAction.setEntityName(START_ACTION_NAME);
		
		return startAction;
		
	}
	
	//TODO refactor to some handler like its done with RoleHandler...
	private AbstractAction createAbstractExternalActionCallOf(ExternalCallInfo externalCallInfo) {
		
		if (externalCallInfo.requiredRole instanceof OperationRequiredRole) {
			
			return createExternalActionCallOf(externalCallInfo);
			
		} else {
			
			return createEmitEventActionOf(externalCallInfo);
			
		}
		
	}
	
	private AbstractAction createExternalActionCallOf(ExternalCallInfo externalCallInfo) {
		
		OperationSignature calledService = (OperationSignature) externalCallInfo.calledService;
		
		ExternalCallAction externalCallAction = this.seffFactory.createExternalCallAction();
		externalCallAction.setEntityName(calledService.getEntityName());
		externalCallAction.setCalledService_ExternalService(calledService);
		externalCallAction.setRole_ExternalService((OperationRequiredRole) externalCallInfo.requiredRole);
		externalCallAction.getInputVariableUsages__CallAction().addAll(copy(externalCallInfo.inputVariableUsages));
		externalCallAction.getReturnVariableUsage__CallReturnAction().addAll(copy(externalCallInfo.returnVariableUsage));
		
		return externalCallAction;
	}
	
	private AbstractAction createEmitEventActionOf(ExternalCallInfo externalCallInfo) {
		
		EventType emittedEvent = (EventType) externalCallInfo.calledService;
		
		EmitEventAction emitEventAction = this.seffFactory.createEmitEventAction();
		emitEventAction.setEntityName(emittedEvent.getEntityName());
		emitEventAction.setEventType__EmitEventAction(emittedEvent);
		emitEventAction.setSourceRole__EmitEventAction((SourceRole) externalCallInfo.requiredRole);
		emitEventAction.getInputVariableUsages__CallAction().addAll(copy(externalCallInfo.inputVariableUsages));
		
		return emitEventAction;
	}
	
	private List<VariableUsage> copy(List<VariableUsage> variableUsages) {
		
		List<VariableUsage> copy = new ArrayList<VariableUsage>();
		for (VariableUsage eachVariableUsage : variableUsages) {
			
			copy.add((VariableUsage) EcoreUtil.copy(eachVariableUsage));
			
		}
		
		return copy;
		
	}
	
}