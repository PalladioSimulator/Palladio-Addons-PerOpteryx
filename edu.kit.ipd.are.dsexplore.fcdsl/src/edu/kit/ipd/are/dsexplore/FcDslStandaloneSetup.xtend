/*
 * generated by Xtext 2.13.0
 */
package edu.kit.ipd.are.dsexplore


/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
class FcDslStandaloneSetup extends FcDslStandaloneSetupGenerated {

	def static void doSetup() {
		new FcDslStandaloneSetup().createInjectorAndDoEMFRegistration()
	}
}