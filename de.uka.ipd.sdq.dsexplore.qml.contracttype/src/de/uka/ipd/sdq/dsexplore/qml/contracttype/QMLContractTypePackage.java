/**
 */
package de.uka.ipd.sdq.dsexplore.qml.contracttype;

import de.uka.ipd.sdq.dsexplore.qml.declarations.QMLDeclarationsPackage;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see de.uka.ipd.sdq.dsexplore.qml.contracttype.QMLContractTypeFactory
 * @model kind="package"
 * @generated
 */
public interface QMLContractTypePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "contracttype";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://sdq.ipd.kit.edu/QML/contracttype/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "contracttype";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	QMLContractTypePackage eINSTANCE = de.uka.ipd.sdq.dsexplore.qml.contracttype.impl.QMLContractTypePackageImpl.init();

	/**
	 * The meta object id for the '{@link de.uka.ipd.sdq.dsexplore.qml.contracttype.impl.QMLContractTypeImpl <em>QML Contract Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uka.ipd.sdq.dsexplore.qml.contracttype.impl.QMLContractTypeImpl
	 * @see de.uka.ipd.sdq.dsexplore.qml.contracttype.impl.QMLContractTypePackageImpl#getQMLContractType()
	 * @generated
	 */
	int QML_CONTRACT_TYPE = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QML_CONTRACT_TYPE__ID = QMLDeclarationsPackage.QML_DECLARATION__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QML_CONTRACT_TYPE__NAME = QMLDeclarationsPackage.QML_DECLARATION__NAME;

	/**
	 * The feature id for the '<em><b>Dimensions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QML_CONTRACT_TYPE__DIMENSIONS = QMLDeclarationsPackage.QML_DECLARATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>QML Contract Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QML_CONTRACT_TYPE_FEATURE_COUNT = QMLDeclarationsPackage.QML_DECLARATION_FEATURE_COUNT + 1;


	/**
	 * Returns the meta object for class '{@link de.uka.ipd.sdq.dsexplore.qml.contracttype.QMLContractType <em>QML Contract Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>QML Contract Type</em>'.
	 * @see de.uka.ipd.sdq.dsexplore.qml.contracttype.QMLContractType
	 * @generated
	 */
	EClass getQMLContractType();

	/**
	 * Returns the meta object for the reference list '{@link de.uka.ipd.sdq.dsexplore.qml.contracttype.QMLContractType#getDimensions <em>Dimensions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Dimensions</em>'.
	 * @see de.uka.ipd.sdq.dsexplore.qml.contracttype.QMLContractType#getDimensions()
	 * @see #getQMLContractType()
	 * @generated
	 */
	EReference getQMLContractType_Dimensions();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	QMLContractTypeFactory getQMLContractTypeFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link de.uka.ipd.sdq.dsexplore.qml.contracttype.impl.QMLContractTypeImpl <em>QML Contract Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uka.ipd.sdq.dsexplore.qml.contracttype.impl.QMLContractTypeImpl
		 * @see de.uka.ipd.sdq.dsexplore.qml.contracttype.impl.QMLContractTypePackageImpl#getQMLContractType()
		 * @generated
		 */
		EClass QML_CONTRACT_TYPE = eINSTANCE.getQMLContractType();

		/**
		 * The meta object literal for the '<em><b>Dimensions</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QML_CONTRACT_TYPE__DIMENSIONS = eINSTANCE.getQMLContractType_Dimensions();

	}

} //QMLContractTypePackage
