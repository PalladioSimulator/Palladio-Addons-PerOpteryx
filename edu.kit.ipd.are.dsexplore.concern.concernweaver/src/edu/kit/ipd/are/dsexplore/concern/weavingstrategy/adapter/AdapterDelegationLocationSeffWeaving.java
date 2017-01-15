package edu.kit.ipd.are.dsexplore.concern.weavingstrategy.adapter;

import org.palladiosimulator.pcm.core.composition.ProvidedDelegationConnector;
import org.palladiosimulator.pcm.repository.BasicComponent;

import edu.kit.ipd.are.dsexplore.concern.concernweaver.WeavingLocation;

public class AdapterDelegationLocationSeffWeaving extends AdapterServiceEffectSpecificationWeaving {

	@Override
	protected BasicComponent getCalledComponentBy(WeavingLocation weavingLocation) {
		
		//TODO check if cast to basic-component holds if component is composite-component.
		ProvidedDelegationConnector location = (ProvidedDelegationConnector) weavingLocation.getLocation();
		return (BasicComponent) location.getAssemblyContext_ProvidedDelegationConnector().getEncapsulatedComponent__AssemblyContext();
		
	}

}
