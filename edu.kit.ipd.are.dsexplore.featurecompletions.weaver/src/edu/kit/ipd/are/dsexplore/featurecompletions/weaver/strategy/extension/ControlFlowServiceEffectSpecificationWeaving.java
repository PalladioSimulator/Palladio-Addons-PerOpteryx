/**
 * 
 */
package edu.kit.ipd.are.dsexplore.featurecompletions.weaver.strategy.extension;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.palladiosimulator.pcm.core.composition.AssemblyContext;
import org.palladiosimulator.pcm.repository.BasicComponent;
import org.palladiosimulator.pcm.repository.OperationInterface;
import org.palladiosimulator.pcm.repository.OperationProvidedRole;
import org.palladiosimulator.pcm.repository.OperationRequiredRole;
import org.palladiosimulator.pcm.repository.RequiredRole;
import org.palladiosimulator.pcm.seff.AbstractAction;
import org.palladiosimulator.pcm.seff.AbstractBranchTransition;
import org.palladiosimulator.pcm.seff.AbstractLoopAction;
import org.palladiosimulator.pcm.seff.BranchAction;
import org.palladiosimulator.pcm.seff.InternalAction;
import org.palladiosimulator.pcm.seff.ResourceDemandingBehaviour;
import org.palladiosimulator.pcm.seff.ServiceEffectSpecification;
import org.palladiosimulator.pcm.seff.StartAction;
import org.palladiosimulator.pcm.seff.StopAction;

import featureSolution.Appearance;

/**
 * @author Maximilian Eckert (maximilian.eckert@student.kit.edu, maxieckert@web.de)
 * 
 *
 */
public class ControlFlowServiceEffectSpecificationWeaving extends ServiceEffectSpecificationWeaving {

	/**
	 * @param parent
	 */
	public ControlFlowServiceEffectSpecificationWeaving(IExtensionWeaving parent) {
		super(parent);
	}

	/* (non-Javadoc)
	 * @see edu.kit.ipd.are.dsexplore.featurecompletions.weaver.strategy.extension.ServiceEffectSpecificationWeaving#weave(edu.kit.ipd.are.dsexplore.featurecompletions.weaver.strategy.extension.IWeavingInstruction)
	 */
	@Override
	public void weave(IWeavingInstruction instruction) { //TODO gleiche Code teilen in Oberklasse ziehen?
		List<? extends IWeavingLocation> locations = instruction.getWeavingLocations();
		for (IWeavingLocation weavingLocation : locations) {
			//This is ok, as we know we only have InternalActionWeavingLocations in this Strategy
			ControlFlowWeavingLocation location = (ControlFlowWeavingLocation) weavingLocation; 
			AssemblyContext context = location.getAffectedContext();
			//TODO implement for composite component
			BasicComponent component = (BasicComponent) context.getEncapsulatedComponent__AssemblyContext();
			EList<ServiceEffectSpecification> seffs = component.getServiceEffectSpecifications__BasicComponent();
			
			
			for (ServiceEffectSpecification seff : seffs) {
				//get all internal Actions
				List<AbstractAction> affectedActions = new ArrayList<>();
				EList<AbstractAction> steps = ((ResourceDemandingBehaviour) seff).getSteps_Behaviour();
				for (AbstractAction abstractAction : steps) {
					if (abstractAction instanceof BranchAction) { //TODO was zählt alles zu control flows?
						//affectedActions.add(abstractAction);
						EList<AbstractBranchTransition> branches = ((BranchAction) abstractAction).getBranches_Branch();
						for (AbstractBranchTransition abstractBranchTransition : branches) {
							EList<AbstractAction> branchSteps = abstractBranchTransition.getBranchBehaviour_BranchTransition().getSteps_Behaviour();
							if (instruction.getAdvice().getAppears() == Appearance.BEFORE) {
								AbstractAction start = getStartAction(branchSteps);
								addFCCallTo(abstractBranchTransition.getBranchBehaviour_BranchTransition(), start, Appearance.AFTER, ((OperationProvidedRole) instruction.getFccWithProvidedRoles().getSecond().get(0)));
							} else if (instruction.getAdvice().getAppears() == Appearance.AFTER) {
								AbstractAction stop = getStopAction(branchSteps);
								addFCCallTo(abstractBranchTransition.getBranchBehaviour_BranchTransition(), stop, Appearance.BEFORE, ((OperationProvidedRole) instruction.getFccWithProvidedRoles().getSecond().get(0)));
							} else if (instruction.getAdvice().getAppears() == Appearance.AROUND) {
								AbstractAction start = getStartAction(branchSteps);
								AbstractAction stop = getStopAction(branchSteps);
								addFCCallTo(abstractBranchTransition.getBranchBehaviour_BranchTransition(), start, Appearance.AFTER, ((OperationProvidedRole) instruction.getFccWithProvidedRoles().getSecond().get(0)));
								addFCCallTo(abstractBranchTransition.getBranchBehaviour_BranchTransition(), stop, Appearance.BEFORE, ((OperationProvidedRole) instruction.getFccWithProvidedRoles().getSecond().get(0)));
							}
						}
					} else if (abstractAction instanceof AbstractLoopAction) {
						//TODO same for loop actions
						ResourceDemandingBehaviour loopSEFF = ((AbstractLoopAction) abstractAction).getBodyBehaviour_Loop();
						if (instruction.getAdvice().getAppears() == Appearance.BEFORE) {
							AbstractAction start = getStartAction(loopSEFF.getSteps_Behaviour());
							addFCCallTo(loopSEFF, start, Appearance.AFTER, ((OperationProvidedRole) instruction.getFccWithProvidedRoles().getSecond().get(0)));
						} else if (instruction.getAdvice().getAppears() == Appearance.AFTER) {
							AbstractAction stop = getStopAction(loopSEFF.getSteps_Behaviour());
							addFCCallTo(loopSEFF, stop, Appearance.BEFORE, ((OperationProvidedRole) instruction.getFccWithProvidedRoles().getSecond().get(0)));
						} else if (instruction.getAdvice().getAppears() == Appearance.AROUND) {
							AbstractAction start = getStartAction(loopSEFF.getSteps_Behaviour());
							AbstractAction stop = getStopAction(loopSEFF.getSteps_Behaviour());
							addFCCallTo(loopSEFF, start, Appearance.AFTER, ((OperationProvidedRole) instruction.getFccWithProvidedRoles().getSecond().get(0)));
							addFCCallTo(loopSEFF, stop, Appearance.BEFORE, ((OperationProvidedRole) instruction.getFccWithProvidedRoles().getSecond().get(0)));
						}
					}
				}
				
				//add fc call to the affected locations
				for (AbstractAction internalAction : affectedActions) {
					//addFCCallTo(seff, internalAction, instruction.getAdvice().getAppears(), ((OperationProvidedRole) instruction.getFccWithProvidedRoles().getSecond().get(0))); //use Solution 0 -> TODO decide which solution
				}
			}

			System.out.println("--------------- InternalActionServiceEffectSpecificationWeaving.weave --------------");
		}
	}

	/**
	 * @param branchSteps
	 * @return
	 */
	private AbstractAction getStopAction(EList<AbstractAction> steps) {
		return steps.stream().filter(action -> action instanceof StopAction).findFirst().get();
	}

	/**
	 * @param branchSteps
	 * @return
	 */
	private AbstractAction getStartAction(EList<AbstractAction> steps) {
		return steps.stream().filter(action -> action instanceof StartAction).findFirst().get();
	}
	
//	@Override
//	protected OperationRequiredRole getFcRequiredRole(AbstractAction internalAction, OperationInterface operationInterface) {
//		BasicComponent comp = (BasicComponent) internalAction.eContainer().eContainer().eContainer().eContainer().eContainer(); //go up 5 levels to get to containing component
//		
//		for (RequiredRole requiredRole : comp.getRequiredRoles_InterfaceRequiringEntity()) {
//			if (((OperationRequiredRole) requiredRole).getRequiredInterface__OperationRequiredRole().getId().equals(operationInterface.getId())) {
//				return (OperationRequiredRole) requiredRole;
//			}
//		}
//		return null;
//	}

}
