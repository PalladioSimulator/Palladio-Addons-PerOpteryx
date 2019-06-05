package edu.kit.ipd.are.dsexplore.featurecompletions.weaver.strategy.handler;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.function.Function;
import java.util.stream.Collectors;

import org.eclipse.emf.common.util.EList;
import org.palladiosimulator.pcm.core.composition.AssemblyContext;
import org.palladiosimulator.pcm.repository.OperationProvidedRole;
import org.palladiosimulator.pcm.repository.RepositoryComponent;

import FeatureCompletionModel.CompletionComponent;
import FeatureCompletionModel.impl.ComplementumImpl;
import de.uka.ipd.sdq.dsexplore.tools.stereotypeapi.StereotypeAPIHelper;
import edu.kit.ipd.are.dsexplore.featurecompletions.weaver.strategy.manager.SolutionManager;

public class FCCStructureHandler {

	private final CompletionComponent fcc;
	private final SolutionManager mergedRepoManager;

	public FCCStructureHandler(CompletionComponent fcc, SolutionManager mergedRepoManager) {
		this.fcc = fcc;
		this.mergedRepoManager = mergedRepoManager;
	}

	public List<RepositoryComponent> getAffectedComponents() {
		return this.getAllAssociatedFCCs(false);
	}

	/**
	 * Determines all FCCs that are required by a specific FCC recursively.
	 *
	 * @param fcc
	 *            the FCC.
	 * @return all FCCs that are required by the FCC.
	 */
	public List<CompletionComponent> getFCCsRequiredBy(CompletionComponent fcc) {
		List<CompletionComponent> result = new ArrayList<>();
		if (!fcc.getRequiredComponents().isEmpty()) {
			EList<CompletionComponent> requiredFCCs = fcc.getRequiredComponents();
			result.addAll(requiredFCCs);
			for (CompletionComponent completionComponent : requiredFCCs) {
				result.addAll(this.getFCCsRequiredBy(completionComponent));
			}
		}
		return result;
	}

	public <T> List<T> getStructureOfFCCAndRequiredAccordingTo(Function<RepositoryComponent, List<T>> resolvingFunction) {
		List<T> structure = new ArrayList<>();
		for (RepositoryComponent c : this.getAllAssociatedFCCs(true)) {
			List<T> ls = resolvingFunction.apply(c);
			for (T t : ls) {
				structure.add(t);
			}
		}
		return structure;
	}

	private List<RepositoryComponent> getAllAssociatedFCCs(boolean considerRequired) {
		return this.mergedRepoManager.getAffectedComponentsByFCCList(this.getAnnotationsOfECC(considerRequired));
	}

	private List<CompletionComponent> getAnnotationsOfECC(boolean considerRequired) {
		return !considerRequired ? Arrays.asList(this.fcc) : this.resolveAllFCCsOf(this.fcc);
	}

	private List<CompletionComponent> resolveAllFCCsOf(CompletionComponent fcc) {
		List<CompletionComponent> result = new ArrayList<>();
		Queue<CompletionComponent> queue = new LinkedList<>();

		queue.add(fcc);

		while (!queue.isEmpty()) {
			CompletionComponent peek = queue.poll();
			result.add(peek);
			queue.addAll(peek.getRequiredComponents());
			queue.removeIf(e -> result.contains(e));
		}

		return result;

	}

	/**
	 * Checks if any of the specified FCCs requires an additional complementum.
	 *
	 * @param realizingComponents
	 *            the specified FCCs.
	 * @return whether any of the specified FCCs requires a complementum.
	 */
	public boolean requiresComplementa(List<RepositoryComponent> realizingComponents) {
		return realizingComponents.stream().anyMatch(component -> !StereotypeAPIHelper.getViaStereoTypeFrom(component, ComplementumImpl.class).stream()
				.filter(compl -> compl.getClass().equals(ComplementumImpl.class)).collect(Collectors.toList()).isEmpty());
	}

	/**
	 * Determines all complementa that are required by the specified components.
	 *
	 * @param realizingComponents
	 *            the specified components.
	 * @return all complementa that are required.
	 */
	public List<RepositoryComponent> getRequiredComplementa(List<RepositoryComponent> realizingComponents) {
		List<RepositoryComponent> result = new ArrayList<>();
		for (RepositoryComponent repositoryComponent : realizingComponents) {
			List<ComplementumImpl> requiredComplementa = new ArrayList<>();
			// complementa required by component
			List<ComplementumImpl> requiredComplementaByComponent = StereotypeAPIHelper.getViaStereoTypeFrom(repositoryComponent, ComplementumImpl.class);
			// complementa required by signatures
			List<ComplementumImpl> requiredComplementaByInterface = repositoryComponent.getProvidedRoles_InterfaceProvidingEntity().stream()
					.flatMap(role -> StereotypeAPIHelper.getViaStereoTypeFrom(((OperationProvidedRole) role).getProvidedInterface__OperationProvidedRole(), ComplementumImpl.class).stream())
					.collect(Collectors.toList());
			// complementa required by interfaces
			List<ComplementumImpl> requiredComplementaBySignature = repositoryComponent.getProvidedRoles_InterfaceProvidingEntity().stream()
					.flatMap(role -> ((OperationProvidedRole) role).getProvidedInterface__OperationProvidedRole().getSignatures__OperationInterface().stream())
					.flatMap(signature -> StereotypeAPIHelper.getViaStereoTypeFrom(signature, ComplementumImpl.class).stream()).collect(Collectors.toList());
			// add all
			requiredComplementa.addAll(requiredComplementaByComponent);
			requiredComplementa.addAll(requiredComplementaByInterface);
			requiredComplementa.addAll(requiredComplementaBySignature);
			requiredComplementa = requiredComplementa.stream().filter(compl -> compl.getClass().equals(ComplementumImpl.class)).collect(Collectors.toList());
			if (!requiredComplementa.isEmpty()) {
				for (ComplementumImpl complementumImpl : requiredComplementa) {
					result.add(this.mergedRepoManager.getFulfillingComponentForComplementum(complementumImpl));
				}
			}
		}
		return result;
	}

	public AssemblyContext getComponentsIntantiatingFCC(CompletionComponent fcc, List<AssemblyContext> contexts) {
		// search for component instantiating fcc
		for (AssemblyContext ac : contexts) {
			List<CompletionComponent> fccs = StereotypeAPIHelper.getViaStereoTypeFrom(ac.getEncapsulatedComponent__AssemblyContext(), CompletionComponent.class);
			if (fccs.size() == 1 && fccs.get(0).getId().equals(fcc.getId())) { // 1
																				// component
																				// should
																				// only
																				// realize
																				// 1
																				// fcc
				return ac;
			}
		}
		return null;
	}
}
