package de.uka.ipd.sdq.dsexplore.genericdesigndecision;

import org.eclipse.emf.ecore.EFactory;
import de.uka.ipd.sdq.dsexplore.launch.DSEWorkflowConfiguration;
import de.uka.ipd.sdq.workflow.mdsd.blackboard.ResourceSetPartition;
import genericdesigndecision.ADSEProblem;
import genericdesigndecision.universalDoF.Metamodel;
import de.uka.ipd.sdq.dsexplore.genericdesigndecision.impl.DSEProblemFactoryImpl;;

public interface DSEProblemFactory extends EFactory{

	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	DSEProblemFactory eINSTANCE = DSEProblemFactoryImpl.init();
	
	ADSEProblem createDSEProblem(DSEWorkflowConfiguration dseConfig, ResourceSetPartition modelPartition, Metamodel metamodel);
}
