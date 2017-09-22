package de.uka.ipd.sdq.dsexplore.concernweaving.util;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.palladiosimulator.pcm.allocation.AllocationContext;
import org.palladiosimulator.pcm.repository.RepositoryComponent;
import org.palladiosimulator.pcm.resourceenvironment.ResourceContainer;
import org.palladiosimulator.solver.models.PCMInstance;

import ConcernModel.Concern;
import ConcernModel.ElementaryConcernComponent;
import SolutionModel.Solution;
import de.uka.ipd.sdq.pcm.designdecision.Choice;
import de.uka.ipd.sdq.pcm.designdecision.ClassChoice;
import de.uka.ipd.sdq.pcm.designdecision.DegreeOfFreedomInstance;
import de.uka.ipd.sdq.pcm.designdecision.impl.designdecisionFactoryImpl;
import de.uka.ipd.sdq.pcm.designdecision.specific.AllocationDegree;
import de.uka.ipd.sdq.pcm.designdecision.specific.ConcernDegree;
import de.uka.ipd.sdq.pcm.designdecision.specific.FeatureDegree;
import de.uka.ipd.sdq.pcm.designdecision.specific.impl.specificFactoryImpl;
import edu.kit.ipd.are.dsexplore.concern.exception.ConcernWeavingException;
import edu.kit.ipd.are.dsexplore.concern.exception.ErrorMessage;
import edu.kit.ipd.are.dsexplore.concern.handler.ECCStructureHandler;
import edu.kit.ipd.are.dsexplore.concern.manager.ConcernSolutionManager;
import edu.kit.ipd.are.dsexplore.concern.manager.PcmAllocationManager;
import edu.kit.ipd.are.dsexplore.concern.util.Pair;

//XXX This implementation assumes that only one concern is going to be woven.
public class WeavingExecuter {

	private Pair<Concern, Solution> concernWithSolutionPair;
	private List<ClassChoice> eccClassChoices = new ArrayList<>();
	private PCMInstance wovenPCM = null;
	/**
	 * The list maps {@link FeatureDegree FeatureDegrees} to their {@link Choice
	 * Choices}
	 *
	 * @author Dominik Fuchss
	 */
	private List<Pair<FeatureDegree, Choice>> optChoice;

	public WeavingExecuter(List<Choice> choices) {
		this.initialize(choices);
	}

	private void initialize(List<Choice> choices) {
		Optional<ClassChoice> concernChoice = this.getConcernChoiceFrom(choices);
		if (!concernChoice.isPresent()) {
			return;
		}
		choices.remove(concernChoice.get());
		this.initSolutionMap(concernChoice.get());
		this.initECCClassChoices(choices);
		this.initOptionalDegrees(choices);

	}

	/**
	 * Initialize {@link FeatureDegree}-Choices (delete them from list of
	 * choices, as they will processed in another way)
	 *
	 * @param choices
	 *            the list of choices
	 * @author Dominik Fuchss
	 */
	private void initOptionalDegrees(List<Choice> choices) {
		this.optChoice = new ArrayList<>();
		for (Choice ch : choices) {
			DegreeOfFreedomInstance dofi = ch.getDegreeOfFreedomInstance();
			if (dofi instanceof FeatureDegree) {
				this.optChoice.add(Pair.of((FeatureDegree) dofi, ch));
			}
		}
		choices.removeIf(ch -> ch.getDegreeOfFreedomInstance() instanceof FeatureDegree);
	}

	private void initSolutionMap(ClassChoice concernChoice) {
		this.concernWithSolutionPair = Pair.of(this.getConcernFrom(concernChoice), (Solution) concernChoice.getChosenValue());
	}

	private void initECCClassChoices(List<Choice> choices) {
		List<ClassChoice> eccAllocDegrees = this.getAllocDegreesRelatedTo(this.concernWithSolutionPair.getFirst(), choices);
		this.eccClassChoices.addAll(eccAllocDegrees);
		choices.removeAll(eccAllocDegrees);
	}

	private Optional<ClassChoice> getConcernChoiceFrom(List<Choice> choices) {
		for (Choice c : choices) {
			if (this.isConcernDegree(c.getDegreeOfFreedomInstance())) {
				return Optional.of((ClassChoice) c);
			}
		}
		return Optional.empty();
	}

	private List<ClassChoice> getAllocDegreesRelatedTo(Concern concern, List<Choice> notTransformedChoices) {
		List<ClassChoice> res = new ArrayList<>();
		for (Choice choice : notTransformedChoices) {
			if (this.isAllocationDegreeWithECC(choice.getDegreeOfFreedomInstance()) && this.isRelatedTo(concern, (AllocationDegree) choice.getDegreeOfFreedomInstance())) {
				res.add((ClassChoice) choice);
			}
		}
		return res;

	}

	private Concern getConcernFrom(ClassChoice concernChoice) {
		ConcernDegree concernDegree = (ConcernDegree) concernChoice.getDegreeOfFreedomInstance();
		return (Concern) (concernDegree).getPrimaryChanged();
	}

	private Concern getConcernFrom(AllocationDegree allocDegree) {
		ElementaryConcernComponent ecc = (ElementaryConcernComponent) allocDegree.getPrimaryChanged();
		return (Concern) ecc.eContainer();
	}

	private boolean isConcernDegree(DegreeOfFreedomInstance degreeOfFreedomInstance) {
		return degreeOfFreedomInstance instanceof ConcernDegree;
	}

	private boolean isAllocationDegreeWithECC(DegreeOfFreedomInstance degreeOfFreedomInstance) {
		return degreeOfFreedomInstance instanceof AllocationDegree && ((AllocationDegree) degreeOfFreedomInstance).getPrimaryChanged() instanceof ElementaryConcernComponent;
	}

	private boolean isRelatedTo(Concern concern, AllocationDegree allocDegree) {
		String expectedConcernName = concern.getName();
		String actualConcernName = this.getConcernFrom(allocDegree).getName();
		return expectedConcernName.equals(actualConcernName);
	}

	public PCMInstance getWeavedPCMInstanceOf(PCMInstance pcm) throws ConcernWeavingException, IOException {
		if (!WeavingManager.getInstance().isPresent()) {
			return pcm;
		}
		WeavingManager weavingManager = WeavingManager.getInstance().orElseThrow(() -> new ConcernWeavingException(ErrorMessage.weavingManagerIsNotInitialized()));
		this.wovenPCM = weavingManager.getWeavedPCMInstanceOf(this.concernWithSolutionPair.getFirst(), this.concernWithSolutionPair.getSecond(), this.getECCAllocationMap(), this.optChoice);
		return this.wovenPCM;
	}

	private Map<ElementaryConcernComponent, ResourceContainer> getECCAllocationMap() {
		Map<ElementaryConcernComponent, ResourceContainer> eccAllocationMap = new HashMap<>();
		for (ClassChoice eccClassChoice : this.eccClassChoices) {
			ElementaryConcernComponent ecc = (ElementaryConcernComponent) eccClassChoice.getDegreeOfFreedomInstance().getPrimaryChanged();
			ResourceContainer chosenResourceContainer = (ResourceContainer) eccClassChoice.getChosenValue();
			eccAllocationMap.put(ecc, chosenResourceContainer);
		}
		return eccAllocationMap;
	}

	public List<ClassChoice> getConvertedECCClassChoices() {
		if (!this.checkIfPCMInstanceWasWoven()) {
			return Collections.emptyList();
		}

		PcmAllocationManager allocManager = PcmAllocationManager.getInstanceBy(this.wovenPCM.getAllocation());
		List<ClassChoice> allocChoices = new ArrayList<>();

		for (ClassChoice eccClassChoice : this.eccClassChoices) {
			ElementaryConcernComponent ecc = (ElementaryConcernComponent) eccClassChoice.getDegreeOfFreedomInstance().getPrimaryChanged();
			ECCStructureHandler eccHandler = new ECCStructureHandler(ecc, ConcernSolutionManager.getInstanceBy(this.concernWithSolutionPair.getSecond()));
			for (RepositoryComponent comp : eccHandler.getStructureOfECCAccordingTo(component -> Arrays.asList(component))) {
				try {
					AllocationContext alloc = allocManager.getAllocationContextContaining(comp);
					AllocationDegree ad = specificFactoryImpl.init().createAllocationDegree();
					ad.setPrimaryChanged(alloc);
					ClassChoice choice = designdecisionFactoryImpl.init().createClassChoice();
					choice.setDegreeOfFreedomInstance(ad);
					choice.setChosenValue(eccClassChoice.getChosenValue());
					allocChoices.add(choice);
				} catch (Exception e) {
					// Can be ignored
				}
			}
		}
		return allocChoices;
	}

	private boolean checkIfPCMInstanceWasWoven() {
		return !(this.wovenPCM == null);
	}

}
