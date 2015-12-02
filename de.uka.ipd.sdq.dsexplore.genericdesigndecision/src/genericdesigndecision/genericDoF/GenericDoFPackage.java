/**
 */
package genericdesigndecision.genericDoF;

import org.eclipse.emf.ecore.EAttribute;
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
	 * The feature id for the '<em><b>Dofs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DO_FREPOSITORY__DOFS = 0;

	/**
	 * The number of structural features of the '<em>Do FRepository</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DO_FREPOSITORY_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Do FRepository</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DO_FREPOSITORY_OPERATION_COUNT = 0;

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
	 * The meta object id for the '{@link genericdesigndecision.genericDoF.impl.DegreeOfFreedomImpl <em>Degree Of Freedom</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see genericdesigndecision.genericDoF.impl.DegreeOfFreedomImpl
	 * @see genericdesigndecision.genericDoF.impl.GenericDoFPackageImpl#getDegreeOfFreedom()
	 * @generated
	 */
	int DEGREE_OF_FREEDOM = 9;

	/**
	 * The feature id for the '<em><b>Added Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEGREE_OF_FREEDOM__ADDED_ELEMENTS = 0;

	/**
	 * The feature id for the '<em><b>Changeable Element Descriptions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEGREE_OF_FREEDOM__CHANGEABLE_ELEMENT_DESCRIPTIONS = 1;

	/**
	 * The feature id for the '<em><b>Interaction Constraints</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEGREE_OF_FREEDOM__INTERACTION_CONSTRAINTS = 2;

	/**
	 * The feature id for the '<em><b>Primary Changeable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEGREE_OF_FREEDOM__PRIMARY_CHANGEABLE = 3;

	/**
	 * The feature id for the '<em><b>Primary Changed</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEGREE_OF_FREEDOM__PRIMARY_CHANGED = 4;

	/**
	 * The feature id for the '<em><b>Changeable Elements</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEGREE_OF_FREEDOM__CHANGEABLE_ELEMENTS = 5;

	/**
	 * The number of structural features of the '<em>Degree Of Freedom</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEGREE_OF_FREEDOM_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Degree Of Freedom</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEGREE_OF_FREEDOM_OPERATION_COUNT = 0;


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
	 * Returns the meta object for the containment reference list '{@link genericdesigndecision.genericDoF.DoFRepository#getDofs <em>Dofs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Dofs</em>'.
	 * @see genericdesigndecision.genericDoF.DoFRepository#getDofs()
	 * @see #getDoFRepository()
	 * @generated
	 */
	EReference getDoFRepository_Dofs();

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
	 * Returns the meta object for class '{@link genericdesigndecision.genericDoF.DegreeOfFreedom <em>Degree Of Freedom</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Degree Of Freedom</em>'.
	 * @see genericdesigndecision.genericDoF.DegreeOfFreedom
	 * @generated
	 */
	EClass getDegreeOfFreedom();

	/**
	 * Returns the meta object for the reference list '{@link genericdesigndecision.genericDoF.DegreeOfFreedom#getAddedElements <em>Added Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Added Elements</em>'.
	 * @see genericdesigndecision.genericDoF.DegreeOfFreedom#getAddedElements()
	 * @see #getDegreeOfFreedom()
	 * @generated
	 */
	EReference getDegreeOfFreedom_AddedElements();

	/**
	 * Returns the meta object for the containment reference list '{@link genericdesigndecision.genericDoF.DegreeOfFreedom#getChangeableElementDescriptions <em>Changeable Element Descriptions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Changeable Element Descriptions</em>'.
	 * @see genericdesigndecision.genericDoF.DegreeOfFreedom#getChangeableElementDescriptions()
	 * @see #getDegreeOfFreedom()
	 * @generated
	 */
	EReference getDegreeOfFreedom_ChangeableElementDescriptions();

	/**
	 * Returns the meta object for the reference list '{@link genericdesigndecision.genericDoF.DegreeOfFreedom#getInteractionConstraints <em>Interaction Constraints</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Interaction Constraints</em>'.
	 * @see genericdesigndecision.genericDoF.DegreeOfFreedom#getInteractionConstraints()
	 * @see #getDegreeOfFreedom()
	 * @generated
	 */
	EReference getDegreeOfFreedom_InteractionConstraints();

	/**
	 * Returns the meta object for the reference '{@link genericdesigndecision.genericDoF.DegreeOfFreedom#getPrimaryChangeable <em>Primary Changeable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Primary Changeable</em>'.
	 * @see genericdesigndecision.genericDoF.DegreeOfFreedom#getPrimaryChangeable()
	 * @see #getDegreeOfFreedom()
	 * @generated
	 */
	EReference getDegreeOfFreedom_PrimaryChangeable();

	/**
	 * Returns the meta object for the reference '{@link genericdesigndecision.genericDoF.DegreeOfFreedom#getPrimaryChanged <em>Primary Changed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Primary Changed</em>'.
	 * @see genericdesigndecision.genericDoF.DegreeOfFreedom#getPrimaryChanged()
	 * @see #getDegreeOfFreedom()
	 * @generated
	 */
	EReference getDegreeOfFreedom_PrimaryChanged();

	/**
	 * Returns the meta object for the reference '{@link genericdesigndecision.genericDoF.DegreeOfFreedom#getChangeableElements <em>Changeable Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Changeable Elements</em>'.
	 * @see genericdesigndecision.genericDoF.DegreeOfFreedom#getChangeableElements()
	 * @see #getDegreeOfFreedom()
	 * @generated
	 */
	EReference getDegreeOfFreedom_ChangeableElements();

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
		 * The meta object literal for the '<em><b>Dofs</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DO_FREPOSITORY__DOFS = eINSTANCE.getDoFRepository_Dofs();

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
		 * The meta object literal for the '{@link genericdesigndecision.genericDoF.impl.DegreeOfFreedomImpl <em>Degree Of Freedom</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see genericdesigndecision.genericDoF.impl.DegreeOfFreedomImpl
		 * @see genericdesigndecision.genericDoF.impl.GenericDoFPackageImpl#getDegreeOfFreedom()
		 * @generated
		 */
		EClass DEGREE_OF_FREEDOM = eINSTANCE.getDegreeOfFreedom();

		/**
		 * The meta object literal for the '<em><b>Added Elements</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEGREE_OF_FREEDOM__ADDED_ELEMENTS = eINSTANCE.getDegreeOfFreedom_AddedElements();

		/**
		 * The meta object literal for the '<em><b>Changeable Element Descriptions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEGREE_OF_FREEDOM__CHANGEABLE_ELEMENT_DESCRIPTIONS = eINSTANCE.getDegreeOfFreedom_ChangeableElementDescriptions();

		/**
		 * The meta object literal for the '<em><b>Interaction Constraints</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEGREE_OF_FREEDOM__INTERACTION_CONSTRAINTS = eINSTANCE.getDegreeOfFreedom_InteractionConstraints();

		/**
		 * The meta object literal for the '<em><b>Primary Changeable</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEGREE_OF_FREEDOM__PRIMARY_CHANGEABLE = eINSTANCE.getDegreeOfFreedom_PrimaryChangeable();

		/**
		 * The meta object literal for the '<em><b>Primary Changed</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEGREE_OF_FREEDOM__PRIMARY_CHANGED = eINSTANCE.getDegreeOfFreedom_PrimaryChanged();

		/**
		 * The meta object literal for the '<em><b>Changeable Elements</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEGREE_OF_FREEDOM__CHANGEABLE_ELEMENTS = eINSTANCE.getDegreeOfFreedom_ChangeableElements();

	}

} //GenericDoFPackage
