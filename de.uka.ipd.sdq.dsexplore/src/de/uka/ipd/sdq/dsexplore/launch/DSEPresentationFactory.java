package de.uka.ipd.sdq.dsexplore.launch;

import org.eclipse.debug.core.ILaunchConfiguration;
import org.eclipse.emf.ecore.EFactory;

import genericdesigndecision.universalDoF.Metamodel;

public interface DSEPresentationFactory extends EFactory {

	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public DSEPresentationFactory eINSTANCE = DSEPresentationFactoryImpl.init();
	
	public DSEWorkflowConfiguration createDSEWorkflowConfiguration(ILaunchConfiguration configuration, String mode, DSELaunch dseLaunch);
	
	public DSEOptionsTab createDSEOptionsTab(Metamodel mm);
	
	public DSEFileNamesInputTab createFileNamesInputTab(QMLManager qmlManager, Metamodel mm);

}
