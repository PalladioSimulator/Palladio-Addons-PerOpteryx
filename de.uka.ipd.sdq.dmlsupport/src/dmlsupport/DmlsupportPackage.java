/**
 */
package dmlsupport;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see dmlsupport.DmlsupportFactory
 * @model kind="package"
 * @generated
 */
public interface DmlsupportPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "dmlsupport";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://sdq.ipd.uka.de/dmlsupport/";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "dmlsupport";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	DmlsupportPackage eINSTANCE = dmlsupport.impl.DmlsupportPackageImpl.init();

	/**
	 * The meta object id for the '{@link dmlsupport.impl.DSEWorkflowConfigurationImpl <em>DSE Workflow Configuration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dmlsupport.impl.DSEWorkflowConfigurationImpl
	 * @see dmlsupport.impl.DmlsupportPackageImpl#getDSEWorkflowConfiguration()
	 * @generated
	 */
	int DSE_WORKFLOW_CONFIGURATION = 2;

	/**
	 * The number of structural features of the '<em>DSE Workflow Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSE_WORKFLOW_CONFIGURATION_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>DSE Workflow Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSE_WORKFLOW_CONFIGURATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link dmlsupport.impl.DMLWorkflowConfigurationImpl <em>DML Workflow Configuration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dmlsupport.impl.DMLWorkflowConfigurationImpl
	 * @see dmlsupport.impl.DmlsupportPackageImpl#getDMLWorkflowConfiguration()
	 * @generated
	 */
	int DML_WORKFLOW_CONFIGURATION = 0;

	/**
	 * The number of structural features of the '<em>DML Workflow Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DML_WORKFLOW_CONFIGURATION_FEATURE_COUNT = DSE_WORKFLOW_CONFIGURATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>DML Workflow Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DML_WORKFLOW_CONFIGURATION_OPERATION_COUNT = DSE_WORKFLOW_CONFIGURATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link dmlsupport.impl.AbstractWorkflowConfigurationBuilderImpl <em>Abstract Workflow Configuration Builder</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dmlsupport.impl.AbstractWorkflowConfigurationBuilderImpl
	 * @see dmlsupport.impl.DmlsupportPackageImpl#getAbstractWorkflowConfigurationBuilder()
	 * @generated
	 */
	int ABSTRACT_WORKFLOW_CONFIGURATION_BUILDER = 3;

	/**
	 * The number of structural features of the '<em>Abstract Workflow Configuration Builder</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_WORKFLOW_CONFIGURATION_BUILDER_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Abstract Workflow Configuration Builder</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_WORKFLOW_CONFIGURATION_BUILDER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link dmlsupport.impl.DMLWorkflowConfigurationBuilderImpl <em>DML Workflow Configuration Builder</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dmlsupport.impl.DMLWorkflowConfigurationBuilderImpl
	 * @see dmlsupport.impl.DmlsupportPackageImpl#getDMLWorkflowConfigurationBuilder()
	 * @generated
	 */
	int DML_WORKFLOW_CONFIGURATION_BUILDER = 1;

	/**
	 * The number of structural features of the '<em>DML Workflow Configuration Builder</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DML_WORKFLOW_CONFIGURATION_BUILDER_FEATURE_COUNT = ABSTRACT_WORKFLOW_CONFIGURATION_BUILDER_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>DML Workflow Configuration Builder</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DML_WORKFLOW_CONFIGURATION_BUILDER_OPERATION_COUNT = ABSTRACT_WORKFLOW_CONFIGURATION_BUILDER_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link dmlsupport.DMLWorkflowConfiguration <em>DML Workflow Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>DML Workflow Configuration</em>'.
	 * @see dmlsupport.DMLWorkflowConfiguration
	 * @generated
	 */
	EClass getDMLWorkflowConfiguration();

	/**
	 * Returns the meta object for class '{@link dmlsupport.DMLWorkflowConfigurationBuilder <em>DML Workflow Configuration Builder</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>DML Workflow Configuration Builder</em>'.
	 * @see dmlsupport.DMLWorkflowConfigurationBuilder
	 * @generated
	 */
	EClass getDMLWorkflowConfigurationBuilder();

	/**
	 * Returns the meta object for class '{@link de.uka.ipd.sdq.dsexplore.launch.DSEWorkflowConfiguration <em>DSE Workflow Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>DSE Workflow Configuration</em>'.
	 * @see de.uka.ipd.sdq.dsexplore.launch.DSEWorkflowConfiguration
	 * @model instanceClass="de.uka.ipd.sdq.dsexplore.launch.DSEWorkflowConfiguration"
	 * @generated
	 */
	EClass getDSEWorkflowConfiguration();

	/**
	 * Returns the meta object for class '{@link de.uka.ipd.sdq.workflow.launchconfig.AbstractWorkflowConfigurationBuilder <em>Abstract Workflow Configuration Builder</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Workflow Configuration Builder</em>'.
	 * @see de.uka.ipd.sdq.workflow.launchconfig.AbstractWorkflowConfigurationBuilder
	 * @model instanceClass="de.uka.ipd.sdq.workflow.launchconfig.AbstractWorkflowConfigurationBuilder"
	 * @generated
	 */
	EClass getAbstractWorkflowConfigurationBuilder();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	DmlsupportFactory getDmlsupportFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link dmlsupport.impl.DMLWorkflowConfigurationImpl <em>DML Workflow Configuration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dmlsupport.impl.DMLWorkflowConfigurationImpl
		 * @see dmlsupport.impl.DmlsupportPackageImpl#getDMLWorkflowConfiguration()
		 * @generated
		 */
		EClass DML_WORKFLOW_CONFIGURATION = eINSTANCE.getDMLWorkflowConfiguration();

		/**
		 * The meta object literal for the '{@link dmlsupport.impl.DMLWorkflowConfigurationBuilderImpl <em>DML Workflow Configuration Builder</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dmlsupport.impl.DMLWorkflowConfigurationBuilderImpl
		 * @see dmlsupport.impl.DmlsupportPackageImpl#getDMLWorkflowConfigurationBuilder()
		 * @generated
		 */
		EClass DML_WORKFLOW_CONFIGURATION_BUILDER = eINSTANCE.getDMLWorkflowConfigurationBuilder();

		/**
		 * The meta object literal for the '{@link dmlsupport.impl.DSEWorkflowConfigurationImpl <em>DSE Workflow Configuration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dmlsupport.impl.DSEWorkflowConfigurationImpl
		 * @see dmlsupport.impl.DmlsupportPackageImpl#getDSEWorkflowConfiguration()
		 * @generated
		 */
		EClass DSE_WORKFLOW_CONFIGURATION = eINSTANCE.getDSEWorkflowConfiguration();

		/**
		 * The meta object literal for the '{@link dmlsupport.impl.AbstractWorkflowConfigurationBuilderImpl <em>Abstract Workflow Configuration Builder</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dmlsupport.impl.AbstractWorkflowConfigurationBuilderImpl
		 * @see dmlsupport.impl.DmlsupportPackageImpl#getAbstractWorkflowConfigurationBuilder()
		 * @generated
		 */
		EClass ABSTRACT_WORKFLOW_CONFIGURATION_BUILDER = eINSTANCE.getAbstractWorkflowConfigurationBuilder();

	}

} //DmlsupportPackage
