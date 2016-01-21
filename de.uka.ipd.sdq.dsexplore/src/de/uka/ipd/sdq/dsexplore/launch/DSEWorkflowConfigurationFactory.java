package de.uka.ipd.sdq.dsexplore.launch;

import org.eclipse.debug.core.ILaunchConfiguration;
import org.eclipse.emf.ecore.EFactory;

public interface DSEWorkflowConfigurationFactory extends EFactory {

	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public DSEWorkflowConfigurationFactory eINSTANCE = DSEWorkflowConfigurationFactoryImpl.init();
	
	public DSEWorkflowConfiguration createDSEWorkflowConfiguration(ILaunchConfiguration configuration, String mode, DSELaunch dseLaunch);
}
