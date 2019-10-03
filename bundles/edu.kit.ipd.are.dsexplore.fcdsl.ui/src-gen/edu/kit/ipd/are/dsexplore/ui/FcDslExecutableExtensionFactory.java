/*
 * generated by Xtext 2.14.0
 */
package edu.kit.ipd.are.dsexplore.ui;

import com.google.inject.Injector;
import edu.kit.ipd.are.dsexplore.fcdsl.ui.internal.FcdslActivator;
import org.eclipse.core.runtime.Platform;
import org.eclipse.xtext.ui.guice.AbstractGuiceAwareExecutableExtensionFactory;
import org.osgi.framework.Bundle;

/**
 * This class was generated. Customizations should only happen in a newly
 * introduced subclass. 
 */
public class FcDslExecutableExtensionFactory extends AbstractGuiceAwareExecutableExtensionFactory {

	@Override
	protected Bundle getBundle() {
		return Platform.getBundle(FcdslActivator.PLUGIN_ID);
	}
	
	@Override
	protected Injector getInjector() {
		FcdslActivator activator = FcdslActivator.getInstance();
		return activator != null ? activator.getInjector(FcdslActivator.EDU_KIT_IPD_ARE_DSEXPLORE_FCDSL) : null;
	}

}