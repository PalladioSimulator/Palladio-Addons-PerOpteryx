package de.uka.ipd.sdq.dsexplore.facade;

import java.util.ArrayList;
import java.util.List;

/**
 * The one and only registry for {@link IModule IModules}.
 *
 * @author Dominik Fuchss
 *
 */
public final class ModuleRegistry {
	private ModuleRegistry() {
	}

	private static final ModuleRegistry MODULE_REGISTRY = new ModuleRegistry();

	/**
	 * Get the one and only {@link ModuleRegistry ModuleRegistry-Instance}
	 *
	 * @return the instance
	 */
	public static ModuleRegistry getModuleRegistry() {
		return ModuleRegistry.MODULE_REGISTRY;
	}

	private List<IModule> modules = new ArrayList<>();

	/**
	 * Load a module.
	 *
	 * @param module
	 *            the module
	 */
	public void loadModule(IModule module) {
		if (this.modules.contains(module)) {
			return;
		}
		this.modules.add(module);
	}

	/**
	 * Get all registered modules.
	 * 
	 * @return all registered modules
	 */
	public List<IModule> getModules() {
		return new ArrayList<>(this.modules);
	}

	/**
	 * Reset all registered modules.
	 */
	public void reset() {
		this.modules.forEach(IModule::reset);
	}
}
