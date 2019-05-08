/**
 * 
 */
package edu.kit.ipd.are.dsexplore.featurecompletions.weaver.strategy.behaviour;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import org.palladiosimulator.pcm.core.composition.AssemblyConnector;
import org.palladiosimulator.pcm.core.composition.AssemblyContext;
import org.palladiosimulator.pcm.core.composition.Connector;
import org.palladiosimulator.pcm.repository.OperationProvidedRole;
import org.palladiosimulator.pcm.repository.OperationRequiredRole;
import org.palladiosimulator.pcm.repository.OperationSignature;
import org.palladiosimulator.pcm.repository.ProvidedRole;
import org.palladiosimulator.pcm.repository.RepositoryComponent;
import org.palladiosimulator.pcm.repository.RequiredRole;
import org.palladiosimulator.pcm.repository.Role;

import FeatureCompletionModel.CompletionComponent;
import de.uka.ipd.sdq.dsexplore.tools.primitives.Pair;
import edu.kit.ipd.are.dsexplore.featurecompletions.weaver.ErrorMessage;
import edu.kit.ipd.are.dsexplore.featurecompletions.weaver.FCCUtil;
import edu.kit.ipd.are.dsexplore.featurecompletions.weaver.port.FCCModule;
import edu.kit.ipd.are.dsexplore.featurecompletions.weaver.port.FCCWeaverException;
import edu.kit.ipd.are.dsexplore.featurecompletions.weaver.strategy.handler.FCCStructureHandler;
import edu.kit.ipd.are.dsexplore.featurecompletions.weaver.strategy.handler.RoleHandler;
import edu.kit.ipd.are.dsexplore.featurecompletions.weaver.strategy.handler.RoleHandlerFactory;

/**
 * This class handles weaving of the PCM assembly/system model. 
 * 
 * @author Maximilian Eckert (maximilian.eckert@student.kit.edu, maxieckert@web.de)
 * 
 */
public class AssemblyWeaving {
	
	protected final IBehaviourWeaving parent;
	
	private FCCStructureHandler fccHandler;

	public AssemblyWeaving(IBehaviourWeaving parent) {
		this.parent = parent;
	}
	
	/**
	 * Applies the weaving operation on the assembly model. 
	 * Firstly, all required fc components are determined, according to the fc meta-architecture.
	 * Secondly, realizing components for each fcc are chosen, according to selected solution/CV.
	 * Thirdly, in case of any required complementa, additional components are added.
	 * Fourth, the components are assembled into the system and connected by assembly connectors.
	 * 
	 * @param instruction the weaving instruction to apply.
	 */
	public void weave(IWeavingInstruction instruction) {
		FCCModule.LOGGER.debug("Assembly Behaviour Weaving");
		
		CompletionComponent perimeterProvidingFCC = instruction.getFccWithProvidedRole().first;
		List<OperationSignature> providedSigs = instruction.getFccWithProvidedRole().getSecond(); 
		fccHandler = new FCCStructureHandler(perimeterProvidingFCC, this.parent.getMergedRepoManager());
		
		//1. determine all needed other feature completion components
		List<CompletionComponent> allFCCs = determineAllFCCs(perimeterProvidingFCC);
		
		//2. choose realizing component for each fcc according to selected solution/CV
		List<RepositoryComponent> realizingComponents = this.parent.getMergedRepoManager().getRealizingComponentsByFCCList(allFCCs, providedSigs, parent.getSelectedCVs());
		
		//3. in case of any required complementa -> add additional components
		realizingComponents.addAll(determineAdditionalComplementaComponents(realizingComponents));
		
		//4. weave in components
		for (IWeavingLocation location : instruction.getWeavingLocations()) {
			//create assembly context for realizing components
			List<AssemblyContext> createdAssemblyContexts = createAssemblyContexts(instruction, realizingComponents);
			//create assembly connectors for realizing components
			List<Connector> createdConnectors = createAssemblyConnectors(instruction, createdAssemblyContexts);
			
			//create assembly connector to FC
			List<Connector> connectors = createAssemblyConnectorToFC(providedSigs, location, createdAssemblyContexts, perimeterProvidingFCC);
			
			//add to system if not already added by another instruction
			if (!this.parent.getPCMSystemManager().existConnectors(connectors)) {
				this.parent.getPCMSystemManager().addAssemblyContexts(createdAssemblyContexts);;
				this.parent.getPCMSystemManager().addConnectors(createdConnectors);
				this.parent.getPCMSystemManager().addConnectors(connectors.toArray(new AssemblyConnector[connectors.size()]));
			}
		}
	}

	/**
	 * Creates the assembly connector from the modified assembly context to the assembly contexts belonging to the FC.
	 * 
	 * @param providedSigs the provided role of the modified assembly context.
	 * @param location the location containing the modified assembly context.
	 * @param createdAssemblyContexts the created assembly contexts belonging to the FC.
	 * @return the assembly connector from the modified assembly context to the assembly contexts belonging to the FC.
	 */
	private List<Connector> createAssemblyConnectorToFC(List<OperationSignature> providedSigs, IWeavingLocation location, List<AssemblyContext> createdAssemblyContexts, CompletionComponent fcc) {
		AssemblyContext providedAssemblyContext = null;
		if (createdAssemblyContexts.isEmpty()) {
			providedAssemblyContext = fccHandler.getComponentsIntantiatingFCC(fcc, this.parent.getPCMSystemManager().getAssemblyContextsBy(context -> true));
		} else {
			providedAssemblyContext = fccHandler.getComponentsIntantiatingFCC(fcc, createdAssemblyContexts);
		}
		List<Connector> connectors = new ArrayList<Connector>();
		
		for (OperationSignature providedSig : providedSigs) {
			AssemblyContext requiredAssemblyContext = location.getAffectedContext();
			ProvidedRole providedRole = providedAssemblyContext.getEncapsulatedComponent__AssemblyContext().getProvidedRoles_InterfaceProvidingEntity().stream().filter(role -> ((OperationProvidedRole) role).getProvidedInterface__OperationProvidedRole().getSignatures__OperationInterface().contains(providedSig)).collect(Collectors.toList()).get(0); //this is ok, as it should only contain 1
			RequiredRole requiredRole = requiredAssemblyContext.getEncapsulatedComponent__AssemblyContext().getRequiredRoles_InterfaceRequiringEntity().stream().filter(role -> ((OperationRequiredRole) role).getRequiredInterface__OperationRequiredRole().getSignatures__OperationInterface().contains(providedSig)).collect(Collectors.toList()).get(0); //this is ok, as it should only contain 1
			AssemblyConnector connector = this.parent.getPCMSystemManager().createAssemblyConnectorBy(Pair.of((OperationRequiredRole) requiredRole, requiredAssemblyContext),
					Pair.of((OperationProvidedRole) providedRole, providedAssemblyContext));
			connectors.add(connector);
		}
		
		return connectors;
	}
	
	/**
	 * Creates all assembly connectors that connect the created assembly contexts of the realizing components, while taking the multiple flag into account.
	 * 
	 * @param instruction weaving instruction containing the multiple flag.
	 * @param createdAssemblyContexts the created assembly contexts of the realizing components.
	 * @return all assembly connectors that connect the created assembly contexts.
	 */
	private List<Connector> createAssemblyConnectors(IWeavingInstruction instruction, List<AssemblyContext> createdAssemblyContexts) {
		List<Connector> createdConnectors = new ArrayList<Connector>();
		for (AssemblyContext assemblyContext : createdAssemblyContexts) { 
			//create connectors
			for (RequiredRole requiredRole : assemblyContext.getEncapsulatedComponent__AssemblyContext().getRequiredRoles_InterfaceRequiringEntity()) {
				ProvidedRole compProvidedRole = (ProvidedRole) this.getComplimentaryRoleOf(requiredRole, getAllProvidedRolesOf(createdAssemblyContexts));
				AssemblyContext providedAssemblyContext = getAssemblyContextProviding(compProvidedRole, createdAssemblyContexts);

				AssemblyConnector connector = this.parent.getPCMSystemManager().createAssemblyConnectorBy(Pair.of((OperationRequiredRole) requiredRole, assemblyContext),
						Pair.of((OperationProvidedRole) compProvidedRole, providedAssemblyContext));
				if (instruction.getInclusionMechanism().isMultiple()) {
					//only add if solution components are added multiple times
					createdConnectors.add(connector);
				} else if (!this.parent.getPCMSystemManager().existConnector(connector)) {
					//only add if not already existing 
					createdConnectors.add(connector);
				}
			}
		}
		return createdConnectors;
	}

	/**
	 * Creates all assembly contexts for the realizing components, while taking the multiple flag into account.
	 * 
	 * @param instruction weaving instruction containing the multiple flag.
	 * @param realizingComponents the realizing components.
	 * @return all assembly contexts for the realizing components.
	 */
	private List<AssemblyContext> createAssemblyContexts(IWeavingInstruction instruction, List<RepositoryComponent> realizingComponents) {
		List<AssemblyContext> createdAssemblyContexts = new ArrayList<AssemblyContext>();
		for (RepositoryComponent repositoryComponent : realizingComponents) {	
			//decide if solution components are added multiple times
			if (instruction.getInclusionMechanism().isMultiple()) {
				AssemblyContext newAssemblyContext = this.parent.getPCMSystemManager().createAssemblyContextOf(repositoryComponent);
				createdAssemblyContexts.add(newAssemblyContext);
			}
			else if (this.parent.getPCMSystemManager().getAssemblyContextsInstantiating(repositoryComponent).isEmpty()) {
				AssemblyContext newAssemblyContext = this.parent.getPCMSystemManager().createAssemblyContextOf(repositoryComponent);	
				createdAssemblyContexts.add(newAssemblyContext);
			}
		}
		return createdAssemblyContexts;
	}
	

	/**
	 * Determines all complementum components that are required by the realizing components.
	 * 
	 * @param realizingComponents the realizing components.
	 * @return all complementum components that are required.
	 */
	private Collection<? extends RepositoryComponent> determineAdditionalComplementaComponents(List<RepositoryComponent> realizingComponents) {
		List<RepositoryComponent> additionalComplementaComponents = new ArrayList<RepositoryComponent>();
		if (this.fccHandler.requiresComplementa(realizingComponents)) {
			additionalComplementaComponents.addAll(this.fccHandler.getRequiredComplementa(realizingComponents));
		}
		return additionalComplementaComponents;
	}

	/**
	 * Determines all required FCCs starting from the providing FCC.
	 * 
	 * @param perimeterProvidingFCC the providing FCC.
	 * @return all required FCCs.
	 */
	private List<CompletionComponent> determineAllFCCs(CompletionComponent perimeterProvidingFCC) {
		List<CompletionComponent> allFCCs = this.fccHandler.getFCCsRequiredBy(perimeterProvidingFCC);
		allFCCs.add(perimeterProvidingFCC);
		return allFCCs;
	}

	private List<ProvidedRole> getAllProvidedRolesOf(List<AssemblyContext> createdAssemblyContexts) {
		return createdAssemblyContexts.stream().flatMap(ac -> ac.getEncapsulatedComponent__AssemblyContext().getProvidedRoles_InterfaceProvidingEntity().stream()).collect(Collectors.toList());
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
	
	private AssemblyContext getAssemblyContextProviding(ProvidedRole providedRole, List<AssemblyContext> assemblyContexts) {
		for (AssemblyContext ac : assemblyContexts) {
			if (ac.getEncapsulatedComponent__AssemblyContext().getProvidedRoles_InterfaceProvidingEntity().stream().anyMatch(role -> role.getId().equals(providedRole.getId()))) {
				return ac;
			}
		}
		return null;
	}
}
