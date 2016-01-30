package de.uka.ipd.sdq.dsexplore.launch;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.debug.core.ILaunchConfiguration;
import org.eclipse.emf.ecore.impl.EFactoryImpl;

import de.uka.ipd.sdq.pcmsupport.PCMWorkflowConfiguration;
import de.uka.ipd.sdq.pcmsupport.PCMWorkflowConfigurationBuilder;
import de.uka.ipd.sdq.pcmsupport.representation.PCM_DSEOptionsTab;
import de.uka.ipd.sdq.pcmsupport.representation.QML_PCMFileNamesInputTab;
import genericdesigndecision.universalDoF.Metamodel;

/**
 * this factory produces all metamodel-dependent UI objects such as the configuration tabs and the DSE configuration itself
 * TODO add support for other metamodels as needed here among other places
 * 
 * @author ferdinand
 *
 */
public class DSEPresentationFactoryImpl extends EFactoryImpl implements DSEPresentationFactory {

	private static DSEPresentationFactory dsePresentationSingleton = null;
	
	private String exceptionMessage = "This metamodel is not supported, contact developer.";
	
	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	private DSEPresentationFactoryImpl() {
	}
	
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public static DSEPresentationFactory init() {
		if(dsePresentationSingleton == null) {
			dsePresentationSingleton = new DSEPresentationFactoryImpl();
		}
		return dsePresentationSingleton;
	}

	@Override
	/**
	 * creates workflow configurations using the DSEWorkflowConfigurationBuilder and other metamodel-specific builders
	 */
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

	@Override
	public DSEOptionsTab createDSEOptionsTab(Metamodel mm) {
		switch(mm.getValue()) {
		case Metamodel.PCM_VALUE: 	return new PCM_DSEOptionsTab();
		
		default: throw new IllegalArgumentException(exceptionMessage);
		}
	}

	@Override
	public DSEFileNamesInputTab createFileNamesInputTab(QMLManager qmlManager, Metamodel mm) {
		switch(mm.getValue()) {
		case Metamodel.PCM_VALUE:	return new QML_PCMFileNamesInputTab(qmlManager);
		
		default: throw new IllegalArgumentException(exceptionMessage);
		}
	}

}
