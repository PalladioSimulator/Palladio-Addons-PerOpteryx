/*
 * generated by Xtext 2.14.0
 */
package org.palladiosimulator.qes


/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
class QualityEffectSpecificationStandaloneSetup extends QualityEffectSpecificationStandaloneSetupGenerated {

	def static void doSetup() {
		new QualityEffectSpecificationStandaloneSetup().createInjectorAndDoEMFRegistration()
	}
}