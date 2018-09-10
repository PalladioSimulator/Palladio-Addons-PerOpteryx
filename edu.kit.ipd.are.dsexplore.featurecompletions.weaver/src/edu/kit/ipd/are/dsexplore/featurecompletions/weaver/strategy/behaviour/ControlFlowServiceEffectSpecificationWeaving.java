/**
 * 
 */
package edu.kit.ipd.are.dsexplore.featurecompletions.weaver.strategy.behaviour;

import java.util.List;
import java.util.stream.Collectors;

import org.palladiosimulator.pcm.core.composition.AssemblyContext;
import org.palladiosimulator.pcm.repository.BasicComponent;
import org.palladiosimulator.pcm.seff.AbstractAction;
import org.palladiosimulator.pcm.seff.AbstractBranchTransition;
import org.palladiosimulator.pcm.seff.AbstractLoopAction;
import org.palladiosimulator.pcm.seff.BranchAction;
import org.palladiosimulator.pcm.seff.ForkAction;
import org.palladiosimulator.pcm.seff.ForkedBehaviour;
import org.palladiosimulator.pcm.seff.ResourceDemandingBehaviour;
import org.palladiosimulator.pcm.seff.ServiceEffectSpecification;

import edu.kit.ipd.are.dsexplore.featurecompletions.weaver.port.FCCModule;

/**
 * This class handles weaving of the PCM repository model specifically for the control flow placement strategy. 
 * 
 * @author Maximilian Eckert (maximilian.eckert@student.kit.edu, maxieckert@web.de)
 * 
 */
public class ControlFlowServiceEffectSpecificationWeaving extends ServiceEffectSpecificationWeaving {

	public ControlFlowServiceEffectSpecificationWeaving(IBehaviourWeaving parent) {
		super(parent);
	}

	/**
	 * Applies the weaving operation on the SEFF for the control flow placement strategy.
	 * For this, the specified component will be searched for all control flows and fc calls will be added within them according to the specified appearance.  
	 * 
	 * @param instruction the weaving instruction to apply.
	 */
	public void weave(IWeavingInstruction instruction) {
		FCCModule.logger.debug("Control Flow SEFF Behaviour Weaving");
		
		List<? extends IWeavingLocation> locations = instruction.getWeavingLocations();
		for (IWeavingLocation weavingLocation : locations) {
			//This is ok, as we know we only have InternalActionWeavingLocations in this Strategy
			ControlFlowWeavingLocation location = (ControlFlowWeavingLocation) weavingLocation; 
			AssemblyContext context = location.getAffectedContext();
			//Assumption: Behaviour inclusion approach is only defined on non-composite components!
			BasicComponent component = (BasicComponent) context.getEncapsulatedComponent__AssemblyContext();
			List<ServiceEffectSpecification> seffs = component.getServiceEffectSpecifications__BasicComponent();
			
			for (ServiceEffectSpecification seff : seffs) {
				//get all internal Actions
				List<AbstractAction> steps = ((ResourceDemandingBehaviour) seff).getSteps_Behaviour();
				for (AbstractAction abstractAction : steps) {
					if (abstractAction instanceof BranchAction) { 
						//handle branch actions
						handleBranchAction(instruction, abstractAction);
					} else if (abstractAction instanceof AbstractLoopAction) {
						//handle loop actions
						handleLoopActions(instruction, abstractAction);
					} else if (abstractAction instanceof ForkAction) {
						//handle fork actions
						handleForkAction(instruction, abstractAction);
					}
				}
			}
		}
	}

	/**
	 * Handles weaving of fork SEFFs.
	 * 
	 * @param instruction
	 * @param abstractAction
	 */
	private void handleForkAction(IWeavingInstruction instruction, AbstractAction abstractAction) {
		List<ForkedBehaviour> forkedSEFFs = ((ForkAction) abstractAction).getAsynchronousForkedBehaviours_ForkAction();
		for (ForkedBehaviour forkedSEFF : forkedSEFFs) {
			addFCCallToSEFF(instruction, forkedSEFF);
		}
	}

	/**
	 * Handles weaving of loop SEFFs.
	 * 
	 * @param instruction
	 * @param abstractAction
	 */
	private void handleLoopActions(IWeavingInstruction instruction, AbstractAction abstractAction) {
		ResourceDemandingBehaviour loopSEFF = ((AbstractLoopAction) abstractAction).getBodyBehaviour_Loop();
		addFCCallToSEFF(instruction, loopSEFF);
	}

	/**
	 * Handles weaving of branch SEFFs.
	 * 
	 * @param instruction
	 * @param abstractAction
	 */
	private void handleBranchAction(IWeavingInstruction instruction, AbstractAction abstractAction) {
		List<AbstractBranchTransition> branches = ((BranchAction) abstractAction).getBranches_Branch();
		for (AbstractBranchTransition abstractBranchTransition : branches) {
			ResourceDemandingBehaviour branchSEFF = abstractBranchTransition.getBranchBehaviour_BranchTransition();
			addFCCallToSEFF(instruction, branchSEFF);
		}
	}
}
