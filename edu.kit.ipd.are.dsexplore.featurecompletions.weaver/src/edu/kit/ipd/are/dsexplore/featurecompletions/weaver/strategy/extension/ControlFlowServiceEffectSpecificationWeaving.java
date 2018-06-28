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
import org.palladiosimulator.pcm.repository.OperationProvidedRole;
import org.palladiosimulator.pcm.seff.AbstractAction;
import org.palladiosimulator.pcm.seff.AbstractLoopAction;
import org.palladiosimulator.pcm.seff.BranchAction;
import org.palladiosimulator.pcm.seff.InternalAction;
import org.palladiosimulator.pcm.seff.ResourceDemandingBehaviour;
import org.palladiosimulator.pcm.seff.ServiceEffectSpecification;

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
					if (abstractAction instanceof BranchAction || abstractAction instanceof AbstractLoopAction) { //TODO was zählt alles zu control flows?
						affectedActions.add(abstractAction);
					}
				}
				
				//add fc call to the affected locations
				for (AbstractAction internalAction : affectedActions) {
					addFCCallTo(seff, internalAction, instruction.getAdvice().getAppears(), ((OperationProvidedRole) instruction.getFccWithProvidedRoles().getSecond().get(0)));
				}
			}

			System.out.println("--------------- InternalActionServiceEffectSpecificationWeaving.weave --------------");
		}
	}

}
