/**
 */
package dmlsupport.helper;

import genericdesigndecision.GenericdesigndecisionPackage;
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
 * @see dmlsupport.helper.HelperFactory
 * @model kind="package"
 * @generated
 */
public interface HelperPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "helper";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://sdq.ipd.uka.de/dmlsupport/helper";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "helper";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	HelperPackage eINSTANCE = dmlsupport.helper.impl.HelperPackageImpl.init();

	/**
	 * The meta object id for the '{@link dmlsupport.helper.impl.DMLPhenotypeImpl <em>DML Phenotype</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dmlsupport.helper.impl.DMLPhenotypeImpl
	 * @see dmlsupport.helper.impl.HelperPackageImpl#getDMLPhenotype()
	 * @generated
	 */
	int DML_PHENOTYPE = 0;

	/**
	 * The number of structural features of the '<em>DML Phenotype</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DML_PHENOTYPE_FEATURE_COUNT = GenericdesigndecisionPackage.PHENOTYPE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>DML Phenotype</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DML_PHENOTYPE_OPERATION_COUNT = GenericdesigndecisionPackage.PHENOTYPE_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link dmlsupport.helper.DMLPhenotype <em>DML Phenotype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>DML Phenotype</em>'.
	 * @see dmlsupport.helper.DMLPhenotype
	 * @generated
	 */
	EClass getDMLPhenotype();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	HelperFactory getHelperFactory();

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
		 * The meta object literal for the '{@link dmlsupport.helper.impl.DMLPhenotypeImpl <em>DML Phenotype</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dmlsupport.helper.impl.DMLPhenotypeImpl
		 * @see dmlsupport.helper.impl.HelperPackageImpl#getDMLPhenotype()
		 * @generated
		 */
		EClass DML_PHENOTYPE = eINSTANCE.getDMLPhenotype();

	}

} //HelperPackage
