/**
 * generated by Xtext 2.14.0
 */
package org.palladiosimulator.qes;

import javax.annotation.Generated;
import org.palladiosimulator.qes.QualityEffectSpecificationStandaloneSetupGenerated;

/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
@SuppressWarnings("all")
@Generated("org.eclipse.xtend.core.compiler.XtendGenerator")
public class QualityEffectSpecificationStandaloneSetup extends QualityEffectSpecificationStandaloneSetupGenerated {
  public static void doSetup() {
    new QualityEffectSpecificationStandaloneSetup().createInjectorAndDoEMFRegistration();
  }
}