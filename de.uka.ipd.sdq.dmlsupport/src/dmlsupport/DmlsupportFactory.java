/**
 */
package dmlsupport;

import org.eclipse.debug.core.ILaunchConfiguration;
import org.eclipse.emf.ecore.EFactory;

import dmlsupport.impl.DMLWorkflowConfigurationBuilderImpl;
import dmlsupport.impl.DMLWorkflowConfigurationImpl;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see dmlsupport.DmlsupportPackage
 * @generated
 */
public interface DmlsupportFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	DmlsupportFactory eINSTANCE = dmlsupport.impl.DmlsupportFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>DML Workflow Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>DML Workflow Configuration</em>'.
	 * @generated
	 */
	DMLWorkflowConfigurationImpl createDMLWorkflowConfiguration();

	/**
	 * Returns a new object of class '<em>DML Workflow Configuration Builder</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>DML Workflow Configuration Builder</em>'.
	 * @generated
	 */
	DMLWorkflowConfigurationBuilderImpl createDMLWorkflowConfigurationBuilder(ILaunchConfiguration configuration, String mode);

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	DmlsupportPackage getDmlsupportPackage();

} //DmlsupportFactory
