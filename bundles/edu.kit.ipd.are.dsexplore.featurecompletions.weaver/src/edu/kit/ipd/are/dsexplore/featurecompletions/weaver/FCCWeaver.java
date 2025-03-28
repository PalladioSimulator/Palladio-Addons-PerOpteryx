package edu.kit.ipd.are.dsexplore.featurecompletions.weaver;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.palladiosimulator.analyzer.workflow.core.blackboard.PCMResourceSetPartition;
import org.palladiosimulator.pcm.core.composition.Connector;
import org.palladiosimulator.pcm.repository.Repository;
import org.palladiosimulator.pcm.system.System;
import org.palladiosimulator.solver.core.models.PCMInstance;

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
import de.uka.ipd.sdq.workflow.mdsd.blackboard.MDSDBlackboard;
import edu.kit.ipd.are.dsexplore.featurecompletions.weaver.extensions.FCCProblemExtension;
import edu.kit.ipd.are.dsexplore.featurecompletions.weaver.port.FCCWeaverException;
import edu.kit.ipd.are.dsexplore.featurecompletions.weaver.strategy.IWeavingStrategy;
import edu.kit.ipd.are.dsexplore.featurecompletions.weaver.strategy.WeavingLocation;
import edu.kit.ipd.are.dsexplore.featurecompletions.weaver.strategy.WeavingStrategies;
import edu.kit.ipd.are.dsexplore.featurecompletions.weaver.util.LocationExtractor;
import featureSolution.InclusionMechanism;

/**
 * This class represents the entry point for weaving feature completions into
 * PCM models. All further actions are delegated to the corresponding weaving
 * strategy (depending on the inclusion mechanism).
 *
 * @author Dominik Fuchss
 * @author Maximilian Eckert (maximilian.eckert@student.kit.edu,
 *         maxieckert@web.de)
 *
 */
public final class FCCWeaver {
	public final static String ADAPTER_NAME = "Adapter";
	public final static String CONCERN_REPOSITORY_NAME = "TemporaryConcernRepository";
	public final static String CONCERN_REPSITORY_DESCRIPTION = "Include components of all reused concerns.";

	private final List<Repository> solutions;
	private final FeatureCompletion fc;
	private final InclusionMechanism im;
	private final System initialSystem;
	private final PCMResourceSetPartition initialPartition;

	// ConnectorID -> CV
	private final List<Pair<String, ComplementumVisnetis>> availableCVs;
	private final FCCUnweaver unweaver;

	public FCCWeaver(MDSDBlackboard blackboard, List<Repository> solutions, CostRepository costModel) {
		this.solutions = solutions;
		PCMResourceSetPartition initial = (PCMResourceSetPartition) blackboard.getPartition(FCCProblemExtension.INITIAL_PCM_MODEL_PARTITION_ID);
		this.initialPartition = initial;
		this.initialSystem = initial.getSystem();
		this.fc = this.determineFC(initial);
		this.im = this.determineIM(this.solutions);
		this.availableCVs = this.extractAvailableCVs(initial.getSystem());
		this.unweaver = new FCCUnweaver(blackboard);

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
	private List<Choice> allocationChoices;

	private IWeavingStrategy strategy;

	/**
	 * Resets choices and weaving strategy for next weaving iteration.
	 */
	public void nextDecodeStart() {
		this.fccChoice = null;
		this.allocationChoices = new ArrayList<>();
		WeavingStrategies.getStrategy(this.im).getExtension().nextDecodeStart();
	}

	/**
	 * Extracts feature completion specific choices for solution and allocation
	 * from dofs. Delegates all further choices to corresponding weaving
	 * strategy.
	 *
	 * @param notTransformedChoices
	 *            all choices.
	 */
	public void grabChoices(List<Choice> notTransformedChoices) {
		for (Choice c : notTransformedChoices) {
			if (c.getDegreeOfFreedomInstance() instanceof FeatureCompletionDegree) {
				this.fccChoice = c;
			} else if (c.getDegreeOfFreedomInstance() instanceof AllocationDegree) {
				this.addAllocationDegreeIfNeeded(c);
			}
		}
		notTransformedChoices.remove(this.fccChoice);
		for (Choice ac : this.allocationChoices) {
			notTransformedChoices.remove(ac);
		}

		this.determineStrategy(this.im).getExtension().grabChoices(this.fccChoice, notTransformedChoices);
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

	/**
	 * Returns the weaved PCM instance according to the extracted choices and
	 * set inclusion mechanism.
	 *
	 * @param pcmToAdopt
	 *            the PCM instance to be adopted.
	 * @return the weaved PCM instance.
	 */
	public PCMInstance getWeavedInstance(PCMInstance pcmToAdopt) {
		this.unweaver.unweave(pcmToAdopt, this.availableCVs);

		Repository solution = (Repository) this.fccChoice.getValue();
		WeavingStrategies.Constructor strategyContructor = this.determineStrategy(this.im).getConstructor();

		List<Pair<ComplementumVisnetis, WeavingLocation>> locations = this.determineLocations(pcmToAdopt);
		this.strategy = strategyContructor.create(pcmToAdopt, solution, this.fc, this.im);
		this.strategy.initialize(locations, this.fccChoice, this.allocationChoices);
		this.strategy.weave();
		return pcmToAdopt;
	}

	/**
	 * Returns the actual choices for FCC allocation. This can be done after the
	 * FCCs have been waved.
	 *
	 * @return the actual choices for FCC allocation.
	 */
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

	public InclusionMechanism getInclusionMechanism() {
		return this.im;
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

	private WeavingStrategies determineStrategy(InclusionMechanism im) {
		WeavingStrategies strategy = WeavingStrategies.getStrategy(im);
		if (strategy == null) {
			throw new FCCWeaverException("No Strategy found for " + im);
		}
		return strategy;
	}

	public System getInitialSystem() {
		return this.initialSystem;
	}

	public PCMResourceSetPartition getInitialPartition() {
		return this.initialPartition;
	}
}
