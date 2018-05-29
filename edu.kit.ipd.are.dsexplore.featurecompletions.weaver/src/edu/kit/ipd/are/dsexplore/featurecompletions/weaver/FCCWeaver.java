package edu.kit.ipd.are.dsexplore.featurecompletions.weaver;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;

import org.palladiosimulator.analyzer.workflow.blackboard.PCMResourceSetPartition;
import org.palladiosimulator.pcm.core.composition.Connector;
import org.palladiosimulator.pcm.core.entity.Entity;
import org.palladiosimulator.pcm.repository.Interface;
import org.palladiosimulator.pcm.repository.OperationInterface;
import org.palladiosimulator.pcm.repository.OperationSignature;
import org.palladiosimulator.pcm.repository.Repository;
import org.palladiosimulator.pcm.repository.RepositoryComponent;
import org.palladiosimulator.pcm.system.System;
import org.palladiosimulator.solver.models.PCMInstance;

import FeatureCompletionModel.ComplementumVisnetis;
import de.uka.ipd.sdq.dsexplore.tools.primitives.Pair;
import de.uka.ipd.sdq.dsexplore.tools.repository.MergedRepository;
import de.uka.ipd.sdq.dsexplore.tools.stereotypeapi.StereotypeAPIHelper;
import de.uka.ipd.sdq.pcm.cost.CostRepository;
import de.uka.ipd.sdq.pcm.designdecision.Choice;
import edu.kit.ipd.are.dsexplore.featurecompletions.weaver.port.FCCWeaverException;
import edu.kit.ipd.are.dsexplore.featurecompletions.weaver.strategy.IWeavingStrategy;
import edu.kit.ipd.are.dsexplore.featurecompletions.weaver.strategy.WeavingInstruction;
import edu.kit.ipd.are.dsexplore.featurecompletions.weaver.strategy.WeavingLocation;
import edu.kit.ipd.are.dsexplore.featurecompletions.weaver.strategy.WeavingStrategies;
import edu.kit.ipd.are.dsexplore.featurecompletions.weaver.util.LocationExtractor;
import featureSolution.InclusionMechanism;

public final class FCCWeaver {
	public final static String ADAPTER_NAME = "Adapter";
	public final static String CONCERN_REPOSITORY_NAME = "TemporaryConcernRepository";
	public final static String CONCERN_REPSITORY_DESCRIPTION = "Include components of all reused concerns.";

	private final MergedRepository mergedRepo;
	private final IWeavingStrategy strategy;

	public FCCWeaver(PCMResourceSetPartition initialPartition, PCMInstance pcm, MergedRepository solutions, CostRepository costModel) {
		this.mergedRepo = solutions;
		this.strategy = this.determineStrategy(solutions).apply(pcm, solutions);

	}

	private BiFunction<PCMInstance, MergedRepository, IWeavingStrategy> determineStrategy(MergedRepository solutions) {
		InclusionMechanism meachanism = null;
		for (Repository repo : solutions) {
			List<InclusionMechanism> meachanisms = StereotypeAPIHelper.getViaStereoTypeFrom(repo, InclusionMechanism.class, "transformation");
			if (meachanisms.size() != 0) {
				continue;
			}
			if (meachanism == null) {
				meachanism = meachanisms.get(0);
			} else if (!meachanism.getId().equals(meachanisms.get(0).getId())) {
				throw new FCCWeaverException("Multiple InclusionMechanisms are not supported yet.");
			}
		}

		BiFunction<PCMInstance, MergedRepository, IWeavingStrategy> strategy = WeavingStrategies.getStrategy(meachanism);
		if (strategy == null) {
			throw new FCCWeaverException("No Strategy found for " + meachanism);
		}
		return strategy;
	}

	public void nextDecodeStart() {

	}

	public void grabChoices(List<Choice> notTransformedChoices) {

	}

	public PCMInstance getWeavedInstance(PCMInstance original) {
		List<Pair<ComplementumVisnetis, WeavingLocation>> locations = this.determineLocations(original);

		List<WeavingInstruction> instructions = this.determineInstructions(original);

		return original;
	}

	private List<Pair<ComplementumVisnetis, WeavingLocation>> determineLocations(PCMInstance original) {
		List<Pair<ComplementumVisnetis, WeavingLocation>> result = new ArrayList<>();
		System pcmSystem = original.getSystem();
		List<Pair<Connector, ComplementumVisnetis>> availableCVs = this.extractAvailableCVs(pcmSystem);
		for (Pair<Connector, ComplementumVisnetis> connector : availableCVs) {
			WeavingLocation location = LocationExtractor.extractLocation(connector, original);
			result.add(Pair.of(connector.second, location));
		}

		return result;
	}

	private List<WeavingInstruction> determineInstructions(PCMInstance original) {
		System pcmSystem = original.getSystem();
		List<Pair<Connector, ComplementumVisnetis>> availableCVs = this.extractAvailableCVs(pcmSystem);
		List<Pair<Entity, ComplementumVisnetis>> providedCVs = this.extractProvidedCVs();

		return null;
	}

	private List<Pair<Connector, ComplementumVisnetis>> extractAvailableCVs(System pcmSystem) {
		List<Pair<Connector, ComplementumVisnetis>> result = new ArrayList<>();

		for (Connector c : pcmSystem.getConnectors__ComposedStructure()) {
			List<ComplementumVisnetis> cv = StereotypeAPIHelper.getViaStereoTypeFrom(c, ComplementumVisnetis.class, "target");
			if (cv.isEmpty()) {
				continue;
			}
			result.add(Pair.of(c, cv.get(0)));
		}

		return result;
	}

	private List<Pair<Entity, ComplementumVisnetis>> extractProvidedCVs() {
		List<Pair<Entity, ComplementumVisnetis>> result = new ArrayList<>();

		for (Repository pcmRepo : this.mergedRepo) {
			for (RepositoryComponent rc : pcmRepo.getComponents__Repository()) {
				List<ComplementumVisnetis> cvsRc = StereotypeAPIHelper.getViaStereoTypeFrom(rc, ComplementumVisnetis.class, "fulfillsComplementumVisnetis");
				for (ComplementumVisnetis cv : cvsRc) {
					result.add(Pair.of(rc, cv));
				}
			}
			for (Interface iface : pcmRepo.getInterfaces__Repository()) {
				if (!(iface instanceof OperationInterface)) {
					continue;
				}
				OperationInterface opIface = (OperationInterface) iface;
				List<ComplementumVisnetis> cvsIface = StereotypeAPIHelper.getViaStereoTypeFrom(opIface, ComplementumVisnetis.class, "fulfillsComplementumVisnetis");
				for (ComplementumVisnetis cv : cvsIface) {
					result.add(Pair.of(opIface, cv));
				}

				for (OperationSignature opSig : opIface.getSignatures__OperationInterface()) {
					List<ComplementumVisnetis> cvsSig = StereotypeAPIHelper.getViaStereoTypeFrom(opSig, ComplementumVisnetis.class, "fulfillsComplementumVisnetis");
					for (ComplementumVisnetis cv : cvsSig) {
						result.add(Pair.of(opSig, cv));
					}
				}
			}
		}

		return result;
	}

	public MergedRepository getMergedRepo() {
		return this.mergedRepo;
	}

	public List<Choice> getConvertedFCCClassChoices() {
		return new ArrayList<>();
	}

}
