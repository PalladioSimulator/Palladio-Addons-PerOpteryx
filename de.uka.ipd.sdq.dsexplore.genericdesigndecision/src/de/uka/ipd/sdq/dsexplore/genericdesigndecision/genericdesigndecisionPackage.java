/**
 */
package de.uka.ipd.sdq.dsexplore.genericdesigndecision;

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
 * <!-- begin-model-doc -->
 * The DesignDecisions metamodel represents degrees of freedom that can be exploited for optimisation.
 * 
 * The core idea is each degree of freedom can be represented by a DegreeOfFreedom element. Each DegreeOfFreedom has two parts: It links a model element that is the changeable entity in this DegreeOfFreedom, and it specifies a Domain of possible values that the model element can take. 
 * 
 * The actual making of a decision is represented in the Choice element. For a specific candidate architecture, one Choice for each DegreeOfFreedom in the Problem as to be made. The Choice contains a reference to the DegreeOfFreedom that it decides and a reference to a value from the DegreeOfFreedom's Domain that represent the selected value.  See the diagram "Design and Choice" for an overview of DegreeOfFreedom, Domain and Choice.
 * 
 * All of the above mentioned elements are abstract and are subclassed for the different generic degrees of freedom. For example, the degree of freedom of "component allocation" is represented in the AllocationDegree. See the documentation of each subclass of design decision for details. The diagram AssembledComponentDegree visualises the subclassing for the example degree of freedom of "component selection". 
 * 
 * 
 * <!-- end-model-doc -->
 * @see de.uka.ipd.sdq.dsexplore.genericdesigndecision.genericdesigndecisionFactory
 * @model kind="package"
 * @generated
 */
public interface genericdesigndecisionPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "genericdesigndecision";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://sdq.ipd.uka.de/GenericDesignDecision/";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "genericdesigndecision";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	genericdesigndecisionPackage eINSTANCE = de.uka.ipd.sdq.dsexplore.genericdesigndecision.impl.genericdesigndecisionPackageImpl.init();

	/**
	 * The meta object id for the '{@link de.uka.ipd.sdq.dsexplore.genericdesigndecision.impl.ChoiceImpl <em>Choice</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uka.ipd.sdq.dsexplore.genericdesigndecision.impl.ChoiceImpl
	 * @see de.uka.ipd.sdq.dsexplore.genericdesigndecision.impl.genericdesigndecisionPackageImpl#getChoice()
	 * @generated
	 */
	int CHOICE = 1;

	/**
	 * The feature id for the '<em><b>Is Active</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE__IS_ACTIVE = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE__VALUE = 1;

	/**
	 * The feature id for the '<em><b>Degree Of Freedom Instance</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE__DEGREE_OF_FREEDOM_INSTANCE = 2;

	/**
	 * The number of structural features of the '<em>Choice</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Choice</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.uka.ipd.sdq.dsexplore.genericdesigndecision.impl.DiscreteRangeChoiceImpl <em>Discrete Range Choice</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uka.ipd.sdq.dsexplore.genericdesigndecision.impl.DiscreteRangeChoiceImpl
	 * @see de.uka.ipd.sdq.dsexplore.genericdesigndecision.impl.genericdesigndecisionPackageImpl#getDiscreteRangeChoice()
	 * @generated
	 */
	int DISCRETE_RANGE_CHOICE = 0;

	/**
	 * The feature id for the '<em><b>Is Active</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCRETE_RANGE_CHOICE__IS_ACTIVE = CHOICE__IS_ACTIVE;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCRETE_RANGE_CHOICE__VALUE = CHOICE__VALUE;

	/**
	 * The feature id for the '<em><b>Degree Of Freedom Instance</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCRETE_RANGE_CHOICE__DEGREE_OF_FREEDOM_INSTANCE = CHOICE__DEGREE_OF_FREEDOM_INSTANCE;

	/**
	 * The feature id for the '<em><b>Chosen Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCRETE_RANGE_CHOICE__CHOSEN_VALUE = CHOICE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Discrete Range Choice</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCRETE_RANGE_CHOICE_FEATURE_COUNT = CHOICE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Discrete Range Choice</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCRETE_RANGE_CHOICE_OPERATION_COUNT = CHOICE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.uka.ipd.sdq.dsexplore.genericdesigndecision.impl.DegreeOfFreedomInstanceImpl <em>Degree Of Freedom Instance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uka.ipd.sdq.dsexplore.genericdesigndecision.impl.DegreeOfFreedomInstanceImpl
	 * @see de.uka.ipd.sdq.dsexplore.genericdesigndecision.impl.genericdesigndecisionPackageImpl#getDegreeOfFreedomInstance()
	 * @generated
	 */
	int DEGREE_OF_FREEDOM_INSTANCE = 2;

	/**
	 * The feature id for the '<em><b>Primary Changed</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEGREE_OF_FREEDOM_INSTANCE__PRIMARY_CHANGED = 0;

	/**
	 * The feature id for the '<em><b>Dof</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEGREE_OF_FREEDOM_INSTANCE__DOF = 1;

	/**
	 * The feature id for the '<em><b>Changeable Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEGREE_OF_FREEDOM_INSTANCE__CHANGEABLE_ELEMENTS = 2;

	/**
	 * The number of structural features of the '<em>Degree Of Freedom Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEGREE_OF_FREEDOM_INSTANCE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Degree Of Freedom Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEGREE_OF_FREEDOM_INSTANCE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.uka.ipd.sdq.dsexplore.genericdesigndecision.impl.ClassChoiceImpl <em>Class Choice</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uka.ipd.sdq.dsexplore.genericdesigndecision.impl.ClassChoiceImpl
	 * @see de.uka.ipd.sdq.dsexplore.genericdesigndecision.impl.genericdesigndecisionPackageImpl#getClassChoice()
	 * @generated
	 */
	int CLASS_CHOICE = 3;

	/**
	 * The feature id for the '<em><b>Is Active</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_CHOICE__IS_ACTIVE = CHOICE__IS_ACTIVE;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_CHOICE__VALUE = CHOICE__VALUE;

	/**
	 * The feature id for the '<em><b>Degree Of Freedom Instance</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_CHOICE__DEGREE_OF_FREEDOM_INSTANCE = CHOICE__DEGREE_OF_FREEDOM_INSTANCE;

	/**
	 * The feature id for the '<em><b>Chosen Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_CHOICE__CHOSEN_VALUE = CHOICE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Class Choice</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_CHOICE_FEATURE_COUNT = CHOICE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Class Choice</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_CHOICE_OPERATION_COUNT = CHOICE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.uka.ipd.sdq.dsexplore.genericdesigndecision.impl.ContinousRangeChoiceImpl <em>Continous Range Choice</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uka.ipd.sdq.dsexplore.genericdesigndecision.impl.ContinousRangeChoiceImpl
	 * @see de.uka.ipd.sdq.dsexplore.genericdesigndecision.impl.genericdesigndecisionPackageImpl#getContinousRangeChoice()
	 * @generated
	 */
	int CONTINOUS_RANGE_CHOICE = 4;

	/**
	 * The feature id for the '<em><b>Is Active</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTINOUS_RANGE_CHOICE__IS_ACTIVE = CHOICE__IS_ACTIVE;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTINOUS_RANGE_CHOICE__VALUE = CHOICE__VALUE;

	/**
	 * The feature id for the '<em><b>Degree Of Freedom Instance</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTINOUS_RANGE_CHOICE__DEGREE_OF_FREEDOM_INSTANCE = CHOICE__DEGREE_OF_FREEDOM_INSTANCE;

	/**
	 * The feature id for the '<em><b>Chosen Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTINOUS_RANGE_CHOICE__CHOSEN_VALUE = CHOICE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Continous Range Choice</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTINOUS_RANGE_CHOICE_FEATURE_COUNT = CHOICE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Continous Range Choice</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTINOUS_RANGE_CHOICE_OPERATION_COUNT = CHOICE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.uka.ipd.sdq.dsexplore.genericdesigndecision.impl.DecisionSpaceImpl <em>Decision Space</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uka.ipd.sdq.dsexplore.genericdesigndecision.impl.DecisionSpaceImpl
	 * @see de.uka.ipd.sdq.dsexplore.genericdesigndecision.impl.genericdesigndecisionPackageImpl#getDecisionSpace()
	 * @generated
	 */
	int DECISION_SPACE = 5;

	/**
	 * The feature id for the '<em><b>Degrees Of Freedom</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECISION_SPACE__DEGREES_OF_FREEDOM = 0;

	/**
	 * The number of structural features of the '<em>Decision Space</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECISION_SPACE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Decision Space</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECISION_SPACE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.uka.ipd.sdq.dsexplore.genericdesigndecision.impl.CandidateImpl <em>Candidate</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uka.ipd.sdq.dsexplore.genericdesigndecision.impl.CandidateImpl
	 * @see de.uka.ipd.sdq.dsexplore.genericdesigndecision.impl.genericdesigndecisionPackageImpl#getCandidate()
	 * @generated
	 */
	int CANDIDATE = 6;

	/**
	 * The feature id for the '<em><b>Choices</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CANDIDATE__CHOICES = 0;

	/**
	 * The feature id for the '<em><b>Quality Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CANDIDATE__QUALITY_PROPERTY = 1;

	/**
	 * The number of structural features of the '<em>Candidate</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CANDIDATE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Candidate</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CANDIDATE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.uka.ipd.sdq.dsexplore.genericdesigndecision.impl.CandidatesImpl <em>Candidates</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uka.ipd.sdq.dsexplore.genericdesigndecision.impl.CandidatesImpl
	 * @see de.uka.ipd.sdq.dsexplore.genericdesigndecision.impl.genericdesigndecisionPackageImpl#getCandidates()
	 * @generated
	 */
	int CANDIDATES = 7;

	/**
	 * The feature id for the '<em><b>Candidate</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CANDIDATES__CANDIDATE = 0;

	/**
	 * The feature id for the '<em><b>Problem</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CANDIDATES__PROBLEM = 1;

	/**
	 * The number of structural features of the '<em>Candidates</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CANDIDATES_FEATURE_COUNT = 2;

	/**
	 * The operation id for the '<em>Number Of Choices Must Equal Number Of Decisions</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CANDIDATES___NUMBER_OF_CHOICES_MUST_EQUAL_NUMBER_OF_DECISIONS__DIAGNOSTICCHAIN_MAP = 0;

	/**
	 * The number of operations of the '<em>Candidates</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CANDIDATES_OPERATION_COUNT = 1;


	/**
	 * Returns the meta object for class '{@link de.uka.ipd.sdq.dsexplore.genericdesigndecision.DiscreteRangeChoice <em>Discrete Range Choice</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Discrete Range Choice</em>'.
	 * @see de.uka.ipd.sdq.dsexplore.genericdesigndecision.DiscreteRangeChoice
	 * @generated
	 */
	EClass getDiscreteRangeChoice();

	/**
	 * Returns the meta object for the attribute '{@link de.uka.ipd.sdq.dsexplore.genericdesigndecision.DiscreteRangeChoice#getChosenValue <em>Chosen Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Chosen Value</em>'.
	 * @see de.uka.ipd.sdq.dsexplore.genericdesigndecision.DiscreteRangeChoice#getChosenValue()
	 * @see #getDiscreteRangeChoice()
	 * @generated
	 */
	EAttribute getDiscreteRangeChoice_ChosenValue();

	/**
	 * Returns the meta object for class '{@link de.uka.ipd.sdq.dsexplore.genericdesigndecision.Choice <em>Choice</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Choice</em>'.
	 * @see de.uka.ipd.sdq.dsexplore.genericdesigndecision.Choice
	 * @generated
	 */
	EClass getChoice();

	/**
	 * Returns the meta object for the attribute '{@link de.uka.ipd.sdq.dsexplore.genericdesigndecision.Choice#isIsActive <em>Is Active</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Active</em>'.
	 * @see de.uka.ipd.sdq.dsexplore.genericdesigndecision.Choice#isIsActive()
	 * @see #getChoice()
	 * @generated
	 */
	EAttribute getChoice_IsActive();

	/**
	 * Returns the meta object for the attribute '{@link de.uka.ipd.sdq.dsexplore.genericdesigndecision.Choice#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see de.uka.ipd.sdq.dsexplore.genericdesigndecision.Choice#getValue()
	 * @see #getChoice()
	 * @generated
	 */
	EAttribute getChoice_Value();

	/**
	 * Returns the meta object for the reference '{@link de.uka.ipd.sdq.dsexplore.genericdesigndecision.Choice#getDegreeOfFreedomInstance <em>Degree Of Freedom Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Degree Of Freedom Instance</em>'.
	 * @see de.uka.ipd.sdq.dsexplore.genericdesigndecision.Choice#getDegreeOfFreedomInstance()
	 * @see #getChoice()
	 * @generated
	 */
	EReference getChoice_DegreeOfFreedomInstance();

	/**
	 * Returns the meta object for class '{@link de.uka.ipd.sdq.dsexplore.genericdesigndecision.DegreeOfFreedomInstance <em>Degree Of Freedom Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Degree Of Freedom Instance</em>'.
	 * @see de.uka.ipd.sdq.dsexplore.genericdesigndecision.DegreeOfFreedomInstance
	 * @generated
	 */
	EClass getDegreeOfFreedomInstance();

	/**
	 * Returns the meta object for the reference '{@link de.uka.ipd.sdq.dsexplore.genericdesigndecision.DegreeOfFreedomInstance#getPrimaryChanged <em>Primary Changed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Primary Changed</em>'.
	 * @see de.uka.ipd.sdq.dsexplore.genericdesigndecision.DegreeOfFreedomInstance#getPrimaryChanged()
	 * @see #getDegreeOfFreedomInstance()
	 * @generated
	 */
	EReference getDegreeOfFreedomInstance_PrimaryChanged();

	/**
	 * Returns the meta object for the reference '{@link de.uka.ipd.sdq.dsexplore.genericdesigndecision.DegreeOfFreedomInstance#getDof <em>Dof</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Dof</em>'.
	 * @see de.uka.ipd.sdq.dsexplore.genericdesigndecision.DegreeOfFreedomInstance#getDof()
	 * @see #getDegreeOfFreedomInstance()
	 * @generated
	 */
	EReference getDegreeOfFreedomInstance_Dof();

	/**
	 * Returns the meta object for the reference list '{@link de.uka.ipd.sdq.dsexplore.genericdesigndecision.DegreeOfFreedomInstance#getChangeableElements <em>Changeable Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Changeable Elements</em>'.
	 * @see de.uka.ipd.sdq.dsexplore.genericdesigndecision.DegreeOfFreedomInstance#getChangeableElements()
	 * @see #getDegreeOfFreedomInstance()
	 * @generated
	 */
	EReference getDegreeOfFreedomInstance_ChangeableElements();

	/**
	 * Returns the meta object for class '{@link de.uka.ipd.sdq.dsexplore.genericdesigndecision.ClassChoice <em>Class Choice</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Class Choice</em>'.
	 * @see de.uka.ipd.sdq.dsexplore.genericdesigndecision.ClassChoice
	 * @generated
	 */
	EClass getClassChoice();

	/**
	 * Returns the meta object for the reference '{@link de.uka.ipd.sdq.dsexplore.genericdesigndecision.ClassChoice#getChosenValue <em>Chosen Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Chosen Value</em>'.
	 * @see de.uka.ipd.sdq.dsexplore.genericdesigndecision.ClassChoice#getChosenValue()
	 * @see #getClassChoice()
	 * @generated
	 */
	EReference getClassChoice_ChosenValue();

	/**
	 * Returns the meta object for class '{@link de.uka.ipd.sdq.dsexplore.genericdesigndecision.ContinousRangeChoice <em>Continous Range Choice</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Continous Range Choice</em>'.
	 * @see de.uka.ipd.sdq.dsexplore.genericdesigndecision.ContinousRangeChoice
	 * @generated
	 */
	EClass getContinousRangeChoice();

	/**
	 * Returns the meta object for the attribute '{@link de.uka.ipd.sdq.dsexplore.genericdesigndecision.ContinousRangeChoice#getChosenValue <em>Chosen Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Chosen Value</em>'.
	 * @see de.uka.ipd.sdq.dsexplore.genericdesigndecision.ContinousRangeChoice#getChosenValue()
	 * @see #getContinousRangeChoice()
	 * @generated
	 */
	EAttribute getContinousRangeChoice_ChosenValue();

	/**
	 * Returns the meta object for class '{@link de.uka.ipd.sdq.dsexplore.genericdesigndecision.DecisionSpace <em>Decision Space</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Decision Space</em>'.
	 * @see de.uka.ipd.sdq.dsexplore.genericdesigndecision.DecisionSpace
	 * @generated
	 */
	EClass getDecisionSpace();

	/**
	 * Returns the meta object for the containment reference list '{@link de.uka.ipd.sdq.dsexplore.genericdesigndecision.DecisionSpace#getDegreesOfFreedom <em>Degrees Of Freedom</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Degrees Of Freedom</em>'.
	 * @see de.uka.ipd.sdq.dsexplore.genericdesigndecision.DecisionSpace#getDegreesOfFreedom()
	 * @see #getDecisionSpace()
	 * @generated
	 */
	EReference getDecisionSpace_DegreesOfFreedom();

	/**
	 * Returns the meta object for class '{@link de.uka.ipd.sdq.dsexplore.genericdesigndecision.Candidate <em>Candidate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Candidate</em>'.
	 * @see de.uka.ipd.sdq.dsexplore.genericdesigndecision.Candidate
	 * @generated
	 */
	EClass getCandidate();

	/**
	 * Returns the meta object for the containment reference list '{@link de.uka.ipd.sdq.dsexplore.genericdesigndecision.Candidate#getChoices <em>Choices</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Choices</em>'.
	 * @see de.uka.ipd.sdq.dsexplore.genericdesigndecision.Candidate#getChoices()
	 * @see #getCandidate()
	 * @generated
	 */
	EReference getCandidate_Choices();

	/**
	 * Returns the meta object for the containment reference list '{@link de.uka.ipd.sdq.dsexplore.genericdesigndecision.Candidate#getQualityProperty <em>Quality Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Quality Property</em>'.
	 * @see de.uka.ipd.sdq.dsexplore.genericdesigndecision.Candidate#getQualityProperty()
	 * @see #getCandidate()
	 * @generated
	 */
	EReference getCandidate_QualityProperty();

	/**
	 * Returns the meta object for class '{@link de.uka.ipd.sdq.dsexplore.genericdesigndecision.Candidates <em>Candidates</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Candidates</em>'.
	 * @see de.uka.ipd.sdq.dsexplore.genericdesigndecision.Candidates
	 * @generated
	 */
	EClass getCandidates();

	/**
	 * Returns the meta object for the containment reference list '{@link de.uka.ipd.sdq.dsexplore.genericdesigndecision.Candidates#getCandidate <em>Candidate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Candidate</em>'.
	 * @see de.uka.ipd.sdq.dsexplore.genericdesigndecision.Candidates#getCandidate()
	 * @see #getCandidates()
	 * @generated
	 */
	EReference getCandidates_Candidate();

	/**
	 * Returns the meta object for the reference '{@link de.uka.ipd.sdq.dsexplore.genericdesigndecision.Candidates#getProblem <em>Problem</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Problem</em>'.
	 * @see de.uka.ipd.sdq.dsexplore.genericdesigndecision.Candidates#getProblem()
	 * @see #getCandidates()
	 * @generated
	 */
	EReference getCandidates_Problem();

	/**
	 * Returns the meta object for the '{@link de.uka.ipd.sdq.dsexplore.genericdesigndecision.Candidates#numberOfChoicesMustEqualNumberOfDecisions(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Number Of Choices Must Equal Number Of Decisions</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Number Of Choices Must Equal Number Of Decisions</em>' operation.
	 * @see de.uka.ipd.sdq.dsexplore.genericdesigndecision.Candidates#numberOfChoicesMustEqualNumberOfDecisions(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getCandidates__NumberOfChoicesMustEqualNumberOfDecisions__DiagnosticChain_Map();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	genericdesigndecisionFactory getgenericdesigndecisionFactory();

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
		 * The meta object literal for the '{@link de.uka.ipd.sdq.dsexplore.genericdesigndecision.impl.DiscreteRangeChoiceImpl <em>Discrete Range Choice</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uka.ipd.sdq.dsexplore.genericdesigndecision.impl.DiscreteRangeChoiceImpl
		 * @see de.uka.ipd.sdq.dsexplore.genericdesigndecision.impl.genericdesigndecisionPackageImpl#getDiscreteRangeChoice()
		 * @generated
		 */
		EClass DISCRETE_RANGE_CHOICE = eINSTANCE.getDiscreteRangeChoice();

		/**
		 * The meta object literal for the '<em><b>Chosen Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DISCRETE_RANGE_CHOICE__CHOSEN_VALUE = eINSTANCE.getDiscreteRangeChoice_ChosenValue();

		/**
		 * The meta object literal for the '{@link de.uka.ipd.sdq.dsexplore.genericdesigndecision.impl.ChoiceImpl <em>Choice</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uka.ipd.sdq.dsexplore.genericdesigndecision.impl.ChoiceImpl
		 * @see de.uka.ipd.sdq.dsexplore.genericdesigndecision.impl.genericdesigndecisionPackageImpl#getChoice()
		 * @generated
		 */
		EClass CHOICE = eINSTANCE.getChoice();

		/**
		 * The meta object literal for the '<em><b>Is Active</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHOICE__IS_ACTIVE = eINSTANCE.getChoice_IsActive();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHOICE__VALUE = eINSTANCE.getChoice_Value();

		/**
		 * The meta object literal for the '<em><b>Degree Of Freedom Instance</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CHOICE__DEGREE_OF_FREEDOM_INSTANCE = eINSTANCE.getChoice_DegreeOfFreedomInstance();

		/**
		 * The meta object literal for the '{@link de.uka.ipd.sdq.dsexplore.genericdesigndecision.impl.DegreeOfFreedomInstanceImpl <em>Degree Of Freedom Instance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uka.ipd.sdq.dsexplore.genericdesigndecision.impl.DegreeOfFreedomInstanceImpl
		 * @see de.uka.ipd.sdq.dsexplore.genericdesigndecision.impl.genericdesigndecisionPackageImpl#getDegreeOfFreedomInstance()
		 * @generated
		 */
		EClass DEGREE_OF_FREEDOM_INSTANCE = eINSTANCE.getDegreeOfFreedomInstance();

		/**
		 * The meta object literal for the '<em><b>Primary Changed</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEGREE_OF_FREEDOM_INSTANCE__PRIMARY_CHANGED = eINSTANCE.getDegreeOfFreedomInstance_PrimaryChanged();

		/**
		 * The meta object literal for the '<em><b>Dof</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEGREE_OF_FREEDOM_INSTANCE__DOF = eINSTANCE.getDegreeOfFreedomInstance_Dof();

		/**
		 * The meta object literal for the '<em><b>Changeable Elements</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEGREE_OF_FREEDOM_INSTANCE__CHANGEABLE_ELEMENTS = eINSTANCE.getDegreeOfFreedomInstance_ChangeableElements();

		/**
		 * The meta object literal for the '{@link de.uka.ipd.sdq.dsexplore.genericdesigndecision.impl.ClassChoiceImpl <em>Class Choice</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uka.ipd.sdq.dsexplore.genericdesigndecision.impl.ClassChoiceImpl
		 * @see de.uka.ipd.sdq.dsexplore.genericdesigndecision.impl.genericdesigndecisionPackageImpl#getClassChoice()
		 * @generated
		 */
		EClass CLASS_CHOICE = eINSTANCE.getClassChoice();

		/**
		 * The meta object literal for the '<em><b>Chosen Value</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASS_CHOICE__CHOSEN_VALUE = eINSTANCE.getClassChoice_ChosenValue();

		/**
		 * The meta object literal for the '{@link de.uka.ipd.sdq.dsexplore.genericdesigndecision.impl.ContinousRangeChoiceImpl <em>Continous Range Choice</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uka.ipd.sdq.dsexplore.genericdesigndecision.impl.ContinousRangeChoiceImpl
		 * @see de.uka.ipd.sdq.dsexplore.genericdesigndecision.impl.genericdesigndecisionPackageImpl#getContinousRangeChoice()
		 * @generated
		 */
		EClass CONTINOUS_RANGE_CHOICE = eINSTANCE.getContinousRangeChoice();

		/**
		 * The meta object literal for the '<em><b>Chosen Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTINOUS_RANGE_CHOICE__CHOSEN_VALUE = eINSTANCE.getContinousRangeChoice_ChosenValue();

		/**
		 * The meta object literal for the '{@link de.uka.ipd.sdq.dsexplore.genericdesigndecision.impl.DecisionSpaceImpl <em>Decision Space</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uka.ipd.sdq.dsexplore.genericdesigndecision.impl.DecisionSpaceImpl
		 * @see de.uka.ipd.sdq.dsexplore.genericdesigndecision.impl.genericdesigndecisionPackageImpl#getDecisionSpace()
		 * @generated
		 */
		EClass DECISION_SPACE = eINSTANCE.getDecisionSpace();

		/**
		 * The meta object literal for the '<em><b>Degrees Of Freedom</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DECISION_SPACE__DEGREES_OF_FREEDOM = eINSTANCE.getDecisionSpace_DegreesOfFreedom();

		/**
		 * The meta object literal for the '{@link de.uka.ipd.sdq.dsexplore.genericdesigndecision.impl.CandidateImpl <em>Candidate</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uka.ipd.sdq.dsexplore.genericdesigndecision.impl.CandidateImpl
		 * @see de.uka.ipd.sdq.dsexplore.genericdesigndecision.impl.genericdesigndecisionPackageImpl#getCandidate()
		 * @generated
		 */
		EClass CANDIDATE = eINSTANCE.getCandidate();

		/**
		 * The meta object literal for the '<em><b>Choices</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CANDIDATE__CHOICES = eINSTANCE.getCandidate_Choices();

		/**
		 * The meta object literal for the '<em><b>Quality Property</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CANDIDATE__QUALITY_PROPERTY = eINSTANCE.getCandidate_QualityProperty();

		/**
		 * The meta object literal for the '{@link de.uka.ipd.sdq.dsexplore.genericdesigndecision.impl.CandidatesImpl <em>Candidates</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uka.ipd.sdq.dsexplore.genericdesigndecision.impl.CandidatesImpl
		 * @see de.uka.ipd.sdq.dsexplore.genericdesigndecision.impl.genericdesigndecisionPackageImpl#getCandidates()
		 * @generated
		 */
		EClass CANDIDATES = eINSTANCE.getCandidates();

		/**
		 * The meta object literal for the '<em><b>Candidate</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CANDIDATES__CANDIDATE = eINSTANCE.getCandidates_Candidate();

		/**
		 * The meta object literal for the '<em><b>Problem</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CANDIDATES__PROBLEM = eINSTANCE.getCandidates_Problem();

		/**
		 * The meta object literal for the '<em><b>Number Of Choices Must Equal Number Of Decisions</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CANDIDATES___NUMBER_OF_CHOICES_MUST_EQUAL_NUMBER_OF_DECISIONS__DIAGNOSTICCHAIN_MAP = eINSTANCE.getCandidates__NumberOfChoicesMustEqualNumberOfDecisions__DiagnosticChain_Map();

	}

} //genericdesigndecisionPackage
