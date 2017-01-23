package edu.kit.ipd.are.dsexplore.concern.manager;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.palladiosimulator.pcm.repository.BasicComponent;
import org.palladiosimulator.pcm.repository.EventType;
import org.palladiosimulator.pcm.repository.OperationRequiredRole;
import org.palladiosimulator.pcm.repository.OperationSignature;
import org.palladiosimulator.pcm.repository.RequiredRole;
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

import edu.kit.ipd.are.dsexplore.concern.util.Pair;

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
	
	public ServiceEffectSpecification addExternalCallActionPipeBy(List<Pair<Signature, RequiredRole>> orderedExternalCallActionSequence, ServiceEffectSpecification seff) {
		
		((ResourceDemandingBehaviour) seff).getSteps_Behaviour().addAll(toAbstractActions(orderedExternalCallActionSequence));
		
		return seff;
		
	}

	private List<AbstractAction> toAbstractActions(List<Pair<Signature, RequiredRole>> orderedExternalCallActionSequence) {
		
		List<AbstractAction> unlinkedActions = new ArrayList<AbstractAction>();
		unlinkedActions.add(getStartAction());
		unlinkedActions.addAll(toExternalCallActions(orderedExternalCallActionSequence));
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
	
	private List<AbstractAction> toExternalCallActions(List<Pair<Signature, RequiredRole>> orderedExternalCallActionSequence) {
		
		return orderedExternalCallActionSequence.stream().map(eachAction -> createAbstractExternalActionCallOf(eachAction))
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
	private AbstractAction createAbstractExternalActionCallOf(Pair<Signature, RequiredRole> action) {
		
		RequiredRole requiredRole = action.getSecond();
		if (requiredRole instanceof OperationRequiredRole) {
			
			return createExternalActionCallOf(Pair.of((OperationSignature) action.getFirst(), (OperationRequiredRole) action.getSecond()));
			
		} else {
			
			return createEmitEventActionOf(Pair.of((EventType) action.getFirst(), (SourceRole) action.getSecond()));
			
		}
		
	}
	
	private AbstractAction createExternalActionCallOf(Pair<OperationSignature, OperationRequiredRole> action) {
		
		ExternalCallAction externalCallAction = this.seffFactory.createExternalCallAction();
		externalCallAction.setEntityName(action.getFirst().getEntityName());
		externalCallAction.setCalledService_ExternalService(action.getFirst());
		externalCallAction.setRole_ExternalService(action.getSecond());
		
		return externalCallAction;
	}
	
	private AbstractAction createEmitEventActionOf(Pair<EventType, SourceRole> action) {
		
		EmitEventAction emitEventAction = this.seffFactory.createEmitEventAction();
		emitEventAction.setEntityName(action.getFirst().getEntityName());
		emitEventAction.setEventType__EmitEventAction(action.getFirst());
		emitEventAction.setSourceRole__EmitEventAction(action.getSecond());
		
		return emitEventAction;
	}
	
}