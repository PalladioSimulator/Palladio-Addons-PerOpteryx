/**
 * 
 */
package edu.kit.ipd.are.dsexplore.featurecompletions.weaver.strategy.extension;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.palladiosimulator.pcm.core.composition.AssemblyContext;
import org.palladiosimulator.pcm.repository.BasicComponent;
import org.palladiosimulator.pcm.repository.OperationProvidedRole;
import org.palladiosimulator.pcm.repository.OperationRequiredRole;
import org.palladiosimulator.pcm.repository.RepositoryComponent;
import org.palladiosimulator.pcm.repository.RequiredRole;
import org.palladiosimulator.pcm.repository.Signature;
import org.palladiosimulator.pcm.seff.AbstractAction;
import org.palladiosimulator.pcm.seff.ExternalCallAction;
import org.palladiosimulator.pcm.seff.InternalAction;
import org.palladiosimulator.pcm.seff.ResourceDemandingBehaviour;
import org.palladiosimulator.pcm.seff.ServiceEffectSpecification;

/**
 * @author Maximilian Eckert (maximilian.eckert@student.kit.edu, maxieckert@web.de)
 * 
 *
 */
public class ExternalCallServiceEffectSpecificationWeaving extends ServiceEffectSpecificationWeaving {

	/**
	 * @param parent
	 */
	public ExternalCallServiceEffectSpecificationWeaving(IExtensionWeaving parent) {
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
			ExternalCallWeavingLocation location = (ExternalCallWeavingLocation) weavingLocation; 
			Signature sig = location.getAffectedSignature();
			//TODO implement for ExternalCallWeavingLocation component
			List<RepositoryComponent> affectedComponents = new ArrayList<>();
			List<AssemblyContext> allContexts = parent.getPCMSystemManager().getAssemblyContextsBy(ac -> true);
			for (AssemblyContext assemblyContext : allContexts) {
				List<RequiredRole> reqRoles = assemblyContext.getEncapsulatedComponent__AssemblyContext().getRequiredRoles_InterfaceRequiringEntity();
				List<Signature> sigs = reqRoles.stream().flatMap(role -> ((OperationRequiredRole) role).getRequiredInterface__OperationRequiredRole().getSignatures__OperationInterface().stream()).collect(Collectors.toList());
				if (sigs.stream().anyMatch(s -> s.getId().equals(sig.getId()))) {
					affectedComponents.add(assemblyContext.getEncapsulatedComponent__AssemblyContext());
				}
			}
			
			List<ServiceEffectSpecification> seffs = affectedComponents.stream().flatMap(component -> ((BasicComponent) component).getServiceEffectSpecifications__BasicComponent().stream()).collect(Collectors.toList());
			
			for (ServiceEffectSpecification seff : seffs) {
				//get all internal Actions
				List<AbstractAction> affectedActions = new ArrayList<>();
				EList<AbstractAction> steps = ((ResourceDemandingBehaviour) seff).getSteps_Behaviour();
				for (AbstractAction abstractAction : steps) {
					if (abstractAction instanceof ExternalCallAction && ((ExternalCallAction) abstractAction).getCalledService_ExternalService().getId().equals(sig.getId())) {
						affectedActions.add(abstractAction);
					}
				}
				
				//add fc call to the affected locations
				for (AbstractAction internalAction : affectedActions) {
					addFCCallTo(seff, internalAction, instruction.getAdvice().getAppears(), ((OperationProvidedRole) instruction.getFccWithProvidedRoles().getSecond().get(0)));
					//TODO print SEFF
//					Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
//					Map<String, Object> m = reg.getExtensionToFactoryMap();
//					m.put("xmi", new XMIResourceFactoryImpl());
//					Resource resource = (Resource) new ResourceSetImpl().createResource(URI.createFileURI("C:/Users/Maxi/Documents/seff.xmi"));
//					resource.getContents().add(seff);
//					try {
//						resource.save(Collections.EMPTY_MAP);
//					} catch (IOException e) {
//						// TODO Auto-generated catch block
//						e.printStackTrace();
//					}
					//TODO print SEFF
				}
			}
			
			System.out.println("--------------- InternalActionServiceEffectSpecificationWeaving.weave --------------");
		}
	}

}
