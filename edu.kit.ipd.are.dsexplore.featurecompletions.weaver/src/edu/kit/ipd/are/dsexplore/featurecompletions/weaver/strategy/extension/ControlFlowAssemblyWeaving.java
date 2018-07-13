/**
 * 
 */
package edu.kit.ipd.are.dsexplore.featurecompletions.weaver.strategy.extension;

import java.util.stream.Collectors;

import org.palladiosimulator.pcm.core.composition.AssemblyConnector;
import org.palladiosimulator.pcm.core.composition.AssemblyContext;
import org.palladiosimulator.pcm.repository.OperationProvidedRole;
import org.palladiosimulator.pcm.repository.OperationRequiredRole;
import org.palladiosimulator.pcm.repository.ProvidedRole;
import org.palladiosimulator.pcm.repository.RepositoryComponent;
import org.palladiosimulator.pcm.repository.RequiredRole;

import de.uka.ipd.sdq.dsexplore.tools.primitives.Pair;

/**
 * @author Maximilian Eckert (maximilian.eckert@student.kit.edu, maxieckert@web.de)
 * 
 *
 */
public class ControlFlowAssemblyWeaving extends AssemblyWeaving {

	/**
	 * @param parent
	 */
	public ControlFlowAssemblyWeaving(IExtensionWeaving parent) {
		super(parent);
	}

	/* (non-Javadoc)
	 * @see edu.kit.ipd.are.dsexplore.featurecompletions.weaver.strategy.extension.AssemblyWeaving#weave(edu.kit.ipd.are.dsexplore.featurecompletions.weaver.strategy.extension.IWeavingInstruction)
	 */
	@Override
	public void weave(IWeavingInstruction instruction) {
		super.weave(instruction);
	}

	/* (non-Javadoc)
	 * @see edu.kit.ipd.are.dsexplore.featurecompletions.weaver.strategy.extension.AssemblyWeaving#addConnectorsToFCC(edu.kit.ipd.are.dsexplore.featurecompletions.weaver.strategy.extension.IWeavingInstruction)
	 */
//	@Override
//	public void addConnectorsToFCC(IWeavingInstruction instruction) {
//		//create connector from fc calls to fcc component
//		ProvidedRole providedRole = instruction.getFccWithProvidedRoles().second.get(0); //TODO welche providedRole nehmen???
//		AssemblyContext providedAssemblyContext = this.parent.getPCMSystemManager().getAssemblyContextsInstantiating(((RepositoryComponent) providedRole.getProvidingEntity_ProvidedRole())).get(0); //TODO was bei mehreren AssemblyCOntexts de gleiche COmponent instantiieren??
//		for (IWeavingLocation location : instruction.getWeavingLocations()) {
//			AssemblyContext requiredAssemblyContext = location.getAffectedContext();
//			RequiredRole requiredRole = requiredAssemblyContext.getEncapsulatedComponent__AssemblyContext().getRequiredRoles_InterfaceRequiringEntity().stream().filter(role -> ((OperationRequiredRole) role).getRequiredInterface__OperationRequiredRole().getId().equals(((OperationProvidedRole) providedRole).getProvidedInterface__OperationProvidedRole().getId())).collect(Collectors.toList()).get(0); //TODO sollte eigentlich nur 1 required role geben??
//			AssemblyConnector connector = this.parent.getPCMSystemManager().createAssemblyConnectorBy(Pair.of((OperationRequiredRole) requiredRole, requiredAssemblyContext),
//					Pair.of((OperationProvidedRole) providedRole, providedAssemblyContext));
//			if (!this.parent.getPCMSystemManager().existConnector(connector)) {
//				this.parent.getPCMSystemManager().addConnectors(connector);
//			}
//		}
//	}

}
