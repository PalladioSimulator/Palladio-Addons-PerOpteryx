package edu.kit.ipd.are.dsexplore.featurecompletions.weaver.strategy.adapter;

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
import org.palladiosimulator.pcm.repository.RequiredRole;
import org.palladiosimulator.pcm.seff.AbstractAction;
import org.palladiosimulator.pcm.seff.ExternalCallAction;
import org.palladiosimulator.pcm.seff.ResourceDemandingSEFF;
import org.palladiosimulator.pcm.seff.SeffFactory;
import org.palladiosimulator.pcm.seff.StartAction;
import org.palladiosimulator.pcm.seff.StopAction;
import org.palladiosimulator.solver.models.PCMInstance;

import FeatureCompletionModel.Complementum;
import de.uka.ipd.sdq.dsexplore.tools.primitives.Pair;
import edu.kit.ipd.are.dsexplore.featurecompletions.weaver.port.FCCWeaverException;

public class ComplementumWeaver {

	private final PCMInstance pcm;
	private Repository repository;

	public ComplementumWeaver(PCMInstance pcmToAdapt, Repository repository) {
		this.pcm = pcmToAdapt;
		this.repository = repository;
	}

	public void weave(List<Pair<Entity, Complementum>> require, List<Pair<AssemblyConnector, Complementum>> provides) throws FCCWeaverException {
		Repository repo = this.repository;// this.getOrCreateRepo();

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

	// private Repository getOrCreateRepo() {
	// for (Repository repo : new ArrayList<>(this.pcm.getRepositories())) {
	// if (repo.getId().equals("ComplementumAdapterRepo")) {
	// // Remove old repo
	// this.pcm.getRepositories().remove(repo);
	// }
	// }
	// Repository complementumAdapterRepo =
	// RepositoryFactory.eINSTANCE.createRepository();
	// complementumAdapterRepo.setId("ComplementumAdapterRepo");
	// complementumAdapterRepo.setEntityName("ComplementumAdapterRepo");
	// this.pcm.getRepositories().add(complementumAdapterRepo);
	// return complementumAdapterRepo;
	// }

	private void weaveInterface(OperationInterface newProvided, AssemblyConnector provider, Repository repo) {
		AssemblyContext targetContext = this.findTargetAC(newProvided);
		if (targetContext == null) {
			return;
		}

		BasicComponent adapter = this.createAdapter(newProvided, provider, repo);

		// AssemblyContext
		AssemblyContext ac = this.createAssemblyContext(adapter, provider, targetContext, newProvided);
		// AllocationContext
		AllocationContext alloc = this.createAllocationContext(adapter, ac);
	}

	private AssemblyContext findTargetAC(OperationInterface newProvided) {
		for (AssemblyContext ac : this.pcm.getSystem().getAssemblyContexts__ComposedStructure()) {
			RepositoryComponent rc = ac.getEncapsulatedComponent__AssemblyContext();
			for (RequiredRole rr : rc.getRequiredRoles_InterfaceRequiringEntity()) {
				if (rr instanceof OperationRequiredRole) {
					OperationRequiredRole orr = (OperationRequiredRole) rr;
					if (orr.getRequiredInterface__OperationRequiredRole().getId().equals(newProvided.getId())) {
						return ac;
					}
				}
			}

		}
		return null;
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

	private AssemblyContext createAssemblyContext(BasicComponent adapter, AssemblyConnector provider, AssemblyContext target, OperationInterface targetInterface) {
		AssemblyContext ac = CompositionFactory.eINSTANCE.createAssemblyContext();
		ac.setEncapsulatedComponent__AssemblyContext(adapter);

		OperationProvidedRole pr = RepositoryFactory.eINSTANCE.createOperationProvidedRole();
		pr.setProvidedInterface__OperationProvidedRole(targetInterface);

		AssemblyConnector connectProvided = CompositionFactory.eINSTANCE.createAssemblyConnector();
		connectProvided.setRequiringAssemblyContext_AssemblyConnector(ac);
		connectProvided.setRequiredRole_AssemblyConnector((OperationRequiredRole) adapter.getRequiredRoles_InterfaceRequiringEntity().get(0));
		connectProvided.setProvidingAssemblyContext_AssemblyConnector(target);
		connectProvided.setProvidedRole_AssemblyConnector(pr);

		OperationRequiredRole or = RepositoryFactory.eINSTANCE.createOperationRequiredRole();
		or.setRequiredInterface__OperationRequiredRole(provider.getProvidedRole_AssemblyConnector().getProvidedInterface__OperationProvidedRole());

		AssemblyConnector connectRequired = CompositionFactory.eINSTANCE.createAssemblyConnector();
		connectRequired.setRequiringAssemblyContext_AssemblyConnector(provider.getProvidingAssemblyContext_AssemblyConnector());
		connectRequired.setRequiredRole_AssemblyConnector(or);
		connectRequired.setProvidingAssemblyContext_AssemblyConnector(ac);
		connectRequired.setProvidedRole_AssemblyConnector((OperationProvidedRole) adapter.getProvidedRoles_InterfaceProvidingEntity().get(0));

		this.pcm.getSystem().getAssemblyContexts__ComposedStructure().add(ac);

		this.pcm.getSystem().getConnectors__ComposedStructure().add(connectRequired);
		this.pcm.getSystem().getConnectors__ComposedStructure().add(connectProvided);
		return ac;
	}

	private BasicComponent createAdapter(OperationInterface provided, AssemblyConnector required, Repository repo) {

		BasicComponent adapter = RepositoryFactory.eINSTANCE.createBasicComponent();
		adapter.setId("AdapterFor" + provided.getId() + required.getId());
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
		StartAction start = SeffFactory.eINSTANCE.createStartAction();
		actions.add(start);
		AbstractAction last = start;
		for (OperationSignature extern : externalCalls.getRequiredInterface__OperationRequiredRole().getSignatures__OperationInterface()) {
			ExternalCallAction ea = SeffFactory.eINSTANCE.createExternalCallAction();
			ea.setCalledService_ExternalService(extern);
			ea.setPredecessor_AbstractAction(last);
			last.setSuccessor_AbstractAction(ea);
			last = ea;
			actions.add(ea);
		}
		StopAction stop = SeffFactory.eINSTANCE.createStopAction();
		stop.setPredecessor_AbstractAction(last);
		actions.add(stop);

	}

}
