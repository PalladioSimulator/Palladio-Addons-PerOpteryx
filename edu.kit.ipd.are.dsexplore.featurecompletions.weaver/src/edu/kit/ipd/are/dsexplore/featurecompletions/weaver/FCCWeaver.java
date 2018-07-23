package edu.kit.ipd.are.dsexplore.featurecompletions.weaver;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.util.EcoreUtil.Copier;
import org.palladiosimulator.analyzer.workflow.blackboard.PCMResourceSetPartition;
import org.palladiosimulator.pcm.core.composition.Connector;
import org.palladiosimulator.pcm.repository.Repository;
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
import de.uka.ipd.sdq.pcm.designdecision.specific.AllocationDegree;
import de.uka.ipd.sdq.pcm.designdecision.specific.FeatureCompletionDegree;
import de.uka.ipd.sdq.pcm.designdecision.specific.FeatureDegree;
import de.uka.ipd.sdq.workflow.mdsd.blackboard.MDSDBlackboard;
import edu.kit.ipd.are.dsexplore.featurecompletions.weaver.extensions.FCCProblemExtension;
import edu.kit.ipd.are.dsexplore.featurecompletions.weaver.port.FCCWeaverException;
import edu.kit.ipd.are.dsexplore.featurecompletions.weaver.strategy.IWeavingStrategy;
import edu.kit.ipd.are.dsexplore.featurecompletions.weaver.strategy.WeavingLocation;
import edu.kit.ipd.are.dsexplore.featurecompletions.weaver.strategy.WeavingStrategies;
import edu.kit.ipd.are.dsexplore.featurecompletions.weaver.util.LocationExtractor;
import featureSolution.InclusionMechanism;

public final class FCCWeaver {
	public final static String ADAPTER_NAME = "Adapter";
	public final static String CONCERN_REPOSITORY_NAME = "TemporaryConcernRepository";
	public final static String CONCERN_REPSITORY_DESCRIPTION = "Include components of all reused concerns.";

	private final List<Repository> solutions;
	private final FeatureCompletion fc;
	private final MDSDBlackboard blackboard;
	private final List<Pair<String, ComplementumVisnetis>> availableCVs;

	public FCCWeaver(MDSDBlackboard blackboard, List<Repository> solutions, CostRepository costModel) {
		this.solutions = solutions;
		this.blackboard = blackboard;
		PCMResourceSetPartition inital = (PCMResourceSetPartition) blackboard.getPartition(FCCProblemExtension.INITIAL_PCM_MODEL_PARTITION_ID);
		this.fc = this.determineFC(inital);
		// ConnectorID -> CV
		this.availableCVs = this.extractAvailableCVs(inital.getSystem());

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

	private IWeavingStrategy strategy;

	public void nextDecodeStart() {
		this.fccChoice = null;
		this.multipleInclusionChoice = null;
		this.featureChoices = new ArrayList<>();
		this.allocationChoices = new ArrayList<>();
		this.advicePlacementChoices = new ArrayList<>();
	}

	public void grabChoices(List<Choice> notTransformedChoices) {
		for (Choice c : notTransformedChoices) {
			if (c.getDegreeOfFreedomInstance() instanceof FeatureCompletionDegree) {
				this.fccChoice = c;
			} else if (c.getDegreeOfFreedomInstance() instanceof FeatureDegree && c.getDegreeOfFreedomInstance().getEntityName().equals("multiple_inclusion")) {
				//add dof for multiple-flag in inclusion mechanism
				this.multipleInclusionChoice = c;
			} else if (c.getDegreeOfFreedomInstance() instanceof FeatureDegree && c.getDegreeOfFreedomInstance().getEntityName().equals("advice")) {
				//add dof for advice placements
				this.advicePlacementChoices.add(c);
			} else if (c.getDegreeOfFreedomInstance() instanceof FeatureDegree) {
				this.featureChoices.add(c);
			} else if (c.getDegreeOfFreedomInstance() instanceof AllocationDegree) {
				this.addAllocationDegreeIfNeeded(c);
			}
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

	public PCMInstance getWeavedInstance() {

		PCMInstance pcmToAdopt = new PCMInstance(this.getCopyOfUnweavedPCMPartition());
		Repository solution = (Repository) this.fccChoice.getValue();
		InclusionMechanism im = this.determineIM(Arrays.asList(solution));
		WeavingStrategies.Constructor strategyContructor = this.determineStrategy(im);

		List<Pair<ComplementumVisnetis, WeavingLocation>> locations = this.determineLocations(pcmToAdopt);
		this.strategy = strategyContructor.create(pcmToAdopt, solution, this.fc, im);
		this.strategy.initialize(locations, this.fccChoice, this.featureChoices, this.allocationChoices, this.multipleInclusionChoice, this.advicePlacementChoices);
		this.strategy.weave();
		return pcmToAdopt;
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

	private PCMResourceSetPartition getCopyOfUnweavedPCMPartition() {
		PCMResourceSetPartition original = (PCMResourceSetPartition) this.blackboard.getPartition(FCCProblemExtension.INITIAL_PCM_MODEL_PARTITION_ID);
		PCMResourceSetPartition copy = new PCMResourceSetPartition();
		ResourceSet copyResourceSet = copy.getResourceSet();
		List<Resource> resourceList = original.getResourceSet().getResources();
		Copier copier = new Copier();
		for (Resource resource : resourceList) {
			if (resource.getURI().toString().contains("pathmap")) {
				copy.loadModel(resource.getURI());
			} else {
				Collection<EObject> copiedContent = copier.copyAll(resource.getContents());
				Resource newResource = copyResourceSet.createResource(URI.createURI(resource.getURI().toString()));
				newResource.getContents().addAll(copiedContent);
			}
		}
		copier.copyReferences();
		return copy;
	}
}
