package edu.kit.ipd.are.dsexplore.concern.weavingstrategy.adapter;

import org.palladiosimulator.pcm.core.composition.AssemblyConnector;
import org.palladiosimulator.pcm.repository.BasicComponent;

import edu.kit.ipd.are.dsexplore.concern.concernweaver.WeavingLocation;

public class AdapterAssemblyLocationSeffWeaving extends AdapterServiceEffectSpecificationWeaving {

	@Override
	protected BasicComponent getCalledComponentBy(WeavingLocation weavingLocation) {
		
		AssemblyConnector location = (AssemblyConnector) weavingLocation.getLocation();
		return (BasicComponent) location.getProvidingAssemblyContext_AssemblyConnector().getEncapsulatedComponent__AssemblyContext();
		
	}

}
