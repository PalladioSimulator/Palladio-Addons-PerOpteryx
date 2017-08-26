package edu.kit.ipd.are.dsexplore.concern.weavingstrategy.adapter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Predicate;

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
import edu.kit.ipd.are.dsexplore.concern.handler.RoleHandler;
import edu.kit.ipd.are.dsexplore.concern.handler.RoleHandlerFactory;
import edu.kit.ipd.are.dsexplore.concern.util.ConcernWeaverUtil;
import edu.kit.ipd.are.dsexplore.concern.util.ConnectionInfo;
import edu.kit.ipd.are.dsexplore.concern.util.ConnectorGenerator;
import edu.kit.ipd.are.dsexplore.concern.util.ConnectorGeneratorExplorationFactory;
import edu.kit.ipd.are.dsexplore.concern.util.Pair;

/**
 * This class is responsible for weaving the assembly view-type in the context
 * of the adapter transformation strategy.
 *
 * @author scheerer
 *
 */
public abstract class AdapterAssemblyWeaving extends AdapterWeaving {

	/**
	 * @see AdapterWeaving#weave(WeavingInstruction)
	 */
	@Override
	public void weave(WeavingInstruction weavingInstruction) throws ConcernWeavingException {
		this.setAdapterAssemblyContextRegarding(weavingInstruction.getTransformationStrategy().isMultiple());
		this.establishConnectionTo(weavingInstruction.getECCWithConsumedFeatures());
		this.weaveAdapterIntoSystem(weavingInstruction.getWeavingLocation());
	}

	private void setAdapterAssemblyContextRegarding(boolean isMultiple) {
		if (isMultiple) {
			AdapterWeaving.setAdapterAssemblyContext(AdapterWeaving.pcmSystemManager.createAndAddAssemblyContextOf(AdapterWeaving.adapter));
		} else {
			AdapterWeaving.setAdapterAssemblyContext(this.getOrCreateAssemblyContextOf(AdapterWeaving.adapter));
		}
	}

	private void establishConnectionTo(Pair<ElementaryConcernComponent, List<ProvidedRole>> eccAndProvidedFeatures) throws ConcernWeavingException {
		this.createConnectorsFromAdapterTo(eccAndProvidedFeatures.getSecond());
		this.createConnectorsFromECCToRequiredECCs(eccAndProvidedFeatures.getFirst());
	}

	private void createConnectorsFromAdapterTo(List<ProvidedRole> providedECCFeatures) throws ConcernWeavingException {
		AssemblyContext eccAssemblyContext = this.getOrCreateAssemblyContextOf((RepositoryComponent) providedECCFeatures.get(0).eContainer());

		for (ProvidedRole eachProvidedFeature : providedECCFeatures) {
			RequiredRole requiredRole = (RequiredRole) this.getComplimentaryRoleOf(eachProvidedFeature, this.getRequiredRolesOfAdapter());
			ConnectionInfo connectionInfo = new ConnectionInfo(requiredRole, eachProvidedFeature, AdapterWeaving.adapterAssemblyContext, eccAssemblyContext);
			this.addConnector(this.createConnectorBy(connectionInfo));
		}
	}

	private AssemblyContext getOrCreateAssemblyContextOf(RepositoryComponent component) {
		Optional<AssemblyContext> result = AdapterWeaving.pcmSystemManager.getAssemblyContextBy(this.getAssemblyContextInstantiating(component));
		if (result.isPresent()) {
			return result.get();
		}
		return AdapterWeaving.pcmSystemManager.createAndAddAssemblyContextOf(component);
	}

	private Predicate<AssemblyContext> getAssemblyContextInstantiating(RepositoryComponent component) {
		return assemblyContext -> ConcernWeaverUtil.areEqual(assemblyContext.getEncapsulatedComponent__AssemblyContext(), component);
	}

	private <T extends Role> ConnectorGenerator getApplicableConnectorGeneratorBy(ConnectionInfo connectionInfo) throws ConcernWeavingException {
		ConnectorGeneratorExplorationFactory factory = ConnectorGeneratorExplorationFactory.getBy(AdapterWeaving.pcmSystemManager);
		return factory.getApplicableConnectorGeneratorBy(connectionInfo);
	}

	private void createConnectorsFromECCToRequiredECCs(ElementaryConcernComponent ecc) throws ConcernWeavingException {
		ECCStructureHandler eccHandler = new ECCStructureHandler(ecc, AdapterWeaving.concernRepositoryManager);
		for (RepositoryComponent eachComponent : eccHandler.getStructureOfECCAndRequiredAccordingTo(this.resolveOnlyComponents())) {
			this.createConnectorsBy(eachComponent).forEach(this::addConnector);
		}
	}

	private Function<RepositoryComponent, List<RepositoryComponent>> resolveOnlyComponents() {
		return (component) -> Arrays.asList(component);
	}

	private List<Connector> createConnectorsBy(RepositoryComponent component) throws ConcernWeavingException {
		AssemblyContext requiredAssemblyContext = this.getOrCreateAssemblyContextOf(component);

		List<Connector> createdConnectors = new ArrayList<>();
		for (RequiredRole eachRequiredRole : component.getRequiredRoles_InterfaceRequiringEntity()) {
			ProvidedRole providedRole = (ProvidedRole) this.getComplimentaryRoleOf(eachRequiredRole, AdapterWeaving.concernRepositoryManager.getAllProvidedRoles());
			AssemblyContext providedAssemblyContext = this.getOrCreateAssemblyContextOf((RepositoryComponent) providedRole.eContainer());

			ConnectionInfo connectionInfo = new ConnectionInfo(eachRequiredRole, providedRole, requiredAssemblyContext, providedAssemblyContext);
			createdConnectors.add(this.createConnectorBy(connectionInfo));
		}
		return createdConnectors;

	}

	protected <T extends Role> Role getComplimentaryRoleOf(Role role, List<T> complimentaryRoleSpace) throws ConcernWeavingException {
		return this.getRoleHandlerBy(role).getComplimentaryRoleOf(role, complimentaryRoleSpace)
				.orElseThrow(() -> new ConcernWeavingException(ErrorMessage.missingComplimentaryRole((RepositoryComponent) role.eContainer(), role)));
	}

	private RoleHandler getRoleHandlerBy(Role role) throws ConcernWeavingException {
		return RoleHandlerFactory.getBy(role, AdapterWeaving.concernRepositoryManager).orElseThrow(() -> new ConcernWeavingException(ErrorMessage.unsupportedRole()));
	}

	private Connector createConnectorBy(ConnectionInfo connectionInfo) throws ConcernWeavingException {
		ConnectorGenerator generator = this.getApplicableConnectorGeneratorBy(connectionInfo);
		return generator.createConnectorBy(connectionInfo);
	}

	protected List<RequiredRole> getRequiredRolesOfAdapter() {
		return AdapterWeaving.adapter.getRequiredRoles_InterfaceRequiringEntity();
	}

	protected void addConnector(Connector connectorToAdd) {
		if (!AdapterWeaving.pcmSystemManager.existConnector(connectorToAdd)) {
			AdapterWeaving.pcmSystemManager.addConnectors(connectorToAdd);
		}
	}

	/**
	 * The implementer is responsible to realize the weaving of the adapter in
	 * the system depending on the connection of the components the adapter is
	 * inserted in between.
	 *
	 * @param weavingLocation
	 *            - Contains the informations about the weaving location.
	 * @throws ConcernWeavingException
	 *             - Will be thrown if an error occurs during weaving.
	 */
	public abstract void weaveAdapterIntoSystem(WeavingLocation weavingLocation) throws ConcernWeavingException;

}
