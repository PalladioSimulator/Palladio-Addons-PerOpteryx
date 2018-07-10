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

	public static ModuleRegistry getModuleRegistry() {
		return ModuleRegistry.MODULE_REGISTRY;
	}

	private List<IModule> modules = new ArrayList<>();

	public void loadModule(IModule module) {
		if (this.modules.contains(module)) {
			return;
		}
		this.modules.add(module);
	}

	public List<IModule> getModules() {
		return new ArrayList<>(this.modules);
	}

	public void reset() {
		this.modules.forEach(IModule::reset);
	}
}
