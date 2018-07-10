/**
 */
package featureObjective;

import FeatureCompletionModel.FeatureCompletionPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
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
 * @see featureObjective.FeatureObjectiveFactory
 * @model kind="package"
 * @generated
 */
public interface FeatureObjectivePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "featureObjective";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://are.ipd.kit.edu/FeatureObjectivesModel/1.0.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "featureObjective";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	FeatureObjectivePackage eINSTANCE = featureObjective.impl.FeatureObjectivePackageImpl.init();

	/**
	 * The meta object id for the '{@link featureObjective.impl.FeatureObjectiveImpl <em>Feature Objective</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see featureObjective.impl.FeatureObjectiveImpl
	 * @see featureObjective.impl.FeatureObjectivePackageImpl#getFeatureObjective()
	 * @generated
	 */
	int FEATURE_OBJECTIVE = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_OBJECTIVE__ID = FeatureCompletionPackage.DESCRIBED_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_OBJECTIVE__NAME = FeatureCompletionPackage.DESCRIBED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_OBJECTIVE__DESCRIPTION = FeatureCompletionPackage.DESCRIBED_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Root Feature</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_OBJECTIVE__ROOT_FEATURE = FeatureCompletionPackage.DESCRIBED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_OBJECTIVE__CONSTRAINTS = FeatureCompletionPackage.DESCRIBED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Annotatable Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_OBJECTIVE__ANNOTATABLE_ELEMENT = FeatureCompletionPackage.DESCRIBED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Feature Objective</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_OBJECTIVE_FEATURE_COUNT = FeatureCompletionPackage.DESCRIBED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link featureObjective.impl.FeatureImpl <em>Feature</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see featureObjective.impl.FeatureImpl
	 * @see featureObjective.impl.FeatureObjectivePackageImpl#getFeature()
	 * @generated
	 */
	int FEATURE = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__ID = FeatureCompletionPackage.NAMED_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__NAME = FeatureCompletionPackage.NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__ATTRIBUTES = FeatureCompletionPackage.NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Childrelation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__CHILDRELATION = FeatureCompletionPackage.NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Simple Mandatory</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__SIMPLE_MANDATORY = FeatureCompletionPackage.NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Simple Optional</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__SIMPLE_OPTIONAL = FeatureCompletionPackage.NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Featuregroup</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__FEATUREGROUP = FeatureCompletionPackage.NAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Feature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_FEATURE_COUNT = FeatureCompletionPackage.NAMED_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link featureObjective.impl.AttributeImpl <em>Attribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see featureObjective.impl.AttributeImpl
	 * @see featureObjective.impl.FeatureObjectivePackageImpl#getAttribute()
	 * @generated
	 */
	int ATTRIBUTE = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__ID = FeatureCompletionPackage.NAMED_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__NAME = FeatureCompletionPackage.NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Range</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__RANGE = FeatureCompletionPackage.NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_FEATURE_COUNT = FeatureCompletionPackage.NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link featureObjective.impl.IntervalRangeImpl <em>Interval Range</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see featureObjective.impl.IntervalRangeImpl
	 * @see featureObjective.impl.FeatureObjectivePackageImpl#getIntervalRange()
	 * @generated
	 */
	int INTERVAL_RANGE = 3;

	/**
	 * The feature id for the '<em><b>Lower Bound Included</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERVAL_RANGE__LOWER_BOUND_INCLUDED = 0;

	/**
	 * The feature id for the '<em><b>Upper Bound Included</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERVAL_RANGE__UPPER_BOUND_INCLUDED = 1;

	/**
	 * The number of structural features of the '<em>Interval Range</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERVAL_RANGE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link featureObjective.impl.ChildRelationImpl <em>Child Relation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see featureObjective.impl.ChildRelationImpl
	 * @see featureObjective.impl.FeatureObjectivePackageImpl#getChildRelation()
	 * @generated
	 */
	int CHILD_RELATION = 4;

	/**
	 * The number of structural features of the '<em>Child Relation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHILD_RELATION_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link featureObjective.impl.SimpleImpl <em>Simple</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see featureObjective.impl.SimpleImpl
	 * @see featureObjective.impl.FeatureObjectivePackageImpl#getSimple()
	 * @generated
	 */
	int SIMPLE = 5;

	/**
	 * The feature id for the '<em><b>Optional Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE__OPTIONAL_CHILDREN = CHILD_RELATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Mandatory Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE__MANDATORY_CHILDREN = CHILD_RELATION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Simple</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_FEATURE_COUNT = CHILD_RELATION_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link featureObjective.impl.FeatureGroupImpl <em>Feature Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see featureObjective.impl.FeatureGroupImpl
	 * @see featureObjective.impl.FeatureObjectivePackageImpl#getFeatureGroup()
	 * @generated
	 */
	int FEATURE_GROUP = 6;

	/**
	 * The feature id for the '<em><b>Min</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_GROUP__MIN = CHILD_RELATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Max</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_GROUP__MAX = CHILD_RELATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_GROUP__CHILDREN = CHILD_RELATION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Feature Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_GROUP_FEATURE_COUNT = CHILD_RELATION_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link featureObjective.impl.ConstraintImpl <em>Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see featureObjective.impl.ConstraintImpl
	 * @see featureObjective.impl.FeatureObjectivePackageImpl#getConstraint()
	 * @generated
	 */
	int CONSTRAINT = 7;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT__ID = FeatureCompletionPackage.NAMED_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT__NAME = FeatureCompletionPackage.NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT__SOURCE = FeatureCompletionPackage.NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT__TARGET = FeatureCompletionPackage.NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT__DESCRIPTION = FeatureCompletionPackage.NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT_FEATURE_COUNT = FeatureCompletionPackage.NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link featureObjective.impl.RequiredConstraintImpl <em>Required Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see featureObjective.impl.RequiredConstraintImpl
	 * @see featureObjective.impl.FeatureObjectivePackageImpl#getRequiredConstraint()
	 * @generated
	 */
	int REQUIRED_CONSTRAINT = 8;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRED_CONSTRAINT__ID = CONSTRAINT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRED_CONSTRAINT__NAME = CONSTRAINT__NAME;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRED_CONSTRAINT__SOURCE = CONSTRAINT__SOURCE;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRED_CONSTRAINT__TARGET = CONSTRAINT__TARGET;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRED_CONSTRAINT__DESCRIPTION = CONSTRAINT__DESCRIPTION;

	/**
	 * The number of structural features of the '<em>Required Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRED_CONSTRAINT_FEATURE_COUNT = CONSTRAINT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link featureObjective.impl.ProhibitsConstraintImpl <em>Prohibits Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see featureObjective.impl.ProhibitsConstraintImpl
	 * @see featureObjective.impl.FeatureObjectivePackageImpl#getProhibitsConstraint()
	 * @generated
	 */
	int PROHIBITS_CONSTRAINT = 9;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROHIBITS_CONSTRAINT__ID = CONSTRAINT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROHIBITS_CONSTRAINT__NAME = CONSTRAINT__NAME;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROHIBITS_CONSTRAINT__SOURCE = CONSTRAINT__SOURCE;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROHIBITS_CONSTRAINT__TARGET = CONSTRAINT__TARGET;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROHIBITS_CONSTRAINT__DESCRIPTION = CONSTRAINT__DESCRIPTION;

	/**
	 * The number of structural features of the '<em>Prohibits Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROHIBITS_CONSTRAINT_FEATURE_COUNT = CONSTRAINT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link featureObjective.impl.IntegerIntervalRangeImpl <em>Integer Interval Range</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see featureObjective.impl.IntegerIntervalRangeImpl
	 * @see featureObjective.impl.FeatureObjectivePackageImpl#getIntegerIntervalRange()
	 * @generated
	 */
	int INTEGER_INTERVAL_RANGE = 10;

	/**
	 * The feature id for the '<em><b>Lower Bound Included</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_INTERVAL_RANGE__LOWER_BOUND_INCLUDED = INTERVAL_RANGE__LOWER_BOUND_INCLUDED;

	/**
	 * The feature id for the '<em><b>Upper Bound Included</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_INTERVAL_RANGE__UPPER_BOUND_INCLUDED = INTERVAL_RANGE__UPPER_BOUND_INCLUDED;

	/**
	 * The feature id for the '<em><b>To</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_INTERVAL_RANGE__TO = INTERVAL_RANGE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>From</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_INTERVAL_RANGE__FROM = INTERVAL_RANGE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Integer Interval Range</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_INTERVAL_RANGE_FEATURE_COUNT = INTERVAL_RANGE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link featureObjective.impl.IntegerAttributeImpl <em>Integer Attribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see featureObjective.impl.IntegerAttributeImpl
	 * @see featureObjective.impl.FeatureObjectivePackageImpl#getIntegerAttribute()
	 * @generated
	 */
	int INTEGER_ATTRIBUTE = 11;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_ATTRIBUTE__ID = ATTRIBUTE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_ATTRIBUTE__NAME = ATTRIBUTE__NAME;

	/**
	 * The feature id for the '<em><b>Range</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_ATTRIBUTE__RANGE = ATTRIBUTE__RANGE;

	/**
	 * The feature id for the '<em><b>Default Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_ATTRIBUTE__DEFAULT_VALUE = ATTRIBUTE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Integer Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_ATTRIBUTE_FEATURE_COUNT = ATTRIBUTE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link featureObjective.impl.DoubleAttributeImpl <em>Double Attribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see featureObjective.impl.DoubleAttributeImpl
	 * @see featureObjective.impl.FeatureObjectivePackageImpl#getDoubleAttribute()
	 * @generated
	 */
	int DOUBLE_ATTRIBUTE = 12;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOUBLE_ATTRIBUTE__ID = ATTRIBUTE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOUBLE_ATTRIBUTE__NAME = ATTRIBUTE__NAME;

	/**
	 * The feature id for the '<em><b>Range</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOUBLE_ATTRIBUTE__RANGE = ATTRIBUTE__RANGE;

	/**
	 * The feature id for the '<em><b>Default Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOUBLE_ATTRIBUTE__DEFAULT_VALUE = ATTRIBUTE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Double Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOUBLE_ATTRIBUTE_FEATURE_COUNT = ATTRIBUTE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link featureObjective.impl.StringAttributeImpl <em>String Attribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see featureObjective.impl.StringAttributeImpl
	 * @see featureObjective.impl.FeatureObjectivePackageImpl#getStringAttribute()
	 * @generated
	 */
	int STRING_ATTRIBUTE = 13;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_ATTRIBUTE__ID = ATTRIBUTE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_ATTRIBUTE__NAME = ATTRIBUTE__NAME;

	/**
	 * The feature id for the '<em><b>Range</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_ATTRIBUTE__RANGE = ATTRIBUTE__RANGE;

	/**
	 * The feature id for the '<em><b>Default Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_ATTRIBUTE__DEFAULT_VALUE = ATTRIBUTE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>String Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_ATTRIBUTE_FEATURE_COUNT = ATTRIBUTE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link featureObjective.impl.ExternalObjectAttributeImpl <em>External Object Attribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see featureObjective.impl.ExternalObjectAttributeImpl
	 * @see featureObjective.impl.FeatureObjectivePackageImpl#getExternalObjectAttribute()
	 * @generated
	 */
	int EXTERNAL_OBJECT_ATTRIBUTE = 14;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_OBJECT_ATTRIBUTE__ID = ATTRIBUTE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_OBJECT_ATTRIBUTE__NAME = ATTRIBUTE__NAME;

	/**
	 * The feature id for the '<em><b>Range</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_OBJECT_ATTRIBUTE__RANGE = ATTRIBUTE__RANGE;

	/**
	 * The number of structural features of the '<em>External Object Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_OBJECT_ATTRIBUTE_FEATURE_COUNT = ATTRIBUTE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link featureObjective.AttributeTypes <em>Attribute Types</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see featureObjective.AttributeTypes
	 * @see featureObjective.impl.FeatureObjectivePackageImpl#getAttributeTypes()
	 * @generated
	 */
	int ATTRIBUTE_TYPES = 15;


	/**
	 * Returns the meta object for class '{@link featureObjective.FeatureObjective <em>Feature Objective</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Feature Objective</em>'.
	 * @see featureObjective.FeatureObjective
	 * @generated
	 */
	EClass getFeatureObjective();

	/**
	 * Returns the meta object for the containment reference '{@link featureObjective.FeatureObjective#getRootFeature <em>Root Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Root Feature</em>'.
	 * @see featureObjective.FeatureObjective#getRootFeature()
	 * @see #getFeatureObjective()
	 * @generated
	 */
	EReference getFeatureObjective_RootFeature();

	/**
	 * Returns the meta object for the containment reference list '{@link featureObjective.FeatureObjective#getConstraints <em>Constraints</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Constraints</em>'.
	 * @see featureObjective.FeatureObjective#getConstraints()
	 * @see #getFeatureObjective()
	 * @generated
	 */
	EReference getFeatureObjective_Constraints();

	/**
	 * Returns the meta object for the reference list '{@link featureObjective.FeatureObjective#getAnnotatableElement <em>Annotatable Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Annotatable Element</em>'.
	 * @see featureObjective.FeatureObjective#getAnnotatableElement()
	 * @see #getFeatureObjective()
	 * @generated
	 */
	EReference getFeatureObjective_AnnotatableElement();

	/**
	 * Returns the meta object for class '{@link featureObjective.Feature <em>Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Feature</em>'.
	 * @see featureObjective.Feature
	 * @generated
	 */
	EClass getFeature();

	/**
	 * Returns the meta object for the containment reference list '{@link featureObjective.Feature#getAttributes <em>Attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Attributes</em>'.
	 * @see featureObjective.Feature#getAttributes()
	 * @see #getFeature()
	 * @generated
	 */
	EReference getFeature_Attributes();

	/**
	 * Returns the meta object for the containment reference '{@link featureObjective.Feature#getChildrelation <em>Childrelation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Childrelation</em>'.
	 * @see featureObjective.Feature#getChildrelation()
	 * @see #getFeature()
	 * @generated
	 */
	EReference getFeature_Childrelation();

	/**
	 * Returns the meta object for the reference '{@link featureObjective.Feature#getSimpleMandatory <em>Simple Mandatory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Simple Mandatory</em>'.
	 * @see featureObjective.Feature#getSimpleMandatory()
	 * @see #getFeature()
	 * @generated
	 */
	EReference getFeature_SimpleMandatory();

	/**
	 * Returns the meta object for the reference '{@link featureObjective.Feature#getSimpleOptional <em>Simple Optional</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Simple Optional</em>'.
	 * @see featureObjective.Feature#getSimpleOptional()
	 * @see #getFeature()
	 * @generated
	 */
	EReference getFeature_SimpleOptional();

	/**
	 * Returns the meta object for the reference '{@link featureObjective.Feature#getFeaturegroup <em>Featuregroup</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Featuregroup</em>'.
	 * @see featureObjective.Feature#getFeaturegroup()
	 * @see #getFeature()
	 * @generated
	 */
	EReference getFeature_Featuregroup();

	/**
	 * Returns the meta object for class '{@link featureObjective.Attribute <em>Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attribute</em>'.
	 * @see featureObjective.Attribute
	 * @generated
	 */
	EClass getAttribute();

	/**
	 * Returns the meta object for the containment reference '{@link featureObjective.Attribute#getRange <em>Range</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Range</em>'.
	 * @see featureObjective.Attribute#getRange()
	 * @see #getAttribute()
	 * @generated
	 */
	EReference getAttribute_Range();

	/**
	 * Returns the meta object for class '{@link featureObjective.IntervalRange <em>Interval Range</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Interval Range</em>'.
	 * @see featureObjective.IntervalRange
	 * @generated
	 */
	EClass getIntervalRange();

	/**
	 * Returns the meta object for the attribute '{@link featureObjective.IntervalRange#isLowerBoundIncluded <em>Lower Bound Included</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lower Bound Included</em>'.
	 * @see featureObjective.IntervalRange#isLowerBoundIncluded()
	 * @see #getIntervalRange()
	 * @generated
	 */
	EAttribute getIntervalRange_LowerBoundIncluded();

	/**
	 * Returns the meta object for the attribute '{@link featureObjective.IntervalRange#isUpperBoundIncluded <em>Upper Bound Included</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Upper Bound Included</em>'.
	 * @see featureObjective.IntervalRange#isUpperBoundIncluded()
	 * @see #getIntervalRange()
	 * @generated
	 */
	EAttribute getIntervalRange_UpperBoundIncluded();

	/**
	 * Returns the meta object for class '{@link featureObjective.ChildRelation <em>Child Relation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Child Relation</em>'.
	 * @see featureObjective.ChildRelation
	 * @generated
	 */
	EClass getChildRelation();

	/**
	 * Returns the meta object for class '{@link featureObjective.Simple <em>Simple</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Simple</em>'.
	 * @see featureObjective.Simple
	 * @generated
	 */
	EClass getSimple();

	/**
	 * Returns the meta object for the containment reference list '{@link featureObjective.Simple#getOptionalChildren <em>Optional Children</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Optional Children</em>'.
	 * @see featureObjective.Simple#getOptionalChildren()
	 * @see #getSimple()
	 * @generated
	 */
	EReference getSimple_OptionalChildren();

	/**
	 * Returns the meta object for the containment reference list '{@link featureObjective.Simple#getMandatoryChildren <em>Mandatory Children</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Mandatory Children</em>'.
	 * @see featureObjective.Simple#getMandatoryChildren()
	 * @see #getSimple()
	 * @generated
	 */
	EReference getSimple_MandatoryChildren();

	/**
	 * Returns the meta object for class '{@link featureObjective.FeatureGroup <em>Feature Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Feature Group</em>'.
	 * @see featureObjective.FeatureGroup
	 * @generated
	 */
	EClass getFeatureGroup();

	/**
	 * Returns the meta object for the attribute '{@link featureObjective.FeatureGroup#getMin <em>Min</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min</em>'.
	 * @see featureObjective.FeatureGroup#getMin()
	 * @see #getFeatureGroup()
	 * @generated
	 */
	EAttribute getFeatureGroup_Min();

	/**
	 * Returns the meta object for the attribute '{@link featureObjective.FeatureGroup#getMax <em>Max</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max</em>'.
	 * @see featureObjective.FeatureGroup#getMax()
	 * @see #getFeatureGroup()
	 * @generated
	 */
	EAttribute getFeatureGroup_Max();

	/**
	 * Returns the meta object for the containment reference list '{@link featureObjective.FeatureGroup#getChildren <em>Children</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Children</em>'.
	 * @see featureObjective.FeatureGroup#getChildren()
	 * @see #getFeatureGroup()
	 * @generated
	 */
	EReference getFeatureGroup_Children();

	/**
	 * Returns the meta object for class '{@link featureObjective.Constraint <em>Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Constraint</em>'.
	 * @see featureObjective.Constraint
	 * @generated
	 */
	EClass getConstraint();

	/**
	 * Returns the meta object for the reference '{@link featureObjective.Constraint#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see featureObjective.Constraint#getSource()
	 * @see #getConstraint()
	 * @generated
	 */
	EReference getConstraint_Source();

	/**
	 * Returns the meta object for the reference list '{@link featureObjective.Constraint#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Target</em>'.
	 * @see featureObjective.Constraint#getTarget()
	 * @see #getConstraint()
	 * @generated
	 */
	EReference getConstraint_Target();

	/**
	 * Returns the meta object for the attribute '{@link featureObjective.Constraint#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see featureObjective.Constraint#getDescription()
	 * @see #getConstraint()
	 * @generated
	 */
	EAttribute getConstraint_Description();

	/**
	 * Returns the meta object for class '{@link featureObjective.RequiredConstraint <em>Required Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Required Constraint</em>'.
	 * @see featureObjective.RequiredConstraint
	 * @generated
	 */
	EClass getRequiredConstraint();

	/**
	 * Returns the meta object for class '{@link featureObjective.ProhibitsConstraint <em>Prohibits Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Prohibits Constraint</em>'.
	 * @see featureObjective.ProhibitsConstraint
	 * @generated
	 */
	EClass getProhibitsConstraint();

	/**
	 * Returns the meta object for class '{@link featureObjective.IntegerIntervalRange <em>Integer Interval Range</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Integer Interval Range</em>'.
	 * @see featureObjective.IntegerIntervalRange
	 * @generated
	 */
	EClass getIntegerIntervalRange();

	/**
	 * Returns the meta object for the attribute '{@link featureObjective.IntegerIntervalRange#getTo <em>To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>To</em>'.
	 * @see featureObjective.IntegerIntervalRange#getTo()
	 * @see #getIntegerIntervalRange()
	 * @generated
	 */
	EAttribute getIntegerIntervalRange_To();

	/**
	 * Returns the meta object for the attribute '{@link featureObjective.IntegerIntervalRange#getFrom <em>From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>From</em>'.
	 * @see featureObjective.IntegerIntervalRange#getFrom()
	 * @see #getIntegerIntervalRange()
	 * @generated
	 */
	EAttribute getIntegerIntervalRange_From();

	/**
	 * Returns the meta object for class '{@link featureObjective.IntegerAttribute <em>Integer Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Integer Attribute</em>'.
	 * @see featureObjective.IntegerAttribute
	 * @generated
	 */
	EClass getIntegerAttribute();

	/**
	 * Returns the meta object for the attribute '{@link featureObjective.IntegerAttribute#getDefaultValue <em>Default Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Default Value</em>'.
	 * @see featureObjective.IntegerAttribute#getDefaultValue()
	 * @see #getIntegerAttribute()
	 * @generated
	 */
	EAttribute getIntegerAttribute_DefaultValue();

	/**
	 * Returns the meta object for class '{@link featureObjective.DoubleAttribute <em>Double Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Double Attribute</em>'.
	 * @see featureObjective.DoubleAttribute
	 * @generated
	 */
	EClass getDoubleAttribute();

	/**
	 * Returns the meta object for the attribute '{@link featureObjective.DoubleAttribute#getDefaultValue <em>Default Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Default Value</em>'.
	 * @see featureObjective.DoubleAttribute#getDefaultValue()
	 * @see #getDoubleAttribute()
	 * @generated
	 */
	EAttribute getDoubleAttribute_DefaultValue();

	/**
	 * Returns the meta object for class '{@link featureObjective.StringAttribute <em>String Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>String Attribute</em>'.
	 * @see featureObjective.StringAttribute
	 * @generated
	 */
	EClass getStringAttribute();

	/**
	 * Returns the meta object for the attribute '{@link featureObjective.StringAttribute#getDefaultValue <em>Default Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Default Value</em>'.
	 * @see featureObjective.StringAttribute#getDefaultValue()
	 * @see #getStringAttribute()
	 * @generated
	 */
	EAttribute getStringAttribute_DefaultValue();

	/**
	 * Returns the meta object for class '{@link featureObjective.ExternalObjectAttribute <em>External Object Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>External Object Attribute</em>'.
	 * @see featureObjective.ExternalObjectAttribute
	 * @generated
	 */
	EClass getExternalObjectAttribute();

	/**
	 * Returns the meta object for enum '{@link featureObjective.AttributeTypes <em>Attribute Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Attribute Types</em>'.
	 * @see featureObjective.AttributeTypes
	 * @generated
	 */
	EEnum getAttributeTypes();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	FeatureObjectiveFactory getFeatureObjectiveFactory();

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
		 * The meta object literal for the '{@link featureObjective.impl.FeatureObjectiveImpl <em>Feature Objective</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see featureObjective.impl.FeatureObjectiveImpl
		 * @see featureObjective.impl.FeatureObjectivePackageImpl#getFeatureObjective()
		 * @generated
		 */
		EClass FEATURE_OBJECTIVE = eINSTANCE.getFeatureObjective();

		/**
		 * The meta object literal for the '<em><b>Root Feature</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FEATURE_OBJECTIVE__ROOT_FEATURE = eINSTANCE.getFeatureObjective_RootFeature();

		/**
		 * The meta object literal for the '<em><b>Constraints</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FEATURE_OBJECTIVE__CONSTRAINTS = eINSTANCE.getFeatureObjective_Constraints();

		/**
		 * The meta object literal for the '<em><b>Annotatable Element</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FEATURE_OBJECTIVE__ANNOTATABLE_ELEMENT = eINSTANCE.getFeatureObjective_AnnotatableElement();

		/**
		 * The meta object literal for the '{@link featureObjective.impl.FeatureImpl <em>Feature</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see featureObjective.impl.FeatureImpl
		 * @see featureObjective.impl.FeatureObjectivePackageImpl#getFeature()
		 * @generated
		 */
		EClass FEATURE = eINSTANCE.getFeature();

		/**
		 * The meta object literal for the '<em><b>Attributes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FEATURE__ATTRIBUTES = eINSTANCE.getFeature_Attributes();

		/**
		 * The meta object literal for the '<em><b>Childrelation</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FEATURE__CHILDRELATION = eINSTANCE.getFeature_Childrelation();

		/**
		 * The meta object literal for the '<em><b>Simple Mandatory</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FEATURE__SIMPLE_MANDATORY = eINSTANCE.getFeature_SimpleMandatory();

		/**
		 * The meta object literal for the '<em><b>Simple Optional</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FEATURE__SIMPLE_OPTIONAL = eINSTANCE.getFeature_SimpleOptional();

		/**
		 * The meta object literal for the '<em><b>Featuregroup</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FEATURE__FEATUREGROUP = eINSTANCE.getFeature_Featuregroup();

		/**
		 * The meta object literal for the '{@link featureObjective.impl.AttributeImpl <em>Attribute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see featureObjective.impl.AttributeImpl
		 * @see featureObjective.impl.FeatureObjectivePackageImpl#getAttribute()
		 * @generated
		 */
		EClass ATTRIBUTE = eINSTANCE.getAttribute();

		/**
		 * The meta object literal for the '<em><b>Range</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTRIBUTE__RANGE = eINSTANCE.getAttribute_Range();

		/**
		 * The meta object literal for the '{@link featureObjective.impl.IntervalRangeImpl <em>Interval Range</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see featureObjective.impl.IntervalRangeImpl
		 * @see featureObjective.impl.FeatureObjectivePackageImpl#getIntervalRange()
		 * @generated
		 */
		EClass INTERVAL_RANGE = eINSTANCE.getIntervalRange();

		/**
		 * The meta object literal for the '<em><b>Lower Bound Included</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTERVAL_RANGE__LOWER_BOUND_INCLUDED = eINSTANCE.getIntervalRange_LowerBoundIncluded();

		/**
		 * The meta object literal for the '<em><b>Upper Bound Included</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTERVAL_RANGE__UPPER_BOUND_INCLUDED = eINSTANCE.getIntervalRange_UpperBoundIncluded();

		/**
		 * The meta object literal for the '{@link featureObjective.impl.ChildRelationImpl <em>Child Relation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see featureObjective.impl.ChildRelationImpl
		 * @see featureObjective.impl.FeatureObjectivePackageImpl#getChildRelation()
		 * @generated
		 */
		EClass CHILD_RELATION = eINSTANCE.getChildRelation();

		/**
		 * The meta object literal for the '{@link featureObjective.impl.SimpleImpl <em>Simple</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see featureObjective.impl.SimpleImpl
		 * @see featureObjective.impl.FeatureObjectivePackageImpl#getSimple()
		 * @generated
		 */
		EClass SIMPLE = eINSTANCE.getSimple();

		/**
		 * The meta object literal for the '<em><b>Optional Children</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SIMPLE__OPTIONAL_CHILDREN = eINSTANCE.getSimple_OptionalChildren();

		/**
		 * The meta object literal for the '<em><b>Mandatory Children</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SIMPLE__MANDATORY_CHILDREN = eINSTANCE.getSimple_MandatoryChildren();

		/**
		 * The meta object literal for the '{@link featureObjective.impl.FeatureGroupImpl <em>Feature Group</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see featureObjective.impl.FeatureGroupImpl
		 * @see featureObjective.impl.FeatureObjectivePackageImpl#getFeatureGroup()
		 * @generated
		 */
		EClass FEATURE_GROUP = eINSTANCE.getFeatureGroup();

		/**
		 * The meta object literal for the '<em><b>Min</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FEATURE_GROUP__MIN = eINSTANCE.getFeatureGroup_Min();

		/**
		 * The meta object literal for the '<em><b>Max</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FEATURE_GROUP__MAX = eINSTANCE.getFeatureGroup_Max();

		/**
		 * The meta object literal for the '<em><b>Children</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FEATURE_GROUP__CHILDREN = eINSTANCE.getFeatureGroup_Children();

		/**
		 * The meta object literal for the '{@link featureObjective.impl.ConstraintImpl <em>Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see featureObjective.impl.ConstraintImpl
		 * @see featureObjective.impl.FeatureObjectivePackageImpl#getConstraint()
		 * @generated
		 */
		EClass CONSTRAINT = eINSTANCE.getConstraint();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONSTRAINT__SOURCE = eINSTANCE.getConstraint_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONSTRAINT__TARGET = eINSTANCE.getConstraint_Target();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONSTRAINT__DESCRIPTION = eINSTANCE.getConstraint_Description();

		/**
		 * The meta object literal for the '{@link featureObjective.impl.RequiredConstraintImpl <em>Required Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see featureObjective.impl.RequiredConstraintImpl
		 * @see featureObjective.impl.FeatureObjectivePackageImpl#getRequiredConstraint()
		 * @generated
		 */
		EClass REQUIRED_CONSTRAINT = eINSTANCE.getRequiredConstraint();

		/**
		 * The meta object literal for the '{@link featureObjective.impl.ProhibitsConstraintImpl <em>Prohibits Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see featureObjective.impl.ProhibitsConstraintImpl
		 * @see featureObjective.impl.FeatureObjectivePackageImpl#getProhibitsConstraint()
		 * @generated
		 */
		EClass PROHIBITS_CONSTRAINT = eINSTANCE.getProhibitsConstraint();

		/**
		 * The meta object literal for the '{@link featureObjective.impl.IntegerIntervalRangeImpl <em>Integer Interval Range</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see featureObjective.impl.IntegerIntervalRangeImpl
		 * @see featureObjective.impl.FeatureObjectivePackageImpl#getIntegerIntervalRange()
		 * @generated
		 */
		EClass INTEGER_INTERVAL_RANGE = eINSTANCE.getIntegerIntervalRange();

		/**
		 * The meta object literal for the '<em><b>To</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTEGER_INTERVAL_RANGE__TO = eINSTANCE.getIntegerIntervalRange_To();

		/**
		 * The meta object literal for the '<em><b>From</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTEGER_INTERVAL_RANGE__FROM = eINSTANCE.getIntegerIntervalRange_From();

		/**
		 * The meta object literal for the '{@link featureObjective.impl.IntegerAttributeImpl <em>Integer Attribute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see featureObjective.impl.IntegerAttributeImpl
		 * @see featureObjective.impl.FeatureObjectivePackageImpl#getIntegerAttribute()
		 * @generated
		 */
		EClass INTEGER_ATTRIBUTE = eINSTANCE.getIntegerAttribute();

		/**
		 * The meta object literal for the '<em><b>Default Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTEGER_ATTRIBUTE__DEFAULT_VALUE = eINSTANCE.getIntegerAttribute_DefaultValue();

		/**
		 * The meta object literal for the '{@link featureObjective.impl.DoubleAttributeImpl <em>Double Attribute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see featureObjective.impl.DoubleAttributeImpl
		 * @see featureObjective.impl.FeatureObjectivePackageImpl#getDoubleAttribute()
		 * @generated
		 */
		EClass DOUBLE_ATTRIBUTE = eINSTANCE.getDoubleAttribute();

		/**
		 * The meta object literal for the '<em><b>Default Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOUBLE_ATTRIBUTE__DEFAULT_VALUE = eINSTANCE.getDoubleAttribute_DefaultValue();

		/**
		 * The meta object literal for the '{@link featureObjective.impl.StringAttributeImpl <em>String Attribute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see featureObjective.impl.StringAttributeImpl
		 * @see featureObjective.impl.FeatureObjectivePackageImpl#getStringAttribute()
		 * @generated
		 */
		EClass STRING_ATTRIBUTE = eINSTANCE.getStringAttribute();

		/**
		 * The meta object literal for the '<em><b>Default Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STRING_ATTRIBUTE__DEFAULT_VALUE = eINSTANCE.getStringAttribute_DefaultValue();

		/**
		 * The meta object literal for the '{@link featureObjective.impl.ExternalObjectAttributeImpl <em>External Object Attribute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see featureObjective.impl.ExternalObjectAttributeImpl
		 * @see featureObjective.impl.FeatureObjectivePackageImpl#getExternalObjectAttribute()
		 * @generated
		 */
		EClass EXTERNAL_OBJECT_ATTRIBUTE = eINSTANCE.getExternalObjectAttribute();

		/**
		 * The meta object literal for the '{@link featureObjective.AttributeTypes <em>Attribute Types</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see featureObjective.AttributeTypes
		 * @see featureObjective.impl.FeatureObjectivePackageImpl#getAttributeTypes()
		 * @generated
		 */
		EEnum ATTRIBUTE_TYPES = eINSTANCE.getAttributeTypes();

	}

} //FeatureObjectivePackage
