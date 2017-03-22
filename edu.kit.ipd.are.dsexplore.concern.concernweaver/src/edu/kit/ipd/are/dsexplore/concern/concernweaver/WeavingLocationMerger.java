package edu.kit.ipd.are.dsexplore.concern.concernweaver;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.palladiosimulator.pcm.repository.Signature;

import edu.kit.ipd.are.dsexplore.concern.util.ConcernWeaverUtil;

/**
 * This class is responsible for merging weaving locations.
 * @author scheerer
 *
 */
public class WeavingLocationMerger {

	private final List<WeavingLocation> unmergedLocations;
	
	public WeavingLocationMerger(List<WeavingLocation> unmergedLocations) {
		
		this.unmergedLocations = unmergedLocations;
		
	}
	
	/**
	 * Inspects the weaving locations and merges if necessary.
	 * @return the merged weaving locations. 
	 */
	public List<WeavingLocation> merge() {
		
		List<WeavingLocation> mergedLocations = new ArrayList<WeavingLocation>(this.unmergedLocations);
		for (WeavingLocation eachWeavingLocation : this.unmergedLocations) {
			
			if (needToBeMerged(eachWeavingLocation)) {
				
				merge(eachWeavingLocation, mergedLocations);
				
			}
			
		}
		
		return mergedLocations;
		
	}

	private boolean needToBeMerged(WeavingLocation weavingLocation) {
		
		List<WeavingLocation> result = getWeavingLocations(searchCriteria(weavingLocation));
		result.remove(weavingLocation);
		
		return !result.isEmpty();
		
	}
	
	private void merge(WeavingLocation weavingLocation, List<WeavingLocation> mergedLocations) {
		
		List<WeavingLocation> locationsToMerge = getWeavingLocations(searchCriteria(weavingLocation));
		WeavingLocation mergedWeavingLocation = merge(locationsToMerge);
		
		mergedLocations.removeAll(locationsToMerge);
		mergedLocations.add(mergedWeavingLocation);
		
	}
	
	private WeavingLocation merge(List<WeavingLocation> locationsToMerge) {
		
		return locationsToMerge.stream().reduce((w1,w2) -> new WeavingLocation(mergeSignaturesOf(w1,w2), w1.getLocation())).get();
		
	}
	
	private List<Signature> mergeSignaturesOf(WeavingLocation w1, WeavingLocation w2) {
		
		return Stream.concat(w1.getAffectedSignatures().stream(), w2.getAffectedSignatures().stream()).distinct().collect(Collectors.toList());
		
	}

	private List<WeavingLocation> getWeavingLocations(Predicate<WeavingLocation> searchCriteria) {
		
		return this.unmergedLocations.stream().filter(searchCriteria).collect(Collectors.toList());
		
	}
	
	private Predicate<WeavingLocation> searchCriteria(WeavingLocation weavingLocation) {
		
		return isSupersetOf(weavingLocation).or(containsTheSameConnector(weavingLocation));
		
	}

	private Predicate<WeavingLocation> isSupersetOf(WeavingLocation givenWeavingLocation) {
		
		return weavingLocation -> givenWeavingLocation.getAffectedSignatures().size() <= weavingLocation.getAffectedSignatures().size() &&
								  givenWeavingLocation.getAffectedSignatures().stream().allMatch(each -> weavingLocation.getAffectedSignatures().contains(each));
		
	}
	
	private Predicate<WeavingLocation> containsTheSameConnector(WeavingLocation givenWeavingLocation) {
		
		return weavingLocation -> ConcernWeaverUtil.areEqual(weavingLocation.getLocation(), givenWeavingLocation.getLocation());
		
	}
	
}
