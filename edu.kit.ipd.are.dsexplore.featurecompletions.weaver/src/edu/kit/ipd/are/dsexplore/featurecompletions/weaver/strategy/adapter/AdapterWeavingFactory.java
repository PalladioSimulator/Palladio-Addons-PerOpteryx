package edu.kit.ipd.are.dsexplore.featurecompletions.weaver.strategy.adapter;

import java.util.HashMap;

import org.palladiosimulator.pcm.core.composition.Connector;
import org.palladiosimulator.pcm.core.composition.impl.AssemblyConnectorImpl;
import org.palladiosimulator.pcm.core.composition.impl.ProvidedDelegationConnectorImpl;

import edu.kit.ipd.are.dsexplore.featurecompletions.weaver.strategy.WeavingLocation;

/**
 * The factory returns depending on the connection of the components the adapter
 * is inserted in between the proper subweaving-class in the context of the
 * adapter weaving strategy.
 *
 * @author scheerer
 *
 */
public class AdapterWeavingFactory {

	private static final HashMap<Class<? extends Connector>, AssemblyWeaving> assemblyWeaverMap = new HashMap<>();
	static {
		AdapterWeavingFactory.assemblyWeaverMap.put(AssemblyConnectorImpl.class, new AssemblyLocationWeaving());
		AdapterWeavingFactory.assemblyWeaverMap.put(ProvidedDelegationConnectorImpl.class, new DelegationLocationWeaving());
	}

	private static final HashMap<Class<? extends Connector>, RepositoryWeaving> repositoryWeaverMap = new HashMap<>();
	static {
		AdapterWeavingFactory.repositoryWeaverMap.put(AssemblyConnectorImpl.class, new AssemblyLocationRepositoryWeaving());
		AdapterWeavingFactory.repositoryWeaverMap.put(ProvidedDelegationConnectorImpl.class, new DelegationLocationRepositoryWeaving());
	}

	private static final HashMap<Class<? extends Connector>, ServiceEffectSpecificationWeaving> seffWeaverMap = new HashMap<>();
	static {
		AdapterWeavingFactory.seffWeaverMap.put(AssemblyConnectorImpl.class, new AssemblyLocationSeffWeaving());
		AdapterWeavingFactory.seffWeaverMap.put(ProvidedDelegationConnectorImpl.class, new DelegationLocationSeffWeaving());
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
	public static AssemblyWeaving getAdapterAssemblyWeaverBy(WeavingLocation weavingLocation) {
		return AdapterWeavingFactory.assemblyWeaverMap.get(weavingLocation.getLocation().getClass());
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
	public static RepositoryWeaving getAdapterRepositoryWeaverBy(WeavingLocation weavingLocation) {
		return AdapterWeavingFactory.repositoryWeaverMap.get(weavingLocation.getLocation().getClass());
	}

	/**
	 * Returns the proper subSEFFweaving-class based on the weaving location.
	 *
	 * @param weavingLocation
	 *            - Contains the informations that are necessary to get the
	 *            proper subweaving-class.
	 * @return the proper subweaving-class.
	 */
	public static ServiceEffectSpecificationWeaving getAdapterSeffWeaverBy(WeavingLocation weavingLocation) {
		return AdapterWeavingFactory.seffWeaverMap.get(weavingLocation.getLocation().getClass());
	}

}
