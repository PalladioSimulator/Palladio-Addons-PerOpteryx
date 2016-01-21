package de.uka.ipd.sdq.dsexplore.launch;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.debug.core.ILaunchConfiguration;
import org.eclipse.emf.ecore.impl.EFactoryImpl;

import de.uka.ipd.sdq.pcmsupport.PCMWorkflowConfiguration;
import de.uka.ipd.sdq.pcmsupport.PCMWorkflowConfigurationBuilder;
import genericdesigndecision.universalDoF.Metamodel;


/**
 * this factory produces DSEWorkflowConfigurations using the DSEWorkflowConfigurationBuilder and other metamodel-specific builders depending on the metamodel chosen by the user
 * @author ferdinand
 *
 */
public class DSEWorkflowConfigurationFactoryImpl extends EFactoryImpl implements DSEWorkflowConfigurationFactory {

	private static DSEWorkflowConfigurationFactory dseWorkflowConfigSingleton = null;
	
	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	private DSEWorkflowConfigurationFactoryImpl() {
	}
	
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public static DSEWorkflowConfigurationFactory init() {
		if(dseWorkflowConfigSingleton == null) {
			dseWorkflowConfigSingleton = new DSEWorkflowConfigurationFactoryImpl();
		}
		return dseWorkflowConfigSingleton;
	}

	@Override
	public DSEWorkflowConfiguration createDSEWorkflowConfiguration(ILaunchConfiguration configuration, String mode, DSELaunch dseLaunch) {
		
		DSEWorkflowConfiguration dseConfig = null;
		int metamodelID = -1;
		try {
			// get the metamodel of the input model
			metamodelID = configuration.getAttribute(DSEConstantsContainer.INPUT_METAMODEL.toString(), -1);
		} catch (CoreException e) {
			e.printStackTrace();
		}
		
		// create the corresponding workflow configuration
		switch(Metamodel.get(metamodelID)) {
		case PCM: dseConfig = new PCMWorkflowConfiguration();
					try {
						// set pcm-specific parts of configuration
						PCMWorkflowConfigurationBuilder pcmBuilder = new PCMWorkflowConfigurationBuilder(configuration, mode);
						pcmBuilder.fillConfiguration(dseConfig);
					} catch (CoreException e) {
						e.printStackTrace();
					}
		break;
		//TODO add support for other metamodels as needed here among other places
		
		default: throw new UnsupportedOperationException("Metamodel corresponding workflow configuration could not be found, contact developer.");
		}
		
		try {
			// set generic parts of the configuration
			DSEWorkflowConfigurationBuilder builder = new DSEWorkflowConfigurationBuilder(configuration, mode, dseLaunch);
			builder.fillConfiguration(dseConfig);
		} catch (CoreException e) {
			e.printStackTrace();
		}
		
		dseConfig.setRawConfig(configuration);
		
		return dseConfig;
	}
}
