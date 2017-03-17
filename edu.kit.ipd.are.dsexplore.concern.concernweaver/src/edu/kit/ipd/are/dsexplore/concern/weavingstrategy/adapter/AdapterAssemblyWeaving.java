package edu.kit.ipd.are.dsexplore.concern.weavingstrategy.adapter;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

import org.palladiosimulator.pcm.core.composition.AssemblyContext;
import org.palladiosimulator.pcm.core.composition.Connector;
import org.palladiosimulator.pcm.repository.ProvidedRole;
import org.palladiosimulator.pcm.repository.RepositoryComponent;
import org.palladiosimulator.pcm.repository.RequiredRole;
import org.palladiosimulator.pcm.repository.Role;

import ConcernModel.ElementaryConcernComponent;
import edu.kit.ipd.are.dsexplore.concern.concernweaver.WeavingInstruction;
import edu.kit.ipd.are.dsexplore.concern.concernweaver.WeavingLocation;
import edu.kit.ipd.are.dsexplore.concern.exception.ConcernWeavingException;
import edu.kit.ipd.are.dsexplore.concern.exception.ErrorMessage;
import edu.kit.ipd.are.dsexplore.concern.handler.ECCStructureHandler;
import edu.kit.ipd.are.dsexplore.concern.handler.OperationRoleHandler;
import edu.kit.ipd.are.dsexplore.concern.handler.RoleHandler;
import edu.kit.ipd.are.dsexplore.concern.handler.RoleHandlerFactory;
import edu.kit.ipd.are.dsexplore.concern.util.ConcernWeaverUtil;
import edu.kit.ipd.are.dsexplore.concern.util.ConnectionInfo;
import edu.kit.ipd.are.dsexplore.concern.util.ConnectorGenerator;
import edu.kit.ipd.are.dsexplore.concern.util.ConnectorGeneratorExplorationFactory;

public abstract class AdapterAssemblyWeaving extends AdapterWeaving {
	
	private List<ProvidedRole> consumedFeaturesOfECC;
	protected AssemblyContext adapterAssemblyContext;
	protected RoleHandler roleHandler;
	
	private void setRoleHandler() {
		
		this.roleHandler = new OperationRoleHandler(concernRepositoryManager);
		
	}
	
	private void setConsumedFeaturesOfECC(List<ProvidedRole> consumedFeatures) {
		
		this.consumedFeaturesOfECC = concernRepositoryManager.getEquivalentConsumedFeaturesFromRepository(consumedFeatures);
		
	}
	
	private void setAdapterAssemblyContext(AssemblyContext adapterAssemblyContext) {
		
		this.adapterAssemblyContext = adapterAssemblyContext;
		
	}
	
	@Override
	public void weave(WeavingInstruction weavingInstruction) throws ConcernWeavingException {
		
		ElementaryConcernComponent ecc = weavingInstruction.getECCWithConsumedFeatures().getFirst();
		
		setAdapterAssemblyContext(getAdapterAssemblyContextBy(getUniqueAdapterName(weavingInstruction)));
		setConsumedFeaturesOfECC(weavingInstruction.getECCWithConsumedFeatures().getSecond());
		setRoleHandler();
		
		establishConnectionTo(ecc);
		weaveAdapterIntoSystem(weavingInstruction.getWeavingLocation());
		
	}
	
	private AssemblyContext getAdapterAssemblyContextBy(String uniqueAdapterName) {
		
		return getAssemblyContextBy(uniqueAdapterName);
		
	}
	
	private AssemblyContext getAssemblyContextBy(String uniqueComponentName) {
		//TODO this unique instance name is not unique if there exist more than one instance... check how the multiple == true case will be handled.
		String uniqueComponentInstanceName = ConcernWeaverUtil.getDefaultInstanceNameWith(uniqueComponentName);
		Optional<AssemblyContext> componentInstance = pcmSystemManager.getAssemblyContextByUniqueName(uniqueComponentInstanceName);
				
		if (componentInstance.isPresent()) {
			
			return componentInstance.get();
			
		}
		
		return createAndAddAssemblyContextOf(uniqueComponentName);
				
	}
	
	private AssemblyContext createAndAddAssemblyContextOf(String uniqueComponentName) {
		
		RepositoryComponent component = concernRepositoryManager.getComponentByUnique(uniqueComponentName).get();
		AssemblyContext createdAssemblyContext = pcmSystemManager.createAssemblyContextOf(component, ConcernWeaverUtil.getDefaultInstanceNameWith(uniqueComponentName));
		
		pcmSystemManager.addAssemblyContext(createdAssemblyContext);
		
		return createdAssemblyContext;
		
	}
	
	private void establishConnectionTo(ElementaryConcernComponent ecc) throws ConcernWeavingException {
		
		createAssemblyConnectorsFromAdapterToECC();
		createAssemblyConnectorsFromECCToRequiredECCs(ecc);
		
	}
	
	private void createAssemblyConnectorsFromAdapterToECC() {
		
		this.consumedFeaturesOfECC.forEach(consumedFeature -> {
		
			Role role = getAdaptersOpponentRequiredRoleOf(consumedFeature);
			ConnectionInfo knownConnectionInfo = new ConnectionInfo(role, this.adapterAssemblyContext);
			Optional<Connector> createdConnector = getApplicableConnectorGeneratorOf(role, toRoles(this.consumedFeaturesOfECC)).getConnectorOf(knownConnectionInfo);
			
			addConnector(createdConnector);
			
		});

	}
	
	private Role getAdaptersOpponentRequiredRoleOf(ProvidedRole providedRole) {
		
		RoleHandler roleHandler = RoleHandlerFactory.getBy(providedRole, concernRepositoryManager);
		return roleHandler.getOpponentOf(providedRole, getRequiredRolesOfAdapter()).get();
		
	}
	
	private void createAssemblyConnectorsFromECCToRequiredECCs(ElementaryConcernComponent ecc) throws ConcernWeavingException {

		ECCStructureHandler eccHandler = new ECCStructureHandler(ecc, concernRepositoryManager);
		for (RepositoryComponent eachComponent : eccHandler.getStructureWithInECCAndRequiredAccordingTo(componentCollector())) {
			
			createConnectorsBy(eachComponent).forEach(this::addConnector);
			
		}
		
	}
	
	private Function<RepositoryComponent, List<RepositoryComponent>> componentCollector() {
		
		return (component) -> Arrays.asList(component);
		
	}
	
	private List<Connector> createConnectorsBy(RepositoryComponent component) throws ConcernWeavingException {
		
		return component.getRequiredRoles_InterfaceRequiringEntity().stream().map(eachRequiredRole -> createConnectorAndCheckExceptionBy(component, eachRequiredRole))
																			 .collect(Collectors.toList());
		
	}
	
	private Connector createConnectorAndCheckExceptionBy(RepositoryComponent component, RequiredRole requiredRole) {
		
		try {
			
	        return createConnectorBy(component, requiredRole);
	        
	    } catch (Exception ex) {
	    	
	        throw new RuntimeException(ex);
	        
	    }
		
	}

	private Connector createConnectorBy(RepositoryComponent component, RequiredRole requiredRole) throws ConcernWeavingException {
		
		ConnectorGenerator applicableGenerator = getApplicableConnectorGeneratorOf(requiredRole, toRoles(concernRepositoryManager.getAllProvidedRoles())); 
		AssemblyContext assemblyContext = getAssemblyContextBy(component.getEntityName());
		Optional<Connector> createdConnector = applicableGenerator.getConnectorOf(new ConnectionInfo(requiredRole, assemblyContext));
				
		return createdConnector.orElseThrow(() -> new ConcernWeavingException(ErrorMessage.missingProvidedRole(component, requiredRole)));
		
	}

	private ConnectorGenerator getApplicableConnectorGeneratorOf(Role role, List<Role> rolesToExplore) {
		
		return ConnectorGeneratorExplorationFactory.getBy(rolesToExplore, pcmSystemManager).getApplicableConnectorGeneratorBy(role);
		
	}
	
	protected List<RequiredRole> getRequiredRolesOfAdapter() {
		
		return getComponentOf(adapterAssemblyContext).getRequiredRoles_InterfaceRequiringEntity();
		
	}

	protected RepositoryComponent getComponentOf(AssemblyContext assemblycontext) {
	
		return assemblycontext.getEncapsulatedComponent__AssemblyContext();
	
	}
	
	protected void addConnector(Optional<Connector> connectorToAdd) {
		
		if (connectorToAdd.isPresent()) {
			
			addConnector(connectorToAdd.get());
			
		}
		
	}
	
	protected void addConnector(Connector connectorToAdd) {
		
		if (!pcmSystemManager.existConnector(connectorToAdd)) {
			
			pcmSystemManager.addConnectors(connectorToAdd);
			
		}
		
	}
	
	public abstract void weaveAdapterIntoSystem(WeavingLocation weavingLocation);
	
}
