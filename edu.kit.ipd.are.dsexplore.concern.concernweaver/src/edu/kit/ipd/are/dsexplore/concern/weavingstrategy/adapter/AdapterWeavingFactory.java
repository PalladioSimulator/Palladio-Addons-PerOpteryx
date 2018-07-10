package edu.kit.ipd.are.dsexplore.concern.weavingstrategy.adapter;

import java.util.HashMap;

import org.palladiosimulator.pcm.core.composition.Connector;
import org.palladiosimulator.pcm.core.composition.impl.AssemblyConnectorImpl;
import org.palladiosimulator.pcm.core.composition.impl.ProvidedDelegationConnectorImpl;

import edu.kit.ipd.are.dsexplore.concern.concernweaver.WeavingLocation;

/**
 * The factory returns depending on the connection of the components the adapter
 * is inserted in between the proper subweaving-class in the context of the
 * adapter weaving strategy.
 *
 * @author scheerer
 *
 */
public class AdapterWeavingFactory {

	private static final HashMap<Class<? extends Connector>, AdapterAssemblyWeaving> assemblyWeaverMap = new HashMap<>();
	static {
		AdapterWeavingFactory.assemblyWeaverMap.put(AssemblyConnectorImpl.class, new AdapterAssemblyLocationWeaving());
		AdapterWeavingFactory.assemblyWeaverMap.put(ProvidedDelegationConnectorImpl.class, new AdapterDelegationLocationWeaving());
	}

	private static final HashMap<Class<? extends Connector>, AdapterRepositoryWeaving> repositoryWeaverMap = new HashMap<>();
	static {
		AdapterWeavingFactory.repositoryWeaverMap.put(AssemblyConnectorImpl.class, new AdapterAssemblyLocationRepositoryWeaving());
		AdapterWeavingFactory.repositoryWeaverMap.put(ProvidedDelegationConnectorImpl.class, new AdapterDelegationLocationRepositoryWeaving());
	}

	private static final HashMap<Class<? extends Connector>, AdapterServiceEffectSpecificationWeaving> seffWeaverMap = new HashMap<>();
	static {
		AdapterWeavingFactory.seffWeaverMap.put(AssemblyConnectorImpl.class, new AdapterAssemblyLocationSeffWeaving());
		AdapterWeavingFactory.seffWeaverMap.put(ProvidedDelegationConnectorImpl.class, new AdapterDelegationLocationSeffWeaving());
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
	public static AdapterAssemblyWeaving getAdapterAssemblyWeaverBy(WeavingLocation weavingLocation) {
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
	public static AdapterRepositoryWeaving getAdapterRepositoryWeaverBy(WeavingLocation weavingLocation) {
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
	public static AdapterServiceEffectSpecificationWeaving getAdapterSeffWeaverBy(WeavingLocation weavingLocation) {
		return AdapterWeavingFactory.seffWeaverMap.get(weavingLocation.getLocation().getClass());
	}

}
