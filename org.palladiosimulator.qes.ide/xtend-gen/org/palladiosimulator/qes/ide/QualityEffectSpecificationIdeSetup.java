/**
 * generated by Xtext 2.13.0
 */
package org.palladiosimulator.qes.ide;

import com.google.inject.Guice;
import com.google.inject.Injector;
import org.eclipse.xtext.util.Modules2;
import org.palladiosimulator.qes.QualityEffectSpecificationRuntimeModule;
import org.palladiosimulator.qes.QualityEffectSpecificationStandaloneSetup;
import org.palladiosimulator.qes.ide.QualityEffectSpecificationIdeModule;

/**
 * Initialization support for running Xtext languages as language servers.
 */
@SuppressWarnings("all")
public class QualityEffectSpecificationIdeSetup extends QualityEffectSpecificationStandaloneSetup {
  @Override
  public Injector createInjector() {
    QualityEffectSpecificationRuntimeModule _qualityEffectSpecificationRuntimeModule = new QualityEffectSpecificationRuntimeModule();
    QualityEffectSpecificationIdeModule _qualityEffectSpecificationIdeModule = new QualityEffectSpecificationIdeModule();
    return Guice.createInjector(Modules2.mixin(_qualityEffectSpecificationRuntimeModule, _qualityEffectSpecificationIdeModule));
  }
}
