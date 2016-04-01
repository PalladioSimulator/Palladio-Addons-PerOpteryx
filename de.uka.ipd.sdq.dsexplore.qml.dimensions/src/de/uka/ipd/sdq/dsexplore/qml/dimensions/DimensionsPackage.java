/**
 */
package de.uka.ipd.sdq.dsexplore.qml.dimensions;

import de.uka.ipd.sdq.identifier.IdentifierPackage;

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
 * @see de.uka.ipd.sdq.dsexplore.qml.dimensions.DimensionsFactory
 * @model kind="package"
 * @generated
 */
public interface DimensionsPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "dimensions";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://sdq.ipd.kit.edu/QML/dimensions/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "dimensions";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	DimensionsPackage eINSTANCE = de.uka.ipd.sdq.dsexplore.qml.dimensions.impl.DimensionsPackageImpl.init();

	/**
	 * The meta object id for the '{@link de.uka.ipd.sdq.dsexplore.qml.dimensions.impl.DimensionImpl <em>Dimension</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uka.ipd.sdq.dsexplore.qml.dimensions.impl.DimensionImpl
	 * @see de.uka.ipd.sdq.dsexplore.qml.dimensions.impl.DimensionsPackageImpl#getDimension()
	 * @generated
	 */
	int DIMENSION = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIMENSION__ID = IdentifierPackage.IDENTIFIER__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIMENSION__NAME = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIMENSION__TYPE = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Unit</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIMENSION__UNIT = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Dimension</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIMENSION_FEATURE_COUNT = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link de.uka.ipd.sdq.dsexplore.qml.dimensions.impl.DimensionRepositoryImpl <em>Dimension Repository</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uka.ipd.sdq.dsexplore.qml.dimensions.impl.DimensionRepositoryImpl
	 * @see de.uka.ipd.sdq.dsexplore.qml.dimensions.impl.DimensionsPackageImpl#getDimensionRepository()
	 * @generated
	 */
	int DIMENSION_REPOSITORY = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIMENSION_REPOSITORY__ID = IdentifierPackage.IDENTIFIER__ID;

	/**
	 * The feature id for the '<em><b>Dimensions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIMENSION_REPOSITORY__DIMENSIONS = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Dimension Repository</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIMENSION_REPOSITORY_FEATURE_COUNT = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 1;


	/**
	 * Returns the meta object for class '{@link de.uka.ipd.sdq.dsexplore.qml.dimensions.Dimension <em>Dimension</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dimension</em>'.
	 * @see de.uka.ipd.sdq.dsexplore.qml.dimensions.Dimension
	 * @generated
	 */
	EClass getDimension();

	/**
	 * Returns the meta object for the reference '{@link de.uka.ipd.sdq.dsexplore.qml.dimensions.Dimension#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see de.uka.ipd.sdq.dsexplore.qml.dimensions.Dimension#getType()
	 * @see #getDimension()
	 * @generated
	 */
	EReference getDimension_Type();

	/**
	 * Returns the meta object for the reference '{@link de.uka.ipd.sdq.dsexplore.qml.dimensions.Dimension#getUnit <em>Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Unit</em>'.
	 * @see de.uka.ipd.sdq.dsexplore.qml.dimensions.Dimension#getUnit()
	 * @see #getDimension()
	 * @generated
	 */
	EReference getDimension_Unit();

	/**
	 * Returns the meta object for class '{@link de.uka.ipd.sdq.dsexplore.qml.dimensions.DimensionRepository <em>Dimension Repository</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dimension Repository</em>'.
	 * @see de.uka.ipd.sdq.dsexplore.qml.dimensions.DimensionRepository
	 * @generated
	 */
	EClass getDimensionRepository();

	/**
	 * Returns the meta object for the containment reference list '{@link de.uka.ipd.sdq.dsexplore.qml.dimensions.DimensionRepository#getDimensions <em>Dimensions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Dimensions</em>'.
	 * @see de.uka.ipd.sdq.dsexplore.qml.dimensions.DimensionRepository#getDimensions()
	 * @see #getDimensionRepository()
	 * @generated
	 */
	EReference getDimensionRepository_Dimensions();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	DimensionsFactory getDimensionsFactory();

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
		 * The meta object literal for the '{@link de.uka.ipd.sdq.dsexplore.qml.dimensions.impl.DimensionImpl <em>Dimension</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uka.ipd.sdq.dsexplore.qml.dimensions.impl.DimensionImpl
		 * @see de.uka.ipd.sdq.dsexplore.qml.dimensions.impl.DimensionsPackageImpl#getDimension()
		 * @generated
		 */
		EClass DIMENSION = eINSTANCE.getDimension();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DIMENSION__TYPE = eINSTANCE.getDimension_Type();

		/**
		 * The meta object literal for the '<em><b>Unit</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DIMENSION__UNIT = eINSTANCE.getDimension_Unit();

		/**
		 * The meta object literal for the '{@link de.uka.ipd.sdq.dsexplore.qml.dimensions.impl.DimensionRepositoryImpl <em>Dimension Repository</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uka.ipd.sdq.dsexplore.qml.dimensions.impl.DimensionRepositoryImpl
		 * @see de.uka.ipd.sdq.dsexplore.qml.dimensions.impl.DimensionsPackageImpl#getDimensionRepository()
		 * @generated
		 */
		EClass DIMENSION_REPOSITORY = eINSTANCE.getDimensionRepository();

		/**
		 * The meta object literal for the '<em><b>Dimensions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DIMENSION_REPOSITORY__DIMENSIONS = eINSTANCE.getDimensionRepository_Dimensions();

	}

} //DimensionsPackage
