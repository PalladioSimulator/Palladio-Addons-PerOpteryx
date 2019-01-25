package de.uka.ipd.sdq.dsexplore;

import de.uka.ipd.sdq.dsexplore.facade.ModuleRegistry;
import edu.kit.ipd.are.dsexplore.featurecompletions.weaver.port.FCCModule;

/**
 * Helper class to load modules to {@link ModuleRegistry}.
 *
 * @author Dominik Fuchss
 *
 */
public final class Modules {
	private Modules() {
		throw new IllegalAccessError();
	}

	/**
	 * Load defined modules if necessary.
	 */
	public static synchronized void loadModules() {
		ModuleRegistry registry = ModuleRegistry.getModuleRegistry();
		if (!registry.getModules().isEmpty()) {
			// Already loaded modules
			return;
		}
		registry.loadModule(new FCCModule());
	}
}