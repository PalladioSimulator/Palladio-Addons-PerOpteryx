/**
 */
package genericdesigndecision;

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
 * @see genericdesigndecision.GenericdesigndecisionFactory
 * @model kind="package"
 * @generated
 */
public interface GenericdesigndecisionPackage extends EPackage {
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
	GenericdesigndecisionPackage eINSTANCE = genericdesigndecision.impl.GenericdesigndecisionPackageImpl.init();

	/**
	 * The meta object id for the '{@link genericdesigndecision.impl.ChoiceImpl <em>Choice</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see genericdesigndecision.impl.ChoiceImpl
	 * @see genericdesigndecision.impl.GenericdesigndecisionPackageImpl#getChoice()
	 * @generated
	 */
	int CHOICE = 1;

	/**
	 * The feature id for the '<em><b>Active</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE__ACTIVE = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE__VALUE = 1;

	/**
	 * The feature id for the '<em><b>Dof Instance</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE__DOF_INSTANCE = 2;

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
	 * The meta object id for the '{@link genericdesigndecision.impl.DiscreteRangeChoiceImpl <em>Discrete Range Choice</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see genericdesigndecision.impl.DiscreteRangeChoiceImpl
	 * @see genericdesigndecision.impl.GenericdesigndecisionPackageImpl#getDiscreteRangeChoice()
	 * @generated
	 */
	int DISCRETE_RANGE_CHOICE = 0;

	/**
	 * The feature id for the '<em><b>Active</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCRETE_RANGE_CHOICE__ACTIVE = CHOICE__ACTIVE;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCRETE_RANGE_CHOICE__VALUE = CHOICE__VALUE;

	/**
	 * The feature id for the '<em><b>Dof Instance</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCRETE_RANGE_CHOICE__DOF_INSTANCE = CHOICE__DOF_INSTANCE;

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
	 * The meta object id for the '{@link genericdesigndecision.impl.ClassChoiceImpl <em>Class Choice</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see genericdesigndecision.impl.ClassChoiceImpl
	 * @see genericdesigndecision.impl.GenericdesigndecisionPackageImpl#getClassChoice()
	 * @generated
	 */
	int CLASS_CHOICE = 2;

	/**
	 * The feature id for the '<em><b>Active</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_CHOICE__ACTIVE = CHOICE__ACTIVE;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_CHOICE__VALUE = CHOICE__VALUE;

	/**
	 * The feature id for the '<em><b>Dof Instance</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_CHOICE__DOF_INSTANCE = CHOICE__DOF_INSTANCE;

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
	 * The meta object id for the '{@link genericdesigndecision.impl.ContinousRangeChoiceImpl <em>Continous Range Choice</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see genericdesigndecision.impl.ContinousRangeChoiceImpl
	 * @see genericdesigndecision.impl.GenericdesigndecisionPackageImpl#getContinousRangeChoice()
	 * @generated
	 */
	int CONTINOUS_RANGE_CHOICE = 3;

	/**
	 * The feature id for the '<em><b>Active</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTINOUS_RANGE_CHOICE__ACTIVE = CHOICE__ACTIVE;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTINOUS_RANGE_CHOICE__VALUE = CHOICE__VALUE;

	/**
	 * The feature id for the '<em><b>Dof Instance</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTINOUS_RANGE_CHOICE__DOF_INSTANCE = CHOICE__DOF_INSTANCE;

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
	 * The meta object id for the '{@link genericdesigndecision.impl.DecisionSpaceImpl <em>Decision Space</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see genericdesigndecision.impl.DecisionSpaceImpl
	 * @see genericdesigndecision.impl.GenericdesigndecisionPackageImpl#getDecisionSpace()
	 * @generated
	 */
	int DECISION_SPACE = 4;

	/**
	 * The feature id for the '<em><b>Dof Instances</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECISION_SPACE__DOF_INSTANCES = 0;

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
	 * The meta object id for the '{@link genericdesigndecision.impl.CandidateImpl <em>Candidate</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see genericdesigndecision.impl.CandidateImpl
	 * @see genericdesigndecision.impl.GenericdesigndecisionPackageImpl#getCandidate()
	 * @generated
	 */
	int CANDIDATE = 5;

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
	 * The meta object id for the '{@link genericdesigndecision.impl.CandidatesImpl <em>Candidates</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see genericdesigndecision.impl.CandidatesImpl
	 * @see genericdesigndecision.impl.GenericdesigndecisionPackageImpl#getCandidates()
	 * @generated
	 */
	int CANDIDATES = 6;

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
	 * The meta object id for the '{@link genericdesigndecision.impl.ADSEProblemImpl <em>ADSE Problem</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see genericdesigndecision.impl.ADSEProblemImpl
	 * @see genericdesigndecision.impl.GenericdesigndecisionPackageImpl#getADSEProblem()
	 * @generated
	 */
	int ADSE_PROBLEM = 7;

	/**
	 * The meta object id for the '{@link de.uka.ipd.sdq.dsexplore.opt4j.representation.DSEDecoder <em>DSE Decoder</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uka.ipd.sdq.dsexplore.opt4j.representation.DSEDecoder
	 * @see genericdesigndecision.impl.GenericdesigndecisionPackageImpl#getDSEDecoder()
	 * @generated
	 */
	int DSE_DECODER = 8;

	/**
	 * The number of structural features of the '<em>DSE Decoder</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSE_DECODER_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>DSE Decoder</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSE_DECODER_OPERATION_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Problem</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADSE_PROBLEM__PROBLEM = DSE_DECODER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Associated Metamodel</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADSE_PROBLEM__ASSOCIATED_METAMODEL = DSE_DECODER_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>ADSE Problem</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADSE_PROBLEM_FEATURE_COUNT = DSE_DECODER_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>ADSE Problem</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADSE_PROBLEM_OPERATION_COUNT = DSE_DECODER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.uka.ipd.sdq.dsexplore.gdof.GenomeToCandidateModelTransformation <em>Genome To Candidate Model Transformation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uka.ipd.sdq.dsexplore.gdof.GenomeToCandidateModelTransformation
	 * @see genericdesigndecision.impl.GenericdesigndecisionPackageImpl#getGenomeToCandidateModelTransformation()
	 * @generated
	 */
	int GENOME_TO_CANDIDATE_MODEL_TRANSFORMATION = 9;

	/**
	 * The number of structural features of the '<em>Genome To Candidate Model Transformation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENOME_TO_CANDIDATE_MODEL_TRANSFORMATION_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Genome To Candidate Model Transformation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENOME_TO_CANDIDATE_MODEL_TRANSFORMATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link genericdesigndecision.impl.AGenomeToCandidateModelTransformationImpl <em>AGenome To Candidate Model Transformation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see genericdesigndecision.impl.AGenomeToCandidateModelTransformationImpl
	 * @see genericdesigndecision.impl.GenericdesigndecisionPackageImpl#getAGenomeToCandidateModelTransformation()
	 * @generated
	 */
	int AGENOME_TO_CANDIDATE_MODEL_TRANSFORMATION = 10;

	/**
	 * The number of structural features of the '<em>AGenome To Candidate Model Transformation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENOME_TO_CANDIDATE_MODEL_TRANSFORMATION_FEATURE_COUNT = GENOME_TO_CANDIDATE_MODEL_TRANSFORMATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>AGenome To Candidate Model Transformation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENOME_TO_CANDIDATE_MODEL_TRANSFORMATION_OPERATION_COUNT = GENOME_TO_CANDIDATE_MODEL_TRANSFORMATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.opt4j.core.Phenotype <em>Phenotype</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.opt4j.core.Phenotype
	 * @see genericdesigndecision.impl.GenericdesigndecisionPackageImpl#getPhenotype()
	 * @generated
	 */
	int PHENOTYPE = 11;

	/**
	 * The number of structural features of the '<em>Phenotype</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHENOTYPE_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Phenotype</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHENOTYPE_OPERATION_COUNT = 0;

	/**
	 * Returns the meta object for class '{@link genericdesigndecision.DiscreteRangeChoice <em>Discrete Range Choice</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Discrete Range Choice</em>'.
	 * @see genericdesigndecision.DiscreteRangeChoice
	 * @generated
	 */
	EClass getDiscreteRangeChoice();

	/**
	 * Returns the meta object for the attribute '{@link genericdesigndecision.DiscreteRangeChoice#getChosenValue <em>Chosen Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Chosen Value</em>'.
	 * @see genericdesigndecision.DiscreteRangeChoice#getChosenValue()
	 * @see #getDiscreteRangeChoice()
	 * @generated
	 */
	EAttribute getDiscreteRangeChoice_ChosenValue();

	/**
	 * Returns the meta object for class '{@link genericdesigndecision.Choice <em>Choice</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Choice</em>'.
	 * @see genericdesigndecision.Choice
	 * @generated
	 */
	EClass getChoice();

	/**
	 * Returns the meta object for the attribute '{@link genericdesigndecision.Choice#isActive <em>Active</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Active</em>'.
	 * @see genericdesigndecision.Choice#isActive()
	 * @see #getChoice()
	 * @generated
	 */
	EAttribute getChoice_Active();

	/**
	 * Returns the meta object for the attribute '{@link genericdesigndecision.Choice#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see genericdesigndecision.Choice#getValue()
	 * @see #getChoice()
	 * @generated
	 */
	EAttribute getChoice_Value();

	/**
	 * Returns the meta object for the reference '{@link genericdesigndecision.Choice#getDofInstance <em>Dof Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Dof Instance</em>'.
	 * @see genericdesigndecision.Choice#getDofInstance()
	 * @see #getChoice()
	 * @generated
	 */
	EReference getChoice_DofInstance();

	/**
	 * Returns the meta object for class '{@link genericdesigndecision.ClassChoice <em>Class Choice</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Class Choice</em>'.
	 * @see genericdesigndecision.ClassChoice
	 * @generated
	 */
	EClass getClassChoice();

	/**
	 * Returns the meta object for the reference '{@link genericdesigndecision.ClassChoice#getChosenValue <em>Chosen Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Chosen Value</em>'.
	 * @see genericdesigndecision.ClassChoice#getChosenValue()
	 * @see #getClassChoice()
	 * @generated
	 */
	EReference getClassChoice_ChosenValue();

	/**
	 * Returns the meta object for class '{@link genericdesigndecision.ContinousRangeChoice <em>Continous Range Choice</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Continous Range Choice</em>'.
	 * @see genericdesigndecision.ContinousRangeChoice
	 * @generated
	 */
	EClass getContinousRangeChoice();

	/**
	 * Returns the meta object for the attribute '{@link genericdesigndecision.ContinousRangeChoice#getChosenValue <em>Chosen Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Chosen Value</em>'.
	 * @see genericdesigndecision.ContinousRangeChoice#getChosenValue()
	 * @see #getContinousRangeChoice()
	 * @generated
	 */
	EAttribute getContinousRangeChoice_ChosenValue();

	/**
	 * Returns the meta object for class '{@link genericdesigndecision.DecisionSpace <em>Decision Space</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Decision Space</em>'.
	 * @see genericdesigndecision.DecisionSpace
	 * @generated
	 */
	EClass getDecisionSpace();

	/**
	 * Returns the meta object for the containment reference list '{@link genericdesigndecision.DecisionSpace#getDofInstances <em>Dof Instances</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Dof Instances</em>'.
	 * @see genericdesigndecision.DecisionSpace#getDofInstances()
	 * @see #getDecisionSpace()
	 * @generated
	 */
	EReference getDecisionSpace_DofInstances();

	/**
	 * Returns the meta object for class '{@link genericdesigndecision.Candidate <em>Candidate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Candidate</em>'.
	 * @see genericdesigndecision.Candidate
	 * @generated
	 */
	EClass getCandidate();

	/**
	 * Returns the meta object for the containment reference list '{@link genericdesigndecision.Candidate#getChoices <em>Choices</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Choices</em>'.
	 * @see genericdesigndecision.Candidate#getChoices()
	 * @see #getCandidate()
	 * @generated
	 */
	EReference getCandidate_Choices();

	/**
	 * Returns the meta object for the containment reference list '{@link genericdesigndecision.Candidate#getQualityProperty <em>Quality Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Quality Property</em>'.
	 * @see genericdesigndecision.Candidate#getQualityProperty()
	 * @see #getCandidate()
	 * @generated
	 */
	EReference getCandidate_QualityProperty();

	/**
	 * Returns the meta object for class '{@link genericdesigndecision.Candidates <em>Candidates</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Candidates</em>'.
	 * @see genericdesigndecision.Candidates
	 * @generated
	 */
	EClass getCandidates();

	/**
	 * Returns the meta object for the containment reference list '{@link genericdesigndecision.Candidates#getCandidate <em>Candidate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Candidate</em>'.
	 * @see genericdesigndecision.Candidates#getCandidate()
	 * @see #getCandidates()
	 * @generated
	 */
	EReference getCandidates_Candidate();

	/**
	 * Returns the meta object for the reference '{@link genericdesigndecision.Candidates#getProblem <em>Problem</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Problem</em>'.
	 * @see genericdesigndecision.Candidates#getProblem()
	 * @see #getCandidates()
	 * @generated
	 */
	EReference getCandidates_Problem();

	/**
	 * Returns the meta object for the '{@link genericdesigndecision.Candidates#numberOfChoicesMustEqualNumberOfDecisions(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Number Of Choices Must Equal Number Of Decisions</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Number Of Choices Must Equal Number Of Decisions</em>' operation.
	 * @see genericdesigndecision.Candidates#numberOfChoicesMustEqualNumberOfDecisions(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getCandidates__NumberOfChoicesMustEqualNumberOfDecisions__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link genericdesigndecision.ADSEProblem <em>ADSE Problem</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ADSE Problem</em>'.
	 * @see genericdesigndecision.ADSEProblem
	 * @generated
	 */
	EClass getADSEProblem();

	/**
	 * Returns the meta object for the reference '{@link genericdesigndecision.ADSEProblem#getProblem <em>Problem</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Problem</em>'.
	 * @see genericdesigndecision.ADSEProblem#getProblem()
	 * @see #getADSEProblem()
	 * @generated
	 */
	EReference getADSEProblem_Problem();

	/**
	 * Returns the meta object for the reference '{@link genericdesigndecision.ADSEProblem#getAssociatedMetamodel <em>Associated Metamodel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Associated Metamodel</em>'.
	 * @see genericdesigndecision.ADSEProblem#getAssociatedMetamodel()
	 * @see #getADSEProblem()
	 * @generated
	 */
	EReference getADSEProblem_AssociatedMetamodel();

	/**
	 * Returns the meta object for class '{@link de.uka.ipd.sdq.dsexplore.opt4j.representation.DSEDecoder <em>DSE Decoder</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>DSE Decoder</em>'.
	 * @see de.uka.ipd.sdq.dsexplore.opt4j.representation.DSEDecoder
	 * @model instanceClass="de.uka.ipd.sdq.dsexplore.opt4j.representation.DSEDecoder" typeParameters="P" PBounds="genericdesigndecision.Phenotype"
	 * @generated
	 */
	EClass getDSEDecoder();

	/**
	 * Returns the meta object for class '{@link de.uka.ipd.sdq.dsexplore.gdof.GenomeToCandidateModelTransformation <em>Genome To Candidate Model Transformation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Genome To Candidate Model Transformation</em>'.
	 * @see de.uka.ipd.sdq.dsexplore.gdof.GenomeToCandidateModelTransformation
	 * @model instanceClass="de.uka.ipd.sdq.dsexplore.gdof.GenomeToCandidateModelTransformation"
	 * @generated
	 */
	EClass getGenomeToCandidateModelTransformation();

	/**
	 * Returns the meta object for class '{@link genericdesigndecision.AGenomeToCandidateModelTransformation <em>AGenome To Candidate Model Transformation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>AGenome To Candidate Model Transformation</em>'.
	 * @see genericdesigndecision.AGenomeToCandidateModelTransformation
	 * @generated
	 */
	EClass getAGenomeToCandidateModelTransformation();

	/**
	 * Returns the meta object for class '{@link org.opt4j.core.Phenotype <em>Phenotype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Phenotype</em>'.
	 * @see org.opt4j.core.Phenotype
	 * @model instanceClass="org.opt4j.core.Phenotype"
	 * @generated
	 */
	EClass getPhenotype();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	GenericdesigndecisionFactory getGenericdesigndecisionFactory();

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
		 * The meta object literal for the '{@link genericdesigndecision.impl.DiscreteRangeChoiceImpl <em>Discrete Range Choice</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see genericdesigndecision.impl.DiscreteRangeChoiceImpl
		 * @see genericdesigndecision.impl.GenericdesigndecisionPackageImpl#getDiscreteRangeChoice()
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
		 * The meta object literal for the '{@link genericdesigndecision.impl.ChoiceImpl <em>Choice</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see genericdesigndecision.impl.ChoiceImpl
		 * @see genericdesigndecision.impl.GenericdesigndecisionPackageImpl#getChoice()
		 * @generated
		 */
		EClass CHOICE = eINSTANCE.getChoice();

		/**
		 * The meta object literal for the '<em><b>Active</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHOICE__ACTIVE = eINSTANCE.getChoice_Active();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHOICE__VALUE = eINSTANCE.getChoice_Value();

		/**
		 * The meta object literal for the '<em><b>Dof Instance</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CHOICE__DOF_INSTANCE = eINSTANCE.getChoice_DofInstance();

		/**
		 * The meta object literal for the '{@link genericdesigndecision.impl.ClassChoiceImpl <em>Class Choice</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see genericdesigndecision.impl.ClassChoiceImpl
		 * @see genericdesigndecision.impl.GenericdesigndecisionPackageImpl#getClassChoice()
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
		 * The meta object literal for the '{@link genericdesigndecision.impl.ContinousRangeChoiceImpl <em>Continous Range Choice</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see genericdesigndecision.impl.ContinousRangeChoiceImpl
		 * @see genericdesigndecision.impl.GenericdesigndecisionPackageImpl#getContinousRangeChoice()
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
		 * The meta object literal for the '{@link genericdesigndecision.impl.DecisionSpaceImpl <em>Decision Space</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see genericdesigndecision.impl.DecisionSpaceImpl
		 * @see genericdesigndecision.impl.GenericdesigndecisionPackageImpl#getDecisionSpace()
		 * @generated
		 */
		EClass DECISION_SPACE = eINSTANCE.getDecisionSpace();

		/**
		 * The meta object literal for the '<em><b>Dof Instances</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DECISION_SPACE__DOF_INSTANCES = eINSTANCE.getDecisionSpace_DofInstances();

		/**
		 * The meta object literal for the '{@link genericdesigndecision.impl.CandidateImpl <em>Candidate</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see genericdesigndecision.impl.CandidateImpl
		 * @see genericdesigndecision.impl.GenericdesigndecisionPackageImpl#getCandidate()
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
		 * The meta object literal for the '{@link genericdesigndecision.impl.CandidatesImpl <em>Candidates</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see genericdesigndecision.impl.CandidatesImpl
		 * @see genericdesigndecision.impl.GenericdesigndecisionPackageImpl#getCandidates()
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

		/**
		 * The meta object literal for the '{@link genericdesigndecision.impl.ADSEProblemImpl <em>ADSE Problem</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see genericdesigndecision.impl.ADSEProblemImpl
		 * @see genericdesigndecision.impl.GenericdesigndecisionPackageImpl#getADSEProblem()
		 * @generated
		 */
		EClass ADSE_PROBLEM = eINSTANCE.getADSEProblem();

		/**
		 * The meta object literal for the '<em><b>Problem</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ADSE_PROBLEM__PROBLEM = eINSTANCE.getADSEProblem_Problem();

		/**
		 * The meta object literal for the '<em><b>Associated Metamodel</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ADSE_PROBLEM__ASSOCIATED_METAMODEL = eINSTANCE.getADSEProblem_AssociatedMetamodel();

		/**
		 * The meta object literal for the '{@link de.uka.ipd.sdq.dsexplore.opt4j.representation.DSEDecoder <em>DSE Decoder</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uka.ipd.sdq.dsexplore.opt4j.representation.DSEDecoder
		 * @see genericdesigndecision.impl.GenericdesigndecisionPackageImpl#getDSEDecoder()
		 * @generated
		 */
		EClass DSE_DECODER = eINSTANCE.getDSEDecoder();

		/**
		 * The meta object literal for the '{@link de.uka.ipd.sdq.dsexplore.gdof.GenomeToCandidateModelTransformation <em>Genome To Candidate Model Transformation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uka.ipd.sdq.dsexplore.gdof.GenomeToCandidateModelTransformation
		 * @see genericdesigndecision.impl.GenericdesigndecisionPackageImpl#getGenomeToCandidateModelTransformation()
		 * @generated
		 */
		EClass GENOME_TO_CANDIDATE_MODEL_TRANSFORMATION = eINSTANCE.getGenomeToCandidateModelTransformation();

		/**
		 * The meta object literal for the '{@link genericdesigndecision.impl.AGenomeToCandidateModelTransformationImpl <em>AGenome To Candidate Model Transformation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see genericdesigndecision.impl.AGenomeToCandidateModelTransformationImpl
		 * @see genericdesigndecision.impl.GenericdesigndecisionPackageImpl#getAGenomeToCandidateModelTransformation()
		 * @generated
		 */
		EClass AGENOME_TO_CANDIDATE_MODEL_TRANSFORMATION = eINSTANCE.getAGenomeToCandidateModelTransformation();

		/**
		 * The meta object literal for the '{@link org.opt4j.core.Phenotype <em>Phenotype</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.opt4j.core.Phenotype
		 * @see genericdesigndecision.impl.GenericdesigndecisionPackageImpl#getPhenotype()
		 * @generated
		 */
		EClass PHENOTYPE = eINSTANCE.getPhenotype();

	}

} //GenericdesigndecisionPackage
