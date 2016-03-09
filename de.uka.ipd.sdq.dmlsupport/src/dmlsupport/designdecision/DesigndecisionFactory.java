/**
 */
package dmlsupport.designdecision;

import org.eclipse.emf.ecore.EFactory;

import de.uka.ipd.sdq.workflow.mdsd.blackboard.ResourceSetPartition;
import dmlsupport.impl.DMLWorkflowConfigurationImpl;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see dmlsupport.designdecision.DesigndecisionPackage
 * @generated
 */
public interface DesigndecisionFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	DesigndecisionFactory eINSTANCE = dmlsupport.designdecision.impl.DesigndecisionFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>DSE Problem</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>DSE Problem</em>'.
	 * @generated
	 */
	DSEProblem createDSEProblem(DMLWorkflowConfigurationImpl dseConfig, ResourceSetPartition modelPartition);

	/**
	 * Returns a new object of class '<em>Metamodel Description</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Metamodel Description</em>'.
	 * @generated
	 */
	MetamodelDescription createMetamodelDescription();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	DesigndecisionPackage getDesigndecisionPackage();

} //DesigndecisionFactory
