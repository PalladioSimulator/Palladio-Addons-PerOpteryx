package edu.kit.ipd.are.dsexplore.featurecompletions.weaver.strategy.adapter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Predicate;

import org.palladiosimulator.pcm.core.composition.AssemblyContext;
import org.palladiosimulator.pcm.core.composition.Connector;
import org.palladiosimulator.pcm.repository.OperationRequiredRole;
import org.palladiosimulator.pcm.repository.ProvidedRole;
import org.palladiosimulator.pcm.repository.RepositoryComponent;
import org.palladiosimulator.pcm.repository.RequiredRole;
import org.palladiosimulator.pcm.repository.Role;

import FeatureCompletionModel.Complementum;
import FeatureCompletionModel.CompletionComponent;
import de.uka.ipd.sdq.dsexplore.tools.primitives.Pair;
import de.uka.ipd.sdq.dsexplore.tools.stereotypeapi.StereotypeAPIHelper;
import edu.kit.ipd.are.dsexplore.featurecompletions.weaver.ErrorMessage;
import edu.kit.ipd.are.dsexplore.featurecompletions.weaver.FCCUtil;
import edu.kit.ipd.are.dsexplore.featurecompletions.weaver.port.FCCWeaverException;
import edu.kit.ipd.are.dsexplore.featurecompletions.weaver.strategy.WeavingInstruction;
import edu.kit.ipd.are.dsexplore.featurecompletions.weaver.strategy.adapter.util.ConnectionInfo;
import edu.kit.ipd.are.dsexplore.featurecompletions.weaver.strategy.adapter.util.ConnectorGenerator;
import edu.kit.ipd.are.dsexplore.featurecompletions.weaver.strategy.adapter.util.ConnectorGeneratorExplorationFactory;
import edu.kit.ipd.are.dsexplore.featurecompletions.weaver.strategy.handler.FCCStructureHandler;
import edu.kit.ipd.are.dsexplore.featurecompletions.weaver.strategy.handler.RoleHandler;
import edu.kit.ipd.are.dsexplore.featurecompletions.weaver.strategy.handler.RoleHandlerFactory;

/**
 * This class is responsible for weaving the assembly view-type in the context
 * of the adapter transformation strategy.
 *
 * @author scheerer
 *
 */
public abstract class AssemblyWeaving {
	protected final IAdapterWeaving parent;

	public AssemblyWeaving(IAdapterWeaving parent) {
		this.parent = parent;
	}

	public void weave(WeavingInstruction weavingInstruction) throws FCCWeaverException {
		this.setAdapterAssemblyContextRegarding(weavingInstruction.getInclusionMechanism().isMultiple());
		this.establishConnectionTo(weavingInstruction.getFCCWithConsumedFeatures());
		this.weaveAdapterIntoSystem(weavingInstruction.getWeavingLocation());
	}

	private void setAdapterAssemblyContextRegarding(boolean isMultiple) {
		if (isMultiple) {
			this.parent.setAdapter(this.parent.getPCMSystemManager().createAndAddAssemblyContextOf(this.parent.getAdapterComponent()));
		} else {
			this.parent.setAdapter(this.getOrCreateAssemblyContextOf(this.parent.getAdapterComponent()));
		}
	}

	private void establishConnectionTo(Pair<CompletionComponent, List<ProvidedRole>> fccAndProvidedFeatures) throws FCCWeaverException {
		this.createConnectorsFromAdapterTo(fccAndProvidedFeatures.getSecond());
		this.createConnectorsFromFCCToRequiredFCCs(fccAndProvidedFeatures.getFirst());
	}

	private void createConnectorsFromAdapterTo(List<ProvidedRole> providedECCFeatures) throws FCCWeaverException {
		AssemblyContext eccAssemblyContext = this.getOrCreateAssemblyContextOf((RepositoryComponent) providedECCFeatures.get(0).eContainer());

		for (ProvidedRole eachProvidedFeature : providedECCFeatures) {
			RequiredRole requiredRole = (RequiredRole) this.getComplimentaryRoleOf(eachProvidedFeature, this.getRequiredRolesOfAdapter());
			ConnectionInfo connectionInfo = new ConnectionInfo(requiredRole, eachProvidedFeature, this.parent.getAdapterAssemblyContext(), eccAssemblyContext);
			this.addConnector(this.createConnectorBy(connectionInfo));
		}
	}

	private AssemblyContext getOrCreateAssemblyContextOf(RepositoryComponent component) {
		Optional<AssemblyContext> result = this.parent.getPCMSystemManager().getAssemblyContextBy(this.getAssemblyContextInstantiating(component));
		if (result.isPresent()) {
			return result.get();
		}
		return this.parent.getPCMSystemManager().createAndAddAssemblyContextOf(component);
	}

	private Predicate<AssemblyContext> getAssemblyContextInstantiating(RepositoryComponent component) {
		return assemblyContext -> FCCUtil.areEqual(assemblyContext.getEncapsulatedComponent__AssemblyContext(), component);
	}

	private <T extends Role> ConnectorGenerator getApplicableConnectorGeneratorBy(ConnectionInfo connectionInfo) throws FCCWeaverException {
		ConnectorGeneratorExplorationFactory factory = new ConnectorGeneratorExplorationFactory(this.parent.getPCMSystemManager());
		return factory.getApplicableConnectorGeneratorBy(connectionInfo);
	}

	private void createConnectorsFromFCCToRequiredFCCs(CompletionComponent fcc) throws FCCWeaverException {
		FCCStructureHandler fccHandler = new FCCStructureHandler(fcc, this.parent.getSolutionManager());
		for (RepositoryComponent eachComponent : fccHandler.getStructureOfECCAndRequiredAccordingTo(this.resolveOnlyComponents())) {
			this.createConnectorsBy(eachComponent).forEach(this::addConnector);
		}
	}

	private Function<RepositoryComponent, List<RepositoryComponent>> resolveOnlyComponents() {
		return (component) -> Arrays.asList(component);
	}

	private List<Connector> createConnectorsBy(RepositoryComponent component) throws FCCWeaverException {
		AssemblyContext requiredAssemblyContext = this.getOrCreateAssemblyContextOf(component);

		List<Connector> createdConnectors = new ArrayList<>();
		for (RequiredRole eachRequiredRole : component.getRequiredRoles_InterfaceRequiringEntity()) {
			if (this.checkForComplementum(eachRequiredRole)) {
				continue;
			}
			ProvidedRole providedRole = (ProvidedRole) this.getComplimentaryRoleOf(eachRequiredRole, this.parent.getSolutionManager().getAllProvidedRoles());
			AssemblyContext providedAssemblyContext = this.getOrCreateAssemblyContextOf((RepositoryComponent) providedRole.eContainer());

			ConnectionInfo connectionInfo = new ConnectionInfo(eachRequiredRole, providedRole, requiredAssemblyContext, providedAssemblyContext);
			createdConnectors.add(this.createConnectorBy(connectionInfo));
		}
		return createdConnectors;

	}

	private boolean checkForComplementum(RequiredRole eachRequiredRole) {
		if (!(eachRequiredRole instanceof OperationRequiredRole)) {
			return false;
		}
		OperationRequiredRole orr = (OperationRequiredRole) eachRequiredRole;
		List<Complementum> cmps = StereotypeAPIHelper.getViaStereoTypeFrom(orr.getRequiredInterface__OperationRequiredRole(), Complementum.class, "requiresComplementum");
		return cmps.size() != 0;
	}

	protected <T extends Role> Role getComplimentaryRoleOf(Role role, List<T> complimentaryRoleSpace) throws FCCWeaverException {
		return this.getRoleHandlerBy(role).getComplimentaryRoleOf(role, complimentaryRoleSpace)
				.orElseThrow(() -> new FCCWeaverException(ErrorMessage.missingComplimentaryRole((RepositoryComponent) role.eContainer(), role)));
	}

	private RoleHandler getRoleHandlerBy(Role role) throws FCCWeaverException {
		return RoleHandlerFactory.getBy(role, this.parent.getSolutionManager()).orElseThrow(() -> new FCCWeaverException(ErrorMessage.unsupportedRole()));
	}

	private Connector createConnectorBy(ConnectionInfo connectionInfo) throws FCCWeaverException {
		ConnectorGenerator generator = this.getApplicableConnectorGeneratorBy(connectionInfo);
		return generator.createConnectorBy(connectionInfo);
	}

	protected List<RequiredRole> getRequiredRolesOfAdapter() {
		return this.parent.getAdapterComponent().getRequiredRoles_InterfaceRequiringEntity();
	}

	protected void addConnector(Connector connectorToAdd) {
		if (!this.parent.getPCMSystemManager().existConnector(connectorToAdd)) {
			this.parent.getPCMSystemManager().addConnectors(connectorToAdd);
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
	public abstract void weaveAdapterIntoSystem(Connector weavingLocation) throws FCCWeaverException;

}
