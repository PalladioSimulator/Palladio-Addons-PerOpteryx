package edu.kit.ipd.are.dsexplore.featurecompletions.weaver.strategy.extension;

import java.util.HashMap;
import java.util.function.Function;

import org.palladiosimulator.pcm.core.composition.Connector;
import org.palladiosimulator.pcm.core.composition.impl.AssemblyConnectorImpl;
import org.palladiosimulator.pcm.core.composition.impl.ProvidedDelegationConnectorImpl;

import edu.kit.ipd.are.dsexplore.featurecompletions.weaver.strategy.WeavingLocation;



/**
 * 
 * @author Maximilian Eckert (maxieckert@web.de)
 *
 */
public class ExtensionWeavingFactory {
	
	private static final HashMap<Class<? extends Connector>, Function<IExtensionWeaving, AssemblyWeaving>> assemblyWeaverMap = new HashMap<>();
	static {
		ExtensionWeavingFactory.assemblyWeaverMap.put(AssemblyConnectorImpl.class, AssemblyLocationWeaving::new);
		ExtensionWeavingFactory.assemblyWeaverMap.put(ProvidedDelegationConnectorImpl.class, DelegationLocationWeaving::new);
	}

	private static final HashMap<Class<? extends Connector>, Function<IExtensionWeaving, RepositoryWeaving>> repositoryWeaverMap = new HashMap<>();
	static {
		ExtensionWeavingFactory.repositoryWeaverMap.put(AssemblyConnectorImpl.class, AssemblyLocationRepositoryWeaving::new);
		ExtensionWeavingFactory.repositoryWeaverMap.put(ProvidedDelegationConnectorImpl.class, DelegationLocationRepositoryWeaving::new);
	}

	private static final HashMap<Class<? extends Connector>, Function<IExtensionWeaving, ServiceEffectSpecificationWeaving>> seffWeaverMap = new HashMap<>();
	static {
		ExtensionWeavingFactory.seffWeaverMap.put(AssemblyConnectorImpl.class, AssemblyLocationSeffWeaving::new);
		ExtensionWeavingFactory.seffWeaverMap.put(ProvidedDelegationConnectorImpl.class, DelegationLocationSeffWeaving::new);
	}

	/**
	 * Returns the proper subassemblyweaving-class based on the weaving
	 * location.
	 *
	 * @param weavingLocation
	 *            - Contains the informations that are necessary to get the
	 *            proper subweaving-class.
	 * @return the proper subweaving-class.
	 */
	public static Function<IExtensionWeaving, AssemblyWeaving> getAdapterAssemblyWeaverBy(WeavingLocation weavingLocation) {
		return ExtensionWeavingFactory.assemblyWeaverMap.get(weavingLocation.getLocation().getClass());
	}

	/**
	 * Returns the proper subrepositoryweaving-class based on the weaving
	 * location.
	 *
	 * @param weavingLocation
	 *            - Contains the informations that are necessary to get the
	 *            proper subweaving-class.
	 * @return the proper subweaving-class.
	 */
	public static Function<IExtensionWeaving, RepositoryWeaving> getAdapterRepositoryWeaverBy(WeavingLocation weavingLocation) {
		return ExtensionWeavingFactory.repositoryWeaverMap.get(weavingLocation.getLocation().getClass());
	}

	/**
	 * Returns the proper subSEFFweaving-class based on the weaving location.
	 *
	 * @param weavingLocation
	 *            - Contains the informations that are necessary to get the
	 *            proper subweaving-class.
	 * @return the proper subweaving-class.
	 */
	public static Function<IExtensionWeaving, ServiceEffectSpecificationWeaving> getAdapterSeffWeaverBy(WeavingLocation weavingLocation) {
		return ExtensionWeavingFactory.seffWeaverMap.get(weavingLocation.getLocation().getClass());
	}
}
