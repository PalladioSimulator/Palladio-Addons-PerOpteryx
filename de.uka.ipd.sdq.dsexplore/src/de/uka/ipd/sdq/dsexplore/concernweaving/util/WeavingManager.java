package de.uka.ipd.sdq.dsexplore.concernweaving.util;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Map;
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

import FeatureCompletionModel.CompletionComponent;
import FeatureCompletionModel.FeatureCompletion;
import de.uka.ipd.sdq.dsexplore.helper.EMFHelper;
import de.uka.ipd.sdq.dsexplore.helper.StereotypeApiHelper;
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
		private final List<Cost> originalCostsFromMainModel;
		private final List<ComponentCost> componentCosts;

		public PCMCostManager(String costModelFileName, List<Cost> cachedCosts, Repository mergedRepo) {
			this.costModelFileName = costModelFileName;
			this.originalCostsFromMainModel = new ArrayList<>();
			this.componentCosts = new ArrayList<>();
			// this.concernSolutionToComponentsCostsMap = new TreeMap<>((s1, s2)
			// -> s1.getName().compareTo(s2.getName()));

			this.initialize(mergedRepo, cachedCosts);
		}

		private void initialize(Repository mergedRepo, List<Cost> cachedCosts) {
			List<CostRepository> costRepos = StereotypeApiHelper.getViaStereoTypeFrom(mergedRepo, CostRepository.class);
			for (CostRepository costRepo : costRepos) {

				List<ComponentCost> costs = this.filterOnlyComponentsCostsFrom(costRepo);
				this.componentCosts.addAll(costs);
			}
			for (Cost c : cachedCosts) {
				this.originalCostsFromMainModel.add(EcoreUtil.copy(c));
			}
		}

		private List<ComponentCost> filterOnlyComponentsCostsFrom(CostRepository costRepo) {
			List<ComponentCost> cc = new ArrayList<>();
			for (Cost cost : costRepo.getCost()) {
				if (cost instanceof ComponentCost) {
					cc.add((ComponentCost) cost);
				}
			}
			return cc;
		}

		public void updateCostModelBy(boolean cleanup) throws IOException {
			if (this.originalCostsFromMainModel.isEmpty()) {
				return;
			}

			Optional<CostRepository> original = this.getCostModel();
			if (!original.isPresent()) {
				return;
			}
			CostRepository cr = original.get();
			cr.getCost().clear();
			cr.getCost().addAll(this.originalCostsFromMainModel);
			if (!cleanup) {
				cr.getCost().addAll(this.componentCosts);
			}
			cr.eResource().save(Collections.EMPTY_MAP);

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

	public static void initialize(MDSDBlackboard blackboard, PCMResourceSetPartition unweavedPCMPartition, String costModelFileName, List<Cost> costsToCache, Repository mergedRepo) {
		if (WeavingManager.instance == null) {
			WeavingManager.instance = new WeavingManager();
		}
		WeavingManager.instance.setPCMPartitionManager(blackboard, unweavedPCMPartition);
		WeavingManager.instance.setPCMCostManager(costModelFileName, costsToCache, mergedRepo);
	}

	public static Optional<WeavingManager> getInstance() {
		return WeavingManager.instance == null ? Optional.empty() : Optional.of(WeavingManager.instance);
	}

	private void setPCMPartitionManager(MDSDBlackboard blackboard, PCMResourceSetPartition unweavedPCMPartition) {
		this.pcmPartitionManager = new PCMPartitionManager(blackboard, unweavedPCMPartition);
	}

	private void setPCMCostManager(String costModelFileName, List<Cost> costsToCache, Repository mergedRepos) {
		this.pcmCostManager = Optional.of(new PCMCostManager(costModelFileName, costsToCache, mergedRepos));
	}

	public PCMInstance getWeavedPCMInstanceOf(FeatureCompletion fc, Repository mergedRepo, Map<CompletionComponent, ResourceContainer> eccAllocationMap, List<Pair<FeatureDegree, Choice>> optChoice)
			throws ConcernWeavingException, IOException {

		PCMResourceSetPartition pcmPartition = this.pcmPartitionManager.getCopyOfUnweavedPCMPartition();
		PCMInstance pcm = new PCMInstance(pcmPartition);
		new WeavingJob(fc, pcm, eccAllocationMap, mergedRepo).execute(optChoice);

		this.pcmPartitionManager.updatePCMResourcePartitionWith(pcmPartition);

		if (this.pcmCostManager.isPresent()) {
			this.pcmCostManager.get().updateCostModelBy(false);
		}

		return pcm;

	}

	/**
	 * Perform cleanup jobs (e.g. CostRepo)
	 *
	 * @author Dominik Fuchss
	 * @throws IOException
	 *             - if cost model cannot be saved
	 */
	public static void cleanup() throws IOException {
		WeavingManager instance = WeavingManager.getInstance().orElse(null);
		if (instance == null) {
			return;
		}
		PCMCostManager cm = instance.pcmCostManager.orElse(null);
		if (cm == null) {
			return;
		}
		cm.updateCostModelBy(true);

	}

}
