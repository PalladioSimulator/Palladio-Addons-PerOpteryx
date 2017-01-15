package edu.kit.ipd.are.dsexplore.concern.weavingstrategy.adapter;

import java.util.HashMap;

import org.palladiosimulator.pcm.core.composition.Connector;
import org.palladiosimulator.pcm.core.composition.impl.AssemblyConnectorImpl;
import org.palladiosimulator.pcm.core.composition.impl.ProvidedDelegationConnectorImpl;

import edu.kit.ipd.are.dsexplore.concern.concernweaver.WeavingLocation;

public class AdapterWeavingFactory {

	private static final HashMap<Class<? extends Connector>, AdapterAssemblyWeaving> assemblyWeaverMap = new HashMap<Class<? extends Connector>, AdapterAssemblyWeaving>();
	static {
		
		assemblyWeaverMap.put(AssemblyConnectorImpl.class, new AdapterAssemblyLocationWeaving());
		assemblyWeaverMap.put(ProvidedDelegationConnectorImpl.class, new AdapterDelegationLocationWeaving());
		
	}
	
	private static final HashMap<Class<? extends Connector>, AdapterRepositoryWeaving> repositoryWeaverMap = new HashMap<Class<? extends Connector>, AdapterRepositoryWeaving>();
	static {
		
		repositoryWeaverMap.put(AssemblyConnectorImpl.class, new AdapterAssemblyLocationRepositoryWeaving());
		repositoryWeaverMap.put(ProvidedDelegationConnectorImpl.class, new AdapterDelegationLocationRepositoryWeaving());
		
	}
	
	private static final HashMap<Class<? extends Connector>, AdapterServiceEffectSpecificationWeaving> seffWeaverMap = new HashMap<Class<? extends Connector>, AdapterServiceEffectSpecificationWeaving>();
	static {
		
		seffWeaverMap.put(AssemblyConnectorImpl.class, new AdapterAssemblyLocationSeffWeaving());
		seffWeaverMap.put(ProvidedDelegationConnectorImpl.class, new AdapterDelegationLocationSeffWeaving());
		
	}
	
	public static AdapterAssemblyWeaving getAdapterAssemblyWeaverBy(WeavingLocation weavingLocation) {
		
		return assemblyWeaverMap.get(weavingLocation.getLocation().getClass());
		
	}
	
	public static AdapterRepositoryWeaving getAdapterRepositoryWeaverBy(WeavingLocation weavingLocation) {
		
		return repositoryWeaverMap.get(weavingLocation.getLocation().getClass());
		
	}
	
	public static AdapterServiceEffectSpecificationWeaving getAdapterSeffWeaverBy(WeavingLocation weavingLocation) {
		
		return seffWeaverMap.get(weavingLocation.getLocation().getClass());
		
	}
	
}
