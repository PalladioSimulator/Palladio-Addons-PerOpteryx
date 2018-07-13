package edu.kit.ipd.are.dsexplore.concern.weavingstrategy.extension;

import java.util.HashMap;

import org.palladiosimulator.pcm.core.composition.Connector;
import org.palladiosimulator.pcm.core.composition.impl.AssemblyConnectorImpl;
import org.palladiosimulator.pcm.core.composition.impl.ProvidedDelegationConnectorImpl;

import edu.kit.ipd.are.dsexplore.concern.concernweaver.WeavingLocation;
import edu.kit.ipd.are.dsexplore.concern.weavingstrategy.adapter.AdapterAssemblyLocationRepositoryWeaving;
import edu.kit.ipd.are.dsexplore.concern.weavingstrategy.adapter.AdapterAssemblyLocationSeffWeaving;
import edu.kit.ipd.are.dsexplore.concern.weavingstrategy.adapter.AdapterAssemblyLocationWeaving;
import edu.kit.ipd.are.dsexplore.concern.weavingstrategy.adapter.AdapterAssemblyWeaving;
import edu.kit.ipd.are.dsexplore.concern.weavingstrategy.adapter.AdapterDelegationLocationRepositoryWeaving;
import edu.kit.ipd.are.dsexplore.concern.weavingstrategy.adapter.AdapterDelegationLocationSeffWeaving;
import edu.kit.ipd.are.dsexplore.concern.weavingstrategy.adapter.AdapterDelegationLocationWeaving;
import edu.kit.ipd.are.dsexplore.concern.weavingstrategy.adapter.AdapterRepositoryWeaving;
import edu.kit.ipd.are.dsexplore.concern.weavingstrategy.adapter.AdapterServiceEffectSpecificationWeaving;
import edu.kit.ipd.are.dsexplore.concern.weavingstrategy.adapter.AdapterWeavingFactory;

/**
 * 
 * @author Maximilian Eckert (maxieckert@web.de)
 *
 */
public class ExtensionWeavingFactory {
	
	private static final HashMap<Class<? extends Connector>, ExtensionAssemblyWeaving> assemblyWeaverMap = new HashMap<>();
	static {
		ExtensionWeavingFactory.assemblyWeaverMap.put(AssemblyConnectorImpl.class, new ExtensionAssemblyLocationWeaving());
		ExtensionWeavingFactory.assemblyWeaverMap.put(ProvidedDelegationConnectorImpl.class, new ExtensionDelegationLocationWeaving());
	}

	private static final HashMap<Class<? extends Connector>, ExtensionRepositoryWeaving> repositoryWeaverMap = new HashMap<>();
	static {
		ExtensionWeavingFactory.repositoryWeaverMap.put(AssemblyConnectorImpl.class, new ExtensionAssemblyLocationRepositoryWeaving());
		ExtensionWeavingFactory.repositoryWeaverMap.put(ProvidedDelegationConnectorImpl.class, new ExtensionDelegationLocationRepositoryWeaving());
	}

	private static final HashMap<Class<? extends Connector>, ExtensionServiceEffectSpecificationWeaving> seffWeaverMap = new HashMap<>();
	static {
		ExtensionWeavingFactory.seffWeaverMap.put(AssemblyConnectorImpl.class, new ExtensionAssemblyLocationSeffWeaving());
		ExtensionWeavingFactory.seffWeaverMap.put(ProvidedDelegationConnectorImpl.class, new ExtensionDelegationLocationSeffWeaving());
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
	public static ExtensionAssemblyWeaving getExtensionAssemblyWeaverBy(WeavingLocation weavingLocation) {
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
	public static ExtensionRepositoryWeaving getExtensionRepositoryWeaverBy(WeavingLocation weavingLocation) {
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
	public static ExtensionServiceEffectSpecificationWeaving getExtensionSeffWeaverBy(WeavingLocation weavingLocation) {
		return ExtensionWeavingFactory.seffWeaverMap.get(weavingLocation.getLocation().getClass());
	}
}
