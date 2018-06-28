/**
 * 
 */
package edu.kit.ipd.are.dsexplore.featurecompletions.weaver.strategy.extension;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.palladiosimulator.pcm.core.composition.AssemblyConnector;
import org.palladiosimulator.pcm.core.composition.AssemblyContext;
import org.palladiosimulator.pcm.core.composition.Connector;
import org.palladiosimulator.pcm.repository.OperationProvidedRole;
import org.palladiosimulator.pcm.repository.OperationRequiredRole;
import org.palladiosimulator.pcm.repository.ProvidedRole;
import org.palladiosimulator.pcm.repository.RepositoryComponent;
import org.palladiosimulator.pcm.repository.RequiredRole;
import org.palladiosimulator.pcm.repository.Role;

import FeatureCompletionModel.CompletionComponent;
import de.uka.ipd.sdq.dsexplore.tools.primitives.Pair;
import edu.kit.ipd.are.dsexplore.featurecompletions.weaver.ErrorMessage;
import edu.kit.ipd.are.dsexplore.featurecompletions.weaver.FCCUtil;
import edu.kit.ipd.are.dsexplore.featurecompletions.weaver.port.FCCWeaverException;
import edu.kit.ipd.are.dsexplore.featurecompletions.weaver.strategy.handler.RoleHandler;
import edu.kit.ipd.are.dsexplore.featurecompletions.weaver.strategy.handler.RoleHandlerFactory;

/**
 * @author Maximilian Eckert (maximilian.eckert@student.kit.edu, maxieckert@web.de)
 * 
 *
 */
public abstract class AssemblyWeaving {
	protected final IExtensionWeaving parent;

	public AssemblyWeaving(IExtensionWeaving parent) {
		this.parent = parent;
	}
	
	public void weave(IWeavingInstruction instruction) {
		ProvidedRole providedRole = instruction.getFccWithProvidedRoles().second.get(0); //TODO welche providedRole nehmen???
		RepositoryComponent initialComponent = this.parent.getMergedRepoManager().getComponentBy(component -> component.getProvidedRoles_InterfaceProvidingEntity().stream().anyMatch(role -> role.getId().equals(providedRole.getId()))).get();
		CompletionComponent fcc = instruction.getFccWithProvidedRoles().first;
		List<RepositoryComponent> components = this.parent.getMergedRepoManager().getAffectedComponentsByProvidedRole(fcc, providedRole);
		
		for (IWeavingLocation location : instruction.getWeavingLocations()) {
			List<AssemblyContext> createdAssemblyContexts = new ArrayList<>();
			for (RepositoryComponent repositoryComponent : components) {	//TODO decide which solution to choose, matching selected signture in weaved SEFF!!!!!
				//TODO decide if solution components are added multiple times
				if (instruction.getInclusionMechanism().isMultiple()) {
					AssemblyContext newAssemblyContext = this.parent.getPCMSystemManager().createAssemblyContextOf(repositoryComponent);
					createdAssemblyContexts.add(newAssemblyContext);
				}
				else if (this.parent.getPCMSystemManager().getAssemblyContextsInstantiating(repositoryComponent).isEmpty()) {
					AssemblyContext newAssemblyContext = this.parent.getPCMSystemManager().createAssemblyContextOf(repositoryComponent);	
					createdAssemblyContexts.add(newAssemblyContext);
				}
			}
			
			List<Connector> createdConnectors = new ArrayList<>();
			for (AssemblyContext assemblyContext : createdAssemblyContexts) { //TODO decide which solution to choose, matching selected signture in weaved SEFF!!!!!
				//create connectors
				for (RequiredRole requiredRole : assemblyContext.getEncapsulatedComponent__AssemblyContext().getRequiredRoles_InterfaceRequiringEntity()) {
					ProvidedRole compProvidedRole = (ProvidedRole) this.getComplimentaryRoleOf(requiredRole, this.parent.getMergedRepoManager().getAllProvidedRoles());
					AssemblyContext providedAssemblyContext = getAssemblyContextProviding(compProvidedRole, createdAssemblyContexts);

					AssemblyConnector connector = this.parent.getPCMSystemManager().createAssemblyConnectorBy(Pair.of((OperationRequiredRole) requiredRole, assemblyContext),
							Pair.of((OperationProvidedRole) compProvidedRole, providedAssemblyContext));
					if (instruction.getInclusionMechanism().isMultiple()) {
						//TODO only add if solution components are added multiple times
						createdConnectors.add(connector);
					} else if (!this.parent.getPCMSystemManager().existConnector(connector)) {
						//only add if not already existing 
						createdConnectors.add(connector);
					}
				}
			}
			
			//
			AssemblyContext providedAssemblyContext = null;
			if (createdAssemblyContexts.isEmpty()) {
				providedAssemblyContext = getAssemblyContextProviding(providedRole, this.parent.getPCMSystemManager().getAssemblyContextsBy(context -> true));
			} else {
				providedAssemblyContext = getAssemblyContextProviding(providedRole, createdAssemblyContexts);
			}
			AssemblyContext requiredAssemblyContext = location.getAffectedContext();
			RequiredRole requiredRole = requiredAssemblyContext.getEncapsulatedComponent__AssemblyContext().getRequiredRoles_InterfaceRequiringEntity().stream().filter(role -> ((OperationRequiredRole) role).getRequiredInterface__OperationRequiredRole().getId().equals(((OperationProvidedRole) providedRole).getProvidedInterface__OperationProvidedRole().getId())).collect(Collectors.toList()).get(0); //TODO sollte eigentlich nur 1 required role geben??
			AssemblyConnector connector = this.parent.getPCMSystemManager().createAssemblyConnectorBy(Pair.of((OperationRequiredRole) requiredRole, requiredAssemblyContext),
					Pair.of((OperationProvidedRole) providedRole, providedAssemblyContext));
			if (!this.parent.getPCMSystemManager().existConnector(connector)) {
				this.parent.getPCMSystemManager().addAssemblyContexts(createdAssemblyContexts);;
				this.parent.getPCMSystemManager().addConnectors(createdConnectors);
				this.parent.getPCMSystemManager().addConnectors(connector);
			}
		}
		
	}


	protected <T extends Role> Role getComplimentaryRoleOf(Role role, List<T> complimentaryRoleSpace) throws FCCWeaverException {
		return this.getRoleHandlerBy(role).getComplimentaryRoleOf(role, complimentaryRoleSpace)
				.orElseThrow(() -> new FCCWeaverException(ErrorMessage.missingComplimentaryRole((RepositoryComponent) role.eContainer(), role)));
	}

	private RoleHandler getRoleHandlerBy(Role role) throws FCCWeaverException {
		return RoleHandlerFactory.getBy(role, this.parent.getMergedRepoManager()).orElseThrow(() -> new FCCWeaverException(ErrorMessage.unsupportedRole()));
	}

	protected Predicate<AssemblyContext> getAssemblyContextInstantiating(RepositoryComponent component) {
		return assemblyContext -> FCCUtil.areEqual(assemblyContext.getEncapsulatedComponent__AssemblyContext(), component);
	}
	
	/**
	 * @param providedRole
	 * @param createdAssemblyContexts
	 * @return
	 */
	private AssemblyContext getAssemblyContextProviding(ProvidedRole providedRole, List<AssemblyContext> assemblyContexts) {
		for (AssemblyContext ac : assemblyContexts) {
			if (ac.getEncapsulatedComponent__AssemblyContext().getProvidedRoles_InterfaceProvidingEntity().stream().anyMatch(role -> role.getId().equals(providedRole.getId()))) {
				return ac;
			}
		}
		return null;
	}
}
