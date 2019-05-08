/**
 */
package org.palladiosimulator.qualitymodel;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.palladiosimulator.pcm.core.entity.EntityPackage;

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
 * @see org.palladiosimulator.qualitymodel.QualityModelFactory
 * @model kind="package"
 * @generated
 */
public interface QualityModelPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "qualitymodel";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://palladiosimulator.org/QualityModel/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "QualityModel";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	QualityModelPackage eINSTANCE = org.palladiosimulator.qualitymodel.impl.QualityModelPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.palladiosimulator.qualitymodel.impl.NqrImpl <em>Nqr</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.palladiosimulator.qualitymodel.impl.NqrImpl
	 * @see org.palladiosimulator.qualitymodel.impl.QualityModelPackageImpl#getNqr()
	 * @generated
	 */
	int NQR = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NQR__ID = EntityPackage.ENTITY__ID;

	/**
	 * The feature id for the '<em><b>Entity Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NQR__ENTITY_NAME = EntityPackage.ENTITY__ENTITY_NAME;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NQR__VALUE = EntityPackage.ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Dimension</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NQR__DIMENSION = EntityPackage.ENTITY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Nqr</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NQR_FEATURE_COUNT = EntityPackage.ENTITY_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.palladiosimulator.qualitymodel.impl.MappingImpl <em>Mapping</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.palladiosimulator.qualitymodel.impl.MappingImpl
	 * @see org.palladiosimulator.qualitymodel.impl.QualityModelPackageImpl#getMapping()
	 * @generated
	 */
	int MAPPING = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING__ID = EntityPackage.ENTITY__ID;

	/**
	 * The feature id for the '<em><b>Entity Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING__ENTITY_NAME = EntityPackage.ENTITY__ENTITY_NAME;

	/**
	 * The feature id for the '<em><b>Mapping Entries</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING__MAPPING_ENTRIES = EntityPackage.ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Identity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING__IDENTITY = EntityPackage.ENTITY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Mapping</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_FEATURE_COUNT = EntityPackage.ENTITY_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.palladiosimulator.qualitymodel.impl.TransformationImpl <em>Transformation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.palladiosimulator.qualitymodel.impl.TransformationImpl
	 * @see org.palladiosimulator.qualitymodel.impl.QualityModelPackageImpl#getTransformation()
	 * @generated
	 */
	int TRANSFORMATION = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION__ID = EntityPackage.ENTITY__ID;

	/**
	 * The feature id for the '<em><b>Entity Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION__ENTITY_NAME = EntityPackage.ENTITY__ENTITY_NAME;

	/**
	 * The feature id for the '<em><b>Mapping</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION__MAPPING = EntityPackage.ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Input</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION__INPUT = EntityPackage.ENTITY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Transformation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION_FEATURE_COUNT = EntityPackage.ENTITY_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.palladiosimulator.qualitymodel.impl.ReasoningImpl <em>Reasoning</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.palladiosimulator.qualitymodel.impl.ReasoningImpl
	 * @see org.palladiosimulator.qualitymodel.impl.QualityModelPackageImpl#getReasoning()
	 * @generated
	 */
	int REASONING = 3;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REASONING__ID = EntityPackage.ENTITY__ID;

	/**
	 * The feature id for the '<em><b>Entity Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REASONING__ENTITY_NAME = EntityPackage.ENTITY__ENTITY_NAME;

	/**
	 * The feature id for the '<em><b>Transformations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REASONING__TRANSFORMATIONS = EntityPackage.ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Output</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REASONING__OUTPUT = EntityPackage.ENTITY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Reasoning</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REASONING_FEATURE_COUNT = EntityPackage.ENTITY_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.palladiosimulator.qualitymodel.Reduction <em>Reduction</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.palladiosimulator.qualitymodel.Reduction
	 * @see org.palladiosimulator.qualitymodel.impl.QualityModelPackageImpl#getReduction()
	 * @generated
	 */
	int REDUCTION = 4;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REDUCTION__ID = EntityPackage.ENTITY__ID;

	/**
	 * The feature id for the '<em><b>Entity Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REDUCTION__ENTITY_NAME = EntityPackage.ENTITY__ENTITY_NAME;

	/**
	 * The number of structural features of the '<em>Reduction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REDUCTION_FEATURE_COUNT = EntityPackage.ENTITY_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.palladiosimulator.qualitymodel.impl.QuantityReductionImpl <em>Quantity Reduction</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.palladiosimulator.qualitymodel.impl.QuantityReductionImpl
	 * @see org.palladiosimulator.qualitymodel.impl.QualityModelPackageImpl#getQuantityReduction()
	 * @generated
	 */
	int QUANTITY_REDUCTION = 5;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUANTITY_REDUCTION__ID = REDUCTION__ID;

	/**
	 * The feature id for the '<em><b>Entity Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUANTITY_REDUCTION__ENTITY_NAME = REDUCTION__ENTITY_NAME;

	/**
	 * The feature id for the '<em><b>Mapping</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUANTITY_REDUCTION__MAPPING = REDUCTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Quantity Reduction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUANTITY_REDUCTION_FEATURE_COUNT = REDUCTION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.palladiosimulator.qualitymodel.impl.StatisticReductionImpl <em>Statistic Reduction</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.palladiosimulator.qualitymodel.impl.StatisticReductionImpl
	 * @see org.palladiosimulator.qualitymodel.impl.QualityModelPackageImpl#getStatisticReduction()
	 * @generated
	 */
	int STATISTIC_REDUCTION = 6;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATISTIC_REDUCTION__ID = REDUCTION__ID;

	/**
	 * The feature id for the '<em><b>Entity Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATISTIC_REDUCTION__ENTITY_NAME = REDUCTION__ENTITY_NAME;

	/**
	 * The number of structural features of the '<em>Statistic Reduction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATISTIC_REDUCTION_FEATURE_COUNT = REDUCTION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.palladiosimulator.qualitymodel.impl.MappingRepositoryImpl <em>Mapping Repository</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.palladiosimulator.qualitymodel.impl.MappingRepositoryImpl
	 * @see org.palladiosimulator.qualitymodel.impl.QualityModelPackageImpl#getMappingRepository()
	 * @generated
	 */
	int MAPPING_REPOSITORY = 7;

	/**
	 * The feature id for the '<em><b>Mappings</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_REPOSITORY__MAPPINGS = 0;

	/**
	 * The number of structural features of the '<em>Mapping Repository</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_REPOSITORY_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.palladiosimulator.qualitymodel.impl.MappingEntryImpl <em>Mapping Entry</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.palladiosimulator.qualitymodel.impl.MappingEntryImpl
	 * @see org.palladiosimulator.qualitymodel.impl.QualityModelPackageImpl#getMappingEntry()
	 * @generated
	 */
	int MAPPING_ENTRY = 8;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_ENTRY__ID = EntityPackage.ENTITY__ID;

	/**
	 * The feature id for the '<em><b>Entity Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_ENTRY__ENTITY_NAME = EntityPackage.ENTITY__ENTITY_NAME;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_ENTRY__VALUE = EntityPackage.ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Key</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_ENTRY__KEY = EntityPackage.ENTITY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Mapping Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_ENTRY_FEATURE_COUNT = EntityPackage.ENTITY_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.palladiosimulator.qualitymodel.impl.TransformationRepositoryImpl <em>Transformation Repository</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.palladiosimulator.qualitymodel.impl.TransformationRepositoryImpl
	 * @see org.palladiosimulator.qualitymodel.impl.QualityModelPackageImpl#getTransformationRepository()
	 * @generated
	 */
	int TRANSFORMATION_REPOSITORY = 9;

	/**
	 * The feature id for the '<em><b>Transformations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION_REPOSITORY__TRANSFORMATIONS = 0;

	/**
	 * The number of structural features of the '<em>Transformation Repository</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION_REPOSITORY_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.palladiosimulator.qualitymodel.impl.ReasoningRepositoryImpl <em>Reasoning Repository</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.palladiosimulator.qualitymodel.impl.ReasoningRepositoryImpl
	 * @see org.palladiosimulator.qualitymodel.impl.QualityModelPackageImpl#getReasoningRepository()
	 * @generated
	 */
	int REASONING_REPOSITORY = 10;

	/**
	 * The feature id for the '<em><b>Reasonings</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REASONING_REPOSITORY__REASONINGS = 0;

	/**
	 * The number of structural features of the '<em>Reasoning Repository</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REASONING_REPOSITORY_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.palladiosimulator.qualitymodel.impl.NqrRepositoryImpl <em>Nqr Repository</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.palladiosimulator.qualitymodel.impl.NqrRepositoryImpl
	 * @see org.palladiosimulator.qualitymodel.impl.QualityModelPackageImpl#getNqrRepository()
	 * @generated
	 */
	int NQR_REPOSITORY = 11;

	/**
	 * The feature id for the '<em><b>Nqrs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NQR_REPOSITORY__NQRS = 0;

	/**
	 * The number of structural features of the '<em>Nqr Repository</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NQR_REPOSITORY_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.palladiosimulator.qualitymodel.impl.ReasoningComponentImpl <em>Reasoning Component</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.palladiosimulator.qualitymodel.impl.ReasoningComponentImpl
	 * @see org.palladiosimulator.qualitymodel.impl.QualityModelPackageImpl#getReasoningComponent()
	 * @generated
	 */
	int REASONING_COMPONENT = 12;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REASONING_COMPONENT__ID = EntityPackage.ENTITY__ID;

	/**
	 * The feature id for the '<em><b>Entity Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REASONING_COMPONENT__ENTITY_NAME = EntityPackage.ENTITY__ENTITY_NAME;

	/**
	 * The feature id for the '<em><b>Nqrs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REASONING_COMPONENT__NQRS = EntityPackage.ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Reasonings</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REASONING_COMPONENT__REASONINGS = EntityPackage.ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Component</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REASONING_COMPONENT__COMPONENT = EntityPackage.ENTITY_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Reasoning Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REASONING_COMPONENT_FEATURE_COUNT = EntityPackage.ENTITY_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.palladiosimulator.qualitymodel.impl.ReasoningSystemImpl <em>Reasoning System</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.palladiosimulator.qualitymodel.impl.ReasoningSystemImpl
	 * @see org.palladiosimulator.qualitymodel.impl.QualityModelPackageImpl#getReasoningSystem()
	 * @generated
	 */
	int REASONING_SYSTEM = 13;

	/**
	 * The feature id for the '<em><b>Components</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REASONING_SYSTEM__COMPONENTS = 0;

	/**
	 * The number of structural features of the '<em>Reasoning System</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REASONING_SYSTEM_FEATURE_COUNT = 1;


	/**
	 * Returns the meta object for class '{@link org.palladiosimulator.qualitymodel.Nqr <em>Nqr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Nqr</em>'.
	 * @see org.palladiosimulator.qualitymodel.Nqr
	 * @generated
	 */
	EClass getNqr();

	/**
	 * Returns the meta object for the containment reference '{@link org.palladiosimulator.qualitymodel.Nqr#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Value</em>'.
	 * @see org.palladiosimulator.qualitymodel.Nqr#getValue()
	 * @see #getNqr()
	 * @generated
	 */
	EReference getNqr_Value();

	/**
	 * Returns the meta object for the reference '{@link org.palladiosimulator.qualitymodel.Nqr#getDimension <em>Dimension</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Dimension</em>'.
	 * @see org.palladiosimulator.qualitymodel.Nqr#getDimension()
	 * @see #getNqr()
	 * @generated
	 */
	EReference getNqr_Dimension();

	/**
	 * Returns the meta object for class '{@link org.palladiosimulator.qualitymodel.Mapping <em>Mapping</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mapping</em>'.
	 * @see org.palladiosimulator.qualitymodel.Mapping
	 * @generated
	 */
	EClass getMapping();

	/**
	 * Returns the meta object for the containment reference list '{@link org.palladiosimulator.qualitymodel.Mapping#getMappingEntries <em>Mapping Entries</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Mapping Entries</em>'.
	 * @see org.palladiosimulator.qualitymodel.Mapping#getMappingEntries()
	 * @see #getMapping()
	 * @generated
	 */
	EReference getMapping_MappingEntries();

	/**
	 * Returns the meta object for the containment reference '{@link org.palladiosimulator.qualitymodel.Mapping#getIdentity <em>Identity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Identity</em>'.
	 * @see org.palladiosimulator.qualitymodel.Mapping#getIdentity()
	 * @see #getMapping()
	 * @generated
	 */
	EReference getMapping_Identity();

	/**
	 * Returns the meta object for class '{@link org.palladiosimulator.qualitymodel.Transformation <em>Transformation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transformation</em>'.
	 * @see org.palladiosimulator.qualitymodel.Transformation
	 * @generated
	 */
	EClass getTransformation();

	/**
	 * Returns the meta object for the reference '{@link org.palladiosimulator.qualitymodel.Transformation#getMapping <em>Mapping</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Mapping</em>'.
	 * @see org.palladiosimulator.qualitymodel.Transformation#getMapping()
	 * @see #getTransformation()
	 * @generated
	 */
	EReference getTransformation_Mapping();

	/**
	 * Returns the meta object for the reference list '{@link org.palladiosimulator.qualitymodel.Transformation#getInput <em>Input</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Input</em>'.
	 * @see org.palladiosimulator.qualitymodel.Transformation#getInput()
	 * @see #getTransformation()
	 * @generated
	 */
	EReference getTransformation_Input();

	/**
	 * Returns the meta object for class '{@link org.palladiosimulator.qualitymodel.Reasoning <em>Reasoning</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Reasoning</em>'.
	 * @see org.palladiosimulator.qualitymodel.Reasoning
	 * @generated
	 */
	EClass getReasoning();

	/**
	 * Returns the meta object for the reference list '{@link org.palladiosimulator.qualitymodel.Reasoning#getTransformations <em>Transformations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Transformations</em>'.
	 * @see org.palladiosimulator.qualitymodel.Reasoning#getTransformations()
	 * @see #getReasoning()
	 * @generated
	 */
	EReference getReasoning_Transformations();

	/**
	 * Returns the meta object for the reference '{@link org.palladiosimulator.qualitymodel.Reasoning#getOutput <em>Output</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Output</em>'.
	 * @see org.palladiosimulator.qualitymodel.Reasoning#getOutput()
	 * @see #getReasoning()
	 * @generated
	 */
	EReference getReasoning_Output();

	/**
	 * Returns the meta object for class '{@link org.palladiosimulator.qualitymodel.Reduction <em>Reduction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Reduction</em>'.
	 * @see org.palladiosimulator.qualitymodel.Reduction
	 * @generated
	 */
	EClass getReduction();

	/**
	 * Returns the meta object for class '{@link org.palladiosimulator.qualitymodel.QuantityReduction <em>Quantity Reduction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Quantity Reduction</em>'.
	 * @see org.palladiosimulator.qualitymodel.QuantityReduction
	 * @generated
	 */
	EClass getQuantityReduction();

	/**
	 * Returns the meta object for the reference '{@link org.palladiosimulator.qualitymodel.QuantityReduction#getMapping <em>Mapping</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Mapping</em>'.
	 * @see org.palladiosimulator.qualitymodel.QuantityReduction#getMapping()
	 * @see #getQuantityReduction()
	 * @generated
	 */
	EReference getQuantityReduction_Mapping();

	/**
	 * Returns the meta object for class '{@link org.palladiosimulator.qualitymodel.StatisticReduction <em>Statistic Reduction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Statistic Reduction</em>'.
	 * @see org.palladiosimulator.qualitymodel.StatisticReduction
	 * @generated
	 */
	EClass getStatisticReduction();

	/**
	 * Returns the meta object for class '{@link org.palladiosimulator.qualitymodel.MappingRepository <em>Mapping Repository</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mapping Repository</em>'.
	 * @see org.palladiosimulator.qualitymodel.MappingRepository
	 * @generated
	 */
	EClass getMappingRepository();

	/**
	 * Returns the meta object for the containment reference list '{@link org.palladiosimulator.qualitymodel.MappingRepository#getMappings <em>Mappings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Mappings</em>'.
	 * @see org.palladiosimulator.qualitymodel.MappingRepository#getMappings()
	 * @see #getMappingRepository()
	 * @generated
	 */
	EReference getMappingRepository_Mappings();

	/**
	 * Returns the meta object for class '{@link org.palladiosimulator.qualitymodel.MappingEntry <em>Mapping Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mapping Entry</em>'.
	 * @see org.palladiosimulator.qualitymodel.MappingEntry
	 * @generated
	 */
	EClass getMappingEntry();

	/**
	 * Returns the meta object for the containment reference '{@link org.palladiosimulator.qualitymodel.MappingEntry#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Value</em>'.
	 * @see org.palladiosimulator.qualitymodel.MappingEntry#getValue()
	 * @see #getMappingEntry()
	 * @generated
	 */
	EReference getMappingEntry_Value();

	/**
	 * Returns the meta object for the containment reference list '{@link org.palladiosimulator.qualitymodel.MappingEntry#getKey <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Key</em>'.
	 * @see org.palladiosimulator.qualitymodel.MappingEntry#getKey()
	 * @see #getMappingEntry()
	 * @generated
	 */
	EReference getMappingEntry_Key();

	/**
	 * Returns the meta object for class '{@link org.palladiosimulator.qualitymodel.TransformationRepository <em>Transformation Repository</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transformation Repository</em>'.
	 * @see org.palladiosimulator.qualitymodel.TransformationRepository
	 * @generated
	 */
	EClass getTransformationRepository();

	/**
	 * Returns the meta object for the containment reference list '{@link org.palladiosimulator.qualitymodel.TransformationRepository#getTransformations <em>Transformations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Transformations</em>'.
	 * @see org.palladiosimulator.qualitymodel.TransformationRepository#getTransformations()
	 * @see #getTransformationRepository()
	 * @generated
	 */
	EReference getTransformationRepository_Transformations();

	/**
	 * Returns the meta object for class '{@link org.palladiosimulator.qualitymodel.ReasoningRepository <em>Reasoning Repository</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Reasoning Repository</em>'.
	 * @see org.palladiosimulator.qualitymodel.ReasoningRepository
	 * @generated
	 */
	EClass getReasoningRepository();

	/**
	 * Returns the meta object for the containment reference list '{@link org.palladiosimulator.qualitymodel.ReasoningRepository#getReasonings <em>Reasonings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Reasonings</em>'.
	 * @see org.palladiosimulator.qualitymodel.ReasoningRepository#getReasonings()
	 * @see #getReasoningRepository()
	 * @generated
	 */
	EReference getReasoningRepository_Reasonings();

	/**
	 * Returns the meta object for class '{@link org.palladiosimulator.qualitymodel.NqrRepository <em>Nqr Repository</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Nqr Repository</em>'.
	 * @see org.palladiosimulator.qualitymodel.NqrRepository
	 * @generated
	 */
	EClass getNqrRepository();

	/**
	 * Returns the meta object for the containment reference list '{@link org.palladiosimulator.qualitymodel.NqrRepository#getNqrs <em>Nqrs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Nqrs</em>'.
	 * @see org.palladiosimulator.qualitymodel.NqrRepository#getNqrs()
	 * @see #getNqrRepository()
	 * @generated
	 */
	EReference getNqrRepository_Nqrs();

	/**
	 * Returns the meta object for class '{@link org.palladiosimulator.qualitymodel.ReasoningComponent <em>Reasoning Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Reasoning Component</em>'.
	 * @see org.palladiosimulator.qualitymodel.ReasoningComponent
	 * @generated
	 */
	EClass getReasoningComponent();

	/**
	 * Returns the meta object for the reference list '{@link org.palladiosimulator.qualitymodel.ReasoningComponent#getNqrs <em>Nqrs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Nqrs</em>'.
	 * @see org.palladiosimulator.qualitymodel.ReasoningComponent#getNqrs()
	 * @see #getReasoningComponent()
	 * @generated
	 */
	EReference getReasoningComponent_Nqrs();

	/**
	 * Returns the meta object for the reference list '{@link org.palladiosimulator.qualitymodel.ReasoningComponent#getReasonings <em>Reasonings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Reasonings</em>'.
	 * @see org.palladiosimulator.qualitymodel.ReasoningComponent#getReasonings()
	 * @see #getReasoningComponent()
	 * @generated
	 */
	EReference getReasoningComponent_Reasonings();

	/**
	 * Returns the meta object for the reference '{@link org.palladiosimulator.qualitymodel.ReasoningComponent#getComponent <em>Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Component</em>'.
	 * @see org.palladiosimulator.qualitymodel.ReasoningComponent#getComponent()
	 * @see #getReasoningComponent()
	 * @generated
	 */
	EReference getReasoningComponent_Component();

	/**
	 * Returns the meta object for class '{@link org.palladiosimulator.qualitymodel.ReasoningSystem <em>Reasoning System</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Reasoning System</em>'.
	 * @see org.palladiosimulator.qualitymodel.ReasoningSystem
	 * @generated
	 */
	EClass getReasoningSystem();

	/**
	 * Returns the meta object for the containment reference list '{@link org.palladiosimulator.qualitymodel.ReasoningSystem#getComponents <em>Components</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Components</em>'.
	 * @see org.palladiosimulator.qualitymodel.ReasoningSystem#getComponents()
	 * @see #getReasoningSystem()
	 * @generated
	 */
	EReference getReasoningSystem_Components();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	QualityModelFactory getQualityModelFactory();

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
		 * The meta object literal for the '{@link org.palladiosimulator.qualitymodel.impl.NqrImpl <em>Nqr</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.palladiosimulator.qualitymodel.impl.NqrImpl
		 * @see org.palladiosimulator.qualitymodel.impl.QualityModelPackageImpl#getNqr()
		 * @generated
		 */
		EClass NQR = eINSTANCE.getNqr();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NQR__VALUE = eINSTANCE.getNqr_Value();

		/**
		 * The meta object literal for the '<em><b>Dimension</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NQR__DIMENSION = eINSTANCE.getNqr_Dimension();

		/**
		 * The meta object literal for the '{@link org.palladiosimulator.qualitymodel.impl.MappingImpl <em>Mapping</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.palladiosimulator.qualitymodel.impl.MappingImpl
		 * @see org.palladiosimulator.qualitymodel.impl.QualityModelPackageImpl#getMapping()
		 * @generated
		 */
		EClass MAPPING = eINSTANCE.getMapping();

		/**
		 * The meta object literal for the '<em><b>Mapping Entries</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MAPPING__MAPPING_ENTRIES = eINSTANCE.getMapping_MappingEntries();

		/**
		 * The meta object literal for the '<em><b>Identity</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MAPPING__IDENTITY = eINSTANCE.getMapping_Identity();

		/**
		 * The meta object literal for the '{@link org.palladiosimulator.qualitymodel.impl.TransformationImpl <em>Transformation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.palladiosimulator.qualitymodel.impl.TransformationImpl
		 * @see org.palladiosimulator.qualitymodel.impl.QualityModelPackageImpl#getTransformation()
		 * @generated
		 */
		EClass TRANSFORMATION = eINSTANCE.getTransformation();

		/**
		 * The meta object literal for the '<em><b>Mapping</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSFORMATION__MAPPING = eINSTANCE.getTransformation_Mapping();

		/**
		 * The meta object literal for the '<em><b>Input</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSFORMATION__INPUT = eINSTANCE.getTransformation_Input();

		/**
		 * The meta object literal for the '{@link org.palladiosimulator.qualitymodel.impl.ReasoningImpl <em>Reasoning</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.palladiosimulator.qualitymodel.impl.ReasoningImpl
		 * @see org.palladiosimulator.qualitymodel.impl.QualityModelPackageImpl#getReasoning()
		 * @generated
		 */
		EClass REASONING = eINSTANCE.getReasoning();

		/**
		 * The meta object literal for the '<em><b>Transformations</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REASONING__TRANSFORMATIONS = eINSTANCE.getReasoning_Transformations();

		/**
		 * The meta object literal for the '<em><b>Output</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REASONING__OUTPUT = eINSTANCE.getReasoning_Output();

		/**
		 * The meta object literal for the '{@link org.palladiosimulator.qualitymodel.Reduction <em>Reduction</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.palladiosimulator.qualitymodel.Reduction
		 * @see org.palladiosimulator.qualitymodel.impl.QualityModelPackageImpl#getReduction()
		 * @generated
		 */
		EClass REDUCTION = eINSTANCE.getReduction();

		/**
		 * The meta object literal for the '{@link org.palladiosimulator.qualitymodel.impl.QuantityReductionImpl <em>Quantity Reduction</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.palladiosimulator.qualitymodel.impl.QuantityReductionImpl
		 * @see org.palladiosimulator.qualitymodel.impl.QualityModelPackageImpl#getQuantityReduction()
		 * @generated
		 */
		EClass QUANTITY_REDUCTION = eINSTANCE.getQuantityReduction();

		/**
		 * The meta object literal for the '<em><b>Mapping</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QUANTITY_REDUCTION__MAPPING = eINSTANCE.getQuantityReduction_Mapping();

		/**
		 * The meta object literal for the '{@link org.palladiosimulator.qualitymodel.impl.StatisticReductionImpl <em>Statistic Reduction</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.palladiosimulator.qualitymodel.impl.StatisticReductionImpl
		 * @see org.palladiosimulator.qualitymodel.impl.QualityModelPackageImpl#getStatisticReduction()
		 * @generated
		 */
		EClass STATISTIC_REDUCTION = eINSTANCE.getStatisticReduction();

		/**
		 * The meta object literal for the '{@link org.palladiosimulator.qualitymodel.impl.MappingRepositoryImpl <em>Mapping Repository</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.palladiosimulator.qualitymodel.impl.MappingRepositoryImpl
		 * @see org.palladiosimulator.qualitymodel.impl.QualityModelPackageImpl#getMappingRepository()
		 * @generated
		 */
		EClass MAPPING_REPOSITORY = eINSTANCE.getMappingRepository();

		/**
		 * The meta object literal for the '<em><b>Mappings</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MAPPING_REPOSITORY__MAPPINGS = eINSTANCE.getMappingRepository_Mappings();

		/**
		 * The meta object literal for the '{@link org.palladiosimulator.qualitymodel.impl.MappingEntryImpl <em>Mapping Entry</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.palladiosimulator.qualitymodel.impl.MappingEntryImpl
		 * @see org.palladiosimulator.qualitymodel.impl.QualityModelPackageImpl#getMappingEntry()
		 * @generated
		 */
		EClass MAPPING_ENTRY = eINSTANCE.getMappingEntry();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MAPPING_ENTRY__VALUE = eINSTANCE.getMappingEntry_Value();

		/**
		 * The meta object literal for the '<em><b>Key</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MAPPING_ENTRY__KEY = eINSTANCE.getMappingEntry_Key();

		/**
		 * The meta object literal for the '{@link org.palladiosimulator.qualitymodel.impl.TransformationRepositoryImpl <em>Transformation Repository</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.palladiosimulator.qualitymodel.impl.TransformationRepositoryImpl
		 * @see org.palladiosimulator.qualitymodel.impl.QualityModelPackageImpl#getTransformationRepository()
		 * @generated
		 */
		EClass TRANSFORMATION_REPOSITORY = eINSTANCE.getTransformationRepository();

		/**
		 * The meta object literal for the '<em><b>Transformations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSFORMATION_REPOSITORY__TRANSFORMATIONS = eINSTANCE.getTransformationRepository_Transformations();

		/**
		 * The meta object literal for the '{@link org.palladiosimulator.qualitymodel.impl.ReasoningRepositoryImpl <em>Reasoning Repository</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.palladiosimulator.qualitymodel.impl.ReasoningRepositoryImpl
		 * @see org.palladiosimulator.qualitymodel.impl.QualityModelPackageImpl#getReasoningRepository()
		 * @generated
		 */
		EClass REASONING_REPOSITORY = eINSTANCE.getReasoningRepository();

		/**
		 * The meta object literal for the '<em><b>Reasonings</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REASONING_REPOSITORY__REASONINGS = eINSTANCE.getReasoningRepository_Reasonings();

		/**
		 * The meta object literal for the '{@link org.palladiosimulator.qualitymodel.impl.NqrRepositoryImpl <em>Nqr Repository</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.palladiosimulator.qualitymodel.impl.NqrRepositoryImpl
		 * @see org.palladiosimulator.qualitymodel.impl.QualityModelPackageImpl#getNqrRepository()
		 * @generated
		 */
		EClass NQR_REPOSITORY = eINSTANCE.getNqrRepository();

		/**
		 * The meta object literal for the '<em><b>Nqrs</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NQR_REPOSITORY__NQRS = eINSTANCE.getNqrRepository_Nqrs();

		/**
		 * The meta object literal for the '{@link org.palladiosimulator.qualitymodel.impl.ReasoningComponentImpl <em>Reasoning Component</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.palladiosimulator.qualitymodel.impl.ReasoningComponentImpl
		 * @see org.palladiosimulator.qualitymodel.impl.QualityModelPackageImpl#getReasoningComponent()
		 * @generated
		 */
		EClass REASONING_COMPONENT = eINSTANCE.getReasoningComponent();

		/**
		 * The meta object literal for the '<em><b>Nqrs</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REASONING_COMPONENT__NQRS = eINSTANCE.getReasoningComponent_Nqrs();

		/**
		 * The meta object literal for the '<em><b>Reasonings</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REASONING_COMPONENT__REASONINGS = eINSTANCE.getReasoningComponent_Reasonings();

		/**
		 * The meta object literal for the '<em><b>Component</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REASONING_COMPONENT__COMPONENT = eINSTANCE.getReasoningComponent_Component();

		/**
		 * The meta object literal for the '{@link org.palladiosimulator.qualitymodel.impl.ReasoningSystemImpl <em>Reasoning System</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.palladiosimulator.qualitymodel.impl.ReasoningSystemImpl
		 * @see org.palladiosimulator.qualitymodel.impl.QualityModelPackageImpl#getReasoningSystem()
		 * @generated
		 */
		EClass REASONING_SYSTEM = eINSTANCE.getReasoningSystem();

		/**
		 * The meta object literal for the '<em><b>Components</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REASONING_SYSTEM__COMPONENTS = eINSTANCE.getReasoningSystem_Components();

	}

} //QualityModelPackage
