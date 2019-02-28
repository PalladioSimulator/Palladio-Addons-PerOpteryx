package edu.kit.ipd.are.dsexplore.featurecompletions.weaver.strategy.adapter;

import java.util.HashMap;
import java.util.function.Function;

import org.palladiosimulator.pcm.core.composition.Connector;
import org.palladiosimulator.pcm.core.composition.impl.AssemblyConnectorImpl;
import org.palladiosimulator.pcm.core.composition.impl.ProvidedDelegationConnectorImpl;

/**
 * The factory returns depending on the connection of the components the adapter
 * is inserted in between the proper subweaving-class in the context of the
 * adapter weaving strategy.
 *
 * @author scheerer
 *
 */
public class AdapterWeavingFactory {

	private static final HashMap<Class<? extends Connector>, Function<IAdapterWeaving, AssemblyWeaving>> assemblyWeaverMap = new HashMap<>();
	static {
		AdapterWeavingFactory.assemblyWeaverMap.put(AssemblyConnectorImpl.class, AssemblyLocationWeaving::new);
		AdapterWeavingFactory.assemblyWeaverMap.put(ProvidedDelegationConnectorImpl.class, DelegationLocationWeaving::new);
	}

	private static final HashMap<Class<? extends Connector>, Function<IAdapterWeaving, RepositoryWeaving>> repositoryWeaverMap = new HashMap<>();
	static {
		AdapterWeavingFactory.repositoryWeaverMap.put(AssemblyConnectorImpl.class, AssemblyLocationRepositoryWeaving::new);
		AdapterWeavingFactory.repositoryWeaverMap.put(ProvidedDelegationConnectorImpl.class, DelegationLocationRepositoryWeaving::new);
	}

	private static final HashMap<Class<? extends Connector>, Function<IAdapterWeaving, ServiceEffectSpecificationWeaving>> seffWeaverMap = new HashMap<>();
	static {
		AdapterWeavingFactory.seffWeaverMap.put(AssemblyConnectorImpl.class, AssemblyLocationSeffWeaving::new);
		AdapterWeavingFactory.seffWeaverMap.put(ProvidedDelegationConnectorImpl.class, DelegationLocationSeffWeaving::new);
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
	public static Function<IAdapterWeaving, AssemblyWeaving> getAdapterAssemblyWeaverBy(Connector weavingLocation) {
		return AdapterWeavingFactory.assemblyWeaverMap.get(weavingLocation.getClass());
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
	public static Function<IAdapterWeaving, RepositoryWeaving> getAdapterRepositoryWeaverBy(Connector weavingLocation) {
		return AdapterWeavingFactory.repositoryWeaverMap.get(weavingLocation.getClass());
	}

	/**
	 * Returns the proper subSEFFweaving-class based on the weaving location.
	 *
	 * @param weavingLocation
	 *            - Contains the informations that are necessary to get the
	 *            proper subweaving-class.
	 * @return the proper subweaving-class.
	 */
	public static Function<IAdapterWeaving, ServiceEffectSpecificationWeaving> getAdapterSeffWeaverBy(Connector weavingLocation) {
		return AdapterWeavingFactory.seffWeaverMap.get(weavingLocation.getClass());
	}

}
