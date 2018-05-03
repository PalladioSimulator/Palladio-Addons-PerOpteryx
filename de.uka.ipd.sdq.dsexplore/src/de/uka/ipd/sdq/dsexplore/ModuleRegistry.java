package de.uka.ipd.sdq.dsexplore;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import de.uka.ipd.sdq.dsexplore.facade.IModule;

public final class ModuleRegistry {
	private ModuleRegistry() {
	}

	private static final ModuleRegistry MODULE_REGISTRY = new ModuleRegistry();

	public static ModuleRegistry getModuleRegistry() {
		return ModuleRegistry.MODULE_REGISTRY;
	}

	private List<IModule> modules = Arrays.asList();

	public List<IModule> getModules() {
		return new ArrayList<>(this.modules);
	}

	public void reset() {
		this.modules.forEach(IModule::reset);
	}
}
