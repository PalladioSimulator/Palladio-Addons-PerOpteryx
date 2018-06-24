/**
 * 
 */
package edu.kit.ipd.are.dsexplore.featurecompletions.weaver.strategy.extension;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
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

	/**
	 * @param instruction
	 */
	public void weave(IWeavingInstruction instruction) {
		CompletionComponent fcc = instruction.getFccWithProvidedRoles().first;
		List<List<RepositoryComponent>> components = this.parent.getMergedRepoManager().getAffectedComponentsByFCCListGrouped(fcc);
	
		for (RepositoryComponent repositoryComponent : components.get(0)) {	//TODO decide which solution to choose, matching selected signture in weaved SEFF!!!!!
			if (this.parent.getPCMSystemManager().getAssemblyContextsInstantiating(repositoryComponent).isEmpty()) {
				this.parent.getPCMSystemManager().createAndAddAssemblyContextOf(repositoryComponent);	
			}
		}
		
		//create connectors for fcc components
		for (RepositoryComponent repositoryComponent : components.get(0)) { //TODO decide which solution to choose, matching selected signture in weaved SEFF!!!!!
			AssemblyContext assemblyContext = this.parent.getPCMSystemManager().getAssemblyContextBy(getAssemblyContextInstantiating(repositoryComponent)).get(); //TODO mehrere AssemblyContexts??
			//create connectors
			List<Connector> createdConnectors = new ArrayList<>();
			for (RequiredRole requiredRole : repositoryComponent.getRequiredRoles_InterfaceRequiringEntity()) {
				ProvidedRole providedRole = (ProvidedRole) this.getComplimentaryRoleOf(requiredRole, this.parent.getMergedRepoManager().getAllProvidedRoles());
				AssemblyContext providedAssemblyContext = this.parent.getPCMSystemManager().getAssemblyContextBy(getAssemblyContextInstantiating((RepositoryComponent) providedRole.eContainer())).get();

				AssemblyConnector connector = this.parent.getPCMSystemManager().createAssemblyConnectorBy(Pair.of((OperationRequiredRole) requiredRole, assemblyContext),
						Pair.of((OperationProvidedRole) providedRole, providedAssemblyContext));
				if (!this.parent.getPCMSystemManager().existConnector(connector)) {
					//only add if not already existing!
					createdConnectors.add(connector);
				}
			}
			
			this.parent.getPCMSystemManager().addConnectors(createdConnectors);
		}
		
		addConnectorsToFCC(instruction);
		
		
		//TODO print assembly
//		Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
//		Map<String, Object> m = reg.getExtensionToFactoryMap();
//		m.put("xmi", new XMIResourceFactoryImpl());
//		Resource resource = (Resource) new ResourceSetImpl().createResource(URI.createFileURI("C:/Users/Maxi/Documents/system.xmi"));
//		resource.getContents().add(this.parent.getPCMToAdapt().getSystem());
//		try {
//			resource.save(Collections.EMPTY_MAP);
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		//TODO print assembly
	}

	/**
	 * @param instruction
	 */
	public abstract void addConnectorsToFCC(IWeavingInstruction instruction);

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
}
