/**
 *
 */
package edu.kit.ipd.are.dsexplore.featurecompletions.weaver.strategy.behaviour;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.common.util.EList;
import org.palladiosimulator.pcm.core.composition.AssemblyContext;
import org.palladiosimulator.pcm.repository.BasicComponent;
import org.palladiosimulator.pcm.repository.Signature;
import org.palladiosimulator.pcm.seff.AbstractAction;
import org.palladiosimulator.pcm.seff.ExternalCallAction;
import org.palladiosimulator.pcm.seff.ResourceDemandingBehaviour;
import org.palladiosimulator.pcm.seff.ServiceEffectSpecification;

import edu.kit.ipd.are.dsexplore.featurecompletions.weaver.port.FCCModule;

/**
 * This class handles weaving of the PCM repository model specifically for the
 * external call placement strategy.
 *
 * @author Maximilian Eckert (maximilian.eckert@student.kit.edu,
 *         maxieckert@web.de)
 *
 */
public class ExternalCallServiceEffectSpecificationWeaving extends ServiceEffectSpecificationWeaving {

	public ExternalCallServiceEffectSpecificationWeaving(IBehaviourWeaving parent) {
		super(parent);
	}

	/**
	 * Applies the weaving operation on the SEFF for the externa call placement
	 * strategy. For this, all components will be searched for matching
	 * signatures/external calls and fc calls will be added according to the
	 * specified appearance.
	 *
	 * @param instruction
	 *            the weaving instruction to apply.
	 */
	@Override
	public void weave(IWeavingInstruction instruction) {
		FCCModule.LOGGER.debug("External Call SEFF Behaviour Weaving");

		List<? extends IWeavingLocation> locations = instruction.getWeavingLocations();
		for (IWeavingLocation weavingLocation : locations) {
			// This is ok, as we know we only have
			// InternalActionWeavingLocations in this Strategy
			ExternalCallWeavingLocation location = (ExternalCallWeavingLocation) weavingLocation;
			Signature sig = location.getAffectedSignature();

			AssemblyContext assemblyContext = weavingLocation.getAffectedContext();
			// Assumption: Behaviour inclusion approach is only defined on
			// non-composite components!
			BasicComponent component = (BasicComponent) assemblyContext.getEncapsulatedComponent__AssemblyContext();
			List<ServiceEffectSpecification> seffs = component.getServiceEffectSpecifications__BasicComponent();

			for (ServiceEffectSpecification seff : seffs) {
				List<AbstractAction> affectedActions = this.getAllExternalActionsCalling(sig, seff);

				// add fc call to the affected locations
				for (AbstractAction internalAction : affectedActions) {
					this.addFCCallTo((ResourceDemandingBehaviour) seff, internalAction, instruction.getAdvice().getAppears(), instruction.getFccWithProvidedRole().getSecond());
				}
			}

		}
	}

	/**
	 * Determines all external actions in the given SEFF that call the service
	 * with given signature.
	 *
	 * @param sig
	 *            the given signature.
	 * @param seff
	 *            the given SEFF.
	 * @return all external actions.
	 */
	private List<AbstractAction> getAllExternalActionsCalling(Signature sig, ServiceEffectSpecification seff) {
		// get all external Actions
		List<AbstractAction> affectedActions = new ArrayList<>();
		EList<AbstractAction> steps = ((ResourceDemandingBehaviour) seff).getSteps_Behaviour();
		for (AbstractAction abstractAction : steps) {
			if (abstractAction instanceof ExternalCallAction && ((ExternalCallAction) abstractAction).getCalledService_ExternalService().getId().equals(sig.getId())) {
				affectedActions.add(abstractAction);
			}
		}
		return affectedActions;
	}

	/*
	 * Determines all components that have external calls to the given
	 * signature.
	 *
	 * @param sig the given signature.
	 * 
	 * @return all components that have external calls to the given signature.
	 */
	/*
	 * private List<RepositoryComponent> determineAffectedComponents(Signature
	 * sig) { List<RepositoryComponent> affectedComponents = new ArrayList<>();
	 * List<AssemblyContext> allContexts =
	 * this.parent.getPCMSystemManager().getAssemblyContextsBy(ac -> true); for
	 * (AssemblyContext assemblyContext : allContexts) { List<RequiredRole>
	 * reqRoles = assemblyContext.getEncapsulatedComponent__AssemblyContext().
	 * getRequiredRoles_InterfaceRequiringEntity(); List<Signature> sigs =
	 * reqRoles.stream().flatMap(role -> ((OperationRequiredRole)
	 * role).getRequiredInterface__OperationRequiredRole().
	 * getSignatures__OperationInterface().stream())
	 * .collect(Collectors.toList()); if (sigs.stream().anyMatch(s ->
	 * s.getId().equals(sig.getId()))) { affectedComponents.add(assemblyContext.
	 * getEncapsulatedComponent__AssemblyContext()); } } return
	 * affectedComponents; }
	 */
}
