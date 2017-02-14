/**
 */
package concernStrategy;

import de.uka.ipd.sdq.identifier.IdentifierPackage;

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
 * @see concernStrategy.StrategymodelFactory
 * @model kind="package"
 * @generated
 */
public interface StrategymodelPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "concernStrategy";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://edu.kit.ipd.are/ConcernStrategyModel/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "concernStrategy";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	StrategymodelPackage eINSTANCE = concernStrategy.impl.StrategymodelPackageImpl.init();

	/**
	 * The meta object id for the '{@link concernStrategy.impl.NamedElementImpl <em>Named Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see concernStrategy.impl.NamedElementImpl
	 * @see concernStrategy.impl.StrategymodelPackageImpl#getNamedElement()
	 * @generated
	 */
	int NAMED_ELEMENT = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT__ID = IdentifierPackage.IDENTIFIER__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT__NAME = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Named Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT_FEATURE_COUNT = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link concernStrategy.impl.FeatureImpl <em>Feature</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see concernStrategy.impl.FeatureImpl
	 * @see concernStrategy.impl.StrategymodelPackageImpl#getFeature()
	 * @generated
	 */
	int FEATURE = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__ID = NAMED_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__ATTRIBUTES = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Childrelation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__CHILDRELATION = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Simple Mandatory</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__SIMPLE_MANDATORY = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Simple Optional</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__SIMPLE_OPTIONAL = NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Featuregroup</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__FEATUREGROUP = NAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Feature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link concernStrategy.impl.AttributeImpl <em>Attribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see concernStrategy.impl.AttributeImpl
	 * @see concernStrategy.impl.StrategymodelPackageImpl#getAttribute()
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
	int ATTRIBUTE__ID = NAMED_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Range</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__RANGE = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link concernStrategy.impl.IntervalRangeImpl <em>Interval Range</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see concernStrategy.impl.IntervalRangeImpl
	 * @see concernStrategy.impl.StrategymodelPackageImpl#getIntervalRange()
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
	 * The meta object id for the '{@link concernStrategy.impl.ChildRelationImpl <em>Child Relation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see concernStrategy.impl.ChildRelationImpl
	 * @see concernStrategy.impl.StrategymodelPackageImpl#getChildRelation()
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
	 * The meta object id for the '{@link concernStrategy.impl.SimpleImpl <em>Simple</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see concernStrategy.impl.SimpleImpl
	 * @see concernStrategy.impl.StrategymodelPackageImpl#getSimple()
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
	 * The meta object id for the '{@link concernStrategy.impl.FeatureGroupImpl <em>Feature Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see concernStrategy.impl.FeatureGroupImpl
	 * @see concernStrategy.impl.StrategymodelPackageImpl#getFeatureGroup()
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
	 * The meta object id for the '{@link concernStrategy.impl.FeatureDiagramImpl <em>Feature Diagram</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see concernStrategy.impl.FeatureDiagramImpl
	 * @see concernStrategy.impl.StrategymodelPackageImpl#getFeatureDiagram()
	 * @generated
	 */
	int FEATURE_DIAGRAM = 7;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_DIAGRAM__ID = NAMED_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_DIAGRAM__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Root Feature</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_DIAGRAM__ROOT_FEATURE = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_DIAGRAM__CONSTRAINTS = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Annotatable Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_DIAGRAM__ANNOTATABLE_ELEMENT = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Feature Diagram</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_DIAGRAM_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link concernStrategy.impl.ConstraintImpl <em>Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see concernStrategy.impl.ConstraintImpl
	 * @see concernStrategy.impl.StrategymodelPackageImpl#getConstraint()
	 * @generated
	 */
	int CONSTRAINT = 8;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT__ID = NAMED_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT__SOURCE = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT__TARGET = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT__DESCRIPTION = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link concernStrategy.impl.RequiredConstraintImpl <em>Required Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see concernStrategy.impl.RequiredConstraintImpl
	 * @see concernStrategy.impl.StrategymodelPackageImpl#getRequiredConstraint()
	 * @generated
	 */
	int REQUIRED_CONSTRAINT = 9;

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
	 * The meta object id for the '{@link concernStrategy.impl.ProhibitsConstraintImpl <em>Prohibits Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see concernStrategy.impl.ProhibitsConstraintImpl
	 * @see concernStrategy.impl.StrategymodelPackageImpl#getProhibitsConstraint()
	 * @generated
	 */
	int PROHIBITS_CONSTRAINT = 10;

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
	 * The meta object id for the '{@link concernStrategy.impl.IntegerIntervalRangeImpl <em>Integer Interval Range</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see concernStrategy.impl.IntegerIntervalRangeImpl
	 * @see concernStrategy.impl.StrategymodelPackageImpl#getIntegerIntervalRange()
	 * @generated
	 */
	int INTEGER_INTERVAL_RANGE = 11;

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
	 * The meta object id for the '{@link concernStrategy.impl.ContinousIntervalRangeImpl <em>Continous Interval Range</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see concernStrategy.impl.ContinousIntervalRangeImpl
	 * @see concernStrategy.impl.StrategymodelPackageImpl#getContinousIntervalRange()
	 * @generated
	 */
	int CONTINOUS_INTERVAL_RANGE = 12;

	/**
	 * The feature id for the '<em><b>Lower Bound Included</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTINOUS_INTERVAL_RANGE__LOWER_BOUND_INCLUDED = INTERVAL_RANGE__LOWER_BOUND_INCLUDED;

	/**
	 * The feature id for the '<em><b>Upper Bound Included</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTINOUS_INTERVAL_RANGE__UPPER_BOUND_INCLUDED = INTERVAL_RANGE__UPPER_BOUND_INCLUDED;

	/**
	 * The feature id for the '<em><b>To</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTINOUS_INTERVAL_RANGE__TO = INTERVAL_RANGE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>From</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTINOUS_INTERVAL_RANGE__FROM = INTERVAL_RANGE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Continous Interval Range</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTINOUS_INTERVAL_RANGE_FEATURE_COUNT = INTERVAL_RANGE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link concernStrategy.impl.IntegerAttributeImpl <em>Integer Attribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see concernStrategy.impl.IntegerAttributeImpl
	 * @see concernStrategy.impl.StrategymodelPackageImpl#getIntegerAttribute()
	 * @generated
	 */
	int INTEGER_ATTRIBUTE = 13;

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
	 * The meta object id for the '{@link concernStrategy.impl.DoubleAttributeImpl <em>Double Attribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see concernStrategy.impl.DoubleAttributeImpl
	 * @see concernStrategy.impl.StrategymodelPackageImpl#getDoubleAttribute()
	 * @generated
	 */
	int DOUBLE_ATTRIBUTE = 14;

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
	 * The meta object id for the '{@link concernStrategy.impl.StringAttributeImpl <em>String Attribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see concernStrategy.impl.StringAttributeImpl
	 * @see concernStrategy.impl.StrategymodelPackageImpl#getStringAttribute()
	 * @generated
	 */
	int STRING_ATTRIBUTE = 15;

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
	 * The meta object id for the '{@link concernStrategy.impl.ExternalObjectAttributeImpl <em>External Object Attribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see concernStrategy.impl.ExternalObjectAttributeImpl
	 * @see concernStrategy.impl.StrategymodelPackageImpl#getExternalObjectAttribute()
	 * @generated
	 */
	int EXTERNAL_OBJECT_ATTRIBUTE = 16;

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
	 * The meta object id for the '{@link concernStrategy.AttributeTypes <em>Attribute Types</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see concernStrategy.AttributeTypes
	 * @see concernStrategy.impl.StrategymodelPackageImpl#getAttributeTypes()
	 * @generated
	 */
	int ATTRIBUTE_TYPES = 17;


	/**
	 * Returns the meta object for class '{@link concernStrategy.Feature <em>Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Feature</em>'.
	 * @see concernStrategy.Feature
	 * @generated
	 */
	EClass getFeature();

	/**
	 * Returns the meta object for the containment reference list '{@link concernStrategy.Feature#getAttributes <em>Attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Attributes</em>'.
	 * @see concernStrategy.Feature#getAttributes()
	 * @see #getFeature()
	 * @generated
	 */
	EReference getFeature_Attributes();

	/**
	 * Returns the meta object for the containment reference '{@link concernStrategy.Feature#getChildrelation <em>Childrelation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Childrelation</em>'.
	 * @see concernStrategy.Feature#getChildrelation()
	 * @see #getFeature()
	 * @generated
	 */
	EReference getFeature_Childrelation();

	/**
	 * Returns the meta object for the container reference '{@link concernStrategy.Feature#getSimpleMandatory <em>Simple Mandatory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Simple Mandatory</em>'.
	 * @see concernStrategy.Feature#getSimpleMandatory()
	 * @see #getFeature()
	 * @generated
	 */
	EReference getFeature_SimpleMandatory();

	/**
	 * Returns the meta object for the container reference '{@link concernStrategy.Feature#getSimpleOptional <em>Simple Optional</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Simple Optional</em>'.
	 * @see concernStrategy.Feature#getSimpleOptional()
	 * @see #getFeature()
	 * @generated
	 */
	EReference getFeature_SimpleOptional();

	/**
	 * Returns the meta object for the container reference '{@link concernStrategy.Feature#getFeaturegroup <em>Featuregroup</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Featuregroup</em>'.
	 * @see concernStrategy.Feature#getFeaturegroup()
	 * @see #getFeature()
	 * @generated
	 */
	EReference getFeature_Featuregroup();

	/**
	 * Returns the meta object for class '{@link concernStrategy.NamedElement <em>Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Named Element</em>'.
	 * @see concernStrategy.NamedElement
	 * @generated
	 */
	EClass getNamedElement();

	/**
	 * Returns the meta object for the attribute '{@link concernStrategy.NamedElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see concernStrategy.NamedElement#getName()
	 * @see #getNamedElement()
	 * @generated
	 */
	EAttribute getNamedElement_Name();

	/**
	 * Returns the meta object for class '{@link concernStrategy.Attribute <em>Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attribute</em>'.
	 * @see concernStrategy.Attribute
	 * @generated
	 */
	EClass getAttribute();

	/**
	 * Returns the meta object for the containment reference '{@link concernStrategy.Attribute#getRange <em>Range</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Range</em>'.
	 * @see concernStrategy.Attribute#getRange()
	 * @see #getAttribute()
	 * @generated
	 */
	EReference getAttribute_Range();

	/**
	 * Returns the meta object for class '{@link concernStrategy.IntervalRange <em>Interval Range</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Interval Range</em>'.
	 * @see concernStrategy.IntervalRange
	 * @generated
	 */
	EClass getIntervalRange();

	/**
	 * Returns the meta object for the attribute '{@link concernStrategy.IntervalRange#isLowerBoundIncluded <em>Lower Bound Included</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lower Bound Included</em>'.
	 * @see concernStrategy.IntervalRange#isLowerBoundIncluded()
	 * @see #getIntervalRange()
	 * @generated
	 */
	EAttribute getIntervalRange_LowerBoundIncluded();

	/**
	 * Returns the meta object for the attribute '{@link concernStrategy.IntervalRange#isUpperBoundIncluded <em>Upper Bound Included</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Upper Bound Included</em>'.
	 * @see concernStrategy.IntervalRange#isUpperBoundIncluded()
	 * @see #getIntervalRange()
	 * @generated
	 */
	EAttribute getIntervalRange_UpperBoundIncluded();

	/**
	 * Returns the meta object for class '{@link concernStrategy.ChildRelation <em>Child Relation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Child Relation</em>'.
	 * @see concernStrategy.ChildRelation
	 * @generated
	 */
	EClass getChildRelation();

	/**
	 * Returns the meta object for class '{@link concernStrategy.Simple <em>Simple</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Simple</em>'.
	 * @see concernStrategy.Simple
	 * @generated
	 */
	EClass getSimple();

	/**
	 * Returns the meta object for the containment reference list '{@link concernStrategy.Simple#getOptionalChildren <em>Optional Children</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Optional Children</em>'.
	 * @see concernStrategy.Simple#getOptionalChildren()
	 * @see #getSimple()
	 * @generated
	 */
	EReference getSimple_OptionalChildren();

	/**
	 * Returns the meta object for the containment reference list '{@link concernStrategy.Simple#getMandatoryChildren <em>Mandatory Children</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Mandatory Children</em>'.
	 * @see concernStrategy.Simple#getMandatoryChildren()
	 * @see #getSimple()
	 * @generated
	 */
	EReference getSimple_MandatoryChildren();

	/**
	 * Returns the meta object for class '{@link concernStrategy.FeatureGroup <em>Feature Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Feature Group</em>'.
	 * @see concernStrategy.FeatureGroup
	 * @generated
	 */
	EClass getFeatureGroup();

	/**
	 * Returns the meta object for the attribute '{@link concernStrategy.FeatureGroup#getMin <em>Min</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min</em>'.
	 * @see concernStrategy.FeatureGroup#getMin()
	 * @see #getFeatureGroup()
	 * @generated
	 */
	EAttribute getFeatureGroup_Min();

	/**
	 * Returns the meta object for the attribute '{@link concernStrategy.FeatureGroup#getMax <em>Max</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max</em>'.
	 * @see concernStrategy.FeatureGroup#getMax()
	 * @see #getFeatureGroup()
	 * @generated
	 */
	EAttribute getFeatureGroup_Max();

	/**
	 * Returns the meta object for the containment reference list '{@link concernStrategy.FeatureGroup#getChildren <em>Children</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Children</em>'.
	 * @see concernStrategy.FeatureGroup#getChildren()
	 * @see #getFeatureGroup()
	 * @generated
	 */
	EReference getFeatureGroup_Children();

	/**
	 * Returns the meta object for class '{@link concernStrategy.FeatureDiagram <em>Feature Diagram</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Feature Diagram</em>'.
	 * @see concernStrategy.FeatureDiagram
	 * @generated
	 */
	EClass getFeatureDiagram();

	/**
	 * Returns the meta object for the containment reference '{@link concernStrategy.FeatureDiagram#getRootFeature <em>Root Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Root Feature</em>'.
	 * @see concernStrategy.FeatureDiagram#getRootFeature()
	 * @see #getFeatureDiagram()
	 * @generated
	 */
	EReference getFeatureDiagram_RootFeature();

	/**
	 * Returns the meta object for the containment reference list '{@link concernStrategy.FeatureDiagram#getConstraints <em>Constraints</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Constraints</em>'.
	 * @see concernStrategy.FeatureDiagram#getConstraints()
	 * @see #getFeatureDiagram()
	 * @generated
	 */
	EReference getFeatureDiagram_Constraints();

	/**
	 * Returns the meta object for the reference list '{@link concernStrategy.FeatureDiagram#getAnnotatableElement <em>Annotatable Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Annotatable Element</em>'.
	 * @see concernStrategy.FeatureDiagram#getAnnotatableElement()
	 * @see #getFeatureDiagram()
	 * @generated
	 */
	EReference getFeatureDiagram_AnnotatableElement();

	/**
	 * Returns the meta object for class '{@link concernStrategy.Constraint <em>Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Constraint</em>'.
	 * @see concernStrategy.Constraint
	 * @generated
	 */
	EClass getConstraint();

	/**
	 * Returns the meta object for the reference '{@link concernStrategy.Constraint#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see concernStrategy.Constraint#getSource()
	 * @see #getConstraint()
	 * @generated
	 */
	EReference getConstraint_Source();

	/**
	 * Returns the meta object for the reference list '{@link concernStrategy.Constraint#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Target</em>'.
	 * @see concernStrategy.Constraint#getTarget()
	 * @see #getConstraint()
	 * @generated
	 */
	EReference getConstraint_Target();

	/**
	 * Returns the meta object for the attribute '{@link concernStrategy.Constraint#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see concernStrategy.Constraint#getDescription()
	 * @see #getConstraint()
	 * @generated
	 */
	EAttribute getConstraint_Description();

	/**
	 * Returns the meta object for class '{@link concernStrategy.RequiredConstraint <em>Required Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Required Constraint</em>'.
	 * @see concernStrategy.RequiredConstraint
	 * @generated
	 */
	EClass getRequiredConstraint();

	/**
	 * Returns the meta object for class '{@link concernStrategy.ProhibitsConstraint <em>Prohibits Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Prohibits Constraint</em>'.
	 * @see concernStrategy.ProhibitsConstraint
	 * @generated
	 */
	EClass getProhibitsConstraint();

	/**
	 * Returns the meta object for class '{@link concernStrategy.IntegerIntervalRange <em>Integer Interval Range</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Integer Interval Range</em>'.
	 * @see concernStrategy.IntegerIntervalRange
	 * @generated
	 */
	EClass getIntegerIntervalRange();

	/**
	 * Returns the meta object for the attribute '{@link concernStrategy.IntegerIntervalRange#getTo <em>To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>To</em>'.
	 * @see concernStrategy.IntegerIntervalRange#getTo()
	 * @see #getIntegerIntervalRange()
	 * @generated
	 */
	EAttribute getIntegerIntervalRange_To();

	/**
	 * Returns the meta object for the attribute '{@link concernStrategy.IntegerIntervalRange#getFrom <em>From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>From</em>'.
	 * @see concernStrategy.IntegerIntervalRange#getFrom()
	 * @see #getIntegerIntervalRange()
	 * @generated
	 */
	EAttribute getIntegerIntervalRange_From();

	/**
	 * Returns the meta object for class '{@link concernStrategy.ContinousIntervalRange <em>Continous Interval Range</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Continous Interval Range</em>'.
	 * @see concernStrategy.ContinousIntervalRange
	 * @generated
	 */
	EClass getContinousIntervalRange();

	/**
	 * Returns the meta object for the attribute '{@link concernStrategy.ContinousIntervalRange#getTo <em>To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>To</em>'.
	 * @see concernStrategy.ContinousIntervalRange#getTo()
	 * @see #getContinousIntervalRange()
	 * @generated
	 */
	EAttribute getContinousIntervalRange_To();

	/**
	 * Returns the meta object for the attribute '{@link concernStrategy.ContinousIntervalRange#getFrom <em>From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>From</em>'.
	 * @see concernStrategy.ContinousIntervalRange#getFrom()
	 * @see #getContinousIntervalRange()
	 * @generated
	 */
	EAttribute getContinousIntervalRange_From();

	/**
	 * Returns the meta object for class '{@link concernStrategy.IntegerAttribute <em>Integer Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Integer Attribute</em>'.
	 * @see concernStrategy.IntegerAttribute
	 * @generated
	 */
	EClass getIntegerAttribute();

	/**
	 * Returns the meta object for the attribute '{@link concernStrategy.IntegerAttribute#getDefaultValue <em>Default Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Default Value</em>'.
	 * @see concernStrategy.IntegerAttribute#getDefaultValue()
	 * @see #getIntegerAttribute()
	 * @generated
	 */
	EAttribute getIntegerAttribute_DefaultValue();

	/**
	 * Returns the meta object for class '{@link concernStrategy.DoubleAttribute <em>Double Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Double Attribute</em>'.
	 * @see concernStrategy.DoubleAttribute
	 * @generated
	 */
	EClass getDoubleAttribute();

	/**
	 * Returns the meta object for the attribute '{@link concernStrategy.DoubleAttribute#getDefaultValue <em>Default Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Default Value</em>'.
	 * @see concernStrategy.DoubleAttribute#getDefaultValue()
	 * @see #getDoubleAttribute()
	 * @generated
	 */
	EAttribute getDoubleAttribute_DefaultValue();

	/**
	 * Returns the meta object for class '{@link concernStrategy.StringAttribute <em>String Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>String Attribute</em>'.
	 * @see concernStrategy.StringAttribute
	 * @generated
	 */
	EClass getStringAttribute();

	/**
	 * Returns the meta object for the attribute '{@link concernStrategy.StringAttribute#getDefaultValue <em>Default Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Default Value</em>'.
	 * @see concernStrategy.StringAttribute#getDefaultValue()
	 * @see #getStringAttribute()
	 * @generated
	 */
	EAttribute getStringAttribute_DefaultValue();

	/**
	 * Returns the meta object for class '{@link concernStrategy.ExternalObjectAttribute <em>External Object Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>External Object Attribute</em>'.
	 * @see concernStrategy.ExternalObjectAttribute
	 * @generated
	 */
	EClass getExternalObjectAttribute();

	/**
	 * Returns the meta object for enum '{@link concernStrategy.AttributeTypes <em>Attribute Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Attribute Types</em>'.
	 * @see concernStrategy.AttributeTypes
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
	StrategymodelFactory getStrategymodelFactory();

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
		 * The meta object literal for the '{@link concernStrategy.impl.FeatureImpl <em>Feature</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see concernStrategy.impl.FeatureImpl
		 * @see concernStrategy.impl.StrategymodelPackageImpl#getFeature()
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
		 * The meta object literal for the '<em><b>Simple Mandatory</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FEATURE__SIMPLE_MANDATORY = eINSTANCE.getFeature_SimpleMandatory();

		/**
		 * The meta object literal for the '<em><b>Simple Optional</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FEATURE__SIMPLE_OPTIONAL = eINSTANCE.getFeature_SimpleOptional();

		/**
		 * The meta object literal for the '<em><b>Featuregroup</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FEATURE__FEATUREGROUP = eINSTANCE.getFeature_Featuregroup();

		/**
		 * The meta object literal for the '{@link concernStrategy.impl.NamedElementImpl <em>Named Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see concernStrategy.impl.NamedElementImpl
		 * @see concernStrategy.impl.StrategymodelPackageImpl#getNamedElement()
		 * @generated
		 */
		EClass NAMED_ELEMENT = eINSTANCE.getNamedElement();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAMED_ELEMENT__NAME = eINSTANCE.getNamedElement_Name();

		/**
		 * The meta object literal for the '{@link concernStrategy.impl.AttributeImpl <em>Attribute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see concernStrategy.impl.AttributeImpl
		 * @see concernStrategy.impl.StrategymodelPackageImpl#getAttribute()
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
		 * The meta object literal for the '{@link concernStrategy.impl.IntervalRangeImpl <em>Interval Range</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see concernStrategy.impl.IntervalRangeImpl
		 * @see concernStrategy.impl.StrategymodelPackageImpl#getIntervalRange()
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
		 * The meta object literal for the '{@link concernStrategy.impl.ChildRelationImpl <em>Child Relation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see concernStrategy.impl.ChildRelationImpl
		 * @see concernStrategy.impl.StrategymodelPackageImpl#getChildRelation()
		 * @generated
		 */
		EClass CHILD_RELATION = eINSTANCE.getChildRelation();

		/**
		 * The meta object literal for the '{@link concernStrategy.impl.SimpleImpl <em>Simple</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see concernStrategy.impl.SimpleImpl
		 * @see concernStrategy.impl.StrategymodelPackageImpl#getSimple()
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
		 * The meta object literal for the '{@link concernStrategy.impl.FeatureGroupImpl <em>Feature Group</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see concernStrategy.impl.FeatureGroupImpl
		 * @see concernStrategy.impl.StrategymodelPackageImpl#getFeatureGroup()
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
		 * The meta object literal for the '{@link concernStrategy.impl.FeatureDiagramImpl <em>Feature Diagram</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see concernStrategy.impl.FeatureDiagramImpl
		 * @see concernStrategy.impl.StrategymodelPackageImpl#getFeatureDiagram()
		 * @generated
		 */
		EClass FEATURE_DIAGRAM = eINSTANCE.getFeatureDiagram();

		/**
		 * The meta object literal for the '<em><b>Root Feature</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FEATURE_DIAGRAM__ROOT_FEATURE = eINSTANCE.getFeatureDiagram_RootFeature();

		/**
		 * The meta object literal for the '<em><b>Constraints</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FEATURE_DIAGRAM__CONSTRAINTS = eINSTANCE.getFeatureDiagram_Constraints();

		/**
		 * The meta object literal for the '<em><b>Annotatable Element</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FEATURE_DIAGRAM__ANNOTATABLE_ELEMENT = eINSTANCE.getFeatureDiagram_AnnotatableElement();

		/**
		 * The meta object literal for the '{@link concernStrategy.impl.ConstraintImpl <em>Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see concernStrategy.impl.ConstraintImpl
		 * @see concernStrategy.impl.StrategymodelPackageImpl#getConstraint()
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
		 * The meta object literal for the '{@link concernStrategy.impl.RequiredConstraintImpl <em>Required Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see concernStrategy.impl.RequiredConstraintImpl
		 * @see concernStrategy.impl.StrategymodelPackageImpl#getRequiredConstraint()
		 * @generated
		 */
		EClass REQUIRED_CONSTRAINT = eINSTANCE.getRequiredConstraint();

		/**
		 * The meta object literal for the '{@link concernStrategy.impl.ProhibitsConstraintImpl <em>Prohibits Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see concernStrategy.impl.ProhibitsConstraintImpl
		 * @see concernStrategy.impl.StrategymodelPackageImpl#getProhibitsConstraint()
		 * @generated
		 */
		EClass PROHIBITS_CONSTRAINT = eINSTANCE.getProhibitsConstraint();

		/**
		 * The meta object literal for the '{@link concernStrategy.impl.IntegerIntervalRangeImpl <em>Integer Interval Range</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see concernStrategy.impl.IntegerIntervalRangeImpl
		 * @see concernStrategy.impl.StrategymodelPackageImpl#getIntegerIntervalRange()
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
		 * The meta object literal for the '{@link concernStrategy.impl.ContinousIntervalRangeImpl <em>Continous Interval Range</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see concernStrategy.impl.ContinousIntervalRangeImpl
		 * @see concernStrategy.impl.StrategymodelPackageImpl#getContinousIntervalRange()
		 * @generated
		 */
		EClass CONTINOUS_INTERVAL_RANGE = eINSTANCE.getContinousIntervalRange();

		/**
		 * The meta object literal for the '<em><b>To</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTINOUS_INTERVAL_RANGE__TO = eINSTANCE.getContinousIntervalRange_To();

		/**
		 * The meta object literal for the '<em><b>From</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTINOUS_INTERVAL_RANGE__FROM = eINSTANCE.getContinousIntervalRange_From();

		/**
		 * The meta object literal for the '{@link concernStrategy.impl.IntegerAttributeImpl <em>Integer Attribute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see concernStrategy.impl.IntegerAttributeImpl
		 * @see concernStrategy.impl.StrategymodelPackageImpl#getIntegerAttribute()
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
		 * The meta object literal for the '{@link concernStrategy.impl.DoubleAttributeImpl <em>Double Attribute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see concernStrategy.impl.DoubleAttributeImpl
		 * @see concernStrategy.impl.StrategymodelPackageImpl#getDoubleAttribute()
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
		 * The meta object literal for the '{@link concernStrategy.impl.StringAttributeImpl <em>String Attribute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see concernStrategy.impl.StringAttributeImpl
		 * @see concernStrategy.impl.StrategymodelPackageImpl#getStringAttribute()
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
		 * The meta object literal for the '{@link concernStrategy.impl.ExternalObjectAttributeImpl <em>External Object Attribute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see concernStrategy.impl.ExternalObjectAttributeImpl
		 * @see concernStrategy.impl.StrategymodelPackageImpl#getExternalObjectAttribute()
		 * @generated
		 */
		EClass EXTERNAL_OBJECT_ATTRIBUTE = eINSTANCE.getExternalObjectAttribute();

		/**
		 * The meta object literal for the '{@link concernStrategy.AttributeTypes <em>Attribute Types</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see concernStrategy.AttributeTypes
		 * @see concernStrategy.impl.StrategymodelPackageImpl#getAttributeTypes()
		 * @generated
		 */
		EEnum ATTRIBUTE_TYPES = eINSTANCE.getAttributeTypes();

	}

} //StrategymodelPackage
