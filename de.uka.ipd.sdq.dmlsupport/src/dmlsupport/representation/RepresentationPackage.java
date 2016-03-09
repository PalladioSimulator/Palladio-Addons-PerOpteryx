/**
 */
package dmlsupport.representation;

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
 * @see dmlsupport.representation.RepresentationFactory
 * @model kind="package"
 * @generated
 */
public interface RepresentationPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "representation";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://sdq.ipd.uka.de/dmlsupport/representation";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "representation";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	RepresentationPackage eINSTANCE = dmlsupport.representation.impl.RepresentationPackageImpl.init();

	/**
	 * The meta object id for the '{@link dmlsupport.representation.impl.DSEOptionsTabImpl <em>DSE Options Tab</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dmlsupport.representation.impl.DSEOptionsTabImpl
	 * @see dmlsupport.representation.impl.RepresentationPackageImpl#getDSEOptionsTab()
	 * @generated
	 */
	int DSE_OPTIONS_TAB = 2;

	/**
	 * The number of structural features of the '<em>DSE Options Tab</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSE_OPTIONS_TAB_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>DSE Options Tab</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSE_OPTIONS_TAB_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link dmlsupport.representation.impl.DML_DSEOptionsTabImpl <em>DML DSE Options Tab</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dmlsupport.representation.impl.DML_DSEOptionsTabImpl
	 * @see dmlsupport.representation.impl.RepresentationPackageImpl#getDML_DSEOptionsTab()
	 * @generated
	 */
	int DML_DSE_OPTIONS_TAB = 0;

	/**
	 * The number of structural features of the '<em>DML DSE Options Tab</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DML_DSE_OPTIONS_TAB_FEATURE_COUNT = DSE_OPTIONS_TAB_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>DML DSE Options Tab</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DML_DSE_OPTIONS_TAB_OPERATION_COUNT = DSE_OPTIONS_TAB_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link dmlsupport.representation.impl.DSEFileNamesInputTabImpl <em>DSE File Names Input Tab</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dmlsupport.representation.impl.DSEFileNamesInputTabImpl
	 * @see dmlsupport.representation.impl.RepresentationPackageImpl#getDSEFileNamesInputTab()
	 * @generated
	 */
	int DSE_FILE_NAMES_INPUT_TAB = 3;

	/**
	 * The number of structural features of the '<em>DSE File Names Input Tab</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSE_FILE_NAMES_INPUT_TAB_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>DSE File Names Input Tab</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSE_FILE_NAMES_INPUT_TAB_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link dmlsupport.representation.impl.DMLFileNamesInputImpl <em>DML File Names Input</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dmlsupport.representation.impl.DMLFileNamesInputImpl
	 * @see dmlsupport.representation.impl.RepresentationPackageImpl#getDMLFileNamesInput()
	 * @generated
	 */
	int DML_FILE_NAMES_INPUT = 1;

	/**
	 * The number of structural features of the '<em>DML File Names Input</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DML_FILE_NAMES_INPUT_FEATURE_COUNT = DSE_FILE_NAMES_INPUT_TAB_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>DML File Names Input</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DML_FILE_NAMES_INPUT_OPERATION_COUNT = DSE_FILE_NAMES_INPUT_TAB_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link dmlsupport.representation.DML_DSEOptionsTab <em>DML DSE Options Tab</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>DML DSE Options Tab</em>'.
	 * @see dmlsupport.representation.DML_DSEOptionsTab
	 * @generated
	 */
	EClass getDML_DSEOptionsTab();

	/**
	 * Returns the meta object for class '{@link dmlsupport.representation.DMLFileNamesInput <em>DML File Names Input</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>DML File Names Input</em>'.
	 * @see dmlsupport.representation.DMLFileNamesInput
	 * @generated
	 */
	EClass getDMLFileNamesInput();

	/**
	 * Returns the meta object for class '{@link de.uka.ipd.sdq.dsexplore.launch.DSEOptionsTab <em>DSE Options Tab</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>DSE Options Tab</em>'.
	 * @see de.uka.ipd.sdq.dsexplore.launch.DSEOptionsTab
	 * @model instanceClass="de.uka.ipd.sdq.dsexplore.launch.DSEOptionsTab"
	 * @generated
	 */
	EClass getDSEOptionsTab();

	/**
	 * Returns the meta object for class '{@link de.uka.ipd.sdq.dsexplore.launch.DSEFileNamesInputTab <em>DSE File Names Input Tab</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>DSE File Names Input Tab</em>'.
	 * @see de.uka.ipd.sdq.dsexplore.launch.DSEFileNamesInputTab
	 * @model instanceClass="de.uka.ipd.sdq.dsexplore.launch.DSEFileNamesInputTab"
	 * @generated
	 */
	EClass getDSEFileNamesInputTab();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	RepresentationFactory getRepresentationFactory();

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
		 * The meta object literal for the '{@link dmlsupport.representation.impl.DML_DSEOptionsTabImpl <em>DML DSE Options Tab</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dmlsupport.representation.impl.DML_DSEOptionsTabImpl
		 * @see dmlsupport.representation.impl.RepresentationPackageImpl#getDML_DSEOptionsTab()
		 * @generated
		 */
		EClass DML_DSE_OPTIONS_TAB = eINSTANCE.getDML_DSEOptionsTab();

		/**
		 * The meta object literal for the '{@link dmlsupport.representation.impl.DMLFileNamesInputImpl <em>DML File Names Input</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dmlsupport.representation.impl.DMLFileNamesInputImpl
		 * @see dmlsupport.representation.impl.RepresentationPackageImpl#getDMLFileNamesInput()
		 * @generated
		 */
		EClass DML_FILE_NAMES_INPUT = eINSTANCE.getDMLFileNamesInput();

		/**
		 * The meta object literal for the '{@link dmlsupport.representation.impl.DSEOptionsTabImpl <em>DSE Options Tab</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dmlsupport.representation.impl.DSEOptionsTabImpl
		 * @see dmlsupport.representation.impl.RepresentationPackageImpl#getDSEOptionsTab()
		 * @generated
		 */
		EClass DSE_OPTIONS_TAB = eINSTANCE.getDSEOptionsTab();

		/**
		 * The meta object literal for the '{@link dmlsupport.representation.impl.DSEFileNamesInputTabImpl <em>DSE File Names Input Tab</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dmlsupport.representation.impl.DSEFileNamesInputTabImpl
		 * @see dmlsupport.representation.impl.RepresentationPackageImpl#getDSEFileNamesInputTab()
		 * @generated
		 */
		EClass DSE_FILE_NAMES_INPUT_TAB = eINSTANCE.getDSEFileNamesInputTab();

	}

} //RepresentationPackage
