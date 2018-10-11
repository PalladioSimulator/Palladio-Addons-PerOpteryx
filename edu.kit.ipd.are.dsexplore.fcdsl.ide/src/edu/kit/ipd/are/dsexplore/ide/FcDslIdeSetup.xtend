/*
 * generated by Xtext 2.13.0
 */
package edu.kit.ipd.are.dsexplore.ide

import com.google.inject.Guice
import edu.kit.ipd.are.dsexplore.FcDslRuntimeModule
import edu.kit.ipd.are.dsexplore.FcDslStandaloneSetup
import org.eclipse.xtext.util.Modules2

/**
 * Initialization support for running Xtext languages as language servers.
 */
class FcDslIdeSetup extends FcDslStandaloneSetup {

	override createInjector() {
		Guice.createInjector(Modules2.mixin(new FcDslRuntimeModule/* , new FcDslIdeModule*/))
	}
	
}
