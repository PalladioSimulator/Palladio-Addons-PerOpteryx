/**
 * 
 */
package edu.kit.ipd.are.dsexplore.featurecompletions.weaver.strategy.extension;

import java.util.ArrayList;
import java.util.List;
import org.eclipse.emf.common.util.EList;
import org.palladiosimulator.pcm.core.composition.AssemblyContext;
import org.palladiosimulator.pcm.repository.BasicComponent;
import org.palladiosimulator.pcm.repository.OperationProvidedRole;
import org.palladiosimulator.pcm.seff.AbstractAction;
import org.palladiosimulator.pcm.seff.AbstractBranchTransition;
import org.palladiosimulator.pcm.seff.AbstractLoopAction;
import org.palladiosimulator.pcm.seff.BranchAction;
import org.palladiosimulator.pcm.seff.ForkAction;
import org.palladiosimulator.pcm.seff.ForkedBehaviour;
import org.palladiosimulator.pcm.seff.ResourceDemandingBehaviour;
import org.palladiosimulator.pcm.seff.ServiceEffectSpecification;
import org.palladiosimulator.pcm.seff.StartAction;
import org.palladiosimulator.pcm.seff.StopAction;

import edu.kit.ipd.are.dsexplore.featurecompletions.weaver.port.FCCModule;
import featureSolution.Appearance;

/**
 * This class handles weaving of the PCM repository model specifically for the control flow placement strategy. 
 * 
 * @author Maximilian Eckert (maximilian.eckert@student.kit.edu, maxieckert@web.de)
 * 
 */
public class ControlFlowServiceEffectSpecificationWeaving extends ServiceEffectSpecificationWeaving {

	/**
	 * @param parent
	 */
	public ControlFlowServiceEffectSpecificationWeaving(IExtensionWeaving parent) {
		super(parent);
	}

	/**
	 * Applies the weaving operation on the SEFF for the control flow placement strategy.
	 * For this, the specified component will be searched for all control flows and fc calls will be added within them according to the specified appearance.  
	 * 
	 * @param instruction the weaving instruction to apply.
	 */
	public void weave(IWeavingInstruction instruction) { //TODO gleiche Code teilen in Oberklasse ziehen?
		FCCModule.logger.debug("Control Flow SEFF Extension Weaving");
		
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
					if (abstractAction instanceof BranchAction) { 
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
						//same for loop actions
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
					} else if (abstractAction instanceof ForkAction) {
						EList<ForkedBehaviour> forkedSEFFs = ((ForkAction) abstractAction).getAsynchronousForkedBehaviours_ForkAction();
						for (ForkedBehaviour forkedSEFF : forkedSEFFs) {
							if (instruction.getAdvice().getAppears() == Appearance.BEFORE) {
								AbstractAction start = getStartAction(forkedSEFF.getSteps_Behaviour());
								addFCCallTo(forkedSEFF, start, Appearance.AFTER, ((OperationProvidedRole) instruction.getFccWithProvidedRoles().getSecond().get(0)));
							} else if (instruction.getAdvice().getAppears() == Appearance.AFTER) {
								AbstractAction stop = getStopAction(forkedSEFF.getSteps_Behaviour());
								addFCCallTo(forkedSEFF, stop, Appearance.BEFORE, ((OperationProvidedRole) instruction.getFccWithProvidedRoles().getSecond().get(0)));
							} else if (instruction.getAdvice().getAppears() == Appearance.AROUND) {
								AbstractAction start = getStartAction(forkedSEFF.getSteps_Behaviour());
								AbstractAction stop = getStopAction(forkedSEFF.getSteps_Behaviour());
								addFCCallTo(forkedSEFF, start, Appearance.AFTER, ((OperationProvidedRole) instruction.getFccWithProvidedRoles().getSecond().get(0)));
								addFCCallTo(forkedSEFF, stop, Appearance.BEFORE, ((OperationProvidedRole) instruction.getFccWithProvidedRoles().getSecond().get(0)));
							}
						}
					}
				}
			}
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

}
