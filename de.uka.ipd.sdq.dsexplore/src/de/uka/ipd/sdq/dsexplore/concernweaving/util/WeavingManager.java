package de.uka.ipd.sdq.dsexplore.concernweaving.util;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Optional;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.EcoreUtil.Copier;
import org.palladiosimulator.analyzer.workflow.blackboard.PCMResourceSetPartition;
import org.palladiosimulator.pcm.repository.Repository;
import org.palladiosimulator.pcm.resourceenvironment.ResourceContainer;
import org.palladiosimulator.solver.models.PCMInstance;

import ConcernModel.Concern;
import ConcernModel.ElementaryConcernComponent;
import SolutionModel.Solution;
import de.uka.ipd.sdq.dsexplore.helper.EMFHelper;
import de.uka.ipd.sdq.dsexplore.launch.MoveInitialPCMModelPartitionJob;
import de.uka.ipd.sdq.pcm.cost.ComponentCost;
import de.uka.ipd.sdq.pcm.cost.Cost;
import de.uka.ipd.sdq.pcm.cost.CostRepository;
import de.uka.ipd.sdq.pcm.cost.costPackage;
import de.uka.ipd.sdq.pcm.designdecision.Choice;
import de.uka.ipd.sdq.pcm.designdecision.specific.FeatureDegree;
import de.uka.ipd.sdq.workflow.mdsd.blackboard.MDSDBlackboard;
import edu.kit.ipd.are.dsexplore.concern.exception.ConcernWeavingException;
import edu.kit.ipd.are.dsexplore.concern.util.Pair;

public class WeavingManager {

	private class PCMCostManager {
		private final String costModelFileName;
		private final List<Cost> cachedCosts;
		private final HashMap<String, List<ComponentCost>> concernSolutionToComponentsCostsMap;

		public PCMCostManager(String costModelFileName, List<Cost> cachedCosts, List<Solution> concernSolutions) {
			this.costModelFileName = costModelFileName;
			this.cachedCosts = new ArrayList<>();
			this.concernSolutionToComponentsCostsMap = new HashMap<>();

			this.initialize(concernSolutions, cachedCosts);
		}

		private void initialize(List<Solution> concernSolutions, List<Cost> cachedCosts) {
			for (Solution s : concernSolutions) {
				String id = s.getRepository().getId();
				List<ComponentCost> costs = this.filterOnlyComponentsCostsFrom((CostRepository) s.getCostRepository());
				this.concernSolutionToComponentsCostsMap.put(id, costs);
			}
			// concernSolutions.forEach(eachSolution ->
			// this.concernSolutionToComponentsCostsMap.put(eachSolution.getRepository().getId(),
			// this.filterOnlyComponentsCostsFrom((CostRepository)
			// eachSolution.getCostRepository())));

			for (Cost c : cachedCosts) {
				this.cachedCosts.add(EcoreUtil.copy(c));
			}
			// cachedCosts.forEach(eachCost ->
			// this.cachedCosts.add(EcoreUtil.copy(eachCost)));

		}

		private List<ComponentCost> filterOnlyComponentsCostsFrom(CostRepository costRepo) {
			List<ComponentCost> cc = new ArrayList<>();
			for (Cost cost : costRepo.getCost()) {
				if (cost instanceof ComponentCost) {
					cc.add((ComponentCost) cost);
				}
			}
			return cc;
			// return costRepo.getCost().stream().filter(eachCost -> eachCost
			// instanceof ComponentCost).map(eachCost -> (ComponentCost)
			// eachCost).collect(Collectors.toList());

		}

		public void updateCostModelBy(String id) throws IOException {
			if (this.cachedCosts.isEmpty()) {
				return;
			}

			Optional<CostRepository> original = this.getCostModel();
			if (!original.isPresent()) {
				return;
			}

			original.get().getCost().clear();
			original.get().getCost().addAll(this.cachedCosts);
			original.get().getCost().addAll(this.concernSolutionToComponentsCostsMap.get(id));

			original.get().eResource().save(Collections.EMPTY_MAP);

		}

		private Optional<CostRepository> getCostModel() {

			URI locationToLoadFrom = URI.createURI(this.costModelFileName);
			if (locationToLoadFrom == null || !locationToLoadFrom.isPlatform()) {
				locationToLoadFrom = URI.createFileURI(this.costModelFileName);
			}

			CostRepository cr = (CostRepository) EMFHelper.loadFromXMIFile(locationToLoadFrom, costPackage.eINSTANCE);
			return cr == null ? Optional.empty() : Optional.of(cr);

		}

	}

	private class PCMPartitionManager {

		private final MDSDBlackboard blackboard;
		private final PCMResourceSetPartition unweavedPCMPartition;

		public PCMPartitionManager(MDSDBlackboard blackboard, PCMResourceSetPartition unweavedPCMPartition) {
			this.blackboard = blackboard;
			this.unweavedPCMPartition = unweavedPCMPartition;
		}

		public void updatePCMResourcePartitionWith(PCMResourceSetPartition pcmPartition) {
			this.blackboard.addPartition(MoveInitialPCMModelPartitionJob.INITIAL_PCM_MODEL_PARTITION_ID, pcmPartition);
		}

		// Copied from LoadPCMModelsJob & PreparePCMBlackboardPartitionJob
		public PCMResourceSetPartition getCopyOfUnweavedPCMPartition() {
			PCMResourceSetPartition copy = new PCMResourceSetPartition();
			ResourceSet copyResourceSet = copy.getResourceSet();

			List<Resource> resourceList = this.unweavedPCMPartition.getResourceSet().getResources();

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

	private static WeavingManager instance = null;

	private PCMPartitionManager pcmPartitionManager;
	private Optional<PCMCostManager> pcmCostManager;

	private WeavingManager() {

	}

	public static void initialize(MDSDBlackboard blackboard, PCMResourceSetPartition unweavedPCMPartition) {
		if (WeavingManager.instance == null) {
			WeavingManager.instance = new WeavingManager();
		}
		WeavingManager.instance.setPCMPartitionManager(blackboard, unweavedPCMPartition);
		WeavingManager.instance.pcmCostManager = Optional.empty();
	}

	public static void initialize(MDSDBlackboard blackboard, PCMResourceSetPartition unweavedPCMPartition, String costModelFileName, List<Cost> costsToCache, List<Solution> concernSolutions) {
		if (WeavingManager.instance == null) {
			WeavingManager.instance = new WeavingManager();
		}
		WeavingManager.instance.setPCMPartitionManager(blackboard, unweavedPCMPartition);
		WeavingManager.instance.setPCMCostManager(costModelFileName, costsToCache, concernSolutions);
	}

	public static Optional<WeavingManager> getInstance() {
		return WeavingManager.instance == null ? Optional.empty() : Optional.of(WeavingManager.instance);
	}

	private void setPCMPartitionManager(MDSDBlackboard blackboard, PCMResourceSetPartition unweavedPCMPartition) {
		this.pcmPartitionManager = new PCMPartitionManager(blackboard, unweavedPCMPartition);
	}

	private void setPCMCostManager(String costModelFileName, List<Cost> costsToCache, List<Solution> concernSolutions) {
		this.pcmCostManager = Optional.of(new PCMCostManager(costModelFileName, costsToCache, concernSolutions));
	}

	public PCMInstance getWeavedPCMInstanceOf(Concern concern, Repository concernSolution, Map<ElementaryConcernComponent, ResourceContainer> eccAllocationMap,
			List<Pair<FeatureDegree, Choice>> optChoice) throws ConcernWeavingException, IOException {

		PCMResourceSetPartition pcmPartition = this.pcmPartitionManager.getCopyOfUnweavedPCMPartition();
		PCMInstance pcm = new PCMInstance(pcmPartition);
		new WeavingJob(concern, this.getConcernSolution(pcm, concernSolution.getId()), pcm, eccAllocationMap).execute(optChoice);

		this.pcmPartitionManager.updatePCMResourcePartitionWith(pcmPartition);

		if (this.pcmCostManager.isPresent()) {
			this.pcmCostManager.get().updateCostModelBy(concernSolution.getId());
		}

		return pcm;

	}

	private Repository getConcernSolution(PCMInstance pcm, String concernSolutionId) {
		List<Repository> repos = pcm.getRepositories();
		for (Repository repo : repos) {
			if (repo.getId().contentEquals(concernSolutionId)) {
				return repo;
			}
		}
		throw new NoSuchElementException();
		// return pcm.getRepositories().stream().filter(eachRepo ->
		// eachRepo.getId().equals(concernSolutionId)).findFirst().get();

	}

}
