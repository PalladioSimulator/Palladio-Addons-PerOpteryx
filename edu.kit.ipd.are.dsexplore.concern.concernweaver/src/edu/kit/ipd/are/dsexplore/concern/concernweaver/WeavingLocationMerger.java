package edu.kit.ipd.are.dsexplore.concern.concernweaver;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import org.palladiosimulator.pcm.repository.OperationSignature;
import org.palladiosimulator.pcm.repository.Signature;

import edu.kit.ipd.are.dsexplore.concern.util.ConcernWeaverUtil;

/**
 * This class is responsible for merging weaving locations.
 *
 * @author scheerer
 *
 */
public class WeavingLocationMerger {
	private List<WeavingLocation> unmergedLocations;
	private List<WeavingLocation> alreadyMergedLocations;

	public WeavingLocationMerger(List<WeavingLocation> unmergedLocations) {
		this.unmergedLocations = unmergedLocations;
		this.alreadyMergedLocations = new ArrayList<>();
	}

	/**
	 * Inspects the weaving locations and merges if necessary.
	 *
	 * @return the merged weaving locations.
	 */
	public List<WeavingLocation> merge() {
		List<WeavingLocation> mergedLocations = new ArrayList<>(this.unmergedLocations);
		for (WeavingLocation eachWeavingLocation : this.unmergedLocations) {
			if (this.needToBeMerged(eachWeavingLocation)) {
				this.merge(eachWeavingLocation, mergedLocations);
			}
		}
		return mergedLocations;
	}

	private boolean needToBeMerged(WeavingLocation weavingLocation) {
		List<WeavingLocation> result = this.getWeavingLocationsToMergeBy(this.searchCriteria(weavingLocation));
		result.remove(weavingLocation);
		return !result.isEmpty();
	}

	private void merge(WeavingLocation weavingLocation, List<WeavingLocation> mergedLocations) {
		if (this.isAlreadyMerged(weavingLocation)) {
			return;
		}

		List<WeavingLocation> locationsToMerge = this.getWeavingLocationsToMergeBy(this.searchCriteria(weavingLocation));
		WeavingLocation mergedWeavingLocation = this.merge(locationsToMerge);

		mergedLocations.removeAll(locationsToMerge);
		mergedLocations.add(mergedWeavingLocation);

		this.cacheMergedLocation(locationsToMerge);
	}

	private WeavingLocation merge(List<WeavingLocation> locationsToMerge) {
		boolean foundAny = false;
		WeavingLocation result = null;
		for (WeavingLocation element : locationsToMerge) {
			if (!foundAny) {
				foundAny = true;
				result = element;
			} else {
				result = new WeavingLocation(this.mergeSignaturesOf(result, element), result.getLocation());
			}
		}
		if (foundAny) {
			return result;
		}
		throw new NoSuchElementException();
		// return locationsToMerge.stream().reduce((w1, w2) -> new
		// WeavingLocation(this.mergeSignaturesOf(w1, w2),
		// w1.getLocation())).get();
	}

	private List<OperationSignature> mergeSignaturesOf(WeavingLocation w1, WeavingLocation w2) {
		List<OperationSignature> sigs = new ArrayList<>();
		sigs.addAll(w1.getAffectedSignatures());
		sigs.addAll(w2.getAffectedSignatures());
		return sigs.stream().distinct().collect(Collectors.toList());
		// return Stream.concat(w1.getAffectedSignatures().stream(),
		// w2.getAffectedSignatures().stream()).distinct().collect(Collectors.toList());
	}

	private List<WeavingLocation> getWeavingLocationsToMergeBy(Predicate<WeavingLocation> searchCriteria) {
		List<WeavingLocation> result = this.unmergedLocations.stream().filter(searchCriteria).collect(Collectors.toList());
		return result;
	}

	private Predicate<WeavingLocation> searchCriteria(WeavingLocation weavingLocation) {
		return this.containsTheSameConnector(weavingLocation).and(this.isSupersetOf(weavingLocation).or(this.shareSameInterface(weavingLocation)));
	}

	private Predicate<WeavingLocation> shareSameInterface(WeavingLocation givenWeavingLocation) {
		return weavingLocation -> ConcernWeaverUtil.areEqual(weavingLocation.getAffectedSignatures().get(0).eContainer(), givenWeavingLocation.getAffectedSignatures().get(0).eContainer());
	}

	private Predicate<WeavingLocation> isSupersetOf(WeavingLocation givenWeavingLocation) {
		return weavingLocation -> givenWeavingLocation.getAffectedSignatures().size() <= weavingLocation.getAffectedSignatures().size()
				&& givenWeavingLocation.getAffectedSignatures().stream().allMatch(each -> weavingLocation.getAffectedSignatures().contains(each));
	}

	private Predicate<WeavingLocation> containsTheSameConnector(WeavingLocation givenWeavingLocation) {
		return weavingLocation -> ConcernWeaverUtil.areEqual(weavingLocation.getLocation(), givenWeavingLocation.getLocation());
	}

	private void cacheMergedLocation(List<WeavingLocation> locationsToMerge) {
		this.alreadyMergedLocations.addAll(locationsToMerge);
	}

	private boolean isAlreadyMerged(WeavingLocation weavingLocation) {
		return this.alreadyMergedLocations.contains(weavingLocation);
	}

}
