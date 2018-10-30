package edu.kit.ipd.are.dsexplore.featurecompletions.weaver.strategy.adapter;

import java.util.ArrayList;
import java.util.List;

import org.palladiosimulator.pcm.allocation.AllocationContext;
import org.palladiosimulator.pcm.allocation.AllocationFactory;
import org.palladiosimulator.pcm.core.composition.AssemblyConnector;
import org.palladiosimulator.pcm.core.composition.AssemblyContext;
import org.palladiosimulator.pcm.core.composition.CompositionFactory;
import org.palladiosimulator.pcm.core.entity.Entity;
import org.palladiosimulator.pcm.repository.BasicComponent;
import org.palladiosimulator.pcm.repository.OperationInterface;
import org.palladiosimulator.pcm.repository.OperationProvidedRole;
import org.palladiosimulator.pcm.repository.OperationRequiredRole;
import org.palladiosimulator.pcm.repository.OperationSignature;
import org.palladiosimulator.pcm.repository.Repository;
import org.palladiosimulator.pcm.repository.RepositoryComponent;
import org.palladiosimulator.pcm.repository.RepositoryFactory;
import org.palladiosimulator.pcm.seff.AbstractAction;
import org.palladiosimulator.pcm.seff.ExternalCallAction;
import org.palladiosimulator.pcm.seff.ResourceDemandingSEFF;
import org.palladiosimulator.pcm.seff.SeffFactory;
import org.palladiosimulator.solver.models.PCMInstance;

import FeatureCompletionModel.Complementum;
import de.uka.ipd.sdq.dsexplore.tools.primitives.Pair;
import edu.kit.ipd.are.dsexplore.featurecompletions.weaver.port.FCCWeaverException;

public class ComplementumWeaver {

	private final PCMInstance pcm;

	public ComplementumWeaver(PCMInstance pcmToAdapt) {
		this.pcm = pcmToAdapt;
	}

	public void weave(List<Pair<Entity, Complementum>> require, List<Pair<AssemblyConnector, Complementum>> provides) throws FCCWeaverException {
		Repository repo = this.getOrCreateRepo();

		for (Pair<Entity, Complementum> complementum : require) {
			AssemblyConnector provider = provides.stream().filter(p -> p.second == complementum.second).findFirst().map(p -> p.first).orElse(null);

			if (provider == null) {
				throw new FCCWeaverException("No provider for " + complementum.second + " found");
			}

			if (complementum.first instanceof OperationInterface) {
				this.weaveInterface((OperationInterface) complementum.first, provider, repo);
			} else if (complementum.first instanceof OperationSignature) {
				// TODO Implement me
			} else if (complementum.first instanceof RepositoryComponent) {
				// TODO Implement me
			} else {
				throw new FCCWeaverException("Type " + complementum.getFirst() + " is not supported for complementum weaving");
			}
		}

	}

	private Repository getOrCreateRepo() {
		for (Repository repo : new ArrayList<>(this.pcm.getRepositories())) {
			if (repo.getId().equals("ComplementumAdapterRepo")) {
				// Remove old repo
				this.pcm.getRepositories().remove(repo);
			}
		}
		Repository complementumAdapterRepo = RepositoryFactory.eINSTANCE.createRepository();
		complementumAdapterRepo.setId("ComplementumAdapterRepo");
		complementumAdapterRepo.setEntityName("ComplementumAdapterRepo");
		this.pcm.getRepositories().add(complementumAdapterRepo);
		return complementumAdapterRepo;
	}

	private void weaveInterface(OperationInterface newProvided, AssemblyConnector provider, Repository repo) {
		BasicComponent adapter = this.createAdapter(newProvided, provider, repo);

		// AssemblyContext
		AssemblyContext ac = this.createAssemblyContext(adapter);
		// AllocationContext
		AllocationContext alloc = this.createAllocationContext(adapter, ac);
	}

	private AllocationContext createAllocationContext(BasicComponent adapter, AssemblyContext ac) {
		// TODO Check allocation
		AllocationContext allocCtx = AllocationFactory.eINSTANCE.createAllocationContext();
		allocCtx.setAssemblyContext_AllocationContext(ac);
		allocCtx.setAllocation_AllocationContext(this.pcm.getAllocation());
		// Just use the first resource container
		allocCtx.setResourceContainer_AllocationContext(this.pcm.getResourceEnvironment().getResourceContainer_ResourceEnvironment().get(0));
		return allocCtx;
	}

	private AssemblyContext createAssemblyContext(BasicComponent adapter) {
		AssemblyContext ac = CompositionFactory.eINSTANCE.createAssemblyContext();
		ac.setEncapsulatedComponent__AssemblyContext(adapter);

		AssemblyConnector connectProvided = CompositionFactory.eINSTANCE.createAssemblyConnector();
		connectProvided.setRequiringAssemblyContext_AssemblyConnector(ac);
		connectProvided.setRequiredRole_AssemblyConnector(null);
		connectProvided.setProvidingAssemblyContext_AssemblyConnector(null);
		connectProvided.setProvidedRole_AssemblyConnector(null);

		AssemblyConnector connectRequired = CompositionFactory.eINSTANCE.createAssemblyConnector();
		connectRequired.setRequiringAssemblyContext_AssemblyConnector(null);
		connectRequired.setRequiredRole_AssemblyConnector(null);
		connectRequired.setProvidingAssemblyContext_AssemblyConnector(null);
		connectRequired.setProvidedRole_AssemblyConnector(null);

		this.pcm.getSystem().getAssemblyContexts__ComposedStructure().add(ac);
		this.pcm.getSystem().getConnectors__ComposedStructure().add(connectRequired);
		this.pcm.getSystem().getConnectors__ComposedStructure().add(connectProvided);
		return ac;
	}

	private BasicComponent createAdapter(OperationInterface provided, AssemblyConnector required, Repository repo) {

		BasicComponent adapter = RepositoryFactory.eINSTANCE.createBasicComponent();
		adapter.setId("AdapterFor" + provided.getEntityName() + required.getEntityName() + ((int) (Math.random() * 100)));
		adapter.setEntityName("AdapterFor" + provided.getEntityName() + required.getEntityName());

		// Set Provided Role
		OperationProvidedRole pr = RepositoryFactory.eINSTANCE.createOperationProvidedRole();
		pr.setProvidedInterface__OperationProvidedRole(provided);
		adapter.getProvidedRoles_InterfaceProvidingEntity().add(pr);

		// Set required Role
		OperationRequiredRole or = RepositoryFactory.eINSTANCE.createOperationRequiredRole();
		or.setRequiredInterface__OperationRequiredRole(required.getProvidedRole_AssemblyConnector().getProvidedInterface__OperationProvidedRole());
		adapter.getRequiredRoles_InterfaceRequiringEntity().add(or);

		// Create SEFF
		for (OperationSignature sig : pr.getProvidedInterface__OperationProvidedRole().getSignatures__OperationInterface()) {
			ResourceDemandingSEFF seff = SeffFactory.eINSTANCE.createResourceDemandingSEFF();
			seff.setBasicComponent_ServiceEffectSpecification(adapter);
			adapter.getServiceEffectSpecifications__BasicComponent().add(seff);
			seff.setDescribedService__SEFF(sig);
			this.enrichSEFF(seff, or);
		}

		repo.getComponents__Repository().add(adapter);
		return adapter;

	}

	private void enrichSEFF(ResourceDemandingSEFF seff, OperationRequiredRole externalCalls) {
		List<AbstractAction> actions = seff.getSteps_Behaviour();

		for (OperationSignature extern : externalCalls.getRequiredInterface__OperationRequiredRole().getSignatures__OperationInterface()) {
			ExternalCallAction ea = SeffFactory.eINSTANCE.createExternalCallAction();
			ea.setCalledService_ExternalService(extern);
			actions.add(actions.size() - 2, ea);
			assert ea.getSuccessor_AbstractAction() != null && ea.getPredecessor_AbstractAction() != null;
		}

	}

}
