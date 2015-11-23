package de.uka.ipd.sdq.dsexplore.genericdesigndecision;

import org.eclipse.emf.ecore.EFactory;
import org.eclipse.emf.ecore.EModelElement;

import de.uka.ipd.sdq.dsexplore.launch.DSEWorkflowConfiguration;
import de.uka.ipd.sdq.dsexplore.opt4j.representation.DSEProblem;
import genericdesigndecision.universalDoF.Metamodel;
import de.uka.ipd.sdq.dsexplore.genericdesigndecision.impl.DSEProblemFactoryImpl;;

public interface DSEProblemFactory extends EFactory{

	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	DSEProblemFactory eINSTANCE = DSEProblemFactoryImpl.init();
	
	DSEProblem createDSEProblem(DSEWorkflowConfiguration dseConfig, EModelElement emfInstance, Metamodel metamodel);
}
