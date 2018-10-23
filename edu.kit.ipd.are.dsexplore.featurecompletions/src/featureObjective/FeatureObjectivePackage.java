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
	 * The feature id for the '<em><b>Feature Groups</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_OBJECTIVE__FEATURE_GROUPS = FeatureCompletionPackage.DESCRIBED_ELEMENT_FEATURE_COUNT + 0;

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
	 * The feature id for the '<em><b>Featuregroup</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__FEATUREGROUP = FeatureCompletionPackage.NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Feature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_FEATURE_COUNT = FeatureCompletionPackage.NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link featureObjective.impl.FeatureGroupImpl <em>Feature Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see featureObjective.impl.FeatureGroupImpl
	 * @see featureObjective.impl.FeatureObjectivePackageImpl#getFeatureGroup()
	 * @generated
	 */
	int FEATURE_GROUP = 2;

	/**
	 * The feature id for the '<em><b>Features</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_GROUP__FEATURES = 0;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_GROUP__OPERATION = 1;

	/**
	 * The number of structural features of the '<em>Feature Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_GROUP_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link featureObjective.impl.ConstraintImpl <em>Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see featureObjective.impl.ConstraintImpl
	 * @see featureObjective.impl.FeatureObjectivePackageImpl#getConstraint()
	 * @generated
	 */
	int CONSTRAINT = 3;

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
	int REQUIRED_CONSTRAINT = 4;

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
	int PROHIBITS_CONSTRAINT = 5;

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
	 * The meta object id for the '{@link featureObjective.AttributeTypes <em>Attribute Types</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see featureObjective.AttributeTypes
	 * @see featureObjective.impl.FeatureObjectivePackageImpl#getAttributeTypes()
	 * @generated
	 */
	int ATTRIBUTE_TYPES = 6;

	/**
	 * The meta object id for the '{@link featureObjective.LogicalOperation <em>Logical Operation</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see featureObjective.LogicalOperation
	 * @see featureObjective.impl.FeatureObjectivePackageImpl#getLogicalOperation()
	 * @generated
	 */
	int LOGICAL_OPERATION = 7;


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
	 * Returns the meta object for the containment reference list '{@link featureObjective.FeatureObjective#getFeatureGroups <em>Feature Groups</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Feature Groups</em>'.
	 * @see featureObjective.FeatureObjective#getFeatureGroups()
	 * @see #getFeatureObjective()
	 * @generated
	 */
	EReference getFeatureObjective_FeatureGroups();

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
	 * Returns the meta object for class '{@link featureObjective.FeatureGroup <em>Feature Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Feature Group</em>'.
	 * @see featureObjective.FeatureGroup
	 * @generated
	 */
	EClass getFeatureGroup();

	/**
	 * Returns the meta object for the containment reference list '{@link featureObjective.FeatureGroup#getFeatures <em>Features</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Features</em>'.
	 * @see featureObjective.FeatureGroup#getFeatures()
	 * @see #getFeatureGroup()
	 * @generated
	 */
	EReference getFeatureGroup_Features();

	/**
	 * Returns the meta object for the attribute '{@link featureObjective.FeatureGroup#getOperation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operation</em>'.
	 * @see featureObjective.FeatureGroup#getOperation()
	 * @see #getFeatureGroup()
	 * @generated
	 */
	EAttribute getFeatureGroup_Operation();

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
	 * Returns the meta object for enum '{@link featureObjective.AttributeTypes <em>Attribute Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Attribute Types</em>'.
	 * @see featureObjective.AttributeTypes
	 * @generated
	 */
	EEnum getAttributeTypes();

	/**
	 * Returns the meta object for enum '{@link featureObjective.LogicalOperation <em>Logical Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Logical Operation</em>'.
	 * @see featureObjective.LogicalOperation
	 * @generated
	 */
	EEnum getLogicalOperation();

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
		 * The meta object literal for the '<em><b>Feature Groups</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FEATURE_OBJECTIVE__FEATURE_GROUPS = eINSTANCE.getFeatureObjective_FeatureGroups();

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
		 * The meta object literal for the '<em><b>Featuregroup</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FEATURE__FEATUREGROUP = eINSTANCE.getFeature_Featuregroup();

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
		 * The meta object literal for the '<em><b>Features</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FEATURE_GROUP__FEATURES = eINSTANCE.getFeatureGroup_Features();

		/**
		 * The meta object literal for the '<em><b>Operation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FEATURE_GROUP__OPERATION = eINSTANCE.getFeatureGroup_Operation();

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
		 * The meta object literal for the '{@link featureObjective.AttributeTypes <em>Attribute Types</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see featureObjective.AttributeTypes
		 * @see featureObjective.impl.FeatureObjectivePackageImpl#getAttributeTypes()
		 * @generated
		 */
		EEnum ATTRIBUTE_TYPES = eINSTANCE.getAttributeTypes();

		/**
		 * The meta object literal for the '{@link featureObjective.LogicalOperation <em>Logical Operation</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see featureObjective.LogicalOperation
		 * @see featureObjective.impl.FeatureObjectivePackageImpl#getLogicalOperation()
		 * @generated
		 */
		EEnum LOGICAL_OPERATION = eINSTANCE.getLogicalOperation();

	}

} //FeatureObjectivePackage
