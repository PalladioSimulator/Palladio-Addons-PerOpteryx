/**
 */
package de.uka.ipd.sdq.dsexplore.qml.dimensiontypes;

import de.uka.ipd.sdq.identifier.IdentifierPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
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
 * @see de.uka.ipd.sdq.dsexplore.qml.dimensiontypes.DimensiontypesFactory
 * @model kind="package"
 * @generated
 */
public interface DimensiontypesPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "dimensiontypes";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://sdq.ipd.kit.edu/QML/dimensiontypes/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "dimensiontypes";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	DimensiontypesPackage eINSTANCE = de.uka.ipd.sdq.dsexplore.qml.dimensiontypes.impl.DimensiontypesPackageImpl.init();

	/**
	 * The meta object id for the '{@link de.uka.ipd.sdq.dsexplore.qml.dimensiontypes.impl.DimensionTypeImpl <em>Dimension Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uka.ipd.sdq.dsexplore.qml.dimensiontypes.impl.DimensionTypeImpl
	 * @see de.uka.ipd.sdq.dsexplore.qml.dimensiontypes.impl.DimensiontypesPackageImpl#getDimensionType()
	 * @generated
	 */
	int DIMENSION_TYPE = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIMENSION_TYPE__ID = IdentifierPackage.IDENTIFIER__ID;

	/**
	 * The feature id for the '<em><b>Relation Semantics</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIMENSION_TYPE__RELATION_SEMANTICS = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Dimension Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIMENSION_TYPE_FEATURE_COUNT = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link de.uka.ipd.sdq.dsexplore.qml.dimensiontypes.impl.DimensionTypeSetImpl <em>Dimension Type Set</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uka.ipd.sdq.dsexplore.qml.dimensiontypes.impl.DimensionTypeSetImpl
	 * @see de.uka.ipd.sdq.dsexplore.qml.dimensiontypes.impl.DimensiontypesPackageImpl#getDimensionTypeSet()
	 * @generated
	 */
	int DIMENSION_TYPE_SET = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIMENSION_TYPE_SET__ID = DIMENSION_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Relation Semantics</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIMENSION_TYPE_SET__RELATION_SEMANTICS = DIMENSION_TYPE__RELATION_SEMANTICS;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIMENSION_TYPE_SET__ELEMENTS = DIMENSION_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Order</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIMENSION_TYPE_SET__ORDER = DIMENSION_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Dimension Type Set</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIMENSION_TYPE_SET_FEATURE_COUNT = DIMENSION_TYPE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link de.uka.ipd.sdq.dsexplore.qml.dimensiontypes.impl.RelationSemanticsImpl <em>Relation Semantics</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uka.ipd.sdq.dsexplore.qml.dimensiontypes.impl.RelationSemanticsImpl
	 * @see de.uka.ipd.sdq.dsexplore.qml.dimensiontypes.impl.DimensiontypesPackageImpl#getRelationSemantics()
	 * @generated
	 */
	int RELATION_SEMANTICS = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_SEMANTICS__ID = IdentifierPackage.IDENTIFIER__ID;

	/**
	 * The feature id for the '<em><b>Rel Sem</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_SEMANTICS__REL_SEM = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Relation Semantics</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_SEMANTICS_FEATURE_COUNT = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link de.uka.ipd.sdq.dsexplore.qml.dimensiontypes.impl.ElementImpl <em>Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uka.ipd.sdq.dsexplore.qml.dimensiontypes.impl.ElementImpl
	 * @see de.uka.ipd.sdq.dsexplore.qml.dimensiontypes.impl.DimensiontypesPackageImpl#getElement()
	 * @generated
	 */
	int ELEMENT = 3;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__ID = IdentifierPackage.IDENTIFIER__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__NAME = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_FEATURE_COUNT = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link de.uka.ipd.sdq.dsexplore.qml.dimensiontypes.impl.OrderImpl <em>Order</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uka.ipd.sdq.dsexplore.qml.dimensiontypes.impl.OrderImpl
	 * @see de.uka.ipd.sdq.dsexplore.qml.dimensiontypes.impl.DimensiontypesPackageImpl#getOrder()
	 * @generated
	 */
	int ORDER = 4;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER__ID = IdentifierPackage.IDENTIFIER__ID;

	/**
	 * The feature id for the '<em><b>Bigger Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER__BIGGER_ELEMENT = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Smaller Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER__SMALLER_ELEMENT = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Order</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_FEATURE_COUNT = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link de.uka.ipd.sdq.dsexplore.qml.dimensiontypes.impl.DimensionTypeEnumImpl <em>Dimension Type Enum</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uka.ipd.sdq.dsexplore.qml.dimensiontypes.impl.DimensionTypeEnumImpl
	 * @see de.uka.ipd.sdq.dsexplore.qml.dimensiontypes.impl.DimensiontypesPackageImpl#getDimensionTypeEnum()
	 * @generated
	 */
	int DIMENSION_TYPE_ENUM = 5;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIMENSION_TYPE_ENUM__ID = DIMENSION_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Relation Semantics</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIMENSION_TYPE_ENUM__RELATION_SEMANTICS = DIMENSION_TYPE__RELATION_SEMANTICS;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIMENSION_TYPE_ENUM__ELEMENTS = DIMENSION_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Order</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIMENSION_TYPE_ENUM__ORDER = DIMENSION_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Dimension Type Enum</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIMENSION_TYPE_ENUM_FEATURE_COUNT = DIMENSION_TYPE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link de.uka.ipd.sdq.dsexplore.qml.dimensiontypes.impl.DimensionTypeNumericImpl <em>Dimension Type Numeric</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uka.ipd.sdq.dsexplore.qml.dimensiontypes.impl.DimensionTypeNumericImpl
	 * @see de.uka.ipd.sdq.dsexplore.qml.dimensiontypes.impl.DimensiontypesPackageImpl#getDimensionTypeNumeric()
	 * @generated
	 */
	int DIMENSION_TYPE_NUMERIC = 6;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIMENSION_TYPE_NUMERIC__ID = DIMENSION_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Relation Semantics</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIMENSION_TYPE_NUMERIC__RELATION_SEMANTICS = DIMENSION_TYPE__RELATION_SEMANTICS;

	/**
	 * The feature id for the '<em><b>Range</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIMENSION_TYPE_NUMERIC__RANGE = DIMENSION_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Domain</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIMENSION_TYPE_NUMERIC__DOMAIN = DIMENSION_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Dimension Type Numeric</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIMENSION_TYPE_NUMERIC_FEATURE_COUNT = DIMENSION_TYPE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link de.uka.ipd.sdq.dsexplore.qml.dimensiontypes.impl.NumericRangeImpl <em>Numeric Range</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uka.ipd.sdq.dsexplore.qml.dimensiontypes.impl.NumericRangeImpl
	 * @see de.uka.ipd.sdq.dsexplore.qml.dimensiontypes.impl.DimensiontypesPackageImpl#getNumericRange()
	 * @generated
	 */
	int NUMERIC_RANGE = 7;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMERIC_RANGE__ID = IdentifierPackage.IDENTIFIER__ID;

	/**
	 * The feature id for the '<em><b>Lower Limit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMERIC_RANGE__LOWER_LIMIT = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Upper Limit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMERIC_RANGE__UPPER_LIMIT = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Numeric Range</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMERIC_RANGE_FEATURE_COUNT = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link de.uka.ipd.sdq.dsexplore.qml.dimensiontypes.impl.DimensionTypeRepositoryImpl <em>Dimension Type Repository</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uka.ipd.sdq.dsexplore.qml.dimensiontypes.impl.DimensionTypeRepositoryImpl
	 * @see de.uka.ipd.sdq.dsexplore.qml.dimensiontypes.impl.DimensiontypesPackageImpl#getDimensionTypeRepository()
	 * @generated
	 */
	int DIMENSION_TYPE_REPOSITORY = 8;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIMENSION_TYPE_REPOSITORY__ID = IdentifierPackage.IDENTIFIER__ID;

	/**
	 * The feature id for the '<em><b>Dimension Types</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIMENSION_TYPE_REPOSITORY__DIMENSION_TYPES = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Dimension Type Repository</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIMENSION_TYPE_REPOSITORY_FEATURE_COUNT = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link de.uka.ipd.sdq.dsexplore.qml.dimensiontypes.impl.DimensionTypeScaleImpl <em>Dimension Type Scale</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uka.ipd.sdq.dsexplore.qml.dimensiontypes.impl.DimensionTypeScaleImpl
	 * @see de.uka.ipd.sdq.dsexplore.qml.dimensiontypes.impl.DimensiontypesPackageImpl#getDimensionTypeScale()
	 * @generated
	 */
	int DIMENSION_TYPE_SCALE = 9;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIMENSION_TYPE_SCALE__ID = DIMENSION_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Relation Semantics</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIMENSION_TYPE_SCALE__RELATION_SEMANTICS = DIMENSION_TYPE__RELATION_SEMANTICS;

	/**
	 * The feature id for the '<em><b>Scale Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIMENSION_TYPE_SCALE__SCALE_ELEMENTS = DIMENSION_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Scale</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIMENSION_TYPE_SCALE__SCALE = DIMENSION_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Dimension Type Scale</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIMENSION_TYPE_SCALE_FEATURE_COUNT = DIMENSION_TYPE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link de.uka.ipd.sdq.dsexplore.qml.dimensiontypes.impl.ScaleElementImpl <em>Scale Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uka.ipd.sdq.dsexplore.qml.dimensiontypes.impl.ScaleElementImpl
	 * @see de.uka.ipd.sdq.dsexplore.qml.dimensiontypes.impl.DimensiontypesPackageImpl#getScaleElement()
	 * @generated
	 */
	int SCALE_ELEMENT = 10;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCALE_ELEMENT__ID = ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCALE_ELEMENT__NAME = ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCALE_ELEMENT__VALUE = ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Scale</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCALE_ELEMENT__SCALE = ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Scale Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCALE_ELEMENT_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link de.uka.ipd.sdq.dsexplore.qml.dimensiontypes.EnumRelationSemantics <em>Enum Relation Semantics</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uka.ipd.sdq.dsexplore.qml.dimensiontypes.EnumRelationSemantics
	 * @see de.uka.ipd.sdq.dsexplore.qml.dimensiontypes.impl.DimensiontypesPackageImpl#getEnumRelationSemantics()
	 * @generated
	 */
	int ENUM_RELATION_SEMANTICS = 11;

	/**
	 * The meta object id for the '{@link de.uka.ipd.sdq.dsexplore.qml.dimensiontypes.EnumNumericDomain <em>Enum Numeric Domain</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uka.ipd.sdq.dsexplore.qml.dimensiontypes.EnumNumericDomain
	 * @see de.uka.ipd.sdq.dsexplore.qml.dimensiontypes.impl.DimensiontypesPackageImpl#getEnumNumericDomain()
	 * @generated
	 */
	int ENUM_NUMERIC_DOMAIN = 12;

	/**
	 * The meta object id for the '{@link de.uka.ipd.sdq.dsexplore.qml.dimensiontypes.EScaleOfMeasure <em>EScale Of Measure</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uka.ipd.sdq.dsexplore.qml.dimensiontypes.EScaleOfMeasure
	 * @see de.uka.ipd.sdq.dsexplore.qml.dimensiontypes.impl.DimensiontypesPackageImpl#getEScaleOfMeasure()
	 * @generated
	 */
	int ESCALE_OF_MEASURE = 13;

	/**
	 * The meta object id for the '<em>ENumber</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Number
	 * @see de.uka.ipd.sdq.dsexplore.qml.dimensiontypes.impl.DimensiontypesPackageImpl#getENumber()
	 * @generated
	 */
	int ENUMBER = 14;


	/**
	 * Returns the meta object for class '{@link de.uka.ipd.sdq.dsexplore.qml.dimensiontypes.DimensionTypeSet <em>Dimension Type Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dimension Type Set</em>'.
	 * @see de.uka.ipd.sdq.dsexplore.qml.dimensiontypes.DimensionTypeSet
	 * @generated
	 */
	EClass getDimensionTypeSet();

	/**
	 * Returns the meta object for the containment reference list '{@link de.uka.ipd.sdq.dsexplore.qml.dimensiontypes.DimensionTypeSet#getElements <em>Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Elements</em>'.
	 * @see de.uka.ipd.sdq.dsexplore.qml.dimensiontypes.DimensionTypeSet#getElements()
	 * @see #getDimensionTypeSet()
	 * @generated
	 */
	EReference getDimensionTypeSet_Elements();

	/**
	 * Returns the meta object for the containment reference list '{@link de.uka.ipd.sdq.dsexplore.qml.dimensiontypes.DimensionTypeSet#getOrder <em>Order</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Order</em>'.
	 * @see de.uka.ipd.sdq.dsexplore.qml.dimensiontypes.DimensionTypeSet#getOrder()
	 * @see #getDimensionTypeSet()
	 * @generated
	 */
	EReference getDimensionTypeSet_Order();

	/**
	 * Returns the meta object for class '{@link de.uka.ipd.sdq.dsexplore.qml.dimensiontypes.DimensionType <em>Dimension Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dimension Type</em>'.
	 * @see de.uka.ipd.sdq.dsexplore.qml.dimensiontypes.DimensionType
	 * @generated
	 */
	EClass getDimensionType();

	/**
	 * Returns the meta object for the containment reference '{@link de.uka.ipd.sdq.dsexplore.qml.dimensiontypes.DimensionType#getRelationSemantics <em>Relation Semantics</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Relation Semantics</em>'.
	 * @see de.uka.ipd.sdq.dsexplore.qml.dimensiontypes.DimensionType#getRelationSemantics()
	 * @see #getDimensionType()
	 * @generated
	 */
	EReference getDimensionType_RelationSemantics();

	/**
	 * Returns the meta object for class '{@link de.uka.ipd.sdq.dsexplore.qml.dimensiontypes.RelationSemantics <em>Relation Semantics</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Relation Semantics</em>'.
	 * @see de.uka.ipd.sdq.dsexplore.qml.dimensiontypes.RelationSemantics
	 * @generated
	 */
	EClass getRelationSemantics();

	/**
	 * Returns the meta object for the attribute '{@link de.uka.ipd.sdq.dsexplore.qml.dimensiontypes.RelationSemantics#getRelSem <em>Rel Sem</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rel Sem</em>'.
	 * @see de.uka.ipd.sdq.dsexplore.qml.dimensiontypes.RelationSemantics#getRelSem()
	 * @see #getRelationSemantics()
	 * @generated
	 */
	EAttribute getRelationSemantics_RelSem();

	/**
	 * Returns the meta object for class '{@link de.uka.ipd.sdq.dsexplore.qml.dimensiontypes.Element <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Element</em>'.
	 * @see de.uka.ipd.sdq.dsexplore.qml.dimensiontypes.Element
	 * @generated
	 */
	EClass getElement();

	/**
	 * Returns the meta object for class '{@link de.uka.ipd.sdq.dsexplore.qml.dimensiontypes.Order <em>Order</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Order</em>'.
	 * @see de.uka.ipd.sdq.dsexplore.qml.dimensiontypes.Order
	 * @generated
	 */
	EClass getOrder();

	/**
	 * Returns the meta object for the reference '{@link de.uka.ipd.sdq.dsexplore.qml.dimensiontypes.Order#getBiggerElement <em>Bigger Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Bigger Element</em>'.
	 * @see de.uka.ipd.sdq.dsexplore.qml.dimensiontypes.Order#getBiggerElement()
	 * @see #getOrder()
	 * @generated
	 */
	EReference getOrder_BiggerElement();

	/**
	 * Returns the meta object for the reference '{@link de.uka.ipd.sdq.dsexplore.qml.dimensiontypes.Order#getSmallerElement <em>Smaller Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Smaller Element</em>'.
	 * @see de.uka.ipd.sdq.dsexplore.qml.dimensiontypes.Order#getSmallerElement()
	 * @see #getOrder()
	 * @generated
	 */
	EReference getOrder_SmallerElement();

	/**
	 * Returns the meta object for class '{@link de.uka.ipd.sdq.dsexplore.qml.dimensiontypes.DimensionTypeEnum <em>Dimension Type Enum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dimension Type Enum</em>'.
	 * @see de.uka.ipd.sdq.dsexplore.qml.dimensiontypes.DimensionTypeEnum
	 * @generated
	 */
	EClass getDimensionTypeEnum();

	/**
	 * Returns the meta object for the containment reference list '{@link de.uka.ipd.sdq.dsexplore.qml.dimensiontypes.DimensionTypeEnum#getElements <em>Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Elements</em>'.
	 * @see de.uka.ipd.sdq.dsexplore.qml.dimensiontypes.DimensionTypeEnum#getElements()
	 * @see #getDimensionTypeEnum()
	 * @generated
	 */
	EReference getDimensionTypeEnum_Elements();

	/**
	 * Returns the meta object for the containment reference list '{@link de.uka.ipd.sdq.dsexplore.qml.dimensiontypes.DimensionTypeEnum#getOrder <em>Order</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Order</em>'.
	 * @see de.uka.ipd.sdq.dsexplore.qml.dimensiontypes.DimensionTypeEnum#getOrder()
	 * @see #getDimensionTypeEnum()
	 * @generated
	 */
	EReference getDimensionTypeEnum_Order();

	/**
	 * Returns the meta object for class '{@link de.uka.ipd.sdq.dsexplore.qml.dimensiontypes.DimensionTypeNumeric <em>Dimension Type Numeric</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dimension Type Numeric</em>'.
	 * @see de.uka.ipd.sdq.dsexplore.qml.dimensiontypes.DimensionTypeNumeric
	 * @generated
	 */
	EClass getDimensionTypeNumeric();

	/**
	 * Returns the meta object for the containment reference '{@link de.uka.ipd.sdq.dsexplore.qml.dimensiontypes.DimensionTypeNumeric#getRange <em>Range</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Range</em>'.
	 * @see de.uka.ipd.sdq.dsexplore.qml.dimensiontypes.DimensionTypeNumeric#getRange()
	 * @see #getDimensionTypeNumeric()
	 * @generated
	 */
	EReference getDimensionTypeNumeric_Range();

	/**
	 * Returns the meta object for the attribute '{@link de.uka.ipd.sdq.dsexplore.qml.dimensiontypes.DimensionTypeNumeric#getDomain <em>Domain</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Domain</em>'.
	 * @see de.uka.ipd.sdq.dsexplore.qml.dimensiontypes.DimensionTypeNumeric#getDomain()
	 * @see #getDimensionTypeNumeric()
	 * @generated
	 */
	EAttribute getDimensionTypeNumeric_Domain();

	/**
	 * Returns the meta object for class '{@link de.uka.ipd.sdq.dsexplore.qml.dimensiontypes.NumericRange <em>Numeric Range</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Numeric Range</em>'.
	 * @see de.uka.ipd.sdq.dsexplore.qml.dimensiontypes.NumericRange
	 * @generated
	 */
	EClass getNumericRange();

	/**
	 * Returns the meta object for the attribute '{@link de.uka.ipd.sdq.dsexplore.qml.dimensiontypes.NumericRange#getLowerLimit <em>Lower Limit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lower Limit</em>'.
	 * @see de.uka.ipd.sdq.dsexplore.qml.dimensiontypes.NumericRange#getLowerLimit()
	 * @see #getNumericRange()
	 * @generated
	 */
	EAttribute getNumericRange_LowerLimit();

	/**
	 * Returns the meta object for the attribute '{@link de.uka.ipd.sdq.dsexplore.qml.dimensiontypes.NumericRange#getUpperLimit <em>Upper Limit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Upper Limit</em>'.
	 * @see de.uka.ipd.sdq.dsexplore.qml.dimensiontypes.NumericRange#getUpperLimit()
	 * @see #getNumericRange()
	 * @generated
	 */
	EAttribute getNumericRange_UpperLimit();

	/**
	 * Returns the meta object for class '{@link de.uka.ipd.sdq.dsexplore.qml.dimensiontypes.DimensionTypeRepository <em>Dimension Type Repository</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dimension Type Repository</em>'.
	 * @see de.uka.ipd.sdq.dsexplore.qml.dimensiontypes.DimensionTypeRepository
	 * @generated
	 */
	EClass getDimensionTypeRepository();

	/**
	 * Returns the meta object for the containment reference list '{@link de.uka.ipd.sdq.dsexplore.qml.dimensiontypes.DimensionTypeRepository#getDimensionTypes <em>Dimension Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Dimension Types</em>'.
	 * @see de.uka.ipd.sdq.dsexplore.qml.dimensiontypes.DimensionTypeRepository#getDimensionTypes()
	 * @see #getDimensionTypeRepository()
	 * @generated
	 */
	EReference getDimensionTypeRepository_DimensionTypes();

	/**
	 * Returns the meta object for class '{@link de.uka.ipd.sdq.dsexplore.qml.dimensiontypes.DimensionTypeScale <em>Dimension Type Scale</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dimension Type Scale</em>'.
	 * @see de.uka.ipd.sdq.dsexplore.qml.dimensiontypes.DimensionTypeScale
	 * @generated
	 */
	EClass getDimensionTypeScale();

	/**
	 * Returns the meta object for the containment reference list '{@link de.uka.ipd.sdq.dsexplore.qml.dimensiontypes.DimensionTypeScale#getScaleElements <em>Scale Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Scale Elements</em>'.
	 * @see de.uka.ipd.sdq.dsexplore.qml.dimensiontypes.DimensionTypeScale#getScaleElements()
	 * @see #getDimensionTypeScale()
	 * @generated
	 */
	EReference getDimensionTypeScale_ScaleElements();

	/**
	 * Returns the meta object for the attribute '{@link de.uka.ipd.sdq.dsexplore.qml.dimensiontypes.DimensionTypeScale#getScale <em>Scale</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Scale</em>'.
	 * @see de.uka.ipd.sdq.dsexplore.qml.dimensiontypes.DimensionTypeScale#getScale()
	 * @see #getDimensionTypeScale()
	 * @generated
	 */
	EAttribute getDimensionTypeScale_Scale();

	/**
	 * Returns the meta object for class '{@link de.uka.ipd.sdq.dsexplore.qml.dimensiontypes.ScaleElement <em>Scale Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Scale Element</em>'.
	 * @see de.uka.ipd.sdq.dsexplore.qml.dimensiontypes.ScaleElement
	 * @generated
	 */
	EClass getScaleElement();

	/**
	 * Returns the meta object for the attribute '{@link de.uka.ipd.sdq.dsexplore.qml.dimensiontypes.ScaleElement#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see de.uka.ipd.sdq.dsexplore.qml.dimensiontypes.ScaleElement#getValue()
	 * @see #getScaleElement()
	 * @generated
	 */
	EAttribute getScaleElement_Value();

	/**
	 * Returns the meta object for the attribute '{@link de.uka.ipd.sdq.dsexplore.qml.dimensiontypes.ScaleElement#getScale <em>Scale</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Scale</em>'.
	 * @see de.uka.ipd.sdq.dsexplore.qml.dimensiontypes.ScaleElement#getScale()
	 * @see #getScaleElement()
	 * @generated
	 */
	EAttribute getScaleElement_Scale();

	/**
	 * Returns the meta object for enum '{@link de.uka.ipd.sdq.dsexplore.qml.dimensiontypes.EnumRelationSemantics <em>Enum Relation Semantics</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Enum Relation Semantics</em>'.
	 * @see de.uka.ipd.sdq.dsexplore.qml.dimensiontypes.EnumRelationSemantics
	 * @generated
	 */
	EEnum getEnumRelationSemantics();

	/**
	 * Returns the meta object for enum '{@link de.uka.ipd.sdq.dsexplore.qml.dimensiontypes.EnumNumericDomain <em>Enum Numeric Domain</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Enum Numeric Domain</em>'.
	 * @see de.uka.ipd.sdq.dsexplore.qml.dimensiontypes.EnumNumericDomain
	 * @generated
	 */
	EEnum getEnumNumericDomain();

	/**
	 * Returns the meta object for enum '{@link de.uka.ipd.sdq.dsexplore.qml.dimensiontypes.EScaleOfMeasure <em>EScale Of Measure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>EScale Of Measure</em>'.
	 * @see de.uka.ipd.sdq.dsexplore.qml.dimensiontypes.EScaleOfMeasure
	 * @generated
	 */
	EEnum getEScaleOfMeasure();

	/**
	 * Returns the meta object for data type '{@link java.lang.Number <em>ENumber</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>ENumber</em>'.
	 * @see java.lang.Number
	 * @model instanceClass="java.lang.Number"
	 * @generated
	 */
	EDataType getENumber();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	DimensiontypesFactory getDimensiontypesFactory();

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
		 * The meta object literal for the '{@link de.uka.ipd.sdq.dsexplore.qml.dimensiontypes.impl.DimensionTypeSetImpl <em>Dimension Type Set</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uka.ipd.sdq.dsexplore.qml.dimensiontypes.impl.DimensionTypeSetImpl
		 * @see de.uka.ipd.sdq.dsexplore.qml.dimensiontypes.impl.DimensiontypesPackageImpl#getDimensionTypeSet()
		 * @generated
		 */
		EClass DIMENSION_TYPE_SET = eINSTANCE.getDimensionTypeSet();

		/**
		 * The meta object literal for the '<em><b>Elements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DIMENSION_TYPE_SET__ELEMENTS = eINSTANCE.getDimensionTypeSet_Elements();

		/**
		 * The meta object literal for the '<em><b>Order</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DIMENSION_TYPE_SET__ORDER = eINSTANCE.getDimensionTypeSet_Order();

		/**
		 * The meta object literal for the '{@link de.uka.ipd.sdq.dsexplore.qml.dimensiontypes.impl.DimensionTypeImpl <em>Dimension Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uka.ipd.sdq.dsexplore.qml.dimensiontypes.impl.DimensionTypeImpl
		 * @see de.uka.ipd.sdq.dsexplore.qml.dimensiontypes.impl.DimensiontypesPackageImpl#getDimensionType()
		 * @generated
		 */
		EClass DIMENSION_TYPE = eINSTANCE.getDimensionType();

		/**
		 * The meta object literal for the '<em><b>Relation Semantics</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DIMENSION_TYPE__RELATION_SEMANTICS = eINSTANCE.getDimensionType_RelationSemantics();

		/**
		 * The meta object literal for the '{@link de.uka.ipd.sdq.dsexplore.qml.dimensiontypes.impl.RelationSemanticsImpl <em>Relation Semantics</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uka.ipd.sdq.dsexplore.qml.dimensiontypes.impl.RelationSemanticsImpl
		 * @see de.uka.ipd.sdq.dsexplore.qml.dimensiontypes.impl.DimensiontypesPackageImpl#getRelationSemantics()
		 * @generated
		 */
		EClass RELATION_SEMANTICS = eINSTANCE.getRelationSemantics();

		/**
		 * The meta object literal for the '<em><b>Rel Sem</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RELATION_SEMANTICS__REL_SEM = eINSTANCE.getRelationSemantics_RelSem();

		/**
		 * The meta object literal for the '{@link de.uka.ipd.sdq.dsexplore.qml.dimensiontypes.impl.ElementImpl <em>Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uka.ipd.sdq.dsexplore.qml.dimensiontypes.impl.ElementImpl
		 * @see de.uka.ipd.sdq.dsexplore.qml.dimensiontypes.impl.DimensiontypesPackageImpl#getElement()
		 * @generated
		 */
		EClass ELEMENT = eINSTANCE.getElement();

		/**
		 * The meta object literal for the '{@link de.uka.ipd.sdq.dsexplore.qml.dimensiontypes.impl.OrderImpl <em>Order</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uka.ipd.sdq.dsexplore.qml.dimensiontypes.impl.OrderImpl
		 * @see de.uka.ipd.sdq.dsexplore.qml.dimensiontypes.impl.DimensiontypesPackageImpl#getOrder()
		 * @generated
		 */
		EClass ORDER = eINSTANCE.getOrder();

		/**
		 * The meta object literal for the '<em><b>Bigger Element</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORDER__BIGGER_ELEMENT = eINSTANCE.getOrder_BiggerElement();

		/**
		 * The meta object literal for the '<em><b>Smaller Element</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORDER__SMALLER_ELEMENT = eINSTANCE.getOrder_SmallerElement();

		/**
		 * The meta object literal for the '{@link de.uka.ipd.sdq.dsexplore.qml.dimensiontypes.impl.DimensionTypeEnumImpl <em>Dimension Type Enum</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uka.ipd.sdq.dsexplore.qml.dimensiontypes.impl.DimensionTypeEnumImpl
		 * @see de.uka.ipd.sdq.dsexplore.qml.dimensiontypes.impl.DimensiontypesPackageImpl#getDimensionTypeEnum()
		 * @generated
		 */
		EClass DIMENSION_TYPE_ENUM = eINSTANCE.getDimensionTypeEnum();

		/**
		 * The meta object literal for the '<em><b>Elements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DIMENSION_TYPE_ENUM__ELEMENTS = eINSTANCE.getDimensionTypeEnum_Elements();

		/**
		 * The meta object literal for the '<em><b>Order</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DIMENSION_TYPE_ENUM__ORDER = eINSTANCE.getDimensionTypeEnum_Order();

		/**
		 * The meta object literal for the '{@link de.uka.ipd.sdq.dsexplore.qml.dimensiontypes.impl.DimensionTypeNumericImpl <em>Dimension Type Numeric</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uka.ipd.sdq.dsexplore.qml.dimensiontypes.impl.DimensionTypeNumericImpl
		 * @see de.uka.ipd.sdq.dsexplore.qml.dimensiontypes.impl.DimensiontypesPackageImpl#getDimensionTypeNumeric()
		 * @generated
		 */
		EClass DIMENSION_TYPE_NUMERIC = eINSTANCE.getDimensionTypeNumeric();

		/**
		 * The meta object literal for the '<em><b>Range</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DIMENSION_TYPE_NUMERIC__RANGE = eINSTANCE.getDimensionTypeNumeric_Range();

		/**
		 * The meta object literal for the '<em><b>Domain</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIMENSION_TYPE_NUMERIC__DOMAIN = eINSTANCE.getDimensionTypeNumeric_Domain();

		/**
		 * The meta object literal for the '{@link de.uka.ipd.sdq.dsexplore.qml.dimensiontypes.impl.NumericRangeImpl <em>Numeric Range</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uka.ipd.sdq.dsexplore.qml.dimensiontypes.impl.NumericRangeImpl
		 * @see de.uka.ipd.sdq.dsexplore.qml.dimensiontypes.impl.DimensiontypesPackageImpl#getNumericRange()
		 * @generated
		 */
		EClass NUMERIC_RANGE = eINSTANCE.getNumericRange();

		/**
		 * The meta object literal for the '<em><b>Lower Limit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NUMERIC_RANGE__LOWER_LIMIT = eINSTANCE.getNumericRange_LowerLimit();

		/**
		 * The meta object literal for the '<em><b>Upper Limit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NUMERIC_RANGE__UPPER_LIMIT = eINSTANCE.getNumericRange_UpperLimit();

		/**
		 * The meta object literal for the '{@link de.uka.ipd.sdq.dsexplore.qml.dimensiontypes.impl.DimensionTypeRepositoryImpl <em>Dimension Type Repository</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uka.ipd.sdq.dsexplore.qml.dimensiontypes.impl.DimensionTypeRepositoryImpl
		 * @see de.uka.ipd.sdq.dsexplore.qml.dimensiontypes.impl.DimensiontypesPackageImpl#getDimensionTypeRepository()
		 * @generated
		 */
		EClass DIMENSION_TYPE_REPOSITORY = eINSTANCE.getDimensionTypeRepository();

		/**
		 * The meta object literal for the '<em><b>Dimension Types</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DIMENSION_TYPE_REPOSITORY__DIMENSION_TYPES = eINSTANCE.getDimensionTypeRepository_DimensionTypes();

		/**
		 * The meta object literal for the '{@link de.uka.ipd.sdq.dsexplore.qml.dimensiontypes.impl.DimensionTypeScaleImpl <em>Dimension Type Scale</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uka.ipd.sdq.dsexplore.qml.dimensiontypes.impl.DimensionTypeScaleImpl
		 * @see de.uka.ipd.sdq.dsexplore.qml.dimensiontypes.impl.DimensiontypesPackageImpl#getDimensionTypeScale()
		 * @generated
		 */
		EClass DIMENSION_TYPE_SCALE = eINSTANCE.getDimensionTypeScale();

		/**
		 * The meta object literal for the '<em><b>Scale Elements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DIMENSION_TYPE_SCALE__SCALE_ELEMENTS = eINSTANCE.getDimensionTypeScale_ScaleElements();

		/**
		 * The meta object literal for the '<em><b>Scale</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIMENSION_TYPE_SCALE__SCALE = eINSTANCE.getDimensionTypeScale_Scale();

		/**
		 * The meta object literal for the '{@link de.uka.ipd.sdq.dsexplore.qml.dimensiontypes.impl.ScaleElementImpl <em>Scale Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uka.ipd.sdq.dsexplore.qml.dimensiontypes.impl.ScaleElementImpl
		 * @see de.uka.ipd.sdq.dsexplore.qml.dimensiontypes.impl.DimensiontypesPackageImpl#getScaleElement()
		 * @generated
		 */
		EClass SCALE_ELEMENT = eINSTANCE.getScaleElement();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCALE_ELEMENT__VALUE = eINSTANCE.getScaleElement_Value();

		/**
		 * The meta object literal for the '<em><b>Scale</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCALE_ELEMENT__SCALE = eINSTANCE.getScaleElement_Scale();

		/**
		 * The meta object literal for the '{@link de.uka.ipd.sdq.dsexplore.qml.dimensiontypes.EnumRelationSemantics <em>Enum Relation Semantics</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uka.ipd.sdq.dsexplore.qml.dimensiontypes.EnumRelationSemantics
		 * @see de.uka.ipd.sdq.dsexplore.qml.dimensiontypes.impl.DimensiontypesPackageImpl#getEnumRelationSemantics()
		 * @generated
		 */
		EEnum ENUM_RELATION_SEMANTICS = eINSTANCE.getEnumRelationSemantics();

		/**
		 * The meta object literal for the '{@link de.uka.ipd.sdq.dsexplore.qml.dimensiontypes.EnumNumericDomain <em>Enum Numeric Domain</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uka.ipd.sdq.dsexplore.qml.dimensiontypes.EnumNumericDomain
		 * @see de.uka.ipd.sdq.dsexplore.qml.dimensiontypes.impl.DimensiontypesPackageImpl#getEnumNumericDomain()
		 * @generated
		 */
		EEnum ENUM_NUMERIC_DOMAIN = eINSTANCE.getEnumNumericDomain();

		/**
		 * The meta object literal for the '{@link de.uka.ipd.sdq.dsexplore.qml.dimensiontypes.EScaleOfMeasure <em>EScale Of Measure</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uka.ipd.sdq.dsexplore.qml.dimensiontypes.EScaleOfMeasure
		 * @see de.uka.ipd.sdq.dsexplore.qml.dimensiontypes.impl.DimensiontypesPackageImpl#getEScaleOfMeasure()
		 * @generated
		 */
		EEnum ESCALE_OF_MEASURE = eINSTANCE.getEScaleOfMeasure();

		/**
		 * The meta object literal for the '<em>ENumber</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.Number
		 * @see de.uka.ipd.sdq.dsexplore.qml.dimensiontypes.impl.DimensiontypesPackageImpl#getENumber()
		 * @generated
		 */
		EDataType ENUMBER = eINSTANCE.getENumber();

	}

} //DimensiontypesPackage
