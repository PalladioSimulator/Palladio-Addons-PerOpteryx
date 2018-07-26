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
import org.palladiosimulator.pcm.seff.InternalAction;
import org.palladiosimulator.pcm.seff.ResourceDemandingBehaviour;
import org.palladiosimulator.pcm.seff.ServiceEffectSpecification;

import edu.kit.ipd.are.dsexplore.featurecompletions.weaver.port.FCCModule;

/**
 * This class handles weaving of the PCM repository model specifically for the internal action placement strategy. 
 * 
 * @author Maximilian Eckert (maximilian.eckert@student.kit.edu, maxieckert@web.de)
 * 
 */
public class InternalActionServiceEffectSpecificationWeaving extends ServiceEffectSpecificationWeaving {

	
	
	/**
	 * @param parent
	 */
	public InternalActionServiceEffectSpecificationWeaving(IExtensionWeaving parent) {
		super(parent);
	}

	/**
	 * Applies the weaving operation on the SEFF for the internal action placement strategy.
	 * For this, the specified component will be searched for all internal actions and fc calls will be added according to the specified appearance.  
	 * 
	 * @param instruction the weaving instruction to apply.
	 */
	public void weave(IWeavingInstruction instruction) { //TODO gleiche Code teilen in Oberklasse ziehen?
		FCCModule.logger.debug("Internal Action SEFF Extension Weaving");
		
		List<? extends IWeavingLocation> locations = instruction.getWeavingLocations();
		for (IWeavingLocation weavingLocation : locations) {
			//This is ok, as we know we only have InternalActionWeavingLocations in this Strategy
			InternalActionWeavingLocation location = (InternalActionWeavingLocation) weavingLocation; 
			AssemblyContext context = location.getAffectedContext();
			//TODO implement for composite component
			BasicComponent component = (BasicComponent) context.getEncapsulatedComponent__AssemblyContext();
			EList<ServiceEffectSpecification> seffs = component.getServiceEffectSpecifications__BasicComponent();
			
			
			for (ServiceEffectSpecification seff : seffs) {
				//get all internal Actions
				List<AbstractAction> affectedActions = new ArrayList<>();
				EList<AbstractAction> steps = ((ResourceDemandingBehaviour) seff).getSteps_Behaviour();
				for (AbstractAction abstractAction : steps) {
					if (abstractAction instanceof InternalAction) {
						affectedActions.add(abstractAction);
					}
				}
				
				//add fc call to the affected locations
				for (AbstractAction internalAction : affectedActions) {
					addFCCallTo((ResourceDemandingBehaviour) seff, internalAction, instruction.getAdvice().getAppears(), ((OperationProvidedRole) instruction.getFccWithProvidedRoles().getSecond().get(0))); 
				}
			}

		}
	}
	
	

}
