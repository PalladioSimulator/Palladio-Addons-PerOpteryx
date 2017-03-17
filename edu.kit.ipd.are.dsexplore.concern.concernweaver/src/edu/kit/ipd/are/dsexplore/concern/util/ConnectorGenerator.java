package edu.kit.ipd.are.dsexplore.concern.util;

import java.util.List;
import java.util.Optional;

import org.palladiosimulator.pcm.core.composition.AssemblyContext;
import org.palladiosimulator.pcm.core.composition.Connector;
import org.palladiosimulator.pcm.repository.RepositoryComponent;
import org.palladiosimulator.pcm.repository.Role;

import edu.kit.ipd.are.dsexplore.concern.handler.RoleHandlerFactory;
import edu.kit.ipd.are.dsexplore.concern.manager.PcmSystemManager;

public abstract class ConnectorGenerator {
	
	protected List<Role> rolesToExplore;
	protected PcmSystemManager pcmSystemManager;
	
	public ConnectorGenerator(List<Role> rolesToExplore, PcmSystemManager pcmSystemManager) {
		
		this.rolesToExplore = rolesToExplore;
		this.pcmSystemManager = pcmSystemManager;
		
	}
	
	protected Optional<Role> getConnectedOpponentOf(Role role) {
		
		return RoleHandlerFactory.getBy(role, null).getOpponentOf(role, this.rolesToExplore);
		
		
	}

	//TODO introduce exceptions. It's assumed that an assembly context needs to be created or already exist only once.
	protected AssemblyContext getAssemblyContextOf(RepositoryComponent component, ConnectionInfo connectionInfo) {
		
		List<AssemblyContext> assemblyContexts = pcmSystemManager.getAssemblyContextsInstantiating(component);
		if (assemblyContexts.isEmpty()) {
			
			return createAndAddAssemblyContextOf(component);
			
		}
		
		return assemblyContexts.size() > 1 ? connectionInfo.opponentAssemblyContext.get() : assemblyContexts.get(0);
		
	}
	
	private AssemblyContext createAndAddAssemblyContextOf(RepositoryComponent component) {
		
		String uniqueComponentName = ConcernWeaverUtil.getDefaultInstanceNameWith(component.getEntityName());
		AssemblyContext createdAssemblyContext = pcmSystemManager.createAssemblyContextOf(component, uniqueComponentName);
		
		pcmSystemManager.addAssemblyContext(createdAssemblyContext);
		
		return createdAssemblyContext;
		
	}
	
	public abstract Optional<Connector> getConnectorOf(ConnectionInfo knownConnectionEnd);
	
}
