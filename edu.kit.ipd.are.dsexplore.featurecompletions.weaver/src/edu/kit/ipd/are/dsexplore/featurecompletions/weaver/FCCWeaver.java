package edu.kit.ipd.are.dsexplore.featurecompletions.weaver;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Random;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.util.EcoreUtil.Copier;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.stream.Collectors;
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
import org.palladiosimulator.pcm.repository.RepositoryComponent;
import org.palladiosimulator.pcm.repository.RepositoryFactory;
import org.palladiosimulator.pcm.seff.AbstractAction;
import org.palladiosimulator.pcm.seff.AbstractBranchTransition;
import org.palladiosimulator.pcm.seff.AbstractLoopAction;
import org.palladiosimulator.pcm.seff.BranchAction;
import org.palladiosimulator.pcm.seff.ExternalCallAction;
import org.palladiosimulator.pcm.seff.LoopAction;
import org.palladiosimulator.pcm.seff.ResourceDemandingBehaviour;
import org.palladiosimulator.pcm.seff.ServiceEffectSpecification;
import org.palladiosimulator.pcm.system.System;
import org.palladiosimulator.solver.models.PCMInstance;

import FeatureCompletionModel.ComplementumVisnetis;
import FeatureCompletionModel.CompletionComponent;
import FeatureCompletionModel.FeatureCompletion;
import FeatureCompletionModel.FeatureCompletionPackage;
import FeatureCompletionModel.FeatureCompletionRepository;
import de.uka.ipd.sdq.dsexplore.tools.primitives.Pair;
import de.uka.ipd.sdq.dsexplore.tools.stereotypeapi.StereotypeAPIHelper;
import de.uka.ipd.sdq.pcm.cost.CostRepository;
import de.uka.ipd.sdq.pcm.designdecision.Choice;
import de.uka.ipd.sdq.pcm.designdecision.DegreeOfFreedomInstance;
import de.uka.ipd.sdq.pcm.designdecision.FeatureChoice;
import de.uka.ipd.sdq.pcm.designdecision.specific.AdvicePlacementDegree;
import de.uka.ipd.sdq.pcm.designdecision.specific.AllocationDegree;
import de.uka.ipd.sdq.pcm.designdecision.specific.ClassAsReferenceDegree;
import de.uka.ipd.sdq.pcm.designdecision.specific.ComplementumVisnetisDegree;
import de.uka.ipd.sdq.pcm.designdecision.specific.FeatureCompletionDegree;
import de.uka.ipd.sdq.pcm.designdecision.specific.FeatureDegree;
import de.uka.ipd.sdq.pcm.designdecision.specific.MultipleInclusionDegree;
import de.uka.ipd.sdq.workflow.mdsd.blackboard.MDSDBlackboard;
import edu.kit.ipd.are.dsexplore.featurecompletions.weaver.extensions.FCCProblemExtension;
import edu.kit.ipd.are.dsexplore.featurecompletions.weaver.port.FCCWeaverException;
import edu.kit.ipd.are.dsexplore.featurecompletions.weaver.strategy.IWeavingStrategy;
import edu.kit.ipd.are.dsexplore.featurecompletions.weaver.strategy.WeavingLocation;
import edu.kit.ipd.are.dsexplore.featurecompletions.weaver.strategy.WeavingStrategies;
import edu.kit.ipd.are.dsexplore.featurecompletions.weaver.strategy.extension.ExtensionWeavingStrategy;
import edu.kit.ipd.are.dsexplore.featurecompletions.weaver.strategy.handler.FCCFeatureHandler;
import edu.kit.ipd.are.dsexplore.featurecompletions.weaver.strategy.manager.SolutionManager;
import edu.kit.ipd.are.dsexplore.featurecompletions.weaver.util.AssemblyConnectorData;
import edu.kit.ipd.are.dsexplore.featurecompletions.weaver.util.ExternalCallActionData;
import edu.kit.ipd.are.dsexplore.featurecompletions.weaver.util.LocationExtractor;
import edu.kit.ipd.are.dsexplore.featurecompletions.weaver.util.ProvidedDelegationConnectorData;
import featureSolution.InclusionMechanism;

public final class FCCWeaver {
	public final static String ADAPTER_NAME = "Adapter";
	public final static String CONCERN_REPOSITORY_NAME = "TemporaryConcernRepository";
	public final static String CONCERN_REPSITORY_DESCRIPTION = "Include components of all reused concerns.";

	private final List<Repository> solutions;
	private final FeatureCompletion fc;

	//// DATA ////

	// ConnectorID -> CV
	private final List<Pair<String, ComplementumVisnetis>> availableCVs;
	// ConnectorID -> Data
	private final Map<String, AssemblyConnectorData> originalAssemblyConnectors;
	// ConnectorID -> Data
	private Map<String, ProvidedDelegationConnectorData> originalProvidedDelegationConnectors;

	private final Set<String> originalAssemblyContexts;
	private final Set<String> originalAllocationContexts;
	private final Map<String, ExternalCallActionData> originalExternalCalls;

	public FCCWeaver(MDSDBlackboard blackboard, List<Repository> solutions, CostRepository costModel) {
		this.solutions = solutions;
		PCMResourceSetPartition initial = (PCMResourceSetPartition) blackboard.getPartition(FCCProblemExtension.INITIAL_PCM_MODEL_PARTITION_ID);
		this.fc = this.determineFC(initial);

		this.availableCVs = this.extractAvailableCVs(initial.getSystem());

		this.originalAssemblyConnectors = this.saveOriginalAssemblyConnectors(initial.getSystem());
		this.originalProvidedDelegationConnectors = this.saveOriginalProvidedDelegationConnectors(initial.getSystem());
		this.originalAssemblyContexts = this.saveOriginalAssemblyContexts(initial.getSystem());
		this.originalAllocationContexts = this.saveOriginalAllocationContexts(initial.getAllocation());

		this.originalExternalCalls = this.saveOriginalExternalCalls(initial.getSystem());
	}

	/**
	 * @param system
	 * @return
	 */
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
	
	private List<ExternalCallAction> getExternalCallActions(ResourceDemandingBehaviour seff) {
		List<ExternalCallAction> result = new ArrayList<>();

		List<AbstractAction> actions = seff.getSteps_Behaviour();
		for (AbstractAction abstractAction : actions) {
			if (abstractAction instanceof ExternalCallAction) {
				result.add((ExternalCallAction) abstractAction);
			} else if (abstractAction instanceof BranchAction) {
				EList<AbstractBranchTransition> branches = ((BranchAction) abstractAction).getBranches_Branch();
				for (AbstractBranchTransition abstractBranchTransition : branches) {
					result.addAll(getExternalCallActions(abstractBranchTransition.getBranchBehaviour_BranchTransition()));
				}
			} else if (abstractAction instanceof AbstractLoopAction) {
				result.addAll(getExternalCallActions(((AbstractLoopAction) abstractAction).getBodyBehaviour_Loop()));
			}
		}

		return result;
	}

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

	private FeatureCompletion determineFC(PCMResourceSetPartition initialPartition) {
		List<FeatureCompletionRepository> fcrs = initialPartition.getElement(FeatureCompletionPackage.eINSTANCE.getFeatureCompletionRepository());
		if (fcrs == null || fcrs.size() != 1) {
			return null;
		}

		FeatureCompletionRepository fcr = fcrs.get(0);
		List<FeatureCompletion> fcl = fcr.getFeatureCompletions();
		if (fcl == null || fcl.size() != 1) {
			return null;
		}
		return fcl.get(0);
	}

	private Choice fccChoice;
	private List<Choice> featureChoices;
	private List<Choice> allocationChoices;
	//dof for advice placements
	private List<Choice> advicePlacementChoices;
	//dof for multiple-flag in inclusion mechanism
	private Choice multipleInclusionChoice;
	//TODO dof for cv choice
	private List<Choice> cvChoices;

	private IWeavingStrategy strategy;

	public void nextDecodeStart() {
		this.fccChoice = null;
		this.multipleInclusionChoice = null;
		this.featureChoices = new ArrayList<>();
		this.allocationChoices = new ArrayList<>();
		this.advicePlacementChoices = new ArrayList<>();
		this.cvChoices = new ArrayList<>();
	}

	public void grabChoices(List<Choice> notTransformedChoices) {
		for (Choice c : notTransformedChoices) {
			if (c.getDegreeOfFreedomInstance() instanceof FeatureCompletionDegree) {
				this.fccChoice = c;
			} else if (c.getDegreeOfFreedomInstance() instanceof MultipleInclusionDegree) {
				//add dof for multiple-flag in inclusion mechanism
				this.multipleInclusionChoice = c;
			} else if (c.getDegreeOfFreedomInstance() instanceof AdvicePlacementDegree) {
				//add dof for advice placements
				this.advicePlacementChoices.add(c);
			} else if (c.getDegreeOfFreedomInstance() instanceof FeatureDegree) {
				this.featureChoices.add(c);
			} else if (c.getDegreeOfFreedomInstance() instanceof AllocationDegree) {
				this.addAllocationDegreeIfNeeded(c);
			} else if (c.getDegreeOfFreedomInstance() instanceof ComplementumVisnetisDegree) {
				//add dof for advice placements //TODO meta-model?
				this.cvChoices.add(c);
			}
		}

		//TODO check if choices are consistent/valid (selected cvs are supported by selected solution
		int checkedSolutionsCounter = 0; //to prevent an infinite loop if there is no appropriate solution
		boolean solutionChoiceValid = checkSolutionChoiceValid();
		if (!solutionChoiceValid && checkedSolutionsCounter < 20) {	//TODO constant choice?
			//TODO this is a dirty fix, what if no valid solutions exists??
			List<EObject> solutions = ((FeatureCompletionDegree) fccChoice.getDegreeOfFreedomInstance()).getClassDesignOptions();
			fccChoice.setValue(solutions.get(new Random().nextInt(solutions.size())));
			grabChoices(notTransformedChoices);
		}


		notTransformedChoices.remove(this.fccChoice);
		notTransformedChoices.remove(this.multipleInclusionChoice);
		for (Choice fc : this.featureChoices) {
			notTransformedChoices.remove(fc);
		}
		for (Choice ac : this.allocationChoices) {
			notTransformedChoices.remove(ac);
		}
		for (Choice ac : this.advicePlacementChoices) {
			notTransformedChoices.remove(ac);
		}
		for (Choice c : this.cvChoices) {
			notTransformedChoices.remove(c);
		}
	}

	/**
	 * @return
	 */
	private boolean checkSolutionChoiceValid() {
		Repository solution = (Repository) this.fccChoice.getValue();
		List<ComplementumVisnetis> cvs = this.cvChoices.stream().map(choice -> (ComplementumVisnetis) choice.getValue()).collect(Collectors.toList());
		//add optional cvs if selected
		for (Choice choice : featureChoices) {
			if (((FeatureChoice) choice).isSelected()) {
				cvs.add((ComplementumVisnetis) ((FeatureChoice) choice).getDegreeOfFreedomInstance().getPrimaryChanged());
			}
		}

		FCCFeatureHandler featureHandler = new FCCFeatureHandler(new SolutionManager(solution));
		List<ComplementumVisnetis> supportedCVs = featureHandler.extractProvidedCVs().stream().map(pair -> pair.second).collect(Collectors.toList());

		boolean valid = cvs.stream().allMatch(cv -> supportedCVs.stream().anyMatch(supportedCV -> supportedCV.getId().equals(cv.getId())));
		java.lang.System.out.println("------------ checkChoicesValid: " + valid + " -----------");
		return valid;
	}

	private void addAllocationDegreeIfNeeded(Choice ac) {
		boolean hasFCC = this.isAllocationDegreeWithFCC(ac.getDegreeOfFreedomInstance());
		if (!hasFCC) {
			return;
		}
		this.allocationChoices.add(ac);
	}

	private boolean isAllocationDegreeWithFCC(DegreeOfFreedomInstance degreeOfFreedomInstance) {
		return degreeOfFreedomInstance instanceof AllocationDegree && degreeOfFreedomInstance.getPrimaryChanged() instanceof CompletionComponent;
	}

	public PCMInstance getWeavedInstance(PCMInstance pcmToAdopt) {
		//List<String> calls = ((ExtensionWeavingStrategy) this.strategy).getWeavedExternalCalls();
		this.unweave(pcmToAdopt);

		// PCMInstance pcmToAdopt = new
		// PCMInstance(this.getCopyOfUnweavedPCMPartition());
		Repository solution = (Repository) this.fccChoice.getValue();
		InclusionMechanism im = this.determineIM(Arrays.asList(solution));
		WeavingStrategies.Constructor strategyContructor = this.determineStrategy(im);

		List<Pair<ComplementumVisnetis, WeavingLocation>> locations = this.determineLocations(pcmToAdopt);
		this.strategy = strategyContructor.create(pcmToAdopt, solution, this.fc, im);
		this.strategy.initialize(locations, this.fccChoice, this.featureChoices, this.allocationChoices, this.multipleInclusionChoice, this.advicePlacementChoices, this.cvChoices);
		this.strategy.weave();
		return pcmToAdopt;
	}

	private void unweave(PCMInstance pcmToAdopt) {
		List<String> neccessaryIds = this.availableCVs.stream().map(t -> t.first).collect(Collectors.toList());
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
		
		//unweave external calls
		Map<String, ExternalCallActionData> copyExternalCallIDs = this.saveOriginalExternalCalls(pcmToAdopt.getSystem());
		for (Entry<String, ExternalCallActionData> copyExternalCallID : copyExternalCallIDs.entrySet()) {
			if (!this.originalExternalCalls.containsKey(copyExternalCallID.getKey()) && !this.existsConnectorWithProvidedRole(copyExternalCallID.getValue().getOperationRequiredRoleId())) {
				this.removeExternalCallAction(copyExternalCallID.getKey(), pcmToAdopt);
			}
		}
	}

	/**
	 * @param key
	 * @param pcmToAdopt
	 */
	private void removeExternalCallAction(String key, PCMInstance pcmToAdopt) {
		for (AssemblyContext ac : pcmToAdopt.getSystem().getAssemblyContexts__ComposedStructure()) {
			BasicComponent comp = (BasicComponent) ac.getEncapsulatedComponent__AssemblyContext();
			for (ServiceEffectSpecification seff : comp.getServiceEffectSpecifications__BasicComponent()) {
				for (ExternalCallAction externalCallAction : this.getExternalCallActions((ResourceDemandingBehaviour) seff)) {
					if (externalCallAction.getId().equals(key)) {
						//remove call action
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

	/**
	 * @param operationRequiredRoleId
	 * @return
	 */
	private boolean existsConnectorWithProvidedRole(String operationRequiredRoleId) {
		for ( Entry<String, AssemblyConnectorData> c : this.originalAssemblyConnectors.entrySet()) {
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

		AssemblyConnector requiredEnd = (AssemblyConnector) FCCWeaver.getConnectorBy(system, currentId + "-requiredEnd");
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

	public List<Choice> getConvertedFCCClassChoices() {
		return this.strategy.getConvertedFCCClassChoices();
	}

	private List<Pair<ComplementumVisnetis, WeavingLocation>> determineLocations(PCMInstance original) {
		List<Pair<ComplementumVisnetis, WeavingLocation>> result = new ArrayList<>();
		System pcmSystem = original.getSystem();

		for (Pair<String, ComplementumVisnetis> connector : this.availableCVs) {
			List<WeavingLocation> location = LocationExtractor.extractLocation(connector, original);
			result.addAll(this.getPairs(Pair.of(FCCWeaver.getConnectorBy(pcmSystem, connector.first), connector.second), location));
		}
		return result;
	}

	private static Connector getConnectorBy(System pcmSystem, String connectorID) {
		for (Connector connector : pcmSystem.getConnectors__ComposedStructure()) {
			if (connector.getId().equals(connectorID)) {
				return connector;
			}
		}
		return null;
	}

	private Collection<? extends Pair<ComplementumVisnetis, WeavingLocation>> getPairs(Pair<Connector, ComplementumVisnetis> connector, List<WeavingLocation> locations) {
		List<Pair<ComplementumVisnetis, WeavingLocation>> result = new ArrayList<>();
		for (WeavingLocation location : locations) {
			result.add(Pair.of(connector.second, location));
		}
		return result;
	}

	private List<Pair<String, ComplementumVisnetis>> extractAvailableCVs(System pcmSystem) {
		List<Pair<String, ComplementumVisnetis>> result = new ArrayList<>();

		for (Connector c : pcmSystem.getConnectors__ComposedStructure()) {
			List<ComplementumVisnetis> cv = StereotypeAPIHelper.getViaStereoTypeFrom(c, ComplementumVisnetis.class, "target");
			if (cv.isEmpty()) {
				continue;
			}
			result.add(Pair.of(c.getId(), cv.get(0)));
		}

		return result;
	}

	public List<Repository> getSolutionRepositories() {
		return this.solutions;
	}

	private InclusionMechanism determineIM(List<Repository> solutions) {
		InclusionMechanism meachanism = null;
		for (Repository repo : solutions) {
			List<InclusionMechanism> meachanisms = StereotypeAPIHelper.getViaStereoTypeFrom(repo, InclusionMechanism.class, "transformation");
			if (meachanisms.size() != 1) {
				continue;
			}
			if (meachanism == null) {
				meachanism = meachanisms.get(0);
			} else if (!meachanism.getId().equals(meachanisms.get(0).getId())) {
				throw new FCCWeaverException("Multiple InclusionMechanisms are not supported yet.");
			}
		}
		return meachanism;
	}

	private WeavingStrategies.Constructor determineStrategy(InclusionMechanism im) {
		WeavingStrategies.Constructor strategy = WeavingStrategies.getStrategy(im);
		if (strategy == null) {
			throw new FCCWeaverException("No Strategy found for " + im);
		}
		return strategy;
	}
}
