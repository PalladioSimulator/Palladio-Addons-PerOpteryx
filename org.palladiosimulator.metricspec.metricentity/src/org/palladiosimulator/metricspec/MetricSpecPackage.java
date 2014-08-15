/**
 */
package org.palladiosimulator.metricspec;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import de.uka.ipd.sdq.identifier.IdentifierPackage;

/**
 * <!-- begin-user-doc --> The <b>Package</b> for the model. It contains accessors for the meta
 * objects to represent
 * <ul>
 * <li>each class,</li>
 * <li>each feature of each class,</li>
 * <li>each operation of each class,</li>
 * <li>each enum,</li>
 * <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * 
 * @see org.palladiosimulator.metricspec.MetricSpecFactory
 * @model kind="package"
 * @generated
 */
public interface MetricSpecPackage extends EPackage {
    /**
     * The package name. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    String eNAME = "metricspec";

    /**
     * The package namespace URI. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    String eNS_URI = "http://palladiosimulator.org/MetricSpec/1.0";

    /**
     * The package namespace name. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    String eNS_PREFIX = "metricspec";

    /**
     * The singleton instance of the package. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    MetricSpecPackage eINSTANCE = org.palladiosimulator.metricspec.impl.MetricSpecPackageImpl.init();

    /**
     * The meta object id for the '{@link org.palladiosimulator.metricspec.impl.IdentifierImpl
     * <em>Identifier</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see org.palladiosimulator.metricspec.impl.IdentifierImpl
     * @see org.palladiosimulator.metricspec.impl.MetricSpecPackageImpl#getIdentifier()
     * @generated
     */
    int IDENTIFIER = 0;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int IDENTIFIER__ID = IdentifierPackage.IDENTIFIER__ID;

    /**
     * The feature id for the '<em><b>Literal</b></em>' attribute. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int IDENTIFIER__LITERAL = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Textual Base Metric Description</b></em>' container reference.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int IDENTIFIER__TEXTUAL_BASE_METRIC_DESCRIPTION = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 1;

    /**
     * The number of structural features of the '<em>Identifier</em>' class. <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int IDENTIFIER_FEATURE_COUNT = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 2;

    /**
     * The number of operations of the '<em>Identifier</em>' class. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int IDENTIFIER_OPERATION_COUNT = IdentifierPackage.IDENTIFIER_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link org.palladiosimulator.metricspec.impl.DescriptionImpl
     * <em>Description</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see org.palladiosimulator.metricspec.impl.DescriptionImpl
     * @see org.palladiosimulator.metricspec.impl.MetricSpecPackageImpl#getDescription()
     * @generated
     */
    int DESCRIPTION = 4;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int DESCRIPTION__ID = IdentifierPackage.IDENTIFIER__ID;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int DESCRIPTION__NAME = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Textual Description</b></em>' attribute. <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int DESCRIPTION__TEXTUAL_DESCRIPTION = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 1;

    /**
     * The number of structural features of the '<em>Description</em>' class. <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int DESCRIPTION_FEATURE_COUNT = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 2;

    /**
     * The number of operations of the '<em>Description</em>' class. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int DESCRIPTION_OPERATION_COUNT = IdentifierPackage.IDENTIFIER_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '
     * {@link org.palladiosimulator.metricspec.impl.MetricDescriptionImpl
     * <em>Metric Description</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see org.palladiosimulator.metricspec.impl.MetricDescriptionImpl
     * @see org.palladiosimulator.metricspec.impl.MetricSpecPackageImpl#getMetricDescription()
     * @generated
     */
    int METRIC_DESCRIPTION = 3;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int METRIC_DESCRIPTION__ID = DESCRIPTION__ID;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int METRIC_DESCRIPTION__NAME = DESCRIPTION__NAME;

    /**
     * The feature id for the '<em><b>Textual Description</b></em>' attribute. <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int METRIC_DESCRIPTION__TEXTUAL_DESCRIPTION = DESCRIPTION__TEXTUAL_DESCRIPTION;

    /**
     * The feature id for the '<em><b>Repository</b></em>' container reference. <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int METRIC_DESCRIPTION__REPOSITORY = DESCRIPTION_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Metric Description</em>' class. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int METRIC_DESCRIPTION_FEATURE_COUNT = DESCRIPTION_FEATURE_COUNT + 1;

    /**
     * The number of operations of the '<em>Metric Description</em>' class. <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int METRIC_DESCRIPTION_OPERATION_COUNT = DESCRIPTION_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '
     * {@link org.palladiosimulator.metricspec.impl.BaseMetricDescriptionImpl
     * <em>Base Metric Description</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see org.palladiosimulator.metricspec.impl.BaseMetricDescriptionImpl
     * @see org.palladiosimulator.metricspec.impl.MetricSpecPackageImpl#getBaseMetricDescription()
     * @generated
     */
    int BASE_METRIC_DESCRIPTION = 2;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int BASE_METRIC_DESCRIPTION__ID = METRIC_DESCRIPTION__ID;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int BASE_METRIC_DESCRIPTION__NAME = METRIC_DESCRIPTION__NAME;

    /**
     * The feature id for the '<em><b>Textual Description</b></em>' attribute. <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int BASE_METRIC_DESCRIPTION__TEXTUAL_DESCRIPTION = METRIC_DESCRIPTION__TEXTUAL_DESCRIPTION;

    /**
     * The feature id for the '<em><b>Repository</b></em>' container reference. <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int BASE_METRIC_DESCRIPTION__REPOSITORY = METRIC_DESCRIPTION__REPOSITORY;

    /**
     * The feature id for the '<em><b>Capture Type</b></em>' attribute. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int BASE_METRIC_DESCRIPTION__CAPTURE_TYPE = METRIC_DESCRIPTION_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Data Type</b></em>' attribute. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int BASE_METRIC_DESCRIPTION__DATA_TYPE = METRIC_DESCRIPTION_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Scale</b></em>' attribute. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int BASE_METRIC_DESCRIPTION__SCALE = METRIC_DESCRIPTION_FEATURE_COUNT + 2;

    /**
     * The number of structural features of the '<em>Base Metric Description</em>' class. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int BASE_METRIC_DESCRIPTION_FEATURE_COUNT = METRIC_DESCRIPTION_FEATURE_COUNT + 3;

    /**
     * The number of operations of the '<em>Base Metric Description</em>' class. <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int BASE_METRIC_DESCRIPTION_OPERATION_COUNT = METRIC_DESCRIPTION_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '
     * {@link org.palladiosimulator.metricspec.impl.TextualBaseMetricDescriptionImpl
     * <em>Textual Base Metric Description</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     * 
     * @see org.palladiosimulator.metricspec.impl.TextualBaseMetricDescriptionImpl
     * @see org.palladiosimulator.metricspec.impl.MetricSpecPackageImpl#getTextualBaseMetricDescription()
     * @generated
     */
    int TEXTUAL_BASE_METRIC_DESCRIPTION = 1;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int TEXTUAL_BASE_METRIC_DESCRIPTION__ID = BASE_METRIC_DESCRIPTION__ID;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int TEXTUAL_BASE_METRIC_DESCRIPTION__NAME = BASE_METRIC_DESCRIPTION__NAME;

    /**
     * The feature id for the '<em><b>Textual Description</b></em>' attribute. <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int TEXTUAL_BASE_METRIC_DESCRIPTION__TEXTUAL_DESCRIPTION = BASE_METRIC_DESCRIPTION__TEXTUAL_DESCRIPTION;

    /**
     * The feature id for the '<em><b>Repository</b></em>' container reference. <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int TEXTUAL_BASE_METRIC_DESCRIPTION__REPOSITORY = BASE_METRIC_DESCRIPTION__REPOSITORY;

    /**
     * The feature id for the '<em><b>Capture Type</b></em>' attribute. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int TEXTUAL_BASE_METRIC_DESCRIPTION__CAPTURE_TYPE = BASE_METRIC_DESCRIPTION__CAPTURE_TYPE;

    /**
     * The feature id for the '<em><b>Data Type</b></em>' attribute. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int TEXTUAL_BASE_METRIC_DESCRIPTION__DATA_TYPE = BASE_METRIC_DESCRIPTION__DATA_TYPE;

    /**
     * The feature id for the '<em><b>Scale</b></em>' attribute. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int TEXTUAL_BASE_METRIC_DESCRIPTION__SCALE = BASE_METRIC_DESCRIPTION__SCALE;

    /**
     * The feature id for the '<em><b>Identifiers</b></em>' containment reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int TEXTUAL_BASE_METRIC_DESCRIPTION__IDENTIFIERS = BASE_METRIC_DESCRIPTION_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Textual Base Metric Description</em>' class.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int TEXTUAL_BASE_METRIC_DESCRIPTION_FEATURE_COUNT = BASE_METRIC_DESCRIPTION_FEATURE_COUNT + 1;

    /**
     * The number of operations of the '<em>Textual Base Metric Description</em>' class. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int TEXTUAL_BASE_METRIC_DESCRIPTION_OPERATION_COUNT = BASE_METRIC_DESCRIPTION_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '
     * {@link org.palladiosimulator.metricspec.impl.AggregationFunctionDescriptionImpl
     * <em>Aggregation Function Description</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     * 
     * @see org.palladiosimulator.metricspec.impl.AggregationFunctionDescriptionImpl
     * @see org.palladiosimulator.metricspec.impl.MetricSpecPackageImpl#getAggregationFunctionDescription()
     * @generated
     */
    int AGGREGATION_FUNCTION_DESCRIPTION = 5;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int AGGREGATION_FUNCTION_DESCRIPTION__ID = DESCRIPTION__ID;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int AGGREGATION_FUNCTION_DESCRIPTION__NAME = DESCRIPTION__NAME;

    /**
     * The feature id for the '<em><b>Textual Description</b></em>' attribute. <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int AGGREGATION_FUNCTION_DESCRIPTION__TEXTUAL_DESCRIPTION = DESCRIPTION__TEXTUAL_DESCRIPTION;

    /**
     * The number of structural features of the '<em>Aggregation Function Description</em>' class.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int AGGREGATION_FUNCTION_DESCRIPTION_FEATURE_COUNT = DESCRIPTION_FEATURE_COUNT + 0;

    /**
     * The number of operations of the '<em>Aggregation Function Description</em>' class. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int AGGREGATION_FUNCTION_DESCRIPTION_OPERATION_COUNT = DESCRIPTION_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '
     * {@link org.palladiosimulator.metricspec.impl.MetricSetDescriptionImpl
     * <em>Metric Set Description</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see org.palladiosimulator.metricspec.impl.MetricSetDescriptionImpl
     * @see org.palladiosimulator.metricspec.impl.MetricSpecPackageImpl#getMetricSetDescription()
     * @generated
     */
    int METRIC_SET_DESCRIPTION = 6;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int METRIC_SET_DESCRIPTION__ID = METRIC_DESCRIPTION__ID;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int METRIC_SET_DESCRIPTION__NAME = METRIC_DESCRIPTION__NAME;

    /**
     * The feature id for the '<em><b>Textual Description</b></em>' attribute. <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int METRIC_SET_DESCRIPTION__TEXTUAL_DESCRIPTION = METRIC_DESCRIPTION__TEXTUAL_DESCRIPTION;

    /**
     * The feature id for the '<em><b>Repository</b></em>' container reference. <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int METRIC_SET_DESCRIPTION__REPOSITORY = METRIC_DESCRIPTION__REPOSITORY;

    /**
     * The feature id for the '<em><b>Subsumed Metrics</b></em>' reference list. <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int METRIC_SET_DESCRIPTION__SUBSUMED_METRICS = METRIC_DESCRIPTION_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Metric Set Description</em>' class. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int METRIC_SET_DESCRIPTION_FEATURE_COUNT = METRIC_DESCRIPTION_FEATURE_COUNT + 1;

    /**
     * The number of operations of the '<em>Metric Set Description</em>' class. <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int METRIC_SET_DESCRIPTION_OPERATION_COUNT = METRIC_DESCRIPTION_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '
     * {@link org.palladiosimulator.metricspec.impl.NumericalBaseMetricDescriptionImpl
     * <em>Numerical Base Metric Description</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     * 
     * @see org.palladiosimulator.metricspec.impl.NumericalBaseMetricDescriptionImpl
     * @see org.palladiosimulator.metricspec.impl.MetricSpecPackageImpl#getNumericalBaseMetricDescription()
     * @generated
     */
    int NUMERICAL_BASE_METRIC_DESCRIPTION = 7;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int NUMERICAL_BASE_METRIC_DESCRIPTION__ID = BASE_METRIC_DESCRIPTION__ID;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int NUMERICAL_BASE_METRIC_DESCRIPTION__NAME = BASE_METRIC_DESCRIPTION__NAME;

    /**
     * The feature id for the '<em><b>Textual Description</b></em>' attribute. <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int NUMERICAL_BASE_METRIC_DESCRIPTION__TEXTUAL_DESCRIPTION = BASE_METRIC_DESCRIPTION__TEXTUAL_DESCRIPTION;

    /**
     * The feature id for the '<em><b>Repository</b></em>' container reference. <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int NUMERICAL_BASE_METRIC_DESCRIPTION__REPOSITORY = BASE_METRIC_DESCRIPTION__REPOSITORY;

    /**
     * The feature id for the '<em><b>Capture Type</b></em>' attribute. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int NUMERICAL_BASE_METRIC_DESCRIPTION__CAPTURE_TYPE = BASE_METRIC_DESCRIPTION__CAPTURE_TYPE;

    /**
     * The feature id for the '<em><b>Data Type</b></em>' attribute. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int NUMERICAL_BASE_METRIC_DESCRIPTION__DATA_TYPE = BASE_METRIC_DESCRIPTION__DATA_TYPE;

    /**
     * The feature id for the '<em><b>Scale</b></em>' attribute. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int NUMERICAL_BASE_METRIC_DESCRIPTION__SCALE = BASE_METRIC_DESCRIPTION__SCALE;

    /**
     * The feature id for the '<em><b>Default Unit</b></em>' attribute. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int NUMERICAL_BASE_METRIC_DESCRIPTION__DEFAULT_UNIT = BASE_METRIC_DESCRIPTION_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Persistence Kind</b></em>' attribute. <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int NUMERICAL_BASE_METRIC_DESCRIPTION__PERSISTENCE_KIND = BASE_METRIC_DESCRIPTION_FEATURE_COUNT + 1;

    /**
     * The number of structural features of the '<em>Numerical Base Metric Description</em>' class.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int NUMERICAL_BASE_METRIC_DESCRIPTION_FEATURE_COUNT = BASE_METRIC_DESCRIPTION_FEATURE_COUNT + 2;

    /**
     * The number of operations of the '<em>Numerical Base Metric Description</em>' class. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int NUMERICAL_BASE_METRIC_DESCRIPTION_OPERATION_COUNT = BASE_METRIC_DESCRIPTION_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link javax.measure.quantity.Quantity <em>IJS Quantity</em>}'
     * class. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see javax.measure.quantity.Quantity
     * @see org.palladiosimulator.metricspec.impl.MetricSpecPackageImpl#getIJSQuantity()
     * @generated
     */
    int IJS_QUANTITY = 8;

    /**
     * The number of structural features of the '<em>IJS Quantity</em>' class. <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int IJS_QUANTITY_FEATURE_COUNT = 0;

    /**
     * The number of operations of the '<em>IJS Quantity</em>' class. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int IJS_QUANTITY_OPERATION_COUNT = 0;

    /**
     * The meta object id for the '
     * {@link org.palladiosimulator.metricspec.impl.MetricDescriptionRepositoryImpl
     * <em>Metric Description Repository</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see org.palladiosimulator.metricspec.impl.MetricDescriptionRepositoryImpl
     * @see org.palladiosimulator.metricspec.impl.MetricSpecPackageImpl#getMetricDescriptionRepository()
     * @generated
     */
    int METRIC_DESCRIPTION_REPOSITORY = 9;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int METRIC_DESCRIPTION_REPOSITORY__ID = IdentifierPackage.IDENTIFIER__ID;

    /**
     * The feature id for the '<em><b>Metric Descriptions</b></em>' containment reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int METRIC_DESCRIPTION_REPOSITORY__METRIC_DESCRIPTIONS = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Metric Description Repository</em>' class. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int METRIC_DESCRIPTION_REPOSITORY_FEATURE_COUNT = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 1;

    /**
     * The number of operations of the '<em>Metric Description Repository</em>' class. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int METRIC_DESCRIPTION_REPOSITORY_OPERATION_COUNT = IdentifierPackage.IDENTIFIER_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link org.palladiosimulator.metricspec.CaptureType
     * <em>Capture Type</em>}' enum. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see org.palladiosimulator.metricspec.CaptureType
     * @see org.palladiosimulator.metricspec.impl.MetricSpecPackageImpl#getCaptureType()
     * @generated
     */
    int CAPTURE_TYPE = 10;

    /**
     * The meta object id for the '{@link org.palladiosimulator.metricspec.Scale <em>Scale</em>}'
     * enum. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see org.palladiosimulator.metricspec.Scale
     * @see org.palladiosimulator.metricspec.impl.MetricSpecPackageImpl#getScale()
     * @generated
     */
    int SCALE = 11;

    /**
     * The meta object id for the '{@link org.palladiosimulator.metricspec.PersistenceKindOptions
     * <em>Persistence Kind Options</em>}' enum. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see org.palladiosimulator.metricspec.PersistenceKindOptions
     * @see org.palladiosimulator.metricspec.impl.MetricSpecPackageImpl#getPersistenceKindOptions()
     * @generated
     */
    int PERSISTENCE_KIND_OPTIONS = 12;

    /**
     * The meta object id for the '{@link org.palladiosimulator.metricspec.DataType
     * <em>Data Type</em>}' enum. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see org.palladiosimulator.metricspec.DataType
     * @see org.palladiosimulator.metricspec.impl.MetricSpecPackageImpl#getDataType()
     * @generated
     */
    int DATA_TYPE = 13;

    /**
     * The meta object id for the '<em>EJS Unit</em>' data type. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * 
     * @see javax.measure.unit.Unit
     * @see org.palladiosimulator.metricspec.impl.MetricSpecPackageImpl#getEJSUnit()
     * @generated
     */
    int EJS_UNIT = 14;

    /**
     * Returns the meta object for class '{@link org.palladiosimulator.metricspec.Identifier
     * <em>Identifier</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @return the meta object for class '<em>Identifier</em>'.
     * @see org.palladiosimulator.metricspec.Identifier
     * @generated
     */
    EClass getIdentifier();

    /**
     * Returns the meta object for the attribute '
     * {@link org.palladiosimulator.metricspec.Identifier#getLiteral <em>Literal</em>}'. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @return the meta object for the attribute '<em>Literal</em>'.
     * @see org.palladiosimulator.metricspec.Identifier#getLiteral()
     * @see #getIdentifier()
     * @generated
     */
    EAttribute getIdentifier_Literal();

    /**
     * Returns the meta object for the container reference '
     * {@link org.palladiosimulator.metricspec.Identifier#getTextualBaseMetricDescription
     * <em>Textual Base Metric Description</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @return the meta object for the container reference '<em>Textual Base Metric Description</em>
     *         '.
     * @see org.palladiosimulator.metricspec.Identifier#getTextualBaseMetricDescription()
     * @see #getIdentifier()
     * @generated
     */
    EReference getIdentifier_TextualBaseMetricDescription();

    /**
     * Returns the meta object for class '
     * {@link org.palladiosimulator.metricspec.TextualBaseMetricDescription
     * <em>Textual Base Metric Description</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @return the meta object for class '<em>Textual Base Metric Description</em>'.
     * @see org.palladiosimulator.metricspec.TextualBaseMetricDescription
     * @generated
     */
    EClass getTextualBaseMetricDescription();

    /**
     * Returns the meta object for the containment reference list '
     * {@link org.palladiosimulator.metricspec.TextualBaseMetricDescription#getIdentifiers
     * <em>Identifiers</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @return the meta object for the containment reference list '<em>Identifiers</em>'.
     * @see org.palladiosimulator.metricspec.TextualBaseMetricDescription#getIdentifiers()
     * @see #getTextualBaseMetricDescription()
     * @generated
     */
    EReference getTextualBaseMetricDescription_Identifiers();

    /**
     * Returns the meta object for class '
     * {@link org.palladiosimulator.metricspec.BaseMetricDescription
     * <em>Base Metric Description</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @return the meta object for class '<em>Base Metric Description</em>'.
     * @see org.palladiosimulator.metricspec.BaseMetricDescription
     * @generated
     */
    EClass getBaseMetricDescription();

    /**
     * Returns the meta object for the attribute '
     * {@link org.palladiosimulator.metricspec.BaseMetricDescription#getCaptureType
     * <em>Capture Type</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @return the meta object for the attribute '<em>Capture Type</em>'.
     * @see org.palladiosimulator.metricspec.BaseMetricDescription#getCaptureType()
     * @see #getBaseMetricDescription()
     * @generated
     */
    EAttribute getBaseMetricDescription_CaptureType();

    /**
     * Returns the meta object for the attribute '
     * {@link org.palladiosimulator.metricspec.BaseMetricDescription#getDataType <em>Data Type</em>}
     * '. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @return the meta object for the attribute '<em>Data Type</em>'.
     * @see org.palladiosimulator.metricspec.BaseMetricDescription#getDataType()
     * @see #getBaseMetricDescription()
     * @generated
     */
    EAttribute getBaseMetricDescription_DataType();

    /**
     * Returns the meta object for the attribute '
     * {@link org.palladiosimulator.metricspec.BaseMetricDescription#getScale <em>Scale</em>}'. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @return the meta object for the attribute '<em>Scale</em>'.
     * @see org.palladiosimulator.metricspec.BaseMetricDescription#getScale()
     * @see #getBaseMetricDescription()
     * @generated
     */
    EAttribute getBaseMetricDescription_Scale();

    /**
     * Returns the meta object for class '{@link org.palladiosimulator.metricspec.MetricDescription
     * <em>Metric Description</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @return the meta object for class '<em>Metric Description</em>'.
     * @see org.palladiosimulator.metricspec.MetricDescription
     * @generated
     */
    EClass getMetricDescription();

    /**
     * Returns the meta object for the container reference '
     * {@link org.palladiosimulator.metricspec.MetricDescription#getRepository <em>Repository</em>}
     * '. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @return the meta object for the container reference '<em>Repository</em>'.
     * @see org.palladiosimulator.metricspec.MetricDescription#getRepository()
     * @see #getMetricDescription()
     * @generated
     */
    EReference getMetricDescription_Repository();

    /**
     * Returns the meta object for class '{@link org.palladiosimulator.metricspec.Description
     * <em>Description</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @return the meta object for class '<em>Description</em>'.
     * @see org.palladiosimulator.metricspec.Description
     * @generated
     */
    EClass getDescription();

    /**
     * Returns the meta object for the attribute '
     * {@link org.palladiosimulator.metricspec.Description#getName <em>Name</em>}'. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @return the meta object for the attribute '<em>Name</em>'.
     * @see org.palladiosimulator.metricspec.Description#getName()
     * @see #getDescription()
     * @generated
     */
    EAttribute getDescription_Name();

    /**
     * Returns the meta object for the attribute '
     * {@link org.palladiosimulator.metricspec.Description#getTextualDescription
     * <em>Textual Description</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @return the meta object for the attribute '<em>Textual Description</em>'.
     * @see org.palladiosimulator.metricspec.Description#getTextualDescription()
     * @see #getDescription()
     * @generated
     */
    EAttribute getDescription_TextualDescription();

    /**
     * Returns the meta object for class '
     * {@link org.palladiosimulator.metricspec.AggregationFunctionDescription
     * <em>Aggregation Function Description</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @return the meta object for class '<em>Aggregation Function Description</em>'.
     * @see org.palladiosimulator.metricspec.AggregationFunctionDescription
     * @generated
     */
    EClass getAggregationFunctionDescription();

    /**
     * Returns the meta object for class '
     * {@link org.palladiosimulator.metricspec.MetricSetDescription <em>Metric Set Description</em>}
     * '. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @return the meta object for class '<em>Metric Set Description</em>'.
     * @see org.palladiosimulator.metricspec.MetricSetDescription
     * @generated
     */
    EClass getMetricSetDescription();

    /**
     * Returns the meta object for the reference list '
     * {@link org.palladiosimulator.metricspec.MetricSetDescription#getSubsumedMetrics
     * <em>Subsumed Metrics</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @return the meta object for the reference list '<em>Subsumed Metrics</em>'.
     * @see org.palladiosimulator.metricspec.MetricSetDescription#getSubsumedMetrics()
     * @see #getMetricSetDescription()
     * @generated
     */
    EReference getMetricSetDescription_SubsumedMetrics();

    /**
     * Returns the meta object for class '
     * {@link org.palladiosimulator.metricspec.NumericalBaseMetricDescription
     * <em>Numerical Base Metric Description</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @return the meta object for class '<em>Numerical Base Metric Description</em>'.
     * @see org.palladiosimulator.metricspec.NumericalBaseMetricDescription
     * @generated
     */
    EClass getNumericalBaseMetricDescription();

    /**
     * Returns the meta object for the attribute '
     * {@link org.palladiosimulator.metricspec.NumericalBaseMetricDescription#getDefaultUnit
     * <em>Default Unit</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @return the meta object for the attribute '<em>Default Unit</em>'.
     * @see org.palladiosimulator.metricspec.NumericalBaseMetricDescription#getDefaultUnit()
     * @see #getNumericalBaseMetricDescription()
     * @generated
     */
    EAttribute getNumericalBaseMetricDescription_DefaultUnit();

    /**
     * Returns the meta object for the attribute '
     * {@link org.palladiosimulator.metricspec.NumericalBaseMetricDescription#getPersistenceKind
     * <em>Persistence Kind</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @return the meta object for the attribute '<em>Persistence Kind</em>'.
     * @see org.palladiosimulator.metricspec.NumericalBaseMetricDescription#getPersistenceKind()
     * @see #getNumericalBaseMetricDescription()
     * @generated
     */
    EAttribute getNumericalBaseMetricDescription_PersistenceKind();

    /**
     * Returns the meta object for class '{@link javax.measure.quantity.Quantity
     * <em>IJS Quantity</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @return the meta object for class '<em>IJS Quantity</em>'.
     * @see javax.measure.quantity.Quantity
     * @model instanceClass="javax.measure.quantity.Quantity"
     * @generated
     */
    EClass getIJSQuantity();

    /**
     * Returns the meta object for class '
     * {@link org.palladiosimulator.metricspec.MetricDescriptionRepository
     * <em>Metric Description Repository</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @return the meta object for class '<em>Metric Description Repository</em>'.
     * @see org.palladiosimulator.metricspec.MetricDescriptionRepository
     * @generated
     */
    EClass getMetricDescriptionRepository();

    /**
     * Returns the meta object for the containment reference list '
     * {@link org.palladiosimulator.metricspec.MetricDescriptionRepository#getMetricDescriptions
     * <em>Metric Descriptions</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @return the meta object for the containment reference list '<em>Metric Descriptions</em>'.
     * @see org.palladiosimulator.metricspec.MetricDescriptionRepository#getMetricDescriptions()
     * @see #getMetricDescriptionRepository()
     * @generated
     */
    EReference getMetricDescriptionRepository_MetricDescriptions();

    /**
     * Returns the meta object for enum '{@link org.palladiosimulator.metricspec.CaptureType
     * <em>Capture Type</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @return the meta object for enum '<em>Capture Type</em>'.
     * @see org.palladiosimulator.metricspec.CaptureType
     * @generated
     */
    EEnum getCaptureType();

    /**
     * Returns the meta object for enum '{@link org.palladiosimulator.metricspec.Scale
     * <em>Scale</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @return the meta object for enum '<em>Scale</em>'.
     * @see org.palladiosimulator.metricspec.Scale
     * @generated
     */
    EEnum getScale();

    /**
     * Returns the meta object for enum '
     * {@link org.palladiosimulator.metricspec.PersistenceKindOptions
     * <em>Persistence Kind Options</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @return the meta object for enum '<em>Persistence Kind Options</em>'.
     * @see org.palladiosimulator.metricspec.PersistenceKindOptions
     * @generated
     */
    EEnum getPersistenceKindOptions();

    /**
     * Returns the meta object for enum '{@link org.palladiosimulator.metricspec.DataType
     * <em>Data Type</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @return the meta object for enum '<em>Data Type</em>'.
     * @see org.palladiosimulator.metricspec.DataType
     * @generated
     */
    EEnum getDataType();

    /**
     * Returns the meta object for data type '{@link javax.measure.unit.Unit <em>EJS Unit</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @return the meta object for data type '<em>EJS Unit</em>'.
     * @see javax.measure.unit.Unit
     * @model instanceClass="javax.measure.unit.Unit" typeParameters="Q"
     *        QBounds="org.palladiosimulator.metricspec.IJSQuantity"
     * @generated
     */
    EDataType getEJSUnit();

    /**
     * Returns the factory that creates the instances of the model. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * 
     * @return the factory that creates the instances of the model.
     * @generated
     */
    MetricSpecFactory getMetricSpecFactory();

    /**
     * <!-- begin-user-doc --> Defines literals for the meta objects that represent
     * <ul>
     * <li>each class,</li>
     * <li>each feature of each class,</li>
     * <li>each operation of each class,</li>
     * <li>each enum,</li>
     * <li>and each data type</li>
     * </ul>
     * <!-- end-user-doc -->
     * 
     * @generated
     */
    interface Literals {
        /**
         * The meta object literal for the '
         * {@link org.palladiosimulator.metricspec.impl.IdentifierImpl <em>Identifier</em>}' class.
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * 
         * @see org.palladiosimulator.metricspec.impl.IdentifierImpl
         * @see org.palladiosimulator.metricspec.impl.MetricSpecPackageImpl#getIdentifier()
         * @generated
         */
        EClass IDENTIFIER = eINSTANCE.getIdentifier();

        /**
         * The meta object literal for the '<em><b>Literal</b></em>' attribute feature. <!--
         * begin-user-doc --> <!-- end-user-doc -->
         * 
         * @generated
         */
        EAttribute IDENTIFIER__LITERAL = eINSTANCE.getIdentifier_Literal();

        /**
         * The meta object literal for the '<em><b>Textual Base Metric Description</b></em>'
         * container reference feature. <!-- begin-user-doc --> <!-- end-user-doc -->
         * 
         * @generated
         */
        EReference IDENTIFIER__TEXTUAL_BASE_METRIC_DESCRIPTION = eINSTANCE.getIdentifier_TextualBaseMetricDescription();

        /**
         * The meta object literal for the '
         * {@link org.palladiosimulator.metricspec.impl.TextualBaseMetricDescriptionImpl
         * <em>Textual Base Metric Description</em>}' class. <!-- begin-user-doc --> <!--
         * end-user-doc -->
         * 
         * @see org.palladiosimulator.metricspec.impl.TextualBaseMetricDescriptionImpl
         * @see org.palladiosimulator.metricspec.impl.MetricSpecPackageImpl#getTextualBaseMetricDescription()
         * @generated
         */
        EClass TEXTUAL_BASE_METRIC_DESCRIPTION = eINSTANCE.getTextualBaseMetricDescription();

        /**
         * The meta object literal for the '<em><b>Identifiers</b></em>' containment reference list
         * feature. <!-- begin-user-doc --> <!-- end-user-doc -->
         * 
         * @generated
         */
        EReference TEXTUAL_BASE_METRIC_DESCRIPTION__IDENTIFIERS = eINSTANCE
                .getTextualBaseMetricDescription_Identifiers();

        /**
         * The meta object literal for the '
         * {@link org.palladiosimulator.metricspec.impl.BaseMetricDescriptionImpl
         * <em>Base Metric Description</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
         * 
         * @see org.palladiosimulator.metricspec.impl.BaseMetricDescriptionImpl
         * @see org.palladiosimulator.metricspec.impl.MetricSpecPackageImpl#getBaseMetricDescription()
         * @generated
         */
        EClass BASE_METRIC_DESCRIPTION = eINSTANCE.getBaseMetricDescription();

        /**
         * The meta object literal for the '<em><b>Capture Type</b></em>' attribute feature. <!--
         * begin-user-doc --> <!-- end-user-doc -->
         * 
         * @generated
         */
        EAttribute BASE_METRIC_DESCRIPTION__CAPTURE_TYPE = eINSTANCE.getBaseMetricDescription_CaptureType();

        /**
         * The meta object literal for the '<em><b>Data Type</b></em>' attribute feature. <!--
         * begin-user-doc --> <!-- end-user-doc -->
         * 
         * @generated
         */
        EAttribute BASE_METRIC_DESCRIPTION__DATA_TYPE = eINSTANCE.getBaseMetricDescription_DataType();

        /**
         * The meta object literal for the '<em><b>Scale</b></em>' attribute feature. <!--
         * begin-user-doc --> <!-- end-user-doc -->
         * 
         * @generated
         */
        EAttribute BASE_METRIC_DESCRIPTION__SCALE = eINSTANCE.getBaseMetricDescription_Scale();

        /**
         * The meta object literal for the '
         * {@link org.palladiosimulator.metricspec.impl.MetricDescriptionImpl
         * <em>Metric Description</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
         * 
         * @see org.palladiosimulator.metricspec.impl.MetricDescriptionImpl
         * @see org.palladiosimulator.metricspec.impl.MetricSpecPackageImpl#getMetricDescription()
         * @generated
         */
        EClass METRIC_DESCRIPTION = eINSTANCE.getMetricDescription();

        /**
         * The meta object literal for the '<em><b>Repository</b></em>' container reference feature.
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * 
         * @generated
         */
        EReference METRIC_DESCRIPTION__REPOSITORY = eINSTANCE.getMetricDescription_Repository();

        /**
         * The meta object literal for the '
         * {@link org.palladiosimulator.metricspec.impl.DescriptionImpl <em>Description</em>}'
         * class. <!-- begin-user-doc --> <!-- end-user-doc -->
         * 
         * @see org.palladiosimulator.metricspec.impl.DescriptionImpl
         * @see org.palladiosimulator.metricspec.impl.MetricSpecPackageImpl#getDescription()
         * @generated
         */
        EClass DESCRIPTION = eINSTANCE.getDescription();

        /**
         * The meta object literal for the '<em><b>Name</b></em>' attribute feature. <!--
         * begin-user-doc --> <!-- end-user-doc -->
         * 
         * @generated
         */
        EAttribute DESCRIPTION__NAME = eINSTANCE.getDescription_Name();

        /**
         * The meta object literal for the '<em><b>Textual Description</b></em>' attribute feature.
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * 
         * @generated
         */
        EAttribute DESCRIPTION__TEXTUAL_DESCRIPTION = eINSTANCE.getDescription_TextualDescription();

        /**
         * The meta object literal for the '
         * {@link org.palladiosimulator.metricspec.impl.AggregationFunctionDescriptionImpl
         * <em>Aggregation Function Description</em>}' class. <!-- begin-user-doc --> <!--
         * end-user-doc -->
         * 
         * @see org.palladiosimulator.metricspec.impl.AggregationFunctionDescriptionImpl
         * @see org.palladiosimulator.metricspec.impl.MetricSpecPackageImpl#getAggregationFunctionDescription()
         * @generated
         */
        EClass AGGREGATION_FUNCTION_DESCRIPTION = eINSTANCE.getAggregationFunctionDescription();

        /**
         * The meta object literal for the '
         * {@link org.palladiosimulator.metricspec.impl.MetricSetDescriptionImpl
         * <em>Metric Set Description</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
         * 
         * @see org.palladiosimulator.metricspec.impl.MetricSetDescriptionImpl
         * @see org.palladiosimulator.metricspec.impl.MetricSpecPackageImpl#getMetricSetDescription()
         * @generated
         */
        EClass METRIC_SET_DESCRIPTION = eINSTANCE.getMetricSetDescription();

        /**
         * The meta object literal for the '<em><b>Subsumed Metrics</b></em>' reference list
         * feature. <!-- begin-user-doc --> <!-- end-user-doc -->
         * 
         * @generated
         */
        EReference METRIC_SET_DESCRIPTION__SUBSUMED_METRICS = eINSTANCE.getMetricSetDescription_SubsumedMetrics();

        /**
         * The meta object literal for the '
         * {@link org.palladiosimulator.metricspec.impl.NumericalBaseMetricDescriptionImpl
         * <em>Numerical Base Metric Description</em>}' class. <!-- begin-user-doc --> <!--
         * end-user-doc -->
         * 
         * @see org.palladiosimulator.metricspec.impl.NumericalBaseMetricDescriptionImpl
         * @see org.palladiosimulator.metricspec.impl.MetricSpecPackageImpl#getNumericalBaseMetricDescription()
         * @generated
         */
        EClass NUMERICAL_BASE_METRIC_DESCRIPTION = eINSTANCE.getNumericalBaseMetricDescription();

        /**
         * The meta object literal for the '<em><b>Default Unit</b></em>' attribute feature. <!--
         * begin-user-doc --> <!-- end-user-doc -->
         * 
         * @generated
         */
        EAttribute NUMERICAL_BASE_METRIC_DESCRIPTION__DEFAULT_UNIT = eINSTANCE
                .getNumericalBaseMetricDescription_DefaultUnit();

        /**
         * The meta object literal for the '<em><b>Persistence Kind</b></em>' attribute feature.
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * 
         * @generated
         */
        EAttribute NUMERICAL_BASE_METRIC_DESCRIPTION__PERSISTENCE_KIND = eINSTANCE
                .getNumericalBaseMetricDescription_PersistenceKind();

        /**
         * The meta object literal for the '{@link javax.measure.quantity.Quantity
         * <em>IJS Quantity</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
         * 
         * @see javax.measure.quantity.Quantity
         * @see org.palladiosimulator.metricspec.impl.MetricSpecPackageImpl#getIJSQuantity()
         * @generated
         */
        EClass IJS_QUANTITY = eINSTANCE.getIJSQuantity();

        /**
         * The meta object literal for the '
         * {@link org.palladiosimulator.metricspec.impl.MetricDescriptionRepositoryImpl
         * <em>Metric Description Repository</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc
         * -->
         * 
         * @see org.palladiosimulator.metricspec.impl.MetricDescriptionRepositoryImpl
         * @see org.palladiosimulator.metricspec.impl.MetricSpecPackageImpl#getMetricDescriptionRepository()
         * @generated
         */
        EClass METRIC_DESCRIPTION_REPOSITORY = eINSTANCE.getMetricDescriptionRepository();

        /**
         * The meta object literal for the '<em><b>Metric Descriptions</b></em>' containment
         * reference list feature. <!-- begin-user-doc --> <!-- end-user-doc -->
         * 
         * @generated
         */
        EReference METRIC_DESCRIPTION_REPOSITORY__METRIC_DESCRIPTIONS = eINSTANCE
                .getMetricDescriptionRepository_MetricDescriptions();

        /**
         * The meta object literal for the '{@link org.palladiosimulator.metricspec.CaptureType
         * <em>Capture Type</em>}' enum. <!-- begin-user-doc --> <!-- end-user-doc -->
         * 
         * @see org.palladiosimulator.metricspec.CaptureType
         * @see org.palladiosimulator.metricspec.impl.MetricSpecPackageImpl#getCaptureType()
         * @generated
         */
        EEnum CAPTURE_TYPE = eINSTANCE.getCaptureType();

        /**
         * The meta object literal for the '{@link org.palladiosimulator.metricspec.Scale
         * <em>Scale</em>}' enum. <!-- begin-user-doc --> <!-- end-user-doc -->
         * 
         * @see org.palladiosimulator.metricspec.Scale
         * @see org.palladiosimulator.metricspec.impl.MetricSpecPackageImpl#getScale()
         * @generated
         */
        EEnum SCALE = eINSTANCE.getScale();

        /**
         * The meta object literal for the '
         * {@link org.palladiosimulator.metricspec.PersistenceKindOptions
         * <em>Persistence Kind Options</em>}' enum. <!-- begin-user-doc --> <!-- end-user-doc -->
         * 
         * @see org.palladiosimulator.metricspec.PersistenceKindOptions
         * @see org.palladiosimulator.metricspec.impl.MetricSpecPackageImpl#getPersistenceKindOptions()
         * @generated
         */
        EEnum PERSISTENCE_KIND_OPTIONS = eINSTANCE.getPersistenceKindOptions();

        /**
         * The meta object literal for the '{@link org.palladiosimulator.metricspec.DataType
         * <em>Data Type</em>}' enum. <!-- begin-user-doc --> <!-- end-user-doc -->
         * 
         * @see org.palladiosimulator.metricspec.DataType
         * @see org.palladiosimulator.metricspec.impl.MetricSpecPackageImpl#getDataType()
         * @generated
         */
        EEnum DATA_TYPE = eINSTANCE.getDataType();

        /**
         * The meta object literal for the '<em>EJS Unit</em>' data type. <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * 
         * @see javax.measure.unit.Unit
         * @see org.palladiosimulator.metricspec.impl.MetricSpecPackageImpl#getEJSUnit()
         * @generated
         */
        EDataType EJS_UNIT = eINSTANCE.getEJSUnit();

    }

} // MetricSpecPackage
