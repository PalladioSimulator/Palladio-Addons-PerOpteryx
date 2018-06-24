/**
 * 
 */
package edu.kit.ipd.are.dsexplore.featurecompletions.weaver.strategy.extension;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.palladiosimulator.pcm.core.composition.AssemblyConnector;
import org.palladiosimulator.pcm.core.composition.AssemblyContext;
import org.palladiosimulator.pcm.core.composition.Connector;
import org.palladiosimulator.pcm.core.entity.InterfaceProvidingEntity;
import org.palladiosimulator.pcm.repository.OperationProvidedRole;
import org.palladiosimulator.pcm.repository.OperationRequiredRole;
import org.palladiosimulator.pcm.repository.ProvidedRole;
import org.palladiosimulator.pcm.repository.RepositoryComponent;
import org.palladiosimulator.pcm.repository.RequiredRole;

import FeatureCompletionModel.CompletionComponent;
import de.uka.ipd.sdq.dsexplore.tools.primitives.Pair;
import edu.kit.ipd.are.dsexplore.featurecompletions.weaver.strategy.adapter.util.ConnectionInfo;
import edu.kit.ipd.are.dsexplore.featurecompletions.weaver.strategy.handler.FCCStructureHandler;

/**
 * @author Maximilian Eckert (maximilian.eckert@student.kit.edu, maxieckert@web.de)
 * 
 *
 */
public class InternalActionAssemblyWeaving extends AssemblyWeaving {

	/**
	 * @param parent
	 */
	public InternalActionAssemblyWeaving(IExtensionWeaving parent) {
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
	@Override
	public void addConnectorsToFCC(IWeavingInstruction instruction) {
		//create connector from fc calls to fcc component
		ProvidedRole providedRole = instruction.getFccWithProvidedRoles().second.get(0); //TODO welche providedRole nehmen???
		AssemblyContext providedAssemblyContext = this.parent.getPCMSystemManager().getAssemblyContextsInstantiating(((RepositoryComponent) providedRole.getProvidingEntity_ProvidedRole())).get(0); //TODO was bei mehreren AssemblyCOntexts de gleiche COmponent instantiieren??
		for (IWeavingLocation location : instruction.getWeavingLocations()) {
			AssemblyContext requiredAssemblyContext = ((InternalActionWeavingLocation) location).getAffectedContext();
			RequiredRole requiredRole = requiredAssemblyContext.getEncapsulatedComponent__AssemblyContext().getRequiredRoles_InterfaceRequiringEntity().stream().filter(role -> ((OperationRequiredRole) role).getRequiredInterface__OperationRequiredRole().getId().equals(((OperationProvidedRole) providedRole).getProvidedInterface__OperationProvidedRole().getId())).collect(Collectors.toList()).get(0); //TODO sollte eigentlich nur 1 required role geben??
			AssemblyConnector connector = this.parent.getPCMSystemManager().createAssemblyConnectorBy(Pair.of((OperationRequiredRole) requiredRole, requiredAssemblyContext),
					Pair.of((OperationProvidedRole) providedRole, providedAssemblyContext));
			if (!this.parent.getPCMSystemManager().existConnector(connector)) {
				this.parent.getPCMSystemManager().addConnectors(connector);
			}
		}
	}

}
