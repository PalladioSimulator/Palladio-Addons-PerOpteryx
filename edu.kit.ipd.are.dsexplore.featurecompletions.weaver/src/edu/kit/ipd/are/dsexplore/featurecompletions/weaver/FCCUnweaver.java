package edu.kit.ipd.are.dsexplore.featurecompletions.weaver;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.stream.Collectors;

import org.eclipse.emf.common.util.EList;
import org.palladiosimulator.analyzer.workflow.blackboard.PCMResourceSetPartition;
import org.palladiosimulator.pcm.allocation.Allocation;
import org.palladiosimulator.pcm.allocation.AllocationContext;
import org.palladiosimulator.pcm.core.composition.AssemblyConnector;
import org.palladiosimulator.pcm.core.composition.AssemblyContext;
import org.palladiosimulator.pcm.core.composition.CompositionFactory;
import org.palladiosimulator.pcm.core.composition.Connector;
import org.palladiosimulator.pcm.core.composition.ProvidedDelegationConnector;
import org.palladiosimulator.pcm.repository.BasicComponent;
import org.palladiosimulator.pcm.repository.Interface;
import org.palladiosimulator.pcm.repository.OperationInterface;
import org.palladiosimulator.pcm.repository.OperationProvidedRole;
import org.palladiosimulator.pcm.repository.OperationRequiredRole;
import org.palladiosimulator.pcm.repository.Repository;
import org.palladiosimulator.pcm.repository.RepositoryFactory;
import org.palladiosimulator.pcm.seff.AbstractAction;
import org.palladiosimulator.pcm.seff.AbstractBranchTransition;
import org.palladiosimulator.pcm.seff.AbstractLoopAction;
import org.palladiosimulator.pcm.seff.BranchAction;
import org.palladiosimulator.pcm.seff.ExternalCallAction;
import org.palladiosimulator.pcm.seff.ResourceDemandingBehaviour;
import org.palladiosimulator.pcm.seff.ServiceEffectSpecification;
import org.palladiosimulator.pcm.system.System;
import org.palladiosimulator.solver.models.PCMInstance;

import FeatureCompletionModel.ComplementumVisnetis;
import de.uka.ipd.sdq.dsexplore.tools.primitives.Pair;
import de.uka.ipd.sdq.workflow.mdsd.blackboard.MDSDBlackboard;
import edu.kit.ipd.are.dsexplore.featurecompletions.weaver.extensions.FCCProblemExtension;
import edu.kit.ipd.are.dsexplore.featurecompletions.weaver.util.AssemblyConnectorData;
import edu.kit.ipd.are.dsexplore.featurecompletions.weaver.util.ExternalCallActionData;
import edu.kit.ipd.are.dsexplore.featurecompletions.weaver.util.ProvidedDelegationConnectorData;

public final class FCCUnweaver {
	// ConnectorID -> Data
	private final Map<String, AssemblyConnectorData> originalAssemblyConnectors;
	// ConnectorID -> Data
	private final Map<String, ProvidedDelegationConnectorData> originalProvidedDelegationConnectors;

	private final Set<String> originalAssemblyContexts;
	private final Set<String> originalAllocationContexts;
	private final Map<String, ExternalCallActionData> originalExternalCalls;

	public FCCUnweaver(MDSDBlackboard blackboard) {
		PCMResourceSetPartition initial = (PCMResourceSetPartition) blackboard.getPartition(FCCProblemExtension.INITIAL_PCM_MODEL_PARTITION_ID);
		this.originalAssemblyConnectors = this.saveOriginalAssemblyConnectors(initial.getSystem());
		this.originalProvidedDelegationConnectors = this.saveOriginalProvidedDelegationConnectors(initial.getSystem());
		this.originalAssemblyContexts = this.saveOriginalAssemblyContexts(initial.getSystem());
		this.originalAllocationContexts = this.saveOriginalAllocationContexts(initial.getAllocation());
		this.originalExternalCalls = this.saveOriginalExternalCalls(initial.getSystem());
	}

	// UNWEAVE IT

	public void unweave(PCMInstance pcmToAdopt, List<Pair<String, ComplementumVisnetis>> availableCVs) {
		List<String> neccessaryIds = availableCVs.stream().map(t -> t.first).collect(Collectors.toList());
		List<Connector> copy = new ArrayList<>(pcmToAdopt.getSystem().getConnectors__ComposedStructure());
		for (Connector c : copy) {
			if (!neccessaryIds.contains(c.getId())) {
				continue;
			}
			if (c instanceof AssemblyConnector) {
				this.handleAssemblyConnector((AssemblyConnector) c, pcmToAdopt);
			} else if (c instanceof ProvidedDelegationConnector) {
				this.handleProvidedDelegationConnector((ProvidedDelegationConnector) c, pcmToAdopt);
			} else {
				throw new Error("Not possible");
			}

		}

		List<AssemblyContext> copyAC = new ArrayList<>(pcmToAdopt.getSystem().getAssemblyContexts__ComposedStructure());
		for (AssemblyContext ac : copyAC) {
			if (!this.originalAssemblyContexts.contains(ac.getId())) {
				pcmToAdopt.getSystem().getAssemblyContexts__ComposedStructure().remove(ac);
			}
		}

		List<Connector> copyConn = new ArrayList<>(pcmToAdopt.getSystem().getConnectors__ComposedStructure());
		for (Connector c : copyConn) {
			if (c instanceof AssemblyConnector) {
				if (!this.originalAssemblyConnectors.containsKey(c.getId())) {
					pcmToAdopt.getSystem().getConnectors__ComposedStructure().remove(c);
				}
			}
			if (c instanceof ProvidedDelegationConnector) {
				if (!this.originalProvidedDelegationConnectors.containsKey(c.getId())) {
					pcmToAdopt.getSystem().getConnectors__ComposedStructure().remove(c);
				}
			}
		}

		List<AllocationContext> copyAllocs = new ArrayList<>(pcmToAdopt.getAllocation().getAllocationContexts_Allocation());
		for (AllocationContext allocs : copyAllocs) {
			if (!this.originalAllocationContexts.contains(allocs.getId())) {
				pcmToAdopt.getAllocation().getAllocationContexts_Allocation().remove(allocs);
			}
		}

		// unweave external calls
		Map<String, ExternalCallActionData> copyExternalCallIDs = this.saveOriginalExternalCalls(pcmToAdopt.getSystem());
		for (Entry<String, ExternalCallActionData> copyExternalCallID : copyExternalCallIDs.entrySet()) {
			if (!this.originalExternalCalls.containsKey(copyExternalCallID.getKey()) && !this.existsConnectorWithProvidedRole(copyExternalCallID.getValue().getOperationRequiredRoleId())) {
				this.removeExternalCallAction(copyExternalCallID.getKey(), pcmToAdopt);
			}
		}
	}

	private void removeExternalCallAction(String key, PCMInstance pcmToAdopt) {
		for (AssemblyContext ac : pcmToAdopt.getSystem().getAssemblyContexts__ComposedStructure()) {
			BasicComponent comp = (BasicComponent) ac.getEncapsulatedComponent__AssemblyContext();
			for (ServiceEffectSpecification seff : comp.getServiceEffectSpecifications__BasicComponent()) {
				for (ExternalCallAction externalCallAction : this.getExternalCallActions((ResourceDemandingBehaviour) seff)) {
					if (externalCallAction.getId().equals(key)) {
						// remove call action
						AbstractAction prev = externalCallAction.getPredecessor_AbstractAction();
						AbstractAction next = externalCallAction.getSuccessor_AbstractAction();
						prev.setSuccessor_AbstractAction(next);
						next.setPredecessor_AbstractAction(prev);
						ResourceDemandingBehaviour containingSeff = (ResourceDemandingBehaviour) externalCallAction.eContainer();
						containingSeff.getSteps_Behaviour().remove(externalCallAction);
					}
				}
			}
		}
	}

	private List<ExternalCallAction> getExternalCallActions(ResourceDemandingBehaviour seff) {
		List<ExternalCallAction> result = new ArrayList<>();

		List<AbstractAction> actions = seff.getSteps_Behaviour();
		for (AbstractAction abstractAction : actions) {
			if (abstractAction instanceof ExternalCallAction) {
				result.add((ExternalCallAction) abstractAction);
			} else if (abstractAction instanceof BranchAction) {
				EList<AbstractBranchTransition> branches = ((BranchAction) abstractAction).getBranches_Branch();
				for (AbstractBranchTransition abstractBranchTransition : branches) {
					result.addAll(this.getExternalCallActions(abstractBranchTransition.getBranchBehaviour_BranchTransition()));
				}
			} else if (abstractAction instanceof AbstractLoopAction) {
				result.addAll(this.getExternalCallActions(((AbstractLoopAction) abstractAction).getBodyBehaviour_Loop()));
			}
		}

		return result;
	}

	private boolean existsConnectorWithProvidedRole(String operationRequiredRoleId) {
		for (Entry<String, AssemblyConnectorData> c : this.originalAssemblyConnectors.entrySet()) {
			if (operationRequiredRoleId.equals(c.getValue().operationRequiredRoleId)) {
				return true;
			}
		}
		return false;
	}

	private void handleAssemblyConnector(AssemblyConnector c, PCMInstance pcmToAdopt) {
		String currentId = c.getId();
		AssemblyConnectorData acd = this.originalAssemblyConnectors.get(currentId);
		System system = pcmToAdopt.getSystem();

		boolean original = true;
		original = original && c.getProvidedRole_AssemblyConnector().getProvidedInterface__OperationProvidedRole().getId().equals(acd.operationProvidedRoleInterfaceId);
		original = original && c.getRequiredRole_AssemblyConnector().getRequiredInterface__OperationRequiredRole().getId().equals(acd.operationRequiredRoleInterfaceId);
		original = original && c.getProvidingAssemblyContext_AssemblyConnector().getId().equals(acd.providedAssemblyContextId);
		original = original && c.getRequiringAssemblyContext_AssemblyConnector().getId().equals(acd.requiredAssemblyContextId);
		original = original && c.getEntityName().equals(acd.name);
		if (original) {
			return;
		}

		AssemblyConnector requiredEnd = (AssemblyConnector) FCCUnweaver.getConnectorBy(system, currentId + "-requiredEnd");
		system.getConnectors__ComposedStructure().remove(requiredEnd);
		system.getConnectors__ComposedStructure().remove(c);

		AssemblyConnector assemblyConnector = CompositionFactory.eINSTANCE.createAssemblyConnector();
		assemblyConnector.setEntityName(acd.name);
		assemblyConnector.setId(currentId);
		assemblyConnector.setRequiredRole_AssemblyConnector(this.getRoleByRequiredInterfaceId(pcmToAdopt, acd.operationRequiredRoleInterfaceId, acd.operationRequiredRoleId));
		assemblyConnector.setRequiringAssemblyContext_AssemblyConnector(this.getAssemblyContextById(system, acd.requiredAssemblyContextId));
		assemblyConnector.setProvidedRole_AssemblyConnector(this.getRoleByProvidedInterfaceId(pcmToAdopt, acd.operationProvidedRoleInterfaceId, acd.operationProvidedRoleId));
		assemblyConnector.setProvidingAssemblyContext_AssemblyConnector(this.getAssemblyContextById(system, acd.providedAssemblyContextId));

		system.getConnectors__ComposedStructure().add(assemblyConnector);

	}

	private static Connector getConnectorBy(System pcmSystem, String connectorID) {
		for (Connector connector : pcmSystem.getConnectors__ComposedStructure()) {
			if (connector.getId().equals(connectorID)) {
				return connector;
			}
		}
		return null;
	}

	private AssemblyContext getAssemblyContextById(System system, String id) {
		for (AssemblyContext ac : system.getAssemblyContexts__ComposedStructure()) {
			if (ac.getId().equals(id)) {
				return ac;
			}
		}
		return null;
	}

	private Interface getInterfaceById(PCMInstance pcmInstance, String id) {
		for (Repository repo : pcmInstance.getRepositories()) {
			for (Interface oi : repo.getInterfaces__Repository()) {
				if (oi.getId().equals(id)) {
					return oi;
				}

			}
		}
		return null;
	}

	private OperationProvidedRole getRoleByProvidedInterfaceId(PCMInstance pcmInstance, String operationProvidedRoleInterfaceId, String operationProvidedRoleId) {
		OperationProvidedRole opr = RepositoryFactory.eINSTANCE.createOperationProvidedRole();
		opr.setId(operationProvidedRoleId);
		Interface opi = this.getInterfaceById(pcmInstance, operationProvidedRoleInterfaceId);
		opr.setProvidedInterface__OperationProvidedRole((OperationInterface) opi);
		return opr;
	}

	private OperationRequiredRole getRoleByRequiredInterfaceId(PCMInstance pcmInstance, String operationRequiredRoleInterfaceId, String operationRequiredRoleId) {
		OperationRequiredRole orr = RepositoryFactory.eINSTANCE.createOperationRequiredRole();
		orr.setId(operationRequiredRoleId);
		Interface opi = this.getInterfaceById(pcmInstance, operationRequiredRoleInterfaceId);
		orr.setRequiredInterface__OperationRequiredRole((OperationInterface) opi);
		return orr;
	}

	private void handleProvidedDelegationConnector(ProvidedDelegationConnector c, PCMInstance pcmToAdopt) {
		throw new IllegalAccessError();
	}

	// SAVE IT

	private Set<String> saveOriginalAllocationContexts(Allocation allocation) {
		Set<String> result = new HashSet<>();
		for (AllocationContext alloc : allocation.getAllocationContexts_Allocation()) {
			result.add(alloc.getId());
		}
		return result;
	}

	private Set<String> saveOriginalAssemblyContexts(System system) {
		Set<String> result = new HashSet<>();
		for (AssemblyContext ac : system.getAssemblyContexts__ComposedStructure()) {
			result.add(ac.getId());
		}
		return result;
	}

	private Map<String, ProvidedDelegationConnectorData> saveOriginalProvidedDelegationConnectors(System pcmSystem) {
		Map<String, ProvidedDelegationConnectorData> result = new HashMap<>();
		for (Connector c : pcmSystem.getConnectors__ComposedStructure()) {
			if (!(c instanceof ProvidedDelegationConnector)) {
				continue;
			}

			ProvidedDelegationConnector pcd = (ProvidedDelegationConnector) c;
			result.put(pcd.getId(), new ProvidedDelegationConnectorData(pcd));
		}
		return result;
	}

	private Map<String, AssemblyConnectorData> saveOriginalAssemblyConnectors(System pcmSystem) {
		Map<String, AssemblyConnectorData> result = new HashMap<>();
		for (Connector c : pcmSystem.getConnectors__ComposedStructure()) {
			if (!(c instanceof AssemblyConnector)) {
				continue;
			}

			AssemblyConnector ac = (AssemblyConnector) c;
			result.put(ac.getId(), new AssemblyConnectorData(ac));
		}
		return result;
	}

	private Map<String, ExternalCallActionData> saveOriginalExternalCalls(System system) {
		Map<String, ExternalCallActionData> result = new HashMap<>();
		for (AssemblyContext ac : system.getAssemblyContexts__ComposedStructure()) {
			BasicComponent comp = (BasicComponent) ac.getEncapsulatedComponent__AssemblyContext();
			for (ServiceEffectSpecification seff : comp.getServiceEffectSpecifications__BasicComponent()) {
				for (ExternalCallAction externalCallAction : this.getExternalCallActions((ResourceDemandingBehaviour) seff)) {
					result.put(externalCallAction.getId(), new ExternalCallActionData(comp, externalCallAction.getRole_ExternalService()));
				}
			}
		}
		return result;
	}

}
