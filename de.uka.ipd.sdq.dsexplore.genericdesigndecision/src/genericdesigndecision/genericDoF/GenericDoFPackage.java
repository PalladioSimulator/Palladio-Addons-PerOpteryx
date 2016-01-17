/**
 */
package genericdesigndecision.genericDoF;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

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
 * @see genericdesigndecision.genericDoF.GenericDoFFactory
 * @model kind="package"
 * @generated
 */
public interface GenericDoFPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "genericDoF";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://sdq.ipd.uka.de/GenericDesignDecision/GenericDoF/";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "genericDoF";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	GenericDoFPackage eINSTANCE = genericdesigndecision.genericDoF.impl.GenericDoFPackageImpl.init();

	/**
	 * The meta object id for the '{@link genericdesigndecision.genericDoF.impl.ChangeableElementDescriptionImpl <em>Changeable Element Description</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see genericdesigndecision.genericDoF.impl.ChangeableElementDescriptionImpl
	 * @see genericdesigndecision.genericDoF.impl.GenericDoFPackageImpl#getChangeableElementDescription()
	 * @generated
	 */
	int CHANGEABLE_ELEMENT_DESCRIPTION = 0;

	/**
	 * The feature id for the '<em><b>Changeable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGEABLE_ELEMENT_DESCRIPTION__CHANGEABLE = 0;

	/**
	 * The feature id for the '<em><b>Value Rule</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGEABLE_ELEMENT_DESCRIPTION__VALUE_RULE = 1;

	/**
	 * The feature id for the '<em><b>Selection Rule</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGEABLE_ELEMENT_DESCRIPTION__SELECTION_RULE = 2;

	/**
	 * The number of structural features of the '<em>Changeable Element Description</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGEABLE_ELEMENT_DESCRIPTION_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Changeable Element Description</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGEABLE_ELEMENT_DESCRIPTION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link genericdesigndecision.genericDoF.impl.OCLRuleImpl <em>OCL Rule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see genericdesigndecision.genericDoF.impl.OCLRuleImpl
	 * @see genericdesigndecision.genericDoF.impl.GenericDoFPackageImpl#getOCLRule()
	 * @generated
	 */
	int OCL_RULE = 2;

	/**
	 * The feature id for the '<em><b>Main Ocl Query</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_RULE__MAIN_OCL_QUERY = 0;

	/**
	 * The feature id for the '<em><b>Helper Definition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_RULE__HELPER_DEFINITION = 1;

	/**
	 * The number of structural features of the '<em>OCL Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_RULE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>OCL Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_RULE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link genericdesigndecision.genericDoF.impl.ValueRuleImpl <em>Value Rule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see genericdesigndecision.genericDoF.impl.ValueRuleImpl
	 * @see genericdesigndecision.genericDoF.impl.GenericDoFPackageImpl#getValueRule()
	 * @generated
	 */
	int VALUE_RULE = 1;

	/**
	 * The feature id for the '<em><b>Main Ocl Query</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_RULE__MAIN_OCL_QUERY = OCL_RULE__MAIN_OCL_QUERY;

	/**
	 * The feature id for the '<em><b>Helper Definition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_RULE__HELPER_DEFINITION = OCL_RULE__HELPER_DEFINITION;

	/**
	 * The number of structural features of the '<em>Value Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_RULE_FEATURE_COUNT = OCL_RULE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Value Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_RULE_OPERATION_COUNT = OCL_RULE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link genericdesigndecision.genericDoF.impl.HelperOCLDefinitionImpl <em>Helper OCL Definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see genericdesigndecision.genericDoF.impl.HelperOCLDefinitionImpl
	 * @see genericdesigndecision.genericDoF.impl.GenericDoFPackageImpl#getHelperOCLDefinition()
	 * @generated
	 */
	int HELPER_OCL_DEFINITION = 3;

	/**
	 * The feature id for the '<em><b>Main Ocl Query</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HELPER_OCL_DEFINITION__MAIN_OCL_QUERY = OCL_RULE__MAIN_OCL_QUERY;

	/**
	 * The feature id for the '<em><b>Helper Definition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HELPER_OCL_DEFINITION__HELPER_DEFINITION = OCL_RULE__HELPER_DEFINITION;

	/**
	 * The feature id for the '<em><b>Context Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HELPER_OCL_DEFINITION__CONTEXT_CLASS = OCL_RULE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Helper OCL Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HELPER_OCL_DEFINITION_FEATURE_COUNT = OCL_RULE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Helper OCL Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HELPER_OCL_DEFINITION_OPERATION_COUNT = OCL_RULE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link genericdesigndecision.genericDoF.impl.StaticContextRuleImpl <em>Static Context Rule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see genericdesigndecision.genericDoF.impl.StaticContextRuleImpl
	 * @see genericdesigndecision.genericDoF.impl.GenericDoFPackageImpl#getStaticContextRule()
	 * @generated
	 */
	int STATIC_CONTEXT_RULE = 4;

	/**
	 * The feature id for the '<em><b>Context Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIC_CONTEXT_RULE__CONTEXT_CLASS = 0;

	/**
	 * The number of structural features of the '<em>Static Context Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIC_CONTEXT_RULE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Static Context Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIC_CONTEXT_RULE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link genericdesigndecision.genericDoF.impl.SelectionRuleImpl <em>Selection Rule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see genericdesigndecision.genericDoF.impl.SelectionRuleImpl
	 * @see genericdesigndecision.genericDoF.impl.GenericDoFPackageImpl#getSelectionRule()
	 * @generated
	 */
	int SELECTION_RULE = 5;

	/**
	 * The feature id for the '<em><b>Main Ocl Query</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECTION_RULE__MAIN_OCL_QUERY = OCL_RULE__MAIN_OCL_QUERY;

	/**
	 * The feature id for the '<em><b>Helper Definition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECTION_RULE__HELPER_DEFINITION = OCL_RULE__HELPER_DEFINITION;

	/**
	 * The number of structural features of the '<em>Selection Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECTION_RULE_FEATURE_COUNT = OCL_RULE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Selection Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECTION_RULE_OPERATION_COUNT = OCL_RULE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link genericdesigndecision.genericDoF.impl.DoFRepositoryImpl <em>Do FRepository</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see genericdesigndecision.genericDoF.impl.DoFRepositoryImpl
	 * @see genericdesigndecision.genericDoF.impl.GenericDoFPackageImpl#getDoFRepository()
	 * @generated
	 */
	int DO_FREPOSITORY = 6;

	/**
	 * The feature id for the '<em><b>Sdofs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DO_FREPOSITORY__SDOFS = 0;

	/**
	 * The number of structural features of the '<em>Do FRepository</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DO_FREPOSITORY_FEATURE_COUNT = 1;

	/**
	 * The operation id for the '<em>Delete SDo F</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DO_FREPOSITORY___DELETE_SDO_F__SPECIFICDOF = 0;

	/**
	 * The operation id for the '<em>Get SDo F</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DO_FREPOSITORY___GET_SDO_F__STRING = 1;

	/**
	 * The number of operations of the '<em>Do FRepository</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DO_FREPOSITORY_OPERATION_COUNT = 2;

	/**
	 * The meta object id for the '{@link genericdesigndecision.genericDoF.impl.InstanceSelectionRuleImpl <em>Instance Selection Rule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see genericdesigndecision.genericDoF.impl.InstanceSelectionRuleImpl
	 * @see genericdesigndecision.genericDoF.impl.GenericDoFPackageImpl#getInstanceSelectionRule()
	 * @generated
	 */
	int INSTANCE_SELECTION_RULE = 7;

	/**
	 * The feature id for the '<em><b>Main Ocl Query</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_SELECTION_RULE__MAIN_OCL_QUERY = SELECTION_RULE__MAIN_OCL_QUERY;

	/**
	 * The feature id for the '<em><b>Helper Definition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_SELECTION_RULE__HELPER_DEFINITION = SELECTION_RULE__HELPER_DEFINITION;

	/**
	 * The feature id for the '<em><b>Context Instance</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_SELECTION_RULE__CONTEXT_INSTANCE = SELECTION_RULE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Instance Selection Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_SELECTION_RULE_FEATURE_COUNT = SELECTION_RULE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Instance Selection Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_SELECTION_RULE_OPERATION_COUNT = SELECTION_RULE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link genericdesigndecision.genericDoF.impl.StaticSelectionRuleImpl <em>Static Selection Rule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see genericdesigndecision.genericDoF.impl.StaticSelectionRuleImpl
	 * @see genericdesigndecision.genericDoF.impl.GenericDoFPackageImpl#getStaticSelectionRule()
	 * @generated
	 */
	int STATIC_SELECTION_RULE = 8;

	/**
	 * The feature id for the '<em><b>Main Ocl Query</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIC_SELECTION_RULE__MAIN_OCL_QUERY = SELECTION_RULE__MAIN_OCL_QUERY;

	/**
	 * The feature id for the '<em><b>Helper Definition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIC_SELECTION_RULE__HELPER_DEFINITION = SELECTION_RULE__HELPER_DEFINITION;

	/**
	 * The feature id for the '<em><b>Context Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIC_SELECTION_RULE__CONTEXT_CLASS = SELECTION_RULE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Static Selection Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIC_SELECTION_RULE_FEATURE_COUNT = SELECTION_RULE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Static Selection Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIC_SELECTION_RULE_OPERATION_COUNT = SELECTION_RULE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link genericdesigndecision.genericDoF.impl.ADegreeOfFreedomImpl <em>ADegree Of Freedom</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see genericdesigndecision.genericDoF.impl.ADegreeOfFreedomImpl
	 * @see genericdesigndecision.genericDoF.impl.GenericDoFPackageImpl#getADegreeOfFreedom()
	 * @generated
	 */
	int ADEGREE_OF_FREEDOM = 9;

	/**
	 * The feature id for the '<em><b>Added Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADEGREE_OF_FREEDOM__ADDED_ELEMENTS = 0;

	/**
	 * The feature id for the '<em><b>Changeable Element Descriptions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADEGREE_OF_FREEDOM__CHANGEABLE_ELEMENT_DESCRIPTIONS = 1;

	/**
	 * The feature id for the '<em><b>Interaction Constraints</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADEGREE_OF_FREEDOM__INTERACTION_CONSTRAINTS = 2;

	/**
	 * The feature id for the '<em><b>Primary Changeable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADEGREE_OF_FREEDOM__PRIMARY_CHANGEABLE = 3;

	/**
	 * The feature id for the '<em><b>Primary Changed</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADEGREE_OF_FREEDOM__PRIMARY_CHANGED = 4;

	/**
	 * The feature id for the '<em><b>Changeable Elements</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADEGREE_OF_FREEDOM__CHANGEABLE_ELEMENTS = 5;

	/**
	 * The number of structural features of the '<em>ADegree Of Freedom</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADEGREE_OF_FREEDOM_FEATURE_COUNT = 6;

	/**
	 * The operation id for the '<em>Create Random Choice</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADEGREE_OF_FREEDOM___CREATE_RANDOM_CHOICE = 0;

	/**
	 * The operation id for the '<em>Determine Initial Choice</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADEGREE_OF_FREEDOM___DETERMINE_INITIAL_CHOICE = 1;

	/**
	 * The operation id for the '<em>Create Choice</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADEGREE_OF_FREEDOM___CREATE_CHOICE = 2;

	/**
	 * The number of operations of the '<em>ADegree Of Freedom</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADEGREE_OF_FREEDOM_OPERATION_COUNT = 3;

	/**
	 * The meta object id for the '{@link genericdesigndecision.genericDoF.impl.AClassDegreeImpl <em>AClass Degree</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see genericdesigndecision.genericDoF.impl.AClassDegreeImpl
	 * @see genericdesigndecision.genericDoF.impl.GenericDoFPackageImpl#getAClassDegree()
	 * @generated
	 */
	int ACLASS_DEGREE = 11;

	/**
	 * The feature id for the '<em><b>Added Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACLASS_DEGREE__ADDED_ELEMENTS = ADEGREE_OF_FREEDOM__ADDED_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Changeable Element Descriptions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACLASS_DEGREE__CHANGEABLE_ELEMENT_DESCRIPTIONS = ADEGREE_OF_FREEDOM__CHANGEABLE_ELEMENT_DESCRIPTIONS;

	/**
	 * The feature id for the '<em><b>Interaction Constraints</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACLASS_DEGREE__INTERACTION_CONSTRAINTS = ADEGREE_OF_FREEDOM__INTERACTION_CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Primary Changeable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACLASS_DEGREE__PRIMARY_CHANGEABLE = ADEGREE_OF_FREEDOM__PRIMARY_CHANGEABLE;

	/**
	 * The feature id for the '<em><b>Primary Changed</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACLASS_DEGREE__PRIMARY_CHANGED = ADEGREE_OF_FREEDOM__PRIMARY_CHANGED;

	/**
	 * The feature id for the '<em><b>Changeable Elements</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACLASS_DEGREE__CHANGEABLE_ELEMENTS = ADEGREE_OF_FREEDOM__CHANGEABLE_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Class Design Options</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACLASS_DEGREE__CLASS_DESIGN_OPTIONS = ADEGREE_OF_FREEDOM_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>AClass Degree</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACLASS_DEGREE_FEATURE_COUNT = ADEGREE_OF_FREEDOM_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Determine Initial Choice</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACLASS_DEGREE___DETERMINE_INITIAL_CHOICE = ADEGREE_OF_FREEDOM___DETERMINE_INITIAL_CHOICE;

	/**
	 * The operation id for the '<em>Create Choice</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACLASS_DEGREE___CREATE_CHOICE = ADEGREE_OF_FREEDOM___CREATE_CHOICE;

	/**
	 * The operation id for the '<em>Create Random Choice</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACLASS_DEGREE___CREATE_RANDOM_CHOICE = ADEGREE_OF_FREEDOM_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>AClass Degree</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACLASS_DEGREE_OPERATION_COUNT = ADEGREE_OF_FREEDOM_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link genericdesigndecision.genericDoF.impl.AClassAsReferenceDegreeImpl <em>AClass As Reference Degree</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see genericdesigndecision.genericDoF.impl.AClassAsReferenceDegreeImpl
	 * @see genericdesigndecision.genericDoF.impl.GenericDoFPackageImpl#getAClassAsReferenceDegree()
	 * @generated
	 */
	int ACLASS_AS_REFERENCE_DEGREE = 10;

	/**
	 * The feature id for the '<em><b>Added Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACLASS_AS_REFERENCE_DEGREE__ADDED_ELEMENTS = ACLASS_DEGREE__ADDED_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Changeable Element Descriptions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACLASS_AS_REFERENCE_DEGREE__CHANGEABLE_ELEMENT_DESCRIPTIONS = ACLASS_DEGREE__CHANGEABLE_ELEMENT_DESCRIPTIONS;

	/**
	 * The feature id for the '<em><b>Interaction Constraints</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACLASS_AS_REFERENCE_DEGREE__INTERACTION_CONSTRAINTS = ACLASS_DEGREE__INTERACTION_CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Primary Changeable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACLASS_AS_REFERENCE_DEGREE__PRIMARY_CHANGEABLE = ACLASS_DEGREE__PRIMARY_CHANGEABLE;

	/**
	 * The feature id for the '<em><b>Primary Changed</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACLASS_AS_REFERENCE_DEGREE__PRIMARY_CHANGED = ACLASS_DEGREE__PRIMARY_CHANGED;

	/**
	 * The feature id for the '<em><b>Changeable Elements</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACLASS_AS_REFERENCE_DEGREE__CHANGEABLE_ELEMENTS = ACLASS_DEGREE__CHANGEABLE_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Class Design Options</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACLASS_AS_REFERENCE_DEGREE__CLASS_DESIGN_OPTIONS = ACLASS_DEGREE__CLASS_DESIGN_OPTIONS;

	/**
	 * The number of structural features of the '<em>AClass As Reference Degree</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACLASS_AS_REFERENCE_DEGREE_FEATURE_COUNT = ACLASS_DEGREE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Determine Initial Choice</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACLASS_AS_REFERENCE_DEGREE___DETERMINE_INITIAL_CHOICE = ACLASS_DEGREE___DETERMINE_INITIAL_CHOICE;

	/**
	 * The operation id for the '<em>Create Choice</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACLASS_AS_REFERENCE_DEGREE___CREATE_CHOICE = ACLASS_DEGREE___CREATE_CHOICE;

	/**
	 * The operation id for the '<em>Create Random Choice</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACLASS_AS_REFERENCE_DEGREE___CREATE_RANDOM_CHOICE = ACLASS_DEGREE___CREATE_RANDOM_CHOICE;

	/**
	 * The number of operations of the '<em>AClass As Reference Degree</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACLASS_AS_REFERENCE_DEGREE_OPERATION_COUNT = ACLASS_DEGREE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link genericdesigndecision.genericDoF.impl.AClassWithCopyDegreeImpl <em>AClass With Copy Degree</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see genericdesigndecision.genericDoF.impl.AClassWithCopyDegreeImpl
	 * @see genericdesigndecision.genericDoF.impl.GenericDoFPackageImpl#getAClassWithCopyDegree()
	 * @generated
	 */
	int ACLASS_WITH_COPY_DEGREE = 12;

	/**
	 * The feature id for the '<em><b>Added Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACLASS_WITH_COPY_DEGREE__ADDED_ELEMENTS = ACLASS_DEGREE__ADDED_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Changeable Element Descriptions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACLASS_WITH_COPY_DEGREE__CHANGEABLE_ELEMENT_DESCRIPTIONS = ACLASS_DEGREE__CHANGEABLE_ELEMENT_DESCRIPTIONS;

	/**
	 * The feature id for the '<em><b>Interaction Constraints</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACLASS_WITH_COPY_DEGREE__INTERACTION_CONSTRAINTS = ACLASS_DEGREE__INTERACTION_CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Primary Changeable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACLASS_WITH_COPY_DEGREE__PRIMARY_CHANGEABLE = ACLASS_DEGREE__PRIMARY_CHANGEABLE;

	/**
	 * The feature id for the '<em><b>Primary Changed</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACLASS_WITH_COPY_DEGREE__PRIMARY_CHANGED = ACLASS_DEGREE__PRIMARY_CHANGED;

	/**
	 * The feature id for the '<em><b>Changeable Elements</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACLASS_WITH_COPY_DEGREE__CHANGEABLE_ELEMENTS = ACLASS_DEGREE__CHANGEABLE_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Class Design Options</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACLASS_WITH_COPY_DEGREE__CLASS_DESIGN_OPTIONS = ACLASS_DEGREE__CLASS_DESIGN_OPTIONS;

	/**
	 * The number of structural features of the '<em>AClass With Copy Degree</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACLASS_WITH_COPY_DEGREE_FEATURE_COUNT = ACLASS_DEGREE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Determine Initial Choice</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACLASS_WITH_COPY_DEGREE___DETERMINE_INITIAL_CHOICE = ACLASS_DEGREE___DETERMINE_INITIAL_CHOICE;

	/**
	 * The operation id for the '<em>Create Choice</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACLASS_WITH_COPY_DEGREE___CREATE_CHOICE = ACLASS_DEGREE___CREATE_CHOICE;

	/**
	 * The operation id for the '<em>Create Random Choice</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACLASS_WITH_COPY_DEGREE___CREATE_RANDOM_CHOICE = ACLASS_DEGREE___CREATE_RANDOM_CHOICE;

	/**
	 * The number of operations of the '<em>AClass With Copy Degree</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACLASS_WITH_COPY_DEGREE_OPERATION_COUNT = ACLASS_DEGREE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link genericdesigndecision.genericDoF.impl.ADataTypeDegreeImpl <em>AData Type Degree</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see genericdesigndecision.genericDoF.impl.ADataTypeDegreeImpl
	 * @see genericdesigndecision.genericDoF.impl.GenericDoFPackageImpl#getADataTypeDegree()
	 * @generated
	 */
	int ADATA_TYPE_DEGREE = 15;

	/**
	 * The feature id for the '<em><b>Added Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADATA_TYPE_DEGREE__ADDED_ELEMENTS = ADEGREE_OF_FREEDOM__ADDED_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Changeable Element Descriptions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADATA_TYPE_DEGREE__CHANGEABLE_ELEMENT_DESCRIPTIONS = ADEGREE_OF_FREEDOM__CHANGEABLE_ELEMENT_DESCRIPTIONS;

	/**
	 * The feature id for the '<em><b>Interaction Constraints</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADATA_TYPE_DEGREE__INTERACTION_CONSTRAINTS = ADEGREE_OF_FREEDOM__INTERACTION_CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Primary Changeable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADATA_TYPE_DEGREE__PRIMARY_CHANGEABLE = ADEGREE_OF_FREEDOM__PRIMARY_CHANGEABLE;

	/**
	 * The feature id for the '<em><b>Primary Changed</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADATA_TYPE_DEGREE__PRIMARY_CHANGED = ADEGREE_OF_FREEDOM__PRIMARY_CHANGED;

	/**
	 * The feature id for the '<em><b>Changeable Elements</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADATA_TYPE_DEGREE__CHANGEABLE_ELEMENTS = ADEGREE_OF_FREEDOM__CHANGEABLE_ELEMENTS;

	/**
	 * The number of structural features of the '<em>AData Type Degree</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADATA_TYPE_DEGREE_FEATURE_COUNT = ADEGREE_OF_FREEDOM_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Determine Initial Choice</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADATA_TYPE_DEGREE___DETERMINE_INITIAL_CHOICE = ADEGREE_OF_FREEDOM___DETERMINE_INITIAL_CHOICE;

	/**
	 * The operation id for the '<em>Create Choice</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADATA_TYPE_DEGREE___CREATE_CHOICE = ADEGREE_OF_FREEDOM___CREATE_CHOICE;

	/**
	 * The operation id for the '<em>Create Random Choice</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADATA_TYPE_DEGREE___CREATE_RANDOM_CHOICE = ADEGREE_OF_FREEDOM_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>AData Type Degree</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADATA_TYPE_DEGREE_OPERATION_COUNT = ADEGREE_OF_FREEDOM_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link genericdesigndecision.genericDoF.impl.AOrderedDataTypeDegreeImpl <em>AOrdered Data Type Degree</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see genericdesigndecision.genericDoF.impl.AOrderedDataTypeDegreeImpl
	 * @see genericdesigndecision.genericDoF.impl.GenericDoFPackageImpl#getAOrderedDataTypeDegree()
	 * @generated
	 */
	int AORDERED_DATA_TYPE_DEGREE = 20;

	/**
	 * The feature id for the '<em><b>Added Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AORDERED_DATA_TYPE_DEGREE__ADDED_ELEMENTS = ADATA_TYPE_DEGREE__ADDED_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Changeable Element Descriptions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AORDERED_DATA_TYPE_DEGREE__CHANGEABLE_ELEMENT_DESCRIPTIONS = ADATA_TYPE_DEGREE__CHANGEABLE_ELEMENT_DESCRIPTIONS;

	/**
	 * The feature id for the '<em><b>Interaction Constraints</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AORDERED_DATA_TYPE_DEGREE__INTERACTION_CONSTRAINTS = ADATA_TYPE_DEGREE__INTERACTION_CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Primary Changeable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AORDERED_DATA_TYPE_DEGREE__PRIMARY_CHANGEABLE = ADATA_TYPE_DEGREE__PRIMARY_CHANGEABLE;

	/**
	 * The feature id for the '<em><b>Primary Changed</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AORDERED_DATA_TYPE_DEGREE__PRIMARY_CHANGED = ADATA_TYPE_DEGREE__PRIMARY_CHANGED;

	/**
	 * The feature id for the '<em><b>Changeable Elements</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AORDERED_DATA_TYPE_DEGREE__CHANGEABLE_ELEMENTS = ADATA_TYPE_DEGREE__CHANGEABLE_ELEMENTS;

	/**
	 * The number of structural features of the '<em>AOrdered Data Type Degree</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AORDERED_DATA_TYPE_DEGREE_FEATURE_COUNT = ADATA_TYPE_DEGREE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Determine Initial Choice</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AORDERED_DATA_TYPE_DEGREE___DETERMINE_INITIAL_CHOICE = ADATA_TYPE_DEGREE___DETERMINE_INITIAL_CHOICE;

	/**
	 * The operation id for the '<em>Create Choice</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AORDERED_DATA_TYPE_DEGREE___CREATE_CHOICE = ADATA_TYPE_DEGREE___CREATE_CHOICE;

	/**
	 * The operation id for the '<em>Create Random Choice</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AORDERED_DATA_TYPE_DEGREE___CREATE_RANDOM_CHOICE = ADATA_TYPE_DEGREE___CREATE_RANDOM_CHOICE;

	/**
	 * The number of operations of the '<em>AOrdered Data Type Degree</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AORDERED_DATA_TYPE_DEGREE_OPERATION_COUNT = ADATA_TYPE_DEGREE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link genericdesigndecision.genericDoF.impl.ARangeDegreeImpl <em>ARange Degree</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see genericdesigndecision.genericDoF.impl.ARangeDegreeImpl
	 * @see genericdesigndecision.genericDoF.impl.GenericDoFPackageImpl#getARangeDegree()
	 * @generated
	 */
	int ARANGE_DEGREE = 14;

	/**
	 * The feature id for the '<em><b>Added Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARANGE_DEGREE__ADDED_ELEMENTS = AORDERED_DATA_TYPE_DEGREE__ADDED_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Changeable Element Descriptions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARANGE_DEGREE__CHANGEABLE_ELEMENT_DESCRIPTIONS = AORDERED_DATA_TYPE_DEGREE__CHANGEABLE_ELEMENT_DESCRIPTIONS;

	/**
	 * The feature id for the '<em><b>Interaction Constraints</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARANGE_DEGREE__INTERACTION_CONSTRAINTS = AORDERED_DATA_TYPE_DEGREE__INTERACTION_CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Primary Changeable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARANGE_DEGREE__PRIMARY_CHANGEABLE = AORDERED_DATA_TYPE_DEGREE__PRIMARY_CHANGEABLE;

	/**
	 * The feature id for the '<em><b>Primary Changed</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARANGE_DEGREE__PRIMARY_CHANGED = AORDERED_DATA_TYPE_DEGREE__PRIMARY_CHANGED;

	/**
	 * The feature id for the '<em><b>Changeable Elements</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARANGE_DEGREE__CHANGEABLE_ELEMENTS = AORDERED_DATA_TYPE_DEGREE__CHANGEABLE_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Upper Bound Included</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARANGE_DEGREE__UPPER_BOUND_INCLUDED = AORDERED_DATA_TYPE_DEGREE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Lower Bound Included</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARANGE_DEGREE__LOWER_BOUND_INCLUDED = AORDERED_DATA_TYPE_DEGREE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Number Of Steps</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARANGE_DEGREE__NUMBER_OF_STEPS = AORDERED_DATA_TYPE_DEGREE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>ARange Degree</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARANGE_DEGREE_FEATURE_COUNT = AORDERED_DATA_TYPE_DEGREE_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Determine Initial Choice</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARANGE_DEGREE___DETERMINE_INITIAL_CHOICE = AORDERED_DATA_TYPE_DEGREE___DETERMINE_INITIAL_CHOICE;

	/**
	 * The operation id for the '<em>Create Choice</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARANGE_DEGREE___CREATE_CHOICE = AORDERED_DATA_TYPE_DEGREE___CREATE_CHOICE;

	/**
	 * The operation id for the '<em>Create Random Choice</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARANGE_DEGREE___CREATE_RANDOM_CHOICE = AORDERED_DATA_TYPE_DEGREE___CREATE_RANDOM_CHOICE;

	/**
	 * The number of operations of the '<em>ARange Degree</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARANGE_DEGREE_OPERATION_COUNT = AORDERED_DATA_TYPE_DEGREE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link genericdesigndecision.genericDoF.impl.AContinuousRangeDegreeImpl <em>AContinuous Range Degree</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see genericdesigndecision.genericDoF.impl.AContinuousRangeDegreeImpl
	 * @see genericdesigndecision.genericDoF.impl.GenericDoFPackageImpl#getAContinuousRangeDegree()
	 * @generated
	 */
	int ACONTINUOUS_RANGE_DEGREE = 13;

	/**
	 * The feature id for the '<em><b>Added Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACONTINUOUS_RANGE_DEGREE__ADDED_ELEMENTS = ARANGE_DEGREE__ADDED_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Changeable Element Descriptions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACONTINUOUS_RANGE_DEGREE__CHANGEABLE_ELEMENT_DESCRIPTIONS = ARANGE_DEGREE__CHANGEABLE_ELEMENT_DESCRIPTIONS;

	/**
	 * The feature id for the '<em><b>Interaction Constraints</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACONTINUOUS_RANGE_DEGREE__INTERACTION_CONSTRAINTS = ARANGE_DEGREE__INTERACTION_CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Primary Changeable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACONTINUOUS_RANGE_DEGREE__PRIMARY_CHANGEABLE = ARANGE_DEGREE__PRIMARY_CHANGEABLE;

	/**
	 * The feature id for the '<em><b>Primary Changed</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACONTINUOUS_RANGE_DEGREE__PRIMARY_CHANGED = ARANGE_DEGREE__PRIMARY_CHANGED;

	/**
	 * The feature id for the '<em><b>Changeable Elements</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACONTINUOUS_RANGE_DEGREE__CHANGEABLE_ELEMENTS = ARANGE_DEGREE__CHANGEABLE_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Upper Bound Included</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACONTINUOUS_RANGE_DEGREE__UPPER_BOUND_INCLUDED = ARANGE_DEGREE__UPPER_BOUND_INCLUDED;

	/**
	 * The feature id for the '<em><b>Lower Bound Included</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACONTINUOUS_RANGE_DEGREE__LOWER_BOUND_INCLUDED = ARANGE_DEGREE__LOWER_BOUND_INCLUDED;

	/**
	 * The feature id for the '<em><b>Number Of Steps</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACONTINUOUS_RANGE_DEGREE__NUMBER_OF_STEPS = ARANGE_DEGREE__NUMBER_OF_STEPS;

	/**
	 * The feature id for the '<em><b>To</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACONTINUOUS_RANGE_DEGREE__TO = ARANGE_DEGREE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>From</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACONTINUOUS_RANGE_DEGREE__FROM = ARANGE_DEGREE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>AContinuous Range Degree</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACONTINUOUS_RANGE_DEGREE_FEATURE_COUNT = ARANGE_DEGREE_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Determine Initial Choice</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACONTINUOUS_RANGE_DEGREE___DETERMINE_INITIAL_CHOICE = ARANGE_DEGREE___DETERMINE_INITIAL_CHOICE;

	/**
	 * The operation id for the '<em>Create Choice</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACONTINUOUS_RANGE_DEGREE___CREATE_CHOICE = ARANGE_DEGREE___CREATE_CHOICE;

	/**
	 * The operation id for the '<em>Create Random Choice</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACONTINUOUS_RANGE_DEGREE___CREATE_RANDOM_CHOICE = ARANGE_DEGREE_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>AContinuous Range Degree</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACONTINUOUS_RANGE_DEGREE_OPERATION_COUNT = ARANGE_DEGREE_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link genericdesigndecision.genericDoF.impl.ADiscreteDegreeImpl <em>ADiscrete Degree</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see genericdesigndecision.genericDoF.impl.ADiscreteDegreeImpl
	 * @see genericdesigndecision.genericDoF.impl.GenericDoFPackageImpl#getADiscreteDegree()
	 * @generated
	 */
	int ADISCRETE_DEGREE = 16;

	/**
	 * The feature id for the '<em><b>Added Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADISCRETE_DEGREE__ADDED_ELEMENTS = ADATA_TYPE_DEGREE__ADDED_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Changeable Element Descriptions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADISCRETE_DEGREE__CHANGEABLE_ELEMENT_DESCRIPTIONS = ADATA_TYPE_DEGREE__CHANGEABLE_ELEMENT_DESCRIPTIONS;

	/**
	 * The feature id for the '<em><b>Interaction Constraints</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADISCRETE_DEGREE__INTERACTION_CONSTRAINTS = ADATA_TYPE_DEGREE__INTERACTION_CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Primary Changeable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADISCRETE_DEGREE__PRIMARY_CHANGEABLE = ADATA_TYPE_DEGREE__PRIMARY_CHANGEABLE;

	/**
	 * The feature id for the '<em><b>Primary Changed</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADISCRETE_DEGREE__PRIMARY_CHANGED = ADATA_TYPE_DEGREE__PRIMARY_CHANGED;

	/**
	 * The feature id for the '<em><b>Changeable Elements</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADISCRETE_DEGREE__CHANGEABLE_ELEMENTS = ADATA_TYPE_DEGREE__CHANGEABLE_ELEMENTS;

	/**
	 * The number of structural features of the '<em>ADiscrete Degree</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADISCRETE_DEGREE_FEATURE_COUNT = ADATA_TYPE_DEGREE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Determine Initial Choice</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADISCRETE_DEGREE___DETERMINE_INITIAL_CHOICE = ADATA_TYPE_DEGREE___DETERMINE_INITIAL_CHOICE;

	/**
	 * The operation id for the '<em>Create Choice</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADISCRETE_DEGREE___CREATE_CHOICE = ADATA_TYPE_DEGREE___CREATE_CHOICE;

	/**
	 * The operation id for the '<em>Create Random Choice</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADISCRETE_DEGREE___CREATE_RANDOM_CHOICE = ADATA_TYPE_DEGREE_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>ADiscrete Degree</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADISCRETE_DEGREE_OPERATION_COUNT = ADATA_TYPE_DEGREE_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link genericdesigndecision.genericDoF.impl.ADiscreteRangeDegreeImpl <em>ADiscrete Range Degree</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see genericdesigndecision.genericDoF.impl.ADiscreteRangeDegreeImpl
	 * @see genericdesigndecision.genericDoF.impl.GenericDoFPackageImpl#getADiscreteRangeDegree()
	 * @generated
	 */
	int ADISCRETE_RANGE_DEGREE = 17;

	/**
	 * The feature id for the '<em><b>Added Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADISCRETE_RANGE_DEGREE__ADDED_ELEMENTS = ARANGE_DEGREE__ADDED_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Changeable Element Descriptions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADISCRETE_RANGE_DEGREE__CHANGEABLE_ELEMENT_DESCRIPTIONS = ARANGE_DEGREE__CHANGEABLE_ELEMENT_DESCRIPTIONS;

	/**
	 * The feature id for the '<em><b>Interaction Constraints</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADISCRETE_RANGE_DEGREE__INTERACTION_CONSTRAINTS = ARANGE_DEGREE__INTERACTION_CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Primary Changeable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADISCRETE_RANGE_DEGREE__PRIMARY_CHANGEABLE = ARANGE_DEGREE__PRIMARY_CHANGEABLE;

	/**
	 * The feature id for the '<em><b>Primary Changed</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADISCRETE_RANGE_DEGREE__PRIMARY_CHANGED = ARANGE_DEGREE__PRIMARY_CHANGED;

	/**
	 * The feature id for the '<em><b>Changeable Elements</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADISCRETE_RANGE_DEGREE__CHANGEABLE_ELEMENTS = ARANGE_DEGREE__CHANGEABLE_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Upper Bound Included</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADISCRETE_RANGE_DEGREE__UPPER_BOUND_INCLUDED = ARANGE_DEGREE__UPPER_BOUND_INCLUDED;

	/**
	 * The feature id for the '<em><b>Lower Bound Included</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADISCRETE_RANGE_DEGREE__LOWER_BOUND_INCLUDED = ARANGE_DEGREE__LOWER_BOUND_INCLUDED;

	/**
	 * The feature id for the '<em><b>Number Of Steps</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADISCRETE_RANGE_DEGREE__NUMBER_OF_STEPS = ARANGE_DEGREE__NUMBER_OF_STEPS;

	/**
	 * The feature id for the '<em><b>To</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADISCRETE_RANGE_DEGREE__TO = ARANGE_DEGREE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>From</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADISCRETE_RANGE_DEGREE__FROM = ARANGE_DEGREE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>ADiscrete Range Degree</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADISCRETE_RANGE_DEGREE_FEATURE_COUNT = ARANGE_DEGREE_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Determine Initial Choice</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADISCRETE_RANGE_DEGREE___DETERMINE_INITIAL_CHOICE = ARANGE_DEGREE___DETERMINE_INITIAL_CHOICE;

	/**
	 * The operation id for the '<em>Create Choice</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADISCRETE_RANGE_DEGREE___CREATE_CHOICE = ARANGE_DEGREE___CREATE_CHOICE;

	/**
	 * The operation id for the '<em>Create Random Choice</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADISCRETE_RANGE_DEGREE___CREATE_RANDOM_CHOICE = ARANGE_DEGREE_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>ADiscrete Range Degree</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADISCRETE_RANGE_DEGREE_OPERATION_COUNT = ARANGE_DEGREE_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link genericdesigndecision.genericDoF.impl.AUnorderedDegreeImpl <em>AUnordered Degree</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see genericdesigndecision.genericDoF.impl.AUnorderedDegreeImpl
	 * @see genericdesigndecision.genericDoF.impl.GenericDoFPackageImpl#getAUnorderedDegree()
	 * @generated
	 */
	int AUNORDERED_DEGREE = 19;

	/**
	 * The feature id for the '<em><b>Added Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUNORDERED_DEGREE__ADDED_ELEMENTS = ADATA_TYPE_DEGREE__ADDED_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Changeable Element Descriptions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUNORDERED_DEGREE__CHANGEABLE_ELEMENT_DESCRIPTIONS = ADATA_TYPE_DEGREE__CHANGEABLE_ELEMENT_DESCRIPTIONS;

	/**
	 * The feature id for the '<em><b>Interaction Constraints</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUNORDERED_DEGREE__INTERACTION_CONSTRAINTS = ADATA_TYPE_DEGREE__INTERACTION_CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Primary Changeable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUNORDERED_DEGREE__PRIMARY_CHANGEABLE = ADATA_TYPE_DEGREE__PRIMARY_CHANGEABLE;

	/**
	 * The feature id for the '<em><b>Primary Changed</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUNORDERED_DEGREE__PRIMARY_CHANGED = ADATA_TYPE_DEGREE__PRIMARY_CHANGED;

	/**
	 * The feature id for the '<em><b>Changeable Elements</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUNORDERED_DEGREE__CHANGEABLE_ELEMENTS = ADATA_TYPE_DEGREE__CHANGEABLE_ELEMENTS;

	/**
	 * The number of structural features of the '<em>AUnordered Degree</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUNORDERED_DEGREE_FEATURE_COUNT = ADATA_TYPE_DEGREE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Determine Initial Choice</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUNORDERED_DEGREE___DETERMINE_INITIAL_CHOICE = ADATA_TYPE_DEGREE___DETERMINE_INITIAL_CHOICE;

	/**
	 * The operation id for the '<em>Create Choice</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUNORDERED_DEGREE___CREATE_CHOICE = ADATA_TYPE_DEGREE___CREATE_CHOICE;

	/**
	 * The operation id for the '<em>Create Random Choice</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUNORDERED_DEGREE___CREATE_RANDOM_CHOICE = ADATA_TYPE_DEGREE___CREATE_RANDOM_CHOICE;

	/**
	 * The number of operations of the '<em>AUnordered Degree</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUNORDERED_DEGREE_OPERATION_COUNT = ADATA_TYPE_DEGREE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link genericdesigndecision.genericDoF.impl.AEnumDegreeImpl <em>AEnum Degree</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see genericdesigndecision.genericDoF.impl.AEnumDegreeImpl
	 * @see genericdesigndecision.genericDoF.impl.GenericDoFPackageImpl#getAEnumDegree()
	 * @generated
	 */
	int AENUM_DEGREE = 18;

	/**
	 * The feature id for the '<em><b>Added Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AENUM_DEGREE__ADDED_ELEMENTS = AUNORDERED_DEGREE__ADDED_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Changeable Element Descriptions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AENUM_DEGREE__CHANGEABLE_ELEMENT_DESCRIPTIONS = AUNORDERED_DEGREE__CHANGEABLE_ELEMENT_DESCRIPTIONS;

	/**
	 * The feature id for the '<em><b>Interaction Constraints</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AENUM_DEGREE__INTERACTION_CONSTRAINTS = AUNORDERED_DEGREE__INTERACTION_CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Primary Changeable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AENUM_DEGREE__PRIMARY_CHANGEABLE = AUNORDERED_DEGREE__PRIMARY_CHANGEABLE;

	/**
	 * The feature id for the '<em><b>Primary Changed</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AENUM_DEGREE__PRIMARY_CHANGED = AUNORDERED_DEGREE__PRIMARY_CHANGED;

	/**
	 * The feature id for the '<em><b>Changeable Elements</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AENUM_DEGREE__CHANGEABLE_ELEMENTS = AUNORDERED_DEGREE__CHANGEABLE_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Enumeration</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AENUM_DEGREE__ENUMERATION = AUNORDERED_DEGREE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>AEnum Degree</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AENUM_DEGREE_FEATURE_COUNT = AUNORDERED_DEGREE_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Determine Initial Choice</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AENUM_DEGREE___DETERMINE_INITIAL_CHOICE = AUNORDERED_DEGREE___DETERMINE_INITIAL_CHOICE;

	/**
	 * The operation id for the '<em>Create Choice</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AENUM_DEGREE___CREATE_CHOICE = AUNORDERED_DEGREE___CREATE_CHOICE;

	/**
	 * The operation id for the '<em>Create Random Choice</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AENUM_DEGREE___CREATE_RANDOM_CHOICE = AUNORDERED_DEGREE___CREATE_RANDOM_CHOICE;

	/**
	 * The number of operations of the '<em>AEnum Degree</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AENUM_DEGREE_OPERATION_COUNT = AUNORDERED_DEGREE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link genericdesigndecision.genericDoF.impl.AOrderedIntegerDegreeImpl <em>AOrdered Integer Degree</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see genericdesigndecision.genericDoF.impl.AOrderedIntegerDegreeImpl
	 * @see genericdesigndecision.genericDoF.impl.GenericDoFPackageImpl#getAOrderedIntegerDegree()
	 * @generated
	 */
	int AORDERED_INTEGER_DEGREE = 21;

	/**
	 * The feature id for the '<em><b>Added Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AORDERED_INTEGER_DEGREE__ADDED_ELEMENTS = ADISCRETE_DEGREE__ADDED_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Changeable Element Descriptions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AORDERED_INTEGER_DEGREE__CHANGEABLE_ELEMENT_DESCRIPTIONS = ADISCRETE_DEGREE__CHANGEABLE_ELEMENT_DESCRIPTIONS;

	/**
	 * The feature id for the '<em><b>Interaction Constraints</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AORDERED_INTEGER_DEGREE__INTERACTION_CONSTRAINTS = ADISCRETE_DEGREE__INTERACTION_CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Primary Changeable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AORDERED_INTEGER_DEGREE__PRIMARY_CHANGEABLE = ADISCRETE_DEGREE__PRIMARY_CHANGEABLE;

	/**
	 * The feature id for the '<em><b>Primary Changed</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AORDERED_INTEGER_DEGREE__PRIMARY_CHANGED = ADISCRETE_DEGREE__PRIMARY_CHANGED;

	/**
	 * The feature id for the '<em><b>Changeable Elements</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AORDERED_INTEGER_DEGREE__CHANGEABLE_ELEMENTS = ADISCRETE_DEGREE__CHANGEABLE_ELEMENTS;

	/**
	 * The feature id for the '<em><b>List Of Integers</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AORDERED_INTEGER_DEGREE__LIST_OF_INTEGERS = ADISCRETE_DEGREE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>AOrdered Integer Degree</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AORDERED_INTEGER_DEGREE_FEATURE_COUNT = ADISCRETE_DEGREE_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Determine Initial Choice</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AORDERED_INTEGER_DEGREE___DETERMINE_INITIAL_CHOICE = ADISCRETE_DEGREE___DETERMINE_INITIAL_CHOICE;

	/**
	 * The operation id for the '<em>Create Choice</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AORDERED_INTEGER_DEGREE___CREATE_CHOICE = ADISCRETE_DEGREE___CREATE_CHOICE;

	/**
	 * The operation id for the '<em>Create Random Choice</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AORDERED_INTEGER_DEGREE___CREATE_RANDOM_CHOICE = ADISCRETE_DEGREE___CREATE_RANDOM_CHOICE;

	/**
	 * The number of operations of the '<em>AOrdered Integer Degree</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AORDERED_INTEGER_DEGREE_OPERATION_COUNT = ADISCRETE_DEGREE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link genericdesigndecision.genericDoF.impl.AStringSetDegreeImpl <em>AString Set Degree</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see genericdesigndecision.genericDoF.impl.AStringSetDegreeImpl
	 * @see genericdesigndecision.genericDoF.impl.GenericDoFPackageImpl#getAStringSetDegree()
	 * @generated
	 */
	int ASTRING_SET_DEGREE = 22;

	/**
	 * The feature id for the '<em><b>Added Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASTRING_SET_DEGREE__ADDED_ELEMENTS = AUNORDERED_DEGREE__ADDED_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Changeable Element Descriptions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASTRING_SET_DEGREE__CHANGEABLE_ELEMENT_DESCRIPTIONS = AUNORDERED_DEGREE__CHANGEABLE_ELEMENT_DESCRIPTIONS;

	/**
	 * The feature id for the '<em><b>Interaction Constraints</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASTRING_SET_DEGREE__INTERACTION_CONSTRAINTS = AUNORDERED_DEGREE__INTERACTION_CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Primary Changeable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASTRING_SET_DEGREE__PRIMARY_CHANGEABLE = AUNORDERED_DEGREE__PRIMARY_CHANGEABLE;

	/**
	 * The feature id for the '<em><b>Primary Changed</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASTRING_SET_DEGREE__PRIMARY_CHANGED = AUNORDERED_DEGREE__PRIMARY_CHANGED;

	/**
	 * The feature id for the '<em><b>Changeable Elements</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASTRING_SET_DEGREE__CHANGEABLE_ELEMENTS = AUNORDERED_DEGREE__CHANGEABLE_ELEMENTS;

	/**
	 * The feature id for the '<em><b>String Values</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASTRING_SET_DEGREE__STRING_VALUES = AUNORDERED_DEGREE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>AString Set Degree</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASTRING_SET_DEGREE_FEATURE_COUNT = AUNORDERED_DEGREE_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Determine Initial Choice</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASTRING_SET_DEGREE___DETERMINE_INITIAL_CHOICE = AUNORDERED_DEGREE___DETERMINE_INITIAL_CHOICE;

	/**
	 * The operation id for the '<em>Create Choice</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASTRING_SET_DEGREE___CREATE_CHOICE = AUNORDERED_DEGREE___CREATE_CHOICE;

	/**
	 * The operation id for the '<em>Create Random Choice</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASTRING_SET_DEGREE___CREATE_RANDOM_CHOICE = AUNORDERED_DEGREE___CREATE_RANDOM_CHOICE;

	/**
	 * The number of operations of the '<em>AString Set Degree</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASTRING_SET_DEGREE_OPERATION_COUNT = AUNORDERED_DEGREE_OPERATION_COUNT + 0;

	/**
	 * Returns the meta object for class '{@link genericdesigndecision.genericDoF.ChangeableElementDescription <em>Changeable Element Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Changeable Element Description</em>'.
	 * @see genericdesigndecision.genericDoF.ChangeableElementDescription
	 * @generated
	 */
	EClass getChangeableElementDescription();

	/**
	 * Returns the meta object for the reference '{@link genericdesigndecision.genericDoF.ChangeableElementDescription#getChangeable <em>Changeable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Changeable</em>'.
	 * @see genericdesigndecision.genericDoF.ChangeableElementDescription#getChangeable()
	 * @see #getChangeableElementDescription()
	 * @generated
	 */
	EReference getChangeableElementDescription_Changeable();

	/**
	 * Returns the meta object for the containment reference '{@link genericdesigndecision.genericDoF.ChangeableElementDescription#getValueRule <em>Value Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Value Rule</em>'.
	 * @see genericdesigndecision.genericDoF.ChangeableElementDescription#getValueRule()
	 * @see #getChangeableElementDescription()
	 * @generated
	 */
	EReference getChangeableElementDescription_ValueRule();

	/**
	 * Returns the meta object for the containment reference '{@link genericdesigndecision.genericDoF.ChangeableElementDescription#getSelectionRule <em>Selection Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Selection Rule</em>'.
	 * @see genericdesigndecision.genericDoF.ChangeableElementDescription#getSelectionRule()
	 * @see #getChangeableElementDescription()
	 * @generated
	 */
	EReference getChangeableElementDescription_SelectionRule();

	/**
	 * Returns the meta object for class '{@link genericdesigndecision.genericDoF.ValueRule <em>Value Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Value Rule</em>'.
	 * @see genericdesigndecision.genericDoF.ValueRule
	 * @generated
	 */
	EClass getValueRule();

	/**
	 * Returns the meta object for class '{@link genericdesigndecision.genericDoF.OCLRule <em>OCL Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>OCL Rule</em>'.
	 * @see genericdesigndecision.genericDoF.OCLRule
	 * @generated
	 */
	EClass getOCLRule();

	/**
	 * Returns the meta object for the attribute '{@link genericdesigndecision.genericDoF.OCLRule#getMainOclQuery <em>Main Ocl Query</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Main Ocl Query</em>'.
	 * @see genericdesigndecision.genericDoF.OCLRule#getMainOclQuery()
	 * @see #getOCLRule()
	 * @generated
	 */
	EAttribute getOCLRule_MainOclQuery();

	/**
	 * Returns the meta object for the containment reference list '{@link genericdesigndecision.genericDoF.OCLRule#getHelperDefinition <em>Helper Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Helper Definition</em>'.
	 * @see genericdesigndecision.genericDoF.OCLRule#getHelperDefinition()
	 * @see #getOCLRule()
	 * @generated
	 */
	EReference getOCLRule_HelperDefinition();

	/**
	 * Returns the meta object for class '{@link genericdesigndecision.genericDoF.HelperOCLDefinition <em>Helper OCL Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Helper OCL Definition</em>'.
	 * @see genericdesigndecision.genericDoF.HelperOCLDefinition
	 * @generated
	 */
	EClass getHelperOCLDefinition();

	/**
	 * Returns the meta object for class '{@link genericdesigndecision.genericDoF.StaticContextRule <em>Static Context Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Static Context Rule</em>'.
	 * @see genericdesigndecision.genericDoF.StaticContextRule
	 * @generated
	 */
	EClass getStaticContextRule();

	/**
	 * Returns the meta object for the reference '{@link genericdesigndecision.genericDoF.StaticContextRule#getContextClass <em>Context Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Context Class</em>'.
	 * @see genericdesigndecision.genericDoF.StaticContextRule#getContextClass()
	 * @see #getStaticContextRule()
	 * @generated
	 */
	EReference getStaticContextRule_ContextClass();

	/**
	 * Returns the meta object for class '{@link genericdesigndecision.genericDoF.SelectionRule <em>Selection Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Selection Rule</em>'.
	 * @see genericdesigndecision.genericDoF.SelectionRule
	 * @generated
	 */
	EClass getSelectionRule();

	/**
	 * Returns the meta object for class '{@link genericdesigndecision.genericDoF.DoFRepository <em>Do FRepository</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Do FRepository</em>'.
	 * @see genericdesigndecision.genericDoF.DoFRepository
	 * @generated
	 */
	EClass getDoFRepository();

	/**
	 * Returns the meta object for the containment reference list '{@link genericdesigndecision.genericDoF.DoFRepository#getSdofs <em>Sdofs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sdofs</em>'.
	 * @see genericdesigndecision.genericDoF.DoFRepository#getSdofs()
	 * @see #getDoFRepository()
	 * @generated
	 */
	EReference getDoFRepository_Sdofs();

	/**
	 * Returns the meta object for the '{@link genericdesigndecision.genericDoF.DoFRepository#deleteSDoF(genericdesigndecision.universalDoF.SpecificDoF) <em>Delete SDo F</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Delete SDo F</em>' operation.
	 * @see genericdesigndecision.genericDoF.DoFRepository#deleteSDoF(genericdesigndecision.universalDoF.SpecificDoF)
	 * @generated
	 */
	EOperation getDoFRepository__DeleteSDoF__SpecificDoF();

	/**
	 * Returns the meta object for the '{@link genericdesigndecision.genericDoF.DoFRepository#getSDoF(java.lang.String) <em>Get SDo F</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get SDo F</em>' operation.
	 * @see genericdesigndecision.genericDoF.DoFRepository#getSDoF(java.lang.String)
	 * @generated
	 */
	EOperation getDoFRepository__GetSDoF__String();

	/**
	 * Returns the meta object for class '{@link genericdesigndecision.genericDoF.InstanceSelectionRule <em>Instance Selection Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Instance Selection Rule</em>'.
	 * @see genericdesigndecision.genericDoF.InstanceSelectionRule
	 * @generated
	 */
	EClass getInstanceSelectionRule();

	/**
	 * Returns the meta object for the reference '{@link genericdesigndecision.genericDoF.InstanceSelectionRule#getContextInstance <em>Context Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Context Instance</em>'.
	 * @see genericdesigndecision.genericDoF.InstanceSelectionRule#getContextInstance()
	 * @see #getInstanceSelectionRule()
	 * @generated
	 */
	EReference getInstanceSelectionRule_ContextInstance();

	/**
	 * Returns the meta object for class '{@link genericdesigndecision.genericDoF.StaticSelectionRule <em>Static Selection Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Static Selection Rule</em>'.
	 * @see genericdesigndecision.genericDoF.StaticSelectionRule
	 * @generated
	 */
	EClass getStaticSelectionRule();

	/**
	 * Returns the meta object for class '{@link genericdesigndecision.genericDoF.ADegreeOfFreedom <em>ADegree Of Freedom</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ADegree Of Freedom</em>'.
	 * @see genericdesigndecision.genericDoF.ADegreeOfFreedom
	 * @generated
	 */
	EClass getADegreeOfFreedom();

	/**
	 * Returns the meta object for the reference list '{@link genericdesigndecision.genericDoF.ADegreeOfFreedom#getAddedElements <em>Added Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Added Elements</em>'.
	 * @see genericdesigndecision.genericDoF.ADegreeOfFreedom#getAddedElements()
	 * @see #getADegreeOfFreedom()
	 * @generated
	 */
	EReference getADegreeOfFreedom_AddedElements();

	/**
	 * Returns the meta object for the containment reference list '{@link genericdesigndecision.genericDoF.ADegreeOfFreedom#getChangeableElementDescriptions <em>Changeable Element Descriptions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Changeable Element Descriptions</em>'.
	 * @see genericdesigndecision.genericDoF.ADegreeOfFreedom#getChangeableElementDescriptions()
	 * @see #getADegreeOfFreedom()
	 * @generated
	 */
	EReference getADegreeOfFreedom_ChangeableElementDescriptions();

	/**
	 * Returns the meta object for the reference list '{@link genericdesigndecision.genericDoF.ADegreeOfFreedom#getInteractionConstraints <em>Interaction Constraints</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Interaction Constraints</em>'.
	 * @see genericdesigndecision.genericDoF.ADegreeOfFreedom#getInteractionConstraints()
	 * @see #getADegreeOfFreedom()
	 * @generated
	 */
	EReference getADegreeOfFreedom_InteractionConstraints();

	/**
	 * Returns the meta object for the reference '{@link genericdesigndecision.genericDoF.ADegreeOfFreedom#getPrimaryChangeable <em>Primary Changeable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Primary Changeable</em>'.
	 * @see genericdesigndecision.genericDoF.ADegreeOfFreedom#getPrimaryChangeable()
	 * @see #getADegreeOfFreedom()
	 * @generated
	 */
	EReference getADegreeOfFreedom_PrimaryChangeable();

	/**
	 * Returns the meta object for the reference '{@link genericdesigndecision.genericDoF.ADegreeOfFreedom#getPrimaryChanged <em>Primary Changed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Primary Changed</em>'.
	 * @see genericdesigndecision.genericDoF.ADegreeOfFreedom#getPrimaryChanged()
	 * @see #getADegreeOfFreedom()
	 * @generated
	 */
	EReference getADegreeOfFreedom_PrimaryChanged();

	/**
	 * Returns the meta object for the reference '{@link genericdesigndecision.genericDoF.ADegreeOfFreedom#getChangeableElements <em>Changeable Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Changeable Elements</em>'.
	 * @see genericdesigndecision.genericDoF.ADegreeOfFreedom#getChangeableElements()
	 * @see #getADegreeOfFreedom()
	 * @generated
	 */
	EReference getADegreeOfFreedom_ChangeableElements();

	/**
	 * Returns the meta object for the '{@link genericdesigndecision.genericDoF.ADegreeOfFreedom#createRandomChoice() <em>Create Random Choice</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Create Random Choice</em>' operation.
	 * @see genericdesigndecision.genericDoF.ADegreeOfFreedom#createRandomChoice()
	 * @generated
	 */
	EOperation getADegreeOfFreedom__CreateRandomChoice();

	/**
	 * Returns the meta object for the '{@link genericdesigndecision.genericDoF.ADegreeOfFreedom#determineInitialChoice() <em>Determine Initial Choice</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Determine Initial Choice</em>' operation.
	 * @see genericdesigndecision.genericDoF.ADegreeOfFreedom#determineInitialChoice()
	 * @generated
	 */
	EOperation getADegreeOfFreedom__DetermineInitialChoice();

	/**
	 * Returns the meta object for the '{@link genericdesigndecision.genericDoF.ADegreeOfFreedom#createChoice() <em>Create Choice</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Create Choice</em>' operation.
	 * @see genericdesigndecision.genericDoF.ADegreeOfFreedom#createChoice()
	 * @generated
	 */
	EOperation getADegreeOfFreedom__CreateChoice();

	/**
	 * Returns the meta object for class '{@link genericdesigndecision.genericDoF.AClassAsReferenceDegree <em>AClass As Reference Degree</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>AClass As Reference Degree</em>'.
	 * @see genericdesigndecision.genericDoF.AClassAsReferenceDegree
	 * @generated
	 */
	EClass getAClassAsReferenceDegree();

	/**
	 * Returns the meta object for class '{@link genericdesigndecision.genericDoF.AClassDegree <em>AClass Degree</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>AClass Degree</em>'.
	 * @see genericdesigndecision.genericDoF.AClassDegree
	 * @generated
	 */
	EClass getAClassDegree();

	/**
	 * Returns the meta object for the reference list '{@link genericdesigndecision.genericDoF.AClassDegree#getClassDesignOptions <em>Class Design Options</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Class Design Options</em>'.
	 * @see genericdesigndecision.genericDoF.AClassDegree#getClassDesignOptions()
	 * @see #getAClassDegree()
	 * @generated
	 */
	EReference getAClassDegree_ClassDesignOptions();

	/**
	 * Returns the meta object for the '{@link genericdesigndecision.genericDoF.AClassDegree#createRandomChoice() <em>Create Random Choice</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Create Random Choice</em>' operation.
	 * @see genericdesigndecision.genericDoF.AClassDegree#createRandomChoice()
	 * @generated
	 */
	EOperation getAClassDegree__CreateRandomChoice();

	/**
	 * Returns the meta object for class '{@link genericdesigndecision.genericDoF.AClassWithCopyDegree <em>AClass With Copy Degree</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>AClass With Copy Degree</em>'.
	 * @see genericdesigndecision.genericDoF.AClassWithCopyDegree
	 * @generated
	 */
	EClass getAClassWithCopyDegree();

	/**
	 * Returns the meta object for class '{@link genericdesigndecision.genericDoF.AContinuousRangeDegree <em>AContinuous Range Degree</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>AContinuous Range Degree</em>'.
	 * @see genericdesigndecision.genericDoF.AContinuousRangeDegree
	 * @generated
	 */
	EClass getAContinuousRangeDegree();

	/**
	 * Returns the meta object for the attribute '{@link genericdesigndecision.genericDoF.AContinuousRangeDegree#getTo <em>To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>To</em>'.
	 * @see genericdesigndecision.genericDoF.AContinuousRangeDegree#getTo()
	 * @see #getAContinuousRangeDegree()
	 * @generated
	 */
	EAttribute getAContinuousRangeDegree_To();

	/**
	 * Returns the meta object for the attribute '{@link genericdesigndecision.genericDoF.AContinuousRangeDegree#getFrom <em>From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>From</em>'.
	 * @see genericdesigndecision.genericDoF.AContinuousRangeDegree#getFrom()
	 * @see #getAContinuousRangeDegree()
	 * @generated
	 */
	EAttribute getAContinuousRangeDegree_From();

	/**
	 * Returns the meta object for the '{@link genericdesigndecision.genericDoF.AContinuousRangeDegree#createRandomChoice() <em>Create Random Choice</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Create Random Choice</em>' operation.
	 * @see genericdesigndecision.genericDoF.AContinuousRangeDegree#createRandomChoice()
	 * @generated
	 */
	EOperation getAContinuousRangeDegree__CreateRandomChoice();

	/**
	 * Returns the meta object for class '{@link genericdesigndecision.genericDoF.ARangeDegree <em>ARange Degree</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ARange Degree</em>'.
	 * @see genericdesigndecision.genericDoF.ARangeDegree
	 * @generated
	 */
	EClass getARangeDegree();

	/**
	 * Returns the meta object for the attribute '{@link genericdesigndecision.genericDoF.ARangeDegree#isUpperBoundIncluded <em>Upper Bound Included</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Upper Bound Included</em>'.
	 * @see genericdesigndecision.genericDoF.ARangeDegree#isUpperBoundIncluded()
	 * @see #getARangeDegree()
	 * @generated
	 */
	EAttribute getARangeDegree_UpperBoundIncluded();

	/**
	 * Returns the meta object for the attribute '{@link genericdesigndecision.genericDoF.ARangeDegree#isLowerBoundIncluded <em>Lower Bound Included</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lower Bound Included</em>'.
	 * @see genericdesigndecision.genericDoF.ARangeDegree#isLowerBoundIncluded()
	 * @see #getARangeDegree()
	 * @generated
	 */
	EAttribute getARangeDegree_LowerBoundIncluded();

	/**
	 * Returns the meta object for the attribute '{@link genericdesigndecision.genericDoF.ARangeDegree#getNumberOfSteps <em>Number Of Steps</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Number Of Steps</em>'.
	 * @see genericdesigndecision.genericDoF.ARangeDegree#getNumberOfSteps()
	 * @see #getARangeDegree()
	 * @generated
	 */
	EAttribute getARangeDegree_NumberOfSteps();

	/**
	 * Returns the meta object for class '{@link genericdesigndecision.genericDoF.ADataTypeDegree <em>AData Type Degree</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>AData Type Degree</em>'.
	 * @see genericdesigndecision.genericDoF.ADataTypeDegree
	 * @generated
	 */
	EClass getADataTypeDegree();

	/**
	 * Returns the meta object for the '{@link genericdesigndecision.genericDoF.ADataTypeDegree#createRandomChoice() <em>Create Random Choice</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Create Random Choice</em>' operation.
	 * @see genericdesigndecision.genericDoF.ADataTypeDegree#createRandomChoice()
	 * @generated
	 */
	EOperation getADataTypeDegree__CreateRandomChoice();

	/**
	 * Returns the meta object for class '{@link genericdesigndecision.genericDoF.ADiscreteDegree <em>ADiscrete Degree</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ADiscrete Degree</em>'.
	 * @see genericdesigndecision.genericDoF.ADiscreteDegree
	 * @generated
	 */
	EClass getADiscreteDegree();

	/**
	 * Returns the meta object for the '{@link genericdesigndecision.genericDoF.ADiscreteDegree#createRandomChoice() <em>Create Random Choice</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Create Random Choice</em>' operation.
	 * @see genericdesigndecision.genericDoF.ADiscreteDegree#createRandomChoice()
	 * @generated
	 */
	EOperation getADiscreteDegree__CreateRandomChoice();

	/**
	 * Returns the meta object for class '{@link genericdesigndecision.genericDoF.ADiscreteRangeDegree <em>ADiscrete Range Degree</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ADiscrete Range Degree</em>'.
	 * @see genericdesigndecision.genericDoF.ADiscreteRangeDegree
	 * @generated
	 */
	EClass getADiscreteRangeDegree();

	/**
	 * Returns the meta object for the attribute '{@link genericdesigndecision.genericDoF.ADiscreteRangeDegree#getTo <em>To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>To</em>'.
	 * @see genericdesigndecision.genericDoF.ADiscreteRangeDegree#getTo()
	 * @see #getADiscreteRangeDegree()
	 * @generated
	 */
	EAttribute getADiscreteRangeDegree_To();

	/**
	 * Returns the meta object for the attribute '{@link genericdesigndecision.genericDoF.ADiscreteRangeDegree#getFrom <em>From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>From</em>'.
	 * @see genericdesigndecision.genericDoF.ADiscreteRangeDegree#getFrom()
	 * @see #getADiscreteRangeDegree()
	 * @generated
	 */
	EAttribute getADiscreteRangeDegree_From();

	/**
	 * Returns the meta object for class '{@link genericdesigndecision.genericDoF.AEnumDegree <em>AEnum Degree</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>AEnum Degree</em>'.
	 * @see genericdesigndecision.genericDoF.AEnumDegree
	 * @generated
	 */
	EClass getAEnumDegree();

	/**
	 * Returns the meta object for the reference '{@link genericdesigndecision.genericDoF.AEnumDegree#getEnumeration <em>Enumeration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Enumeration</em>'.
	 * @see genericdesigndecision.genericDoF.AEnumDegree#getEnumeration()
	 * @see #getAEnumDegree()
	 * @generated
	 */
	EReference getAEnumDegree_Enumeration();

	/**
	 * Returns the meta object for class '{@link genericdesigndecision.genericDoF.AUnorderedDegree <em>AUnordered Degree</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>AUnordered Degree</em>'.
	 * @see genericdesigndecision.genericDoF.AUnorderedDegree
	 * @generated
	 */
	EClass getAUnorderedDegree();

	/**
	 * Returns the meta object for class '{@link genericdesigndecision.genericDoF.AOrderedDataTypeDegree <em>AOrdered Data Type Degree</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>AOrdered Data Type Degree</em>'.
	 * @see genericdesigndecision.genericDoF.AOrderedDataTypeDegree
	 * @generated
	 */
	EClass getAOrderedDataTypeDegree();

	/**
	 * Returns the meta object for class '{@link genericdesigndecision.genericDoF.AOrderedIntegerDegree <em>AOrdered Integer Degree</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>AOrdered Integer Degree</em>'.
	 * @see genericdesigndecision.genericDoF.AOrderedIntegerDegree
	 * @generated
	 */
	EClass getAOrderedIntegerDegree();

	/**
	 * Returns the meta object for the attribute list '{@link genericdesigndecision.genericDoF.AOrderedIntegerDegree#getListOfIntegers <em>List Of Integers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>List Of Integers</em>'.
	 * @see genericdesigndecision.genericDoF.AOrderedIntegerDegree#getListOfIntegers()
	 * @see #getAOrderedIntegerDegree()
	 * @generated
	 */
	EAttribute getAOrderedIntegerDegree_ListOfIntegers();

	/**
	 * Returns the meta object for class '{@link genericdesigndecision.genericDoF.AStringSetDegree <em>AString Set Degree</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>AString Set Degree</em>'.
	 * @see genericdesigndecision.genericDoF.AStringSetDegree
	 * @generated
	 */
	EClass getAStringSetDegree();

	/**
	 * Returns the meta object for the attribute list '{@link genericdesigndecision.genericDoF.AStringSetDegree#getStringValues <em>String Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>String Values</em>'.
	 * @see genericdesigndecision.genericDoF.AStringSetDegree#getStringValues()
	 * @see #getAStringSetDegree()
	 * @generated
	 */
	EAttribute getAStringSetDegree_StringValues();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	GenericDoFFactory getGenericDoFFactory();

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
		 * The meta object literal for the '{@link genericdesigndecision.genericDoF.impl.ChangeableElementDescriptionImpl <em>Changeable Element Description</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see genericdesigndecision.genericDoF.impl.ChangeableElementDescriptionImpl
		 * @see genericdesigndecision.genericDoF.impl.GenericDoFPackageImpl#getChangeableElementDescription()
		 * @generated
		 */
		EClass CHANGEABLE_ELEMENT_DESCRIPTION = eINSTANCE.getChangeableElementDescription();

		/**
		 * The meta object literal for the '<em><b>Changeable</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CHANGEABLE_ELEMENT_DESCRIPTION__CHANGEABLE = eINSTANCE.getChangeableElementDescription_Changeable();

		/**
		 * The meta object literal for the '<em><b>Value Rule</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CHANGEABLE_ELEMENT_DESCRIPTION__VALUE_RULE = eINSTANCE.getChangeableElementDescription_ValueRule();

		/**
		 * The meta object literal for the '<em><b>Selection Rule</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CHANGEABLE_ELEMENT_DESCRIPTION__SELECTION_RULE = eINSTANCE.getChangeableElementDescription_SelectionRule();

		/**
		 * The meta object literal for the '{@link genericdesigndecision.genericDoF.impl.ValueRuleImpl <em>Value Rule</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see genericdesigndecision.genericDoF.impl.ValueRuleImpl
		 * @see genericdesigndecision.genericDoF.impl.GenericDoFPackageImpl#getValueRule()
		 * @generated
		 */
		EClass VALUE_RULE = eINSTANCE.getValueRule();

		/**
		 * The meta object literal for the '{@link genericdesigndecision.genericDoF.impl.OCLRuleImpl <em>OCL Rule</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see genericdesigndecision.genericDoF.impl.OCLRuleImpl
		 * @see genericdesigndecision.genericDoF.impl.GenericDoFPackageImpl#getOCLRule()
		 * @generated
		 */
		EClass OCL_RULE = eINSTANCE.getOCLRule();

		/**
		 * The meta object literal for the '<em><b>Main Ocl Query</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OCL_RULE__MAIN_OCL_QUERY = eINSTANCE.getOCLRule_MainOclQuery();

		/**
		 * The meta object literal for the '<em><b>Helper Definition</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OCL_RULE__HELPER_DEFINITION = eINSTANCE.getOCLRule_HelperDefinition();

		/**
		 * The meta object literal for the '{@link genericdesigndecision.genericDoF.impl.HelperOCLDefinitionImpl <em>Helper OCL Definition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see genericdesigndecision.genericDoF.impl.HelperOCLDefinitionImpl
		 * @see genericdesigndecision.genericDoF.impl.GenericDoFPackageImpl#getHelperOCLDefinition()
		 * @generated
		 */
		EClass HELPER_OCL_DEFINITION = eINSTANCE.getHelperOCLDefinition();

		/**
		 * The meta object literal for the '{@link genericdesigndecision.genericDoF.impl.StaticContextRuleImpl <em>Static Context Rule</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see genericdesigndecision.genericDoF.impl.StaticContextRuleImpl
		 * @see genericdesigndecision.genericDoF.impl.GenericDoFPackageImpl#getStaticContextRule()
		 * @generated
		 */
		EClass STATIC_CONTEXT_RULE = eINSTANCE.getStaticContextRule();

		/**
		 * The meta object literal for the '<em><b>Context Class</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATIC_CONTEXT_RULE__CONTEXT_CLASS = eINSTANCE.getStaticContextRule_ContextClass();

		/**
		 * The meta object literal for the '{@link genericdesigndecision.genericDoF.impl.SelectionRuleImpl <em>Selection Rule</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see genericdesigndecision.genericDoF.impl.SelectionRuleImpl
		 * @see genericdesigndecision.genericDoF.impl.GenericDoFPackageImpl#getSelectionRule()
		 * @generated
		 */
		EClass SELECTION_RULE = eINSTANCE.getSelectionRule();

		/**
		 * The meta object literal for the '{@link genericdesigndecision.genericDoF.impl.DoFRepositoryImpl <em>Do FRepository</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see genericdesigndecision.genericDoF.impl.DoFRepositoryImpl
		 * @see genericdesigndecision.genericDoF.impl.GenericDoFPackageImpl#getDoFRepository()
		 * @generated
		 */
		EClass DO_FREPOSITORY = eINSTANCE.getDoFRepository();

		/**
		 * The meta object literal for the '<em><b>Sdofs</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DO_FREPOSITORY__SDOFS = eINSTANCE.getDoFRepository_Sdofs();

		/**
		 * The meta object literal for the '<em><b>Delete SDo F</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DO_FREPOSITORY___DELETE_SDO_F__SPECIFICDOF = eINSTANCE.getDoFRepository__DeleteSDoF__SpecificDoF();

		/**
		 * The meta object literal for the '<em><b>Get SDo F</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DO_FREPOSITORY___GET_SDO_F__STRING = eINSTANCE.getDoFRepository__GetSDoF__String();

		/**
		 * The meta object literal for the '{@link genericdesigndecision.genericDoF.impl.InstanceSelectionRuleImpl <em>Instance Selection Rule</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see genericdesigndecision.genericDoF.impl.InstanceSelectionRuleImpl
		 * @see genericdesigndecision.genericDoF.impl.GenericDoFPackageImpl#getInstanceSelectionRule()
		 * @generated
		 */
		EClass INSTANCE_SELECTION_RULE = eINSTANCE.getInstanceSelectionRule();

		/**
		 * The meta object literal for the '<em><b>Context Instance</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INSTANCE_SELECTION_RULE__CONTEXT_INSTANCE = eINSTANCE.getInstanceSelectionRule_ContextInstance();

		/**
		 * The meta object literal for the '{@link genericdesigndecision.genericDoF.impl.StaticSelectionRuleImpl <em>Static Selection Rule</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see genericdesigndecision.genericDoF.impl.StaticSelectionRuleImpl
		 * @see genericdesigndecision.genericDoF.impl.GenericDoFPackageImpl#getStaticSelectionRule()
		 * @generated
		 */
		EClass STATIC_SELECTION_RULE = eINSTANCE.getStaticSelectionRule();

		/**
		 * The meta object literal for the '{@link genericdesigndecision.genericDoF.impl.ADegreeOfFreedomImpl <em>ADegree Of Freedom</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see genericdesigndecision.genericDoF.impl.ADegreeOfFreedomImpl
		 * @see genericdesigndecision.genericDoF.impl.GenericDoFPackageImpl#getADegreeOfFreedom()
		 * @generated
		 */
		EClass ADEGREE_OF_FREEDOM = eINSTANCE.getADegreeOfFreedom();

		/**
		 * The meta object literal for the '<em><b>Added Elements</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ADEGREE_OF_FREEDOM__ADDED_ELEMENTS = eINSTANCE.getADegreeOfFreedom_AddedElements();

		/**
		 * The meta object literal for the '<em><b>Changeable Element Descriptions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ADEGREE_OF_FREEDOM__CHANGEABLE_ELEMENT_DESCRIPTIONS = eINSTANCE.getADegreeOfFreedom_ChangeableElementDescriptions();

		/**
		 * The meta object literal for the '<em><b>Interaction Constraints</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ADEGREE_OF_FREEDOM__INTERACTION_CONSTRAINTS = eINSTANCE.getADegreeOfFreedom_InteractionConstraints();

		/**
		 * The meta object literal for the '<em><b>Primary Changeable</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ADEGREE_OF_FREEDOM__PRIMARY_CHANGEABLE = eINSTANCE.getADegreeOfFreedom_PrimaryChangeable();

		/**
		 * The meta object literal for the '<em><b>Primary Changed</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ADEGREE_OF_FREEDOM__PRIMARY_CHANGED = eINSTANCE.getADegreeOfFreedom_PrimaryChanged();

		/**
		 * The meta object literal for the '<em><b>Changeable Elements</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ADEGREE_OF_FREEDOM__CHANGEABLE_ELEMENTS = eINSTANCE.getADegreeOfFreedom_ChangeableElements();

		/**
		 * The meta object literal for the '<em><b>Create Random Choice</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ADEGREE_OF_FREEDOM___CREATE_RANDOM_CHOICE = eINSTANCE.getADegreeOfFreedom__CreateRandomChoice();

		/**
		 * The meta object literal for the '<em><b>Determine Initial Choice</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ADEGREE_OF_FREEDOM___DETERMINE_INITIAL_CHOICE = eINSTANCE.getADegreeOfFreedom__DetermineInitialChoice();

		/**
		 * The meta object literal for the '<em><b>Create Choice</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ADEGREE_OF_FREEDOM___CREATE_CHOICE = eINSTANCE.getADegreeOfFreedom__CreateChoice();

		/**
		 * The meta object literal for the '{@link genericdesigndecision.genericDoF.impl.AClassAsReferenceDegreeImpl <em>AClass As Reference Degree</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see genericdesigndecision.genericDoF.impl.AClassAsReferenceDegreeImpl
		 * @see genericdesigndecision.genericDoF.impl.GenericDoFPackageImpl#getAClassAsReferenceDegree()
		 * @generated
		 */
		EClass ACLASS_AS_REFERENCE_DEGREE = eINSTANCE.getAClassAsReferenceDegree();

		/**
		 * The meta object literal for the '{@link genericdesigndecision.genericDoF.impl.AClassDegreeImpl <em>AClass Degree</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see genericdesigndecision.genericDoF.impl.AClassDegreeImpl
		 * @see genericdesigndecision.genericDoF.impl.GenericDoFPackageImpl#getAClassDegree()
		 * @generated
		 */
		EClass ACLASS_DEGREE = eINSTANCE.getAClassDegree();

		/**
		 * The meta object literal for the '<em><b>Class Design Options</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACLASS_DEGREE__CLASS_DESIGN_OPTIONS = eINSTANCE.getAClassDegree_ClassDesignOptions();

		/**
		 * The meta object literal for the '<em><b>Create Random Choice</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ACLASS_DEGREE___CREATE_RANDOM_CHOICE = eINSTANCE.getAClassDegree__CreateRandomChoice();

		/**
		 * The meta object literal for the '{@link genericdesigndecision.genericDoF.impl.AClassWithCopyDegreeImpl <em>AClass With Copy Degree</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see genericdesigndecision.genericDoF.impl.AClassWithCopyDegreeImpl
		 * @see genericdesigndecision.genericDoF.impl.GenericDoFPackageImpl#getAClassWithCopyDegree()
		 * @generated
		 */
		EClass ACLASS_WITH_COPY_DEGREE = eINSTANCE.getAClassWithCopyDegree();

		/**
		 * The meta object literal for the '{@link genericdesigndecision.genericDoF.impl.AContinuousRangeDegreeImpl <em>AContinuous Range Degree</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see genericdesigndecision.genericDoF.impl.AContinuousRangeDegreeImpl
		 * @see genericdesigndecision.genericDoF.impl.GenericDoFPackageImpl#getAContinuousRangeDegree()
		 * @generated
		 */
		EClass ACONTINUOUS_RANGE_DEGREE = eINSTANCE.getAContinuousRangeDegree();

		/**
		 * The meta object literal for the '<em><b>To</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACONTINUOUS_RANGE_DEGREE__TO = eINSTANCE.getAContinuousRangeDegree_To();

		/**
		 * The meta object literal for the '<em><b>From</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACONTINUOUS_RANGE_DEGREE__FROM = eINSTANCE.getAContinuousRangeDegree_From();

		/**
		 * The meta object literal for the '<em><b>Create Random Choice</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ACONTINUOUS_RANGE_DEGREE___CREATE_RANDOM_CHOICE = eINSTANCE.getAContinuousRangeDegree__CreateRandomChoice();

		/**
		 * The meta object literal for the '{@link genericdesigndecision.genericDoF.impl.ARangeDegreeImpl <em>ARange Degree</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see genericdesigndecision.genericDoF.impl.ARangeDegreeImpl
		 * @see genericdesigndecision.genericDoF.impl.GenericDoFPackageImpl#getARangeDegree()
		 * @generated
		 */
		EClass ARANGE_DEGREE = eINSTANCE.getARangeDegree();

		/**
		 * The meta object literal for the '<em><b>Upper Bound Included</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARANGE_DEGREE__UPPER_BOUND_INCLUDED = eINSTANCE.getARangeDegree_UpperBoundIncluded();

		/**
		 * The meta object literal for the '<em><b>Lower Bound Included</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARANGE_DEGREE__LOWER_BOUND_INCLUDED = eINSTANCE.getARangeDegree_LowerBoundIncluded();

		/**
		 * The meta object literal for the '<em><b>Number Of Steps</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARANGE_DEGREE__NUMBER_OF_STEPS = eINSTANCE.getARangeDegree_NumberOfSteps();

		/**
		 * The meta object literal for the '{@link genericdesigndecision.genericDoF.impl.ADataTypeDegreeImpl <em>AData Type Degree</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see genericdesigndecision.genericDoF.impl.ADataTypeDegreeImpl
		 * @see genericdesigndecision.genericDoF.impl.GenericDoFPackageImpl#getADataTypeDegree()
		 * @generated
		 */
		EClass ADATA_TYPE_DEGREE = eINSTANCE.getADataTypeDegree();

		/**
		 * The meta object literal for the '<em><b>Create Random Choice</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ADATA_TYPE_DEGREE___CREATE_RANDOM_CHOICE = eINSTANCE.getADataTypeDegree__CreateRandomChoice();

		/**
		 * The meta object literal for the '{@link genericdesigndecision.genericDoF.impl.ADiscreteDegreeImpl <em>ADiscrete Degree</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see genericdesigndecision.genericDoF.impl.ADiscreteDegreeImpl
		 * @see genericdesigndecision.genericDoF.impl.GenericDoFPackageImpl#getADiscreteDegree()
		 * @generated
		 */
		EClass ADISCRETE_DEGREE = eINSTANCE.getADiscreteDegree();

		/**
		 * The meta object literal for the '<em><b>Create Random Choice</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ADISCRETE_DEGREE___CREATE_RANDOM_CHOICE = eINSTANCE.getADiscreteDegree__CreateRandomChoice();

		/**
		 * The meta object literal for the '{@link genericdesigndecision.genericDoF.impl.ADiscreteRangeDegreeImpl <em>ADiscrete Range Degree</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see genericdesigndecision.genericDoF.impl.ADiscreteRangeDegreeImpl
		 * @see genericdesigndecision.genericDoF.impl.GenericDoFPackageImpl#getADiscreteRangeDegree()
		 * @generated
		 */
		EClass ADISCRETE_RANGE_DEGREE = eINSTANCE.getADiscreteRangeDegree();

		/**
		 * The meta object literal for the '<em><b>To</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ADISCRETE_RANGE_DEGREE__TO = eINSTANCE.getADiscreteRangeDegree_To();

		/**
		 * The meta object literal for the '<em><b>From</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ADISCRETE_RANGE_DEGREE__FROM = eINSTANCE.getADiscreteRangeDegree_From();

		/**
		 * The meta object literal for the '{@link genericdesigndecision.genericDoF.impl.AEnumDegreeImpl <em>AEnum Degree</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see genericdesigndecision.genericDoF.impl.AEnumDegreeImpl
		 * @see genericdesigndecision.genericDoF.impl.GenericDoFPackageImpl#getAEnumDegree()
		 * @generated
		 */
		EClass AENUM_DEGREE = eINSTANCE.getAEnumDegree();

		/**
		 * The meta object literal for the '<em><b>Enumeration</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AENUM_DEGREE__ENUMERATION = eINSTANCE.getAEnumDegree_Enumeration();

		/**
		 * The meta object literal for the '{@link genericdesigndecision.genericDoF.impl.AUnorderedDegreeImpl <em>AUnordered Degree</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see genericdesigndecision.genericDoF.impl.AUnorderedDegreeImpl
		 * @see genericdesigndecision.genericDoF.impl.GenericDoFPackageImpl#getAUnorderedDegree()
		 * @generated
		 */
		EClass AUNORDERED_DEGREE = eINSTANCE.getAUnorderedDegree();

		/**
		 * The meta object literal for the '{@link genericdesigndecision.genericDoF.impl.AOrderedDataTypeDegreeImpl <em>AOrdered Data Type Degree</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see genericdesigndecision.genericDoF.impl.AOrderedDataTypeDegreeImpl
		 * @see genericdesigndecision.genericDoF.impl.GenericDoFPackageImpl#getAOrderedDataTypeDegree()
		 * @generated
		 */
		EClass AORDERED_DATA_TYPE_DEGREE = eINSTANCE.getAOrderedDataTypeDegree();

		/**
		 * The meta object literal for the '{@link genericdesigndecision.genericDoF.impl.AOrderedIntegerDegreeImpl <em>AOrdered Integer Degree</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see genericdesigndecision.genericDoF.impl.AOrderedIntegerDegreeImpl
		 * @see genericdesigndecision.genericDoF.impl.GenericDoFPackageImpl#getAOrderedIntegerDegree()
		 * @generated
		 */
		EClass AORDERED_INTEGER_DEGREE = eINSTANCE.getAOrderedIntegerDegree();

		/**
		 * The meta object literal for the '<em><b>List Of Integers</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AORDERED_INTEGER_DEGREE__LIST_OF_INTEGERS = eINSTANCE.getAOrderedIntegerDegree_ListOfIntegers();

		/**
		 * The meta object literal for the '{@link genericdesigndecision.genericDoF.impl.AStringSetDegreeImpl <em>AString Set Degree</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see genericdesigndecision.genericDoF.impl.AStringSetDegreeImpl
		 * @see genericdesigndecision.genericDoF.impl.GenericDoFPackageImpl#getAStringSetDegree()
		 * @generated
		 */
		EClass ASTRING_SET_DEGREE = eINSTANCE.getAStringSetDegree();

		/**
		 * The meta object literal for the '<em><b>String Values</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ASTRING_SET_DEGREE__STRING_VALUES = eINSTANCE.getAStringSetDegree_StringValues();

	}

} //GenericDoFPackage
