package edu.kit.ipd.are.dsexplore.featurecompletions.weaver.strategy.adapter;

import org.palladiosimulator.pcm.core.composition.AssemblyConnector;
import org.palladiosimulator.pcm.core.composition.Connector;
import org.palladiosimulator.pcm.repository.OperationProvidedRole;
import org.palladiosimulator.pcm.repository.OperationRequiredRole;
import org.palladiosimulator.pcm.repository.ProvidedRole;
import org.palladiosimulator.pcm.repository.RequiredRole;

/**
 * This class weaves an adapter into a repository where the connection of the
 * components the adapter is inserted in between is an assembly connection.
 *
 * @author scheerer
 *
 */
public class AssemblyLocationRepositoryWeaving extends RepositoryWeaving {

	public AssemblyLocationRepositoryWeaving(IAdapterWeaving parent) {
		super(parent);
	}

	@Override
	protected void weaveAdapterIntoRepository(Connector weavingLocation) {
		AssemblyConnector location = (AssemblyConnector) weavingLocation;

		OperationRequiredRole requiredConnectionEnd = location.getRequiredRole_AssemblyConnector();
		OperationProvidedRole providedConnectionEnd = location.getProvidedRole_AssemblyConnector();
		ProvidedRole newProvidedRole = this.parent.getSolutionManager().createProvidedRoleBy(requiredConnectionEnd);
		RequiredRole newRequiredRole = this.parent.getSolutionManager().createRequiredRoleBy(providedConnectionEnd);

		if (this.isNotAlreadyContainedInAdapter(newProvidedRole)) {
			this.parent.getAdapterComponent().getProvidedRoles_InterfaceProvidingEntity().add(newProvidedRole);
		}
		if (this.isNotAlreadyContainedInAdapter(newRequiredRole)) {
			this.parent.getAdapterComponent().getRequiredRoles_InterfaceRequiringEntity().add(newRequiredRole);
		}
	}

}
